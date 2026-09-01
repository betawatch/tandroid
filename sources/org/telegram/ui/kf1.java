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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class kf1 extends org.telegram.ui.Components.aa {
    public static final /* synthetic */ int e3 = 0;
    public boolean a3;
    public boolean b3;
    public float c3;
    public final /* synthetic */ mf1 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf1(mf1 mf1Var, Context context) {
        super(context, null);
        this.d3 = mf1Var;
        this.a3 = true;
        new Paint();
        new RectF();
        this.e1 = true;
        this.Y2 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.m4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.c3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mf1 mf1Var = this.d3;
        if (mf1Var.Y0 != null) {
            canvas.save();
            canvas.translate(mf1Var.Y0.getLeft(), mf1Var.Y0.getY());
            mf1Var.Y0.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y1();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y1();
        if (this.d3.Y0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        mf1 mf1Var = this.d3;
        if (mf1Var.w != null && this.c3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            mf1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.U1) {
            HashSet hashSet = mf1.k1;
            mf1 mf1Var = this.d3;
            if (mf1Var.getParentLayout() == null || !((ActionBarLayout) mf1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) mf1Var).actionBar;
                    kVar.getClass();
                    f2.p0 adapter = getAdapter();
                    if (mf1Var.c != adapter.h()) {
                        this.b3 = true;
                        adapter.l();
                        this.b3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        HashSet hashSet = mf1.k1;
        mf1 mf1Var = this.d3;
        mf1Var.getClass();
        mf1Var.getClass();
        mf1Var.getClass();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.a3) {
            mf1 mf1Var = this.d3;
            if (mf1Var.getMessagesController().dialogsLoaded) {
                if (mf1Var.x > 0) {
                    this.b3 = true;
                    f2.j0 j0Var = (f2.j0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.p2) mf1Var).actionBar;
                    j0Var.h1(1, (int) kVar.getTranslationY());
                    this.b3 = false;
                }
                this.a3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.j0 j0Var;
        int L0;
        if (!this.U1) {
            HashSet hashSet = mf1.k1;
            mf1 mf1Var = this.d3;
            if (mf1Var.getParentLayout() == null || !((ActionBarLayout) mf1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    pe1 pe1Var = mf1Var.L;
                    if (pe1Var.y != 0 && mf1Var.M.d && pe1Var.f(null, 4) != 0) {
                        mf1Var.M.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && mf1Var.y == 2 && mf1Var.x > 0 && (L0 = (j0Var = (f2.j0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m9 = j0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m9.getMeasuredHeight() + (m9.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - mf1Var.V;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        v0(0, measuredHeight, org.telegram.ui.Components.pr.h);
                        mf1Var.y = 2;
                    } else if (mf1Var.y != 1) {
                        if (this.c3 == 0.0f) {
                            v0(0, m9.getTop() - paddingTop, org.telegram.ui.Components.pr.h);
                        }
                        if (!mf1Var.W) {
                            mf1Var.W = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            ww wwVar = mf1Var.w;
                            if (wwVar != null) {
                                wwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.r2) m9).a0();
                        mf1Var.y = 1;
                    }
                    float f10 = this.c3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new j11(this, 19));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.y3.A(this.c3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ns0(this, 23));
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

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(f2.p0 p0Var) {
        super.setAdapter(p0Var);
        this.a3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m9;
        this.c3 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.B1 != -1 && (m9 = getLayoutManager().m(this.B1)) != null) {
            int left = m9.getLeft();
            int top = (int) (m9.getTop() + f10);
            int right = m9.getRight();
            int bottom = (int) (m9.getBottom() + f10);
            Rect rect = this.D1;
            rect.set(left, top, right, bottom);
            this.A1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = mf1.k1;
    }

    public final void z1(boolean z4, org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        mf1 mf1Var = this.d3;
        mf1Var.B = z4;
        if (z4) {
            mf1Var.C.h1(0, 0);
            i10 = mf1Var.B ? 0 : 2;
            mf1Var.y = i10;
            ww wwVar = mf1Var.w;
            if (wwVar != null) {
                wwVar.X = i10 != 0;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        } else if (r2Var != null) {
            mf1Var.C.h1(1, 0);
            i10 = mf1Var.B ? 0 : 2;
            mf1Var.y = i10;
            ww wwVar2 = mf1Var.w;
            if (wwVar2 != null) {
                wwVar2.X = i10 != 0;
            }
        }
        af1 af1Var = mf1Var.B0;
        if (af1Var != null) {
            af1Var.forceLayout();
        }
    }
}
