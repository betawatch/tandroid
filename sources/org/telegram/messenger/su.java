package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class su extends ru {
    public final TL_iv.pageBlockPhoto q0;
    public final TLRPC.Photo r0;
    public final TLRPC.PhotoSize s0;
    public final TLRPC.TL_photoStrippedSize t0;

    public su(kv kvVar, Rect rect, int i7, TL_iv.pageBlockPhoto pageblockphoto, boolean z9) {
        super(kvVar, rect, i7, z9);
        this.q0 = pageblockphoto;
        TLRPC.Photo v = kvVar.v(pageblockphoto.photo_id);
        this.r0 = v;
        if (v != null) {
            this.s0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.t0 = w7.Q(v.sizes);
        } else {
            this.s0 = null;
            this.t0 = null;
        }
        TLRPC.PhotoSize photoSize = this.s0;
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
        this.b0 = i12;
        this.c0 = max;
        m0();
    }

    @Override // org.telegram.messenger.ru
    public final void j0(boolean z9) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Photo photo = this.r0;
        if (photo == null || (photoSize = this.s0) == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.t0;
        hc i7 = tL_photoStrippedSize != null ? hc.i(tL_photoStrippedSize, photo) : null;
        kv kvVar = this.a;
        ImageReceiver imageReceiver = this.X;
        if (z9) {
            imageReceiver.u0(null, null, hc.i(photoSize, photo), null, i7, "b1", null, photoSize.size, null, kvVar.b, 1);
        } else {
            imageReceiver.u0(null, null, null, null, i7, "b1", null, photoSize.size, null, kvVar.b, 1);
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.s0;
        if (photoSize != null) {
            kv kvVar = this.a;
            w7.G(kvVar.a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(kvVar.a);
            File J2 = w7.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
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
        return w7.r(null, this.s0);
    }

    @Override // org.telegram.messenger.ru
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.q0;
        return pageblockphoto != null && pageblockphoto.spoiler;
    }
}
