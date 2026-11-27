// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class mb5 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public ka5 E;
    public boolean E0;
    public ka5 F;
    public float F0;
    public final t85 G;
    public float G0;
    public final c75 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final tt J;
    public float J0;
    public final jc0 K;
    public ValueAnimator K0;
    public final TextView L;
    public final UndoView[] L0;
    public boolean M;
    public boolean M0;
    public long N;
    public boolean N0;
    public float O;
    public ValueAnimator O0;
    public float P;
    public long P0;
    public float Q;
    public ea5 Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public float a0;
    public boolean b;
    public final GradientDrawable b0;
    public float c;
    public final GradientDrawable c0;
    public long d;
    public final c43 d0;
    public wc2 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final a81 g0;
    public long h;
    public boolean h0;
    public final zz3 i0;
    public vc2 j0;
    public final j95 k0;
    public final d41 l0;
    public final d7 m0;
    public float n;
    public final View n0;
    public final View o0;
    public float p0;
    public float q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public float s0;
    public float t0;
    public boolean u0;
    public float v0;
    public final ImageView w;
    public float w0;
    public final LongSparseIntArray x;
    public int x0;
    public final pn y;
    public int y0;
    public float z0;

    /* JADX WARN: Multi-variable type inference failed */
    public mb5(LaunchActivity launchActivity, t85 t85Var, c75 c75Var, ArrayList arrayList, vc2 vc2Var, j95 j95Var) {
        super(launchActivity);
        this.x = new LongSparseIntArray();
        this.y = new pn(null);
        this.P = 1.0f;
        final byte b = 1;
        this.W = true;
        final g75 g75Var = (g75) this;
        this.i0 = new zz3(g75Var, (byte) 13);
        this.z0 = 1.0f;
        byte b2 = 2;
        this.L0 = new UndoView[2];
        this.G = t85Var;
        this.H = c75Var;
        this.I = arrayList;
        this.j0 = vc2Var;
        this.k0 = j95Var;
        d41 d41Var = new d41(launchActivity, b2);
        this.l0 = d41Var;
        gd0 gd0Var = new gd0(false);
        gd0Var.a(-1);
        d41Var.setImageDrawable(gd0Var);
        d41Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        d41Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        d41Var.setBackground(aob.f0(vm2.o(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, vm2.o(-16777216, jn7.y1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, tre.c(120.0f, -1));
        View view2 = new View(launchActivity);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, vm2.o(-16777216, jn7.y1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility(8);
        addView(view2, tre.e(jn7.p2, -1, 5));
        addView(d41Var, tre.e(56, -1, 51));
        final Object[] objArr = 0 == true ? 1 : 0;
        d41Var.setOnClickListener(new View.OnClickListener() { // from class: ib5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = objArr;
                g75 g75Var2 = g75Var;
                switch (b3) {
                    case 0:
                        g75Var2.R0.onBackPressed();
                        break;
                    default:
                        if (g75Var2.b) {
                            boolean z = !g75Var2.f;
                            g75Var2.f = z;
                            g75Var2.d0.a(z, true);
                            g75Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        d7 d7Var = new d7(b2, launchActivity, g75Var);
        this.m0 = d7Var;
        int L = hl.L(20.0f);
        int o = vm2.o(-1, 100);
        hf0 i0 = aob.i0(L, L, L, L, 0, o, o);
        a81 a81Var = new a81((Object) g75Var, (Context) launchActivity, (Object) i0, (byte) 9);
        this.g0 = a81Var;
        a81Var.setOnClickListener(new View.OnClickListener() { // from class: ib5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                g75 g75Var2 = g75Var;
                switch (b3) {
                    case 0:
                        g75Var2.R0.onBackPressed();
                        break;
                    default:
                        if (g75Var2.b) {
                            boolean z = !g75Var2.f;
                            g75Var2.f = z;
                            g75Var2.d0.a(z, true);
                            g75Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i0.setCallback(a81Var);
        addView(a81Var);
        c43 c43Var = new c43(launchActivity, R.drawable.msg_pin_filled, -1);
        this.d0 = c43Var;
        float f = -hl.L(1.0f);
        float L2 = hl.L(2.0f);
        float L3 = hl.L(1.0f);
        c43Var.i = f;
        c43Var.j = L2;
        c43Var.k = L3;
        c43Var.invalidateSelf();
        d7Var.setImageDrawable(c43Var);
        d7Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        addView(d7Var, tre.e(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131752580, null));
        TextView textView2 = new TextView(launchActivity);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131752579, null));
        addView(textView, tre.e(-2, -2, 51));
        addView(textView2, tre.e(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(ob6.M0(2131754803, null));
        int L4 = hl.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(aob.f0(vm2.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new je3(g75Var, j95Var, (byte) 25));
        addView(imageView, tre.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        tt ttVar = new tt(g75Var, launchActivity, aob.b0(hl.L(18.0f), vm2.o(aob.w0(null, aob.kh, false), jn7.h3)), (byte) 19);
        this.J = ttVar;
        jc0 jc0Var = new jc0(launchActivity, true);
        this.K = jc0Var;
        jc0Var.setStyle(10);
        ttVar.setClipChildren(false);
        ttVar.setClipToPadding(false);
        ttVar.addView(jc0Var, tre.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        ttVar.addView(textView3, tre.e(-2, -2, 16));
        addView(ttVar, tre.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.L0[i] = new ls1(g75Var, launchActivity);
            this.L0[i].setHideAnimationType(2);
            this.L0[i].setAdditionalTranslationY(hl.L(10.0f));
            addView(this.L0[i], tre.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.g0.setVisibility(8);
        setIsTablet(j95.v5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z) {
        if (this.W != z) {
            this.W = z;
            j95 j95Var = ((g75) this).R0;
            if (j95Var.T3 != null) {
                j95Var.o5.a(!r1.W, true);
            }
            zz3 zz3Var = this.i0;
            if (!z || !this.b) {
                this.h0 = false;
                hl.r(zz3Var);
            } else if (!this.h0) {
                this.h0 = true;
                hl.d3(zz3Var, 3000L);
            }
            ka5 ka5Var = this.E;
            if (ka5Var != null) {
                ka5Var.requestLayout();
            }
        }
    }

    public final void b(boolean z) {
        ValueAnimator ofFloat;
        byte b = 0;
        if (this.H0) {
            this.H0 = false;
            float f = this.J0;
            byte b2 = 1;
            float[] fArr = new float[2];
            if (z) {
                fArr[0] = f;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.K0 = ofFloat;
            ofFloat.addUpdateListener(new jb5(this, b));
            this.K0.addListener(new lb5(this, b2));
            ValueAnimator valueAnimator = this.K0;
            k43 k43Var = k43.f;
            valueAnimator.setInterpolator(k43Var);
            this.K0.setDuration(z ? 350L : 200L);
            this.K0.setInterpolator(k43Var);
            ka5 ka5Var = this.E;
            if (ka5Var != null) {
                ga5 ga5Var = ka5Var.a;
                ValueAnimator valueAnimator2 = this.K0;
                if (ga5Var.F) {
                    ga5Var.H.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.K0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.I0 = false;
    }

    public final boolean c() {
        return (this.f || System.currentTimeMillis() - this.h <= 2000 || this.H0 || this.u0) ? false : true;
    }

    public final void d() {
        ka5 ka5Var = this.E;
        if (ka5Var != null) {
            if (ka5Var.o0 || ka5Var.p0 != 0.0f) {
                ka5Var.o0 = false;
                ka5Var.p0 = 0.0f;
                ka5Var.a.invalidate();
                ka5Var.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ka5 ka5Var;
        ka5 ka5Var2;
        ka5 ka5Var3;
        UndoView[] undoViewArr;
        if (j95.v5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            t85 t85Var = this.G;
            float y = t85Var.getY() - getTop();
            float measuredHeight = (t85Var.getMeasuredHeight() + y) - t85Var.getTranslationY();
            float f = this.c;
            canvas.save();
            boolean z = j95.v5;
            if (!z && (ka5Var = this.E) != null && !ka5Var.P && ka5Var.c != null) {
                float f2 = 1.0f - f;
                canvas.clipRect(0.0f, y * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
            } else if (z) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            ka5 ka5Var4 = this.F;
            if (ka5Var4 != null && ka5Var4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            ka5 ka5Var5 = this.E;
            if (ka5Var5 != null && ka5Var5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = hl.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z2 = this.H0 || this.K0 != null;
                if (z2) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((j95.u5 || j95.v5) ? 0 : hl.L(90.0f)));
                }
                canvas.translate(this.E.getX(), this.E.getY());
                ka5 ka5Var6 = this.E;
                float f3 = this.J0;
                if (ka5Var6.o0 != z2 || ka5Var6.p0 != f3) {
                    ka5Var6.o0 = z2;
                    ka5Var6.p0 = f3;
                    ka5Var6.a.invalidate();
                    ka5Var6.invalidate();
                }
                this.E.i(this.z0, this.v0, this.w0, this.s0, this.t0, this.A0 || this.C0 != null);
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i = 0; i < 2; i++) {
            UndoView[] undoViewArr2 = this.L0;
            if (undoViewArr2[i].getVisibility() == 0) {
                canvas.save();
                float f4 = j95.u5 ? 0.0f : (1.0f - this.a0) * (-hl.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (j95.u5 ? 0 : hl.L(90.0f))) + f4) - hl.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i].getX() - hl.L(8.0f), undoViewArr2[i].getY() - hl.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i].getX() - hl.L(8.0f), ((undoViewArr2[i].getY() - (j95.u5 ? 0 : hl.L(90.0f))) + f4) - hl.L(26.0f));
                }
                if (undoViewArr2[i].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i].getMeasuredWidth(), undoViewArr2[i].getMeasuredHeight(), (int) (undoViewArr2[i].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i].getScaleX(), undoViewArr[i].getScaleY(), undoViewArr[i].getMeasuredWidth() / 2.0f, undoViewArr[i].getMeasuredHeight() / 2.0f);
                undoViewArr[i].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f5 = (1.0f - this.a0) * this.c;
        ValueAnimator valueAnimator = this.O0;
        GradientDrawable gradientDrawable = this.b0;
        GradientDrawable gradientDrawable2 = this.c0;
        if (valueAnimator == null || (ka5Var2 = this.F) == null || (ka5Var3 = this.E) == null) {
            ka5 ka5Var7 = this.E;
            float f6 = 255.0f * f5;
            if (ka5Var7 != null) {
                gradientDrawable.setAlpha((int) ((1.0f - ka5Var7.a0) * f6));
                gradientDrawable2.setAlpha((int) ((1.0f - this.E.a0) * f6));
            } else {
                int i2 = (int) f6;
                gradientDrawable.setAlpha(i2);
                gradientDrawable2.setAlpha(i2);
            }
        } else {
            boolean z3 = ka5Var2.W;
            boolean z4 = ka5Var3.W;
            int alpha = (int) ((z3 != z4 ? (!z4 ? 1.0f - ka5Var3.getAlpha() : ka5Var3.getAlpha()) * f5 : !z4 ? 0.0f : f5) * 255.0f);
            gradientDrawable.setAlpha(alpha);
            gradientDrawable2.setAlpha(alpha);
        }
        this.l0.setAlpha(f5);
        vc2 vc2Var = this.j0;
        d7 d7Var = this.m0;
        ImageView imageView = this.w;
        if (vc2Var == null || !vc2Var.b.rtmp_stream) {
            d7Var.setAlpha(f5);
            d7Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        } else {
            d7Var.setAlpha(0.0f);
            d7Var.setVisibility(4);
            imageView.setAlpha(f5);
            imageView.setVisibility(0);
            if (j95.u5) {
                imageView.setTranslationX((1.0f - this.a0) * (-hl.L(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.e0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.f0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((a.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - hl.L(1.0f);
        c43 c43Var = this.d0;
        float f7 = c43Var.g;
        float A = (qd4.A(1.0f, f7, measuredWidth2, measuredWidth4 * f7) - hl.L(21.0f)) - (j95.v5 ? hl.L(328.0f) : j95.u5 ? hl.L(180.0f) : 0);
        textView.setTranslationX(A);
        textView2.setTranslationX(A);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        a81 a81Var = this.g0;
        a81Var.setTranslationX(A - hl.L(36.0f));
        a81Var.setTranslationY((a.getCurrentActionBarHeight() - a81Var.getMeasuredHeight()) / 2.0f);
        d7Var.setTranslationX(A - hl.L(44.0f));
        textView.setAlpha((1.0f - c43Var.g) * f5);
        textView2.setAlpha(c43Var.g * f5);
        a81Var.setAlpha(f5);
        float f8 = this.P;
        tt ttVar = this.J;
        if (f8 != 1.0f) {
            float f9 = f8 + 0.07272727f;
            this.P = f9;
            if (f9 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            ttVar.invalidate();
        }
        boolean z5 = this.M;
        float f10 = this.O;
        if (z5) {
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.O = f11;
                if (f11 > 1.0f) {
                    this.O = 1.0f;
                } else {
                    invalidate();
                }
            }
        } else if (f10 != 0.0f) {
            float f12 = f10 - 0.10666667f;
            this.O = f12;
            if (f12 < 0.0f) {
                this.O = 0.0f;
            } else {
                invalidate();
            }
        }
        if (j95.u5) {
            ttVar.setTranslationY(hl.L(16.0f));
        } else {
            ttVar.setTranslationY((hl.L(8.0f) * this.a0) + ((1.0f - this.a0) * a.getCurrentActionBarHeight()) + hl.L(8.0f));
        }
        ttVar.setAlpha(this.O * this.c);
        ttVar.setScaleX((this.O * 0.5f) + 0.5f);
        ttVar.setScaleY((this.O * 0.5f) + 0.5f);
        if (j95.v5) {
            this.V = true;
            super.dispatchDraw(canvas);
            this.V = false;
        } else {
            super.dispatchDraw(canvas);
        }
        c75 c75Var = this.H;
        if (c75Var.getVisibility() == 0) {
            for (int i3 = 0; i3 < c75Var.getChildCount(); i3++) {
                o95 o95Var = (o95) c75Var.getChildAt(i3);
                if (o95Var.getVisibility() == 0 && o95Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(c75Var.getX() + o95Var.getX(), c75Var.getY() + o95Var.getY());
                    canvas.scale(o95Var.getScaleX(), o95Var.getScaleY(), o95Var.getMeasuredWidth() / 2.0f, o95Var.getMeasuredHeight() / 2.0f);
                    o95Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.U;
        t85 t85Var = this.G;
        if (!z) {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof ka5) {
                    ka5 ka5Var = (ka5) view;
                    if (ka5Var != this.E && ka5Var != this.F && !this.V && !ka5Var.y0) {
                        if (ka5Var.c == null) {
                            if (!j95.v5) {
                                return super.drawChild(canvas, view, j);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                        float y = t85Var.getY() - getTop();
                        float measuredHeight = (t85Var.getMeasuredHeight() + y) - t85Var.getTranslationY();
                        float f = this.c;
                        if (ka5Var.d == null) {
                            f = 0.0f;
                        }
                        canvas.save();
                        float f2 = 1.0f - f;
                        canvas.clipRect(0.0f, y * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
                        boolean drawChild2 = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j);
                }
            }
        } else if ((view instanceof ka5) && ((ka5) view).y0) {
            float y2 = t85Var.getY() - getTop();
            float measuredHeight2 = (t85Var.getMeasuredHeight() + y2) - t85Var.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y2, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e(ka5 ka5Var) {
        this.I.remove(ka5Var);
        long B1 = r47.B1(ka5Var.x.a.peer);
        this.x.put(B1, r2.get(B1, 0) - 1);
    }

    public final void f() {
        mb5 mb5Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            mb5Var = this;
            ofFloat.addUpdateListener(new bt4(mb5Var, this.z0, this.s0, this.t0, (byte) 1));
            mb5Var.C0.addListener(new lb5(mb5Var, (byte) 2));
            mb5Var.C0.setDuration(350L);
            mb5Var.C0.setInterpolator(k43.f);
            mb5Var.C0.start();
            mb5Var.h = System.currentTimeMillis();
        } else {
            mb5Var = this;
        }
        mb5Var.B0 = false;
        mb5Var.u0 = false;
    }

    public abstract void g(boolean z);

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.L0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            removeView(undoViewArr[0]);
            addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(wc2 wc2Var) {
        long B1;
        ka5 ka5Var;
        ka5 ka5Var2;
        ga5 ga5Var;
        q95 q95Var;
        o95 o95Var;
        q95 q95Var2;
        wc2 wc2Var2;
        wc2 wc2Var3 = this.e;
        if (wc2Var == null) {
            if (wc2Var3 == null) {
                return;
            } else {
                B1 = 0;
            }
        } else if (wc2Var.equals(wc2Var3)) {
            return;
        } else {
            B1 = r47.B1(wc2Var.a.peer);
        }
        ka5 ka5Var3 = this.E;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (ka5Var3 != null) {
            ArrayList arrayList = ka5Var3.m0;
            for (int i = 0; i < arrayList.size(); i++) {
                ((Runnable) arrayList.get(i)).run();
            }
            arrayList.clear();
        }
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (wc2Var2 = this.e) != null) {
            sharedInstance.requestFullScreen(wc2Var2.a, false, wc2Var2.b);
        }
        this.e = wc2Var;
        byte b = 1;
        if (sharedInstance != null && wc2Var != null) {
            sharedInstance.requestFullScreen(wc2Var.a, true, wc2Var.b);
        }
        this.d = B1;
        boolean z = this.b;
        this.h = System.currentTimeMillis();
        byte b2 = 2;
        d41 d41Var = this.l0;
        j95 j95Var = this.k0;
        if (wc2Var == null) {
            if (this.b) {
                ValueAnimator valueAnimator2 = this.r;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.b = false;
                ka5 ka5Var4 = this.E;
                if (ka5Var4.c != null || ka5Var4.d != null || ka5Var4.e != null) {
                    wc2 wc2Var4 = ka5Var4.x;
                    if (vc2.E(wc2Var4.a, wc2Var4.b, this.j0)) {
                        this.E.h(false, true);
                    }
                }
                this.E.b(true);
                q95 q95Var3 = this.E.c;
                if (q95Var3 != null) {
                    q95Var3.setRenderer(null);
                }
                o95 o95Var2 = this.E.d;
                if (o95Var2 != null) {
                    o95Var2.setRenderer(null);
                }
                q95 q95Var4 = this.E.e;
                if (q95Var4 != null) {
                    q95Var4.setRenderer(null);
                }
                ka5 ka5Var5 = this.E;
                ka5Var5.animate().alpha(0.0f).setListener(new kb5(this, ka5Var5, b2)).setDuration(350L).start();
            }
            d41Var.setEnabled(false);
            this.f = false;
        } else {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i2 >= arrayList2.size()) {
                    ka5Var = null;
                    break;
                } else {
                    if (((ka5) arrayList2.get(i2)).x.equals(wc2Var)) {
                        ka5Var = (ka5) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            Property property = View.ALPHA;
            c43 c43Var = this.d0;
            if (ka5Var != null) {
                ValueAnimator valueAnimator3 = this.r;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                if (this.b) {
                    this.f = false;
                    c43Var.a(false, false);
                    this.E.b(false);
                    ka5Var.b(false);
                    if (!this.N0) {
                        ka5 ka5Var6 = this.E;
                        if (ka5Var6.c != null || ka5Var6.d != null || ka5Var6.e != null) {
                            ka5Var2 = new ka5(this, this.j0, j95Var);
                            ka5 ka5Var7 = this.E;
                            q95 q95Var5 = ka5Var7.c;
                            o95 o95Var3 = ka5Var7.d;
                            q95 q95Var6 = ka5Var7.e;
                            ka5Var2.c = q95Var5;
                            ka5Var2.d = o95Var3;
                            ka5Var2.e = q95Var6;
                            ka5Var2.g(this.b, false);
                            ka5Var2.j(false);
                            q95 q95Var7 = this.E.c;
                            if (q95Var7 != null) {
                                q95Var7.setRenderer(ka5Var2);
                            }
                            o95 o95Var4 = this.E.d;
                            if (o95Var4 != null) {
                                o95Var4.setRenderer(ka5Var2);
                            }
                            q95 q95Var8 = this.E.e;
                            if (q95Var8 != null) {
                                q95Var8.setRenderer(ka5Var2);
                            }
                            ka5 ka5Var8 = new ka5(this, this.j0, j95Var);
                            ka5Var8.x = ka5Var.x;
                            q95 q95Var9 = ka5Var.c;
                            o95 o95Var5 = ka5Var.d;
                            q95 q95Var10 = ka5Var.e;
                            ka5Var8.c = q95Var9;
                            ka5Var8.d = o95Var5;
                            ka5Var8.e = q95Var10;
                            ka5Var8.g(this.b, false);
                            ka5Var8.j(false);
                            ga5Var = ka5Var8.a;
                            ga5Var.d.setAlpha(1.0f);
                            ga5Var.e.setAlpha(1.0f);
                            q95Var = ka5Var.c;
                            if (q95Var != null) {
                                q95Var.setRenderer(ka5Var8);
                            }
                            o95Var = ka5Var.d;
                            if (o95Var != null) {
                                o95Var.setRenderer(ka5Var8);
                            }
                            q95Var2 = ka5Var.e;
                            if (q95Var2 != null) {
                                q95Var2.setRenderer(ka5Var8);
                            }
                            ka5Var8.F = true;
                            ka5Var8.setAlpha(0.0f);
                            this.F = this.E;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ka5Var8, (Property<ka5, Float>) property, 0.0f, 1.0f);
                            this.O0 = ofFloat;
                            ofFloat.addListener(new j8(this, ka5Var8, ka5Var, (byte) 7));
                            if (ka5Var2 != null) {
                                ka5Var2.setAlpha(0.0f);
                                ka5Var2.setScaleX(0.5f);
                                ka5Var2.setScaleY(0.5f);
                                ka5Var2.F = true;
                            }
                            re4 re4Var = new re4((Object) this, (Object) ka5Var, (Object) ka5Var2, (byte) 23);
                            if (ga5Var.d.c.P) {
                                hl.d3(re4Var, 250L);
                                ka5Var8.m0.add(re4Var);
                            } else {
                                re4Var.run();
                            }
                            d();
                            this.E = ka5Var8;
                            ka5Var8.h(true, false);
                            j();
                        }
                    }
                    ka5Var2 = null;
                    ka5 ka5Var82 = new ka5(this, this.j0, j95Var);
                    ka5Var82.x = ka5Var.x;
                    q95 q95Var92 = ka5Var.c;
                    o95 o95Var52 = ka5Var.d;
                    q95 q95Var102 = ka5Var.e;
                    ka5Var82.c = q95Var92;
                    ka5Var82.d = o95Var52;
                    ka5Var82.e = q95Var102;
                    ka5Var82.g(this.b, false);
                    ka5Var82.j(false);
                    ga5Var = ka5Var82.a;
                    ga5Var.d.setAlpha(1.0f);
                    ga5Var.e.setAlpha(1.0f);
                    q95Var = ka5Var.c;
                    if (q95Var != null) {
                    }
                    o95Var = ka5Var.d;
                    if (o95Var != null) {
                    }
                    q95Var2 = ka5Var.e;
                    if (q95Var2 != null) {
                    }
                    ka5Var82.F = true;
                    ka5Var82.setAlpha(0.0f);
                    this.F = this.E;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ka5Var82, (Property<ka5, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat2;
                    ofFloat2.addListener(new j8(this, ka5Var82, ka5Var, (byte) 7));
                    if (ka5Var2 != null) {
                    }
                    re4 re4Var2 = new re4((Object) this, (Object) ka5Var, (Object) ka5Var2, (byte) 23);
                    if (ga5Var.d.c.P) {
                    }
                    d();
                    this.E = ka5Var82;
                    ka5Var82.h(true, false);
                    j();
                } else {
                    this.b = true;
                    d();
                    this.E = ka5Var;
                    ka5Var.h(true, true);
                    invalidate();
                    c43Var.a(this.f, false);
                }
            } else if (this.b) {
                ka5 ka5Var9 = this.E;
                if (ka5Var9.c == null) {
                    if (!((ka5Var9.d != null) | (ka5Var9.e != null))) {
                        ka5Var9.b(true);
                        ka5 ka5Var10 = new ka5(this, this.j0, j95Var);
                        ka5Var10.x = wc2Var;
                        ka5Var10.g(this.b, false);
                        ka5Var10.h(true, false);
                        ka5Var10.F = true;
                        ka5Var10.setAlpha(0.0f);
                        this.F = this.E;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.O0 = ofFloat3;
                        ofFloat3.addUpdateListener(new lk(this, ka5Var10, (byte) 16));
                        this.O0.addListener(new kb5(this, ka5Var10, objArr2 == true ? 1 : 0));
                        this.O0.start();
                        d();
                        this.E = ka5Var10;
                        ka5Var10.h(true, false);
                        this.E.j(false);
                        j();
                    }
                }
                ka5Var9.b(false);
                ka5 ka5Var11 = new ka5(this, this.j0, j95Var);
                ka5 ka5Var12 = this.E;
                q95 q95Var11 = ka5Var12.c;
                o95 o95Var6 = ka5Var12.d;
                q95 q95Var12 = ka5Var12.e;
                ka5Var11.c = q95Var11;
                ka5Var11.d = o95Var6;
                ka5Var11.e = q95Var12;
                ka5Var11.g(this.b, false);
                ka5Var11.j(false);
                q95 q95Var13 = this.E.c;
                if (q95Var13 != null) {
                    q95Var13.setRenderer(ka5Var11);
                }
                o95 o95Var7 = this.E.d;
                if (o95Var7 != null) {
                    o95Var7.setRenderer(ka5Var11);
                }
                q95 q95Var14 = this.E.e;
                if (q95Var14 != null) {
                    q95Var14.setRenderer(ka5Var11);
                }
                ka5Var11.setAlpha(0.0f);
                ka5Var11.setScaleX(0.5f);
                ka5Var11.setScaleY(0.5f);
                ka5Var11.F = true;
                se4 se4Var = new se4(this, ka5Var11, (byte) 24);
                if (ka5Var11.a.d.c.P) {
                    se4Var.run();
                } else {
                    hl.d3(se4Var, 250L);
                    ka5Var11.m0.add(se4Var);
                }
                ka5 ka5Var102 = new ka5(this, this.j0, j95Var);
                ka5Var102.x = wc2Var;
                ka5Var102.g(this.b, false);
                ka5Var102.h(true, false);
                ka5Var102.F = true;
                ka5Var102.setAlpha(0.0f);
                this.F = this.E;
                ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.O0 = ofFloat32;
                ofFloat32.addUpdateListener(new lk(this, ka5Var102, (byte) 16));
                this.O0.addListener(new kb5(this, ka5Var102, objArr2 == true ? 1 : 0));
                this.O0.start();
                d();
                this.E = ka5Var102;
                ka5Var102.h(true, false);
                this.E.j(false);
                j();
            } else {
                this.b = true;
                d();
                ka5 ka5Var13 = new ka5(this, this.j0, j95Var);
                this.E = ka5Var13;
                ka5Var13.x = wc2Var;
                ka5Var13.g(this.b, false);
                this.E.h(true, false);
                this.E.h(true, false);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<ka5, Float>) property, 0.0f, 1.0f);
                this.O0 = ofFloat4;
                ofFloat4.addListener(new lb5(this, objArr == true ? 1 : 0));
                this.O0.start();
                invalidate();
                c43Var.a(this.f, false);
            }
            d41Var.setEnabled(true);
        }
        boolean z2 = this.b;
        if (z != z2) {
            if (z2) {
                d41Var.setVisibility(0);
                this.m0.setVisibility(0);
                this.f0.setVisibility(0);
                this.g0.setVisibility(0);
            } else {
                setUiVisible(true);
                if (this.h0) {
                    this.h0 = false;
                    hl.r(this.i0);
                }
            }
            g(true);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
            this.r = ofFloat5;
            ofFloat5.addUpdateListener(new jb5(this, b));
            ka5 ka5Var14 = this.E;
            ka5Var14.r = true;
            int i3 = j95Var.a;
            this.M0 = this.H0;
            this.y.d();
            this.r.addListener(new kb5(this, ka5Var14, b));
            this.r.setInterpolator(k43.f);
            this.r.setDuration(350L);
            ga5 ga5Var2 = this.E.a;
            ValueAnimator valueAnimator4 = this.r;
            if (ga5Var2.F) {
                ga5Var2.H.add(valueAnimator4);
            } else {
                valueAnimator4.start();
            }
        }
        b(this.e == null);
    }

    public final void i(TLRPC.GroupCallParticipant groupCallParticipant, float f) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i >= arrayList.size()) {
                return;
            }
            if (r47.B1(((ka5) arrayList.get(i)).x.a.peer) == r47.B1(groupCallParticipant.peer)) {
                ((ka5) arrayList.get(i)).setAmplitude(f);
            }
            i++;
        }
    }

    public abstract void j();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = j95.v5;
        View view = this.n0;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = hl.L(328.0f);
        } else if (j95.u5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = hl.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!j95.u5 || j95.v5) ? 8 : 0);
        a81 a81Var = this.g0;
        a81Var.getLayoutParams().height = hl.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i2);
        a81Var.getLayoutParams().width = hl.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = j95.u5 ? hl.L(45.0f) : 0;
        for (int i3 = 0; i3 < 2; i3++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i3].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = hl.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = j95.u5 ? hl.L(180.0f) : 0;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x04ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.I0;
        j95 j95Var = this.k0;
        if ((z2 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= hl.L(120.0f)) {
                    b(false);
                } else {
                    j95Var.W0(null);
                }
            }
            invalidate();
        }
        if (!this.b || (!(this.I0 || this.H0 || this.E0 || this.B0 || this.u0 || this.A0 || motionEvent.getActionMasked() == 0) || this.E == null)) {
            f();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.I0 = false;
            this.H0 = false;
            this.B0 = false;
            this.u0 = false;
            this.A0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.K0 != null) {
            this.I0 = false;
            this.H0 = true;
            this.G0 = motionEvent.getY() - this.J0;
            this.K0.removeAllListeners();
            this.K0.cancel();
            this.K0 = null;
        } else if (this.K0 != null) {
            f();
            return false;
        }
        ka5 ka5Var = this.E;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        fx0 fx0Var = ka5Var.O;
        Rect rect = ka5Var.z0;
        fx0Var.getHitRect(rect);
        if (!rect.contains((int) x, (int) y)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = hl.P;
                rectF.set(0.0f, a.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((j95.u5 && this.W) ? -hl.L(90.0f) : 0), this.E.getMeasuredHeight() + ((j95.u5 || !this.W) ? 0 : -hl.L(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D0 = System.currentTimeMillis();
                    this.E0 = true;
                    this.I0 = true;
                    this.F0 = motionEvent.getX();
                    this.G0 = motionEvent.getY();
                }
            } else if ((this.I0 || this.H0 || this.E0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.F0 - motionEvent.getX());
                float f = this.a;
                if (abs > f || Math.abs(this.G0 - motionEvent.getY()) > f) {
                    this.E0 = false;
                }
                if (this.I0 && !this.A0 && Math.abs(this.G0 - motionEvent.getY()) > (r8 << 1)) {
                    this.G0 = motionEvent.getY();
                    this.I0 = false;
                    this.H0 = true;
                } else if (this.H0) {
                    this.J0 = motionEvent.getY() - this.G0;
                    invalidate();
                }
                if (this.I0 && Math.abs(this.F0 - motionEvent.getX()) > (r8 << 2)) {
                    this.I0 = false;
                }
            }
            if (this.E0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.D0 < 200) {
                this.E0 = false;
                if (this.M) {
                    RectF rectF2 = hl.P;
                    tt ttVar = this.J;
                    rectF2.set(ttVar.getX(), ttVar.getY(), ttVar.getX() + ttVar.getWidth(), ttVar.getY() + ttVar.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z3 = false;
                        z = false;
                        for (int i = 0; i < this.j0.f.size(); i++) {
                            if (this.N == r47.B1(((wc2) this.j0.f.get(i)).a.peer)) {
                                j95Var.W0((wc2) this.j0.f.get(i));
                                z3 = true;
                                z = true;
                            }
                        }
                        if (!z3) {
                            j95Var.W0(new wc2((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
                            z = true;
                        }
                        if (!z) {
                            setUiVisible(!this.W);
                        }
                        this.J0 = 0.0f;
                        invalidate();
                    }
                }
                z = false;
                if (!z) {
                }
                this.J0 = 0.0f;
                invalidate();
            }
            if (!this.E.W || this.H0) {
                f();
                if (this.E0 || this.H0 || this.I0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        gmc gmcVar = this.E.a.d;
                        RectF rectF3 = hl.P;
                        rectF3.set(gmcVar.getX(), gmcVar.getY(), gmcVar.getX() + gmcVar.getMeasuredWidth(), gmcVar.getY() + gmcVar.getMeasuredHeight());
                        rectF3.inset(((gmcVar.getMeasuredHeight() * this.E.a.U) - gmcVar.getMeasuredHeight()) / 2.0f, ((gmcVar.getMeasuredWidth() * this.E.a.U) - gmcVar.getMeasuredWidth()) / 2.0f);
                        boolean z4 = j95.u5;
                        float f2 = rectF3.top;
                        if (z4) {
                            rectF3.top = Math.max(f2, a.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.E.getMeasuredWidth() - hl.L(90.0f));
                        } else {
                            rectF3.top = Math.max(f2, a.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.E.getMeasuredHeight() - hl.L(90.0f));
                        }
                        boolean contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.B0 = contains;
                        if (!contains) {
                            f();
                            return this.I0;
                        }
                    }
                    if (!this.u0 && motionEvent.getPointerCount() == 2) {
                        this.r0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x2 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.v0 = x2;
                        this.p0 = x2;
                        float y2 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.w0 = y2;
                        this.q0 = y2;
                        this.z0 = 1.0f;
                        this.x0 = motionEvent.getPointerId(0);
                        this.y0 = motionEvent.getPointerId(1);
                        this.u0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.u0) {
                    int i2 = -1;
                    int i3 = -1;
                    for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                        if (this.x0 == motionEvent.getPointerId(i4)) {
                            i2 = i4;
                        }
                        if (this.y0 == motionEvent.getPointerId(i4)) {
                            i3 = i4;
                        }
                    }
                    if (i2 == -1 || i3 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        f();
                        return this.I0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2))) / this.r0;
                    this.z0 = hypot;
                    if (hypot > 1.005f && !this.A0) {
                        this.r0 = (float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2));
                        float x3 = (motionEvent.getX(i3) + motionEvent.getX(i2)) / 2.0f;
                        this.v0 = x3;
                        this.p0 = x3;
                        float y3 = (motionEvent.getY(i3) + motionEvent.getY(i2)) / 2.0f;
                        this.w0 = y3;
                        this.q0 = y3;
                        this.z0 = 1.0f;
                        this.s0 = 0.0f;
                        this.t0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A0 = true;
                        this.u0 = true;
                    }
                    float x4 = (motionEvent.getX(i3) + motionEvent.getX(i2)) / 2.0f;
                    float y4 = (motionEvent.getY(i3) + motionEvent.getY(i2)) / 2.0f;
                    float f3 = this.p0 - x4;
                    float f4 = this.q0 - y4;
                    float f5 = -f3;
                    float f6 = this.z0;
                    this.s0 = f5 / f6;
                    this.t0 = (-f4) / f6;
                    invalidate();
                } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.x0 == motionEvent.getPointerId(0) && this.y0 == motionEvent.getPointerId(1)) || (this.x0 == motionEvent.getPointerId(1) && this.y0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    f();
                }
                if (this.B0 || this.E0 || this.I0) {
                }
            }
        }
        return false;
    }

    public void setGroupCall(vc2 vc2Var) {
        this.j0 = vc2Var;
    }

    public void setIsTablet(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            d41 d41Var = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d41Var.getLayoutParams();
            layoutParams.gravity = z ? 85 : 51;
            layoutParams.rightMargin = z ? hl.L(328.0f) : 0;
            layoutParams.bottomMargin = z ? -hl.L(8.0f) : 0;
            if (this.N0) {
                d41Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            gd0 gd0Var = new gd0(false);
            gd0Var.a(-1);
            d41Var.setImageDrawable(gd0Var);
        }
    }

    public void setProgressToHideUi(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidate();
            ka5 ka5Var = this.E;
            if (ka5Var != null) {
                ka5Var.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z) {
        jc0 jc0Var;
        boolean z2;
        long j;
        TLRPC.Chat M0;
        TLRPC.User user;
        if (!this.b || this.N0 || this.e == null || this.r != null || this.j0 == null) {
            if (this.M) {
                this.M = false;
                this.O = 0.0f;
                return;
            }
            return;
        }
        int i = this.k0.a;
        long j2 = 500;
        byte b = 3;
        if (System.currentTimeMillis() - this.P0 < 500) {
            if (this.Q0 == null) {
                ea5 ea5Var = new ea5(this, b);
                this.Q0 = ea5Var;
                hl.d3(ea5Var, (System.currentTimeMillis() - this.P0) + 50);
                return;
            }
            return;
        }
        this.P0 = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int m = this.j0.P.m();
            jc0Var = this.K;
            if (i2 >= m) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i2));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                j = j2;
            } else {
                j = j2;
                if (r47.B1(this.e.a.peer) != r47.B1(groupCallParticipant.peer)) {
                    long B1 = r47.B1(groupCallParticipant.peer);
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i3 == 0) {
                            this.N = r47.B1(groupCallParticipant.peer);
                        }
                        if (i3 < 3) {
                            if (B1 > 0) {
                                user = uc7.s1(i).X1(Long.valueOf(B1));
                                M0 = null;
                            } else {
                                M0 = uc7.s1(i).M0(Long.valueOf(B1));
                                user = null;
                            }
                            if (user != null || M0 != null) {
                                jc0Var.b(i3, i, groupCallParticipant);
                                if (i3 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(lbc.k(user, true), new y7c(hl.o()), 0);
                                } else {
                                    spannableStringBuilder.append(M0.title, new y7c(hl.o()), 0);
                                }
                            }
                        }
                        i3++;
                        if (i3 == 3) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
            j2 = j;
        }
        boolean z3 = i3 != 0;
        boolean z4 = this.M;
        TextView textView = this.L;
        if (!z4 && z3) {
            z2 = false;
        } else {
            if (!z3 && z4) {
                this.M = z3;
                invalidate();
                return;
            }
            if (z4 && z3) {
                tt ttVar = this.J;
                this.Q = ttVar.getLeft();
                this.S = ttVar.getRight();
                this.R = textView.getLeft();
                this.P = 0.0f;
            }
            z2 = z;
        }
        if (!z3) {
            this.M = z3;
            invalidate();
            return;
        }
        String J0 = ob6.J0(i3, "MembersAreSpeakingToast");
        int indexOf = J0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i3 == 0 ? 0 : i3 == 1 ? hl.L(40.0f) : i3 == 2 ? hl.L(64.0f) : hl.L(88.0f);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = hl.L(16.0f);
        this.M = z3;
        invalidate();
        while (i3 < 3) {
            jc0Var.b(i3, i, null);
            i3++;
        }
        jc0Var.a(z2);
    }
}
