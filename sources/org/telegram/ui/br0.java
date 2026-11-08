package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class br0 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ int e3 = 0;
    public final Paint f3;
    public final Object g3;
    public final Object h3;

    public br0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.f3 = paint;
        this.h3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        ar0 ar0Var = new ar0(this);
        setItemAnimator(ar0Var);
        ar0Var.C = false;
        ar0Var.m = false;
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
        paint.setColor(2130706432);
        this.g3 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.e3) {
            case 1:
                Path path = (Path) this.g3;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
                Paint paint = this.f3;
                paint.setColor(x02);
                canvas.drawPath(path, paint);
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                if (((us0) this.h3).n.q0 < 1.0f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                RectF rectF = (RectF) this.h3;
                Drawable drawable = (Drawable) this.g3;
                super.onDraw(canvas);
                int childCount = getChildCount();
                if (childCount > 0) {
                    int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(87.0f);
                    drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.messenger.g0.L(6.0f));
                    drawable.draw(canvas);
                    int i7 = Integer.MIN_VALUE;
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = getChildAt(i11);
                        i10 = (int) Math.min(i10, Math.floor(childAt.getX()));
                        i7 = (int) Math.max(i7, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                    }
                    if (i10 != Integer.MAX_VALUE && i7 != Integer.MIN_VALUE) {
                        rectF.set(i10 - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + i7, org.telegram.messenger.g0.L(103.0f));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f3);
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 1:
                if (((us0) this.h3).n.q0 < 1.0f) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.e3) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                PremiumPreviewFragment premiumPreviewFragment = ((us0) this.h3).n;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList = premiumPreviewFragment.d;
                    if (i13 >= arrayList.size()) {
                        premiumPreviewFragment.O = i14;
                        break;
                    } else {
                        premiumPreviewFragment.M.a((ws0) arrayList.get(i13), false);
                        premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                        ((ws0) arrayList.get(i13)).h = i14;
                        i14 += premiumPreviewFragment.M.getMeasuredHeight();
                        i13++;
                    }
                }
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(us0 us0Var, Context context) {
        super(context, null);
        this.h3 = us0Var;
        Paint paint = new Paint(1);
        this.f3 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
        this.g3 = new Path();
    }
}
