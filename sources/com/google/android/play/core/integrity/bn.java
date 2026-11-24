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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class bn {
    final i1d a;
    private final s2d b;
    private final String c;
    private final TaskCompletionSource d;
    private final at e;
    private final k f;

    public bn(Context context, s2d s2dVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = s2dVar;
        this.e = atVar;
        this.f = kVar;
        i1d i1dVar = new i1d(context, s2dVar, "ExpressIntegrityService", bo.a, new a3d() { // from class: com.google.android.play.core.integrity.bd
            @Override // a3d
            public final Object a(IBinder iBinder) {
                int i = e2d.i;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return queryLocalInterface instanceof f2d ? (f2d) queryLocalInterface : new d2d(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", (byte) 0);
            }
        });
        this.a = i1dVar;
        i1dVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a2d(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w0f.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a2d(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(w0f.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        this.b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i) {
        this.b.b("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
