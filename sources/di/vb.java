package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vb extends View implements te.b {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = e6Var;
        this.c = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
        this.b = new Paint(1);
        this.e = new Paint(1);
        this.f = new oy0(hd.M0(2131745036, null), 14.16f, org.telegram.messenger.g0.o());
    }

    public static void a(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = org.telegram.messenger.g0.L(24.0f);
            intrinsicHeight = intrinsicWidth;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setAlpha((int) (255.0f * f12));
        canvas.save();
        canvas.rotate(f13, f10, f11);
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f12);
        canvas.scale(T1, T1, f10, f11);
        i20.j(intrinsicHeight, 2.0f, f11, f10 - (intrinsicWidth / 2.0f), canvas);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // te.b
    public void E(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f) {
            this.d = null;
        }
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void b(boolean z10, boolean z11) {
        te.a aVar = (te.a) this.e;
        Drawable drawable = (Drawable) this.c;
        if (drawable == null) {
            if (z10) {
                aVar.a(true, false);
            }
        } else if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).c(z11, z10 ? 1.0f : 0.0f);
        } else {
            aVar.a(z10, z11);
        }
    }

    public void c(Drawable drawable) {
        te.c cVar = (te.c) this.f;
        cVar.b();
        cVar.c(1.0f);
        this.d = null;
        Drawable drawable2 = (Drawable) this.c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (!((org.telegram.ui.ActionBar.w4) this.h).H) {
                ((te.a) this.e).a(false, false);
            }
        }
        d();
        invalidate();
    }

    public void d() {
        org.telegram.ui.ActionBar.w4 w4Var = (org.telegram.ui.ActionBar.w4) this.h;
        setBackground(org.telegram.ui.ActionBar.j6.h0(w4Var.i0, 1, -1));
        Drawable drawable = (Drawable) this.c;
        if (drawable instanceof org.telegram.ui.ActionBar.x1) {
            ((org.telegram.ui.ActionBar.x1) drawable).a(w4Var.g0);
            ((org.telegram.ui.ActionBar.x1) ((Drawable) this.c)).b(w4Var.h0);
        } else if (drawable instanceof org.telegram.ui.ActionBar.p4) {
            ((org.telegram.ui.ActionBar.p4) drawable).j = w4Var.g0;
        } else if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(w4Var.g0, PorterDuff.Mode.SRC_IN));
        }
        ((Drawable) this.b).setColorFilter(new PorterDuffColorFilter(w4Var.h0, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        float[] fArr;
        switch (this.a) {
            case 0:
                Matrix matrix = (Matrix) this.d;
                matrix.reset();
                matrix.postTranslate(org.telegram.messenger.g0.L(14.0f), 0.0f);
                matrix.postScale((getWidth() - org.telegram.messenger.g0.L(28.0f)) / 255.0f, 1.0f);
                LinearGradient linearGradient = (LinearGradient) this.c;
                linearGradient.setLocalMatrix(matrix);
                Paint paint = (Paint) this.b;
                paint.setShader(linearGradient);
                oy0 oy0Var = (oy0) this.f;
                float L = oy0Var.c + org.telegram.messenger.g0.L(30.0f);
                Paint paint2 = (Paint) this.e;
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, (org.telegram.ui.ActionBar.e6) this.h));
                canvas.drawRect(org.telegram.messenger.g0.L(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - L) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint2);
                canvas.drawRect(org.telegram.messenger.g0.L(8.0f) + ((getWidth() + L) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - org.telegram.messenger.g0.L(24.0f), getHeight() / 2.0f, paint2);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set((getWidth() - L) / 2.0f, 0.0f, (getWidth() + L) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                ((oy0) this.f).c((getWidth() - oy0Var.c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    try {
                        fArr = (float[]) this.e;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (i10 >= fArr.length) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            hi.e2 e2Var = (hi.e2) obj;
                            int i12 = e2Var.e - 1;
                            float[] fArr2 = (float[]) this.e;
                            float f10 = fArr2[i12];
                            if (f10 > 0.0f) {
                                fArr2[i12] = f10 + org.telegram.messenger.g0.L(10.0f);
                            }
                            float[] fArr3 = (float[]) this.e;
                            fArr3[i12] = fArr3[i12] + e2Var.h.e(false, e2Var.b);
                        }
                        int size2 = arrayList.size();
                        while (i7 < size2) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            hi.e2 e2Var2 = (hi.e2) obj2;
                            e2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), ((float[]) this.e)[e2Var2.e - 1], 2.0f, getPaddingLeft()) + e2Var2.d, org.telegram.messenger.k5.D(48.0f, e2Var2.e - 1, org.telegram.messenger.g0.L(12.0f)));
                        }
                        break;
                    } else {
                        fArr[i10] = 0.0f;
                        i10++;
                    }
                }
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((hi.e2) obj).b(true);
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                super.onDetachedFromWindow();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((hi.e2) obj).b(false);
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 2:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f10 = ((te.a) this.e).e;
                float f11 = ((te.c) this.f).f;
                Drawable drawable = (Drawable) this.d;
                if (drawable == null || f11 >= 0.5f) {
                    Drawable drawable2 = (Drawable) this.c;
                    if (drawable2 == null || f10 >= 1.0f) {
                        canvas2 = canvas;
                    } else {
                        float f12 = (f11 - 0.5f) * 2.0f;
                        canvas2 = canvas;
                        a(canvas2, drawable2, width, height, Math.min(1.0f, f12 + (drawable == null ? 1.0f : 0.0f)) * (1.0f - f10), (-90.0f) * f10);
                    }
                } else {
                    float C = com.google.android.gms.internal.vision.e2.C(f11, 2.0f, 1.0f, 1.0f - f10);
                    canvas2 = canvas;
                    a(canvas2, drawable, width, height, C, 0.0f);
                }
                if (f10 > 0.0f) {
                    a(canvas2, (Drawable) this.b, width, height, f10, (1.0f - f10) * 90.0f);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                ArrayList arrayList = (ArrayList) this.d;
                int size2 = arrayList.size();
                int i11 = 0;
                int i12 = 1;
                float f10 = 0.0f;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    hi.e2 e2Var = (hi.e2) obj;
                    e2Var.d = f10;
                    float L = e2Var.b + org.telegram.messenger.g0.L(10.0f) + f10;
                    if (L > paddingLeft) {
                        i12++;
                        e2Var.d = 0.0f;
                        f10 = e2Var.b + org.telegram.messenger.g0.L(10.0f) + 0.0f;
                    } else {
                        f10 = L;
                    }
                    e2Var.e = i12;
                }
                float[] fArr = (float[]) this.e;
                if (fArr == null || fArr.length != i12) {
                    this.e = new float[i12];
                } else {
                    Arrays.fill(fArr, 0.0f);
                }
                int size3 = arrayList.size();
                while (i11 < size3) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    hi.e2 e2Var2 = (hi.e2) obj2;
                    int i14 = e2Var2.e - 1;
                    float[] fArr2 = (float[]) this.e;
                    float f11 = fArr2[i14];
                    if (f11 > 0.0f) {
                        fArr2[i14] = f11 + org.telegram.messenger.g0.L(10.0f);
                    }
                    float[] fArr3 = (float[]) this.e;
                    fArr3[i14] = fArr3[i14] + e2Var2.b;
                }
                setMeasuredDimension(size, org.telegram.messenger.k5.D(12.0f, i12 - 1, org.telegram.messenger.k5.D(36.0f, i12, org.telegram.messenger.g0.L(24.0f))));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        hi.e2 e2Var;
        hi.d1 d1Var;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        e2Var = (hi.e2) obj;
                        if (e2Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                        }
                    } else {
                        e2Var = null;
                    }
                }
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    hi.e2 e2Var2 = (hi.e2) obj2;
                    if (e2Var2 != e2Var) {
                        e2Var2.g.c(false);
                    }
                }
                if (e2Var != null) {
                    e2Var.g.c((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
                }
                if (motionEvent.getAction() == 1 && e2Var != null && (d1Var = (hi.d1) this.f) != null) {
                    d1Var.a(Integer.valueOf(e2Var.a));
                }
                return e2Var != null;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 2:
                super.setAlpha(f10);
                ((org.telegram.ui.ActionBar.w4) this.h).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationX(f10);
                ((org.telegram.ui.ActionBar.w4) this.h).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 2:
                return drawable == ((Drawable) this.c) || drawable == ((Drawable) this.d) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(org.telegram.ui.ActionBar.w4 w4Var, Context context) {
        super(context);
        this.h = w4Var;
        er erVar = er.h;
        this.e = new te.a(0, this, erVar, 380L, false);
        this.f = new te.c(1, this, erVar, 380L, 1.0f);
        this.b = context.getDrawable(R.drawable.ic_ab_close).mutate();
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(hi.i2 i2Var, Context context) {
        super(context);
        this.h = i2Var;
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(org.telegram.messenger.g0.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        boolean z10 = false;
        setPadding(0, 0, 0, 0);
        if (i2Var.J0(4)) {
            hi.f2 f2Var = new hi.f2(this, 4, R.drawable.msg_limit_links, hd.M0(2131744443, null));
            int i7 = hi.i2.C1;
            if (!m10.i(i2Var.a).q()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                f2Var.j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.r1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                f2Var.n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(f2Var);
        }
        if (i2Var.J0(0)) {
            arrayList.add(new hi.f2(this, 0, R.drawable.map_pin3, hd.M0(2131744442, null)));
        }
        int i10 = 3;
        int i11 = 2;
        if (i2Var.J0(5)) {
            hi.pb pbVar = hi.qb.b;
            hi.f2[] f2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pbVar == null ? "🌤" : pbVar.c);
            sb2.append(" ");
            sb2.append(pbVar == null ? hi.qb.a() ? "24°C" : "72°F" : pbVar.a());
            CharSequence m10 = org.telegram.messenger.j6.m(sb2.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            CharSequence charSequence = m10;
            if (np.s1(i2Var.a).X5) {
                charSequence = m10;
                charSequence = m10;
                if (c8.ka.d("android.permission.ACCESS_COARSE_LOCATION") && pbVar == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("___");
                    spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(68.0f), this), 0, spannableStringBuilder.length(), 33);
                    f2VarArr[0] = new hi.f2(this, spannableStringBuilder);
                    c8.ka.c(R.raw.permission_request_location, 2131747302, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new t7(i10, new t7(i11, new ai.u1(13, this, f2VarArr), z10), z10));
                    charSequence = spannableStringBuilder;
                }
            }
            hi.f2 f2Var2 = f2VarArr[0];
            arrayList.add(f2Var2 == null ? new hi.f2(this, charSequence) : f2Var2);
        }
        if (i2Var.J0(1)) {
            arrayList.add(new hi.f2(this, 1, R.drawable.filled_widget_music, hd.M0(2131744444, null)));
        }
        if (i2Var.J0(2)) {
            arrayList.add(new hi.f2(this, 2, R.drawable.filled_premium_camera, hd.M0(2131744441, null)));
        }
        if (i2Var.J0(3)) {
            arrayList.add(new hi.g2(this));
        }
    }
}
