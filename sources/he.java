// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class he extends Dialog implements Drawable.Callback, jm7 {
    public static final /* synthetic */ int k1 = 0;
    public final Drawable A0;
    public final Rect B0;
    public final float C0;
    public Bitmap D0;
    public final BitmapDrawable[] E;
    public Matrix E0;
    public final boolean[] F;
    public BitmapShader F0;
    public final AnimatorSet[] G;
    public Paint G0;
    public byte H;
    public Paint H0;
    public boolean I;
    public boolean I0;
    public int J;
    public boolean J0;
    public DialogInterface.OnCancelListener K;
    public boolean K0;
    public he L;
    public boolean L0;
    public int M;
    public final td M0;
    public DialogInterface.OnClickListener N;
    public final td N0;
    public DialogInterface.OnDismissListener O;
    public final ArrayList O0;
    public qac P;
    public float P0;
    public CharSequence[] Q;
    public boolean Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public final ylb S0;
    public String T;
    public boolean T0;
    public CharSequence U;
    public boolean U0;
    public int V;
    public int V0;
    public View W;
    public int W0;
    public boolean X;
    public long X0;
    public int Y;
    public boolean Y0;
    public byte Z;
    public FrameLayout Z0;
    public int a;
    public HashMap a0;
    public gf0 a1;
    public View b;
    public short b0;
    public ce b1;
    public TextView c;
    public Drawable c0;
    public int c1;
    public mv3 d;
    public int d0;
    public int d1;
    public int e;
    public int e0;
    public int e1;
    public xna f;
    public ylb f0;
    public int f1;
    public final byte g0;
    public int g1;
    public TextView h;
    public int h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public final fe j1;
    public boolean k0;
    public s09 l0;
    public CharSequence m0;
    public mv3 n;
    public ee n0;
    public String o0;
    public ee p0;
    public String q0;
    public FrameLayout r;
    public kh9 r0;
    public FrameLayout s;
    public String s0;
    public ee t0;
    public ViewGroup u0;
    public k46 v0;
    public xd w;
    public TextView w0;
    public LinearLayout x;
    public pz5 x0;
    public be y;
    public final int[] y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public he(int i, ylb ylbVar, Context context) {
        super(context, R.style.TransparentDialog);
        this.a = -1;
        this.e = -2;
        this.E = new BitmapDrawable[2];
        this.F = new boolean[2];
        this.G = new AnimatorSet[2];
        this.H = (byte) 12;
        this.J = cmb.G5;
        this.b0 = (short) 132;
        this.e0 = -1;
        this.i0 = true;
        this.j0 = true;
        this.k0 = true;
        this.y0 = new int[2];
        this.z0 = true;
        byte b = 0;
        this.M0 = new td(this, b);
        this.N0 = new td(this, 1 == true ? 1 : 0);
        this.O0 = new ArrayList();
        this.Q0 = true;
        this.R0 = 0.5f;
        this.T0 = true;
        this.c1 = -1;
        this.j1 = new fe(this, b);
        this.S0 = ylbVar;
        this.g0 = i;
        int i2 = cmb.g5;
        this.c1 = i2;
        int e = e(i2);
        this.V0 = e;
        Object[] objArr = gm.B(e) < 0.721f;
        this.U0 = gda.o() >= 2 && e86.e(256) && objArr == true;
        Rect rect = new Rect();
        this.B0 = rect;
        if (i != 3 || this.U0) {
            Drawable d = b10.d(context, R.drawable.popup_fixed_alert4);
            this.A0 = d;
            this.C0 = i == 3 ? 0.55f : objArr != false ? 0.8f : 0.985f;
            d.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
            d.getPadding(rect);
        }
        this.I = i == 3;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.X0;
        if (currentTimeMillis < j) {
            gm.d3(new td(this, (byte) 0), currentTimeMillis - j);
        } else {
            dismiss();
        }
    }

    public final View c(int i) {
        ViewGroup viewGroup = this.u0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i));
        }
        return null;
    }

    public final int d() {
        int min = Math.min(gm.O1() ? gm.N1() ? gm.L(446.0f) : gm.L(496.0f) : gm.L(356.0f), (gm.q.x - gm.L(48.0f)) - (this.W0 << 1));
        Rect rect = this.B0;
        return min + rect.left + rect.right;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        mv3 mv3Var;
        if (i != nm7.m4 || (mv3Var = this.n) == null) {
            return;
        }
        mv3Var.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bitmap bitmap;
        qac qacVar = this.P;
        if (qacVar != null) {
            this.P = null;
            qacVar.a(new td(this, (byte) 0));
            return;
        }
        if (this.i1) {
            return;
        }
        this.i1 = true;
        nm7.e().n(this, nm7.m4);
        DialogInterface.OnDismissListener onDismissListener = this.O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        he heVar = this.L;
        if (heVar != null) {
            heVar.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        gm.r(this.N0);
        if (this.F0 == null || (bitmap = this.D0) == null) {
            return;
        }
        bitmap.recycle();
        this.F0 = null;
        this.G0 = null;
        this.D0 = null;
    }

    public int e(int i) {
        return cmb.v0(i, this.S0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewGroup f(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        ce ceVar = new ce(this, getContext());
        this.b1 = ceVar;
        ceVar.setOrientation(1);
        boolean z2 = this.U0;
        byte b = this.g0;
        byte b2 = 3;
        final byte b3 = 0;
        if ((z2 || b == 3) && b != 2) {
            this.b1.setBackground(null);
            this.b1.setPadding(0, 0, 0, 0);
            if (this.U0) {
                this.b1.setWillNotDraw(false);
            }
        } else {
            this.b1.setBackground(null);
            this.b1.setPadding(0, 0, 0, 0);
            this.b1.setBackground(this.A0);
            ce ceVar2 = this.b1;
            int L = gm.L(8.0f);
            float L2 = gm.L(20.0f);
            xj xjVar = agc.a;
            ceVar2.setOutlineProvider(new yfc(L, L2));
            this.b1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.b1;
        boolean z3 = this.Y0;
        ylb ylbVar = this.S0;
        if (z3) {
            if (this.Z0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Z0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vd
                    public final /* synthetic */ he b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b3;
                        he heVar = this.b;
                        switch (b4) {
                            case 0:
                                heVar.dismiss();
                                break;
                            case 1:
                                new exa(heVar.getContext(), heVar.S0).show();
                                break;
                            default:
                                DialogInterface.OnClickListener onClickListener = heVar.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(heVar, ((Integer) view.getTag()).intValue());
                                }
                                heVar.dismiss();
                                break;
                        }
                    }
                });
            }
            if (this.a1 == null) {
                gf0 gf0Var = new gf0(z8c.t0, ylbVar, getContext());
                this.a1 = gf0Var;
                rve.a(gf0Var);
                gf0 gf0Var2 = this.a1;
                final char c = 1 == true ? 1 : 0;
                gf0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: vd
                    public final /* synthetic */ he b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = c;
                        he heVar = this.b;
                        switch (b4) {
                            case 0:
                                heVar.dismiss();
                                break;
                            case 1:
                                new exa(heVar.getContext(), heVar.S0).show();
                                break;
                            default:
                                DialogInterface.OnClickListener onClickListener = heVar.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(heVar, ((Integer) view.getTag()).intValue());
                                }
                                heVar.dismiss();
                                break;
                        }
                    }
                });
            }
            gm.B2(this.b1);
            gm.B2(this.a1);
            this.Z0.addView(this.b1, qoe.e(-2, -2, 17));
            this.Z0.addView(this.a1, qoe.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Z0;
        }
        if (z) {
            if (this.Y0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = nm7.D1;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        Object[] objArr = (this.m0 == null && this.o0 == null && this.q0 == null && this.s0 == null) ? false : true;
        if (this.V == 0 && this.Y == 0 && this.c0 == null) {
            View view = this.W;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f = 16.0f;
                this.b1.addView(this.W, qoe.t(-1, this.b0, 51, 0, 0, 0, 0));
            } else {
                f = 16.0f;
            }
        } else {
            f = 16.0f;
            s09 s09Var = new s09(getContext());
            this.l0 = s09Var;
            Drawable drawable = this.c0;
            if (drawable != null) {
                s09Var.setImageDrawable(drawable);
                Drawable drawable2 = this.c0;
                if (drawable2 instanceof zy) {
                    zy zyVar = (zy) drawable2;
                    this.l0.addOnAttachStateChangeListener(new wd(zyVar, b3));
                    zyVar.a(this.l0);
                }
            } else {
                int i = this.V;
                if (i != 0) {
                    s09Var.setImageResource(i);
                } else {
                    s09Var.setAutoRepeat(this.T0);
                    s09 s09Var2 = this.l0;
                    int i2 = this.Y;
                    byte b4 = this.Z;
                    s09Var2.f(i2, b4, b4, null);
                    if (this.a0 != null) {
                        p09 animatedDrawable = this.l0.getAnimatedDrawable();
                        for (Map.Entry entry : this.a0.entrySet()) {
                            String str = (String) entry.getKey();
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put(str, num);
                            animatedDrawable.B();
                        }
                        this.d1 = this.d0;
                    }
                    this.l0.d();
                }
            }
            this.l0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.X) {
                this.l0.setBackground(new ge(this.l0, this.d0, gm.L(52.0f) + this.Z, this.e0, this.f0));
                this.b0 = (short) 92;
            } else {
                int i3 = this.e0;
                s09 s09Var3 = this.l0;
                if (i3 >= 0) {
                    anb.B(s09Var3, cmb.c0(gm.L(10.0f), 0, this.d0), anb.M(this.e0), this.f0);
                } else {
                    s09Var3.setBackground(cmb.c0(gm.L(10.0f), 0, this.d0));
                }
            }
            boolean z4 = this.X;
            s09 s09Var4 = this.l0;
            if (z4) {
                s09Var4.setTranslationY(gm.L(16.0f));
            } else {
                s09Var4.setTranslationY(0.0f);
            }
            this.l0.setPadding(0, 0, 0, 0);
            this.b1.addView(this.l0, qoe.t(-1, this.b0, 51, 0, 0, 0, 0));
        }
        byte b5 = 10;
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            f2 = 4.0f;
            this.b1.addView(frameLayout2, qoe.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            xna xnaVar = new xna(null, getContext(), false);
            this.f = xnaVar;
            nm7.i(xnaVar);
            xna xnaVar2 = this.f;
            xnaVar2.s = (byte) 3;
            xnaVar2.setText(this.S);
            xna xnaVar3 = this.f;
            int e = e(cmb.i5);
            this.f1 = e;
            xnaVar3.setTextColor(e);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(gm.o());
            this.f.setGravity((this.X ? 1 : jb6.a0 ? 5 : 3) | 48);
            FrameLayout frameLayout3 = this.s;
            xna xnaVar4 = this.f;
            boolean z5 = this.X;
            frameLayout3.addView(xnaVar4, qoe.d(-2, -2.0f, (z5 ? 1 : jb6.a0 ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z5 ? 4.0f : this.T != null ? 2 : this.Q != null ? 14 : 10));
        } else {
            f2 = 4.0f;
        }
        String str2 = this.T;
        fe feVar = this.j1;
        if (str2 != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            anb.X(this.h, cmb.I5, feVar);
            this.h.setTextSize(1, 14.0f);
            this.h.setGravity((jb6.a0 ? 5 : 3) | 48);
            f3 = 20.0f;
            this.b1.addView(this.h, qoe.t(-2, -2, (jb6.a0 ? 5 : 3) | 48, 24, 0, 24, this.Q != null ? 14 : 10));
        } else {
            f3 = 20.0f;
        }
        if (b == 0) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            BitmapDrawable[] bitmapDrawableArr = this.E;
            bitmapDrawableArr[0] = bitmapDrawable;
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            xd xdVar = new xd(this, getContext(), b3);
            this.w = xdVar;
            xdVar.setVerticalScrollBarEnabled(false);
            gm.u3(this.w, e(cmb.z5));
            this.b1.addView(this.w, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            f4 = 0.0f;
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f4 = 0.0f;
        }
        mv3 mv3Var = new mv3(getContext());
        this.n = mv3Var;
        nm7.i(mv3Var);
        mv3 mv3Var2 = this.n;
        int e2 = e(this.X ? cmb.x6 : cmb.i5);
        this.g1 = e2;
        mv3Var2.setTextColor(e2);
        this.n.setTextSize(1, f);
        this.n.setMovementMethod(new cm(b3));
        anb.G(this.n, cmb.j5, feVar);
        if (!this.i0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        this.n.setGravity((this.X ? 1 : jb6.a0 ? 5 : 3) | 48);
        if (b == 2) {
            this.b1.addView(this.n, qoe.t(-2, -2, (jb6.a0 ? 5 : 3) | 48, 24, this.S == null ? 19 : 0, 24, 20));
            k46 k46Var = new k46(getContext());
            this.v0 = k46Var;
            k46Var.a(false, this.h0 / 100.0f);
            this.v0.setProgressColor(e(cmb.E5));
            this.v0.setBackColor(e(cmb.F5));
            this.b1.addView(this.v0, qoe.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView2 = new TextView(getContext());
            this.w0 = textView2;
            textView2.setTypeface(gm.o());
            this.w0.setGravity((jb6.a0 ? 5 : 3) | 48);
            anb.X(this.w0, cmb.p5, feVar);
            this.w0.setTextSize(1, 14.0f);
            this.b1.addView(this.w0, qoe.t(-2, -2, (jb6.a0 ? 5 : 3) | 48, 23, 4, 23, 24));
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        } else if (b == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i4 = cmb.L5;
            this.c1 = i4;
            this.V0 = e(i4);
            if (!this.U0) {
                this.r.setBackgroundDrawable(cmb.b0(gm.L(18.0f), this.V0));
            }
            this.b1.addView(this.r, qoe.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), ylbVar);
            radialProgressView.setSize(gm.L(32.0f));
            radialProgressView.setProgressColor(e(cmb.M5));
            this.r.addView(radialProgressView, qoe.e(86, 86, 17));
        } else {
            mv3 mv3Var3 = this.d;
            if (mv3Var3 != null) {
                this.x.addView(mv3Var3, qoe.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            this.x.addView(this.n, qoe.t(-2, -2, (this.X ? 1 : jb6.a0 ? 5 : 3) | 48, 24, 0, 24, (this.b == null && this.Q == null) ? (byte) 0 : this.H));
            TextView textView3 = this.c;
            if (textView3 != null) {
                this.x.addView(textView3, qoe.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        boolean isEmpty = TextUtils.isEmpty(this.U);
        mv3 mv3Var4 = this.n;
        byte b6 = 8;
        if (isEmpty) {
            mv3Var4.setVisibility(8);
        } else {
            mv3Var4.setText(this.U);
            this.n.setVisibility(0);
        }
        if (this.Q != null) {
            int i5 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.Q;
                if (i5 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i5] != null) {
                    ae aeVar = new ae(getContext(), ylbVar);
                    CharSequence charSequence = this.Q[i5];
                    int[] iArr = this.R;
                    aeVar.a(iArr != null ? iArr[i5] : 0, charSequence);
                    aeVar.setTag(Integer.valueOf(i5));
                    this.O0.add(aeVar);
                    this.x.addView(aeVar, qoe.o(-1, 50));
                    final byte b7 = 2;
                    aeVar.setOnClickListener(new View.OnClickListener(this) { // from class: vd
                        public final /* synthetic */ he b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b42 = b7;
                            he heVar = this.b;
                            switch (b42) {
                                case 0:
                                    heVar.dismiss();
                                    break;
                                case 1:
                                    new exa(heVar.getContext(), heVar.S0).show();
                                    break;
                                default:
                                    DialogInterface.OnClickListener onClickListener = heVar.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(heVar, ((Integer) view2.getTag()).intValue());
                                    }
                                    heVar.dismiss();
                                    break;
                            }
                        }
                    });
                }
                i5++;
            }
        }
        View view2 = this.b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            this.x.addView(this.b, qoe.o(-1, this.e));
        }
        if (objArr != false) {
            if (!this.J0) {
                TextPaint textPaint = new TextPaint();
                hg9.o(textPaint, gm.L(16.0f));
                CharSequence charSequence2 = this.m0;
                int measureText = charSequence2 != null ? (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + gm.L(24.0f) + f4) : 0;
                if (this.o0 != null) {
                    if (measureText > 0) {
                        measureText += gm.L(8.0f);
                    }
                    String str3 = this.o0;
                    measureText = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + gm.L(24.0f) + measureText);
                }
                if (this.q0 != null) {
                    if (measureText > 0) {
                        measureText += gm.L(8.0f);
                    }
                    String str4 = this.q0;
                    measureText = (int) (textPaint.measureText((CharSequence) str4, 0, str4.length()) + gm.L(24.0f) + measureText);
                }
                if (this.s0 != null) {
                    if (measureText > 0) {
                        measureText += gm.L(8.0f);
                    }
                    String str5 = this.s0;
                    measureText = (int) (textPaint.measureText((CharSequence) str5, 0, str5.length()) + gm.L(24.0f) + measureText);
                }
                if (measureText > gm.q.x - gm.L(64.0f)) {
                    if (!this.K0 || this.m0 == null || this.o0 == null || this.q0 == null || this.s0 == null) {
                        this.J0 = true;
                    } else {
                        this.L0 = true;
                    }
                }
            }
            if (this.J0) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.u0 = linearLayout2;
            } else {
                this.u0 = new yd(b3, getContext(), this);
            }
            TextView textView4 = this.c;
            ViewGroup viewGroup2 = this.u0;
            if (textView4 != null) {
                viewGroup2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(f2));
                this.u0.setTranslationY(-gm.L(6.0f));
            } else {
                viewGroup2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            }
            this.b1.addView(this.u0, qoe.o(-1, this.L0 ? 96 : 52));
            if (this.X) {
                this.u0.setTranslationY(-gm.L(8.0f));
            }
            if (this.m0 != null) {
                f5 = 64.0f;
                zd zdVar = new zd(getContext(), b3);
                zdVar.setMinWidth(gm.L(64.0f));
                zdVar.setTag(-1);
                zdVar.setTextSize(1, 16.0f);
                anb.X(zdVar, this.J, feVar);
                zdVar.setGravity(17);
                zdVar.setTypeface(gm.o());
                zdVar.setText(this.m0);
                f6 = 6.0f;
                zdVar.setBackground(cmb.H0(gm.L(f3), e(this.J)));
                zdVar.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
                boolean z6 = this.J0;
                ViewGroup viewGroup3 = this.u0;
                f7 = 12.0f;
                if (z6) {
                    viewGroup3.addView(zdVar, qoe.r(-1, 40, 7));
                } else {
                    viewGroup3.addView(zdVar, qoe.e(-2, 40, 53));
                }
                zdVar.setOnClickListener(new t(this, zdVar, b6));
            } else {
                f5 = 64.0f;
                f6 = 6.0f;
                f7 = 12.0f;
            }
            if (this.o0 != null) {
                zd zdVar2 = new zd(getContext(), 1 == true ? 1 : 0);
                zdVar2.setMinWidth(gm.L(f5));
                zdVar2.setTag(-2);
                zdVar2.setTextSize(1, 16.0f);
                anb.X(zdVar2, this.J, feVar);
                zdVar2.setGravity(17);
                zdVar2.setTypeface(gm.o());
                zdVar2.setEllipsize(TextUtils.TruncateAt.END);
                zdVar2.setSingleLine(true);
                zdVar2.setText(this.o0.toString());
                zdVar2.setBackground(cmb.H0(gm.L(f3), e(this.J)));
                zdVar2.setPadding(gm.L(f7), 0, gm.L(f7), 0);
                boolean z7 = this.J0;
                ViewGroup viewGroup4 = this.u0;
                if (z7) {
                    viewGroup4.addView(zdVar2, 0, qoe.r(-1, 40, 7));
                } else {
                    viewGroup4.addView(zdVar2, qoe.e(-2, 40, 53));
                }
                zdVar2.setOnClickListener(new t(this, zdVar2, (byte) 9));
            }
            if (this.s0 != null) {
                zd zdVar3 = new zd(getContext(), (byte) 2);
                zdVar3.setMinWidth(gm.L(f5));
                zdVar3.setTag(-3);
                zdVar3.setTextSize(1, 16.0f);
                anb.X(zdVar3, this.J, feVar);
                zdVar3.setGravity(17);
                zdVar3.setTypeface(gm.o());
                zdVar3.setEllipsize(TextUtils.TruncateAt.END);
                zdVar3.setSingleLine(true);
                zdVar3.setText(this.s0.toString());
                zdVar3.setBackground(cmb.H0(gm.L(f3), e(this.J)));
                zdVar3.setPadding(gm.L(f7), 0, gm.L(f7), 0);
                boolean z8 = this.J0;
                ViewGroup viewGroup5 = this.u0;
                if (z8) {
                    viewGroup5.addView(zdVar3, 1, qoe.r(-1, 40, 7));
                } else {
                    viewGroup5.addView(zdVar3, qoe.e(-2, 40, 51));
                }
                zdVar3.setOnClickListener(new t(this, zdVar3, b5));
            }
            if (this.q0 != null) {
                zd zdVar4 = new zd(getContext(), b2);
                zdVar4.setMinWidth(gm.L(f5));
                zdVar4.setTag(-4);
                zdVar4.setTextSize(1, 16.0f);
                anb.X(zdVar4, this.J, feVar);
                zdVar4.setGravity(17);
                zdVar4.setTypeface(gm.o());
                zdVar4.setEllipsize(TextUtils.TruncateAt.END);
                zdVar4.setSingleLine(true);
                zdVar4.setText(this.q0.toString());
                zdVar4.setBackground(cmb.H0(gm.L(f3), e(this.J)));
                zdVar4.setPadding(gm.L(f7), 0, gm.L(f7), 0);
                boolean z9 = this.J0;
                ViewGroup viewGroup6 = this.u0;
                if (z9) {
                    viewGroup6.addView(zdVar4, 0, qoe.r(-1, 40, 7));
                } else {
                    viewGroup6.addView(zdVar4, qoe.e(-2, 40, 53));
                }
                zdVar4.setOnClickListener(new t(this, zdVar4, (byte) 11));
            }
            if (this.J0) {
                for (int i6 = 1; i6 < this.u0.getChildCount(); i6++) {
                    ((ViewGroup.MarginLayoutParams) this.u0.getChildAt(i6).getLayoutParams()).topMargin = gm.L(f6);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Y0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.M = gm.q.x;
            this.b1.getLayoutParams().width = d();
            window.setWindowAnimations(R.style.DialogNoAnimation);
        } else if (b == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.Q0) {
                layoutParams3.dimAmount = this.R0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = f4;
                layoutParams3.flags ^= 2;
            }
            this.M = gm.q.x;
            layoutParams3.width = d();
        }
        View view3 = this.b;
        if (view3 != null && this.z0 && a(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.U0) {
            gm.j2(new mf2(this, (byte) 2), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final k11 g(int i, boolean z, boolean z2) {
        View c = c(i);
        if (z2) {
            this.k0 = false;
        }
        ud udVar = new ud(c, (byte) 0);
        np6 np6Var = new np6((Object) this, (Object) c, z, (byte) 5);
        k11 k11Var = new k11();
        k11Var.a = udVar;
        k11Var.c = np6Var;
        return k11Var;
    }

    public final void h() {
        TextView textView = (TextView) c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, this.j1);
        }
    }

    public final void i(int i, boolean z) {
        boolean[] zArr = this.F;
        if (z) {
            if (zArr[i]) {
                return;
            }
        } else if (!zArr[i]) {
            return;
        }
        zArr[i] = z;
        AnimatorSet[] animatorSetArr = this.G;
        AnimatorSet animatorSet = animatorSetArr[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i] = animatorSet2;
        BitmapDrawable bitmapDrawable = this.E[i];
        byte b = 1;
        if (bitmapDrawable != null) {
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", z ? nm7.d4 : 0));
        }
        animatorSetArr[i].setDuration(150L);
        animatorSetArr[i].addListener(new y7(this, i, b));
        try {
            animatorSetArr[i].start();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.w.invalidate();
        this.x.invalidate();
    }

    public final void j(int i) {
        this.c1 = -1;
        this.V0 = i;
        Drawable drawable = this.A0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k(boolean z) {
        if (this.I0) {
            return;
        }
        this.I0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.I0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void l(int i, int i2, int i3) {
        if (i >= 0) {
            ArrayList arrayList = this.O0;
            if (i < arrayList.size()) {
                ae aeVar = (ae) arrayList.get(i);
                aeVar.a.setTextColor(i2);
                aeVar.b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.U = str;
        if (this.n != null) {
            boolean isEmpty = TextUtils.isEmpty(str);
            mv3 mv3Var = this.n;
            if (isEmpty) {
                mv3Var.setVisibility(8);
            } else {
                mv3Var.setText(this.U);
                this.n.setVisibility(0);
            }
        }
    }

    public final void n(int i) {
        this.h0 = i;
        k46 k46Var = this.v0;
        if (k46Var != null) {
            k46Var.a(true, i / 100.0f);
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        }
    }

    public final void o(int i) {
        this.h1 = true;
        xna xnaVar = this.f;
        if (xnaVar != null) {
            xnaVar.setTextColor(i);
        }
        mv3 mv3Var = this.n;
        if (mv3Var != null) {
            mv3Var.setTextColor(i);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        pz5 pz5Var = this.x0;
        if (pz5Var != null) {
            pz5Var.r(this, -2);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        nm7.e().b(this, nm7.m4);
    }

    public final void p() {
        if (this.j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.S0, getContext());
            String M0 = jb6.M0(2131744521, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744522, null);
            alertDialog$Builder.j(jb6.M0(2131742897, null), null);
            alertDialog$Builder.g(jb6.M0(2131744530, null), new l0(this, (byte) 10));
            alertDialog$Builder.i(new n1(this, (byte) 1));
            try {
                this.L = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j) {
        td tdVar = this.N0;
        gm.r(tdVar);
        gm.d3(tdVar, j);
    }

    public final void r() {
        s09 s09Var;
        int v0;
        if (this.e0 < 0 || this.a0 == null || (s09Var = this.l0) == null || s09Var.getAnimatedDrawable() == null || (v0 = cmb.v0(this.e0, this.f0)) == this.d1) {
            return;
        }
        p09 animatedDrawable = this.l0.getAnimatedDrawable();
        for (Map.Entry entry : this.a0.entrySet()) {
            if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.d1) {
                entry.setValue(Integer.valueOf(v0));
                animatedDrawable.L(v0, (String) entry.getKey());
            }
        }
        this.d1 = v0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        xd xdVar = this.w;
        if (xdVar != null) {
            xdVar.postDelayed(runnable, j);
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.K = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.S = charSequence;
        xna xnaVar = this.f;
        if (xnaVar != null) {
            xnaVar.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (gm.K1(getContext())) {
            this.i1 = false;
            super.show();
            FrameLayout frameLayout = this.r;
            if (frameLayout != null && this.g0 == 3) {
                frameLayout.setScaleX(0.0f);
                this.r.setScaleY(0.0f);
                this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
            }
            this.X0 = System.currentTimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        xd xdVar = this.w;
        if (xdVar != null) {
            xdVar.removeCallbacks(runnable);
        }
    }

    public he(Context context) {
        this(3, null, context);
    }
}
