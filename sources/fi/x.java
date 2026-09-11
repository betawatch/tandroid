package fi;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public abstract class x extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final e6 c;
    public final h5 d;
    public a5.a e;
    public final v[] f;
    public v h;
    public Utilities.Callback n;
    public Runnable r;

    public x(Context context, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        pr prVar = pr.h;
        this.c = new e6(this, 0L, 320L, prVar);
        this.d = new h5(this, 320L, prVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.c = new w();
        aVar.d = new w();
        this.e = aVar;
        this.f = new v[]{new v(this), new v(this)};
        setWillNotDraw(false);
        paint2.setColor(j6.l1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int v02 = j6.v0(j6.d6, f6Var);
        aVar2.b = v02;
        paint.setColor(v02);
    }

    public static void b(p6 p6Var, w wVar, boolean z10) {
        p6Var.b();
        if (wVar.f == 0) {
            p6Var.q(wVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) wVar.e);
        spannableStringBuilder.setSpan(new z5(wVar.f, 1.4f, p6Var.a.getFontMetricsInt()), 0, 1, 33);
        p6Var.q(spannableStringBuilder, z10, true);
    }

    public final v a(float f7, float f10) {
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f;
            if (i10 >= vVarArr.length) {
                return null;
            }
            a5.a aVar = this.e;
            w wVar = (w) (i10 == 0 ? aVar.c : aVar.d);
            if (vVarArr[i10].a.contains(f7, f10) && wVar.a && wVar.b) {
                return vVarArr[i10];
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
        org.telegram.ui.Cells.z zVar;
        float height = getHeight() - this.c.d(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.b);
        int a2 = this.d.a(this.e.b, false);
        Paint paint = this.a;
        paint.setColor(a2);
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f11 = height;
        String str2 = ((w) this.e.d).i;
        v[] vVarArr = this.f;
        int i10 = 1;
        int i11 = vVarArr[1].b.c < vVarArr[0].b.c ? 1 : 0;
        int i12 = i11;
        while (true) {
            if (i11 != 0) {
                if (i12 < 0) {
                    return;
                }
            } else if (i12 > i10) {
                return;
            }
            v vVar = vVarArr[i12];
            a5.a aVar = this.e;
            w wVar = (w) (i12 == 0 ? aVar.c : aVar.d);
            e6 e6Var = vVar.b;
            org.telegram.ui.Components.voip.h hVar = vVar.p;
            Paint paint2 = vVar.k;
            e6 e6Var2 = vVar.e;
            e6 e6Var3 = vVar.d;
            e6 e6Var4 = vVar.c;
            org.telegram.ui.Cells.z zVar2 = vVar.n;
            v[] vVarArr2 = vVarArr;
            sp spVar = vVar.o;
            float f12 = f11;
            h5 h5Var = vVar.g;
            int i13 = i11;
            p6 p6Var2 = vVar.l;
            int i14 = i12;
            RectF rectF = vVar.a;
            float e7 = e6Var.e(wVar.a);
            if (wVar.a) {
                a5.a aVar2 = this.e;
                p6Var = p6Var2;
                if (((w) aVar2.d).a && ((w) aVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                d = e6Var4.d(f7, false);
            } else {
                d = e6Var4.c;
                p6Var = p6Var2;
            }
            if (wVar.a) {
                a5.a aVar3 = this.e;
                if (((w) aVar3.d).a && ((w) aVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = e6Var3.d(f10, false);
            } else {
                d10 = e6Var3.c;
            }
            if (wVar.a) {
                a5.a aVar4 = this.e;
                d11 = e6Var2.d((((w) aVar4.d).a && ((w) aVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
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
            float e10 = vVar.h.e(wVar.c);
            float e11 = vVar.i.e(wVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e7) * vVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(j6.l1(e7, vVar.f.a(wVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f15 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f15);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f16 = f15 * e7;
                int l1 = j6.l1(f16, h5Var.a(wVar.h, false));
                p6 p6Var3 = p6Var;
                if (p6Var3.T != l1) {
                    p6Var3.T = l1;
                    str = str2;
                    p6Var3.U = new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                p6Var3.r(j6.l1(f16, h5Var.a(wVar.h, false)));
                p6Var3.m(rectF);
                p6Var3.draw(canvas);
                canvas.restore();
            } else {
                str = str2;
            }
            if (e10 > 0.0f) {
                canvas.save();
                float lerp6 = AndroidUtilities.lerp(0.75f, 1.0f, e10);
                canvas.scale(lerp6, lerp6, lerp2, lerp3);
                canvas.translate(0.0f, (1.0f - e10) * AndroidUtilities.dp(10.0f));
                spVar.b(j6.l1(e10 * e7, h5Var.a(wVar.h, false)));
                spVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                spVar.draw(canvas);
                canvas.restore();
            }
            if (e11 > 0.0f) {
                hVar.b(j6.l1(e7 * e11, h5Var.a(wVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            }
            if (vVar.m != j6.l1(0.15f, wVar.h)) {
                int l12 = j6.l1(0.15f, wVar.h);
                vVar.m = l12;
                zVar = zVar2;
                i10 = 1;
                j6.B1(zVar, l12, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : 1);
            vVarArr = vVarArr2;
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
        boolean z10 = ((w) aVar.c).a;
        int i10 = (z10 || ((w) aVar.d).a) ? 1 : 0;
        if (z10) {
            w wVar = (w) aVar.d;
            if (wVar.a && ("top".equalsIgnoreCase(wVar.i) || "bottom".equalsIgnoreCase(((w) this.e.d).i))) {
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), vl.C(109.0f, 1, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            v a2 = a(motionEvent.getX(), motionEvent.getY());
            this.h = a2;
            if (a2 != null) {
                a2.j.c(true);
                this.h.n.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.h.n.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.h != null) {
            if (motionEvent.getAction() == 1) {
                v a10 = a(motionEvent.getX(), motionEvent.getY());
                v vVar = this.h;
                if (a10 == vVar && (callback = this.n) != null) {
                    callback.run(Boolean.valueOf(vVar == this.f[0]));
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
        v[] vVarArr = this.f;
        v vVar = vVarArr[0];
        if (vVar.n != drawable && vVar.o != drawable) {
            v vVar2 = vVarArr[1];
            if (vVar2.n != drawable && vVar2.o != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
