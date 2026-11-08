package ae;

import java.util.LinkedHashMap;
import m1.u0;
import m1.v0;
import zd.l0;
import zd.y1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // zd.l0
    public final void dispose() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                eVar.c.removeCallbacks((y1) this.c);
                return;
            default:
                String str = (String) this.b;
                u0 u0Var = (u0) this.c;
                synchronized (v0.b) {
                    LinkedHashMap linkedHashMap = v0.c;
                    v0 v0Var = (v0) linkedHashMap.get(str);
                    if (v0Var != null) {
                        v0Var.a.remove(u0Var);
                        if (v0Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            v0Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
