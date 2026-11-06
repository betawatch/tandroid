package c8;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ma {
    public static ArrayList a(org.telegram.ui.ActionBar.s6 s6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i7));
        }
        return arrayList;
    }
}
