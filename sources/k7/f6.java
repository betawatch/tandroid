package k7;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class f6 {
    public static ArrayList a(org.telegram.ui.ActionBar.l6 l6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, i10));
        }
        return arrayList;
    }
}
