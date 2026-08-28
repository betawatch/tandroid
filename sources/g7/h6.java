package g7;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h6 {
    public static ArrayList a(org.telegram.ui.ActionBar.g6 g6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i9 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i9));
        }
        return arrayList;
    }
}
