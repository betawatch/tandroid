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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
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
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0059, code lost:
    
        if (r22 > r21.f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i7, boolean z9) {
        String sb2;
        String sb3;
        boolean z10;
        float f10;
        int i10;
        String str;
        if (this.f == i7 && z9) {
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
            sb2 = jg.g.j(this.f, "#");
            sb3 = jg.g.j(i7, "#");
        } else {
            Locale locale2 = Locale.US;
            int i11 = this.f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i11);
            sb2 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i7);
            sb3 = sb5.toString();
        }
        TextPaint textPaint = this.c;
        this.r = textPaint.measureText(sb3);
        float measureText = textPaint.measureText(sb2);
        this.s = measureText;
        boolean z11 = this.n && this.r != measureText;
        this.f = i7;
        float f11 = 0.0f;
        this.e = 0.0f;
        int i12 = 0;
        while (i12 < sb3.length()) {
            int i13 = i12 + 1;
            String substring = sb3.substring(i12, i13);
            String substring2 = (arrayList.isEmpty() || i12 >= sb2.length()) ? null : sb2.substring(i12, i13);
            if (z11 || substring2 == null || !substring2.equals(substring)) {
                if (z11 && substring2 == null) {
                    i10 = i13;
                    f10 = f11;
                    str = substring;
                    arrayList.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    f10 = f11;
                    i10 = i13;
                    str = substring;
                }
                arrayList2.add(new StaticLayout(str, textPaint, (int) Math.ceil(textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList2.add((StaticLayout) arrayList.get(i12));
                arrayList.set(i12, null);
                f10 = f11;
                i10 = i13;
            }
            f11 = f10;
            i12 = i10;
        }
        float f12 = f11;
        if (z9 && !arrayList.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? -1.0f : 1.0f, f12);
            this.d = ofFloat;
            ofFloat.setDuration(this.h ? 180L : 150L);
            this.d.addListener(new e60(this, 5));
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
        float f10;
        float f11;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        float L = this.h ? org.telegram.messenger.g0.L(4.0f) : height;
        if (this.n) {
            f10 = (getMeasuredWidth() - this.r) / 2.0f;
            f11 = ((getMeasuredWidth() - this.s) / 2.0f) - f10;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f10, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.b;
        int max = Math.max(size, arrayList2.size());
        int i7 = 0;
        while (i7 < max) {
            canvas.save();
            StaticLayout staticLayout = i7 < arrayList2.size() ? (StaticLayout) arrayList2.get(i7) : null;
            StaticLayout staticLayout2 = i7 < arrayList.size() ? (StaticLayout) arrayList.get(i7) : null;
            float f12 = this.e;
            TextPaint textPaint = this.c;
            if (f12 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f12 * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.e - 1.0f) * L);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.e) * 255.0f));
                        canvas.translate(0.0f, this.e * L);
                    }
                } else {
                    textPaint.setAlpha(org.telegram.messenger.qs.e4);
                }
            } else if (f12 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f12) * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.e + 1.0f) * L);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i7 == max - 1 || staticLayout != null) {
                        textPaint.setAlpha((int) ((this.e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.e * L);
                    } else {
                        textPaint.setAlpha(org.telegram.messenger.qs.e4);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(org.telegram.messenger.qs.e4);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.translate(staticLayout2 != null ? staticLayout2.getLineWidth(0) : staticLayout.getLineWidth(0) + org.telegram.messenger.g0.L(1.0f), 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                f11 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f11;
            }
            i7++;
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z9) {
        this.n = z9;
    }

    public void setProgress(float f10) {
        if (this.e == f10) {
            return;
        }
        this.e = f10;
        invalidate();
    }

    public void setTextColor(int i7) {
        this.c.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        this.c.setTextSize(org.telegram.messenger.g0.L(i7));
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

    public void setOnTextWidthProgressChangedListener(ib0 ib0Var) {
    }
}
