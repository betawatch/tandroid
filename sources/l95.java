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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class l95 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public h85 E;
    public boolean E0;
    public h85 F;
    public float F0;
    public final r65 G;
    public float G0;
    public final a55 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final st J;
    public float J0;
    public final hc0 K;
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
    public iu4 Q0;
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
    public final k33 d0;
    public gc2 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final s71 g0;
    public long h;
    public boolean h0;
    public final ez3 i0;
    public fc2 j0;
    public final h75 k0;
    public final v31 l0;
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
    public final on y;
    public int y0;
    public float z0;

    /* JADX WARN: Multi-variable type inference failed */
    public l95(LaunchActivity launchActivity, r65 r65Var, a55 a55Var, ArrayList arrayList, fc2 fc2Var, h75 h75Var) {
        super(launchActivity);
        this.x = new LongSparseIntArray();
        this.y = new on(null);
        this.P = 1.0f;
        final byte b = 1;
        this.W = true;
        final e55 e55Var = (e55) this;
        this.i0 = new ez3(e55Var, (byte) 13);
        this.z0 = 1.0f;
        byte b2 = 2;
        this.L0 = new UndoView[2];
        this.G = r65Var;
        this.H = a55Var;
        this.I = arrayList;
        this.j0 = fc2Var;
        this.k0 = h75Var;
        v31 v31Var = new v31(launchActivity, b2);
        this.l0 = v31Var;
        ed0 ed0Var = new ed0(false);
        ed0Var.a(-1);
        v31Var.setImageDrawable(ed0Var);
        v31Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        v31Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        v31Var.setBackground(bkb.f0(bm2.o(-1, 55), 1, -1));
        View view = new View(launchActivity);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, bm2.o(-16777216, kk7.y1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, nme.c(120.0f, -1));
        View view2 = new View(launchActivity);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, bm2.o(-16777216, kk7.y1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility(8);
        addView(view2, nme.e(kk7.p2, -1, 5));
        addView(v31Var, nme.e(56, -1, 51));
        final Object[] objArr = 0 == true ? 1 : 0;
        v31Var.setOnClickListener(new View.OnClickListener() { // from class: h95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = objArr;
                e55 e55Var2 = e55Var;
                switch (b3) {
                    case 0:
                        e55Var2.R0.onBackPressed();
                        break;
                    default:
                        if (e55Var2.b) {
                            boolean z = !e55Var2.f;
                            e55Var2.f = z;
                            e55Var2.d0.a(z, true);
                            e55Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        c7 c7Var = new c7(b2, launchActivity, e55Var);
        this.m0 = c7Var;
        int L = gl.L(20.0f);
        int o = bm2.o(-1, 100);
        ff0 i0 = bkb.i0(L, L, L, L, 0, o, o);
        s71 s71Var = new s71((Object) e55Var, (Context) launchActivity, (Object) i0, (byte) 9);
        this.g0 = s71Var;
        s71Var.setOnClickListener(new View.OnClickListener() { // from class: h95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                e55 e55Var2 = e55Var;
                switch (b3) {
                    case 0:
                        e55Var2.R0.onBackPressed();
                        break;
                    default:
                        if (e55Var2.b) {
                            boolean z = !e55Var2.f;
                            e55Var2.f = z;
                            e55Var2.d0.a(z, true);
                            e55Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        i0.setCallback(s71Var);
        addView(s71Var);
        k33 k33Var = new k33(launchActivity, R.drawable.msg_pin_filled, -1);
        this.d0 = k33Var;
        float f = -gl.L(1.0f);
        float L2 = gl.L(2.0f);
        float L3 = gl.L(1.0f);
        k33Var.i = f;
        k33Var.j = L2;
        k33Var.k = L3;
        k33Var.invalidateSelf();
        c7Var.setImageDrawable(k33Var);
        c7Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        addView(c7Var, nme.e(56, -1, 51));
        TextView textView = new TextView(launchActivity);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131752587, null));
        TextView textView2 = new TextView(launchActivity);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131752586, null));
        addView(textView, nme.e(-2, -2, 51));
        addView(textView2, nme.e(-2, -2, 51));
        ImageView imageView = new ImageView(launchActivity);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(k96.M0(2131754807, null));
        int L4 = gl.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(bkb.f0(bm2.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new xf3((Object) e55Var, (Object) h75Var, (byte) 22));
        addView(imageView, nme.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        st stVar = new st(e55Var, launchActivity, bkb.b0(gl.L(18.0f), bm2.o(bkb.w0(null, bkb.jh, false), kk7.h3)), (byte) 18);
        this.J = stVar;
        hc0 hc0Var = new hc0(launchActivity, true);
        this.K = hc0Var;
        hc0Var.setStyle(10);
        stVar.setClipChildren(false);
        stVar.setClipToPadding(false);
        stVar.addView(hc0Var, nme.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(launchActivity);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        stVar.addView(textView3, nme.e(-2, -2, 16));
        addView(stVar, nme.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        for (int i = 0; i < 2; i++) {
            this.L0[i] = new xr1(e55Var, launchActivity);
            this.L0[i].setHideAnimationType(2);
            this.L0[i].setAdditionalTranslationY(gl.L(10.0f));
            addView(this.L0[i], nme.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
        }
        this.g0.setVisibility(8);
        setIsTablet(h75.v5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z) {
        if (this.W != z) {
            this.W = z;
            h75 h75Var = ((e55) this).R0;
            if (h75Var.T3 != null) {
                h75Var.o5.a(!r1.W, true);
            }
            ez3 ez3Var = this.i0;
            if (!z || !this.b) {
                this.h0 = false;
                gl.r(ez3Var);
            } else if (!this.h0) {
                this.h0 = true;
                gl.d3(ez3Var, 3000L);
            }
            h85 h85Var = this.E;
            if (h85Var != null) {
                h85Var.requestLayout();
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
            ofFloat.addUpdateListener(new i95(this, b));
            this.K0.addListener(new k95(this, b2));
            ValueAnimator valueAnimator = this.K0;
            s33 s33Var = s33.f;
            valueAnimator.setInterpolator(s33Var);
            this.K0.setDuration(z ? 350L : 200L);
            this.K0.setInterpolator(s33Var);
            h85 h85Var = this.E;
            if (h85Var != null) {
                d85 d85Var = h85Var.a;
                ValueAnimator valueAnimator2 = this.K0;
                if (d85Var.F) {
                    d85Var.H.add(valueAnimator2);
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
        h85 h85Var = this.E;
        if (h85Var != null) {
            if (h85Var.o0 || h85Var.p0 != 0.0f) {
                h85Var.o0 = false;
                h85Var.p0 = 0.0f;
                h85Var.a.invalidate();
                h85Var.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h85 h85Var;
        h85 h85Var2;
        h85 h85Var3;
        UndoView[] undoViewArr;
        if (h75.v5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            r65 r65Var = this.G;
            float y = r65Var.getY() - getTop();
            float measuredHeight = (r65Var.getMeasuredHeight() + y) - r65Var.getTranslationY();
            float f = this.c;
            canvas.save();
            boolean z = h75.v5;
            if (!z && (h85Var = this.E) != null && !h85Var.P && h85Var.c != null) {
                float f2 = 1.0f - f;
                canvas.clipRect(0.0f, y * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
            } else if (z) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            h85 h85Var4 = this.F;
            if (h85Var4 != null && h85Var4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            h85 h85Var5 = this.E;
            if (h85Var5 != null && h85Var5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = gl.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z2 = this.H0 || this.K0 != null;
                if (z2) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((h75.u5 || h75.v5) ? 0 : gl.L(90.0f)));
                }
                canvas.translate(this.E.getX(), this.E.getY());
                h85 h85Var6 = this.E;
                float f3 = this.J0;
                if (h85Var6.o0 != z2 || h85Var6.p0 != f3) {
                    h85Var6.o0 = z2;
                    h85Var6.p0 = f3;
                    h85Var6.a.invalidate();
                    h85Var6.invalidate();
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
                float f4 = h75.u5 ? 0.0f : (1.0f - this.a0) * (-gl.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (h75.u5 ? 0 : gl.L(90.0f))) + f4) - gl.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i].getX() - gl.L(8.0f), undoViewArr2[i].getY() - gl.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i].getX() - gl.L(8.0f), ((undoViewArr2[i].getY() - (h75.u5 ? 0 : gl.L(90.0f))) + f4) - gl.L(26.0f));
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
        if (valueAnimator == null || (h85Var2 = this.F) == null || (h85Var3 = this.E) == null) {
            h85 h85Var7 = this.E;
            float f6 = 255.0f * f5;
            if (h85Var7 != null) {
                gradientDrawable.setAlpha((int) ((1.0f - h85Var7.a0) * f6));
                gradientDrawable2.setAlpha((int) ((1.0f - this.E.a0) * f6));
            } else {
                int i2 = (int) f6;
                gradientDrawable.setAlpha(i2);
                gradientDrawable2.setAlpha(i2);
            }
        } else {
            boolean z3 = h85Var2.W;
            boolean z4 = h85Var3.W;
            int alpha = (int) ((z3 != z4 ? (!z4 ? 1.0f - h85Var3.getAlpha() : h85Var3.getAlpha()) * f5 : !z4 ? 0.0f : f5) * 255.0f);
            gradientDrawable.setAlpha(alpha);
            gradientDrawable2.setAlpha(alpha);
        }
        this.l0.setAlpha(f5);
        fc2 fc2Var = this.j0;
        c7 c7Var = this.m0;
        ImageView imageView = this.w;
        if (fc2Var == null || !fc2Var.b.rtmp_stream) {
            c7Var.setAlpha(f5);
            c7Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        } else {
            c7Var.setAlpha(0.0f);
            c7Var.setVisibility(4);
            imageView.setAlpha(f5);
            imageView.setVisibility(0);
            if (h75.u5) {
                imageView.setTranslationX((1.0f - this.a0) * (-gl.L(72.0f)));
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
        float currentActionBarHeight = ((a.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - gl.L(1.0f);
        k33 k33Var = this.d0;
        float f7 = k33Var.g;
        float A = (tb4.A(1.0f, f7, measuredWidth2, measuredWidth4 * f7) - gl.L(21.0f)) - (h75.v5 ? gl.L(328.0f) : h75.u5 ? gl.L(180.0f) : 0);
        textView.setTranslationX(A);
        textView2.setTranslationX(A);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        s71 s71Var = this.g0;
        s71Var.setTranslationX(A - gl.L(36.0f));
        s71Var.setTranslationY((a.getCurrentActionBarHeight() - s71Var.getMeasuredHeight()) / 2.0f);
        c7Var.setTranslationX(A - gl.L(44.0f));
        textView.setAlpha((1.0f - k33Var.g) * f5);
        textView2.setAlpha(k33Var.g * f5);
        s71Var.setAlpha(f5);
        float f8 = this.P;
        st stVar = this.J;
        if (f8 != 1.0f) {
            float f9 = f8 + 0.07272727f;
            this.P = f9;
            if (f9 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            stVar.invalidate();
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
        if (h75.u5) {
            stVar.setTranslationY(gl.L(16.0f));
        } else {
            stVar.setTranslationY((gl.L(8.0f) * this.a0) + ((1.0f - this.a0) * a.getCurrentActionBarHeight()) + gl.L(8.0f));
        }
        stVar.setAlpha(this.O * this.c);
        stVar.setScaleX((this.O * 0.5f) + 0.5f);
        stVar.setScaleY((this.O * 0.5f) + 0.5f);
        if (h75.v5) {
            this.V = true;
            super.dispatchDraw(canvas);
            this.V = false;
        } else {
            super.dispatchDraw(canvas);
        }
        a55 a55Var = this.H;
        if (a55Var.getVisibility() == 0) {
            for (int i3 = 0; i3 < a55Var.getChildCount(); i3++) {
                m75 m75Var = (m75) a55Var.getChildAt(i3);
                if (m75Var.getVisibility() == 0 && m75Var.getAlpha() != 0.0f) {
                    canvas.save();
                    canvas.translate(a55Var.getX() + m75Var.getX(), a55Var.getY() + m75Var.getY());
                    canvas.scale(m75Var.getScaleX(), m75Var.getScaleY(), m75Var.getMeasuredWidth() / 2.0f, m75Var.getMeasuredHeight() / 2.0f);
                    m75Var.c(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = this.U;
        r65 r65Var = this.G;
        if (!z) {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof h85) {
                    h85 h85Var = (h85) view;
                    if (h85Var != this.E && h85Var != this.F && !this.V && !h85Var.y0) {
                        if (h85Var.c == null) {
                            if (!h75.v5) {
                                return super.drawChild(canvas, view, j);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return drawChild;
                        }
                        float y = r65Var.getY() - getTop();
                        float measuredHeight = (r65Var.getMeasuredHeight() + y) - r65Var.getTranslationY();
                        float f = this.c;
                        if (h85Var.d == null) {
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
        } else if ((view instanceof h85) && ((h85) view).y0) {
            float y2 = r65Var.getY() - getTop();
            float measuredHeight2 = (r65Var.getMeasuredHeight() + y2) - r65Var.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y2, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e(h85 h85Var) {
        this.I.remove(h85Var);
        long B1 = k27.B1(h85Var.x.a.peer);
        this.x.put(B1, r2.get(B1, 0) - 1);
    }

    public final void f() {
        l95 l95Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            l95Var = this;
            ofFloat.addUpdateListener(new xq4(l95Var, this.z0, this.s0, this.t0, (byte) 1));
            l95Var.C0.addListener(new k95(l95Var, (byte) 2));
            l95Var.C0.setDuration(350L);
            l95Var.C0.setInterpolator(s33.f);
            l95Var.C0.start();
            l95Var.h = System.currentTimeMillis();
        } else {
            l95Var = this;
        }
        l95Var.B0 = false;
        l95Var.u0 = false;
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
    public final void h(gc2 gc2Var) {
        long B1;
        h85 h85Var;
        h85 h85Var2;
        d85 d85Var;
        o75 o75Var;
        m75 m75Var;
        o75 o75Var2;
        gc2 gc2Var2;
        gc2 gc2Var3 = this.e;
        if (gc2Var == null) {
            if (gc2Var3 == null) {
                return;
            } else {
                B1 = 0;
            }
        } else if (gc2Var.equals(gc2Var3)) {
            return;
        } else {
            B1 = k27.B1(gc2Var.a.peer);
        }
        h85 h85Var3 = this.E;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (h85Var3 != null) {
            ArrayList arrayList = h85Var3.m0;
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
        if (sharedInstance != null && (gc2Var2 = this.e) != null) {
            sharedInstance.requestFullScreen(gc2Var2.a, false, gc2Var2.b);
        }
        this.e = gc2Var;
        byte b = 1;
        if (sharedInstance != null && gc2Var != null) {
            sharedInstance.requestFullScreen(gc2Var.a, true, gc2Var.b);
        }
        this.d = B1;
        boolean z = this.b;
        this.h = System.currentTimeMillis();
        byte b2 = 2;
        v31 v31Var = this.l0;
        h75 h75Var = this.k0;
        if (gc2Var == null) {
            if (this.b) {
                ValueAnimator valueAnimator2 = this.r;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.b = false;
                h85 h85Var4 = this.E;
                if (h85Var4.c != null || h85Var4.d != null || h85Var4.e != null) {
                    gc2 gc2Var4 = h85Var4.x;
                    if (fc2.E(gc2Var4.a, gc2Var4.b, this.j0)) {
                        this.E.h(false, true);
                    }
                }
                this.E.b(true);
                o75 o75Var3 = this.E.c;
                if (o75Var3 != null) {
                    o75Var3.setRenderer(null);
                }
                m75 m75Var2 = this.E.d;
                if (m75Var2 != null) {
                    m75Var2.setRenderer(null);
                }
                o75 o75Var4 = this.E.e;
                if (o75Var4 != null) {
                    o75Var4.setRenderer(null);
                }
                h85 h85Var5 = this.E;
                h85Var5.animate().alpha(0.0f).setListener(new j95(this, h85Var5, b2)).setDuration(350L).start();
            }
            v31Var.setEnabled(false);
            this.f = false;
        } else {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i2 >= arrayList2.size()) {
                    h85Var = null;
                    break;
                } else {
                    if (((h85) arrayList2.get(i2)).x.equals(gc2Var)) {
                        h85Var = (h85) arrayList2.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            Property property = View.ALPHA;
            k33 k33Var = this.d0;
            if (h85Var != null) {
                ValueAnimator valueAnimator3 = this.r;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                if (this.b) {
                    this.f = false;
                    k33Var.a(false, false);
                    this.E.b(false);
                    h85Var.b(false);
                    if (!this.N0) {
                        h85 h85Var6 = this.E;
                        if (h85Var6.c != null || h85Var6.d != null || h85Var6.e != null) {
                            h85Var2 = new h85(this, this.j0, h75Var);
                            h85 h85Var7 = this.E;
                            o75 o75Var5 = h85Var7.c;
                            m75 m75Var3 = h85Var7.d;
                            o75 o75Var6 = h85Var7.e;
                            h85Var2.c = o75Var5;
                            h85Var2.d = m75Var3;
                            h85Var2.e = o75Var6;
                            h85Var2.g(this.b, false);
                            h85Var2.j(false);
                            o75 o75Var7 = this.E.c;
                            if (o75Var7 != null) {
                                o75Var7.setRenderer(h85Var2);
                            }
                            m75 m75Var4 = this.E.d;
                            if (m75Var4 != null) {
                                m75Var4.setRenderer(h85Var2);
                            }
                            o75 o75Var8 = this.E.e;
                            if (o75Var8 != null) {
                                o75Var8.setRenderer(h85Var2);
                            }
                            h85 h85Var8 = new h85(this, this.j0, h75Var);
                            h85Var8.x = h85Var.x;
                            o75 o75Var9 = h85Var.c;
                            m75 m75Var5 = h85Var.d;
                            o75 o75Var10 = h85Var.e;
                            h85Var8.c = o75Var9;
                            h85Var8.d = m75Var5;
                            h85Var8.e = o75Var10;
                            h85Var8.g(this.b, false);
                            h85Var8.j(false);
                            d85Var = h85Var8.a;
                            d85Var.d.setAlpha(1.0f);
                            d85Var.e.setAlpha(1.0f);
                            o75Var = h85Var.c;
                            if (o75Var != null) {
                                o75Var.setRenderer(h85Var8);
                            }
                            m75Var = h85Var.d;
                            if (m75Var != null) {
                                m75Var.setRenderer(h85Var8);
                            }
                            o75Var2 = h85Var.e;
                            if (o75Var2 != null) {
                                o75Var2.setRenderer(h85Var8);
                            }
                            h85Var8.F = true;
                            h85Var8.setAlpha(0.0f);
                            this.F = this.E;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h85Var8, (Property<h85, Float>) property, 0.0f, 1.0f);
                            this.O0 = ofFloat;
                            ofFloat.addListener(new i8(this, h85Var8, h85Var, (byte) 6));
                            if (h85Var2 != null) {
                                h85Var2.setAlpha(0.0f);
                                h85Var2.setScaleX(0.5f);
                                h85Var2.setScaleY(0.5f);
                                h85Var2.F = true;
                            }
                            jf4 jf4Var = new jf4((Object) this, (Object) h85Var, (Object) h85Var2, (byte) 18);
                            if (d85Var.d.isFirstFrameRendered()) {
                                gl.d3(jf4Var, 250L);
                                h85Var8.m0.add(jf4Var);
                            } else {
                                jf4Var.run();
                            }
                            d();
                            this.E = h85Var8;
                            h85Var8.h(true, false);
                            j();
                        }
                    }
                    h85Var2 = null;
                    h85 h85Var82 = new h85(this, this.j0, h75Var);
                    h85Var82.x = h85Var.x;
                    o75 o75Var92 = h85Var.c;
                    m75 m75Var52 = h85Var.d;
                    o75 o75Var102 = h85Var.e;
                    h85Var82.c = o75Var92;
                    h85Var82.d = m75Var52;
                    h85Var82.e = o75Var102;
                    h85Var82.g(this.b, false);
                    h85Var82.j(false);
                    d85Var = h85Var82.a;
                    d85Var.d.setAlpha(1.0f);
                    d85Var.e.setAlpha(1.0f);
                    o75Var = h85Var.c;
                    if (o75Var != null) {
                    }
                    m75Var = h85Var.d;
                    if (m75Var != null) {
                    }
                    o75Var2 = h85Var.e;
                    if (o75Var2 != null) {
                    }
                    h85Var82.F = true;
                    h85Var82.setAlpha(0.0f);
                    this.F = this.E;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(h85Var82, (Property<h85, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat2;
                    ofFloat2.addListener(new i8(this, h85Var82, h85Var, (byte) 6));
                    if (h85Var2 != null) {
                    }
                    jf4 jf4Var2 = new jf4((Object) this, (Object) h85Var, (Object) h85Var2, (byte) 18);
                    if (d85Var.d.isFirstFrameRendered()) {
                    }
                    d();
                    this.E = h85Var82;
                    h85Var82.h(true, false);
                    j();
                } else {
                    this.b = true;
                    d();
                    this.E = h85Var;
                    h85Var.h(true, true);
                    invalidate();
                    k33Var.a(this.f, false);
                }
            } else if (this.b) {
                h85 h85Var9 = this.E;
                if (h85Var9.c == null) {
                    if (!((h85Var9.d != null) | (h85Var9.e != null))) {
                        h85Var9.b(true);
                        h85 h85Var10 = new h85(this, this.j0, h75Var);
                        h85Var10.x = gc2Var;
                        h85Var10.g(this.b, false);
                        h85Var10.h(true, false);
                        h85Var10.F = true;
                        h85Var10.setAlpha(0.0f);
                        this.F = this.E;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.O0 = ofFloat3;
                        ofFloat3.addUpdateListener(new pk(this, h85Var10, (byte) 16));
                        this.O0.addListener(new j95(this, h85Var10, objArr2 == true ? 1 : 0));
                        this.O0.start();
                        d();
                        this.E = h85Var10;
                        h85Var10.h(true, false);
                        this.E.j(false);
                        j();
                    }
                }
                h85Var9.b(false);
                h85 h85Var11 = new h85(this, this.j0, h75Var);
                h85 h85Var12 = this.E;
                o75 o75Var11 = h85Var12.c;
                m75 m75Var6 = h85Var12.d;
                o75 o75Var12 = h85Var12.e;
                h85Var11.c = o75Var11;
                h85Var11.d = m75Var6;
                h85Var11.e = o75Var12;
                h85Var11.g(this.b, false);
                h85Var11.j(false);
                o75 o75Var13 = this.E.c;
                if (o75Var13 != null) {
                    o75Var13.setRenderer(h85Var11);
                }
                m75 m75Var7 = this.E.d;
                if (m75Var7 != null) {
                    m75Var7.setRenderer(h85Var11);
                }
                o75 o75Var14 = this.E.e;
                if (o75Var14 != null) {
                    o75Var14.setRenderer(h85Var11);
                }
                h85Var11.setAlpha(0.0f);
                h85Var11.setScaleX(0.5f);
                h85Var11.setScaleY(0.5f);
                h85Var11.F = true;
                vc4 vc4Var = new vc4(this, h85Var11, (byte) 27);
                if (h85Var11.a.d.isFirstFrameRendered()) {
                    vc4Var.run();
                } else {
                    gl.d3(vc4Var, 250L);
                    h85Var11.m0.add(vc4Var);
                }
                h85 h85Var102 = new h85(this, this.j0, h75Var);
                h85Var102.x = gc2Var;
                h85Var102.g(this.b, false);
                h85Var102.h(true, false);
                h85Var102.F = true;
                h85Var102.setAlpha(0.0f);
                this.F = this.E;
                ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.O0 = ofFloat32;
                ofFloat32.addUpdateListener(new pk(this, h85Var102, (byte) 16));
                this.O0.addListener(new j95(this, h85Var102, objArr2 == true ? 1 : 0));
                this.O0.start();
                d();
                this.E = h85Var102;
                h85Var102.h(true, false);
                this.E.j(false);
                j();
            } else {
                this.b = true;
                d();
                h85 h85Var13 = new h85(this, this.j0, h75Var);
                this.E = h85Var13;
                h85Var13.x = gc2Var;
                h85Var13.g(this.b, false);
                this.E.h(true, false);
                this.E.h(true, false);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<h85, Float>) property, 0.0f, 1.0f);
                this.O0 = ofFloat4;
                ofFloat4.addListener(new k95(this, objArr == true ? 1 : 0));
                this.O0.start();
                invalidate();
                k33Var.a(this.f, false);
            }
            v31Var.setEnabled(true);
        }
        boolean z2 = this.b;
        if (z != z2) {
            if (z2) {
                v31Var.setVisibility(0);
                this.m0.setVisibility(0);
                this.f0.setVisibility(0);
                this.g0.setVisibility(0);
            } else {
                setUiVisible(true);
                if (this.h0) {
                    this.h0 = false;
                    gl.r(this.i0);
                }
            }
            g(true);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
            this.r = ofFloat5;
            ofFloat5.addUpdateListener(new i95(this, b));
            h85 h85Var14 = this.E;
            h85Var14.r = true;
            int i3 = h75Var.a;
            this.M0 = this.H0;
            this.y.d();
            this.r.addListener(new j95(this, h85Var14, b));
            this.r.setInterpolator(s33.f);
            this.r.setDuration(350L);
            d85 d85Var2 = this.E.a;
            ValueAnimator valueAnimator4 = this.r;
            if (d85Var2.F) {
                d85Var2.H.add(valueAnimator4);
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
            if (k27.B1(((h85) arrayList.get(i)).x.a.peer) == k27.B1(groupCallParticipant.peer)) {
                ((h85) arrayList.get(i)).setAmplitude(f);
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
        boolean z = h75.v5;
        View view = this.n0;
        if (z) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gl.L(328.0f);
        } else if (h75.u5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = gl.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!h75.u5 || h75.v5) ? 8 : 0);
        s71 s71Var = this.g0;
        s71Var.getLayoutParams().height = gl.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i2);
        s71Var.getLayoutParams().width = gl.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = h75.u5 ? gl.L(45.0f) : 0;
        for (int i3 = 0; i3 < 2; i3++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i3].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = gl.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = h75.u5 ? gl.L(180.0f) : 0;
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
        h75 h75Var = this.k0;
        if ((z2 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= gl.L(120.0f)) {
                    b(false);
                } else {
                    h75Var.V0(null);
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
        h85 h85Var = this.E;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        xw0 xw0Var = h85Var.O;
        Rect rect = h85Var.z0;
        xw0Var.getHitRect(rect);
        if (!rect.contains((int) x, (int) y)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = gl.P;
                rectF.set(0.0f, a.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((h75.u5 && this.W) ? -gl.L(90.0f) : 0), this.E.getMeasuredHeight() + ((h75.u5 || !this.W) ? 0 : -gl.L(90.0f)));
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
                    RectF rectF2 = gl.P;
                    st stVar = this.J;
                    rectF2.set(stVar.getX(), stVar.getY(), stVar.getX() + stVar.getWidth(), stVar.getY() + stVar.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z3 = false;
                        z = false;
                        for (int i = 0; i < this.j0.f.size(); i++) {
                            if (this.N == k27.B1(((gc2) this.j0.f.get(i)).a.peer)) {
                                h75Var.V0((gc2) this.j0.f.get(i));
                                z3 = true;
                                z = true;
                            }
                        }
                        if (!z3) {
                            h75Var.V0(new gc2((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
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
                        zhc zhcVar = this.E.a.d;
                        RectF rectF3 = gl.P;
                        rectF3.set(zhcVar.getX(), zhcVar.getY(), zhcVar.getX() + zhcVar.getMeasuredWidth(), zhcVar.getY() + zhcVar.getMeasuredHeight());
                        rectF3.inset(((zhcVar.getMeasuredHeight() * this.E.a.U) - zhcVar.getMeasuredHeight()) / 2.0f, ((zhcVar.getMeasuredWidth() * this.E.a.U) - zhcVar.getMeasuredWidth()) / 2.0f);
                        boolean z4 = h75.u5;
                        float f2 = rectF3.top;
                        if (z4) {
                            rectF3.top = Math.max(f2, a.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.E.getMeasuredWidth() - gl.L(90.0f));
                        } else {
                            rectF3.top = Math.max(f2, a.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.E.getMeasuredHeight() - gl.L(90.0f));
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

    public void setGroupCall(fc2 fc2Var) {
        this.j0 = fc2Var;
    }

    public void setIsTablet(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            v31 v31Var = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v31Var.getLayoutParams();
            layoutParams.gravity = z ? 85 : 51;
            layoutParams.rightMargin = z ? gl.L(328.0f) : 0;
            layoutParams.bottomMargin = z ? -gl.L(8.0f) : 0;
            if (this.N0) {
                v31Var.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            ed0 ed0Var = new ed0(false);
            ed0Var.a(-1);
            v31Var.setImageDrawable(ed0Var);
        }
    }

    public void setProgressToHideUi(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidate();
            h85 h85Var = this.E;
            if (h85Var != null) {
                h85Var.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z) {
        hc0 hc0Var;
        boolean z2;
        int i;
        long j;
        TLRPC.Chat K0;
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
                iu4 iu4Var = new iu4(this, (byte) 18);
                this.Q0 = iu4Var;
                gl.d3(iu4Var, (System.currentTimeMillis() - this.P0) + 50);
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
            hc0Var = this.K;
            if (i3 >= m) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i3));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i = i3;
                j = j2;
            } else {
                j = j2;
                if (k27.B1(this.e.a.peer) == k27.B1(groupCallParticipant.peer)) {
                    i = i3;
                } else {
                    long B1 = k27.B1(groupCallParticipant.peer);
                    i = i3;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i4 == 0) {
                            this.N = k27.B1(groupCallParticipant.peer);
                        }
                        if (i4 < 3) {
                            if (B1 > 0) {
                                user = na7.q1(i2).V1(Long.valueOf(B1));
                                K0 = null;
                            } else {
                                K0 = na7.q1(i2).K0(Long.valueOf(B1));
                                user = null;
                            }
                            if (user != null || K0 != null) {
                                hc0Var.b(i4, i2, groupCallParticipant);
                                if (i4 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(l7c.k(user, true), new z3c(gl.o()), 0);
                                } else {
                                    spannableStringBuilder.append(K0.title, new z3c(gl.o()), 0);
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
                st stVar = this.J;
                this.Q = stVar.getLeft();
                this.S = stVar.getRight();
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
        String J0 = k96.J0(i4, "MembersAreSpeakingToast");
        int indexOf = J0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i4 != 0 ? i4 == 1 ? gl.L(40.0f) : i4 == 2 ? gl.L(64.0f) : gl.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = gl.L(16.0f);
        this.M = z3;
        invalidate();
        while (i4 < 3) {
            hc0Var.b(i4, i2, null);
            i4++;
        }
        hc0Var.a(z2);
    }
}
