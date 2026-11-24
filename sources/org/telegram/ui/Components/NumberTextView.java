package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class NumberTextView extends View {
    public final ArrayList a;
    public final ArrayList b;
    public final TextPaint c;
    public ObjectAnimator d;
    public float e;
    public int f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;

    public NumberTextView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new TextPaint(1);
        this.e = 0.0f;
        this.f = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r22 < r21.f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004b, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0049, code lost:
    
        if (r22 > r21.f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, boolean z) {
        String valueOf;
        String valueOf2;
        boolean z2;
        float f;
        int i2;
        String str;
        if (this.f == i && z) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.a;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.h) {
            Locale locale = Locale.US;
            valueOf = hg9.j(this.f, "#");
            valueOf2 = hg9.j(i, "#");
        } else {
            Locale locale2 = Locale.US;
            valueOf = String.valueOf(this.f);
            valueOf2 = String.valueOf(i);
        }
        TextPaint textPaint = this.c;
        this.r = textPaint.measureText(valueOf2);
        float measureText = textPaint.measureText(valueOf);
        this.s = measureText;
        boolean z3 = this.n && this.r != measureText;
        this.f = i;
        float f2 = 0.0f;
        this.e = 0.0f;
        int i3 = 0;
        while (i3 < valueOf2.length()) {
            int i4 = i3 + 1;
            String substring = valueOf2.substring(i3, i4);
            String substring2 = (arrayList.isEmpty() || i3 >= valueOf.length()) ? null : valueOf.substring(i3, i4);
            if (z3 || substring2 == null || !substring2.equals(substring)) {
                if (z3 && substring2 == null) {
                    i2 = i4;
                    f = f2;
                    str = substring;
                    arrayList.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    f = f2;
                    i2 = i4;
                    str = substring;
                }
                arrayList2.add(new StaticLayout(str, textPaint, (int) Math.ceil(textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList2.add((StaticLayout) arrayList.get(i3));
                arrayList.set(i3, null);
                f = f2;
                i2 = i4;
            }
            f2 = f;
            i3 = i2;
        }
        float f3 = f2;
        if (z && !arrayList.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z2 ? -1.0f : 1.0f, f3);
            this.d = ofFloat;
            ofFloat.setDuration(this.h ? 180L : 150L);
            this.d.addListener(new v85(this, (byte) 23));
            this.d.start();
        }
        invalidate();
    }

    public float getOldTextWidth() {
        return this.s;
    }

    public float getProgress() {
        return this.e;
    }

    public float getTextWidth() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        float L = this.h ? gm.L(4.0f) : height;
        if (this.n) {
            f = (getMeasuredWidth() - this.r) / 2.0f;
            f2 = ((getMeasuredWidth() - this.s) / 2.0f) - f;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.b;
        int max = Math.max(size, arrayList2.size());
        int i = 0;
        while (i < max) {
            canvas.save();
            StaticLayout staticLayout = i < arrayList2.size() ? (StaticLayout) arrayList2.get(i) : null;
            StaticLayout staticLayout2 = i < arrayList.size() ? (StaticLayout) arrayList.get(i) : null;
            float f3 = this.e;
            TextPaint textPaint = this.c;
            if (f3 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f3 * 255.0f));
                    canvas.save();
                    canvas.translate(f2, (this.e - 1.0f) * L);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.e) * 255.0f));
                        canvas.translate(0.0f, this.e * L);
                    }
                } else {
                    textPaint.setAlpha(nm7.d4);
                }
            } else if (f3 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f3) * 255.0f));
                    canvas.save();
                    canvas.translate(f2, (this.e + 1.0f) * L);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i == max - 1 || staticLayout != null) {
                        textPaint.setAlpha((int) ((this.e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.e * L);
                    } else {
                        textPaint.setAlpha(nm7.d4);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(nm7.d4);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.translate(staticLayout2 != null ? staticLayout2.getLineWidth(0) : staticLayout.getLineWidth(0) + gm.L(1.0f), 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                f2 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f2;
            }
            i++;
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        if (this.e == f) {
            return;
        }
        this.e = f;
        invalidate();
    }

    public void setTextColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        this.c.setTextSize(gm.L(i));
        this.b.clear();
        this.a.clear();
        a(this.f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
        this.b.clear();
        this.a.clear();
        a(this.f, false);
    }

    public void setOnTextWidthProgressChangedListener(mp7 mp7Var) {
    }
}
