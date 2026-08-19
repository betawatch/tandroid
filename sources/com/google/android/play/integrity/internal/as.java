package com.google.android.play.integrity.internal;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class as extends ao implements Set, j$.util.Set {
    private transient ar a;

    as() {
    }

    public static as h() {
        return au.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as) {
            ((as) obj).i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final ar f() {
        ar arVar = this.a;
        if (arVar != null) {
            return arVar;
        }
        ar g = g();
        this.a = g;
        return g;
    }

    abstract ar g();

    abstract boolean i();
}
