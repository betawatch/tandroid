package org.telegram.ui.Cells;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k4 implements org.telegram.messenger.x5 {
    public boolean D;
    public TLRPC.MessageExtendedMedia E;
    public String F;
    public final RadialProgress2 G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public my0 L;
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

    public k4(q1 q1Var, ij ijVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z9, int i7, int i10) {
        new RectF();
        new Path();
        this.H = 4;
        this.J = 0;
        this.K = 0;
        this.e = q1Var;
        this.x = z9;
        this.y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.y = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && ij.K4(messageMedia.document);
            this.J = (int) Math.max(1L, Math.round(ij.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.y = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.J = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.y) {
            int i11 = this.J;
            this.K = i11;
            this.L = new my0(org.telegram.messenger.g0.g0(i11, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f = imageReceiver;
        imageReceiver.o1 = null;
        this.n = i7;
        this.r = i10;
        this.I = org.telegram.messenger.z5.q(q1Var.Z5).k();
        c(messageExtendedMedia, ijVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(q1Var, q1Var.getResourcesProvider());
        this.G = radialProgress2;
        int a10 = a();
        this.H = a10;
        radialProgress2.setIcon(a10, false, false);
    }

    public final int a() {
        return (!this.y || this.D) ? 4 : 0;
    }

    public final void b(int i7) {
        if (i7 != this.H) {
            this.H = i7;
            this.G.setIcon(i7, true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, ij ijVar) {
        boolean z9;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (this.E == messageExtendedMedia) {
            return;
        }
        this.E = messageExtendedMedia;
        this.D = false;
        int i7 = this.n;
        int i10 = this.r;
        String j3 = com.google.android.recaptcha.internal.a.j(i7, "_", i10);
        boolean z10 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z10) {
            this.h = true;
            this.w = null;
            imageReceiver.q0(hc.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, ijVar.k), rf.b.r(j3, "_b2"), null, null, ijVar, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            org.telegram.messenger.g0.h(colorMatrix, -0.1f);
            imageReceiver.o1 = new ColorMatrixColorFilter(colorMatrix);
            return;
        }
        if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
            return;
        }
        boolean z11 = ijVar.h2;
        this.h = z11;
        if (z11) {
            j3 = rf.b.r(j3, "_b3");
        }
        String str = j3;
        imageReceiver.o1 = null;
        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
        this.w = ij.U0(messageMedia);
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_messageMediaPhoto.photo.sizes, org.telegram.messenger.g0.Z0(false), true, null, true);
            imageReceiver.r0(hc.i(w10, tL_messageMediaPhoto.photo), str, hc.i(org.telegram.messenger.w7.w(tL_messageMediaPhoto.photo.sizes, Math.min(i7, i10) / 100, false, w10, false), tL_messageMediaPhoto.photo), str, null, 0L, null, ijVar, 0);
            return;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return;
        }
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
        boolean z12 = this.h;
        boolean z13 = this.y;
        boolean z14 = this.x;
        if (!z12 && !z14 && z13) {
            int i11 = iz.a;
            if (sc.e(1024)) {
                z9 = true;
                this.D = z9;
                if (!z14 || !z13 || (document2 = tL_messageMediaDocument.document) == null) {
                    document = tL_messageMediaDocument.document;
                    if (document == null) {
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.Z0(false), true, null, true);
                        imageReceiver.r0(hc.c(w11, tL_messageMediaDocument.document), str, hc.c(org.telegram.messenger.w7.w(tL_messageMediaDocument.document.thumbs, Math.min(i7, i10), false, w11, false), tL_messageMediaDocument.document), str, null, 0L, null, ijVar, 0);
                        return;
                    }
                    return;
                }
                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(document2.thumbs, org.telegram.messenger.g0.Z0(false), true, null, true);
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(tL_messageMediaDocument.document.thumbs, Math.min(i7, i10), false, w12, false);
                hc b10 = hc.b(tL_messageMediaDocument.document);
                hc c10 = hc.c(w12, tL_messageMediaDocument.document);
                hc c11 = hc.c(w13, tL_messageMediaDocument.document);
                hc hcVar = this.D ? b10 : null;
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
                m10.append(this.D ? "_g" : "");
                imageReceiver.u0(hcVar, m10.toString(), c10, str, c11, str, null, 0L, null, ijVar, 0);
                return;
            }
        }
        z9 = false;
        this.D = z9;
        if (!z14) {
        }
        document = tL_messageMediaDocument.document;
        if (document == null) {
        }
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.I;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.E.downloadProgress = min;
        this.G.p(true, min);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.E.uploadProgress = min;
        this.G.p(true, min);
        b(min < 1.0f ? 3 : this.x ? 6 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
    }
}
