package ae;

import a9.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.d0;
import androidx.biometric.f0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import c2.t;
import cg.b2;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f2.e1;
import f2.m0;
import f2.o1;
import f2.q0;
import f9.h;
import j$.util.DesugarCollections;
import j3.b0;
import j3.n;
import j3.r;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import lh.hb;
import lh.ib;
import lh.j0;
import lh.q6;
import lh.sb;
import lh.va;
import lh.wb;
import lh.z5;
import lh.z7;
import m.j1;
import m.y0;
import m4.g;
import m5.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.m61;
import s7.j;
import t2.d;
import t2.f;
import u3.k;
import uf.m;
import zf.c2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class b implements a0, o, k0, v0, l0, e2.c, m0, Continuation, j1, s, r, m, wb, y0, r0, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static boolean Q(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String Z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // f2.m0
    public void A(int i10, int i11) {
        ((q0) this.b).p(i10, i11);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public e B(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void C(v5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // lh.wb
    public void C1(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.E = f10;
        z7Var.j = true;
        q6Var.w(true);
    }

    public void F(j9.a aVar, t tVar, i iVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        tVar.c = cancellationSignal2;
                        if (tVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) tVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (f10 = e0.b.f((Context) this.b)) == null) {
            return;
        }
        e0.b.a(f10, e0.b.C(aVar), cancellationSignal, new k0.a(iVar));
    }

    public void G(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // lh.wb
    public void I(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.G = f10;
        z7Var.j = true;
        q6Var.c();
    }

    @Override // lh.wb
    public void I0(boolean z10) {
        q6 q6Var = (q6) this.b;
        if (q6Var.j()) {
            q6Var.A.getClass();
        }
        q6Var.x(-4, z10);
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
    public void J(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.w0;
        a8.b bVar = f0Var.x0;
        handler.removeCallbacks(bVar);
        int intValue = num.intValue();
        if (f0Var.B0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = f0Var.y0.y;
            Context n10 = f0Var.n();
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
                f0Var.B0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    d0.a(drawable);
                }
                f0Var.y0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? f0Var.z0 : f0Var.A0);
        }
        handler.postDelayed(bVar, 2000L);
    }

    public boolean K(String str) {
        String O = O(str);
        return "1".equals(O) || Boolean.parseBoolean(O);
    }

    @Override // f2.m0
    public void K0(int i10, int i11) {
        ((q0) this.b).t(i10, i11);
    }

    public Integer L(String str) {
        String O = O(str);
        if (TextUtils.isEmpty(O)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(O));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Z(str) + "(" + O + ") into an int");
            return null;
        }
    }

    public JSONArray M(String str) {
        String O = O(str);
        if (TextUtils.isEmpty(O)) {
            return null;
        }
        try {
            return new JSONArray(O);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Z(str) + ": " + O + ", falling back to default");
            return null;
        }
    }

    public String N(Resources resources, String str, String str2) {
        String[] strArr;
        String O = O(str2);
        if (!TextUtils.isEmpty(O)) {
            return O;
        }
        String O2 = O(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(O2)) {
            return null;
        }
        int identifier = resources.getIdentifier(O2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", Z(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray M = M(str2.concat("_loc_args"));
        if (M == null) {
            strArr = null;
        } else {
            int length = M.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = M.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e9) {
            Log.w("NotificationParams", "Missing format argument for " + Z(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e9);
            return null;
        }
    }

    public String O(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // lh.wb
    public void P(long j10, boolean z10) {
        q6 q6Var = (q6) this.b;
        if (!z10) {
            q6Var.m(j10);
            return;
        }
        m61 m61Var = q6Var.e;
        if (m61Var != null) {
            m61Var.M(j10, true);
            return;
        }
        if (q6Var.j()) {
            q6Var.A.m(j10, true);
            return;
        }
        m61 m61Var2 = q6Var.y;
        if (m61Var2 != null) {
            m61Var2.M(j10, false);
        }
    }

    @Override // lh.wb
    public void P0(float f10, int i10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).P = f10;
    }

    public void R(ia.f0 f0Var) {
        ((w2.o) ((f) ((y9.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new t2.c("json"), new h3.x(this, 17)).a(new t2.a(null, f0Var, d.a, null), new k(6));
    }

    @Override // f2.m0
    public void S(int i10, int i11) {
        ((q0) this.b).s(i10, i11);
    }

    public void T(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int t10 = recyclerView.e.t();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < t10; i15++) {
            View s10 = recyclerView.e.s(i15);
            o1 U = RecyclerView.U(s10);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((f2.y0) s10.getLayoutParams()).c = true;
            }
        }
        e1 e1Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) e1Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            o1 o1Var = (o1) arrayList2.get(size);
            if (o1Var != null && (i12 = o1Var.c) >= i10 && i12 < i14) {
                o1Var.a(2);
                e1Var.f(size);
            }
        }
        recyclerView.t0 = true;
    }

    public void U() {
        ((u) this.b).d.R();
    }

    public void V(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int t10 = recyclerView.e.t();
        for (int i12 = 0; i12 < t10; i12++) {
            o1 U = RecyclerView.U(recyclerView.e.s(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.p0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            o1 o1Var = (o1) arrayList.get(i13);
            if (o1Var != null && o1Var.c >= i10) {
                o1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    public void W(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int t10 = recyclerView.e.t();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < t10; i20++) {
            o1 U = RecyclerView.U(recyclerView.e.s(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.p0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            o1 o1Var = (o1) arrayList.get(i21);
            if (o1Var != null && (i17 = o1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    o1Var.n(i11 - i10, false);
                } else {
                    o1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    @Override // lh.wb
    public void W1(float f10, int i10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).W = f10;
    }

    public void X(j9.a aVar) {
        j jVar = (j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((i6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    @Override // lh.wb
    public void X0(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.P = f10;
        q6Var.c();
    }

    @Override // lh.wb
    public void X1(float f10) {
        z7 z7Var = ((q6) this.b).d;
        if (z7Var == null) {
            return;
        }
        z7Var.a0 = f10;
        z7Var.j = true;
    }

    public Bundle Y() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // lh.wb
    public void Y1() {
        ((q6) this.b).q(null);
    }

    @Override // lh.wb
    public void Z0(float f10, boolean z10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.Z = f10;
        z7Var.j = true;
        m61 m61Var = q6Var.e;
        if (m61Var == null || m61Var.q() == -9223372036854775807L) {
            return;
        }
        q6Var.m((long) (f10 * q6Var.e.q()));
    }

    @Override // com.google.android.exoplayer2.upstream.r0
    public void a() {
        g gVar = (g) this.b;
        gVar.A.a();
        x4 x4Var = gVar.C;
        if (x4Var != null) {
            throw x4Var;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                g8.j jVar = (g8.j) this.b;
                p7.b bVar = (p7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                p7.a aVar = new p7.a(0, (TaskCompletionSource) obj2);
                try {
                    p7.i iVar = (p7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = p7.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e9) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e9);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.l(Status.h, null);
                    return;
                }
            case 23:
                w7.c cVar = (w7.c) this.b;
                l7.d dVar = new l7.d(1, (TaskCompletionSource) obj2);
                l7.c cVar2 = (l7.c) ((l7.f) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = l7.a.a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                cVar.writeToParcel(obtain2, 0);
                cVar2.E0(obtain2, 1);
                return;
            default:
                r5.x xVar = (r5.x) obj;
                r5.f fVar = (r5.f) xVar.u();
                e0 e0Var = ((m5.f0) this.b).k;
                Parcel M0 = fVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, e0Var);
                fVar.R0(M0, 18);
                r5.f fVar2 = (r5.f) xVar.u();
                fVar2.R0(fVar2.M0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    @Override // j3.r
    public void c(long j10) {
        n nVar;
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new b2(nVar, j10, 3));
        }
    }

    @Override // lh.wb
    public void e(int i10) {
        lh.e0 e0Var = ((q6) this.b).A;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                lh.d0 d0Var = (lh.d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // lh.wb
    public void e2(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.t0 = f10;
        z7Var.j = true;
        q6Var.y(true);
    }

    @Override // lh.wb
    public void g0() {
        q6 q6Var = (q6) this.b;
        q6Var.s(null, null, true);
        sb sbVar = ((hb) q6Var).y0;
        hb hbVar = sbVar.T0;
        if (hbVar != null) {
            hbVar.s(null, null, true);
        }
        va vaVar = sbVar.r1;
        if (vaVar != null) {
            vaVar.q0();
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null) {
            ibVar.setHasRoundVideo(false);
        }
        z7 z7Var = sbVar.G1;
        if (z7Var != null) {
            File file = z7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.G1.o0 = null;
            }
            if (sbVar.G1.p0 != null) {
                try {
                    new File(sbVar.G1.p0).delete();
                } catch (Exception unused2) {
                }
                sbVar.G1.p0 = null;
            }
        }
    }

    @Override // lh.wb
    public void g2(int i10, long j10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).X = j10;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i10) {
        g gVar = ((m4.d) this.b).a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return com.google.android.exoplayer2.upstream.q0.e;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void i(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.n nVar2 = ((c7.j) this.b).b;
        synchronized (nVar2) {
            nVar2.a = false;
            nVar = ((p) nVar2.b).c;
        }
        if (nVar != null) {
            ((c7.d) nVar2.c).c(nVar, 2441);
        }
    }

    @Override // lh.wb
    public void i1(long j10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.r0 = j10;
        z7Var.j = true;
        q6Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void j() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.v();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // lh.wb
    public void j1(boolean z10) {
        c2 c2Var;
        sb sbVar = ((hb) ((q6) this.b)).y0;
        va vaVar = sbVar.r1;
        if (vaVar == null) {
            return;
        }
        c2 c2Var2 = null;
        if (!z10 && (vaVar.getSelectedEntity() instanceof c2)) {
            sbVar.r1.D0(null, true);
            return;
        }
        if (!z10 || (sbVar.r1.getSelectedEntity() instanceof c2)) {
            return;
        }
        z5 z5Var = sbVar.r1.N0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= z5Var.getChildCount()) {
                c2Var = null;
                break;
            }
            View childAt = z5Var.getChildAt(i11);
            if (childAt instanceof c2) {
                c2Var = (c2) childAt;
                break;
            }
            i11++;
        }
        if (c2Var != null) {
            va vaVar2 = sbVar.r1;
            z5 z5Var2 = vaVar2.N0;
            while (true) {
                if (i10 >= z5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = z5Var2.getChildAt(i10);
                if (childAt2 instanceof c2) {
                    c2Var2 = (c2) childAt2;
                    break;
                }
                i10++;
            }
            vaVar2.D0(c2Var2, true);
        }
    }

    @Override // lh.wb
    public void j2(long j10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.D = j10;
        z7Var.j = true;
        q6Var.w(true);
    }

    @Override // uf.m
    public void k() {
        ((j0) this.b).d.invalidate();
    }

    @Override // f2.m0
    public void k1(int i10, int i11) {
        ((q0) this.b).r(i10, i11, null);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void l(n0 n0Var, long j10, long j11) {
        boolean z10;
        m4.d dVar = (m4.d) this.b;
        synchronized (d5.a.i) {
            z10 = d5.a.j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        g gVar = dVar.a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
    }

    @Override // e2.c
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // e2.c
    public void n(int i10, Object obj) {
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

    @Override // lh.wb
    public void n1(float f10, int i10) {
        ArrayList arrayList;
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null || (arrayList = z7Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((z7) q6Var.d.T.get(i10)).V = f10;
    }

    @Override // j3.r
    public void o(int i10, long j10, long j11) {
        n nVar;
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    @Override // j3.r
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar;
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new fh.f(5, nVar, z10));
        }
    }

    @Override // lh.wb
    public void p1(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.F = f10;
        z7Var.j = true;
        q6Var.w(true);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void r(int i10) {
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
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void s(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = v5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                c cVar = c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((aa.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // j3.r
    public void u(Exception exc) {
        n nVar;
        d5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        nVar = ((b0) ((FfmpegAudioRenderer) this.b)).eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new j3.k(nVar, exc, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void v() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.B = Collections.EMPTY_SET;
    }

    @Override // j3.r
    public void w() {
        ((FfmpegAudioRenderer) this.b).onPositionDiscontinuity();
    }

    @Override // lh.wb
    public void w0(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.s0 = f10;
        z7Var.j = true;
        q6Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean x() {
        return true;
    }

    @Override // lh.wb
    public void y(float f10) {
        q6 q6Var = (q6) this.b;
        z7 z7Var = q6Var.d;
        if (z7Var == null) {
            return;
        }
        z7Var.u0 = f10;
        z7Var.j = true;
        q6Var.c();
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        c3.g gVar = (c3.g) this.b;
        ec.a aVar = (ec.a) gVar.f;
        m9.c cVar = (m9.c) gVar.b;
        String str = aVar.b;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = ec.a.b(cVar);
            j9.a aVar2 = new j9.a(str, b10);
            aVar2.E("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar2.E("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ec.a.a(aVar2, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = aVar.c(aVar2.v());
        } catch (IOException e9) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e9);
            jSONObject = null;
        }
        if (jSONObject != null) {
            m9.a h = ((ga.c) gVar.c).h(jSONObject);
            k5.i iVar = (k5.i) gVar.e;
            long j10 = h.c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) iVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        h.c(fileWriter, "Failed to close settings writer.");
                        c3.g.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f;
                        SharedPreferences.Editor edit = ((Context) gVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) gVar.h).set(h);
                        ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(h);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            h.c(fileWriter, "Failed to close settings writer.");
            c3.g.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f;
            SharedPreferences.Editor edit2 = ((Context) gVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) gVar.h).set(h);
            ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(h);
        }
        return Tasks.forResult(null);
    }

    public b(Bundle bundle) {
        this.a = 9;
        this.b = new Bundle(bundle);
    }

    @Override // j3.r
    public /* synthetic */ void E() {
    }

    @Override // uf.m
    public void H() {
    }

    @Override // j3.r
    public /* synthetic */ void g() {
    }

    @Override // uf.m
    public void D(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void b(Bundle bundle) {
    }

    @Override // m.y0
    public void p(int i10) {
    }

    @Override // uf.m
    public void q(boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void t(int i10) {
    }

    @Override // m.y0
    public void z(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void f(v5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void d(n0 n0Var, long j10, long j11, boolean z10) {
    }
}
