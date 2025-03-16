package com.google.firebase.remoteconfig.interop.rollouts;

import java.util.Set;

/* loaded from: classes3.dex */
public abstract class RolloutsState {
    public static RolloutsState create(Set set) {
        return new AutoValue_RolloutsState(set);
    }

    public abstract Set getRolloutAssignments();
}
