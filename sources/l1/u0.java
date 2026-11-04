package l1;

import java.util.LinkedHashMap;
import wd.y1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements wd.l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // wd.l0
    public final void dispose() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                v0 v0Var = (v0) this.c;
                synchronized (w0.b) {
                    LinkedHashMap linkedHashMap = w0.c;
                    w0 w0Var = (w0) linkedHashMap.get(str);
                    if (w0Var != null) {
                        w0Var.a.remove(v0Var);
                        if (w0Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            w0Var.stopWatching();
                        }
                    }
                }
                return;
            default:
                xd.c cVar = (xd.c) this.b;
                cVar.c.removeCallbacks((y1) this.c);
                return;
        }
    }
}
