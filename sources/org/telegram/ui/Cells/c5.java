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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class c5 extends FrameLayout {
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
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i2.g.f(8.0f, measuredWidth - textView.getMeasuredWidth(), AndroidUtilities.dp(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
        this.c.measure(wl.d(20.0f, getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setSize(long j3) {
        float max;
        float f7;
        float f10;
        this.d = j3;
        this.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        long j10 = j3 - 512000;
        if (j10 < 536576) {
            f10 = Math.max(0.0f, j10 / 536576.0f) * 0.25f;
        } else {
            long j11 = j3 - 1048576;
            if (j11 < 9437184) {
                f10 = (Math.max(0.0f, j11 / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j12 = j3 - 10485760;
                if (j12 < 94371840) {
                    max = Math.max(0.0f, j12 / 9.437184E7f) * 0.25f;
                    f7 = 0.5f;
                } else {
                    max = Math.max(0.0f, (j3 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) / 1.9922944E9f) * 0.25f;
                    f7 = 0.75f;
                }
                f10 = max + f7;
            }
        }
        this.c.setProgress(Math.min(1.0f, f10));
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
