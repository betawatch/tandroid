package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class ah extends y {
    final /* synthetic */ ai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, String str, long j) {
        super(str, j);
        this.a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        return this.a.a.b(activity, bundle);
    }
}
