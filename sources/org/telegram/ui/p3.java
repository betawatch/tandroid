package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p3 {
    public TextPaint a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray i = new SparseArray();
    public final SparseArray j = new SparseArray();
    public final SparseArray k = new SparseArray();
    public final SparseArray l = new SparseArray();
    public final SparseArray m = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseArray o = new SparseArray();
    public final SparseArray p = new SparseArray();
    public final SparseArray q = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray t = new SparseArray();
    public final SparseArray u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray w = new SparseArray();
    public final SparseArray x = new SparseArray();
    public final SparseArray y = new SparseArray();
    public final SparseArray z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(i50 i50Var, SparseArray sparseArray) {
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int keyAt = sparseArray.keyAt(i3);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i3);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
                }
            }
        }
    }

    public static void b(int i3, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i10 = i3 & 1;
        if (i10 != 0 && (i3 & 2) != 0) {
            textPaint.setTypeface(typeface2);
            return;
        }
        if (i10 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i3 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else {
            if ((i3 & 4) != 0) {
                return;
            }
            textPaint.setTypeface(typeface);
        }
    }
}
