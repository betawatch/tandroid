package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i10 = ((zg) this.b).v;
                xi0 xi0Var = (xi0) super.get(obj);
                if (xi0Var != null) {
                    return xi0Var;
                }
                yg ygVar = (yg) obj;
                xi0 xi0Var2 = new xi0(ygVar.c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                put(ygVar, xi0Var2);
                return xi0Var2;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((yc.g) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
