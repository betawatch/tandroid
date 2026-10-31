package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class nb1 extends org.telegram.ui.Components.r9 {
    public static final /* synthetic */ int n3 = 0;
    public boolean j3;
    public boolean k3;
    public float l3;
    public final /* synthetic */ pb1 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb1(pb1 pb1Var, Context context) {
        super(context, null);
        this.m3 = pb1Var;
        this.j3 = true;
        new Paint();
        new RectF();
        this.f1 = true;
        this.h3 = org.telegram.messenger.i0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        pb1 pb1Var = this.m3;
        pb1Var.E = z10;
        if (z10) {
            pb1Var.F.h1(0, 0);
            i10 = pb1Var.E ? 0 : 2;
            pb1Var.D = i10;
            kw kwVar = pb1Var.x;
            if (kwVar != null) {
                kwVar.X = i10 != 0;
            }
            if (v2Var != null) {
                v2Var.b0();
                v2Var.invalidate();
            }
        } else if (v2Var != null) {
            pb1Var.F.h1(1, 0);
            i10 = pb1Var.E ? 0 : 2;
            pb1Var.D = i10;
            kw kwVar2 = pb1Var.x;
            if (kwVar2 != null) {
                kwVar2.X = i10 != 0;
            }
        }
        fb1 fb1Var = pb1Var.E0;
        if (fb1Var != null) {
            fb1Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.p4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.l3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pb1 pb1Var = this.m3;
        if (pb1Var.c1 != null) {
            canvas.save();
            canvas.translate(pb1Var.c1.getLeft(), pb1Var.c1.getY());
            pb1Var.c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.m3.c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        pb1 pb1Var = this.m3;
        if (pb1Var.x != null && this.l3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            pb1Var.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.V1) {
            HashSet hashSet = pb1.q1;
            pb1 pb1Var = this.m3;
            if (pb1Var.getParentLayout() == null || !((ActionBarLayout) pb1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) pb1Var).actionBar;
                    lVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (pb1Var.c != adapter.b()) {
                        this.k3 = true;
                        adapter.f();
                        this.k3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        pb1 pb1Var = this.m3;
        pb1Var.getClass();
        pb1Var.getClass();
        pb1Var.getClass();
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.j3) {
            pb1 pb1Var = this.m3;
            if (pb1Var.getMessagesController().Y1) {
                if (pb1Var.y > 0) {
                    this.k3 = true;
                    s4.a0 a0Var = (s4.a0) getLayoutManager();
                    lVar = ((org.telegram.ui.ActionBar.k2) pb1Var).actionBar;
                    a0Var.h1(1, (int) lVar.getTranslationY());
                    this.k3 = false;
                }
                this.j3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.a0 a0Var;
        int L0;
        if (!this.V1) {
            HashSet hashSet = pb1.q1;
            pb1 pb1Var = this.m3;
            if (pb1Var.getParentLayout() == null || !((ActionBarLayout) pb1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ua1 ua1Var = pb1Var.O;
                    if (ua1Var.D != 0 && pb1Var.P.d && ua1Var.i(null, 4) != 0) {
                        pb1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && pb1Var.D == 2 && pb1Var.y > 0 && (L0 = (a0Var = (s4.a0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = a0Var.m(L0);
                    int L = (int) (org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - pb1Var.Y;
                    if (measuredHeight < L || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                        pb1Var.D = 2;
                    } else if (pb1Var.D != 1) {
                        if (this.l3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                        }
                        if (!pb1Var.Z) {
                            pb1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            kw kwVar = pb1Var.x;
                            if (kwVar != null) {
                                kwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.v2) m10).h0();
                        pb1Var.D = 1;
                    }
                    float f7 = this.l3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new u01(this, 15));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.z20.v(this.l3, org.telegram.messenger.i0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ns0(this, 12));
                        ofFloat.start();
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.k3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.j3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.l3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }
}
