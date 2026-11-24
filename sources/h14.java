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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class h14 extends FrameLayout implements tjb, x74 {
    public ValueAnimator E;
    public li3 F;
    public boolean G;
    public final /* synthetic */ t14 H;
    public final fm0 a;
    public final byte b;
    public final ks9 c;
    public final f14 d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final g14 r;
    public final st s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h14(t14 t14Var, Context context, int i) {
        super(context);
        f14 f14Var;
        ImageView.ScaleType scaleType;
        int i2;
        float f;
        this.H = t14Var;
        this.a = new fm0(0, this, s33.g, 200L, false);
        final byte b = 0;
        this.y = false;
        ykb ykbVar = zkb.a;
        this.b = i;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i3 = bkb.Bf;
        wjb wjbVar = t14Var.a2;
        boolean z = t14Var.j2;
        zkb.h(i3, wjbVar, view);
        addView(view, new FrameLayout.LayoutParams(-1, gl.e1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (t14Var.v0) {
            zkb.h(bkb.yf, wjbVar, view2);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, t14Var.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(bkb.b0(gl.L(18.0f), z ? t14Var.u(0.06f) : t14Var.y(bkb.zf)));
        frameLayout.setClipToOutline(true);
        float L = gl.L(18.0f);
        xi xiVar = zdc.a;
        frameLayout.setOutlineProvider(new xdc(0, L));
        if (i == 2) {
            addView(frameLayout, nme.d(-1, 36.0f, kk7.D1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, nme.d(-1, 36.0f, kk7.D1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        st stVar = new st((byte) 13, context, (Object) this);
        this.s = stVar;
        frameLayout.addView(stVar, nme.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ks9 ks9Var = new ks9();
        this.c = ks9Var;
        ks9Var.c(0, false, false);
        ks9Var.a(z ? t14Var.u(0.4f) : t14Var.y(bkb.Af));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(ks9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: d14
            public final /* synthetic */ h14 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = b;
                h14 h14Var = this.b;
                switch (b2) {
                    case 0:
                        g14 g14Var = h14Var.r;
                        f14 f14Var2 = h14Var.d;
                        if (h14Var.c.k == 1) {
                            f14Var2.setText("");
                            h14Var.b(null, false);
                            if (g14Var != null) {
                                g14Var.G1();
                                g14Var.I1(null);
                                g14Var.J1(true, true);
                            }
                            h14Var.f(false);
                            f14Var2.clearAnimation();
                            f14Var2.animate().translationX(0.0f).setInterpolator(s33.h).start();
                            h14Var.c(false);
                            break;
                        }
                        break;
                    default:
                        f14 f14Var3 = h14Var.d;
                        f14Var3.setText("");
                        h14Var.b(null, false);
                        g14 g14Var2 = h14Var.r;
                        if (g14Var2 != null) {
                            g14Var2.G1();
                            g14Var2.I1(null);
                            g14Var2.J1(true, true);
                        }
                        h14Var.f(false);
                        f14Var3.clearAnimation();
                        f14Var3.animate().translationX(0.0f).setInterpolator(s33.h).start();
                        h14Var.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, nme.e(36, 36, 51));
        f14 f14Var2 = new f14(this, context, i);
        this.d = f14Var2;
        f14Var2.setTextSize(1, 16.0f);
        f14Var2.setHintTextColor(z ? t14Var.u(0.45f) : t14Var.y(bkb.Af));
        f14Var2.setTextColor(z ? t14Var.u(0.8f) : t14Var.y(bkb.F6));
        f14Var2.setBackgroundDrawable(null);
        f14Var2.setPadding(0, 0, 0, 0);
        f14Var2.setMaxLines(1);
        f14Var2.setLines(1);
        f14Var2.setSingleLine(true);
        f14Var2.setImeOptions(268435459);
        f14Var2.setHint(k96.M0(2131745644, null));
        zkb.l(f14Var2, 30, bkb.Ci, wjbVar);
        f14Var2.setCursorSize(gl.L(20.0f));
        f14Var2.setCursorWidth(1.5f);
        f14Var2.setTranslationY(gl.L(-2.0f));
        stVar.addView(f14Var2, nme.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        f14Var2.addTextChangedListener(new b7(this, (byte) 21));
        if (t14Var.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable d = b00.d(context, R.drawable.gradient_right);
            vkb p = zkb.p(bkb.yf, bkb.zf);
            f14Var = f14Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
            zkb.k(this, d, p.a, p.b, 4, 0.0f, wjbVar, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(d);
            view3.setAlpha(0.0f);
            stVar.addView(view3, nme.e(18, -1, 3));
        } else {
            f14Var = f14Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(this));
        int i4 = bkb.h6;
        final byte b2 = 1;
        ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 1, gl.L(15.0f));
        vkb M = zkb.M(i4);
        imageView2.setBackground(f0);
        zkb.j(imageView2, f0, null, M, wjbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: d14
            public final /* synthetic */ h14 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                byte b22 = b2;
                h14 h14Var = this.b;
                switch (b22) {
                    case 0:
                        g14 g14Var = h14Var.r;
                        f14 f14Var22 = h14Var.d;
                        if (h14Var.c.k == 1) {
                            f14Var22.setText("");
                            h14Var.b(null, false);
                            if (g14Var != null) {
                                g14Var.G1();
                                g14Var.I1(null);
                                g14Var.J1(true, true);
                            }
                            h14Var.f(false);
                            f14Var22.clearAnimation();
                            f14Var22.animate().translationX(0.0f).setInterpolator(s33.h).start();
                            h14Var.c(false);
                            break;
                        }
                        break;
                    default:
                        f14 f14Var3 = h14Var.d;
                        f14Var3.setText("");
                        h14Var.b(null, false);
                        g14 g14Var2 = h14Var.r;
                        if (g14Var2 != null) {
                            g14Var2.G1();
                            g14Var2.I1(null);
                            g14Var2.J1(true, true);
                        }
                        h14Var.f(false);
                        f14Var3.clearAnimation();
                        f14Var3.animate().translationX(0.0f).setInterpolator(s33.h).start();
                        h14Var.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, nme.e(36, 36, 53));
        if (i != 1 || (t14Var.d2 && y6c.h(y6c.t0).p())) {
            g14 g14Var = new g14(this, context, i == 0 ? i2 : 0, t14Var.a2, i);
            this.r = g14Var;
            g14Var.E3 = z;
            g14Var.setDontOccupyWidth(gl.L(f) + ((int) f14Var.getPaint().measureText(((Object) f14Var.getHint()) + "")));
            if (t14Var.v0) {
                zkb.i(g14Var, zkb.p(bkb.yf, bkb.zf), wjbVar);
            }
            final byte b3 = 0;
            g14Var.setOnScrollIntoOccupiedWidth(new p8c(this) { // from class: e14
                public final /* synthetic */ h14 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b4 = b3;
                    h14 h14Var = this.b;
                    switch (b4) {
                        case 0:
                            Integer num = (Integer) obj;
                            h14Var.d.setTranslationX(-Math.max(0, num.intValue()));
                            h14Var.c(num.intValue() > 0);
                            h14Var.g(false);
                            break;
                        default:
                            qya qyaVar = (qya) obj;
                            t14 t14Var2 = h14Var.H;
                            g14 g14Var2 = h14Var.r;
                            if (qyaVar != null) {
                                if (g14Var2.getSelectedCategory() != qyaVar) {
                                    h14Var.b(qyaVar.a, false);
                                    g14Var2.I1(qyaVar);
                                    break;
                                } else {
                                    h14Var.b(null, false);
                                    g14Var2.I1(null);
                                    break;
                                }
                            } else {
                                h14Var.c(false);
                                g14Var2.I1(null);
                                t14Var2.p0.d.setText("");
                                t14Var2.j0.g1(0, 0);
                                break;
                            }
                    }
                }
            });
            final byte b4 = 1;
            g14Var.setOnTouchListener(new p04(this, b4));
            g14Var.setOnCategoryClick(new p8c(this) { // from class: e14
                public final /* synthetic */ h14 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b42 = b4;
                    h14 h14Var = this.b;
                    switch (b42) {
                        case 0:
                            Integer num = (Integer) obj;
                            h14Var.d.setTranslationX(-Math.max(0, num.intValue()));
                            h14Var.c(num.intValue() > 0);
                            h14Var.g(false);
                            break;
                        default:
                            qya qyaVar = (qya) obj;
                            t14 t14Var2 = h14Var.H;
                            g14 g14Var2 = h14Var.r;
                            if (qyaVar != null) {
                                if (g14Var2.getSelectedCategory() != qyaVar) {
                                    h14Var.b(qyaVar.a, false);
                                    g14Var2.I1(qyaVar);
                                    break;
                                } else {
                                    h14Var.b(null, false);
                                    g14Var2.I1(null);
                                    break;
                                }
                            } else {
                                h14Var.c(false);
                                g14Var2.I1(null);
                                t14Var2.p0.d.setText("");
                                t14Var2.j0.g1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(g14Var, nme.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void a() {
        gl.t1(this.d);
    }

    public final void b(String str, boolean z) {
        t14 t14Var = this.H;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                t14Var.T.E(str, z);
                return;
            } else {
                if (b == 2) {
                    t14Var.k0.G(str, z);
                    return;
                }
                return;
            }
        }
        o14 o14Var = t14Var.A0;
        n14 n14Var = o14Var.P;
        t14 t14Var2 = o14Var.R;
        fz3 fz3Var = t14Var2.H0;
        bz3 bz3Var = t14Var2.E0;
        if (o14Var.M != 0) {
            ConnectionsManager.getInstance(t14Var2.d1).cancelRequest(o14Var.M, true);
            o14Var.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            o14Var.O = null;
            o14Var.F.clear();
            o14Var.I.clear();
            o14Var.L = new ArrayList();
            w39 adapter = bz3Var.getAdapter();
            l14 l14Var = t14Var2.z0;
            if (adapter != l14Var) {
                bz3Var.setAdapter(l14Var);
            }
            o14Var.d = 0L;
            t14Var2.a.a(false, true);
            o14Var.f();
            fz3Var.d(false);
        } else {
            o14Var.O = str.toLowerCase();
            fz3Var.d(true);
        }
        gl.r(n14Var);
        gl.d3(n14Var, 300L);
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
        ofFloat.addUpdateListener(new uz1(this, (byte) 24));
        this.E.setDuration(120L);
        this.E.setInterpolator(s33.h);
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
        li3 li3Var = this.F;
        if (!z) {
            if (li3Var != null) {
                gl.r(li3Var);
                this.F = null;
            }
            gl.P3(this.h, false, true);
            return;
        }
        if (li3Var == null) {
            li3 li3Var2 = new li3(this, (byte) 28);
            this.F = li3Var2;
            gl.d3(li3Var2, 340L);
        }
    }

    public final void g(boolean z) {
        boolean z2 = this.G;
        f14 f14Var = this.d;
        g14 g14Var = this.r;
        if (!z2 || ((f14Var.length() == 0 && (g14Var == null || g14Var.getSelectedCategory() == null)) || z)) {
            this.c.b((f14Var.length() > 0 || (g14Var != null && g14Var.w3 > 0.5f && (g14Var.r3 || g14Var.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            View view = this.e;
            view.setAlpha(f);
            view.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.y(bkb.Ci));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
