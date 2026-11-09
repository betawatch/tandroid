package h9;

import a8.f7;
import a8.pa;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.r3;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.j4;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import li.c5;
import li.e5;
import li.m2;
import li.n3;
import li.t3;
import li.z2;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.lc;
import org.telegram.messenger.m6;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.messenger.ru;
import org.telegram.messenger.va;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t4;
import org.telegram.ui.dg0;
import org.telegram.ui.ee;
import org.telegram.ui.hr0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f1 implements g9.k, com.google.android.gms.common.api.internal.p, jg.y1, m.f2, li.i0, t4, li.f1, l.i, n2.v, o0.a, b3.j, va, lc, j51, org.telegram.ui.Cells.l1, te.d, e90 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f1(int i7, boolean z9) {
        this.a = i7;
    }

    @Override // te.d
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean B(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        z9 z9Var = (z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.i3(fVar, 5000L);
        }
    }

    @Override // li.f1
    public /* synthetic */ boolean E(li.g1 g1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, ij ijVar) {
        return false;
    }

    @Override // li.f1
    public void F(li.g1 g1Var) {
        li.a aVar;
        e5 e5Var = (e5) this.b;
        c5 c5Var = e5Var.s;
        if (c5Var == null || (aVar = e5Var.a) == null) {
            return;
        }
        t3 t3Var = ((z2) c5Var).a;
        ArrayList arrayList = t3Var.s3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i7 = -1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((li.a) arrayList.get(i10)).k.contains(Long.valueOf(j3))) {
                i7 = i10;
            }
        }
        if (i7 < 0) {
            return;
        }
        li.f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        li.a aVar2 = new li.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a8.p0.z(1, arrayList3);
        }
        arrayList.add(i7 + 1, aVar2);
        t3Var.v4();
        t3Var.f3.O(false);
        li.f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3Var.post(new m2(t3Var, aVar2, 26));
    }

    @Override // l.i
    public boolean F0(l.k kVar, MenuItem menuItem) {
        switch (this.a) {
            case 12:
                m.l lVar = ((ActionMenuView) this.b).P;
                if (lVar != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((gf.g) lVar).b).W.c).iterator();
                    while (it.hasNext()) {
                        if (((androidx.fragment.app.a0) it.next()).a.p()) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ((Toolbar) this.b).getClass();
                break;
        }
        return false;
    }

    @Override // n2.v
    public void H0() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            sVar = ffmpegAudioRenderer.H;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // n2.v
    public void I() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // li.i0
    public void I0(CharSequence charSequence) {
        n3 n3Var = ((li.x) this.b).O;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            n3Var.a.w4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        li.b2 b2Var = (li.b2) this.b;
        b2Var.x0(i7, i10, z9);
        dg0 dg0Var = b2Var.O0;
        if (dg0Var != null) {
            dg0Var.h();
            b2Var.O0 = null;
        }
    }

    @Override // li.i0
    public void L1() {
        li.x xVar = (li.x) this.b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.a;
            t3.S1(n3Var.a);
        }
    }

    @Override // b3.j
    public void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.b;
        if (i7 == 0) {
            long j11 = rVar.a;
            uVar = new x2.u(rVar.b, j3);
        } else {
            long j12 = rVar.a;
            j2.m mVar = rVar.b;
            j2.c0 c0Var = rVar.d;
            uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        }
        hVar.q.t(uVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    public long M1(TimeUnit timeUnit) {
        return timeUnit.convert(((org.telegram.messenger.l0) this.b).c, TimeUnit.SECONDS);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hr0 N1() {
        return null;
    }

    @Override // org.telegram.messenger.lc
    public void O(ImageReceiver imageReceiver) {
        ((ru) this.b).t0(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override // n2.v
    public void O1(long j3, int i7, long j10) {
        j2.n nVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new b3.b(nVar, i7, j3, j10, 1));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Components.e90
    public Paint.FontMetricsInt R0() {
        return ((di) this.b).y2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Cells.l1
    public void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
        z9 z9Var = (z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.y = 0;
            q1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // li.i0
    public h9 S0() {
        return (li.x) this.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    public m1.e1 T1() {
        ce.w wVar = (ce.w) this.b;
        wVar.getClass();
        Object obj = ce.w.e.get(wVar);
        if (obj == de.g.a) {
            obj = null;
        }
        return (m1.e1) obj;
    }

    @Override // n2.v
    public void U0(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        j2.n nVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new n2.p(nVar, exc, 1));
        }
    }

    @Override // li.i0
    public li.a V0() {
        return ((li.x) this.b).a;
    }

    public JSONObject V1() {
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
                        jSONObject = new JSONObject(aa.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        aa.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    aa.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    public void X1() {
        f1 f1Var = (f1) this.b;
        f1Var.getClass();
        try {
            l8.b bVar = (l8.b) f1Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // n2.v
    public void Y(n2.r0 r0Var) {
        j2.n nVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 1));
        }
    }

    @Override // te.d
    public void Y0() {
        ((b9) this.b).a.invalidate();
    }

    public void Y1() {
        ((v2) this.b).o0 = false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    public void Z1() {
        f1 f1Var = (f1) this.b;
        f1Var.getClass();
        try {
            l8.b bVar = (l8.b) f1Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // li.i0
    public boolean a1() {
        li.x xVar = (li.x) this.b;
        n3 n3Var = xVar.O;
        if (n3Var == null) {
            return false;
        }
        li.a aVar = xVar.a;
        return n3Var.a.V4();
    }

    public void a2(ee eeVar) {
        ((v2) this.b).H0 = eeVar;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                j6.q qVar = new j6.q(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.s) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, qVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 6);
                break;
            case 3:
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                a6.e eVar = (a6.e) this.b;
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, eVar);
                iVar2.m1(l1, 1);
                break;
            case 4:
                j7.g gVar = (j7.g) this.b;
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                k7.d dVar = (k7.d) ((k7.e) obj).n();
                com.google.android.gms.common.api.g gVar2 = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar2.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = t7.a.a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, gVar);
                t7.a.b(obtain, gVar2);
                ((k7.b) dVar).h1(obtain, 6);
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        h1 h1Var = (h1) this.b;
        h1Var.getClass();
        entry.getClass();
        return new e1(entry, h1Var);
    }

    @Override // li.i0, li.f1
    public void b(li.g1 g1Var) {
        switch (this.a) {
            case 9:
                n3 n3Var = ((li.x) this.b).O;
                if (n3Var != null) {
                    t3 t3Var = n3Var.a;
                    t3.Q1(t3Var, g1Var);
                    t3Var.o3.r(g1Var, true);
                    break;
                }
                break;
            default:
                c5 c5Var = ((e5) this.b).s;
                if (c5Var != null) {
                    t3 t3Var2 = ((z2) c5Var).a;
                    t3.Q1(t3Var2, g1Var);
                    t3Var2.o3.r(g1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // n2.v
    public void c(int i7) {
        j2.n nVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new bg.m0(nVar, i7, 15));
        }
    }

    @Override // m.f2
    public void c0(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // n2.v
    public void c1() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                f4.e((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean d() {
        return ((z9) this.b).a();
    }

    @Override // li.i0
    public void d1(int i7, int i10) {
        li.x xVar = (li.x) this.b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.a;
            li.f2 f2Var = n3Var.a.Q3;
            if (f2Var != null) {
                f2Var.f(i7, i10);
            }
        }
    }

    public void d2() {
        f1 f1Var = (f1) this.b;
        f1Var.getClass();
        try {
            l8.b bVar = (l8.b) f1Var.b;
            Parcel p12 = bVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(0);
            bVar.t1(p12, 1);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // n2.v
    public void e(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.g0 = true;
        j2.n nVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new r3(nVar, j3, 15));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // n2.v
    public void f(boolean z9) {
        j2.n nVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new bi.k1(12, nVar, z9));
        }
    }

    @Override // li.f1
    public void f1(Editable editable) {
        ((e5) this.b).g();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        z9 z9Var = (z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.y = 2;
            q1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // m.f2
    public void h1(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i7)).b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        handler.postAtTime(new pa(this, i10 < arrayList.size() ? (l.d) arrayList.get(i10) : null, mVar, kVar, false, 3), kVar, SystemClock.uptimeMillis() + 200);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.a > r3.a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h2(m1.e1 newState) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.j.e(newState, "newState");
        ce.w wVar = (ce.w) this.b;
        do {
            wVar.getClass();
            Object obj3 = ce.w.e.get(wVar);
            obj = de.g.a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            m1.e1 e1Var = (m1.e1) obj2;
            if (!(e1Var instanceof m1.w0 ? true : kotlin.jvm.internal.j.a(e1Var, m1.f1.b))) {
                if (!(e1Var instanceof m1.c)) {
                    if (!(e1Var instanceof m1.l0)) {
                        throw new androidx.car.app.j();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (e1Var != null) {
                    obj = e1Var;
                }
            }
            e1Var = newState;
            if (obj2 == null) {
            }
            if (e1Var != null) {
            }
        } while (!wVar.c(obj2, obj));
    }

    @Override // n2.v
    public void i(n2.r0 r0Var) {
        j2.n nVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 0));
        }
    }

    @Override // li.i0
    public void i1() {
        li.x xVar = (li.x) this.b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.a;
            t3 t3Var = n3Var.a;
            li.f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.o3.onContentChanged();
        }
    }

    @Override // org.telegram.ui.Components.j51
    public void invalidate() {
        ((org.telegram.ui.Cells.q1) ((org.telegram.ui.Cells.j1) this.b).b).invalidate();
    }

    @Override // l.i
    public void j0(l.k kVar) {
        switch (this.a) {
            case 12:
                f1 f1Var = ((ActionMenuView) this.b).K;
                if (f1Var != null) {
                    f1Var.j0(kVar);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.b;
                m.i iVar = toolbar.a.J;
                if (iVar == null || !iVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.a0) it.next()).a.t();
                    }
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        return d();
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 k2() {
        return null;
    }

    @Override // li.f1
    public void l0(li.g1 g1Var, int i7, int i10) {
        c5 c5Var;
        i9 textSelectionHelper;
        e5 e5Var = (e5) this.b;
        if (e5Var.x || i7 == i10 || (c5Var = e5Var.s) == null || (textSelectionHelper = ((z2) c5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        g1Var.post(new j4(this, g1Var, i10, textSelectionHelper, i7, 3));
    }

    @Override // li.f1
    public /* synthetic */ boolean l1(boolean z9) {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // jg.y1
    public void m1(ArrayList arrayList) {
        jg.i1 i1Var = (jg.i1) this.b;
        String str = i1Var.Z;
        if (str != null) {
            i1Var.U(str, i1Var.c0, i1Var.d0, i1Var.b0, i1Var.a0);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(r5 r5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // b3.j
    public b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.b;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        j2.c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        int i10 = rVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        b3.i iVar = min == -9223372036854775807L ? b3.o.f : new b3.i(0, min, false);
        hVar.q.r(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override // b3.j
    public void o1(b3.l lVar, long j3, long j10) {
        long j11;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.b;
        long j12 = rVar.a;
        j2.m mVar = rVar.b;
        j2.c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        hVar.m.getClass();
        hVar.q.p(uVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) rVar.f;
        p2.c cVar2 = hVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.m.size()) {
                h2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.M;
                j11 = -9223372036854775807L;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    hVar.L = 0;
                } else {
                    h2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.m.X0(rVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            } else {
                hVar.C = new androidx.datastore.preferences.protobuf.l();
                return;
            }
        }
        j11 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j3 - j10;
        hVar.J = j3;
        hVar.N += i7;
        synchronized (hVar.t) {
            try {
                if (rVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = f7.a(rVar.d.c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (!cVar3.d || hVar.K != j11) {
            hVar.z(true);
            return;
        }
        m6 m6Var = cVar3.i;
        if (m6Var == null) {
            hVar.w();
            return;
        }
        String str = m6Var.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = h2.m0.V(m6Var.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (e2.t0 e10) {
                hVar.y(e10);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(m6Var, new o2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(m6Var, new qb.a(16));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return i7 == ((z9) this.b).y;
    }

    @Override // jg.y1
    public void q(int i7) {
        ((jg.i1) this.b).f();
    }

    @Override // b3.j
    public void q0(b3.l lVar, long j3, long j10, boolean z9) {
        ((o2.h) this.b).x((b3.r) lVar, j3, j10);
    }

    @Override // li.f1
    public /* synthetic */ boolean s(li.g1 g1Var) {
        return false;
    }

    @Override // li.i0
    public void t() {
        li.x xVar = (li.x) this.b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            t3.T1(n3Var.a, xVar.a);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // li.i0
    public i9 w0() {
        n3 n3Var = ((li.x) this.b).O;
        if (n3Var != null) {
            return n3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String y(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.e90
    public void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        di diVar = (di) this.b;
        if (diVar.a1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(diVar.a1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z9) {
                i6.l(spannableStringBuilder, diVar.a1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            diVar.a1().setText(spannableStringBuilder);
            diVar.a1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public /* synthetic */ f1(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public /* synthetic */ f1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public f1(int i7) {
        this.a = i7;
        switch (i7) {
            case 19:
                this.b = new org.telegram.messenger.i0();
                break;
            case 20:
                this.b = new org.telegram.messenger.m0();
                break;
            default:
                this.b = new ce.w(m1.f1.b);
                break;
        }
    }

    public f1(ga.d dVar) {
        this.a = 1;
        this.b = new File((File) dVar.d, "com.crashlytics.settings.json");
    }

    public f1(Context context, Uri uri) {
        this.a = 17;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public f1(String str, long j3) {
        this.a = 21;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = new org.telegram.messenger.l0(str, j3);
    }

    public f1(Context context, g6 g6Var) {
        this.a = 25;
        v2 v2Var = new v2(1, context, g6Var, false);
        this.b = v2Var;
        v2Var.N();
    }

    @Override // te.d
    public /* synthetic */ void D() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1() {
    }

    @Override // n2.v
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // li.f1
    public /* synthetic */ void r0() {
    }

    @Override // n2.v
    public /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.e90
    public /* synthetic */ void G1(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // li.f1
    public /* synthetic */ void T0(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // te.d
    public /* synthetic */ void l(boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // li.f1
    public /* synthetic */ void w(int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Components.e90
    public /* synthetic */ void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override // org.telegram.ui.Components.e90
    public /* synthetic */ void e1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }
}
