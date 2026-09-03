package f7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.WorkSource;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g5.o0;
import j$.util.DesugarCollections;
import j3.k1;
import j3.l1;
import j3.n1;
import j3.p1;
import j3.q1;
import j7.g8;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k7.oa;
import n7.qa;
import r0.j0;
import r0.m0;
import r0.m1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements com.google.android.gms.common.api.internal.s, g5.l, SuccessContinuation, o4.z, o3.n, od.b, r0.o, o0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(char c3, int i10) {
        this.a = i10;
    }

    private final void q(n3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new i5.w(this, fVar, 0));
        }
    }

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        m2.h hVar = (m2.h) this.c;
        m1 h = j0.h(view, m1Var);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = hVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 b10 = j0.b(hVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // o4.z
    public void a(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new k1(this, s6, jVar, rVar, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004d, B:22:0x005a, B:23:0x006e, B:25:0x008c, B:28:0x0099, B:29:0x0177, B:34:0x00b9, B:37:0x00f9, B:40:0x0118, B:43:0x0125, B:48:0x010f, B:50:0x0063), top: B:17:0x004d }] */
    @Override // com.google.android.gms.common.api.internal.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(Object obj, Object obj2) {
        j jVar;
        long j10;
        long min;
        y5.c cVar;
        androidx.activity.o oVar = (androidx.activity.o) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        l lVar = (l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        lVar.getClass();
        com.google.android.gms.common.api.internal.p e = oVar.e();
        com.google.android.gms.common.api.internal.n nVar = e.c;
        nVar.getClass();
        y5.c[] l10 = lVar.l();
        boolean z4 = false;
        if (l10 != null) {
            int length = l10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = l10[i10];
                if ("location_updates_with_callback".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.e() >= 1) {
                z4 = true;
            }
        }
        synchronized (lVar.S) {
            try {
                j jVar2 = (j) lVar.S.get(nVar);
                if (jVar2 != null && !z4) {
                    jVar2.K0(e);
                    jVar = jVar2;
                    jVar2 = null;
                    String str = nVar.b + "@" + System.identityHashCode(nVar.a);
                    if (z4) {
                        a0 a0Var = (a0) lVar.u();
                        int i11 = locationRequest.a;
                        long j11 = locationRequest.b;
                        long j12 = locationRequest.c;
                        long j13 = locationRequest.d;
                        long j14 = locationRequest.e;
                        int i12 = locationRequest.f;
                        float f10 = locationRequest.h;
                        boolean z10 = locationRequest.n;
                        long j15 = locationRequest.r;
                        int i13 = locationRequest.s;
                        int i14 = locationRequest.v;
                        String str2 = locationRequest.w;
                        boolean z11 = locationRequest.x;
                        WorkSource workSource = locationRequest.y;
                        k kVar = locationRequest.B;
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
                        p pVar = new p(1, new o(new LocationRequest(i11, j11, min, Math.max(j13, j11), Long.MAX_VALUE, j14, i12, f10, z10, j15 == j10 ? j11 : j15, i13, i14, str3, z11, new WorkSource(workSource), kVar), null, false, false, null, false, false, null, Long.MAX_VALUE), null, jVar, null, new i(taskCompletionSource, jVar), str);
                        Parcel M0 = a0Var.M0();
                        e.c(M0, pVar);
                        a0Var.Q0(M0, 59);
                    } else {
                        a0 a0Var2 = (a0) lVar.u();
                        m mVar = new m(2, jVar2 == null ? null : jVar2, jVar, null, null, str);
                        f fVar = new f(null, taskCompletionSource);
                        Parcel M02 = a0Var2.M0();
                        e.c(M02, mVar);
                        e.c(M02, locationRequest);
                        e.d(M02, fVar);
                        a0Var2.Q0(M02, 88);
                    }
                }
                j jVar3 = new j(oVar);
                lVar.S.put(nVar, jVar3);
                jVar = jVar3;
                String str4 = nVar.b + "@" + System.identityHashCode(nVar.a);
                if (z4) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o3.n
    public void b(int i10, o4.v vVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new l1(this, s6, 0));
        }
    }

    @Override // o3.n
    public void c(int i10, o4.v vVar, int i11) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new ah.a(this, s6, i11, 5));
        }
    }

    @Override // g5.l
    public g5.m createDataSource() {
        return new g5.t((Context) this.b, ((g5.u) this.c).createDataSource());
    }

    @Override // o4.z
    public void d(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new k1(this, s6, jVar, rVar, 2));
        }
    }

    @Override // o3.n
    public void e(int i10, o4.v vVar, Exception exc) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new androidx.car.app.utils.b(this, s6, exc, 13));
        }
    }

    @Override // o4.z
    public void f(int i10, o4.v vVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new j3.m1(this, s6, rVar, 0));
        }
    }

    @Override // o4.z
    public void g(int i10, o4.v vVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new n1(this, s6, jVar, rVar, iOException, z4, 0));
        }
    }

    @Override // o4.z
    public void h(int i10, o4.v vVar, o4.j jVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new k1(this, s6, jVar, rVar, 1));
        }
    }

    @Override // o4.z
    public void i(int i10, o4.v vVar, o4.r rVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new j3.m1(this, s6, rVar, 1));
        }
    }

    @Override // o3.n
    public void j(int i10, o4.v vVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new l1(this, s6, 2));
        }
    }

    @Override // g5.o0
    public Object k(Uri uri, g5.o oVar) {
        n4.a aVar = (n4.a) ((o0) this.b).k(uri, oVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (n4.a) aVar.a(list);
    }

    @Override // o3.n
    public void l(int i10, o4.v vVar) {
        Pair s6 = s(i10, vVar);
        if (s6 != null) {
            ((q1) this.c).i.c(new l1(this, s6, 1));
        }
    }

    public void m() {
        this.b = null;
        this.c = null;
    }

    public boolean n(int i10) {
        return ((h5.g) this.b).a.get(i10);
    }

    public void o() {
        String str = (String) this.b;
        try {
            n9.b bVar = (n9.b) this.c;
            bVar.getClass();
            new File(bVar.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public void p(n3.f fVar) {
        switch (this.a) {
            case 10:
                q(fVar);
                break;
            default:
                synchronized (fVar) {
                }
                Handler handler = (Handler) this.b;
                if (handler != null) {
                    handler.post(new l3.p(this, fVar, 1));
                    break;
                }
                break;
        }
    }

    public byte[] r(g4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            String str = aVar.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
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

    public Pair s(int i10, o4.v vVar) {
        o4.v vVar2;
        p1 p1Var = (p1) this.b;
        o4.v vVar3 = null;
        if (vVar != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= p1Var.c.size()) {
                    vVar2 = null;
                    break;
                }
                if (((o4.v) p1Var.c.get(i11)).d == vVar.d) {
                    Object obj = vVar.a;
                    Object obj2 = p1Var.b;
                    int i12 = j3.a.d;
                    vVar2 = vVar.b(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (vVar2 == null) {
                return null;
            }
            vVar3 = vVar2;
        }
        return Pair.create(Integer.valueOf(i10 + p1Var.d), vVar3);
    }

    public synchronized Map t() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 1;
        switch (this.a) {
            case 11:
                p9.b bVar = (p9.b) obj;
                i9.n nVar = ((i9.l) this.c).e;
                if (bVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{i9.n.b(nVar), nVar.m.v((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            case 12:
                p9.b bVar2 = (p9.b) obj;
                h2.g gVar = (h2.g) this.c;
                if (bVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                b bVar3 = (b) gVar.c;
                b bVar4 = (b) gVar.c;
                i9.n.b((i9.n) bVar3.c);
                ((i9.n) bVar4.c).m.v((Executor) this.b, null);
                ((i9.n) bVar4.c).q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((i9.n) this.c).e.I(new h2.g(i10, this, (Boolean) obj));
        }
    }

    public void u(k.a aVar) {
        rf.f fVar = (rf.f) this.b;
        ((ActionMode.Callback) fVar.b).onDestroyActionMode(fVar.s(aVar));
        g.q qVar = (g.q) this.c;
        if (qVar.B != null) {
            qVar.f.getDecorView().removeCallbacks(qVar.C);
        }
        if (qVar.y != null) {
            m0 m0Var = qVar.D;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = j0.a(qVar.y);
            a2.a(0.0f);
            qVar.D = a2;
            a2.d(new g.i(this, 2));
        }
        qVar.x = null;
        ViewGroup viewGroup = qVar.G;
        WeakHashMap weakHashMap = j0.a;
        r0.z.c(viewGroup);
        qVar.y();
    }

    public boolean v(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.q) this.c).G;
        WeakHashMap weakHashMap = j0.a;
        r0.z.c(viewGroup);
        rf.f fVar = (rf.f) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.b;
        k.e s6 = fVar.s(aVar);
        a0.k kVar = (a0.k) fVar.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(s6, menu2);
    }

    public void w(i5.y yVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new ff.c(13, this, yVar));
        }
    }

    @Override // od.b
    public Object z(od.c cVar, wc.c cVar2) {
        Object z4 = ((qa) this.b).z(new k1.s(cVar, (la.z) this.c), cVar2);
        return z4 == vc.a.a ? z4 : sc.i.a;
    }

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b(af.d dVar) {
        this.a = 21;
        this.c = new g8();
        this.b = dVar;
        oa.b();
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                g5.u uVar = new g5.u();
                this.b = context.getApplicationContext();
                this.c = uVar;
                break;
            default:
                this.b = context;
                this.c = null;
                break;
        }
    }

    public b(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 5:
                this.b = new HashMap();
                break;
            case 15:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public b(h5.g gVar, SparseArray sparseArray) {
        this.a = 19;
        this.b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = gVar.a(i10);
            k3.a aVar = (k3.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.c = sparseArray2;
    }

    public b(Handler handler, l3.q qVar) {
        this.a = 23;
        if (qVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = qVar;
    }

    public b(int i10) {
        this.a = 16;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 9;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.a = 9;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.a = 9;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(i9.l lVar, Executor executor, String str) {
        this.a = 11;
        this.c = lVar;
        this.b = executor;
    }

    public b(m2.h hVar) {
        this.a = 28;
        this.c = hVar;
        this.b = new Rect();
    }
}
