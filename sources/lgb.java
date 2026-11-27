// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lgb extends FrameLayout implements snb {
    public int E;
    public final e29[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public s8b L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final kgb h;
    public final String[] n;
    public final int[] r;
    public final b29[] s;
    public final b29[] w;
    public final int[] x;
    public final int[] y;

    public lgb(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{ob6.M0(2131743968, null), ob6.M0(2131743967, null), ob6.M0(2131743972, null), ob6.M0(2131743969, null), ob6.M0(2131743971, null), ob6.M0(2131743970, null)};
        this.r = new int[]{r7, r7, r7, r7, aob.Y5, aob.d9};
        this.s = new b29[6];
        this.w = new b29[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new e29[2];
        this.H = 1.0f;
        int i2 = aob.c9;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(hl.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(hl.L(2.0f));
        kgb kgbVar = new kgb(this, context);
        this.h = kgbVar;
        this.a = aob.w0(null, aob.j5, false);
        kgbVar.setMinValue(0);
        kgbVar.setDrawDividers(false);
        boolean isEmpty = uc7.s1(i).G0.isEmpty();
        kgbVar.setMaxValue(isEmpty ? 4 : 5);
        kgbVar.setAllItemsCount(!isEmpty ? 6 : 5);
        kgbVar.setWrapSelectorWheel(true);
        kgbVar.setFormatter(new jgb(this));
        kgbVar.setOnValueChangedListener(new jgb(this));
        kgbVar.setImportantForAccessibility(2);
        kgbVar.setValue(xea.m(i));
        addView(kgbVar, tre.d(jn7.P1, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            this.F[i3] = new e29(context);
            addView(this.F[i3], tre.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        b29 a = a(this.h.getValue());
        if (a != null) {
            this.F[0].setImageDrawable(a);
            a.H(a.e[0] - 1);
        }
        hl.T3(this.F[0], true, 0.5f, true, false);
        hl.T3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final b29 a(int i) {
        b29[] b29VarArr = this.s;
        if (b29VarArr[i] == null) {
            b29VarArr[i] = new b29(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, hl.L(28.0f), hl.L(28.0f), true, null);
            c(i);
        }
        return b29VarArr[i];
    }

    public final void b() {
        int value;
        if (this.L != null || this.K == (value = this.h.getValue())) {
            return;
        }
        this.K = value;
        int i = (this.E + 1) % 2;
        b29 a = a(value);
        e29[] e29VarArr = this.F;
        if (a != null) {
            if (e29VarArr[i].getVisibility() != 0) {
                a.I(0, false, false);
            }
            e29VarArr[i].setAnimation(a);
            e29VarArr[i].d();
        } else {
            e29VarArr[i].a();
        }
        hl.T3(e29VarArr[this.E], false, 0.5f, true, true);
        hl.T3(e29VarArr[i], true, 0.5f, true, true);
        this.E = i;
        s8b s8bVar = new s8b(this, (byte) 10);
        this.L = s8bVar;
        hl.d3(s8bVar, 150L);
    }

    public final void c(int i) {
        b29[] b29VarArr = this.s;
        if (b29VarArr[i] != null) {
            int f = vm2.f(0.9f, aob.w0(null, aob.d6, false), aob.w0(null, aob.c9, false));
            int i2 = aob.e9;
            int w0 = aob.w0(null, i2, false);
            b29 b29Var = b29VarArr[i];
            b29[] b29VarArr2 = this.w;
            b29 b29Var2 = b29VarArr2[i];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (b29Var == b29Var2 && w0 == iArr2[i] && f == iArr[i]) {
                return;
            }
            b29VarArr2[i] = b29Var;
            iArr2[i] = w0;
            iArr[i] = f;
            if (i != 2) {
                yob.x(this, b29VarArr[i], i2, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            b29VarArr[i].L(f, "Arrow");
            b29VarArr[i].L(w0, "Box2");
            b29VarArr[i].L(w0, "Box1");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        kgb kgbVar = this.h;
        boolean z = kgbVar.getValue() == 5;
        float f2 = this.G;
        e29[] e29VarArr = this.F;
        if (z) {
            if (f2 != 1.0f) {
                float f3 = f2 + 0.053333335f;
                this.G = f3;
                if (f3 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    e29VarArr[0].invalidate();
                    e29VarArr[1].invalidate();
                    invalidate();
                }
            }
        } else if (f2 != 0.0f) {
            float f4 = f2 - 0.053333335f;
            this.G = f4;
            if (f4 < 0.0f) {
                this.G = 0.0f;
            } else {
                e29VarArr[0].invalidate();
                e29VarArr[1].invalidate();
                invalidate();
            }
        }
        int i = aob.M6;
        int w0 = aob.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        int w02 = aob.w0(null, i, false);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        int B = ik8.B(16.0f, hl.L(21.0f) + hl.L(132.0f), getMeasuredWidth());
        int L = hl.L(21.0f);
        int D = ik8.D(48.0f, getMeasuredHeight(), 2);
        float f5 = L;
        float f6 = D;
        float measuredHeight = getMeasuredHeight() - D;
        RectF rectF = this.f;
        rectF.set(f5, f6, B, measuredHeight);
        int i2 = this.J;
        int[] iArr = this.r;
        if (i2 < 0) {
            this.J = iArr[kgbVar.getValue()];
            this.H = 1.0f;
            this.I = vm2.f(0.9f, aob.w0(null, aob.d6, false), aob.w0(null, this.J, false));
            f = 1.0f;
        } else {
            f = 1.0f;
            if (iArr[kgbVar.getValue()] != this.J) {
                this.I = vm2.f(this.H, this.I, vm2.f(0.9f, aob.w0(null, aob.d6, false), aob.w0(null, this.J, false)));
                this.H = 0.0f;
                this.J = iArr[kgbVar.getValue()];
            }
        }
        float f7 = this.H;
        if (f7 != f) {
            float f8 = f7 + 0.16f;
            this.H = f8;
            if (f8 > f) {
                this.H = f;
            } else {
                invalidate();
            }
        }
        int i3 = this.I;
        int i4 = aob.d6;
        int f9 = vm2.f(this.H, i3, vm2.f(0.9f, aob.w0(null, i4, false), aob.w0(null, this.J, false)));
        Paint paint3 = this.c;
        paint3.setColor(f9);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint3);
        paint3.setColor(aob.w0(null, i4, false));
        paint3.setAlpha(jn7.d4);
        rectF.set(f5, f6, B - hl.L(58.0f), getMeasuredHeight() - D);
        rectF.inset(-hl.L(1.0f), -hl.L(1.0f));
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(aob.w0(null, i, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), hl.L(15.0f), paint3);
        float centerY = rectF.centerY() - hl.L(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + hl.L(23.0f) + 0.0f, centerY, rectF.right - hl.L(68.0f), centerY, paint2);
        float centerY2 = rectF.centerY() + hl.L(6.0f);
        canvas.drawLine(rectF.left + hl.L(23.0f) + 0.0f, centerY2, rectF.right - hl.L(23.0f), centerY2, paint2);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            kgb kgbVar = this.h;
            int value = kgbVar.getValue() + 1;
            if (value > kgbVar.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.n[value]);
            kgbVar.a(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        int w0 = aob.w0(null, aob.j5, false);
        this.a = w0;
        kgb kgbVar = this.h;
        kgbVar.setTextColor(w0);
        kgbVar.invalidate();
    }

    @Override // snb
    public final void updateColors() {
        for (int i = 0; i < this.s.length; i++) {
            c(i);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
