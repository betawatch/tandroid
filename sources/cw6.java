// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class cw6 {
    public ArrayList a;

    public cw6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str == null) {
                lq5.j("category must not be null");
                return;
            }
            ArrayList arrayList2 = this.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.a = arrayList2;
            }
            if (!arrayList2.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final dw6 b() {
        if (this.a == null) {
            return dw6.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new dw6(bundle, this.a);
    }
}
