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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class tx extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b {
    public ValueAnimator D;
    public gp E;
    public boolean F;
    public final /* synthetic */ gy G;
    public final te.a a;
    public final int b;
    public final fl0 c;
    public final rp d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final sx r;
    public final bi.x5 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(gy gyVar, Context context, int i7) {
        super(context);
        rp rpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.G = gyVar;
        this.a = new te.a(0, this, wq.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.a;
        this.b = i7;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.m6.zf;
        org.telegram.ui.ActionBar.h6 h6Var = gyVar.Z1;
        boolean z9 = gyVar.i2;
        org.telegram.ui.ActionBar.t6.h(i12, view, h6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (gyVar.u0) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.wf, view2, h6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, gyVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), z9 ? gyVar.v(0.06f) : gyVar.z(org.telegram.ui.ActionBar.m6.xf)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L));
        int i13 = 2;
        if (i7 == 2) {
            addView(frameLayout, c8.ha.d(-1, 36.0f, org.telegram.messenger.qs.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ha.d(-1, 36.0f, org.telegram.messenger.qs.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bi.x5 x5Var = new bi.x5(14, context, this);
        this.s = x5Var;
        frameLayout.addView(x5Var, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        fl0 fl0Var = new fl0();
        this.c = fl0Var;
        fl0Var.c(0, false, false);
        fl0Var.a(z9 ? gyVar.v(0.4f) : gyVar.z(org.telegram.ui.ActionBar.m6.yf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qx
            public final /* synthetic */ tx b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        tx txVar = this.b;
                        sx sxVar = txVar.r;
                        rp rpVar2 = txVar.d;
                        if (txVar.c.k == 1) {
                            rpVar2.setText("");
                            txVar.c(null, false);
                            if (sxVar != null) {
                                sxVar.G1();
                                sxVar.I1(null);
                                sxVar.J1(true, true);
                            }
                            txVar.f(false);
                            rpVar2.clearAnimation();
                            rpVar2.animate().translationX(0.0f).setInterpolator(wq.h).start();
                            txVar.d(false);
                            break;
                        }
                        break;
                    default:
                        tx txVar2 = this.b;
                        rp rpVar3 = txVar2.d;
                        rpVar3.setText("");
                        txVar2.c(null, false);
                        sx sxVar2 = txVar2.r;
                        if (sxVar2 != null) {
                            sxVar2.G1();
                            sxVar2.I1(null);
                            sxVar2.J1(true, true);
                        }
                        txVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(wq.h).start();
                        txVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        rp rpVar2 = new rp(this, context, i7, i13);
        this.d = rpVar2;
        rpVar2.setTextSize(1, 16.0f);
        rpVar2.setHintTextColor(z9 ? gyVar.v(0.45f) : gyVar.z(org.telegram.ui.ActionBar.m6.yf));
        rpVar2.setTextColor(z9 ? gyVar.v(0.8f) : gyVar.z(org.telegram.ui.ActionBar.m6.G6));
        rpVar2.setBackgroundDrawable(null);
        rpVar2.setPadding(0, 0, 0, 0);
        rpVar2.setMaxLines(1);
        rpVar2.setLines(1);
        rpVar2.setSingleLine(true);
        rpVar2.setImeOptions(268435459);
        rpVar2.setHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.t6.l(rpVar2, 30, org.telegram.ui.ActionBar.m6.Ai, h6Var);
        rpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rpVar2.setCursorWidth(1.5f);
        rpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        x5Var.addView(rpVar2, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        rpVar2.addTextChangedListener(new ah.j(this, 19));
        if (gyVar.u0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable h = jg.g.h(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.wf, org.telegram.ui.ActionBar.m6.xf);
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.t6.k(this, h, p10.a, p10.b, 4, 0.0f, h6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(h);
            view3.setAlpha(0.0f);
            x5Var.addView(view3, c8.ha.e(18, -1, 3));
        } else {
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qx
            public final /* synthetic */ tx b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        tx txVar = this.b;
                        sx sxVar = txVar.r;
                        rp rpVar22 = txVar.d;
                        if (txVar.c.k == 1) {
                            rpVar22.setText("");
                            txVar.c(null, false);
                            if (sxVar != null) {
                                sxVar.G1();
                                sxVar.I1(null);
                                sxVar.J1(true, true);
                            }
                            txVar.f(false);
                            rpVar22.clearAnimation();
                            rpVar22.animate().translationX(0.0f).setInterpolator(wq.h).start();
                            txVar.d(false);
                            break;
                        }
                        break;
                    default:
                        tx txVar2 = this.b;
                        rp rpVar3 = txVar2.d;
                        rpVar3.setText("");
                        txVar2.c(null, false);
                        sx sxVar2 = txVar2.r;
                        if (sxVar2 != null) {
                            sxVar2.G1();
                            sxVar2.I1(null);
                            sxVar2.J1(true, true);
                        }
                        txVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(wq.h).start();
                        txVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (i7 != 1 || (gyVar.c2 && org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q())) {
            sx sxVar = new sx(this, context, i7 == 0 ? i10 : 0, gyVar.Z1, i7);
            this.r = sxVar;
            sxVar.D3 = z9;
            sxVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) rpVar.getPaint().measureText(((Object) rpVar.getHint()) + "")));
            if (gyVar.u0) {
                org.telegram.ui.ActionBar.t6.i(sxVar, org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.wf, org.telegram.ui.ActionBar.m6.xf), h6Var);
            }
            final int i16 = 0;
            sxVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.rx
                public final /* synthetic */ tx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            tx txVar = this.b;
                            txVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            txVar.d(num.intValue() > 0);
                            txVar.g(false);
                            break;
                        default:
                            vu0 vu0Var = (vu0) obj;
                            tx txVar2 = this.b;
                            gy gyVar2 = txVar2.G;
                            sx sxVar2 = txVar2.r;
                            if (vu0Var != null) {
                                if (sxVar2.getSelectedCategory() != vu0Var) {
                                    txVar2.c(vu0Var.a, false);
                                    sxVar2.I1(vu0Var);
                                    break;
                                } else {
                                    txVar2.c(null, false);
                                    sxVar2.I1(null);
                                    break;
                                }
                            } else {
                                txVar2.d(false);
                                sxVar2.I1(null);
                                gyVar2.o0.d.setText("");
                                gyVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            sxVar.setOnTouchListener(new m.d2(this, 2));
            final int i17 = 1;
            sxVar.setOnCategoryClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.rx
                public final /* synthetic */ tx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            tx txVar = this.b;
                            txVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            txVar.d(num.intValue() > 0);
                            txVar.g(false);
                            break;
                        default:
                            vu0 vu0Var = (vu0) obj;
                            tx txVar2 = this.b;
                            gy gyVar2 = txVar2.G;
                            sx sxVar2 = txVar2.r;
                            if (vu0Var != null) {
                                if (sxVar2.getSelectedCategory() != vu0Var) {
                                    txVar2.c(vu0Var.a, false);
                                    sxVar2.I1(vu0Var);
                                    break;
                                } else {
                                    txVar2.c(null, false);
                                    sxVar2.I1(null);
                                    break;
                                }
                            } else {
                                txVar2.d(false);
                                sxVar2.I1(null);
                                gyVar2.o0.d.setText("");
                                gyVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(sxVar, c8.ha.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(tx txVar, boolean z9, boolean z10) {
        txVar.a.a(z9, z10);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        org.telegram.messenger.g0.v1(this.d);
    }

    public final void c(String str, boolean z9) {
        gy gyVar = this.G;
        int i7 = this.b;
        if (i7 != 0) {
            if (i7 == 1) {
                gyVar.S.F(str, z9);
                return;
            } else {
                if (i7 == 2) {
                    gyVar.j0.G(str, z9);
                    return;
                }
                return;
            }
        }
        ay ayVar = gyVar.z0;
        zx zxVar = ayVar.O;
        gy gyVar2 = ayVar.Q;
        sv svVar = gyVar2.G0;
        pv pvVar = gyVar2.D0;
        if (ayVar.L != 0) {
            ConnectionsManager.getInstance(gyVar2.c1).cancelRequest(ayVar.L, true);
            ayVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            ayVar.N = null;
            ayVar.E.clear();
            ayVar.H.clear();
            ayVar.K = new ArrayList();
            v4.g0 adapter = pvVar.getAdapter();
            xx xxVar = gyVar2.y0;
            if (adapter != xxVar) {
                pvVar.setAdapter(xxVar);
            }
            ayVar.d = 0L;
            gyVar2.a.a(false, true);
            ayVar.f();
            svVar.e(false);
        } else {
            ayVar.N = str.toLowerCase();
            svVar.e(true);
        }
        org.telegram.messenger.g0.r(zxVar);
        org.telegram.messenger.g0.i3(zxVar, 300L);
    }

    public final void d(boolean z9) {
        if (z9 == this.y) {
            return;
        }
        this.y = z9;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z9 ? 1.0f : 0.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new d6(this, 22));
        this.D.setDuration(120L);
        this.D.setInterpolator(wq.h);
        this.D.start();
    }

    public final void e(boolean z9) {
        this.F = z9;
        if (z9) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z9) {
        if (z9) {
            if (this.E == null) {
                gp gpVar = new gp(this, 14);
                this.E = gpVar;
                org.telegram.messenger.g0.i3(gpVar, 340L);
                return;
            }
            return;
        }
        gp gpVar2 = this.E;
        if (gpVar2 != null) {
            org.telegram.messenger.g0.r(gpVar2);
            this.E = null;
        }
        org.telegram.messenger.g0.V3(this.h, false, true);
    }

    public final void g(boolean z9) {
        boolean z10 = this.F;
        rp rpVar = this.d;
        sx sxVar = this.r;
        if (!z10 || ((rpVar.length() == 0 && (sxVar == null || sxVar.getSelectedCategory() == null)) || z9)) {
            this.c.b((rpVar.length() > 0 || (sxVar != null && sxVar.v3 > 0.5f && (sxVar.q3 || sxVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.z(org.telegram.ui.ActionBar.m6.Ai));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
