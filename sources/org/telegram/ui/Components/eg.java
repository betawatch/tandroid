package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class eg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i3 = ((hg) this.b).w;
                ch0 ch0Var = (ch0) super.get(obj);
                if (ch0Var != null) {
                    return ch0Var;
                }
                gg ggVar = (gg) obj;
                ch0 ch0Var2 = new ch0(ggVar.c, org.telegram.messenger.g0.L(i3), org.telegram.messenger.g0.L(i3));
                put(ggVar, ch0Var2);
                return ch0Var2;
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
                ((vc.g) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
