package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.Components.w9 implements ei.g7 {
    public static final /* synthetic */ int C3 = 0;
    public int A3;
    public final /* synthetic */ uw B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final tw n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public org.telegram.ui.Components.tj0 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public ei.z9 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(uw uwVar, Context context, tw twVar) {
        super(context, null);
        this.B3 = uwVar;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = twVar;
        this.i3 = org.telegram.messenger.g0.L(200.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(nv nvVar, float f10, boolean z10) {
        uw uwVar;
        org.telegram.ui.Components.tj0 tj0Var = nvVar == null ? this.s3 : this;
        if (tj0Var == null) {
            this.s3 = nvVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.t2 t2Var = null;
        int i3 = 0;
        int i10 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.t2 t2Var2 = null;
        while (true) {
            int childCount = tj0Var.getChildCount();
            uwVar = this.B3;
            if (i3 >= childCount) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var3 = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var3.getDialogId() == uwVar.G3.getCurrentFragmetDialogId()) {
                    t2Var = t2Var3;
                }
                if (childAt.getTop() >= 0 && t2Var3.getDialogId() != 0 && childAt.getTop() < i10) {
                    i10 = t2Var3.getTop();
                    t2Var2 = t2Var3;
                }
            }
            i3++;
        }
        if (t2Var != null) {
            if (org.telegram.messenger.g0.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        t2Var = t2Var2;
        this.s3 = nvVar;
        if (t2Var != null) {
            if (nvVar != null) {
                nvVar.setPadding(getPaddingLeft(), this.g3, getPaddingLeft(), getPaddingBottom());
                int G = ((kg.m) nvVar.getAdapter()).G(t2Var.getDialogId());
                int top = (int) ((t2Var.getTop() - tj0Var.getPaddingTop()) + f10);
                if (G >= 0) {
                    tw twVar = this.n3;
                    if (twVar.s == 0 && twVar.w == 2 && uwVar.l4()) {
                        z11 = true;
                    }
                    int L = org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z11) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((u4.b0) nvVar.getLayoutManager()).h1(G, top);
                }
            }
            int G2 = ((kg.m) getAdapter()).G(t2Var.getDialogId());
            int top2 = t2Var.getTop() - tj0Var.getPaddingTop();
            if (z10) {
                top2 -= (int) uwVar.O;
            }
            if (G2 >= 0) {
                ((u4.b0) getLayoutManager()).h1(G2, top2);
            }
        }
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.messenger.az.q1 = !org.telegram.messenger.az.q1;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.az.q1);
        edit.apply();
        uw uwVar = this.B3;
        UndoView k42 = uwVar.k4();
        if (!org.telegram.messenger.az.q1) {
            k42.l(0L, 7, null, null);
            D1();
            if (!z10 || t2Var == null) {
                return;
            }
            t2Var.b0();
            t2Var.invalidate();
            return;
        }
        if (t2Var != null) {
            uwVar.f2 = true;
            uwVar.c1 = true;
            int top = (t2Var.getTop() - getPaddingTop()) + t2Var.getMeasuredHeight();
            if (uwVar.L && !uwVar.F0.g()) {
                uwVar.S = true;
                top += org.telegram.messenger.g0.L(81.0f);
            }
            w0(0, top, org.telegram.ui.Components.xq.g);
            if (z10) {
                uwVar.e1 = true;
            } else {
                D1();
            }
        }
        k42.l(0L, 6, null, null);
    }

    public final void D1() {
        int i3 = org.telegram.messenger.az.q1 ? 2 : 0;
        tw twVar = this.n3;
        twVar.w = i3;
        cv cvVar = twVar.n;
        if (cvVar != null) {
            cvVar.X = i3 != 0;
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.n4) || view.isClickable();
    }

    @Override // ei.g7
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        view.setTranslationY(uw.B4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d0  */
    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3;
        org.telegram.ui.Components.ib0 ib0Var;
        float f11;
        float f12;
        Paint paint2;
        float f13;
        boolean z10;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f16;
        int i10;
        int i11;
        org.telegram.ui.Cells.t2 t2Var;
        int i12;
        org.telegram.ui.Cells.t2 t2Var2;
        int i13;
        int i14;
        int i15;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f17 = this.p3;
        org.telegram.ui.ActionBar.e6 e6Var3 = this.o2;
        Paint paint3 = this.q3;
        boolean z11 = true;
        boolean z12 = false;
        if (f17 > 0.0f) {
            canvas2.clipRect(0, 0, org.telegram.messenger.g0.W1(this.p3, getMeasuredWidth(), org.telegram.messenger.g0.L(my0.getRightPaddingSize())), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s9, e6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.p3));
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(my0.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
            org.telegram.ui.ActionBar.k6.k0.setAlpha((int) (this.p3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(my0.getRightPaddingSize()), 0.0f, org.telegram.messenger.g0.L(my0.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
            org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.s3 != null) {
            if (this.t3 == null) {
                this.t3 = new LongSparseArray();
            }
            for (int i16 = 0; i16 < this.s3.getChildCount(); i16++) {
                View childAt = this.s3.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.t2) && childAt.getBottom() > 0) {
                    this.t3.put(((org.telegram.ui.Cells.t2) childAt).getDialogId(), childAt);
                }
            }
        }
        uw uwVar = this.B3;
        float f18 = uwVar.F ? 0.0f : uwVar.O;
        int i17 = TLObject.FLAG_31;
        int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i19 = 0;
        org.telegram.ui.Cells.t2 t2Var3 = null;
        float f19 = 2.14748365E9f;
        float f20 = -2.14748365E9f;
        while (i19 < getChildCount()) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var4 = (org.telegram.ui.Cells.t2) childAt2;
                f16 = 1.0f;
                t2Var4.setRightFragmentOpenedProgress(this.p3);
                if (org.telegram.messenger.g0.Q1()) {
                    e6Var2 = e6Var3;
                    t2Var4.setDialogSelected(t2Var4.getDialogId() == uwVar.q2.a ? z11 : z12);
                } else {
                    e6Var2 = e6Var3;
                }
                LongSparseArray longSparseArray = this.t3;
                if (longSparseArray != null && this.s3 != null) {
                    View view2 = (View) longSparseArray.get(t2Var4.getDialogId());
                    this.t3.delete(t2Var4.getDialogId());
                    if (view2 != null) {
                        this.s3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i17) {
                            i17 = S;
                        }
                        if (S < i18) {
                            i18 = S;
                        }
                        t2Var4.D0 = ((getPaddingTop() + (view2.getTop() - this.s3.getPaddingTop())) - t2Var4.getTop()) * this.p3;
                        if (t2Var4.getTop() + t2Var4.D0 < f19) {
                            f19 = (t2Var4.getTop() + t2Var4.D0) - f18;
                        }
                        float W1 = org.telegram.messenger.g0.W1(this.p3, t2Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + t2Var4.getTop() + t2Var4.D0;
                        if (W1 > f20) {
                            f20 = W1 - f18;
                        }
                    }
                }
                if (this.k3 && t2Var4.i0(0, true) && (R = RecyclerView.R(t2Var4)) >= 0) {
                    getAdapter().g(R);
                }
                if (t2Var4.getDialogId() == uwVar.G3.getCurrentFragmetDialogId()) {
                    t2Var3 = t2Var4;
                    t2Var = t2Var3;
                } else {
                    t2Var = t2Var4;
                }
                i10 = i17;
                i11 = i18;
            } else {
                e6Var2 = e6Var3;
                f16 = 1.0f;
                i10 = i17;
                i11 = i18;
                t2Var = null;
            }
            if (this.s3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (t2Var != null) {
                    t2Var.n = -f18;
                    view = childAt2;
                    i12 = i19;
                    t2Var2 = t2Var3;
                    i13 = i10;
                    i14 = i11;
                    i15 = save;
                } else {
                    i13 = i10;
                    i15 = save;
                    i14 = i11;
                    t2Var2 = t2Var3;
                    i12 = i19;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f16 - this.p3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (t2Var != null && t2Var != t2Var2) {
                    t2Var.D0 = 0.0f;
                    t2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i15);
            } else {
                i12 = i19;
                t2Var2 = t2Var3;
                i13 = i10;
                i14 = i11;
            }
            i19 = i12 + 1;
            t2Var3 = t2Var2;
            i17 = i13;
            e6Var3 = e6Var2;
            i18 = i14;
            z11 = true;
            z12 = false;
        }
        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var3;
        if (t2Var3 != null) {
            ImageReceiver imageReceiver = t2Var3.Z1;
            canvas2.save();
            this.v3 = t2Var3.getY() + t2Var3.D0 + imageReceiver.M0;
            t2Var3.D0 = 0.0f;
            t2Var3.n = 0.0f;
            float f21 = this.w3;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.08f;
                this.w3 = f22;
                f13 = 1.0f;
                this.w3 = Utilities.i(f22, 1.0f, 0.0f);
                invalidate();
            } else {
                f13 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.xq.f.getInterpolation(this.w3);
            if (interpolation != f13) {
                float f23 = this.x3;
                if (f23 != -2.14748365E9f) {
                    if (Math.abs(f23 - this.v3) < getMeasuredHeight() * 0.4f) {
                        this.v3 = org.telegram.messenger.g0.T1(this.x3, this.v3, interpolation);
                    } else {
                        z10 = true;
                        if (this.y3 || !(z10 || this.x3 == -2.14748365E9f)) {
                            f14 = 1.0f;
                            interpolation = this.p3;
                        } else {
                            f14 = 1.0f;
                        }
                        f15 = f14 - interpolation;
                        if (f15 != f14) {
                            f10 = -2.14748365E9f;
                            this.v3 = -2.14748365E9f;
                        } else {
                            f10 = -2.14748365E9f;
                        }
                        float f24 = (-org.telegram.messenger.g0.L(5.0f)) * f15;
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set((-org.telegram.messenger.g0.L(4.0f)) + f24, this.v3 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f) + f24, this.v3 + imageReceiver.O0 + org.telegram.messenger.g0.L(1.0f));
                        if (this.u3 == null) {
                            this.u3 = new Paint(1);
                        }
                        e6Var = e6Var4;
                        this.u3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.u3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.y3) {
            }
            f14 = 1.0f;
            interpolation = this.p3;
            f15 = f14 - interpolation;
            if (f15 != f14) {
            }
            float f242 = (-org.telegram.messenger.g0.L(5.0f)) * f15;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((-org.telegram.messenger.g0.L(4.0f)) + f242, this.v3 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f) + f242, this.v3 + imageReceiver.O0 + org.telegram.messenger.g0.L(1.0f));
            if (this.u3 == null) {
            }
            e6Var = e6Var4;
            this.u3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.u3);
            canvas2.restore();
        } else {
            f10 = -2.14748365E9f;
            e6Var = e6Var4;
            this.v3 = -2.14748365E9f;
        }
        boolean z13 = false;
        if (this.t3 != null) {
            float f25 = 2.14748365E9f;
            for (int i20 = 0; i20 < this.t3.size(); i20++) {
                View view3 = (View) this.t3.valueAt(i20);
                this.s3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i18 && view3.getTop() > f10) {
                    f10 = view3.getTop();
                }
                if (S2 > i17 && view3.getBottom() < f25) {
                    f25 = view3.getBottom();
                }
            }
            for (int i21 = 0; i21 < this.t3.size(); i21++) {
                View view4 = (View) this.t3.valueAt(i21);
                if (view4 instanceof org.telegram.ui.Cells.t2) {
                    this.s3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.t2 t2Var5 = (org.telegram.ui.Cells.t2) view4;
                    t2Var5.k0 = false;
                    t2Var5.x();
                    t2Var5.k0 = true;
                    t2Var5.setRightFragmentOpenedProgress(this.p3);
                    int save2 = canvas2.save();
                    if (S3 > i17) {
                        canvas2.translate(view4.getX(), (f20 + view4.getBottom()) - f25);
                    } else {
                        canvas2.translate(view4.getX(), (f20 + view4.getTop()) - f10);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
            }
            this.t3.clear();
            z13 = false;
        }
        this.k3 = z13;
        if (this.s3 != null) {
            invalidate();
        }
        if (this.s3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            int i22 = 0;
            while (i22 < getChildCount()) {
                View childAt3 = getChildAt(i22);
                if (((childAt3 instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) childAt3).r) || ((childAt3 instanceof kg.l) && ((kg.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y9 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.r3;
                        rectF3.set(x10, y9, x11, y10);
                        canvas2.saveLayerAlpha(rectF3, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    paint2 = paint;
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint2);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                i22++;
                paint = paint2;
            }
            invalidate();
        }
        org.telegram.ui.Cells.t2 t2Var6 = uwVar.X0;
        if (t2Var6 != null && (ib0Var = uwVar.W0) != null) {
            int measuredHeight = (uwVar.X0.getMeasuredHeight() / 2) + t2Var6.getTop();
            Paint paint4 = ib0Var.b;
            View view5 = ib0Var.c;
            RectF rectF4 = ib0Var.f;
            Paint paint5 = ib0Var.a;
            int L = org.telegram.messenger.g0.L(110.0f);
            int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * ib0Var.h) - org.telegram.messenger.k5.D(62.0f, 3, L);
            int i23 = L / 2;
            int i24 = measuredHeight - i23;
            paint5.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            int i25 = L2 / 2;
            float f26 = measuredHeight - i25;
            float f27 = i23 + measuredWidth;
            float f28 = i25 + measuredHeight + 1;
            canvas.drawRect(0.0f, f26, f27, f28, paint5);
            paint5.setColor(-69120);
            float f29 = L + measuredWidth;
            rectF4.set(measuredWidth, i24, f29, i24 + L);
            float f30 = ib0Var.g;
            float f31 = 35.0f;
            int x12 = (int) (f30 < 0.5f ? org.telegram.messenger.camera.q.x(f30, 0.5f, 1.0f, 35.0f) : ((f30 - 0.5f) * 35.0f) / 0.5f);
            float f32 = x12;
            float f33 = 360 - (x12 * 2);
            canvas.drawArc(rectF4, f32, f33, true, paint4);
            canvas.drawArc(rectF4, f32, f33, true, paint5);
            paint5.setColor(-16777216);
            float f34 = 8.0f;
            canvas.drawCircle(f27 - org.telegram.messenger.g0.L(8.0f), (L / 4) + i24, org.telegram.messenger.g0.L(8.0f), paint5);
            canvas.save();
            float f35 = 20.0f;
            canvas.translate(org.telegram.messenger.g0.L(20.0f) + f29, measuredHeight - org.telegram.messenger.g0.L(25.0f));
            int i26 = 0;
            for (int i27 = 3; i26 < i27; i27 = 3) {
                Path path = ib0Var.j;
                float f36 = f34;
                if (path != null) {
                    f11 = f35;
                    if (ib0Var.k == ib0Var.l) {
                        f12 = f31;
                        canvas.drawPath(ib0Var.j, paint4);
                        if (i26 != 0) {
                            paint5.setColor(-90112);
                        } else if (i26 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(ib0Var.j, paint5);
                        paint5.setColor(-1);
                        rectF4.set(org.telegram.messenger.g0.L(f36), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        paint5.setColor(-16777216);
                        rectF4.set(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        canvas.translate(org.telegram.messenger.g0.L(62.0f), 0.0f);
                        i26++;
                        f31 = f12;
                        f34 = f36;
                        f35 = f11;
                    }
                } else {
                    f11 = f35;
                }
                if (path == null) {
                    ib0Var.j = new Path();
                }
                ib0Var.j.reset();
                boolean z14 = ib0Var.k;
                ib0Var.l = z14;
                if (z14) {
                    ib0Var.j.moveTo(0.0f, org.telegram.messenger.g0.L(50.0f));
                    ib0Var.j.lineTo(0.0f, org.telegram.messenger.g0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(24.0f));
                    ib0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(50.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(r4), org.telegram.messenger.g0.L(43.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(50.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(43.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(50.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(43.0f));
                    f12 = f31;
                } else {
                    f12 = f31;
                    ib0Var.j.moveTo(0.0f, org.telegram.messenger.g0.L(43.0f));
                    ib0Var.j.lineTo(0.0f, org.telegram.messenger.g0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(24.0f));
                    ib0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(43.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(50.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(43.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(50.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(43.0f));
                    ib0Var.j.lineTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
                }
                ib0Var.j.close();
                canvas.drawPath(ib0Var.j, paint4);
                if (i26 != 0) {
                }
                canvas.drawPath(ib0Var.j, paint5);
                paint5.setColor(-1);
                rectF4.set(org.telegram.messenger.g0.L(f36), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(28.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(28.0f));
                canvas.drawOval(rectF4, paint5);
                paint5.setColor(-16777216);
                rectF4.set(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(24.0f));
                canvas.drawOval(rectF4, paint5);
                canvas.translate(org.telegram.messenger.g0.L(62.0f), 0.0f);
                i26++;
                f31 = f12;
                f34 = f36;
                f35 = f11;
            }
            canvas.restore();
            if (ib0Var.h >= 1.0f) {
                ib0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - ib0Var.e;
            ib0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (ib0Var.g >= 1.0f) {
                ib0Var.g = 0.0f;
            }
            float f37 = j10;
            float f38 = (f37 / 400.0f) + ib0Var.g;
            ib0Var.g = f38;
            if (f38 > 1.0f) {
                ib0Var.g = 1.0f;
            }
            float f39 = (f37 / 2000.0f) + ib0Var.h;
            ib0Var.h = f39;
            if (f39 > 1.0f) {
                ib0Var.h = 1.0f;
            }
            float f40 = (f37 / 200.0f) + ib0Var.i;
            ib0Var.i = f40;
            if (f40 >= 1.0f) {
                ib0Var.k = !ib0Var.k;
                ib0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.z3 == null) {
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            ei.z9[] z9VarArr = ei.z9.f;
            if (z9VarArr[i3] == null) {
                z9VarArr[i3] = new ei.z9(i3);
            }
            this.z3 = z9VarArr[i3];
        }
        this.z3.a(this);
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.B3.O) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return uw.B4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        tw twVar = this.n3;
        if (twVar.n != null && uw.B4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            twVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.W1) {
            return false;
        }
        uw uwVar = this.B3;
        if (uwVar.c1 || this.n3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            uwVar.d1 = !kVar.v();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.o3 = getPaddingTop();
        this.B3.z3 = 0.0f;
        this.n3.getClass();
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        tw[] twVarArr;
        AnimatorSet animatorSet;
        tw twVar = this.n3;
        int L0 = twVar.c.L0();
        uw uwVar = this.B3;
        if (L0 != -1 && twVar.e.E == 0 && twVar.c.y < 0 && twVar.a.getScrollState() != 1) {
            u4.d1 K = twVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (twVar.s == 0 && uwVar.l4() && twVar.w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.m3 = true;
                twVar.c.h1(L0, (int) ((top - this.o3) + uwVar.z3 + 0));
                this.m3 = false;
            }
        } else if (L0 == -1 && this.l3) {
            twVar.c.h1((twVar.s == 0 && uwVar.l4()) ? 1 : 0, (int) uwVar.O);
        }
        this.m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        int i11 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        if (uwVar.L && !uwVar.P) {
            i11 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!uwVar.P) {
            i11 += org.telegram.messenger.g0.L(48.0f);
        }
        this.A3 = 0;
        float e42 = uwVar.e4(false);
        org.telegram.ui.Components.pr prVar = uwVar.K1;
        float f10 = prVar != null ? prVar.getMetadata().c.a : 0.0f;
        int L = i11 + ((int) (org.telegram.messenger.g0.L(50.0f) * e42));
        this.A3 += (int) (org.telegram.messenger.g0.L(50.0f) * e42);
        org.telegram.ui.Components.pr prVar2 = uwVar.K1;
        if (prVar2 != null) {
            int c2 = (int) prVar2.c(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            L += c2;
            this.A3 += c2;
        }
        int L2 = L - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.A3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = uwVar.w3();
        if (L2 != this.g3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (uwVar.L) {
                twVar.x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                twVar.x.setPaddingTop(L2);
            }
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof kg.l) {
                    getChildAt(i12).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && uwVar.getMessagesController().Z1) {
            if (twVar.s == 0 && uwVar.l4()) {
                this.m3 = true;
                ((u4.b0) getLayoutManager()).h1(1, (int) uwVar.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i3, i10);
        if (uwVar.m2 || L2 == 0 || (twVarArr = uwVar.f0) == null || twVarArr.length <= 1 || uwVar.n3 || (animatorSet = uwVar.h3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u4.d1 d1Var;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!this.W1) {
            uw uwVar = this.B3;
            if (!uwVar.c1 && !uwVar.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                tw twVar = this.n3;
                if (action == 1 || action == 3) {
                    u4.y yVar = twVar.e;
                    if (yVar.E != 0) {
                        sw swVar = twVar.f;
                        if (swVar.e) {
                            swVar.f = true;
                            if (yVar.i(null, 4) != 0 && (d1Var = twVar.f.d) != null) {
                                View view = d1Var.a;
                                if (view instanceof org.telegram.ui.Cells.t2) {
                                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                                    long dialogId = t2Var.getDialogId();
                                    if (org.telegram.messenger.m5.D(dialogId)) {
                                        C1(false, t2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) uwVar.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (org.telegram.messenger.t3.Y(uwVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                uwVar.D4(arrayList, org.telegram.messenger.hs.w1, true, false, null);
                                            } else {
                                                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                if (org.telegram.messenger.az.m(i3) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    uwVar.O2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    uwVar.D4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                    if (org.telegram.messenger.az.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                        if (org.telegram.messenger.az.m(i11) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            uwVar.P2 = !uwVar.s4(dialog) ? 1 : 0;
                                                            uwVar.D4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                            if (org.telegram.messenger.az.m(i12) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                uwVar.D4(arrayList4, org.telegram.messenger.hs.n1, true, false, null);
                                                            }
                                                        }
                                                    } else if (uwVar.getMessagesController().r2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                                        uwVar.Q2 = !org.telegram.messenger.hp.s1(i13).r2(dialogId, 0L, null) ? 1 : 0;
                                                        uwVar.R2 = uwVar.Q2 > 0 ? 0 : 1;
                                                        uwVar.D4(arrayList5, org.telegram.messenger.hs.p1, true, false, null);
                                                    } else {
                                                        org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.fc.a(uwVar)) {
                                                            org.telegram.ui.Components.fc.z(uwVar, 3, 0, null).j();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (twVar.s == 0 && ((action == 1 || action == 3) && twVar.w == 2 && uwVar.l4() && ((u4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.t2 c42 = uw.c4(twVar);
                    if (c42 != null) {
                        int L = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.az.p1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - uwVar.e3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            uwVar.f2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                            i14 = 2;
                            twVar.w = 2;
                        } else {
                            if (twVar.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    uwVar.f2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                                }
                                if (!uwVar.g3) {
                                    uwVar.g3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    cv cvVar = twVar.n;
                                    if (cvVar != null) {
                                        cvVar.a(true);
                                    }
                                }
                                c42.h0();
                                twVar.w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.bd.M0(2131754923, null));
                                }
                            }
                            i14 = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i14];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new b3(this, 9));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.camera.q.v(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Cells.w9(this, 27));
                            ofFloat.start();
                        }
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
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(u4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.p3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        uw.B4 = f10;
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

    @Override // org.telegram.ui.Components.tj0
    public final boolean w1() {
        return true;
    }

    @Override // org.telegram.ui.Components.w9
    public final int z1() {
        return org.telegram.messenger.g0.L(48.0f);
    }
}
