package com.google.firebase.remoteconfig;

import java.util.Set;

/* loaded from: classes.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {
    private final Set updatedKeys;

    AutoValue_ConfigUpdate(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.updatedKeys = set;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public Set getUpdatedKeys() {
        return this.updatedKeys;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.updatedKeys + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.updatedKeys.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    public int hashCode() {
        return this.updatedKeys.hashCode() ^ 1000003;
    }
}
