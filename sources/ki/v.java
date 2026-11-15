package ki;

import a8.xa;
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
import org.telegram.messenger.i20;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final u5 c;
    public final x4 d;
    public xa e;
    public final t[] f;
    public t h;
    public z10 n;
    public Runnable r;

    public v(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        er erVar = er.h;
        this.c = new u5(this, 0L, 320L, erVar);
        this.d = new x4(this, 320L, erVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.c = new u();
        xaVar.d = new u();
        this.e = xaVar;
        this.f = new t[]{new t(this), new t(this)};
        setWillNotDraw(false);
        paint2.setColor(j6.r1(0.1f, -16777216));
        xa xaVar2 = this.e;
        int w02 = j6.w0(j6.d6, e6Var);
        xaVar2.b = w02;
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
        int i7 = 0;
        while (true) {
            t[] tVarArr = this.f;
            if (i7 >= tVarArr.length) {
                return null;
            }
            xa xaVar = this.e;
            u uVar = (u) (i7 == 0 ? xaVar.c : xaVar.d);
            if (tVarArr[i7].a.contains(f10, f11) && uVar.a && uVar.b) {
                return tVarArr[i7];
            }
            i7++;
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
        char c10;
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
        int i7 = 1;
        int i10 = tVarArr[1].b.c < tVarArr[0].b.c ? 1 : 0;
        int i11 = i10;
        while (true) {
            if (i10 != 0) {
                if (i11 < 0) {
                    return;
                }
            } else if (i11 > i7) {
                return;
            }
            t tVar = tVarArr[i11];
            xa xaVar = this.e;
            u uVar = (u) (i11 == 0 ? xaVar.c : xaVar.d);
            u5 u5Var = tVar.b;
            org.telegram.ui.Components.voip.n nVar = tVar.p;
            Paint paint2 = tVar.k;
            u5 u5Var2 = tVar.e;
            u5 u5Var3 = tVar.d;
            u5 u5Var4 = tVar.c;
            org.telegram.ui.Cells.y yVar2 = tVar.n;
            t[] tVarArr2 = tVarArr;
            lp lpVar = tVar.o;
            float f14 = f13;
            x4 x4Var = tVar.g;
            int i12 = i10;
            g6 g6Var2 = tVar.l;
            int i13 = i11;
            RectF rectF = tVar.a;
            float d = u5Var.d(uVar.a);
            if (uVar.a) {
                xa xaVar2 = this.e;
                g6Var = g6Var2;
                if (((u) xaVar2.d).a && ((u) xaVar2.c).a) {
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
                xa xaVar3 = this.e;
                if (((u) xaVar3.d).a && ((u) xaVar3.c).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                e11 = u5Var3.e(false, f11);
            } else {
                e11 = u5Var3.c;
            }
            if (uVar.a) {
                xa xaVar4 = this.e;
                e12 = u5Var2.e(false, (((u) xaVar4.d).a && ((u) xaVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f);
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
            float d2 = tVar.h.d(uVar.c);
            float d10 = tVar.i.d(uVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * tVar.j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(j6.r1(d, tVar.f.a(uVar.g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f17 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f17);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f18 = f17 * d;
                int r12 = j6.r1(f18, x4Var.a(uVar.h, false));
                g6 g6Var3 = g6Var;
                if (g6Var3.a0 != r12) {
                    g6Var3.a0 = r12;
                    str = str2;
                    g6Var3.b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                g6Var3.u(j6.r1(f18, x4Var.a(uVar.h, false)));
                g6Var3.p(rectF);
                g6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (d2 > 0.0f) {
                canvas.save();
                c10 = 0;
                float T15 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d2);
                canvas.scale(T15, T15, T12, W1);
                canvas.translate(0.0f, (1.0f - d2) * org.telegram.messenger.g0.L(10.0f));
                lpVar.b(j6.r1(d2 * d, x4Var.a(uVar.h, false)));
                lpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                lpVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (d10 > f12) {
                z10 = false;
                nVar.b(j6.r1(d * d10, x4Var.a(uVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (tVar.m != j6.r1(0.15f, uVar.h)) {
                int r13 = j6.r1(0.15f, uVar.h);
                tVar.m = r13;
                yVar = yVar2;
                i7 = 1;
                j6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i7 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            i11 = i13 + (i12 != 0 ? -1 : i7);
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
        xa xaVar = this.e;
        boolean z10 = ((u) xaVar.c).a;
        int i7 = (z10 || ((u) xaVar.d).a) ? 1 : 0;
        if (z10) {
            u uVar = (u) xaVar.d;
            if (uVar.a && ("top".equalsIgnoreCase(uVar.i) || "bottom".equalsIgnoreCase(((u) this.e.d).i))) {
                i7++;
            }
        }
        if (i7 == 0) {
            return 0;
        }
        return i7 == 1 ? org.telegram.messenger.g0.L(58.0f) : org.telegram.messenger.g0.L(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i20.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z10 z10Var;
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
                if (a11 == tVar && (z10Var = this.n) != null) {
                    z10Var.a(Boolean.valueOf(tVar == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(z10 z10Var) {
        this.n = z10Var;
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
