package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class eg extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final View c;
    public final Object d;
    public final Object e;
    public final Object f;

    public eg(Activity activity, boolean z9) {
        super(activity);
        this.b = false;
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 0, 0, 0, z9 ? 64 : 0, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, null);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 0, 0, 4, z9 ? 64 : 0, 0));
        setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        if (z9) {
            Switch r22 = new Switch(activity, null);
            this.f = r22;
            r22.setDrawIconType(1);
            addView(r22, c8.ha.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                if (this.b) {
                    canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                if (!(view instanceof org.telegram.ui.ActionBar.k5) || !this.b) {
                    return super.drawChild(canvas, view, j3);
                }
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
                canvas.save();
                canvas.scale(0.8f, 0.8f);
                canvas.translate(-org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                int color = k5Var.getTextPaint().getColor();
                k5Var.getTextPaint().setColor(-1);
                boolean drawChild = super.drawChild(canvas, view, j3);
                k5Var.getTextPaint().setColor(color);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.f;
                RectF rectF = (RectF) this.d;
                if (this.b) {
                    canvas.save();
                    int L = org.telegram.messenger.g0.L(26.0f);
                    canvas.translate(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - L) / 2.0f);
                    float f10 = L;
                    rectF.set(-org.telegram.messenger.g0.L(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f10);
                    float f11 = f10 / 2.0f;
                    canvas.drawRoundRect(rectF, f11, f11, (Paint) this.e);
                    canvas.translate(((getMeasuredWidth() - getPaddingEnd()) - org.telegram.messenger.g0.L(6.0f)) - drawable.getIntrinsicWidth(), org.telegram.messenger.g0.L(5.0f));
                    drawable.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                Switch r02 = (Switch) this.f;
                if (r02 != null) {
                    accessibilityNodeInfo.setClassName("android.widget.Switch");
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(r02.h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) ((TextView) this.d).getText());
                    sb2.append("\n");
                    sb2.append((Object) ((TextView) this.e).getText());
                    sb2.append("\n");
                    sb2.append(org.telegram.messenger.id.M0(r02.h ? 2131747893 : 2131747895, null));
                    accessibilityNodeInfo.setText(sb2.toString());
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                ((Paint) this.e).setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    public eg(Activity activity) {
        super(activity);
        this.d = new RectF();
        this.e = new Paint(1);
        this.b = false;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.c = k5Var;
        addView(k5Var, c8.ha.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.f = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        c8.ka.a(this);
    }
}
