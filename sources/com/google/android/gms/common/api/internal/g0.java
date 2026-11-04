package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 implements q0, com.google.android.gms.common.api.k {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final m6.e d;
    public final c0 e;
    public final Map f;
    public final HashMap i = new HashMap();
    public final o3 j;
    public final Map k;
    public final a6.b l;
    public volatile e0 m;
    public int n;
    public final d0 o;
    public final p0 p;

    public g0(Context context, d0 d0Var, Lock lock, Looper looper, m6.e eVar, a0.f fVar, o3 o3Var, a0.f fVar2, a6.b bVar, ArrayList arrayList, p0 p0Var) {
        this.c = context;
        this.a = lock;
        this.d = eVar;
        this.f = fVar;
        this.j = o3Var;
        this.k = fVar2;
        this.l = bVar;
        this.o = d0Var;
        this.p = p0Var;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((f1) arrayList.get(i3)).c = this;
        }
        this.e = new c0(this, looper, 1);
        this.b = lock.newCondition();
        this.m = new android.support.v4.media.c(this, 10);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void a() {
        this.m.a();
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final d b(d dVar) {
        dVar.l();
        return this.m.b(dVar);
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void c() {
        if (this.m.B()) {
            this.i.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i3;
        IInterface iInterface;
        p6.z zVar;
        long j10;
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        for (com.google.android.gms.common.api.e eVar : this.k.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) eVar.c).println(":");
            Object obj = (com.google.android.gms.common.api.c) this.f.get(eVar.b);
            p6.m.g(obj);
            String concat = valueOf.concat("  ");
            p6.d dVar = (p6.d) obj;
            synchronized (dVar.l) {
                i3 = dVar.s;
                iInterface = dVar.p;
            }
            synchronized (dVar.m) {
                zVar = dVar.n;
            }
            printWriter.append((CharSequence) concat).append("mConnectState=");
            if (i3 == 1) {
                printWriter.print("DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.print("REMOTE_CONNECTING");
            } else if (i3 == 3) {
                printWriter.print("LOCAL_CONNECTING");
            } else if (i3 == 4) {
                printWriter.print("CONNECTED");
            } else if (i3 != 5) {
                printWriter.print("UNKNOWN");
            } else {
                printWriter.print("DISCONNECTING");
            }
            printWriter.append(" mService=");
            if (iInterface == null) {
                printWriter.append("null");
            } else {
                printWriter.append((CharSequence) dVar.n()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
            }
            printWriter.append(" mServiceBroker=");
            if (zVar == null) {
                printWriter.println("null");
            } else {
                printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.a)));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            if (dVar.c > 0) {
                PrintWriter append = printWriter.append((CharSequence) concat).append("lastConnectedTime=");
                long j11 = dVar.c;
                j10 = 0;
                String format = simpleDateFormat.format(new Date(j11));
                StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format).length());
                sb2.append(j11);
                sb2.append(" ");
                sb2.append(format);
                append.println(sb2.toString());
            } else {
                j10 = 0;
            }
            if (dVar.b > j10) {
                printWriter.append((CharSequence) concat).append("lastSuspendedCause=");
                int i10 = dVar.a;
                if (i10 == 1) {
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                } else if (i10 == 2) {
                    printWriter.append("CAUSE_NETWORK_LOST");
                } else if (i10 != 3) {
                    printWriter.append((CharSequence) String.valueOf(i10));
                } else {
                    printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                }
                PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                long j12 = dVar.b;
                String format2 = simpleDateFormat.format(new Date(j12));
                StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(format2).length());
                sb3.append(j12);
                sb3.append(" ");
                sb3.append(format2);
                append2.println(sb3.toString());
            }
            if (dVar.e > j10) {
                printWriter.append((CharSequence) concat).append("lastFailedStatus=").append((CharSequence) z8.c.a(dVar.d));
                PrintWriter append3 = printWriter.append(" lastFailedTime=");
                long j13 = dVar.e;
                String format3 = simpleDateFormat.format(new Date(j13));
                StringBuilder sb4 = new StringBuilder(String.valueOf(j13).length() + 1 + String.valueOf(format3).length());
                sb4.append(j13);
                sb4.append(" ");
                sb4.append(format3);
                append3.println(sb4.toString());
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final boolean f() {
        return this.m instanceof v;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final boolean g(c6.d dVar) {
        return false;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new android.support.v4.media.c(this, 10);
            this.m.L();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.l(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i3) {
        this.a.lock();
        try {
            this.m.x(i3);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final void e() {
    }
}
