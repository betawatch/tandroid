// default package

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Location;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class f8e implements h89, z0c, lj0, g22, am0, sfc, gc4, w23, i40 {
    public static f8e E;
    public static final f8e a = new f8e();
    public static final f8e b = new f8e();
    public static final f8e c = new f8e();
    public static final /* synthetic */ f8e d = new f8e();
    public static final f8e e = new f8e();
    public static final f8e f = new f8e();
    public static final f8e h = new f8e();
    public static final f8e n = new f8e();
    public static final f8e r = new f8e();
    public static final f8e s = new f8e();
    public static final f8e w = new f8e();
    public static final f8e x = new f8e();
    public static final /* synthetic */ f8e y = new f8e();

    public static void j(cyc cycVar, boolean z) {
        ss0 ss0Var;
        al9 al9Var;
        txc g = wxc.g(cycVar);
        StringBuilder sb = new StringBuilder("widget ");
        sb.append(cycVar.a);
        sb.append(": engine process died");
        hg9.r(z ? ", restarting" : "", sb);
        if (z && g != null && (al9Var = g.y) != null) {
            if (!al9Var.f0 || al9Var.Y == null) {
                return;
            }
            al9Var.r0();
            al9Var.q0();
            return;
        }
        if (!z || g == null || (ss0Var = g.p) == null || !ss0Var.G) {
            return;
        }
        ss0Var.i();
        ss0Var.e();
    }

    @Override // g22
    public final boolean B() {
        return false;
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // am0
    public final int K1() {
        return 0;
    }

    @Override // am0
    public final int V() {
        return 0;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        tpd tpdVar = (tpd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        jz5 jz5Var = new jz5(Long.MAX_VALUE, 0, false, null, null);
        ape apeVar = tpdVar.B;
        o94 o94Var = null;
        o94[] o94VarArr = apeVar == null ? null : apeVar.b;
        if (o94VarArr != null) {
            int length = o94VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                o94 o94Var2 = o94VarArr[i];
                if ("get_last_location_with_request".equals(o94Var2.a)) {
                    o94Var = o94Var2;
                    break;
                }
                i++;
            }
            if (o94Var != null && o94Var.b() >= 1) {
                b5f b5fVar = (b5f) tpdVar.k();
                jmd jmdVar = new jmd(taskCompletionSource, (byte) 0);
                Parcel R = b5fVar.R();
                int i2 = sid.a;
                R.writeInt(1);
                jz5Var.writeToParcel(R, 0);
                sid.c(R, jmdVar);
                b5fVar.V(R, 82);
                return;
            }
        }
        b5f b5fVar2 = (b5f) tpdVar.k();
        Parcel R2 = b5fVar2.R();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                b5fVar2.b.transact(7, R2, obtain, 0);
                obtain.readException();
                R2.recycle();
                Location location = (Location) sid.a(obtain, Location.CREATOR);
                obtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } catch (Throwable th) {
            R2.recycle();
            throw th;
        }
    }

    @Override // z0c
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // gc4
    public final String b() {
        return null;
    }

    @Override // sfc
    public final pfc d(Class cls, x23 x23Var) {
        x23Var.getClass();
        return new kq4(true);
    }

    public final boolean e(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public final void f(String str) {
        if (e(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // sfc
    public final /* synthetic */ pfc g(cj2 cj2Var, x23 x23Var) {
        return mlb.a(this, cj2Var, x23Var);
    }

    @Override // am0
    public final int g0() {
        return 0;
    }

    @Override // am0
    public final float g1() {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:10:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(FileOutputStream fileOutputStream, px2 px2Var) {
        pi7 pi7Var;
        int i;
        FileOutputStream fileOutputStream2;
        long j;
        pi7 pi7Var2;
        if (px2Var instanceof pi7) {
            pi7Var = (pi7) px2Var;
            int i2 = pi7Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                pi7Var.e = i2 - TLObject.FLAG_31;
                Object obj = pi7Var.c;
                i = pi7Var.e;
                if (i == 0) {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = pi7Var.b;
                    FileOutputStream fileOutputStream3 = pi7Var.a;
                    tue.b(obj);
                    fileOutputStream2 = fileOutputStream3;
                    pi7Var2 = pi7Var;
                    j <<= 1;
                    if (j <= 60000) {
                        FileLock lock = fileOutputStream2.getChannel().lock(0L, Long.MAX_VALUE, false);
                        lock.getClass();
                        return lock;
                    }
                    try {
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if (message == null || hbb.f(0, 2, message, "Resource deadlock would occur") < 0) {
                            throw e2;
                        }
                        pi7Var2.a = fileOutputStream2;
                        pi7Var2.b = j;
                        pi7Var2.e = 1;
                        Object a2 = kfe.a(j, pi7Var2);
                        ly2 ly2Var = ly2.a;
                        if (a2 == ly2Var) {
                            return ly2Var;
                        }
                    }
                    FileLock lock2 = fileOutputStream2.getChannel().lock(0L, Long.MAX_VALUE, false);
                    lock2.getClass();
                    return lock2;
                }
                tue.b(obj);
                fileOutputStream2 = fileOutputStream;
                j = 10;
                pi7Var2 = pi7Var;
                if (j <= 60000) {
                }
            }
        }
        pi7Var = new pi7(this, px2Var);
        Object obj2 = pi7Var.c;
        i = pi7Var.e;
        if (i == 0) {
        }
    }

    @Override // am0
    public final int h1() {
        return 0;
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // i40
    public final void j0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s2 = shortBuffer.get();
            shortBuffer2.put(s2);
            shortBuffer2.put(s2);
        }
    }

    public final void k(String str) {
        if (e(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public final void l(String str, Exception exc) {
        if (e(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // i40
    public final int p1(int i, int i2, int i3) {
        return i << 1;
    }

    @Override // am0
    public final int r1() {
        return 0;
    }

    @Override // am0
    public final int u0() {
        return 0;
    }

    @Override // am0
    public final float w0() {
        return -1.0f;
    }

    @Override // am0
    public final float y0() {
        return -1.0f;
    }

    @Override // g22
    public final void I() {
    }

    @Override // gc4
    public final void a() {
    }

    @Override // g22
    public final void b0() {
    }

    @Override // lj0
    public final long c(long j) {
        return j;
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
