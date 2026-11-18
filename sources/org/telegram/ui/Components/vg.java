package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vg extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vg(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 0:
                int i7 = ((yg) this.b).w;
                mh0 mh0Var = (mh0) super.get(obj);
                if (mh0Var != null) {
                    return mh0Var;
                }
                xg xgVar = (xg) obj;
                mh0 mh0Var2 = new mh0(xgVar.c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                put(xgVar, mh0Var2);
                return mh0Var2;
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
