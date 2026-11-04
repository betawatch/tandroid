package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class wu extends ju {
    public final TL_iv.pageBlockVideo r0;
    public final TLRPC.Document s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;
    public final boolean v0;
    public final boolean w0;

    public wu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(cvVar, rect, i3, z10);
        int i10;
        int i11;
        this.r0 = pageblockvideo;
        TLRPC.Document s6 = cvVar.s(pageblockvideo.video_id);
        this.s0 = s6;
        boolean L4 = zi.L4(s6);
        this.w0 = L4;
        int i12 = 0;
        this.v0 = L4 || zi.t3(s6, false);
        if (s6 != null) {
            this.t0 = w7.w(s6.thumbs, hs.r5, false, null, true);
            this.u0 = w7.R(s6.thumbs);
        } else {
            this.t0 = null;
            this.u0 = null;
        }
        if (s6 != null) {
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

    @Override // org.telegram.messenger.ju
    public final boolean i0() {
        if (this.w0) {
            int i3 = az.a;
            return lc.e(1024);
        }
        int i10 = az.a;
        return lc.e(2048);
    }

    @Override // org.telegram.messenger.ju
    public final void j0(boolean z10) {
        TLRPC.Document document = this.s0;
        if (document == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
        ac c2 = tL_photoStrippedSize != null ? ac.c(tL_photoStrippedSize, document) : null;
        TLRPC.PhotoSize photoSize = this.t0;
        ac c10 = photoSize != null ? ac.c(photoSize, document) : null;
        cv cvVar = this.a;
        ImageReceiver imageReceiver = this.Y;
        if (!z10 || !this.v0 || (!i0() && !this.m0)) {
            imageReceiver.u0(null, null, c10, null, c2, "b1", null, document.size, "mp4", cvVar.b, 1);
            return;
        }
        imageReceiver.u0 = true;
        imageReceiver.W(1);
        imageReceiver.u0(ac.b(document), "g", c10, null, c2, "b1", null, document.size, "mp4", cvVar.b, 1);
    }

    @Override // org.telegram.messenger.ju
    public final boolean k0() {
        TLRPC.Document document = this.s0;
        if (document == null) {
            return false;
        }
        if (this.v0) {
            return i0() && z5.q(this.a.a).c(4, document.size);
        }
        return true;
    }

    @Override // org.telegram.messenger.ju
    public final boolean l0() {
        TLRPC.Document document = this.s0;
        if (document != null) {
            cv cvVar = this.a;
            w7.G(cvVar.a);
            File I = w7.I(document);
            w7.G(cvVar.a);
            File K = w7.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K == null || !K.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.ju
    public final TL_iv.PageBlock n0() {
        return this.r0;
    }

    @Override // org.telegram.messenger.ju
    public final String o0() {
        return w7.r(null, this.s0);
    }

    @Override // org.telegram.messenger.ju
    public final boolean p0() {
        return this.v0;
    }

    @Override // org.telegram.messenger.ju
    public final boolean q0() {
        return this.w0;
    }

    @Override // org.telegram.messenger.ju
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.r0;
        return pageblockvideo != null && pageblockvideo.spoiler;
    }
}
