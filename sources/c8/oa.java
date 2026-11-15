package c8;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class oa {
    public static ArrayList a(org.telegram.ui.ActionBar.r6 r6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, i7));
        }
        return arrayList;
    }
}
