package l;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.s0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cc1;
import qg.n2;
import qg.w1;
import w7.z8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class d implements e2, y2.h, le.d, j, l2.h, ro0, le.f, ah.k, v81, com.google.android.gms.common.api.internal.s, w1, r4.c, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener {
    public Object a;

    public /* synthetic */ d(Object obj) {
        this.a = obj;
    }

    @Override // le.f
    public void A() {
        ((l9) this.a).a.invalidate();
    }

    @Override // le.d
    public void C(float f7, int i10) {
        ((le.j) this.a).i(f7);
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.a).i(f7);
    }

    @Override // l2.h
    public long E(long j3, long j10) {
        return 1L;
    }

    @Override // y2.h
    public void F(y2.j jVar, long j3, long j10, boolean z10) {
        ((l2.g) this.a).w((y2.p) jVar, j10);
    }

    public void G(HashMap hashMap) {
        if (((SparseArray) this.a) == null) {
            this.a = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.a).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    public boolean H(int i10) {
        o81 o81Var = ((x81) this.a).L;
        if (o81Var == null) {
            return false;
        }
        return o81Var.c(i10);
    }

    public void I(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.a).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void J() {
        HashMap hashMap = (HashMap) this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // ah.k
    public void K(ah.a aVar) {
        aVar.a(((uq0) this.a).getThemedColor(j6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public StringBuilder L() {
        df.a aVar = (df.a) this.a;
        if (!(aVar instanceof ye.m)) {
            return null;
        }
        StringBuilder sb2 = ((ye.m) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public void M(float f7) {
        x81 x81Var = (x81) this.a;
        if (f7 == 1.0f) {
            View[] viewArr = x81Var.e;
            View[] viewArr2 = x81Var.e;
            if (viewArr[1] != null) {
                x81Var.G();
                x81Var.h.put(x81Var.f[1], viewArr2[1]);
                x81Var.removeView(viewArr2[1]);
                x81Var.F(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            x81Var.A(x81Var.b);
            return;
        }
        View[] viewArr3 = x81Var.e;
        View[] viewArr4 = x81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (x81Var.y) {
            x81Var.F(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            x81Var.F(viewArr4[0], (-r2.getMeasuredWidth()) * f7);
        } else {
            x81Var.F(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            x81Var.F(viewArr4[0], r2.getMeasuredWidth() * f7);
        }
        x81Var.x(false);
    }

    @Override // org.telegram.ui.Components.ro0
    public void X(float f7, boolean z10) {
        cc1 cc1Var = (cc1) ((k0) this.a);
        int i10 = (int) (j6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        j6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = cc1Var.e.e;
            fl0 fl0Var = (fl0) themeActivity.b.L(themeActivity.f0);
            if (fl0Var != null) {
                ((f9) fl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.q * 100.0f))));
            }
            j6.E(true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        n6.o oVar = (n6.o) this.a;
        Parcel I0 = aVar.I0();
        k7.a.c(I0, oVar);
        try {
            aVar.b.transact(1, I0, null, 1);
            I0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            I0.recycle();
            throw th2;
        }
    }

    @Override // l2.h
    public long b(long j3) {
        return 0L;
    }

    @Override // ah.k
    public void d(Canvas canvas) {
        uq0 uq0Var = (uq0) this.a;
        canvas.drawColor(uq0Var.getThemedColor(j6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            uq0Var.O0.b(canvas, -3);
        }
    }

    @Override // l2.h
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // l2.h
    public long g(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // fd.a
    public Object get() {
        return new s5.j((Context) ((fd.a) this.a).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.j.d).intValue());
    }

    @Override // org.telegram.ui.Components.ro0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // le.f
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // le.f
    public /* synthetic */ boolean i(float f7) {
        return false;
    }

    @Override // l2.h
    public m2.j k(long j3) {
        return (m2.j) this.a;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void l(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((r7.i) this.a).b;
        synchronized (nVar2) {
            nVar2.b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.c).c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public /* synthetic */ int l0() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4.d m(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.a;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        int i11 = pVar.c;
        gVar.m.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.l)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k4.d dVar = j11 != -9223372036854775807L ? y2.m.f : new k4.d(0, j11, false);
            gVar.q.r(tVar, i11, iOException, !dVar.a());
            return dVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        gVar.q.r(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // y2.h
    public void n(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.a;
        if (i10 == 0) {
            long j11 = pVar.a;
            tVar = new u2.t(pVar.b);
        } else {
            long j12 = pVar.a;
            Uri uri = pVar.d.c;
            tVar = new u2.t(j10);
        }
        gVar.q.s(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.h
    public void o(y2.j jVar, long j3, long j10) {
        int i10;
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.a;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        gVar.m.getClass();
        gVar.q.p(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) pVar.f;
        m2.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                    }
                } else {
                    i10 = i11;
                }
                gVar.M = 0;
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.m.L3(pVar.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new b5();
                return;
            }
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j3 - j10;
        gVar.K = j3;
        gVar.O += i10;
        synchronized (gVar.t) {
            try {
                if (pVar.b.a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.k;
                    if (uri2 == null) {
                        uri2 = z8.a(pVar.d.c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (!cVar3.d || gVar.L != j11) {
            gVar.y(true);
            return;
        }
        c5.a aVar = cVar3.i;
        if (aVar == null) {
            gVar.v();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = e2.d0.T(aVar.c) - gVar.K;
                gVar.y(true);
                return;
            } catch (s0 e) {
                gVar.x(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            gVar.z(aVar, new l2.f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            gVar.z(aVar, new ob.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.v();
        } else {
            gVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.a;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.M0(e0Var, false, null);
        }
    }

    @Override // m.e2
    public void p(l lVar, MenuItem menuItem) {
        ((f) this.a).f.removeCallbacksAndMessages(lVar);
    }

    @Override // r4.c
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.j
    public void r(l lVar) {
        k2.u uVar = ((ActionMenuView) this.a).K;
        if (uVar != null) {
            uVar.r(lVar);
        }
    }

    @Override // l2.h
    public long s(long j3, long j10) {
        return 0L;
    }

    @Override // l.j
    public boolean t(l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.a).P;
        if (kVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ka.c) kVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.c0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // m.e2
    public void u(l lVar, n nVar) {
        f fVar = (f) this.a;
        Handler handler = fVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, i11 < arrayList.size() ? (e) arrayList.get(i11) : null, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l2.h
    public boolean v() {
        return true;
    }

    @Override // l2.h
    public long w() {
        return 0L;
    }

    @Override // r4.c
    public void x(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i10);
    }

    @Override // qg.w1
    public void y(float f7) {
        ((n2) this.a).setOutlineWidth(f7);
    }

    @Override // l2.h
    public long z(long j3) {
        return 1L;
    }

    public d(int i10) {
        switch (i10) {
            case 27:
                this.a = new f3[zf.b.values().length];
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    @Override // qg.w1
    public float get() {
        return ((n2) this.a).F;
    }

    @Override // org.telegram.ui.Components.ro0
    public void B() {
    }

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // le.f
    public /* synthetic */ void j() {
    }

    @Override // le.f
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // l2.h
    public long c(long j3, long j10) {
        return j10;
    }
}
