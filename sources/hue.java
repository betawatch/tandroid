// default package

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class hue {
    public static ArrayList a(alb albVar, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, i));
        }
        return arrayList;
    }
}
