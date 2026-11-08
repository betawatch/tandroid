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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class i01 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public ShapeDrawable D;
    public int E;
    public final /* synthetic */ q11 F;
    public final /* synthetic */ q11 G;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final fi.r3 d;
    public final View e;
    public final org.telegram.ui.Components.fl0 f;
    public final org.telegram.ui.Cells.z5 h;
    public f11 n;
    public float r;
    public ValueAnimator s;
    public ru0 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(q11 q11Var, Context context, boolean z9) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = q11Var.Z0;
        this.G = q11Var;
        this.F = q11Var;
        final int i7 = 0;
        this.x = false;
        final int i10 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z9) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, this, f6Var);
        }
        int L = org.telegram.messenger.g0.L(18.0f);
        int i11 = org.telegram.ui.ActionBar.k6.wf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, f6Var);
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
        int i12 = org.telegram.ui.ActionBar.k6.yf;
        fl0Var.a(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c11
            public final /* synthetic */ i01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        i01 i01Var = this.b;
                        org.telegram.ui.Cells.z5 z5Var = i01Var.h;
                        if (i01Var.f.k == 1) {
                            z5Var.setText("");
                            i01Var.F.v(null, true, false);
                            f11 f11Var = i01Var.n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.n.J1(true, true);
                                i01Var.n.G1();
                            }
                            z5Var.clearAnimation();
                            z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            i01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i01 i01Var2 = this.b;
                        q11 q11Var2 = i01Var2.F;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i01 i01Var3 = this.b;
                        org.telegram.ui.Cells.z5 z5Var2 = i01Var3.h;
                        z5Var2.setText("");
                        i01Var3.F.v(null, true, false);
                        f11 f11Var2 = i01Var3.n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.n.J1(true, true);
                        }
                        z5Var2.clearAnimation();
                        z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        i01Var3.c(false);
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
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(this, context, f6Var, i10);
        this.h = z5Var;
        z5Var.addTextChangedListener(new m0(this, 15));
        z5Var.setBackground(null);
        z5Var.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
        z5Var.setTextSize(1, 16.0f);
        z5Var.setHint(org.telegram.messenger.id.M0(2131745839, null));
        org.telegram.ui.ActionBar.r6.E(z5Var, i12, f6Var);
        org.telegram.ui.ActionBar.r6.V(z5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        z5Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(z5Var, 30, org.telegram.ui.ActionBar.k6.Ai, f6Var);
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
            org.telegram.ui.ActionBar.r6.y(this, h, i11, f6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(h);
            view.setAlpha(0.0f);
            r3Var.addView(view, c8.ha.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c11
            public final /* synthetic */ i01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        i01 i01Var = this.b;
                        org.telegram.ui.Cells.z5 z5Var2 = i01Var.h;
                        if (i01Var.f.k == 1) {
                            z5Var2.setText("");
                            i01Var.F.v(null, true, false);
                            f11 f11Var = i01Var.n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.n.J1(true, true);
                                i01Var.n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            i01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i01 i01Var2 = this.b;
                        q11 q11Var2 = i01Var2.F;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i01 i01Var3 = this.b;
                        org.telegram.ui.Cells.z5 z5Var22 = i01Var3.h;
                        z5Var22.setText("");
                        i01Var3.F.v(null, true, false);
                        f11 f11Var2 = i01Var3.n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        i01Var3.c(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, f6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c11
            public final /* synthetic */ i01 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        i01 i01Var = this.b;
                        org.telegram.ui.Cells.z5 z5Var2 = i01Var.h;
                        if (i01Var.f.k == 1) {
                            z5Var2.setText("");
                            i01Var.F.v(null, true, false);
                            f11 f11Var = i01Var.n;
                            if (f11Var != null) {
                                f11Var.I1(null);
                                i01Var.n.J1(true, true);
                                i01Var.n.G1();
                            }
                            z5Var2.clearAnimation();
                            z5Var2.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            i01Var.c(false);
                            break;
                        }
                        break;
                    case 1:
                        i01 i01Var2 = this.b;
                        q11 q11Var2 = i01Var2.F;
                        if (!q11Var2.u()) {
                            q11Var2.q();
                            i01Var2.h.requestFocus();
                            q11.a(q11Var2, 0, 0);
                            break;
                        }
                        break;
                    default:
                        i01 i01Var3 = this.b;
                        org.telegram.ui.Cells.z5 z5Var22 = i01Var3.h;
                        z5Var22.setText("");
                        i01Var3.F.v(null, true, false);
                        f11 f11Var2 = i01Var3.n;
                        if (f11Var2 != null) {
                            f11Var2.I1(null);
                            i01Var3.n.J1(true, true);
                        }
                        z5Var22.clearAnimation();
                        z5Var22.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        i01Var3.c(false);
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

    public static void a(i01 i01Var, boolean z9) {
        if (z9) {
            if (i01Var.w == null) {
                ru0 ru0Var = new ru0(i01Var, 16);
                i01Var.w = ru0Var;
                org.telegram.messenger.g0.i3(ru0Var, 340L);
                return;
            }
            return;
        }
        ru0 ru0Var2 = i01Var.w;
        if (ru0Var2 != null) {
            org.telegram.messenger.g0.r(ru0Var2);
            i01Var.w = null;
        }
        org.telegram.messenger.g0.V3(i01Var.c, false, true);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        q11 q11Var = this.F;
        int i7 = q11Var.W;
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
                f11 f11Var = new f11(this, getContext(), i10, q11Var.Z0);
                this.n = f11Var;
                f11Var.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
                f11 f11Var2 = this.n;
                org.telegram.ui.Cells.z5 z5Var = this.h;
                f11Var2.setDontOccupyWidth((int) z5Var.getPaint().measureText(((Object) z5Var.getHint()) + ""));
                final int i11 = 0;
                this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.d11
                    public final /* synthetic */ i01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        switch (i11) {
                            case 0:
                                Integer num = (Integer) obj;
                                i01 i01Var = this.b;
                                i01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                i01Var.c(num.intValue() > 0);
                                i01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.uu0 uu0Var = (org.telegram.ui.Components.uu0) obj;
                                i01 i01Var2 = this.b;
                                q11 q11Var2 = i01Var2.F;
                                if (i01Var2.n.getSelectedCategory() != uu0Var) {
                                    q11Var2.v(uu0Var.a, false, false);
                                    i01Var2.n.I1(uu0Var);
                                    break;
                                } else {
                                    q11Var2.v(null, false, false);
                                    i01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                final int i12 = 1;
                this.n.setOnCategoryClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.d11
                    public final /* synthetic */ i01 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        switch (i12) {
                            case 0:
                                Integer num = (Integer) obj;
                                i01 i01Var = this.b;
                                i01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                i01Var.c(num.intValue() > 0);
                                i01Var.d(false);
                                break;
                            default:
                                org.telegram.ui.Components.uu0 uu0Var = (org.telegram.ui.Components.uu0) obj;
                                i01 i01Var2 = this.b;
                                q11 q11Var2 = i01Var2.F;
                                if (i01Var2.n.getSelectedCategory() != uu0Var) {
                                    q11Var2.v(uu0Var.a, false, false);
                                    i01Var2.n.I1(uu0Var);
                                    break;
                                } else {
                                    q11Var2.v(null, false, false);
                                    i01Var2.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i10 = 1;
            f11 f11Var3 = new f11(this, getContext(), i10, q11Var.Z0);
            this.n = f11Var3;
            f11Var3.setShownButtonsAtStart(i7 != 4 ? 6.5f : 4.5f);
            f11 f11Var22 = this.n;
            org.telegram.ui.Cells.z5 z5Var2 = this.h;
            f11Var22.setDontOccupyWidth((int) z5Var2.getPaint().measureText(((Object) z5Var2.getHint()) + ""));
            final int i112 = 0;
            this.n.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.d11
                public final /* synthetic */ i01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i112) {
                        case 0:
                            Integer num = (Integer) obj;
                            i01 i01Var = this.b;
                            i01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            i01Var.c(num.intValue() > 0);
                            i01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.uu0 uu0Var = (org.telegram.ui.Components.uu0) obj;
                            i01 i01Var2 = this.b;
                            q11 q11Var2 = i01Var2.F;
                            if (i01Var2.n.getSelectedCategory() != uu0Var) {
                                q11Var2.v(uu0Var.a, false, false);
                                i01Var2.n.I1(uu0Var);
                                break;
                            } else {
                                q11Var2.v(null, false, false);
                                i01Var2.n.I1(null);
                                break;
                            }
                    }
                }
            });
            final int i122 = 1;
            this.n.setOnCategoryClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.d11
                public final /* synthetic */ i01 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i122) {
                        case 0:
                            Integer num = (Integer) obj;
                            i01 i01Var = this.b;
                            i01Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            i01Var.c(num.intValue() > 0);
                            i01Var.d(false);
                            break;
                        default:
                            org.telegram.ui.Components.uu0 uu0Var = (org.telegram.ui.Components.uu0) obj;
                            i01 i01Var2 = this.b;
                            q11 q11Var2 = i01Var2.F;
                            if (i01Var2.n.getSelectedCategory() != uu0Var) {
                                q11Var2.v(uu0Var.a, false, false);
                                i01Var2.n.I1(uu0Var);
                                break;
                            } else {
                                q11Var2.v(null, false, false);
                                i01Var2.n.I1(null);
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
        ofFloat.addUpdateListener(new gz0(this, 5));
        this.s.setDuration(120L);
        this.s.setInterpolator(org.telegram.ui.Components.xq.h);
        this.s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z9) {
        f11 f11Var;
        f11 f11Var2;
        org.telegram.ui.Components.fl0 fl0Var = this.f;
        int i7 = fl0Var.k;
        org.telegram.ui.Cells.z5 z5Var = this.h;
        if (i7 != 2 || ((z5Var.length() == 0 && ((f11Var2 = this.n) == null || f11Var2.getSelectedCategory() == null)) || z9)) {
            ?? r62 = (z5Var.length() > 0 || ((f11Var = this.n) != null && f11Var.v3 > 0.5f && (f11Var.q3 || f11Var.getSelectedCategory() != null))) ? 1 : 0;
            fl0Var.b(r62);
            ImageView imageView = this.b;
            imageView.setClickable(r62);
            imageView.setContentDescription(r62 != 0 ? org.telegram.messenger.id.M0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r62 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q11 q11Var = this.G;
        sq0 sq0Var = q11Var.g0;
        i01 i01Var = q11Var.f0;
        r01 r01Var = q11Var.U;
        if (r01Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x10 = sq0Var.getX() + i01Var.getX();
            float y10 = sq0Var.getY() + i01Var.getY();
            ab.g gVar = (ab.g) r01Var;
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.f6 f6Var = this.F.Z0;
        try {
            org.telegram.ui.Components.fl0 fl0Var = this.f;
            if (fl0Var != null) {
                fl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.yf, f6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var));
        if (this.D != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.D;
            if (background == shapeDrawable) {
                if (r12 != this.E) {
                    org.telegram.ui.ActionBar.k6.C1(r12, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.E = r12;
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), r12);
        this.D = d02;
        frameLayout.setBackground(d02);
        this.E = r12;
    }
}
