package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.q;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import b7.c0;
import b7.m;
import c6.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e5.p;
import e9.h;
import f2.a1;
import f2.g1;
import f2.o0;
import f2.q1;
import f2.r0;
import gc.k;
import gh.i3;
import h6.e;
import ha.e0;
import j$.util.DesugarCollections;
import j4.d1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import k1.f;
import k1.z;
import kh.o6;
import kh.r6;
import l.d0;
import l.i;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.t90;
import r7.j;
import v0.l;
import w2.o;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, s, p, o0, w, d1, t90, h61, i, f {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(g gVar, c6.a aVar) {
        this.a = 6;
        this.b = aVar;
    }

    public MediaMetadataCompat B() {
        return new MediaMetadataCompat((Bundle) this.b);
    }

    public void C() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e10) {
                k.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
            }
        }
        arrayList.clear();
    }

    public synchronized void D() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // androidx.lifecycle.a0
    public void E(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        q qVar = (q) this.b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.h0.d(null);
        }
    }

    public void F(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i9 = aVar.a;
        if (i9 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i9 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i9 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i9 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public boolean G() {
        x0 x0Var = ((j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public void H(e0 e0Var) {
        ((o) ((t2.f) ((x9.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new t2.c("json"), new i3(this, 14)).a(new t2.a(null, e0Var, t2.d.a, null), new l(1));
    }

    @Override // f2.o0
    public void I(int i9, int i10) {
        ((r0) this.b).s(i9, i10);
    }

    public void J(int i9, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int v = recyclerView.e.v();
        int i13 = i10 + i9;
        for (int i14 = 0; i14 < v; i14++) {
            View u10 = recyclerView.e.u(i14);
            q1 U = RecyclerView.U(u10);
            if (U != null && !U.r() && (i12 = U.c) >= i9 && i12 < i13) {
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
                ((a1) u10.getLayoutParams()).c = true;
            }
        }
        g1 g1Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) g1Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            q1 q1Var = (q1) arrayList2.get(size);
            if (q1Var != null && (i11 = q1Var.c) >= i9 && i11 < i13) {
                q1Var.a(2);
                g1Var.f(size);
            }
        }
        recyclerView.t0 = true;
    }

    @Override // f2.o0
    public void J0(int i9, int i10) {
        ((r0) this.b).t(i9, i10);
    }

    public void K(int i9, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int v = recyclerView.e.v();
        for (int i11 = 0; i11 < v; i11++) {
            q1 U = RecyclerView.U(recyclerView.e.u(i11));
            if (U != null && !U.r() && U.c >= i9) {
                U.n(i10, false);
                recyclerView.p0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            q1 q1Var = (q1) arrayList.get(i12);
            if (q1Var != null && q1Var.c >= i9) {
                q1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    public void L(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int v = recyclerView.e.v();
        int i18 = -1;
        if (i9 < i10) {
            i12 = i9;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i9;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < v; i19++) {
            q1 U = RecyclerView.U(recyclerView.e.u(i19));
            if (U != null && (i17 = U.c) >= i12 && i17 <= i11) {
                if (i17 == i9) {
                    U.n(i10 - i9, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.p0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i9 < i10) {
            i15 = i9;
            i14 = i10;
        } else {
            i14 = i9;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            q1 q1Var = (q1) arrayList.get(i20);
            if (q1Var != null && (i16 = q1Var.c) >= i15 && i16 <= i14) {
                if (i16 == i9) {
                    q1Var.n(i10 - i9, false);
                } else {
                    q1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.s0 = true;
    }

    public void M(j4.c cVar) {
        j jVar = (j) this.b;
        jVar.a = cVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public void N(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(aa.d.o("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void O(long j10, String str) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(aa.d.o("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.b).putLong(str, j10);
    }

    public void P(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(aa.d.o("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public JSONObject Q() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                q7.e eVar = (q7.e) this.b;
                c0 c0Var = (c0) ((m) obj).u();
                b7.h hVar = new b7.h(1, (TaskCompletionSource) obj2);
                Parcel M0 = c0Var.M0();
                b7.f.c(M0, eVar);
                b7.f.d(M0, hVar);
                M0.writeString(null);
                c0Var.Q0(M0, 63);
                return;
            case 6:
                c6.f fVar = new c6.f(1, (TaskCompletionSource) obj2);
                c6.e eVar2 = (c6.e) ((c6.h) obj).u();
                c6.a aVar = (c6.a) this.b;
                Parcel G0 = eVar2.G0();
                u6.a.d(G0, fVar);
                u6.a.c(G0, aVar);
                G0.writeStrongBinder(null);
                eVar2.H0(G0, 2);
                return;
            case 13:
                f8.j jVar = (f8.j) this.b;
                o7.b bVar = (o7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                o7.a aVar2 = new o7.a(0, (TaskCompletionSource) obj2);
                try {
                    o7.i iVar = (o7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i9 = o7.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.o(Status.h, null);
                    return;
                }
            default:
                v7.a aVar3 = (v7.a) this.b;
                k7.d dVar = new k7.d(0, (TaskCompletionSource) obj2);
                k7.c cVar = (k7.c) ((k7.f) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = k7.a.a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                aVar3.writeToParcel(obtain2, 0);
                cVar.E0(obtain2, 2);
                return;
        }
    }

    @Override // j4.d1
    public boolean b() {
        for (d1 d1Var : (d1[]) this.b) {
            if (d1Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.w
    public void c(l.k kVar, boolean z10) {
        switch (this.a) {
            case 14:
                ((g.q) this.b).g(kVar);
                break;
            default:
                if (kVar instanceof d0) {
                    ((d0) kVar).z.k().c(false);
                }
                w wVar = ((m.i) this.b).e;
                if (wVar != null) {
                    wVar.c(kVar, z10);
                    break;
                }
                break;
        }
    }

    @Override // j4.d1
    public long d() {
        long j10 = Long.MAX_VALUE;
        for (d1 d1Var : (d1[]) this.b) {
            long d = d1Var.d();
            if (d != Long.MIN_VALUE) {
                j10 = Math.min(j10, d);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // k1.f
    public Object e(zc.p pVar, sc.c cVar) {
        return ((z) this.b).e(new n1.c(pVar, null, 0), cVar);
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.a;
        int i9 = f0Var.b;
        androidx.fragment.app.s q10 = j0Var.c.q(str);
        if (q10 != null) {
            q10.x(i9, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // k1.f
    public kd.b getData() {
        return ((z) this.b).c;
    }

    @Override // org.telegram.ui.Components.t90
    public Paint.FontMetricsInt h() {
        return ((kh.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // l.w
    public boolean j(l.k kVar) {
        switch (this.a) {
            case 14:
                Window.Callback callback = ((g.q) this.b).f.getCallback();
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
                    return wVar.j(kVar);
                }
                return false;
        }
    }

    @Override // f2.o0
    public void j1(int i9, int i10) {
        ((r0) this.b).r(i9, i10, null);
    }

    @Override // l.i
    public void l(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.i iVar = toolbar.a.F;
        if (iVar == null || !iVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.S.c).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.t();
            }
        }
    }

    @Override // e5.p
    public void m(a1.c cVar) {
        cVar.a(((WindowManager) this.b).getDefaultDisplay());
    }

    @Override // j4.d1
    public boolean n(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long d = d();
            if (d == Long.MIN_VALUE) {
                return z11;
            }
            z10 = false;
            for (d1 d1Var : (d1[]) this.b) {
                long d9 = d1Var.d();
                boolean z12 = d9 != Long.MIN_VALUE && d9 <= j10;
                if (d9 == d || z12) {
                    z10 |= d1Var.n(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        r6 r6Var = (r6) this.b;
        o6 o6Var = r6Var.H;
        AndroidUtilities.cancelRunOnUIThread(o6Var);
        k61 k61Var = r6Var.y;
        if (k61Var == null || !k61Var.z()) {
            return;
        }
        AndroidUtilities.runOnUIThread(o6Var);
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((r6) this.b).i();
    }

    @Override // l.i
    public boolean r(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // f2.o0
    public void t(int i9, int i10) {
        ((r0) this.b).p(i9, i10);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // j4.d1
    public long v() {
        long j10 = Long.MAX_VALUE;
        for (d1 d1Var : (d1[]) this.b) {
            long v = d1Var.v();
            if (v != Long.MIN_VALUE) {
                j10 = Math.min(j10, v);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // org.telegram.ui.Components.t90
    public void y(int i9, int i10, CharSequence charSequence, boolean z10) {
        kh.g gVar = ((kh.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i9, i10 + i9, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i9 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // j4.d1
    public void z(long j10) {
        for (d1 d1Var : (d1[]) this.b) {
            d1Var.z(j10);
        }
    }

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
    }

    public c(j9.c cVar) {
        this.a = 24;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public c(j3.e eVar) {
        this.a = 18;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.a).setFlags(eVar.b).setUsage(eVar.c);
        int i9 = d5.f0.a;
        if (i9 >= 29) {
            j3.c.a(usage, eVar.d);
        }
        if (i9 >= 32) {
            j3.d.a(usage, eVar.e);
        }
        this.b = usage.build();
    }

    public c(Context context) {
        boolean isEmpty;
        this.a = 8;
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
                D();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override // e5.p
    public void s() {
    }

    public c(int i9) {
        this.a = i9;
        switch (i9) {
            case 12:
                break;
            case 15:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    @Override // org.telegram.ui.Components.t90
    public /* synthetic */ void A(String str) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 0;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        android.support.v4.media.session.d0.a(bundle);
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(k61 k61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.t90
    public /* synthetic */ void a(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9) {
    }

    @Override // org.telegram.ui.Components.t90
    public /* synthetic */ void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
