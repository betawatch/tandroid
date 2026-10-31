package org.telegram.messenger;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class av extends qu {
    public static Paint d0;
    public final TL_iv.pageBlockMap W;
    public final ImageReceiver X;
    public final int Y;
    public final int Z;
    public final int a0;
    public boolean b0;
    public Drawable c0;

    public av(vv vvVar, Rect rect, int i10, TL_iv.pageBlockMap pageblockmap) {
        super(vvVar, rect, i10);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        this.W = pageblockmap;
        imageReceiver.z1 = true;
        int i11 = pageblockmap.w;
        i11 = i11 <= 0 ? 100 : i11;
        int i12 = pageblockmap.h;
        int i13 = i12 > 0 ? i12 : 100;
        int i14 = this.c;
        int max = (int) ((i14 / Math.max(1, i11)) * i13);
        Point point = i0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i14 = (int) ((max2 / Math.max(1, i13)) * i11);
            max = max2;
        }
        this.Y = i14;
        this.Z = max;
        float f7 = i14;
        float f10 = max;
        imageReceiver.y0(0.0f, 0.0f, f7, f10);
        vv vvVar2 = this.a;
        if (pageblockmap.geo == null) {
            return;
        }
        int i15 = vvVar2.a;
        int i16 = vp.r1(i15).m3;
        this.a0 = i16;
        float f11 = i0.p;
        int i17 = (int) (f7 / f11);
        int i18 = (int) (f10 / f11);
        int i19 = pageblockmap.zoom;
        int i20 = i19 <= 0 ? 15 : i19;
        if (i16 == 2) {
            imageReceiver.q0(ic.p(b30.b(pageblockmap.geo, i17, i18, i20, Math.min(2, (int) Math.ceil(f11)))), null, null, null, vvVar2.b, 0);
        } else {
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            imageReceiver.o0(i0.e0(i15, geoPoint.lat, geoPoint._long, i17, i18, true, i20, -1), null, null, null, 0L);
        }
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.Y + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.X.R();
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        Canvas canvas2;
        View view;
        if (d0 == null) {
            d0 = new Paint(1);
        }
        Paint paint = d0;
        int i10 = org.telegram.ui.ActionBar.t6.df;
        vv vvVar = this.a;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D));
        boolean Q = Q();
        boolean D = vvVar.D();
        int i11 = 0;
        int i12 = (Q || D) ? 0 : vvVar.S;
        if (!Q && !D) {
            i11 = vvVar.T;
        }
        ImageReceiver imageReceiver = this.X;
        int i13 = this.Z;
        int i14 = this.Y;
        if (D) {
            RectF rectF = i0.P;
            rectF.set(0.0f, 0.0f, i14, i13);
            canvas.drawRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), d0);
            imageReceiver.J0(i0.L(12.0f));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(-i12, 0.0f, i14 + i11, i13, d0);
        }
        Drawable drawable = org.telegram.ui.ActionBar.t6.S4[vvVar.E() ? 1 : 0];
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i15 = (i14 - intrinsicWidth) / 2;
            int i16 = (i13 - intrinsicHeight) / 2;
            drawable.setBounds(i15, i16, intrinsicWidth + i15, intrinsicHeight + i16);
            drawable.draw(canvas2);
        }
        imageReceiver.y0(-i12, 0.0f, i12 + i14 + i11, i13);
        imageReceiver.h(canvas2, null);
        if (this.a0 == 2 && imageReceiver.L()) {
            if (this.c0 == null && (view = this.V) != null) {
                this.c0 = view.getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            if (this.c0 != null) {
                int intrinsicWidth2 = (int) (r15.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight2 = (int) (this.c0.getIntrinsicHeight() * 0.8f);
                int i17 = (i14 - intrinsicWidth2) / 2;
                int i18 = (i13 / 2) - intrinsicHeight2;
                this.c0.setAlpha((int) (imageReceiver.h1 * 255.0f));
                this.c0.setBounds(i17, i18, intrinsicWidth2 + i17, intrinsicHeight2 + i18);
                this.c0.draw(canvas2);
            }
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.b;
        float f7 = x10 - rect.left;
        float y3 = motionEvent.getY() - rect.top;
        boolean z10 = f7 >= 0.0f && f7 <= ((float) this.Y) && y3 >= 0.0f && y3 <= ((float) this.Z);
        if (actionMasked == 0) {
            if (z10) {
                this.b0 = true;
                return true;
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.b0 = false;
                }
                return this.b0;
            }
            if (this.b0) {
                this.b0 = false;
                if (z10) {
                    TL_iv.pageBlockMap pageblockmap = this.W;
                    if (pageblockmap.geo != null && (view = this.V) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            this.V.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return true;
                        } catch (Exception e) {
                            f8.g(e, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
