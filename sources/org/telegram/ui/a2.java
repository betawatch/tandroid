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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final t70 a;
    public final h4 b;
    public Drawable c;
    public c3 d;
    public c3 e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public TL_iv.pageBlockMap x;

    public a2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.a = t70Var;
        this.b = h4Var;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.d;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.d;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.d;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.j6.S1;
        int i10 = org.telegram.ui.ActionBar.j6.pe;
        t70 t70Var = this.a;
        ((j4) t70Var).getClass();
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
            int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            j4.v(t70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            j4.v(t70Var, canvas, this, i11);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, t70Var, this.x, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.Map));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
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
                i14 = org.telegram.messenger.em.v(18.0f, i13, size);
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
            float f7 = i13;
            float dp2 = (this.h || this.x.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
            float f10 = i14;
            float f11 = i15;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.setImageCoords(f7, dp2, f10, f11);
            int i17 = ((j4) this.a).X;
            TLRPC.GeoPoint geoPoint = this.x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f12 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i17, d, d10, (int) (f10 / f12), (int) (f11 / f12), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.x.geo;
            float f13 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f10 / f13), (int) (f11 / f13), 15, Math.min(2, (int) Math.ceil(f13)));
            int i18 = MessagesController.getInstance(i17).mapProvider;
            this.w = i18;
            h4 h4Var = this.b;
            if (i18 == 2) {
                if (createWithGeoPoint != null) {
                    imageReceiver.setImage(ImageLocation.getForWebFile(createWithGeoPoint), null, null, null, h4Var != null ? h4Var.E : null, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.x;
            c3 q6 = j4.q(this.a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.b);
            this.d = q6;
            if (q6 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.s = height;
                i15 = org.telegram.messenger.a2.C(4.0f, height, i15);
                c3 c3Var = this.d;
                c3Var.s = this.n;
                c3Var.v = this.r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.x;
            c3 p5 = j4.p(this.a, this, null, pageblockmap5.caption.credit, dp, 0, pageblockmap5, (h4Var == null || !h4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.uw0.a(), 0, this.b);
            this.e = p5;
            if (p5 != null) {
                i19 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = this.e;
                c3Var2.s = this.n;
                c3Var2.v = this.r + this.s;
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
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.isInsideImage(x10, y3)) {
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
            if (!j4.l(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!j4.l(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
