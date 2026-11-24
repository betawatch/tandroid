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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class as extends r2d {
    final TaskCompletionSource a;
    final i1d b;
    private final s2d c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, i1d i1dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new s2d("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = i1dVar;
    }

    @Override // r2d
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        ap a = this.e.a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            s2d s2dVar = this.c;
            Object[] objArr = {this.d};
            s2dVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", s2d.d(s2dVar.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(TLObject.FLAG_29);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        s2d s2dVar2 = this.c;
        Object[] objArr2 = new Object[0];
        s2dVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", s2d.d(s2dVar2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
