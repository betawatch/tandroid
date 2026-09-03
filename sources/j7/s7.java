package j7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class s7 {
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h0.i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h0.j jVar = new h0.j(resources, theme);
        synchronized (h0.k.c) {
            try {
                SparseArray sparseArray = (SparseArray) h0.k.b.get(jVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (iVar = (h0.i) sparseArray.get(i10)) != null) {
                    if (iVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (iVar.c != 0) {
                            }
                            colorStateList2 = iVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i10);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = h0.k.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateList = h0.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e6) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e6);
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? h0.h.a(resources, i10, theme) : resources.getColorStateList(i10);
        }
        h0.k.a(jVar, i10, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable b(Context context, int i10) {
        return m.m2.d().g(context, i10);
    }
}
