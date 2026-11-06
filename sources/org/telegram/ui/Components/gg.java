package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i7 = ((jg) this.b).w;
                zg0 zg0Var = (zg0) super.get(obj);
                if (zg0Var != null) {
                    return zg0Var;
                }
                ig igVar = (ig) obj;
                zg0 zg0Var2 = new zg0(igVar.c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                put(igVar, zg0Var2);
                return zg0Var2;
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
