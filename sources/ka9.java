// default package

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
