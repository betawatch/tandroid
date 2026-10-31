package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class cw {
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
