package hi;

import a8.wa;
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
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class t extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final v5 c;
    public final y4 d;
    public wa e;
    public final r[] f;
    public r h;
    public c20 n;
    public Runnable r;

    public t(Context context, h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        wq wqVar = wq.h;
        this.c = new v5(this, 0L, 320L, wqVar);
        this.d = new y4(this, 320L, wqVar, 0);
        wa waVar = new wa((char) 0, 11);
        waVar.c = new s();
        waVar.d = new s();
        this.e = waVar;
        this.f = new r[]{new r(this), new r(this)};
        setWillNotDraw(false);
        paint2.setColor(m6.r1(0.1f, -16777216));
        wa waVar2 = this.e;
        int w02 = m6.w0(m6.d6, h6Var);
        waVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(org.telegram.ui.Components.h6 h6Var, s sVar, boolean z9) {
        h6Var.a();
        if (sVar.f == 0) {
            h6Var.t(sVar.e, z9, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) sVar.e);
        spannableStringBuilder.setSpan(new q5(sVar.f, 1.4f, h6Var.a.getFontMetricsInt()), 0, 1, 33);
        h6Var.t(spannableStringBuilder, z9, true);
    }

    public final r a(float f10, float f11) {
        int i7 = 0;
        while (true) {
            r[] rVarArr = this.f;
            if (i7 >= rVarArr.length) {
                return null;
            }
            wa waVar = this.e;
            s sVar = (s) (i7 == 0 ? waVar.c : waVar.d);
            if (rVarArr[i7].a.contains(f10, f11) && sVar.a && sVar.b) {
                return rVarArr[i7];
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.h6 h6Var;
        float f10;
        float e10;
        float f11;
        float e11;
        float e12;
        String str;
        char c10;
        float f12;
        boolean z9;
        org.telegram.ui.Cells.y yVar;
        float height = getHeight() - this.c.e(false, getTotalHeight());
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a10 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a10);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f13 = height;
        String str2 = ((s) this.e.d).i;
        r[] rVarArr = this.f;
        int i7 = 1;
        int i10 = rVarArr[1].b.c < rVarArr[0].b.c ? 1 : 0;
        int i11 = i10;
        while (true) {
            if (i10 != 0) {
                if (i11 < 0) {
                    return;
                }
            } else if (i11 > i7) {
                return;
            }
            r rVar = rVarArr[i11];
            wa waVar = this.e;
            s sVar = (s) (i11 == 0 ? waVar.c : waVar.d);
            v5 v5Var = rVar.b;
            org.telegram.ui.Components.voip.n nVar = rVar.p;
            Paint paint2 = rVar.k;
            v5 v5Var2 = rVar.e;
            v5 v5Var3 = rVar.d;
            v5 v5Var4 = rVar.c;
            org.telegram.ui.Cells.y yVar2 = rVar.n;
            r[] rVarArr2 = rVarArr;
            cp cpVar = rVar.o;
            float f14 = f13;
            y4 y4Var = rVar.g;
            int i12 = i10;
            org.telegram.ui.Components.h6 h6Var2 = rVar.l;
            int i13 = i11;
            RectF rectF = rVar.a;
            float d = v5Var.d(sVar.a);
            if (sVar.a) {
                wa waVar2 = this.e;
                h6Var = h6Var2;
                if (((s) waVar2.d).a && ((s) waVar2.c).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                e10 = v5Var4.e(false, f10);
            } else {
                e10 = v5Var4.c;
                h6Var = h6Var2;
            }
            if (sVar.a) {
                wa waVar3 = this.e;
                if (((s) waVar3.d).a && ((s) waVar3.c).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                e11 = v5Var3.e(false, f11);
            } else {
                e11 = v5Var3.c;
            }
            if (sVar.a) {
                wa waVar4 = this.e;
                e12 = v5Var2.e(false, (((s) waVar4.d).a && ((s) waVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f);
            } else {
                e12 = v5Var2.c;
            }
            float T1 = org.telegram.messenger.g0.T1((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f, getWidth() - org.telegram.messenger.g0.L(16.0f), e12);
            float L = org.telegram.messenger.g0.L(44.0f);
            float f15 = T1 / 2.0f;
            float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f), ((getWidth() - org.telegram.messenger.g0.L(26.0f)) / 2.0f) + org.telegram.messenger.g0.L(18.0f), e10) + f15;
            float f16 = L / 2.0f;
            float W1 = f14 + org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(58.0f)) + f16;
            rectF.set(T12 - f15, W1 - f16, f15 + T12, f16 + W1);
            float d2 = rVar.h.d(sVar.c);
            float d10 = rVar.i.d(sVar.d);
            canvas.save();
            float T13 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d) * rVar.j.a(0.02f);
            canvas.scale(T13, T13, T12, W1);
            paint2.setColor(m6.r1(d, rVar.f.a(sVar.g, false)));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint2);
            if (d2 < 1.0f) {
                canvas.save();
                float f17 = 1.0f - d2;
                float T14 = org.telegram.messenger.g0.T1(0.75f, 1.0f, f17);
                canvas.scale(T14, T14, T12, W1);
                canvas.translate(0.0f, org.telegram.messenger.g0.L(-10.0f) * d2);
                float f18 = f17 * d;
                int r12 = m6.r1(f18, y4Var.a(sVar.h, false));
                org.telegram.ui.Components.h6 h6Var3 = h6Var;
                if (h6Var3.Z != r12) {
                    h6Var3.Z = r12;
                    str = str2;
                    h6Var3.a0 = new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                h6Var3.u(m6.r1(f18, y4Var.a(sVar.h, false)));
                h6Var3.p(rectF);
                h6Var3.draw(canvas);
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
                cpVar.b(m6.r1(d2 * d, y4Var.a(sVar.h, false)));
                cpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                cpVar.draw(canvas);
                canvas.restore();
                f12 = 0.0f;
            } else {
                c10 = 0;
                f12 = 0.0f;
            }
            if (d10 > f12) {
                z9 = false;
                nVar.b(m6.r1(d * d10, y4Var.a(sVar.h, false)), 64);
                nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF, this);
            } else {
                z9 = false;
            }
            if (rVar.m != m6.r1(0.15f, sVar.h)) {
                int r13 = m6.r1(0.15f, sVar.h);
                rVar.m = r13;
                yVar = yVar2;
                i7 = 1;
                m6.H1(yVar, r13, true);
            } else {
                yVar = yVar2;
                i7 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            i11 = i13 + (i12 != 0 ? -1 : i7);
            rVarArr = rVarArr2;
            f13 = f14;
            i10 = i12;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        wa waVar = this.e;
        boolean z9 = ((s) waVar.c).a;
        int i7 = (z9 || ((s) waVar.d).a) ? 1 : 0;
        if (z9) {
            s sVar = (s) waVar.d;
            if (sVar.a && ("top".equalsIgnoreCase(sVar.i) || "bottom".equalsIgnoreCase(((s) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), org.telegram.messenger.camera.q.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c20 c20Var;
        if (motionEvent.getAction() == 0) {
            r a10 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a10;
            if (a10 != null) {
                a10.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                r a11 = a(motionEvent.getX(), motionEvent.getY());
                r rVar = this.h;
                if (a11 == rVar && (c20Var = this.n) != null) {
                    c20Var.a(Boolean.valueOf(rVar == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(c20 c20Var) {
        this.n = c20Var;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        r[] rVarArr = this.f;
        r rVar = rVarArr[0];
        if (rVar.n != drawable && rVar.o != drawable) {
            r rVar2 = rVarArr[1];
            if (rVar2.n != drawable && rVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
