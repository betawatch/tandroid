package a6;

import a3.m0;
import ai.fc;
import ai.g6;
import ai.gc;
import ai.h6;
import ai.q4;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import b5.p;
import ci.b7;
import ci.z6;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.n;
import fi.s0;
import fi.t0;
import g6.q;
import g6.r;
import gg.b2;
import gg.k1;
import i2.j0;
import ii.e2;
import ii.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.f01;
import org.telegram.ui.lz0;
import org.telegram.ui.yn;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class i implements m0, s, fc, a0, androidx.activity.result.b, p, ya0, b81, k0, v0, OnCompleteListener, f6.a, n, s0, w, b2, he.a, to0, d5 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(r rVar, String[] strArr) {
        this.a = 24;
        this.b = strArr;
    }

    public static boolean N(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String Q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static synchronized i R(Context context) {
        i T;
        synchronized (i.class) {
            T = T(context.getApplicationContext());
        }
        return T;
    }

    public static synchronized i T(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            c = iVar2;
            return iVar2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean A() {
        return true;
    }

    @Override // a3.m0
    public void B() {
        j0 j0Var = ((a3.n) this.b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // org.telegram.ui.Components.ya0
    public void C(int i10, int i11, CharSequence charSequence, boolean z10) {
        ci.g gVar = ((ci.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e D(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public boolean E(String str) {
        String M = M(str);
        return "1".equals(M) || Boolean.parseBoolean(M);
    }

    @Override // gg.b2
    public void F(ArrayList arrayList) {
        k1 k1Var = (k1) this.b;
        String str = k1Var.Z;
        if (str != null) {
            k1Var.U(str, k1Var.c0, k1Var.d0, k1Var.b0, k1Var.a0);
        }
    }

    public Integer I(String str) {
        String M = M(str);
        if (TextUtils.isEmpty(M)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(M));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Q(str) + "(" + M + ") into an int");
            return null;
        }
    }

    public JSONArray J(String str) {
        String M = M(str);
        if (TextUtils.isEmpty(M)) {
            return null;
        }
        try {
            return new JSONArray(M);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Q(str) + ": " + M + ", falling back to default");
            return null;
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        e2 e2Var = (e2) this.b;
        e2Var.s0(i10, i11, z10);
        zi0 zi0Var = e2Var.O0;
        if (zi0Var != null) {
            zi0Var.i();
            e2Var.O0 = null;
        }
    }

    public String L(Resources resources, String str, String str2) {
        String[] strArr;
        String M = M(str2);
        if (!TextUtils.isEmpty(M)) {
            return M;
        }
        String M2 = M(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(M2)) {
            return null;
        }
        int identifier = resources.getIdentifier(M2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Q(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray J = J(str2.concat("_loc_args"));
        if (J == null) {
            strArr = null;
        } else {
            int length = J.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = J.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + Q(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e7);
            return null;
        }
    }

    public String M(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle O() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public da.a P(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.s2((na.d) this.b, jSONObject);
    }

    public synchronized void S() {
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

    @Override // gg.b2
    public void a(int i10) {
        ((k1) this.b).l();
    }

    @Override // ai.fc
    public void a0(long j3, int i10, ai.d5 d5Var) {
        lz0 lz0Var = (lz0) this.b;
        int i11 = ProfileStoriesView.s0;
        lz0Var.f(true, false);
        d5Var.run();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                l8.c cVar = (l8.c) this.b;
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                a8.c cVar2 = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.G0(obtain, 1);
                break;
            case 24:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray(strArr);
                iVar.T0(O0, 7);
                break;
            default:
                i7.b bVar = (i7.b) this.b;
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = bVar.k;
                Parcel K0 = iVar2.K0();
                int i11 = i7.f.a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.to0
    public void b(float f7) {
        z zVar = (z) this.b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override // l.w
    public void c(l.k kVar, boolean z10) {
        g.r rVar;
        g.s sVar = (g.s) this.b;
        l.k k10 = kVar.k();
        int i10 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        g.r[] rVarArr = sVar.U;
        int length = rVarArr != null ? rVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                rVar = rVarArr[i10];
                if (rVar != null && rVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (!z11) {
                sVar.h(rVar, z10);
            } else {
                sVar.f(rVar.a, rVar, k10);
                sVar.h(rVar, true);
            }
        }
    }

    @Override // fi.s0
    public void close() {
        ((fi.s) this.b).finishFragment();
    }

    @Override // b5.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // org.telegram.ui.Components.to0
    public void d(float f7) {
        MessageObject messageObject = ((z) this.b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override // b5.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void h() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.w();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void i(k6.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // ai.fc
    public boolean i1(long j3, int i10, int i11, int i12, gc gcVar) {
        ImageReceiver imageReceiver;
        h6 h6Var;
        h6 h6Var2;
        gcVar.b = null;
        gcVar.c = null;
        lz0 lz0Var = (lz0) this.b;
        f01 f01Var = lz0Var.h;
        ArrayList arrayList = lz0Var.w;
        if (lz0Var.N < 0.2f) {
            gcVar.b = f01Var.getImageReceiver();
            gcVar.c = null;
            gcVar.a = f01Var;
            gcVar.h = 0.0f;
            gcVar.i = AndroidUtilities.displaySize.y;
            gcVar.g = (View) lz0Var.getParent();
            gcVar.d = lz0Var.y;
            gcVar.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                h6Var = null;
                h6Var2 = null;
                break;
            }
            h6 h6Var3 = (h6) arrayList.get(i13);
            if (h6Var3.e >= 1.0f && h6Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                h6 d = ProfileStoriesView.d(i14 >= 0 ? (h6) arrayList.get(i14) : null, i15 >= 0 ? (h6) arrayList.get(i15) : null, h6Var3);
                imageReceiver = h6Var3.b;
                h6Var2 = d;
                h6Var = h6Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        gcVar.c = imageReceiver;
        gcVar.b = null;
        gcVar.a = lz0Var;
        gcVar.h = 0.0f;
        gcVar.i = AndroidUtilities.displaySize.y;
        gcVar.g = (View) lz0Var.getParent();
        if (h6Var == null || h6Var2 == null) {
            gcVar.f = null;
            return true;
        }
        gcVar.f = new g6(this, new RectF(h6Var.m), h6Var, new RectF(h6Var2.m), h6Var2);
        return true;
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 5:
                Map map = (Map) obj;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = g0Var.a;
                    if (k0Var.c.l(str) == null) {
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
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
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

    @Override // fi.s0
    public void k(long j3) {
        ((fi.s) this.b).presentFragment(yn.Q9(j3));
    }

    @Override // fi.s0
    public void l() {
        fi.s sVar = (fi.s) this.b;
        le.b bVar = sVar.a;
        t0 t0Var = sVar.v;
        bVar.a(t0Var.n && t0Var.l == 0, true);
        sVar.d.f3.N(true);
    }

    @Override // f6.a
    public void m(Bitmap bitmap) {
        ((f6.i) this.b).e(bitmap, 3);
    }

    @Override // b5.p
    public String[] n() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(int i10) {
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // a3.m0
    public void onFirstFrameRendered() {
        a3.n nVar = (a3.n) this.b;
        Surface surface = nVar.n1;
        if (surface != null) {
            nVar.Z0.M(surface);
            nVar.q1 = true;
        }
    }

    @Override // org.telegram.ui.Components.b81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.b81
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.b;
        z6 z6Var = b7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        e81 e81Var = b7Var.y;
        if (e81Var == null || !e81Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(z6Var);
    }

    @Override // org.telegram.ui.Components.b81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.b81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.b).i();
    }

    @Override // fb.n
    public Object p2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new db.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // a3.m0
    public void q() {
        a3.n nVar = (a3.n) this.b;
        if (nVar.n1 != null) {
            nVar.N0(0, 1);
        }
    }

    @Override // org.telegram.ui.Components.ya0
    public Paint.FontMetricsInt r() {
        return ((ci.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // gg.b2
    public /* synthetic */ a0.i s() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void u(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.b;
        if (kVar != kVar.k() || !sVar.O || (callback = sVar.f.getCallback()) == null || sVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void w() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // androidx.lifecycle.a0
    public void w0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        q4 q4Var = e0Var.B0;
        handler.removeCallbacks(q4Var);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(q4Var, 2000L);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i x() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean z(int i10) {
        return true;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.b81
    public void onRenderedFirstFrame() {
    }

    public i(Context context) {
        String d;
        this.a = 0;
        b a2 = b.a(context);
        this.b = a2;
        a2.b();
        String d10 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = new e2.v(10);
                break;
            case 9:
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public i(Bundle bundle) {
        this.a = 15;
        this.b = new Bundle(bundle);
    }

    @Override // a3.m0
    public void H() {
    }

    @Override // org.telegram.ui.Components.ya0
    public /* synthetic */ void G(String str) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void e(Bundle bundle) {
    }

    @Override // ai.fc
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // org.telegram.ui.Components.b81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.b81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void t(int i10) {
    }

    @Override // org.telegram.ui.Components.b81
    public void onError(e81 e81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.ya0
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void p(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ya0
    public /* synthetic */ void y(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.b81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
