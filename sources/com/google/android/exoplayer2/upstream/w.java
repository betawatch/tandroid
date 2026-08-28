package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w implements l, u3.d {
    public int a;
    public int b;
    public final Object c;

    public w(Context context) {
        this.b = 0;
        this.c = context;
    }

    @Override // u3.d
    public int a() {
        return this.a;
    }

    @Override // u3.d
    public int b() {
        return this.b;
    }

    @Override // u3.d
    public int c() {
        int i9 = this.a;
        return i9 == -1 ? ((d5.y) this.c).u() : i9;
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public m createDataSource() {
        return new z(null, this.a, this.b, false, (we.b) this.c, 0);
    }

    public int d() {
        return ((((byte[]) this.c).length - this.a) * 8) - this.b;
    }

    public int e(int i9) {
        byte[] bArr = (byte[]) this.c;
        if (i9 < 1 || i9 > 32 || i9 > d()) {
            throw new IllegalArgumentException(String.valueOf(i9));
        }
        int i10 = this.b;
        int i11 = 0;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int min = Math.min(i9, i12);
            int i13 = i12 - min;
            int i14 = this.a;
            int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
            i9 -= min;
            int i16 = this.b + min;
            this.b = i16;
            if (i16 == 8) {
                this.b = 0;
                this.a = i14 + 1;
            }
            i11 = i15;
        }
        if (i9 > 0) {
            while (i9 >= 8) {
                int i17 = i11 << 8;
                int i18 = this.a;
                int i19 = i17 | (bArr[i18] & 255);
                this.a = i18 + 1;
                i9 -= 8;
                i11 = i19;
            }
            if (i9 > 0) {
                int i20 = 8 - i9;
                int i21 = ((bArr[this.a] & ((255 >> i20) << i20)) >> i20) | (i11 << i9);
                this.b += i9;
                return i21;
            }
        }
        return i11;
    }

    public synchronized int f() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = g6.c.a((Context) this.c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    public synchronized int g() {
        int i9 = this.b;
        if (i9 != 0) {
            return i9;
        }
        Context context = (Context) this.c;
        PackageManager packageManager = context.getPackageManager();
        if (g6.c.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!e6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.b = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.b = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == e6.b.d()) {
            i10 = 2;
        }
        this.b = i10;
        return i10;
    }

    public w(byte[] bArr) {
        this.c = bArr;
    }

    public w() {
        this.c = new we.b(13, (byte) 0);
        this.a = 8000;
        this.b = 8000;
    }

    public w(int i9, int i10, SparseArray sparseArray) {
        this.a = i9;
        this.b = i10;
        this.c = sparseArray;
    }

    public w(u3.b bVar, h3.t0 t0Var) {
        d5.y yVar = bVar.c;
        this.c = yVar;
        yVar.C(12);
        int u10 = yVar.u();
        if ("audio/raw".equals(t0Var.B)) {
            int w8 = d5.f0.w(t0Var.Q, t0Var.O);
            if (u10 == 0 || u10 % w8 != 0) {
                d5.a.K("AtomParsers", "Audio sample size mismatch. stsd sample size: " + w8 + ", stsz sample size: " + u10);
                u10 = w8;
            }
        }
        this.a = u10 == 0 ? -1 : u10;
        this.b = yVar.u();
    }
}
