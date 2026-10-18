package com.google.firebase.messaging;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class q extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str) {
        super(str);
        n6.l.g(str, "Detail message must not be empty");
    }
}
