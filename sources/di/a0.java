package di;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class a0 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final d6 c;
    public final org.telegram.ui.Components.g5 d;
    public a5.a e;
    public final y[] f;
    public y h;
    public Utilities.Callback n;
    public Runnable r;

    public a0(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        wr wrVar = wr.h;
        this.c = new d6(this, 0L, 320L, wrVar);
        this.d = new org.telegram.ui.Components.g5(this, 320L, wrVar, 0);
        a5.a aVar = new a5.a((char) 0, 5);
        aVar.c = new z();
        aVar.d = new z();
        this.e = aVar;
        this.f = new y[]{new y(this), new y(this)};
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int v02 = j6.v0(j6.d6, f6Var);
        aVar2.b = v02;
        paint.setColor(v02);
    }

    public static void b(n6 n6Var, z zVar, boolean z10) {
        n6Var.b();
        if (zVar.f == 0) {
            n6Var.q(zVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) zVar.e);
        spannableStringBuilder.setSpan(new y5(zVar.f, 1.4f, n6Var.a.getFontMetricsInt()), 0, 1, 33);
        n6Var.q(spannableStringBuilder, z10, true);
    }

    public final y a(float f7, float f10) {
        int i10 = 0;
        while (true) {
            y[] yVarArr = this.f;
            if (i10 >= yVarArr.length) {
                return null;
            }
            a5.a aVar = this.e;
            z zVar = (z) (i10 == 0 ? aVar.c : aVar.d);
            if (yVarArr[i10].a.contains(f7, f10) && zVar.a && zVar.b) {
                return yVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n6 n6Var;
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
        String str2 = ((z) this.e.d).i;
        y[] yVarArr = this.f;
        int i10 = 1;
        int i11 = yVarArr[1].b.c < yVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            y yVar = yVarArr[i12];
            a5.a aVar = this.e;
            z zVar2 = (z) (i12 == 0 ? aVar.c : aVar.d);
            d6 d6Var = yVar.b;
            org.telegram.ui.Components.voip.h hVar = yVar.p;
            Paint paint2 = yVar.k;
            d6 d6Var2 = yVar.e;
            d6 d6Var3 = yVar.d;
            d6 d6Var4 = yVar.c;
            org.telegram.ui.Cells.z zVar3 = yVar.n;
            y[] yVarArr2 = yVarArr;
            zp zpVar = yVar.o;
            float f12 = f11;
            org.telegram.ui.Components.g5 g5Var = yVar.g;
            int i13 = i11;
            n6 n6Var2 = yVar.l;
            int i14 = i12;
            RectF rectF = yVar.a;
            float e = d6Var.e(zVar2.a);
            if (zVar2.a) {
                a5.a aVar2 = this.e;
                n6Var = n6Var2;
                if (((z) aVar2.d).a && ((z) aVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                d = d6Var4.d(f7, false);
            } else {
                d = d6Var4.c;
                n6Var = n6Var2;
            }
            if (zVar2.a) {
                a5.a aVar3 = this.e;
                if (((z) aVar3.d).a && ((z) aVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = d6Var3.d(f10, false);
            } else {
                d10 = d6Var3.c;
            }
            if (zVar2.a) {
                a5.a aVar4 = this.e;
                d11 = d6Var2.d((((z) aVar4.d).a && ((z) aVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = d6Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f13 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f13;
            float f14 = dp / 2.0f;
            float lerp3 = f12 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f14;
            rectF.set(lerp2 - f13, lerp3 - f14, f13 + lerp2, f14 + lerp3);
            float e7 = yVar.h.e(zVar2.c);
            float e10 = yVar.i.e(zVar2.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * yVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e, yVar.f.a(zVar2.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f16 = f15 * e;
                int l1 = j6.l1(f16, g5Var.a(zVar2.h, false));
                n6 n6Var3 = n6Var;
                if (n6Var3.T != l1) {
                    n6Var3.T = l1;
                    str = str2;
                    n6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                n6Var3.r(j6.l1(f16, g5Var.a(zVar2.h, false)));
                n6Var3.m(rectF);
                n6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e7 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e7);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e7) * AndroidUtilities.dp(10.0f));
                zpVar.b(j6.l1(e7 * e, g5Var.a(zVar2.h, false)));
                zpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                zpVar.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                hVar.b(j6.l1(e * e10, g5Var.a(zVar2.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (yVar.m != j6.l1(0.15f, zVar2.h)) {
                int l12 = j6.l1(0.15f, zVar2.h);
                yVar.m = l12;
                zVar = zVar3;
                i10 = 1;
                j6.B1(zVar, l12, true);
            } else {
                zVar = zVar3;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            yVarArr = yVarArr2;
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
        boolean z10 = ((z) aVar.c).a;
        int i10 = (z10 || ((z) aVar.d).a) ? 1 : 0;
        if (z10) {
            z zVar = (z) aVar.d;
            if (zVar.a && ("top".equalsIgnoreCase(zVar.i) || "bottom".equalsIgnoreCase(((z) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), em.C(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            y a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                y a10 = a(motionEvent.getX(), motionEvent.getY());
                y yVar = this.h;
                if (a10 == yVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(yVar == this.f[0]));
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
        y[] yVarArr = this.f;
        y yVar = yVarArr[0];
        if (yVar.n != drawable && yVar.o != drawable) {
            y yVar2 = yVarArr[1];
            if (yVar2.n != drawable && yVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
