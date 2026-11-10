package com.google.android.play.core.integrity;

import a8.q9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import d9.g0;
import d9.k0;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class bn {
    final d9.c a;
    private final g0 b;
    private final String c;
    private final TaskCompletionSource d;
    private final at e;
    private final k f;

    public bn(Context context, g0 g0Var, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = g0Var;
        this.e = atVar;
        this.f = kVar;
        d9.c cVar = new d9.c(context, g0Var, "ExpressIntegrityService", bo.a, new k0() { // from class: com.google.android.play.core.integrity.bd
            @Override // d9.k0
            public final Object a(IBinder iBinder) {
                int i7 = d9.v.i;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return queryLocalInterface instanceof d9.w ? (d9.w) queryLocalInterface : new d9.u(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", 5);
            }
        });
        this.a = cVar;
        cVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j3, long j10, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j3);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d9.t(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q9.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j3, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j3);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d9.t(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(q9.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i7) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j3, long j10, int i7) {
        this.b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j3, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j3, int i7) {
        this.b.b("warmUpIntegrityToken(%s)", Long.valueOf(j3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bf(this, taskCompletionSource, 0, j3, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
