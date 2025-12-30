package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public final class bp implements com.google.android.play.integrity.internal.ay {
    private final com.google.android.play.integrity.internal.bd a;
    private final com.google.android.play.integrity.internal.bd b;
    private final com.google.android.play.integrity.internal.bd c;

    public bp(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2, com.google.android.play.integrity.internal.bd bdVar3, com.google.android.play.integrity.internal.bd bdVar4) {
        this.a = bdVar;
        this.b = bdVar2;
        this.c = bdVar3;
    }

    @Override // com.google.android.play.integrity.internal.bd
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.a.a(), (com.google.android.play.integrity.internal.s) this.b.a(), ((au) this.c).a(), new j());
    }
}
