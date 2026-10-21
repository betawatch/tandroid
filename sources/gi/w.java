package gi;

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
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public abstract class w extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final f6 c;
    public final i5 d;
    public a5.a e;
    public final u[] f;
    public u h;
    public Utilities.Callback n;
    public Runnable r;

    public w(Context context, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        bs bsVar = bs.h;
        this.c = new f6(this, 0L, 320L, bsVar);
        this.d = new i5(this, 320L, bsVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.c = new v();
        aVar.d = new v();
        this.e = aVar;
        this.f = new u[]{new u(this), new u(this)};
        setWillNotDraw(false);
        paint2.setColor(h6.m1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = h6.w0(h6.d6, d6Var);
        aVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(p6 p6Var, v vVar, boolean z10) {
        p6Var.a();
        if (vVar.f == 0) {
            p6Var.t(vVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) vVar.e);
        spannableStringBuilder.setSpan(new a6(vVar.f, 1.4f, p6Var.a.getFontMetricsInt()), 0, 1, 33);
        p6Var.t(spannableStringBuilder, z10, true);
    }

    public final u a(float f7, float f10) {
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f;
            if (i10 >= uVarArr.length) {
                return null;
            }
            a5.a aVar = this.e;
            v vVar = (v) (i10 == 0 ? aVar.c : aVar.d);
            if (uVarArr[i10].a.contains(f7, f10) && vVar.a && vVar.b) {
                return uVarArr[i10];
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p6 p6Var;
        float f7;
        float d;
        float f10;
        float d10;
        float d11;
        String str;
        char c10;
        float f11;
        boolean z10;
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((v) this.e.d).i;
        u[] uVarArr = this.f;
        int i10 = 1;
        int i11 = uVarArr[1].b.c < uVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            u uVar = uVarArr[i12];
            a5.a aVar = this.e;
            v vVar = (v) (i12 == 0 ? aVar.c : aVar.d);
            f6 f6Var = uVar.b;
            org.telegram.ui.Components.voip.h hVar = uVar.p;
            Paint paint2 = uVar.k;
            f6 f6Var2 = uVar.e;
            f6 f6Var3 = uVar.d;
            f6 f6Var4 = uVar.c;
            org.telegram.ui.Cells.z zVar2 = uVar.n;
            u[] uVarArr2 = uVarArr;
            dq dqVar = uVar.o;
            float f13 = f12;
            i5 i5Var = uVar.g;
            int i13 = i11;
            p6 p6Var2 = uVar.l;
            int i14 = i12;
            RectF rectF = uVar.a;
            float e = f6Var.e(vVar.a);
            if (vVar.a) {
                a5.a aVar2 = this.e;
                p6Var = p6Var2;
                if (((v) aVar2.d).a && ((v) aVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                d = f6Var4.d(f7, false);
            } else {
                d = f6Var4.c;
                p6Var = p6Var2;
            }
            if (vVar.a) {
                a5.a aVar3 = this.e;
                if (((v) aVar3.d).a && ((v) aVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = f6Var3.d(f10, false);
            } else {
                d10 = f6Var3.c;
            }
            if (vVar.a) {
                a5.a aVar4 = this.e;
                d11 = f6Var2.d((((v) aVar4.d).a && ((v) aVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = f6Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f14 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f14;
            float f15 = dp / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f15;
            rectF.set(lerp2 - f14, lerp3 - f15, f14 + lerp2, f15 + lerp3);
            float e7 = uVar.h.e(vVar.c);
            float e10 = uVar.i.e(vVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e) * uVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(h6.m1(e, uVar.f.a(vVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e7 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e7;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e7);
                float f17 = f16 * e;
                int m12 = h6.m1(f17, i5Var.a(vVar.h, false));
                p6 p6Var3 = p6Var;
                if (p6Var3.Z != m12) {
                    p6Var3.Z = m12;
                    str = str2;
                    p6Var3.a0 = new PorterDuffColorFilter(m12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                p6Var3.u(h6.m1(f17, i5Var.a(vVar.h, false)));
                p6Var3.p(rectF);
                p6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e7 > 0.0f) {
                canvas.save();
                c10 = 0;
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e7);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e7) * AndroidUtilities.dp(10.0f));
                dqVar.b(h6.m1(e7 * e, i5Var.a(vVar.h, false)));
                dqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                dqVar.draw(canvas);
                canvas.restore();
                f11 = 0.0f;
            } else {
                c10 = 0;
                f11 = 0.0f;
            }
            if (e10 > f11) {
                z10 = false;
                hVar.b(h6.m1(e * e10, i5Var.a(vVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (uVar.m != h6.m1(0.15f, vVar.h)) {
                int m13 = h6.m1(0.15f, vVar.h);
                uVar.m = m13;
                zVar = zVar2;
                i10 = 1;
                h6.C1(zVar, m13, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : i10);
            uVarArr = uVarArr2;
            f12 = f13;
            i11 = i13;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        a5.a aVar = this.e;
        boolean z10 = ((v) aVar.c).a;
        int i10 = (z10 || ((v) aVar.d).a) ? 1 : 0;
        if (z10) {
            v vVar = (v) aVar.d;
            if (vVar.a && ("top".equalsIgnoreCase(vVar.i) || "bottom".equalsIgnoreCase(((v) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), mk.C(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            u a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                u a10 = a(motionEvent.getX(), motionEvent.getY());
                u uVar = this.h;
                if (a10 == uVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(uVar == this.f[0]));
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
        u[] uVarArr = this.f;
        u uVar = uVarArr[0];
        if (uVar.n != drawable && uVar.o != drawable) {
            u uVar2 = uVarArr[1];
            if (uVar2.n != drawable && uVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
