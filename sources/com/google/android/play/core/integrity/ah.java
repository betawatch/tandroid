package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
final class ah extends y {
    final /* synthetic */ ai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, String str, long j3) {
        super(str, j3);
        this.a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        return this.a.a.b(activity, bundle);
    }
}
