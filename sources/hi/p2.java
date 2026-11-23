package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class p2 extends View {
    public final Paint a;
    public final TextPaint b;
    public final ArrayList c;
    public float[] d;
    public m1 e;
    public final /* synthetic */ r2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(r2 r2Var, Context context) {
        super(context);
        this.f = r2Var;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(org.telegram.messenger.g0.N(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        boolean z10 = false;
        setPadding(0, 0, 0, 0);
        int i7 = 4;
        if (r2Var.K0(4)) {
            n2 n2Var = new n2(this, 4, R.drawable.msg_limit_links, gd.N0(2131744198, null));
            int i10 = r2.D1;
            if (!i10.i(r2Var.a).q()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                n2Var.j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.r1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                n2Var.n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(n2Var);
        }
        if (r2Var.K0(0)) {
            arrayList.add(new n2(this, 0, R.drawable.map_pin3, gd.N0(2131744197, null)));
        }
        int i11 = 3;
        if (r2Var.K0(5)) {
            kc kcVar = lc.b;
            n2[] n2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kcVar == null ? "🌤" : kcVar.c);
            sb2.append(" ");
            sb2.append(kcVar == null ? lc.a() ? "24°C" : "72°F" : kcVar.a());
            CharSequence m10 = org.telegram.messenger.j6.m(sb2.toString(), textPaint.getFontMetricsInt(), false, null, 0);
            CharSequence charSequence = m10;
            if (mp.u1(r2Var.a).Z5) {
                charSequence = m10;
                charSequence = m10;
                if (c8.oa.d("android.permission.ACCESS_COARSE_LOCATION") && kcVar == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("___");
                    spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(68.0f), this), 0, spannableStringBuilder.length(), 33);
                    n2VarArr[0] = new n2(this, spannableStringBuilder);
                    c8.oa.c(R.raw.permission_request_location, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.o2(i7, new ai.o2(i11, new ai.s1(16, this, n2VarArr), z10), z10));
                    charSequence = spannableStringBuilder;
                }
            }
            n2 n2Var2 = n2VarArr[0];
            arrayList.add(n2Var2 == null ? new n2(this, charSequence) : n2Var2);
        }
        if (r2Var.K0(6)) {
            arrayList.add(new n2(this, 6, R.drawable.filled_widget_captions, gd.N0(2131744199, null)));
        }
        if (r2Var.K0(1)) {
            arrayList.add(new n2(this, 1, R.drawable.filled_widget_music, gd.N0(2131744200, null)));
        }
        if (r2Var.K0(2)) {
            arrayList.add(new n2(this, 2, R.drawable.filled_premium_camera, gd.N0(2131744196, null)));
        }
        if (r2Var.K0(3)) {
            arrayList.add(new o2(this));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = 0.0f;
                i10++;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            m2 m2Var = (m2) obj;
            int i12 = m2Var.e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i12];
            if (f10 > 0.0f) {
                fArr2[i12] = f10 + org.telegram.messenger.g0.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i12] = fArr3[i12] + m2Var.h.e(false, m2Var.b);
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            m2 m2Var2 = (m2) obj2;
            m2Var2.a(canvas, com.google.android.gms.internal.vision.e2.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[m2Var2.e - 1], 2.0f, getPaddingLeft()) + m2Var2.d, org.telegram.messenger.f3.D(48.0f, m2Var2.e - 1, org.telegram.messenger.g0.L(12.0f)));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m2) obj).b(true);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((m2) obj).b(false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.c;
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 1;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList.get(i13);
            i13++;
            m2 m2Var = (m2) obj;
            m2Var.d = f10;
            float L = m2Var.b + org.telegram.messenger.g0.L(10.0f) + f10;
            if (L > paddingLeft) {
                i12++;
                m2Var.d = 0.0f;
                f10 = m2Var.b + org.telegram.messenger.g0.L(10.0f) + 0.0f;
            } else {
                f10 = L;
            }
            m2Var.e = i12;
        }
        float[] fArr = this.d;
        if (fArr == null || fArr.length != i12) {
            this.d = new float[i12];
        } else {
            Arrays.fill(fArr, 0.0f);
        }
        int size3 = arrayList.size();
        while (i11 < size3) {
            Object obj2 = arrayList.get(i11);
            i11++;
            m2 m2Var2 = (m2) obj2;
            int i14 = m2Var2.e - 1;
            float[] fArr2 = this.d;
            float f11 = fArr2[i14];
            if (f11 > 0.0f) {
                fArr2[i14] = f11 + org.telegram.messenger.g0.L(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i14] = fArr3[i14] + m2Var2.b;
        }
        setMeasuredDimension(size, org.telegram.messenger.f3.D(12.0f, i12 - 1, org.telegram.messenger.f3.D(36.0f, i12, org.telegram.messenger.g0.L(24.0f))));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var;
        m1 m1Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                m2Var = null;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            m2Var = (m2) obj;
            if (m2Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            m2 m2Var2 = (m2) obj2;
            if (m2Var2 != m2Var) {
                m2Var2.g.c(false);
            }
        }
        if (m2Var != null) {
            m2Var.g.c((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
        }
        if (motionEvent.getAction() == 1 && m2Var != null && (m1Var = this.e) != null) {
            m1Var.a(Integer.valueOf(m2Var.a));
        }
        return m2Var != null;
    }
}
