package ha;

import ag.h1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.biometric.h;
import androidx.biometric.q;
import androidx.biometric.z;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.p;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.profileinstaller.ProfileInstallReceiver;
import bg.f3;
import bg.s1;
import bg.v2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.j;
import h7.o5;
import h7.w;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import jh.h5;
import kg.q0;
import kg.v;
import l4.e1;
import lh.e9;
import lh.f9;
import lh.g4;
import lh.j3;
import m.j1;
import m.l;
import m7.d;
import nh.d0;
import nh.e0;
import nh.f6;
import nh.gb;
import nh.ja;
import nh.kb;
import nh.n5;
import nh.o7;
import nh.va;
import nh.wa;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
import q7.i;
import t4.f;
import wf.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, v2, f, k0, v0, o, e2.c, a3.b, j1, s, rp0, ek0, e1, e9, l, m, kb {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static boolean d0(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String f0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // nh.kb
    public void B1(int i10, long j10) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null || (arrayList = o7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o7) f6Var.d.T.get(i10)).X = j10;
    }

    @Override // nh.kb
    public void D(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.G = f9;
        o7Var.j = true;
        f6Var.c();
    }

    @Override // nh.kb
    public void D1(long j10) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.D = j10;
        o7Var.j = true;
        f6Var.w(true);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void F() {
        m0 m0Var = (m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.B = Collections.EMPTY_SET;
    }

    @Override // nh.kb
    public void H0(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.P = f9;
        f6Var.c();
    }

    @Override // nh.kb
    public void I(long j10, boolean z10) {
        f6 f6Var = (f6) this.b;
        if (!z10) {
            f6Var.m(j10);
            return;
        }
        x61 x61Var = f6Var.e;
        if (x61Var != null) {
            x61Var.M(j10, true);
            return;
        }
        if (f6Var.j()) {
            f6Var.A.m(j10, true);
            return;
        }
        x61 x61Var2 = f6Var.y;
        if (x61Var2 != null) {
            x61Var2.M(j10, false);
        }
    }

    @Override // nh.kb
    public void I0(float f9, boolean z10) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.Z = f9;
        o7Var.j = true;
        x61 x61Var = f6Var.e;
        if (x61Var == null || x61Var.q() == -9223372036854775807L) {
            return;
        }
        f6Var.m((long) (f9 * f6Var.e.q()));
    }

    @Override // bg.v2
    public void K(float f9) {
        s1 s1Var = (s1) this.b;
        h1.e(s1Var.a).k("-1", f9);
        s1Var.e.setBrushSize(f9);
    }

    @Override // lh.e9
    public boolean K0(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        g4 g4Var;
        g4 g4Var2;
        f9Var.b = null;
        f9Var.c = null;
        oy0 oy0Var = (oy0) this.b;
        iz0 iz0Var = oy0Var.h;
        ArrayList arrayList = oy0Var.w;
        if (oy0Var.J < 0.2f) {
            f9Var.b = iz0Var.getImageReceiver();
            f9Var.c = null;
            f9Var.a = iz0Var;
            f9Var.h = 0.0f;
            f9Var.i = AndroidUtilities.displaySize.y;
            f9Var.g = (View) oy0Var.getParent();
            f9Var.d = oy0Var.y;
            f9Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                g4Var = null;
                g4Var2 = null;
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i13);
            if (g4Var3.e >= 1.0f && g4Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                g4 d = ProfileStoriesView.d(i14 >= 0 ? (g4) arrayList.get(i14) : null, i15 >= 0 ? (g4) arrayList.get(i15) : null, g4Var3);
                imageReceiver = g4Var3.b;
                g4Var2 = d;
                g4Var = g4Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.c = imageReceiver;
        f9Var.b = null;
        f9Var.a = oy0Var;
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) oy0Var.getParent();
        if (g4Var == null || g4Var2 == null) {
            f9Var.f = null;
            return true;
        }
        f9Var.f = new f1.a(this, new RectF(g4Var.m), g4Var, new RectF(g4Var2.m), g4Var2);
        return true;
    }

    @Override // l4.e1
    public long L() {
        long j10 = Long.MAX_VALUE;
        for (e1 e1Var : (e1[]) this.b) {
            long L = e1Var.L();
            if (L != Long.MIN_VALUE) {
                j10 = Math.min(j10, L);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public void Q(View view, q0 q0Var, boolean z10, boolean z11) {
        v vVar = (v) this.b;
        vVar.a.ab(null, vVar.e, vVar.b, view, 0.0f, 0.0f, q0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new jh.o(this, 18));
    }

    @Override // androidx.lifecycle.a0
    public void S(Object obj) {
        switch (this.a) {
            case 2:
                q qVar = (q) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(R.string.fingerprint_not_recognized));
                    }
                    z zVar = qVar.h0;
                    if (zVar.n) {
                        Executor executor = zVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new h(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    z zVar2 = qVar.h0;
                    if (zVar2.u == null) {
                        zVar2.u = new androidx.lifecycle.z();
                    }
                    z.h(zVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                p pVar = (p) this.b;
                if (tVar == null || !pVar.n0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public e T(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // l4.e1
    public void U(long j10) {
        for (e1 e1Var : (e1[]) this.b) {
            e1Var.U(j10);
        }
    }

    public void V(v5.l lVar, androidx.biometric.v vVar) {
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        androidx.fragment.app.k0 k0Var2 = (androidx.fragment.app.k0) this.b;
        q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        androidx.fragment.app.v k9 = qVar.k();
        if (k9 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        z zVar = qVar.h0;
        zVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = vVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || vVar != null) {
            zVar.g = vVar;
        } else {
            zVar.g = w.a();
        }
        if (qVar.Q()) {
            qVar.h0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.h0.k = null;
        }
        if (qVar.Q() && new androidx.biometric.e(new androidx.biometric.t(k9, 0)).d(255) != 0) {
            qVar.h0.n = true;
            qVar.S();
        } else if (qVar.h0.p) {
            qVar.g0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    public boolean W(String str) {
        String c02 = c0(str);
        return "1".equals(c02) || Boolean.parseBoolean(c02);
    }

    public Integer X(String str) {
        String c02 = c0(str);
        if (TextUtils.isEmpty(c02)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(c02));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + f0(str) + "(" + c02 + ") into an int");
            return null;
        }
    }

    public JSONArray Y(String str) {
        String c02 = c0(str);
        if (TextUtils.isEmpty(c02)) {
            return null;
        }
        try {
            return new JSONArray(c02);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + f0(str) + ": " + c02 + ", falling back to default");
            return null;
        }
    }

    public String Z(Resources resources, String str, String str2) {
        String[] strArr;
        String c02 = c0(str2);
        if (!TextUtils.isEmpty(c02)) {
            return c02;
        }
        String c03 = c0(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(c03)) {
            return null;
        }
        int identifier = resources.getIdentifier(c03, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", f0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray Y = Y(str2.concat("_loc_args"));
        if (Y == null) {
            strArr = null;
        } else {
            int length = Y.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = Y.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + f0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    @Override // nh.kb
    public void a0() {
        f6 f6Var = (f6) this.b;
        f6Var.s(null, null, true);
        gb gbVar = ((va) f6Var).y0;
        va vaVar = gbVar.T0;
        if (vaVar != null) {
            vaVar.s(null, null, true);
        }
        ja jaVar = gbVar.r1;
        if (jaVar != null) {
            jaVar.q0();
        }
        wa waVar = gbVar.Y0;
        if (waVar != null) {
            waVar.setHasRoundVideo(false);
        }
        o7 o7Var = gbVar.G1;
        if (o7Var != null) {
            File file = o7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                gbVar.G1.o0 = null;
            }
            if (gbVar.G1.p0 != null) {
                try {
                    new File(gbVar.G1.p0).delete();
                } catch (Exception unused2) {
                }
                gbVar.G1.p0 = null;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                h8.e eVar = (h8.e) this.b;
                q7.b bVar = (q7.b) obj;
                bVar.getClass();
                q7.a aVar = new q7.a(1, (TaskCompletionSource) obj2);
                try {
                    i iVar = (i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = q7.c.a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
                    Bundle bundle = Bundle.EMPTY;
                    o5.a(Status.h, Boolean.FALSE, aVar.b);
                    return;
                }
            default:
                x7.c cVar = (x7.c) this.b;
                d dVar = new d(1, (TaskCompletionSource) obj2);
                m7.c cVar2 = (m7.c) ((m7.f) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = m7.a.a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                cVar.writeToParcel(obtain2, 0);
                cVar2.E0(obtain2, 1);
                return;
        }
    }

    @Override // l4.e1
    public boolean b() {
        for (e1 e1Var : (e1[]) this.b) {
            if (e1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public Set b0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    @Override // nh.kb
    public void b1(long j10) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.r0 = j10;
        o7Var.j = true;
        f6Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void c(w5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    public String c0(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // nh.kb
    public void d1(boolean z10) {
        f3 f3Var;
        gb gbVar = ((va) ((f6) this.b)).y0;
        ja jaVar = gbVar.r1;
        if (jaVar == null) {
            return;
        }
        f3 f3Var2 = null;
        if (!z10 && (jaVar.getSelectedEntity() instanceof f3)) {
            gbVar.r1.D0(null, true);
            return;
        }
        if (!z10 || (gbVar.r1.getSelectedEntity() instanceof f3)) {
            return;
        }
        n5 n5Var = gbVar.r1.N0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= n5Var.getChildCount()) {
                f3Var = null;
                break;
            }
            View childAt = n5Var.getChildAt(i11);
            if (childAt instanceof f3) {
                f3Var = (f3) childAt;
                break;
            }
            i11++;
        }
        if (f3Var != null) {
            ja jaVar2 = gbVar.r1;
            n5 n5Var2 = jaVar2.N0;
            while (true) {
                if (i10 >= n5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = n5Var2.getChildAt(i10);
                if (childAt2 instanceof f3) {
                    f3Var2 = (f3) childAt2;
                    break;
                }
                i10++;
            }
            jaVar2.D0(f3Var2, true);
        }
    }

    @Override // t4.f
    public int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public Bundle e0() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // nh.kb
    public void f1(float f9, int i10) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null || (arrayList = o7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o7) f6Var.d.T.get(i10)).V = f9;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void g() {
        m0 m0Var = (m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.F();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // pc.a
    public Object get() {
        return new j((Context) ((pc.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(j.d).intValue());
    }

    @Override // l4.e1
    public long h() {
        long j10 = Long.MAX_VALUE;
        for (e1 e1Var : (e1[]) this.b) {
            long h = e1Var.h();
            if (h != Long.MIN_VALUE) {
                j10 = Math.min(j10, h);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // e2.c
    public void h0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // nh.kb
    public void i(int i10) {
        e0 e0Var = ((f6) this.b).A;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // nh.kb
    public void i0(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.s0 = f9;
        o7Var.j = true;
        f6Var.y(true);
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // nh.kb
    public void j1(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.F = f9;
        o7Var.j = true;
        f6Var.w(true);
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void k(Object obj) {
        ((s7.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // androidx.activity.result.b
    public void l(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s q6 = j0Var.c.q(str);
        if (q6 != null) {
            q6.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // e2.c
    public void l0(int i10, Object obj) {
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

    @Override // lh.e9
    public void l1(long j10, int i10, j3 j3Var) {
        oy0 oy0Var = (oy0) this.b;
        int i11 = ProfileStoriesView.o0;
        oy0Var.f(true, false);
        j3Var.run();
    }

    @Override // t4.f
    public long m(int i10) {
        f5.a.f(i10 == 0);
        return 0L;
    }

    @Override // t4.f
    public List q(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // org.telegram.ui.Components.rp0
    public void r0() {
        mc k9 = ((h5) this.b).getBulletinFactory().k(false);
        k9.t = true;
        k9.j();
    }

    @Override // nh.kb
    public void r1(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.E = f9;
        o7Var.j = true;
        f6Var.w(true);
    }

    @Override // l4.e1
    public boolean s(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long h = h();
            if (h == Long.MIN_VALUE) {
                return z11;
            }
            z10 = false;
            for (e1 e1Var : (e1[]) this.b) {
                long h10 = e1Var.h();
                boolean z12 = h10 != Long.MIN_VALUE && h10 <= j10;
                if (h10 == h || z12) {
                    z10 |= e1Var.s(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // nh.kb
    public void s0(boolean z10) {
        f6 f6Var = (f6) this.b;
        if (f6Var.j()) {
            f6Var.A.getClass();
        }
        f6Var.x(-4, z10);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void t(int i10) {
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

    @Override // wf.m
    public void u() {
        ((nh.j0) this.b).d.invalidate();
    }

    @Override // t4.f
    public int v() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean w() {
        return false;
    }

    @Override // nh.kb
    public void w1(float f9, int i10) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null || (arrayList = o7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o7) f6Var.d.T.get(i10)).W = f9;
    }

    @Override // nh.kb
    public void x(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.u0 = f9;
        o7Var.j = true;
        f6Var.c();
    }

    @Override // nh.kb
    public void x0(float f9, int i10) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null || (arrayList = o7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((o7) f6Var.d.T.get(i10)).P = f9;
    }

    @Override // nh.kb
    public void x1(float f9) {
        o7 o7Var = ((f6) this.b).d;
        if (o7Var == null) {
            return;
        }
        o7Var.a0 = f9;
        o7Var.j = true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void y(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = w5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // nh.kb
    public void y1() {
        ((f6) this.b).q(null);
    }

    @Override // nh.kb
    public void z1(float f9) {
        f6 f6Var = (f6) this.b;
        o7 o7Var = f6Var.d;
        if (o7Var == null) {
            return;
        }
        o7Var.t0 = f9;
        o7Var.j = true;
        f6Var.y(true);
    }

    public c(ArrayList arrayList) {
        this.a = 9;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // bg.v2
    public float get() {
        s1 s1Var = (s1) this.b;
        int i10 = s1Var.a;
        ag.m currentBrush = s1Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return h1.e(i10).i;
        }
        return h1.e(i10).f("-1", currentBrush.d());
    }

    public c(l3.e eVar) {
        this.a = 23;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.a).setFlags(eVar.b).setUsage(eVar.c);
        int i10 = f5.d0.a;
        if (i10 >= 29) {
            l3.c.a(usage, eVar.d);
        }
        if (i10 >= 32) {
            l3.d.a(usage, eVar.e);
        }
        this.b = usage.build();
    }

    public c(Bundle bundle) {
        this.a = 12;
        this.b = new Bundle(bundle);
    }

    public c(LaunchActivity launchActivity, Executor executor, h7.v vVar) {
        this.a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.k0 s10 = launchActivity.s();
            z zVar = (z) new androidx.biometric.e(launchActivity).l(z.class);
            this.b = s10;
            zVar.d = executor;
            zVar.e = vVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.rp0
    public /* synthetic */ void M() {
    }

    @Override // wf.m
    public void R() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void B(int i10) {
    }

    @Override // wf.m
    public void C(boolean z10) {
    }

    @Override // wf.m
    public void P(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void a(Bundle bundle) {
    }

    @Override // lh.e9
    public /* synthetic */ void d(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void z(w5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
