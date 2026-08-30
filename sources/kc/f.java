package kc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                int i10 = ((qg) this.b).v;
                gj0 gj0Var = (gj0) super.get(obj);
                if (gj0Var != null) {
                    return gj0Var;
                }
                pg pgVar = (pg) obj;
                int i11 = pgVar.c;
                gj0 gj0Var2 = new gj0(i11, AndroidUtilities.dp(i10), String.valueOf(i11), AndroidUtilities.dp(i10));
                put(pgVar, gj0Var2);
                return gj0Var2;
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
