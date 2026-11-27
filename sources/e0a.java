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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e0a extends FrameLayout implements snb {
    public ShapeDrawable E;
    public int F;
    public final /* synthetic */ n1a G;
    public final /* synthetic */ n1a H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final gj3 d;
    public final View e;
    public final dw9 f;
    public final qy h;
    public b1a n;
    public float r;
    public ValueAnimator s;
    public ux9 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(n1a n1aVar, Context context, boolean z) {
        super(context);
        vnb vnbVar = n1aVar.a1;
        this.H = n1aVar;
        this.G = n1aVar;
        final byte b = 0;
        this.x = false;
        final byte b2 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z) {
            yob.h(aob.G8, vnbVar, this);
        }
        int L = hl.L(18.0f);
        int i = aob.zf;
        Drawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        frameLayout.setBackground(b0);
        yob.j(frameLayout, b0, M, null, vnbVar);
        frameLayout.setClipToOutline(true);
        float L2 = hl.L(18.0f);
        yi yiVar = yhc.a;
        frameLayout.setOutlineProvider(new whc(0, L2));
        addView(frameLayout, tre.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        dw9 dw9Var = new dw9();
        this.f = dw9Var;
        dw9Var.c(0, false, false);
        int i2 = aob.Bf;
        dw9Var.a(aob.v0(i2, vnbVar));
        imageView.setImageDrawable(dw9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: y0a
            public final /* synthetic */ e0a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                e0a e0aVar = this.b;
                switch (b3) {
                    case 0:
                        qy qyVar = e0aVar.h;
                        if (e0aVar.f.k == 1) {
                            qyVar.setText("");
                            e0aVar.G.v(null, true, false);
                            b1a b1aVar = e0aVar.n;
                            if (b1aVar != null) {
                                b1aVar.J1(null);
                                e0aVar.n.K1(true, true);
                                e0aVar.n.H1();
                            }
                            qyVar.clearAnimation();
                            qyVar.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            e0aVar.b(false);
                            break;
                        }
                        break;
                    case 1:
                        n1a n1aVar2 = e0aVar.G;
                        if (!n1aVar2.t()) {
                            n1aVar2.p();
                            e0aVar.h.requestFocus();
                            n1aVar2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        qy qyVar2 = e0aVar.h;
                        qyVar2.setText("");
                        e0aVar.G.v(null, true, false);
                        b1a b1aVar2 = e0aVar.n;
                        if (b1aVar2 != null) {
                            b1aVar2.J1(null);
                            e0aVar.n.K1(true, true);
                        }
                        qyVar2.clearAnimation();
                        qyVar2.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        e0aVar.b(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, tre.e(36, 36, 51));
        gj3 gj3Var = new gj3(this, context, z);
        this.d = gj3Var;
        frameLayout.addView(gj3Var, tre.d(-1, -1.0f, jn7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
        qy qyVar = new qy(this, context, vnbVar, (byte) 3);
        this.h = qyVar;
        qyVar.addTextChangedListener(new nh6(this, (byte) 10));
        qyVar.setBackground(null);
        qyVar.setPadding(0, 0, hl.L(4.0f), 0);
        qyVar.setTextSize(1, 16.0f);
        qyVar.setHint(ob6.M0(2131745564, null));
        yob.D(qyVar, i2, vnbVar);
        yob.X(qyVar, aob.G6, vnbVar);
        qyVar.setImeOptions(268435459);
        yob.l(qyVar, 30, aob.Di, vnbVar);
        qyVar.setCursorSize(hl.L(20.0f));
        qyVar.setGravity(19);
        qyVar.setCursorWidth(1.5f);
        qyVar.setMaxLines(1);
        qyVar.setSingleLine(true);
        qyVar.setLines(1);
        qyVar.setTranslationY(hl.L(-1.0f));
        gj3Var.addView(qyVar, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z) {
            View view = new View(context);
            this.e = view;
            Drawable e = c00.e(context, R.drawable.gradient_right);
            yob.x(this, e, i, vnbVar, PorterDuff.Mode.MULTIPLY);
            view.setBackground(e);
            view.setAlpha(0.0f);
            gj3Var.addView(view, tre.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: y0a
            public final /* synthetic */ e0a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                e0a e0aVar = this.b;
                switch (b3) {
                    case 0:
                        qy qyVar2 = e0aVar.h;
                        if (e0aVar.f.k == 1) {
                            qyVar2.setText("");
                            e0aVar.G.v(null, true, false);
                            b1a b1aVar = e0aVar.n;
                            if (b1aVar != null) {
                                b1aVar.J1(null);
                                e0aVar.n.K1(true, true);
                                e0aVar.n.H1();
                            }
                            qyVar2.clearAnimation();
                            qyVar2.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            e0aVar.b(false);
                            break;
                        }
                        break;
                    case 1:
                        n1a n1aVar2 = e0aVar.G;
                        if (!n1aVar2.t()) {
                            n1aVar2.p();
                            e0aVar.h.requestFocus();
                            n1aVar2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        qy qyVar22 = e0aVar.h;
                        qyVar22.setText("");
                        e0aVar.G.v(null, true, false);
                        b1a b1aVar2 = e0aVar.n;
                        if (b1aVar2 != null) {
                            b1aVar2.J1(null);
                            e0aVar.n.K1(true, true);
                        }
                        qyVar22.clearAnimation();
                        qyVar22.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        e0aVar.b(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e7(this));
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, hl.L(15.0f));
        uob M2 = yob.M(i3);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M2, vnbVar);
        imageView2.setAlpha(0.0f);
        final byte b3 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: y0a
            public final /* synthetic */ e0a b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                e0a e0aVar = this.b;
                switch (b32) {
                    case 0:
                        qy qyVar2 = e0aVar.h;
                        if (e0aVar.f.k == 1) {
                            qyVar2.setText("");
                            e0aVar.G.v(null, true, false);
                            b1a b1aVar = e0aVar.n;
                            if (b1aVar != null) {
                                b1aVar.J1(null);
                                e0aVar.n.K1(true, true);
                                e0aVar.n.H1();
                            }
                            qyVar2.clearAnimation();
                            qyVar2.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            e0aVar.b(false);
                            break;
                        }
                        break;
                    case 1:
                        n1a n1aVar2 = e0aVar.G;
                        if (!n1aVar2.t()) {
                            n1aVar2.p();
                            e0aVar.h.requestFocus();
                            n1aVar2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        qy qyVar22 = e0aVar.h;
                        qyVar22.setText("");
                        e0aVar.G.v(null, true, false);
                        b1a b1aVar2 = e0aVar.n;
                        if (b1aVar2 != null) {
                            b1aVar2.J1(null);
                            e0aVar.n.K1(true, true);
                        }
                        qyVar22.clearAnimation();
                        qyVar22.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        e0aVar.b(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, tre.e(36, 36, 53));
        if (ri5.d) {
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
        n1a n1aVar = this.G;
        int i = n1aVar.a0;
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
                b1a b1aVar = new b1a(this, getContext(), i2, n1aVar.a1);
                this.n = b1aVar;
                b1aVar.setShownButtonsAtStart(i != 4 ? 6.5f : 4.5f);
                b1a b1aVar2 = this.n;
                qy qyVar = this.h;
                b1aVar2.setDontOccupyWidth((int) qyVar.getPaint().measureText(((Object) qyVar.getHint()) + ""));
                this.n.setOnScrollIntoOccupiedWidth(new pcc(this) { // from class: z0a
                    public final /* synthetic */ e0a b;

                    {
                        this.b = this;
                    }

                    @Override // pcc
                    public final void a(Object obj) {
                        byte b3 = b2;
                        e0a e0aVar = this.b;
                        switch (b3) {
                            case 0:
                                Integer num = (Integer) obj;
                                e0aVar.h.setTranslationX(-Math.max(0, num.intValue()));
                                e0aVar.b(num.intValue() > 0);
                                e0aVar.d(false);
                                break;
                            default:
                                q2b q2bVar = (q2b) obj;
                                q2b selectedCategory = e0aVar.n.getSelectedCategory();
                                n1a n1aVar2 = e0aVar.G;
                                if (selectedCategory != q2bVar) {
                                    n1aVar2.v(q2bVar.a, false, false);
                                    e0aVar.n.J1(q2bVar);
                                    break;
                                } else {
                                    n1aVar2.v(null, false, false);
                                    e0aVar.n.J1(null);
                                    break;
                                }
                        }
                    }
                });
                this.n.setOnCategoryClick(new pcc(this) { // from class: z0a
                    public final /* synthetic */ e0a b;

                    {
                        this.b = this;
                    }

                    @Override // pcc
                    public final void a(Object obj) {
                        byte b3 = b;
                        e0a e0aVar = this.b;
                        switch (b3) {
                            case 0:
                                Integer num = (Integer) obj;
                                e0aVar.h.setTranslationX(-Math.max(0, num.intValue()));
                                e0aVar.b(num.intValue() > 0);
                                e0aVar.d(false);
                                break;
                            default:
                                q2b q2bVar = (q2b) obj;
                                q2b selectedCategory = e0aVar.n.getSelectedCategory();
                                n1a n1aVar2 = e0aVar.G;
                                if (selectedCategory != q2bVar) {
                                    n1aVar2.v(q2bVar.a, false, false);
                                    e0aVar.n.J1(q2bVar);
                                    break;
                                } else {
                                    n1aVar2.v(null, false, false);
                                    e0aVar.n.J1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, tre.d(-1, -1.0f, jn7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i2 = 1;
            b1a b1aVar3 = new b1a(this, getContext(), i2, n1aVar.a1);
            this.n = b1aVar3;
            b1aVar3.setShownButtonsAtStart(i != 4 ? 6.5f : 4.5f);
            b1a b1aVar22 = this.n;
            qy qyVar2 = this.h;
            b1aVar22.setDontOccupyWidth((int) qyVar2.getPaint().measureText(((Object) qyVar2.getHint()) + ""));
            this.n.setOnScrollIntoOccupiedWidth(new pcc(this) { // from class: z0a
                public final /* synthetic */ e0a b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b2;
                    e0a e0aVar = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            e0aVar.h.setTranslationX(-Math.max(0, num.intValue()));
                            e0aVar.b(num.intValue() > 0);
                            e0aVar.d(false);
                            break;
                        default:
                            q2b q2bVar = (q2b) obj;
                            q2b selectedCategory = e0aVar.n.getSelectedCategory();
                            n1a n1aVar2 = e0aVar.G;
                            if (selectedCategory != q2bVar) {
                                n1aVar2.v(q2bVar.a, false, false);
                                e0aVar.n.J1(q2bVar);
                                break;
                            } else {
                                n1aVar2.v(null, false, false);
                                e0aVar.n.J1(null);
                                break;
                            }
                    }
                }
            });
            this.n.setOnCategoryClick(new pcc(this) { // from class: z0a
                public final /* synthetic */ e0a b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b;
                    e0a e0aVar = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            e0aVar.h.setTranslationX(-Math.max(0, num.intValue()));
                            e0aVar.b(num.intValue() > 0);
                            e0aVar.d(false);
                            break;
                        default:
                            q2b q2bVar = (q2b) obj;
                            q2b selectedCategory = e0aVar.n.getSelectedCategory();
                            n1a n1aVar2 = e0aVar.G;
                            if (selectedCategory != q2bVar) {
                                n1aVar2.v(q2bVar.a, false, false);
                                e0aVar.n.J1(q2bVar);
                                break;
                            } else {
                                n1aVar2.v(null, false, false);
                                e0aVar.n.J1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, tre.d(-1, -1.0f, jn7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.E8));
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
        ofFloat.addUpdateListener(new b49(this, (byte) 19));
        this.s.setDuration(120L);
        this.s.setInterpolator(k43.h);
        this.s.start();
    }

    public final void c(boolean z) {
        ux9 ux9Var = this.w;
        if (!z) {
            if (ux9Var != null) {
                hl.r(ux9Var);
                this.w = null;
            }
            hl.P3(this.c, false, true);
            return;
        }
        if (ux9Var == null) {
            ux9 ux9Var2 = new ux9(this, (byte) 6);
            this.w = ux9Var2;
            hl.d3(ux9Var2, 340L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z) {
        b1a b1aVar;
        b1a b1aVar2;
        dw9 dw9Var = this.f;
        byte b = dw9Var.k;
        qy qyVar = this.h;
        if (b != 2 || ((qyVar.length() == 0 && ((b1aVar2 = this.n) == null || b1aVar2.getSelectedCategory() == null)) || z)) {
            ?? r6 = (qyVar.length() > 0 || ((b1aVar = this.n) != null && b1aVar.w3 > 0.5f && (b1aVar.r3 || b1aVar.getSelectedCategory() != null))) ? 1 : 0;
            dw9Var.b(r6);
            ImageView imageView = this.b;
            imageView.setClickable(r6);
            imageView.setContentDescription(r6 != 0 ? ob6.M0(2131754874, null) : null);
            imageView.setImportantForAccessibility(r6 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n1a n1aVar = this.H;
        ir8 ir8Var = n1aVar.h0;
        e0a e0aVar = n1aVar.g0;
        n0a n0aVar = n1aVar.V;
        if (n0aVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x = ir8Var.getX() + e0aVar.getX();
            float y = ir8Var.getY() + e0aVar.getY();
            q72 q72Var = (q72) n0aVar;
            e53 e53Var = (e53) q72Var.b;
            d53 d53Var = e53Var.a;
            i49 i49Var = (i49) q72Var.c;
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            i49Var.getDelegate().m(canvas, rectF, 0.0f, d53Var.getX() + x, (e53Var.y == 1 ? d53Var.getY() - hl.m : d53Var.getY() + e53Var.c.getY()) + y, jn7.d4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), TLObject.FLAG_30));
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

    @Override // snb
    public final void updateColors() {
        FrameLayout frameLayout;
        vnb vnbVar = this.G.a1;
        try {
            dw9 dw9Var = this.f;
            if (dw9Var != null) {
                dw9Var.a(aob.v0(aob.Bf, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int p1 = aob.p1(0.06f, aob.v0(aob.E8, vnbVar));
        if (this.E != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.E;
            if (background == shapeDrawable) {
                if (p1 != this.F) {
                    aob.A1(p1, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.F = p1;
            }
        }
        ShapeDrawable b0 = aob.b0(hl.L(18.0f), p1);
        this.E = b0;
        frameLayout.setBackground(b0);
        this.F = p1;
    }
}
