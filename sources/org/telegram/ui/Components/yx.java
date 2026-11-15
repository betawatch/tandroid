package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class yx extends FrameLayout implements org.telegram.ui.ActionBar.z5, te.b {
    public ValueAnimator E;
    public fo F;
    public boolean G;
    public final /* synthetic */ ly H;
    public final te.a a;
    public final int b;
    public final kl0 c;
    public final zp d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final xx r;
    public final ai.j0 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(ly lyVar, Context context, int i7) {
        super(context);
        zp zpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.H = lyVar;
        this.a = new te.a(0, this, er.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.a;
        this.b = i7;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.j6.Cf;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
        boolean z10 = lyVar.j2;
        org.telegram.ui.ActionBar.q6.h(i12, view, e6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (lyVar.v0) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.zf, view2, e6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, lyVar.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(18.0f), z10 ? lyVar.v(0.06f) : lyVar.z(org.telegram.ui.ActionBar.j6.Af)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        bg.p0 p0Var = bg.t0.a;
        frameLayout.setOutlineProvider(new bg.r0(0, L));
        int i13 = 2;
        if (i7 == 2) {
            addView(frameLayout, c8.ja.d(-1, 36.0f, org.telegram.messenger.ns.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ja.d(-1, 36.0f, org.telegram.messenger.ns.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.j0 j0Var = new ai.j0(16, context, this);
        this.s = j0Var;
        frameLayout.addView(j0Var, c8.ja.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        kl0 kl0Var = new kl0();
        this.c = kl0Var;
        kl0Var.c(0, false, false);
        kl0Var.a(z10 ? lyVar.v(0.4f) : lyVar.z(org.telegram.ui.ActionBar.j6.Bf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(kl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vx
            public final /* synthetic */ yx b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        yx yxVar = this.b;
                        xx xxVar = yxVar.r;
                        zp zpVar2 = yxVar.d;
                        if (yxVar.c.k == 1) {
                            zpVar2.setText("");
                            yxVar.c(null, false);
                            if (xxVar != null) {
                                xxVar.G1();
                                xxVar.I1(null);
                                xxVar.J1(true, true);
                            }
                            yxVar.f(false);
                            zpVar2.clearAnimation();
                            zpVar2.animate().translationX(0.0f).setInterpolator(er.h).start();
                            yxVar.d(false);
                            break;
                        }
                        break;
                    default:
                        yx yxVar2 = this.b;
                        zp zpVar3 = yxVar2.d;
                        zpVar3.setText("");
                        yxVar2.c(null, false);
                        xx xxVar2 = yxVar2.r;
                        if (xxVar2 != null) {
                            xxVar2.G1();
                            xxVar2.I1(null);
                            xxVar2.J1(true, true);
                        }
                        yxVar2.f(false);
                        zpVar3.clearAnimation();
                        zpVar3.animate().translationX(0.0f).setInterpolator(er.h).start();
                        yxVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, c8.ja.e(36, 36, 51));
        zp zpVar2 = new zp(this, context, i7, i13);
        this.d = zpVar2;
        zpVar2.setTextSize(1, 16.0f);
        zpVar2.setHintTextColor(z10 ? lyVar.v(0.45f) : lyVar.z(org.telegram.ui.ActionBar.j6.Bf));
        zpVar2.setTextColor(z10 ? lyVar.v(0.8f) : lyVar.z(org.telegram.ui.ActionBar.j6.G6));
        zpVar2.setBackgroundDrawable(null);
        zpVar2.setPadding(0, 0, 0, 0);
        zpVar2.setMaxLines(1);
        zpVar2.setLines(1);
        zpVar2.setSingleLine(true);
        zpVar2.setImeOptions(268435459);
        zpVar2.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.q6.l(zpVar2, 30, org.telegram.ui.ActionBar.j6.Di, e6Var);
        zpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        zpVar2.setCursorWidth(1.5f);
        zpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        j0Var.addView(zpVar2, c8.ja.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        zpVar2.addTextChangedListener(new ah.j(this, 21));
        if (lyVar.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable g10 = i5.c.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(org.telegram.ui.ActionBar.j6.zf, org.telegram.ui.ActionBar.j6.Af);
            zpVar = zpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.q6.k(this, g10, p10.a, p10.b, 4, 0.0f, e6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            j0Var.addView(view3, c8.ja.e(18, -1, 3));
        } else {
            zpVar = zpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vx
            public final /* synthetic */ yx b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        yx yxVar = this.b;
                        xx xxVar = yxVar.r;
                        zp zpVar22 = yxVar.d;
                        if (yxVar.c.k == 1) {
                            zpVar22.setText("");
                            yxVar.c(null, false);
                            if (xxVar != null) {
                                xxVar.G1();
                                xxVar.I1(null);
                                xxVar.J1(true, true);
                            }
                            yxVar.f(false);
                            zpVar22.clearAnimation();
                            zpVar22.animate().translationX(0.0f).setInterpolator(er.h).start();
                            yxVar.d(false);
                            break;
                        }
                        break;
                    default:
                        yx yxVar2 = this.b;
                        zp zpVar3 = yxVar2.d;
                        zpVar3.setText("");
                        yxVar2.c(null, false);
                        xx xxVar2 = yxVar2.r;
                        if (xxVar2 != null) {
                            xxVar2.G1();
                            xxVar2.I1(null);
                            xxVar2.J1(true, true);
                        }
                        yxVar2.f(false);
                        zpVar3.clearAnimation();
                        zpVar3.animate().translationX(0.0f).setInterpolator(er.h).start();
                        yxVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ja.e(36, 36, 53));
        if (i7 != 1 || (lyVar.d2 && org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q())) {
            xx xxVar = new xx(this, context, i7 == 0 ? i10 : 0, lyVar.a2, i7);
            this.r = xxVar;
            xxVar.E3 = z10;
            xxVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) zpVar.getPaint().measureText(((Object) zpVar.getHint()) + "")));
            if (lyVar.v0) {
                org.telegram.ui.ActionBar.q6.i(xxVar, org.telegram.ui.ActionBar.q6.p(org.telegram.ui.ActionBar.j6.zf, org.telegram.ui.ActionBar.j6.Af), e6Var);
            }
            final int i16 = 0;
            xxVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.wx
                public final /* synthetic */ yx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            yx yxVar = this.b;
                            yxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            yxVar.d(num.intValue() > 0);
                            yxVar.g(false);
                            break;
                        default:
                            wu0 wu0Var = (wu0) obj;
                            yx yxVar2 = this.b;
                            ly lyVar2 = yxVar2.H;
                            xx xxVar2 = yxVar2.r;
                            if (wu0Var != null) {
                                if (xxVar2.getSelectedCategory() != wu0Var) {
                                    yxVar2.c(wu0Var.a, false);
                                    xxVar2.I1(wu0Var);
                                    break;
                                } else {
                                    yxVar2.c(null, false);
                                    xxVar2.I1(null);
                                    break;
                                }
                            } else {
                                yxVar2.d(false);
                                xxVar2.I1(null);
                                lyVar2.p0.d.setText("");
                                lyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            xxVar.setOnTouchListener(new m.c2(this, 2));
            final int i17 = 1;
            xxVar.setOnCategoryClick(new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.Components.wx
                public final /* synthetic */ yx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            yx yxVar = this.b;
                            yxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            yxVar.d(num.intValue() > 0);
                            yxVar.g(false);
                            break;
                        default:
                            wu0 wu0Var = (wu0) obj;
                            yx yxVar2 = this.b;
                            ly lyVar2 = yxVar2.H;
                            xx xxVar2 = yxVar2.r;
                            if (wu0Var != null) {
                                if (xxVar2.getSelectedCategory() != wu0Var) {
                                    yxVar2.c(wu0Var.a, false);
                                    xxVar2.I1(wu0Var);
                                    break;
                                } else {
                                    yxVar2.c(null, false);
                                    xxVar2.I1(null);
                                    break;
                                }
                            } else {
                                yxVar2.d(false);
                                xxVar2.I1(null);
                                lyVar2.p0.d.setText("");
                                lyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(xxVar, c8.ja.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(yx yxVar, boolean z10, boolean z11) {
        yxVar.a.a(z10, z11);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        org.telegram.messenger.g0.v1(this.d);
    }

    public final void c(String str, boolean z10) {
        ly lyVar = this.H;
        int i7 = this.b;
        if (i7 != 0) {
            if (i7 == 1) {
                lyVar.T.F(str, z10);
                return;
            } else {
                if (i7 == 2) {
                    lyVar.k0.G(str, z10);
                    return;
                }
                return;
            }
        }
        gy gyVar = lyVar.A0;
        fy fyVar = gyVar.P;
        ly lyVar2 = gyVar.R;
        yv yvVar = lyVar2.H0;
        vv vvVar = lyVar2.E0;
        if (gyVar.M != 0) {
            ConnectionsManager.getInstance(lyVar2.d1).cancelRequest(gyVar.M, true);
            gyVar.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            gyVar.O = null;
            gyVar.F.clear();
            gyVar.I.clear();
            gyVar.L = new ArrayList();
            v4.h0 adapter = vvVar.getAdapter();
            dy dyVar = lyVar2.z0;
            if (adapter != dyVar) {
                vvVar.setAdapter(dyVar);
            }
            gyVar.d = 0L;
            lyVar2.a.a(false, true);
            gyVar.f();
            yvVar.e(false);
        } else {
            gyVar.O = str.toLowerCase();
            yvVar.e(true);
        }
        org.telegram.messenger.g0.r(fyVar);
        org.telegram.messenger.g0.i3(fyVar, 300L);
    }

    public final void d(boolean z10) {
        if (z10 == this.y) {
            return;
        }
        this.y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new c6(this, 22));
        this.E.setDuration(120L);
        this.E.setInterpolator(er.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                fo foVar = new fo(this, 16);
                this.F = foVar;
                org.telegram.messenger.g0.i3(foVar, 340L);
                return;
            }
            return;
        }
        fo foVar2 = this.F;
        if (foVar2 != null) {
            org.telegram.messenger.g0.r(foVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.U3(this.h, false, true);
    }

    public final void g(boolean z10) {
        boolean z11 = this.G;
        zp zpVar = this.d;
        xx xxVar = this.r;
        if (!z11 || ((zpVar.length() == 0 && (xxVar == null || xxVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((zpVar.length() > 0 || (xxVar != null && xxVar.w3 > 0.5f && (xxVar.r3 || xxVar.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.j6.Di));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
