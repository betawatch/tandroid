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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class lb1 extends org.telegram.ui.Components.r9 {
    public static final /* synthetic */ int n3 = 0;
    public boolean j3;
    public boolean k3;
    public float l3;
    public final /* synthetic */ nb1 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(nb1 nb1Var, Context context) {
        super(context, null);
        this.m3 = nb1Var;
        this.j3 = true;
        new Paint();
        new RectF();
        this.f1 = true;
        this.h3 = org.telegram.messenger.i0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        nb1 nb1Var = this.m3;
        nb1Var.E = z10;
        if (z10) {
            nb1Var.F.h1(0, 0);
            i10 = nb1Var.E ? 0 : 2;
            nb1Var.D = i10;
            jw jwVar = nb1Var.x;
            if (jwVar != null) {
                jwVar.X = i10 != 0;
            }
            if (v2Var != null) {
                v2Var.b0();
                v2Var.invalidate();
            }
        } else if (v2Var != null) {
            nb1Var.F.h1(1, 0);
            i10 = nb1Var.E ? 0 : 2;
            nb1Var.D = i10;
            jw jwVar2 = nb1Var.x;
            if (jwVar2 != null) {
                jwVar2.X = i10 != 0;
            }
        }
        db1 db1Var = nb1Var.E0;
        if (db1Var != null) {
            db1Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.uk0
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

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nb1 nb1Var = this.m3;
        if (nb1Var.c1 != null) {
            canvas.save();
            canvas.translate(nb1Var.c1.getLeft(), nb1Var.c1.getY());
            nb1Var.c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
        nb1 nb1Var = this.m3;
        if (nb1Var.x != null && this.l3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            nb1Var.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.V1) {
            HashSet hashSet = nb1.q1;
            nb1 nb1Var = this.m3;
            if (nb1Var.getParentLayout() == null || !((ActionBarLayout) nb1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
                    lVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (nb1Var.c != adapter.b()) {
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

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        nb1 nb1Var = this.m3;
        nb1Var.getClass();
        nb1Var.getClass();
        nb1Var.getClass();
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.j3) {
            nb1 nb1Var = this.m3;
            if (nb1Var.getMessagesController().Y1) {
                if (nb1Var.y > 0) {
                    this.k3 = true;
                    s4.a0 a0Var = (s4.a0) getLayoutManager();
                    lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
                    a0Var.h1(1, (int) lVar.getTranslationY());
                    this.k3 = false;
                }
                this.j3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.a0 a0Var;
        int L0;
        if (!this.V1) {
            HashSet hashSet = nb1.q1;
            nb1 nb1Var = this.m3;
            if (nb1Var.getParentLayout() == null || !((ActionBarLayout) nb1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    sa1 sa1Var = nb1Var.O;
                    if (sa1Var.D != 0 && nb1Var.P.d && sa1Var.i(null, 4) != 0) {
                        nb1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && nb1Var.D == 2 && nb1Var.y > 0 && (L0 = (a0Var = (s4.a0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = a0Var.m(L0);
                    int L = (int) (org.telegram.messenger.i0.L(org.telegram.messenger.uz.p1 ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - nb1Var.Y;
                    if (measuredHeight < L || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                        nb1Var.D = 2;
                    } else if (nb1Var.D != 1) {
                        if (this.l3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                        }
                        if (!nb1Var.Z) {
                            nb1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            jw jwVar = nb1Var.x;
                            if (jwVar != null) {
                                jwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.v2) m10).h0();
                        nb1Var.D = 1;
                    }
                    float f7 = this.l3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new u01(this, 15));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.a30.v(this.l3, org.telegram.messenger.i0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ms0(this, 12));
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

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.k3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView
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
