package gc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 1:
                int i9 = ((qg) this.b).v;
                mi0 mi0Var = (mi0) super.get(obj);
                if (mi0Var != null) {
                    return mi0Var;
                }
                pg pgVar = (pg) obj;
                int i10 = pgVar.c;
                mi0 mi0Var2 = new mi0(i10, AndroidUtilities.dp(i9), String.valueOf(i10), AndroidUtilities.dp(i9));
                put(pgVar, mi0Var2);
                return mi0Var2;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((h) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
