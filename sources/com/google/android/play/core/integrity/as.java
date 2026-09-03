package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import o8.d0;
import o8.f0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class as extends d0 {
    final TaskCompletionSource a;
    final o8.c b;
    private final f0 c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, o8.c cVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new f0("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = cVar;
    }

    @Override // o8.e0
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
            f0 f0Var = this.c;
            Object[] objArr = {this.d};
            f0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", f0.d(f0Var.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(TLObject.FLAG_29);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        f0 f0Var2 = this.c;
        Object[] objArr2 = new Object[0];
        f0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f0.d(f0Var2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
