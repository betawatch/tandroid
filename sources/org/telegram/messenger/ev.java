package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class ev extends ru {
    public final TL_iv.pageBlockVideo q0;
    public final TLRPC.Document r0;
    public final TLRPC.PhotoSize s0;
    public final TLRPC.TL_photoStrippedSize t0;
    public final boolean u0;
    public final boolean v0;

    public ev(kv kvVar, Rect rect, int i7, TL_iv.pageBlockVideo pageblockvideo, boolean z9) {
        super(kvVar, rect, i7, z9);
        int i10;
        int i11;
        this.q0 = pageblockvideo;
        TLRPC.Document s5 = kvVar.s(pageblockvideo.video_id);
        this.r0 = s5;
        boolean L4 = ij.L4(s5);
        this.v0 = L4;
        int i12 = 0;
        this.u0 = L4 || ij.t3(s5, false);
        if (s5 != null) {
            this.s0 = w7.w(s5.thumbs, qs.r5, false, null, true);
            this.t0 = w7.Q(s5.thumbs);
        } else {
            this.s0 = null;
            this.t0 = null;
        }
        if (s5 != null) {
            while (true) {
                if (i12 >= this.r0.attributes.size()) {
                    i10 = 100;
                    i11 = 100;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.r0.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i11 = documentAttribute.w;
                    i10 = documentAttribute.h;
                    break;
                }
                i12++;
            }
            if (i11 <= 0 || i10 <= 0) {
                TLRPC.PhotoSize photoSize = this.s0;
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
        this.b0 = i13;
        this.c0 = max;
        m0();
    }

    @Override // org.telegram.messenger.ru
    public final boolean i0() {
        if (this.v0) {
            int i7 = iz.a;
            return rc.e(1024);
        }
        int i10 = iz.a;
        return rc.e(2048);
    }

    @Override // org.telegram.messenger.ru
    public final void j0(boolean z9) {
        TLRPC.Document document = this.r0;
        if (document == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.t0;
        hc c10 = tL_photoStrippedSize != null ? hc.c(tL_photoStrippedSize, document) : null;
        TLRPC.PhotoSize photoSize = this.s0;
        hc c11 = photoSize != null ? hc.c(photoSize, document) : null;
        kv kvVar = this.a;
        ImageReceiver imageReceiver = this.X;
        if (!z9 || !this.u0 || (!i0() && !this.l0)) {
            imageReceiver.u0(null, null, c11, null, c10, "b1", null, document.size, "mp4", kvVar.b, 1);
            return;
        }
        imageReceiver.t0 = true;
        imageReceiver.W(1);
        imageReceiver.u0(hc.b(document), "g", c11, null, c10, "b1", null, document.size, "mp4", kvVar.b, 1);
    }

    @Override // org.telegram.messenger.ru
    public final boolean k0() {
        TLRPC.Document document = this.r0;
        if (document == null) {
            return false;
        }
        if (this.u0) {
            return i0() && z5.q(this.a.a).c(4, document.size);
        }
        return true;
    }

    @Override // org.telegram.messenger.ru
    public final boolean l0() {
        TLRPC.Document document = this.r0;
        if (document != null) {
            kv kvVar = this.a;
            w7.G(kvVar.a);
            File I = w7.I(document);
            w7.G(kvVar.a);
            File J = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.ru
    public final TL_iv.PageBlock n0() {
        return this.q0;
    }

    @Override // org.telegram.messenger.ru
    public final String o0() {
        return w7.r(null, this.r0);
    }

    @Override // org.telegram.messenger.ru
    public final boolean p0() {
        return this.u0;
    }

    @Override // org.telegram.messenger.ru
    public final boolean q0() {
        return this.v0;
    }

    @Override // org.telegram.messenger.ru
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.q0;
        return pageblockvideo != null && pageblockvideo.spoiler;
    }
}
