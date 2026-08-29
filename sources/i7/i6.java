package i7;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static ArrayList a(org.telegram.ui.ActionBar.h6 h6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i10));
        }
        return arrayList;
    }
}
