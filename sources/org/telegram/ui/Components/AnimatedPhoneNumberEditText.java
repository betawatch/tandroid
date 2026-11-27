package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class AnimatedPhoneNumberEditText extends gg5 {
    public static final /* synthetic */ int c2 = 0;
    public final ArrayList Q1;
    public final ArrayList R1;
    public final TextPaint S1;
    public ObjectAnimator T1;
    public float U1;
    public String V1;
    public final tm W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public Boolean Z1;
    public String a2;
    public ds6 b2;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.Q1 = new ArrayList();
        this.R1 = new ArrayList();
        this.S1 = new TextPaint(1);
        this.V1 = "";
        this.W1 = new tm(this, (byte) 0);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
    }

    @Override // gg5
    public final void A(int i) {
        ArrayList arrayList = this.X1;
        if (i < arrayList.size()) {
            this.N1.setAlpha((int) (((Float) arrayList.get(i)).floatValue() * 255.0f));
        }
    }

    public final /* synthetic */ void B(String str, boolean z) {
        this.X1.clear();
        ArrayList arrayList = this.Y1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vpa) obj).d();
        }
        if (z) {
            return;
        }
        super.setHintText(str);
    }

    @Override // gg5
    public String getHintText() {
        return this.a2;
    }

    public float getProgress() {
        return this.U1;
    }

    @Override // gg5
    public void setHintText(String str) {
        boolean isEmpty;
        float f;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z = !isEmpty2;
        Boolean bool = this.Z1;
        ArrayList arrayList = this.X1;
        ArrayList arrayList2 = this.Y1;
        if (bool == null || bool.booleanValue() != z) {
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((vpa) obj).d();
            }
            arrayList2.clear();
            this.Z1 = Boolean.valueOf(z);
            isEmpty = TextUtils.isEmpty(getText());
        } else {
            isEmpty = false;
        }
        String str2 = !isEmpty2 ? str : this.a2;
        if (str2 == null) {
            str2 = "";
        }
        this.a2 = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            ds6 ds6Var = new ds6((Object) this, z, (Object) str, (byte) 6);
            Runnable runnable = this.b2;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f2 = 0.0f;
                if (isEmpty2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                    f2 = 1.0f;
                }
                vpa vpaVar = new vpa(Integer.valueOf(i2), this.W1);
                float f3 = f2 * 100.0f;
                wpa wpaVar = new wpa(f3);
                wpaVar.b(500.0f);
                wpaVar.a(1.0f);
                wpaVar.i = f3;
                vpaVar.m = wpaVar;
                vpaVar.b = 100.0f * f;
                vpaVar.c = true;
                arrayList2.add(vpaVar);
                arrayList.add(Float.valueOf(f));
                postDelayed(new c1(vpaVar, (byte) 16), i2 * 5);
            }
            this.b2 = ds6Var;
            postDelayed(ds6Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        TextPaint textPaint;
        ArrayList arrayList2 = this.R1;
        if (arrayList2 == null || (arrayList = this.Q1) == null || Objects.equals(this.V1, str)) {
            return;
        }
        ObjectAnimator objectAnimator = this.T1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.T1 = null;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        int i = 0;
        boolean z = TextUtils.isEmpty(this.V1) && !TextUtils.isEmpty(str);
        this.U1 = 0.0f;
        while (i < str.length()) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            String substring2 = (arrayList2.isEmpty() || i >= this.V1.length()) ? null : this.V1.substring(i, i2);
            if (z || substring2 == null || !substring2.equals(substring)) {
                TextPaint textPaint2 = this.S1;
                if (z && substring2 == null) {
                    textPaint = textPaint2;
                    arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    textPaint = textPaint2;
                }
                arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList.add((StaticLayout) arrayList2.get(i));
                arrayList2.set(i, null);
            }
            i = i2;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.T1 = ofFloat;
            ofFloat.setDuration(150L);
            this.T1.addListener(new h0(this, (byte) 8));
            this.T1.start();
        }
        this.V1 = str;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.U1 == f) {
            return;
        }
        this.U1 = f;
        invalidate();
    }

    @Override // cu3, android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.S1.setColor(i);
    }

    @Override // gg5, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.S1.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }
}
