package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class c5 extends FrameLayout {
    public TextView a;
    public TextView b;
    public i0 c;
    public long d;

    public final void a(ArrayList arrayList, boolean z10) {
        TextView textView = this.b;
        i0 i0Var = this.c;
        TextView textView2 = this.a;
        super.setEnabled(z10);
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", z10 ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(i0Var, "alpha", z10 ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
        } else {
            textView2.setAlpha(z10 ? 1.0f : 0.5f);
            i0Var.setAlpha(z10 ? 1.0f : 0.5f);
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
        canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(80.0f));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
        TextView textView = this.b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i5.c.d(8.0f, measuredWidth - textView.getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
        this.c.measure(n10.c(20.0f, getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
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
        float f10;
        float f11;
        this.d = j3;
        this.b.setText(gd.a0("AutodownloadSizeLimitUpTo", null, 2131753770, org.telegram.messenger.g0.i0(j3, false, false)));
        long j10 = j3 - 512000;
        if (j10 < 536576) {
            f11 = Math.max(0.0f, j10 / 536576.0f) * 0.25f;
        } else {
            long j11 = j3 - 1048576;
            if (j11 < 9437184) {
                f11 = (Math.max(0.0f, j11 / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j12 = j3 - 10485760;
                if (j12 < 94371840) {
                    max = Math.max(0.0f, j12 / 9.437184E7f) * 0.25f;
                    f10 = 0.5f;
                } else {
                    max = Math.max(0.0f, (j3 - 104857600) / 1.9922944E9f) * 0.25f;
                    f10 = 0.75f;
                }
                f11 = max + f10;
            }
        }
        this.c.setProgress(Math.min(1.0f, f11));
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
