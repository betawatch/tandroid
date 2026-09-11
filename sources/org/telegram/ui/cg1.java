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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class cg1 extends org.telegram.ui.Components.ia {
    public static final /* synthetic */ int h3 = 0;
    public boolean d3;
    public boolean e3;
    public float f3;
    public final /* synthetic */ eg1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(eg1 eg1Var, Context context) {
        super(context, null);
        this.g3 = eg1Var;
        this.d3 = true;
        new Paint();
        new RectF();
        this.h1 = true;
        this.b3 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.l4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        eg1 eg1Var = this.g3;
        if (eg1Var.b1 != null) {
            canvas.save();
            canvas.translate(eg1Var.b1.getLeft(), eg1Var.b1.getY());
            eg1Var.b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        x1();
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x1();
        if (this.g3.b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        eg1 eg1Var = this.g3;
        if (eg1Var.w != null && this.f3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            eg1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            HashSet hashSet = eg1.n1;
            eg1 eg1Var = this.g3;
            if (eg1Var.getParentLayout() == null || !((ActionBarLayout) eg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) eg1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (eg1Var.c != adapter.h()) {
                        this.e3 = true;
                        adapter.l();
                        this.e3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = eg1.n1;
        eg1 eg1Var = this.g3;
        eg1Var.getClass();
        eg1Var.getClass();
        eg1Var.getClass();
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.d3) {
            eg1 eg1Var = this.g3;
            if (eg1Var.getMessagesController().dialogsLoaded) {
                if (eg1Var.x > 0) {
                    this.e3 = true;
                    s4.c0 c0Var = (s4.c0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.n2) eg1Var).actionBar;
                    c0Var.h1(1, (int) kVar.getTranslationY());
                    this.e3 = false;
                }
                this.d3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        if (!this.X1) {
            HashSet hashSet = eg1.n1;
            eg1 eg1Var = this.g3;
            if (eg1Var.getParentLayout() == null || !((ActionBarLayout) eg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    if1 if1Var = eg1Var.O;
                    if (if1Var.y != 0 && eg1Var.P.d && if1Var.g(null, 4) != 0) {
                        eg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && eg1Var.y == 2 && eg1Var.x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - eg1Var.Y;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        v0(0, measuredHeight, org.telegram.ui.Components.pr.h);
                        eg1Var.y = 2;
                    } else if (eg1Var.y != 1) {
                        if (this.f3 == 0.0f) {
                            v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.pr.h);
                        }
                        if (!eg1Var.Z) {
                            eg1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            ax axVar = eg1Var.w;
                            if (axVar != null) {
                                axVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.r2) m10).a0();
                        eg1Var.y = 1;
                    }
                    float f7 = this.f3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new b21(this, 19));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.vl.c(this.f3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new gk0(this, 27));
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

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.d3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(left, top, right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    public final void x1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = eg1.n1;
    }

    public final void y1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        eg1 eg1Var = this.g3;
        eg1Var.E = z10;
        if (z10) {
            eg1Var.F.h1(0, 0);
            i10 = eg1Var.E ? 0 : 2;
            eg1Var.y = i10;
            ax axVar = eg1Var.w;
            if (axVar != null) {
                axVar.X = i10 != 0;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        } else if (r2Var != null) {
            eg1Var.F.h1(1, 0);
            i10 = eg1Var.E ? 0 : 2;
            eg1Var.y = i10;
            ax axVar2 = eg1Var.w;
            if (axVar2 != null) {
                axVar2.X = i10 != 0;
            }
        }
        sf1 sf1Var = eg1Var.E0;
        if (sf1Var != null) {
            sf1Var.forceLayout();
        }
    }
}
