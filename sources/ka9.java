// default package

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ka9 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(ja9 ja9Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap weakHashMap = b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(ja9Var);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(ja9Var, sparseArray);
            }
            sparseArray.append(i, new ia9(colorStateList, ja9Var.a.getConfiguration(), theme));
        }
    }
}
