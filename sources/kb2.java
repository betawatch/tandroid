// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kb2 extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public boolean c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb2(wv5 wv5Var, Context context, boolean z) {
        super(context);
        this.a = (byte) 2;
        this.e = wv5Var;
        this.b = new TextView[2];
        this.c = !z;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z) {
            view.setBackground(ulb.f(cmb.Ei, 4.0f));
        }
        addView(view, qoe.d(-1, -1.0f, 0, 16.0f, z ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i = 0; i < 2; i++) {
            ((TextView[]) this.b)[i] = new TextView(context);
            ((TextView[]) this.b)[i].setFocusable(false);
            ((TextView[]) this.b)[i].setLines(1);
            ((TextView[]) this.b)[i].setSingleLine(true);
            ((TextView[]) this.b)[i].setGravity(1);
            ((TextView[]) this.b)[i].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.b)[i].setGravity(17);
            boolean z2 = this.c;
            TextView[] textViewArr = (TextView[]) this.b;
            if (z2) {
                anb.X(textViewArr[i], cmb.Ii, null);
                ((TextView[]) this.b)[i].setTypeface(gm.o());
            } else {
                anb.X(textViewArr[i], cmb.Ei, null);
            }
            ((TextView[]) this.b)[i].setImportantForAccessibility(2);
            ((TextView[]) this.b)[i].setTextSize(1, 14.0f);
            ((TextView[]) this.b)[i].setPadding(0, 0, 0, this.c ? 0 : gm.L(13.0f));
            addView(((TextView[]) this.b)[i], qoe.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i == 1) {
                ((TextView[]) this.b)[i].setAlpha(0.0f);
            }
        }
    }

    public final void a(String str, boolean z) {
        TextView[] textViewArr = (TextView[]) this.b;
        if (!z) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((wv5) this.e).A1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(d53.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -gm.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, gm.L(10.0f), 0.0f));
        animatorSet.addListener(new v85(this, (byte) 9));
        animatorSet.start();
    }

    public final void b() {
        boolean z = this.c;
        TextView textView = (TextView) this.b;
        ((TextView) this.e).setVisibility(8);
        textView.setTextColor(z ? -1 : -15095832);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                moc mocVar = (moc) this.e;
                ioc iocVar = mocVar.b;
                if (iocVar != null) {
                    float[] fArr = (float[]) mocVar.h.b;
                    float[] fArr2 = iocVar.k;
                    float[] fArr3 = iocVar.l;
                    Paint paint = iocVar.b;
                    Paint paint2 = iocVar.d;
                    Path path = iocVar.p;
                    if (iocVar.q != 0.0f && (Math.abs(Math.sin(Math.toRadians(iocVar.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(iocVar.T))) >= 0.009999999776482582d)) {
                        int a = bqc.a(-16216082, fArr);
                        int a2 = bqc.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(nm7.d4);
                        paint.setColor(ioc.d(0.82500005f, 0.0f, 0.0f, a, a2));
                        path.rewind();
                        int i = 1;
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i2 = 1; i2 < 76; i2++) {
                            int i3 = i2 << 1;
                            path.lineTo(fArr3[i3], fArr3[i3 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(nm7.d4);
                        paint2.setStrokeWidth(iocVar.q * 0.6f);
                        int[] iArr = iocVar.o;
                        int length = iArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            int i5 = iArr[i4];
                            int i6 = (i5 + 1) % 76;
                            int i7 = i5 << i;
                            int i8 = i6 << 1;
                            float[] fArr4 = iocVar.j;
                            float f = (fArr4[i7] + fArr4[i8]) * 0.5f;
                            int i9 = i7 + 1;
                            int i10 = i8 + 1;
                            float f2 = (fArr4[i9] + fArr4[i10]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i11 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(ts2.i(f2, f2, f * f, 0.0144f)));
                            float f3 = f * sqrt;
                            float f4 = f2 * sqrt;
                            float f5 = (iocVar.r ? -0.12f : 0.12f) * sqrt;
                            float c = ioc.c((iocVar.Y * f5) + (iocVar.X * f4) + (iocVar.W * f3));
                            float c2 = ioc.c((iocVar.b0 * f5) + (f4 * iocVar.a0) + (f3 * iocVar.Z));
                            int i12 = i4;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float pow = (float) Math.pow(c2, 24.0d);
                            float A = mlb.A(c, 0.38f, 0.36f, 1.5f);
                            float f6 = pow * 0.1f * 1.5f;
                            int d = ioc.d(A, 0.089999996f, f6, a, a2);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i7], fArr5[i9]);
                            path.lineTo(fArr5[i8], fArr5[i10]);
                            path.lineTo(fArr6[i8], fArr6[i10]);
                            path.lineTo(fArr6[i7], fArr6[i9]);
                            path.close();
                            paint2.setStrokeWidth(iocVar.q * 0.6f);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(ioc.d(A * 0.75f, 0.067499995f, f6 * 0.75f, a, a2));
                            paint2.setStrokeWidth(iocVar.q * 0.7f);
                            canvas.drawLine(fArr6[i7], fArr6[i9], fArr6[i8], fArr6[i10], paint2);
                            i4 = i12 + 1;
                            length = i11;
                            fArr2 = fArr5;
                            iArr = iArr2;
                            fArr3 = fArr6;
                            i = 1;
                        }
                    }
                }
                if (this.c) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.d);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(save);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        boolean z;
        Boolean bool;
        int i2 = 2;
        switch (this.a) {
            case 0:
                TextPaint textPaint = (TextPaint) this.e;
                int w0 = cmb.w0(null, cmb.L6, false);
                int red = Color.red(w0);
                int green = Color.green(w0);
                int blue = Color.blue(w0);
                jb2 jb2Var = (jb2) this.d;
                jb2Var.b(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.g7, false));
                RectF rectF = (RectF) this.b;
                rectF.set(gm.L(1.0f), gm.L(1.0f), getMeasuredWidth() - gm.L(1.0f), gm.L(73.0f));
                cmb.W1.setColor(Color.argb((int) (jb2Var.getProgress() * 43.0f), red, green, blue));
                canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), cmb.W1);
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), gm.L(74.0f));
                cmb.s0.setColor(Color.argb((int) ((1.0f - jb2Var.getProgress()) * 31.0f), red, green, blue));
                canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), cmb.s0);
                boolean z2 = this.c;
                String M0 = jb6.M0(z2 ? 2131752160 : 2131752161, null);
                int ceil = (int) Math.ceil(textPaint.measureText(M0));
                textPaint.setColor(cmb.w0(null, cmb.F6, false));
                canvas.drawText(M0, (getMeasuredWidth() - ceil) / 2, gm.L(96.0f), textPaint);
                int i3 = 0;
                while (i3 < i2) {
                    int L = gm.L(i3 == 0 ? 21.0f : 53.0f);
                    cmb.s0.setColor(Color.argb(i3 == 0 ? 204 : 90, red, green, blue));
                    canvas.drawCircle(gm.L(22.0f), L, gm.L(11.0f), cmb.s0);
                    int i4 = r8;
                    while (true) {
                        if (i4 < (z2 ? 3 : 2)) {
                            cmb.s0.setColor(Color.argb(i4 == 0 ? 204 : 90, red, green, blue));
                            if (z2) {
                                float f2 = i4 * 7;
                                rectF.set(gm.L(41.0f), L - gm.L(8.3f - f2), getMeasuredWidth() - gm.L(i4 != 0 ? 48.0f : 72.0f), L - gm.L(5.3f - f2));
                                canvas.drawRoundRect(rectF, gm.N(1.5f), gm.N(1.5f), cmb.s0);
                            } else {
                                int i5 = i4 * 10;
                                rectF.set(gm.L(41.0f), L - gm.L(7 - i5), getMeasuredWidth() - gm.L(i4 != 0 ? 48.0f : 72.0f), L - gm.L(3 - i5));
                                canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
                            }
                            i4++;
                        }
                    }
                    i3++;
                    i2 = 2;
                    r8 = 0;
                }
                break;
            case 1:
                RectF rectF2 = (RectF) this.b;
                dh4 dh4Var = (dh4) this.e;
                int L2 = (dh4Var.r1 - dh4Var.t0) - gm.L(8.0f);
                getMeasuredHeight();
                int i6 = dh4Var.t0;
                int i7 = gm.m;
                int i8 = L2 + i7;
                if (this.c) {
                    int i9 = i7 << 1;
                    if (i8 + i6 < i9) {
                        i8 -= Math.min(i7, (i9 - i8) - i6);
                        f = 1.0f - Math.min(1.0f, (r6 << 1) / gm.m);
                    } else {
                        f = 1.0f;
                    }
                    int i10 = dh4Var.t0;
                    int i11 = i8 + i10;
                    int i12 = gm.m;
                    if (i11 < i12) {
                        i = Math.min(i12, (i12 - i8) - i10);
                        dh4Var.s0.setBounds(0, i8, getMeasuredWidth(), getMeasuredHeight());
                        dh4Var.s0.draw(canvas);
                        if (f != 1.0f) {
                            cmb.s0.setColor(cmb.w0(null, cmb.g5, false));
                            rectF2.set(dh4Var.u0, dh4Var.t0 + i8, getMeasuredWidth() - dh4Var.u0, gm.L(24.0f) + dh4Var.t0 + i8);
                            canvas.drawRoundRect(rectF2, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
                        }
                        if (i > 0) {
                            cmb.s0.setColor(cmb.w0(null, cmb.g5, false));
                            canvas.drawRect(dh4Var.u0, gm.m - i, getMeasuredWidth() - dh4Var.u0, gm.m, cmb.s0);
                        }
                        z = i <= gm.m / 2;
                        bool = (Boolean) this.d;
                        if (bool != null || bool.booleanValue() != z) {
                            boolean z3 = gm.B(cmb.v0(cmb.g5, dh4Var.J0)) <= 0.721f;
                            r8 = gm.B(cmb.v(cmb.v0(cmb.r8, dh4Var.J0), 855638016)) > 0.721f ? 1 : 0;
                            this.d = Boolean.valueOf(z);
                            boolean z4 = z3;
                            if (!z) {
                                z4 = r8;
                            }
                            gm.n3(dh4Var.getWindow(), z4);
                            break;
                        }
                    }
                } else {
                    f = 1.0f;
                }
                i = 0;
                dh4Var.s0.setBounds(0, i8, getMeasuredWidth(), getMeasuredHeight());
                dh4Var.s0.draw(canvas);
                if (f != 1.0f) {
                }
                if (i > 0) {
                }
                if (i <= gm.m / 2) {
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (gm.B(cmb.v0(cmb.g5, dh4Var.J0)) <= 0.721f) {
                }
                if (gm.B(cmb.v(cmb.v0(cmb.r8, dh4Var.J0), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z);
                boolean z42 = z3;
                if (!z) {
                }
                gm.n3(dh4Var.getWindow(), z42);
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((jb2) this.d).f);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setContentDescription(jb6.M0(this.c ? 2131752160 : 2131752161, null));
                break;
            case 1:
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                dh4 dh4Var = (dh4) this.e;
                if (motionEvent.getAction() != 0 || dh4Var.r1 == 0 || motionEvent.getY() >= dh4Var.r1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                dh4Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ((dh4) this.e).F0();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i2);
                dh4 dh4Var = (dh4) this.e;
                fv fvVar = dh4Var.m1;
                dh4Var.s1 = true;
                int i3 = dh4Var.u0;
                setPadding(i3, gm.m, i3, 0);
                dh4Var.s1 = false;
                int b = (dh4Var.n1.b() * gm.L(48.0f)) + gm.L(48.0f);
                int i4 = dh4Var.t0;
                int i5 = b + i4 + gm.m;
                int i6 = size / 5;
                int i7 = ((double) i5) < ((double) i6) * 3.2d ? 0 : i6 << 1;
                if (i7 != 0 && i5 < size) {
                    i7 -= size - i5;
                }
                if (i7 != 0) {
                    i4 = i7;
                }
                if (fvVar.getPaddingTop() != i4) {
                    dh4Var.s1 = true;
                    fvVar.setPadding(gm.L(10.0f), i4, gm.L(10.0f), 0);
                    dh4Var.s1 = false;
                }
                this.c = i5 >= size;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(i5, size), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.c ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i, i2, i3, i4);
                moc mocVar = (moc) this.e;
                mocVar.j0 = -1;
                mocVar.b(mocVar.d0, mocVar.g0);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((dh4) this.e).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 1:
                if (!((dh4) this.e).s1) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb2(dh4 dh4Var, Activity activity) {
        super(activity);
        this.a = (byte) 1;
        this.e = dh4Var;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb2(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                this.c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(cmb.f0(-12763843, 0, -1));
                textView.setPadding(gm.L(20.0f), 0, gm.L(20.0f), 0);
                textView.setText(jb6.M0(2131752542, null).toUpperCase());
                textView.setTypeface(gm.o());
                addView(textView, qoe.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(cmb.f0(-12763843, 0, -1));
                textView2.setPadding(gm.L(20.0f), 0, gm.L(20.0f), 0);
                textView2.setText(jb6.M0(2131745374, null).toUpperCase());
                textView2.setTypeface(gm.o());
                addView(textView2, qoe.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.e = textView3;
                textView3.setTypeface(gm.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(R.drawable.photobadge);
                textView3.setMinWidth(gm.L(23.0f));
                textView3.setPadding(gm.L(8.0f), 0, gm.L(8.0f), gm.L(1.0f));
                addView(textView3, qoe.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb2(moc mocVar, Context context) {
        super(context);
        this.a = (byte) 4;
        this.e = mocVar;
        this.d = new Matrix();
        this.b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
