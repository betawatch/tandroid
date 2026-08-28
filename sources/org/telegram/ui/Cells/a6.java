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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.xa0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a6 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Switch d;
    public boolean e;
    public boolean f;
    public final org.telegram.ui.ActionBar.b6 h;

    public a6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = b6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.d(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 16.0f, 18.0f, 9.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 66.0f : 64.0f, 8.0f, z10 ? 64.0f : 66.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.z6, b6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
        textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 66.0f : 64.0f, 31.0f, z11 ? 64.0f : 66.0f, 10.0f));
        Switch r32 = new Switch(context, b6Var);
        this.d = r32;
        int i9 = org.telegram.ui.ActionBar.f6.M6;
        int i10 = org.telegram.ui.ActionBar.f6.N6;
        int i11 = org.telegram.ui.ActionBar.f6.d6;
        r32.d(i9, i10, i11, i11);
        addView(r32, g7.e6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 10.0f, 19.0f, 0.0f));
        r32.setFocusable(false);
    }

    public final void a(String str, String str2, int i9, int i10, boolean z10) {
        this.a.setText(str);
        org.telegram.ui.ActionBar.b6 b6Var = this.h;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        xa0 xa0Var = new xa0(1);
        int i11 = -14899731;
        switch (i9) {
            case 1:
            case 2:
                break;
            case 3:
                i11 = -11565578;
                break;
            case 4:
                i11 = -14965523;
                break;
            case 5:
                i11 = -1007845;
                break;
            case 6:
                i11 = -881871;
                break;
            case 7:
                i11 = -11154873;
                break;
            case 8:
                i11 = -765355;
                break;
            case 9:
                i11 = -13451058;
                break;
            case 10:
                i11 = -3903756;
                break;
            case 11:
                i11 = -7956054;
                break;
            default:
                throw null;
        }
        int i12 = -15431455;
        switch (i9) {
            case 1:
            case 4:
                break;
            case 2:
                i12 = -15497247;
                break;
            case 3:
                i12 = -13276952;
                break;
            case 5:
                i12 = -1996271;
                break;
            case 6:
                i12 = -1940716;
                break;
            case 7:
                i12 = -14175180;
                break;
            case 8:
                i12 = -2148011;
                break;
            case 9:
                i12 = -14836538;
                break;
            case 10:
                i12 = -6335009;
                break;
            case 11:
                i12 = -9534569;
                break;
            default:
                throw null;
        }
        xa0Var.b(i11, i12);
        xa0Var.b = a2;
        ImageView imageView = this.c;
        imageView.setBackground(xa0Var);
        imageView.setImageResource(i10);
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
            org.telegram.ui.ActionBar.b6 b6Var = this.h;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : org.telegram.ui.ActionBar.f6.k0;
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            Paint paint = O;
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
