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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a21 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public ShapeDrawable D;
    public int E;
    public final /* synthetic */ i31 F;
    public final /* synthetic */ i31 G;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final kg.x d;
    public final View e;
    public final org.telegram.ui.Components.im0 f;
    public final ih.b h;
    public x21 n;
    public float r;
    public ValueAnimator s;
    public wv0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a21(i31 i31Var, Context context, boolean z10) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var = i31Var.Z0;
        this.G = i31Var;
        this.F = i31Var;
        final int i10 = 0;
        this.x = false;
        final int i11 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z10) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, this, p6Var);
        }
        int L = org.telegram.messenger.i0.L(18.0f);
        int i12 = org.telegram.ui.ActionBar.t6.wf;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
        frameLayout.setClipToOutline(true);
        float L2 = org.telegram.messenger.i0.L(18.0f);
        bi.d2 d2Var = rf.e0.a;
        frameLayout.setOutlineProvider(new rf.c0(0, L2));
        addView(frameLayout, w7.b6.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0();
        this.f = im0Var;
        im0Var.c(0, false, false);
        int i13 = org.telegram.ui.ActionBar.t6.yf;
        im0Var.a(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        imageView.setImageDrawable(im0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u21
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        a21 a21Var = this.b;
                        ih.b bVar = a21Var.h;
                        if (a21Var.f.k == 1) {
                            bVar.setText("");
                            a21Var.F.v(null, true, false);
                            x21 x21Var = a21Var.n;
                            if (x21Var != null) {
                                x21Var.I1(null);
                                a21Var.n.J1(true, true);
                                a21Var.n.G1();
                            }
                            bVar.clearAnimation();
                            bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            a21Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        a21 a21Var2 = this.b;
                        i31 i31Var2 = a21Var2.F;
                        if (!i31Var2.u()) {
                            i31Var2.q();
                            a21Var2.h.requestFocus();
                            i31.a(i31Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        a21 a21Var3 = this.b;
                        ih.b bVar2 = a21Var3.h;
                        bVar2.setText("");
                        a21Var3.F.v(null, true, false);
                        x21 x21Var2 = a21Var3.n;
                        if (x21Var2 != null) {
                            x21Var2.I1(null);
                            a21Var3.n.J1(true, true);
                        }
                        bVar2.clearAnimation();
                        bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        a21Var3.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i14 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, w7.b6.e(36, 36, 51));
        kg.x xVar = new kg.x(this, context, z10);
        this.d = xVar;
        frameLayout.addView(xVar, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        ih.b bVar = new ih.b(this, context, p6Var, i14);
        this.h = bVar;
        bVar.addTextChangedListener(new n0(this, 15));
        bVar.setBackground(null);
        bVar.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
        bVar.setTextSize(1, 16.0f);
        bVar.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.a7.E(bVar, i13, p6Var);
        org.telegram.ui.ActionBar.a7.V(bVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        bVar.setImeOptions(268435459);
        org.telegram.ui.ActionBar.a7.m(bVar, 30, org.telegram.ui.ActionBar.t6.Ai, p6Var);
        bVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        bVar.setGravity(19);
        bVar.setCursorWidth(1.5f);
        bVar.setMaxLines(1);
        bVar.setSingleLine(true);
        bVar.setLines(1);
        bVar.setTranslationY(org.telegram.messenger.i0.L(-1.0f));
        xVar.addView(bVar, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z10) {
            View view = new View(context);
            this.e = view;
            Drawable f7 = i0.a.f(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.a7.y(this, f7, i12, p6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(f7);
            view.setAlpha(0.0f);
            xVar.addView(view, w7.b6.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u21
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        a21 a21Var = this.b;
                        ih.b bVar2 = a21Var.h;
                        if (a21Var.f.k == 1) {
                            bVar2.setText("");
                            a21Var.F.v(null, true, false);
                            x21 x21Var = a21Var.n;
                            if (x21Var != null) {
                                x21Var.I1(null);
                                a21Var.n.J1(true, true);
                                a21Var.n.G1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            a21Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        a21 a21Var2 = this.b;
                        i31 i31Var2 = a21Var2.F;
                        if (!i31Var2.u()) {
                            i31Var2.q();
                            a21Var2.h.requestFocus();
                            i31.a(i31Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        a21 a21Var3 = this.b;
                        ih.b bVar22 = a21Var3.h;
                        bVar22.setText("");
                        a21Var3.F.v(null, true, false);
                        x21 x21Var2 = a21Var3.n;
                        if (x21Var2 != null) {
                            x21Var2.I1(null);
                            a21Var3.n.J1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        a21Var3.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.h0(this));
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 1, org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N2, p6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.u21
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        a21 a21Var = this.b;
                        ih.b bVar2 = a21Var.h;
                        if (a21Var.f.k == 1) {
                            bVar2.setText("");
                            a21Var.F.v(null, true, false);
                            x21 x21Var = a21Var.n;
                            if (x21Var != null) {
                                x21Var.I1(null);
                                a21Var.n.J1(true, true);
                                a21Var.n.G1();
                            }
                            bVar2.clearAnimation();
                            bVar2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            a21Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        a21 a21Var2 = this.b;
                        i31 i31Var2 = a21Var2.F;
                        if (!i31Var2.u()) {
                            i31Var2.q();
                            a21Var2.h.requestFocus();
                            i31.a(i31Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        a21 a21Var3 = this.b;
                        ih.b bVar22 = a21Var3.h;
                        bVar22.setText("");
                        a21Var3.F.v(null, true, false);
                        x21 x21Var2 = a21Var3.n;
                        if (x21Var2 != null) {
                            x21Var2.I1(null);
                            a21Var3.n.J1(true, true);
                        }
                        bVar22.clearAnimation();
                        bVar22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        a21Var3.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.b6.e(36, 36, 53));
        if (sg.e0.d) {
            return;
        }
        b();
    }

    public static void a(a21 a21Var, boolean z10) {
        if (z10) {
            if (a21Var.w == null) {
                wv0 wv0Var = new wv0(a21Var, 18);
                a21Var.w = wv0Var;
                org.telegram.messenger.i0.h3(wv0Var, 340L);
                return;
            }
            return;
        }
        wv0 wv0Var2 = a21Var.w;
        if (wv0Var2 != null) {
            org.telegram.messenger.i0.r(wv0Var2);
            a21Var.w = null;
        }
        org.telegram.messenger.i0.U3(a21Var.c, false, true);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        i31 i31Var = this.F;
        int i10 = i31Var.W;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i11 = 2;
        if (i10 == 1 || i10 == 11 || i10 == 2 || i10 == 0 || i10 == 12 || i10 == 4 || i10 == 10 || i10 == 9 || i10 == 14) {
            if (i10 != 0) {
                if (i10 != 4) {
                    if (i10 != 12) {
                        i11 = 0;
                    }
                }
                x21 x21Var = new x21(this, getContext(), i11, i31Var.Z0);
                this.n = x21Var;
                x21Var.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
                x21 x21Var2 = this.n;
                ih.b bVar = this.h;
                x21Var2.setDontOccupyWidth((int) bVar.getPaint().measureText(((Object) bVar.getHint()) + ""));
                final int i12 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.v21
                    public final /* synthetic */ a21 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                a21 a21Var = this.b;
                                a21Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                a21Var.c(num.intValue() > 0);
                                a21Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj;
                                a21 a21Var2 = this.b;
                                i31 i31Var2 = a21Var2.F;
                                if (a21Var2.n.getSelectedCategory() != xv0Var) {
                                    i31Var2.v(xv0Var.a, false, false);
                                    a21Var2.n.I1(xv0Var);
                                    break;
                                } else {
                                    i31Var2.v(null, false, false);
                                    a21Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i13 = 1;
                this.n.setOnCategoryClick(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.v21
                    public final /* synthetic */ a21 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        switch (i13) {
                            case 0:
                                Integer num = (Integer) obj;
                                a21 a21Var = this.b;
                                a21Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                a21Var.c(num.intValue() > 0);
                                a21Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj;
                                a21 a21Var2 = this.b;
                                i31 i31Var2 = a21Var2.F;
                                if (a21Var2.n.getSelectedCategory() != xv0Var) {
                                    i31Var2.v(xv0Var.a, false, false);
                                    a21Var2.n.I1(xv0Var);
                                    break;
                                } else {
                                    i31Var2.v(null, false, false);
                                    a21Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i11 = 1;
            x21 x21Var3 = new x21(this, getContext(), i11, i31Var.Z0);
            this.n = x21Var3;
            x21Var3.setShownButtonsAtStart(i10 != 4 ? 6.5f : 4.5f);
            x21 x21Var22 = this.n;
            ih.b bVar2 = this.h;
            x21Var22.setDontOccupyWidth((int) bVar2.getPaint().measureText(((Object) bVar2.getHint()) + ""));
            final int i122 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.v21
                public final /* synthetic */ a21 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            a21 a21Var = this.b;
                            a21Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            a21Var.c(num.intValue() > 0);
                            a21Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj;
                            a21 a21Var2 = this.b;
                            i31 i31Var2 = a21Var2.F;
                            if (a21Var2.n.getSelectedCategory() != xv0Var) {
                                i31Var2.v(xv0Var.a, false, false);
                                a21Var2.n.I1(xv0Var);
                                break;
                            } else {
                                i31Var2.v(null, false, false);
                                a21Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            final int i132 = 1;
            this.n.setOnCategoryClick(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.v21
                public final /* synthetic */ a21 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i132) {
                        case 0:
                            Integer num = (Integer) obj;
                            a21 a21Var = this.b;
                            a21Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            a21Var.c(num.intValue() > 0);
                            a21Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj;
                            a21 a21Var2 = this.b;
                            i31 i31Var2 = a21Var2.F;
                            if (a21Var2.n.getSelectedCategory() != xv0Var) {
                                i31Var2.v(xv0Var.a, false, false);
                                a21Var2.n.I1(xv0Var);
                                break;
                            } else {
                                i31Var2.v(null, false, false);
                                a21Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
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
        ofFloat.addUpdateListener(new u01(this, 5));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.gr.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z10) {
        x21 x21Var;
        x21 x21Var2;
        org.telegram.ui.Components.im0 im0Var = this.f;
        int i10 = im0Var.k;
        ih.b bVar = this.h;
        if (i10 != 2 || ((bVar.length() == 0 && ((x21Var2 = this.n) == null || x21Var2.getSelectedCategory() == null)) || z10)) {
            ?? r62 = (bVar.length() > 0 || ((x21Var = this.n) != null && x21Var.v3 > 0.5f && (x21Var.q3 || x21Var.getSelectedCategory() != null))) ? 1 : 0;
            im0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? org.telegram.messenger.cd.L0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i31 i31Var = this.G;
        dg0 dg0Var = i31Var.g0;
        a21 a21Var = i31Var.f0;
        j21 j21Var = i31Var.U;
        if (j21Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = dg0Var.getX() + a21Var.getX();
            float y3 = dg0Var.getY() + a21Var.getY();
            org.telegram.ui.web.k0 k0Var = (org.telegram.ui.web.k0) j21Var;
            sg.b0 b0Var = (sg.b0) k0Var.b;
            sg.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) k0Var.c;
            RectF rectF = org.telegram.messenger.i0.P;
            float f7 = 0;
            rectF.set(f7, f7, measuredWidth, measuredHeight);
            mj0Var.getDelegate().r(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - org.telegram.messenger.i0.m : a0Var.getY() + b0Var.c.getY()) + y3, org.telegram.messenger.zs.e4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            if (this.G.U != null) {
                invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.p6 p6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.im0 im0Var = this.f;
            if (im0Var != null) {
                im0Var.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.yf, p6Var));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var));
        if (this.D != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.D;
            if (background == shapeDrawable) {
                if (r12 != this.E) {
                    org.telegram.ui.ActionBar.t6.C1(r12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.E = r12;
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), r12);
        this.D = d02;
        frameLayout.setBackground(d02);
        this.E = r12;
    }
}
