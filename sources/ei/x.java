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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class x extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final g6 c;
    public final j5 d;
    public a5.a e;
    public final v[] f;
    public v h;
    public Utilities.Callback n;
    public Runnable r;

    public x(Context context, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        hs hsVar = hs.h;
        this.c = new g6(this, 0L, 320L, hsVar);
        this.d = new j5(this, 320L, hsVar, 0);
        a5.a aVar = new a5.a((char) 0, 6);
        aVar.c = new w();
        aVar.d = new w();
        this.e = aVar;
        this.f = new v[]{new v(this), new v(this)};
        setWillNotDraw(false);
        paint2.setColor(i6.m1(0.1f, -16777216));
        a5.a aVar2 = this.e;
        int w02 = i6.w0(i6.d6, e6Var);
        aVar2.b = w02;
        paint.setColor(w02);
    }

    public static void b(q6 q6Var, w wVar, boolean z10) {
        q6Var.a();
        if (wVar.f == 0) {
            q6Var.t(wVar.e, z10, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) wVar.e);
        spannableStringBuilder.setSpan(new b6(wVar.f, 1.4f, q6Var.a.getFontMetricsInt()), 0, 1, 33);
        q6Var.t(spannableStringBuilder, z10, true);
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
        q6 q6Var;
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
            g6 g6Var = vVar.b;
            org.telegram.ui.Components.voip.h hVar = vVar.p;
            Paint paint2 = vVar.k;
            g6 g6Var2 = vVar.e;
            g6 g6Var3 = vVar.d;
            g6 g6Var4 = vVar.c;
            org.telegram.ui.Cells.z zVar2 = vVar.n;
            v[] vVarArr2 = vVarArr;
            jq jqVar = vVar.o;
            float f13 = f12;
            j5 j5Var = vVar.g;
            int i13 = i11;
            q6 q6Var2 = vVar.l;
            int i14 = i12;
            RectF rectF = vVar.a;
            float e7 = g6Var.e(wVar.a);
            if (wVar.a) {
                a5.a aVar2 = this.e;
                q6Var = q6Var2;
                if (((w) aVar2.d).a && ((w) aVar2.c).a) {
                    f7 = (!"left".equalsIgnoreCase(str2) ? !(!"right".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f7 = 0.0f;
                }
                d = g6Var4.d(f7, false);
            } else {
                d = g6Var4.c;
                q6Var = q6Var2;
            }
            if (wVar.a) {
                a5.a aVar3 = this.e;
                if (((w) aVar3.d).a && ((w) aVar3.c).a) {
                    f10 = (!"top".equalsIgnoreCase(str2) ? !(!"bottom".equalsIgnoreCase(str2) || i14 == 0) : i14 == 0) ? 0 : 1;
                } else {
                    f10 = 0.0f;
                }
                d10 = g6Var3.d(f10, false);
            } else {
                d10 = g6Var3.c;
            }
            if (wVar.a) {
                a5.a aVar4 = this.e;
                d11 = g6Var2.d((((w) aVar4.d).a && ((w) aVar4.c).a && ("left".equalsIgnoreCase(str2) || "right".equalsIgnoreCase(str2))) ? 0.0f : 1.0f, false);
            } else {
                d11 = g6Var2.c;
            }
            float lerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), d11);
            float dp = AndroidUtilities.dp(44.0f);
            float f14 = lerp / 2.0f;
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), d) + f14;
            float f15 = dp / 2.0f;
            float lerp3 = f13 + AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), d10) + f15;
            rectF.set(lerp2 - f14, lerp3 - f15, f14 + lerp2, f15 + lerp3);
            float e10 = vVar.h.e(wVar.c);
            float e11 = vVar.i.e(wVar.d);
            canvas.save();
            float lerp4 = AndroidUtilities.lerp(0.7f, 1.0f, e7) * vVar.j.a(0.02f);
            canvas.scale(lerp4, lerp4, lerp2, lerp3);
            paint2.setColor(i6.m1(e7, vVar.f.a(wVar.g, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            if (e10 < 1.0f) {
                canvas.save();
                float f16 = 1.0f - e10;
                float lerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f16);
                canvas.scale(lerp5, lerp5, lerp2, lerp3);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * e10);
                float f17 = f16 * e7;
                int m12 = i6.m1(f17, j5Var.a(wVar.h, false));
                q6 q6Var3 = q6Var;
                if (q6Var3.Z != m12) {
                    q6Var3.Z = m12;
                    str = str2;
                    q6Var3.a0 = new PorterDuffColorFilter(m12, PorterDuff.Mode.SRC_IN);
                } else {
                    str = str2;
                }
                q6Var3.u(i6.m1(f17, j5Var.a(wVar.h, false)));
                q6Var3.p(rectF);
                q6Var3.draw(canvas);
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
                jqVar.b(i6.m1(e10 * e7, j5Var.a(wVar.h, false)));
                jqVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                jqVar.draw(canvas);
                canvas.restore();
                f11 = 0.0f;
            } else {
                c10 = 0;
                f11 = 0.0f;
            }
            if (e11 > f11) {
                z10 = false;
                hVar.b(i6.m1(e7 * e11, j5Var.a(wVar.h, false)), 64);
                hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z10 = false;
            }
            if (vVar.m != i6.m1(0.15f, wVar.h)) {
                int m13 = i6.m1(0.15f, wVar.h);
                vVar.m = m13;
                zVar = zVar2;
                i10 = 1;
                i6.C1(zVar, m13, true);
            } else {
                zVar = zVar2;
                i10 = 1;
            }
            zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            zVar.draw(canvas);
            canvas.restore();
            i12 = i14 + (i13 != 0 ? -1 : i10);
            vVarArr = vVarArr2;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), bi.C(109.0f, 1, TLObject.FLAG_30));
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
