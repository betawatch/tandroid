package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout {
    public x0 a;
    public boolean b;
    public RectF c;
    public TextPaint d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.d;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.M6, false);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        x0 x0Var = this.a;
        x0Var.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h7, false));
        RectF rectF = this.c;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        org.telegram.ui.ActionBar.f6.X1.setColor(Color.argb((int) (x0Var.getProgress() * 43.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.X1);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        org.telegram.ui.ActionBar.f6.t0.setColor(Color.argb((int) ((1.0f - x0Var.getProgress()) * 31.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.t0);
        boolean z10 = this.b;
        String string = LocaleController.getString(z10 ? R.string.ChatListExpanded : R.string.ChatListDefault);
        int ceil = (int) Math.ceil(textPaint.measureText(string));
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int measuredWidth = getMeasuredWidth() - ceil;
        canvas.drawText(string, measuredWidth / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i9 = 0;
        for (int i10 = 2; i9 < i10; i10 = 2) {
            int dp = AndroidUtilities.dp(i9 == 0 ? 21.0f : 53.0f);
            org.telegram.ui.ActionBar.f6.t0.setColor(Color.argb(i9 == 0 ? 204 : 90, red, green, blue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), dp, AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.f6.t0);
            int i11 = 0;
            while (true) {
                if (i11 < (z10 ? 3 : 2)) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(Color.argb(i11 == 0 ? 204 : 90, red, green, blue));
                    if (z10) {
                        float f10 = i11 * 7;
                        rectF.set(AndroidUtilities.dp(41.0f), dp - AndroidUtilities.dp(8.3f - f10), getMeasuredWidth() - AndroidUtilities.dp(i11 != 0 ? 48.0f : 72.0f), dp - AndroidUtilities.dp(5.3f - f10));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), org.telegram.ui.ActionBar.f6.t0);
                    } else {
                        int i12 = i11 * 10;
                        rectF.set(AndroidUtilities.dp(41.0f), dp - AndroidUtilities.dp(7 - i12), getMeasuredWidth() - AndroidUtilities.dp(i11 != 0 ? 48.0f : 72.0f), dp - AndroidUtilities.dp(3 - i12));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
                    }
                    i11++;
                }
            }
            i9++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setChecked(this.a.f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(this.b ? R.string.ChatListExpanded : R.string.ChatListDefault));
    }
}
