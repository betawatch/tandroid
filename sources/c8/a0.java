package c8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class a0 {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i7) {
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
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h0.h) sparseArray.get(i7)) != null) {
                    if (hVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.c != 0) {
                            }
                            colorStateList2 = hVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i7);
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
        resources.getValue(i7, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            try {
                colorStateList = h0.c.a(resources, resources.getXml(i7), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i7, theme);
        }
        h0.j.a(iVar, i7, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable b(Context context, int i7) {
        return m.m2.d().g(context, i7);
    }
}
