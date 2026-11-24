// default package

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class kwe {
    public static ArrayList a(bnb bnbVar, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, i));
        }
        return arrayList;
    }
}
