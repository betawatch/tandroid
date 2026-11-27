// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                dj7 dj7Var = (dj7) this.c;
                synchronized (ej7.b) {
                    LinkedHashMap linkedHashMap = ej7.c;
                    ej7 ej7Var = (ej7) linkedHashMap.get(str);
                    if (ej7Var != null) {
                        ej7Var.a.remove(dj7Var);
                        if (ej7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            ej7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
