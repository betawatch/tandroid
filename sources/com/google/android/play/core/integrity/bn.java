package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.ArrayList;
import k8.g0;
import k8.k0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class bn {
    final k8.c a;
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
        k8.c cVar = new k8.c(context, g0Var, "ExpressIntegrityService", bo.a, new k0() { // from class: com.google.android.play.core.integrity.bd
            @Override // k8.k0
            public final Object a(IBinder iBinder) {
                int i9 = k8.v.i;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return queryLocalInterface instanceof k8.w ? (k8.w) queryLocalInterface : new k8.u(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", 7);
            }
        });
        this.a = cVar;
        cVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j10, long j11, int i9) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k8.t(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(g7.j.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j10, int i9) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k8.t(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(g7.j.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i9) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i9 = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s)", Integer.valueOf(i9));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i9), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j10, long j11, int i9) {
        this.b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i9) {
        this.b.b("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
