package ei;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final e6 c;
    public final h5 d;
    public a5.a e;
    public final w[] f;
    public w h;
    public Utilities.Callback n;
    public Runnable r;

    public y(Context context, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        tr trVar = tr.h;
        this.c = new e6(this, 0L, 320L, trVar);
        this.d = new h5(this, 320L, trVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.c = new x();
        aVar.d = new x();
        this.e = aVar;
        this.f = new w[]{new w(this), new w(this)};
        setWillNotDraw(false);
        paint2.setColor(i6.l1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int v02 = i6.v0(i6.d6, d6Var);
        aVar2.b = v02;
        paint.setColor(v02);
    }

    public static void b(o6 o6Var, x xVar, boolean z10) {
        o6Var.b();
        if (xVar.f == 0) {
            o6Var.q(xVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) xVar.e);
        spannableStringBuilder.setSpan(new z5(xVar.f, 1.4f, o6Var.a.getFontMetricsInt()), 0, 1, 33);
        o6Var.q(spannableStringBuilder, z10, true);
    }

    public final w a(float f7, float f10) {
        int i10 = 0;
        while (true) {
            w[] wVarArr = this.f;
            if (i10 >= wVarArr.length) {
                return null;
            }
            a5.a aVar = this.e;
            x xVar = (x) (i10 == 0 ? aVar.c : aVar.d);
            if (wVarArr[i10].a.contains(f7, f10) && xVar.a && xVar.b) {
                return wVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o6 o6Var;
        float f7;
        float d;
        float f10;
        float d10;
        float d11;
        String str;
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f11 = height;
        String str2 = ((x) this.e.d).i;
        w[] wVarArr = this.f;
        int i10 = 1;
        int i11 = wVarArr[1].b.c < wVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            w wVar = wVarArr[i12];
            a5.a aVar = this.e;
            x xVar = (x) (i12 == 0 ? aVar.c : aVar.d);
            e6 e6Var = wVar.b;
            org.telegram.ui.Components.voip.h hVar = wVar.p;
            Paint paint2 = wVar.k;
            e6 e6Var2 = wVar.e;
            e6 e6Var3 = wVar.d;
            e6 e6Var4 = wVar.c;
            org.telegram.ui.Cells.z zVar2 = wVar.n;
            w[] wVarArr2 = wVarArr;
            wp wpVar = wVar.o;
            float f12 = f11;
            h5 h5Var = wVar.g;
            int i13 = i11;
            o6 o6Var2 = wVar.l;
            int i14 = i12;
            RectF rectF = wVar.a;
            float e7 = e6Var.e(xVar.a);
            if (xVar.a) {
                a5.a aVar2 = this.e;
                o6Var = o6Var2;
                if (((x) aVar2.d).a && ((x) aVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                d = e6Var4.d(f7, false);
            } else {
                d = e6Var4.c;
                o6Var = o6Var2;
            }
            if (xVar.a) {
                a5.a aVar3 = this.e;
                if (((x) aVar3.d).a && ((x) aVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = e6Var3.d(f10, false);
            } else {
                d10 = e6Var3.c;
            }
            if (xVar.a) {
                a5.a aVar4 = this.e;
                d11 = e6Var2.d((((x) aVar4.d).a && ((x) aVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = e6Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f13 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f13;
            float f14 = dp / 2.0f;
            float lerp3 = f12 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f14;
            rectF.set(lerp2 - f13, lerp3 - f14, f13 + lerp2, f14 + lerp3);
            float e10 = wVar.h.e(xVar.c);
            float e11 = wVar.i.e(xVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e7) * wVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(i6.l1(e7, wVar.f.a(xVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f16 = f15 * e7;
                int l1 = i6.l1(f16, h5Var.a(xVar.h, false));
                o6 o6Var3 = o6Var;
                if (o6Var3.T != l1) {
                    o6Var3.T = l1;
                    str = str2;
                    o6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                o6Var3.r(i6.l1(f16, h5Var.a(xVar.h, false)));
                o6Var3.m(rectF);
                o6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                wpVar.b(i6.l1(e10 * e7, h5Var.a(xVar.h, false)));
                wpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                wpVar.draw(canvas);
                canvas.restore();
            }
            if (e11 > 0.0f) {
                hVar.b(i6.l1(e7 * e11, h5Var.a(xVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (wVar.m != i6.l1(0.15f, xVar.h)) {
                int l12 = i6.l1(0.15f, xVar.h);
                wVar.m = l12;
                zVar = zVar2;
                i10 = 1;
                i6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            wVarArr = wVarArr2;
            f11 = f12;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        a5.a aVar = this.e;
        boolean z10 = ((x) aVar.c).a;
        int i10 = (z10 || ((x) aVar.d).a) ? 1 : 0;
        if (z10) {
            x xVar = (x) aVar.d;
            if (xVar.a && ("top".equalsIgnoreCase(xVar.i) || "bottom".equalsIgnoreCase(((x) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), ok.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            w a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                w a10 = a(motionEvent.getX(), motionEvent.getY());
                w wVar = this.h;
                if (a10 == wVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(wVar == this.f[0]));
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
        w[] wVarArr = this.f;
        w wVar = wVarArr[0];
        if (wVar.n != drawable && wVar.o != drawable) {
            w wVar2 = wVarArr[1];
            if (wVar2.n != drawable && wVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
