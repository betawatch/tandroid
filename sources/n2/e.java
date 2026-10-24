package n2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import android.widget.TextView;
import androidx.lifecycle.t0;
import b2.u0;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e2.m0;
import e9.l0;
import e9.n0;
import ei.zb;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an0;
import org.telegram.ui.im0;
import org.telegram.ui.l7;
import org.telegram.ui.m5;
import org.telegram.ui.mv0;
import org.telegram.ui.n31;
import org.telegram.ui.n4;
import org.telegram.ui.oj0;
import org.telegram.ui.om0;
import org.telegram.ui.v6;
import org.telegram.ui.xu;
import org.telegram.ui.yu;
import qg.j0;
import r7.z;
import s4.b1;
import s4.i1;
import u2.e1;
import v7.d8;
import w7.pa;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e implements gp0, gu, zb, l7, om0, gh.a, g81, p2.u, ne.d, com.google.android.gms.common.api.internal.r, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e f(Context context) {
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
        } catch (IOException | Error | OverlappingFileLockException e7) {
            e = e7;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new e(16, fileChannel, fileLock);
        } catch (IOException e10) {
            e = e10;
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
        } catch (Error e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public String E(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void G(sa.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.a);
            jSONObject.put("Status", m1.j.c(aVar.b));
            jSONObject.put("AuthToken", aVar.c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.g);
            l9.h hVar = (l9.h) this.c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(x())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // ne.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H(float f7, int i10) {
        boolean z10;
        qh.i iVar = (qh.i) this.c;
        boolean z11 = true;
        if ((iVar.c() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f7 == 1.0f) {
            int i11 = iVar.w;
            int i12 = iVar.v;
            if (i11 != i12) {
                iVar.w = i12;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                iVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        iVar.a();
    }

    @Override // p2.u
    public y2.n J() {
        return new mi.q(21, ((p2.u) this.b).J(), (List) this.c);
    }

    @Override // org.telegram.ui.Components.gp0
    public void L(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + m5.e);
        m5.e = f7;
        ((m5) this.c).b.L();
    }

    public void M(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        n0 u10 = n0.u(hashSet);
        hashSet.clear();
        l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            b bVar = (b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public void N(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        a6.i iVar = (a6.i) this.b;
        int i10 = fVar.b;
        if (i10 != 0) {
            oVar.execute(new androidx.activity.i(iVar, i10));
        } else {
            oVar.execute(new j9.u(20, iVar, fVar.a));
        }
    }

    public u0 O(b1 b1Var, int i10) {
        i1 i1Var;
        u0 u0Var;
        a0.f fVar = (a0.f) this.b;
        int c10 = fVar.c(b1Var);
        if (c10 >= 0 && (i1Var = (i1) fVar.h(c10)) != null) {
            int i11 = i1Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i1Var.a = i12;
                if (i10 == 4) {
                    u0Var = i1Var.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    u0Var = i1Var.c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    i1Var.a = 0;
                    i1Var.b = null;
                    i1Var.c = null;
                    i1.d.w(i1Var);
                }
                return u0Var;
            }
        }
        return null;
    }

    public void P(b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((b) this.c) != null) {
            return;
        }
        this.c = bVar;
        q o10 = bVar.b.o();
        bVar.z = o10;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = m0.a;
        o10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new a(u2.v.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), o10)).sendToTarget();
    }

    public sa.a Q() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(x());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new sa.a(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void R() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void S(b1 b1Var) {
        i1 i1Var = (i1) ((a0.f) this.b).get(b1Var);
        if (i1Var == null) {
            return;
        }
        i1Var.a &= -2;
    }

    public void T(b1 b1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (b1Var == hVar.n(m10)) {
                Object[] objArr = hVar.c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.a = true;
                }
            } else {
                m10--;
            }
        }
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var != null) {
            fVar.remove(b1Var);
            i1Var.a = 0;
            i1Var.b = null;
            i1Var.c = null;
            i1.d.w(i1Var);
        }
    }

    @Override // p2.u
    public y2.n U(p2.q qVar, p2.n nVar) {
        return new mi.q(21, ((p2.u) this.b).U(qVar, nVar), (List) this.c);
    }

    public c3.l0 V(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i11 >= iArr.length) {
                e2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.p();
            }
            if (i10 == iArr[i11]) {
                return ((e1[]) this.c)[i11];
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.om0
    public void a(String str, String str2) {
        an0 an0Var = ((im0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            an0Var.N1(true, str2, (oj0) this.b, this, an0Var.B1);
        } else {
            an0Var.M1(true, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        r7.i iVar;
        long j10;
        long min;
        k6.c cVar;
        androidx.activity.o oVar = (androidx.activity.o) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        r7.k kVar = (r7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        com.google.android.gms.common.api.internal.p e = oVar.e();
        com.google.android.gms.common.api.internal.n nVar = e.c;
        nVar.getClass();
        k6.c[] m10 = kVar.m();
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
                r7.i iVar2 = (r7.i) kVar.V.get(nVar);
                if (iVar2 != null && !z10) {
                    iVar2.L0(e);
                    iVar = iVar2;
                    iVar2 = null;
                    String str = nVar.b + "@" + System.identityHashCode(nVar.a);
                    if (z10) {
                        z zVar = (z) kVar.u();
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
                        r7.j jVar = locationRequest.E;
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
                        r7.o oVar2 = new r7.o(1, new r7.n(new LocationRequest(i11, j11, min, Math.max(j13, j11), Long.MAX_VALUE, j14, i12, f7, z11, j15 == j10 ? j11 : j15, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, iVar, null, new r7.h(taskCompletionSource, iVar), str);
                        Parcel N0 = zVar.N0();
                        r7.d.c(N0, oVar2);
                        zVar.R0(N0, 59);
                    } else {
                        z zVar2 = (z) kVar.u();
                        r7.l lVar = new r7.l(2, iVar2 == null ? null : iVar2, iVar, null, null, str);
                        r7.e eVar = new r7.e(null, taskCompletionSource);
                        Parcel N02 = zVar2.N0();
                        r7.d.c(N02, lVar);
                        r7.d.c(N02, locationRequest);
                        r7.d.d(N02, eVar);
                        zVar2.R0(N02, 88);
                    }
                }
                r7.i iVar3 = new r7.i(oVar);
                kVar.V.put(nVar, iVar3);
                iVar = iVar3;
                String str4 = nVar.b + "@" + System.identityHashCode(nVar.a);
                if (z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gh.a
    public dh.d d() {
        if (Build.VERSION.SDK_INT < 29) {
            return new dh.f(this);
        }
        dh.e eVar = new dh.e(this);
        ((PhotoViewer) this.c).Z.add(eVar);
        return eVar;
    }

    @Override // org.telegram.ui.l7
    public void dismiss() {
        ((yu) this.c).dismiss();
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.gu
    public void h() {
        ((e3) this.c).b(((iu) this.b).getText());
    }

    public void l(b1 b1Var, u0 u0Var) {
        a0.f fVar = (a0.f) this.b;
        i1 i1Var = (i1) fVar.get(b1Var);
        if (i1Var == null) {
            i1Var = i1.a();
            fVar.put(b1Var, i1Var);
        }
        i1Var.c = u0Var;
        i1Var.a |= 8;
    }

    @Override // ne.d
    public void o(int i10, float f7, float f10, ne.e eVar) {
        qh.i iVar = (qh.i) this.c;
        iVar.c.a(f7);
        iVar.d.a(f7);
        iVar.b.a(f7);
        ((Runnable) this.b).run();
    }

    @Override // org.telegram.ui.Components.g81
    public void onError(j81 j81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.b0;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.b0 = i10 - 1;
        AndroidUtilities.runOnUIThread(new mv0(28, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        n31 n31Var = secretMediaViewer.i1;
        if (secretMediaViewer.y == null || secretMediaViewer.h0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(n31Var);
        AndroidUtilities.runOnUIThread(n31Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
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

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        n4 n4Var = ((SecretMediaViewer) this.c).w;
        if (n4Var != null) {
            n4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // ei.zb
    public void q(float f7, boolean z10) {
        yb0 yb0Var = (yb0) this.b;
        ig0 ig0Var = (ig0) this.c;
        j81 j81Var = ig0Var.d;
        if (j81Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * j81Var.p());
        ig0Var.e = p5;
        ig0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(yb0Var);
        AndroidUtilities.runOnUIThread(yb0Var, 120L);
    }

    public void r(String str, PrintWriter printWriter) {
        w1.b bVar = (w1.b) this.c;
        if (bVar.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            a0.m mVar = bVar.d;
            if (i10 >= mVar.c) {
                return;
            }
            w1.a aVar = (w1.a) mVar.b[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.d.a[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.l);
            a6.d dVar = aVar.l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.a);
            if (dVar.b || dVar.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.c || dVar.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.d);
            }
            if (dVar.g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.g);
                printWriter.print(" waiting=");
                dVar.g.getClass();
                printWriter.println(false);
            }
            if (dVar.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.h);
                printWriter.print(" waiting=");
                dVar.h.getClass();
                printWriter.println(false);
            }
            if (aVar.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.n);
                b2.t tVar = aVar.n;
                tVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(tVar.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            a6.d dVar2 = aVar.l;
            Object obj = aVar.e;
            Object obj2 = obj != androidx.lifecycle.z.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.c > 0);
            i10++;
        }
    }

    @Override // org.telegram.ui.l7
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        yu yuVar = (yu) this.c;
        xu xuVar = yuVar.X;
        if (bVar != null) {
            ((bi.c) this.b).i(bVar);
            yuVar.e0.d();
            bi.c cVar = yuVar.g0;
            zy0[] zy0VarArr = yuVar.b0;
            z1[] z1VarArr = yuVar.c0;
            z1 z1Var = z1VarArr[0];
            if (z1Var != null) {
                zy0 zy0Var = zy0VarArr[0];
                boolean z11 = cVar.m;
                zy0Var.c = z11;
                z1Var.c(z11, true);
            }
            z1 z1Var2 = z1VarArr[1];
            if (z1Var2 != null) {
                zy0 zy0Var2 = zy0VarArr[1];
                boolean z12 = cVar.n;
                zy0Var2.c = z12;
                z1Var2.c(z12, true);
            }
            z1 z1Var3 = z1VarArr[2];
            if (z1Var3 != null) {
                zy0 zy0Var3 = zy0VarArr[2];
                boolean z13 = cVar.o;
                zy0Var3.c = z13;
                z1Var3.c(z13, true);
            }
            z1 z1Var4 = z1VarArr[3];
            if (z1Var4 != null) {
                zy0 zy0Var4 = zy0VarArr[3];
                boolean z14 = cVar.p;
                zy0Var4.c = z14;
                z1Var4.c(z14, true);
            }
            z1 z1Var5 = z1VarArr[4];
            if (z1Var5 != null) {
                zy0 zy0Var5 = zy0VarArr[4];
                boolean z15 = cVar.q;
                zy0Var5.c = z15;
                z1Var5.c(z15, true);
            }
            yuVar.a0.a(xuVar.d(), true);
            xuVar.c(true);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 25:
                ea.a aVar = (ea.a) obj;
                x9.m mVar = ((x9.k) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{x9.m.b(mVar), mVar.m.v((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            default:
                return ((x9.m) this.c).e.w(new u4.f(i10, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.a) {
            case 21:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public byte[] u(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File x() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        l9.h hVar = (l9.h) this.c;
                        hVar.a();
                        this.b = new File(hVar.a.getFilesDir(), "PersistedInstallation." + ((l9.h) this.c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    @Override // gh.a
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.c).V0(canvas, (na) this.b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public /* synthetic */ e(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.g81
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.c0) {
            return;
        }
        secretMediaViewer.c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ e(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public e(Context context) {
        this.a = 2;
        n6.l.h(context);
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public e(u2.c cVar) {
        this.a = 22;
        this.c = new d8();
        this.b = cVar;
        pa.b();
    }

    public e(androidx.lifecycle.t tVar, t0 t0Var) {
        this.a = 21;
        this.b = tVar;
        this.c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f).j(w1.b.class);
    }

    public e(j0 j0Var) {
        this.a = 13;
        this.b = j0Var;
    }

    public e(ig0 ig0Var) {
        this.a = 7;
        this.c = ig0Var;
        this.b = new yb0(this, 10);
    }

    public e(l9.h hVar) {
        this.a = 18;
        this.c = hVar;
    }

    public e(x9.k kVar, Executor executor, String str) {
        this.a = 25;
        this.c = kVar;
        this.b = executor;
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 17:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
            case 27:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // ei.zb
    public /* synthetic */ void D() {
    }

    @Override // org.telegram.ui.l7
    public void W0() {
    }

    @Override // gh.a
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.l7
    public void clear() {
    }

    @Override // ei.zb
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.gp0
    public void v() {
    }

    @Override // ei.zb
    public /* synthetic */ void A(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void C(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void F(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void K(long j10) {
    }

    @Override // ei.zb
    public /* synthetic */ void c(int i10) {
    }

    @Override // ei.zb
    public /* synthetic */ void e(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void g(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void k(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void m(boolean z10) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ei.zb
    public /* synthetic */ void p(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void s(long j10) {
    }

    @Override // ei.zb
    public /* synthetic */ void t(boolean z10) {
    }

    @Override // ei.zb
    public /* synthetic */ void z(float f7) {
    }

    public e(PhotoViewer photoViewer) {
        this.a = 10;
        this.c = photoViewer;
        this.b = new na(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // ei.zb
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // ei.zb
    public /* synthetic */ void I(int i10, long j10) {
    }

    @Override // ei.zb
    public /* synthetic */ void i(long j10, boolean z10) {
    }

    @Override // ei.zb
    public /* synthetic */ void n(float f7, int i10) {
    }

    @Override // ei.zb
    public /* synthetic */ void w(float f7, int i10) {
    }
}
