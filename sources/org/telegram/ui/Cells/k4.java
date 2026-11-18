package org.telegram.ui.Cells;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k4 implements org.telegram.messenger.y5 {
    public boolean E;
    public TLRPC.MessageExtendedMedia F;
    public String G;
    public final RadialProgress2 H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public vy0 M;
    public boolean N;
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

    public k4(q1 q1Var, fj fjVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i7, int i10) {
        new RectF();
        new Path();
        this.I = 4;
        this.K = 0;
        this.L = 0;
        this.e = q1Var;
        this.x = z10;
        this.y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.y = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && fj.K4(messageMedia.document);
            this.K = (int) Math.max(1L, Math.round(fj.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.y = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.K = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.y) {
            int i11 = this.K;
            this.L = i11;
            this.M = new vy0(org.telegram.messenger.g0.g0(i11, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f = imageReceiver;
        imageReceiver.p1 = null;
        this.n = i7;
        this.r = i10;
        this.J = org.telegram.messenger.a6.q(q1Var.a6).k();
        c(messageExtendedMedia, fjVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(q1Var, q1Var.getResourcesProvider());
        this.H = radialProgress2;
        int a10 = a();
        this.I = a10;
        radialProgress2.setIcon(a10, false, false);
    }

    public final int a() {
        return (!this.y || this.E) ? 4 : 0;
    }

    public final void b(int i7) {
        if (i7 != this.I) {
            this.I = i7;
            this.H.setIcon(i7, true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, fj fjVar) {
        boolean z10;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (this.F == messageExtendedMedia) {
            return;
        }
        this.F = messageExtendedMedia;
        this.E = false;
        int i7 = this.n;
        int i10 = this.r;
        String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i10);
        boolean z11 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z11) {
            this.h = true;
            this.w = null;
            imageReceiver.q0(fc.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, fjVar.k), p5.c.v(j3, "_b2"), null, null, fjVar, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            org.telegram.messenger.g0.h(colorMatrix, -0.1f);
            imageReceiver.p1 = new ColorMatrixColorFilter(colorMatrix);
            return;
        }
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return;
        }
        boolean z12 = fjVar.j2;
        this.h = z12;
        if (z12) {
            j3 = p5.c.v(j3, "_b3");
        }
        String str = j3;
        imageReceiver.p1 = null;
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        this.w = fj.U0(messageMedia);
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_messageMediaPhoto.photo.sizes, org.telegram.messenger.g0.Z0(false), true, null, true);
            imageReceiver.r0(fc.i(w10, tL_messageMediaPhoto.photo), str, fc.i(org.telegram.messenger.w7.w(tL_messageMediaPhoto.photo.sizes, Math.min(i7, i10) / 100, false, w10, false), tL_messageMediaPhoto.photo), str, null, 0L, null, fjVar, 0);
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
            int i11 = bz.a;
            if (pc.e(1024)) {
                z10 = true;
                this.E = z10;
                if (!z15 || !z14 || (document2 = tL_messageMediaDocument.document) == null) {
                    document = tL_messageMediaDocument.document;
                    if (document == null) {
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.Z0(false), true, null, true);
                        imageReceiver.r0(fc.c(w11, tL_messageMediaDocument.document), str, fc.c(org.telegram.messenger.w7.w(tL_messageMediaDocument.document.thumbs, Math.min(i7, i10), false, w11, false), tL_messageMediaDocument.document), str, null, 0L, null, fjVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(document2.thumbs, org.telegram.messenger.g0.Z0(false), true, null, true);
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(tL_messageMediaDocument.document.thumbs, Math.min(i7, i10), false, w12, false);
                fc b10 = fc.b(tL_messageMediaDocument.document);
                fc c10 = fc.c(w12, tL_messageMediaDocument.document);
                fc c11 = fc.c(w13, tL_messageMediaDocument.document);
                fc fcVar = this.E ? b10 : null;
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
                m10.append(this.E ? "_g" : "");
                imageReceiver.u0(fcVar, m10.toString(), c10, str, c11, str, null, 0L, null, fjVar, 0);
                return;
            }
        }
        z10 = false;
        this.E = z10;
        if (!z15) {
        }
        document = tL_messageMediaDocument.document;
        if (document == null) {
        }
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.J;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.F.downloadProgress = min;
        this.H.p(true, min);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.F.uploadProgress = min;
        this.H.p(true, min);
        b(min < 1.0f ? 3 : this.x ? 6 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
    }
}
