// default package

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mh9 extends zg9 {
    public final TL_iv.pageBlockVideo r0;
    public final TLRPC.Document s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;
    public final boolean v0;
    public final boolean w0;

    public mh9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockVideo pageblockvideo, boolean z) {
        super(rh9Var, rect, i, z);
        int i2;
        int i3;
        int i4;
        this.r0 = pageblockvideo;
        TLRPC.Document s = rh9Var.s(pageblockvideo.video_id);
        this.s0 = s;
        boolean J4 = k27.J4(s);
        this.w0 = J4;
        int i5 = 0;
        this.v0 = J4 || k27.s3(s, false);
        int i6 = 100;
        if (s != null) {
            this.t0 = ba4.w(s.thumbs, kk7.q5, false, null, true);
            this.u0 = ba4.Q(s.thumbs);
            while (true) {
                if (i5 >= this.s0.attributes.size()) {
                    i2 = 100;
                    i3 = 100;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.s0.attributes.get(i5);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i3 = documentAttribute.w;
                    i2 = documentAttribute.h;
                    break;
                }
                i5++;
            }
            if (i3 <= 0 || i2 <= 0) {
                TLRPC.PhotoSize photoSize = this.t0;
                if (photoSize != null) {
                    int i7 = photoSize.w;
                    i6 = photoSize.h;
                    i4 = i7;
                } else {
                    i4 = 100;
                }
                int i8 = i6;
                i6 = i4;
                i2 = i8;
            } else {
                i6 = i3;
            }
        } else {
            this.t0 = null;
            this.u0 = null;
            i2 = 100;
        }
        int i9 = this.c;
        int max = (int) ((i9 / Math.max(1, i6)) * i2);
        Point point = gl.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i9 = (int) ((max2 / Math.max(1, i2)) * i6);
            max = max2;
        }
        this.c0 = i9;
        this.d0 = max;
        m0();
    }

    @Override // zg9
    public final boolean i0() {
        if (this.w0) {
            boolean z = gba.a;
            return e66.e(1024);
        }
        boolean z2 = gba.a;
        return e66.e(2048);
    }

    @Override // zg9
    public final void j0(boolean z) {
        TLRPC.Document document = this.s0;
        if (document == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
        gl5 c = tL_photoStrippedSize != null ? gl5.c(tL_photoStrippedSize, document) : null;
        TLRPC.PhotoSize photoSize = this.t0;
        gl5 c2 = photoSize != null ? gl5.c(photoSize, document) : null;
        ImageReceiver imageReceiver = this.Y;
        rh9 rh9Var = this.a;
        if (!z || !this.v0 || (!i0() && !this.m0)) {
            imageReceiver.Y(null, null, c2, null, c, "b1", null, document.size, "mp4", rh9Var.b, 1);
            return;
        }
        imageReceiver.u0 = true;
        imageReceiver.M(1);
        imageReceiver.Y(gl5.b(document), "g", c2, null, c, "b1", null, document.size, "mp4", rh9Var.b, 1);
    }

    @Override // zg9
    public final boolean k0() {
        TLRPC.Document document = this.s0;
        if (document == null) {
            return false;
        }
        if (this.v0) {
            return i0() && up3.q(this.a.a).c(4, document.size);
        }
        return true;
    }

    @Override // zg9
    public final boolean l0() {
        TLRPC.Document document = this.s0;
        if (document != null) {
            rh9 rh9Var = this.a;
            ba4.G(rh9Var.a);
            File I = ba4.I(document);
            ba4.G(rh9Var.a);
            File J = ba4.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override // zg9
    public final TL_iv.PageBlock n0() {
        return this.r0;
    }

    @Override // zg9
    public final String o0() {
        return ba4.r(null, this.s0);
    }

    @Override // zg9
    public final boolean p0() {
        return this.v0;
    }

    @Override // zg9
    public final boolean q0() {
        return this.w0;
    }

    @Override // zg9
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.r0;
        return pageblockvideo != null && pageblockvideo.spoiler;
    }
}
