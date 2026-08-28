package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.i51 a;
    private int archivedRow;
    public of.g0 b;
    public NumberTextView c;
    public org.telegram.ui.Components.t31 d;
    private int dynamicPackOrder;
    public ArrayList e;
    public ArrayList f;
    private int featuredRow;
    public final ArrayList h;
    private int largeEmojiRow;
    public org.telegram.ui.ActionBar.w0 n;
    public int r;
    public boolean s;
    private int suggestRow;
    public final int v;
    public ArrayList w;
    public final HashSet x;
    public final t91 y;

    public StickersActivity(int i9, ArrayList arrayList) {
        super(null);
        this.h = new ArrayList();
        this.x = new HashSet();
        this.y = new t91(this, 0);
        this.v = i9;
        this.w = arrayList;
    }

    public static void T(StickersActivity stickersActivity, org.telegram.ui.Components.l41 l41Var, View view) {
        int i9 = stickersActivity.v;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.x.isEmpty()) {
                stickersActivity.m0((org.telegram.ui.Cells.k8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.cx0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.dv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i9 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.cx0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.dv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (l41Var.d) {
            case 1:
            case 8:
                if (i9 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList j02 = stickersActivity.j0();
                    if (j02 != null) {
                        for (int i10 = 0; i10 < j02.size(); i10++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) j02.get(i10);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    MediaDataController.getInstance(stickersActivity.currentAccount).markFeaturedStickersAsRead(true, true);
                    stickersActivity.showDialog(new org.telegram.ui.Components.dv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    break;
                } else {
                    org.telegram.ui.Components.t31 t31Var = new org.telegram.ui.Components.t31(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.h41(stickersActivity.getParentActivity(), new y91(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.d = t31Var;
                    t31Var.show();
                    break;
                }
            case 2:
                stickersActivity.presentFragment(new p(i9));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new h21());
                break;
            case 5:
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity, view);
                H.i(new xg(4, view), LocaleController.getString(R.string.SuggestStickersAll), SharedConfig.suggestStickers == 0);
                H.i(new xg(5, view), LocaleController.getString(R.string.SuggestStickersInstalled), SharedConfig.suggestStickers == 1);
                H.i(new xg(6, view), LocaleController.getString(R.string.SuggestStickersNone), SharedConfig.suggestStickers == 2);
                H.Z();
                break;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.allowBigEmoji);
                break;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                break;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                break;
        }
    }

    public static void U(StickersActivity stickersActivity, ArrayList arrayList) {
        t91 t91Var = stickersActivity.y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Object obj2 = ((org.telegram.ui.Components.l41) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.e = arrayList2;
        stickersActivity.s = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.v), new mt(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(t91Var);
        AndroidUtilities.runOnUIThread(t91Var, 1000L);
    }

    public static void W(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.h;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        p3Var.e.a(true, true);
        if (p3Var.s) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public static void Y(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.k8 k8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r13;
        ArrayList arrayList = stickersActivity.h;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof org.telegram.ui.Cells.k8) || (stickersSet = (k8Var = (org.telegram.ui.Cells.k8) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i9 = 0;
        if (k8Var.y != view) {
            if (k8Var.A == view) {
                MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (k8Var.B == view) {
                    stickersActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) stickersActivity, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
        while (true) {
            if (i9 >= featuredEmojiSets.size()) {
                r13 = 0;
                break;
            } else {
                if (stickersSet.set.id == featuredEmojiSets.get(i9).set.id) {
                    r13 = featuredEmojiSets.get(i9);
                    break;
                }
                i9++;
            }
        }
        if (r13 != 0) {
            if (arrayList.contains(Long.valueOf(r13.set.id))) {
                return;
            } else {
                arrayList.add(Long.valueOf(r13.set.id));
            }
        }
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), r13 == 0 ? stickersSet : r13, 2, stickersActivity, false, false);
    }

    public static /* synthetic */ void Z(StickersActivity stickersActivity, ArrayList arrayList, int i9) {
        stickersActivity.i0();
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSets(arrayList, stickersActivity.v, i9 == 1 ? 0 : 1, stickersActivity, true);
    }

    public static void a0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.ba) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.k5 n10 = org.telegram.ui.Components.k5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(baVar.getValueBackupImageView());
                        baVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    baVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.f6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void b0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
        final int i9;
        CharSequence charSequence;
        boolean z10;
        ArrayList arrayList2 = stickersActivity.h;
        int i10 = stickersActivity.v;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.i51 i51Var = stickersActivity.a;
        if (i51Var == null || (!i51Var.Y2 && !stickersActivity.s && stickersActivity.r <= 0)) {
            if (i10 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i10)));
                stickersActivity.w = arrayList3;
                stickersActivity.e = arrayList3;
            } else {
                stickersActivity.e = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i10)));
            }
        }
        stickersActivity.f = new ArrayList(stickersActivity.j0());
        final int i11 = 0;
        int i12 = 0;
        while (true) {
            i9 = 1;
            if (i12 >= stickersActivity.f.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f.get(i12)).set.id))) {
                stickersActivity.f.remove(i12);
                i12--;
            }
            i12++;
        }
        int size = stickersActivity.f.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i10);
        int size2 = mediaDataController.getStickerSets(5).size();
        final int i13 = 2;
        if (i10 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.l41.d(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size > 0 ? LocaleController.formatNumber(size, ',') : ""));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i10 == 0) {
                    arrayList.add(org.telegram.ui.Components.l41.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.l41.f(LocaleController.getString(i10 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i14 = R.drawable.msg2_smile_status;
            String string = LocaleController.getString(R.string.Emoji);
            String formatNumber = size2 > 0 ? LocaleController.formatNumber(size2, ',') : "";
            org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(43);
            l41Var.d = 3;
            l41Var.k = i14;
            l41Var.l = string;
            l41Var.m = formatNumber;
            arrayList.add(l41Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i10 == 0) {
                arrayList.add(org.telegram.ui.Components.l41.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.l41.f(LocaleController.getString(i10 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i10 == 1) {
                org.telegram.ui.Cells.j2.y(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i10 == 0) {
            arrayList.size();
            int i15 = R.drawable.msg2_reactions2;
            String string2 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(43);
            l41Var2.d = 4;
            l41Var2.k = i15;
            l41Var2.l = string2;
            l41Var2.F = new w3(stickersActivity, 19);
            arrayList.add(l41Var2);
            arrayList.add(org.telegram.ui.Components.l41.B(stickersActivity.g0(LocaleController.getString(i10 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
            arrayList.add(org.telegram.ui.Components.l41.t(LocaleController.getString(R.string.StickersSettings)));
            stickersActivity.suggestRow = arrayList.size();
            String string3 = LocaleController.getString(R.string.SuggestStickers);
            int i16 = SharedConfig.suggestStickers;
            String string4 = i16 != 0 ? i16 != 1 ? LocaleController.getString(R.string.SuggestStickersNone) : LocaleController.getString(R.string.SuggestStickersInstalled) : LocaleController.getString(R.string.SuggestStickersAll);
            org.telegram.ui.Components.l41 l41Var3 = new org.telegram.ui.Components.l41(43);
            l41Var3.d = 5;
            l41Var3.l = string3;
            l41Var3.m = string4;
            arrayList.add(l41Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.l41 i17 = org.telegram.ui.Components.l41.i(6, LocaleController.getString(R.string.LargeEmoji));
            i17.K(SharedConfig.allowBigEmoji);
            arrayList.add(i17);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.l41 i18 = org.telegram.ui.Components.l41.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i18.K(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i18);
            org.telegram.ui.Cells.j2.y(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i10 == 5) {
            org.telegram.ui.Components.l41 i19 = org.telegram.ui.Components.l41.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i19.K(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i19);
            org.telegram.ui.Cells.j2.y(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.e.size() > 0) {
            z41Var.U();
            if (i10 == 5 || (!stickersActivity.f.isEmpty() && i10 == 0)) {
                org.telegram.ui.Cells.j2.l(i10 == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets, arrayList);
            }
            z41Var.M();
            ArrayList arrayList4 = stickersActivity.e;
            int i20 = 0;
            for (int size3 = arrayList4.size(); i20 < size3; size3 = size3) {
                Object obj = arrayList4.get(i20);
                i20++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i21 = org.telegram.ui.Cells.j8.a;
                org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.j8.class);
                J.G = tL_messages_stickerSet;
                J.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.u91
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity2, k8Var);
                                    final int i22 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i23 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new n21(10, stickersActivity2, k8Var), false);
                                    final int i24 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i25 = 3;
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    });
                                    H.S = 190;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.Y(this.b, view);
                                break;
                            default:
                                StickersActivity.W(this.b, view);
                                break;
                        }
                    }
                };
                J.E = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.u91
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity2, k8Var);
                                    final int i22 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i23 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new n21(10, stickersActivity2, k8Var), false);
                                    final int i24 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i25 = 3;
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    });
                                    H.S = 190;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.Y(this.b, view);
                                break;
                            default:
                                StickersActivity.W(this.b, view);
                                break;
                        }
                    }
                };
                J.K(stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(J);
            }
            charSequence = null;
            z41Var.L();
            z41Var.T();
            if (i10 != 1 && i10 != 5) {
                arrayList.add(org.telegram.ui.Components.l41.B(null));
            } else if (i10 == 1) {
                org.telegram.ui.Cells.j2.y(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.f.size() > 3) {
            stickersActivity.f = new ArrayList(stickersActivity.f.subList(0, 3));
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 5 && !stickersActivity.f.isEmpty()) {
            if (stickersActivity.e.size() > 0) {
                arrayList.add(org.telegram.ui.Components.l41.B(charSequence));
            }
            org.telegram.ui.Cells.j2.l(i10 == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers, arrayList);
            ArrayList arrayList5 = stickersActivity.f;
            int size4 = arrayList5.size();
            while (i11 < size4) {
                Object obj2 = arrayList5.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i22 = org.telegram.ui.Cells.o3.a;
                org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.o3.class);
                J2.G = stickerSetCovered;
                J2.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.u91
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(stickersActivity2, k8Var);
                                    final int i222 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i222) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i23 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new n21(10, stickersActivity2, k8Var), false);
                                    final int i24 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i25 = 3;
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() { // from class: org.telegram.ui.v91
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.k0(stickersSet)));
                                                        org.telegram.ui.Components.oc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.k0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e11) {
                                                        FileLog.e(e11);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    });
                                    H.S = 190;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.Y(this.b, view);
                                break;
                            default:
                                StickersActivity.W(this.b, view);
                                break;
                        }
                    }
                };
                J2.t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(J2);
            }
            if (z10) {
                org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c10.q = true;
                arrayList.add(c10);
            }
        }
        if (i10 == 5) {
            arrayList.add(org.telegram.ui.Components.l41.B(stickersActivity.g0(LocaleController.getString(i10 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
        }
    }

    public static void c0(StickersActivity stickersActivity, int i9) {
        StickersActivity stickersActivity2;
        String string;
        TextView textView;
        int i10 = 0;
        int i11 = 2;
        if (i9 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.e.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i12);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.k0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.rp0 N0 = org.telegram.ui.Components.rp0.N0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            N0.o0 = new fv0(stickersActivity, i11);
            N0.show();
            return;
        }
        if (i9 == 0 || i9 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.x.size());
            int size2 = stickersActivity.e.size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i13);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i9 == 1) {
                        alertDialog$Builder.a.N = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.a.P = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.a.N = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.a.P = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new c3.e(stickersActivity, arrayList, i9, 15));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    stickersActivity.showDialog(c2Var);
                    if (i9 != 1 || (textView = (TextView) c2Var.d(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                int size4 = stickersActivity.e.size();
                while (true) {
                    if (i10 >= size4) {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i10);
                    if (!stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                        i10++;
                    } else if (i9 == 0) {
                        stickersActivity2 = stickersActivity;
                        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity2, true, true);
                    } else {
                        stickersActivity2 = stickersActivity;
                        if (i9 == 1) {
                            MediaDataController.getInstance(stickersActivity2.currentAccount).toggleStickerSet(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                        } else if (i9 == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity2.k0(tL_messages_stickerSet3));
                                stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        } else if (i9 == 3) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.k0(tL_messages_stickerSet3)));
                                org.telegram.ui.Components.oc.j(stickersActivity2).j();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        } else if (i9 == 4) {
                            HashSet hashSet = stickersActivity2.x;
                            if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                            } else {
                                hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                            }
                            stickersActivity2.a.U2.N(true);
                            stickersActivity2.h0();
                        }
                    }
                }
                stickersActivity2.i0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.v;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i9 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 27));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y8, false));
        j10.addView(this.c, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new jh.d(2));
        j10.g(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        j10.g(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.n = j10.g(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i9 != 5 || (arrayList = this.w) == null) {
            this.e = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i9)));
        } else {
            this.e = arrayList;
        }
        this.f = j0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        final int i10 = 0;
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new Utilities.Callback2(this) { // from class: org.telegram.ui.w91
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        StickersActivity.b0(this.b, (ArrayList) obj, (org.telegram.ui.Components.z41) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.U(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, new x91(this), new x91(this));
        this.a = i51Var;
        i51Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setFocusable(true);
        this.a.setTag(7);
        final int i11 = 1;
        this.a.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.w91
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.b0(this.b, (ArrayList) obj, (org.telegram.ui.Components.z41) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.U(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        of.g0 g0Var = new of.g0(this, 7);
        this.b = g0Var;
        g0Var.j1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.stickersDidLoad;
        int i12 = this.v;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == i12) {
                this.h.clear();
            }
            this.a.U2.N(true);
        } else if (i9 == NotificationCenter.featuredStickersDidLoad || i9 == NotificationCenter.featuredEmojiDidLoad) {
            this.a.U2.N(true);
        } else if (i9 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i12) {
            this.a.U2.N(true);
        }
    }

    public final CharSequence g0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 512, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.f6.w8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.f6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.f6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        int i12 = org.telegram.ui.ActionBar.f6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"reorderButton"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 8192, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16384, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        org.telegram.ui.Components.t31 t31Var = this.d;
        if (t31Var != null) {
            arrayList.addAll(t31Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean s10 = this.actionBar.s();
        int i9 = 0;
        if (size <= 0) {
            if (s10) {
                this.actionBar.r();
                this.a.w1(false);
                l0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.e;
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i9 = 8;
                        break;
                    }
                }
            }
            if (this.n.getVisibility() != i9) {
                this.n.setVisibility(i9);
            }
        }
        this.c.a(size, s10);
        if (s10) {
            return;
        }
        this.actionBar.N(null, null);
        this.a.w1(true);
        if (SharedConfig.stickersReorderingHintUsed || this.v == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        org.telegram.ui.Components.gc.g(this, new org.telegram.ui.Components.zk0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
    }

    public final void i0() {
        this.x.clear();
        this.a.U2.N(true);
        h0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final ArrayList j0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.v != 5) {
            return mediaDataController.getFeaturedStickerSets();
        }
        ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
        int i9 = 0;
        while (i9 < arrayList.size()) {
            if (arrayList.get(i9) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i9)).set.id, false)) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
        return arrayList;
    }

    public final String k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        return String.format(locale, aa.d.r(sb2, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void l0() {
        if (this.s) {
            this.s = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i9 = this.v;
            mediaDataController.calcNewHash(i9);
            this.r++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i9 == 1;
            tL_messages_reorderStickerSets.emojis = i9 == 5;
            int i10 = 0;
            while (i10 < this.e.size()) {
                i10 = aa.d.g(((TLRPC.TL_messages_stickerSet) this.e.get(i10)).set.id, tL_messages_reorderStickerSets.order, i10, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new m(this, 21));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i9), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.oc.a0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.a.U2.N(true);
            }
        }
    }

    public final void m0(org.telegram.ui.Cells.k8 k8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            k8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            k8Var.b(true, true);
        }
        this.a.U2.N(true);
        h0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.x.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        i0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        int i9 = this.v;
        mediaDataController.checkStickers(i9);
        if (i9 == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i9 == 6) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.v == 6) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.i51 i51Var = this.a;
        if (i51Var != null) {
            i51Var.U2.N(true);
        }
    }
}
