package b6;

import a3.n;
import a3.n0;
import ag.r0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.e0;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import b2.b2;
import bi.r3;
import c3.p;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.p9;
import di.q4;
import e2.x;
import f9.g1;
import fi.m6;
import fi.o6;
import g.q;
import i2.m0;
import ig.y1;
import ig.z1;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k2.u;
import k2.v0;
import k2.y;
import k6.m;
import l.w;
import li.f2;
import li.i0;
import li.q3;
import li.v3;
import li.y0;
import ng.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.t;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.av0;
import org.telegram.ui.e20;
import org.telegram.ui.ox;
import sg.c2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i implements n0, a0, androidx.activity.result.b, jw0, j0, u0, av0, OnSuccessListener, g1, o, q81, w, r, z1, y, i0 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i10, boolean z10) {
        this.a = i10;
    }

    public static boolean Y(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String d0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static synchronized i e0(Context context) {
        i h02;
        synchronized (i.class) {
            h02 = h0(context.getApplicationContext());
        }
        return h02;
    }

    public static synchronized i h0(Context context) {
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

    @Override // a3.n0
    public void A() {
        m0 m0Var = ((n) this.b).Y;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public void B(boolean z10) {
        switch (this.a) {
            case 7:
                oe.b bVar = ((bi.y) this.b).s;
                if (bVar != null) {
                    bVar.a(z10, true);
                    break;
                }
                break;
            default:
                gi.h hVar = (gi.h) this.b;
                oe.b bVar2 = hVar.Y;
                if (bVar2 != null) {
                    bVar2.a(z10, true);
                }
                e20 e20Var = hVar.s;
                if (e20Var != null) {
                    e20Var.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.av0
    public void B0(MessageObject messageObject) {
        ((p9) ((q4) this.b).F1).f(true);
    }

    @Override // li.i0
    public s9 C() {
        q3 q3Var = ((y0) this.b).S;
        if (q3Var == null) {
            return null;
        }
        return q3Var.a.getTextSelectionHelper();
    }

    @Override // k2.y
    public void D(v0 v0Var) {
        rf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 1));
        }
    }

    @Override // org.telegram.ui.av0
    public void E(MessageObject messageObject) {
        ((p9) ((q4) this.b).F1).f(false);
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public boolean F() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public com.google.android.gms.common.api.internal.e G(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // li.i0
    public void I(CharSequence charSequence) {
        q3 q3Var = ((y0) this.b).S;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            q3Var.a.z4(charSequence.toString());
        }
    }

    @Override // k2.y
    public void J(v0 v0Var) {
        rf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(bVar, v0Var, 0));
        }
    }

    @Override // li.i0
    public r9 K() {
        return (y0) this.b;
    }

    @Override // li.i0
    public li.a L() {
        return ((y0) this.b).a;
    }

    @Override // li.i0
    public boolean M() {
        y0 y0Var = (y0) this.b;
        q3 q3Var = y0Var.S;
        if (q3Var == null) {
            return false;
        }
        li.a aVar = y0Var.a;
        return q3Var.a.Y4();
    }

    @Override // li.i0
    public void O(int i10, int i11) {
        y0 y0Var = (y0) this.b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.a;
            f2 f2Var = q3Var.a.R3;
            if (f2Var != null) {
                f2Var.f(i10, i11);
            }
        }
    }

    @Override // androidx.lifecycle.a0
    public void Q(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        e0 e0Var = (e0) this.b;
        Handler handler = e0Var.A0;
        a5.d dVar = e0Var.B0;
        handler.removeCallbacks(dVar);
        TextView textView = e0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(dVar, 2000L);
    }

    public boolean R(String str) {
        String X = X(str);
        return "1".equals(X) || Boolean.parseBoolean(X);
    }

    @Override // li.i0
    public void S() {
        y0 y0Var = (y0) this.b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.a;
            v3 v3Var = q3Var.a;
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.p3.onContentChanged();
        }
    }

    public Integer T(String str) {
        String X = X(str);
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(X));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + d0(str) + "(" + X + ") into an int");
            return null;
        }
    }

    @Override // ig.z1
    public /* synthetic */ a0.h U() {
        return null;
    }

    public JSONArray V(String str) {
        String X = X(str);
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        try {
            return new JSONArray(X);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + d0(str) + ": " + X + ", falling back to default");
            return null;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public float V0() {
        i0.b bVar;
        int i10;
        int currentActionBarHeight;
        switch (this.a) {
            case 7:
                bVar = ((r2) ((bi.y) this.b)).mSystemInsets;
                i10 = bVar.b;
                currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
                break;
            default:
                i10 = ((gi.h) this.b).b0;
                currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2;
                break;
        }
        return t.c(9.0f, (currentActionBarHeight * 2) + i10, 0);
    }

    public String W(Resources resources, String str, String str2) {
        String[] strArr;
        String X = X(str2);
        if (!TextUtils.isEmpty(X)) {
            return X;
        }
        String X2 = X(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(X2)) {
            return null;
        }
        int identifier = resources.getIdentifier(X2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", d0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray V = V(str2.concat("_loc_args"));
        if (V == null) {
            strArr = null;
        } else {
            int length = V.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = V.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + d0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String X(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle Z() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // k2.y
    public void a(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.g0 = true;
        rf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r3(bVar, j10, 13));
        }
    }

    @Override // li.i0
    public void a0() {
        y0 y0Var = (y0) this.b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            li.a aVar = y0Var.a;
            v3.U1(q3Var.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 25:
                h7.f fVar = (h7.f) this.b;
                i7.f fVar2 = new i7.f(0, (TaskCompletionSource) obj2);
                i7.d dVar = (i7.d) ((i7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = r7.a.a;
                obtain.writeStrongBinder(fVar2);
                r7.a.b(obtain, fVar);
                r7.a.b(obtain, gVar);
                ((i7.b) dVar).F0(obtain, 6);
                break;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                j7.i iVar = (j7.i) ((j7.c) obj).u();
                y5.e eVar = (y5.e) this.b;
                Parcel J0 = iVar.J0();
                int i11 = j7.f.a;
                J0.writeStrongBinder(lVar);
                j7.f.c(J0, eVar);
                iVar.K0(J0, 1);
                break;
        }
    }

    @Override // li.i0
    public void b(li.g1 g1Var) {
        q3 q3Var = ((y0) this.b).S;
        if (q3Var != null) {
            v3 v3Var = q3Var.a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    public fa.a b0(JSONObject jSONObject) {
        fa.b aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new pa.d();
        } else {
            aVar = new qb.a(8);
        }
        return aVar.E((sb.b) this.b, jSONObject);
    }

    @Override // org.telegram.ui.Components.jw0
    public int b1() {
        i0.b bVar;
        switch (this.a) {
            case 7:
                bVar = ((r2) ((bi.y) this.b)).mSystemInsets;
                return bVar.d;
            default:
                return ((gi.h) this.b).c0;
        }
    }

    public b2.u0 c0(p pVar, q3.g gVar, int i10) {
        x xVar = (x) this.b;
        b2.u0 u0Var = null;
        int i11 = 0;
        loop0: while (true) {
            int i12 = 0;
            do {
                int i13 = i12 % 10;
                int i14 = i13 + 10;
                if (i13 == 0 && i12 != 0) {
                    byte[] bArr = xVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i15 = i12 == 0 ? 10 : 1;
                try {
                    pVar.b(i14 - i15, i15, xVar.a);
                    xVar.N(i13);
                    xVar.M(i14);
                    if (xVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xVar.b + ", limit=" + xVar.c);
                    }
                    int D = xVar.D();
                    int i16 = xVar.b - 3;
                    xVar.b = i16;
                    if (D != 4801587) {
                        if (c3.b.h(xVar.i()) != -1) {
                            break loop0;
                        }
                        if (i12 == 0) {
                            xVar.c(20);
                        }
                        i12++;
                    } else {
                        xVar.O(6);
                        int z10 = xVar.z();
                        int i17 = z10 + 10;
                        if (u0Var == null) {
                            byte[] bArr2 = new byte[i17];
                            System.arraycopy(xVar.a, i16, bArr2, 0, 10);
                            pVar.b(10, z10, bArr2);
                            u0Var = new q3.h(gVar).c(i17, bArr2);
                        } else {
                            pVar.j(z10);
                        }
                        i11 += i17;
                    }
                } catch (EOFException unused) {
                }
            } while (i12 <= i10);
        }
        pVar.p();
        pVar.j(i11);
        return u0Var;
    }

    @Override // androidx.activity.result.b
    public void d(Object obj) {
        switch (this.a) {
            case 4:
                Map map = (Map) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
                if (e0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = e0Var.a;
                    if (i0Var.c.g(str) == null) {
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
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // ig.z1
    public void f(int i10) {
        xo0 xo0Var = (xo0) this.b;
        xo0Var.D0--;
        xo0Var.e0 = i10;
        if (xo0Var.f0 != i10) {
            xo0Var.s.clear();
        }
        if (xo0Var.g0 != i10) {
            xo0Var.I.clear();
        }
        xo0Var.N = true;
        ox oxVar = xo0Var.U;
        if (oxVar != null) {
            oxVar.d(xo0Var.D0 > 0, true);
        }
        xo0Var.l();
        ox oxVar2 = xo0Var.U;
        if (oxVar2 != null) {
            oxVar2.c();
        }
    }

    @Override // org.telegram.ui.av0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // l.w
    public void g(l.k kVar, boolean z10) {
        q qVar;
        g.r rVar = (g.r) this.b;
        l.k k10 = kVar.k();
        int i10 = 0;
        boolean z11 = k10 != kVar;
        if (z11) {
            kVar = k10;
        }
        q[] qVarArr = rVar.U;
        int length = qVarArr != null ? qVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                qVar = qVarArr[i10];
                if (qVar != null && qVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            if (!z11) {
                rVar.h(qVar, z10);
            } else {
                rVar.f(qVar.a, qVar, k10);
                rVar.h(qVar, true);
            }
        }
    }

    public synchronized void g0() {
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

    @Override // li.i0
    public void h() {
        y0 y0Var = (y0) this.b;
        q3 q3Var = y0Var.S;
        if (q3Var != null) {
            v3.V1(q3Var.a, y0Var.a);
        }
    }

    @Override // k2.y
    public void i() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void k() {
        l0 l0Var = (l0) this.b;
        l0Var.a.lock();
        try {
            l0Var.m = new f0(l0Var, l0Var.j, l0Var.k, l0Var.d, l0Var.l, l0Var.a, l0Var.c);
            l0Var.m.u();
            l0Var.b.signalAll();
        } finally {
            l0Var.a.unlock();
        }
    }

    @Override // ig.z1
    public boolean k0(int i10) {
        return i10 == ((xo0) this.b).d0;
    }

    @Override // f9.g1
    public Object l(Object obj, Object obj2) {
        return ((e9.k) this.b).apply(obj2);
    }

    @Override // k2.y
    public void m(int i10, long j10, long j11) {
        rf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.t(bVar, i10, j10, j11, 0));
        }
    }

    @Override // k2.y
    public void n() {
        x2.o oVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            oVar = ffmpegAudioRenderer.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // k2.y
    public void onAudioSessionIdChanged(int i10) {
        rf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r0(bVar, i10, 15));
        }
    }

    @Override // a3.n0
    public void onFirstFrameRendered() {
        n nVar = (n) this.b;
        Surface surface = nVar.r1;
        if (surface != null) {
            nVar.b1.E(surface);
            nVar.u1 = true;
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.y
    public void onSkipSilenceEnabledChanged(boolean z10) {
        rf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new bh.n(12, bVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.q81
    public void onStateChanged(boolean z10, int i10) {
        o6 o6Var = (o6) this.b;
        m6 m6Var = o6Var.M;
        t81 t81Var = o6Var.x;
        if (t81Var == null) {
            return;
        }
        if (t81Var.y()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a2 a2Var;
        a1 b10;
        e6.a aVar = (e6.a) this.b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.m0.j) {
            Context context = aVar.a;
            h6.r rVar = aVar.f;
            com.google.android.gms.internal.cast.m0 m0Var = new com.google.android.gms.internal.cast.m0(context, rVar, aVar.c, aVar.j, aVar.g);
            int i10 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (!z10) {
                    return;
                }
                i10 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String u10 = b10.u(packageName, ".client_cast_analytics_data");
            m0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            m5.t.b(context);
            m0Var.g = m5.t.a().c(k5.a.e).a("CAST_SENDER_SDK", new j5.c("proto"), com.google.android.gms.internal.cast.x.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(u10, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.u b11 = v.b();
                b11.c = new c3.l0(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new l6.c[]{d6.y.c};
                b11.b = false;
                b11.a = 8426;
                Task e = rVar.e(0, b11.a());
                m mVar = new m();
                mVar.b = m0Var;
                mVar.c = packageName;
                mVar.a = i10;
                mVar.d = sharedPreferences;
                e.addOnSuccessListener(mVar);
            }
            if (z10) {
                o6.l.h(sharedPreferences);
                h6.b bVar = a2.i;
                synchronized (a2.class) {
                    try {
                        if (a2.k == null) {
                            a2.k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.c;
                SharedPreferences sharedPreferences2 = a2Var.b;
                HashSet hashSet = a2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    a2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                a1 b12 = a2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = a2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    a2Var.c(hashSet3);
                    o6.l.h(a2Var.e);
                    o6.l.h(a2Var.d);
                    a2Var.e.post(a2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    a2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                a2.a(a1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // a3.n0
    public void onVideoSizeChanged(b2 b2Var) {
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void p(int i10) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        Lock lock = wVar.o;
        lock.lock();
        try {
            if (wVar.n) {
                wVar.n = false;
                com.google.android.gms.common.api.internal.w.k(wVar, i10);
            } else {
                wVar.n = true;
                wVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // ig.z1
    public void p0(ArrayList arrayList) {
        xo0 xo0Var = (xo0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            xo0Var.J.add(((y1) arrayList.get(i10)).a);
        }
        ox oxVar = xo0Var.U;
        if (oxVar != null) {
            oxVar.d(xo0Var.D0 > 0, false);
        }
        xo0Var.l();
    }

    @Override // ng.o
    public void q() {
        ((fi.m0) this.b).e.invalidate();
    }

    @Override // k2.y
    public void r(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        rf.b bVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.r(bVar, exc, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void s(Bundle bundle) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        wVar.o.lock();
        try {
            wVar.m = l6.a.e;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // l.w
    public boolean t(l.k kVar) {
        Window.Callback callback;
        g.r rVar = (g.r) this.b;
        if (kVar != kVar.k() || !rVar.O || (callback = rVar.f.getCallback()) == null || rVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void u() {
        l0 l0Var = (l0) this.b;
        Iterator it = l0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        l0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // k2.y
    public void v() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void w(l6.a aVar) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.b;
        wVar.o.lock();
        try {
            wVar.m = aVar;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // ig.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // a3.n0
    public void z() {
        n nVar = (n) this.b;
        if (nVar.r1 != null) {
            nVar.R0(0, 1);
        }
    }

    public /* synthetic */ i(j7.b bVar, y5.e eVar) {
        this.a = 27;
        this.b = eVar;
    }

    @Override // org.telegram.ui.Components.q81
    public void onRenderedFirstFrame() {
    }

    @Override // org.telegram.ui.Components.q81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        c2 c2Var = ((o6) this.b).w;
        if (c2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(c2Var.y0 - f10) >= 1.0E-4f) {
                c2Var.y0 = f10;
                c2Var.requestLayout();
            }
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
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
            case 6:
                this.b = new rf.b[bg.b.values().length];
                break;
            case 8:
                this.b = new x(10);
                break;
            case 17:
                this.b = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public i(Bundle bundle) {
        this.a = 12;
        this.b = new Bundle(bundle);
    }

    @Override // k2.y
    public /* synthetic */ void N() {
    }

    @Override // ng.o
    public void P() {
    }

    @Override // k2.y
    public /* synthetic */ void j() {
    }

    @Override // ng.o
    public void H(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void o(int i10) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ng.o
    public void x(boolean z10) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onError(t81 t81Var, Exception exc) {
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public void e(l6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
