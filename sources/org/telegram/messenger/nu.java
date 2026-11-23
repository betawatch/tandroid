package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class nu extends mu {
    public final TL_iv.pageBlockPhoto r0;
    public final TLRPC.Photo s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;

    public nu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(fvVar, rect, i7, z10);
        this.r0 = pageblockphoto;
        TLRPC.Photo v = fvVar.v(pageblockphoto.photo_id);
        this.s0 = v;
        if (v != null) {
            this.t0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.u0 = w7.Q(v.sizes);
        } else {
            this.t0 = null;
            this.u0 = null;
        }
        TLRPC.PhotoSize photoSize = this.t0;
        int i10 = photoSize != null ? photoSize.w : 100;
        int i11 = photoSize != null ? photoSize.h : 100;
        int i12 = this.c;
        int max = (int) ((i12 / Math.max(1, i10)) * i11);
        Point point = g0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i12 = (int) ((max2 / Math.max(1, i11)) * i10);
            max = max2;
        }
        this.c0 = i12;
        this.d0 = max;
        m0();
    }

    @Override // org.telegram.messenger.mu
    public final void j0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Photo photo = this.s0;
        if (photo == null || (photoSize = this.t0) == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
        gc i7 = tL_photoStrippedSize != null ? gc.i(tL_photoStrippedSize, photo) : null;
        fv fvVar = this.a;
        ImageReceiver imageReceiver = this.Y;
        if (z10) {
            imageReceiver.u0(null, null, gc.i(photoSize, photo), null, i7, "b1", null, photoSize.size, null, fvVar.b, 1);
        } else {
            imageReceiver.u0(null, null, null, null, i7, "b1", null, photoSize.size, null, fvVar.b, 1);
        }
    }

    @Override // org.telegram.messenger.mu
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.t0;
        if (photoSize != null) {
            fv fvVar = this.a;
            w7.G(fvVar.a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(fvVar.a);
            File J2 = w7.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
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
        return w7.r(null, this.t0);
    }

    @Override // org.telegram.messenger.mu
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.r0;
        return pageblockphoto != null && pageblockphoto.spoiler;
    }
}
