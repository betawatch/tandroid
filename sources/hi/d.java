package hi;

import a0.h;
import a3.k;
import a3.m;
import a3.t;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.j;
import androidx.datastore.preferences.protobuf.l;
import androidx.fragment.app.b0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.g4;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.v0;
import g2.n0;
import gi.v5;
import i2.c0;
import i2.n;
import i2.v;
import i6.r;
import i6.s;
import ii.j4;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ji.h0;
import ji.i0;
import ji.q;
import k2.p1;
import kg.e1;
import kg.u1;
import l.i;
import l1.x0;
import mi.b3;
import mi.b6;
import mi.c2;
import mi.g1;
import mi.g2;
import mi.h1;
import mi.h3;
import mi.i4;
import mi.j0;
import mi.l4;
import mi.n4;
import mi.n5;
import mi.o3;
import mi.p3;
import mi.q3;
import mi.r3;
import mi.s3;
import mi.t3;
import mi.y0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.g0;
import org.telegram.messenger.g10;
import org.telegram.messenger.hs;
import org.telegram.messenger.ju;
import org.telegram.messenger.l0;
import org.telegram.messenger.m0;
import org.telegram.messenger.o2;
import org.telegram.messenger.oa;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dt0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zh;
import org.telegram.ui.ce;
import org.telegram.ui.k00;
import org.telegram.ui.vf0;
import org.telegram.ui.vq0;
import org.telegram.ui.wm;
import w2.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d implements dt0, p, h0, u1, zh, i, r4, j0, r3, g1, k, o0.b, oa, ec, c51, l1, qe.d {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i3, boolean z10) {
        this.a = i3;
    }

    @Override // mi.g1
    public void A(int i3, int i10) {
        g2 g2Var;
        n5 n5Var = (n5) this.b;
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null || (g2Var = b3Var.a.R3) == null) {
            return;
        }
        g2Var.f(i3, i10);
    }

    @Override // mi.g1
    public void B1(Editable editable) {
        n5 n5Var = (n5) this.b;
        mi.a aVar = n5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = n5Var.r.l2;
        }
        n5Var.w();
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // kg.u1
    public /* synthetic */ h C0() {
        return null;
    }

    @Override // org.telegram.messenger.ec
    public void D(ImageReceiver imageReceiver) {
        ((ju) this.b).t0(true);
    }

    @Override // mi.r3
    public f60 D1(View view) {
        return f60.H((c2) this.b, view);
    }

    @Override // org.telegram.ui.Cells.l1
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.dt0
    public void F(boolean z10) {
        g gVar = (g) this.b;
        qe.a aVar = gVar.Z;
        if (aVar != null) {
            aVar.a(z10, true);
        }
        k00 k00Var = gVar.s;
        if (k00Var != null) {
            k00Var.invalidate();
        }
    }

    @Override // mi.j0
    public void F1() {
        switch (this.a) {
            case 13:
                y0 y0Var = (y0) this.b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.a;
                    t3 t3Var = o3Var.a;
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.g();
                    }
                    t3Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                n4 n4Var = (n4) this.b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.a;
                    t3 t3Var2 = ((p3) l4Var).a;
                    g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.g();
                    }
                    t3Var2.p3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override // ji.h0
    public void H0() {
        q qVar = (q) this.b;
        qe.a aVar = qVar.a;
        i0 i0Var = qVar.w;
        aVar.a(i0Var.n && i0Var.l == 0, true);
        qVar.d.g3.O(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        z9 z9Var = (z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.y = 2;
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        ((mi.p) this.b).L(z10, i3, i10, 0L, false);
        mi.p pVar = (mi.p) this.b;
        vf0 vf0Var = pVar.P;
        if (vf0Var != null) {
            vf0Var.h();
            pVar.P = null;
        }
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean L1() {
        return false;
    }

    @Override // a3.k
    public void M(m mVar, long j10, long j11, int i3) {
        u uVar;
        t tVar = (t) mVar;
        n2.h hVar = (n2.h) this.b;
        if (i3 == 0) {
            long j12 = tVar.a;
            uVar = new u(tVar.b, j10);
        } else {
            long j13 = tVar.a;
            n nVar = tVar.b;
            c0 c0Var = tVar.d;
            uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        hVar.q.u(uVar, tVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
    }

    @Override // mi.g1
    public /* synthetic */ boolean M0(h1 h1Var) {
        return false;
    }

    @Override // mi.r3
    public void O(int i3) {
        ((c2) this.b).t0(74, i3);
    }

    @Override // mi.j0
    public h9 O0() {
        switch (this.a) {
            case 13:
                o3 o3Var = ((y0) this.b).T;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.a.getTextSelectionHelper();
            default:
                l4 l4Var = ((n4) this.b).H;
                if (l4Var != null) {
                    return ((p3) l4Var).a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // mi.r3
    public void O1() {
        c2 c2Var = (c2) this.b;
        c2Var.E0();
        c2Var.H0();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
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

    @Override // mi.r3
    public void T1(q3 q3Var, View view) {
        c2 c2Var = (c2) this.b;
        f60 H = f60.H(c2Var, view);
        H.Q = true;
        c2Var.y0 = i4.c(H, c2Var, c2Var.getParentActivity(), c2Var.getResourceProvider(), q3Var, false);
    }

    @Override // l.i
    public boolean U0(l.k kVar, MenuItem menuItem) {
        switch (this.a) {
            case 9:
                m.k kVar2 = ((ActionMenuView) this.b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((v5) kVar2).b).a0.d).iterator();
                    while (it.hasNext()) {
                        if (((b0) it.next()).a.p()) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(long j10) {
        return false;
    }

    @Override // mi.r3
    public void W(s3 s3Var, View view) {
        c2 c2Var = (c2) this.b;
        f60 H = f60.H(c2Var, view);
        H.Q = true;
        c2Var.getParentActivity();
        c2Var.getResourceProvider();
        c2Var.y0 = i4.b(H, c2Var, s3Var, false);
    }

    @Override // mi.j0
    public void W0(CharSequence charSequence) {
        switch (this.a) {
            case 13:
                o3 o3Var = ((y0) this.b).T;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                l4 l4Var = ((n4) this.b).H;
                if (l4Var != null) {
                    p3 p3Var = (p3) l4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
        z9 z9Var = (z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.y = 0;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override // mi.g1
    public /* synthetic */ boolean X1(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public void Y(ng ngVar) {
        int i3;
        i3 = ((d2) ((lg.m) this.b)).currentAccount;
        hs.f(i3).d(ngVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        return null;
    }

    @Override // mi.r3
    public void Z0(b6 b6Var, String str) {
        c2 c2Var = (c2) this.b;
        if (c2Var.A0 == null) {
            c2Var.A0 = new fa.f(new l5.b(this, 8), c2Var.getResourceProvider());
        }
        c2Var.A0.k(b6Var, str);
    }

    @Override // mi.r3
    public void a0() {
        c2 c2Var = (c2) this.b;
        h3 h3Var = c2Var.Q.v3;
        c2Var.C0((h3Var != null && h3Var.x() && c2Var.Q.F4()) ? 1 : 0, true);
        c2Var.D0();
        c2Var.B0();
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                i6.q qVar = new i6.q(0, (TaskCompletionSource) obj2);
                i6.i iVar = (i6.i) ((s) obj).m();
                String[] strArr = (String[]) this.b;
                Parcel P0 = iVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, qVar);
                P0.writeStringArray(strArr);
                iVar.U0(P0, 5);
                break;
            case 2:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                j7.f fVar = new j7.f(1, (TaskCompletionSource) obj2);
                j7.d dVar = (j7.d) ((j7.e) obj).m();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i3 = s7.a.a;
                obtain.writeStrongBinder(fVar);
                s7.a.b(obtain, getCredentialRequest);
                s7.a.b(obtain, gVar);
                ((j7.b) dVar).H0(obtain, 1);
                break;
            default:
                k7.b bVar = (k7.b) this.b;
                k7.a aVar = new k7.a((TaskCompletionSource) obj2);
                k7.i iVar2 = (k7.i) ((k7.c) obj).m();
                String str = bVar.l;
                Parcel L0 = iVar2.L0();
                int i10 = k7.f.a;
                L0.writeStrongBinder(aVar);
                L0.writeString(str);
                iVar2.M0(L0, 2);
                break;
        }
    }

    @Override // l.i
    public void b(l.k kVar) {
        switch (this.a) {
            case 9:
                d dVar = ((ActionMenuView) this.b).L;
                if (dVar != null) {
                    dVar.b(kVar);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.b;
                m.h hVar = toolbar.a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.a0.d).iterator();
                    while (it.hasNext()) {
                        ((b0) it.next()).a.t();
                    }
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var) {
        return false;
    }

    @Override // mi.r3
    public void b1(mi.a aVar) {
        c2 c2Var = (c2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && g0.J1(c2Var)) {
            bi biVar = new bi(c2Var.getParentActivity(), c2Var, false, false, false, c2Var.getResourceProvider());
            biVar.U3 = new mb.b(15);
            biVar.H1 = true;
            biVar.s3.setVisibility(8);
            biVar.r4 = new aa.a(c2Var, aVar, biVar, 12);
            biVar.e1();
            biVar.show();
        }
    }

    @Override // kg.u1
    public void b2(ArrayList arrayList) {
        e1 e1Var = (e1) this.b;
        String str = e1Var.a0;
        if (str != null) {
            e1Var.U(str, e1Var.d0, e1Var.e0, e1Var.c0, e1Var.b0);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return ((z9) this.b).a();
    }

    @Override // mi.g1
    public /* synthetic */ boolean c0(h1 h1Var) {
        return false;
    }

    @Override // mi.j0
    public void c2() {
        switch (this.a) {
            case 13:
                y0 y0Var = (y0) this.b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.a;
                    t3.S1(o3Var.a);
                    break;
                }
                break;
            default:
                n4 n4Var = (n4) this.b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.a;
                    t3.S1(((p3) l4Var).a);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ji.h0, o0.b
    public void close() {
        switch (this.a) {
            case 3:
                ((q) this.b).finishFragment();
                break;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
                if (contentProviderClient != 0) {
                    if (!(contentProviderClient instanceof AutoCloseable)) {
                        if (!(contentProviderClient instanceof ExecutorService)) {
                            contentProviderClient.release();
                            break;
                        } else {
                            g4.e((ExecutorService) contentProviderClient);
                            break;
                        }
                    } else {
                        contentProviderClient.close();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    public String d2(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            oa.d dVar = (oa.d) this.b;
            oa.e eVar = new oa.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // mi.r3
    public boolean e(float f10) {
        boolean z10;
        c2 c2Var = (c2) this.b;
        FrameLayout frameLayout = c2Var.w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z10 = true;
                c2.e0(c2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        c2.e0(c2Var, z10, true);
        return z10;
    }

    @Override // mi.j0
    public g9 e1() {
        switch (this.a) {
            case 13:
                return (y0) this.b;
            default:
                return (n4) this.b;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // mi.j0, mi.g1
    public void f(h1 h1Var) {
        switch (this.a) {
            case 13:
                o3 o3Var = ((y0) this.b).T;
                if (o3Var != null) {
                    t3 t3Var = o3Var.a;
                    t3.Q1(t3Var, h1Var);
                    t3Var.p3.E(h1Var, true);
                    break;
                }
                break;
            case 14:
            default:
                b3 b3Var = ((n5) this.b).F;
                if (b3Var != null) {
                    t3 t3Var2 = b3Var.a;
                    t3.Q1(t3Var2, h1Var);
                    t3Var2.p3.E(h1Var, true);
                    break;
                }
                break;
            case 15:
                l4 l4Var = ((n4) this.b).H;
                if (l4Var != null) {
                    t3 t3Var3 = ((p3) l4Var).a;
                    t3.Q1(t3Var3, h1Var);
                    t3Var3.p3.E(h1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void f1(q1 q1Var, int i3) {
        z9 z9Var = (z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.y = 2;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // mi.g1
    public void g1(CharSequence charSequence) {
        b3 b3Var = ((n5) this.b).F;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    public long g2(TimeUnit timeUnit) {
        return timeUnit.convert(((l0) this.b).c, TimeUnit.SECONDS);
    }

    @Override // a3.k
    public void h(m mVar, long j10, long j11) {
        long j12;
        t tVar = (t) mVar;
        n2.h hVar = (n2.h) this.b;
        long j13 = tVar.a;
        n nVar = tVar.b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        hVar.m.getClass();
        hVar.q.q(uVar, tVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        o2.c cVar = (o2.c) tVar.f;
        o2.c cVar2 = hVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j14 = cVar.b(0).b;
        int i3 = 0;
        while (i3 < size && hVar.G.b(i3).b < j14) {
            i3++;
        }
        if (cVar.d) {
            if (size - i3 > cVar.m.size()) {
                g2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = hVar.M;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || cVar.h * 1000 > j15) {
                    hVar.L = 0;
                } else {
                    g2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.m.F4(tVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            } else {
                hVar.C = new l();
                return;
            }
        }
        j12 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j10 - j11;
        hVar.J = j10;
        hVar.N += i3;
        synchronized (hVar.t) {
            try {
                if (tVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = a.a.a(tVar.d.c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o2.c cVar3 = hVar.G;
        if (!cVar3.d || hVar.K != j12) {
            hVar.z(true);
            return;
        }
        e5.a aVar = cVar3.i;
        if (aVar == null) {
            hVar.w();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = n0.V(aVar.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (v0 e10) {
                hVar.y(e10);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(aVar, new n2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(aVar, new ra.e(15));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // org.telegram.ui.Components.dt0
    public float h1() {
        return p1.d(9.66f, pi.a.d(((g) this.b).c0), 0);
    }

    @Override // ji.h0
    public void i0(long j10) {
        ((q) this.b).presentFragment(wm.ra(j10));
    }

    @Override // org.telegram.ui.Components.c51
    public void invalidate() {
        ((q1) ((j1) this.b).b).invalidate();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(q1 q1Var) {
        return 0;
    }

    @Override // mi.j0
    public mi.a j1() {
        switch (this.a) {
            case 13:
                return ((y0) this.b).a;
            default:
                return ((n4) this.b).a;
        }
    }

    public l1.f1 j2() {
        zd.u uVar = (zd.u) this.b;
        uVar.getClass();
        Object obj = zd.u.e.get(uVar);
        if (obj == ae.i.a) {
            obj = null;
        }
        return (l1.f1) obj;
    }

    @Override // a3.k
    public a3.i k(m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        t tVar = (t) mVar;
        n2.h hVar = (n2.h) this.b;
        long j12 = tVar.a;
        n nVar = tVar.b;
        c0 c0Var = tVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        int i10 = tVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        a3.i iVar = min == -9223372036854775807L ? a3.q.f : new a3.i(0, min, false);
        hVar.q.s(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override // kg.u1
    public /* synthetic */ h k1() {
        return null;
    }

    public void k2() {
        v5 v5Var = (v5) this.b;
        v5Var.getClass();
        try {
            k8.b bVar = (k8.b) v5Var.b;
            Parcel P0 = bVar.P0();
            int i3 = u7.b.a;
            P0.writeInt(0);
            bVar.T0(P0, 2);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // mi.g1
    public void l(h1 h1Var, int i3, int i10) {
        b3 b3Var;
        h9 textSelectionHelper;
        n5 n5Var = (n5) this.b;
        if (n5Var.H || i3 == i10 || (b3Var = n5Var.F) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == n5Var) {
            return;
        }
        n5Var.post(new j4(this, h1Var, i10, textSelectionHelper, i3, 4));
    }

    @Override // mi.j0
    public boolean l1() {
        switch (this.a) {
            case 13:
                y0 y0Var = (y0) this.b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.a;
                    if (o3Var.a.V4()) {
                    }
                }
                break;
            default:
                n4 n4Var = (n4) this.b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.a;
                    if (((p3) l4Var).a.V4()) {
                    }
                }
                break;
        }
        return false;
    }

    public void l2() {
        ((t2) this.b).p0 = false;
    }

    @Override // mi.g1
    public boolean m() {
        n5 n5Var = (n5) this.b;
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return c();
    }

    @Override // org.telegram.ui.Components.dt0
    public int m1() {
        return ((g) this.b).d0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    public void n2() {
        v5 v5Var = (v5) this.b;
        v5Var.getClass();
        try {
            k8.b bVar = (k8.b) v5Var.b;
            Parcel P0 = bVar.P0();
            int i3 = u7.b.a;
            P0.writeInt(0);
            bVar.T0(P0, 3);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        return false;
    }

    @Override // mi.r3
    public void onContentChanged() {
        c2 c2Var = (c2) this.b;
        if (c2Var.z0 != null) {
            boolean p32 = c2Var.Q.p3();
            c2Var.M0 = p32;
            c2Var.z0.f(p32);
            c2Var.z0.invalidate();
        }
        c2Var.H0();
        Runnable runnable = c2Var.N0;
        g0.r(runnable);
        g0.i3(runnable, 1000L);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p1(q1 q1Var, int i3) {
        return i3 == ((z9) this.b).y;
    }

    @Override // a3.k
    public void q0(m mVar, long j10, long j11, boolean z10) {
        ((n2.h) this.b).x((t) mVar, j10, j11);
    }

    @Override // mi.j0
    public void q1(int i3, int i10) {
        switch (this.a) {
            case 13:
                y0 y0Var = (y0) this.b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    mi.a aVar = y0Var.a;
                    g2 g2Var = o3Var.a.R3;
                    if (g2Var != null) {
                        g2Var.f(i3, i10);
                        break;
                    }
                }
                break;
            default:
                n4 n4Var = (n4) this.b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    mi.a aVar2 = n4Var.a;
                    g2 g2Var2 = ((p3) l4Var).a.R3;
                    if (g2Var2 != null) {
                        g2Var2.f(i3, i10);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ i9 q2() {
        return null;
    }

    @Override // kg.u1
    public void r(int i3) {
        ((e1) this.b).f();
    }

    public void r2(ce ceVar) {
        ((t2) this.b).I0 = ceVar;
    }

    @Override // qe.d
    public void s1() {
        ((z8) this.b).a.invalidate();
    }

    public void s2() {
        v5 v5Var = (v5) this.b;
        v5Var.getClass();
        try {
            k8.b bVar = (k8.b) v5Var.b;
            Parcel P0 = bVar.P0();
            int i3 = u7.b.a;
            P0.writeInt(0);
            bVar.T0(P0, 1);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // qe.d
    public /* synthetic */ boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.a > r3.a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t2(l1.f1 newState) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.j.e(newState, "newState");
        zd.u uVar = (zd.u) this.b;
        do {
            uVar.getClass();
            Object obj3 = zd.u.e.get(uVar);
            obj = ae.i.a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            l1.f1 f1Var = (l1.f1) obj2;
            if (!(f1Var instanceof x0 ? true : kotlin.jvm.internal.j.a(f1Var, l1.g1.b))) {
                if (!(f1Var instanceof l1.c)) {
                    if (!(f1Var instanceof l1.l0)) {
                        throw new j();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (f1Var != null) {
                    obj = f1Var;
                }
            }
            f1Var = newState;
            if (obj2 == null) {
            }
            if (f1Var != null) {
            }
        } while (!uVar.c(obj2, obj));
    }

    @Override // mi.j0
    public void u() {
        switch (this.a) {
            case 13:
                y0 y0Var = (y0) this.b;
                o3 o3Var = y0Var.T;
                if (o3Var != null) {
                    t3.T1(o3Var.a, y0Var.a);
                    break;
                }
                break;
            default:
                n4 n4Var = (n4) this.b;
                l4 l4Var = n4Var.H;
                if (l4Var != null) {
                    t3.T1(((p3) l4Var).a, n4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // mi.r3
    public void u0() {
        c2 c2Var = (c2) this.b;
        c2Var.J0 = c2Var.L0;
        c2.e0(c2Var, false, false);
        c2Var.C0(2, true);
    }

    @Override // mi.r3
    public void v1() {
        c2 c2Var = (c2) this.b;
        c2.e0(c2Var, false, true);
        int i3 = c2Var.J0;
        c2Var.C0(i3 != 2 ? i3 : 0, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // qe.d
    public /* synthetic */ boolean x(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(zi ziVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    public /* synthetic */ d(r rVar, String[] strArr) {
        this.a = 1;
        this.b = strArr;
    }

    public /* synthetic */ d(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public d(int i3) {
        this.a = i3;
        switch (i3) {
            case 20:
                this.b = new org.telegram.messenger.i0();
                break;
            case 21:
                this.b = new m0();
                break;
            default:
                this.b = new zd.u(l1.g1.b);
                break;
        }
    }

    public d(Context context, Uri uri) {
        this.a = 18;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d(String str, long j10) {
        this.a = 22;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = new l0(str, j10);
    }

    public d(Context context, e6 e6Var) {
        this.a = 26;
        t2 t2Var = new t2(1, context, e6Var, false);
        this.b = t2Var;
        t2Var.N();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(wi wiVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // mi.g1
    public /* synthetic */ void V0(h1 h1Var) {
    }

    @Override // mi.r3
    public void Y0(int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // qe.d
    public /* synthetic */ void o(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // qe.d
    public /* synthetic */ void G() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
    }

    @Override // mi.r3
    public void R0() {
    }

    @Override // qe.d
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void v0() {
    }

    @Override // mi.g1
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // mi.r3
    public void E(h1 h1Var, boolean z10) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(q1 q1Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Components.zh
    public /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.zh
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
