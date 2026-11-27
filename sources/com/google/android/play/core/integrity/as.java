package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class as extends g5d {
    final TaskCompletionSource a;
    final y3d b;
    private final h5d c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, y3d y3dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new h5d("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = y3dVar;
    }

    @Override // g5d
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        ao a = this.e.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            h5d h5dVar = this.c;
            Object[] objArr = {this.d};
            h5dVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", h5d.d(h5dVar.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(TLObject.FLAG_29);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        h5d h5dVar2 = this.c;
        Object[] objArr2 = new Object[0];
        h5dVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", h5d.d(h5dVar2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
