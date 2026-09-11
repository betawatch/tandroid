package b4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import b2.s;
import e2.d0;
import e2.v;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d implements w3.b {
    public int a;
    public int b;
    public final Object c;

    public d(Context context) {
        this.b = 0;
        this.c = context;
    }

    @Override // w3.b
    public int a() {
        return this.a;
    }

    @Override // w3.b
    public int b() {
        return this.b;
    }

    @Override // w3.b
    public int c() {
        int i10 = this.a;
        return i10 == -1 ? ((v) this.c).B() : i10;
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
                packageInfo = w6.b.a((Context) this.c).d(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
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
        if (true == u6.b.d()) {
            i11 = 2;
        }
        this.b = i11;
        return i11;
    }

    public d(byte[] bArr) {
        this.c = bArr;
    }

    public d(int i10, int i11, SparseArray sparseArray) {
        this.a = i10;
        this.b = i11;
        this.c = sparseArray;
    }

    public d(f2.e eVar, s sVar) {
        v vVar = eVar.c;
        this.c = vVar;
        vVar.J(12);
        int B = vVar.B();
        if ("audio/raw".equals(sVar.r)) {
            int t10 = d0.t(sVar.L) * sVar.J;
            if (B == 0 || B % t10 != 0) {
                e2.a.n("BoxParsers", "Audio sample size mismatch. stsd sample size: " + t10 + ", stsz sample size: " + B);
                B = t10;
            }
        }
        this.a = B == 0 ? -1 : B;
        this.b = vVar.B();
    }
}
