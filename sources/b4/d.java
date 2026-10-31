package b4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import e2.l0;
import e2.x;
import java.lang.reflect.Array;
import java.util.List;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements w3.b {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final Object d;

    public d(Context context) {
        this.a = 2;
        this.c = 0;
        this.d = context;
    }

    @Override // w3.b
    public int a() {
        return this.b;
    }

    @Override // w3.b
    public int b() {
        return this.c;
    }

    @Override // w3.b
    public int c() {
        int i10 = this.b;
        return i10 == -1 ? ((x) this.d).E() : i10;
    }

    public int d() {
        return ((((byte[]) this.d).length - this.b) * 8) - this.c;
    }

    public byte e(int i10, int i11) {
        return ((byte[][]) this.d)[i11][i10];
    }

    public int f(int i10) {
        byte[] bArr = (byte[]) this.d;
        if (i10 < 1 || i10 > 32 || i10 > d()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            int i15 = (zs.e4 >> (8 - min)) << i14;
            int i16 = this.b;
            int i17 = (i15 & bArr[i16]) >> i14;
            i10 -= min;
            int i18 = this.c + min;
            this.c = i18;
            if (i18 == 8) {
                this.c = 0;
                this.b = i16 + 1;
            }
            i12 = i17;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                int i19 = i12 << 8;
                int i20 = this.b;
                int i21 = i19 | (bArr[i20] & 255);
                this.b = i20 + 1;
                i10 -= 8;
                i12 = i21;
            }
            if (i10 > 0) {
                int i22 = 8 - i10;
                int i23 = ((bArr[this.b] & ((zs.e4 >> i22) << i22)) >> i22) | (i12 << i10);
                this.c += i10;
                return i23;
            }
        }
        return i12;
    }

    public void g(int i10, int i11, int i12) {
        ((byte[][]) this.d)[i11][i10] = (byte) i12;
    }

    public synchronized int h() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = w6.b.a((Context) this.d).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int i() {
        int i10 = this.c;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (w6.b.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!u6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.c = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.c = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == u6.b.d()) {
            i11 = 2;
        }
        this.c = i11;
        return i11;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                int i10 = this.b;
                int i11 = this.c;
                StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr = ((byte[][]) this.d)[i12];
                    for (int i13 = 0; i13 < i10; i13++) {
                        byte b10 = bArr[i13];
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

    public d(int i10, int i11) {
        this.a = 1;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.b = i10;
        this.c = i11;
    }

    public d(byte[] bArr) {
        this.a = 4;
        this.d = bArr;
    }

    public d(int i10, int i11, SparseArray sparseArray) {
        this.a = 0;
        this.b = i10;
        this.c = i11;
        this.d = sparseArray;
    }

    public d(f2.e eVar, b2.x xVar) {
        this.a = 3;
        x xVar2 = eVar.c;
        this.d = xVar2;
        xVar2.N(12);
        int E = xVar2.E();
        if ("audio/raw".equals(xVar.s)) {
            int u10 = l0.u(xVar.M) * xVar.K;
            if (E % u10 != 0) {
                e2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = xVar2.E();
    }
}
