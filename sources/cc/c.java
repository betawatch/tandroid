package cc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import e2.u;
import h2.m0;
import h2.x;
import java.lang.reflect.Array;
import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c implements z3.b {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final Object d;

    public c(Context context) {
        this.a = 3;
        this.c = 0;
        this.d = context;
    }

    @Override // z3.b
    public int a() {
        return this.b;
    }

    @Override // z3.b
    public int b() {
        return this.c;
    }

    @Override // z3.b
    public int c() {
        int i7 = this.b;
        return i7 == -1 ? ((x) this.d).E() : i7;
    }

    public int d() {
        return ((((byte[]) this.d).length - this.b) * 8) - this.c;
    }

    public byte e(int i7, int i10) {
        return ((byte[][]) this.d)[i10][i7];
    }

    public int f(int i7) {
        byte[] bArr = (byte[]) this.d;
        if (i7 < 1 || i7 > 32 || i7 > d()) {
            throw new IllegalArgumentException(String.valueOf(i7));
        }
        int i10 = this.c;
        int i11 = 0;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int min = Math.min(i7, i12);
            int i13 = i12 - min;
            int i14 = (qs.e4 >> (8 - min)) << i13;
            int i15 = this.b;
            int i16 = (i14 & bArr[i15]) >> i13;
            i7 -= min;
            int i17 = this.c + min;
            this.c = i17;
            if (i17 == 8) {
                this.c = 0;
                this.b = i15 + 1;
            }
            i11 = i16;
        }
        if (i7 > 0) {
            while (i7 >= 8) {
                int i18 = i11 << 8;
                int i19 = this.b;
                int i20 = i18 | (bArr[i19] & 255);
                this.b = i19 + 1;
                i7 -= 8;
                i11 = i20;
            }
            if (i7 > 0) {
                int i21 = 8 - i7;
                int i22 = ((bArr[this.b] & ((qs.e4 >> i21) << i21)) >> i21) | (i11 << i7);
                this.c += i7;
                return i22;
            }
        }
        return i11;
    }

    public void g(int i7, int i10, int i11) {
        ((byte[][]) this.d)[i10][i7] = (byte) i11;
    }

    public synchronized int h() {
        int i7 = this.c;
        if (i7 != 0) {
            return i7;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (z6.b.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!x6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.c = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.c = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == x6.b.d()) {
            i10 = 2;
        }
        this.c = i10;
        return i10;
    }

    public synchronized int i() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = z6.b.a((Context) this.d).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i7 = this.b;
                int i10 = this.c;
                StringBuilder sb2 = new StringBuilder((i7 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.d)[i11];
                    for (int i12 = 0; i12 < i7; i12++) {
                        byte b10 = bArr[i12];
                        if (b10 == 0) {
                            sb2.append(" 0");
                        } else if (b10 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public c(int i7, int i10) {
        this.a = 2;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i7);
        this.b = i7;
        this.c = i10;
    }

    public c(byte[] bArr) {
        this.a = 0;
        this.d = bArr;
    }

    public c(int i7, int i10, SparseArray sparseArray) {
        this.a = 1;
        this.b = i7;
        this.c = i10;
        this.d = sparseArray;
    }

    public c(i2.d dVar, u uVar) {
        this.a = 4;
        x xVar = dVar.c;
        this.d = xVar;
        xVar.N(12);
        int E = xVar.E();
        if ("audio/raw".equals(uVar.s)) {
            int u10 = m0.u(uVar.M) * uVar.K;
            if (E % u10 != 0) {
                h2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = xVar.E();
    }
}
