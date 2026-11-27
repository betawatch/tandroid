// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class c24 extends FrameLayout implements snb, s84 {
    public ValueAnimator E;
    public lw3 F;
    public boolean G;
    public final /* synthetic */ o24 H;
    public final fm0 a;
    public final byte b;
    public final dw9 c;
    public final a24 d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final b24 r;
    public final tt s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c24(o24 o24Var, Context context, int i) {
        super(context);
        a24 a24Var;
        ImageView.ScaleType scaleType;
        int i2;
        float f;
        this.H = o24Var;
        this.a = new fm0(0, this, k43.g, 200L, false);
        final byte b = 0;
        this.y = false;
        xob xobVar = yob.a;
        this.b = i;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i3 = aob.Cf;
        vnb vnbVar = o24Var.a2;
        boolean z = o24Var.j2;
        yob.h(i3, vnbVar, view);
        addView(view, new FrameLayout.LayoutParams(-1, hl.e1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (o24Var.v0) {
            yob.h(aob.zf, vnbVar, view2);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, o24Var.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(aob.b0(hl.L(18.0f), z ? o24Var.u(0.06f) : o24Var.y(aob.Af)));
        frameLayout.setClipToOutline(true);
        float L = hl.L(18.0f);
        yi yiVar = yhc.a;
        frameLayout.setOutlineProvider(new whc(0, L));
        if (i == 2) {
            addView(frameLayout, tre.d(-1, 36.0f, jn7.D1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, tre.d(-1, 36.0f, jn7.D1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        tt ttVar = new tt((byte) 14, context, (Object) this);
        this.s = ttVar;
        frameLayout.addView(ttVar, tre.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        dw9 dw9Var = new dw9();
        this.c = dw9Var;
        dw9Var.c(0, false, false);
        dw9Var.a(z ? o24Var.u(0.4f) : o24Var.y(aob.Bf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(dw9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: y14
            public final /* synthetic */ c24 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = b;
                c24 c24Var = this.b;
                switch (b2) {
                    case 0:
                        b24 b24Var = c24Var.r;
                        a24 a24Var2 = c24Var.d;
                        if (c24Var.c.k == 1) {
                            a24Var2.setText("");
                            c24Var.b(null, false);
                            if (b24Var != null) {
                                b24Var.H1();
                                b24Var.J1(null);
                                b24Var.K1(true, true);
                            }
                            c24Var.f(false);
                            a24Var2.clearAnimation();
                            a24Var2.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            c24Var.c(false);
                            break;
                        }
                        break;
                    default:
                        a24 a24Var3 = c24Var.d;
                        a24Var3.setText("");
                        c24Var.b(null, false);
                        b24 b24Var2 = c24Var.r;
                        if (b24Var2 != null) {
                            b24Var2.H1();
                            b24Var2.J1(null);
                            b24Var2.K1(true, true);
                        }
                        c24Var.f(false);
                        a24Var3.clearAnimation();
                        a24Var3.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        c24Var.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, tre.e(36, 36, 51));
        a24 a24Var2 = new a24(this, context, i);
        this.d = a24Var2;
        a24Var2.setTextSize(1, 16.0f);
        a24Var2.setHintTextColor(z ? o24Var.u(0.45f) : o24Var.y(aob.Bf));
        a24Var2.setTextColor(z ? o24Var.u(0.8f) : o24Var.y(aob.G6));
        a24Var2.setBackgroundDrawable(null);
        a24Var2.setPadding(0, 0, 0, 0);
        a24Var2.setMaxLines(1);
        a24Var2.setLines(1);
        a24Var2.setSingleLine(true);
        a24Var2.setImeOptions(268435459);
        a24Var2.setHint(ob6.M0(2131745564, null));
        yob.l(a24Var2, 30, aob.Di, vnbVar);
        a24Var2.setCursorSize(hl.L(20.0f));
        a24Var2.setCursorWidth(1.5f);
        a24Var2.setTranslationY(hl.L(-2.0f));
        ttVar.addView(a24Var2, tre.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        a24Var2.addTextChangedListener(new c7(this, (byte) 21));
        if (o24Var.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable e = c00.e(context, R.drawable.gradient_right);
            uob p = yob.p(aob.zf, aob.Af);
            a24Var = a24Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
            yob.k(this, e, p.a, p.b, 4, 0.0f, vnbVar, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(e);
            view3.setAlpha(0.0f);
            ttVar.addView(view3, tre.e(18, -1, 3));
        } else {
            a24Var = a24Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e7(this));
        int i4 = aob.i6;
        final byte b2 = 1;
        hf0 f0 = aob.f0(aob.v0(i4, vnbVar), 1, hl.L(15.0f));
        uob M = yob.M(i4);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M, vnbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: y14
            public final /* synthetic */ c24 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                byte b22 = b2;
                c24 c24Var = this.b;
                switch (b22) {
                    case 0:
                        b24 b24Var = c24Var.r;
                        a24 a24Var22 = c24Var.d;
                        if (c24Var.c.k == 1) {
                            a24Var22.setText("");
                            c24Var.b(null, false);
                            if (b24Var != null) {
                                b24Var.H1();
                                b24Var.J1(null);
                                b24Var.K1(true, true);
                            }
                            c24Var.f(false);
                            a24Var22.clearAnimation();
                            a24Var22.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            c24Var.c(false);
                            break;
                        }
                        break;
                    default:
                        a24 a24Var3 = c24Var.d;
                        a24Var3.setText("");
                        c24Var.b(null, false);
                        b24 b24Var2 = c24Var.r;
                        if (b24Var2 != null) {
                            b24Var2.H1();
                            b24Var2.J1(null);
                            b24Var2.K1(true, true);
                        }
                        c24Var.f(false);
                        a24Var3.clearAnimation();
                        a24Var3.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        c24Var.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, tre.e(36, 36, 53));
        if (i != 1 || (o24Var.d2 && yac.h(yac.t0).p())) {
            b24 b24Var = new b24(this, context, i == 0 ? i2 : 0, o24Var.a2, i);
            this.r = b24Var;
            b24Var.E3 = z;
            b24Var.setDontOccupyWidth(hl.L(f) + ((int) a24Var.getPaint().measureText(((Object) a24Var.getHint()) + "")));
            if (o24Var.v0) {
                yob.i(b24Var, yob.p(aob.zf, aob.Af), vnbVar);
            }
            final byte b3 = 0;
            b24Var.setOnScrollIntoOccupiedWidth(new pcc(this) { // from class: z14
                public final /* synthetic */ c24 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b4 = b3;
                    c24 c24Var = this.b;
                    switch (b4) {
                        case 0:
                            Integer num = (Integer) obj;
                            c24Var.d.setTranslationX(-Math.max(0, num.intValue()));
                            c24Var.c(num.intValue() > 0);
                            c24Var.g(false);
                            break;
                        default:
                            q2b q2bVar = (q2b) obj;
                            o24 o24Var2 = c24Var.H;
                            b24 b24Var2 = c24Var.r;
                            if (q2bVar != null) {
                                if (b24Var2.getSelectedCategory() != q2bVar) {
                                    c24Var.b(q2bVar.a, false);
                                    b24Var2.J1(q2bVar);
                                    break;
                                } else {
                                    c24Var.b(null, false);
                                    b24Var2.J1(null);
                                    break;
                                }
                            } else {
                                c24Var.c(false);
                                b24Var2.J1(null);
                                o24Var2.p0.d.setText("");
                                o24Var2.j0.g1(0, 0);
                                break;
                            }
                    }
                }
            });
            final byte b4 = 1;
            b24Var.setOnTouchListener(new k14(this, b4));
            b24Var.setOnCategoryClick(new pcc(this) { // from class: z14
                public final /* synthetic */ c24 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b42 = b4;
                    c24 c24Var = this.b;
                    switch (b42) {
                        case 0:
                            Integer num = (Integer) obj;
                            c24Var.d.setTranslationX(-Math.max(0, num.intValue()));
                            c24Var.c(num.intValue() > 0);
                            c24Var.g(false);
                            break;
                        default:
                            q2b q2bVar = (q2b) obj;
                            o24 o24Var2 = c24Var.H;
                            b24 b24Var2 = c24Var.r;
                            if (q2bVar != null) {
                                if (b24Var2.getSelectedCategory() != q2bVar) {
                                    c24Var.b(q2bVar.a, false);
                                    b24Var2.J1(q2bVar);
                                    break;
                                } else {
                                    c24Var.b(null, false);
                                    b24Var2.J1(null);
                                    break;
                                }
                            } else {
                                c24Var.c(false);
                                b24Var2.J1(null);
                                o24Var2.p0.d.setText("");
                                o24Var2.j0.g1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(b24Var, tre.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void a() {
        hl.t1(this.d);
    }

    public final void b(String str, boolean z) {
        o24 o24Var = this.H;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                o24Var.T.E(str, z);
                return;
            } else {
                if (b == 2) {
                    o24Var.k0.G(str, z);
                    return;
                }
                return;
            }
        }
        j24 j24Var = o24Var.A0;
        i24 i24Var = j24Var.P;
        o24 o24Var2 = j24Var.R;
        a04 a04Var = o24Var2.H0;
        wz3 wz3Var = o24Var2.E0;
        if (j24Var.M != 0) {
            ConnectionsManager.getInstance(o24Var2.d1).cancelRequest(j24Var.M, true);
            j24Var.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            j24Var.O = null;
            j24Var.F.clear();
            j24Var.I.clear();
            j24Var.L = new ArrayList();
            j79 adapter = wz3Var.getAdapter();
            g24 g24Var = o24Var2.z0;
            if (adapter != g24Var) {
                wz3Var.setAdapter(g24Var);
            }
            j24Var.d = 0L;
            o24Var2.a.a(false, true);
            j24Var.f();
            a04Var.d(false);
        } else {
            j24Var.O = str.toLowerCase();
            a04Var.d(true);
        }
        hl.r(i24Var);
        hl.d3(i24Var, 300L);
    }

    public final void c(boolean z) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 25));
        this.E.setDuration(120L);
        this.E.setInterpolator(k43.h);
        this.E.start();
    }

    public final void d(boolean z) {
        this.G = z;
        if (z) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void e(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void f(boolean z) {
        lw3 lw3Var = this.F;
        if (!z) {
            if (lw3Var != null) {
                hl.r(lw3Var);
                this.F = null;
            }
            hl.P3(this.h, false, true);
            return;
        }
        if (lw3Var == null) {
            lw3 lw3Var2 = new lw3((Object) this, (byte) 7);
            this.F = lw3Var2;
            hl.d3(lw3Var2, 340L);
        }
    }

    public final void g(boolean z) {
        boolean z2 = this.G;
        a24 a24Var = this.d;
        b24 b24Var = this.r;
        if (!z2 || ((a24Var.length() == 0 && (b24Var == null || b24Var.getSelectedCategory() == null)) || z)) {
            this.c.b((a24Var.length() > 0 || (b24Var != null && b24Var.w3 > 0.5f && (b24Var.r3 || b24Var.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            View view = this.e;
            view.setAlpha(f);
            view.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.y(aob.Di));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
