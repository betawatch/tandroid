package ic;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 1:
                int i10 = ((tg) this.b).v;
                xi0 xi0Var = (xi0) super.get(obj);
                if (xi0Var != null) {
                    return xi0Var;
                }
                sg sgVar = (sg) obj;
                int i11 = sgVar.c;
                xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(i10), String.valueOf(i11), AndroidUtilities.dp(i10));
                put(sgVar, xi0Var2);
                return xi0Var2;
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
                ((i) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
