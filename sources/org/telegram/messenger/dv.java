package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class dv extends cv {
    public final TL_iv.pageBlockPhoto q0;
    public final TLRPC.Photo r0;
    public final TLRPC.PhotoSize s0;
    public final TLRPC.TL_photoStrippedSize t0;

    public dv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(vvVar, rect, i10, z10);
        this.q0 = pageblockphoto;
        TLRPC.Photo v = vvVar.v(pageblockphoto.photo_id);
        this.r0 = v;
        if (v != null) {
            this.s0 = b8.w(v.sizes, i0.Z0(false), false, null, false);
            this.t0 = b8.R(v.sizes);
        } else {
            this.s0 = null;
            this.t0 = null;
        }
        TLRPC.PhotoSize photoSize = this.s0;
        int i11 = photoSize != null ? photoSize.w : 100;
        int i12 = photoSize != null ? photoSize.h : 100;
        int i13 = this.c;
        int max = (int) ((i13 / Math.max(1, i11)) * i12);
        Point point = i0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i12)) * i11);
            max = max2;
        }
        this.b0 = i13;
        this.c0 = max;
        l0();
    }

    @Override // org.telegram.messenger.cv
    public final void i0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Photo photo = this.r0;
        if (photo == null || (photoSize = this.s0) == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.t0;
        ic i10 = tL_photoStrippedSize != null ? ic.i(tL_photoStrippedSize, photo) : null;
        vv vvVar = this.a;
        ImageReceiver imageReceiver = this.X;
        if (z10) {
            imageReceiver.u0(null, null, ic.i(photoSize, photo), null, i10, "b1", null, photoSize.size, null, vvVar.b, 1);
        } else {
            imageReceiver.u0(null, null, null, null, i10, "b1", null, photoSize.size, null, vvVar.b, 1);
        }
    }

    @Override // org.telegram.messenger.cv
    public final boolean k0() {
        TLRPC.PhotoSize photoSize = this.s0;
        if (photoSize != null) {
            vv vvVar = this.a;
            b8.G(vvVar.a);
            File K = b8.K(photoSize, null, true, true);
            b8.G(vvVar.a);
            File K2 = b8.K(photoSize, null, false, true);
            if (!K.exists() && (K2 == null || !K2.exists())) {
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
        return b8.r(null, this.s0);
    }

    @Override // org.telegram.messenger.cv
    public final boolean q0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.q0;
        return pageblockphoto != null && pageblockphoto.spoiler;
    }
}
