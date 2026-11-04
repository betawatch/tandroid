package gi;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import b8.cg;
import b8.zb;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cv;
import org.telegram.messenger.o10;
import org.telegram.messenger.u10;
import org.telegram.messenger.yt;
import org.telegram.messenger.zi;
import org.telegram.messenger.zt;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.om0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ew;
import org.telegram.ui.r51;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v5 implements k51, za, h6.a, com.google.android.gms.common.api.internal.p, b4.m, kg.u1, m.e2, zd.b, l.w, m.k, m2.x, mi.j0, org.telegram.ui.Components.r4, mi.g1, o0.b, p5.b, org.telegram.messenger.ma, org.telegram.messenger.ta, re.a, om0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ v5(int i3) {
        this.a = i3;
    }

    @Override // b4.m
    public /* synthetic */ b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    @Override // mi.g1
    public void B1(Editable editable) {
        ((mi.f5) this.b).g();
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
        int i3 = this.a;
    }

    @Override // l.w
    public boolean E(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.e;
        if (wVar != null) {
            return wVar.E(kVar);
        }
        return false;
    }

    @Override // b4.m
    public void F(byte[] bArr, int i3, int i10, b4.l lVar, g2.k kVar) {
        f2.b a10;
        g2.y yVar = (g2.y) this.b;
        yVar.L(i3 + i10, bArr);
        yVar.N(i3);
        ArrayList arrayList = new ArrayList();
        while (yVar.a() > 0) {
            zb.e("Incomplete Mp4Webvtt Top Level box header found.", yVar.a() >= 8);
            int m10 = yVar.m();
            if (yVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                f2.a aVar = null;
                while (i11 > 0) {
                    zb.e("Incomplete vtt cue box header found.", i11 >= 8);
                    int m11 = yVar.m();
                    int m12 = yVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = yVar.a;
                    int i13 = yVar.b;
                    String str = g2.n0.a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    yVar.O(i12);
                    i11 = (i11 - 8) - i12;
                    if (m12 == 1937011815) {
                        k4.g gVar = new k4.g();
                        k4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = k4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = k4.h.a;
                    k4.g gVar2 = new k4.g();
                    gVar2.c = charSequence;
                    a10 = gVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                yVar.O(m10 - 8);
            }
        }
        kVar.accept(new b4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // mi.j0
    public void F1() {
        mi.x xVar = (mi.x) this.b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.a;
            mi.t3 t3Var = n3Var.a;
            mi.g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
    }

    @Override // m2.x
    public void G() {
        z2.n nVar;
        m2.v0 v0Var = (m2.v0) this.b;
        synchronized (v0Var.a) {
            nVar = v0Var.I;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // re.a
    public void H0() {
        zt ztVar = (zt) this.b;
        zt.j0(ztVar, null);
        ztVar.b0 = null;
    }

    @Override // m2.x
    public void J(m2.t0 t0Var) {
        m2.t tVar = ((m2.v0) this.b).b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 1));
        }
    }

    @Override // kg.u1
    public boolean J1(int i3) {
        return i3 == ((bm0) this.b).e0;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        mi.c2 c2Var = (mi.c2) this.b;
        c2Var.x0(i3, i10, z10);
        vf0 vf0Var = c2Var.P0;
        if (vf0Var != null) {
            vf0Var.h();
            c2Var.P0 = null;
        }
    }

    @Override // mi.g1
    public /* synthetic */ boolean M0(mi.h1 h1Var) {
        return false;
    }

    @Override // m2.x
    public void N(Exception exc) {
        g2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        m2.t tVar = ((m2.v0) this.b).b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new m2.p(tVar, exc, 1));
        }
    }

    @Override // re.a
    public void O(float f10, float f11) {
        cv cvVar;
        org.telegram.ui.Cells.l1 l1Var;
        zt ztVar = (zt) this.b;
        yt ytVar = ztVar.b0;
        if (ytVar == null || (l1Var = (cvVar = ztVar.a).F) == null) {
            return;
        }
        l1Var.d1(cvVar.E, ytVar.c);
    }

    @Override // mi.j0
    public org.telegram.ui.Cells.h9 O0() {
        mi.n3 n3Var = ((mi.x) this.b).P;
        if (n3Var != null) {
            return n3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // m2.x
    public void Q() {
        ((m2.v0) this.b).k1 = true;
    }

    @Override // m.e2
    public void S(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i3)).b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i10 = i3 + 1;
        handler.postAtTime(new cg(this, i10 < arrayList.size() ? (l.d) arrayList.get(i10) : null, mVar, kVar, false, 2), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // o0.b
    public Cursor T0(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // zd.b
    public Object U(zd.c cVar, hd.c cVar2) {
        Object U = ((w9.b) this.b).U(new db.z0(cVar, 1), cVar2);
        return U == gd.a.a ? U : dd.k.a;
    }

    @Override // re.a
    public boolean U0(float f10, float f11) {
        zt ztVar = (zt) this.b;
        yt i02 = zt.i0(ztVar, f10, f11);
        if (i02 == null || i02.b) {
            i02 = null;
        }
        ztVar.b0 = i02;
        return i02 != null;
    }

    @Override // mi.g1
    public void V0(mi.h1 h1Var) {
        mi.a aVar;
        mi.f5 f5Var = (mi.f5) this.b;
        mi.d5 d5Var = f5Var.s;
        if (d5Var == null || (aVar = f5Var.a) == null) {
            return;
        }
        mi.t3 t3Var = ((mi.a3) d5Var).a;
        ArrayList arrayList = t3Var.t3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i3 = -1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((mi.a) arrayList.get(i10)).k.contains(Long.valueOf(j10))) {
                i3 = i10;
            }
        }
        if (i3 < 0) {
            return;
        }
        mi.g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        mi.a aVar2 = new mi.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.y(1, arrayList3);
        }
        arrayList.add(i3 + 1, aVar2);
        t3Var.v4();
        t3Var.g3.O(false);
        mi.g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.post(new mi.n2(t3Var, aVar2, 26));
    }

    @Override // mi.j0
    public void W0(CharSequence charSequence) {
        mi.n3 n3Var = ((mi.x) this.b).P;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            n3Var.a.w4(charSequence.toString());
        }
    }

    @Override // mi.g1
    public /* synthetic */ boolean X1(boolean z10) {
        return false;
    }

    @Override // b4.m
    public int Y() {
        return 2;
    }

    @Override // m2.x
    public void Z() {
        k2.l0 l0Var = ((m2.v0) this.b).Z;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override // re.a
    public boolean Z0(View view, float f10, float f11) {
        zt ztVar = (zt) this.b;
        if (ztVar.b0 == null) {
            return false;
        }
        yt i02 = zt.i0(ztVar, f10, f11);
        yt ytVar = ztVar.b0;
        if (i02 != ytVar) {
            return false;
        }
        cv cvVar = ztVar.a;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        if (l1Var == null) {
            return true;
        }
        l1Var.x1(cvVar.E, ytVar.c);
        return true;
    }

    @Override // m2.x
    public void a(int i3) {
        t2.j jVar;
        m2.v0 v0Var = (m2.v0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.d1) != null) {
            jVar.d(i3);
        }
        m2.t tVar = v0Var.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new cg.l0(tVar, i3, 14));
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        i7.f fVar = (i7.f) this.b;
        j7.f fVar2 = new j7.f(0, (TaskCompletionSource) obj2);
        j7.d dVar = (j7.d) ((j7.e) obj).m();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
        gVar.c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i3 = s7.a.a;
        obtain.writeStrongBinder(fVar2);
        s7.a.b(obtain, fVar);
        s7.a.b(obtain, gVar);
        ((j7.b) dVar).H0(obtain, 6);
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        l.w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override // kg.u1
    public void b2(ArrayList arrayList) {
        bm0 bm0Var = (bm0) this.b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            bm0Var.K.add(((kg.t1) arrayList.get(i3)).a);
        }
        ew ewVar = bm0Var.V;
        if (ewVar != null) {
            ewVar.d(bm0Var.E0 > 0, false);
        }
        bm0Var.f();
    }

    @Override // mi.g1
    public /* synthetic */ boolean c0(mi.h1 h1Var) {
        return false;
    }

    @Override // mi.j0
    public void c2() {
        mi.x xVar = (mi.x) this.b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.a;
            mi.t3.S1(n3Var.a);
        }
    }

    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // m.e2
    public void d(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // m2.x
    public void e(boolean z10) {
        m2.t tVar = ((m2.v0) this.b).b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new ci.e1(12, tVar, z10));
        }
    }

    @Override // m2.x
    public void e0(long j10, int i3, long j11) {
        m2.t tVar = ((m2.v0) this.b).b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new a3.b(tVar, i3, j10, j11, 1));
        }
    }

    @Override // mi.j0
    public org.telegram.ui.Cells.g9 e1() {
        return (mi.x) this.b;
    }

    @Override // mi.j0, mi.g1
    public void f(mi.h1 h1Var) {
        switch (this.a) {
            case 15:
                mi.n3 n3Var = ((mi.x) this.b).P;
                if (n3Var != null) {
                    mi.t3 t3Var = n3Var.a;
                    mi.t3.Q1(t3Var, h1Var);
                    t3Var.p3.E(h1Var, true);
                    break;
                }
                break;
            default:
                mi.d5 d5Var = ((mi.f5) this.b).s;
                if (d5Var != null) {
                    mi.t3 t3Var2 = ((mi.a3) d5Var).a;
                    mi.t3.Q1(t3Var2, h1Var);
                    t3Var2.p3.E(h1Var, true);
                    break;
                }
                break;
        }
    }

    public boolean f0() {
        return ((org.telegram.messenger.h0) this.b).c;
    }

    @Override // m2.x
    public void g(long j10) {
        m2.v0 v0Var = (m2.v0) this.b;
        v0Var.n1 = true;
        m2.t tVar = v0Var.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new ci.e3(tVar, j10, 13));
        }
    }

    @Override // re.a
    public /* synthetic */ boolean g0() {
        return true;
    }

    @Override // cd.a
    public Object get() {
        return new k4.j((Context) ((c9.o) this.b).a, new kb.a(27), new v7.s(26));
    }

    @Override // org.telegram.ui.Components.om0
    public CharSequence getContentDescription() {
        o10 o10Var;
        switch (this.a) {
            case 26:
                return " ";
            case 27:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(s7Var.s)) {
                        sb2.append(s7Var.s);
                    }
                    org.telegram.ui.Cells.r7 r7Var = s7Var.r;
                    if (r7Var != null && (o10Var = r7Var.e) != null) {
                        CharSequence charSequence = (CharSequence) o10Var.d(0, Integer.valueOf(s7Var.f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) s7Var.r.e.d(-1, Integer.valueOf(s7Var.r.b()));
                        CharSequence charSequence3 = (CharSequence) s7Var.r.e.d(1, Integer.valueOf(s7Var.r.a()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence2);
                            sb2.append(" – ");
                            sb2.append(charSequence3);
                        }
                    }
                    if (sb2.length() > 0) {
                        return sb2.toString();
                    }
                    return null;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return s7Var.s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) this.b;
                sb3.append(bd.G(z7Var.u2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(bd.G(z7Var.u2 % 60, "Seconds", new Object[0]));
                return bd.a0("AccDescrPlayerDuration", null, 2131754806, sb3.toString(), bd.G(z7Var.v2 / 60, "Minutes", new Object[0]) + ' ' + bd.G(z7Var.v2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override // re.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // mi.j0
    public mi.a j1() {
        return ((mi.x) this.b).a;
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        int round;
        switch (this.a) {
            case 26:
                r51 r51Var = (r51) ((org.telegram.ui.Cells.i0) this.b);
                int i3 = (int) (org.telegram.ui.ActionBar.k6.q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                org.telegram.ui.ActionBar.k6.q = f10;
                if (i3 != i10) {
                    ThemeActivity themeActivity = r51Var.f.e;
                    bj0 bj0Var = (bj0) themeActivity.b.K(themeActivity.g0);
                    if (bj0Var != null) {
                        ((org.telegram.ui.Cells.y8) bj0Var.a).setText(bd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.q * 100.0f))));
                    }
                    org.telegram.ui.ActionBar.k6.F(true);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.b;
                org.telegram.ui.Cells.r7 r7Var = s7Var.r;
                if (r7Var != null && s7Var.n != null) {
                    if (r7Var.c != null) {
                        double length = f10 * (r3.length - 1);
                        int j10 = Utilities.j((int) Math.floor(length), s7Var.r.c.length - 1, 0);
                        int j11 = Utilities.j((int) Math.ceil(length), s7Var.r.c.length - 1, 0);
                        int[] iArr = s7Var.r.c;
                        round = Math.round(org.telegram.messenger.g0.W1(Math.round(((float) (length - Math.floor(length))) * s7Var.r.d) / s7Var.r.d, iArr[j10], iArr[j11]));
                    } else {
                        round = Math.round(((s7Var.r.a() - s7Var.r.b()) * f10) + r7Var.b());
                    }
                    int i11 = s7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = s7Var.f;
                    if (i12 != round) {
                        if (s7Var.c(i12) != s7Var.c(round)) {
                            org.telegram.messenger.g0.c4(s7Var.e);
                        }
                        s7Var.f = round;
                        s7Var.e(round, true);
                        u10 u10Var = s7Var.n;
                        if (u10Var != null) {
                            u10Var.a(Integer.valueOf(s7Var.f));
                            break;
                        }
                    }
                }
                break;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().v0, f10);
                }
                zi ziVar = MediaController.B().v0;
                if (ziVar != null && ziVar.J3()) {
                    ((org.telegram.ui.Components.z7) this.b).b1(ziVar, false);
                    break;
                }
                break;
        }
    }

    public ha.b k0(JSONObject jSONObject) {
        ha.d sVar;
        int i3 = jSONObject.getInt("settings_version");
        if (i3 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i3 + ". Using default settings values.", null);
            sVar = new ra.e(9);
        } else {
            sVar = new v7.s(9);
        }
        return sVar.l((nb.a) this.b, jSONObject);
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // mi.g1
    public void l(mi.h1 h1Var, int i3, int i10) {
        mi.d5 d5Var;
        org.telegram.ui.Cells.h9 textSelectionHelper;
        mi.f5 f5Var = (mi.f5) this.b;
        if (f5Var.x || i3 == i10 || (d5Var = f5Var.s) == null || (textSelectionHelper = ((mi.a3) d5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 3));
    }

    @Override // mi.j0
    public boolean l1() {
        mi.x xVar = (mi.x) this.b;
        mi.n3 n3Var = xVar.P;
        if (n3Var == null) {
            return false;
        }
        mi.a aVar = xVar.a;
        return n3Var.a.V4();
    }

    @Override // mi.g1
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        y5 y5Var = (y5) this.b;
        u5 u5Var = y5Var.M;
        org.telegram.messenger.g0.r(u5Var);
        m51 m51Var = y5Var.E;
        if (m51Var == null || !m51Var.d0()) {
            return;
        }
        org.telegram.messenger.g0.h3(u5Var);
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((y5) this.b).i();
    }

    @Override // m2.x
    public void p() {
        ((m2.v0) this.b).m1 = true;
    }

    @Override // m2.x
    public void q() {
        k2.l0 l0Var = ((m2.v0) this.b).Z;
        if (l0Var != null) {
            l0Var.a.j0 = true;
        }
    }

    @Override // org.telegram.ui.Components.om0
    public int q0() {
        switch (this.a) {
            case 26:
                return 0;
            case 27:
                org.telegram.ui.Cells.r7 r7Var = ((org.telegram.ui.Cells.s7) this.b).r;
                if (r7Var == null) {
                    return 0;
                }
                if (r7Var.c == null) {
                    return r7Var.a() - r7Var.b();
                }
                return r7Var.d * (r1.length - 1);
            default:
                return 0;
        }
    }

    @Override // mi.j0
    public void q1(int i3, int i10) {
        mi.x xVar = (mi.x) this.b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.a aVar = xVar.a;
            mi.g2 g2Var = n3Var.a.R3;
            if (g2Var != null) {
                g2Var.f(i3, i10);
            }
        }
    }

    @Override // kg.u1
    public void r(int i3) {
        bm0 bm0Var = (bm0) this.b;
        bm0Var.E0--;
        bm0Var.f0 = i3;
        if (bm0Var.g0 != i3) {
            bm0Var.s.clear();
        }
        if (bm0Var.h0 != i3) {
            bm0Var.J.clear();
        }
        bm0Var.O = true;
        ew ewVar = bm0Var.V;
        if (ewVar != null) {
            ewVar.d(bm0Var.E0 > 0, true);
        }
        bm0Var.f();
        ew ewVar2 = bm0Var.V;
        if (ewVar2 != null) {
            ewVar2.c();
        }
    }

    @Override // re.a
    public boolean s1() {
        return true;
    }

    @Override // re.a
    public void t(float f10, float f11) {
        zt ztVar = (zt) this.b;
        yt i02 = zt.i0(ztVar, f10, f11);
        yt ytVar = ztVar.b0;
        if (i02 != ytVar) {
            ytVar = null;
        }
        zt.j0(ztVar, ytVar);
    }

    @Override // mi.j0
    public void u() {
        mi.x xVar = (mi.x) this.b;
        mi.n3 n3Var = xVar.P;
        if (n3Var != null) {
            mi.t3.T1(n3Var.a, xVar.a);
        }
    }

    @Override // re.a
    public void u0() {
        zt ztVar = (zt) this.b;
        zt.j0(ztVar, ztVar.b0);
    }

    @Override // m2.x
    public void v(m2.t0 t0Var) {
        m2.t tVar = ((m2.v0) this.b).b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 0));
        }
    }

    @Override // gi.za
    public void w(boolean z10, float f10) {
        ((q4) this.b).a(Boolean.FALSE, Float.valueOf(f10));
    }

    @Override // h6.a
    public void z(Bitmap bitmap) {
        ((h6.h) this.b).e(bitmap, 3);
    }

    public /* synthetic */ v5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
    }

    public v5(z6.a aVar) {
        this.a = 10;
        p6.m.g(aVar);
        this.b = aVar;
    }

    public v5() {
        this.a = 6;
        this.b = new g2.y();
    }

    public v5(String str, long j10) {
        this.a = 21;
        this.b = new org.telegram.messenger.l0(str, j10);
    }

    public v5(String str, Set set) {
        this.a = 22;
        this.b = new org.telegram.messenger.o0(str, set);
    }

    public v5(Context context, Uri uri) {
        this.a = 18;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public v5(String str, boolean z10) {
        this.a = 20;
        this.b = new org.telegram.messenger.h0(str, z10);
    }

    @Override // gi.za
    public /* synthetic */ void C(boolean z10) {
    }

    @Override // gi.za
    public /* synthetic */ void I(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void K(long j10) {
    }

    @Override // gi.za
    public /* synthetic */ void M(boolean z10) {
    }

    @Override // gi.za
    public /* synthetic */ void R(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void T(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void W(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void a0(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void c(int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void d0(long j10) {
    }

    @Override // mi.g1
    public /* synthetic */ void g1(CharSequence charSequence) {
    }

    @Override // gi.za
    public /* synthetic */ void i(float f10) {
    }

    @Override // gi.za
    public /* synthetic */ void j(float f10) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // gi.za
    public /* synthetic */ void y(float f10) {
    }

    private final void h0() {
    }

    private final /* synthetic */ void i0() {
    }

    private final void j0() {
    }

    @Override // gi.za
    public /* synthetic */ void X() {
    }

    @Override // b4.m
    public /* synthetic */ void reset() {
    }

    @Override // gi.za
    public /* synthetic */ void s() {
    }

    @Override // mi.g1
    public /* synthetic */ void w0() {
    }

    @Override // mi.g1
    public /* synthetic */ void A(int i3, int i10) {
    }

    @Override // gi.za
    public /* synthetic */ void H(float f10, int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void P(float f10, int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void V(float f10, int i3) {
    }

    @Override // gi.za
    public /* synthetic */ void b0(int i3, long j10) {
    }

    @Override // gi.za
    public /* synthetic */ void n(long j10, boolean z10) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override // re.a
    public /* synthetic */ void o(View view, float f10, float f11) {
    }

    @Override // re.a
    public /* synthetic */ void o1(View view, float f10, float f11) {
    }

    @Override // re.a
    public /* synthetic */ void x(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
