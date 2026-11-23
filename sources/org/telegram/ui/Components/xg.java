package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xg(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i7 = ((ah) this.b).w;
                oh0 oh0Var = (oh0) super.get(obj);
                if (oh0Var != null) {
                    return oh0Var;
                }
                zg zgVar = (zg) obj;
                oh0 oh0Var2 = new oh0(zgVar.c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                put(zgVar, oh0Var2);
                return oh0Var2;
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
