package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class jv {
    public boolean a;
    public boolean b;
    public long c = 104857600;

    public final boolean a() {
        return this.a || this.b;
    }

    public void b() {
        if (a()) {
            this.b = false;
            this.a = false;
        } else {
            this.a = true;
            this.b = true;
        }
    }
}
