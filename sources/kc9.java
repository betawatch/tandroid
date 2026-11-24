// default package

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class kc9 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(jc9 jc9Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap weakHashMap = b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(jc9Var);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(jc9Var, sparseArray);
            }
            sparseArray.append(i, new ic9(colorStateList, jc9Var.a.getConfiguration(), theme));
        }
    }
}
