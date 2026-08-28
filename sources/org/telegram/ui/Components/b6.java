package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b6 {
    public static final ch.g h = new ch.g("progress", 5);
    public final TextPaint c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.t1 g;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public float e = 0.0f;
    public int f = 1;

    public b6(org.telegram.ui.Cells.t1 t1Var, TextPaint textPaint) {
        this.c = textPaint;
        this.g = t1Var;
    }

    public final int a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float f10 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            f10 += ((StaticLayout) arrayList.get(i9)).getLineWidth(0);
        }
        return (int) Math.ceil(f10);
    }

    public final void b(int i9, boolean z10) {
        ArrayList arrayList;
        int i10 = this.f;
        ArrayList arrayList2 = this.a;
        if (i10 != i9 || arrayList2.isEmpty()) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.d = null;
            }
            ArrayList arrayList3 = this.b;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            arrayList2.clear();
            Locale locale = Locale.US;
            int i11 = this.f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i9);
            String sb5 = sb4.toString();
            boolean z11 = i9 > this.f;
            this.f = i9;
            this.e = 0.0f;
            int i12 = 0;
            while (i12 < sb5.length()) {
                int i13 = i12 + 1;
                String substring = sb5.substring(i12, i13);
                String substring2 = (arrayList3.isEmpty() || i12 >= sb3.length()) ? null : sb3.substring(i12, i13);
                if (substring2 == null || !substring2.equals(substring)) {
                    arrayList = arrayList3;
                    arrayList2.add(new StaticLayout(substring, this.c, (int) Math.ceil(r14.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    arrayList2.add((StaticLayout) arrayList3.get(i12));
                    arrayList3.set(i12, null);
                    arrayList = arrayList3;
                }
                i12 = i13;
                arrayList3 = arrayList;
            }
            ArrayList arrayList4 = arrayList3;
            if (z10 && !arrayList4.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, z11 ? -1.0f : 1.0f, 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(150L);
                this.d.addListener(new org.telegram.ui.xp(this, 2));
                this.d.start();
            }
            this.g.invalidate();
        }
    }
}
