package gf;

import a8.r9;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;
import fi.v9;
import gb.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import jg.x1;
import jg.y1;
import l.d0;
import l.w;
import li.b2;
import li.f2;
import li.g1;
import li.i0;
import li.m3;
import li.s4;
import li.t3;
import li.x;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ab;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.gu;
import org.telegram.messenger.h0;
import org.telegram.messenger.hu;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.kv;
import org.telegram.messenger.l0;
import org.telegram.messenger.o0;
import org.telegram.messenger.ta;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.c61;
import org.telegram.ui.jw;
import org.telegram.ui.tz;
import org.telegram.ui.zz;
import w7.s;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class g implements i6.a, zz, y1, com.google.android.gms.common.api.internal.p, jm0, t4, i0, w, m.l, ce.c, o0.a, ta, ab, ue.a, mm0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g(int i7) {
        this.a = i7;
    }

    @Override // l.w
    public boolean A(l.k kVar) {
        m.i iVar = (m.i) this.b;
        if (kVar == iVar.c) {
            return false;
        }
        ((d0) kVar).A.getClass();
        iVar.getClass();
        w wVar = iVar.e;
        if (wVar != null) {
            return wVar.A(kVar);
        }
        return false;
    }

    @Override // ce.c
    public Object B(ce.d dVar, kd.c cVar) {
        Object B = ((q4.q) this.b).B(new a1(dVar, 1), cVar);
        return B == jd.a.a ? B : gd.k.a;
    }

    public float C(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.b;
        float z9 = z(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.a;
            if (i13 >= i15) {
                float f12 = ((i15 - 1) - i7) / (i13 - i7);
                int i16 = i15 - 1;
                f10 = f12;
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f13 = i10;
        int i17 = (int) (f13 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f13 / (i10 - i17);
        } else {
            int i18 = bVar.b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (z(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + z9) - 1.0f;
    }

    @Override // o0.a
    public Cursor C0(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // org.telegram.ui.Components.mm0
    public void D() {
        int i7 = this.a;
    }

    public void E() {
        h6.h hVar = (h6.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((h6.g) it2.next()).a();
        }
    }

    @Override // ue.a
    public void H0() {
        hu huVar = (hu) this.b;
        hu.j0(huVar, null);
        huVar.a0 = null;
    }

    @Override // li.i0
    public void I0(CharSequence charSequence) {
        m3 m3Var = ((s4) this.b).N;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.w4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        ((b2) this.b).x0(i7, i10, z9);
    }

    @Override // li.i0
    public void L1() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.a;
            t3.S1(m3Var.a);
        }
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        kv kvVar;
        l1 l1Var;
        hu huVar = (hu) this.b;
        gu guVar = huVar.a0;
        if (guVar == null || (l1Var = (kvVar = huVar.a).F) == null) {
            return;
        }
        l1Var.b1(kvVar.E, guVar.c);
    }

    @Override // li.i0
    public h9 S0() {
        return (s4) this.b;
    }

    @Override // ue.a
    public boolean U0(float f10, float f11) {
        hu huVar = (hu) this.b;
        gu i02 = hu.i0(huVar, f10, f11);
        if (i02 == null || i02.b) {
            i02 = null;
        }
        huVar.a0 = i02;
        return i02 != null;
    }

    @Override // li.i0
    public li.a V0() {
        return ((s4) this.b).a;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.jm0
    public void a(float f10) {
        x xVar = (x) this.b;
        ij ijVar = xVar.P;
        if (ijVar == null) {
            return;
        }
        ijVar.b0 = f10;
        MediaController.B().i0(xVar.P, f10);
    }

    @Override // li.i0
    public boolean a1() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.N;
        if (m3Var == null) {
            return false;
        }
        li.a aVar = s4Var.a;
        return m3Var.a.V4();
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        l7.b bVar = (l7.b) this.b;
        l7.a aVar = new l7.a((TaskCompletionSource) obj2);
        l7.i iVar = (l7.i) ((l7.c) obj).n();
        String str = bVar.l;
        Parcel l1 = iVar.l1();
        int i7 = l7.f.a;
        l1.writeStrongBinder(aVar);
        l1.writeString(str);
        iVar.m1(l1, 2);
    }

    @Override // li.i0, li.f1
    public void b(g1 g1Var) {
        m3 m3Var = ((s4) this.b).N;
        if (m3Var != null) {
            t3 t3Var = m3Var.a;
            t3.Q1(t3Var, g1Var);
            t3Var.o3.r(g1Var, true);
        }
    }

    @Override // l.w
    public void c(l.k kVar, boolean z9) {
        if (kVar instanceof d0) {
            ((d0) kVar).z.k().c(false);
        }
        w wVar = ((m.i) this.b).e;
        if (wVar != null) {
            wVar.c(kVar, z9);
        }
    }

    @Override // ue.a
    public boolean c1(View view, float f10, float f11) {
        hu huVar = (hu) this.b;
        if (huVar.a0 == null) {
            return false;
        }
        gu i02 = hu.i0(huVar, f10, f11);
        gu guVar = huVar.a0;
        if (i02 != guVar) {
            return false;
        }
        kv kvVar = huVar.a;
        l1 l1Var = kvVar.F;
        if (l1Var == null) {
            return true;
        }
        l1Var.v1(kvVar.E, guVar.c);
        return true;
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public void d(float f10) {
        ij ijVar = ((x) this.b).P;
        if (ijVar == null) {
            return;
        }
        ijVar.b0 = f10;
    }

    @Override // li.i0
    public void d1(int i7, int i10) {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.a;
            f2 f2Var = m3Var.a.Q3;
            if (f2Var != null) {
                f2Var.f(i7, i10);
            }
        }
    }

    @Override // org.telegram.ui.zz
    public boolean f(tz tzVar) {
        return false;
    }

    @Override // org.telegram.ui.zz
    public void g(ij ijVar) {
        ii.d0 d0Var = (ii.d0) this.b;
        d0Var.q1.presentFragment(gm0.M(d0Var.a, ijVar));
        d0Var.dismiss();
    }

    @Override // org.telegram.ui.Components.mm0
    public CharSequence getContentDescription() {
        w10 w10Var;
        switch (this.a) {
            case 26:
                return " ";
            case 27:
                t7 t7Var = (t7) this.b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(t7Var.s)) {
                        sb2.append(t7Var.s);
                    }
                    s7 s7Var = t7Var.r;
                    if (s7Var != null && (w10Var = s7Var.e) != null) {
                        CharSequence charSequence = (CharSequence) w10Var.d(0, Integer.valueOf(t7Var.f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) t7Var.r.e.d(-1, Integer.valueOf(t7Var.r.b()));
                        CharSequence charSequence3 = (CharSequence) t7Var.r.e.d(1, Integer.valueOf(t7Var.r.a()));
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
                    a8.g(th2, true);
                    return t7Var.s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                b8 b8Var = (b8) this.b;
                sb3.append(id.G(b8Var.t2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(id.G(b8Var.t2 % 60, "Seconds", new Object[0]));
                return id.a0("AccDescrPlayerDuration", null, 2131754806, sb3.toString(), id.G(b8Var.u2 / 60, "Minutes", new Object[0]) + ' ' + id.G(b8Var.u2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // org.telegram.ui.zz
    public boolean i() {
        return false;
    }

    @Override // li.i0
    public void i1() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            li.a aVar = s4Var.a;
            t3 t3Var = m3Var.a;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.o3.onContentChanged();
        }
    }

    public float j(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.a;
        int i10 = (int) cVar.b;
        int i11 = (int) cVar2.a;
        int i12 = (int) cVar2.b;
        float C = C(i7, i10, i11, i12);
        float C2 = C((int) cVar2.a, i12, (int) cVar.a, i10);
        return Float.isNaN(C) ? C2 / 7.0f : Float.isNaN(C2) ? C / 7.0f : (C + C2) / 14.0f;
    }

    @Override // ue.a
    public /* synthetic */ boolean j0() {
        return true;
    }

    public hc.a k(float f10, float f11, int i7, int i10) {
        hc.a b10;
        hc.a b11;
        int i11 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i11);
        cc.b bVar = (cc.b) this.b;
        int min = Math.min(bVar.a - 1, i7 + i11) - max;
        float f12 = 3.0f * f10;
        if (min < f12) {
            throw bc.e.a();
        }
        int max2 = Math.max(0, i10 - i11);
        int min2 = Math.min(bVar.b - 1, i10 + i11) - max2;
        if (min2 < f12) {
            throw bc.e.a();
        }
        cc.b bVar2 = (cc.b) this.b;
        hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
        int i12 = bVar3.e;
        int i13 = bVar3.c;
        int i14 = i12 + i13;
        int i15 = bVar3.f;
        int i16 = (i15 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (i19 < i14 && !bVar2.b(i19, i18)) {
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar2.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i18, i19, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i18, i14, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw bc.e.a();
        }
        return (hc.a) arrayList.get(0);
    }

    @Override // jg.y1
    public boolean k1(int i7) {
        switch (this.a) {
            case 7:
                return i7 == ((zl0) this.b).d0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
        int round;
        switch (this.a) {
            case 26:
                c61 c61Var = (c61) ((org.telegram.ui.Cells.i0) this.b);
                int i7 = (int) (l6.q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                l6.q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = c61Var.f.e;
                    yi0 yi0Var = (yi0) themeActivity.b.K(themeActivity.f0);
                    if (yi0Var != null) {
                        ((z8) yi0Var.a).setText(id.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (l6.q * 100.0f))));
                    }
                    l6.F(true);
                    break;
                }
                break;
            case 27:
                t7 t7Var = (t7) this.b;
                s7 s7Var = t7Var.r;
                if (s7Var != null && t7Var.n != null) {
                    if (s7Var.c != null) {
                        double length = f10 * (r3.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), t7Var.r.c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), t7Var.r.c.length - 1, 0);
                        int[] iArr = t7Var.r.c;
                        round = Math.round(g0.W1(Math.round(((float) (length - Math.floor(length))) * t7Var.r.d) / t7Var.r.d, iArr[j3], iArr[j10]));
                    } else {
                        round = Math.round(((t7Var.r.a() - t7Var.r.b()) * f10) + s7Var.b());
                    }
                    int i11 = t7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = t7Var.f;
                    if (i12 != round) {
                        if (t7Var.c(i12) != t7Var.c(round)) {
                            g0.c4(t7Var.e);
                        }
                        t7Var.f = round;
                        t7Var.e(round, true);
                        c20 c20Var = t7Var.n;
                        if (c20Var != null) {
                            c20Var.a(Integer.valueOf(t7Var.f));
                            break;
                        }
                    }
                }
                break;
            default:
                if (z9) {
                    MediaController.B().i0(MediaController.B().u0, f10);
                }
                ij ijVar = MediaController.B().u0;
                if (ijVar != null && ijVar.I3()) {
                    ((b8) this.b).b1(ijVar, false);
                    break;
                }
                break;
        }
    }

    @Override // jg.y1
    public void m1(ArrayList arrayList) {
        switch (this.a) {
            case 7:
                zl0 zl0Var = (zl0) this.b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    zl0Var.J.add(((x1) arrayList.get(i7)).a);
                }
                jw jwVar = zl0Var.U;
                if (jwVar != null) {
                    jwVar.d(zl0Var.D0 > 0, false);
                }
                zl0Var.f();
                break;
        }
    }

    public boolean n() {
        return ((h0) this.b).c;
    }

    public StringBuilder o() {
        mf.a aVar = (mf.a) this.b;
        if (!(aVar instanceof q)) {
            return null;
        }
        StringBuilder sb2 = ((q) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // ue.a
    public boolean o1() {
        return true;
    }

    @Override // i6.a
    public void p(Bitmap bitmap) {
        ((i6.h) this.b).e(3, bitmap);
    }

    @Override // jg.y1
    public void q(int i7) {
        switch (this.a) {
            case 7:
                zl0 zl0Var = (zl0) this.b;
                zl0Var.D0--;
                zl0Var.e0 = i7;
                if (zl0Var.f0 != i7) {
                    zl0Var.s.clear();
                }
                if (zl0Var.g0 != i7) {
                    zl0Var.I.clear();
                }
                zl0Var.N = true;
                jw jwVar = zl0Var.U;
                if (jwVar != null) {
                    jwVar.d(zl0Var.D0 > 0, true);
                }
                zl0Var.f();
                jw jwVar2 = zl0Var.U;
                if (jwVar2 != null) {
                    jwVar2.c();
                    break;
                }
                break;
            default:
                g0.h3(new v9(this, 24));
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public int q0() {
        switch (this.a) {
            case 26:
                return 0;
            case 27:
                s7 s7Var = ((t7) this.b).r;
                if (s7Var == null) {
                    return 0;
                }
                if (s7Var.c == null) {
                    return s7Var.a() - s7Var.b();
                }
                return s7Var.d * (r1.length - 1);
            default:
                return 0;
        }
    }

    @Override // ue.a
    public void s(float f10, float f11) {
        hu huVar = (hu) this.b;
        gu i02 = hu.i0(huVar, f10, f11);
        gu guVar = huVar.a0;
        if (i02 != guVar) {
            guVar = null;
        }
        hu.j0(huVar, guVar);
    }

    @Override // li.i0
    public void t() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.N;
        if (m3Var != null) {
            t3.T1(m3Var.a, s4Var.a);
        }
    }

    @Override // ue.a
    public void t0() {
        hu huVar = (hu) this.b;
        hu.j0(huVar, huVar.a0);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // li.i0
    public i9 w0() {
        m3 m3Var = ((s4) this.b).N;
        if (m3Var != null) {
            return m3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    public ia.b y(JSONObject jSONObject) {
        ia.d bVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            bVar = new nb.a(11);
        } else {
            bVar = new pb.b(11);
        }
        return bVar.c((s) this.b, jSONObject);
    }

    public float z(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        g gVar;
        int i19;
        int i20 = 1;
        boolean z9 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z9) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i21 = 2;
        int i22 = (-abs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i21;
                break;
            }
            int i29 = z9 ? i27 : i26;
            int i30 = z9 ? i26 : i27;
            boolean z10 = z9;
            if (i28 == i20) {
                i18 = i20;
                i19 = abs;
                gVar = this;
            } else {
                i18 = 0;
                gVar = this;
                i19 = abs;
            }
            if (i18 == ((cc.b) gVar.b).b(i29, i30)) {
                if (i28 == 2) {
                    return r9.b(i26, i27, i13, i14);
                }
                i28++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i17 = 2;
                    break;
                }
                i27 += i24;
                i22 -= i19;
            }
            i26 += i23;
            abs = i19;
            z9 = z10;
            i20 = 1;
            i21 = 2;
        }
        if (i28 == i17) {
            return r9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    public /* synthetic */ g(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public g() {
        this.a = 9;
        this.b = new HashMap();
    }

    public g(String str, long j3) {
        this.a = 21;
        this.b = new l0(str, j3);
    }

    public g(String str, Set set) {
        this.a = 22;
        this.b = new o0(str, set);
    }

    public g(Context context, Uri uri) {
        this.a = 19;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g(String str, boolean z9) {
        this.a = 20;
        this.b = new h0(str, z9);
    }

    private final void r() {
    }

    private final /* synthetic */ void u() {
    }

    private final void v() {
    }

    @Override // org.telegram.ui.zz
    public void e() {
    }

    private final /* synthetic */ void x(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.zz
    public void h(ij ijVar, View view, int i7) {
    }

    @Override // ue.a
    public /* synthetic */ void l1(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void m(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void w(View view, float f10, float f11) {
    }
}
