package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.rb0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.f6 h;

    public z5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = f6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.d(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        wl.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(textView, w7.x5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 66.0f : 64.0f, 8.0f, z10 ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.z6, f6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, w7.x5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 66.0f : 64.0f, 31.0f, z11 ? 64.0f : 66.0f, 10.0f));
        Switch r32 = new Switch(context, f6Var);
        this.d = r32;
        int i10 = org.telegram.ui.ActionBar.j6.M6;
        int i11 = org.telegram.ui.ActionBar.j6.N6;
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        r32.d(i10, i11, i12, i12);
        addView(r32, w7.x5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, int i10, int i11, boolean z10) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        rb0 rb0Var = new rb0(1);
        int i12 = -14899731;
        switch (i10) {
            case 1:
            case 2:
                break;
            case 3:
                i12 = -11565578;
                break;
            case 4:
                i12 = -14965523;
                break;
            case 5:
                i12 = -1007845;
                break;
            case 6:
                i12 = -881871;
                break;
            case 7:
                i12 = -11154873;
                break;
            case 8:
                i12 = -765355;
                break;
            case 9:
                i12 = -13451058;
                break;
            case 10:
                i12 = -3903756;
                break;
            case 11:
                i12 = -7956054;
                break;
            default:
                throw null;
        }
        int i13 = -15431455;
        switch (i10) {
            case 1:
            case 4:
                break;
            case 2:
                i13 = -15497247;
                break;
            case 3:
                i13 = -13276952;
                break;
            case 5:
                i13 = -1996271;
                break;
            case 6:
                i13 = -1940716;
                break;
            case 7:
                i13 = -14175180;
                break;
            case 8:
                i13 = -2148011;
                break;
            case 9:
                i13 = -14836538;
                break;
            case 10:
                i13 = -6335009;
                break;
            case 11:
                i13 = -9534569;
                break;
            default:
                throw null;
        }
        rb0Var.b(i12, i13);
        rb0Var.b = a2;
        ImageView imageView = this.c;
        imageView.setBackground(rb0Var);
        imageView.setImageResource(i11);
        boolean z11 = this.e;
        Switch r02 = this.d;
        r02.b(0, z10, z11);
        this.b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.h;
            Paint G = f6Var != null ? f6Var.G("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (G == null) {
                G = org.telegram.ui.ActionBar.j6.k0;
            }
            Paint paint = G;
            if (paint != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(19.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(19.0f) : 0), getMeasuredHeight() - 1, paint);
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

    public void setAnimationsEnabled(boolean z10) {
        this.e = z10;
    }

    public void setChecked(boolean z10) {
        this.d.b(0, z10, true);
    }

    public void setDivider(boolean z10) {
        this.f = z10;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
