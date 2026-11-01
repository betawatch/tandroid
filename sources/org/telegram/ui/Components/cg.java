package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                ci0 ci0Var = (ci0) super.get(obj);
                if (ci0Var != null) {
                    return ci0Var;
                }
                eg egVar = (eg) obj;
                ci0 ci0Var2 = new ci0(egVar.c, org.telegram.messenger.i0.L(i10), org.telegram.messenger.i0.L(i10));
                put(egVar, ci0Var2);
                return ci0Var2;
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
