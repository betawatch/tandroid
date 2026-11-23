package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class mv {
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
