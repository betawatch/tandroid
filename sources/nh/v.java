package nh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class v extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final y5 c;
    public final b5 d;
    public b6.a e;
    public final t[] f;
    public t h;
    public Utilities.Callback n;
    public Runnable r;

    public v(Context context, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        er erVar = er.h;
        this.c = new y5(this, 0L, 320L, erVar);
        this.d = new b5(this, 320L, erVar, 0);
        b6.a aVar = new b6.a((char) 0, 15);
        aVar.b = new u();
        aVar.d = new u();
        this.e = aVar;
        this.f = new t[]{new t(this), new t(this)};
        setWillNotDraw(false);
        paint2.setColor(g6.l1(0.1f, -16777216));
        b6.a aVar2 = this.e;
        int v02 = g6.v0(g6.d6, c6Var);
        aVar2.c = v02;
        paint.setColor(v02);
    }

    public static void b(i6 i6Var, u uVar, boolean z10) {
        i6Var.b();
        if (uVar.f == 0) {
            i6Var.q(uVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) uVar.e);
        spannableStringBuilder.setSpan(new t5(uVar.f, 1.4f, i6Var.a.getFontMetricsInt()), 0, 1, 33);
        i6Var.q(spannableStringBuilder, z10, true);
    }

    public final t a(float f10, float f11) {
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f;
            if (i10 >= tVarArr.length) {
                return null;
            }
            b6.a aVar = this.e;
            u uVar = (u) (i10 == 0 ? aVar.b : aVar.d);
            if (tVarArr[i10].a.contains(f10, f11) && uVar.a && uVar.b) {
                return tVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i6 i6Var;
        float f10;
        float d;
        float f11;
        float d10;
        float d11;
        String str;
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.c, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((u) this.e.d).i;
        t[] tVarArr = this.f;
        int i10 = 1;
        int i11 = tVarArr[1].b.c < tVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            t tVar = tVarArr[i12];
            b6.a aVar = this.e;
            u uVar = (u) (i12 == 0 ? aVar.b : aVar.d);
            y5 y5Var = tVar.b;
            org.telegram.ui.Components.voip.h hVar = tVar.p;
            Paint paint2 = tVar.k;
            y5 y5Var2 = tVar.e;
            y5 y5Var3 = tVar.d;
            y5 y5Var4 = tVar.c;
            org.telegram.ui.Cells.z zVar2 = tVar.n;
            t[] tVarArr2 = tVarArr;
            hp hpVar = tVar.o;
            float f13 = f12;
            b5 b5Var = tVar.g;
            int i13 = i11;
            i6 i6Var2 = tVar.l;
            int i14 = i12;
            RectF rectF = tVar.a;
            float e9 = y5Var.e(uVar.a);
            if (uVar.a) {
                b6.a aVar2 = this.e;
                i6Var = i6Var2;
                if (((u) aVar2.d).a && ((u) aVar2.b).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d = y5Var4.d(f10, false);
            } else {
                d = y5Var4.c;
                i6Var = i6Var2;
            }
            if (uVar.a) {
                b6.a aVar3 = this.e;
                if (((u) aVar3.d).a && ((u) aVar3.b).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                d10 = y5Var3.d(f11, false);
            } else {
                d10 = y5Var3.c;
            }
            if (uVar.a) {
                b6.a aVar4 = this.e;
                d11 = y5Var2.d((((u) aVar4.d).a && ((u) aVar4.b).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = y5Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f14 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f14;
            float f15 = dp / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f15;
            rectF.set(lerp2 - f14, lerp3 - f15, f14 + lerp2, f15 + lerp3);
            float e10 = tVar.h.e(uVar.c);
            float e11 = tVar.i.e(uVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e9) * tVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(g6.l1(e9, tVar.f.a(uVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f17 = f16 * e9;
                int l1 = g6.l1(f17, b5Var.a(uVar.h, false));
                i6 i6Var3 = i6Var;
                if (i6Var3.T != l1) {
                    i6Var3.T = l1;
                    str = str2;
                    i6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                i6Var3.r(g6.l1(f17, b5Var.a(uVar.h, false)));
                i6Var3.m(rectF);
                i6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                hpVar.b(g6.l1(e10 * e9, b5Var.a(uVar.h, false)));
                hpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                hpVar.draw(canvas);
                canvas.restore();
            }
            if (e11 > 0.0f) {
                hVar.b(g6.l1(e9 * e11, b5Var.a(uVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (tVar.m != g6.l1(0.15f, uVar.h)) {
                int l12 = g6.l1(0.15f, uVar.h);
                tVar.m = l12;
                zVar = zVar2;
                i10 = 1;
                g6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            tVarArr = tVarArr2;
            f12 = f13;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        b6.a aVar = this.e;
        boolean z10 = ((u) aVar.b).a;
        int i10 = (z10 || ((u) aVar.d).a) ? 1 : 0;
        if (z10) {
            u uVar = (u) aVar.d;
            if (uVar.a && ("top".equalsIgnoreCase(uVar.i) || "bottom".equalsIgnoreCase(((u) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), rl.B(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            t a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                t a3 = a(motionEvent.getX(), motionEvent.getY());
                t tVar = this.h;
                if (a3 == tVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(tVar == this.f[0]));
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
