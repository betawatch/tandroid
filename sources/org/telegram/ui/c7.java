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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public w6 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final TextView c;
    public final org.telegram.ui.Components.k6 d;
    public final org.telegram.ui.Components.p9 e;
    public boolean f;
    public boolean h;
    public org.telegram.ui.Components.kp n;

    public c7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = f6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        boolean z4 = LocaleController.isRTL;
        addView(textView, k7.b6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 21.0f : 72.0f, 0.0f, z4 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, !LocaleController.isRTL);
        this.d = k6Var;
        k6Var.b(0.55f, 320L, org.telegram.ui.Components.mr.h);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        boolean z10 = LocaleController.isRTL;
        addView(k6Var, k7.b6.d(-2, -1.0f, (z10 ? 3 : 5) | 48, z10 ? 21.0f : 72.0f, 0.0f, z10 ? 72.0f : 21.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.getAvatarDrawable().p = 0.8f;
        addView(p9Var, k7.b6.d(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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
        org.telegram.ui.Components.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
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
