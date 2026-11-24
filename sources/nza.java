// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nza extends i21 {
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
    public nza(Context context, TLObject tLObject, int i, int i2, TLRPC.Document document, wjb wjbVar) {
        super(context, wjbVar);
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document3;
        gl5 k;
        TLRPC.TL_messages_stickerSet n0;
        boolean z = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList2 = tL_messages_stickerSet.documents;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                document3 = arrayList2.get(0);
                document2 = document3;
                if (stickerSet == null && document2 != null && (n0 = hq6.d0(y6c.t0).n0(k27.i1(document2), true)) != null) {
                    stickerSet = n0.set;
                }
                TLRPC.StickerSet stickerSet2 = stickerSet;
                if (document2 == null) {
                    TLObject w = stickerSet2 == null ? null : ba4.w(stickerSet2.thumbs, 90, false, null, false);
                    w = w == null ? document2 : w;
                    boolean z2 = w instanceof TLRPC.Document;
                    if (z2) {
                        k = gl5.c(ba4.w(document2.thumbs, 90, false, null, false), document2);
                    } else {
                        k = gl5.k((TLRPC.PhotoSize) w, document2, tLObject instanceof TLRPC.StickerSetCovered ? ((TLRPC.StickerSetCovered) tLObject).set.thumb_version : z ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0);
                    }
                    gl5 gl5Var = k;
                    if (z2 && (k27.K2(document2, true) || k27.M4(document2) || k27.s3(document2, false))) {
                        this.a.h(gl5.b(document2), "50_50", gl5Var, null, 0, tLObject);
                    } else if (gl5Var == null || gl5Var.p != 1) {
                        this.a.n(gl5Var, "50_50", "webp", null, tLObject);
                    } else {
                        this.a.n(gl5Var, "50_50", "tgs", null, tLObject);
                    }
                } else {
                    this.a.n(null, null, "webp", null, tLObject);
                }
                if (k27.B4(document2)) {
                    this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                switch (i2) {
                    case 0:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(k96.M0(2131748480, null));
                                this.c.setText(k96.a0("MasksRemovedInfo", null, 2131748479, stickerSet2.title));
                                return;
                            }
                            boolean z3 = stickerSet2.emojis;
                            TextView textView = this.b;
                            if (!z3) {
                                textView.setText(k96.M0(2131744616, null));
                                this.c.setText(k96.a0("StickersRemovedInfo", null, 2131744615, stickerSet2.title));
                                return;
                            }
                            textView.setText(k96.M0(2131751159, null));
                            TextView textView2 = this.c;
                            if (i > 1) {
                                textView2.setText(k96.G(i, "EmojiRemovedMultipleInfo", new Object[0]));
                                return;
                            } else {
                                textView2.setText(k96.a0("EmojiRemovedInfo", null, 2131751158, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 1:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(k96.M0(2131748486, null));
                                this.c.setText(k96.a0("MasksArchivedInfo", null, 2131748485, stickerSet2.title));
                                return;
                            }
                            boolean z4 = stickerSet2.emojis;
                            TextView textView3 = this.b;
                            if (z4) {
                                textView3.setText(k96.M0(2131751175, null));
                                this.c.setText(k96.a0("EmojiArchivedInfo", null, 2131751174, stickerSet2.title));
                                return;
                            } else {
                                textView3.setText(k96.M0(2131744631, null));
                                this.c.setText(k96.a0("StickersArchivedInfo", null, 2131744630, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 2:
                        if (stickerSet2 != null) {
                            if (stickerSet2.masks) {
                                this.b.setText(k96.M0(2131754400, null));
                                this.c.setText(k96.a0("AddMasksInstalledInfo", null, 2131754399, stickerSet2.title));
                                return;
                            }
                            boolean z5 = stickerSet2.emojis;
                            TextView textView4 = this.b;
                            if (!z5) {
                                textView4.setText(k96.M0(2131754384, null));
                                this.c.setText(k96.a0("AddStickersInstalledInfo", null, 2131754383, stickerSet2.title));
                                return;
                            }
                            textView4.setText(k96.M0(2131754437, null));
                            TextView textView5 = this.c;
                            if (i > 1) {
                                textView5.setText(k96.G(i, "AddEmojiMultipleInstalledInfo", new Object[0]));
                                return;
                            } else {
                                textView5.setText(k96.a0("AddEmojiInstalledInfo", null, 2131754436, stickerSet2.title));
                                return;
                            }
                        }
                        return;
                    case 3:
                        this.b.setText(k96.M0(2131746089, null));
                        this.c.setVisibility(8);
                        return;
                    case 4:
                        this.b.setText(k96.M0(2131746090, null));
                        this.c.setVisibility(8);
                        return;
                    case 5:
                        this.b.setText(k96.M0(2131754351, null));
                        this.c.setVisibility(8);
                        return;
                    case 6:
                        if (y6c.h(y6c.t0).p() || na7.q1(y6c.t0).E3()) {
                            this.b.setText(k96.a0("LimitReachedFavoriteStickers", null, 2131748774, Integer.valueOf(na7.q1(y6c.t0).k4.W0.f())));
                            this.c.setText(k96.a0("LimitReachedFavoriteStickersSubtitlePremium", null, 2131748772, new Object[0]));
                            return;
                        } else {
                            this.b.setText(k96.a0("LimitReachedFavoriteStickers", null, 2131748774, Integer.valueOf(na7.q1(y6c.t0).k4.V0.f())));
                            this.c.setText(gl.O2(k96.a0("LimitReachedFavoriteStickersSubtitle", null, 2131748773, Integer.valueOf(na7.q1(y6c.t0).k4.W0.f())), -1, 2, new vf1(context, (byte) 22), null));
                            return;
                        }
                    case 7:
                        boolean p = y6c.h(y6c.t0).p();
                        if (!na7.q1(y6c.t0).E3() && !p) {
                            this.b.setText(k96.a0(null, null, 2131748777, Integer.valueOf(na7.q1(y6c.t0).k4.T0.f())));
                            this.c.setText(gl.O2(k96.a0(null, null, 2131748776, Integer.valueOf(na7.q1(y6c.t0).k4.U0.f())), -1, 2, new vf1(context, (byte) 23), null));
                            return;
                        } else {
                            TextView textView6 = this.b;
                            gr grVar = na7.q1(y6c.t0).k4;
                            textView6.setText(k96.a0(null, null, 2131748777, Integer.valueOf((p ? grVar.U0 : grVar.T0).f())));
                            this.c.setText(k96.M0(2131748775, null));
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
            if (k27.B4(document2)) {
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
            if (k27.B4(document2)) {
            }
            switch (i2) {
            }
        } else {
            if (document == null && tLObject != null) {
                boolean z6 = w01.a;
                k32.e(tLObject.getClass(), "Invalid type of the given setObject: ");
                throw null;
            }
            document2 = document;
            stickerSet = null;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet2222 = stickerSet;
            if (document2 == null) {
            }
            if (k27.B4(document2)) {
            }
            switch (i2) {
            }
        }
    }
}
