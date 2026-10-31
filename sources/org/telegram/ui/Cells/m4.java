package org.telegram.ui.Cells;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m4 implements org.telegram.messenger.z5 {
    public boolean D;
    public TLRPC.MessageExtendedMedia E;
    public String F;
    public final RadialProgress2 G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public qz0 L;
    public boolean M;
    public int a;
    public int b;
    public int c;
    public int d;
    public final q1 e;
    public final ImageReceiver f;
    public boolean h;
    public final int n;
    public final int r;
    public final float[] s = new float[8];
    public String w;
    public final boolean x;
    public final boolean y;

    public m4(q1 q1Var, jj jjVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        new RectF();
        new Path();
        this.H = 4;
        this.J = 0;
        this.K = 0;
        this.e = q1Var;
        this.x = z10;
        this.y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.y = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && jj.K4(messageMedia.document);
            this.J = (int) Math.max(1L, Math.round(jj.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.y = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.J = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.y) {
            int i12 = this.J;
            this.K = i12;
            this.L = new qz0(org.telegram.messenger.i0.g0(i12, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f = imageReceiver;
        imageReceiver.o1 = null;
        this.n = i10;
        this.r = i11;
        this.I = org.telegram.messenger.b6.q(q1Var.Y5).k();
        c(messageExtendedMedia, jjVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(q1Var, q1Var.getResourcesProvider());
        this.G = radialProgress2;
        int a2 = a();
        this.H = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        return (!this.y || this.D) ? 4 : 0;
    }

    public final void b(int i10) {
        if (i10 != this.H) {
            this.H = i10;
            this.G.setIcon(i10, true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, jj jjVar) {
        boolean z10;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (this.E == messageExtendedMedia) {
            return;
        }
        this.E = messageExtendedMedia;
        this.D = false;
        int i10 = this.n;
        int i11 = this.r;
        String i12 = a1.g.i(i10, i11, "_");
        boolean z11 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z11) {
            this.h = true;
            this.w = null;
            imageReceiver.q0(ic.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, jjVar.k), sc.e.A(i12, "_b2"), null, null, jjVar, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            org.telegram.messenger.i0.h(colorMatrix, -0.1f);
            imageReceiver.o1 = new ColorMatrixColorFilter(colorMatrix);
            return;
        }
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return;
        }
        boolean z12 = jjVar.h2;
        this.h = z12;
        if (z12) {
            i12 = sc.e.A(i12, "_b3");
        }
        String str = i12;
        imageReceiver.o1 = null;
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        this.w = jj.U0(messageMedia);
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(tL_messageMediaPhoto.photo.sizes, org.telegram.messenger.i0.Z0(false), true, null, true);
            imageReceiver.r0(ic.i(w9, tL_messageMediaPhoto.photo), str, ic.i(org.telegram.messenger.b8.w(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, w9, false), tL_messageMediaPhoto.photo), str, null, 0L, null, jjVar, 0);
            return;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return;
        }
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
        boolean z13 = this.h;
        boolean z14 = this.y;
        boolean z15 = this.x;
        if (!z13 && !z15 && z14) {
            int i13 = tz.a;
            if (sc.e(1024)) {
                z10 = true;
                this.D = z10;
                if (!z15 || !z14 || (document2 = tL_messageMediaDocument.document) == null) {
                    document = tL_messageMediaDocument.document;
                    if (document == null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.Z0(false), true, null, true);
                        imageReceiver.r0(ic.c(w10, tL_messageMediaDocument.document), str, ic.c(org.telegram.messenger.b8.w(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, w10, false), tL_messageMediaDocument.document), str, null, 0L, null, jjVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(document2.thumbs, org.telegram.messenger.i0.Z0(false), true, null, true);
                TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, w11, false);
                ic b10 = ic.b(tL_messageMediaDocument.document);
                ic c10 = ic.c(w11, tL_messageMediaDocument.document);
                ic c11 = ic.c(w12, tL_messageMediaDocument.document);
                ic icVar = this.D ? b10 : null;
                StringBuilder t10 = a1.g.t(str);
                t10.append(this.D ? "_g" : "");
                imageReceiver.u0(icVar, t10.toString(), c10, str, c11, str, null, 0L, null, jjVar, 0);
                return;
            }
        }
        z10 = false;
        this.D = z10;
        if (!z15) {
        }
        document = tL_messageMediaDocument.document;
        if (document == null) {
        }
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.I;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.E.downloadProgress = min;
        this.G.p(true, min);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.E.uploadProgress = min;
        this.G.p(true, min);
        b(min < 1.0f ? 3 : this.x ? 6 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
    }
}
