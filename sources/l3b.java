// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l3b extends r21 {
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l3b(Context context, TLObject tLObject, int i, int i2, TLRPC.Document document, vnb vnbVar) {
        super(context, vnbVar);
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document3;
        jn5 k;
        TLRPC.TL_messages_stickerSet n0;
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList2 = tL_messages_stickerSet.documents;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                document3 = arrayList2.get(0);
                document2 = document3;
                if (stickerSet == null && document2 != null && (n0 = ls6.d0(yac.t0).n0(r47.i1(document2), true)) != null) {
                    stickerSet = n0.set;
                }
                TLRPC.StickerSet stickerSet2 = stickerSet;
                if (document2 == null) {
                    TLObject w = stickerSet2 == null ? null : xb4.w(stickerSet2.thumbs, 90, false, null, false);
                    w = w == null ? document2 : w;
                    boolean z2 = w instanceof TLRPC.Document;
                    if (z2) {
                        k = jn5.c(xb4.w(document2.thumbs, 90, false, null, false), document2);
                    } else {
                        k = jn5.k((TLRPC.PhotoSize) w, document2, tLObject instanceof TLRPC.StickerSetCovered ? ((TLRPC.StickerSetCovered) tLObject).set.thumb_version : z ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0);
                    }
                    jn5 jn5Var = k;
                    if (z2 && (r47.K2(document2, true) || r47.M4(document2) || r47.s3(document2, false))) {
                        this.a.h(jn5.b(document2), "50_50", jn5Var, null, 0, tLObject);
                    } else if (jn5Var == null || jn5Var.p != 1) {
                        this.a.n(jn5Var, "50_50", "webp", null, tLObject);
                    } else {
                        this.a.n(jn5Var, "50_50", "tgs", null, tLObject);
                    }
                } else {
                    this.a.n(null, null, "webp", null, tLObject);
                }
                if (r47.B4(document2)) {
                    this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                switch (i2) {
                    case 0:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(ob6.M0(2131748426, null));
                                this.c.setText(ob6.a0("MasksRemovedInfo", null, 2131748425, stickerSet2.title));
                                return;
                            }
                            boolean z3 = stickerSet2.emojis;
                            TextView textView = this.b;
                            if (!z3) {
                                textView.setText(ob6.M0(2131744510, null));
                                this.c.setText(ob6.a0("StickersRemovedInfo", null, 2131744509, stickerSet2.title));
                                return;
                            }
                            textView.setText(ob6.M0(2131751136, null));
                            TextView textView2 = this.c;
                            if (i > 1) {
                                textView2.setText(ob6.G(i, "EmojiRemovedMultipleInfo", new Object[0]));
                                return;
                            } else {
                                textView2.setText(ob6.a0("EmojiRemovedInfo", null, 2131751135, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 1:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(ob6.M0(2131748432, null));
                                this.c.setText(ob6.a0("MasksArchivedInfo", null, 2131748431, stickerSet2.title));
                                return;
                            }
                            boolean z4 = stickerSet2.emojis;
                            TextView textView3 = this.b;
                            if (z4) {
                                textView3.setText(ob6.M0(2131751152, null));
                                this.c.setText(ob6.a0("EmojiArchivedInfo", null, 2131751151, stickerSet2.title));
                                return;
                            } else {
                                textView3.setText(ob6.M0(2131744525, null));
                                this.c.setText(ob6.a0("StickersArchivedInfo", null, 2131744524, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 2:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(ob6.M0(2131754396, null));
                                this.c.setText(ob6.a0("AddMasksInstalledInfo", null, 2131754395, stickerSet2.title));
                                return;
                            }
                            boolean z5 = stickerSet2.emojis;
                            TextView textView4 = this.b;
                            if (!z5) {
                                textView4.setText(ob6.M0(2131754380, null));
                                this.c.setText(ob6.a0("AddStickersInstalledInfo", null, 2131754379, stickerSet2.title));
                                return;
                            }
                            textView4.setText(ob6.M0(2131754433, null));
                            TextView textView5 = this.c;
                            if (i > 1) {
                                textView5.setText(ob6.G(i, "AddEmojiMultipleInstalledInfo", new Object[0]));
                                return;
                            } else {
                                textView5.setText(ob6.a0("AddEmojiInstalledInfo", null, 2131754432, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 3:
                        this.b.setText(ob6.M0(2131746009, null));
                        this.c.setVisibility(8);
                        return;
                    case 4:
                        this.b.setText(ob6.M0(2131746010, null));
                        this.c.setVisibility(8);
                        return;
                    case 5:
                        this.b.setText(ob6.M0(2131754347, null));
                        this.c.setVisibility(8);
                        return;
                    case 6:
                        if (yac.h(yac.t0).p() || uc7.s1(yac.t0).M3()) {
                            this.b.setText(ob6.a0("LimitReachedFavoriteStickers", null, 2131748720, Integer.valueOf(uc7.s1(yac.t0).l4.e1.f())));
                            this.c.setText(ob6.a0("LimitReachedFavoriteStickersSubtitlePremium", null, 2131748718, new Object[0]));
                            return;
                        } else {
                            this.b.setText(ob6.a0("LimitReachedFavoriteStickers", null, 2131748720, Integer.valueOf(uc7.s1(yac.t0).l4.d1.f())));
                            this.c.setText(hl.N2(ob6.a0("LimitReachedFavoriteStickersSubtitle", null, 2131748719, Integer.valueOf(uc7.s1(yac.t0).l4.e1.f())), -1, 2, new xf1(context, (byte) 22), null));
                            return;
                        }
                    case 7:
                        boolean p = yac.h(yac.t0).p();
                        if (!uc7.s1(yac.t0).M3() && !p) {
                            this.b.setText(ob6.a0(null, null, 2131748723, Integer.valueOf(uc7.s1(yac.t0).l4.b1.f())));
                            this.c.setText(hl.N2(ob6.a0(null, null, 2131748722, Integer.valueOf(uc7.s1(yac.t0).l4.c1.f())), -1, 2, new xf1(context, (byte) 23), null));
                            return;
                        } else {
                            TextView textView6 = this.b;
                            hr hrVar = uc7.s1(yac.t0).l4;
                            textView6.setText(ob6.a0(null, null, 2131748723, Integer.valueOf((p ? hrVar.c1 : hrVar.b1).f())));
                            this.c.setText(ob6.M0(2131748721, null));
                            return;
                        }
                    default:
                        return;
                }
            }
            document3 = document;
            document2 = document3;
            if (stickerSet == null) {
                stickerSet = n0.set;
            }
            TLRPC.StickerSet stickerSet22 = stickerSet;
            if (document2 == null) {
            }
            if (r47.B4(document2)) {
            }
            switch (i2) {
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
            if (r47.B4(document2)) {
            }
            switch (i2) {
            }
        } else {
            if (document == null && tLObject != null) {
                boolean z6 = f11.a;
                c22.b(tLObject.getClass(), "Invalid type of the given setObject: ");
                throw null;
            }
            document2 = document;
            stickerSet = null;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet2222 = stickerSet;
            if (document2 == null) {
            }
            if (r47.B4(document2)) {
            }
            switch (i2) {
            }
        }
    }
}
