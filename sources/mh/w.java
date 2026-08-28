package mh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class w extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final y5 c;
    public final b5 d;
    public a6.a e;
    public final u[] f;
    public u h;
    public Utilities.Callback n;
    public Runnable r;

    public w(Context context, b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        gr grVar = gr.h;
        this.c = new y5(this, 0L, 320L, grVar);
        this.d = new b5(this, 320L, grVar, 0);
        a6.a aVar = new a6.a((char) 0, 15);
        aVar.b = new v();
        aVar.d = new v();
        this.e = aVar;
        this.f = new u[]{new u(this), new u(this)};
        setWillNotDraw(false);
        paint2.setColor(f6.l1(0.1f, -16777216));
        a6.a aVar2 = this.e;
        int v02 = f6.v0(f6.d6, b6Var);
        aVar2.c = v02;
        paint.setColor(v02);
    }

    public static void b(i6 i6Var, v vVar, boolean z10) {
        i6Var.b();
        if (vVar.f == 0) {
            i6Var.q(vVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) vVar.e);
        spannableStringBuilder.setSpan(new t5(vVar.f, 1.4f, i6Var.a.getFontMetricsInt()), 0, 1, 33);
        i6Var.q(spannableStringBuilder, z10, true);
    }

    public final u a(float f10, float f11) {
        int i9 = 0;
        while (true) {
            u[] uVarArr = this.f;
            if (i9 >= uVarArr.length) {
                return null;
            }
            a6.a aVar = this.e;
            v vVar = (v) (i9 == 0 ? aVar.b : aVar.d);
            if (uVarArr[i9].a.contains(f10, f11) && vVar.a && vVar.b) {
                return uVarArr[i9];
            }
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i6 i6Var;
        float f10;
        float d;
        float f11;
        float d9;
        float d10;
        String str;
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.c, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f12 = height;
        String str2 = ((v) this.e.d).i;
        u[] uVarArr = this.f;
        int i9 = 1;
        int i10 = uVarArr[1].b.c < uVarArr[0].b.c ? 1 : 0;
        int i11 = i10;
        while (true) {
            if (i10 != 0) {
                if (i11 < 0) {
                    return;
                }
            } else if (i11 > i9) {
                return;
            }
            u uVar = uVarArr[i11];
            a6.a aVar = this.e;
            v vVar = (v) (i11 == 0 ? aVar.b : aVar.d);
            y5 y5Var = uVar.b;
            org.telegram.ui.Components.voip.h hVar = uVar.p;
            Paint paint2 = uVar.k;
            y5 y5Var2 = uVar.e;
            y5 y5Var3 = uVar.d;
            y5 y5Var4 = uVar.c;
            org.telegram.ui.Cells.z zVar2 = uVar.n;
            u[] uVarArr2 = uVarArr;
            jp jpVar = uVar.o;
            float f13 = f12;
            b5 b5Var = uVar.g;
            int i12 = i10;
            i6 i6Var2 = uVar.l;
            int i13 = i11;
            RectF rectF = uVar.a;
            float e10 = y5Var.e(vVar.a);
            if (vVar.a) {
                a6.a aVar2 = this.e;
                i6Var = i6Var2;
                if (((v) aVar2.d).a && ((v) aVar2.b).a) {
                    f10 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d = y5Var4.d(f10, false);
            } else {
                d = y5Var4.c;
                i6Var = i6Var2;
            }
            if (vVar.a) {
                a6.a aVar3 = this.e;
                if (((v) aVar3.d).a && ((v) aVar3.b).a) {
                    f11 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i13 == 0) : i13 == 0) ? 0 : 1;
                } else {
                    f11 = 0.0f;
                }
                d9 = y5Var3.d(f11, false);
            } else {
                d9 = y5Var3.c;
            }
            if (vVar.a) {
                a6.a aVar4 = this.e;
                d10 = y5Var2.d((((v) aVar4.d).a && ((v) aVar4.b).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d10 = y5Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d10);
            float dp = AndroidUtilities.dp(44.0f);
            float f14 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f14;
            float f15 = dp / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d9) + f15;
            rectF.set(lerp2 - f14, lerp3 - f15, f14 + lerp2, f15 + lerp3);
            float e11 = uVar.h.e(vVar.c);
            float e12 = uVar.i.e(vVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e10) * uVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(f6.l1(e10, uVar.f.a(vVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e11 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e11;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e11);
                float f17 = f16 * e10;
                int l1 = f6.l1(f17, b5Var.a(vVar.h, false));
                i6 i6Var3 = i6Var;
                if (i6Var3.T != l1) {
                    i6Var3.T = l1;
                    str = str2;
                    i6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                i6Var3.r(f6.l1(f17, b5Var.a(vVar.h, false)));
                i6Var3.m(rectF);
                i6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e11 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e11);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e11) * AndroidUtilities.dp(10.0f));
                jpVar.b(f6.l1(e11 * e10, b5Var.a(vVar.h, false)));
                jpVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                jpVar.draw(canvas);
                canvas.restore();
            }
            if (e12 > 0.0f) {
                hVar.b(f6.l1(e10 * e12, b5Var.a(vVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (uVar.m != f6.l1(0.15f, vVar.h)) {
                int l12 = f6.l1(0.15f, vVar.h);
                uVar.m = l12;
                zVar = zVar2;
                i9 = 1;
                f6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i9 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i11 = i13 + (i12 != 0 ? -1 : 1);
            uVarArr = uVarArr2;
            f12 = f13;
            i10 = i12;
            str2 = str;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.c.c;
    }

    public int getTotalHeight() {
        a6.a aVar = this.e;
        boolean z10 = ((v) aVar.b).a;
        int i9 = (z10 || ((v) aVar.d).a) ? 1 : 0;
        if (z10) {
            v vVar = (v) aVar.d;
            if (vVar.a && ("top".equalsIgnoreCase(vVar.i) || "bottom".equalsIgnoreCase(((v) this.e.d).i))) {
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return i9 == 1 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(109.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), ll.C(109.0f, 1, TLObject.FLAG_30));
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
                u a3 = a(motionEvent.getX(), motionEvent.getY());
                u uVar = this.h;
                if (a3 == uVar && (callback = this.n) != null) {
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
