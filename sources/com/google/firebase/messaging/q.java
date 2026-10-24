package com.google.firebase.messaging;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class q extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str) {
        super(str);
        n6.l.g(str, "Detail message must not be empty");
    }
}
