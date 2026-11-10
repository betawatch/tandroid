package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fg(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i7 = ((ig) this.b).w;
                zg0 zg0Var = (zg0) super.get(obj);
                if (zg0Var != null) {
                    return zg0Var;
                }
                hg hgVar = (hg) obj;
                zg0 zg0Var2 = new zg0(hgVar.c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                put(hgVar, zg0Var2);
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
