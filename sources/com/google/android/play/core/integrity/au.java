package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
public final class au implements com.google.android.play.integrity.internal.ay {
    private final com.google.android.play.integrity.internal.bd a;
    private final com.google.android.play.integrity.internal.bd b;

    public au(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.a = bdVar;
        this.b = bdVar2;
    }

    @Override // com.google.android.play.integrity.internal.bd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.a, this.b);
    }
}
