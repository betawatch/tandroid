package ka;

import ah.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.c0;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.d0;
import l.i;
import l.w;
import m.h;
import n7.a1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w50;
import qg.p2;
import qg.y1;
import ye.m;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class c implements w, i, b5, k, e71, h81, s, y1, r4.c, o, n5.b, OnCompleteListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // l.i
    public boolean A(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    public n4.a a() {
        return new n4.a(((AudioAttributes.Builder) this.b).build());
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
            case 7:
                vi viVar = (vi) this.b;
                canvas.drawColor(viVar.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    break;
                }
                break;
            default:
                iq0 iq0Var = (iq0) this.b;
                canvas.drawColor(iq0Var.getThemedColor(j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    iq0Var.O0.b(canvas, -3);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void c(Object obj) {
        n nVar;
        androidx.activity.n nVar2 = ((r7.i) this.b).b;
        synchronized (nVar2) {
            nVar2.b = false;
            nVar = ((p) nVar2.c).c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    public boolean d(int i10) {
        b81 b81Var = ((j81) this.b).L;
        if (b81Var == null) {
            return false;
        }
        return b81Var.c(i10);
    }

    public String e(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            e eVar = (e) this.b;
            f fVar = new f(stringWriter, eVar.a, eVar.b, eVar.c, eVar.d);
            fVar.h(obj);
            fVar.j();
            fVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public StringBuilder f() {
        df.a aVar = (df.a) this.b;
        if (!(aVar instanceof m)) {
            return null;
        }
        StringBuilder sb2 = ((m) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // l.w
    public void g(l.k kVar, boolean z10) {
        if (kVar instanceof d0) {
            ((d0) kVar).z.k().c(false);
        }
        w wVar = ((h) this.b).e;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    @Override // fd.a
    public Object get() {
        return new s5.i((Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    public void h(float f7) {
        j81 j81Var = (j81) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = j81Var.e;
            View[] viewArr2 = j81Var.e;
            if (viewArr[1] != null) {
                j81Var.G();
                j81Var.h.put(j81Var.f[1], viewArr2[1]);
                j81Var.removeView(viewArr2[1]);
                j81Var.F(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            j81Var.A(j81Var.b);
            return;
        }
        View[] viewArr3 = j81Var.e;
        View[] viewArr4 = j81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (j81Var.y) {
            j81Var.F(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            j81Var.F(viewArr4[0], (-r2.getMeasuredWidth()) * f7);
        } else {
            j81Var.F(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            j81Var.F(viewArr4[0], r2.getMeasuredWidth() * f7);
        }
        j81Var.x(false);
    }

    public c i(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    public /* bridge */ void j(int i10) {
        i(i10);
    }

    @Override // qg.y1
    public void l(float f7) {
        ((p2) this.b).setOutlineWidth(f7);
    }

    @Override // ah.k
    public void m(ah.a aVar) {
        switch (this.a) {
            case 7:
                aVar.a(((vi) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                aVar.a(((iq0) this.b).getThemedColor(j6.d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
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

    @Override // org.telegram.ui.Components.e71
    public void onError(h71 h71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e71
    public void onStateChanged(boolean z10, int i10) {
        w50 w50Var;
        VideoEditedInfo videoEditedInfo;
        v50 v50Var = (v50) this.b;
        h71 h71Var = v50Var.H0.O;
        if (h71Var != null && h71Var.y() && i10 == 4 && (videoEditedInfo = (w50Var = v50Var.H0).N) != null) {
            h71 h71Var2 = w50Var.O;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            h71Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // r4.c
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.i
    public void t(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        h hVar = toolbar.a.J;
        if (hVar == null || !hVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a.t();
            }
        }
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        h hVar = (h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar != null) {
            return wVar.v(kVar);
        }
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

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 23:
                this.b = new a1[zf.b.values().length];
                break;
            default:
                this.b = new AudioAttributes.Builder();
                break;
        }
    }

    @Override // org.telegram.ui.Components.e71
    public void onRenderedFirstFrame() {
    }

    @Override // qg.y1
    public float get() {
        return ((p2) this.b).F;
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.e71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
