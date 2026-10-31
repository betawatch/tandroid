package m4;

import ag.d3;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.jf;
import org.telegram.messenger.kf;
import org.telegram.messenger.x20;
import org.telegram.messenger.yd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.yf0;
import v7.p8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements j9.t, v, kf {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public final Object e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(Context context, yf0 yf0Var, final a8 a8Var, boolean z10, int i10, p6 p6Var) {
        int i11;
        final int i12 = 1;
        final int i13 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, p6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = a8Var;
        if (yf0Var != null) {
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, cd.L0(2131753756, null), false, p6Var).setOnClickListener(new y7(yf0Var, 0));
        }
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, cd.L0(2131753881, null), false, p6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z7
            public final /* synthetic */ m4.n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.l();
                        a8Var.Y0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        a8Var.Y0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        a8Var.Y0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        a8Var.Y0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, cd.L0(2131753878, null), false, p6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z7
            public final /* synthetic */ m4.n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.l();
                        a8Var.Y0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        a8Var.Y0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        a8Var.Y0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        a8Var.Y0(0, 71);
                        break;
                }
            }
        });
        final int i14 = 2;
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, cd.L0(2131753880, null), false, p6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z7
            public final /* synthetic */ m4.n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.l();
                        a8Var.Y0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        a8Var.Y0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        a8Var.Y0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        a8Var.Y0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? cd.L0(2131753863, null) : cd.L0(2131753864, null), false, p6Var).setOnClickListener(new org.telegram.messenger.video.h(this, context, i10, p6Var, a8Var));
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, cd.L0(2131753862, null), false, p6Var);
        this.b = c10;
        final int i15 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.z7
            public final /* synthetic */ m4.n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.l();
                        a8Var.Y0(86400, 70);
                        break;
                    case 1:
                        this.b.l();
                        a8Var.Y0(604800, 70);
                        break;
                    case 2:
                        this.b.l();
                        a8Var.Y0(2678400, 70);
                        break;
                    default:
                        this.b.l();
                        a8Var.Y0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            if (p6Var != null) {
                int i16 = t6.q7;
                org.telegram.ui.Components.v1 v1Var = new org.telegram.ui.Components.v1(23);
                org.telegram.ui.Components.v1 v1Var2 = new org.telegram.ui.Components.v1(24);
                int Q = a7.Q(i16, -1, 0, 0.0f, null);
                v1Var2.d(Q, c10);
                u6 x10 = a7.x(100, c10);
                x10.c(i16, -1, 0, 0.0f, null);
                x10.n = v1Var;
                x10.o = v1Var2;
                x10.m = false;
                x10.g = Q;
                i11 = 1;
                if (i10 == i11) {
                    org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(context, p6Var);
                    a7.i(t6.H8, h1Var, p6Var);
                    h1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var, b6.o(-1, 8));
                    p80 p80Var = new p80(context, null);
                    this.e = p80Var;
                    p80Var.setTag(R.id.fit_width_tag, 1);
                    p80Var.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
                    p80Var.setTextSize(1, 13.0f);
                    a7.V(p80Var, t6.E8, null);
                    p80Var.setMovementMethod(LinkMovementMethod.getInstance());
                    a7.H(p80Var, t6.J6, null);
                    p80Var.setText(cd.L0(2131753848, null));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(p80Var, b6.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i17 = t6.q7;
            c10.c(i17, i17);
        }
        i11 = 1;
        if (i10 == i11) {
        }
    }

    @Override // m4.v
    public void c(int i10, b2.b1 b1Var) {
        p0 p0Var = (p0) this.e;
        n1 n1Var = p0Var.h.t;
        int i11 = n1Var.n0(20) ? 4 : 0;
        if (p0Var.t != i11) {
            p0Var.t = i11;
            ((n4.l) p0Var.n.a).a.setFlags(i11 | 3);
        }
        p0Var.p0(n1Var);
    }

    @Override // m4.v
    public void e(int i10, p1 p1Var) {
        Bundle bundle = p1Var.c;
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
        n4.q qVar = ((p0) this.e).n;
        String str = p1Var.b;
        qVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((n4.l) qVar.a).a.sendSessionEvent(str, bundle);
    }

    @Override // m4.v
    public void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        p0 p0Var = (p0) this.e;
        p0Var.p0(p0Var.h.t);
    }

    @Override // j9.t
    public void i(Throwable th2) {
        if (this != ((p0) ((n0) this.e).e).s) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k(long j10, float f7) {
        File file = (File) this.b;
        x20 x20Var = (x20) this.a;
        if (x20Var.W) {
            return;
        }
        if (j10 < 0) {
            j10 = file.length();
        }
        long j11 = j10;
        if (x20Var.Y || this.d != j11) {
            this.d = j11;
            MediaController mediaController = (MediaController) this.e;
            jf jfVar = (jf) this.c;
            String[] strArr = MediaController.U1;
            x20 x20Var2 = jfVar.b;
            boolean z10 = x20Var2.X;
            if (z10) {
                x20Var2.X = false;
            }
            org.telegram.messenger.i0.g3(new yd(mediaController, false, false, jfVar, file, f7, 0L, z10, j11));
        }
    }

    public void l() {
        ((a8) this.c).dismiss();
        this.d = System.currentTimeMillis();
    }

    public void m() {
        p0 p0Var = (p0) this.e;
        n1 n1Var = p0Var.h.t;
        n1Var.J().getClass();
        ((n4.l) p0Var.n.a).a.setPlaybackToLocal((n1Var.n0(21) ? n1Var.H() : b2.f.i).b());
    }

    public void n(b2.p0 p0Var) {
        p0 p0Var2 = (p0) this.e;
        n4.q qVar = p0Var2.n;
        u();
        if (p0Var == null) {
            ((n4.l) qVar.a).a.setRatingType(0);
        } else {
            ((n4.l) qVar.a).a.setRatingType(o.e(p0Var.d.i));
        }
        p0Var2.p0(p0Var2.h.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (j$.util.Objects.equals(r4.n0(18) ? r4.h0() : b2.s0.L, r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i10, n1 n1Var, n1 n1Var2) {
        p0 p0Var = (p0) this.e;
        b2.o1 T0 = n1Var2.T0();
        if (n1Var == null || !Objects.equals(n1Var.T0(), T0)) {
            s(T0);
        }
        b2.s0 h02 = n1Var2.n0(18) ? n1Var2.h0() : b2.s0.L;
        if (n1Var != null) {
        }
        p(h02);
        b2.s0 U0 = n1Var2.U0();
        if (n1Var == null || !Objects.equals(n1Var.U0(), U0)) {
            u();
        }
        if (n1Var == null || n1Var.D0() != n1Var2.D0()) {
            r(n1Var2.D0());
        }
        if (n1Var == null || n1Var.m() != n1Var2.m()) {
            q(n1Var2.m());
        }
        n1Var2.J();
        m();
        int i11 = n1Var2.n0(20) ? 4 : 0;
        if (p0Var.t != i11) {
            p0Var.t = i11;
            ((n4.l) p0Var.n.a).a.setFlags(i11 | 3);
        }
        b2.p0 S0 = n1Var2.S0();
        if (n1Var == null || !Objects.equals(n1Var.S0(), S0)) {
            n(S0);
        } else {
            p0Var.p0(n1Var2);
        }
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p0 p0Var = (p0) ((n0) this.e).e;
        if (this != p0Var.s) {
            return;
        }
        p0.f0(p0Var.n, o.b((b2.s0) this.a, (String) this.b, (Uri) this.c, this.d, bitmap));
        f0 f0Var = p0Var.h;
        e2.l0.W(f0Var.o, new z(f0Var, 1));
    }

    public void p(b2.s0 s0Var) {
        p0 p0Var = (p0) this.e;
        n4.q qVar = p0Var.n;
        CharSequence queueTitle = ((n4.f) ((n4.u) qVar.b).a).a.getQueueTitle();
        CharSequence charSequence = s0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        n1 n1Var = p0Var.h.t;
        if (!p0Var.y.a(17) || !n1Var.s().a(17)) {
            charSequence = null;
        }
        ((n4.l) qVar.a).a.setQueueTitle(charSequence);
    }

    public void q(int i10) {
        n4.q qVar = ((p0) this.e).n;
        int i11 = o.a;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                i12 = 1;
            } else if (i10 != 2) {
                e2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                i12 = 2;
            }
        }
        n4.l lVar = (n4.l) qVar.a;
        if (lVar.j != i12) {
            lVar.j = i12;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) lVar.f.getBroadcastItem(beginBroadcast)).c(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void r(boolean z10) {
        n4.q qVar = ((p0) this.e).n;
        int i10 = o.a;
        n4.l lVar = (n4.l) qVar.a;
        if (lVar.k != z10) {
            lVar.k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) lVar.f.getBroadcastItem(beginBroadcast)).i(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void s(b2.o1 o1Var) {
        v(o1Var);
        u();
    }

    public void t(int i10) {
        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) this.b;
        if (System.currentTimeMillis() - this.d < 200) {
            org.telegram.messenger.i0.g3(new d3(this, i10, 26));
        } else if (i10 == 0) {
            b1Var.setVisibility(8);
        } else {
            b1Var.setVisibility(0);
        }
    }

    public void u() {
        long j10;
        Uri uri;
        b2.s0 s0Var;
        Uri uri2;
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.h;
        n1 n1Var = f0Var.t;
        b2.p0 S0 = n1Var.S0();
        b2.s0 U0 = n1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!n1Var.n0(16) || !n1Var.P0()) && n1Var.n0(16)) {
            j11 = n1Var.getDuration();
        }
        String str = S0 != null ? S0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (S0 == null || (uri2 = S0.f.a) == null) ? null : uri2;
        if (Objects.equals((b2.s0) this.a, U0) && Objects.equals((String) this.b, str) && Objects.equals((Uri) this.c, uri3) && this.d == j11) {
            return;
        }
        this.b = str;
        this.c = uri3;
        this.a = U0;
        this.d = j11;
        j9.y a2 = f0Var.m.a(U0);
        if (a2 != null) {
            p0Var.s = null;
            if (!a2.isDone()) {
                j10 = j11;
                uri = uri3;
                s0Var = U0;
                n0 n0Var = new n0(this, s0Var, str, uri, j10);
                str = str;
                p0Var.s = n0Var;
                Handler handler = f0Var.l;
                Objects.requireNonNull(handler);
                a2.a(new j9.u(0, a2, n0Var), new i2.g0(handler, 1));
                p0.f0(p0Var.n, o.b(s0Var, str, uri, j10, bitmap));
            }
            try {
                bitmap = (Bitmap) p8.a(a2);
            } catch (CancellationException | ExecutionException e) {
                e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j10 = j11;
        uri = uri3;
        s0Var = U0;
        p0.f0(p0Var.n, o.b(s0Var, str, uri, j10, bitmap));
    }

    public void v(b2.o1 o1Var) {
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.h;
        n1 n1Var = f0Var.t;
        if (!p0Var.y.a(17) || !n1Var.s().a(17) || o1Var.p()) {
            p0.e0(p0Var.n, null);
            return;
        }
        int i10 = o.a;
        ArrayList arrayList = new ArrayList();
        b2.n1 n1Var2 = new b2.n1();
        for (int i11 = 0; i11 < o1Var.o(); i11++) {
            arrayList.add(o1Var.m(i11, n1Var2, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        ag.q0 q0Var = new ag.q0(this, new AtomicInteger(0), arrayList, arrayList2, 10);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr = ((b2.p0) arrayList.get(i12)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                q0Var.run();
            } else {
                j9.y w9 = f0Var.m.w(bArr);
                arrayList2.add(w9);
                Handler handler = f0Var.l;
                Objects.requireNonNull(handler);
                w9.a(q0Var, new i2.g0(handler, 1));
            }
        }
    }

    @Override // m4.v
    public void g() {
    }

    @Override // m4.v
    public /* synthetic */ void b(int i10) {
    }

    @Override // m4.v
    public /* synthetic */ void a(int i10, p pVar) {
    }

    @Override // m4.v
    public /* synthetic */ void j(int i10, t1 t1Var) {
    }

    public n0(p0 p0Var) {
        this.e = p0Var;
        this.a = b2.s0.L;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    public n0(n0 n0Var, b2.s0 s0Var, String str, Uri uri, long j10) {
        this.e = n0Var;
        this.a = s0Var;
        this.b = str;
        this.c = uri;
        this.d = j10;
    }

    public n0(MediaController mediaController, x20 x20Var, File file, jf jfVar) {
        this.e = mediaController;
        this.a = x20Var;
        this.b = file;
        this.c = jfVar;
        this.d = 0L;
    }

    @Override // m4.v
    public /* synthetic */ void d(int i10, int i11, int i12) {
    }

    @Override // m4.v
    public /* synthetic */ void h(int i10, l1 l1Var, b2.b1 b1Var, boolean z10, boolean z11) {
    }
}
