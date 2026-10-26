package m4;

import a8.qd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.os.WorkSource;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import fi.wb;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.fy0;
import org.telegram.ui.in0;
import org.telegram.ui.l5;
import org.telegram.ui.lj0;
import org.telegram.ui.m4;
import org.telegram.ui.m7;
import org.telegram.ui.o31;
import org.telegram.ui.qm0;
import org.telegram.ui.uu;
import org.telegram.ui.vu;
import org.telegram.ui.w6;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class w1 implements e2.d, o5.b, oe.f, kp0, hu, wb, m7, wm0, hh.a, p81, p2.t, com.google.android.gms.common.api.internal.r, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ w1(int i10, byte b10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w1 s(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e10) {
            e = e10;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new w1(21, fileChannel, fileLock);
        } catch (IOException e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    @Override // p2.t
    public y2.n G() {
        return new c(20, ((p2.t) this.b).G(), (List) this.c);
    }

    @Override // e2.d
    public k9.y H(byte[] bArr) {
        return qd.c(((e2.d) this.b).H(bArr), new jg.e1(this, 21));
    }

    public View M(int i10, int i11, int i12, int i13) {
        s4.i1 i1Var = (s4.i1) this.c;
        s4.j1 j1Var = (s4.j1) this.b;
        int s10 = j1Var.s();
        int J = j1Var.J();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View W = j1Var.W(i10);
            int m10 = j1Var.m(W);
            int X = j1Var.X(W);
            i1Var.b = s10;
            i1Var.c = J;
            i1Var.d = m10;
            i1Var.e = X;
            if (i12 != 0) {
                i1Var.a = i12;
                if (i1Var.a()) {
                    return W;
                }
            }
            if (i13 != 0) {
                i1Var.a = i13;
                if (i1Var.a()) {
                    view = W;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean N(n4.v vVar, String str) {
        Context context = (Context) this.b;
        int i10 = vVar.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, vVar.a) == 0 : context.checkPermission(str, i10, vVar.c) == 0;
    }

    public boolean O(View view) {
        s4.i1 i1Var = (s4.i1) this.c;
        s4.j1 j1Var = (s4.j1) this.b;
        int s10 = j1Var.s();
        int J = j1Var.J();
        int m10 = j1Var.m(view);
        int X = j1Var.X(view);
        i1Var.b = s10;
        i1Var.c = J;
        i1Var.d = m10;
        i1Var.e = X;
        i1Var.a = 24579;
        return i1Var.a();
    }

    @Override // oe.f
    public void P() {
        ((oe.k) this.b).b((oe.l) this.c);
    }

    public void Q(o0.f fVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.c;
        b6.i iVar = (b6.i) this.b;
        int i10 = fVar.b;
        if (i10 != 0) {
            nVar.execute(new g3(iVar, i10));
        } else {
            nVar.execute(new k9.u(20, iVar, fVar.a));
        }
    }

    @Override // p2.t
    public y2.n R(p2.p pVar, p2.m mVar) {
        return new c(20, ((p2.t) this.b).R(pVar, mVar), (List) this.c);
    }

    public void S() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public int T(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        o6.l.h(context);
        o6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((l6.e) this.c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override // org.telegram.ui.Components.kp0
    public void U(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + l5.e);
        l5.e = f7;
        ((l5) this.c).b.L();
    }

    @Override // oe.f
    public void a() {
        ((oe.k) this.b).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        s7.i iVar;
        long j10;
        long min;
        l6.c cVar;
        androidx.activity.n nVar = (androidx.activity.n) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        s7.k kVar = (s7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        com.google.android.gms.common.api.internal.p e = nVar.e();
        com.google.android.gms.common.api.internal.n nVar2 = e.c;
        nVar2.getClass();
        l6.c[] m10 = kVar.m();
        boolean z10 = false;
        if (m10 != null) {
            int length = m10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = m10[i10];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z10 = true;
            }
        }
        synchronized (kVar.V) {
            try {
                s7.i iVar2 = (s7.i) kVar.V.get(nVar2);
                if (iVar2 != null && !z10) {
                    iVar2.L0(e);
                    iVar = iVar2;
                    iVar2 = null;
                    String str = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                    if (z10) {
                        s7.z zVar = (s7.z) kVar.u();
                        int i11 = locationRequest.a;
                        long j11 = locationRequest.b;
                        long j12 = locationRequest.c;
                        long j13 = locationRequest.d;
                        long j14 = locationRequest.e;
                        int i12 = locationRequest.f;
                        float f7 = locationRequest.h;
                        boolean z11 = locationRequest.n;
                        long j15 = locationRequest.r;
                        int i13 = locationRequest.s;
                        int i14 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z12 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        s7.j jVar = locationRequest.E;
                        String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                        if (j12 == -1) {
                            min = j11;
                            j10 = -1;
                        } else if (i11 == 105) {
                            j10 = -1;
                            min = j12;
                        } else {
                            j10 = -1;
                            min = Math.min(j12, j11);
                        }
                        s7.o oVar = new s7.o(1, new s7.n(new LocationRequest(i11, j11, min, Math.max(j13, j11), Long.MAX_VALUE, j14, i12, f7, z11, j15 == j10 ? j11 : j15, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, iVar, null, new s7.h(taskCompletionSource, iVar), str);
                        Parcel N0 = zVar.N0();
                        s7.d.c(N0, oVar);
                        zVar.R0(N0, 59);
                    } else {
                        s7.z zVar2 = (s7.z) kVar.u();
                        s7.l lVar = new s7.l(2, iVar2 == null ? null : iVar2, iVar, null, null, str);
                        s7.e eVar = new s7.e(null, taskCompletionSource);
                        Parcel N02 = zVar2.N0();
                        s7.d.c(N02, lVar);
                        s7.d.c(N02, locationRequest);
                        s7.d.d(N02, eVar);
                        zVar2.R0(N02, 88);
                    }
                }
                s7.i iVar3 = new s7.i(nVar);
                kVar.V.put(nVar2, iVar3);
                iVar = iVar3;
                String str4 = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.wm0
    public void d(String str, String str2) {
        in0 in0Var = ((qm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            in0Var.O1(true, str2, (lj0) this.b, this, in0Var.B1);
        } else {
            in0Var.N1(true, false);
        }
    }

    @Override // org.telegram.ui.m7
    public void dismiss() {
        ((vu) this.c).dismiss();
    }

    @Override // hh.a
    public eh.d f() {
        if (Build.VERSION.SDK_INT < 29) {
            return new eh.f(this);
        }
        eh.e eVar = new eh.e(this);
        ((PhotoViewer) this.c).Z.add(eVar);
        return eVar;
    }

    @Override // org.telegram.ui.Components.hu
    public void g() {
        ((d3) this.c).b(((ju) this.b).getText());
    }

    @Override // id.a
    public Object get() {
        switch (this.a) {
            case 3:
                return new n5.d((Context) ((b9.p) this.b).a, (k6.c) ((jg.s0) this.c).get());
            default:
                pa.d dVar = new pa.d();
                u7.s sVar = new u7.s(24);
                Object obj = ((id.a) this.b).get();
                id.a aVar = (id.a) this.c;
                return new t5.g(dVar, sVar, t5.a.f, (t5.i) obj, aVar);
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // oe.f
    public boolean j() {
        return false;
    }

    @Override // oe.f
    public boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.Components.kp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.p81
    public void onError(s81 s81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.b0;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.b0 = i10 - 1;
        AndroidUtilities.runOnUIThread(new fy0(18, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        o31 o31Var = secretMediaViewer.i1;
        if (secretMediaViewer.y == null || secretMediaViewer.h0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(o31Var);
        AndroidUtilities.runOnUIThread(o31Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (i10 == 3 && secretMediaViewer.w.getVisibility() != 0) {
            secretMediaViewer.w.setVisibility(0);
        }
        if (secretMediaViewer.y.y() && i10 != 4) {
            if (secretMediaViewer.E) {
                return;
            }
            secretMediaViewer.E = true;
        } else if (secretMediaViewer.E) {
            secretMediaViewer.E = false;
            if (i10 == 4) {
                secretMediaViewer.H = true;
                if (secretMediaViewer.I) {
                    secretMediaViewer.e(true, !secretMediaViewer.q1);
                } else {
                    secretMediaViewer.y.L(0L, false);
                    secretMediaViewer.y.C();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.p81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        m4 m4Var = ((SecretMediaViewer) this.c).w;
        if (m4Var != null) {
            m4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // org.telegram.ui.m7
    public void q(w6 w6Var, ci.a aVar, boolean z10) {
        vu vuVar = (vu) this.c;
        uu uuVar = vuVar.X;
        if (aVar != null) {
            ((ci.b) this.b).i(aVar);
            vuVar.e0.e();
            ci.b bVar = vuVar.g0;
            iz0[] iz0VarArr = vuVar.b0;
            y1[] y1VarArr = vuVar.c0;
            y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                iz0 iz0Var = iz0VarArr[0];
                boolean z11 = bVar.m;
                iz0Var.c = z11;
                y1Var.c(z11, true);
            }
            y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                iz0 iz0Var2 = iz0VarArr[1];
                boolean z12 = bVar.n;
                iz0Var2.c = z12;
                y1Var2.c(z12, true);
            }
            y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                iz0 iz0Var3 = iz0VarArr[2];
                boolean z13 = bVar.o;
                iz0Var3.c = z13;
                y1Var3.c(z13, true);
            }
            y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                iz0 iz0Var4 = iz0VarArr[3];
                boolean z14 = bVar.p;
                iz0Var4.c = z14;
                y1Var4.c(z14, true);
            }
            y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                iz0 iz0Var5 = iz0VarArr[4];
                boolean z15 = bVar.q;
                iz0Var5.c = z15;
                y1Var5.c(z15, true);
            }
            vuVar.a0.a(uuVar.d(), true);
            uuVar.c(true);
        }
    }

    @Override // e2.d
    public k9.y t(b2.s0 s0Var) {
        k9.y t10 = ((e2.d) this.b).t(s0Var);
        if (t10 == null) {
            return null;
        }
        return qd.c(t10, new jg.e1(this, 21));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        fa.a aVar = (fa.a) obj;
        y9.n nVar = ((y9.k) this.c).e;
        if (aVar != null) {
            return Tasks.whenAll((Task<?>[]) new Task[]{y9.n.b(nVar), nVar.m.v((Executor) this.b, null)});
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 17:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // fi.wb
    public void v(float f7, boolean z10) {
        wa0 wa0Var = (wa0) this.b;
        fg0 fg0Var = (fg0) this.c;
        s81 s81Var = fg0Var.d;
        if (s81Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p10 = (long) ((((f7 / (1.0f - max)) * max) + f7) * s81Var.p());
        fg0Var.e = p10;
        fg0Var.d.L(p10, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(wa0Var);
        AndroidUtilities.runOnUIThread(wa0Var, 120L);
    }

    @Override // ri.a
    public void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.c).U0(canvas, (pa) this.b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public void x(Object obj, String str) {
        ((ArrayList) this.b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    public /* synthetic */ w1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.p81
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.c0) {
            return;
        }
        secretMediaViewer.c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ w1(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public w1(Context context) {
        this.a = 25;
        this.c = new AtomicLong(-1L);
        this.b = new q6.b(context, q6.b.k, new o6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
    }

    public /* synthetic */ w1(Object obj) {
        this.a = 5;
        this.c = obj;
        this.b = new ArrayList();
    }

    public w1(l6.e eVar) {
        this.a = 6;
        this.b = new SparseIntArray();
        o6.l.h(eVar);
        this.c = eVar;
    }

    public w1(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
    }

    public w1(fg0 fg0Var) {
        this.a = 11;
        this.c = fg0Var;
        this.b = new wa0(this, 11);
    }

    public w1(String str, String str2) {
        this.a = 23;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public w1(s4.j1 j1Var) {
        this.a = 19;
        this.b = j1Var;
        s4.i1 i1Var = new s4.i1();
        i1Var.a = 0;
        this.c = i1Var;
    }

    @Override // fi.wb
    public /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.m7
    public void clear() {
    }

    @Override // oe.f
    public void l() {
    }

    @Override // fi.wb
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.m7
    public void p() {
    }

    @Override // org.telegram.ui.Components.kp0
    public void y() {
    }

    public w1(int i10) {
        this.a = 27;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override // fi.wb
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // fi.wb
    public /* synthetic */ void C(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void D(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void F(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void J(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void L(long j10) {
    }

    @Override // fi.wb
    public /* synthetic */ void b(int i10) {
    }

    @Override // fi.wb
    public /* synthetic */ void c(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void e(float f7) {
    }

    @Override // oe.f
    public void i(boolean z10) {
    }

    @Override // fi.wb
    public /* synthetic */ void n(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void o(boolean z10) {
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // fi.wb
    public /* synthetic */ void u(float f7) {
    }

    @Override // fi.wb
    public /* synthetic */ void z(long j10) {
    }

    public w1(y9.k kVar, Executor executor, String str) {
        this.a = 29;
        this.c = kVar;
        this.b = executor;
    }

    public w1(PhotoViewer photoViewer) {
        this.a = 14;
        this.c = photoViewer;
        this.b = new pa(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // fi.wb
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // fi.wb
    public /* synthetic */ void E(float f7, int i10) {
    }

    @Override // fi.wb
    public /* synthetic */ void K(int i10, long j10) {
    }

    @Override // fi.wb
    public /* synthetic */ void h(long j10, boolean z10) {
    }

    @Override // fi.wb
    public /* synthetic */ void r(float f7, int i10) {
    }
}
