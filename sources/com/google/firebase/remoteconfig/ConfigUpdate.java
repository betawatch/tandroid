package com.google.firebase.remoteconfig;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class ConfigUpdate {
    public abstract Set getUpdatedKeys();

    public static ConfigUpdate create(Set set) {
        return new AutoValue_ConfigUpdate(set);
    }
}
