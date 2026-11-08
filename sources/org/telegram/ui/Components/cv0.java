package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cv0 extends yb {
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
    public cv0(Context context, TLObject tLObject, int i7, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document3;
        org.telegram.messenger.hc k10;
        TLRPC.TL_messages_stickerSet m0;
        boolean z9 = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z9) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList2 = tL_messages_stickerSet.documents;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                document3 = arrayList2.get(0);
                document2 = document3;
                if (stickerSet == null && document2 != null && (m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).m0(org.telegram.messenger.ij.j1(document2), true)) != null) {
                    stickerSet = m0.set;
                }
                TLRPC.StickerSet stickerSet2 = stickerSet;
                if (document2 == null) {
                    TLObject w10 = stickerSet2 == null ? null : org.telegram.messenger.w7.w(stickerSet2.thumbs, 90, false, null, false);
                    w10 = w10 == null ? document2 : w10;
                    boolean z10 = w10 instanceof TLRPC.Document;
                    if (z10) {
                        k10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document2.thumbs, 90, false, null, false), document2);
                    } else {
                        k10 = org.telegram.messenger.hc.k((TLRPC.PhotoSize) w10, document2, tLObject instanceof TLRPC.StickerSetCovered ? ((TLRPC.StickerSetCovered) tLObject).set.thumb_version : z9 ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0);
                    }
                    org.telegram.messenger.hc hcVar = k10;
                    if (z10 && (org.telegram.messenger.ij.L2(document2, true) || org.telegram.messenger.ij.O4(document2) || org.telegram.messenger.ij.t3(document2, false))) {
                        this.a.l(org.telegram.messenger.hc.b(document2), "50_50", hcVar, null, 0, tLObject);
                    } else if (hcVar == null || hcVar.p != 1) {
                        this.a.k(hcVar, "50_50", "webp", null, tLObject);
                    } else {
                        this.a.k(hcVar, "50_50", "tgs", null, tLObject);
                    }
                } else {
                    this.a.k(null, null, "webp", null, tLObject);
                }
                if (org.telegram.messenger.ij.D4(document2)) {
                    this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                switch (i10) {
                    case 0:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(org.telegram.messenger.id.M0(2131748673, null));
                                this.c.setText(org.telegram.messenger.id.a0("MasksRemovedInfo", null, 2131748672, stickerSet2.title));
                                return;
                            } else {
                                if (!stickerSet2.emojis) {
                                    this.b.setText(org.telegram.messenger.id.M0(2131744856, null));
                                    this.c.setText(org.telegram.messenger.id.a0("StickersRemovedInfo", null, 2131744855, stickerSet2.title));
                                    return;
                                }
                                this.b.setText(org.telegram.messenger.id.M0(2131751172, null));
                                if (i7 > 1) {
                                    this.c.setText(org.telegram.messenger.id.G(i7, "EmojiRemovedMultipleInfo", new Object[0]));
                                    return;
                                } else {
                                    this.c.setText(org.telegram.messenger.id.a0("EmojiRemovedInfo", null, 2131751171, stickerSet2.title));
                                    return;
                                }
                            }
                        }
                        return;
                    case 1:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(org.telegram.messenger.id.M0(2131748679, null));
                                this.c.setText(org.telegram.messenger.id.a0("MasksArchivedInfo", null, 2131748678, stickerSet2.title));
                                return;
                            } else if (stickerSet2.emojis) {
                                this.b.setText(org.telegram.messenger.id.M0(2131751188, null));
                                this.c.setText(org.telegram.messenger.id.a0("EmojiArchivedInfo", null, 2131751187, stickerSet2.title));
                                return;
                            } else {
                                this.b.setText(org.telegram.messenger.id.M0(2131744871, null));
                                this.c.setText(org.telegram.messenger.id.a0("StickersArchivedInfo", null, 2131744870, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 2:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(org.telegram.messenger.id.M0(2131754403, null));
                                this.c.setText(org.telegram.messenger.id.a0("AddMasksInstalledInfo", null, 2131754402, stickerSet2.title));
                                return;
                            } else {
                                if (!stickerSet2.emojis) {
                                    this.b.setText(org.telegram.messenger.id.M0(2131754387, null));
                                    this.c.setText(org.telegram.messenger.id.a0("AddStickersInstalledInfo", null, 2131754386, stickerSet2.title));
                                    return;
                                }
                                this.b.setText(org.telegram.messenger.id.M0(2131754440, null));
                                if (i7 > 1) {
                                    this.c.setText(org.telegram.messenger.id.G(i7, "AddEmojiMultipleInstalledInfo", new Object[0]));
                                    return;
                                } else {
                                    this.c.setText(org.telegram.messenger.id.a0("AddEmojiInstalledInfo", null, 2131754439, stickerSet2.title));
                                    return;
                                }
                            }
                        }
                        return;
                    case 3:
                        this.b.setText(org.telegram.messenger.id.M0(2131746283, null));
                        this.c.setVisibility(8);
                        return;
                    case 4:
                        this.b.setText(org.telegram.messenger.id.M0(2131746284, null));
                        this.c.setVisibility(8);
                        return;
                    case 5:
                        this.b.setText(org.telegram.messenger.id.M0(2131754354, null));
                        this.c.setVisibility(8);
                        return;
                    case 6:
                        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q() || org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).D3()) {
                            this.b.setText(org.telegram.messenger.id.a0("LimitReachedFavoriteStickers", null, 2131748967, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).I4)));
                            this.c.setText(org.telegram.messenger.id.a0("LimitReachedFavoriteStickersSubtitlePremium", null, 2131748965, new Object[0]));
                            return;
                        } else {
                            this.b.setText(org.telegram.messenger.id.a0("LimitReachedFavoriteStickers", null, 2131748967, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).H4)));
                            this.c.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.id.a0("LimitReachedFavoriteStickersSubtitle", null, 2131748966, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).I4)), new r10(context, 2)));
                            return;
                        }
                    case 7:
                        boolean q10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q();
                        if (org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).D3() || q10) {
                            this.b.setText(org.telegram.messenger.id.a0(null, null, 2131748970, Integer.valueOf(q10 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).G4 : org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).F4)));
                            this.c.setText(org.telegram.messenger.id.M0(2131748968, null));
                            return;
                        } else {
                            this.b.setText(org.telegram.messenger.id.a0(null, null, 2131748970, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).F4)));
                            this.c.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.id.a0(null, null, 2131748969, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).G4)), new r10(context, 3)));
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
            if (org.telegram.messenger.ij.D4(document2)) {
            }
            switch (i10) {
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
            if (org.telegram.messenger.ij.D4(document2)) {
            }
            switch (i10) {
            }
        } else {
            if (document == null && tLObject != null) {
                boolean z11 = org.telegram.messenger.r2.a;
                throw new IllegalArgumentException("Invalid type of the given setObject: " + tLObject.getClass());
            }
            document2 = document;
            stickerSet = null;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet2222 = stickerSet;
            if (document2 == null) {
            }
            if (org.telegram.messenger.ij.D4(document2)) {
            }
            switch (i10) {
            }
        }
    }
}
