package o8;

import h7.wa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k {
    public transient c a;
    public transient h7.m b;
    public transient wa c;

    public abstract wa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((h0) this).a().equals(((h0) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().b.hashCode();
    }

    public final String toString() {
        return a().b.toString();
    }
}
