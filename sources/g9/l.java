package g9;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h7.d8;
import i7.c7;
import i7.oa;
import j3.n1;
import j3.o1;
import j3.p1;
import j3.r1;
import j3.s1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l4.b1;
import l4.c0;
import l4.h0;
import lh.d4;
import lh.h9;
import lh.i9;
import lh.m7;
import lh.w3;
import o5.e0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import r0.j0;
import r0.m1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l implements SuccessContinuation, h0, n3.g, md.b, s0, r0.o, OnCompleteListener, com.google.android.gms.common.api.internal.s, o9.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ l(int i10, byte b10) {
        this.a = i10;
    }

    public static String r(l lVar) {
        Collection<String> collection = (Collection) lVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) lVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                s5.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!s5.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        m2.g gVar = (m2.g) this.c;
        m1 h = j0.h(view, m1Var);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 b10 = j0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // l4.h0
    public void a(int i10, c0 c0Var, l4.p pVar, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.c).i.c(new n1(this, l10, pVar, xVar, 2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        z5.l.j("Not connected to device", e0Var.F == 2);
        s5.f fVar = (s5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(z5.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l4.h0
    public void b(int i10, c0 c0Var, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.c).i.c(new o1(this, l10, xVar, 1));
        }
    }

    @Override // l4.h0
    public void c(int i10, c0 c0Var, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.c).i.c(new o1(this, l10, xVar, 0));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public Object d(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        k4.a aVar = (k4.a) ((s0) this.b).d(uri, oVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (k4.a) aVar.a(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    @Override // md.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(md.c cVar, uc.c cVar2) {
        md.d dVar;
        int i10;
        l lVar;
        Throwable th2;
        switch (this.a) {
            case 13:
                Object e10 = ((l) this.b).e(new ja.a0(cVar, (ja.c0) this.c), cVar2);
                return e10 == tc.a.a ? e10 : qc.i.a;
            default:
                if (cVar2 instanceof md.d) {
                    dVar = (md.d) cVar2;
                    int i11 = dVar.b;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        dVar.b = i11 - TLObject.FLAG_31;
                        Object obj = dVar.a;
                        Object obj2 = tc.a.a;
                        i10 = dVar.b;
                        if (i10 != 0) {
                            c7.b(obj);
                            md.b bVar = (md.b) this.b;
                            dVar.d = this;
                            dVar.e = cVar;
                            dVar.b = 1;
                            obj = md.n.a(bVar, cVar, dVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            lVar = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c7.b(obj);
                                return qc.i.a;
                            }
                            cVar = dVar.e;
                            lVar = dVar.d;
                            c7.b(obj);
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                            ja.y yVar = (ja.y) lVar.c;
                            dVar.d = null;
                            dVar.e = null;
                            dVar.b = 2;
                            if (yVar.b(cVar, th2, dVar) == obj2) {
                                return obj2;
                            }
                        }
                        return qc.i.a;
                    }
                }
                dVar = new md.d(this, cVar2);
                Object obj3 = dVar.a;
                Object obj22 = tc.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                }
                th2 = (Throwable) obj3;
                if (th2 != null) {
                }
                return qc.i.a;
        }
    }

    @Override // l4.h0
    public void f(int i10, c0 c0Var, l4.p pVar, l4.x xVar, IOException iOException, boolean z10) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.c).i.c(new p1(this, l10, pVar, xVar, iOException, z10, 0));
        }
    }

    @Override // l4.h0
    public void g(int i10, c0 c0Var, l4.p pVar, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.c).i.c(new n1(this, l10, pVar, xVar, 1));
        }
    }

    @Override // l4.h0
    public void h(int i10, c0 c0Var, l4.p pVar, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.c).i.c(new n1(this, l10, pVar, xVar, 0));
        }
    }

    public boolean i(int i10) {
        return ((f5.g) this.b).a.get(i10);
    }

    public void j() {
        String str = (String) this.b;
        try {
            l9.b bVar = (l9.b) this.c;
            bVar.getClass();
            new File(bVar.b, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public nb.b k() {
        if (((nb.b) this.c) == null) {
            nb.f fVar = (nb.f) this.b;
            int[] iArr = fVar.c;
            mb.d dVar = fVar.a;
            int i10 = dVar.a;
            int i11 = dVar.b;
            nb.b bVar = new nb.b(i10, i11);
            if (fVar.b.length < i10) {
                fVar.b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 <= length / 16) {
                throw mb.e.a();
            }
            int i28 = i19 - 1;
            int i29 = i28;
            int i30 = -1;
            while (i28 > i22) {
                int i31 = i28 - i22;
                int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                if (i32 > i30) {
                    i29 = i28;
                    i30 = i32;
                }
                i28--;
            }
            int i33 = i29 << 3;
            byte[] a2 = dVar.a();
            for (int i34 = 0; i34 < i11; i34++) {
                int i35 = i34 * i10;
                for (int i36 = 0; i36 < i10; i36++) {
                    if ((a2[i35 + i36] & 255) < i33) {
                        int i37 = (i36 / 32) + (bVar.c * i34);
                        int[] iArr2 = bVar.d;
                        iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                    }
                }
            }
            this.c = bVar;
        }
        return (nb.b) this.c;
    }

    public Pair l(int i10, c0 c0Var) {
        c0 c0Var2;
        r1 r1Var = (r1) this.b;
        c0 c0Var3 = null;
        if (c0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= r1Var.c.size()) {
                    c0Var2 = null;
                    break;
                }
                if (((c0) r1Var.c.get(i11)).d == c0Var.d) {
                    Object obj = c0Var.a;
                    Object obj2 = r1Var.b;
                    int i12 = j3.a.d;
                    c0Var2 = c0Var.b(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (c0Var2 == null) {
                return null;
            }
            c0Var3 = c0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + r1Var.d), c0Var3);
    }

    @Override // o9.a
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        o9.a[] aVarArr = (o9.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            o9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.m(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((f7.v) this.c).m(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public o3.k n(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((m4.a) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (o3.k) a2.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public void o(boolean z10, boolean z11, float f9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        w3 w3Var = (w3) this.c;
        i9 i9Var = w3Var.e;
        i9.x1 = f9;
        h9 h9Var = i9Var.v0;
        if (h9Var != null) {
            h9Var.setSpeed(f9);
        }
        d4.a0(w3Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        m8.c cVar = (m8.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    public void p(o0.g gVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        ag.o1 o1Var = (ag.o1) this.b;
        int i10 = gVar.b;
        if (i10 != 0) {
            oVar.execute(new m7(o1Var, i10));
        } else {
            oVar.execute(new ab.o(26, o1Var, gVar.a));
        }
    }

    public o3.w q(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i11 >= iArr.length) {
                f5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new o3.j();
            }
            if (i10 == iArr[i11]) {
                return ((b1[]) this.c)[i11];
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                n9.a aVar = (n9.a) obj;
                p pVar = ((m) this.c).e;
                if (aVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{p.b(pVar), pVar.m.v((Executor) this.b, null)});
                }
                Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                return Tasks.forResult(null);
            case 1:
                n9.a aVar2 = (n9.a) obj;
                n nVar = (n) this.c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                l lVar = (l) nVar.c;
                l lVar2 = (l) nVar.c;
                p.b((p) lVar.c);
                ((p) lVar2.c).m.v((Executor) this.b, null);
                ((p) lVar2.c).q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((p) this.c).e.R(new n(i10, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.a) {
            case 22:
                try {
                    return k().toString();
                } catch (mb.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ l(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public l(androidx.biometric.e eVar) {
        this.a = 8;
        this.c = new d8();
        this.b = eVar;
        oa.b();
    }

    public l() {
        this.a = 4;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
    }

    public l(o9.a[] aVarArr) {
        this.a = 29;
        this.b = aVarArr;
        this.c = new f7.v(16);
    }

    public l(nb.f fVar) {
        this.a = 22;
        this.b = fVar;
    }

    public l(f5.g gVar, SparseArray sparseArray) {
        this.a = 14;
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

    public l(int i10) {
        this.a = 5;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 6;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public l(int i10, int i11) {
        this.a = 6;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    public l(int i10, int i11, int i12) {
        this.a = 6;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public l(m mVar, Executor executor, String str) {
        this.a = 0;
        this.c = mVar;
        this.b = executor;
    }

    public l(m2.g gVar) {
        this.a = 20;
        this.c = gVar;
        this.b = new Rect();
    }

    public l(m4.a aVar) {
        this.a = 26;
        this.b = aVar;
        this.c = new AtomicBoolean(false);
    }
}
