package og;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.WorkSource;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import bi.ge;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ey0;
import org.telegram.ui.i5;
import org.telegram.ui.m4;
import org.telegram.ui.uw;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.z41;
import zh.a3;
import zh.t7;
import zh.u7;
import zh.v2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u0 implements f6, no0, du, ge, ml0, eh.a, q71, p2.s, com.google.android.gms.common.api.internal.s, n5.b, y2.p, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ u0(int i10) {
        this.a = i10;
    }

    public static u0 e(View view) {
        return new u0(view);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint F(String str) {
        return j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : j6.w0(null, i10, false);
    }

    @Override // bi.ge
    public void I(float f7, boolean z10) {
        kc0 kc0Var = (kc0) this.b;
        tf0 tf0Var = (tf0) this.c;
        t71 t71Var = tf0Var.d;
        if (t71Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * t71Var.p());
        tf0Var.e = p5;
        tf0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(kc0Var);
        AndroidUtilities.runOnUIThread(kc0Var, 120L);
    }

    @Override // p2.s
    public y2.p J() {
        return new u0(16, ((p2.s) this.b).J(), (List) this.c);
    }

    @Override // p2.s
    public y2.p T(p2.o oVar, p2.l lVar) {
        return new u0(16, ((p2.s) this.b).T(oVar, lVar), (List) this.c);
    }

    @Override // org.telegram.ui.Components.no0
    public void W(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.c).b.M();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return j6.I.q();
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
                    iVar2.M0(e);
                    iVar = iVar2;
                    iVar2 = null;
                    String str = nVar.b + "@" + System.identityHashCode(nVar.a);
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
                        r7.o oVar2 = new r7.o(1, new r7.n(new LocationRequest(i11, j10, min, Math.max(j12, j10), Long.MAX_VALUE, j13, i12, f7, z11, j14 == j3 ? j10 : j14, i13, i14, str3, z12, new WorkSource(workSource), jVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, iVar, null, new r7.h(taskCompletionSource, iVar), str);
                        Parcel O0 = zVar.O0();
                        r7.d.c(O0, oVar2);
                        zVar.S0(O0, 59);
                    } else {
                        r7.z zVar2 = (r7.z) kVar.u();
                        r7.l lVar = new r7.l(2, iVar2 == null ? null : iVar2, iVar, null, null, str);
                        r7.e eVar = new r7.e(null, taskCompletionSource);
                        Parcel O02 = zVar2.O0();
                        r7.d.c(O02, lVar);
                        r7.d.c(O02, locationRequest);
                        r7.d.d(O02, eVar);
                        zVar2.S0(O02, 88);
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

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        wy wyVar = (wy) this.c;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            if (r2Var.n2) {
                wyVar.N4(r2Var.getDialogId(), view);
                return true;
            }
        }
        uw uwVar = wyVar.z0;
        if (uwVar != null && uwVar.getVisibility() == 0 && wyVar.z0.n) {
            return false;
        }
        return wyVar.o4(view, i10, f7, ((vy) this.b).d);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int e0(int i10) {
        return F0(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList f() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        l2.g gVar = (l2.g) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) gVar.b;
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

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        return ((SparseIntArray) this.b).get(i10);
    }

    public View g(int i10, int i11, int i12, int i13) {
        s4.g1 g1Var = (s4.g1) this.c;
        s4.h1 h1Var = (s4.h1) this.b;
        int m10 = h1Var.m();
        int q6 = h1Var.q();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View r10 = h1Var.r(i10);
            int f7 = h1Var.f(r10);
            int s10 = h1Var.s(r10);
            g1Var.b = m10;
            g1Var.c = q6;
            g1Var.d = f7;
            g1Var.e = s10;
            if (i12 != 0) {
                g1Var.a = i12;
                if (g1Var.a()) {
                    return r10;
                }
            }
            if (i13 != 0) {
                g1Var.a = i13;
                if (g1Var.a()) {
                    view = r10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // fd.a
    public Object get() {
        int i10 = 23;
        rb.a aVar = new rb.a(i10);
        qb.b bVar = new qb.b(i10);
        Object obj = ((fd.a) this.b).get();
        fd.a aVar2 = (fd.a) this.c;
        return new s5.g(aVar, bVar, s5.a.f, (s5.i) obj, aVar2);
    }

    @Override // org.telegram.ui.Components.no0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.Components.ml0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((wy) this.c).finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.du
    public void j() {
        f3 f3Var = (f3) this.c;
        ((fu) this.b).getText();
        f3Var.b();
    }

    @Override // eh.a
    public bh.d k() {
        return new bh.f(this);
    }

    @Override // org.telegram.ui.Components.no0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override // y2.p
    public Object l2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.p) this.b).l2(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean m0() {
        return false;
    }

    public boolean o(View view) {
        s4.g1 g1Var = (s4.g1) this.c;
        s4.h1 h1Var = (s4.h1) this.b;
        int m10 = h1Var.m();
        int q6 = h1Var.q();
        int f7 = h1Var.f(view);
        int s10 = h1Var.s(view);
        g1Var.b = m10;
        g1Var.c = q6;
        g1Var.d = f7;
        g1Var.e = s10;
        g1Var.a = 24579;
        return g1Var.a();
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(t71 t71Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.b0;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.b0 = i10 - 1;
        AndroidUtilities.runOnUIThread(new ey0(25, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        z41 z41Var = secretMediaViewer.i1;
        if (secretMediaViewer.y == null || secretMediaViewer.h0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(z41Var);
        AndroidUtilities.runOnUIThread(z41Var);
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

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        m4 m4Var = ((SecretMediaViewer) this.c).w;
        if (m4Var != null) {
            m4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public void p(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((wy) this.c).movePreviewFragment(f7);
        }
    }

    public void q(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        v2 v2Var = (v2) this.c;
        u7 u7Var = v2Var.e;
        u7.B1 = f7;
        t7 t7Var = u7Var.z0;
        if (t7Var != null) {
            t7Var.setSpeed(f7);
        }
        a3.a0(v2Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 21:
                da.a aVar = (da.a) obj;
                w9.m mVar = ((w9.k) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{w9.m.b(mVar), mVar.m.y((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            default:
                return ((w9.m) this.c).e.p(new u4.g(i10, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "Bounds{lower=" + ((i0.c) this.b) + " upper=" + ((i0.c) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // eh.a
    public void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        qg.c1 c1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(j6.a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
        } else {
            c1Var.d(0, (-premiumPreviewFragment.d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, premiumPreviewFragment.d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.d0.getMeasuredHeight());
            canvas.drawRect(f7, f10, f11, f12, c1Var.f);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter w() {
        return j6.v3;
    }

    public /* synthetic */ u0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.c0) {
            return;
        }
        secretMediaViewer.c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ u0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public u0() {
        this.a = 23;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
    }

    public u0(Context context) {
        this.a = 17;
        this.b = context;
        this.c = null;
    }

    public u0(View view) {
        this.a = 5;
        e71 e71Var = new e71(this, view);
        this.b = e71Var;
        view.addOnLayoutChangeListener(e71Var);
    }

    public u0(tf0 tf0Var) {
        this.a = 4;
        this.c = tf0Var;
        this.b = new kc0(this, 9);
    }

    public u0(String str, String str2) {
        this.a = 19;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public u0(s4.h1 h1Var) {
        this.a = 14;
        this.b = h1Var;
        s4.g1 g1Var = new s4.g1();
        g1Var.a = 0;
        this.c = g1Var;
    }

    public u0(w9.k kVar, Executor executor, String str) {
        this.a = 21;
        this.c = kVar;
        this.b = executor;
    }

    public u0(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 8;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override // bi.ge
    public /* synthetic */ void H(float f7) {
    }

    @Override // bi.ge
    public /* synthetic */ void Q(long j3) {
    }

    @Override // bi.ge
    public /* synthetic */ void S(boolean z10) {
    }

    @Override // bi.ge
    public /* synthetic */ void X(float f7) {
    }

    @Override // eh.a
    public /* synthetic */ void b() {
    }

    @Override // bi.ge
    public /* synthetic */ void d(int i10) {
    }

    @Override // bi.ge
    public /* synthetic */ void d0(float f7) {
    }

    @Override // bi.ge
    public /* synthetic */ void g0(float f7) {
    }

    @Override // bi.ge
    public /* synthetic */ void h0() {
    }

    @Override // bi.ge
    public /* synthetic */ void i(float f7) {
    }

    @Override // bi.ge
    public /* synthetic */ void l0(float f7) {
    }

    @Override // bi.ge
    public /* synthetic */ void m(float f7) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // bi.ge
    public /* synthetic */ void q0(long j3) {
    }

    @Override // bi.ge
    public /* synthetic */ void r() {
    }

    @Override // bi.ge
    public /* synthetic */ void x(float f7) {
    }

    @Override // org.telegram.ui.Components.no0
    public void y() {
    }

    @Override // bi.ge
    public /* synthetic */ void z(boolean z10) {
    }

    @Override // bi.ge
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // bi.ge
    public /* synthetic */ void V(float f7, int i10) {
    }

    @Override // bi.ge
    public /* synthetic */ void f0(float f7, int i10) {
    }

    @Override // bi.ge
    public /* synthetic */ void n(long j3, boolean z10) {
    }

    @Override // bi.ge
    public /* synthetic */ void n0(int i10, long j3) {
    }
}
