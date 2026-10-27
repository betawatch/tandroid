package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class StickersActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.s71 a;
    private int archivedRow;
    public ig.j0 b;
    public org.telegram.ui.Components.c61 c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public org.telegram.ui.ActionBar.y5 h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final int s;
    private int suggestRow;
    public ArrayList v;
    public final HashSet w;
    public final z91 x;

    public StickersActivity(int i10, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.w = new HashSet();
        this.x = new z91(this, 0);
        this.s = i10;
        this.v = arrayList;
    }

    public static void V(StickersActivity stickersActivity, org.telegram.ui.Components.u61 u61Var, View view) {
        int i10 = stickersActivity.s;
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (!stickersActivity.w.isEmpty()) {
                stickersActivity.o0((org.telegram.ui.Cells.p8) view);
                return;
            }
            ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                stickersActivity.showDialog(new org.telegram.ui.Components.dz0(stickersActivity.getParentActivity(), stickersActivity, null, tL_messages_stickerSet, null, null));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            arrayList2.add(tL_inputStickerSetID);
            stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList2));
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (i10 != 5) {
                stickersActivity.showDialog(new org.telegram.ui.Components.dz0(stickersActivity.getParentActivity(), stickersActivity, tL_inputStickerSetID2, null, null, null));
                return;
            }
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(tL_inputStickerSetID2);
            stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList3));
            return;
        }
        switch (u61Var.d) {
            case 1:
            case 8:
                if (i10 == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList l02 = stickersActivity.l0();
                    if (l02 != null) {
                        for (int i11 = 0; i11 < l02.size(); i11++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) l02.get(i11);
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
                    stickersActivity.showDialog(new org.telegram.ui.Components.aw(stickersActivity, stickersActivity.getParentActivity(), stickersActivity.getResourceProvider(), arrayList4));
                    break;
                } else {
                    org.telegram.ui.Components.c61 c61Var = new org.telegram.ui.Components.c61(stickersActivity.getParentActivity(), stickersActivity, new org.telegram.ui.Components.q61(stickersActivity.getParentActivity(), new ea1(stickersActivity), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                    stickersActivity.c = c61Var;
                    c61Var.show();
                    break;
                }
            case 2:
                stickersActivity.presentFragment(new o(i10));
                break;
            case 3:
                stickersActivity.presentFragment(new StickersActivity(5, null));
                break;
            case 4:
                stickersActivity.presentFragment(new i21());
                break;
            case 5:
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(stickersActivity, view);
                H.i(new hh(5, view), LocaleController.getString(R.string.SuggestStickersAll), SharedConfig.suggestStickers == 0);
                H.i(new hh(6, view), LocaleController.getString(R.string.SuggestStickersInstalled), SharedConfig.suggestStickers == 1);
                H.i(new hh(7, view), LocaleController.getString(R.string.SuggestStickersNone), SharedConfig.suggestStickers == 2);
                H.Z();
                break;
            case 6:
                SharedConfig.toggleBigEmoji();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.allowBigEmoji);
                break;
            case 7:
                SharedConfig.toggleUpdateStickersOrderOnSend();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.updateStickersOrderOnSend);
                break;
            case 9:
                SharedConfig.toggleSuggestAnimatedEmoji();
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.suggestAnimatedEmoji);
                break;
        }
    }

    public static void W(StickersActivity stickersActivity, ArrayList arrayList) {
        z91 z91Var = stickersActivity.x;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = ((org.telegram.ui.Components.u61) obj).G;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        stickersActivity.d = arrayList2;
        stickersActivity.r = true;
        Collections.sort(MediaDataController.getInstance(stickersActivity.currentAccount).getStickerSets(stickersActivity.s), new mt(stickersActivity, 3));
        AndroidUtilities.cancelRunOnUIThread(z91Var);
        AndroidUtilities.runOnUIThread(z91Var, 1000L);
    }

    public static void Z(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view.getParent();
        TLRPC.StickerSetCovered stickerSet = m3Var.getStickerSet();
        ArrayList arrayList = stickersActivity.f;
        if (arrayList.contains(Long.valueOf(stickerSet.set.id))) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        m3Var.f.a(true, true);
        if (m3Var.v) {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 0, stickersActivity, false, false);
        } else {
            MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSet, 2, stickersActivity, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [org.telegram.tgnet.TLRPC$StickerSetCovered] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public static void a0(StickersActivity stickersActivity, View view) {
        org.telegram.ui.Cells.p8 p8Var;
        TLRPC.TL_messages_stickerSet stickersSet;
        ?? r13;
        ArrayList arrayList = stickersActivity.f;
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (!(viewGroup.getParent() instanceof org.telegram.ui.Cells.p8) || (stickersSet = (p8Var = (org.telegram.ui.Cells.p8) viewGroup.getParent()).getStickersSet()) == null || stickersSet.set == null) {
            return;
        }
        int i10 = 0;
        if (p8Var.y != view) {
            if (p8Var.E == view) {
                MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickersSet, 0, stickersActivity, false, true);
                return;
            } else {
                if (p8Var.F == view) {
                    stickersActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) stickersActivity, 11, false));
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

    public static /* synthetic */ void b0(StickersActivity stickersActivity, ArrayList arrayList, int i10) {
        stickersActivity.k0();
        MediaDataController.getInstance(stickersActivity.currentAccount).toggleStickerSets(arrayList, stickersActivity.s, i10 == 1 ? 0 : 1, stickersActivity, true);
    }

    public static void c0(StickersActivity stickersActivity, View view) {
        if (view instanceof org.telegram.ui.Cells.ga) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            String doubleTapReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getDoubleTapReaction();
            if (doubleTapReaction != null) {
                if (doubleTapReaction.startsWith("animated_")) {
                    try {
                        org.telegram.ui.Components.t5 n10 = org.telegram.ui.Components.t5.n(stickersActivity.currentAccount, Long.parseLong(doubleTapReaction.substring(9)), null, 2);
                        n10.a(gaVar.getValueBackupImageView());
                        gaVar.getValueBackupImageView().setImageDrawable(n10);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(stickersActivity.currentAccount).getReactionsMap().get(doubleTapReaction);
                if (tL_availableReaction != null) {
                    gaVar.getValueBackupImageView().getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "100_100_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.y6.a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public static void d0(final StickersActivity stickersActivity, ArrayList arrayList, org.telegram.ui.Components.k71 k71Var) {
        final int i10;
        CharSequence charSequence;
        boolean z10;
        ArrayList arrayList2 = stickersActivity.f;
        int i11 = stickersActivity.s;
        MediaDataController mediaDataController = MediaDataController.getInstance(stickersActivity.currentAccount);
        org.telegram.ui.Components.s71 s71Var = stickersActivity.a;
        if (s71Var == null || (!s71Var.k3 && !stickersActivity.r && stickersActivity.n <= 0)) {
            if (i11 == 5) {
                ArrayList arrayList3 = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i11)));
                stickersActivity.v = arrayList3;
                stickersActivity.d = arrayList3;
            } else {
                stickersActivity.d = new ArrayList(MessagesController.getInstance(stickersActivity.currentAccount).filterPremiumStickers(mediaDataController.getStickerSets(i11)));
            }
        }
        stickersActivity.e = new ArrayList(stickersActivity.l0());
        final int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= stickersActivity.e.size()) {
                break;
            }
            if (arrayList2.contains(Long.valueOf(((TLRPC.StickerSetCovered) stickersActivity.e.get(i13)).set.id))) {
                stickersActivity.e.remove(i13);
                i13--;
            }
            i13++;
        }
        int size = stickersActivity.e.size();
        int archivedStickersCount = mediaDataController.getArchivedStickersCount(i11);
        int size2 = mediaDataController.getStickerSets(5).size();
        final int i14 = 2;
        if (i11 == 0) {
            stickersActivity.featuredRow = arrayList.size();
            arrayList.add(org.telegram.ui.Components.u61.d(1, R.drawable.msg2_trending, LocaleController.getString(R.string.FeaturedStickers), size > 0 ? LocaleController.formatNumber(size, ',') : ""));
            if (archivedStickersCount > 0) {
                stickersActivity.archivedRow = arrayList.size();
                if (i11 == 0) {
                    arrayList.add(org.telegram.ui.Components.u61.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
                } else {
                    arrayList.add(org.telegram.ui.Components.u61.f(LocaleController.getString(i11 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
                }
            }
            arrayList.size();
            int i15 = R.drawable.msg2_smile_status;
            String string = LocaleController.getString(R.string.Emoji);
            String formatNumber = size2 > 0 ? LocaleController.formatNumber(size2, ',') : "";
            org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(43);
            u61Var.d = 3;
            u61Var.k = i15;
            u61Var.l = string;
            u61Var.m = formatNumber;
            arrayList.add(u61Var);
        } else if (archivedStickersCount > 0) {
            stickersActivity.archivedRow = arrayList.size();
            if (i11 == 0) {
                arrayList.add(org.telegram.ui.Components.u61.d(2, R.drawable.msg2_archived_stickers, LocaleController.getString(R.string.ArchivedStickers), LocaleController.formatNumber(archivedStickersCount, ',')));
            } else {
                arrayList.add(org.telegram.ui.Components.u61.f(LocaleController.getString(i11 == 5 ? R.string.ArchivedEmojiPacks : R.string.ArchivedMasks), LocaleController.formatNumber(archivedStickersCount, ','), 2));
            }
            if (i11 == 1) {
                ic.a.z(R.string.ArchivedMasksInfo, arrayList);
            }
        }
        if (i11 == 0) {
            arrayList.size();
            int i16 = R.drawable.msg2_reactions2;
            String string2 = LocaleController.getString(R.string.DoubleTapSetting);
            org.telegram.ui.Components.u61 u61Var2 = new org.telegram.ui.Components.u61(43);
            u61Var2.d = 4;
            u61Var2.k = i16;
            u61Var2.l = string2;
            u61Var2.F = new t3(stickersActivity, 22);
            arrayList.add(u61Var2);
            arrayList.add(org.telegram.ui.Components.u61.C(stickersActivity.i0(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
            arrayList.add(org.telegram.ui.Components.u61.u(LocaleController.getString(R.string.StickersSettings)));
            stickersActivity.suggestRow = arrayList.size();
            String string3 = LocaleController.getString(R.string.SuggestStickers);
            int i17 = SharedConfig.suggestStickers;
            String string4 = i17 != 0 ? i17 != 1 ? LocaleController.getString(R.string.SuggestStickersNone) : LocaleController.getString(R.string.SuggestStickersInstalled) : LocaleController.getString(R.string.SuggestStickersAll);
            org.telegram.ui.Components.u61 u61Var3 = new org.telegram.ui.Components.u61(43);
            u61Var3.d = 5;
            u61Var3.l = string3;
            u61Var3.m = string4;
            arrayList.add(u61Var3);
            stickersActivity.largeEmojiRow = arrayList.size();
            org.telegram.ui.Components.u61 i18 = org.telegram.ui.Components.u61.i(6, LocaleController.getString(R.string.LargeEmoji));
            i18.L(SharedConfig.allowBigEmoji);
            arrayList.add(i18);
            stickersActivity.dynamicPackOrder = arrayList.size();
            org.telegram.ui.Components.u61 i19 = org.telegram.ui.Components.u61.i(7, LocaleController.getString(R.string.DynamicPackOrder));
            i19.L(SharedConfig.updateStickersOrderOnSend);
            arrayList.add(i19);
            ic.a.z(R.string.DynamicPackOrderInfo, arrayList);
        }
        if (i11 == 5) {
            org.telegram.ui.Components.u61 i20 = org.telegram.ui.Components.u61.i(9, LocaleController.getString(R.string.SuggestAnimatedEmoji));
            i20.L(SharedConfig.suggestAnimatedEmoji);
            arrayList.add(i20);
            ic.a.z(R.string.SuggestAnimatedEmojiInfo, arrayList);
        }
        if (stickersActivity.d.size() > 0) {
            k71Var.V();
            if (i11 == 5 || (!stickersActivity.e.isEmpty() && i11 == 0)) {
                ic.a.p(i11 == 5 ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets, arrayList);
            }
            k71Var.M();
            ArrayList arrayList4 = stickersActivity.d;
            int i21 = 0;
            for (int size3 = arrayList4.size(); i21 < size3; size3 = size3) {
                Object obj = arrayList4.get(i21);
                i21++;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                int i22 = org.telegram.ui.Cells.o8.a;
                org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.o8.class);
                K.G = tL_messages_stickerSet;
                K.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.aa1
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.p8)) {
                                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(stickersActivity2, p8Var);
                                    final int i23 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i24 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new by0(25, stickersActivity2, p8Var), false);
                                    final int i25 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i26 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, LocaleController.getString(R.string.StickersRemove), !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.a0(this.b, view);
                                break;
                            default:
                                StickersActivity.Z(this.b, view);
                                break;
                        }
                    }
                };
                K.E = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.aa1
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.p8)) {
                                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(stickersActivity2, p8Var);
                                    final int i23 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i24 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new by0(25, stickersActivity2, p8Var), false);
                                    final int i25 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i26 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, LocaleController.getString(R.string.StickersRemove), !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.a0(this.b, view);
                                break;
                            default:
                                StickersActivity.Z(this.b, view);
                                break;
                        }
                    }
                };
                K.L(stickersActivity.w.contains(Long.valueOf(tL_messages_stickerSet.set.id)));
                arrayList.add(K);
            }
            charSequence = null;
            k71Var.L();
            k71Var.U();
            if (i11 != 1 && i11 != 5) {
                arrayList.add(org.telegram.ui.Components.u61.C(null));
            } else if (i11 == 1) {
                ic.a.z(R.string.MasksInfo, arrayList);
            }
        } else {
            charSequence = null;
        }
        if (stickersActivity.e.size() > 3) {
            stickersActivity.e = new ArrayList(stickersActivity.e.subList(0, 3));
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 5 && !stickersActivity.e.isEmpty()) {
            if (stickersActivity.d.size() > 0) {
                arrayList.add(org.telegram.ui.Components.u61.C(charSequence));
            }
            ic.a.p(i11 == 5 ? R.string.FeaturedEmojiPacks : R.string.FeaturedStickers, arrayList);
            ArrayList arrayList5 = stickersActivity.e;
            int size4 = arrayList5.size();
            while (i12 < size4) {
                Object obj2 = arrayList5.get(i12);
                i12++;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj2;
                int i23 = org.telegram.ui.Cells.l3.a;
                org.telegram.ui.Components.u61 K2 = org.telegram.ui.Components.u61.K(org.telegram.ui.Cells.l3.class);
                K2.G = stickerSetCovered;
                K2.D = new View.OnClickListener(stickersActivity) { // from class: org.telegram.ui.aa1
                    public final /* synthetic */ StickersActivity b;

                    {
                        this.b = stickersActivity;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                if (view != null && (view.getParent() instanceof org.telegram.ui.Cells.p8)) {
                                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view.getParent();
                                    final TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
                                    final StickersActivity stickersActivity2 = this.b;
                                    org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(stickersActivity2, p8Var);
                                    final int i232 = 0;
                                    H.c(R.drawable.msg_archive, LocaleController.getString(R.string.StickersHide), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i232) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, false);
                                    final int i24 = 1;
                                    H.l(R.drawable.msg_link, LocaleController.getString(R.string.StickersCopy), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i24) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    H.c(R.drawable.msg_reorder, LocaleController.getString(R.string.StickersReorder), new by0(25, stickersActivity2, p8Var), false);
                                    final int i25 = 2;
                                    H.l(R.drawable.msg_share, LocaleController.getString(R.string.StickersShare), new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i25) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, !stickersSet.set.official);
                                    final int i26 = 3;
                                    H.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.ba1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i26) {
                                                case 0:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, !r9.set.archived ? 1 : 2, stickersActivity2, true, true);
                                                    break;
                                                case 1:
                                                    StickersActivity stickersActivity3 = stickersActivity2;
                                                    try {
                                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity3.m0(stickersSet)));
                                                        org.telegram.ui.Components.wc.j(stickersActivity3).j();
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
                                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity4.m0(tL_messages_stickerSet2));
                                                        stickersActivity4.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        return;
                                                    }
                                                default:
                                                    MediaDataController.getInstance(r0.currentAccount).toggleStickerSet(r0.getParentActivity(), stickersSet, 0, stickersActivity2, true, true);
                                                    break;
                                            }
                                        }
                                    }, LocaleController.getString(R.string.StickersRemove), !stickersSet.set.official, true);
                                    H.S = 190;
                                    H.Z();
                                    break;
                                }
                                break;
                            case 1:
                                StickersActivity.a0(this.b, view);
                                break;
                            default:
                                StickersActivity.Z(this.b, view);
                                break;
                        }
                    }
                };
                K2.t = arrayList2.contains(Long.valueOf(stickerSetCovered.set.id));
                arrayList.add(K2);
            }
            if (z10) {
                org.telegram.ui.Components.u61 c10 = org.telegram.ui.Components.u61.c(8, R.drawable.msg2_trending, LocaleController.getString(R.string.ShowMoreEmojiPacks));
                c10.q = true;
                arrayList.add(c10);
            }
        }
        if (i11 == 5) {
            arrayList.add(org.telegram.ui.Components.u61.C(stickersActivity.i0(LocaleController.getString(i11 == 5 ? R.string.EmojiBotInfo : R.string.StickersBotInfo))));
        }
    }

    public static void e0(StickersActivity stickersActivity, int i10) {
        StickersActivity stickersActivity2;
        String string;
        TextView textView;
        int i11 = 0;
        int i12 = 2;
        if (i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            int size = stickersActivity.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i13);
                if (stickersActivity.w.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb2.length() != 0) {
                        sb2.append("\n");
                    }
                    sb2.append(stickersActivity.m0(tL_messages_stickerSet));
                }
            }
            String sb3 = sb2.toString();
            org.telegram.ui.Components.nr0 P0 = org.telegram.ui.Components.nr0.P0(stickersActivity.fragmentView.getContext(), null, sb3, false, sb3);
            P0.t0 = new wv0(stickersActivity, i12);
            P0.show();
            return;
        }
        if (i10 == 0 || i10 == 1) {
            ArrayList arrayList = new ArrayList(stickersActivity.w.size());
            int size2 = stickersActivity.d.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i14);
                if (stickersActivity.w.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(stickersActivity.getParentActivity());
                    if (i10 == 1) {
                        alertDialog$Builder.a.R = LocaleController.formatString(R.string.DeleteStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.a.T = LocaleController.formatString(R.string.DeleteStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Delete);
                    } else {
                        alertDialog$Builder.a.R = LocaleController.formatString(R.string.ArchiveStickerSetsAlertTitle, LocaleController.formatPluralString("StickerSets", size3, new Object[0]));
                        alertDialog$Builder.a.T = LocaleController.formatString(R.string.ArchiveStickersAlertMessage, Integer.valueOf(size3));
                        string = LocaleController.getString(R.string.Archive);
                    }
                    alertDialog$Builder.k(string, new i2.z(stickersActivity, arrayList, i10, 18));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    stickersActivity.showDialog(e2Var);
                    if (i10 != 1 || (textView = (TextView) e2Var.d(-1)) == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                    return;
                }
                int size4 = stickersActivity.d.size();
                while (true) {
                    if (i11 >= size4) {
                        stickersActivity2 = stickersActivity;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) stickersActivity.d.get(i11);
                    if (!stickersActivity.w.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
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
                                intent.putExtra("android.intent.extra.TEXT", stickersActivity2.m0(tL_messages_stickerSet3));
                                stickersActivity2.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (i10 == 3) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity2.m0(tL_messages_stickerSet3)));
                                org.telegram.ui.Components.wc.j(stickersActivity2).j();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        } else if (i10 == 4) {
                            HashSet hashSet = stickersActivity2.w;
                            if (hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                hashSet.remove(Long.valueOf(tL_messages_stickerSet3.set.id));
                            } else {
                                hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                            }
                            stickersActivity2.a.g3.O(true);
                            stickersActivity2.j0();
                        }
                    }
                }
                stickersActivity2.k0();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        int i10 = this.s;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.StickersName));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Masks));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Emoji));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 9));
        org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
        h.b(2, R.drawable.msg_share, null, null, AndroidUtilities.dp(54.0f), null);
        h.b(0, R.drawable.msg_archive, null, null, AndroidUtilities.dp(54.0f), null);
        this.h = h.b(1, R.drawable.msg_delete, null, null, AndroidUtilities.dp(54.0f), null);
        if (i10 != 5 || (arrayList = this.v) == null) {
            this.d = new ArrayList(MessagesController.getInstance(this.currentAccount).filterPremiumStickers(MediaDataController.getInstance(this.currentAccount).getStickerSets(i10)));
        } else {
            this.d = arrayList;
        }
        this.e = l0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        final int i11 = 0;
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(this, new Utilities.Callback2(this) { // from class: org.telegram.ui.ca1
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        StickersActivity.d0(this.b, (ArrayList) obj, (org.telegram.ui.Components.k71) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.W(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, new da1(this), new da1(this));
        this.a = s71Var;
        s71Var.u1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        final int i12 = 1;
        this.a.H1(new Utilities.Callback2(this) { // from class: org.telegram.ui.ca1
            public final /* synthetic */ StickersActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        StickersActivity.d0(this.b, (ArrayList) obj, (org.telegram.ui.Components.k71) obj2);
                        break;
                    default:
                        ((Integer) obj).getClass();
                        StickersActivity.W(this.b, (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        ig.j0 j0Var = new ig.j0(this, 8);
        this.b = j0Var;
        j0Var.k1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        int i13 = this.s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == i13) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i10 == NotificationCenter.featuredStickersDidLoad || i10 == NotificationCenter.featuredEmojiDidLoad) {
            this.a.g3.O(true);
        } else if (i10 == NotificationCenter.archivedStickersCountDidLoad && ((Integer) objArr[0]).intValue() == i13) {
            this.a.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16, new Class[]{org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.a9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 8192, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16384, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k7));
        org.telegram.ui.Components.c61 c61Var = this.c;
        if (c61Var != null) {
            arrayList.addAll(c61Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final CharSequence i0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 5), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        HashSet hashSet = this.w;
        int size = hashSet.size();
        boolean o10 = this.simpleActionBar.o();
        int i10 = 0;
        if (size <= 0) {
            if (o10) {
                this.simpleActionBar.n();
                this.a.C1(false);
                n0();
                return;
            }
            return;
        }
        if (hashSet.size() > 0) {
            ArrayList arrayList = this.d;
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
            if (this.h.getVisibility() != i10) {
                this.h.setVisibility(i10);
            }
        }
        this.simpleActionBar.t(size, o10);
        if (o10) {
            return;
        }
        this.simpleActionBar.x();
        this.a.C1(true);
        if (SharedConfig.stickersReorderingHintUsed || this.s == 5) {
            return;
        }
        SharedConfig.setStickersReorderingHintUsed(true);
        org.telegram.ui.Components.qc.g(this, new org.telegram.ui.Components.tm0(getParentActivity(), LocaleController.getString(R.string.StickersReorderHint)), 3250).j();
    }

    public final void k0() {
        this.w.clear();
        this.a.g3.O(true);
        j0();
    }

    public final ArrayList l0() {
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        if (this.s != 5) {
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

    public final String m0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        return String.format(locale, a1.g.s(sb2, tL_messages_stickerSet.set.emojis ? "addemoji" : "addstickers", "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void n0() {
        if (this.r) {
            this.r = false;
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i10 = this.s;
            mediaDataController.calcNewHash(i10);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = i10 == 1;
            tL_messages_reorderStickerSets.emojis = i10 == 5;
            int i11 = 0;
            while (i11 < this.d.size()) {
                i11 = c3.h0.j(((TLRPC.TL_messages_stickerSet) this.d.get(i11)).set.id, tL_messages_reorderStickerSets.order, i11, 1);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new l(this, 22));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                org.telegram.ui.Components.wc.b0(this).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
                this.a.g3.O(true);
            }
        }
    }

    public final void o0(org.telegram.ui.Cells.p8 p8Var) {
        TLRPC.TL_messages_stickerSet stickersSet = p8Var.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.w;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            p8Var.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            p8Var.b(true, true);
        }
        this.a.g3.O(true);
        j0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (this.w.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        k0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        int i10 = this.s;
        mediaDataController.checkStickers(i10);
        if (i10 == 0) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            MediaDataController.getInstance(this.currentAccount).checkStickers(1);
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
        } else if (i10 == 6) {
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.archivedStickersCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.s71 s71Var = this.a;
        if (s71Var != null) {
            s71Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
