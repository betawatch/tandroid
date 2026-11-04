package b8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class oc {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i3) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h0.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h0.i iVar = new h0.i(resources, theme);
        synchronized (h0.j.c) {
            try {
                SparseArray sparseArray = (SparseArray) h0.j.b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h0.h) sparseArray.get(i3)) != null) {
                    if (hVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.c != 0) {
                            }
                            colorStateList2 = hVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i3);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = h0.j.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i3, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateList = h0.c.a(resources, resources.getXml(i3), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i3, theme);
        }
        h0.j.a(iVar, i3, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable b(Context context, int i3) {
        return m.m2.d().g(context, i3);
    }
}
