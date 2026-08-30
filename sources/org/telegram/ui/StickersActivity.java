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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.g61 a;
    private int archivedRow;
    public br b;
    public NumberTextView c;
    public org.telegram.ui.Components.q41 d;
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
    public final ha1 y;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.h = new ArrayList();
        this.x = new HashSet();
        this.y = new ha1(this, 0);
        this.v = i10;
        this.w = arrayList;
    }

    public static void U(StickersActivity stickersActivity, org.telegram.ui.Components.i51 i51Var, View view) {
        int i10 = stickersActivity.v;
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.x.isEmpty()) {
                stickersActivity.n0((org.telegram.ui.Cells.k8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.xx0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.mv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.xx0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.mv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (i51Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList k02 = stickersActivity.k0();
                    if (k02 != null) {
                        for (int i11 = 0; i11 < k02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) k02.get(i11);
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
                    stickersActivity.showDialog(new org.telegram.ui.Components.mv(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    break;
                } else {
                    org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.e51(stickersActivity.getParentActivity(), new ma1(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.d = q41Var;
                    q41Var.show();
                    break;
                }
            case 2:
                stickersActivity.presentFragment(new r(i10));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new u21());
                break;
            case 5:
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(stickersActivity, view);
                H.i(new bh(4, view), LocaleController.getString(R.string.SuggestStickersAll), SharedConfig.suggestStickers == 0);
                H.i(new bh(5, view), LocaleController.getString(R.string.SuggestStickersInstalled), SharedConfig.suggestStickers == 1);
                H.i(new bh(6, view), LocaleController.getString(R.string.SuggestStickersNone), SharedConfig.suggestStickers == 2);
                H.Z();
                break;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.allowBigEmoji);
                break;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                break;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                break;
        }
    }

    public static void V(StickersActivity stickersActivity, ArrayList arrayList) {
        ha1 ha1Var = stickersActivity.y;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.i51) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.e = arrayList2;
        stickersActivity.s = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.v), new tt(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(ha1Var);
        AndroidUtilities.runOnUIThread(ha1Var, 1000L);
    }

    public static void X(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = o3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.h;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        o3Var.e.a(true, true);
        if (o3Var.s) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public static void Z(StickersActivity stickersActivity, View view) {
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
        int i10 = 0;
        if (k8Var.y != view) {
            if (k8Var.B == view) {
                MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (k8Var.C == view) {
                    stickersActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) stickersActivity, 11, false));
                    return;
                }
                return;
            }
        }
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = stickersActivity.getMediaDataController().getFeaturedEmojiSets();
        while (true) {
            if (i10 >= featuredEmojiSets.size()) {
                r13 = 0;
                break;
            } else {
                if (stickersSet.set.id == featuredEmojiSets.get(i10).set.id) {
                    r13 = featuredEmojiSets.get(i10);
                    break;
                }
                i10++;
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

    public static /* synthetic */ void a0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        stickersActivity.j0();
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSets(arrayList, stickersActivity.v, i10 == 1 ? 0 : 1, stickersActivity, true);
    }

    public static void b0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.aa) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.l5 n10 = org.telegram.ui.Components.l5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(aaVar.getValueBackupImageView());
                        aaVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    aaVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.j6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void c0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.w51 w51Var) {
        final int i10;
        CharSequence charSequence;
        boolean z4;
        ArrayList arrayList2 = stickersActivity.h;
        int i11 = stickersActivity.v;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.g61 g61Var = stickersActivity.a;
        if (g61Var == null || (!g61Var.Z2 && !stickersActivity.s && stickersActivity.r <= 0)) {
            if (i11 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i11)));
                stickersActivity.w = arrayList3;
                stickersActivity.e = arrayList3;
            } else {
                stickersActivity.e = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i11)));
            }
        }
        stickersActivity.f = new ArrayList(stickersActivity.k0());
        final int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= stickersActivity.f.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.f.get(i13)).set.id))) {
                stickersActivity.f.remove(i13);
                i13--;
            }
            i13++;
        }
        int size = stickersActivity.f.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i11);
        int size2 = mediaDataController.getStickerSets(5).size();
        final int i14 = 2;
        if (i11 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.i51.d(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size > 0 ? LocaleController.formatNumber(size, ',') : ""));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i11 == 0) {
                    arrayList.add(org.telegram.ui.Components.i51.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.i51.f(LocaleController.getString(i11 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i15 = R.drawable.msg2_smile_status;
            String string = LocaleController.getString(R.string.Emoji);
            String formatNumber = size2 > 0 ? LocaleController.formatNumber(size2, ',') : "";
            org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(43);
            i51Var.d = 3;
            i51Var.k = i15;
            i51Var.l = string;
            i51Var.m = formatNumber;
            arrayList.add(i51Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i11 == 0) {
                arrayList.add(org.telegram.ui.Components.i51.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.i51.f(LocaleController.getString(i11 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i11 == 1) {
                yh.A(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i11 == 0) {
            arrayList.size();
            int i16 = R.drawable.msg2_reactions2;
            String string2 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(43);
            i51Var2.d = 4;
            i51Var2.k = i16;
            i51Var2.l = string2;
            i51Var2.F = new w3(stickersActivity, 19);
            arrayList.add(i51Var2);
            arrayList.add(org.telegram.ui.Components.i51.B(stickersActivity.h0(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
            arrayList.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.StickersSettings)));
            stickersActivity.suggestRow = arrayList.size();
            String string3 = LocaleController.getString(R.string.SuggestStickers);
            int i17 = SharedConfig.suggestStickers;
            String string4 = i17 != 0 ? i17 != 1 ? LocaleController.getString(R.string.SuggestStickersNone) : LocaleController.getString(R.string.SuggestStickersInstalled) : LocaleController.getString(R.string.SuggestStickersAll);
            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(43);
            i51Var3.d = 5;
            i51Var3.l = string3;
            i51Var3.m = string4;
            arrayList.add(i51Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.i51 i18 = org.telegram.ui.Components.i51.i(6, LocaleController.getString(R.string.LargeEmoji));
            i18.K(SharedConfig.allowBigEmoji);
            arrayList.add(i18);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.i51 i19 = org.telegram.ui.Components.i51.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i19.K(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i19);
            yh.A(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i11 == 5) {
            org.telegram.ui.Components.i51 i20 = org.telegram.ui.Components.i51.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i20.K(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i20);
            yh.A(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.e.size() > 0) {
            w51Var.U();
            if (i11 == 5 || (!stickersActivity.f.isEmpty() && i11 == 0)) {
                yh.r(i11 == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets, arrayList);
            }
            w51Var.M();
            ArrayList arrayList4 = stickersActivity.e;
            int i21 = 0;
            for (int size3 = arrayList4.size(); i21 < size3; size3 = size3) {
                Object obj = arrayList4.get(i21);
                i21++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i22 = org.telegram.ui.Cells.j8.a;
                org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.j8.class);
                J.G = tL_messages_stickerSet;
                J.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.ia1
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(stickersActivity2, k8Var);
                                    final int i23 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i24 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new l01(16, stickersActivity2, k8Var), false);
                                    final int i25 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i26 = 3;
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
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
                                StickersActivity.Z(this.b, view);
                                break;
                            default:
                                StickersActivity.X(this.b, view);
                                break;
                        }
                    }
                };
                J.E = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.ia1
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(stickersActivity2, k8Var);
                                    final int i23 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i24 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new l01(16, stickersActivity2, k8Var), false);
                                    final int i25 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i26 = 3;
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
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
                                StickersActivity.Z(this.b, view);
                                break;
                            default:
                                StickersActivity.X(this.b, view);
                                break;
                        }
                    }
                };
                J.K(stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(J);
            }
            charSequence = null;
            w51Var.L();
            w51Var.T();
            if (i11 != 1 && i11 != 5) {
                arrayList.add(org.telegram.ui.Components.i51.B(null));
            } else if (i11 == 1) {
                yh.A(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.f.size() > 3) {
            stickersActivity.f = new ArrayList(stickersActivity.f.subList(0, 3));
            z4 = true;
        } else {
            z4 = false;
        }
        if (i11 == 5 && !stickersActivity.f.isEmpty()) {
            if (stickersActivity.e.size() > 0) {
                arrayList.add(org.telegram.ui.Components.i51.B(charSequence));
            }
            yh.r(i11 == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers, arrayList);
            ArrayList arrayList5 = stickersActivity.f;
            int size4 = arrayList5.size();
            while (i12 < size4) {
                Object obj2 = arrayList5.get(i12);
                i12++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i23 = org.telegram.ui.Cells.n3.a;
                org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.n3.class);
                J2.G = stickerSetCovered;
                J2.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.ia1
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.k8)) {
                                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = k8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(stickersActivity2, k8Var);
                                    final int i232 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i232) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i24 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new l01(16, stickersActivity2, k8Var), false);
                                    final int i25 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i26 = 3;
                                    H.m(!stickersSet.set.official, R.drawable.msg_delete, LocaleController.getString(R.string.StickersRemove), true, new Runnable() { // from class: org.telegram.ui.ja1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.l0(stickersSet)));
                                                        org.telegram.ui.Components.qc.j(stickersActivity3).j();
                                                        break;
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        return;
                                                    }
                                                case 2:
                                                    StickersActivity stickersActivity4 = stickersActivity2;
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersSet;
                                                    stickersActivity4.getClass();
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.l0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
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
                                StickersActivity.Z(this.b, view);
                                break;
                            default:
                                StickersActivity.X(this.b, view);
                                break;
                        }
                    }
                };
                J2.t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(J2);
            }
            if (z4) {
                org.telegram.ui.Components.i51 c3 = org.telegram.ui.Components.i51.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c3.q = true;
                arrayList.add(c3);
            }
        }
        if (i11 == 5) {
            arrayList.add(org.telegram.ui.Components.i51.B(stickersActivity.h0(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
        }
    }

    public static void d0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        String string;
        TextView textView;
        int i11 = 0;
        int i12 = 2;
        if (i10 == 2) {
            StringBuilder sb = new StringBuilder();
            int size = stickersActivity.e.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i13);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(stickersActivity.l0(tL_messages_stickerSet));
                }
            }
            String sb2 = sb.toString();
            org.telegram.ui.Components.lq0 N0 = org.telegram.ui.Components.lq0.N0(stickersActivity.fragmentView.getContext(), null, sb2, false, sb2);
            N0.p0 = new ov0(stickersActivity, i12);
            N0.show();
            return;
        }
        if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.x.size());
            int size2 = stickersActivity.e.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i14);
                if (stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.a.O = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.a.Q = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.a.O = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.a.Q = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new e3.d(stickersActivity, arrayList, i10, 14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    stickersActivity.showDialog(d2Var);
                    if (i10 != 1 || (textView = (TextView) d2Var.d(-1)) == null) {
                        return;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                int size4 = stickersActivity.e.size();
                while (true) {
                    if (i11 >= size4) {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.e.get(i11);
                    if (!stickersActivity.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                        i11++;
                    } else if (i10 == 0) {
                        stickersActivity2 = stickersActivity;
                        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), tL_messages_stickerSet3, !tL_messages_stickerSet3.set.archived ? 1 : 2, stickersActivity2, true, true);
                    } else {
                        stickersActivity2 = stickersActivity;
                        if (i10 == 1) {
                            MediaDataController.getInstance(stickersActivity2.currentAccount).toggleStickerSet(stickersActivity2.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity2, true, true);
                        } else if (i10 == 2) {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity2.l0(tL_messages_stickerSet3));
                                stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (i10 == 3) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.l0(tL_messages_stickerSet3)));
                                org.telegram.ui.Components.qc.j(stickersActivity2).j();
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                        } else if (i10 == 4) {
                            HashSet hashSet = stickersActivity2.x;
                            if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                            } else {
                                hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                            }
                            stickersActivity2.a.V2.N(true);
                            stickersActivity2.i0();
                        }
                    }
                }
                stickersActivity2.j0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ArrayList arrayList;
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 19));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
        j10.addView(this.c, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new oh.d(2));
        j10.g(2, R.drawable.msg_share, AndroidUtilities.dp(54.0f));
        j10.g(0, R.drawable.msg_archive, AndroidUtilities.dp(54.0f));
        this.n = j10.g(1, R.drawable.msg_delete, AndroidUtilities.dp(54.0f));
        if (i10 != 5 || (arrayList = this.w) == null) {
            this.e = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i10)));
        } else {
            this.e = arrayList;
        }
        this.f = k0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        final int i11 = 0;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new Utilities.Callback2(this) { // from class: org.telegram.ui.ka1
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.c0(this.b, (ArrayList) obj, (org.telegram.ui.Components.w51) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, new la1(this), new la1(this));
        this.a = g61Var;
        g61Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setFocusable(true);
        this.a.setTag(7);
        final int i12 = 1;
        this.a.B1(new Utilities.Callback2(this) { // from class: org.telegram.ui.ka1
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        StickersActivity.c0(this.b, (ArrayList) obj, (org.telegram.ui.Components.w51) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.V(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        br brVar = new br(this, 6);
        this.b = brVar;
        brVar.j1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, k7.b6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        int i13 = this.v;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == i13) {
                this.h.clear();
            }
            this.a.V2.N(true);
        } else if (i10 == NotificationCenter.featuredStickersDidLoad || i10 == NotificationCenter.featuredEmojiDidLoad) {
            this.a.V2.N(true);
        } else if (i10 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i13) {
            this.a.V2.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 512, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.j6.w8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_21, null, null, null, null, org.telegram.ui.ActionBar.j6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_22, null, null, null, null, org.telegram.ui.ActionBar.j6.z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        int i13 = org.telegram.ui.ActionBar.j6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"reorderButton"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 8192, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16384, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        org.telegram.ui.Components.q41 q41Var = this.d;
        if (q41Var != null) {
            arrayList.addAll(q41Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final CharSequence h0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    public final void i0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean s6 = this.actionBar.s();
        int i10 = 0;
        if (size <= 0) {
            if (s6) {
                this.actionBar.r();
                this.a.w1(false);
                m0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.e;
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet.official && !stickerSet.emojis) {
                        i10 = 8;
                        break;
                    }
                }
            }
            if (this.n.getVisibility() != i10) {
                this.n.setVisibility(i10);
            }
        }
        this.c.a(size, s6);
        if (s6) {
            return;
        }
        this.actionBar.O(null, null);
        this.a.w1(true);
        if (SharedConfig.stickersReorderingHintUsed || this.v == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        org.telegram.ui.Components.ic.g(this, new org.telegram.ui.Components.wl0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.x.clear();
        this.a.V2.N(true);
        i0();
    }

    public final ArrayList k0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.v != 5) {
            return mediaDataController.getFeaturedStickerSets();
        }
        ArrayList arrayList = new ArrayList(mediaDataController.getFeaturedEmojiSets());
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == null || mediaDataController.isStickerPackInstalled(((TLRPC.StickerSetCovered) arrayList.get(i10)).set.id, false)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public final String l0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        return String.format(locale, android.support.v4.media.a.r(sb, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void m0() {
        if (this.s) {
            this.s = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i10 = this.v;
            mediaDataController.calcNewHash(i10);
            this.r++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i10 == 1;
            tL_messages_reorderStickerSets.emojis = i10 == 5;
            int i11 = 0;
            while (i11 < this.e.size()) {
                i11 = android.support.v4.media.a.g(((TLRPC.TL_messages_stickerSet) this.e.get(i11)).set.id, tL_messages_reorderStickerSets.order, i11, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new o(this, 21));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.qc.a0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.a.V2.N(true);
            }
        }
    }

    public final void n0(org.telegram.ui.Cells.k8 k8Var) {
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
        this.a.V2.N(true);
        i0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.x.isEmpty()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        j0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        int i10 = this.v;
        mediaDataController.checkStickers(i10);
        if (i10 == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i10 == 6) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.g61 g61Var = this.a;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }
}
