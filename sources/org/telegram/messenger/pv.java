package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class pv extends cv {
    public final TL_iv.pageBlockVideo q0;
    public final TLRPC.Document r0;
    public final TLRPC.PhotoSize s0;
    public final TLRPC.TL_photoStrippedSize t0;
    public final boolean u0;
    public final boolean v0;

    public pv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(vvVar, rect, i10, z10);
        int i11;
        int i12;
        this.q0 = pageblockvideo;
        TLRPC.Document s10 = vvVar.s(pageblockvideo.video_id);
        this.r0 = s10;
        boolean K4 = jj.K4(s10);
        this.v0 = K4;
        int i13 = 0;
        this.u0 = K4 || jj.s3(s10, false);
        if (s10 != null) {
            this.s0 = b8.w(s10.thumbs, zs.r5, false, null, true);
            this.t0 = b8.R(s10.thumbs);
        } else {
            this.s0 = null;
            this.t0 = null;
        }
        if (s10 != null) {
            while (true) {
                if (i13 >= this.r0.attributes.size()) {
                    i11 = 100;
                    i12 = 100;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.r0.attributes.get(i13);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i12 = documentAttribute.w;
                    i11 = documentAttribute.h;
                    break;
                }
                i13++;
            }
            if (i12 <= 0 || i11 <= 0) {
                TLRPC.PhotoSize photoSize = this.s0;
                i12 = photoSize != null ? photoSize.w : 100;
                i11 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i12;
        } else {
            i11 = 100;
        }
        int i14 = this.c;
        int max = (int) ((i14 / Math.max(1, r4)) * i11);
        Point point = i0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i14 = (int) ((max2 / Math.max(1, i11)) * r4);
            max = max2;
        }
        this.b0 = i14;
        this.c0 = max;
        l0();
    }

    @Override // org.telegram.messenger.cv
    public final boolean h0() {
        if (this.v0) {
            int i10 = tz.a;
            return sc.e(1024);
        }
        int i11 = tz.a;
        return sc.e(2048);
    }

    @Override // org.telegram.messenger.cv
    public final void i0(boolean z10) {
        TLRPC.Document document = this.r0;
        if (document == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.t0;
        ic c10 = tL_photoStrippedSize != null ? ic.c(tL_photoStrippedSize, document) : null;
        TLRPC.PhotoSize photoSize = this.s0;
        ic c11 = photoSize != null ? ic.c(photoSize, document) : null;
        vv vvVar = this.a;
        ImageReceiver imageReceiver = this.X;
        if (!z10 || !this.u0 || (!h0() && !this.l0)) {
            imageReceiver.u0(null, null, c11, null, c10, "b1", null, document.size, "mp4", vvVar.b, 1);
            return;
        }
        imageReceiver.t0 = true;
        imageReceiver.W(1);
        imageReceiver.u0(ic.b(document), "g", c11, null, c10, "b1", null, document.size, "mp4", vvVar.b, 1);
    }

    @Override // org.telegram.messenger.cv
    public final boolean j0() {
        TLRPC.Document document = this.r0;
        if (document == null) {
            return false;
        }
        if (this.u0) {
            return h0() && b6.q(this.a.a).c(4, document.size);
        }
        return true;
    }

    @Override // org.telegram.messenger.cv
    public final boolean k0() {
        TLRPC.Document document = this.r0;
        if (document != null) {
            vv vvVar = this.a;
            b8.G(vvVar.a);
            File I = b8.I(document);
            b8.G(vvVar.a);
            File K = b8.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K == null || !K.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.cv
    public final TL_iv.PageBlock m0() {
        return this.q0;
    }

    @Override // org.telegram.messenger.cv
    public final String n0() {
        return b8.r(null, this.r0);
    }

    @Override // org.telegram.messenger.cv
    public final boolean o0() {
        return this.u0;
    }

    @Override // org.telegram.messenger.cv
    public final boolean p0() {
        return this.v0;
    }

    @Override // org.telegram.messenger.cv
    public final boolean q0() {
        TL_iv.pageBlockVideo pageblockvideo = this.q0;
        return pageblockvideo != null && pageblockvideo.spoiler;
    }
}
