// default package

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gd5 implements jq3 {
    public boolean E;
    public TLRPC.MessageExtendedMedia F;
    public String G;
    public final RadialProgress2 H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public pkb M;
    public boolean N;
    public int a;
    public int b;
    public int c;
    public int d;
    public final wb2 e;
    public final ImageReceiver f;
    public boolean h;
    public final int n;
    public final int r;
    public final float[] s = new float[8];
    public String w;
    public final boolean x;
    public final boolean y;

    public gd5(wb2 wb2Var, r47 r47Var, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z, int i, int i2) {
        int i3;
        boolean z2;
        this.I = 4;
        this.K = 0;
        this.L = 0;
        this.e = wb2Var;
        this.x = z;
        this.y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            z2 = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && r47.J4(messageMedia.document);
            this.y = z2;
            i3 = (int) Math.max(1L, Math.round(r47.H0(messageMedia.document)));
            this.K = i3;
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            z2 = (tL_messageExtendedMediaPreview.flags & 4) != 0;
            this.y = z2;
            i3 = tL_messageExtendedMediaPreview.video_duration;
            this.K = i3;
        } else {
            i3 = 0;
            z2 = false;
        }
        if (z2) {
            this.L = i3;
            this.M = new pkb(hl.g0(i3, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(wb2Var);
        this.f = imageReceiver;
        imageReceiver.p1 = null;
        this.n = i;
        this.r = i2;
        this.J = lq3.q(wb2Var.a6).k();
        c(messageExtendedMedia, r47Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(wb2Var, wb2Var.getResourcesProvider());
        this.H = radialProgress2;
        int a = a();
        this.I = a;
        radialProgress2.setIcon(a, false, false);
    }

    public final int a() {
        return (!this.y || this.E) ? 4 : 0;
    }

    public final void b(int i) {
        if (i != this.I) {
            this.I = i;
            this.H.setIcon(i, true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, r47 r47Var) {
        boolean z;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (this.F == messageExtendedMedia) {
            return;
        }
        this.F = messageExtendedMedia;
        this.E = false;
        int i = this.n;
        int i2 = this.r;
        String m = qd4.m(i, i2, "_");
        boolean z2 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z2) {
            this.h = true;
            this.w = null;
            imageReceiver.d0(jn5.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, r47Var.k), m.concat("_b2"), null, null, r47Var, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            hl.h(colorMatrix, -0.1f);
            imageReceiver.p1 = new ColorMatrixColorFilter(colorMatrix);
            return;
        }
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return;
        }
        boolean z3 = r47Var.j2;
        this.h = z3;
        if (z3) {
            m = m.concat("_b3");
        }
        imageReceiver.p1 = null;
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        this.w = r47.U0(messageMedia);
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
            TLRPC.PhotoSize w = xb4.w(tL_messageMediaPhoto.photo.sizes, hl.Y0(false), true, null, true);
            TLRPC.PhotoSize w2 = xb4.w(tL_messageMediaPhoto.photo.sizes, Math.min(i, i2) / 100, false, w, false);
            jn5 i3 = jn5.i(w, tL_messageMediaPhoto.photo);
            jn5 i4 = jn5.i(w2, tL_messageMediaPhoto.photo);
            String str = m;
            imageReceiver.Z(i3, str, i4, str, null, 0L, null, r47Var, 0);
            return;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return;
        }
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
        boolean z4 = this.h;
        boolean z5 = this.y;
        boolean z6 = this.x;
        if (!z4 && !z6 && z5) {
            boolean z7 = xea.a;
            if (i86.e(1024)) {
                z = true;
                this.E = z;
                if (z6 && z5 && (document2 = tL_messageMediaDocument.document) != null) {
                    TLRPC.PhotoSize w3 = xb4.w(document2.thumbs, hl.Y0(false), true, null, true);
                    TLRPC.PhotoSize w4 = xb4.w(tL_messageMediaDocument.document.thumbs, Math.min(i, i2), false, w3, false);
                    jn5 b = jn5.b(tL_messageMediaDocument.document);
                    jn5 c = jn5.c(w3, tL_messageMediaDocument.document);
                    jn5 c2 = jn5.c(w4, tL_messageMediaDocument.document);
                    boolean z8 = this.E;
                    jn5 jn5Var = z8 ? b : null;
                    String str2 = m;
                    imageReceiver.Y(jn5Var, m.concat(z8 ? "_g" : ""), c, str2, c2, str2, null, 0L, null, r47Var, 0);
                    return;
                }
                document = tL_messageMediaDocument.document;
                if (document == null) {
                    TLRPC.PhotoSize w5 = xb4.w(document.thumbs, hl.Y0(false), true, null, true);
                    TLRPC.PhotoSize w6 = xb4.w(tL_messageMediaDocument.document.thumbs, Math.min(i, i2), false, w5, false);
                    jn5 c3 = jn5.c(w5, tL_messageMediaDocument.document);
                    jn5 c4 = jn5.c(w6, tL_messageMediaDocument.document);
                    String str3 = m;
                    imageReceiver.Z(c3, str3, c4, str3, null, 0L, null, r47Var, 0);
                    return;
                }
                return;
            }
        }
        z = false;
        this.E = z;
        if (z6) {
        }
        document = tL_messageMediaDocument.document;
        if (document == null) {
        }
    }

    @Override // jq3
    public final int getObserverTag() {
        return this.J;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.F.downloadProgress = min;
        this.H.o(true, min);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // jq3
    public final void l(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.F.uploadProgress = min;
        this.H.o(true, min);
        b(min < 1.0f ? 3 : this.x ? 6 : a());
        this.e.invalidate();
    }

    @Override // jq3
    public final void B(boolean z) {
    }

    @Override // jq3
    public final void N(String str) {
    }
}
