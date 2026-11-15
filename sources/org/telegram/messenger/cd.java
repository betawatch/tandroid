package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class cd {
    public boolean a;
    public long b;
    public int c;
    public int d;
    public ArrayList e;

    public final void a() {
        ArrayList arrayList = this.e;
        this.e = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((Runnable) arrayList.get(i7)).run();
        }
    }
}
