// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc5 implements no3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jc5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // no3
    public final void dispose() {
        switch (this.a) {
            case 0:
                kc5 kc5Var = (kc5) this.b;
                kc5Var.c.removeCallbacks((nob) this.c);
                return;
            default:
                String str = (String) this.b;
                tg7 tg7Var = (tg7) this.c;
                synchronized (ug7.b) {
                    LinkedHashMap linkedHashMap = ug7.c;
                    ug7 ug7Var = (ug7) linkedHashMap.get(str);
                    if (ug7Var != null) {
                        ug7Var.a.remove(tg7Var);
                        if (ug7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            ug7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
