package ii;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b8.kg;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class v extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final u5 c;
    public final x4 d;
    public kg e;
    public final t[] f;
    public t h;
    public u10 n;
    public Runnable r;

    public v(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        xq xqVar = xq.h;
        this.c = new u5(this, 0L, 320L, xqVar);
        this.d = new x4(this, 320L, xqVar, 0);
        kg kgVar = new kg((char) 0, 10);
        kgVar.c = new u();
        kgVar.d = new u();
        this.e = kgVar;
        this.f = new t[]{new t(this), new t(this)};
        setWillNotDraw(false);
        paint2.setColor(k6.r1(0.1f, -16777216));
        kg kgVar2 = this.e;
        int w02 = k6.w0(k6.d6, e6Var);
        kgVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(g6 g6Var, u uVar, boolean z10) {
        g6Var.a();
        if (uVar.f == 0) {
            g6Var.t(uVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) uVar.e);
        spannableStringBuilder.setSpan(new p5(uVar.f, 1.4f, g6Var.a.getFontMetricsInt()), 0, 1, 33);
        g6Var.t(spannableStringBuilder, z10, true);
    }

    public final t a(float f10, float f11) {
        int i3 = 0;
        while (true) {
            t[] tVarArr = this.f;
            if (i3 >= tVarArr.length) {
                return null;
            }
            kg kgVar = this.e;
            u uVar = (u) (i3 == 0 ? kgVar.c : kgVar.d);
            if (tVarArr[i3].a.contains(f10, f11) && uVar.a && uVar.b) {
                return tVarArr[i3];
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        float f10;
        float e10;
        float f11;
        float e11;
        float e12;
        String str;
        char c2;
        float f12;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        float height = getHeight() - this.c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a10 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((u) this.e.d).i;
        t[] tVarArr = this.f;
        int i3 = 1;
        int i10 = tVarArr[1].b.c < tVarArr[0].b.c ? 1 : 0;
        int i11 = i10;
        while (true) {
            if (i10 != 0) {
                if (i11 < 0) {
                    return;
                }
            } else if (i11 > i3) {
                return;
            }
            t tVar = tVarArr[i11];
            kg kgVar = this.e;
            u uVar = (u) (i11 == 0 ? kgVar.c : kgVar.d);
            u5 u5Var = tVar.b;
            org.telegram.ui.Components.voip.g gVar = tVar.p;
            Paint paint2 = tVar.k;
            u5 u5Var2 = tVar.e;
            u5 u5Var3 = tVar.d;
            u5 u5Var4 = tVar.c;
            org.telegram.ui.Cells.y yVar2 = tVar.n;
            t[] tVarArr2 = tVarArr;
            cp cpVar = tVar.o;
            float f14 = f13;
            x4 x4Var = tVar.g;
            int i12 = i10;
            g6 g6Var2 = tVar.l;
            int i13 = i11;
            RectF rectF = tVar.a;
            float d = u5Var.d(uVar.a);
            if (uVar.a) {
                kg kgVar2 = this.e;
                g6Var = g6Var2;
                if (((u) kgVar2.d).a && ((u) kgVar2.c).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                e10 = u5Var4.e(false, f10);
            } else {
                e10 = u5Var4.c;
                g6Var = g6Var2;
            }
            if (uVar.a) {
                kg kgVar3 = this.e;
                if (((u) kgVar3.d).a && ((u) kgVar3.c).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                e11 = u5Var3.e(false, f11);
            } else {
                e11 = u5Var3.c;
            }
            if (uVar.a) {
                kg kgVar4 = this.e;
                e12 = u5Var2.e(false, (((u) kgVar4.d).a && ((u) kgVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f);
            } else {
                e12 = u5Var2.c;
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12);
            float L = org.telegram.messenger.g0.L(44.0f);
            float f15 = T1 / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + f15;
            float f16 = L / 2.0f;
            float W1 = f14 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + f16;
            rectF.set(T12 - f15, W1 - f16, f15 + T12, f16 + W1);
            float d10 = tVar.h.d(uVar.c);
            float d11 = tVar.i.d(uVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * tVar.j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(k6.r1(d, tVar.f.a(uVar.g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d10 < 1.0f) {
                canvas.save();
                float f17 = 1.0f - d10;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f17);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d10);
                float f18 = f17 * d;
                int r12 = k6.r1(f18, x4Var.a(uVar.h, false));
                g6 g6Var3 = g6Var;
                if (g6Var3.Z != r12) {
                    g6Var3.Z = r12;
                    str = str2;
                    g6Var3.a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                g6Var3.u(k6.r1(f18, x4Var.a(uVar.h, false)));
                g6Var3.p(rectF);
                g6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d10 > 0.0f) {
                canvas.save();
                c2 = 0;
                float T15 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d10);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d10) * org.telegram.messenger.g0.L(10.0f));
                cpVar.b(k6.r1(d10 * d, x4Var.a(uVar.h, false)));
                cpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                cpVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c2 = 0;
                f12 = 0.0f;
            }
            if (d11 > f12) {
                z10 = false;
                gVar.b(k6.r1(d * d11, x4Var.a(uVar.h, false)), 64);
                gVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (tVar.m != k6.r1(0.15f, uVar.h)) {
                int r13 = k6.r1(0.15f, uVar.h);
                tVar.m = r13;
                yVar = yVar2;
                i3 = 1;
                k6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i3 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            i11 = i13 + (i12 != 0 ? -1 : i3);
            tVarArr = tVarArr2;
            f13 = f14;
            i10 = i12;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        kg kgVar = this.e;
        boolean z10 = ((u) kgVar.c).a;
        int i3 = (z10 || ((u) kgVar.d).a) ? 1 : 0;
        if (z10) {
            u uVar = (u) kgVar.d;
            if (uVar.a && ("top".equalsIgnoreCase(uVar.i) || "bottom".equalsIgnoreCase(((u) this.e.d).i))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return 0;
        }
        return i3 == 1 ? org.telegram.messenger.g0.L(58.0f) : org.telegram.messenger.g0.L(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), org.telegram.messenger.camera.q.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u10 u10Var;
        if (motionEvent.getAction() == 0) {
            t a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t a11 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (a11 == tVar && (u10Var = this.n) != null) {
                    u10Var.a(Boolean.valueOf(tVar == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(u10 u10Var) {
        this.n = u10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        t[] tVarArr = this.f;
        t tVar = tVarArr[0];
        if (tVar.n != drawable && tVar.o != drawable) {
            t tVar2 = tVarArr[1];
            if (tVar2.n != drawable && tVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
