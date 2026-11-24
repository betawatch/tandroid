// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ny9 extends FrameLayout implements vlb {
    public ShapeDrawable E;
    public int F;
    public final /* synthetic */ vz9 G;
    public final /* synthetic */ vz9 H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final yj3 d;
    public final View e;
    public final mu9 f;
    public final pz h;
    public kz9 n;
    public float r;
    public ValueAnimator s;
    public kf9 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny9(vz9 vz9Var, Context context, boolean z) {
        super(context);
        ylb ylbVar = vz9Var.a1;
        this.H = vz9Var;
        this.G = vz9Var;
        final byte b = 0;
        this.x = false;
        final byte b2 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z) {
            anb.h(cmb.F8, ylbVar, this);
        }
        int L = gm.L(18.0f);
        int i = cmb.yf;
        Drawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        frameLayout.setBackground(b0);
        anb.j(frameLayout, b0, M, null, ylbVar);
        frameLayout.setClipToOutline(true);
        float L2 = gm.L(18.0f);
        xj xjVar = agc.a;
        frameLayout.setOutlineProvider(new yfc(0, L2));
        addView(frameLayout, qoe.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        mu9 mu9Var = new mu9();
        this.f = mu9Var;
        mu9Var.c(0, false, false);
        int i2 = cmb.Af;
        mu9Var.a(cmb.v0(i2, ylbVar));
        imageView.setImageDrawable(mu9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: hz9
            public final /* synthetic */ ny9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                ny9 ny9Var = this.b;
                switch (b3) {
                    case 0:
                        pz pzVar = ny9Var.h;
                        if (ny9Var.f.k == 1) {
                            pzVar.setText("");
                            ny9Var.G.v(null, true, false);
                            kz9 kz9Var = ny9Var.n;
                            if (kz9Var != null) {
                                kz9Var.I1(null);
                                ny9Var.n.J1(true, true);
                                ny9Var.n.G1();
                            }
                            pzVar.clearAnimation();
                            pzVar.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            ny9Var.b(false);
                            break;
                        }
                        break;
                    case 1:
                        vz9 vz9Var2 = ny9Var.G;
                        if (!vz9Var2.t()) {
                            vz9Var2.p();
                            ny9Var.h.requestFocus();
                            vz9Var2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        pz pzVar2 = ny9Var.h;
                        pzVar2.setText("");
                        ny9Var.G.v(null, true, false);
                        kz9 kz9Var2 = ny9Var.n;
                        if (kz9Var2 != null) {
                            kz9Var2.I1(null);
                            ny9Var.n.J1(true, true);
                        }
                        pzVar2.clearAnimation();
                        pzVar2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        ny9Var.b(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, qoe.e(36, 36, 51));
        yj3 yj3Var = new yj3(this, context, z);
        this.d = yj3Var;
        frameLayout.addView(yj3Var, qoe.d(-1, -1.0f, nm7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
        pz pzVar = new pz(this, context, ylbVar, (byte) 3);
        this.h = pzVar;
        pzVar.addTextChangedListener(new og6(this, (byte) 10));
        pzVar.setBackground(null);
        pzVar.setPadding(0, 0, gm.L(4.0f), 0);
        pzVar.setTextSize(1, 16.0f);
        pzVar.setHint(jb6.M0(2131745570, null));
        anb.D(pzVar, i2, ylbVar);
        anb.X(pzVar, cmb.F6, ylbVar);
        pzVar.setImeOptions(268435459);
        anb.l(pzVar, 30, cmb.Ci, ylbVar);
        pzVar.setCursorSize(gm.L(20.0f));
        pzVar.setGravity(19);
        pzVar.setCursorWidth(1.5f);
        pzVar.setMaxLines(1);
        pzVar.setSingleLine(true);
        pzVar.setLines(1);
        pzVar.setTranslationY(gm.L(-1.0f));
        yj3Var.addView(pzVar, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z) {
            View view = new View(context);
            this.e = view;
            Drawable d = b10.d(context, R.drawable.gradient_right);
            anb.x(this, d, i, ylbVar, PorterDuff.Mode.MULTIPLY);
            view.setBackground(d);
            view.setAlpha(0.0f);
            yj3Var.addView(view, qoe.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: hz9
            public final /* synthetic */ ny9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                ny9 ny9Var = this.b;
                switch (b3) {
                    case 0:
                        pz pzVar2 = ny9Var.h;
                        if (ny9Var.f.k == 1) {
                            pzVar2.setText("");
                            ny9Var.G.v(null, true, false);
                            kz9 kz9Var = ny9Var.n;
                            if (kz9Var != null) {
                                kz9Var.I1(null);
                                ny9Var.n.J1(true, true);
                                ny9Var.n.G1();
                            }
                            pzVar2.clearAnimation();
                            pzVar2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            ny9Var.b(false);
                            break;
                        }
                        break;
                    case 1:
                        vz9 vz9Var2 = ny9Var.G;
                        if (!vz9Var2.t()) {
                            vz9Var2.p();
                            ny9Var.h.requestFocus();
                            vz9Var2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        pz pzVar22 = ny9Var.h;
                        pzVar22.setText("");
                        ny9Var.G.v(null, true, false);
                        kz9 kz9Var2 = ny9Var.n;
                        if (kz9Var2 != null) {
                            kz9Var2.I1(null);
                            ny9Var.n.J1(true, true);
                        }
                        pzVar22.clearAnimation();
                        pzVar22.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        ny9Var.b(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(this));
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, gm.L(15.0f));
        wmb M2 = anb.M(i3);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M2, ylbVar);
        imageView2.setAlpha(0.0f);
        final byte b3 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: hz9
            public final /* synthetic */ ny9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                ny9 ny9Var = this.b;
                switch (b32) {
                    case 0:
                        pz pzVar2 = ny9Var.h;
                        if (ny9Var.f.k == 1) {
                            pzVar2.setText("");
                            ny9Var.G.v(null, true, false);
                            kz9 kz9Var = ny9Var.n;
                            if (kz9Var != null) {
                                kz9Var.I1(null);
                                ny9Var.n.J1(true, true);
                                ny9Var.n.G1();
                            }
                            pzVar2.clearAnimation();
                            pzVar2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            ny9Var.b(false);
                            break;
                        }
                        break;
                    case 1:
                        vz9 vz9Var2 = ny9Var.G;
                        if (!vz9Var2.t()) {
                            vz9Var2.p();
                            ny9Var.h.requestFocus();
                            vz9Var2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        pz pzVar22 = ny9Var.h;
                        pzVar22.setText("");
                        ny9Var.G.v(null, true, false);
                        kz9 kz9Var2 = ny9Var.n;
                        if (kz9Var2 != null) {
                            kz9Var2.I1(null);
                            ny9Var.n.J1(true, true);
                        }
                        pzVar22.clearAnimation();
                        pzVar22.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        ny9Var.b(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, qoe.e(36, 36, 53));
        if (oi5.d) {
            return;
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        vz9 vz9Var = this.G;
        int i = vz9Var.a0;
        if (this.n != null || getContext() == null) {
            return;
        }
        int i2 = 2;
        final byte b = 1;
        if (i == 1 || i == 11 || i == 2 || i == 0 || i == 12 || i == 4 || i == 10 || i == 9 || i == 14) {
            final byte b2 = 0;
            if (i != 0) {
                if (i != 4) {
                    if (i != 12) {
                        i2 = 0;
                    }
                }
                kz9 kz9Var = new kz9(this, getContext(), i2, vz9Var.a1);
                this.n = kz9Var;
                kz9Var.setShownButtonsAtStart(i != 4 ? 6.5f : 4.5f);
                kz9 kz9Var2 = this.n;
                pz pzVar = this.h;
                kz9Var2.setDontOccupyWidth((int) pzVar.getPaint().measureText(((Object) pzVar.getHint()) + ""));
                this.n.setOnScrollIntoOccupiedWidth(new qac(this) { // from class: iz9
                    public final /* synthetic */ ny9 b;

                    {
                        this.b = this;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b3 = b2;
                        ny9 ny9Var = this.b;
                        switch (b3) {
                            case 0:
                                Integer num = (Integer) obj;
                                ny9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                ny9Var.b(num.intValue() > 0);
                                ny9Var.d(false);
                                break;
                            default:
                                r0b r0bVar = (r0b) obj;
                                r0b selectedCategory = ny9Var.n.getSelectedCategory();
                                vz9 vz9Var2 = ny9Var.G;
                                if (selectedCategory != r0bVar) {
                                    vz9Var2.v(r0bVar.a, false, false);
                                    ny9Var.n.I1(r0bVar);
                                    break;
                                } else {
                                    vz9Var2.v(null, false, false);
                                    ny9Var.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.n.setOnCategoryClick(new qac(this) { // from class: iz9
                    public final /* synthetic */ ny9 b;

                    {
                        this.b = this;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b3 = b;
                        ny9 ny9Var = this.b;
                        switch (b3) {
                            case 0:
                                Integer num = (Integer) obj;
                                ny9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                ny9Var.b(num.intValue() > 0);
                                ny9Var.d(false);
                                break;
                            default:
                                r0b r0bVar = (r0b) obj;
                                r0b selectedCategory = ny9Var.n.getSelectedCategory();
                                vz9 vz9Var2 = ny9Var.G;
                                if (selectedCategory != r0bVar) {
                                    vz9Var2.v(r0bVar.a, false, false);
                                    ny9Var.n.I1(r0bVar);
                                    break;
                                } else {
                                    vz9Var2.v(null, false, false);
                                    ny9Var.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, qoe.d(-1, -1.0f, nm7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i2 = 1;
            kz9 kz9Var3 = new kz9(this, getContext(), i2, vz9Var.a1);
            this.n = kz9Var3;
            kz9Var3.setShownButtonsAtStart(i != 4 ? 6.5f : 4.5f);
            kz9 kz9Var22 = this.n;
            pz pzVar2 = this.h;
            kz9Var22.setDontOccupyWidth((int) pzVar2.getPaint().measureText(((Object) pzVar2.getHint()) + ""));
            this.n.setOnScrollIntoOccupiedWidth(new qac(this) { // from class: iz9
                public final /* synthetic */ ny9 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b3 = b2;
                    ny9 ny9Var = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            ny9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            ny9Var.b(num.intValue() > 0);
                            ny9Var.d(false);
                            break;
                        default:
                            r0b r0bVar = (r0b) obj;
                            r0b selectedCategory = ny9Var.n.getSelectedCategory();
                            vz9 vz9Var2 = ny9Var.G;
                            if (selectedCategory != r0bVar) {
                                vz9Var2.v(r0bVar.a, false, false);
                                ny9Var.n.I1(r0bVar);
                                break;
                            } else {
                                vz9Var2.v(null, false, false);
                                ny9Var.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.n.setOnCategoryClick(new qac(this) { // from class: iz9
                public final /* synthetic */ ny9 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b3 = b;
                    ny9 ny9Var = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            ny9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            ny9Var.b(num.intValue() > 0);
                            ny9Var.d(false);
                            break;
                        default:
                            r0b r0bVar = (r0b) obj;
                            r0b selectedCategory = ny9Var.n.getSelectedCategory();
                            vz9 vz9Var2 = ny9Var.G;
                            if (selectedCategory != r0bVar) {
                                vz9Var2.v(r0bVar.a, false, false);
                                ny9Var.n.I1(r0bVar);
                                break;
                            } else {
                                vz9Var2.v(null, false, false);
                                ny9Var.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, qoe.d(-1, -1.0f, nm7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.D8));
    }

    public final void b(boolean z) {
        if (z == this.x) {
            return;
        }
        this.x = z;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new p29(this, (byte) 19));
        this.s.setDuration(120L);
        this.s.setInterpolator(d53.h);
        this.s.start();
    }

    public final void c(boolean z) {
        kf9 kf9Var = this.w;
        if (!z) {
            if (kf9Var != null) {
                gm.r(kf9Var);
                this.w = null;
            }
            gm.P3(this.c, false, true);
            return;
        }
        if (kf9Var == null) {
            kf9 kf9Var2 = new kf9(this, (byte) 28);
            this.w = kf9Var2;
            gm.d3(kf9Var2, 340L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z) {
        kz9 kz9Var;
        kz9 kz9Var2;
        mu9 mu9Var = this.f;
        byte b = mu9Var.k;
        pz pzVar = this.h;
        if (b != 2 || ((pzVar.length() == 0 && ((kz9Var2 = this.n) == null || kz9Var2.getSelectedCategory() == null)) || z)) {
            ?? r6 = (pzVar.length() > 0 || ((kz9Var = this.n) != null && kz9Var.w3 > 0.5f && (kz9Var.r3 || kz9Var.getSelectedCategory() != null))) ? 1 : 0;
            mu9Var.b(r6);
            ImageView imageView = this.b;
            imageView.setClickable(r6);
            imageView.setContentDescription(r6 != 0 ? jb6.M0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r6 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vz9 vz9Var = this.H;
        ct8 ct8Var = vz9Var.h0;
        ny9 ny9Var = vz9Var.g0;
        wy9 wy9Var = vz9Var.V;
        if (wy9Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x = ct8Var.getX() + ny9Var.getX();
            float y = ct8Var.getY() + ny9Var.getY();
            x92 x92Var = (x92) wy9Var;
            x53 x53Var = (x53) x92Var.b;
            w53 w53Var = x53Var.a;
            v29 v29Var = (v29) x92Var.c;
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            v29Var.getDelegate().m(canvas, rectF, 0.0f, w53Var.getX() + x, (x53Var.y == 1 ? w53Var.getY() - gm.m : w53Var.getY() + x53Var.c.getY()) + y, nm7.d4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            if (this.H.V != null) {
                invalidate();
            }
        }
    }

    @Override // vlb
    public final void updateColors() {
        FrameLayout frameLayout;
        ylb ylbVar = this.G.a1;
        try {
            mu9 mu9Var = this.f;
            if (mu9Var != null) {
                mu9Var.a(cmb.v0(cmb.Af, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int p1 = cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar));
        if (this.E != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.E;
            if (background == shapeDrawable) {
                if (p1 != this.F) {
                    cmb.A1(p1, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.F = p1;
            }
        }
        ShapeDrawable b0 = cmb.b0(gm.L(18.0f), p1);
        this.E = b0;
        frameLayout.setBackground(b0);
        this.F = p1;
    }
}
