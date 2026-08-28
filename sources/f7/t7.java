package f7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class t7 {
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i9) {
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
                if (sparseArray != null && sparseArray.size() > 0 && (iVar = (h0.i) sparseArray.get(i9)) != null) {
                    if (iVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (iVar.c != 0) {
                            }
                            colorStateList2 = iVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i9);
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
        resources.getValue(i9, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateList = h0.c.a(resources, resources.getXml(i9), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? h0.h.a(resources, i9, theme) : resources.getColorStateList(i9);
        }
        h0.k.a(jVar, i9, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable b(Context context, int i9) {
        return m.n2.d().g(context, i9);
    }
}
