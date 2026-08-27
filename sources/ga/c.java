package ga;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import c7.b0;
import c7.g;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.f;
import d6.h;
import g.r;
import ge.o;
import hh.y9;
import ig.q0;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import jh.e4;
import jh.z8;
import l.x;
import lh.m0;
import lh.m6;
import lh.q6;
import m.l;
import n5.k;
import n6.v;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.ku0;
import r7.e;
import uf.m;
import y6.j;
import y6.l1;
import y6.m1;
import zf.c2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, s, x, vj0, ku0, m, j61, l, OnCompleteListener {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // androidx.lifecycle.a0
    public void J(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.w0;
        a8.b bVar = f0Var.x0;
        handler.removeCallbacks(bVar);
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(bVar, 2000L);
    }

    @Override // org.telegram.ui.ku0
    public /* synthetic */ TextureView K() {
        return null;
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        switch (this.a) {
            case 3:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = f0Var.a;
                    if (j0Var.c.q(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.b;
                int i11 = aVar.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.K;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                e eVar = (e) this.b;
                b0 b0Var = (b0) ((c7.l) obj).u();
                g gVar = new g(1, (TaskCompletionSource) obj2);
                Parcel M0 = b0Var.M0();
                c7.e.c(M0, eVar);
                c7.e.d(M0, gVar);
                M0.writeString(null);
                b0Var.Q0(M0, 63);
                return;
            case 10:
                f fVar = new f(0, (TaskCompletionSource) obj2);
                d6.e eVar2 = (d6.e) ((h) obj).u();
                d6.a aVar = (d6.a) this.b;
                Parcel G0 = eVar2.G0();
                v6.a.d(G0, fVar);
                v6.a.c(G0, aVar);
                eVar2.H0(G0, 1);
                return;
            default:
                m6.b bVar = new m6.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.b);
                int i10 = j.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override // l.x
    public void b(l.l lVar, boolean z10) {
        ((r) this.b).g(lVar);
    }

    public synchronized void c() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    public StringBuilder d() {
        le.a aVar = (le.a) this.b;
        if (!(aVar instanceof o)) {
            return null;
        }
        StringBuilder sb2 = ((o) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public Set e() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    public boolean f() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public void g(c3.g gVar, Thread thread, Throwable th) {
        f9.o oVar = (f9.o) this.b;
        synchronized (oVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    f9.b0.a(oVar.e.R(new f9.l(oVar, System.currentTimeMillis(), th, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e9) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e9);
            }
        }
    }

    public m9.a h(JSONObject jSONObject) {
        m9.b vVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            vVar = new ab.a(15);
        } else {
            vVar = new e7.v(15);
        }
        return vVar.P1((ab.a) this.b, jSONObject);
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // uf.m
    public void k() {
        ((m0) this.b).e.invalidate();
    }

    @Override // l.x
    public boolean l(l.l lVar) {
        Window.Callback callback = ((r) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public void n(View view, q0 q0Var, boolean z10, boolean z11) {
        ig.v vVar = (ig.v) this.b;
        vVar.a.ab(null, vVar.e, vVar.b, view, 0.0f, 0.0f, q0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new y9(this, 4));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        n5.c.h((n5.c) ((k) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        q6 q6Var = (q6) this.b;
        m6 m6Var = q6Var.I;
        m61 m61Var = q6Var.x;
        if (m61Var == null) {
            return;
        }
        if (m61Var.z()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        q6 q6Var = (q6) this.b;
        q6Var.getClass();
        q6Var.getClass();
        c2 c2Var = q6Var.w;
        if (c2Var != null) {
            float f11 = i10 / i11;
            if (Math.abs(c2Var.u0 - f11) >= 1.0E-4f) {
                c2Var.u0 = f11;
                c2Var.requestLayout();
            }
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.ku0
    public void w0(MessageObject messageObject) {
        ((z8) ((e4) this.b).M1).f(true);
    }

    @Override // org.telegram.ui.ku0
    public void y(MessageObject messageObject) {
        ((z8) ((e4) this.b).M1).f(false);
    }

    public /* synthetic */ c(com.google.android.gms.common.api.j jVar, z5.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 16:
                this.b = new g5.b[hf.b.values().length];
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.a = 9;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                c();
            }
        } catch (IOException e9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e9.getMessage());
            }
        }
    }

    @Override // uf.m
    public void H() {
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void s() {
    }

    @Override // uf.m
    public void D(boolean z10) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // uf.m
    public void q(boolean z10) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(m61 m61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
