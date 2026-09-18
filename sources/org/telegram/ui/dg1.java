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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class dg1 extends org.telegram.ui.Components.ga {
    public static final /* synthetic */ int h3 = 0;
    public boolean d3;
    public boolean e3;
    public float f3;
    public final /* synthetic */ fg1 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.g3 = fg1Var;
        this.d3 = true;
        new Paint();
        new RectF();
        this.h1 = true;
        this.b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        fg1 fg1Var = this.g3;
        fg1Var.E = z10;
        if (z10) {
            fg1Var.F.h1(0, 0);
            i10 = fg1Var.E ? 0 : 2;
            fg1Var.y = i10;
            cx cxVar = fg1Var.w;
            if (cxVar != null) {
                cxVar.X = i10 != 0;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        } else if (r2Var != null) {
            fg1Var.F.h1(1, 0);
            i10 = fg1Var.E ? 0 : 2;
            fg1Var.y = i10;
            cx cxVar2 = fg1Var.w;
            if (cxVar2 != null) {
                cxVar2.X = i10 != 0;
            }
        }
        tf1 tf1Var = fg1Var.E0;
        if (tf1Var != null) {
            tf1Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean G0(View view) {
        return !(view instanceof org.telegram.ui.Cells.l4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ga, org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fg1 fg1Var = this.g3;
        if (fg1Var.b1 != null) {
            canvas.save();
            canvas.translate(fg1Var.b1.getLeft(), fg1Var.b1.getY());
            fg1Var.b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override // org.telegram.ui.Components.ga, org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z1();
        if (this.g3.b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        fg1 fg1Var = this.g3;
        if (fg1Var.w != null && this.f3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            fg1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            HashSet hashSet = fg1.n1;
            fg1 fg1Var = this.g3;
            if (fg1Var.getParentLayout() == null || !((ActionBarLayout) fg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) fg1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (fg1Var.c != adapter.h()) {
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

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = fg1.n1;
        fg1 fg1Var = this.g3;
        fg1Var.getClass();
        fg1Var.getClass();
        fg1Var.getClass();
    }

    @Override // org.telegram.ui.Components.ga, org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.d3) {
            fg1 fg1Var = this.g3;
            if (fg1Var.getMessagesController().dialogsLoaded) {
                if (fg1Var.x > 0) {
                    this.e3 = true;
                    s4.c0 c0Var = (s4.c0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.o2) fg1Var).actionBar;
                    c0Var.h1(1, (int) kVar.getTranslationY());
                    this.e3 = false;
                }
                this.d3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        if (!this.X1) {
            HashSet hashSet = fg1.n1;
            fg1 fg1Var = this.g3;
            if (fg1Var.getParentLayout() == null || !((ActionBarLayout) fg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    jf1 jf1Var = fg1Var.O;
                    if (jf1Var.y != 0 && fg1Var.P.d && jf1Var.g(null, 4) != 0) {
                        fg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && fg1Var.y == 2 && fg1Var.x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - fg1Var.Y;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.qr.h);
                        fg1Var.y = 2;
                    } else if (fg1Var.y != 1) {
                        if (this.f3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.qr.h);
                        }
                        if (!fg1Var.Z) {
                            fg1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            cx cxVar = fg1Var.w;
                            if (cxVar != null) {
                                cxVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.r2) m10).a0();
                        fg1Var.y = 1;
                    }
                    float f7 = this.f3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new k21(this, 18));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.wl.c(this.f3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new er0(this, 24));
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

    @Override // org.telegram.ui.Components.ga, org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView
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

    public final void z1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = fg1.n1;
    }
}
