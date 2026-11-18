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
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class u extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final c6 c;
    public final f5 d;
    public xa e;
    public final s[] f;
    public s h;
    public x10 n;
    public Runnable r;

    public u(Context context, i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        lr lrVar = lr.h;
        this.c = new c6(this, 0L, 320L, lrVar);
        this.d = new f5(this, 320L, lrVar, 0);
        xa xaVar = new xa((char) 0, 12);
        xaVar.c = new t();
        xaVar.d = new t();
        this.e = xaVar;
        this.f = new s[]{new s(this), new s(this)};
        setWillNotDraw(false);
        paint2.setColor(n6.r1(0.1f, -16777216));
        xa xaVar2 = this.e;
        int w02 = n6.w0(n6.d6, i6Var);
        xaVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(m6 m6Var, t tVar, boolean z10) {
        m6Var.a();
        if (tVar.f == 0) {
            m6Var.t(tVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) tVar.e);
        spannableStringBuilder.setSpan(new x5(tVar.f, 1.4f, m6Var.a.getFontMetricsInt()), 0, 1, 33);
        m6Var.t(spannableStringBuilder, z10, true);
    }

    public final s a(float f10, float f11) {
        int i7 = 0;
        while (true) {
            s[] sVarArr = this.f;
            if (i7 >= sVarArr.length) {
                return null;
            }
            xa xaVar = this.e;
            t tVar = (t) (i7 == 0 ? xaVar.c : xaVar.d);
            if (sVarArr[i7].a.contains(f10, f11) && tVar.a && tVar.b) {
                return sVarArr[i7];
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m6 m6Var;
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
        String str2 = ((t) this.e.d).i;
        s[] sVarArr = this.f;
        int i7 = 1;
        int i10 = sVarArr[1].b.c < sVarArr[0].b.c ? 1 : 0;
        int i11 = i10;
        while (true) {
            if (i10 != 0) {
                if (i11 < 0) {
                    return;
                }
            } else if (i11 > i7) {
                return;
            }
            s sVar = sVarArr[i11];
            xa xaVar = this.e;
            t tVar = (t) (i11 == 0 ? xaVar.c : xaVar.d);
            c6 c6Var = sVar.b;
            org.telegram.ui.Components.voip.n nVar = sVar.p;
            Paint paint2 = sVar.k;
            c6 c6Var2 = sVar.e;
            c6 c6Var3 = sVar.d;
            c6 c6Var4 = sVar.c;
            org.telegram.ui.Cells.y yVar2 = sVar.n;
            s[] sVarArr2 = sVarArr;
            sp spVar = sVar.o;
            float f14 = f13;
            f5 f5Var = sVar.g;
            int i12 = i10;
            m6 m6Var2 = sVar.l;
            int i13 = i11;
            RectF rectF = sVar.a;
            float d = c6Var.d(tVar.a);
            if (tVar.a) {
                xa xaVar2 = this.e;
                m6Var = m6Var2;
                if (((t) xaVar2.d).a && ((t) xaVar2.c).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                e10 = c6Var4.e(false, f10);
            } else {
                e10 = c6Var4.c;
                m6Var = m6Var2;
            }
            if (tVar.a) {
                xa xaVar3 = this.e;
                if (((t) xaVar3.d).a && ((t) xaVar3.c).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                e11 = c6Var3.e(false, f11);
            } else {
                e11 = c6Var3.c;
            }
            if (tVar.a) {
                xa xaVar4 = this.e;
                e12 = c6Var2.e(false, (((t) xaVar4.d).a && ((t) xaVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f);
            } else {
                e12 = c6Var2.c;
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12);
            float L = org.telegram.messenger.g0.L(44.0f);
            float f15 = T1 / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + f15;
            float f16 = L / 2.0f;
            float W1 = f14 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + f16;
            rectF.set(T12 - f15, W1 - f16, f15 + T12, f16 + W1);
            float d2 = sVar.h.d(tVar.c);
            float d10 = sVar.i.d(tVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * sVar.j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(n6.r1(d, sVar.f.a(tVar.g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f17 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f17);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f18 = f17 * d;
                int r12 = n6.r1(f18, f5Var.a(tVar.h, false));
                m6 m6Var3 = m6Var;
                if (m6Var3.a0 != r12) {
                    m6Var3.a0 = r12;
                    str = str2;
                    m6Var3.b0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                m6Var3.u(n6.r1(f18, f5Var.a(tVar.h, false)));
                m6Var3.p(rectF);
                m6Var3.draw(canvas);
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
                spVar.b(n6.r1(d2 * d, f5Var.a(tVar.h, false)));
                spVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                spVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (d10 > f12) {
                z10 = false;
                nVar.b(n6.r1(d * d10, f5Var.a(tVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (sVar.m != n6.r1(0.15f, tVar.h)) {
                int r13 = n6.r1(0.15f, tVar.h);
                sVar.m = r13;
                yVar = yVar2;
                i7 = 1;
                n6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i7 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            i11 = i13 + (i12 != 0 ? -1 : i7);
            sVarArr = sVarArr2;
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
        boolean z10 = ((t) xaVar.c).a;
        int i7 = (z10 || ((t) xaVar.d).a) ? 1 : 0;
        if (z10) {
            t tVar = (t) xaVar.d;
            if (tVar.a && ("top".equalsIgnoreCase(tVar.i) || "bottom".equalsIgnoreCase(((t) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), n10.C(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x10 x10Var;
        if (motionEvent.getAction() == 0) {
            s a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                s a11 = a(motionEvent.getX(), motionEvent.getY());
                s sVar = this.h;
                if (a11 == sVar && (x10Var = this.n) != null) {
                    x10Var.a(Boolean.valueOf(sVar == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(x10 x10Var) {
        this.n = x10Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        s[] sVarArr = this.f;
        s sVar = sVarArr[0];
        if (sVar.n != drawable && sVar.o != drawable) {
            s sVar2 = sVarArr[1];
            if (sVar2.n != drawable && sVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
