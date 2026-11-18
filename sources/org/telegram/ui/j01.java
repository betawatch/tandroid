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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j01 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ShapeDrawable E;
    public int F;
    public final /* synthetic */ r11 G;
    public final /* synthetic */ r11 H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final hi.q3 d;
    public final View e;
    public final org.telegram.ui.Components.sl0 f;
    public final bi.u h;
    public g11 n;
    public float r;
    public ValueAnimator s;
    public ru0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(r11 r11Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var = r11Var.a1;
        this.H = r11Var;
        this.G = r11Var;
        final int i7 = 0;
        this.x = false;
        final int i10 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, this, i6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i11 = org.telegram.ui.ActionBar.n6.zf;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setClipToOutline(true);
        float L2 = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L2));
        addView(frameLayout, c8.ma.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0();
        this.f = sl0Var;
        sl0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.n6.Bf;
        sl0Var.a(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        imageView.setImageDrawable(sl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d11
            public final /* synthetic */ j01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        j01 j01Var = this.b;
                        bi.u uVar = j01Var.h;
                        if (j01Var.f.k == 1) {
                            uVar.setText("");
                            j01Var.G.v(null, true, false);
                            g11 g11Var = j01Var.n;
                            if (g11Var != null) {
                                g11Var.I1(null);
                                j01Var.n.J1(true, true);
                                j01Var.n.G1();
                            }
                            uVar.clearAnimation();
                            uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            j01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        j01 j01Var2 = this.b;
                        r11 r11Var2 = j01Var2.G;
                        if (!r11Var2.u()) {
                            r11Var2.q();
                            j01Var2.h.requestFocus();
                            r11.a(r11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        j01 j01Var3 = this.b;
                        bi.u uVar2 = j01Var3.h;
                        uVar2.setText("");
                        j01Var3.G.v(null, true, false);
                        g11 g11Var2 = j01Var3.n;
                        if (g11Var2 != null) {
                            g11Var2.I1(null);
                            j01Var3.n.J1(true, true);
                        }
                        uVar2.clearAnimation();
                        uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        j01Var3.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i13 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        hi.q3 q3Var = new hi.q3(this, context, z10);
        this.d = q3Var;
        frameLayout.addView(q3Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        bi.u uVar = new bi.u(this, context, i6Var, i13);
        this.h = uVar;
        uVar.addTextChangedListener(new m0(this, 15));
        uVar.setBackground(null);
        uVar.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        uVar.setTextSize(1, 16.0f);
        uVar.setHint(org.telegram.messenger.gd.M0(2131745641, null));
        org.telegram.ui.ActionBar.u6.D(uVar, i12, i6Var);
        org.telegram.ui.ActionBar.u6.U(uVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        uVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.u6.l(uVar, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        uVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        uVar.setGravity(19);
        uVar.setCursorWidth(1.5f);
        uVar.setMaxLines(1);
        uVar.setSingleLine(true);
        uVar.setLines(1);
        uVar.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        q3Var.addView(uVar, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable g10 = i5.c.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.u6.x(this, g10, i11, i6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(g10);
            view.setAlpha(0.0f);
            q3Var.addView(view, c8.ma.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d11
            public final /* synthetic */ j01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        j01 j01Var = this.b;
                        bi.u uVar2 = j01Var.h;
                        if (j01Var.f.k == 1) {
                            uVar2.setText("");
                            j01Var.G.v(null, true, false);
                            g11 g11Var = j01Var.n;
                            if (g11Var != null) {
                                g11Var.I1(null);
                                j01Var.n.J1(true, true);
                                j01Var.n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            j01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        j01 j01Var2 = this.b;
                        r11 r11Var2 = j01Var2.G;
                        if (!r11Var2.u()) {
                            r11Var2.q();
                            j01Var2.h.requestFocus();
                            r11.a(r11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        j01 j01Var3 = this.b;
                        bi.u uVar22 = j01Var3.h;
                        uVar22.setText("");
                        j01Var3.G.v(null, true, false);
                        g11 g11Var2 = j01Var3.n;
                        if (g11Var2 != null) {
                            g11Var2.I1(null);
                            j01Var3.n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        j01Var3.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.c2(this));
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d11
            public final /* synthetic */ j01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        j01 j01Var = this.b;
                        bi.u uVar2 = j01Var.h;
                        if (j01Var.f.k == 1) {
                            uVar2.setText("");
                            j01Var.G.v(null, true, false);
                            g11 g11Var = j01Var.n;
                            if (g11Var != null) {
                                g11Var.I1(null);
                                j01Var.n.J1(true, true);
                                j01Var.n.G1();
                            }
                            uVar2.clearAnimation();
                            uVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                            j01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        j01 j01Var2 = this.b;
                        r11 r11Var2 = j01Var2.G;
                        if (!r11Var2.u()) {
                            r11Var2.q();
                            j01Var2.h.requestFocus();
                            r11.a(r11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        j01 j01Var3 = this.b;
                        bi.u uVar22 = j01Var3.h;
                        uVar22.setText("");
                        j01Var3.G.v(null, true, false);
                        g11 g11Var2 = j01Var3.n;
                        if (g11Var2 != null) {
                            g11Var2.I1(null);
                            j01Var3.n.J1(true, true);
                        }
                        uVar22.clearAnimation();
                        uVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        j01Var3.c(false);
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

    public static void a(j01 j01Var, boolean z10) {
        if (z10) {
            if (j01Var.w == null) {
                ru0 ru0Var = new ru0(j01Var, 16);
                j01Var.w = ru0Var;
                org.telegram.messenger.g0.h3(ru0Var, 340L);
                return;
            }
            return;
        }
        ru0 ru0Var2 = j01Var.w;
        if (ru0Var2 != null) {
            org.telegram.messenger.g0.r(ru0Var2);
            j01Var.w = null;
        }
        org.telegram.messenger.g0.T3(j01Var.c, false, true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        r11 r11Var = this.G;
        int i7 = r11Var.a0;
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
                g11 g11Var = new g11(this, getContext(), i10, r11Var.a1);
                this.n = g11Var;
                g11Var.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
                g11 g11Var2 = this.n;
                bi.u uVar = this.h;
                g11Var2.setDontOccupyWidth((int) uVar.getPaint().measureText(((Object) uVar.getHint()) + ""));
                final int i11 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.e11
                    public final /* synthetic */ j01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        switch (i11) {
                            case 0:
                                Integer num = (Integer) obj;
                                j01 j01Var = this.b;
                                j01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                j01Var.c(num.intValue() > 0);
                                j01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.ev0 ev0Var = (org.telegram.ui.Components.ev0) obj;
                                j01 j01Var2 = this.b;
                                r11 r11Var2 = j01Var2.G;
                                if (j01Var2.n.getSelectedCategory() != ev0Var) {
                                    r11Var2.v(ev0Var.a, false, false);
                                    j01Var2.n.I1(ev0Var);
                                    break;
                                } else {
                                    r11Var2.v(null, false, false);
                                    j01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i12 = 1;
                this.n.setOnCategoryClick(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.e11
                    public final /* synthetic */ j01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                j01 j01Var = this.b;
                                j01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                j01Var.c(num.intValue() > 0);
                                j01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.ev0 ev0Var = (org.telegram.ui.Components.ev0) obj;
                                j01 j01Var2 = this.b;
                                r11 r11Var2 = j01Var2.G;
                                if (j01Var2.n.getSelectedCategory() != ev0Var) {
                                    r11Var2.v(ev0Var.a, false, false);
                                    j01Var2.n.I1(ev0Var);
                                    break;
                                } else {
                                    r11Var2.v(null, false, false);
                                    j01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i10 = 1;
            g11 g11Var3 = new g11(this, getContext(), i10, r11Var.a1);
            this.n = g11Var3;
            g11Var3.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
            g11 g11Var22 = this.n;
            bi.u uVar2 = this.h;
            g11Var22.setDontOccupyWidth((int) uVar2.getPaint().measureText(((Object) uVar2.getHint()) + ""));
            final int i112 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.e11
                public final /* synthetic */ j01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i112) {
                        case 0:
                            Integer num = (Integer) obj;
                            j01 j01Var = this.b;
                            j01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            j01Var.c(num.intValue() > 0);
                            j01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.ev0 ev0Var = (org.telegram.ui.Components.ev0) obj;
                            j01 j01Var2 = this.b;
                            r11 r11Var2 = j01Var2.G;
                            if (j01Var2.n.getSelectedCategory() != ev0Var) {
                                r11Var2.v(ev0Var.a, false, false);
                                j01Var2.n.I1(ev0Var);
                                break;
                            } else {
                                r11Var2.v(null, false, false);
                                j01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            final int i122 = 1;
            this.n.setOnCategoryClick(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.e11
                public final /* synthetic */ j01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            j01 j01Var = this.b;
                            j01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            j01Var.c(num.intValue() > 0);
                            j01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.ev0 ev0Var = (org.telegram.ui.Components.ev0) obj;
                            j01 j01Var2 = this.b;
                            r11 r11Var2 = j01Var2.G;
                            if (j01Var2.n.getSelectedCategory() != ev0Var) {
                                r11Var2.v(ev0Var.a, false, false);
                                j01Var2.n.I1(ev0Var);
                                break;
                            } else {
                                r11Var2.v(null, false, false);
                                j01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 36.0f, 0.0f, 0.0f, 0.0f));
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
        this.s.setInterpolator(org.telegram.ui.Components.lr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        g11 g11Var;
        g11 g11Var2;
        org.telegram.ui.Components.sl0 sl0Var = this.f;
        int i7 = sl0Var.k;
        bi.u uVar = this.h;
        if (i7 != 2 || ((uVar.length() == 0 && ((g11Var2 = this.n) == null || g11Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (uVar.length() > 0 || ((g11Var = this.n) != null && g11Var.w3 > 0.5f && (g11Var.r3 || g11Var.getSelectedCategory() != null))) ? 1 : 0;
            sl0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? org.telegram.messenger.gd.M0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r11 r11Var = this.H;
        hh0 hh0Var = r11Var.h0;
        j01 j01Var = r11Var.g0;
        s01 s01Var = r11Var.V;
        if (s01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = hh0Var.getX() + j01Var.getX();
            float y10 = hh0Var.getY() + j01Var.getY();
            ab.g gVar = (ab.g) s01Var;
            ch.b0 b0Var = (ch.b0) gVar.b;
            ch.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.vi0 vi0Var = (org.telegram.ui.Components.vi0) gVar.c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            vi0Var.getDelegate().x(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - org.telegram.messenger.g0.m : a0Var.getY() + b0Var.c.getY()) + y10, org.telegram.messenger.ks.e4, true);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.i6 i6Var = this.G.a1;
        try {
            org.telegram.ui.Components.sl0 sl0Var = this.f;
            if (sl0Var != null) {
                sl0Var.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, i6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var));
        if (this.E != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.E;
            if (background == shapeDrawable) {
                if (r12 != this.F) {
                    org.telegram.ui.ActionBar.n6.C1(r12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.F = r12;
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), r12);
        this.E = d02;
        frameLayout.setBackground(d02);
        this.F = r12;
    }
}
