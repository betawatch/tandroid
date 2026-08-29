package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class b5 extends FrameLayout {
    public TextView a;
    public TextView b;
    public j0 c;
    public long d;

    public final void a(ArrayList arrayList, boolean z10) {
        TextView textView = this.b;
        j0 j0Var = this.c;
        TextView textView2 = this.a;
        super.setEnabled(z10);
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", z10 ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(j0Var, "alpha", z10 ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
        } else {
            textView2.setAlpha(z10 ? 1.0f : 0.5f);
            j0Var.setAlpha(z10 ? 1.0f : 0.5f);
            textView.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public long getSize() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(80.0f));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        TextView textView = this.b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(j7.l1.d(8.0f, measuredWidth - textView.getMeasuredWidth(), AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
        this.c.measure(org.telegram.ui.b.d(20.0f, getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setSize(long j10) {
        float max;
        float f9;
        float f10;
        this.d = j10;
        this.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        long j11 = j10 - 512000;
        if (j11 < 536576) {
            f10 = Math.max(0.0f, j11 / 536576.0f) * 0.25f;
        } else {
            long j12 = j10 - 1048576;
            if (j12 < 9437184) {
                f10 = (Math.max(0.0f, j12 / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j13 = j10 - 10485760;
                if (j13 < 94371840) {
                    max = Math.max(0.0f, j13 / 9.437184E7f) * 0.25f;
                    f9 = 0.5f;
                } else {
                    max = Math.max(0.0f, (j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) / 1.9922944E9f) * 0.25f;
                    f9 = 0.75f;
                }
                f10 = max + f9;
            }
        }
        this.c.setProgress(Math.min(1.0f, f10));
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
