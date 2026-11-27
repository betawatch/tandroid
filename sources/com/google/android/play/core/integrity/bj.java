package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class bj extends y {
    final /* synthetic */ bk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j) {
        super(str, j);
        this.a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        long j;
        j = this.a.e;
        bundle.putLong("cloud.prj", j);
        return this.a.c.c(activity, bundle);
    }
}
