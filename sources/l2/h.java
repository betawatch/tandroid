package l2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.i0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import k1.a0;
import m.e3;
import n4.r;
import n4.x;
import n4.y;
import og.e1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.yi;
import r7.z;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import xh.x3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class h implements y2.o, no0, m.k, k1.f, c5, zg.g, q71, t81, s, h1, w2.a, hq0, y2.i {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public boolean A(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void B(c1 c1Var, q0 q0Var, q0 q0Var2) {
        boolean z10;
        c1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = c1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void D(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        o0 o0Var = recyclerView.x;
        View view = c1Var.a;
        of.e eVar = recyclerView.b;
        e3 e3Var = o0Var.a;
        gh.h hVar = (gh.h) e3Var.b;
        int indexOfChild = hVar.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) e3Var.c).C(indexOfChild)) {
                e3Var.X(view);
            }
            hVar.a(indexOfChild);
        }
        eVar.g(view);
    }

    public void E() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + G());
    }

    public void F(long j3) {
        long G = G();
        if (G != j3) {
            if (G != -1) {
                if (G != -2) {
                    return;
                } else {
                    G = -2;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(G);
            throw new IOException(t10.toString());
        }
    }

    public long G() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        g0 g0Var = (g0) this.b;
        g0Var.l0(i10, i11, z10);
        g0Var.dismiss();
    }

    @Override // org.telegram.ui.Components.no0
    public void W(float f7, boolean z10) {
        lg.h hVar = (lg.h) this.b;
        float f10 = hVar.b;
        float z11 = e2.z(hVar.c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            q6 q6Var = hVar.e;
            q6Var.getClass();
            q6Var.b(null, z11);
        }
        hVar.invalidate();
    }

    @Override // y2.o
    public void a() {
        i iVar = (i) this.b;
        iVar.A.a();
        b5 b5Var = iVar.C;
        if (b5Var != null) {
            throw b5Var;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                n6.o oVar = (n6.o) this.b;
                Parcel I0 = aVar.I0();
                k7.a.c(I0, oVar);
                try {
                    aVar.b.transact(1, I0, null, 1);
                    I0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    I0.recycle();
                    throw th2;
                }
            case 17:
                g8.e eVar = (g8.e) this.b;
                z zVar = (z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, eVar);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar2 = (s6.e) ((s6.h) obj).u();
                s6.a aVar2 = (s6.a) this.b;
                Parcel I02 = eVar2.I0();
                k7.a.d(I02, fVar2);
                k7.a.c(I02, aVar2);
                eVar2.J0(I02, 1);
                return;
        }
    }

    @Override // w2.a
    public long b(long j3) {
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

    @Override // w2.a
    public i0 c(long j3) {
        int v = v(j3);
        if (v == 0) {
            e9.g0 g0Var = i0.b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.b).get(v - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        e9.g0 g0Var2 = i0.b;
        return a1.e;
    }

    @Override // w2.a
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    @Override // zg.g
    public void d(Canvas canvas) {
        switch (this.a) {
            case 9:
                yi yiVar = (yi) this.b;
                canvas.drawColor(yiVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yiVar.C2.b(canvas, -3);
                    break;
                }
                break;
            default:
                sq0 sq0Var = (sq0) this.b;
                canvas.drawColor(sq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sq0Var.O0.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(z3.a aVar, long j3) {
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

    @Override // s4.h1
    public int f(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override // w2.a
    public long g(long j3) {
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

    @Override // org.telegram.ui.Components.no0
    public CharSequence getContentDescription() {
        lg.h hVar = (lg.h) this.b;
        float f7 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
    }

    @Override // k1.f
    public ce.b getData() {
        return ((a0) this.b).c;
    }

    @Override // k1.f
    public Object h(rd.p pVar, kd.c cVar) {
        return ((a0) this.b).h(new n1.c(pVar, null, 0), cVar);
    }

    @Override // w2.a
    public void i(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        int v = v(j3);
        if (v == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(v - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            v--;
        }
        arrayList.subList(0, v).clear();
    }

    public boolean j(int i10) {
        n81 n81Var = ((v81) this.b).L;
        if (n81Var == null) {
            return false;
        }
        return n81Var.c(i10);
    }

    @Override // y2.i
    public k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        ((d) this.b).a.x(iOException);
        return y2.n.e;
    }

    @Override // org.telegram.ui.Components.no0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // s4.h1
    public int m() {
        return ((o0) this.b).D();
    }

    public void n() {
        og.f1 f1Var = ((og.h1) this.b).d;
        if (f1Var != null) {
            e1 e1Var = f1Var.s;
            if (e1Var != null) {
                f1Var.cancelRunnable(e1Var);
                f1Var.s = null;
            }
            e1 e1Var2 = new e1(f1Var, 1);
            f1Var.s = e1Var2;
            f1Var.postRunnable(e1Var2, 1L);
        }
    }

    public s0.d o(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        f60 f60Var;
        VideoEditedInfo videoEditedInfo;
        e60 e60Var = (e60) this.b;
        t71 t71Var = e60Var.H0.O;
        if (t71Var != null && t71Var.y() && i10 == 4 && (videoEditedInfo = (f60Var = e60Var.H0).N) != null) {
            t71 t71Var2 = f60Var.O;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            t71Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // y2.i
    public void p(y2.k kVar, long j3, long j10) {
        boolean z10;
        d dVar = (d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // s4.h1
    public int q() {
        o0 o0Var = (o0) this.b;
        return o0Var.m - o0Var.E();
    }

    @Override // s4.h1
    public View r(int i10) {
        return ((o0) this.b).q(i10);
    }

    @Override // s4.h1
    public int s(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override // org.telegram.ui.Components.hq0
    public void s0() {
        pc k10 = ((x3) this.b).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public s0.d t(int i10) {
        return null;
    }

    @Override // zg.g
    public void u(g.z zVar) {
        switch (this.a) {
            case 9:
                zVar.a(((yi) this.b).getThemedColor(j6.d6));
                zVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                zVar.a(((sq0) this.b).getThemedColor(j6.d6));
                zVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    public int v(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public StringBuilder w() {
        df.a aVar = (df.a) this.b;
        if (!(aVar instanceof ye.m)) {
            return null;
        }
        StringBuilder sb2 = ((ye.m) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public void x(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public void z(float f7) {
        v81 v81Var = (v81) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = v81Var.e;
            View[] viewArr2 = v81Var.e;
            if (viewArr[1] != null) {
                v81Var.F();
                v81Var.h.put(v81Var.f[1], viewArr2[1]);
                v81Var.removeView(viewArr2[1]);
                v81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            v81Var.z(v81Var.b);
            return;
        }
        View[] viewArr3 = v81Var.e;
        View[] viewArr4 = v81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (v81Var.y) {
            v81Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            v81Var.E(viewArr4[0], (-r2.getMeasuredWidth()) * f7);
        } else {
            v81Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            v81Var.E(viewArr4[0], r2.getMeasuredWidth() * f7);
        }
        v81Var.w(false);
    }

    public /* synthetic */ h(s6.g gVar, s6.a aVar) {
        this.a = 22;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
    }

    public h(int i10) {
        this.a = i10;
        switch (i10) {
            case 19:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new jh0(this);
                    break;
                }
            case 24:
                break;
            case 25:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public h(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 16;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public h(EditText editText) {
        this.a = 15;
        this.b = new n7.a1(editText);
    }

    public h(Context context, y yVar) {
        this.a = 4;
        x xVar = ((r) yVar.b).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, xVar);
        } else {
            this.b = new n4.j(context, xVar);
        }
    }

    @Override // org.telegram.ui.Components.hq0
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.no0
    public void y() {
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

    @Override // y2.i
    public void C(y2.k kVar, long j3, long j10, boolean z10) {
    }

    @Override // y2.i
    public /* synthetic */ void l(y2.k kVar, long j3, long j10, int i10) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
