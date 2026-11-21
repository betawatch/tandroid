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
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.kg0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class pe implements kf, m9.t, p4.u {
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
    public pe(Context context, kf0 kf0Var, final org.telegram.ui.Components.j8 j8Var, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        final int i11 = 1;
        final int i12 = 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, h6Var);
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.d = j8Var;
        if (kf0Var != null) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, gd.N0(2131753753, null), false, h6Var).setOnClickListener(new org.telegram.ui.Components.h8(kf0Var, 0));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, gd.N0(2131753878, null), false, h6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i8
            public final /* synthetic */ org.telegram.messenger.pe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.m();
                        j8Var.R0(86400, 70);
                        break;
                    case 1:
                        this.b.m();
                        j8Var.R0(604800, 70);
                        break;
                    case 2:
                        this.b.m();
                        j8Var.R0(2678400, 70);
                        break;
                    default:
                        this.b.m();
                        j8Var.R0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, gd.N0(2131753875, null), false, h6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i8
            public final /* synthetic */ org.telegram.messenger.pe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.m();
                        j8Var.R0(86400, 70);
                        break;
                    case 1:
                        this.b.m();
                        j8Var.R0(604800, 70);
                        break;
                    case 2:
                        this.b.m();
                        j8Var.R0(2678400, 70);
                        break;
                    default:
                        this.b.m();
                        j8Var.R0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, gd.N0(2131753877, null), false, h6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i8
            public final /* synthetic */ org.telegram.messenger.pe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.m();
                        j8Var.R0(86400, 70);
                        break;
                    case 1:
                        this.b.m();
                        j8Var.R0(604800, 70);
                        break;
                    case 2:
                        this.b.m();
                        j8Var.R0(2678400, 70);
                        break;
                    default:
                        this.b.m();
                        j8Var.R0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i7 == 1 ? gd.N0(2131753860, null) : gd.N0(2131753861, null), false, h6Var).setOnClickListener(new bi.q6(this, context, i7, h6Var, j8Var));
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, gd.N0(2131753859, null), false, h6Var);
        this.c = c10;
        final int i14 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i8
            public final /* synthetic */ org.telegram.messenger.pe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.m();
                        j8Var.R0(86400, 70);
                        break;
                    case 1:
                        this.b.m();
                        j8Var.R0(604800, 70);
                        break;
                    case 2:
                        this.b.m();
                        j8Var.R0(2678400, 70);
                        break;
                    default:
                        this.b.m();
                        j8Var.R0(0, 71);
                        break;
                }
            }
        });
        if (i7 != 1) {
            if (h6Var != null) {
                int i15 = org.telegram.ui.ActionBar.m6.q7;
                org.telegram.ui.Components.l2 l2Var = new org.telegram.ui.Components.l2(14);
                org.telegram.ui.Components.l2 l2Var2 = new org.telegram.ui.Components.l2(15);
                int P = org.telegram.ui.ActionBar.t6.P(i15, -1, 0, 0.0f, null);
                l2Var2.d(P, c10);
                org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(100, c10);
                w10.c(i15, -1, 0, 0.0f, null);
                w10.n = l2Var;
                w10.o = l2Var2;
                w10.m = false;
                w10.g = P;
                i10 = 1;
                if (i7 == i10) {
                    org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(context, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.H8, d1Var, h6Var);
                    d1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, c8.ma.o(-1, 8));
                    m80 m80Var = new m80(context, null);
                    this.e = m80Var;
                    m80Var.setTag(R.id.fit_width_tag, 1);
                    m80Var.setPadding(g0.L(13.0f), 0, g0.L(13.0f), g0.L(8.0f));
                    m80Var.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.E8, null);
                    m80Var.setMovementMethod(LinkMovementMethod.getInstance());
                    org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, null);
                    m80Var.setText(gd.N0(2131753845, null));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(m80Var, c8.ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i16 = org.telegram.ui.ActionBar.m6.q7;
            c10.c(i16, i16);
        }
        i10 = 1;
        if (i7 == i10) {
        }
    }

    @Override // p4.u
    public void b(int i7, p4.n1 n1Var, boolean z10, boolean z11, int i10) {
        p4.n0 n0Var = (p4.n0) this.e;
        n0Var.p0(n0Var.h.t);
    }

    @Override // p4.u
    public void e(int i7, e2.y0 y0Var) {
        p4.n0 n0Var = (p4.n0) this.e;
        p4.i1 i1Var = n0Var.h.t;
        int i10 = i1Var.p0(20) ? 4 : 0;
        if (n0Var.t != i10) {
            n0Var.t = i10;
            ((q4.l) n0Var.n.b).a.setFlags(i10 | 3);
        }
        n0Var.p0(i1Var);
    }

    @Override // m9.t
    public void h(Throwable th2) {
        if (this != ((p4.n0) ((pe) this.e).e).s) {
            return;
        }
        h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override // p4.u
    public void j(int i7, p4.k1 k1Var) {
        Bundle bundle = k1Var.c;
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
        q4.q qVar = ((p4.n0) this.e).n;
        String str = k1Var.b;
        qVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((q4.l) qVar.b).a.sendSessionEvent(str, bundle);
    }

    public boolean k() {
        return ((e20) this.b).W;
    }

    public void l(long j3, float f10) {
        File file = (File) this.c;
        e20 e20Var = (e20) this.b;
        if (e20Var.W) {
            return;
        }
        if (j3 < 0) {
            j3 = file.length();
        }
        long j10 = j3;
        if (e20Var.Y || this.a != j10) {
            this.a = j10;
            MediaController mediaController = (MediaController) this.e;
            jf jfVar = (jf) this.d;
            String[] strArr = MediaController.W1;
            e20 e20Var2 = jfVar.b;
            boolean z10 = e20Var2.X;
            if (z10) {
                e20Var2.X = false;
            }
            g0.g3(new yd(mediaController, false, false, jfVar, file, f10, 0L, z10, j10));
        }
    }

    public void m() {
        ((org.telegram.ui.Components.j8) this.d).dismiss();
        this.a = System.currentTimeMillis();
    }

    public void n() {
        p4.n0 n0Var = (p4.n0) this.e;
        p4.i1 i1Var = n0Var.h.t;
        i1Var.K().getClass();
        ((q4.l) n0Var.n.b).a.setPlaybackToLocal((i1Var.p0(21) ? i1Var.H() : e2.e.i).b());
    }

    public void o(e2.l0 l0Var) {
        p4.n0 n0Var = (p4.n0) this.e;
        q4.q qVar = n0Var.n;
        v();
        if (l0Var == null) {
            ((q4.l) qVar.b).a.setRatingType(0);
        } else {
            ((q4.l) qVar.b).a.setRatingType(p4.n.e(l0Var.d.i));
        }
        n0Var.p0(n0Var.h.t);
    }

    @Override // m9.t
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p4.n0 n0Var = (p4.n0) ((pe) this.e).e;
        if (this != n0Var.s) {
            return;
        }
        p4.n0.f0(n0Var.n, p4.n.b((e2.o0) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        p4.e0 e0Var = n0Var.h;
        h2.l0.W(e0Var.o, new p4.y(e0Var, 1));
    }

    public void p(int i7, p4.i1 i1Var) {
        p4.n0 n0Var = (p4.n0) this.e;
        t(i1Var.T0());
        q(i1Var.p0(18) ? i1Var.k0() : e2.o0.L);
        i1Var.U0();
        v();
        s(i1Var.D0());
        r(i1Var.m());
        i1Var.K();
        n();
        int i10 = i1Var.p0(20) ? 4 : 0;
        if (n0Var.t != i10) {
            n0Var.t = i10;
            ((q4.l) n0Var.n.b).a.setFlags(i10 | 3);
        }
        o(i1Var.S0());
    }

    public void q(e2.o0 o0Var) {
        p4.n0 n0Var = (p4.n0) this.e;
        q4.q qVar = n0Var.n;
        CharSequence queueTitle = ((q4.f) ((q4.u) qVar.c).a).a.getQueueTitle();
        CharSequence charSequence = o0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        p4.i1 i1Var = n0Var.h.t;
        if (!n0Var.y.a(17) || !i1Var.t().a(17)) {
            charSequence = null;
        }
        ((q4.l) qVar.b).a.setQueueTitle(charSequence);
    }

    public void r(int i7) {
        q4.q qVar = ((p4.n0) this.e).n;
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

    public void s(boolean z10) {
        q4.q qVar = ((p4.n0) this.e).n;
        int i7 = p4.n.a;
        q4.l lVar = (q4.l) qVar.b;
        if (lVar.k != z10) {
            lVar.k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((q4.b) lVar.f.getBroadcastItem(beginBroadcast)).j(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        h2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f.finishBroadcast();
            }
        }
    }

    public void t(e2.l1 l1Var) {
        w(l1Var);
        v();
    }

    public void u(int i7) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.c;
        if (System.currentTimeMillis() - this.a < 200) {
            g0.g3(new org.telegram.ui.ii(this, i7, 5));
        } else if (i7 == 0) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
    }

    public void v() {
        long j3;
        Uri uri;
        e2.o0 o0Var;
        Uri uri2;
        p4.n0 n0Var = (p4.n0) this.e;
        p4.e0 e0Var = n0Var.h;
        p4.i1 i1Var = e0Var.t;
        e2.l0 S0 = i1Var.S0();
        e2.o0 U0 = i1Var.U0();
        long j10 = -9223372036854775807L;
        if ((!i1Var.p0(16) || !i1Var.P0()) && i1Var.p0(16)) {
            j10 = i1Var.getDuration();
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
        m9.y O = e0Var.m.O(U0);
        if (O != null) {
            n0Var.s = null;
            if (!O.isDone()) {
                j3 = j10;
                uri = uri3;
                o0Var = U0;
                pe peVar = new pe(this, o0Var, str, uri, j3);
                str = str;
                n0Var.s = peVar;
                Handler handler = e0Var.l;
                Objects.requireNonNull(handler);
                O.b(new m9.u(0, O, peVar), new l2.d0(handler, 1));
                p4.n0.f0(n0Var.n, p4.n.b(o0Var, str, uri, j3, bitmap));
            }
            try {
                bitmap = (Bitmap) c8.t9.a(O);
            } catch (CancellationException | ExecutionException e10) {
                h2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
            }
        }
        j3 = j10;
        uri = uri3;
        o0Var = U0;
        p4.n0.f0(n0Var.n, p4.n.b(o0Var, str, uri, j3, bitmap));
    }

    public void w(e2.l1 l1Var) {
        p4.n0 n0Var = (p4.n0) this.e;
        p4.e0 e0Var = n0Var.h;
        p4.i1 i1Var = e0Var.t;
        if (!n0Var.y.a(17) || !i1Var.t().a(17) || l1Var.p()) {
            p4.n0.e0(n0Var.n, null);
            return;
        }
        int i7 = p4.n.a;
        ArrayList arrayList = new ArrayList();
        e2.k1 k1Var = new e2.k1();
        for (int i10 = 0; i10 < l1Var.o(); i10++) {
            arrayList.add(l1Var.m(i10, k1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        kg0 kg0Var = new kg0(this, new AtomicInteger(0), arrayList, arrayList2, 29);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr = ((e2.l0) arrayList.get(i11)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                kg0Var.run();
            } else {
                m9.y t02 = e0Var.m.t0(bArr);
                arrayList2.add(t02);
                Handler handler = e0Var.l;
                Objects.requireNonNull(handler);
                t02.b(kg0Var, new l2.d0(handler, 1));
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
    public /* synthetic */ void f(int i7, p4.o1 o1Var) {
    }

    @Override // p4.u
    public /* synthetic */ void i(int i7, p4.o oVar) {
    }

    public pe(p4.n0 n0Var) {
        this.e = n0Var;
        this.b = e2.o0.L;
        this.c = "";
        this.a = -9223372036854775807L;
    }

    public pe(pe peVar, e2.o0 o0Var, String str, Uri uri, long j3) {
        this.e = peVar;
        this.b = o0Var;
        this.c = str;
        this.d = uri;
        this.a = j3;
    }

    public pe(MediaController mediaController, e20 e20Var, File file, jf jfVar) {
        this.e = mediaController;
        this.b = e20Var;
        this.c = file;
        this.d = jfVar;
        this.a = 0L;
    }

    @Override // p4.u
    public /* synthetic */ void d(int i7, int i10, int i11) {
    }

    @Override // p4.u
    public /* synthetic */ void a(int i7, p4.g1 g1Var, e2.y0 y0Var, boolean z10, boolean z11) {
    }
}
