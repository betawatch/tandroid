package b5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.versionedparcelable.ParcelImpl;
import h0.h;
import h0.i;
import h0.j;
import m.n2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i7) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        i iVar = new i(resources, theme);
        synchronized (j.c) {
            try {
                SparseArray sparseArray = (SparseArray) j.b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h) sparseArray.get(i7)) != null) {
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
        ThreadLocal threadLocal = j.a;
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
        j.a(iVar, i7, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable b(Context context, int i7) {
        return n2.d().g(context, i7);
    }

    public static d c(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
