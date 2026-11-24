// default package

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cd5 implements cr3 {
    public boolean E;
    public TLRPC.MessageExtendedMedia F;
    public String G;
    public final RadialProgress2 H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public uib M;
    public boolean N;
    public int a;
    public int b;
    public int c;
    public int d;
    public final rc2 e;
    public final ImageReceiver f;
    public boolean h;
    public final int n;
    public final int r;
    public final float[] s = new float[8];
    public String w;
    public final boolean x;
    public final boolean y;

    public cd5(rc2 rc2Var, k47 k47Var, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z, int i, int i2) {
        int i3;
        boolean z2;
        this.I = 4;
        this.K = 0;
        this.L = 0;
        this.e = rc2Var;
        this.x = z;
        this.y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            z2 = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && k47.J4(messageMedia.document);
            this.y = z2;
            i3 = (int) Math.max(1L, Math.round(k47.H0(messageMedia.document)));
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
            this.M = new uib(gm.g0(i3, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(rc2Var);
        this.f = imageReceiver;
        imageReceiver.p1 = null;
        this.n = i;
        this.r = i2;
        this.J = er3.q(rc2Var.a6).k();
        c(messageExtendedMedia, k47Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(rc2Var, rc2Var.getResourcesProvider());
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
    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, k47 k47Var) {
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
        String n = td4.n(i, i2, "_");
        boolean z2 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z2) {
            this.h = true;
            this.w = null;
            imageReceiver.d0(gn5.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, k47Var.k), n.concat("_b2"), null, null, k47Var, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            gm.h(colorMatrix, -0.1f);
            imageReceiver.p1 = new ColorMatrixColorFilter(colorMatrix);
            return;
        }
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return;
        }
        boolean z3 = k47Var.j2;
        this.h = z3;
        if (z3) {
            n = n.concat("_b3");
        }
        imageReceiver.p1 = null;
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        this.w = k47.U0(messageMedia);
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
            TLRPC.PhotoSize w = bc4.w(tL_messageMediaPhoto.photo.sizes, gm.Y0(false), true, null, true);
            TLRPC.PhotoSize w2 = bc4.w(tL_messageMediaPhoto.photo.sizes, Math.min(i, i2) / 100, false, w, false);
            gn5 i3 = gn5.i(w, tL_messageMediaPhoto.photo);
            gn5 i4 = gn5.i(w2, tL_messageMediaPhoto.photo);
            String str = n;
            imageReceiver.Z(i3, str, i4, str, null, 0L, null, k47Var, 0);
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
            boolean z7 = gda.a;
            if (e86.e(1024)) {
                z = true;
                this.E = z;
                if (z6 && z5 && (document2 = tL_messageMediaDocument.document) != null) {
                    TLRPC.PhotoSize w3 = bc4.w(document2.thumbs, gm.Y0(false), true, null, true);
                    TLRPC.PhotoSize w4 = bc4.w(tL_messageMediaDocument.document.thumbs, Math.min(i, i2), false, w3, false);
                    gn5 b = gn5.b(tL_messageMediaDocument.document);
                    gn5 c = gn5.c(w3, tL_messageMediaDocument.document);
                    gn5 c2 = gn5.c(w4, tL_messageMediaDocument.document);
                    boolean z8 = this.E;
                    gn5 gn5Var = z8 ? b : null;
                    String str2 = n;
                    imageReceiver.Y(gn5Var, n.concat(z8 ? "_g" : ""), c, str2, c2, str2, null, 0L, null, k47Var, 0);
                    return;
                }
                document = tL_messageMediaDocument.document;
                if (document == null) {
                    TLRPC.PhotoSize w5 = bc4.w(document.thumbs, gm.Y0(false), true, null, true);
                    TLRPC.PhotoSize w6 = bc4.w(tL_messageMediaDocument.document.thumbs, Math.min(i, i2), false, w5, false);
                    gn5 c3 = gn5.c(w5, tL_messageMediaDocument.document);
                    gn5 c4 = gn5.c(w6, tL_messageMediaDocument.document);
                    String str3 = n;
                    imageReceiver.Z(c3, str3, c4, str3, null, 0L, null, k47Var, 0);
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

    @Override // cr3
    public final int getObserverTag() {
        return this.J;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.F.downloadProgress = min;
        this.H.o(true, min);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // cr3
    public final void l(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.F.uploadProgress = min;
        this.H.o(true, min);
        b(min < 1.0f ? 3 : this.x ? 6 : a());
        this.e.invalidate();
    }

    @Override // cr3
    public final void A(boolean z) {
    }

    @Override // cr3
    public final void N(String str) {
    }
}
