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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class hu extends xt {
    public static Paint e0;
    public final TL_iv.pageBlockMap X;
    public final ImageReceiver Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public boolean c0;
    public Drawable d0;

    public hu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockMap pageblockmap) {
        super(cvVar, rect, i3);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.X = pageblockmap;
        imageReceiver.A1 = true;
        int i10 = pageblockmap.w;
        i10 = i10 <= 0 ? 100 : i10;
        int i11 = pageblockmap.h;
        int i12 = i11 > 0 ? i11 : 100;
        int i13 = this.c;
        int max = (int) ((i13 / Math.max(1, i10)) * i12);
        Point point = g0.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i12)) * i10);
            max = max2;
        }
        this.Z = i13;
        this.a0 = max;
        float f10 = i13;
        float f11 = max;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        cv cvVar2 = this.a;
        if (pageblockmap.geo == null) {
            return;
        }
        int i14 = cvVar2.a;
        int i15 = hp.s1(i14).n3;
        this.b0 = i15;
        float f12 = g0.p;
        int i16 = (int) (f10 / f12);
        int i17 = (int) (f11 / f12);
        int i18 = pageblockmap.zoom;
        int i19 = i18 <= 0 ? 15 : i18;
        if (i15 == 2) {
            imageReceiver.q0(ac.p(e20.b(pageblockmap.geo, i16, i17, i19, Math.min(2, (int) Math.ceil(f12)))), null, null, null, cvVar2.b, 0);
        } else {
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            imageReceiver.o0(g0.e0(i14, geoPoint.lat, geoPoint._long, i16, i17, true, i19, -1), null, null, null, 0L);
        }
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.a0 + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.Z + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        this.Y.R();
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        Canvas canvas2;
        View view;
        if (e0 == null) {
            e0 = new Paint(1);
        }
        Paint paint = e0;
        int i3 = org.telegram.ui.ActionBar.k6.df;
        cv cvVar = this.a;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D));
        boolean R = R();
        boolean D = cvVar.D();
        int i10 = 0;
        int i11 = (R || D) ? 0 : cvVar.S;
        if (!R && !D) {
            i10 = cvVar.T;
        }
        ImageReceiver imageReceiver = this.Y;
        int i12 = this.a0;
        int i13 = this.Z;
        if (D) {
            RectF rectF = g0.P;
            rectF.set(0.0f, 0.0f, i13, i12);
            canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), e0);
            imageReceiver.J0(g0.L(12.0f));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(-i11, 0.0f, i13 + i10, i12, e0);
        }
        Drawable drawable = org.telegram.ui.ActionBar.k6.S4[cvVar.E() ? 1 : 0];
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i14 = (i13 - intrinsicWidth) / 2;
            int i15 = (i12 - intrinsicHeight) / 2;
            drawable.setBounds(i14, i15, intrinsicWidth + i14, intrinsicHeight + i15);
            drawable.draw(canvas2);
        }
        imageReceiver.y0(-i11, 0.0f, i11 + i13 + i10, i12);
        imageReceiver.h(canvas2, null);
        if (this.b0 == 2 && imageReceiver.L()) {
            if (this.d0 == null && (view = this.W) != null) {
                this.d0 = view.getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            if (this.d0 != null) {
                int intrinsicWidth2 = (int) (r15.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight2 = (int) (this.d0.getIntrinsicHeight() * 0.8f);
                int i16 = (i13 - intrinsicWidth2) / 2;
                int i17 = (i12 / 2) - intrinsicHeight2;
                this.d0.setAlpha((int) (imageReceiver.i1 * 255.0f));
                this.d0.setBounds(i16, i17, intrinsicWidth2 + i16, intrinsicHeight2 + i17);
                this.d0.draw(canvas2);
            }
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.b;
        float f10 = x10 - rect.left;
        float y9 = motionEvent.getY() - rect.top;
        boolean z10 = f10 >= 0.0f && f10 <= ((float) this.Z) && y9 >= 0.0f && y9 <= ((float) this.a0);
        if (actionMasked == 0) {
            if (z10) {
                this.c0 = true;
                return true;
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.c0 = false;
                }
                return this.c0;
            }
            if (this.c0) {
                this.c0 = false;
                if (z10) {
                    TL_iv.pageBlockMap pageblockmap = this.X;
                    if (pageblockmap.geo != null && (view = this.W) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            this.W.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return true;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
