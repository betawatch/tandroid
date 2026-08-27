package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import n5.f;
import org.telegram.messenger.beta.R;
import q5.a;
import q5.b;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class CastSeekBar extends View {
    public static final /* synthetic */ int s = 0;
    public final a a;
    public final ArrayList b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final int h;
    public final int n;
    public final int r;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        setAccessibilityDelegate(new b(this));
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.d = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.e = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        this.a = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.h = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.n = context.getResources().getColor(resourceId3);
        this.r = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i10, int i11, int i12, int i13) {
        Paint paint = this.f;
        paint.setColor(i13);
        float f10 = 1;
        float f11 = i12;
        float f12 = this.e;
        canvas.drawRect((i10 / f10) * f11, -f12, (i11 / f10) * f11, f12, paint);
    }

    public int getMaxProgress() {
        this.a.getClass();
        return 1;
    }

    public int getProgress() {
        this.a.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i10;
        int i11;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        this.a.getClass();
        int i12 = 0;
        int max = Math.max(0, 0);
        if (max > 0) {
            i10 = max;
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.a(canvas2, 0, i10, measuredWidth, this.n);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
            i10 = max;
        }
        if (progress > i10) {
            castSeekBar.a(canvas2, i10, progress, measuredWidth, castSeekBar.h);
            i11 = progress;
        } else {
            i11 = progress;
        }
        if (1 > i11) {
            castSeekBar.a(canvas2, i11, 1, measuredWidth, castSeekBar.n);
        }
        canvas2.restoreToCount(save2);
        ArrayList arrayList = castSeekBar.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f.setColor(castSeekBar.r);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int save3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (obj != null) {
                    throw new ClassCastException();
                }
            }
            canvas2.restoreToCount(save3);
        }
        isEnabled();
        canvas2.restoreToCount(save);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.c + paddingLeft + getPaddingRight()), i10, 0), View.resolveSizeAndState((int) (this.d + getPaddingTop() + getPaddingBottom()), i11, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.a.getClass();
        return false;
    }
}
