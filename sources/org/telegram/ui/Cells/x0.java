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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x0 extends FrameLayout {
    public w0 a;
    public boolean b;
    public RectF c;
    public TextPaint d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.d;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        w0 w0Var = this.a;
        w0Var.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h7, false));
        RectF rectF = this.c;
        rectF.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(73.0f));
        org.telegram.ui.ActionBar.j6.X1.setColor(Color.argb((int) (w0Var.getProgress() * 43.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.X1);
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(74.0f));
        org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) ((1.0f - w0Var.getProgress()) * 31.0f), red, green, blue));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.t0);
        boolean z4 = this.b;
        String string = LocaleController.getString(z4 ? R.string.ChatListExpanded : R.string.ChatListDefault);
        int ceil = (int) Math.ceil(textPaint.measureText(string));
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int measuredWidth = getMeasuredWidth() - ceil;
        canvas.drawText(string, measuredWidth / 2, AndroidUtilities.dp(96.0f), textPaint);
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            int dp = AndroidUtilities.dp(i10 == 0 ? 21.0f : 53.0f);
            org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb(i10 == 0 ? 204 : 90, red, green, blue));
            canvas.drawCircle(AndroidUtilities.dp(22.0f), dp, AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.j6.t0);
            int i12 = 0;
            while (true) {
                if (i12 < (z4 ? 3 : 2)) {
                    org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb(i12 == 0 ? 204 : 90, red, green, blue));
                    if (z4) {
                        float f10 = i12 * 7;
                        rectF.set(AndroidUtilities.dp(41.0f), dp - AndroidUtilities.dp(8.3f - f10), getMeasuredWidth() - AndroidUtilities.dp(i12 != 0 ? 48.0f : 72.0f), dp - AndroidUtilities.dp(5.3f - f10));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), org.telegram.ui.ActionBar.j6.t0);
                    } else {
                        int i13 = i12 * 10;
                        rectF.set(AndroidUtilities.dp(41.0f), dp - AndroidUtilities.dp(7 - i13), getMeasuredWidth() - AndroidUtilities.dp(i12 != 0 ? 48.0f : 72.0f), dp - AndroidUtilities.dp(3 - i13));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                    }
                    i12++;
                }
            }
            i10++;
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
