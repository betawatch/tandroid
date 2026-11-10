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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l01 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ShapeDrawable D;
    public int E;
    public final /* synthetic */ t11 F;
    public final /* synthetic */ t11 G;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final fi.r3 d;
    public final View e;
    public final org.telegram.ui.Components.fl0 f;
    public final org.telegram.ui.Cells.z5 h;
    public i11 n;
    public float r;
    public ValueAnimator s;
    public uu0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(t11 t11Var, Context context, boolean z9) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var = t11Var.Z0;
        this.G = t11Var;
        this.F = t11Var;
        final int i7 = 0;
        this.x = false;
        final int i10 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z9) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, this, h6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i11 = org.telegram.ui.ActionBar.m6.wf;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setClipToOutline(true);
        float L2 = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L2));
        addView(frameLayout, c8.ha.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        org.telegram.ui.Components.fl0 fl0Var = new org.telegram.ui.Components.fl0();
        this.f = fl0Var;
        fl0Var.c(0, false, false);
        int i12 = org.telegram.ui.ActionBar.m6.yf;
        fl0Var.a(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f11
            public final /* synthetic */ l01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        l01 l01Var = this.b;
                        org.telegram.ui.Cells.z5 z5Var = l01Var.h;
                        if (l01Var.f.k == 1) {
                            z5Var.setText("");
                            l01Var.F.v(null, true, false);
                            i11 i11Var = l01Var.n;
                            if (i11Var != null) {
                                i11Var.I1(null);
                                l01Var.n.J1(true, true);
                                l01Var.n.G1();
                            }
                            z5Var.clearAnimation();
                            z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                            l01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        l01 l01Var2 = this.b;
                        t11 t11Var2 = l01Var2.F;
                        if (!t11Var2.u()) {
                            t11Var2.q();
                            l01Var2.h.requestFocus();
                            t11.a(t11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        l01 l01Var3 = this.b;
                        org.telegram.ui.Cells.z5 z5Var2 = l01Var3.h;
                        z5Var2.setText("");
                        l01Var3.F.v(null, true, false);
                        i11 i11Var2 = l01Var3.n;
                        if (i11Var2 != null) {
                            i11Var2.I1(null);
                            l01Var3.n.J1(true, true);
                        }
                        z5Var2.clearAnimation();
                        z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        l01Var3.c(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        final int i13 = 2;
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        fi.r3 r3Var = new fi.r3(this, context, z9);
        this.d = r3Var;
        frameLayout.addView(r3Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(this, context, h6Var, i10);
        this.h = z5Var;
        z5Var.addTextChangedListener(new m0(this, 15));
        z5Var.setBackground(null);
        z5Var.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setHint(org.telegram.messenger.id.M0(2131745836, null));
        org.telegram.ui.ActionBar.t6.D(z5Var, i12, h6Var);
        org.telegram.ui.ActionBar.t6.U(z5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        z5Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.t6.l(z5Var, 30, org.telegram.ui.ActionBar.m6.Ai, h6Var);
        z5Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        z5Var.setGravity(19);
        z5Var.setCursorWidth(1.5f);
        z5Var.setMaxLines(1);
        z5Var.setSingleLine(true);
        z5Var.setLines(1);
        z5Var.setTranslationY(org.telegram.messenger.g0.L(-1.0f));
        r3Var.addView(z5Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z9) {
            View view = new View(context);
            this.e = view;
            Drawable h = jg.g.h(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.t6.x(this, h, i11, h6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(h);
            view.setAlpha(0.0f);
            r3Var.addView(view, c8.ha.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f11
            public final /* synthetic */ l01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        l01 l01Var = this.b;
                        org.telegram.ui.Cells.z5 z5Var2 = l01Var.h;
                        if (l01Var.f.k == 1) {
                            z5Var2.setText("");
                            l01Var.F.v(null, true, false);
                            i11 i11Var = l01Var.n;
                            if (i11Var != null) {
                                i11Var.I1(null);
                                l01Var.n.J1(true, true);
                                l01Var.n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                            l01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        l01 l01Var2 = this.b;
                        t11 t11Var2 = l01Var2.F;
                        if (!t11Var2.u()) {
                            t11Var2.q();
                            l01Var2.h.requestFocus();
                            t11.a(t11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        l01 l01Var3 = this.b;
                        org.telegram.ui.Cells.z5 z5Var22 = l01Var3.h;
                        z5Var22.setText("");
                        l01Var3.F.v(null, true, false);
                        i11 i11Var2 = l01Var3.n;
                        if (i11Var2 != null) {
                            i11Var2.I1(null);
                            l01Var3.n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        l01Var3.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f11
            public final /* synthetic */ l01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        l01 l01Var = this.b;
                        org.telegram.ui.Cells.z5 z5Var2 = l01Var.h;
                        if (l01Var.f.k == 1) {
                            z5Var2.setText("");
                            l01Var.F.v(null, true, false);
                            i11 i11Var = l01Var.n;
                            if (i11Var != null) {
                                i11Var.I1(null);
                                l01Var.n.J1(true, true);
                                l01Var.n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                            l01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        l01 l01Var2 = this.b;
                        t11 t11Var2 = l01Var2.F;
                        if (!t11Var2.u()) {
                            t11Var2.q();
                            l01Var2.h.requestFocus();
                            t11.a(t11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        l01 l01Var3 = this.b;
                        org.telegram.ui.Cells.z5 z5Var22 = l01Var3.h;
                        z5Var22.setText("");
                        l01Var3.F.v(null, true, false);
                        i11 i11Var2 = l01Var3.n;
                        if (i11Var2 != null) {
                            i11Var2.I1(null);
                            l01Var3.n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        l01Var3.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (ch.e0.d) {
            return;
        }
        b();
    }

    public static void a(l01 l01Var, boolean z9) {
        if (z9) {
            if (l01Var.w == null) {
                uu0 uu0Var = new uu0(l01Var, 16);
                l01Var.w = uu0Var;
                org.telegram.messenger.g0.i3(uu0Var, 340L);
                return;
            }
            return;
        }
        uu0 uu0Var2 = l01Var.w;
        if (uu0Var2 != null) {
            org.telegram.messenger.g0.r(uu0Var2);
            l01Var.w = null;
        }
        org.telegram.messenger.g0.V3(l01Var.c, false, true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        t11 t11Var = this.F;
        int i7 = t11Var.W;
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
                i11 i11Var = new i11(this, getContext(), i10, t11Var.Z0);
                this.n = i11Var;
                i11Var.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
                i11 i11Var2 = this.n;
                org.telegram.ui.Cells.z5 z5Var = this.h;
                i11Var2.setDontOccupyWidth((int) z5Var.getPaint().measureText(((Object) z5Var.getHint()) + ""));
                final int i11 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.g11
                    public final /* synthetic */ l01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        switch (i11) {
                            case 0:
                                Integer num = (Integer) obj;
                                l01 l01Var = this.b;
                                l01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                l01Var.c(num.intValue() > 0);
                                l01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.vu0 vu0Var = (org.telegram.ui.Components.vu0) obj;
                                l01 l01Var2 = this.b;
                                t11 t11Var2 = l01Var2.F;
                                if (l01Var2.n.getSelectedCategory() != vu0Var) {
                                    t11Var2.v(vu0Var.a, false, false);
                                    l01Var2.n.I1(vu0Var);
                                    break;
                                } else {
                                    t11Var2.v(null, false, false);
                                    l01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i12 = 1;
                this.n.setOnCategoryClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.g11
                    public final /* synthetic */ l01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                l01 l01Var = this.b;
                                l01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                l01Var.c(num.intValue() > 0);
                                l01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.vu0 vu0Var = (org.telegram.ui.Components.vu0) obj;
                                l01 l01Var2 = this.b;
                                t11 t11Var2 = l01Var2.F;
                                if (l01Var2.n.getSelectedCategory() != vu0Var) {
                                    t11Var2.v(vu0Var.a, false, false);
                                    l01Var2.n.I1(vu0Var);
                                    break;
                                } else {
                                    t11Var2.v(null, false, false);
                                    l01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i10 = 1;
            i11 i11Var3 = new i11(this, getContext(), i10, t11Var.Z0);
            this.n = i11Var3;
            i11Var3.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
            i11 i11Var22 = this.n;
            org.telegram.ui.Cells.z5 z5Var2 = this.h;
            i11Var22.setDontOccupyWidth((int) z5Var2.getPaint().measureText(((Object) z5Var2.getHint()) + ""));
            final int i112 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.g11
                public final /* synthetic */ l01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i112) {
                        case 0:
                            Integer num = (Integer) obj;
                            l01 l01Var = this.b;
                            l01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            l01Var.c(num.intValue() > 0);
                            l01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.vu0 vu0Var = (org.telegram.ui.Components.vu0) obj;
                            l01 l01Var2 = this.b;
                            t11 t11Var2 = l01Var2.F;
                            if (l01Var2.n.getSelectedCategory() != vu0Var) {
                                t11Var2.v(vu0Var.a, false, false);
                                l01Var2.n.I1(vu0Var);
                                break;
                            } else {
                                t11Var2.v(null, false, false);
                                l01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            final int i122 = 1;
            this.n.setOnCategoryClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.g11
                public final /* synthetic */ l01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            l01 l01Var = this.b;
                            l01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            l01Var.c(num.intValue() > 0);
                            l01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.vu0 vu0Var = (org.telegram.ui.Components.vu0) obj;
                            l01 l01Var2 = this.b;
                            t11 t11Var2 = l01Var2.F;
                            if (l01Var2.n.getSelectedCategory() != vu0Var) {
                                t11Var2.v(vu0Var.a, false, false);
                                l01Var2.n.I1(vu0Var);
                                break;
                            } else {
                                t11Var2.v(null, false, false);
                                l01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void c(boolean z9) {
        if (z9 == this.x) {
            return;
        }
        this.x = z9;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z9 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new kz0(this, 5));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.wq.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z9) {
        i11 i11Var;
        i11 i11Var2;
        org.telegram.ui.Components.fl0 fl0Var = this.f;
        int i7 = fl0Var.k;
        org.telegram.ui.Cells.z5 z5Var = this.h;
        if (i7 != 2 || ((z5Var.length() == 0 && ((i11Var2 = this.n) == null || i11Var2.getSelectedCategory() == null)) || z9)) {
            ?? r62 = (z5Var.length() > 0 || ((i11Var = this.n) != null && i11Var.v3 > 0.5f && (i11Var.q3 || i11Var.getSelectedCategory() != null))) ? 1 : 0;
            fl0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? org.telegram.messenger.id.M0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        t11 t11Var = this.G;
        vq0 vq0Var = t11Var.g0;
        l01 l01Var = t11Var.f0;
        u01 u01Var = t11Var.U;
        if (u01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = vq0Var.getX() + l01Var.getX();
            float y10 = vq0Var.getY() + l01Var.getY();
            ab.g gVar = (ab.g) u01Var;
            ch.b0 b0Var = (ch.b0) gVar.b;
            ch.a0 a0Var = b0Var.a;
            org.telegram.ui.Components.ii0 ii0Var = (org.telegram.ui.Components.ii0) gVar.c;
            RectF rectF = org.telegram.messenger.g0.P;
            float f10 = 0;
            rectF.set(f10, f10, measuredWidth, measuredHeight);
            ii0Var.getDelegate().L(canvas, rectF, 0.0f, a0Var.getX() + x10, (b0Var.y == 1 ? a0Var.getY() - org.telegram.messenger.g0.m : a0Var.getY() + b0Var.c.getY()) + y10, org.telegram.messenger.qs.e4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.e0.b(this)) {
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
            if (this.G.U != null) {
                invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.fl0 fl0Var = this.f;
            if (fl0Var != null) {
                fl0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yf, h6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
        if (this.D != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.D;
            if (background == shapeDrawable) {
                if (r12 != this.E) {
                    org.telegram.ui.ActionBar.m6.C1(r12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.E = r12;
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), r12);
        this.D = d02;
        frameLayout.setBackground(d02);
        this.E = r12;
    }
}
