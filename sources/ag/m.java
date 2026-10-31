package ag;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.a4;
import bi.c6;
import bi.d4;
import bi.i6;
import bi.s4;
import bi.w6;
import bi.z5;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.f8;
import org.telegram.messenger.m20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ob0;
import org.telegram.ui.rm0;
import org.telegram.ui.tb0;
import org.telegram.ui.yb0;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements m20, org.telegram.ui.ActionBar.u1, tb0, bi.q0, kt, s4, OnFailureListener, di.p, r9.d, e2.p, e2.o, m4.o0, e2.j, m4.h1, rm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        String str = (String) this.b;
        r9.a aVar = (r9.a) this.c;
        try {
            Trace.beginSection(str);
            return aVar.f.K(dVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // bi.q0
    public z60 a(bi.n1 n1Var) {
        n4.q qVar = (n4.q) this.b;
        p6 p6Var = (p6) this.c;
        bi.t tVar = (bi.t) qVar.b;
        z60 z60Var = new z60(tVar, p6Var, n1Var, false, false, true);
        tVar.H = z60Var;
        return z60Var;
    }

    @Override // e2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 20:
                m4.j1 j1Var = (m4.j1) this.b;
                b2.u1 u1Var = (b2.u1) this.c;
                m4.n1 n1Var = (m4.n1) obj;
                j1Var.getClass();
                e9.q0 q0Var = u1Var.H;
                if (!q0Var.isEmpty()) {
                    b2.t1 c10 = u1Var.a().c();
                    e9.m2 it = q0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.q1 q1Var = (b2.q1) it.next();
                        b2.p1 p1Var = (b2.p1) j1Var.d.n.get(q1Var.a.b);
                        if (p1Var == null || q1Var.a.a != p1Var.a) {
                            c10.a(q1Var);
                        } else {
                            c10.a(new b2.q1(p1Var, q1Var.b));
                        }
                    }
                    u1Var = c10.b();
                }
                n1Var.p(u1Var);
                break;
            case 21:
                m4.j1 j1Var2 = (m4.j1) this.b;
                m4.w wVar = (m4.w) this.c;
                m4.f0 f0Var = (m4.f0) j1Var2.a.get();
                if (f0Var != null && !f0Var.j()) {
                    f0Var.g(wVar, false);
                    break;
                }
                break;
            default:
                m4.j1 j1Var3 = (m4.j1) this.b;
                Surface surface = (Surface) this.c;
                m4.n1 n1Var2 = (m4.n1) obj;
                ((m4.f0) j1Var3.a.get()).getClass();
                if (surface != null) {
                    m4.i1 i1Var = new m4.i1(surface);
                    j1Var3.i = i1Var;
                    n1Var2.R(i1Var);
                    break;
                } else {
                    n1Var2.R(null);
                    j1Var3.i = null;
                    break;
                }
        }
    }

    @Override // m4.o0
    public void b(m4.w wVar) {
        switch (this.a) {
            case 18:
                ((m4.e) this.c).f(((m4.p0) this.b).h.t);
                break;
            default:
                m4.p0 p0Var = (m4.p0) this.b;
                n4.h hVar = (n4.h) this.c;
                p0Var.getClass();
                String str = hVar.a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    m4.n1 n1Var = p0Var.h.t;
                    if (n1Var.n0(17)) {
                        b2.o1 y02 = n1Var.y0();
                        b2.n1 n1Var2 = new b2.n1();
                        for (int i10 = 0; i10 < y02.o(); i10++) {
                            if (TextUtils.equals(y02.m(i10, n1Var2, 0L).c.a, str)) {
                                n1Var.P(i10);
                                break;
                            }
                        }
                        break;
                    } else {
                        e2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }

    @Override // e2.p
    public void c(Object obj, b2.v vVar) {
        j2.b bVar = (j2.b) obj;
        bVar.r((b2.f1) this.c, new hf.b(vVar, ((j2.g) this.b).e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.c = true;
        r1.setText(r2.y);
        r1 = r2.e;
        r1.setSelection(r1.getText().length());
        r2.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.c0();
        r2.a.f3.O(true);
        r2.Y(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.D != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.R : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.D = true;
        r1 = r3.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.tb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        f2 f2Var = (f2) this.b;
        yb0 yb0Var = (yb0) this.c;
        f2Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(f2Var.y)) {
            ob0 ob0Var = yb0Var.R;
        }
    }

    @Override // org.telegram.ui.rm0
    public void e(int i10) {
        switch (this.a) {
            case 27:
                mg.o0 o0Var = (mg.o0) this.b;
                mg.o0 o0Var2 = (mg.o0) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        o0Var2.a(null);
                        break;
                    }
                } else {
                    o0Var.a(null);
                    break;
                }
                break;
            default:
                q20 q20Var = (q20) this.b;
                q20 q20Var2 = (q20) this.c;
                if (i10 != 1) {
                    if (i10 != 3) {
                        q20Var2.a(null);
                        break;
                    }
                } else {
                    q20Var.a(null);
                    break;
                }
                break;
        }
    }

    @Override // m4.h1
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
            case 23:
                return f0Var.j() ? p8.b(new m4.t1(-100)) : e2.l0.g0((j9.y) ((m4.h1) this.b).f(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, (m4.v0) this.c, 7));
            default:
                return f0Var.j() ? p8.b(new m4.t1(-100)) : e2.l0.g0((j9.y) ((m4.h1) this.b).f(f0Var, wVar, i10), new androidx.car.app.utils.a(f0Var, wVar, (m4.g1) this.c, 8));
        }
    }

    @Override // di.p
    public void g(n4.q qVar) {
        switch (this.a) {
            case 9:
                org.telegram.messenger.i0.g3(new a3.l0((SpannableString) this.b, qVar, (org.telegram.ui.h0) this.c, 18));
                break;
            default:
                org.telegram.messenger.i0.g3(new a3.l0((SpannableString) this.b, qVar, (i6) this.c, 19));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                s0.d(r6.currentAccount).a((i0) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            case 16:
                kg.q0 q0Var = (kg.q0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                q0Var.dismiss();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = vp.h1((TLRPC.Chat) arrayList.get(i11));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(q0Var.a).sendRequest(tL_channels_updateUsername, new kg.z(q0Var, 1), 64);
                }
                break;
            case 25:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                mg.p1 p1Var = (mg.p1) this.c;
                atomicBoolean.set(true);
                p1Var.run();
                break;
            default:
                ((mg.o0) this.b).a((TLRPC.TL_premiumGiftCodeOption) this.c);
                break;
        }
    }

    @Override // org.telegram.messenger.m20
    public void i(Object obj, TLRPC.Document document, Boolean bool) {
        w wVar = (w) this.b;
        View view = (View) this.c;
        wVar.x = false;
        org.telegram.messenger.i0.r(wVar.e);
        p pVar = wVar.n;
        wVar.y = document;
        pVar.setSticker(document);
        ((org.telegram.ui.Cells.p8) view).setValueSticker(document);
        wVar.i0(true);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 13:
                ((j2.b) obj).n((j2.a) this.b, (u2.c0) this.c);
                break;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void m() {
        switch (this.a) {
            case 4:
                bi.n0 n0Var = (bi.n0) this.b;
                bi.m0 m0Var = (bi.m0) this.c;
                n0Var.i();
                m0Var.h0();
                break;
            default:
                z5 z5Var = (z5) this.b;
                c6 c6Var = (c6) this.c;
                TL_iv.pageTableCell pagetablecell = c6Var.b;
                if (pagetablecell != null) {
                    w6.d(pagetablecell, c6Var.a.getText());
                }
                bi.k3 k3Var = z5Var.E;
                if (k3Var != null && z5Var.a != null) {
                    d4.R1(k3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        w0.i gVar;
        switch (this.a) {
            case 7:
                c1.d dVar = (c1.d) this.b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e, "e");
                String str = ((e instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str2);
                    }
                    gVar = new w0.h(2, str2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        gVar = new w0.k(str2);
                    }
                    gVar = new w0.h(2, str2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    }
                    gVar = new w0.h(2, str2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.h.a(cancellationSignal)) {
                    return;
                }
                dVar.f().execute(new c1.a(dVar, gVar, 0));
                return;
            case 8:
                d1.f fVar = (d1.f) this.b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.c;
                kotlin.jvm.internal.i.e(e, "e");
                String str3 = ((e instanceof com.google.android.gms.common.api.f) && b1.d.b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                w0.d bVar = str3.equals("CREATE_CANCELED") ? new w0.b(str4) : str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(2, str4);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.h.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = fVar.g;
                if (executor != null) {
                    executor.execute(new d1.a(fVar, bVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("executor");
                    throw null;
                }
            default:
                jg.e2 e2Var = (jg.e2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                e2Var.B0 = false;
                f8.g(e, true);
                if (Build.VERSION.SDK_INT >= 24 && (e instanceof fb.a) && e.getMessage() != null && e.getMessage().contains("segmentation optional module to be downloaded") && e2Var.isAttachedToWindow()) {
                    org.telegram.messenger.i0.h3(new d1.e(25, e2Var, bitmap), 2000L);
                    return;
                } else {
                    e2Var.C0 = true;
                    return;
                }
        }
    }

    @Override // bi.s4
    public void run(long j10) {
        a4 a4Var = (a4) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        a4Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    public /* synthetic */ m(j2.a aVar, Object obj, long j10) {
        this.a = 14;
        this.b = aVar;
        this.c = obj;
    }
}
