package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
final class bj extends y {
    final /* synthetic */ bk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j3) {
        super(str, j3);
        this.a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        long j3;
        j3 = this.a.e;
        bundle.putLong("cloud.prj", j3);
        return this.a.c.c(activity, bundle);
    }
}
