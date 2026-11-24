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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class jb5 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public ha5 E;
    public boolean E0;
    public ha5 F;
    public float F0;
    public final p85 G;
    public float G0;
    public final y65 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final su J;
    public float J0;
    public final hd0 K;
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
    public qn4 Q0;
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
    public final v43 d0;
    public rd2 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final a91 g0;
    public long h;
    public boolean h0;
    public final o04 i0;
    public qd2 j0;
    public final g95 k0;
    public final c51 l0;
    public final c7 m0;
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
    public final po y;
    public int y0;
    public float z0;

    /* JADX WARN: Multi-variable type inference failed */
    public jb5(LaunchActivity launchActivity, p85 p85Var, y65 y65Var, ArrayList arrayList, qd2 qd2Var, g95 g95Var) {
        super(launchActivity);
        this.x = new LongSparseIntArray();
        this.y = new po(null);
        this.P = 1.0f;
        final byte b = 1;
        this.W = true;
        final c75 c75Var = (c75) this;
        this.i0 = new o04(c75Var, (byte) 13);
        this.z0 = 1.0f;
        byte b2 = 2;
        this.L0 = new UndoView[2];
        this.G = p85Var;
        this.H = y65Var;
        this.I = arrayList;
        this.j0 = qd2Var;
        this.k0 = g95Var;
        c51 c51Var = new c51(launchActivity, b2);
        this.l0 = c51Var;
        ee0 ee0Var = new ee0(false);
        ee0Var.a(-1);
        c51Var.setImageDrawable(ee0Var);
        c51Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c51Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        c51Var.setBackground(cmb.f0(on2.p(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, on2.p(-16777216, nm7.y1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, qoe.c(120.0f, -1));
        View view2 = new View(launchActivity);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, on2.p(-16777216, nm7.y1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility(8);
        addView(view2, qoe.e(nm7.p2, -1, 5));
        addView(c51Var, qoe.e(56, -1, 51));
        final Object[] objArr = 0 == true ? 1 : 0;
        c51Var.setOnClickListener(new View.OnClickListener() { // from class: fb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = objArr;
                c75 c75Var2 = c75Var;
                switch (b3) {
                    case 0:
                        c75Var2.R0.onBackPressed();
                        break;
                    default:
                        if (c75Var2.b) {
                            boolean z = !c75Var2.f;
                            c75Var2.f = z;
                            c75Var2.d0.a(z, true);
                            c75Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        c7 c7Var = new c7(b2, launchActivity, c75Var);
        this.m0 = c7Var;
        int L = gm.L(20.0f);
        int p = on2.p(-1, 100);
        fg0 i0 = cmb.i0(L, L, L, L, 0, p, p);
        a91 a91Var = new a91((Object) c75Var, (Context) launchActivity, (Object) i0, (byte) 9);
        this.g0 = a91Var;
        a91Var.setOnClickListener(new View.OnClickListener() { // from class: fb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                c75 c75Var2 = c75Var;
                switch (b3) {
                    case 0:
                        c75Var2.R0.onBackPressed();
                        break;
                    default:
                        if (c75Var2.b) {
                            boolean z = !c75Var2.f;
                            c75Var2.f = z;
                            c75Var2.d0.a(z, true);
                            c75Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i0.setCallback(a91Var);
        addView(a91Var);
        v43 v43Var = new v43(launchActivity, R.drawable.msg_pin_filled, -1);
        this.d0 = v43Var;
        float f = -gm.L(1.0f);
        float L2 = gm.L(2.0f);
        float L3 = gm.L(1.0f);
        v43Var.i = f;
        v43Var.j = L2;
        v43Var.k = L3;
        v43Var.invalidateSelf();
        c7Var.setImageDrawable(v43Var);
        c7Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        addView(c7Var, qoe.e(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131752552, null));
        TextView textView2 = new TextView(launchActivity);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gm.o());
        textView2.setText(jb6.M0(2131752551, null));
        addView(textView, qoe.e(-2, -2, 51));
        addView(textView2, qoe.e(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(jb6.M0(2131754807, null));
        int L4 = gm.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(cmb.f0(on2.p(-1, 55), 1, -1));
        imageView.setOnClickListener(new tf3(c75Var, g95Var, (byte) 23));
        addView(imageView, qoe.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        su suVar = new su(c75Var, launchActivity, cmb.b0(gm.L(18.0f), on2.p(cmb.w0(null, cmb.jh, false), nm7.h3)), (byte) 19);
        this.J = suVar;
        hd0 hd0Var = new hd0(launchActivity, true);
        this.K = hd0Var;
        hd0Var.setStyle(10);
        suVar.setClipChildren(false);
        suVar.setClipToPadding(false);
        suVar.addView(hd0Var, qoe.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        suVar.addView(textView3, qoe.e(-2, -2, 16));
        addView(suVar, qoe.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.L0[i] = new kt1(c75Var, launchActivity);
            this.L0[i].setHideAnimationType(2);
            this.L0[i].setAdditionalTranslationY(gm.L(10.0f));
            addView(this.L0[i], qoe.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.g0.setVisibility(8);
        setIsTablet(g95.v5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z) {
        if (this.W != z) {
            this.W = z;
            g95 g95Var = ((c75) this).R0;
            if (g95Var.T3 != null) {
                g95Var.o5.a(!r1.W, true);
            }
            o04 o04Var = this.i0;
            if (!z || !this.b) {
                this.h0 = false;
                gm.r(o04Var);
            } else if (!this.h0) {
                this.h0 = true;
                gm.d3(o04Var, 3000L);
            }
            ha5 ha5Var = this.E;
            if (ha5Var != null) {
                ha5Var.requestLayout();
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
            ofFloat.addUpdateListener(new gb5(this, b));
            this.K0.addListener(new ib5(this, b2));
            ValueAnimator valueAnimator = this.K0;
            d53 d53Var = d53.f;
            valueAnimator.setInterpolator(d53Var);
            this.K0.setDuration(z ? 350L : 200L);
            this.K0.setInterpolator(d53Var);
            ha5 ha5Var = this.E;
            if (ha5Var != null) {
                da5 da5Var = ha5Var.a;
                ValueAnimator valueAnimator2 = this.K0;
                if (da5Var.F) {
                    da5Var.H.add(valueAnimator2);
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
        ha5 ha5Var = this.E;
        if (ha5Var != null) {
            if (ha5Var.o0 || ha5Var.p0 != 0.0f) {
                ha5Var.o0 = false;
                ha5Var.p0 = 0.0f;
                ha5Var.a.invalidate();
                ha5Var.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ha5 ha5Var;
        ha5 ha5Var2;
        ha5 ha5Var3;
        UndoView[] undoViewArr;
        if (g95.v5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            p85 p85Var = this.G;
            float y = p85Var.getY() - getTop();
            float measuredHeight = (p85Var.getMeasuredHeight() + y) - p85Var.getTranslationY();
            float f = this.c;
            canvas.save();
            boolean z = g95.v5;
            if (!z && (ha5Var = this.E) != null && !ha5Var.P && ha5Var.c != null) {
                float f2 = 1.0f - f;
                canvas.clipRect(0.0f, y * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
            } else if (z) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            ha5 ha5Var4 = this.F;
            if (ha5Var4 != null && ha5Var4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            ha5 ha5Var5 = this.E;
            if (ha5Var5 != null && ha5Var5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = gm.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z2 = this.H0 || this.K0 != null;
                if (z2) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((g95.u5 || g95.v5) ? 0 : gm.L(90.0f)));
                }
                canvas.translate(this.E.getX(), this.E.getY());
                ha5 ha5Var6 = this.E;
                float f3 = this.J0;
                if (ha5Var6.o0 != z2 || ha5Var6.p0 != f3) {
                    ha5Var6.o0 = z2;
                    ha5Var6.p0 = f3;
                    ha5Var6.a.invalidate();
                    ha5Var6.invalidate();
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
                float f4 = g95.u5 ? 0.0f : (1.0f - this.a0) * (-gm.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (g95.u5 ? 0 : gm.L(90.0f))) + f4) - gm.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i].getX() - gm.L(8.0f), undoViewArr2[i].getY() - gm.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i].getX() - gm.L(8.0f), ((undoViewArr2[i].getY() - (g95.u5 ? 0 : gm.L(90.0f))) + f4) - gm.L(26.0f));
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
        if (valueAnimator == null || (ha5Var2 = this.F) == null || (ha5Var3 = this.E) == null) {
            ha5 ha5Var7 = this.E;
            float f6 = 255.0f * f5;
            if (ha5Var7 != null) {
                gradientDrawable.setAlpha((int) ((1.0f - ha5Var7.a0) * f6));
                gradientDrawable2.setAlpha((int) ((1.0f - this.E.a0) * f6));
            } else {
                int i2 = (int) f6;
                gradientDrawable.setAlpha(i2);
                gradientDrawable2.setAlpha(i2);
            }
        } else {
            boolean z3 = ha5Var2.W;
            boolean z4 = ha5Var3.W;
            int alpha = (int) ((z3 != z4 ? (!z4 ? 1.0f - ha5Var3.getAlpha() : ha5Var3.getAlpha()) * f5 : !z4 ? 0.0f : f5) * 255.0f);
            gradientDrawable.setAlpha(alpha);
            gradientDrawable2.setAlpha(alpha);
        }
        this.l0.setAlpha(f5);
        qd2 qd2Var = this.j0;
        c7 c7Var = this.m0;
        ImageView imageView = this.w;
        if (qd2Var == null || !qd2Var.b.rtmp_stream) {
            c7Var.setAlpha(f5);
            c7Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        } else {
            c7Var.setAlpha(0.0f);
            c7Var.setVisibility(4);
            imageView.setAlpha(f5);
            imageView.setVisibility(0);
            if (g95.u5) {
                imageView.setTranslationX((1.0f - this.a0) * (-gm.L(72.0f)));
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
        float currentActionBarHeight = ((a.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - gm.L(1.0f);
        v43 v43Var = this.d0;
        float f7 = v43Var.g;
        float A = (td4.A(1.0f, f7, measuredWidth2, measuredWidth4 * f7) - gm.L(21.0f)) - (g95.v5 ? gm.L(328.0f) : g95.u5 ? gm.L(180.0f) : 0);
        textView.setTranslationX(A);
        textView2.setTranslationX(A);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        a91 a91Var = this.g0;
        a91Var.setTranslationX(A - gm.L(36.0f));
        a91Var.setTranslationY((a.getCurrentActionBarHeight() - a91Var.getMeasuredHeight()) / 2.0f);
        c7Var.setTranslationX(A - gm.L(44.0f));
        textView.setAlpha((1.0f - v43Var.g) * f5);
        textView2.setAlpha(v43Var.g * f5);
        a91Var.setAlpha(f5);
        float f8 = this.P;
        su suVar = this.J;
        if (f8 != 1.0f) {
            float f9 = f8 + 0.07272727f;
            this.P = f9;
            if (f9 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            suVar.invalidate();
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
        if (g95.u5) {
            suVar.setTranslationY(gm.L(16.0f));
        } else {
            suVar.setTranslationY((gm.L(8.0f) * this.a0) + ((1.0f - this.a0) * a.getCurrentActionBarHeight()) + gm.L(8.0f));
        }
        suVar.setAlpha(this.O * this.c);
        suVar.setScaleX((this.O * 0.5f) + 0.5f);
        suVar.setScaleY((this.O * 0.5f) + 0.5f);
        if (g95.v5) {
            this.V = true;
            super.dispatchDraw(canvas);
            this.V = false;
        } else {
            super.dispatchDraw(canvas);
        }
        y65 y65Var = this.H;
        if (y65Var.getVisibility() == 0) {
            for (int i3 = 0; i3 < y65Var.getChildCount(); i3++) {
                l95 l95Var = (l95) y65Var.getChildAt(i3);
                if (l95Var.getVisibility() == 0 && l95Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(y65Var.getX() + l95Var.getX(), y65Var.getY() + l95Var.getY());
                    canvas.scale(l95Var.getScaleX(), l95Var.getScaleY(), l95Var.getMeasuredWidth() / 2.0f, l95Var.getMeasuredHeight() / 2.0f);
                    l95Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.U;
        p85 p85Var = this.G;
        if (!z) {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof ha5) {
                    ha5 ha5Var = (ha5) view;
                    if (ha5Var != this.E && ha5Var != this.F && !this.V && !ha5Var.y0) {
                        if (ha5Var.c == null) {
                            if (!g95.v5) {
                                return super.drawChild(canvas, view, j);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                        float y = p85Var.getY() - getTop();
                        float measuredHeight = (p85Var.getMeasuredHeight() + y) - p85Var.getTranslationY();
                        float f = this.c;
                        if (ha5Var.d == null) {
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
        } else if ((view instanceof ha5) && ((ha5) view).y0) {
            float y2 = p85Var.getY() - getTop();
            float measuredHeight2 = (p85Var.getMeasuredHeight() + y2) - p85Var.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y2, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e(ha5 ha5Var) {
        this.I.remove(ha5Var);
        long B1 = k47.B1(ha5Var.x.a.peer);
        this.x.put(B1, r2.get(B1, 0) - 1);
    }

    public final void f() {
        jb5 jb5Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            jb5Var = this;
            ofFloat.addUpdateListener(new ys4(jb5Var, this.z0, this.s0, this.t0, (byte) 1));
            jb5Var.C0.addListener(new ib5(jb5Var, (byte) 2));
            jb5Var.C0.setDuration(350L);
            jb5Var.C0.setInterpolator(d53.f);
            jb5Var.C0.start();
            jb5Var.h = System.currentTimeMillis();
        } else {
            jb5Var = this;
        }
        jb5Var.B0 = false;
        jb5Var.u0 = false;
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
    public final void h(rd2 rd2Var) {
        long B1;
        ha5 ha5Var;
        ha5 ha5Var2;
        da5 da5Var;
        n95 n95Var;
        l95 l95Var;
        n95 n95Var2;
        rd2 rd2Var2;
        rd2 rd2Var3 = this.e;
        if (rd2Var == null) {
            if (rd2Var3 == null) {
                return;
            } else {
                B1 = 0;
            }
        } else if (rd2Var.equals(rd2Var3)) {
            return;
        } else {
            B1 = k47.B1(rd2Var.a.peer);
        }
        ha5 ha5Var3 = this.E;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (ha5Var3 != null) {
            ArrayList arrayList = ha5Var3.m0;
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
        if (sharedInstance != null && (rd2Var2 = this.e) != null) {
            sharedInstance.requestFullScreen(rd2Var2.a, false, rd2Var2.b);
        }
        this.e = rd2Var;
        byte b = 1;
        if (sharedInstance != null && rd2Var != null) {
            sharedInstance.requestFullScreen(rd2Var.a, true, rd2Var.b);
        }
        this.d = B1;
        boolean z = this.b;
        this.h = System.currentTimeMillis();
        byte b2 = 2;
        c51 c51Var = this.l0;
        g95 g95Var = this.k0;
        if (rd2Var == null) {
            if (this.b) {
                ValueAnimator valueAnimator2 = this.r;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.b = false;
                ha5 ha5Var4 = this.E;
                if (ha5Var4.c != null || ha5Var4.d != null || ha5Var4.e != null) {
                    rd2 rd2Var4 = ha5Var4.x;
                    if (qd2.E(rd2Var4.a, rd2Var4.b, this.j0)) {
                        this.E.h(false, true);
                    }
                }
                this.E.b(true);
                n95 n95Var3 = this.E.c;
                if (n95Var3 != null) {
                    n95Var3.setRenderer(null);
                }
                l95 l95Var2 = this.E.d;
                if (l95Var2 != null) {
                    l95Var2.setRenderer(null);
                }
                n95 n95Var4 = this.E.e;
                if (n95Var4 != null) {
                    n95Var4.setRenderer(null);
                }
                ha5 ha5Var5 = this.E;
                ha5Var5.animate().alpha(0.0f).setListener(new hb5(this, ha5Var5, b2)).setDuration(350L).start();
            }
            c51Var.setEnabled(false);
            this.f = false;
        } else {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i2 >= arrayList2.size()) {
                    ha5Var = null;
                    break;
                } else {
                    if (((ha5) arrayList2.get(i2)).x.equals(rd2Var)) {
                        ha5Var = (ha5) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            Property property = View.ALPHA;
            v43 v43Var = this.d0;
            if (ha5Var != null) {
                ValueAnimator valueAnimator3 = this.r;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                if (this.b) {
                    this.f = false;
                    v43Var.a(false, false);
                    this.E.b(false);
                    ha5Var.b(false);
                    if (!this.N0) {
                        ha5 ha5Var6 = this.E;
                        if (ha5Var6.c != null || ha5Var6.d != null || ha5Var6.e != null) {
                            ha5Var2 = new ha5(this, this.j0, g95Var);
                            ha5 ha5Var7 = this.E;
                            n95 n95Var5 = ha5Var7.c;
                            l95 l95Var3 = ha5Var7.d;
                            n95 n95Var6 = ha5Var7.e;
                            ha5Var2.c = n95Var5;
                            ha5Var2.d = l95Var3;
                            ha5Var2.e = n95Var6;
                            ha5Var2.g(this.b, false);
                            ha5Var2.j(false);
                            n95 n95Var7 = this.E.c;
                            if (n95Var7 != null) {
                                n95Var7.setRenderer(ha5Var2);
                            }
                            l95 l95Var4 = this.E.d;
                            if (l95Var4 != null) {
                                l95Var4.setRenderer(ha5Var2);
                            }
                            n95 n95Var8 = this.E.e;
                            if (n95Var8 != null) {
                                n95Var8.setRenderer(ha5Var2);
                            }
                            ha5 ha5Var8 = new ha5(this, this.j0, g95Var);
                            ha5Var8.x = ha5Var.x;
                            n95 n95Var9 = ha5Var.c;
                            l95 l95Var5 = ha5Var.d;
                            n95 n95Var10 = ha5Var.e;
                            ha5Var8.c = n95Var9;
                            ha5Var8.d = l95Var5;
                            ha5Var8.e = n95Var10;
                            ha5Var8.g(this.b, false);
                            ha5Var8.j(false);
                            da5Var = ha5Var8.a;
                            da5Var.d.setAlpha(1.0f);
                            da5Var.e.setAlpha(1.0f);
                            n95Var = ha5Var.c;
                            if (n95Var != null) {
                                n95Var.setRenderer(ha5Var8);
                            }
                            l95Var = ha5Var.d;
                            if (l95Var != null) {
                                l95Var.setRenderer(ha5Var8);
                            }
                            n95Var2 = ha5Var.e;
                            if (n95Var2 != null) {
                                n95Var2.setRenderer(ha5Var8);
                            }
                            ha5Var8.F = true;
                            ha5Var8.setAlpha(0.0f);
                            this.F = this.E;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ha5Var8, (Property<ha5, Float>) property, 0.0f, 1.0f);
                            this.O0 = ofFloat;
                            ofFloat.addListener(new i8(this, ha5Var8, ha5Var, (byte) 7));
                            if (ha5Var2 != null) {
                                ha5Var2.setAlpha(0.0f);
                                ha5Var2.setScaleX(0.5f);
                                ha5Var2.setScaleY(0.5f);
                                ha5Var2.F = true;
                            }
                            if4 if4Var = new if4((Object) this, (Object) ha5Var, (Object) ha5Var2, (byte) 20);
                            if (da5Var.d.isFirstFrameRendered()) {
                                gm.d3(if4Var, 250L);
                                ha5Var8.m0.add(if4Var);
                            } else {
                                if4Var.run();
                            }
                            d();
                            this.E = ha5Var8;
                            ha5Var8.h(true, false);
                            j();
                        }
                    }
                    ha5Var2 = null;
                    ha5 ha5Var82 = new ha5(this, this.j0, g95Var);
                    ha5Var82.x = ha5Var.x;
                    n95 n95Var92 = ha5Var.c;
                    l95 l95Var52 = ha5Var.d;
                    n95 n95Var102 = ha5Var.e;
                    ha5Var82.c = n95Var92;
                    ha5Var82.d = l95Var52;
                    ha5Var82.e = n95Var102;
                    ha5Var82.g(this.b, false);
                    ha5Var82.j(false);
                    da5Var = ha5Var82.a;
                    da5Var.d.setAlpha(1.0f);
                    da5Var.e.setAlpha(1.0f);
                    n95Var = ha5Var.c;
                    if (n95Var != null) {
                    }
                    l95Var = ha5Var.d;
                    if (l95Var != null) {
                    }
                    n95Var2 = ha5Var.e;
                    if (n95Var2 != null) {
                    }
                    ha5Var82.F = true;
                    ha5Var82.setAlpha(0.0f);
                    this.F = this.E;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ha5Var82, (Property<ha5, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat2;
                    ofFloat2.addListener(new i8(this, ha5Var82, ha5Var, (byte) 7));
                    if (ha5Var2 != null) {
                    }
                    if4 if4Var2 = new if4((Object) this, (Object) ha5Var, (Object) ha5Var2, (byte) 20);
                    if (da5Var.d.isFirstFrameRendered()) {
                    }
                    d();
                    this.E = ha5Var82;
                    ha5Var82.h(true, false);
                    j();
                } else {
                    this.b = true;
                    d();
                    this.E = ha5Var;
                    ha5Var.h(true, true);
                    invalidate();
                    v43Var.a(this.f, false);
                }
            } else if (this.b) {
                ha5 ha5Var9 = this.E;
                if (ha5Var9.c == null) {
                    if (!((ha5Var9.d != null) | (ha5Var9.e != null))) {
                        ha5Var9.b(true);
                        ha5 ha5Var10 = new ha5(this, this.j0, g95Var);
                        ha5Var10.x = rd2Var;
                        ha5Var10.g(this.b, false);
                        ha5Var10.h(true, false);
                        ha5Var10.F = true;
                        ha5Var10.setAlpha(0.0f);
                        this.F = this.E;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.O0 = ofFloat3;
                        ofFloat3.addUpdateListener(new pl(this, ha5Var10, (byte) 16));
                        this.O0.addListener(new hb5(this, ha5Var10, objArr2 == true ? 1 : 0));
                        this.O0.start();
                        d();
                        this.E = ha5Var10;
                        ha5Var10.h(true, false);
                        this.E.j(false);
                        j();
                    }
                }
                ha5Var9.b(false);
                ha5 ha5Var11 = new ha5(this, this.j0, g95Var);
                ha5 ha5Var12 = this.E;
                n95 n95Var11 = ha5Var12.c;
                l95 l95Var6 = ha5Var12.d;
                n95 n95Var12 = ha5Var12.e;
                ha5Var11.c = n95Var11;
                ha5Var11.d = l95Var6;
                ha5Var11.e = n95Var12;
                ha5Var11.g(this.b, false);
                ha5Var11.j(false);
                n95 n95Var13 = this.E.c;
                if (n95Var13 != null) {
                    n95Var13.setRenderer(ha5Var11);
                }
                l95 l95Var7 = this.E.d;
                if (l95Var7 != null) {
                    l95Var7.setRenderer(ha5Var11);
                }
                n95 n95Var14 = this.E.e;
                if (n95Var14 != null) {
                    n95Var14.setRenderer(ha5Var11);
                }
                ha5Var11.setAlpha(0.0f);
                ha5Var11.setScaleX(0.5f);
                ha5Var11.setScaleY(0.5f);
                ha5Var11.F = true;
                ve4 ve4Var = new ve4(this, ha5Var11, (byte) 28);
                if (ha5Var11.a.d.isFirstFrameRendered()) {
                    ve4Var.run();
                } else {
                    gm.d3(ve4Var, 250L);
                    ha5Var11.m0.add(ve4Var);
                }
                ha5 ha5Var102 = new ha5(this, this.j0, g95Var);
                ha5Var102.x = rd2Var;
                ha5Var102.g(this.b, false);
                ha5Var102.h(true, false);
                ha5Var102.F = true;
                ha5Var102.setAlpha(0.0f);
                this.F = this.E;
                ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.O0 = ofFloat32;
                ofFloat32.addUpdateListener(new pl(this, ha5Var102, (byte) 16));
                this.O0.addListener(new hb5(this, ha5Var102, objArr2 == true ? 1 : 0));
                this.O0.start();
                d();
                this.E = ha5Var102;
                ha5Var102.h(true, false);
                this.E.j(false);
                j();
            } else {
                this.b = true;
                d();
                ha5 ha5Var13 = new ha5(this, this.j0, g95Var);
                this.E = ha5Var13;
                ha5Var13.x = rd2Var;
                ha5Var13.g(this.b, false);
                this.E.h(true, false);
                this.E.h(true, false);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<ha5, Float>) property, 0.0f, 1.0f);
                this.O0 = ofFloat4;
                ofFloat4.addListener(new ib5(this, objArr == true ? 1 : 0));
                this.O0.start();
                invalidate();
                v43Var.a(this.f, false);
            }
            c51Var.setEnabled(true);
        }
        boolean z2 = this.b;
        if (z != z2) {
            if (z2) {
                c51Var.setVisibility(0);
                this.m0.setVisibility(0);
                this.f0.setVisibility(0);
                this.g0.setVisibility(0);
            } else {
                setUiVisible(true);
                if (this.h0) {
                    this.h0 = false;
                    gm.r(this.i0);
                }
            }
            g(true);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
            this.r = ofFloat5;
            ofFloat5.addUpdateListener(new gb5(this, b));
            ha5 ha5Var14 = this.E;
            ha5Var14.r = true;
            int i3 = g95Var.a;
            this.M0 = this.H0;
            this.y.d();
            this.r.addListener(new hb5(this, ha5Var14, b));
            this.r.setInterpolator(d53.f);
            this.r.setDuration(350L);
            da5 da5Var2 = this.E.a;
            ValueAnimator valueAnimator4 = this.r;
            if (da5Var2.F) {
                da5Var2.H.add(valueAnimator4);
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
            if (k47.B1(((ha5) arrayList.get(i)).x.a.peer) == k47.B1(groupCallParticipant.peer)) {
                ((ha5) arrayList.get(i)).setAmplitude(f);
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
        boolean z = g95.v5;
        View view = this.n0;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gm.L(328.0f);
        } else if (g95.u5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gm.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!g95.u5 || g95.v5) ? 8 : 0);
        a91 a91Var = this.g0;
        a91Var.getLayoutParams().height = gm.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i2);
        a91Var.getLayoutParams().width = gm.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = g95.u5 ? gm.L(45.0f) : 0;
        for (int i3 = 0; i3 < 2; i3++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i3].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = gm.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = g95.u5 ? gm.L(180.0f) : 0;
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
        g95 g95Var = this.k0;
        if ((z2 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= gm.L(120.0f)) {
                    b(false);
                } else {
                    g95Var.V0(null);
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
        ha5 ha5Var = this.E;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ey0 ey0Var = ha5Var.O;
        Rect rect = ha5Var.z0;
        ey0Var.getHitRect(rect);
        if (!rect.contains((int) x, (int) y)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = gm.P;
                rectF.set(0.0f, a.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((g95.u5 && this.W) ? -gm.L(90.0f) : 0), this.E.getMeasuredHeight() + ((g95.u5 || !this.W) ? 0 : -gm.L(90.0f)));
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
                    RectF rectF2 = gm.P;
                    su suVar = this.J;
                    rectF2.set(suVar.getX(), suVar.getY(), suVar.getX() + suVar.getWidth(), suVar.getY() + suVar.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z3 = false;
                        z = false;
                        for (int i = 0; i < this.j0.f.size(); i++) {
                            if (this.N == k47.B1(((rd2) this.j0.f.get(i)).a.peer)) {
                                g95Var.V0((rd2) this.j0.f.get(i));
                                z3 = true;
                                z = true;
                            }
                        }
                        if (!z3) {
                            g95Var.V0(new rd2((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
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
                        zjc zjcVar = this.E.a.d;
                        RectF rectF3 = gm.P;
                        rectF3.set(zjcVar.getX(), zjcVar.getY(), zjcVar.getX() + zjcVar.getMeasuredWidth(), zjcVar.getY() + zjcVar.getMeasuredHeight());
                        rectF3.inset(((zjcVar.getMeasuredHeight() * this.E.a.U) - zjcVar.getMeasuredHeight()) / 2.0f, ((zjcVar.getMeasuredWidth() * this.E.a.U) - zjcVar.getMeasuredWidth()) / 2.0f);
                        boolean z4 = g95.u5;
                        float f2 = rectF3.top;
                        if (z4) {
                            rectF3.top = Math.max(f2, a.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.E.getMeasuredWidth() - gm.L(90.0f));
                        } else {
                            rectF3.top = Math.max(f2, a.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.E.getMeasuredHeight() - gm.L(90.0f));
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

    public void setGroupCall(qd2 qd2Var) {
        this.j0 = qd2Var;
    }

    public void setIsTablet(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            c51 c51Var = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c51Var.getLayoutParams();
            layoutParams.gravity = z ? 85 : 51;
            layoutParams.rightMargin = z ? gm.L(328.0f) : 0;
            layoutParams.bottomMargin = z ? -gm.L(8.0f) : 0;
            if (this.N0) {
                c51Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            ee0 ee0Var = new ee0(false);
            ee0Var.a(-1);
            c51Var.setImageDrawable(ee0Var);
        }
    }

    public void setProgressToHideUi(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidate();
            ha5 ha5Var = this.E;
            if (ha5Var != null) {
                ha5Var.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z) {
        hd0 hd0Var;
        boolean z2;
        int i;
        long j;
        TLRPC.Chat L0;
        TLRPC.User user;
        if (!this.b || this.N0 || this.e == null || this.r != null || this.j0 == null) {
            if (this.M) {
                this.M = false;
                this.O = 0.0f;
                return;
            }
            return;
        }
        int i2 = this.k0.a;
        long j2 = 500;
        if (System.currentTimeMillis() - this.P0 < 500) {
            if (this.Q0 == null) {
                qn4 qn4Var = new qn4(this, (byte) 25);
                this.Q0 = qn4Var;
                gm.d3(qn4Var, (System.currentTimeMillis() - this.P0) + 50);
                return;
            }
            return;
        }
        this.P0 = System.currentTimeMillis();
        int i3 = 0;
        int i4 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        while (true) {
            int m = this.j0.P.m();
            hd0Var = this.K;
            if (i3 >= m) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i3));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i = i3;
                j = j2;
            } else {
                j = j2;
                if (k47.B1(this.e.a.peer) == k47.B1(groupCallParticipant.peer)) {
                    i = i3;
                } else {
                    long B1 = k47.B1(groupCallParticipant.peer);
                    i = i3;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i4 == 0) {
                            this.N = k47.B1(groupCallParticipant.peer);
                        }
                        if (i4 < 3) {
                            if (B1 > 0) {
                                user = oc7.r1(i2).W1(Long.valueOf(B1));
                                L0 = null;
                            } else {
                                L0 = oc7.r1(i2).L0(Long.valueOf(B1));
                                user = null;
                            }
                            if (user != null || L0 != null) {
                                hd0Var.b(i4, i2, groupCallParticipant);
                                if (i4 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(m9c.k(user, true), new z5c(gm.o()), 0);
                                } else {
                                    spannableStringBuilder.append(L0.title, new z5c(gm.o()), 0);
                                }
                            }
                        }
                        i4++;
                        if (i4 == 3) {
                            break;
                        }
                    }
                }
            }
            i3 = i + 1;
            j2 = j;
        }
        boolean z3 = i4 != 0;
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
                su suVar = this.J;
                this.Q = suVar.getLeft();
                this.S = suVar.getRight();
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
        String J0 = jb6.J0(i4, "MembersAreSpeakingToast");
        int indexOf = J0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i4 != 0 ? i4 == 1 ? gm.L(40.0f) : i4 == 2 ? gm.L(64.0f) : gm.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = gm.L(16.0f);
        this.M = z3;
        invalidate();
        while (i4 < 3) {
            hd0Var.b(i4, i2, null);
            i4++;
        }
        hd0Var.a(z2);
    }
}
