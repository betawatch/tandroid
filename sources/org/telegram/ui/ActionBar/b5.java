package org.telegram.ui.ActionBar;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.WorkSource;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import ci.pc;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ru;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn0;
import org.telegram.ui.e31;
import org.telegram.ui.h7;
import org.telegram.ui.hv;
import org.telegram.ui.iv;
import org.telegram.ui.nn0;
import org.telegram.ui.r6;
import org.telegram.ui.tk0;
import org.telegram.ui.vm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class b5 implements e6, jp0, pu, pc, h7, bn0, fh.a, me.d, com.google.android.gms.common.api.internal.s, n5.b, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b5(int i10, byte b10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // me.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(float f7, int i10) {
        boolean z10;
        ph.i iVar = (ph.i) this.c;
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

    @Override // ci.pc
    public void B(float f7, boolean z10) {
        bd0 bd0Var = (bd0) this.b;
        lg0 lg0Var = (lg0) this.c;
        k81 k81Var = lg0Var.d;
        if (k81Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * k81Var.p());
        lg0Var.e = p5;
        lg0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(bd0Var);
        AndroidUtilities.runOnUIThread(bd0Var, 120L);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint F(String str) {
        switch (this.a) {
            case 0:
                return i6.T0(str);
            case 7:
                return i6.T0(str);
            default:
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.T0(str) : e6Var.F(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void I0(int i10, int i11) {
        switch (this.a) {
            case 0:
            case 7:
                break;
            default:
                e6 e6Var = (e6) this.c;
                if (e6Var != null) {
                    e6Var.I0(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jp0
    public void X(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + org.telegram.ui.i5.e);
        org.telegram.ui.i5.e = f7;
        ((org.telegram.ui.i5) this.c).b.M();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.e6
    public boolean a() {
        switch (this.a) {
        }
        return i6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int a1(int i10) {
        switch (this.a) {
            case 0:
                return ((SparseIntArray) this.b).get(i10);
            case 7:
                return x0(i10);
            default:
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.x0(null, i10, false) : e6Var.a1(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        r7.i iVar;
        long j3;
        long min;
        k6.c cVar;
        androidx.activity.n nVar = (androidx.activity.n) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        r7.k kVar = (r7.k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        kVar.getClass();
        com.google.android.gms.common.api.internal.p e7 = nVar.e();
        com.google.android.gms.common.api.internal.n nVar2 = e7.c;
        nVar2.getClass();
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
                r7.i iVar2 = (r7.i) kVar.V.get(nVar2);
                if (iVar2 != null && !z10) {
                    iVar2.L0(e7);
                    iVar = iVar2;
                    iVar2 = null;
                    String str = nVar2.b + "@" + System.identityHashCode(nVar2.a);
                    if (z10) {
                        r7.z zVar = (r7.z) kVar.u();
                        int i11 = locationRequest.a;
                        long j10 = locationRequest.b;
                        long j11 = locationRequest.c;
                        long j12 = locationRequest.d;
                        long j13 = locationRequest.e;
                        int i12 = locationRequest.f;
                        float f7 = locationRequest.h;
                        boolean z11 = locationRequest.n;
                        long j14 = locationRequest.r;
                        int i13 = locationRequest.s;
                        int i14 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z12 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        r7.j jVar = locationRequest.E;
                        String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                        if (j11 == -1) {
                            min = j10;
                            j3 = -1;
                        } else if (i11 == 105) {
                            j3 = -1;
                            min = j11;
                        } else {
                            j3 = -1;
                            min = Math.min(j11, j10);
                        }
                        r7.o oVar = new r7.o(1, new r7.n(new LocationRequest(i11, j10, min, Math.max(j12, j10), Long.MAX_VALUE, j13, i12, f7, z11, j14 == j3 ? j10 : j14, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, iVar, null, new r7.h(taskCompletionSource, iVar), str);
                        Parcel N0 = zVar.N0();
                        r7.d.c(N0, oVar);
                        zVar.R0(N0, 59);
                    } else {
                        r7.z zVar2 = (r7.z) kVar.u();
                        r7.l lVar = new r7.l(2, iVar2 == null ? null : iVar2, iVar, null, null, str);
                        r7.e eVar = new r7.e(null, taskCompletionSource);
                        Parcel N02 = zVar2.N0();
                        r7.d.c(N02, lVar);
                        r7.d.c(N02, locationRequest);
                        r7.d.d(N02, eVar);
                        zVar2.R0(N02, 88);
                    }
                }
                r7.i iVar3 = new r7.i(nVar);
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

    @Override // org.telegram.ui.bn0
    public void c(String str, String str2) {
        nn0 nn0Var = ((vm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            nn0Var.N1(true, str2, (tk0) this.b, this, nn0Var.B1);
        } else {
            nn0Var.M1(true, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int c0(int i10) {
        switch (this.a) {
            case 0:
                return x0(i10);
            case 7:
                return x0(i10);
            default:
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.x0(null, i10, false) : e6Var.c0(i10);
        }
    }

    @Override // org.telegram.ui.h7
    public void dismiss() {
        ((iv) this.c).dismiss();
    }

    @Override // gd.a
    public Object get() {
        int i10 = 24;
        ob.a aVar = new ob.a(i10);
        na.d dVar = new na.d(i10);
        Object obj = ((gd.a) this.b).get();
        gd.a aVar2 = (gd.a) this.c;
        return new s5.g(aVar, dVar, s5.a.f, (s5.i) obj, aVar2);
    }

    @Override // org.telegram.ui.Components.jp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                return null;
            case 7:
                return null;
            default:
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.P0(str) : e6Var.getDrawable(str);
        }
    }

    @Override // org.telegram.ui.Components.pu
    public void i() {
        org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.c;
        ((ru) this.b).getText();
        g3Var.b();
    }

    @Override // org.telegram.ui.Components.jp0
    public /* synthetic */ int i0() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList j() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        m.f3 f3Var = (m.f3) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) f3Var.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new q9.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    public View k(int i10, int i11, int i12, int i13) {
        s4.i1 i1Var = (s4.i1) this.c;
        s4.j1 j1Var = (s4.j1) this.b;
        int c10 = j1Var.c();
        int c02 = j1Var.c0();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View u02 = j1Var.u0(i10);
            int b10 = j1Var.b(u02);
            int w02 = j1Var.w0(u02);
            i1Var.b = c10;
            i1Var.c = c02;
            i1Var.d = b10;
            i1Var.e = w02;
            if (i12 != 0) {
                i1Var.a = i12;
                if (i1Var.a()) {
                    return u02;
                }
            }
            if (i13 != 0) {
                i1Var.a = i13;
                if (i1Var.a()) {
                    view = u02;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public boolean k0() {
        switch (this.a) {
            case 0:
                return false;
            case 7:
                return false;
            default:
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.b1() : e6Var.k0();
        }
    }

    @Override // fh.a
    public ch.d l() {
        if (Build.VERSION.SDK_INT < 29) {
            return new ch.f(this);
        }
        ch.e eVar = new ch.e(this);
        ((PhotoViewer) this.c).Z.add(eVar);
        return eVar;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                i6.q(f7, f10, i10, i11);
                break;
            case 7:
                i6.q(f7, f10, i10, i11);
                break;
            default:
                e6 e6Var = (e6) this.c;
                if (e6Var != null) {
                    e6Var.m(f7, f10, i10, i11);
                    break;
                } else {
                    i6.q(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        ph.i iVar = (ph.i) this.c;
        iVar.c.a(f7);
        iVar.d.a(f7);
        iVar.b.a(f7);
        ((Runnable) this.b).run();
    }

    public boolean r(View view) {
        s4.i1 i1Var = (s4.i1) this.c;
        s4.j1 j1Var = (s4.j1) this.b;
        int c10 = j1Var.c();
        int c02 = j1Var.c0();
        int b10 = j1Var.b(view);
        int w02 = j1Var.w0(view);
        i1Var.b = c10;
        i1Var.c = c02;
        i1Var.d = b10;
        i1Var.e = w02;
        i1Var.a = 24579;
        return i1Var.a();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 20:
                da.b bVar = (da.b) obj;
                w9.m mVar = ((w9.k) this.c).e;
                if (bVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{w9.m.b(mVar), mVar.m.y((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            default:
                return ((w9.m) this.c).e.l(new u4.f(i10, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // fh.a
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.c).T0(canvas, (qa) this.b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public c3.h0 w(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.c;
            if (i11 >= iArr.length) {
                e2.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c3.n();
            }
            if (i10 == iArr[i11]) {
                return ((u2.a1[]) this.b)[i11];
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        switch (this.a) {
            case 0:
                return i6.v3;
            case 7:
                return i6.v3;
            default:
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.v3 : e6Var.x();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int x0(int i10) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : i6.x0(null, i10, false);
            case 7:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                return sparseIntArray2 != null ? sparseIntArray2.get(i10) : i6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                e6 e6Var = (e6) this.c;
                return e6Var == null ? i6.x0(null, i10, false) : e6Var.x0(i10);
        }
    }

    @Override // org.telegram.ui.h7
    public void y0(r6 r6Var, zh.a aVar, boolean z10) {
        iv ivVar = (iv) this.c;
        hv hvVar = ivVar.X;
        if (aVar != null) {
            ((zh.b) this.b).i(aVar);
            ivVar.e0.d();
            zh.b bVar = ivVar.g0;
            dz0[] dz0VarArr = ivVar.b0;
            org.telegram.ui.Cells.a2[] a2VarArr = ivVar.c0;
            org.telegram.ui.Cells.a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                dz0 dz0Var = dz0VarArr[0];
                boolean z11 = bVar.m;
                dz0Var.c = z11;
                a2Var.c(z11, true);
            }
            org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                dz0 dz0Var2 = dz0VarArr[1];
                boolean z12 = bVar.n;
                dz0Var2.c = z12;
                a2Var2.c(z12, true);
            }
            org.telegram.ui.Cells.a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                dz0 dz0Var3 = dz0VarArr[2];
                boolean z13 = bVar.o;
                dz0Var3.c = z13;
                a2Var3.c(z13, true);
            }
            org.telegram.ui.Cells.a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                dz0 dz0Var4 = dz0VarArr[3];
                boolean z14 = bVar.p;
                dz0Var4.c = z14;
                a2Var4.c(z14, true);
            }
            org.telegram.ui.Cells.a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                dz0 dz0Var5 = dz0VarArr[4];
                boolean z15 = bVar.q;
                dz0Var5.c = z15;
                a2Var5.c(z15, true);
            }
            ivVar.a0.a(hvVar.d(), true);
            hvVar.c(true);
        }
    }

    public /* synthetic */ b5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ b5(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public b5(e6 e6Var) {
        this.a = 8;
        this.b = new SparseIntArray();
        this.c = e6Var;
        f();
    }

    public b5() {
        this.a = 22;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
    }

    public b5(pg.i0 i0Var) {
        this.a = 9;
        this.b = i0Var;
    }

    public b5(lg0 lg0Var) {
        this.a = 3;
        this.c = lg0Var;
        this.b = new bd0(this, 9);
    }

    public b5(s4.j1 j1Var) {
        this.a = 14;
        this.b = j1Var;
        s4.i1 i1Var = new s4.i1();
        i1Var.a = 0;
        this.c = i1Var;
    }

    public b5(int i10) {
        this.a = 18;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b5(w9.k kVar, Executor executor, String str) {
        this.a = 20;
        this.c = kVar;
        this.b = executor;
    }

    public b5(e31 e31Var) {
        this.a = 7;
        this.c = e31Var;
    }

    public b5(PhotoViewer photoViewer) {
        this.a = 6;
        this.c = photoViewer;
        this.b = new qa(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // ci.pc
    public /* synthetic */ void C(long j3) {
    }

    @Override // ci.pc
    public /* synthetic */ void G(boolean z10) {
    }

    @Override // ci.pc
    public /* synthetic */ void K(float f7) {
    }

    @Override // ci.pc
    public /* synthetic */ void M(float f7) {
    }

    @Override // ci.pc
    public /* synthetic */ void Q(float f7) {
    }

    @Override // ci.pc
    public /* synthetic */ void R() {
    }

    @Override // ci.pc
    public /* synthetic */ void T(float f7) {
    }

    @Override // ci.pc
    public /* synthetic */ void V(long j3) {
    }

    @Override // ci.pc
    public /* synthetic */ void b(int i10) {
    }

    @Override // org.telegram.ui.h7
    public void clear() {
    }

    @Override // fh.a
    public /* synthetic */ void d() {
    }

    @Override // ci.pc
    public /* synthetic */ void e(float f7) {
    }

    public void f() {
    }

    @Override // ci.pc
    public /* synthetic */ void g(float f7) {
    }

    @Override // org.telegram.ui.h7
    public void g1() {
    }

    @Override // ci.pc
    public /* synthetic */ void o() {
    }

    @Override // ci.pc
    public /* synthetic */ void p(float f7) {
    }

    @Override // ci.pc
    public /* synthetic */ void q(boolean z10) {
    }

    @Override // ci.pc
    public /* synthetic */ void y(float f7) {
    }

    @Override // org.telegram.ui.Components.jp0
    public void z() {
    }

    private final /* synthetic */ void s(int i10, int i11) {
    }

    private final /* synthetic */ void t(int i10, int i11) {
    }

    @Override // ci.pc
    public /* synthetic */ void I(float f7, int i10) {
    }

    @Override // ci.pc
    public /* synthetic */ void O(float f7, int i10) {
    }

    @Override // ci.pc
    public /* synthetic */ void U(int i10, long j3) {
    }

    @Override // ci.pc
    public /* synthetic */ void h(long j3, boolean z10) {
    }

    @Override // ci.pc
    public /* synthetic */ void u(float f7, int i10) {
    }
}
