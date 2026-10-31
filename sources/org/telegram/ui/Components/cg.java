package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i10 = ((fg) this.b).w;
                bi0 bi0Var = (bi0) super.get(obj);
                if (bi0Var != null) {
                    return bi0Var;
                }
                eg egVar = (eg) obj;
                bi0 bi0Var2 = new bi0(egVar.c, org.telegram.messenger.i0.L(i10), org.telegram.messenger.i0.L(i10));
                put(egVar, bi0Var2);
                return bi0Var2;
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
                ((sc.h) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
