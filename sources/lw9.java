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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lw9 extends FrameLayout implements tjb {
    public ShapeDrawable E;
    public int F;
    public final /* synthetic */ tx9 G;
    public final /* synthetic */ tx9 H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final oi3 d;
    public final View e;
    public final ks9 f;
    public final py h;
    public ix9 n;
    public float r;
    public ValueAnimator s;
    public zk9 w;
    public boolean x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw9(tx9 tx9Var, Context context, boolean z) {
        super(context);
        wjb wjbVar = tx9Var.a1;
        this.H = tx9Var;
        this.G = tx9Var;
        final byte b = 0;
        this.x = false;
        final byte b2 = 1;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z) {
            zkb.h(bkb.F8, wjbVar, this);
        }
        int L = gl.L(18.0f);
        int i = bkb.yf;
        Drawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        frameLayout.setBackground(b0);
        zkb.j(frameLayout, b0, M, null, wjbVar);
        frameLayout.setClipToOutline(true);
        float L2 = gl.L(18.0f);
        xi xiVar = zdc.a;
        frameLayout.setOutlineProvider(new xdc(0, L2));
        addView(frameLayout, nme.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ks9 ks9Var = new ks9();
        this.f = ks9Var;
        ks9Var.c(0, false, false);
        int i2 = bkb.Af;
        ks9Var.a(bkb.v0(i2, wjbVar));
        imageView.setImageDrawable(ks9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fx9
            public final /* synthetic */ lw9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                lw9 lw9Var = this.b;
                switch (b3) {
                    case 0:
                        py pyVar = lw9Var.h;
                        if (lw9Var.f.k == 1) {
                            pyVar.setText("");
                            lw9Var.G.v(null, true, false);
                            ix9 ix9Var = lw9Var.n;
                            if (ix9Var != null) {
                                ix9Var.I1(null);
                                lw9Var.n.J1(true, true);
                                lw9Var.n.G1();
                            }
                            pyVar.clearAnimation();
                            pyVar.animate().translationX(0.0f).setInterpolator(s33.h).start();
                            lw9Var.b(false);
                            break;
                        }
                        break;
                    case 1:
                        tx9 tx9Var2 = lw9Var.G;
                        if (!tx9Var2.t()) {
                            tx9Var2.p();
                            lw9Var.h.requestFocus();
                            tx9Var2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        py pyVar2 = lw9Var.h;
                        pyVar2.setText("");
                        lw9Var.G.v(null, true, false);
                        ix9 ix9Var2 = lw9Var.n;
                        if (ix9Var2 != null) {
                            ix9Var2.I1(null);
                            lw9Var.n.J1(true, true);
                        }
                        pyVar2.clearAnimation();
                        pyVar2.animate().translationX(0.0f).setInterpolator(s33.h).start();
                        lw9Var.b(false);
                        break;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, nme.e(36, 36, 51));
        oi3 oi3Var = new oi3(this, context, z);
        this.d = oi3Var;
        frameLayout.addView(oi3Var, nme.d(-1, -1.0f, kk7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
        py pyVar = new py(this, context, wjbVar, (byte) 3);
        this.h = pyVar;
        pyVar.addTextChangedListener(new jf6(this, (byte) 9));
        pyVar.setBackground(null);
        pyVar.setPadding(0, 0, gl.L(4.0f), 0);
        pyVar.setTextSize(1, 16.0f);
        pyVar.setHint(k96.M0(2131745644, null));
        zkb.D(pyVar, i2, wjbVar);
        zkb.X(pyVar, bkb.F6, wjbVar);
        pyVar.setImeOptions(268435459);
        zkb.l(pyVar, 30, bkb.Ci, wjbVar);
        pyVar.setCursorSize(gl.L(20.0f));
        pyVar.setGravity(19);
        pyVar.setCursorWidth(1.5f);
        pyVar.setMaxLines(1);
        pyVar.setSingleLine(true);
        pyVar.setLines(1);
        pyVar.setTranslationY(gl.L(-1.0f));
        oi3Var.addView(pyVar, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z) {
            View view = new View(context);
            this.e = view;
            Drawable d = b00.d(context, R.drawable.gradient_right);
            zkb.x(this, d, i, wjbVar, PorterDuff.Mode.MULTIPLY);
            view.setBackground(d);
            view.setAlpha(0.0f);
            oi3Var.addView(view, nme.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) { // from class: fx9
            public final /* synthetic */ lw9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                lw9 lw9Var = this.b;
                switch (b3) {
                    case 0:
                        py pyVar2 = lw9Var.h;
                        if (lw9Var.f.k == 1) {
                            pyVar2.setText("");
                            lw9Var.G.v(null, true, false);
                            ix9 ix9Var = lw9Var.n;
                            if (ix9Var != null) {
                                ix9Var.I1(null);
                                lw9Var.n.J1(true, true);
                                lw9Var.n.G1();
                            }
                            pyVar2.clearAnimation();
                            pyVar2.animate().translationX(0.0f).setInterpolator(s33.h).start();
                            lw9Var.b(false);
                            break;
                        }
                        break;
                    case 1:
                        tx9 tx9Var2 = lw9Var.G;
                        if (!tx9Var2.t()) {
                            tx9Var2.p();
                            lw9Var.h.requestFocus();
                            tx9Var2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        py pyVar22 = lw9Var.h;
                        pyVar22.setText("");
                        lw9Var.G.v(null, true, false);
                        ix9 ix9Var2 = lw9Var.n;
                        if (ix9Var2 != null) {
                            ix9Var2.I1(null);
                            lw9Var.n.J1(true, true);
                        }
                        pyVar22.clearAnimation();
                        pyVar22.animate().translationX(0.0f).setInterpolator(s33.h).start();
                        lw9Var.b(false);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(this));
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, gl.L(15.0f));
        vkb M2 = zkb.M(i3);
        imageView2.setBackground(f0);
        zkb.j(imageView2, f0, null, M2, wjbVar);
        imageView2.setAlpha(0.0f);
        final byte b3 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: fx9
            public final /* synthetic */ lw9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                lw9 lw9Var = this.b;
                switch (b32) {
                    case 0:
                        py pyVar2 = lw9Var.h;
                        if (lw9Var.f.k == 1) {
                            pyVar2.setText("");
                            lw9Var.G.v(null, true, false);
                            ix9 ix9Var = lw9Var.n;
                            if (ix9Var != null) {
                                ix9Var.I1(null);
                                lw9Var.n.J1(true, true);
                                lw9Var.n.G1();
                            }
                            pyVar2.clearAnimation();
                            pyVar2.animate().translationX(0.0f).setInterpolator(s33.h).start();
                            lw9Var.b(false);
                            break;
                        }
                        break;
                    case 1:
                        tx9 tx9Var2 = lw9Var.G;
                        if (!tx9Var2.t()) {
                            tx9Var2.p();
                            lw9Var.h.requestFocus();
                            tx9Var2.u(0, 0);
                            break;
                        }
                        break;
                    default:
                        py pyVar22 = lw9Var.h;
                        pyVar22.setText("");
                        lw9Var.G.v(null, true, false);
                        ix9 ix9Var2 = lw9Var.n;
                        if (ix9Var2 != null) {
                            ix9Var2.I1(null);
                            lw9Var.n.J1(true, true);
                        }
                        pyVar22.clearAnimation();
                        pyVar22.animate().translationX(0.0f).setInterpolator(s33.h).start();
                        lw9Var.b(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, nme.e(36, 36, 53));
        if (pg5.d) {
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
        tx9 tx9Var = this.G;
        int i = tx9Var.a0;
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
                ix9 ix9Var = new ix9(this, getContext(), i2, tx9Var.a1);
                this.n = ix9Var;
                ix9Var.setShownButtonsAtStart(i != 4 ? 6.5f : 4.5f);
                ix9 ix9Var2 = this.n;
                py pyVar = this.h;
                ix9Var2.setDontOccupyWidth((int) pyVar.getPaint().measureText(((Object) pyVar.getHint()) + ""));
                this.n.setOnScrollIntoOccupiedWidth(new p8c(this) { // from class: gx9
                    public final /* synthetic */ lw9 b;

                    {
                        this.b = this;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b3 = b2;
                        lw9 lw9Var = this.b;
                        switch (b3) {
                            case 0:
                                Integer num = (Integer) obj;
                                lw9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                lw9Var.b(num.intValue() > 0);
                                lw9Var.d(false);
                                break;
                            default:
                                qya qyaVar = (qya) obj;
                                qya selectedCategory = lw9Var.n.getSelectedCategory();
                                tx9 tx9Var2 = lw9Var.G;
                                if (selectedCategory != qyaVar) {
                                    tx9Var2.v(qyaVar.a, false, false);
                                    lw9Var.n.I1(qyaVar);
                                    break;
                                } else {
                                    tx9Var2.v(null, false, false);
                                    lw9Var.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.n.setOnCategoryClick(new p8c(this) { // from class: gx9
                    public final /* synthetic */ lw9 b;

                    {
                        this.b = this;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b3 = b;
                        lw9 lw9Var = this.b;
                        switch (b3) {
                            case 0:
                                Integer num = (Integer) obj;
                                lw9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                                lw9Var.b(num.intValue() > 0);
                                lw9Var.d(false);
                                break;
                            default:
                                qya qyaVar = (qya) obj;
                                qya selectedCategory = lw9Var.n.getSelectedCategory();
                                tx9 tx9Var2 = lw9Var.G;
                                if (selectedCategory != qyaVar) {
                                    tx9Var2.v(qyaVar.a, false, false);
                                    lw9Var.n.I1(qyaVar);
                                    break;
                                } else {
                                    tx9Var2.v(null, false, false);
                                    lw9Var.n.I1(null);
                                    break;
                                }
                        }
                    }
                });
                this.a.addView(this.n, nme.d(-1, -1.0f, kk7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
            }
            i2 = 1;
            ix9 ix9Var3 = new ix9(this, getContext(), i2, tx9Var.a1);
            this.n = ix9Var3;
            ix9Var3.setShownButtonsAtStart(i != 4 ? 6.5f : 4.5f);
            ix9 ix9Var22 = this.n;
            py pyVar2 = this.h;
            ix9Var22.setDontOccupyWidth((int) pyVar2.getPaint().measureText(((Object) pyVar2.getHint()) + ""));
            this.n.setOnScrollIntoOccupiedWidth(new p8c(this) { // from class: gx9
                public final /* synthetic */ lw9 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b3 = b2;
                    lw9 lw9Var = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            lw9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            lw9Var.b(num.intValue() > 0);
                            lw9Var.d(false);
                            break;
                        default:
                            qya qyaVar = (qya) obj;
                            qya selectedCategory = lw9Var.n.getSelectedCategory();
                            tx9 tx9Var2 = lw9Var.G;
                            if (selectedCategory != qyaVar) {
                                tx9Var2.v(qyaVar.a, false, false);
                                lw9Var.n.I1(qyaVar);
                                break;
                            } else {
                                tx9Var2.v(null, false, false);
                                lw9Var.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.n.setOnCategoryClick(new p8c(this) { // from class: gx9
                public final /* synthetic */ lw9 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b3 = b;
                    lw9 lw9Var = this.b;
                    switch (b3) {
                        case 0:
                            Integer num = (Integer) obj;
                            lw9Var.h.setTranslationX(-Math.max(0, num.intValue()));
                            lw9Var.b(num.intValue() > 0);
                            lw9Var.d(false);
                            break;
                        default:
                            qya qyaVar = (qya) obj;
                            qya selectedCategory = lw9Var.n.getSelectedCategory();
                            tx9 tx9Var2 = lw9Var.G;
                            if (selectedCategory != qyaVar) {
                                tx9Var2.v(qyaVar.a, false, false);
                                lw9Var.n.I1(qyaVar);
                                break;
                            } else {
                                tx9Var2.v(null, false, false);
                                lw9Var.n.I1(null);
                                break;
                            }
                    }
                }
            });
            this.a.addView(this.n, nme.d(-1, -1.0f, kk7.D1, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.D8));
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
        ofFloat.addUpdateListener(new x89(this, (byte) 17));
        this.s.setDuration(120L);
        this.s.setInterpolator(s33.h);
        this.s.start();
    }

    public final void c(boolean z) {
        zk9 zk9Var = this.w;
        if (!z) {
            if (zk9Var != null) {
                gl.r(zk9Var);
                this.w = null;
            }
            gl.Q3(this.c, false, true);
            return;
        }
        if (zk9Var == null) {
            zk9 zk9Var2 = new zk9(this, (byte) 20);
            this.w = zk9Var2;
            gl.e3(zk9Var2, 340L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d(boolean z) {
        ix9 ix9Var;
        ix9 ix9Var2;
        ks9 ks9Var = this.f;
        byte b = ks9Var.k;
        py pyVar = this.h;
        if (b != 2 || ((pyVar.length() == 0 && ((ix9Var2 = this.n) == null || ix9Var2.getSelectedCategory() == null)) || z)) {
            ?? r6 = (pyVar.length() > 0 || ((ix9Var = this.n) != null && ix9Var.w3 > 0.5f && (ix9Var.r3 || ix9Var.getSelectedCategory() != null))) ? 1 : 0;
            ks9Var.b(r6);
            ImageView imageView = this.b;
            imageView.setClickable(r6);
            imageView.setContentDescription(r6 != 0 ? k96.M0(2131754878, null) : null);
            imageView.setImportantForAccessibility(r6 != 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tx9 tx9Var = this.H;
        ar8 ar8Var = tx9Var.h0;
        lw9 lw9Var = tx9Var.g0;
        uw9 uw9Var = tx9Var.V;
        if (uw9Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x = ar8Var.getX() + lw9Var.getX();
            float y = ar8Var.getY() + lw9Var.getY();
            v82 v82Var = (v82) uw9Var;
            m43 m43Var = (m43) v82Var.b;
            l43 l43Var = m43Var.a;
            t09 t09Var = (t09) v82Var.c;
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            t09Var.getDelegate().x(canvas, rectF, 0.0f, l43Var.getX() + x, (m43Var.y == 1 ? l43Var.getY() - gl.m : l43Var.getY() + m43Var.c.getY()) + y, kk7.d4, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), TLObject.FLAG_30));
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

    @Override // tjb
    public final void updateColors() {
        FrameLayout frameLayout;
        wjb wjbVar = this.G.a1;
        try {
            ks9 ks9Var = this.f;
            if (ks9Var != null) {
                ks9Var.a(bkb.v0(bkb.Af, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (!this.y || (frameLayout = this.a) == null) {
            return;
        }
        int p1 = bkb.p1(0.06f, bkb.v0(bkb.D8, wjbVar));
        if (this.E != null) {
            Drawable background = frameLayout.getBackground();
            ShapeDrawable shapeDrawable = this.E;
            if (background == shapeDrawable) {
                if (p1 != this.F) {
                    bkb.A1(p1, shapeDrawable);
                    frameLayout.invalidate();
                }
                this.F = p1;
            }
        }
        ShapeDrawable b0 = bkb.b0(gl.L(18.0f), p1);
        this.E = b0;
        frameLayout.setBackground(b0);
        this.F = p1;
    }
}
