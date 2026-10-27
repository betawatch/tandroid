package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b9.f0;
import b9.h0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class as extends f0 {
    final TaskCompletionSource a;
    final b9.d b;
    private final h0 c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, b9.d dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new h0("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = dVar;
    }

    @Override // b9.g0
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
            h0 h0Var = this.c;
            Object[] objArr = {this.d};
            h0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", h0.d(h0Var.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(TLObject.FLAG_29);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        h0 h0Var2 = this.c;
        Object[] objArr2 = new Object[0];
        h0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", h0.d(h0Var2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
