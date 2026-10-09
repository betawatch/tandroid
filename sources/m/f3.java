package m;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.t6;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.yi;
import org.telegram.ui.k9;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class f3 implements l.i, jp0, f5, ah.j, h81, a81, r0.n, u9, com.google.android.gms.common.api.internal.s, s4.f0, n5.b, w2.a, OnCompleteListener, y2.g {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static void o(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override // l.i
    public boolean A(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // ah.j
    public void B0(ah.a aVar) {
        aVar.a(((yi) this.b).getThemedColor(i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // s4.f0
    public void D(int i10, int i11) {
        ((s4.i0) this.b).p(i10, i11);
    }

    @Override // y2.g
    public void F(y2.i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // org.telegram.ui.u9
    public void K(String str) {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    @Override // s4.f0
    public void K0(int i10, int i11) {
        ((s4.i0) this.b).t(i10, i11);
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        gn0 gn0Var = (gn0) this.b;
        gn0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        gn0Var.s.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.jp0
    public void X(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.b;
        float f10 = hVar.b;
        float y3 = com.google.android.gms.internal.vision.e2.y(hVar.c, f10, f7, f10);
        hVar.d = y3;
        if (z10) {
            t6 t6Var = hVar.e;
            t6Var.getClass();
            t6Var.c(null, y3);
        }
        hVar.invalidate();
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // w2.a
    public long a(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.b;
            long j11 = aVar.b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j12 == -9223372036854775807L || j12 <= j3 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        g8.e eVar = (g8.e) this.b;
        r7.z zVar = (r7.z) ((r7.k) obj).u();
        r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
        Parcel N0 = zVar.N0();
        r7.d.c(N0, eVar);
        r7.d.d(N0, fVar);
        N0.writeString(null);
        zVar.R0(N0, 63);
    }

    @Override // w2.a
    public e9.i0 b(long j3) {
        int i10 = i(j3);
        if (i10 == 0) {
            e9.g0 g0Var = e9.i0.b;
            return e9.a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.b).get(i10 - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        e9.g0 g0Var2 = e9.i0.b;
        return e9.a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.a aVar, long j3) {
        boolean z10;
        int size;
        ArrayList arrayList = (ArrayList) this.b;
        long j10 = aVar.b;
        e2.d.b(j10 != -9223372036854775807L);
        if (j10 <= j3) {
            long j11 = aVar.d;
            if (j11 == -9223372036854775807L || j3 < j11) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j3) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // w2.a
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    @Override // w2.a
    public long d(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).b;
            if (j3 == j10) {
                return j10;
            }
            if (j3 < j10) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                return (j11 == -9223372036854775807L || j11 > j3) ? aVar.b : j11;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        return (j12 == -9223372036854775807L || j3 < j12) ? aVar2.b : j12;
    }

    @Override // w2.a
    public void e(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        int i10 = i(j3);
        if (i10 == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(i10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            i10--;
        }
        arrayList.subList(0, i10).clear();
    }

    public n4.a f() {
        return new n4.a(((AudioAttributes.Builder) this.b).build());
    }

    @Override // s4.f0
    public void f0(int i10, int i11) {
        ((s4.i0) this.b).s(i10, i11);
    }

    public void g() {
        pg.c1 c1Var = ((pg.e1) this.b).d;
        if (c1Var != null) {
            pg.b1 b1Var = c1Var.s;
            if (b1Var != null) {
                c1Var.cancelRunnable(b1Var);
                c1Var.s = null;
            }
            pg.b1 b1Var2 = new pg.b1(c1Var, 1);
            c1Var.s = b1Var2;
            c1Var.postRunnable(b1Var2, 1L);
        }
    }

    @Override // gd.a
    public Object get() {
        String packageName = ((Context) ((gd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Components.jp0
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.b;
        float f7 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
    }

    public void h(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public int i(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    @Override // org.telegram.ui.Components.jp0
    public /* synthetic */ int i0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.a81
    public void invalidate() {
        ((gh0) this.b).h.invalidate();
    }

    public void j(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int M = recyclerView.e.M();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < M; i15++) {
            View L = recyclerView.e.L(i15);
            s4.d1 U = RecyclerView.U(L);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((s4.q0) L.getLayoutParams()).c = true;
            }
        }
        pf.e eVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            s4.d1 d1Var = (s4.d1) arrayList2.get(size);
            if (d1Var != null && (i12 = d1Var.c) >= i10 && i12 < i14) {
                d1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.y0 = true;
    }

    @Override // s4.f0
    public void j1(int i10, int i11) {
        ((s4.i0) this.b).r(i10, i11, null);
    }

    public void k(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int M = recyclerView.e.M();
        for (int i12 = 0; i12 < M; i12++) {
            s4.d1 U = RecyclerView.U(recyclerView.e.L(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            s4.d1 d1Var = (s4.d1) arrayList.get(i13);
            if (d1Var != null && d1Var.c >= i10) {
                d1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    @Override // ah.j
    public void l(Canvas canvas) {
        yi yiVar = (yi) this.b;
        canvas.drawColor(yiVar.getThemedColor(i6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            yiVar.F2.b(canvas, -3);
        }
    }

    public void m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int M = recyclerView.e.M();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < M; i20++) {
            s4.d1 U = RecyclerView.U(recyclerView.e.L(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            s4.d1 d1Var = (s4.d1) arrayList.get(i21);
            if (d1Var != null && (i17 = d1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    d1Var.n(i11 - i10, false);
                } else {
                    d1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    @Override // l.i
    public void n(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        h hVar = toolbar.a.J;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.d).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.c0) it.next()).a.t();
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.b;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.L0(e0Var, false, null);
        }
    }

    @Override // org.telegram.ui.u9
    public void onDismiss() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.h81
    public void onError(k81 k81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onStateChanged(boolean z10, int i10) {
        t60 t60Var;
        VideoEditedInfo videoEditedInfo;
        l60 l60Var = (l60) this.b;
        k81 k81Var = l60Var.H0.T;
        if (k81Var != null && k81Var.y() && i10 == 4 && (videoEditedInfo = (t60Var = l60Var.H0).S) != null) {
            k81 k81Var2 = t60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            k81Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public f3 p(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    public /* bridge */ void q(int i10) {
        p(i10);
    }

    public void r(aa.b bVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((sc.u) this.b).c) {
        }
        throw new sc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), bVar);
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // y2.g
    public k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.b).a.x(iOException);
        return y2.l.e;
    }

    @Override // org.telegram.ui.u9
    public String z0() {
        return ((org.telegram.ui.web.b1) this.b).i0;
    }

    public f3(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 15;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    @Override // org.telegram.ui.Components.h81
    public void onRenderedFirstFrame() {
    }

    public f3(int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                this.b = new SparseArray();
                break;
            case 23:
                this.b = new ArrayList();
                break;
            case 26:
                this.b = new za.z[zf.b.values().length];
                break;
            default:
                this.b = new AudioAttributes.Builder();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jp0
    public void z() {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // y2.g
    public /* synthetic */ void C(y2.i iVar, long j3, long j10, int i10) {
    }

    @Override // y2.g
    public void O0(y2.i iVar, long j3, long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
