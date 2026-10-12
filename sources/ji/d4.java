package ji;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y71;
import org.telegram.ui.y9;
import v7.i8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d4 implements g1, k2.x, m.k, org.telegram.ui.Components.f5, bh.h, e81, y71, r0.o, y9, r4.c, com.google.android.gms.common.api.internal.o, rg.x1, s4.d0, n5.b, v0.i, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d4(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // k2.x
    public void A() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // k2.x
    public void B(k2.t0 t0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.t(bVar, t0Var, 1));
        }
    }

    @Override // rg.x1
    public void B0(float f7) {
        ((rg.p2) this.b).setOutlineWidth(f7);
    }

    @Override // ji.g1
    public /* synthetic */ boolean C(h1 h1Var) {
        return false;
    }

    @Override // s4.d0
    public void D(int i10, int i11) {
        ((s4.g0) this.b).p(i10, i11);
    }

    @Override // k2.x
    public void E(k2.t0 t0Var) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.t(bVar, t0Var, 0));
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean F0(boolean z10) {
        return false;
    }

    @Override // r4.c
    public void G(int i10, Object obj) {
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

    @Override // org.telegram.ui.y9
    public String I0() {
        return ((org.telegram.ui.web.b1) this.b).i0;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
        e0Var.m0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // org.telegram.ui.y9
    public void K(String str) {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
        try {
            b1Var.P = System.currentTimeMillis();
            b1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // s4.d0
    public void P0(int i10, int i11) {
        ((s4.g0) this.b).t(i10, i11);
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cn0 cn0Var = (cn0) this.b;
        cn0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        cn0Var.s.requestLayout();
        return r0.l1.b;
    }

    @Override // ji.g1
    public void U(h1 h1Var, int i10, int i11) {
        d3 d3Var;
        o9 textSelectionHelper;
        u5 u5Var = (u5) this.b;
        if (u5Var.G || i10 == i11 || (d3Var = u5Var.E) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == u5Var) {
            return;
        }
        u5Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // ji.g1
    public void a(h1 h1Var) {
        d3 d3Var = ((u5) this.b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.c0(h1Var, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        v8.j jVar = (v8.j) this.b;
        e8.b bVar = (e8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        e8.a aVar = new e8.a(0, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.O(Status.h, null);
        }
    }

    @Override // k2.x
    public void b(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.g0 = true;
        qf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bi.g(bVar, j10, 13));
        }
    }

    public void c(StringBuilder sb2) {
        sb2.append(((Boolean) i2.d.x(1, (ArrayList) this.b)).booleanValue() ? "</ol>" : "</ul>");
    }

    @Override // k2.x
    public void d() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ boolean e1(String str, org.telegram.ui.o9 o9Var) {
        return false;
    }

    public void f(StringBuilder sb2) {
        while (!((ArrayList) this.b).isEmpty()) {
            c(sb2);
        }
    }

    public byte g() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // ji.g1
    public void g0(CharSequence charSequence) {
        d3 d3Var = ((u5) this.b).E;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    @Override // hd.a
    public Object get() {
        String packageName = ((Context) ((hd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ji.g1
    public boolean h() {
        u5 u5Var = (u5) this.b;
        d3 d3Var = u5Var.E;
        if (d3Var == null || u5Var.a == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    public int i() {
        return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
    }

    @Override // org.telegram.ui.Components.y71
    public void invalidate() {
        ((fh0) this.b).h.invalidate();
    }

    public int j() {
        return ((g() & Byte.MAX_VALUE) << 21) | ((g() & Byte.MAX_VALUE) << 14) | ((g() & Byte.MAX_VALUE) << 7) | (g() & Byte.MAX_VALUE);
    }

    @Override // s4.d0
    public void j0(int i10, int i11) {
        ((s4.g0) this.b).s(i10, i11);
    }

    public void k(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j10 - j11);
            if (skip <= 0) {
                throw new EOFException();
            }
            j11 += skip;
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean l(h1 h1Var) {
        return false;
    }

    @Override // k2.x
    public void m(int i10, long j10, long j11) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((vi) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // s4.d0
    public void m1(int i10, int i11) {
        ((s4.g0) this.b).r(i10, i11, null);
    }

    @Override // k2.x
    public void onAudioSessionIdChanged(int i10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 13));
        }
    }

    @Override // org.telegram.ui.y9
    public void onDismiss() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
        b1Var.y("scan_qr_popup_closed", null);
        b1Var.h0 = false;
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        be.m mVar = (be.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(i8.a(e));
        }
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        be.m mVar = (be.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // k2.x
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new ah.t(9, bVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.e81
    public void onStateChanged(boolean z10, int i10) {
        p60 p60Var;
        VideoEditedInfo videoEditedInfo;
        i60 i60Var = (i60) this.b;
        h81 h81Var = i60Var.H0.T;
        if (h81Var != null && h81Var.y() && i10 == 4 && (videoEditedInfo = (p60Var = i60Var.H0).S) != null) {
            h81 h81Var2 = p60Var.T;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            h81Var2.K(j10);
        }
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ji.g1
    public void p(int i10, int i11) {
        h2 h2Var;
        u5 u5Var = (u5) this.b;
        d3 d3Var = u5Var.E;
        if (d3Var == null || u5Var.a == null || (h2Var = d3Var.a.H3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // k2.x
    public void q() {
        x2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            nVar = ffmpegAudioRenderer.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // ji.g1
    public void s0(Editable editable) {
        u5 u5Var = (u5) this.b;
        a aVar = u5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = u5Var.r.E;
        }
        u5Var.u();
        d3 d3Var = u5Var.E;
        if (d3Var == null || u5Var.a == null) {
            return;
        }
        d3Var.a();
    }

    @Override // k2.x
    public void t(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.q(bVar, exc, 1));
        }
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // bh.h
    public void v(Canvas canvas) {
        vi viVar = (vi) this.b;
        canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            viVar.F2.b(canvas, -3);
        }
    }

    @Override // r4.c
    public void y() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void z(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((r7.i) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.b).c;
        }
        if (nVar != null) {
            ((r7.c) oVar.c).c(nVar, 2441);
        }
    }

    public /* synthetic */ d4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.e81
    public void onRenderedFirstFrame() {
    }

    public d4(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.b = e9.n0.t();
                break;
            case 9:
                this.b = new SparseArray();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    @Override // rg.x1
    public float get() {
        return ((rg.p2) this.b).F;
    }

    @Override // org.telegram.ui.Components.e81
    public void onError(h81 h81Var, Exception exc) {
        FileLog.e(exc);
    }

    public d4(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 19;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public d4(EditText editText) {
        this.a = 18;
        this.b = new m4.c(editText);
    }

    @Override // k2.x
    public /* synthetic */ void I() {
    }

    @Override // ji.g1
    public /* synthetic */ void W() {
    }

    @Override // k2.x
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void W0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ji.g1
    public /* synthetic */ void p0(h1 h1Var) {
    }

    @Override // org.telegram.ui.Components.e81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
