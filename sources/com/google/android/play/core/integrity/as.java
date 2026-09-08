package com.google.android.play.core.integrity;

import a9.g0;
import a9.i0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class as extends g0 {
    final TaskCompletionSource a;
    final a9.e b;
    private final i0 c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, a9.e eVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new i0("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = eVar;
    }

    @Override // a9.h0
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        com.google.android.gms.common.api.f a2 = this.e.a(bundle);
        if (a2 != null) {
            this.a.trySetException(a2);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            i0 i0Var = this.c;
            Object[] objArr = {this.d};
            i0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", i0.d(i0Var.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(TLObject.FLAG_29);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        i0 i0Var2 = this.c;
        Object[] objArr2 = new Object[0];
        i0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", i0.d(i0Var2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
