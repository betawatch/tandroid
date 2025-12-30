package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
final class ap extends an {
    private final ar a;

    ap(ar arVar, int i) {
        super(arVar.size(), i);
        this.a = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
