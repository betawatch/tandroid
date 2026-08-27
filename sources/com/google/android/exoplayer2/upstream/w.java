package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = this.a;
        return i10 == -1 ? ((d5.z) this.c).u() : i10;
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public m createDataSource() {
        return new z(null, this.a, this.b, false, (xe.b) this.c, 0);
    }

    public int d() {
        return ((((byte[]) this.c).length - this.a) * 8) - this.b;
    }

    public int e(int i10) {
        byte[] bArr = (byte[]) this.c;
        if (i10 < 1 || i10 > 32 || i10 > d()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.b;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            int i15 = this.a;
            int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i17 = this.b + min;
            this.b = i17;
            if (i17 == 8) {
                this.b = 0;
                this.a = i15 + 1;
            }
            i12 = i16;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                int i18 = i12 << 8;
                int i19 = this.a;
                int i20 = i18 | (bArr[i19] & 255);
                this.a = i19 + 1;
                i10 -= 8;
                i12 = i20;
            }
            if (i10 > 0) {
                int i21 = 8 - i10;
                int i22 = ((bArr[this.a] & ((255 >> i21) << i21)) >> i21) | (i12 << i10);
                this.b += i10;
                return i22;
            }
        }
        return i12;
    }

    public synchronized int f() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = h6.b.a((Context) this.c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e9) {
                Log.w("Metadata", "Failed to find package ".concat(e9.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    public synchronized int g() {
        int i10 = this.b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.c;
        PackageManager packageManager = context.getPackageManager();
        if (h6.b.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!f6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.b = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.b = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == f6.b.d()) {
            i11 = 2;
        }
        this.b = i11;
        return i11;
    }

    public w(byte[] bArr) {
        this.c = bArr;
    }

    public w() {
        this.c = new xe.b(12, (byte) 0);
        this.a = 8000;
        this.b = 8000;
    }

    public w(int i10, int i11, SparseArray sparseArray) {
        this.a = i10;
        this.b = i11;
        this.c = sparseArray;
    }

    public w(u3.b bVar, h3.t0 t0Var) {
        d5.z zVar = bVar.c;
        this.c = zVar;
        zVar.C(12);
        int u10 = zVar.u();
        if ("audio/raw".equals(t0Var.B)) {
            int w10 = d5.g0.w(t0Var.Q, t0Var.O);
            if (u10 == 0 || u10 % w10 != 0) {
                d5.a.K("AtomParsers", "Audio sample size mismatch. stsd sample size: " + w10 + ", stsz sample size: " + u10);
                u10 = w10;
            }
        }
        this.a = u10 == 0 ? -1 : u10;
        this.b = zVar.u();
    }
}
