package kc;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                hj0 hj0Var = (hj0) super.get(obj);
                if (hj0Var != null) {
                    return hj0Var;
                }
                pg pgVar = (pg) obj;
                hj0 hj0Var2 = new hj0(pgVar.c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                put(pgVar, hj0Var2);
                return hj0Var2;
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
