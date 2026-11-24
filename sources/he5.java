// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class he5 implements xp3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ he5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // xp3
    public final void dispose() {
        switch (this.a) {
            case 0:
                ie5 ie5Var = (ie5) this.b;
                ie5Var.c.removeCallbacks((oqb) this.c);
                return;
            default:
                String str = (String) this.b;
                wi7 wi7Var = (wi7) this.c;
                synchronized (xi7.b) {
                    LinkedHashMap linkedHashMap = xi7.c;
                    xi7 xi7Var = (xi7) linkedHashMap.get(str);
                    if (xi7Var != null) {
                        xi7Var.a.remove(wi7Var);
                        if (xi7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            xi7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
