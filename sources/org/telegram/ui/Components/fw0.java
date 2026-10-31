package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fw0 extends sb {
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fw0(Context context, TLObject tLObject, int i10, int i11, TLRPC.Document document, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document3;
        org.telegram.messenger.ic k10;
        TLRPC.TL_messages_stickerSet m0;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList2 = tL_messages_stickerSet.documents;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                document3 = arrayList2.get(0);
                document2 = document3;
                if (stickerSet == null && document2 != null && (m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).m0(org.telegram.messenger.jj.j1(document2), true)) != null) {
                    stickerSet = m0.set;
                }
                TLRPC.StickerSet stickerSet2 = stickerSet;
                if (document2 == null) {
                    TLObject w9 = stickerSet2 == null ? null : org.telegram.messenger.b8.w(stickerSet2.thumbs, 90, false, null, false);
                    w9 = w9 == null ? document2 : w9;
                    boolean z11 = w9 instanceof TLRPC.Document;
                    if (z11) {
                        k10 = org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document2.thumbs, 90, false, null, false), document2);
                    } else {
                        k10 = org.telegram.messenger.ic.k((TLRPC.PhotoSize) w9, document2, tLObject instanceof TLRPC.StickerSetCovered ? ((TLRPC.StickerSetCovered) tLObject).set.thumb_version : z10 ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0);
                    }
                    org.telegram.messenger.ic icVar = k10;
                    if (z11 && (org.telegram.messenger.jj.K2(document2, true) || org.telegram.messenger.jj.N4(document2) || org.telegram.messenger.jj.s3(document2, false))) {
                        this.a.l(org.telegram.messenger.ic.b(document2), "50_50", icVar, null, 0, tLObject);
                    } else if (icVar == null || icVar.p != 1) {
                        this.a.k(icVar, "50_50", "webp", null, tLObject);
                    } else {
                        this.a.k(icVar, "50_50", "tgs", null, tLObject);
                    }
                } else {
                    this.a.k(null, null, "webp", null, tLObject);
                }
                if (org.telegram.messenger.jj.C4(document2)) {
                    this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                switch (i11) {
                    case 0:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(org.telegram.messenger.cd.L0(2131748687, null));
                                this.c.setText(org.telegram.messenger.cd.a0("MasksRemovedInfo", null, 2131748686, stickerSet2.title));
                                return;
                            } else {
                                if (!stickerSet2.emojis) {
                                    this.b.setText(org.telegram.messenger.cd.L0(2131744871, null));
                                    this.c.setText(org.telegram.messenger.cd.a0("StickersRemovedInfo", null, 2131744870, stickerSet2.title));
                                    return;
                                }
                                this.b.setText(org.telegram.messenger.cd.L0(2131751172, null));
                                if (i10 > 1) {
                                    this.c.setText(org.telegram.messenger.cd.G(i10, "EmojiRemovedMultipleInfo", new Object[0]));
                                    return;
                                } else {
                                    this.c.setText(org.telegram.messenger.cd.a0("EmojiRemovedInfo", null, 2131751171, stickerSet2.title));
                                    return;
                                }
                            }
                        }
                        return;
                    case 1:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(org.telegram.messenger.cd.L0(2131748693, null));
                                this.c.setText(org.telegram.messenger.cd.a0("MasksArchivedInfo", null, 2131748692, stickerSet2.title));
                                return;
                            } else if (stickerSet2.emojis) {
                                this.b.setText(org.telegram.messenger.cd.L0(2131751188, null));
                                this.c.setText(org.telegram.messenger.cd.a0("EmojiArchivedInfo", null, 2131751187, stickerSet2.title));
                                return;
                            } else {
                                this.b.setText(org.telegram.messenger.cd.L0(2131744886, null));
                                this.c.setText(org.telegram.messenger.cd.a0("StickersArchivedInfo", null, 2131744885, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 2:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(org.telegram.messenger.cd.L0(2131754403, null));
                                this.c.setText(org.telegram.messenger.cd.a0("AddMasksInstalledInfo", null, 2131754402, stickerSet2.title));
                                return;
                            } else {
                                if (!stickerSet2.emojis) {
                                    this.b.setText(org.telegram.messenger.cd.L0(2131754387, null));
                                    this.c.setText(org.telegram.messenger.cd.a0("AddStickersInstalledInfo", null, 2131754386, stickerSet2.title));
                                    return;
                                }
                                this.b.setText(org.telegram.messenger.cd.L0(2131754440, null));
                                if (i10 > 1) {
                                    this.c.setText(org.telegram.messenger.cd.G(i10, "AddEmojiMultipleInstalledInfo", new Object[0]));
                                    return;
                                } else {
                                    this.c.setText(org.telegram.messenger.cd.a0("AddEmojiInstalledInfo", null, 2131754439, stickerSet2.title));
                                    return;
                                }
                            }
                        }
                        return;
                    case 3:
                        this.b.setText(org.telegram.messenger.cd.L0(2131746297, null));
                        this.c.setVisibility(8);
                        return;
                    case 4:
                        this.b.setText(org.telegram.messenger.cd.L0(2131746298, null));
                        this.c.setVisibility(8);
                        return;
                    case 5:
                        this.b.setText(org.telegram.messenger.cd.L0(2131754354, null));
                        this.c.setVisibility(8);
                        return;
                    case 6:
                        if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q() || org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).A3()) {
                            this.b.setText(org.telegram.messenger.cd.a0("LimitReachedFavoriteStickers", null, 2131748976, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).J4)));
                            this.c.setText(org.telegram.messenger.cd.a0("LimitReachedFavoriteStickersSubtitlePremium", null, 2131748974, new Object[0]));
                            return;
                        } else {
                            this.b.setText(org.telegram.messenger.cd.a0("LimitReachedFavoriteStickers", null, 2131748976, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).I4)));
                            this.c.setText(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.a0("LimitReachedFavoriteStickersSubtitle", null, 2131748975, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).J4)), new i20(context, 2)));
                            return;
                        }
                    case 7:
                        boolean q6 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q();
                        if (org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).A3() || q6) {
                            this.b.setText(org.telegram.messenger.cd.a0(null, null, 2131748979, Integer.valueOf(q6 ? org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).H4 : org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).G4)));
                            this.c.setText(org.telegram.messenger.cd.L0(2131748977, null));
                            return;
                        } else {
                            this.b.setText(org.telegram.messenger.cd.a0(null, null, 2131748979, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).G4)));
                            this.c.setText(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.a0(null, null, 2131748978, Integer.valueOf(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).H4)), new i20(context, 3)));
                            return;
                        }
                    default:
                        return;
                }
            }
            document3 = document;
            document2 = document3;
            if (stickerSet == null) {
                stickerSet = m0.set;
            }
            TLRPC.StickerSet stickerSet22 = stickerSet;
            if (document2 == null) {
            }
            if (org.telegram.messenger.jj.C4(document2)) {
            }
            switch (i11) {
            }
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) tLObject;
            stickerSet = stickerSetCovered.set;
            TLRPC.Document document4 = stickerSetCovered.cover;
            if (document4 != null) {
                document3 = document4;
            } else if (stickerSetCovered.covers.isEmpty()) {
                if ((stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) && (arrayList = (tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents) != null && !arrayList.isEmpty()) {
                    document3 = tL_stickerSetFullCovered.documents.get(0);
                }
                document3 = document;
            } else {
                document3 = stickerSetCovered.covers.get(0);
            }
            document2 = document3;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet222 = stickerSet;
            if (document2 == null) {
            }
            if (org.telegram.messenger.jj.C4(document2)) {
            }
            switch (i11) {
            }
        } else {
            if (document == null && tLObject != null) {
                boolean z12 = org.telegram.messenger.v2.a;
                throw new IllegalArgumentException("Invalid type of the given setObject: " + tLObject.getClass());
            }
            document2 = document;
            stickerSet = null;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet2222 = stickerSet;
            if (document2 == null) {
            }
            if (org.telegram.messenger.jj.C4(document2)) {
            }
            switch (i11) {
            }
        }
    }
}
