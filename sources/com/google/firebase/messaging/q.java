package com.google.firebase.messaging;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class q extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str) {
        super(str);
        n6.l.g(str, "Detail message must not be empty");
    }
}
