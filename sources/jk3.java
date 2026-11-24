// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jk3 extends rm0 implements o4b {
    public static final /* synthetic */ int C3 = 0;
    public int A3;
    public final /* synthetic */ nk3 B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final mk3 n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public bj3 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public j9c z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk3(nk3 nk3Var, Context context, mk3 mk3Var) {
        super(context, null);
        this.B3 = nk3Var;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = mk3Var;
        this.i3 = gm.L(200.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r4.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(bj3 bj3Var, float f, boolean z) {
        nk3 nk3Var;
        ViewGroup viewGroup = bj3Var == null ? this.s3 : this;
        if (viewGroup == null) {
            this.s3 = bj3Var;
            return;
        }
        boolean z2 = false;
        hg3 hg3Var = null;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        hg3 hg3Var2 = null;
        while (true) {
            int childCount = viewGroup.getChildCount();
            nk3Var = this.B3;
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof hg3) {
                hg3 hg3Var3 = (hg3) childAt;
                if (hg3Var3.getDialogId() == nk3Var.H3.getCurrentFragmetDialogId()) {
                    hg3Var = hg3Var3;
                }
                if (childAt.getTop() >= 0 && hg3Var3.getDialogId() != 0 && childAt.getTop() < i2) {
                    i2 = hg3Var3.getTop();
                    hg3Var2 = hg3Var3;
                }
            }
            i++;
        }
        if (hg3Var != null) {
            if (gm.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        hg3Var = hg3Var2;
        this.s3 = bj3Var;
        if (hg3Var != null) {
            if (bj3Var != null) {
                bj3Var.setPadding(getPaddingLeft(), this.g3, getPaddingLeft(), getPaddingBottom());
                int G = ((zk3) bj3Var.getAdapter()).G(hg3Var.getDialogId());
                int top = (int) ((hg3Var.getTop() - viewGroup.getPaddingTop()) + f);
                if (G >= 0) {
                    mk3 mk3Var = this.n3;
                    if (mk3Var.s == 0 && mk3Var.w == 2 && nk3Var.y3()) {
                        z2 = true;
                    }
                    int L = gm.L(gda.l1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z2) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((u46) bj3Var.getLayoutManager()).g1(G, top);
                }
            }
            int G2 = ((zk3) getAdapter()).G(hg3Var.getDialogId());
            int top2 = hg3Var.getTop() - viewGroup.getPaddingTop();
            if (z) {
                top2 -= (int) nk3Var.O;
            }
            if (G2 >= 0) {
                ((u46) getLayoutManager()).g1(G2, top2);
            }
        }
    }

    public final void C1(boolean z, hg3 hg3Var) {
        gda.m1 = !gda.m1;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putBoolean("archiveHidden", gda.m1);
        edit.apply();
        nk3 nk3Var = this.B3;
        UndoView w3 = nk3Var.w3();
        if (!gda.m1) {
            w3.l(0L, 7, null, null);
            D1();
            if (!z || hg3Var == null) {
                return;
            }
            hg3Var.c0();
            hg3Var.invalidate();
            return;
        }
        if (hg3Var != null) {
            nk3Var.g2 = true;
            nk3Var.d1 = true;
            int top = (hg3Var.getTop() - getPaddingTop()) + hg3Var.getMeasuredHeight();
            if (nk3Var.L && !nk3Var.F0.g()) {
                nk3Var.S = true;
                top += gm.L(81.0f);
            }
            x0(0, top, d53.g);
            if (z) {
                nk3Var.f1 = true;
            } else {
                D1();
            }
        }
        w3.l(0L, 6, null, null);
    }

    public final void D1() {
        byte b = gda.m1 ? (byte) 2 : (byte) 0;
        mk3 mk3Var = this.n3;
        mk3Var.w = b;
        pi3 pi3Var = mk3Var.n;
        if (pi3Var != null) {
            pi3Var.X = b != 0;
        }
    }

    @Override // r59
    public final boolean G0(View view) {
        return !(view instanceof jf5) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(nk3.H4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // o4b
    public final void b(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02c4  */
    @Override // rm0, r59, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f;
        ylb ylbVar;
        int i;
        nt7 nt7Var;
        float f2;
        float f3;
        Paint paint2;
        LongSparseArray longSparseArray;
        float f4;
        boolean z;
        float f5;
        float f6;
        Paint paint3;
        ylb ylbVar2;
        float f7;
        int i2;
        int i3;
        hg3 hg3Var;
        int i4;
        hg3 hg3Var2;
        int i5;
        int i6;
        int i7;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f8 = this.p3;
        ylb ylbVar3 = this.o2;
        Paint paint4 = this.q3;
        boolean z2 = true;
        boolean z3 = false;
        if (f8 > 0.0f) {
            canvas2.clipRect(0, 0, gm.U1(this.p3, getMeasuredWidth(), gm.L(el9.getRightPaddingSize())), getMeasuredHeight());
            paint4.setColor(cmb.v0(cmb.r9, ylbVar3));
            paint4.setAlpha((int) (paint4.getAlpha() * this.p3));
            canvas2.drawRect(0.0f, 0.0f, gm.L(el9.getRightPaddingSize()), getMeasuredHeight(), paint4);
            paint = paint4;
            int alpha = cmb.j0.getAlpha();
            cmb.j0.setAlpha((int) (this.p3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(gm.L(el9.getRightPaddingSize()), 0.0f, gm.L(el9.getRightPaddingSize()) - 1, getMeasuredHeight(), cmb.j0);
            cmb.j0.setAlpha(alpha);
        } else {
            paint = paint4;
        }
        if (this.s3 != null) {
            if (this.t3 == null) {
                this.t3 = new LongSparseArray();
            }
            for (int i8 = 0; i8 < this.s3.getChildCount(); i8++) {
                View childAt = this.s3.getChildAt(i8);
                if ((childAt instanceof hg3) && childAt.getBottom() > 0) {
                    this.t3.put(((hg3) childAt).getDialogId(), childAt);
                }
            }
        }
        nk3 nk3Var = this.B3;
        float f9 = nk3Var.F ? 0.0f : nk3Var.O;
        int i9 = TLObject.FLAG_31;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        hg3 hg3Var3 = null;
        float f10 = 2.1474836E9f;
        float f11 = -2.1474836E9f;
        while (i11 < getChildCount()) {
            View childAt2 = getChildAt(i11);
            if (childAt2 instanceof hg3) {
                hg3 hg3Var4 = (hg3) childAt2;
                f7 = 1.0f;
                hg3Var4.setRightFragmentOpenedProgress(this.p3);
                if (gm.O1()) {
                    ylbVar2 = ylbVar3;
                    hg3Var4.setDialogSelected(hg3Var4.getDialogId() == nk3Var.r2.a ? z2 : z3);
                } else {
                    ylbVar2 = ylbVar3;
                }
                LongSparseArray longSparseArray2 = this.t3;
                if (longSparseArray2 != null && this.s3 != null) {
                    View view2 = (View) longSparseArray2.get(hg3Var4.getDialogId());
                    this.t3.delete(hg3Var4.getDialogId());
                    if (view2 != null) {
                        this.s3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i9) {
                            i9 = S;
                        }
                        if (S < i10) {
                            i10 = S;
                        }
                        hg3Var4.D0 = ((getPaddingTop() + (view2.getTop() - this.s3.getPaddingTop())) - hg3Var4.getTop()) * this.p3;
                        if (hg3Var4.getTop() + hg3Var4.D0 < f10) {
                            f10 = (hg3Var4.getTop() + hg3Var4.D0) - f9;
                        }
                        float U1 = gm.U1(this.p3, hg3Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + hg3Var4.getTop() + hg3Var4.D0;
                        if (U1 > f11) {
                            f11 = U1 - f9;
                        }
                    }
                }
                if (this.k3 && hg3Var4.j0(0, true) && (R = RecyclerView.R(hg3Var4)) >= 0) {
                    getAdapter().g(R);
                }
                if (hg3Var4.getDialogId() == nk3Var.H3.getCurrentFragmetDialogId()) {
                    hg3Var3 = hg3Var4;
                    hg3Var = hg3Var3;
                } else {
                    hg3Var = hg3Var4;
                }
                i2 = i9;
                i3 = i10;
            } else {
                ylbVar2 = ylbVar3;
                f7 = 1.0f;
                i2 = i9;
                i3 = i10;
                hg3Var = null;
            }
            if (this.s3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (hg3Var != null) {
                    hg3Var.n = -f9;
                    view = childAt2;
                    i4 = i11;
                    hg3Var2 = hg3Var3;
                    i5 = i2;
                    i6 = i3;
                    i7 = save;
                } else {
                    i5 = i2;
                    i7 = save;
                    i6 = i3;
                    hg3Var2 = hg3Var3;
                    i4 = i11;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f7 - this.p3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (hg3Var != null && hg3Var != hg3Var2) {
                    hg3Var.D0 = 0.0f;
                    hg3Var.n = 0.0f;
                }
                canvas2.restoreToCount(i7);
            } else {
                i4 = i11;
                hg3Var2 = hg3Var3;
                i5 = i2;
                i6 = i3;
            }
            i11 = i4 + 1;
            hg3Var3 = hg3Var2;
            i9 = i5;
            ylbVar3 = ylbVar2;
            i10 = i6;
            z2 = true;
            z3 = false;
        }
        ylb ylbVar4 = ylbVar3;
        if (hg3Var3 != null) {
            ImageReceiver imageReceiver = hg3Var3.Z1;
            canvas2.save();
            this.v3 = hg3Var3.getY() + hg3Var3.D0 + imageReceiver.M0;
            hg3Var3.D0 = 0.0f;
            hg3Var3.n = 0.0f;
            float f12 = this.w3;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.08f;
                this.w3 = f13;
                f4 = 1.0f;
                this.w3 = Utilities.i(f13, 1.0f, 0.0f);
                invalidate();
            } else {
                f4 = 1.0f;
            }
            float interpolation = d53.f.getInterpolation(this.w3);
            if (interpolation != f4) {
                float f14 = this.x3;
                if (f14 != -2.1474836E9f) {
                    if (Math.abs(f14 - this.v3) < getMeasuredHeight() * 0.4f) {
                        this.v3 = gm.R1(this.x3, this.v3, interpolation);
                    } else {
                        z = true;
                        if (this.y3 || !(z || this.x3 == -2.1474836E9f)) {
                            f5 = 1.0f;
                            interpolation = this.p3;
                        } else {
                            f5 = 1.0f;
                        }
                        f6 = f5 - interpolation;
                        if (f6 != f5) {
                            f = -2.1474836E9f;
                            this.v3 = -2.1474836E9f;
                        } else {
                            f = -2.1474836E9f;
                        }
                        float f15 = (-gm.L(5.0f)) * f6;
                        RectF rectF = gm.P;
                        rectF.set((-gm.L(4.0f)) + f15, this.v3 - gm.L(1.0f), gm.L(4.0f) + f15, this.v3 + imageReceiver.O0 + gm.L(1.0f));
                        paint3 = this.u3;
                        if (paint3 == null) {
                            paint3 = new Paint(1);
                            this.u3 = paint3;
                        }
                        ylbVar = ylbVar4;
                        paint3.setColor(cmb.v0(cmb.Ei, ylbVar));
                        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), this.u3);
                        canvas2.restore();
                    }
                }
            }
            z = false;
            if (this.y3) {
            }
            f5 = 1.0f;
            interpolation = this.p3;
            f6 = f5 - interpolation;
            if (f6 != f5) {
            }
            float f152 = (-gm.L(5.0f)) * f6;
            RectF rectF2 = gm.P;
            rectF2.set((-gm.L(4.0f)) + f152, this.v3 - gm.L(1.0f), gm.L(4.0f) + f152, this.v3 + imageReceiver.O0 + gm.L(1.0f));
            paint3 = this.u3;
            if (paint3 == null) {
            }
            ylbVar = ylbVar4;
            paint3.setColor(cmb.v0(cmb.Ei, ylbVar));
            canvas2.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), this.u3);
            canvas2.restore();
        } else {
            f = -2.1474836E9f;
            ylbVar = ylbVar4;
            this.v3 = -2.1474836E9f;
        }
        boolean z4 = false;
        if (this.t3 != null) {
            float f16 = 2.1474836E9f;
            for (int i12 = 0; i12 < this.t3.size(); i12++) {
                View view3 = (View) this.t3.valueAt(i12);
                this.s3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i10 && view3.getTop() > f) {
                    f = view3.getTop();
                }
                if (S2 > i9 && view3.getBottom() < f16) {
                    f16 = view3.getBottom();
                }
            }
            int i13 = 0;
            while (true) {
                int size = this.t3.size();
                longSparseArray = this.t3;
                if (i13 >= size) {
                    break;
                }
                View view4 = (View) longSparseArray.valueAt(i13);
                if (view4 instanceof hg3) {
                    this.s3.getClass();
                    int S3 = RecyclerView.S(view4);
                    hg3 hg3Var5 = (hg3) view4;
                    hg3Var5.k0 = false;
                    hg3Var5.x();
                    hg3Var5.k0 = true;
                    hg3Var5.setRightFragmentOpenedProgress(this.p3);
                    int save2 = canvas2.save();
                    if (S3 > i9) {
                        canvas2.translate(view4.getX(), (f11 + view4.getBottom()) - f16);
                    } else {
                        canvas2.translate(view4.getX(), (f11 + view4.getTop()) - f);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
                i13++;
            }
            longSparseArray.clear();
            z4 = false;
        }
        this.k3 = z4;
        if (this.s3 != null) {
            invalidate();
        }
        if (this.s3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(cmb.v0(cmb.c6, ylbVar));
            int i14 = 0;
            while (i14 < getChildCount()) {
                View childAt3 = getChildAt(i14);
                if (((childAt3 instanceof hg3) && ((hg3) childAt3).r) || ((childAt3 instanceof yk3) && ((yk3) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x = childAt3.getX();
                        float y = childAt3.getY();
                        float x2 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y2 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.r3;
                        rectF3.set(x, y, x2, y2);
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
                i14++;
                paint = paint2;
            }
            invalidate();
        }
        hg3 hg3Var6 = nk3Var.Y0;
        if (hg3Var6 != null && (nt7Var = nk3Var.X0) != null) {
            int measuredHeight = (nk3Var.Y0.getMeasuredHeight() / 2) + hg3Var6.getTop();
            Paint paint5 = nt7Var.b;
            View view5 = nt7Var.c;
            RectF rectF4 = nt7Var.f;
            Paint paint6 = nt7Var.a;
            int L = gm.L(110.0f);
            int L2 = gm.L(gda.l1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * nt7Var.h) - hg9.y(62.0f, 3, L);
            int i15 = L / 2;
            int i16 = measuredHeight - i15;
            paint6.setColor(cmb.w0(null, cmb.c6, false));
            int i17 = L2 / 2;
            float f17 = measuredHeight - i17;
            float f18 = i15 + measuredWidth;
            float f19 = i17 + measuredHeight + 1;
            canvas.drawRect(0.0f, f17, f18, f19, paint6);
            paint6.setColor(-69120);
            float f20 = L + measuredWidth;
            rectF4.set(measuredWidth, i16, f20, i16 + L);
            float f21 = nt7Var.g;
            float f22 = 35.0f;
            int e = (int) (f21 < 0.5f ? hg9.e(f21, 0.5f, 1.0f, 35.0f) : ((f21 - 0.5f) * 35.0f) / 0.5f);
            float f23 = e;
            float f24 = 360 - (e << 1);
            canvas.drawArc(rectF4, f23, f24, true, paint5);
            canvas.drawArc(rectF4, f23, f24, true, paint6);
            paint6.setColor(-16777216);
            float f25 = 8.0f;
            canvas.drawCircle(f18 - gm.L(8.0f), (L / 4) + i16, gm.L(8.0f), paint6);
            canvas.save();
            float f26 = 20.0f;
            canvas.translate(gm.L(20.0f) + f20, measuredHeight - gm.L(25.0f));
            int i18 = 0;
            for (int i19 = 3; i18 < i19; i19 = 3) {
                Path path = nt7Var.j;
                float f27 = f25;
                if (path != null) {
                    f2 = f26;
                    if (nt7Var.k == nt7Var.l) {
                        f3 = f22;
                        canvas.drawPath(nt7Var.j, paint5);
                        if (i18 != 0) {
                            paint6.setColor(-90112);
                        } else if (i18 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(nt7Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(gm.L(f27), gm.L(14.0f), gm.L(f2), gm.L(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(gm.L(24.0f), gm.L(14.0f), gm.L(36.0f), gm.L(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(gm.L(14.0f), gm.L(18.0f), gm.L(19.0f), gm.L(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(gm.L(30.0f), gm.L(18.0f), gm.L(f3), gm.L(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(gm.L(62.0f), 0.0f);
                        i18++;
                        f22 = f3;
                        f25 = f27;
                        f26 = f2;
                    }
                } else {
                    f2 = f26;
                    path = new Path();
                    nt7Var.j = path;
                }
                path.reset();
                boolean z5 = nt7Var.k;
                nt7Var.l = z5;
                Path path2 = nt7Var.j;
                if (z5) {
                    path2.moveTo(0.0f, gm.L(50.0f));
                    nt7Var.j.lineTo(0.0f, gm.L(24.0f));
                    rectF4.set(0.0f, 0.0f, gm.L(42.0f), gm.L(24.0f));
                    nt7Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    nt7Var.j.lineTo(gm.L(42.0f), gm.L(50.0f));
                    nt7Var.j.lineTo(gm.L(r4), gm.L(43.0f));
                    nt7Var.j.lineTo(gm.L(28.0f), gm.L(50.0f));
                    nt7Var.j.lineTo(gm.L(21.0f), gm.L(43.0f));
                    nt7Var.j.lineTo(gm.L(14.0f), gm.L(50.0f));
                    nt7Var.j.lineTo(gm.L(7.0f), gm.L(43.0f));
                    f3 = f22;
                } else {
                    f3 = f22;
                    path2.moveTo(0.0f, gm.L(43.0f));
                    nt7Var.j.lineTo(0.0f, gm.L(24.0f));
                    rectF4.set(0.0f, 0.0f, gm.L(42.0f), gm.L(24.0f));
                    nt7Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    nt7Var.j.lineTo(gm.L(42.0f), gm.L(43.0f));
                    nt7Var.j.lineTo(gm.L(f3), gm.L(50.0f));
                    nt7Var.j.lineTo(gm.L(28.0f), gm.L(43.0f));
                    nt7Var.j.lineTo(gm.L(21.0f), gm.L(50.0f));
                    nt7Var.j.lineTo(gm.L(14.0f), gm.L(43.0f));
                    nt7Var.j.lineTo(gm.L(7.0f), gm.L(50.0f));
                }
                nt7Var.j.close();
                canvas.drawPath(nt7Var.j, paint5);
                if (i18 != 0) {
                }
                canvas.drawPath(nt7Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(gm.L(f27), gm.L(14.0f), gm.L(f2), gm.L(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(gm.L(24.0f), gm.L(14.0f), gm.L(36.0f), gm.L(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(gm.L(14.0f), gm.L(18.0f), gm.L(19.0f), gm.L(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(gm.L(30.0f), gm.L(18.0f), gm.L(f3), gm.L(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(gm.L(62.0f), 0.0f);
                i18++;
                f22 = f3;
                f25 = f27;
                f26 = f2;
            }
            canvas.restore();
            if (nt7Var.h >= 1.0f) {
                nt7Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - nt7Var.e;
            nt7Var.e = currentTimeMillis;
            if (j > 17) {
                j = 17;
            }
            float f28 = nt7Var.g;
            if (f28 >= 1.0f) {
                nt7Var.g = 0.0f;
                f28 = 0.0f;
            }
            float f29 = j;
            float f30 = (f29 / 400.0f) + f28;
            nt7Var.g = f30;
            if (f30 > 1.0f) {
                nt7Var.g = 1.0f;
            }
            float f31 = (f29 / 2000.0f) + nt7Var.h;
            nt7Var.h = f31;
            if (f31 > 1.0f) {
                nt7Var.h = 1.0f;
            }
            float f32 = (f29 / 200.0f) + nt7Var.i;
            nt7Var.i = f32;
            if (f32 >= 1.0f) {
                nt7Var.k = !nt7Var.k;
                nt7Var.i = 0.0f;
            }
            view5.invalidate();
        }
        j9c j9cVar = this.z3;
        if (j9cVar == null) {
            i = ((d) nk3Var).currentAccount;
            j9c[] j9cVarArr = j9c.f;
            if (j9cVarArr[i] == null) {
                j9cVarArr[i] = new j9c(i);
            }
            j9cVar = j9cVarArr[i];
            this.z3 = j9cVar;
        }
        j9cVar.a(this);
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.B3.O) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // rm0, r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof hg3) && ((hg3) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public float getViewOffset() {
        return nk3.H4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        mk3 mk3Var = this.n3;
        if (mk3Var.n != null && nk3.H4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            mk3Var.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.W1) {
            return false;
        }
        nk3 nk3Var = this.B3;
        if (nk3Var.d1 || this.n3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            aVar = ((d) nk3Var).actionBar;
            nk3Var.e1 = !aVar.y();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.n3.getClass();
    }

    @Override // rm0, r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        mk3[] mk3VarArr;
        AnimatorSet animatorSet;
        mk3 mk3Var = this.n3;
        int K0 = mk3Var.c.K0();
        nk3 nk3Var = this.B3;
        if (K0 != -1 && mk3Var.e.E == 0 && mk3Var.c.y < 0 && mk3Var.a.getScrollState() != 1) {
            u69 K = mk3Var.a.K(K0);
            if (K == null) {
                K = mk3Var.a.L(K0, false);
            }
            if (K != null) {
                int top = K.a.getTop();
                if (mk3Var.s == 0 && nk3Var.y3() && mk3Var.w == 2) {
                    K0 = Math.max(1, K0);
                }
                this.m3 = true;
                mk3Var.c.g1(K0, (int) ((top - this.o3) + nk3Var.A3 + 0.0f));
                this.m3 = false;
            }
        } else if (K0 == -1 && this.l3) {
            mk3Var.c.g1((mk3Var.s == 0 && nk3Var.y3()) ? 1 : 0, (int) nk3Var.O);
        }
        this.m3 = true;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((d) nk3Var).actionBar;
        int i3 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? gm.m : 0);
        if (nk3Var.L && !nk3Var.P) {
            i3 += gm.L(81.0f);
        }
        if (!nk3Var.P) {
            i3 += gm.L(48.0f);
        }
        this.A3 = 0;
        float p3 = nk3Var.p3(false);
        qk3 qk3Var = nk3Var.L1;
        float f = qk3Var != null ? qk3Var.getMetadata().c.a : 0.0f;
        float L = gm.L(50.0f);
        ak3 ak3Var = nk3Var.A0;
        int unreadOnlyBannerHeight = (int) ((L + (ak3Var != null ? ak3Var.getUnreadOnlyBannerHeight() : 0.0f)) * p3);
        int i4 = i3 + unreadOnlyBannerHeight;
        this.A3 += unreadOnlyBannerHeight;
        qk3 qk3Var2 = nk3Var.L1;
        if (qk3Var2 != null) {
            int c = (int) qk3Var2.c(gm.R1(gm.L(14.0f), gm.L(7.0f), p3));
            i4 += c;
            this.A3 += c;
        }
        int L2 = i4 - gm.L(Math.max(p3, f) * 5.0f);
        this.A3 -= gm.L(Math.max(p3, f) * 5.0f);
        int F2 = nk3Var.F2();
        if (L2 != this.g3 || F2 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, F2);
            boolean z = nk3Var.L;
            tk4 tk4Var = mk3Var.x;
            if (z) {
                tk4Var.setPaddingTop(L2 - gm.L(81.0f));
            } else {
                tk4Var.setPaddingTop(L2);
            }
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (getChildAt(i5) instanceof yk3) {
                    getChildAt(i5).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && nk3Var.getMessagesController().R1) {
            if (mk3Var.s == 0 && nk3Var.y3()) {
                this.m3 = true;
                ((u46) getLayoutManager()).g1(1, (int) nk3Var.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i, i2);
        if (nk3Var.n2 || L2 == 0 || (mk3VarArr = nk3Var.f0) == null || mk3VarArr.length <= 1 || nk3Var.o3 || (animatorSet = nk3Var.i3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u69 u69Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!this.W1) {
            nk3 nk3Var = this.B3;
            if (!nk3Var.d1 && !nk3Var.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                mk3 mk3Var = this.n3;
                if (action == 1 || action == 3) {
                    hu5 hu5Var = mk3Var.e;
                    if (hu5Var.E != 0) {
                        lk3 lk3Var = mk3Var.f;
                        if (lk3Var.f) {
                            lk3Var.g = true;
                            if (hu5Var.i(null, 4) != 0 && (u69Var = mk3Var.f.e) != null) {
                                View view = u69Var.a;
                                if (view instanceof hg3) {
                                    hg3 hg3Var = (hg3) view;
                                    long dialogId = hg3Var.getDialogId();
                                    if (pg3.C(dialogId)) {
                                        C1(false, hg3Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (sd2.Y(nk3Var.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                nk3Var.K4(arrayList, nm7.v1, true, false, null);
                                            } else {
                                                i = ((d) nk3Var).currentAccount;
                                                if (gda.m(i) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    nk3Var.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    nk3Var.K4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i2 = ((d) nk3Var).currentAccount;
                                                    if (gda.m(i2) != 3) {
                                                        i3 = ((d) nk3Var).currentAccount;
                                                        if (gda.m(i3) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            nk3Var.Q2 = !nk3Var.H3(dialog) ? 1 : 0;
                                                            nk3Var.K4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i4 = ((d) nk3Var).currentAccount;
                                                            if (gda.m(i4) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                nk3Var.K4(arrayList4, nm7.m1, true, false, null);
                                                            }
                                                        }
                                                    } else if (nk3Var.getMessagesController().o2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i5 = ((d) nk3Var).currentAccount;
                                                        nk3Var.R2 = !oc7.r1(i5).o2(dialogId, 0L, null) ? 1 : 0;
                                                        nk3Var.S2 = nk3Var.R2 > 0 ? 0 : 1;
                                                        nk3Var.K4(arrayList5, nm7.o1, true, false, null);
                                                    } else {
                                                        lo7.n(z8c.t0).T(dialogId, 3, 0L);
                                                        if (c41.a(nk3Var)) {
                                                            c41.z(nk3Var, 3, 0, null).j();
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
                if (mk3Var.s == 0 && ((action == 1 || action == 3) && mk3Var.w == 2 && nk3Var.y3() && ((u46) getLayoutManager()).K0() == 0)) {
                    int paddingTop = getPaddingTop();
                    hg3 n3 = nk3.n3(mk3Var);
                    if (n3 != null) {
                        int L = (int) (gm.L(gda.l1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = n3.getMeasuredHeight() + (n3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - nk3Var.f3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            nk3Var.g2 = true;
                            x0(0, measuredHeight, d53.h);
                            i6 = 2;
                            mk3Var.w = (byte) 2;
                        } else {
                            if (mk3Var.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    nk3Var.g2 = true;
                                    x0(0, n3.getTop() - paddingTop, d53.h);
                                }
                                if (!nk3Var.h3) {
                                    nk3Var.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    pi3 pi3Var = mk3Var.n;
                                    if (pi3Var != null) {
                                        pi3Var.a(true);
                                    }
                                }
                                n3.i0();
                                mk3Var.w = (byte) 1;
                                if (gm.A1()) {
                                    gm.g2(jb6.M0(2131754923, null));
                                }
                            }
                            i6 = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i6];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new et1(this, (byte) 18));
                            ofFloat.setDuration(Math.max(100L, (long) hg9.x(getViewOffset(), gm.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(d53.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new kh2(this, (byte) 12));
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

    @Override // rm0, r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(y59 y59Var) {
        super.setAdapter(y59Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f) {
        this.p3 = f;
        invalidate();
    }

    public void setViewsOffset(float f) {
        View m;
        nk3.H4 = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY(f);
        }
        if (this.D1 != -1 && (m = getLayoutManager().m(this.D1)) != null) {
            int left = m.getLeft();
            int top = (int) (m.getTop() + f);
            int right = m.getRight();
            int bottom = (int) (m.getBottom() + f);
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }

    @Override // r59
    public final boolean w1() {
        return true;
    }

    @Override // rm0
    public final int z1() {
        return gm.L(48.0f);
    }
}
