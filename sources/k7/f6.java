package k7;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
