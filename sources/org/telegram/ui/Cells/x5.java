package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.da0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x5 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.h6 h;

    public x5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = h6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.d(28, 28.0f, (id.a0 ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((id.a0 ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z9 = id.a0;
        addView(textView, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 66.0f : 64.0f, 8.0f, z9 ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(id.a0 ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(1.66f), 1.0f);
        boolean z10 = id.a0;
        addView(textView2, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 66.0f : 64.0f, 31.0f, z10 ? 64.0f : 66.0f, 10.0f));
        Switch r32 = new Switch(context, h6Var);
        this.d = r32;
        int i7 = org.telegram.ui.ActionBar.m6.M6;
        int i10 = org.telegram.ui.ActionBar.m6.N6;
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        r32.d(i7, i10, i11, i11);
        addView(r32, c8.ha.d(37, 40.0f, (id.a0 ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, c30 c30Var, int i7, boolean z9) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.h6 h6Var = this.h;
        boolean a10 = h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q();
        da0 da0Var = new da0(1);
        da0Var.b(c30Var.a, c30Var.b);
        da0Var.b = a10;
        ImageView imageView = this.c;
        imageView.setBackground(da0Var);
        imageView.setImageResource(i7);
        boolean z10 = this.e;
        Switch r02 = this.d;
        r02.b(0, z9, z10);
        this.b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            org.telegram.ui.ActionBar.h6 h6Var = this.h;
            Paint d = h6Var != null ? h6Var.d("paintDivider") : org.telegram.ui.ActionBar.m6.k0;
            if (d == null) {
                d = org.telegram.ui.ActionBar.m6.k0;
            }
            Paint paint = d;
            if (paint != null) {
                canvas.drawLine(id.a0 ? 0.0f : org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? org.telegram.messenger.g0.L(19.0f) : 0), getMeasuredHeight() - 1, paint);
            }
        }
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z9) {
        this.e = z9;
    }

    public void setChecked(boolean z9) {
        this.d.b(0, z9, true);
    }

    public void setDivider(boolean z9) {
        this.f = z9;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
