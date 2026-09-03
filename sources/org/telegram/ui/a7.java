package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public u6 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final TextView c;
    public final org.telegram.ui.Components.k6 d;
    public final org.telegram.ui.Components.p9 e;
    public boolean f;
    public boolean h;
    public org.telegram.ui.Components.np n;

    public a7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.b = g6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        boolean z4 = LocaleController.isRTL;
        addView(textView, k7.c6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 21.0f : 72.0f, 0.0f, z4 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, !LocaleController.isRTL);
        this.d = k6Var;
        k6Var.b(0.55f, 320L, org.telegram.ui.Components.pr.h);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I6, g6Var));
        boolean z10 = LocaleController.isRTL;
        addView(k6Var, k7.c6.d(-2, -1.0f, (z10 ? 3 : 5) | 48, z10 ? 21.0f : 72.0f, 0.0f, z10 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.getAvatarDrawable().p = 0.8f;
        addView(p9Var, k7.c6.d(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 != NotificationCenter.emojiLoaded || (textView = this.c) == null) {
            return;
        }
        textView.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.c;
    }

    public org.telegram.ui.Components.k6 getValueTextView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.c.getText());
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (k6Var == null || k6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) k6Var.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.p9 p9Var = this.e;
        if (p9Var.getVisibility() == 0) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), TLObject.FLAG_30));
        }
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (k6Var.getVisibility() == 0) {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = (measuredWidth - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + k6Var.getMeasuredWidth();
        boolean z4 = LocaleController.isRTL;
        TextView textView = this.c;
        if (z4) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        org.telegram.ui.Components.np npVar = this.n;
        if (npVar != null) {
            npVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
    }

    public void setCanDisable(boolean z4) {
        this.h = z4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        float f10 = 1.0f;
        this.c.setAlpha((z4 || !this.h) ? 1.0f : 0.5f);
        org.telegram.ui.Components.k6 k6Var = this.d;
        if (k6Var.getVisibility() == 0) {
            if (!z4 && this.h) {
                f10 = 0.5f;
            }
            k6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i10) {
        this.c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
