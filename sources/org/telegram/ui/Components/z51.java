package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z51 extends FrameLayout {
    public final /* synthetic */ int a;
    public KeyEvent.Callback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z51(Context context) {
        super(context);
        this.a = 2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 3:
                super.addView(view, i10, i11);
                ((sg.f) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        switch (this.a) {
            case 0:
                b61 b61Var = (b61) this.b;
                int i11 = b61Var.h;
                i10 = ((org.telegram.ui.ActionBar.f3) b61Var).backgroundPaddingTop;
                int translationY = (int) ((i11 - i10) - getTranslationY());
                Drawable drawable = b61Var.b;
                drawable.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                b61 b61Var = (b61) this.b;
                if (motionEvent.getAction() != 0 || b61Var.h == 0 || motionEvent.getY() >= b61Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                b61Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((b61) this.b).isDismissed() && super.onTouchEvent(motionEvent);
            case 1:
                ((hh1) this.b).P.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 0:
                super.setTranslationY(f9);
                b61.m((b61) this.b);
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z51(KeyEvent.Callback callback, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = callback;
    }
}
