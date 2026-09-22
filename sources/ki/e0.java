package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.z81;
import qg.n2;
import qg.w1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class e0 implements l.x, l.j, k1.f, c5, ah.k, s71, x81, com.google.android.gms.common.api.internal.s, w1, r4.c, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // k1.f
    public Object a(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        n6.o oVar = (n6.o) this.b;
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

    @Override // ah.k
    public void b(Canvas canvas) {
        switch (this.a) {
            case 10:
                vi viVar = (vi) this.b;
                canvas.drawColor(viVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    break;
                }
                break;
            default:
                wq0 wq0Var = (wq0) this.b;
                canvas.drawColor(wq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    wq0Var.O0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void c(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((r7.i) this.b).b;
        synchronized (nVar2) {
            nVar2.b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.c).c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    public boolean d(int i10) {
        q81 q81Var = ((z81) this.b).L;
        if (q81Var == null) {
            return false;
        }
        return q81Var.c(i10);
    }

    public void e(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void f() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // l.x
    public void g(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).z.k().c(false);
        }
        l.x xVar = ((m.h) this.b).e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override // fd.a
    public Object get() {
        return new s5.j((Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.j.d).intValue());
    }

    @Override // k1.f
    public ce.b getData() {
        return ((k1.a0) this.b).c;
    }

    public StringBuilder h() {
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

    public void i(float f7) {
        z81 z81Var = (z81) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = z81Var.e;
            View[] viewArr2 = z81Var.e;
            if (viewArr[1] != null) {
                z81Var.G();
                z81Var.h.put(z81Var.f[1], viewArr2[1]);
                z81Var.removeView(viewArr2[1]);
                z81Var.F(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            z81Var.A(z81Var.b);
            return;
        }
        View[] viewArr3 = z81Var.e;
        View[] viewArr4 = z81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (z81Var.y) {
            z81Var.F(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            z81Var.F(viewArr4[0], (-r2.getMeasuredWidth()) * f7);
        } else {
            z81Var.F(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            z81Var.F(viewArr4[0], r2.getMeasuredWidth() * f7);
        }
        z81Var.x(false);
    }

    public void j() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + l());
    }

    public void k(long j3) {
        long l4 = l();
        if (l4 != j3) {
            if (l4 != -1) {
                if (l4 != -2) {
                    return;
                } else {
                    l4 = -2;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(l4);
            throw new IOException(t10.toString());
        }
    }

    public long l() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // qg.w1
    public void m(float f7) {
        ((n2) this.b).setOutlineWidth(f7);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.M0(e0Var, false, null);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public void onError(v71 v71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s71
    public void onStateChanged(boolean z10, int i10) {
        c60 c60Var;
        VideoEditedInfo videoEditedInfo;
        u50 u50Var = (u50) this.b;
        v71 v71Var = u50Var.H0.T;
        if (v71Var != null && v71Var.y() && i10 == 4 && (videoEditedInfo = (c60Var = u50Var.H0).S) != null) {
            v71 v71Var2 = c60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            v71Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // l.x
    public boolean q(l.l lVar) {
        m.h hVar = (m.h) this.b;
        if (lVar == hVar.c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        l.x xVar = hVar.e;
        if (xVar != null) {
            return xVar.q(lVar);
        }
        return false;
    }

    @Override // l.j
    public void r(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.h hVar = toolbar.a.J;
        if (hVar == null || !hVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.c0) it.next()).a.t();
            }
        }
    }

    @Override // r4.c
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.j
    public boolean w(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
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
        ((ProfileInstallReceiver) this.b).setResultCode(i10);
    }

    @Override // ah.k
    public void y(ah.a aVar) {
        switch (this.a) {
            case 10:
                aVar.a(((vi) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((wq0) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    public e0(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = new SparseArray();
                break;
            case 12:
                this.b = new HashMap();
                break;
            case 26:
                this.b = new f3[zf.b.values().length];
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // org.telegram.ui.Components.s71
    public void onRenderedFirstFrame() {
    }

    @Override // qg.w1
    public float get() {
        return ((n2) this.b).F;
    }

    public e0(Context context, n4.y yVar) {
        this.a = 5;
        n4.x xVar = ((n4.r) yVar.a).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, xVar);
        } else {
            this.b = new n4.j(context, xVar);
        }
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.s71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
