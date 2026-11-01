package org.telegram.messenger;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e3 {
    public int a;
    public String b;
    public String c;
    public HashSet d;

    public final void a(String str) {
        int i10 = this.a;
        ks.e.remove(Integer.valueOf(hashCode()));
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
