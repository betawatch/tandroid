package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.ga;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.rw;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.ay;
import org.telegram.ui.g5;
import org.telegram.ui.ll0;
import org.telegram.ui.mg0;
import org.telegram.ui.qs0;
import org.telegram.ui.qx;
import org.telegram.ui.tk0;
import org.telegram.ui.zh0;
import org.telegram.ui.zk0;
import org.telegram.ui.zx;
import th.n7;
import th.o7;
import th.u2;
import th.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements e2.d, mn0, kt, org.telegram.ui.Cells.l1, jk0, zk0, hi.a, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ c(char c10, int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c r(Context context) {
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
            return new c(fileChannel, fileLock, false, 25);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(org.telegram.ui.Cells.q1 q1Var, jj jjVar) {
        return false;
    }

    public void B(int i10, int i11, int i12) {
        rw[] rwVarArr = (rw[]) this.b;
        rw rwVar = new rw();
        rwVar.c = null;
        rwVarArr[i10] = rwVar;
        rwVar.d = i11;
        rwVar.e = (i11 + i12) - 1;
        if (i12 == 1) {
            long j10 = ((long[]) this.c)[i11];
            rwVar.a = j10;
            rwVar.b = j10;
            return;
        }
        int i13 = i10 * 2;
        int i14 = i12 / 2;
        B(i13, i11, i14);
        int i15 = i13 + 1;
        B(i15, i11 + i14, i12 - i14);
        rw rwVar2 = rwVarArr[i10];
        rw rwVar3 = rwVarArr[i13];
        rwVar3.getClass();
        rw rwVar4 = rwVarArr[i15];
        rwVar4.getClass();
        rwVar2.getClass();
        rwVar2.a = Math.max(rwVar3.a, rwVar4.a);
        rwVarArr[i10].b = Math.min(rwVarArr[i13].b, rwVarArr[i15].b);
    }

    public void B0(s4.c1 c1Var) {
        s4.j1 j1Var = (s4.j1) ((a0.f) this.b).get(c1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.a &= -2;
    }

    public void D(rw rwVar, int i10) {
        rwVar.c = Integer.valueOf(i10);
        int i11 = rwVar.d;
        long j10 = i10;
        rwVar.a = j10;
        rwVar.b = j10;
        ((long[]) this.c)[i11] = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory E(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    public void E0(s4.c1 c1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (c1Var == hVar.n(m10)) {
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
        s4.j1 j1Var = (s4.j1) fVar.get(c1Var);
        if (j1Var != null) {
            fVar.remove(c1Var);
            j1Var.a = 0;
            j1Var.b = null;
            j1Var.c = null;
            s4.j1.d.r(j1Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public zh0 F(int i10, long j10, boolean z10) {
        if (i10 > 0) {
            i10 = ((SparseIntArray) this.c).get(i10, 0);
        }
        if (i10 == 0) {
            return null;
        }
        long j11 = i10;
        LongSparseArray s10 = ((l2.f) this.b).s(j10, 0L);
        zh0 zh0Var = (zh0) (s10 != null ? s10.get(j11) : null);
        if (zh0Var != null || !z10) {
            return zh0Var;
        }
        zh0 zh0Var2 = new zh0();
        ((l2.f) this.b).O(j10, 0L, j11, zh0Var2);
        return zh0Var2;
    }

    public void G0(int i10) {
        try {
            s7.f fVar = (s7.f) ((j8.a) this.b).a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 11);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public void H0(double d) {
        j8.a aVar = (j8.a) this.b;
        aVar.getClass();
        try {
            s7.f fVar = (s7.f) aVar.a;
            Parcel P0 = fVar.P0();
            P0.writeDouble(d);
            fVar.T0(P0, 5);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        return null;
    }

    public File I() {
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

    @Override // org.telegram.ui.Cells.l1
    public boolean I0(long j10) {
        return ((iz0) this.c).w;
    }

    public void K(sa.a aVar) {
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
            if (createTempFile.renameTo(I())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean K1(long j10) {
        return ((iz0) this.c).s;
    }

    public boolean L() {
        b6 b6Var = (b6) this.c;
        return b6Var.I0 > 0.0f || b6Var.z0();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    public boolean N(n4.t tVar, String str) {
        Context context = (Context) this.b;
        int i10 = tVar.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, tVar.a) == 0 : context.checkPermission(str, i10, tVar.c) == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void P0(int i10) {
        try {
            s7.f fVar = (s7.f) ((j8.a) this.b).a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 9);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    public int Q0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        n6.l.g(context);
        n6.l.g(cVar);
        int i10 = 0;
        if (!cVar.l()) {
            return 0;
        }
        int m10 = cVar.m();
        int i11 = sparseIntArray.get(m10, -1);
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
            if (keyAt > m10 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.c).d(context, m10);
        }
        sparseIntArray.put(m10, i10);
        return i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    public void V(long j10, File file) {
        synchronized (((e0.h) this.c).f) {
            ((HashMap) ((e0.h) this.c).g).put(Long.valueOf(j10), file);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public void X(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        u2 u2Var = (u2) this.c;
        o7 o7Var = u2Var.e;
        o7.B1 = f7;
        n7 n7Var = o7Var.z0;
        if (n7Var != null) {
            n7Var.setSpeed(f7);
        }
        z2.Y(u2Var.x, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // e2.d
    public j9.y a(b2.s0 s0Var) {
        Uri uri;
        byte[] bArr;
        li.k kVar = (li.k) this.c;
        if (kVar != null && (((uri = (Uri) kVar.c) != null && uri.equals(s0Var.n)) || ((bArr = (byte[]) kVar.b) != null && Arrays.equals(bArr, s0Var.k)))) {
            j9.y yVar = (j9.y) ((li.k) this.c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y a2 = ((e2.d) this.b).a(s0Var);
        if (a2 == null) {
            return null;
        }
        this.c = new li.k(s0Var, a2);
        return a2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x004f, B:12:0x005c, B:13:0x0070, B:15:0x0093, B:18:0x009c, B:22:0x00d2, B:48:0x0066), top: B:7:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:8:0x004f, B:12:0x005c, B:13:0x0070, B:15:0x0093, B:18:0x009c, B:22:0x00d2, B:48:0x0066), top: B:7:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        k6.c cVar;
        boolean z10;
        a0.l lVar;
        r7.i iVar;
        a0.l lVar2;
        long j10;
        int i10;
        androidx.activity.o oVar = (androidx.activity.o) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        r7.k kVar = (r7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        com.google.android.gms.common.api.internal.p h = oVar.h();
        com.google.android.gms.common.api.internal.n nVar = h.c;
        nVar.getClass();
        k6.c[] n10 = kVar.n();
        if (n10 != null) {
            int length = n10.length;
            ?? r12 = 0;
            while (true) {
                if (r12 >= length) {
                    cVar = null;
                    break;
                }
                cVar = n10[r12];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    r12++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z10 = true;
                lVar = kVar.V;
                synchronized (lVar) {
                    try {
                        try {
                            r7.i iVar2 = (r7.i) kVar.V.get(nVar);
                            if (iVar2 != null && !z10) {
                                iVar2.N0(h);
                                iVar = iVar2;
                                iVar2 = null;
                                String str = nVar.b + "@" + System.identityHashCode(nVar.a);
                                if (z10) {
                                    r7.x xVar = (r7.x) kVar.v();
                                    int i11 = locationRequest.a;
                                    lVar2 = lVar;
                                    long j11 = locationRequest.b;
                                    long j12 = locationRequest.c;
                                    long j13 = locationRequest.d;
                                    long j14 = locationRequest.e;
                                    int i12 = locationRequest.f;
                                    float f7 = locationRequest.h;
                                    boolean z11 = locationRequest.n;
                                    long j15 = locationRequest.r;
                                    int i13 = locationRequest.s;
                                    int i14 = locationRequest.w;
                                    String str2 = locationRequest.x;
                                    boolean z12 = locationRequest.y;
                                    WorkSource workSource = locationRequest.D;
                                    r7.j jVar = locationRequest.E;
                                    String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                    if (j12 == -1) {
                                        j10 = -1;
                                        j12 = j11;
                                        i10 = i11;
                                    } else {
                                        j10 = -1;
                                        i10 = i11;
                                        if (i10 != 105) {
                                            j12 = Math.min(j12, j11);
                                        }
                                    }
                                    r7.l lVar3 = new r7.l(new LocationRequest(i10, j11, j12, Math.max(j13, j11), Long.MAX_VALUE, j14, i12, f7, z11, j15 == j10 ? j11 : j15, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                    r7.h hVar = new r7.h(taskCompletionSource, iVar);
                                    int i15 = r7.i.c;
                                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                    IInterface jVar2 = queryLocalInterface instanceof g8.k ? (g8.k) queryLocalInterface : new g8.j(iVar, "com.google.android.gms.location.ILocationCallback", 8);
                                    IInterface queryLocalInterface2 = hVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                    IInterface uVar = queryLocalInterface2 instanceof r7.w ? (r7.w) queryLocalInterface2 : new r7.u(hVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 8);
                                    Parcel P0 = xVar.P0();
                                    int i16 = r7.d.a;
                                    P0.writeInt(1);
                                    int q6 = w7.h0.q(P0, 20293);
                                    w7.h0.s(P0, 1, 4);
                                    P0.writeInt(1);
                                    w7.h0.k(P0, 2, lVar3, 0);
                                    w7.h0.f(P0, 5, jVar2.asBinder());
                                    w7.h0.f(P0, 6, uVar.asBinder());
                                    w7.h0.l(P0, 8, str);
                                    w7.h0.r(P0, q6);
                                    xVar.T0(P0, 59);
                                } else {
                                    r7.x xVar2 = (r7.x) kVar.v();
                                    if (iVar2 == null) {
                                        iVar2 = null;
                                    }
                                    r7.e eVar = new r7.e(null, taskCompletionSource);
                                    Parcel P02 = xVar2.P0();
                                    int i17 = r7.d.a;
                                    P02.writeInt(1);
                                    int q10 = w7.h0.q(P02, 20293);
                                    w7.h0.s(P02, 1, 4);
                                    P02.writeInt(2);
                                    w7.h0.f(P02, 2, iVar2);
                                    w7.h0.f(P02, 3, iVar);
                                    w7.h0.l(P02, 6, str);
                                    w7.h0.r(P02, q10);
                                    P02.writeInt(1);
                                    locationRequest.writeToParcel(P02, 0);
                                    r7.d.c(P02, eVar);
                                    xVar2.T0(P02, 88);
                                    lVar2 = lVar;
                                }
                                return;
                            }
                            iVar = new r7.i(oVar);
                            kVar.V.put(nVar, iVar);
                            String str4 = nVar.b + "@" + System.identityHashCode(nVar.a);
                            if (z10) {
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = lVar;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        z10 = false;
        lVar = kVar.V;
        synchronized (lVar) {
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        ay ayVar = (ay) this.c;
        if (view instanceof v2) {
            v2 v2Var = (v2) view;
            if (v2Var.n2) {
                ayVar.Y4(v2Var.getDialogId(), view);
                return true;
            }
        }
        qx qxVar = ayVar.z0;
        if (qxVar != null && qxVar.getVisibility() == 0 && ayVar.z0.n) {
            return false;
        }
        return ayVar.z4(view, i10, f7, ((zx) this.b).d);
    }

    public ac.g b0(s4.c1 c1Var, int i10) {
        s4.j1 j1Var;
        ac.g gVar;
        a0.f fVar = (a0.f) this.b;
        int c10 = fVar.c(c1Var);
        if (c10 >= 0 && (j1Var = (s4.j1) fVar.h(c10)) != null) {
            int i11 = j1Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                j1Var.a = i12;
                if (i10 == 4) {
                    gVar = j1Var.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    gVar = j1Var.c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c10);
                    j1Var.a = 0;
                    j1Var.b = null;
                    j1Var.c = null;
                    s4.j1.d.r(j1Var);
                }
                return gVar;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.zk0
    public void d(String str, String str2) {
        ll0 ll0Var = ((tk0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            ll0Var.R1(true, str2, (mg0) this.b, this, ll0Var.B1);
        } else {
            ll0Var.Q1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // hi.a
    public void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        kg.k1 k1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(t6.a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
        } else {
            k1Var.d(0, (-premiumPreviewFragment.d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, premiumPreviewFragment.d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.d0.getMeasuredHeight());
            canvas.drawRect(f7, f10, f11, f12, k1Var.f);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.jk0
    public void g() {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            ((ay) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public void h0(int i10) {
        rw[] rwVarArr = (rw[]) this.b;
        rw rwVar = rwVarArr[i10];
        Integer num = rwVar.c;
        if (num != null) {
            int i11 = i10 * 2;
            D(rwVarArr[i11], num.intValue());
            D(rwVarArr[i11 + 1], rwVar.c.intValue());
            rwVar.c = null;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        return false;
    }

    public long j0(int i10, int i11) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return k0(1, i10, i11);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > jArr.length - 1) {
            i11 = jArr.length - 1;
        }
        long j10 = Long.MIN_VALUE;
        while (i10 <= i11) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
            i10++;
        }
        return j10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        g5.j1 = f7;
        ((TextView) this.b).setText("Saturation " + (f7 * 5.0f));
        uu0 uu0Var = ((g5) this.c).i1;
        uu0Var.M();
        uu0Var.L();
    }

    public long k0(int i10, int i11, int i12) {
        rw rwVar = ((rw[]) this.b)[i10];
        if (rwVar.c != null) {
            int i13 = rwVar.d;
            int i14 = rwVar.e;
            if (i11 >= i13 && i12 <= i14) {
                return r1.intValue();
            }
        }
        int i15 = rwVar.d;
        int i16 = rwVar.e;
        if (i15 >= i11 && i16 <= i12) {
            return rwVar.a;
        }
        if ((i11 > i15 || i12 < i15) && (i11 < i15 || i11 > i16)) {
            return 0L;
        }
        h0(i10);
        int i17 = i10 * 2;
        return Math.max(k0(i17, i11, i12), k0(i17 + 1, i11, i12));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.kt
    public void m() {
        ((j3) this.c).b(((mt) this.b).getText());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    public long n0(int i10, int i11) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return q0(1, i10, i11);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > jArr.length - 1) {
            i11 = jArr.length - 1;
        }
        long j10 = Long.MAX_VALUE;
        while (i10 <= i11) {
            long j11 = jArr[i10];
            if (j11 < j10) {
                j10 = j11;
            }
            i10++;
        }
        return j10;
    }

    @Override // org.telegram.ui.Components.jk0
    public void p(float f7) {
        Point point = org.telegram.messenger.i0.q;
        if (point.x > point.y) {
            ((ay) this.c).movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    public long q0(int i10, int i11, int i12) {
        rw rwVar = ((rw[]) this.b)[i10];
        if (rwVar.c != null) {
            int i13 = rwVar.d;
            int i14 = rwVar.e;
            if (i11 >= i13 && i12 <= i14) {
                return r1.intValue();
            }
        }
        int i15 = rwVar.d;
        int i16 = rwVar.e;
        if (i15 >= i11 && i16 <= i12) {
            return rwVar.b;
        }
        if ((i11 > i15 || i12 < i15) && (i11 < i15 || i11 > i16)) {
            return 2147483647L;
        }
        h0(i10);
        int i17 = i10 * 2;
        return Math.min(q0(i17, i11, i12), q0(i17 + 1, i11, i12));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        return false;
    }

    public sa.a t0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[TLObject.FLAG_14];
        try {
            FileInputStream fileInputStream = new FileInputStream(I());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, TLObject.FLAG_14);
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
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        ((ArrayList) this.b).add(a1.g.C(str, "=", String.valueOf(obj)));
    }

    public void u0() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void v0() {
        j8.a aVar = (j8.a) this.b;
        try {
            s7.f fVar = (s7.f) aVar.a;
            fVar.T0(fVar.P0(), 1);
            ((ga) this.c).c.remove(aVar);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // e2.d
    public j9.y w(byte[] bArr) {
        byte[] bArr2;
        li.k kVar = (li.k) this.c;
        if (kVar == null || (bArr2 = (byte[]) kVar.b) == null || !Arrays.equals(bArr2, bArr)) {
            j9.y w9 = ((e2.d) this.b).w(bArr);
            this.c = new li.k(bArr, w9);
            return w9;
        }
        j9.y yVar = (j9.y) ((li.k) this.c).d;
        yVar.getClass();
        return yVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public String x(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((iz0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    public void y(s4.c1 c1Var, ac.g gVar) {
        a0.f fVar = (a0.f) this.b;
        s4.j1 j1Var = (s4.j1) fVar.get(c1Var);
        if (j1Var == null) {
            j1Var = s4.j1.a();
            fVar.put(c1Var, j1Var);
        }
        j1Var.c = gVar;
        j1Var.a |= 8;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ c(Object obj) {
        this.a = 5;
        this.c = obj;
        this.b = new ArrayList();
    }

    public c(k6.e eVar) {
        this.a = 6;
        this.b = new SparseIntArray();
        n6.l.g(eVar);
        this.c = eVar;
    }

    public c(long[] jArr) {
        this.a = 11;
        this.c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.b = new rw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        B(1, 0, jArr.length);
    }

    public c(l9.h hVar) {
        this.a = 27;
        this.c = hVar;
    }

    public c(Context context) {
        this.a = 1;
        this.c = null;
        this.b = context;
    }

    public c(int i10) {
        this.a = 7;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    public c(EditText editText) {
        this.a = 22;
        this.b = editText;
        q1.i iVar = new q1.i(editText);
        this.c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.b == null) {
            synchronized (q1.a.a) {
                try {
                    if (q1.a.b == null) {
                        q1.a aVar = new q1.a();
                        try {
                            q1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    public c(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 19;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    public c(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 26:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
            default:
                this.b = new l2.f(9);
                this.c = new SparseIntArray();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
