package m5;

import ag.j2;
import ag.o1;
import ag.q1;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.e0;
import androidx.biometric.g0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import bg.f3;
import bg.u3;
import bg.v2;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import eg.z1;
import f2.s1;
import f2.w0;
import g.q;
import g5.p;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import l.d0;
import l.w;
import l3.b0;
import l3.n;
import l3.r;
import nh.a6;
import nh.f6;
import nh.m0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.b61;
import wf.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements a0, v2, o, s, s1, l0, w, p, b61, r, l.i, n3.e, SuccessContinuation, m, u61, WebMessageListenerBoundaryInterface {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    public static synchronized i J(Context context) {
        i M;
        synchronized (i.class) {
            M = M(context.getApplicationContext());
        }
        return M;
    }

    public static synchronized i M(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            c = iVar2;
            return iVar2;
        }
    }

    @Override // n3.e
    public boolean B(String str) {
        return false;
    }

    @Override // n3.e
    public n3.d D() {
        return (n3.d) this.b;
    }

    @Override // n3.e
    public m3.b E() {
        return null;
    }

    public StringBuilder F() {
        ne.a aVar = (ne.a) this.b;
        if (!(aVar instanceof ie.o)) {
            return null;
        }
        StringBuilder sb2 = ((ie.o) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public Boolean G() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public boolean H() {
        x0 x0Var = ((j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public void I() {
        ((u) this.b).d.R();
    }

    @Override // bg.v2
    public void K(float f9) {
        ((u3) this.b).setOutlineWidth(f9);
    }

    public synchronized void L() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void S(Object obj) {
        Integer num = (Integer) obj;
        g0 g0Var = (g0) this.b;
        Handler handler = g0Var.w0;
        q1 q1Var = g0Var.x0;
        handler.removeCallbacks(q1Var);
        int intValue = num.intValue();
        if (g0Var.B0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = g0Var.y0.y;
            Context n10 = g0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                g0Var.B0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    e0.a(drawable);
                }
                g0Var.y0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = g0Var.C0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? g0Var.z0 : g0Var.A0);
        }
        handler.postDelayed(q1Var, 2000L);
    }

    @Override // l3.r
    public void a(long j10) {
        n nVar;
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new z1(nVar, j10, 3));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                e6.f fVar = new e6.f(0, (TaskCompletionSource) obj2);
                e6.e eVar = (e6.e) ((e6.h) obj).u();
                e6.a aVar = (e6.a) this.b;
                Parcel G0 = eVar.G0();
                w6.a.d(G0, fVar);
                w6.a.c(G0, aVar);
                eVar.H0(G0, 1);
                return;
            default:
                h8.j jVar = (h8.j) this.b;
                q7.b bVar = (q7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                q7.a aVar2 = new q7.a(0, (TaskCompletionSource) obj2);
                try {
                    q7.i iVar = (q7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = q7.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.v0(Status.h, null);
                    return;
                }
        }
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
        switch (this.a) {
            case 14:
                ((q) this.b).g(kVar);
                break;
            default:
                if (kVar instanceof d0) {
                    ((d0) kVar).z.k().c(false);
                }
                w wVar = ((m.i) this.b).e;
                if (wVar != null) {
                    wVar.b(kVar, z10);
                    break;
                }
                break;
        }
    }

    @Override // g5.p
    public void c(eg.n nVar) {
        nVar.c(((WindowManager) this.b).getDefaultDisplay());
    }

    @Override // f2.s1
    public int d(View view) {
        return w0.x(view) - ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).leftMargin;
    }

    @Override // n3.e
    public UUID e() {
        return j3.h.a;
    }

    @Override // bg.v2
    public float get() {
        return ((u3) this.b).B;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // l.w
    public boolean h(l.k kVar) {
        switch (this.a) {
            case 14:
                Window.Callback callback = ((q) this.b).f.getCallback();
                if (callback == null) {
                    return true;
                }
                callback.onMenuOpened(108, kVar);
                return true;
            default:
                m.i iVar = (m.i) this.b;
                if (kVar == iVar.c) {
                    return false;
                }
                ((d0) kVar).A.getClass();
                iVar.getClass();
                w wVar = iVar.e;
                if (wVar != null) {
                    return wVar.h(kVar);
                }
                return false;
        }
    }

    @Override // l.i
    public void i(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.i iVar = toolbar.a.F;
        if (iVar == null || !iVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.S.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.b0) it.next()).a.t();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public k0 j(n0 n0Var, IOException iOException, int i10) {
        o4.h hVar = ((o4.d) this.b).a;
        f5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.u(true);
        return q0.e;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void k(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((d7.i) this.b).b;
        synchronized (nVar2) {
            nVar2.a = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.b).c;
        }
        if (nVar != null) {
            ((d7.c) nVar2.c).c(nVar, 2441);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void m(n0 n0Var, long j10, long j11) {
        boolean z10;
        o4.d dVar = (o4.d) this.b;
        synchronized (f5.a.i) {
            z10 = f5.a.j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        o4.h hVar = dVar.a;
        f5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.u(true);
    }

    @Override // f2.s1
    public int n() {
        return ((w0) this.b).D();
    }

    @Override // l3.r
    public void o(int i10, long j10, long j11) {
        n nVar;
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        n2.b bVar;
        n2.b bVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) ce.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        o1[] o1VarArr = new o1[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            o1 o1Var = new o1(29, false);
            o1Var.b = (WebMessagePortBoundaryInterface) ce.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            o1VarArr[i10] = o1Var;
        }
        if (o2.k.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) ce.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                bVar = new n2.b(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    bVar2 = null;
                    if (bVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) ce.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((WebProxyTransport) ((org.telegram.messenger.d) this.b).b).onWebMessage(webView, bVar2, uri, z10, (o2.f) jsReplyProxyBoundaryInterface.getOrCreatePeer(new h9.o(jsReplyProxyBoundaryInterface, 2)));
                        return;
                    }
                    return;
                }
                bVar = new n2.b(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            bVar = new n2.b(webMessageBoundaryInterface.getData());
        }
        bVar2 = bVar;
        if (bVar2 == null) {
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // l3.r
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar;
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new hh.f(5, nVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.u61
    public void onStateChanged(boolean z10, int i10) {
        f6 f6Var = (f6) this.b;
        a6 a6Var = f6Var.I;
        x61 x61Var = f6Var.x;
        if (x61Var == null) {
            return;
        }
        if (x61Var.z()) {
            AndroidUtilities.runOnUIThread(a6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.u61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        f6 f6Var = (f6) this.b;
        f6Var.getClass();
        f6Var.getClass();
        f3 f3Var = f6Var.w;
        if (f3Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(f3Var.u0 - f10) >= 1.0E-4f) {
                f3Var.u0 = f10;
                f3Var.requestLayout();
            }
        }
    }

    @Override // l.i
    public boolean q(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // n3.e
    public boolean r() {
        return false;
    }

    @Override // f2.s1
    public int s() {
        w0 w0Var = (w0) this.b;
        return w0Var.m - w0Var.E();
    }

    @Override // n3.e
    public int t() {
        return 1;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        e3.f fVar = (e3.f) this.b;
        g5.c cVar = (g5.c) fVar.f;
        n9.c cVar2 = (n9.c) fVar.b;
        String str = cVar.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = g5.c.b(cVar2);
            androidx.biometric.e eVar = new androidx.biometric.e(str, b10);
            eVar.x("User-Agent", "Crashlytics Android SDK/18.6.0");
            eVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            g5.c.a(eVar, cVar2);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = cVar.c(eVar.k());
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            jSONObject = null;
        }
        if (jSONObject != null) {
            n9.a j10 = ((o1) fVar.c).j(jSONObject);
            za.c cVar3 = (za.c) fVar.e;
            long j11 = j10.c;
            cVar3.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j11);
                fileWriter = new FileWriter((File) cVar3.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        g9.h.c(fileWriter, "Failed to close settings writer.");
                        e3.f.f("Loaded settings: ", jSONObject);
                        String str4 = cVar2.f;
                        SharedPreferences.Editor edit = ((Context) fVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) fVar.h).set(j10);
                        ((TaskCompletionSource) ((AtomicReference) fVar.i).get()).trySetResult(j10);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    g9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                g9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            g9.h.c(fileWriter, "Failed to close settings writer.");
            e3.f.f("Loaded settings: ", jSONObject);
            String str42 = cVar2.f;
            SharedPreferences.Editor edit2 = ((Context) fVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) fVar.h).set(j10);
            ((TaskCompletionSource) ((AtomicReference) fVar.i).get()).trySetResult(j10);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                be.b bVar = be.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ba.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 6:
            default:
                return super.toString();
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
        }
    }

    @Override // wf.m
    public void u() {
        ((m0) this.b).e.invalidate();
    }

    @Override // l3.r
    public void v(Exception exc) {
        n nVar;
        f5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new l3.k(nVar, exc, 1));
        }
    }

    @Override // l3.r
    public void w() {
        ((FfmpegAudioRenderer) this.b).onPositionDiscontinuity();
    }

    @Override // f2.s1
    public View y(int i10) {
        return ((w0) this.b).q(i10);
    }

    @Override // f2.s1
    public int z(View view) {
        return w0.y(view) + ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).rightMargin;
    }

    public /* synthetic */ i(e6.g gVar, e6.a aVar) {
        this.a = 11;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.u61
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public i(Context context, int i10) {
        String d;
        this.a = i10;
        switch (i10) {
            case 22:
                kotlin.jvm.internal.j.e(context, "context");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                this.b = bundle == null ? Bundle.EMPTY : bundle;
                break;
            default:
                b a2 = b.a(context);
                this.b = a2;
                a2.b();
                String d10 = a2.d("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(d10) && (d = a2.d(b.f("googleSignInOptions", d10))) != null) {
                    try {
                        GoogleSignInOptions.b(d);
                        break;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // l3.r
    public /* synthetic */ void A() {
    }

    @Override // wf.m
    public void R() {
    }

    @Override // l3.r
    public /* synthetic */ void f() {
    }

    @Override // g5.p
    public void x() {
    }

    @Override // wf.m
    public void C(boolean z10) {
    }

    @Override // wf.m
    public void P(boolean z10) {
    }

    @Override // n3.e
    public void l(j2 j2Var) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // n3.e
    public void p(j2 j2Var) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onError(x61 x61Var, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void g(n0 n0Var, long j10, long j11, boolean z10) {
    }
}
