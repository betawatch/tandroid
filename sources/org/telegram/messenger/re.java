package org.telegram.messenger;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.jo0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class re implements mf, m9.t, p4.u {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public re(Context context, ve0 ve0Var, final org.telegram.ui.Components.f8 f8Var, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        final int i11 = 1;
        final int i12 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z9 ? R.drawable.popup_fixed_alert : 0, 0, context, f6Var);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.d = f8Var;
        if (ve0Var != null) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, hd.M0(2131753756, null), false, f6Var).setOnClickListener(new org.telegram.ui.Components.d8(ve0Var, 0));
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, hd.M0(2131753881, null), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ org.telegram.messenger.re b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.l();
                        f8Var.X0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        f8Var.X0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        f8Var.X0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        f8Var.X0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, hd.M0(2131753878, null), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ org.telegram.messenger.re b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.l();
                        f8Var.X0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        f8Var.X0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        f8Var.X0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        f8Var.X0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, hd.M0(2131753880, null), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ org.telegram.messenger.re b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.l();
                        f8Var.X0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        f8Var.X0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        f8Var.X0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        f8Var.X0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i7 == 1 ? hd.M0(2131753863, null) : hd.M0(2131753864, null), false, f6Var).setOnClickListener(new di.u3(this, context, i7, f6Var, f8Var));
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, hd.M0(2131753862, null), false, f6Var);
        this.c = c10;
        final int i14 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ org.telegram.messenger.re b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.l();
                        f8Var.X0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        f8Var.X0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        f8Var.X0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        f8Var.X0(0, 71);
                        break;
                }
            }
        });
        if (i7 != 1) {
            if (f6Var != null) {
                int i15 = org.telegram.ui.ActionBar.k6.q7;
                org.telegram.ui.Components.k2 k2Var = new org.telegram.ui.Components.k2(9);
                org.telegram.ui.Components.k2 k2Var2 = new org.telegram.ui.Components.k2(10);
                int Q = org.telegram.ui.ActionBar.r6.Q(i15, -1, 0, 0.0f, null);
                k2Var2.c(Q, c10);
                org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(100, c10);
                x10.c(i15, -1, 0, 0.0f, null);
                x10.n = k2Var;
                x10.o = k2Var2;
                x10.m = false;
                x10.g = Q;
                i10 = 1;
                if (i7 == i10) {
                    org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(context, f6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, d1Var, f6Var);
                    d1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, c8.ha.o(-1, 8));
                    w70 w70Var = new w70(context, null);
                    this.e = w70Var;
                    w70Var.setTag(R.id.fit_width_tag, 1);
                    w70Var.setPadding(g0.L(13.0f), 0, g0.L(13.0f), g0.L(8.0f));
                    w70Var.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.E8, null);
                    w70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, null);
                    w70Var.setText(hd.M0(2131753848, null));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(w70Var, c8.ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i16 = org.telegram.ui.ActionBar.k6.q7;
            c10.c(i16, i16);
        }
        i10 = 1;
        if (i7 == i10) {
        }
    }

    @Override // p4.u
    public void b(int i7, p4.l1 l1Var, boolean z9, boolean z10, int i10) {
        p4.m0 m0Var = (p4.m0) this.e;
        m0Var.p0(m0Var.h.t);
    }

    @Override // p4.u
    public void e(int i7, e2.y0 y0Var) {
        p4.m0 m0Var = (p4.m0) this.e;
        p4.g1 g1Var = m0Var.h.t;
        int i10 = g1Var.p0(20) ? 4 : 0;
        if (m0Var.t != i10) {
            m0Var.t = i10;
            ((q4.l) m0Var.n.b).a.setFlags(i10 | 3);
        }
        m0Var.p0(g1Var);
    }

    @Override // m9.t
    public void h(Throwable th2) {
        if (this != ((p4.m0) ((re) this.e).e).s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override // p4.u
    public void j(int i7, p4.i1 i1Var) {
        Bundle bundle = i1Var.c;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        q4.q qVar = ((p4.m0) this.e).n;
        String str = i1Var.b;
        qVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((q4.l) qVar.b).a.sendSessionEvent(str, bundle);
    }

    public void k(long j3, float f10) {
        File file = (File) this.c;
        j20 j20Var = (j20) this.b;
        if (j20Var.W) {
            return;
        }
        if (j3 < 0) {
            j3 = file.length();
        }
        long j10 = j3;
        if (j20Var.Y || this.a != j10) {
            this.a = j10;
            MediaController mediaController = (MediaController) this.e;
            lf lfVar = (lf) this.d;
            String[] strArr = MediaController.V1;
            j20 j20Var2 = lfVar.b;
            boolean z9 = j20Var2.X;
            if (z9) {
                j20Var2.X = false;
            }
            g0.h3(new ae(mediaController, false, false, lfVar, file, f10, 0L, z9, j10));
        }
    }

    public void l() {
        ((org.telegram.ui.Components.f8) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    public void m() {
        p4.m0 m0Var = (p4.m0) this.e;
        p4.g1 g1Var = m0Var.h.t;
        g1Var.K().getClass();
        ((q4.l) m0Var.n.b).a.setPlaybackToLocal((g1Var.p0(21) ? g1Var.H() : e2.e.i).b());
    }

    public void n(e2.l0 l0Var) {
        p4.m0 m0Var = (p4.m0) this.e;
        q4.q qVar = m0Var.n;
        u();
        if (l0Var == null) {
            ((q4.l) qVar.b).a.setRatingType(0);
        } else {
            ((q4.l) qVar.b).a.setRatingType(p4.n.e(l0Var.d.i));
        }
        m0Var.p0(m0Var.h.t);
    }

    public void o(int i7, p4.g1 g1Var) {
        p4.m0 m0Var = (p4.m0) this.e;
        s(g1Var.T0());
        p(g1Var.p0(18) ? g1Var.k0() : e2.o0.L);
        g1Var.U0();
        u();
        r(g1Var.D0());
        q(g1Var.m());
        g1Var.K();
        m();
        int i10 = g1Var.p0(20) ? 4 : 0;
        if (m0Var.t != i10) {
            m0Var.t = i10;
            ((q4.l) m0Var.n.b).a.setFlags(i10 | 3);
        }
        n(g1Var.S0());
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.m0 m0Var = (p4.m0) ((re) this.e).e;
        if (this != m0Var.s) {
            return;
        }
        p4.m0.f0(m0Var.n, p4.n.b((e2.o0) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        p4.d0 d0Var = m0Var.h;
        h2.m0.W(d0Var.o, new p4.y(d0Var, 1));
    }

    public void p(e2.o0 o0Var) {
        p4.m0 m0Var = (p4.m0) this.e;
        q4.q qVar = m0Var.n;
        CharSequence queueTitle = ((q4.f) ((q4.u) qVar.c).a).a.getQueueTitle();
        CharSequence charSequence = o0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        p4.g1 g1Var = m0Var.h.t;
        if (!m0Var.y.a(17) || !g1Var.t().a(17)) {
            charSequence = null;
        }
        ((q4.l) qVar.b).a.setQueueTitle(charSequence);
    }

    public void q(int i7) {
        q4.q qVar = ((p4.m0) this.e).n;
        int i10 = p4.n.a;
        int i11 = 0;
        if (i7 != 0) {
            if (i7 == 1) {
                i11 = 1;
            } else if (i7 != 2) {
                h2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i7 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                i11 = 2;
            }
        }
        q4.l lVar = (q4.l) qVar.b;
        if (lVar.j != i11) {
            lVar.j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f.getBroadcastItem(beginBroadcast)).e(i11);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void r(boolean z9) {
        q4.q qVar = ((p4.m0) this.e).n;
        int i7 = p4.n.a;
        q4.l lVar = (q4.l) qVar.b;
        if (lVar.k != z9) {
            lVar.k = z9 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f.getBroadcastItem(beginBroadcast)).j(z9 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void s(e2.l1 l1Var) {
        v(l1Var);
        u();
    }

    public void t(int i7) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
        if (System.currentTimeMillis() - this.a < 200) {
            g0.h3(new org.telegram.ui.Components.r2(this, i7, 1));
        } else if (i7 == 0) {
            z0Var.setVisibility(8);
        } else {
            z0Var.setVisibility(0);
        }
    }

    public void u() {
        long j3;
        Uri uri;
        e2.o0 o0Var;
        Uri uri2;
        p4.m0 m0Var = (p4.m0) this.e;
        p4.d0 d0Var = m0Var.h;
        p4.g1 g1Var = d0Var.t;
        e2.l0 S0 = g1Var.S0();
        e2.o0 U0 = g1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!g1Var.p0(16) || !g1Var.P0()) && g1Var.p0(16)) {
            j10 = g1Var.getDuration();
        }
        String str = S0 != null ? S0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (S0 == null || (uri2 = S0.f.a) == null) ? null : uri2;
        if (Objects.equals((e2.o0) this.b, U0) && Objects.equals((String) this.c, str) && Objects.equals((Uri) this.d, uri3) && this.a == j10) {
            return;
        }
        this.c = str;
        this.d = uri3;
        this.b = U0;
        this.a = j10;
        m9.y A = d0Var.m.A(U0);
        if (A != null) {
            m0Var.s = null;
            if (!A.isDone()) {
                j3 = j10;
                uri = uri3;
                o0Var = U0;
                re reVar = new re(this, o0Var, str, uri, j3);
                str = str;
                m0Var.s = reVar;
                Handler handler = d0Var.l;
                Objects.requireNonNull(handler);
                A.b(new m9.u(0, A, reVar), new l2.g0(handler, 1));
                p4.m0.f0(m0Var.n, p4.n.b(o0Var, str, uri, j3, bitmap));
            }
            try {
                bitmap = (Bitmap) c8.s9.a(A);
            } catch (CancellationException | ExecutionException e10) {
                h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
            }
        }
        j3 = j10;
        uri = uri3;
        o0Var = U0;
        p4.m0.f0(m0Var.n, p4.n.b(o0Var, str, uri, j3, bitmap));
    }

    public void v(e2.l1 l1Var) {
        p4.m0 m0Var = (p4.m0) this.e;
        p4.d0 d0Var = m0Var.h;
        p4.g1 g1Var = d0Var.t;
        if (!m0Var.y.a(17) || !g1Var.t().a(17) || l1Var.p()) {
            p4.m0.e0(m0Var.n, null);
            return;
        }
        int i7 = p4.n.a;
        ArrayList arrayList = new ArrayList();
        e2.k1 k1Var = new e2.k1();
        for (int i10 = 0; i10 < l1Var.o(); i10++) {
            arrayList.add(l1Var.m(i10, k1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        jo0 jo0Var = new jo0(this, new AtomicInteger(0), arrayList, arrayList2, 22);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr = ((e2.l0) arrayList.get(i11)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                jo0Var.run();
            } else {
                m9.y W = d0Var.m.W(bArr);
                arrayList2.add(W);
                Handler handler = d0Var.l;
                Objects.requireNonNull(handler);
                W.b(jo0Var, new l2.g0(handler, 1));
            }
        }
    }

    @Override // p4.u
    public void g() {
    }

    @Override // p4.u
    public /* synthetic */ void c(int i7) {
    }

    @Override // p4.u
    public /* synthetic */ void f(int i7, p4.m1 m1Var) {
    }

    @Override // p4.u
    public /* synthetic */ void i(int i7, p4.o oVar) {
    }

    public re(p4.m0 m0Var) {
        this.e = m0Var;
        this.b = e2.o0.L;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public re(re reVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.e = reVar;
        this.b = o0Var;
        this.c = str;
        this.d = uri;
        this.a = j3;
    }

    public re(MediaController mediaController, j20 j20Var, File file, lf lfVar) {
        this.e = mediaController;
        this.b = j20Var;
        this.c = file;
        this.d = lfVar;
        this.a = 0L;
    }

    @Override // p4.u
    public /* synthetic */ void d(int i7, int i10, int i11) {
    }

    @Override // p4.u
    public /* synthetic */ void a(int i7, p4.e1 e1Var, e2.y0 y0Var, boolean z9, boolean z10) {
    }
}
