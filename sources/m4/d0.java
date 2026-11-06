package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import c8.xb;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.o0;
import e2.r0;
import h2.k0;
import h2.m0;
import h9.i0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import m.f3;
import org.telegram.messenger.a8;
import org.telegram.messenger.fa;
import org.telegram.messenger.fj;
import org.telegram.messenger.gf;
import org.telegram.messenger.gw;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.ys;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.y5;
import org.telegram.ui.bk0;
import org.telegram.ui.ef0;
import org.telegram.ui.fr0;
import org.telegram.ui.h5;
import org.telegram.ui.hy0;
import org.telegram.ui.kj0;
import org.telegram.ui.mw;
import org.telegram.ui.qj0;
import org.telegram.ui.tg0;
import org.telegram.ui.vw;
import org.telegram.ui.ww;
import ug.y0;
import v4.d1;
import v4.j1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d0 implements a0, Continuation, lm0, ws, l1, ej0, qj0, ri.a, h2.d, te.b, bi, com.google.android.gms.common.api.internal.p {
    public Object a;
    public Object b;

    public /* synthetic */ d0(Object obj) {
        this.b = null;
        this.a = obj;
    }

    @Override // h2.d
    public m9.y A(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        hy0 hy0Var = (hy0) this.b;
        if (hy0Var != null && (((uri = (Uri) hy0Var.c) != null && uri.equals(o0Var.n)) || ((bArr = (byte[]) hy0Var.b) != null && Arrays.equals(bArr, o0Var.k)))) {
            m9.y yVar = (m9.y) ((hy0) this.b).d;
            yVar.getClass();
            return yVar;
        }
        m9.y A = ((h2.d) this.a).A(o0Var);
        if (A == null) {
            return null;
        }
        this.b = new hy0(o0Var, A);
        return A;
    }

    public byte[] B(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
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
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    public long C0(int i7, int i10, int i11) {
        gw gwVar = ((gw[]) this.a)[i7];
        if (gwVar.c != null) {
            int i12 = gwVar.d;
            int i13 = gwVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = gwVar.d;
        int i15 = gwVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return gwVar.a;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 0L;
        }
        r0(i7);
        int i16 = i7 * 2;
        return Math.max(C0(i16, i10, i11), C0(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(q1 q1Var) {
        return null;
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
        if (((Map) this.b) == null) {
            Context context = (Context) this.a;
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
                    this.b = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.b = map;
        }
        String str4 = (String) ((Map) this.b).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // te.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(float f10, int i7) {
        boolean z9;
        rh.h hVar = (rh.h) this.b;
        boolean z10 = true;
        if ((hVar.c() == 0.0f && hVar.s == 2) || hVar.s == 3) {
            hVar.s = 1;
            z9 = true;
        } else {
            z9 = false;
        }
        if (f10 == 1.0f) {
            int i10 = hVar.x;
            int i11 = hVar.w;
            if (i10 != i11) {
                hVar.x = i11;
                if (z10) {
                    ((Runnable) this.a).run();
                }
                hVar.a();
            }
        }
        z10 = z9;
        if (z10) {
        }
        hVar.a();
    }

    @Override // org.telegram.ui.Components.bi
    public boolean G1() {
        System.currentTimeMillis();
        return true;
    }

    public long H0(int i7, int i10) {
        long[] jArr = (long[]) this.b;
        if (jArr.length >= 30) {
            return I0(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MAX_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 < j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    public tg0 I(int i7, long j3, boolean z9) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.b).get(i7, 0);
        }
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray V = ((g6.d0) this.a).V(j3, 0L);
        tg0 tg0Var = (tg0) (V != null ? V.get(j10) : null);
        if (tg0Var != null || !z9) {
            return tg0Var;
        }
        tg0 tg0Var2 = new tg0();
        ((g6.d0) this.a).Z(j3, 0L, j10, tg0Var2);
        return tg0Var2;
    }

    public long I0(int i7, int i10, int i11) {
        gw gwVar = ((gw[]) this.a)[i7];
        if (gwVar.c != null) {
            int i12 = gwVar.d;
            int i13 = gwVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = gwVar.d;
        int i15 = gwVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return gwVar.b;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 2147483647L;
        }
        r0(i7);
        int i16 = i7 * 2;
        return Math.min(I0(i16, i10, i11), I0(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean J0(long j3) {
        return ((ey0) this.b).w;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public String L(String str) {
        String str2 = (String) this.b;
        Resources resources = (Resources) this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean M() {
        y5 y5Var = (y5) this.b;
        return y5Var.I0 > 0.0f || y5Var.A0();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 N1() {
        return null;
    }

    public void O(long j3, File file) {
        synchronized (((e0.g) this.b).f) {
            ((HashMap) ((e0.g) this.b).g).put(Long.valueOf(j3), file);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean Q1(long j3) {
        return ((ey0) this.b).s;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    public void R0() {
        m8.a aVar = (m8.a) this.a;
        try {
            v7.f fVar = (v7.f) aVar.a;
            fVar.T0(fVar.P0(), 1);
            ((fa) this.b).c.remove(aVar);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    public void S0(d1 d1Var) {
        j1 j1Var = (j1) ((a0.f) this.a).get(d1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.a &= -2;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    public void T0(d1 d1Var) {
        a0.f fVar = (a0.f) this.a;
        a0.h hVar = (a0.h) this.b;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (d1Var == hVar.n(m10)) {
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
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var != null) {
            fVar.remove(d1Var);
            j1Var.a = 0;
            j1Var.b = null;
            j1Var.c = null;
            j1.d.q(j1Var);
        }
    }

    public void U0(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.a).a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i7);
            fVar.T0(P0, 11);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void V0(double d) {
        m8.a aVar = (m8.a) this.a;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.a;
            Parcel P0 = fVar.P0();
            P0.writeDouble(d);
            fVar.T0(P0, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // h2.d
    public m9.y W(byte[] bArr) {
        byte[] bArr2;
        hy0 hy0Var = (hy0) this.b;
        if (hy0Var == null || (bArr2 = (byte[]) hy0Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            m9.y W = ((h2.d) this.a).W(bArr);
            this.b = new hy0(bArr, W);
            return W;
        }
        m9.y yVar = (m9.y) ((hy0) this.b).d;
        yVar.getClass();
        return yVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    public void X0(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.a).a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i7);
            fVar.T0(P0, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        rh.h hVar = (rh.h) this.b;
        hVar.c.a(f10);
        hVar.d.a(f10);
        hVar.b.a(f10);
        ((Runnable) this.a).run();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.qj0
    public void a(String str, String str2) {
        bk0 bk0Var = ((kj0) this.b).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            bk0Var.S1(true, str2, (ef0) this.a, this, bk0Var.B1);
        } else {
            bk0Var.R1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x0053, B:15:0x0060, B:16:0x0074, B:18:0x00a5, B:21:0x00ae, B:25:0x00e4, B:51:0x006a), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x0053, B:15:0x0060, B:16:0x0074, B:18:0x00a5, B:21:0x00ae, B:25:0x00e4, B:51:0x006a), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // com.google.android.gms.common.api.internal.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        n6.c cVar;
        boolean z9;
        a0.l lVar;
        u7.i iVar;
        a0.l lVar2;
        long j3;
        int i7;
        androidx.activity.n nVar = (androidx.activity.n) this.a;
        LocationRequest locationRequest = (LocationRequest) this.b;
        u7.k kVar = (u7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        com.google.android.gms.common.api.internal.o g10 = nVar.g();
        com.google.android.gms.common.api.internal.m mVar = g10.b;
        mVar.getClass();
        q6.h0 h0Var = kVar.B;
        n6.c[] cVarArr = h0Var == null ? null : h0Var.b;
        if (cVarArr != null) {
            int length = cVarArr.length;
            ?? r12 = 0;
            while (true) {
                if (r12 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[r12];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    r12++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z9 = true;
                lVar = kVar.G;
                synchronized (lVar) {
                    try {
                        try {
                            u7.i iVar2 = (u7.i) kVar.G.get(mVar);
                            if (iVar2 != null && !z9) {
                                iVar2.N0(g10);
                                iVar = iVar2;
                                iVar2 = null;
                                int identityHashCode = System.identityHashCode(mVar.a);
                                String str = mVar.b;
                                StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                                sb2.append(str);
                                sb2.append("@");
                                sb2.append(identityHashCode);
                                String sb3 = sb2.toString();
                                if (z9) {
                                    u7.x xVar = (u7.x) kVar.n();
                                    int i10 = locationRequest.a;
                                    lVar2 = lVar;
                                    long j10 = locationRequest.b;
                                    long j11 = locationRequest.c;
                                    long j12 = locationRequest.d;
                                    long j13 = locationRequest.e;
                                    int i11 = locationRequest.f;
                                    float f10 = locationRequest.h;
                                    boolean z10 = locationRequest.n;
                                    long j14 = locationRequest.r;
                                    int i12 = locationRequest.s;
                                    int i13 = locationRequest.w;
                                    String str2 = locationRequest.x;
                                    boolean z11 = locationRequest.y;
                                    WorkSource workSource = locationRequest.D;
                                    u7.j jVar = locationRequest.E;
                                    String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                    if (j11 == -1) {
                                        j3 = -1;
                                        j11 = j10;
                                        i7 = i10;
                                    } else {
                                        j3 = -1;
                                        i7 = i10;
                                        if (i7 != 105) {
                                            j11 = Math.min(j11, j10);
                                        }
                                    }
                                    u7.l lVar3 = new u7.l(new LocationRequest(i7, j10, j11, Math.max(j12, j10), Long.MAX_VALUE, j13, i11, f10, z10, j14 == j3 ? j10 : j14, i12, i13, str3, z11, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                    u7.h hVar = new u7.h(taskCompletionSource, iVar);
                                    int i14 = u7.i.c;
                                    IInterface queryLocalInterface = iVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                    IInterface iVar3 = queryLocalInterface instanceof j8.j ? (j8.j) queryLocalInterface : new j8.i(iVar, "com.google.android.gms.location.ILocationCallback", 10);
                                    IInterface queryLocalInterface2 = hVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                    IInterface uVar = queryLocalInterface2 instanceof u7.w ? (u7.w) queryLocalInterface2 : new u7.u(hVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 10);
                                    Parcel P0 = xVar.P0();
                                    int i15 = u7.d.a;
                                    P0.writeInt(1);
                                    int r10 = xb.r(P0, 20293);
                                    xb.q(P0, 1, 4);
                                    P0.writeInt(1);
                                    xb.k(P0, 2, lVar3, 0);
                                    xb.f(P0, 5, iVar3.asBinder());
                                    xb.f(P0, 6, uVar.asBinder());
                                    xb.l(P0, 8, sb3);
                                    xb.s(P0, r10);
                                    xVar.T0(P0, 59);
                                } else {
                                    u7.x xVar2 = (u7.x) kVar.n();
                                    if (iVar2 == null) {
                                        iVar2 = null;
                                    }
                                    u7.e eVar = new u7.e(null, taskCompletionSource);
                                    Parcel P02 = xVar2.P0();
                                    int i16 = u7.d.a;
                                    P02.writeInt(1);
                                    int r11 = xb.r(P02, 20293);
                                    xb.q(P02, 1, 4);
                                    P02.writeInt(2);
                                    xb.f(P02, 2, iVar2);
                                    xb.f(P02, 3, iVar);
                                    xb.l(P02, 6, sb3);
                                    xb.s(P02, r11);
                                    P02.writeInt(1);
                                    locationRequest.writeToParcel(P02, 0);
                                    u7.d.c(P02, eVar);
                                    xVar2.T0(P02, 88);
                                    lVar2 = lVar;
                                }
                                return;
                            }
                            iVar = new u7.i(nVar);
                            kVar.G.put(mVar, iVar);
                            int identityHashCode2 = System.identityHashCode(mVar.a);
                            String str4 = mVar.b;
                            StringBuilder sb22 = new StringBuilder(str4.length() + 1 + String.valueOf(identityHashCode2).length());
                            sb22.append(str4);
                            sb22.append("@");
                            sb22.append(identityHashCode2);
                            String sb32 = sb22.toString();
                            if (z9) {
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
        z9 = false;
        lVar = kVar.G;
        synchronized (lVar) {
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // m4.a0
    public void c(h2.x xVar) {
        e0 e0Var = (e0) this.b;
        SparseArray sparseArray = e0Var.h;
        d4.f fVar = (d4.f) this.a;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a10 = xVar.a() / 4;
            for (int i7 = 0; i7 < a10; i7++) {
                xVar.k(0, 4, (byte[]) fVar.b);
                fVar.J(0);
                int j3 = fVar.j(16);
                fVar.L(3);
                if (j3 == 0) {
                    fVar.L(13);
                } else {
                    int j10 = fVar.j(13);
                    if (sparseArray.get(j10) == null) {
                        sparseArray.put(j10, new b0(new a4.k(e0Var, j10)));
                        e0Var.n++;
                    }
                }
            }
            if (e0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // org.telegram.ui.Components.bi
    public void c0(qg qgVar) {
        qgVar.run();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean d() {
        return false;
    }

    @Override // ri.a
    public void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        Paint paint = (Paint) this.a;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
        y0 y0Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(k6.a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            y0Var.d(0, (-premiumPreviewFragment.d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, premiumPreviewFragment.d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.d0.getMeasuredHeight());
            canvas.drawRect(f10, f11, f12, f13, y0Var.f);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        ww wwVar = (ww) this.b;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            if (t2Var.n2) {
                wwVar.Z4(t2Var.getDialogId(), view);
                return true;
            }
        }
        mw mwVar = wwVar.z0;
        if (mwVar != null && mwVar.getVisibility() == 0 && wwVar.z0.n) {
            return false;
        }
        return wwVar.A4(view, i7, f10, ((vw) this.a).d);
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.ej0
    public void i() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((ww) this.b).finishPreviewFragment();
        }
    }

    public void j0(Exception exc, boolean z9) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        i0 q10 = i0.q(hashSet);
        hashSet.clear();
        h9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            q2.b bVar = (q2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z9 ? 1 : 3, exc);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 k2() {
        return null;
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        h5.j1 = f10;
        ((TextView) this.a).setText("Saturation " + (f10 * 5.0f));
        rt0 rt0Var = ((h5) this.b).i1;
        rt0Var.M();
        rt0Var.L();
    }

    public void l0(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.b;
        gf.g gVar = (gf.g) this.a;
        int i7 = fVar.b;
        if (i7 != 0) {
            oVar.execute(new f3(gVar, i7));
        } else {
            oVar.execute(new m9.u(25, gVar, fVar.a));
        }
    }

    @Override // org.telegram.ui.Components.ws
    public void m() {
        ((h3) this.b).b(((ys) this.a).getText());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(r5 r5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    public r0 o0(d1 d1Var, int i7) {
        j1 j1Var;
        r0 r0Var;
        a0.f fVar = (a0.f) this.a;
        int d = fVar.d(d1Var);
        if (d >= 0 && (j1Var = (j1) fVar.i(d)) != null) {
            int i10 = j1Var.a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                j1Var.a = i11;
                if (i7 == 4) {
                    r0Var = j1Var.b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    r0Var = j1Var.c;
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    j1Var.a = 0;
                    j1Var.b = null;
                    j1Var.c = null;
                    j1.d.q(j1Var);
                }
                return r0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.bi
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar = (di) this.a;
        try {
            HashMap<Object, Object> selectedPhotos = diVar.a2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            gf gfVar = (gf) selectedPhotos.values().iterator().next();
            String str = gfVar.h;
            if (str == null) {
                str = gfVar.I;
            }
            tg.g0 g0Var = (tg.g0) this.b;
            g0Var.d0(g0Var.f0(str, true));
            diVar.dismiss();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.ej0
    public void q(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((ww) this.b).movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ int q0() {
        return 0;
    }

    public void r0(int i7) {
        gw[] gwVarArr = (gw[]) this.a;
        gw gwVar = gwVarArr[i7];
        Integer num = gwVar.c;
        if (num != null) {
            int i10 = i7 * 2;
            w(gwVarArr[i10], num.intValue());
            w(gwVarArr[i10 + 1], gwVar.c.intValue());
            gwVar.c = null;
        }
    }

    public void s(d1 d1Var, r0 r0Var) {
        a0.f fVar = (a0.f) this.a;
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var == null) {
            j1Var = j1.a();
            fVar.put(d1Var, j1Var);
        }
        j1Var.c = r0Var;
        j1Var.a |= 8;
    }

    public void t(int i7, int i10, int i11) {
        gw[] gwVarArr = (gw[]) this.a;
        gw gwVar = new gw();
        gwVar.c = null;
        gwVarArr[i7] = gwVar;
        gwVar.d = i10;
        gwVar.e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.b)[i10];
            gwVar.a = j3;
            gwVar.b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        t(i12, i10, i13);
        int i14 = i12 + 1;
        t(i14, i10 + i13, i11 - i13);
        gw gwVar2 = gwVarArr[i7];
        gw gwVar3 = gwVarArr[i12];
        gwVar3.getClass();
        gw gwVar4 = gwVarArr[i14];
        gwVar4.getClass();
        gwVar2.getClass();
        gwVar2.a = Math.max(gwVar3.a, gwVar4.a);
        gwVarArr[i7].b = Math.min(gwVarArr[i12].b, gwVarArr[i14].b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        m6.c cVar = (m6.c) this.a;
        Bundle bundle = (Bundle) this.b;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : cVar.d(bundle).onSuccessTask(m6.d.b, pb.b.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    public void v0(q2.b bVar) {
        ((HashSet) this.a).add(bVar);
        if (((q2.b) this.b) != null) {
            return;
        }
        this.b = bVar;
        q2.p q10 = bVar.b.q();
        bVar.z = q10;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = m0.a;
        q10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), q10)).sendToTarget();
    }

    public void w(gw gwVar, int i7) {
        gwVar.c = Integer.valueOf(i7);
        int i10 = gwVar.d;
        long j3 = i7;
        gwVar.a = j3;
        gwVar.b = j3;
        ((long[]) this.b)[i10] = j3;
    }

    public long w0(int i7, int i10) {
        long[] jArr = (long[]) this.b;
        if (jArr.length >= 30) {
            return C0(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MIN_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 > j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public String y(long j3) {
        String trim = ((EditTextBoldCursor) this.a).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((ey0) this.b).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    public /* synthetic */ d0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ d0(Object obj, Object obj2, boolean z9) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ d0(Object obj, boolean z9) {
        this.a = obj;
    }

    public d0(long[] jArr) {
        this.b = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.a = new gw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        t(1, 0, jArr.length);
    }

    public d0(int i7) {
        switch (i7) {
            case 19:
                this.a = new HashSet();
                break;
            case 20:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            case 29:
                this.a = new a0.f(0);
                this.b = new a0.h();
                break;
            default:
                this.a = new g6.d0(24);
                this.b = new SparseIntArray();
                break;
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override // m4.a0
    public void b(k0 k0Var, f3.q qVar, g0 g0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
