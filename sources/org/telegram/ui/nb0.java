package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nb0 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ Object f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb0(KeyEvent.Callback callback, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.e3 = i10;
        this.f3 = callback;
    }

    @Override // org.telegram.ui.Components.tk0
    public boolean H0(View view, float f7, float f10) {
        switch (this.e3) {
            case 3:
                ((rh.t0) this.f3).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public Integer V0(int i10) {
        int i11;
        switch (this.e3) {
            case 2:
                i11 = ((SessionsActivity) this.f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.p6 p6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.p7, p6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var));
            case 3:
            default:
                return super.V0(i10);
            case 4:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        th.h0 h0Var;
        switch (this.e3) {
            case 0:
                yb0 yb0Var = (yb0) this.f3;
                RectF rectF = yb0Var.b0;
                if (yb0Var.a0 != null) {
                    int L = org.telegram.messenger.i0.L(12.0f);
                    yb0Var.a0.setBounds(-L, yb0Var.c0 - L, getWidth() + L, getHeight() + L);
                    yb0Var.a0.draw(canvas);
                    int i10 = yb0Var.O0;
                    if (i10 == 0 || i10 == 1) {
                        int L2 = org.telegram.messenger.i0.L(36.0f);
                        rectF.set((getWidth() - L2) / 2.0f, org.telegram.messenger.i0.L(10.0f) + yb0Var.c0, (getWidth() + L2) / 2.0f, org.telegram.messenger.i0.L(4.0f) + r4);
                        org.telegram.ui.ActionBar.t6.t0.setColor(yb0Var.getThemedColor(org.telegram.ui.ActionBar.t6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                sn0 sn0Var = (sn0) this.f3;
                Paint paint = sn0Var.x;
                RectF rectF2 = sn0Var.s;
                RectF rectF3 = sn0Var.r;
                RectF rectF4 = sn0Var.n;
                s4.a0 a0Var = sn0Var.b;
                if (!sn0Var.f.isEmpty()) {
                    float e = sn0Var.e.e(false, sn0Var.d);
                    double d = e;
                    int j10 = Utilities.j((int) Math.floor(d), r6.size() - 1, 0);
                    int j11 = Utilities.j((int) Math.ceil(d), r6.size() - 1, 0);
                    View m10 = a0Var.m(j10);
                    View m11 = a0Var.m(j11);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.i0.Z1(rectF4, rectF3, e - j10, rectF2);
                        paint.setColor(sn0Var.y);
                        float height = rectF2.height() / 2.0f;
                        canvas.drawRoundRect(rectF2, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                th.p1 p1Var = (th.p1) this.f3;
                int i11 = -1;
                if (!p1Var.f0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < getChildCount()) {
                            View childAt = getChildAt(i12);
                            if (!(childAt instanceof th.c0) || (h0Var = ((th.c0) childAt).K) == null) {
                                i12++;
                            } else {
                                i11 = h0Var.a;
                            }
                        }
                    }
                }
                if (i11 > p1Var.F) {
                    p1Var.F = i11;
                    th.a aVar = p1Var.i0.G1;
                    if (aVar != null) {
                        aVar.setCount(p1Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 7:
                org.telegram.ui.Components.qe qeVar = (org.telegram.ui.Components.qe) this.f3;
                nb0 nb0Var = qeVar.c;
                if (nb0Var.getLayoutManager() != null && nb0Var.getAdapter() != null && nb0Var.getAdapter().b() != 0) {
                    float L3 = qeVar.h - org.telegram.messenger.i0.L(8.0f);
                    qeVar.e = L3 - org.telegram.messenger.i0.L(16.0f);
                    vg.f fVar = qeVar.r;
                    if (fVar != null) {
                        fVar.draw(canvas);
                    }
                    RectF rectF5 = org.telegram.messenger.i0.P;
                    rectF5.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(12.0f), L3 - org.telegram.messenger.i0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(12.0f), L3);
                    canvas.drawRoundRect(rectF5, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), qeVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 0:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((yb0) this.f3).c0) {
                    break;
                }
                break;
            case 4:
                if (!((th.p1) this.f3).f0) {
                    break;
                }
                break;
            case 6:
                if (!((vh.k2) this.f3).K) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e3) {
            case 1:
                super.invalidate();
                dn0 dn0Var = ((sn0) this.f3).F;
                if (dn0Var != null) {
                    dn0Var.run();
                    break;
                }
                break;
            case 4:
                super.invalidate();
                ((th.p1) this.f3).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 5:
                lt p5 = lt.p();
                vh.g1 g1Var = (vh.g1) this.f3;
                boolean q6 = p5.q(motionEvent, g1Var.b, g1Var.f, this.n2);
                if (super.onInterceptTouchEvent(motionEvent) || q6) {
                }
                break;
            case 6:
                if (!((vh.k2) this.f3).K) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.e3) {
            case 3:
                ((rh.t0) this.f3).I0();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.e3) {
            case 4:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb0(Object obj, Context context, int i10) {
        super(context, null);
        this.e3 = i10;
        this.f3 = obj;
    }
}
