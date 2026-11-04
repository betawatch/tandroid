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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class k91 extends org.telegram.ui.Components.w9 {
    public static final /* synthetic */ int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final /* synthetic */ m91 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(m91 m91Var, Context context) {
        super(context, null);
        this.n3 = m91Var;
        this.k3 = true;
        new Paint();
        new RectF();
        this.g1 = true;
        this.i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        int i3;
        m91 m91Var = this.n3;
        m91Var.F = z10;
        if (z10) {
            m91Var.G.h1(0, 0);
            i3 = m91Var.F ? 0 : 2;
            m91Var.E = i3;
            cv cvVar = m91Var.x;
            if (cvVar != null) {
                cvVar.X = i3 != 0;
            }
            if (t2Var != null) {
                t2Var.b0();
                t2Var.invalidate();
            }
        } else if (t2Var != null) {
            m91Var.G.h1(1, 0);
            i3 = m91Var.F ? 0 : 2;
            m91Var.E = i3;
            cv cvVar2 = m91Var.x;
            if (cvVar2 != null) {
                cvVar2.X = i3 != 0;
            }
        }
        c91 c91Var = m91Var.F0;
        if (c91Var != null) {
            c91Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.n4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        view.setTranslationY(this.m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m91 m91Var = this.n3;
        if (m91Var.d1 != null) {
            canvas.save();
            canvas.translate(m91Var.d1.getLeft(), m91Var.d1.getY());
            m91Var.d1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.n3.d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        m91 m91Var = this.n3;
        if (m91Var.x != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            m91Var.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.W1) {
            HashSet hashSet = m91.r1;
            m91 m91Var = this.n3;
            if (m91Var.getParentLayout() == null || !((ActionBarLayout) m91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
                    kVar.getClass();
                    u4.h0 adapter = getAdapter();
                    if (m91Var.c != adapter.b()) {
                        this.l3 = true;
                        adapter.f();
                        this.l3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        m91 m91Var = this.n3;
        m91Var.getClass();
        m91Var.getClass();
        m91Var.getClass();
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.k3) {
            m91 m91Var = this.n3;
            if (m91Var.getMessagesController().Z1) {
                if (m91Var.y > 0) {
                    this.l3 = true;
                    u4.b0 b0Var = (u4.b0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
                    b0Var.h1(1, (int) kVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u4.b0 b0Var;
        int L0;
        if (!this.W1) {
            HashSet hashSet = m91.r1;
            m91 m91Var = this.n3;
            if (m91Var.getParentLayout() == null || !((ActionBarLayout) m91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                int i3 = 1;
                if (action == 1 || action == 3) {
                    s81 s81Var = m91Var.P;
                    if (s81Var.E != 0 && m91Var.Q.d && s81Var.i(null, 4) != 0) {
                        m91Var.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && m91Var.E == 2 && m91Var.y > 0 && (L0 = (b0Var = (u4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    int L = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - m91Var.Z;
                    if (measuredHeight < L || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                        m91Var.E = 2;
                    } else if (m91Var.E != 1) {
                        if (this.m3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                        }
                        if (!m91Var.a0) {
                            m91Var.a0 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            cv cvVar = m91Var.x;
                            if (cvVar != null) {
                                cvVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.t2) m10).h0();
                        m91Var.E = 1;
                    }
                    float f10 = this.m3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new xy0(this, 15));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.camera.q.v(this.m3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new i81(this, i3));
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

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(u4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.k3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.m3 = f10;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }
}
