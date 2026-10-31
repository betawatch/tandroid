package org.telegram.messenger;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e3 {
    public int a;
    public String b;
    public String c;
    public HashSet d;

    public final void a(String str) {
        int i10 = this.a;
        js.e.remove(Integer.valueOf(hashCode()));
        HashSet hashSet = this.d;
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        ConnectionsManager.getInstance(i10);
        ConnectionsManager.native_receivedCaptchaResult(i10, iArr, str);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c);
    }
}
