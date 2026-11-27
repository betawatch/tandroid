// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ke5 implements ep3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ke5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ep3
    public final void dispose() {
        switch (this.a) {
            case 0:
                le5 le5Var = (le5) this.b;
                le5Var.c.removeCallbacks((nsb) this.c);
                return;
            default:
                String str = (String) this.b;
                cj7 cj7Var = (cj7) this.c;
                synchronized (dj7.b) {
                    LinkedHashMap linkedHashMap = dj7.c;
                    dj7 dj7Var = (dj7) linkedHashMap.get(str);
                    if (dj7Var != null) {
                        dj7Var.a.remove(cj7Var);
                        if (dj7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            dj7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
