package oi;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z3 {
    public String a;
    public boolean b;
    public String c;
    public HashMap d;
    public final ArrayList e = new ArrayList();

    public final String a(String str) {
        HashMap hashMap = this.d;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get(str);
    }

    public final boolean b(String str) {
        HashMap hashMap = this.d;
        return hashMap != null && hashMap.containsKey(str);
    }
}
