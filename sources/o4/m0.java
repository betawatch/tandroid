package o4;

import ai.r4;
import ai.z3;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import b8.mf;
import b8.yd;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cf;
import org.telegram.messenger.df;
import org.telegram.messenger.ud;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a3;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.o2;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.xe0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 implements l9.t, u, df {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public final Object e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m0(Context context, xe0 xe0Var, final d8 d8Var, boolean z10, int i3, e6 e6Var) {
        int i10;
        final int i11 = 1;
        final int i12 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, e6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = d8Var;
        if (xe0Var != null) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, bd.M0(2131753756, null), false, e6Var).setOnClickListener(new b8(xe0Var, 0));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, bd.M0(2131753881, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c8
            public final /* synthetic */ o4.m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.l();
                        d8Var.W0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        d8Var.W0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        d8Var.W0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        d8Var.W0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, bd.M0(2131753878, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c8
            public final /* synthetic */ o4.m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.l();
                        d8Var.W0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        d8Var.W0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        d8Var.W0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        d8Var.W0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, bd.M0(2131753880, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c8
            public final /* synthetic */ o4.m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.l();
                        d8Var.W0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        d8Var.W0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        d8Var.W0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        d8Var.W0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i3 == 1 ? bd.M0(2131753863, null) : bd.M0(2131753864, null), false, e6Var).setOnClickListener(new r4(this, context, i3, e6Var, d8Var));
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, bd.M0(2131753862, null), false, e6Var);
        this.b = c2;
        final int i14 = 3;
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c8
            public final /* synthetic */ o4.m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.l();
                        d8Var.W0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        d8Var.W0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        d8Var.W0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        d8Var.W0(0, 71);
                        break;
                }
            }
        });
        if (i3 != 1) {
            if (e6Var != null) {
                int i15 = k6.q7;
                a3 a3Var = new a3(6);
                a3 a3Var2 = new a3(7);
                int Q = r6.Q(i15, -1, 0, 0.0f, null);
                a3Var2.f(Q, c2);
                l6 x10 = r6.x(100, c2);
                x10.c(i15, -1, 0, 0.0f, null);
                x10.n = a3Var;
                x10.o = a3Var2;
                x10.m = false;
                x10.g = Q;
                i10 = 1;
                if (i3 == i10) {
                    org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, e6Var);
                    r6.i(k6.H8, c1Var, e6Var);
                    c1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var, mf.o(-1, 8));
                    s70 s70Var = new s70(context, null);
                    this.e = s70Var;
                    s70Var.setTag(R.id.fit_width_tag, 1);
                    s70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    s70Var.setTextSize(1, 13.0f);
                    r6.V(s70Var, k6.E8, null);
                    s70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    r6.H(s70Var, k6.J6, null);
                    s70Var.setText(bd.M0(2131753848, null));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(s70Var, mf.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i16 = k6.q7;
            c2.c(i16, i16);
        }
        i10 = 1;
        if (i3 == i10) {
        }
    }

    @Override // o4.u
    public void a(int i3, d2.a1 a1Var) {
        o0 o0Var = (o0) this.e;
        l1 l1Var = o0Var.h.t;
        int i10 = l1Var.m0(20) ? 4 : 0;
        if (o0Var.t != i10) {
            o0Var.t = i10;
            ((p4.l) o0Var.n.a).a.setFlags(i10 | 3);
        }
        o0Var.p0(l1Var);
    }

    @Override // o4.u
    public void d(int i3, n1 n1Var) {
        Bundle bundle = n1Var.c;
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
        p4.q qVar = ((o0) this.e).n;
        String str = n1Var.b;
        qVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((p4.l) qVar.a).a.sendSessionEvent(str, bundle);
    }

    @Override // l9.t
    public void h(Throwable th2) {
        if (this != ((o0) ((m0) this.e).e).s) {
            return;
        }
        g2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override // o4.u
    public void i(int i3, q1 q1Var, boolean z10, boolean z11, int i10) {
        o0 o0Var = (o0) this.e;
        o0Var.p0(o0Var.h.t);
    }

    public void k(long j10, float f10) {
        File file = (File) this.b;
        b20 b20Var = (b20) this.a;
        if (b20Var.W) {
            return;
        }
        if (j10 < 0) {
            j10 = file.length();
        }
        long j11 = j10;
        if (b20Var.Y || this.d != j11) {
            this.d = j11;
            MediaController mediaController = (MediaController) this.e;
            cf cfVar = (cf) this.c;
            String[] strArr = MediaController.W1;
            b20 b20Var2 = cfVar.b;
            boolean z10 = b20Var2.X;
            if (z10) {
                b20Var2.X = false;
            }
            org.telegram.messenger.g0.h3(new ud(mediaController, false, false, cfVar, file, f10, 0L, z10, j11));
        }
    }

    public void l() {
        ((d8) this.c).dismiss();
        this.d = System.currentTimeMillis();
    }

    public void m() {
        o0 o0Var = (o0) this.e;
        l1 l1Var = o0Var.h.t;
        l1Var.I().getClass();
        ((p4.l) o0Var.n.a).a.setPlaybackToLocal((l1Var.m0(21) ? l1Var.G() : d2.f.i).b());
    }

    public void n(d2.n0 n0Var) {
        o0 o0Var = (o0) this.e;
        p4.q qVar = o0Var.n;
        u();
        if (n0Var == null) {
            ((p4.l) qVar.a).a.setRatingType(0);
        } else {
            ((p4.l) qVar.a).a.setRatingType(n.e(n0Var.d.i));
        }
        o0Var.p0(o0Var.h.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (j$.util.Objects.equals(r4.m0(18) ? r4.h0() : d2.q0.L, r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i3, l1 l1Var, l1 l1Var2) {
        o0 o0Var = (o0) this.e;
        d2.n1 T0 = l1Var2.T0();
        if (l1Var == null || !Objects.equals(l1Var.T0(), T0)) {
            s(T0);
        }
        d2.q0 h02 = l1Var2.m0(18) ? l1Var2.h0() : d2.q0.L;
        if (l1Var != null) {
        }
        p(h02);
        d2.q0 U0 = l1Var2.U0();
        if (l1Var == null || !Objects.equals(l1Var.U0(), U0)) {
            u();
        }
        if (l1Var == null || l1Var.E0() != l1Var2.E0()) {
            r(l1Var2.E0());
        }
        if (l1Var == null || l1Var.m() != l1Var2.m()) {
            q(l1Var2.m());
        }
        l1Var2.I();
        m();
        int i10 = l1Var2.m0(20) ? 4 : 0;
        if (o0Var.t != i10) {
            o0Var.t = i10;
            ((p4.l) o0Var.n.a).a.setFlags(i10 | 3);
        }
        d2.n0 S0 = l1Var2.S0();
        if (l1Var == null || !Objects.equals(l1Var.S0(), S0)) {
            n(S0);
        } else {
            o0Var.p0(l1Var2);
        }
    }

    @Override // l9.t
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o0 o0Var = (o0) ((m0) this.e).e;
        if (this != o0Var.s) {
            return;
        }
        o0.f0(o0Var.n, n.b((d2.q0) this.a, (String) this.b, (Uri) this.c, this.d, bitmap));
        e0 e0Var = o0Var.h;
        g2.n0.W(e0Var.o, new y(e0Var, 1));
    }

    public void p(d2.q0 q0Var) {
        o0 o0Var = (o0) this.e;
        p4.q qVar = o0Var.n;
        CharSequence queueTitle = ((p4.f) ((p4.u) qVar.b).a).a.getQueueTitle();
        CharSequence charSequence = q0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        l1 l1Var = o0Var.h.t;
        if (!o0Var.y.a(17) || !l1Var.t().a(17)) {
            charSequence = null;
        }
        ((p4.l) qVar.a).a.setQueueTitle(charSequence);
    }

    public void q(int i3) {
        p4.q qVar = ((o0) this.e).n;
        int i10 = n.a;
        int i11 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                i11 = 1;
            } else if (i3 != 2) {
                g2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i3 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                i11 = 2;
            }
        }
        p4.l lVar = (p4.l) qVar.a;
        if (lVar.j != i11) {
            lVar.j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((p4.b) lVar.f.getBroadcastItem(beginBroadcast)).c(i11);
                    } catch (RemoteException | SecurityException e10) {
                        g2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void r(boolean z10) {
        p4.q qVar = ((o0) this.e).n;
        int i3 = n.a;
        p4.l lVar = (p4.l) qVar.a;
        if (lVar.k != z10) {
            lVar.k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((p4.b) lVar.f.getBroadcastItem(beginBroadcast)).i(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        g2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void s(d2.n1 n1Var) {
        v(n1Var);
        u();
    }

    public void t(int i3) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.b;
        if (System.currentTimeMillis() - this.d < 200) {
            org.telegram.messenger.g0.h3(new o2(this, i3, 1));
        } else if (i3 == 0) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
    }

    public void u() {
        long j10;
        Uri uri;
        d2.q0 q0Var;
        Uri uri2;
        o0 o0Var = (o0) this.e;
        e0 e0Var = o0Var.h;
        l1 l1Var = e0Var.t;
        d2.n0 S0 = l1Var.S0();
        d2.q0 U0 = l1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!l1Var.m0(16) || !l1Var.P0()) && l1Var.m0(16)) {
            j11 = l1Var.getDuration();
        }
        String str = S0 != null ? S0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (S0 == null || (uri2 = S0.f.a) == null) ? null : uri2;
        if (Objects.equals((d2.q0) this.a, U0) && Objects.equals((String) this.b, str) && Objects.equals((Uri) this.c, uri3) && this.d == j11) {
            return;
        }
        this.b = str;
        this.c = uri3;
        this.a = U0;
        this.d = j11;
        l9.y L = e0Var.m.L(U0);
        if (L != null) {
            o0Var.s = null;
            if (!L.isDone()) {
                j10 = j11;
                uri = uri3;
                q0Var = U0;
                m0 m0Var = new m0(this, q0Var, str, uri, j10);
                str = str;
                o0Var.s = m0Var;
                Handler handler = e0Var.l;
                Objects.requireNonNull(handler);
                L.b(new l9.u(0, L, m0Var), new k2.g0(handler, 1));
                o0.f0(o0Var.n, n.b(q0Var, str, uri, j10, bitmap));
            }
            try {
                bitmap = (Bitmap) yd.a(L);
            } catch (CancellationException | ExecutionException e10) {
                g2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
            }
        }
        j10 = j11;
        uri = uri3;
        q0Var = U0;
        o0.f0(o0Var.n, n.b(q0Var, str, uri, j10, bitmap));
    }

    public void v(d2.n1 n1Var) {
        o0 o0Var = (o0) this.e;
        e0 e0Var = o0Var.h;
        l1 l1Var = e0Var.t;
        if (!o0Var.y.a(17) || !l1Var.t().a(17) || n1Var.p()) {
            o0.e0(o0Var.n, null);
            return;
        }
        int i3 = n.a;
        ArrayList arrayList = new ArrayList();
        d2.m1 m1Var = new d2.m1();
        for (int i10 = 0; i10 < n1Var.o(); i10++) {
            arrayList.add(n1Var.m(i10, m1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        z3 z3Var = new z3(this, new AtomicInteger(0), arrayList, arrayList2, 27);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr = ((d2.n0) arrayList.get(i11)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                z3Var.run();
            } else {
                l9.y u10 = e0Var.m.u(bArr);
                arrayList2.add(u10);
                Handler handler = e0Var.l;
                Objects.requireNonNull(handler);
                u10.b(z3Var, new k2.g0(handler, 1));
            }
        }
    }

    @Override // o4.u
    public void g() {
    }

    @Override // o4.u
    public /* synthetic */ void b(int i3) {
    }

    @Override // o4.u
    public /* synthetic */ void e(int i3, r1 r1Var) {
    }

    @Override // o4.u
    public /* synthetic */ void j(int i3, o oVar) {
    }

    public m0(o0 o0Var) {
        this.e = o0Var;
        this.a = d2.q0.L;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    public m0(m0 m0Var, d2.q0 q0Var, String str, Uri uri, long j10) {
        this.e = m0Var;
        this.a = q0Var;
        this.b = str;
        this.c = uri;
        this.d = j10;
    }

    public m0(MediaController mediaController, b20 b20Var, File file, cf cfVar) {
        this.e = mediaController;
        this.a = b20Var;
        this.b = file;
        this.c = cfVar;
        this.d = 0L;
    }

    @Override // o4.u
    public /* synthetic */ void c(int i3, int i10, int i11) {
    }

    @Override // o4.u
    public /* synthetic */ void f(int i3, j1 j1Var, d2.a1 a1Var, boolean z10, boolean z11) {
    }
}
