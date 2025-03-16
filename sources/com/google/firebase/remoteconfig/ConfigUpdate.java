package com.google.firebase.remoteconfig;

import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ConfigUpdate {
    public static ConfigUpdate create(Set set) {
        return new AutoValue_ConfigUpdate(set);
    }

    public abstract Set getUpdatedKeys();
}
