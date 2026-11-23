package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k01 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public ShapeDrawable E;
    public int F;
    public final /* synthetic */ s11 G;
    public final /* synthetic */ s11 H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final hi.p3 d;
    public final View e;
    public final org.telegram.ui.Components.ul0 f;
    public final bi.u h;
    public h11 n;
    public float r;
    public ValueAnimator s;
    public ru0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k01(s11 s11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var = s11Var.a1;
        this.H = s11Var;
        this.G = s11Var;
        final int i7 = 0;
        this.x = false;
        final int i10 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, this, h6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i11 = org.telegram.ui.ActionBar.m6.zf;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setClipToOutline(true);
        float L2 = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L2));
        addView(frameLayout, c8.ma.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0();
        this.f = ul0Var;
        ul0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.m6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e11
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        k01 k01Var = this.b;
                        bi.u uVar = k01Var.h;
                        if (k01Var.f.k == 1) {
                            uVar.setText("");
                            k01Var.G.v(null, true, false);
                            h11 h11Var = k01Var.n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.n.J1(true, true);
                                k01Var.n.G1();
                            }
                            uVar.clearAnimation();
                            uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            k01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        k01 k01Var2 = this.b;
                        s11 s11Var2 = k01Var2.G;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        k01 k01Var3 = this.b;
                        bi.u uVar2 = k01Var3.h;
                        uVar2.setText("");
                        k01Var3.G.v(null, true, false);
                        h11 h11Var2 = k01Var3.n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.n.J1(true, true);
                        }
                        uVar2.clearAnimation();
                        uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        k01Var3.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i13 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        hi.p3 p3Var = new hi.p3(this, context, z10);
        this.d = p3Var;
        frameLayout.addView(p3Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        bi.u uVar = new bi.u(this, context, h6Var, i13);
        this.h = uVar;
        uVar.addTextChangedListener(new m0(this, 15));
        uVar.setBackground(null);
        uVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        uVar.setTextSize(1, 16.0f);
        uVar.setHint(org.telegram.messenger.hd.N0(2131745640, null));
        org.telegram.ui.ActionBar.t6.D(uVar, i12, h6Var);
        org.telegram.ui.ActionBar.t6.U(uVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        uVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.t6.l(uVar, 30, org.telegram.ui.ActionBar.m6.Di, h6Var);
        uVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        uVar.setGravity(19);
        uVar.setCursorWidth(1.5f);
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setLines(1);
        uVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        p3Var.addView(uVar, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable g10 = i5.c.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.t6.x(this, g10, i11, h6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g10);
            view.setAlpha(0.0f);
            p3Var.addView(view, c8.ma.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e11
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        k01 k01Var = this.b;
                        bi.u uVar2 = k01Var.h;
                        if (k01Var.f.k == 1) {
                            uVar2.setText("");
                            k01Var.G.v(null, true, false);
                            h11 h11Var = k01Var.n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.n.J1(true, true);
                                k01Var.n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            k01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        k01 k01Var2 = this.b;
                        s11 s11Var2 = k01Var2.G;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        k01 k01Var3 = this.b;
                        bi.u uVar22 = k01Var3.h;
                        uVar22.setText("");
                        k01Var3.G.v(null, true, false);
                        h11 h11Var2 = k01Var3.n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        k01Var3.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e11
            public final /* synthetic */ k01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        k01 k01Var = this.b;
                        bi.u uVar2 = k01Var.h;
                        if (k01Var.f.k == 1) {
                            uVar2.setText("");
                            k01Var.G.v(null, true, false);
                            h11 h11Var = k01Var.n;
                            if (h11Var != null) {
                                h11Var.I1(null);
                                k01Var.n.J1(true, true);
                                k01Var.n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            k01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        k01 k01Var2 = this.b;
                        s11 s11Var2 = k01Var2.G;
                        if (!s11Var2.u()) {
                            s11Var2.q();
                            k01Var2.h.requestFocus();
                            s11.a(s11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        k01 k01Var3 = this.b;
                        bi.u uVar22 = k01Var3.h;
                        uVar22.setText("");
                        k01Var3.G.v(null, true, false);
                        h11 h11Var2 = k01Var3.n;
                        if (h11Var2 != null) {
                            h11Var2.I1(null);
                            k01Var3.n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        k01Var3.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (ch.f0.d) {
            return;
        }
        b();
    }

    public static void a(k01 k01Var, boolean z10) {
        if (z10) {
            if (k01Var.w == null) {
                ru0 ru0Var = new ru0(k01Var, 16);
                k01Var.w = ru0Var;
                org.telegram.messenger.g0.h3(ru0Var, 340L);
                return;
            }
            return;
        }
        ru0 ru0Var2 = k01Var.w;
        if (ru0Var2 != null) {
            org.telegram.messenger.g0.r(ru0Var2);
            k01Var.w = null;
        }
        org.telegram.messenger.g0.T3(k01Var.c, false, true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        s11 s11Var = this.G;
        int i7 = s11Var.a0;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i10 = 2;
        if (i7 == 1 || i7 == 11 || i7 == 2 || i7 == 0 || i7 == 12 || i7 == 4 || i7 == 10 || i7 == 9 || i7 == 14) {
            if (i7 != 0) {
                if (i7 != 4) {
                    if (i7 != 12) {
                        i10 = 0;
                    }
                }
                h11 h11Var = new h11(this, getContext(), i10, s11Var.a1);
                this.n = h11Var;
                h11Var.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
                h11 h11Var2 = this.n;
                bi.u uVar = this.h;
                h11Var2.setDontOccupyWidth((int) uVar.getPaint().measureText(((Object) uVar.getHint()) + ""));
                final int i11 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.f11
                    public final /* synthetic */ k01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        switch (i11) {
                            case 0:
                                Integer num = (Integer) obj;
                                k01 k01Var = this.b;
                                k01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                k01Var.c(num.intValue() > 0);
                                k01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.hv0 hv0Var = (org.telegram.ui.Components.hv0) obj;
                                k01 k01Var2 = this.b;
                                s11 s11Var2 = k01Var2.G;
                                if (k01Var2.n.getSelectedCategory() != hv0Var) {
                                    s11Var2.v(hv0Var.a, false, false);
                                    k01Var2.n.I1(hv0Var);
                                    break;
                                } else {
                                    s11Var2.v(null, false, false);
                                    k01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i12 = 1;
                this.n.setOnCategoryClick(new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.f11
                    public final /* synthetic */ k01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                k01 k01Var = this.b;
                                k01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                k01Var.c(num.intValue() > 0);
                                k01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.hv0 hv0Var = (org.telegram.ui.Components.hv0) obj;
                                k01 k01Var2 = this.b;
                                s11 s11Var2 = k01Var2.G;
                                if (k01Var2.n.getSelectedCategory() != hv0Var) {
                                    s11Var2.v(hv0Var.a, false, false);
                                    k01Var2.n.I1(hv0Var);
                                    break;
                                } else {
                                    s11Var2.v(null, false, false);
                                    k01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i10 = 1;
            h11 h11Var3 = new h11(this, getContext(), i10, s11Var.a1);
            this.n = h11Var3;
            h11Var3.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
            h11 h11Var22 = this.n;
            bi.u uVar2 = this.h;
            h11Var22.setDontOccupyWidth((int) uVar2.getPaint().measureText(((Object) uVar2.getHint()) + ""));
            final int i112 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.f11
                public final /* synthetic */ k01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i112) {
                        case 0:
                            Integer num = (Integer) obj;
                            k01 k01Var = this.b;
                            k01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            k01Var.c(num.intValue() > 0);
                            k01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.hv0 hv0Var = (org.telegram.ui.Components.hv0) obj;
                            k01 k01Var2 = this.b;
                            s11 s11Var2 = k01Var2.G;
                            if (k01Var2.n.getSelectedCategory() != hv0Var) {
                                s11Var2.v(hv0Var.a, false, false);
                                k01Var2.n.I1(hv0Var);
                                break;
                            } else {
                                s11Var2.v(null, false, false);
                                k01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            final int i122 = 1;
            this.n.setOnCategoryClick(new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.f11
                public final /* synthetic */ k01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            k01 k01Var = this.b;
                            k01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            k01Var.c(num.intValue() > 0);
                            k01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.hv0 hv0Var = (org.telegram.ui.Components.hv0) obj;
                            k01 k01Var2 = this.b;
                            s11 s11Var2 = k01Var2.G;
                            if (k01Var2.n.getSelectedCategory() != hv0Var) {
                                s11Var2.v(hv0Var.a, false, false);
                                k01Var2.n.I1(hv0Var);
                                break;
                            } else {
                                s11Var2.v(null, false, false);
                                k01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void c(boolean z10) {
        if (z10 == this.x) {
            return;
        }
        this.x = z10;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new iz0(this, 5));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.nr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        h11 h11Var;
        h11 h11Var2;
        org.telegram.ui.Components.ul0 ul0Var = this.f;
        int i7 = ul0Var.k;
        bi.u uVar = this.h;
        if (i7 != 2 || ((uVar.length() == 0 && ((h11Var2 = this.n) == null || h11Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (uVar.length() > 0 || ((h11Var = this.n) != null && h11Var.w3 > 0.5f && (h11Var.r3 || h11Var.getSelectedCategory() != null))) ? 1 : 0;
            ul0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? org.telegram.messenger.hd.N0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s11 s11Var = this.H;
        ih0 ih0Var = s11Var.h0;
        k01 k01Var = s11Var.g0;
        t01 t01Var = s11Var.V;
        if (t01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = ih0Var.getX() + k01Var.getX();
            float y10 = ih0Var.getY() + k01Var.getY();
            ab.g gVar = (ab.g) t01Var;
            ch.b0 b0Var = (ch.b0) gVar.b;
            ch.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) gVar.c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            xi0Var.getDelegate().x(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - org.telegram.messenger.g0.m : a0Var.getY() + b0Var.c.getY()) + y10, org.telegram.messenger.ls.e4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            if (this.H.V != null) {
                invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var = this.G.a1;
        try {
            org.telegram.ui.Components.ul0 ul0Var = this.f;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
        if (this.E != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.E;
            if (background == shapeDrawable) {
                if (r12 != this.F) {
                    org.telegram.ui.ActionBar.m6.C1(r12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.F = r12;
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), r12);
        this.E = d02;
        frameLayout.setBackground(d02);
        this.F = r12;
    }
}
