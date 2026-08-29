package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import m8.h0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
abstract class bm extends h0 {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // m8.h0
    public final void a(Exception exc) {
        if (!(exc instanceof m8.d)) {
            super.a(exc);
        } else if (bn.l(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
