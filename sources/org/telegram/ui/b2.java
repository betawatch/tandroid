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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b2 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final a70 a;
    public final j4 b;
    public Drawable c;
    public e3 d;
    public e3 e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public TL_iv.pageBlockMap x;

    public b2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.d;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.e;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.e;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.d;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.e;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.f6.S1;
        int i9 = org.telegram.ui.ActionBar.f6.pe;
        a70 a70Var = this.a;
        ((l4) a70Var).getClass();
        int i10 = 0;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.f6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.S4;
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
            int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            l4.v(a70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            l4.v(a70Var, canvas, this, i10);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.x, getMeasuredHeight());
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int dp;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockMap pageblockmap = this.x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i12 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r0 * 14);
                this.n = i12;
                i13 = org.telegram.messenger.ll.w(18.0f, i12, size);
                dp = i13;
            } else {
                this.n = AndroidUtilities.dp(18.0f);
                i12 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i13 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.x;
            int i15 = (int) ((i13 / pageblockmap2.w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i15 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.x;
                i13 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i12 += ((size - i12) - i13) / 2;
                i14 = max;
            } else {
                i14 = i15;
            }
            float f10 = i12;
            float dp2 = (this.h || this.x.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
            float f11 = i13;
            float f12 = i14;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.setImageCoords(f10, dp2, f11, f12);
            int i16 = ((l4) this.a).T;
            TLRPC.GeoPoint geoPoint = this.x.geo;
            double d = geoPoint.lat;
            double d9 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i16, d, d9, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i17 = MessagesController.getInstance(i16).mapProvider;
            this.w = i17;
            j4 j4Var = this.b;
            if (i17 == 2) {
                if (createWithGeoPoint != null) {
                    imageReceiver.setImage(ImageLocation.getForWebFile(createWithGeoPoint), null, null, null, j4Var != null ? j4Var.A : null, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.x;
            e3 q10 = l4.q(this.a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.b);
            this.d = q10;
            if (q10 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.s = height;
                i14 = org.telegram.messenger.l0.C(4.0f, height, i14);
                e3 e3Var = this.d;
                e3Var.s = this.n;
                e3Var.v = this.r;
            }
            int i18 = i14;
            TL_iv.pageBlockMap pageblockmap5 = this.x;
            e3 p6 = l4.p(this.a, this, null, pageblockmap5.caption.credit, dp, 0, pageblockmap5, (j4Var == null || !j4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), 0, this.b);
            this.e = p6;
            if (p6 != null) {
                i18 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                e3 e3Var2 = this.e;
                e3Var2.s = this.n;
                e3Var2.v = this.r + this.s;
            }
            if (!this.h && this.x.level <= 0) {
                i18 += AndroidUtilities.dp(8.0f);
            }
            i11 = AndroidUtilities.dp(8.0f) + i18;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
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
                double d9 = geoPoint._long;
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d9 + "?q=" + d + "," + d9)));
            } catch (Exception e10) {
                FileLog.e(e10);
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
