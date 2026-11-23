package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class zu extends mu {
    public final TL_iv.pageBlockVideo r0;
    public final TLRPC.Document s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;
    public final boolean v0;
    public final boolean w0;

    public zu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(fvVar, rect, i7, z10);
        int i10;
        int i11;
        this.r0 = pageblockvideo;
        TLRPC.Document s5 = fvVar.s(pageblockvideo.video_id);
        this.s0 = s5;
        boolean K4 = gj.K4(s5);
        this.w0 = K4;
        int i12 = 0;
        this.v0 = K4 || gj.s3(s5, false);
        if (s5 != null) {
            this.t0 = w7.w(s5.thumbs, ls.r5, false, null, true);
            this.u0 = w7.Q(s5.thumbs);
        } else {
            this.t0 = null;
            this.u0 = null;
        }
        if (s5 != null) {
            while (true) {
                if (i12 >= this.s0.attributes.size()) {
                    i10 = 100;
                    i11 = 100;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.s0.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i11 = documentAttribute.w;
                    i10 = documentAttribute.h;
                    break;
                }
                i12++;
            }
            if (i11 <= 0 || i10 <= 0) {
                TLRPC.PhotoSize photoSize = this.t0;
                i11 = photoSize != null ? photoSize.w : 100;
                i10 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i11;
        } else {
            i10 = 100;
        }
        int i13 = this.c;
        int max = (int) ((i13 / Math.max(1, r4)) * i10);
        Point point = g0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i10)) * r4);
            max = max2;
        }
        this.c0 = i13;
        this.d0 = max;
        m0();
    }

    @Override // org.telegram.messenger.mu
    public final boolean i0() {
        if (this.w0) {
            int i7 = cz.a;
            return qc.e(1024);
        }
        int i10 = cz.a;
        return qc.e(2048);
    }

    @Override // org.telegram.messenger.mu
    public final void j0(boolean z10) {
        TLRPC.Document document = this.s0;
        if (document == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
        gc c10 = tL_photoStrippedSize != null ? gc.c(tL_photoStrippedSize, document) : null;
        TLRPC.PhotoSize photoSize = this.t0;
        gc c11 = photoSize != null ? gc.c(photoSize, document) : null;
        fv fvVar = this.a;
        ImageReceiver imageReceiver = this.Y;
        if (!z10 || !this.v0 || (!i0() && !this.m0)) {
            imageReceiver.u0(null, null, c11, null, c10, "b1", null, document.size, "mp4", fvVar.b, 1);
            return;
        }
        imageReceiver.u0 = true;
        imageReceiver.W(1);
        imageReceiver.u0(gc.b(document), "g", c11, null, c10, "b1", null, document.size, "mp4", fvVar.b, 1);
    }

    @Override // org.telegram.messenger.mu
    public final boolean k0() {
        TLRPC.Document document = this.s0;
        if (document == null) {
            return false;
        }
        if (this.v0) {
            return i0() && a6.q(this.a.a).c(4, document.size);
        }
        return true;
    }

    @Override // org.telegram.messenger.mu
    public final boolean l0() {
        TLRPC.Document document = this.s0;
        if (document != null) {
            fv fvVar = this.a;
            w7.G(fvVar.a);
            File I = w7.I(document);
            w7.G(fvVar.a);
            File J = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.mu
    public final TL_iv.PageBlock n0() {
        return this.r0;
    }

    @Override // org.telegram.messenger.mu
    public final String o0() {
        return w7.r(null, this.s0);
    }

    @Override // org.telegram.messenger.mu
    public final boolean p0() {
        return this.v0;
    }

    @Override // org.telegram.messenger.mu
    public final boolean q0() {
        return this.w0;
    }

    @Override // org.telegram.messenger.mu
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.r0;
        return pageblockvideo != null && pageblockvideo.spoiler;
    }
}
