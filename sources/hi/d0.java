package hi;

import a8.ng;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class d0 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final h6 c;
    public final j5 d;
    public ng e;
    public final b0[] f;
    public b0 h;
    public Utilities.Callback n;
    public Runnable r;

    public d0(Context context, u6 u6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        ds dsVar = ds.h;
        this.c = new h6(this, 0L, 320L, dsVar);
        this.d = new j5(this, 320L, dsVar, 0);
        ng ngVar = new ng((char) 0, 10);
        ngVar.c = new c0();
        ngVar.d = new c0();
        this.e = ngVar;
        this.f = new b0[]{new b0(this), new b0(this)};
        setWillNotDraw(false);
        paint2.setColor(y6.o1(0.1f, -16777216));
        ng ngVar2 = this.e;
        int w02 = y6.w0(y6.d6, u6Var);
        ngVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(r6 r6Var, c0 c0Var, boolean z10) {
        r6Var.a();
        if (c0Var.f == 0) {
            r6Var.t(c0Var.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) c0Var.e);
        spannableStringBuilder.setSpan(new c6(c0Var.f, 1.4f, r6Var.a.getFontMetricsInt()), 0, 1, 33);
        r6Var.t(spannableStringBuilder, z10, true);
    }

    public final b0 a(float f7, float f10) {
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f;
            if (i10 >= b0VarArr.length) {
                return null;
            }
            ng ngVar = this.e;
            c0 c0Var = (c0) (i10 == 0 ? ngVar.c : ngVar.d);
            if (b0VarArr[i10].a.contains(f7, f10) && c0Var.a && c0Var.b) {
                return b0VarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r6 r6Var;
        float f7;
        float d;
        float f10;
        float d10;
        float d11;
        String str;
        char c10;
        float f11;
        boolean z10;
        org.telegram.ui.Cells.y yVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((c0) this.e.d).i;
        b0[] b0VarArr = this.f;
        int i10 = 1;
        int i11 = b0VarArr[1].b.c < b0VarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            b0 b0Var = b0VarArr[i12];
            ng ngVar = this.e;
            c0 c0Var = (c0) (i12 == 0 ? ngVar.c : ngVar.d);
            h6 h6Var = b0Var.b;
            org.telegram.ui.Components.voip.h hVar = b0Var.p;
            Paint paint2 = b0Var.k;
            h6 h6Var2 = b0Var.e;
            h6 h6Var3 = b0Var.d;
            h6 h6Var4 = b0Var.c;
            org.telegram.ui.Cells.y yVar2 = b0Var.n;
            b0[] b0VarArr2 = b0VarArr;
            gq gqVar = b0Var.o;
            float f13 = f12;
            j5 j5Var = b0Var.g;
            int i13 = i11;
            r6 r6Var2 = b0Var.l;
            int i14 = i12;
            RectF rectF = b0Var.a;
            float e = h6Var.e(c0Var.a);
            if (c0Var.a) {
                ng ngVar2 = this.e;
                r6Var = r6Var2;
                if (((c0) ngVar2.d).a && ((c0) ngVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                d = h6Var4.d(f7, false);
            } else {
                d = h6Var4.c;
                r6Var = r6Var2;
            }
            if (c0Var.a) {
                ng ngVar3 = this.e;
                if (((c0) ngVar3.d).a && ((c0) ngVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = h6Var3.d(f10, false);
            } else {
                d10 = h6Var3.c;
            }
            if (c0Var.a) {
                ng ngVar4 = this.e;
                d11 = h6Var2.d((((c0) ngVar4.d).a && ((c0) ngVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = h6Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f14 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f14;
            float f15 = dp / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f15;
            rectF.set(lerp2 - f14, lerp3 - f15, f14 + lerp2, f15 + lerp3);
            float e10 = b0Var.h.e(c0Var.c);
            float e11 = b0Var.i.e(c0Var.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * b0Var.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(y6.o1(e, b0Var.f.a(c0Var.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f17 = f16 * e;
                int o12 = y6.o1(f17, j5Var.a(c0Var.h, false));
                r6 r6Var3 = r6Var;
                if (r6Var3.Z != o12) {
                    r6Var3.Z = o12;
                    str = str2;
                    r6Var3.a0 = new PorterDuffColorFilter(o12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                r6Var3.u(y6.o1(f17, j5Var.a(c0Var.h, false)));
                r6Var3.p(rectF);
                r6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                c10 = 0;
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                gqVar.b(y6.o1(e10 * e, j5Var.a(c0Var.h, false)));
                gqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                gqVar.draw(canvas);
                canvas.restore();
                f11 = 0.0f;
            } else {
                c10 = 0;
                f11 = 0.0f;
            }
            if (e11 > f11) {
                z10 = false;
                hVar.b(y6.o1(e * e11, j5Var.a(c0Var.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (b0Var.m != y6.o1(0.15f, c0Var.h)) {
                int o13 = y6.o1(0.15f, c0Var.h);
                b0Var.m = o13;
                yVar = yVar2;
                i10 = 1;
                y6.E1(yVar, o13, true);
            } else {
                yVar = yVar2;
                i10 = 1;
            }
            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : i10);
            b0VarArr = b0VarArr2;
            f12 = f13;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        ng ngVar = this.e;
        boolean z10 = ((c0) ngVar.c).a;
        int i10 = (z10 || ((c0) ngVar.d).a) ? 1 : 0;
        if (z10) {
            c0 c0Var = (c0) ngVar.d;
            if (c0Var.a && ("top".equalsIgnoreCase(c0Var.i) || "bottom".equalsIgnoreCase(((c0) this.e.d).i))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), wh.D(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            b0 a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                b0 a10 = a(motionEvent.getX(), motionEvent.getY());
                b0 b0Var = this.h;
                if (a10 == b0Var && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(b0Var == this.f[0]));
                }
            }
            this.h.j.c(false);
            this.h.n.setState(new int[0]);
            this.h = null;
        }
        return this.h != null;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.n = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.r = runnable;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        b0[] b0VarArr = this.f;
        b0 b0Var = b0VarArr[0];
        if (b0Var.n != drawable && b0Var.o != drawable) {
            b0 b0Var2 = b0VarArr[1];
            if (b0Var2.n != drawable && b0Var2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
