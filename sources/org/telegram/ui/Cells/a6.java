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
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.tb0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.g6 h;

    public a6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = g6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.d(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.G6, g6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z4 = LocaleController.isRTL;
        addView(textView, k7.c6.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 66.0f : 64.0f, 8.0f, z4 ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.z6, g6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView2, k7.c6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 66.0f : 64.0f, 31.0f, z10 ? 64.0f : 66.0f, 10.0f));
        Switch r32 = new Switch(context, g6Var);
        this.d = r32;
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        r32.d(i10, i11, i12, i12);
        addView(r32, k7.c6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, int i10, int i11, boolean z4) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        boolean a2 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        tb0 tb0Var = new tb0(1);
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
        tb0Var.b(i12, i13);
        tb0Var.b = a2;
        ImageView imageView = this.c;
        imageView.setBackground(tb0Var);
        imageView.setImageResource(i11);
        boolean z10 = this.e;
        Switch r02 = this.d;
        r02.b(0, z4, z10);
        this.b.setText(str2);
        r02.setContentDescription(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            org.telegram.ui.ActionBar.g6 g6Var = this.h;
            Paint F = g6Var != null ? g6Var.F("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (F == null) {
                F = org.telegram.ui.ActionBar.k6.k0;
            }
            Paint paint = F;
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getText());
        TextView textView = this.b;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    public void setAnimationsEnabled(boolean z4) {
        this.e = z4;
    }

    public void setChecked(boolean z4) {
        this.d.b(0, z4, true);
    }

    public void setDivider(boolean z4) {
        this.f = z4;
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
