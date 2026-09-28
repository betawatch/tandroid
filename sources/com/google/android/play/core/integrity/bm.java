package com.google.android.play.core.integrity;

import a9.k0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
abstract class bm extends k0 {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // a9.k0
    public final void a(Exception exc) {
        if (!(exc instanceof a9.f)) {
            super.a(exc);
        } else if (bn.l(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
