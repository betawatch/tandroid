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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class c6e implements f69, yyb, li0, v02, al0, rdc, ga4, k13, i30 {
    public static c6e E;
    public static final c6e a = new c6e();
    public static final c6e b = new c6e();
    public static final c6e c = new c6e();
    public static final /* synthetic */ c6e d = new c6e();
    public static final c6e e = new c6e();
    public static final c6e f = new c6e();
    public static final c6e h = new c6e();
    public static final c6e n = new c6e();
    public static final c6e r = new c6e();
    public static final c6e s = new c6e();
    public static final c6e w = new c6e();
    public static final c6e x = new c6e();
    public static final /* synthetic */ c6e y = new c6e();

    public static void j(bwc bwcVar, boolean z) {
        zi9 zi9Var;
        svc g = vvc.g(bwcVar);
        StringBuilder sb = new StringBuilder("widget ");
        sb.append(bwcVar.a);
        sb.append(": engine process died");
        de9.s(z ? ", restarting" : "", sb);
        if (!z || g == null || (zi9Var = g.w) == null || !zi9Var.f0 || zi9Var.Y == null) {
            return;
        }
        zi9Var.s0();
        zi9Var.r0();
    }

    @Override // al0
    public final int K() {
        return 0;
    }

    @Override // al0
    public final float U0() {
        return 0.0f;
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // i30
    public final int Z0(int i, int i2, int i3) {
        return i << 1;
    }

    @Override // i30
    public final void a0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s2 = shortBuffer.get();
            shortBuffer2.put(s2);
            shortBuffer2.put(s2);
        }
    }

    @Override // al0
    public final int a1() {
        return 0;
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        qnd qndVar = (qnd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        jx5 jx5Var = new jx5(Long.MAX_VALUE, 0, false, null, null);
        xme xmeVar = qndVar.B;
        f84 f84Var = null;
        f84[] f84VarArr = xmeVar == null ? null : xmeVar.b;
        if (f84VarArr != null) {
            int length = f84VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                f84 f84Var2 = f84VarArr[i];
                if ("get_last_location_with_request".equals(f84Var2.a)) {
                    f84Var = f84Var2;
                    break;
                }
                i++;
            }
            if (f84Var != null && f84Var.b() >= 1) {
                z2f z2fVar = (z2f) qndVar.k();
                hkd hkdVar = new hkd(taskCompletionSource, (byte) 0);
                Parcel R = z2fVar.R();
                int i2 = rgd.a;
                R.writeInt(1);
                jx5Var.writeToParcel(R, 0);
                rgd.c(R, hkdVar);
                z2fVar.V(R, 82);
                return;
            }
        }
        z2f z2fVar2 = (z2f) qndVar.k();
        Parcel R2 = z2fVar2.R();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                z2fVar2.b.transact(7, R2, obtain, 0);
                obtain.readException();
                R2.recycle();
                Location location = (Location) rgd.a(obtain, Location.CREATOR);
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

    @Override // yyb
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // ga4
    public final String b() {
        return null;
    }

    @Override // al0
    public final int b0() {
        return 0;
    }

    public final boolean d(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    @Override // al0
    public final int d1() {
        return 0;
    }

    @Override // rdc
    public final odc e(Class cls, l13 l13Var) {
        l13Var.getClass();
        return new jo4(true);
    }

    @Override // rdc
    public final /* synthetic */ odc f(oh2 oh2Var, l13 l13Var) {
        return yjb.a(this, oh2Var, l13Var);
    }

    public final void g(String str) {
        if (d(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // v02
    public final boolean g0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:10:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(FileOutputStream fileOutputStream, fw2 fw2Var) {
        mg7 mg7Var;
        int i;
        FileOutputStream fileOutputStream2;
        long j;
        mg7 mg7Var2;
        if (fw2Var instanceof mg7) {
            mg7Var = (mg7) fw2Var;
            int i2 = mg7Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                mg7Var.e = i2 - TLObject.FLAG_31;
                Object obj = mg7Var.c;
                i = mg7Var.e;
                if (i == 0) {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = mg7Var.b;
                    FileOutputStream fileOutputStream3 = mg7Var.a;
                    qse.b(obj);
                    fileOutputStream2 = fileOutputStream3;
                    mg7Var2 = mg7Var;
                    j <<= 1;
                    if (j <= 60000) {
                        FileLock lock = fileOutputStream2.getChannel().lock(0L, Long.MAX_VALUE, false);
                        lock.getClass();
                        return lock;
                    }
                    try {
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if (message == null || f9b.f(0, 2, message, "Resource deadlock would occur") < 0) {
                            throw e2;
                        }
                        mg7Var2.a = fileOutputStream2;
                        mg7Var2.b = j;
                        mg7Var2.e = 1;
                        Object a2 = jde.a(j, mg7Var2);
                        bx2 bx2Var = bx2.a;
                        if (a2 == bx2Var) {
                            return bx2Var;
                        }
                    }
                    FileLock lock2 = fileOutputStream2.getChannel().lock(0L, Long.MAX_VALUE, false);
                    lock2.getClass();
                    return lock2;
                }
                qse.b(obj);
                fileOutputStream2 = fileOutputStream;
                j = 10;
                mg7Var2 = mg7Var;
                if (j <= 60000) {
                }
            }
        }
        mg7Var = new mg7(this, fw2Var);
        Object obj2 = mg7Var.c;
        i = mg7Var.e;
        if (i == 0) {
        }
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public final void k(String str) {
        if (d(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override // al0
    public final int k0() {
        return 0;
    }

    public final void l(String str, Exception exc) {
        if (d(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // al0
    public final float p0() {
        return -1.0f;
    }

    @Override // al0
    public final float q0() {
        return -1.0f;
    }

    @Override // al0
    public final int t1() {
        return 0;
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // v02
    public final void I0() {
    }

    @Override // ga4
    public final void a() {
    }

    @Override // v02
    public final void z0() {
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // li0
    public final long c(long j) {
        return j;
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
