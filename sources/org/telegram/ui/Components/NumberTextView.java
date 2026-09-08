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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    public final void a(int i10, boolean z10) {
        String sb2;
        String sb3;
        boolean z11;
        int i11;
        String str;
        if (this.f == i10 && z10) {
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
            sb2 = i2.g.i(this.f, "#");
            sb3 = i2.g.i(i10, "#");
        } else {
            Locale locale2 = Locale.US;
            int i12 = this.f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i12);
            sb2 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i10);
            sb3 = sb5.toString();
        }
        TextPaint textPaint = this.c;
        this.r = textPaint.measureText(sb3);
        float measureText = textPaint.measureText(sb2);
        this.s = measureText;
        boolean z12 = this.n && this.r != measureText;
        this.f = i10;
        this.e = 0.0f;
        int i13 = 0;
        while (i13 < sb3.length()) {
            int i14 = i13 + 1;
            String substring = sb3.substring(i13, i14);
            String substring2 = (arrayList.isEmpty() || i13 >= sb2.length()) ? null : sb2.substring(i13, i14);
            if (z12 || substring2 == null || !substring2.equals(substring)) {
                if (z12 && substring2 == null) {
                    i11 = i14;
                    str = substring;
                    arrayList.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    i11 = i14;
                    str = substring;
                }
                arrayList2.add(new StaticLayout(str, textPaint, (int) Math.ceil(textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList2.add((StaticLayout) arrayList.get(i13));
                arrayList.set(i13, null);
                i11 = i14;
            }
            i13 = i11;
        }
        if (z10 && !arrayList.isEmpty()) {
            int i15 = 2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z11 ? -1.0f : 1.0f, 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(this.h ? 180L : 150L);
            this.d.addListener(new r80(this, i15));
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
        float f7;
        float f10;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        float dp = this.h ? AndroidUtilities.dp(4.0f) : height;
        if (this.n) {
            f7 = (getMeasuredWidth() - this.r) / 2.0f;
            f10 = ((getMeasuredWidth() - this.s) / 2.0f) - f7;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f7, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.b;
        int max = Math.max(size, arrayList2.size());
        int i10 = 0;
        while (i10 < max) {
            canvas.save();
            StaticLayout staticLayout = i10 < arrayList2.size() ? (StaticLayout) arrayList2.get(i10) : null;
            StaticLayout staticLayout2 = i10 < arrayList.size() ? (StaticLayout) arrayList.get(i10) : null;
            float f11 = this.e;
            TextPaint textPaint = this.c;
            if (f11 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f11 * 255.0f));
                    canvas.save();
                    canvas.translate(f10, (this.e - 1.0f) * dp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.e) * 255.0f));
                        canvas.translate(0.0f, this.e * dp);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f11 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f11) * 255.0f));
                    canvas.save();
                    canvas.translate(f10, (this.e + 1.0f) * dp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 == max - 1 || staticLayout != null) {
                        textPaint.setAlpha((int) ((this.e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.e * dp);
                    } else {
                        textPaint.setAlpha(255);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(255);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.translate(staticLayout2 != null ? staticLayout2.getLineWidth(0) : staticLayout.getLineWidth(0) + AndroidUtilities.dp(1.0f), 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                f10 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f10;
            }
            i10++;
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        if (this.e == f7) {
            return;
        }
        this.e = f7;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.c.setTextSize(AndroidUtilities.dp(i10));
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

    public void setOnTextWidthProgressChangedListener(wc0 wc0Var) {
    }
}
