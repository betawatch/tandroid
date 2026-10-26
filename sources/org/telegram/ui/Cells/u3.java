package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u3 extends ViewGroup implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.ActionBar.u6 a;
    public final TextView b;
    public final int c;
    public ArrayList d;

    public u3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = u6Var;
        this.c = i10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(LocaleController.getString(R.string.NewsInterests));
        textView.setTextSize(12.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setIncludeFontPadding(false);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        addView(textView);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            getChildAt(i12).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(AndroidUtilities.dp(14.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(14.0f), getHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.b.layout(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), getWidth() - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f));
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(32.0f);
        for (int i14 = 1; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (dp > AndroidUtilities.dp(14.0f) && childAt.getMeasuredWidth() + dp > getWidth() - AndroidUtilities.dp(14.0f)) {
                dp = AndroidUtilities.dp(14.0f);
                dp2 = AndroidUtilities.dp(34.0f) + dp2;
            }
            int width = LocaleController.isRTL ? (getWidth() - dp) - childAt.getMeasuredWidth() : dp;
            childAt.layout(width, dp2, childAt.getMeasuredWidth() + width, AndroidUtilities.dp(28.0f) + dp2);
            dp = org.telegram.messenger.t.D(5.0f, childAt.getMeasuredWidth(), dp);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(28.0f);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), TLObject.FLAG_30));
        int dp2 = AndroidUtilities.dp(32.0f);
        int i12 = 0;
        for (int i13 = 1; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
            if (i12 > 0 && childAt.getMeasuredWidth() + i12 > dp) {
                dp2 = AndroidUtilities.dp(34.0f) + dp2;
                i12 = 0;
            }
            i12 = org.telegram.messenger.t.D(5.0f, childAt.getMeasuredWidth(), i12);
        }
        setMeasuredDimension(size, AndroidUtilities.dp(12.0f) + dp2 + (getChildCount() > 1 ? AndroidUtilities.dp(28.0f) : 0));
    }
}
