package d4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.SparseArray;
import d2.v;
import g2.n0;
import g2.y;
import java.lang.reflect.Array;
import java.util.List;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements y3.c {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final Object d;

    public d(Context context) {
        this.a = 2;
        this.c = 0;
        this.d = context;
    }

    @Override // y3.c
    public int a() {
        return this.b;
    }

    @Override // y3.c
    public int b() {
        return this.c;
    }

    @Override // y3.c
    public int c() {
        int i3 = this.b;
        return i3 == -1 ? ((y) this.d).E() : i3;
    }

    public int d() {
        return ((((byte[]) this.d).length - this.b) * 8) - this.c;
    }

    public byte e(int i3, int i10) {
        return ((byte[][]) this.d)[i10][i3];
    }

    public int f(int i3) {
        byte[] bArr = (byte[]) this.d;
        if (i3 < 1 || i3 > 32 || i3 > d()) {
            throw new IllegalArgumentException(String.valueOf(i3));
        }
        int i10 = this.c;
        int i11 = 0;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int min = Math.min(i3, i12);
            int i13 = i12 - min;
            int i14 = (hs.e4 >> (8 - min)) << i13;
            int i15 = this.b;
            int i16 = (i14 & bArr[i15]) >> i13;
            i3 -= min;
            int i17 = this.c + min;
            this.c = i17;
            if (i17 == 8) {
                this.c = 0;
                this.b = i15 + 1;
            }
            i11 = i16;
        }
        if (i3 > 0) {
            while (i3 >= 8) {
                int i18 = i11 << 8;
                int i19 = this.b;
                int i20 = i18 | (bArr[i19] & 255);
                this.b = i19 + 1;
                i3 -= 8;
                i11 = i20;
            }
            if (i3 > 0) {
                int i21 = 8 - i3;
                int i22 = ((bArr[this.b] & ((hs.e4 >> i21) << i21)) >> i21) | (i11 << i3);
                this.c += i3;
                return i22;
            }
        }
        return i11;
    }

    public void g(int i3, int i10, int i11) {
        ((byte[][]) this.d)[i10][i3] = (byte) i11;
    }

    public synchronized int h() {
        int i3 = this.c;
        if (i3 != 0) {
            return i3;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (y6.b.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!w6.b.d()) {
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
        if (true == w6.b.d()) {
            i10 = 2;
        }
        this.c = i10;
        return i10;
    }

    public synchronized int i() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = y6.b.a((Context) this.d).d(0, "com.google.android.gms");
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
            case 1:
                int i3 = this.b;
                int i10 = this.c;
                StringBuilder sb2 = new StringBuilder((i3 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.d)[i11];
                    for (int i12 = 0; i12 < i3; i12++) {
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

    public d(int i3, int i10) {
        this.a = 1;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i3);
        this.b = i3;
        this.c = i10;
    }

    public d(byte[] bArr) {
        this.a = 4;
        this.d = bArr;
    }

    public d(int i3, int i10, SparseArray sparseArray) {
        this.a = 0;
        this.b = i3;
        this.c = i10;
        this.d = sparseArray;
    }

    public d(h2.d dVar, v vVar) {
        this.a = 3;
        y yVar = dVar.c;
        this.d = yVar;
        yVar.N(12);
        int E = yVar.E();
        if ("audio/raw".equals(vVar.s)) {
            int u10 = n0.u(vVar.M) * vVar.K;
            if (E % u10 != 0) {
                g2.a.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + E);
                E = u10;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = yVar.E();
    }
}
