package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final n70 a;
    public final j4 b;
    public Drawable c;
    public d3 d;
    public d3 e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public TL_iv.pageBlockMap x;

    public a2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.a = n70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.d;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.d;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.j6.S1;
        int i10 = org.telegram.ui.ActionBar.j6.pe;
        n70 n70Var = this.a;
        ((l4) n70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.j6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.w == 2 && imageReceiver.hasNotThumb()) {
            if (this.c == null) {
                this.c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.c.getIntrinsicHeight() * 0.8f);
            int x10 = (int) e2.c.x(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.c.setBounds(x10, imageHeight, intrinsicWidth2 + x10, intrinsicHeight + imageHeight);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            l4.v(n70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            l4.v(n70Var, canvas, this, i11);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, n70Var, this.x, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.Map));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i13 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r0 * 14);
                this.n = i13;
                i14 = b.t(18.0f, i13, size);
                dp = i14;
            } else {
                this.n = AndroidUtilities.dp(18.0f);
                i13 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i14 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.x;
            int i16 = (int) ((i14 / pageblockmap2.w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i16 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.x;
                i14 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i13 += ((size - i13) - i14) / 2;
                i15 = max;
            } else {
                i15 = i16;
            }
            float f10 = i13;
            float dp2 = (this.h || this.x.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
            float f11 = i14;
            float f12 = i15;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.setImageCoords(f10, dp2, f11, f12);
            int i17 = ((l4) this.a).U;
            TLRPC.GeoPoint geoPoint = this.x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i17, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i18 = MessagesController.getInstance(i17).mapProvider;
            this.w = i18;
            j4 j4Var = this.b;
            if (i18 == 2) {
                if (createWithGeoPoint != null) {
                    imageReceiver.setImage(ImageLocation.getForWebFile(createWithGeoPoint), null, null, null, j4Var != null ? j4Var.B : null, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.x;
            d3 q10 = l4.q(this.a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.b);
            this.d = q10;
            if (q10 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.s = height;
                i15 = org.telegram.messenger.y3.C(4.0f, height, i15);
                d3 d3Var = this.d;
                d3Var.s = this.n;
                d3Var.v = this.r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.x;
            d3 p10 = l4.p(this.a, this, null, pageblockmap5.caption.credit, dp, 0, pageblockmap5, (j4Var == null || !j4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
            this.e = p10;
            if (p10 != null) {
                i19 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = this.e;
                d3Var2.s = this.n;
                d3Var2.v = this.r + this.s;
            }
            if (!this.h && this.x.level <= 0) {
                i19 += AndroidUtilities.dp(8.0f);
            }
            i12 = AndroidUtilities.dp(8.0f) + i19;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.isInsideImage(x10, y10)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!l4.l(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!l4.l(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
