package o4;

import ai.b3;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import ci.hb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.hg0;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements g2.k, ws, gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r0(h1 h1Var, Surface surface, int i3, int i10) {
        this.c = h1Var;
        this.d = surface;
        this.a = i3;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.ws
    public void a(String str) {
        xs xsVar = (xs) this.c;
        Runnable runnable = (Runnable) this.d;
        Editable text = xsVar.getText();
        int i3 = this.a;
        int i10 = this.b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i3, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof p5) && !(characterStyle instanceof wg0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i3) {
                        text.setSpan(characterStyle, spanStart, i3, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(xsVar.A(str), i3, i10, 33);
        } catch (Exception unused) {
        }
        vs vsVar = xsVar.O1;
        if (vsVar != null) {
            vsVar.m();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // g2.k
    public void accept(Object obj) {
        h1 h1Var = (h1) this.c;
        Surface surface = (Surface) this.d;
        l1 l1Var = (l1) obj;
        ((e0) h1Var.a.get()).getClass();
        if (surface == null) {
            l1Var.Q(null);
            h1Var.i = null;
        } else {
            g1 g1Var = new g1(surface, this.a, this.b);
            h1Var.i = g1Var;
            l1Var.Q(g1Var);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        xg.e1 e1Var = (xg.e1) this.c;
        e6 e6Var = (e6) this.d;
        bh.a aVar = e1Var.W1;
        hg0 hg0Var = e1Var.S1;
        ArrayList arrayList = e1Var.Z1;
        HashSet hashSet = e1Var.a2;
        boolean z10 = view instanceof l8;
        int i10 = 2;
        int i11 = this.a;
        yg.g gVar = null;
        if (z10) {
            if (i11 != 4) {
                ((t2) t4.l(e1Var.getContext(), bd.M0(2131751239, null), bd.M0(2131751244, null), null, new xg.y0(e1Var, i10), new xg.x0(e1Var, 9), false, false, e1Var.J0).b).show();
                return;
            }
            p00 p00Var = e1Var.t2;
            if (p00Var != null) {
                p00Var.run();
                e1Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof bh.p) {
            bh.p pVar = (bh.p) view;
            TLRPC.User user = pVar.getUser();
            TLRPC.Chat chat = pVar.getChat();
            if (user == null && chat == null && i11 == 3) {
                int i12 = i3 - 1;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    gVar = (yg.g) arrayList.get(i12);
                }
                u10 u10Var = e1Var.u2;
                if (u10Var == null || gVar == null) {
                    return;
                }
                int i13 = gVar.i;
                if (i13 == 4) {
                    u10Var.a(-98L);
                    return;
                } else if (i13 == 5) {
                    u10Var.a(-97L);
                    return;
                } else {
                    u10Var.a(-99L);
                    return;
                }
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            if (i11 == 3) {
                u10 u10Var2 = e1Var.u2;
                if (u10Var2 != null) {
                    u10Var2.a(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (hg0Var != null) {
                    org.telegram.messenger.g0.v1(hg0Var.getEditText());
                }
                hb hbVar = new hb(e1Var.getContext(), e6Var, user, new xg.x0(e1Var, 11));
                if (!org.telegram.messenger.g0.Q1()) {
                    hbVar.a0(e1Var.g1);
                }
                hbVar.show();
                return;
            }
            if (i11 == 0 || i11 == 2) {
                if (l10.b(hp.s1(h10.t0).b2(j10))) {
                    org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, m5.t(j10)), new fc(e1Var.c, e6Var), R.raw.error, 36);
                    return;
                }
                b3 b3Var = new b3(e1Var.getContext(), this.b, j10, xg.s.c(xg.s.b(1, e1Var.k2)), new xg.y0(e1Var, true ? 1 : 0));
                org.telegram.messenger.t1 t1Var = e1Var.o2;
                b3Var.e1(t1Var != null && t1Var.a(j10));
                b3Var.show();
                return;
            }
            int i14 = 4;
            if (i11 == 4) {
                if (hashSet.isEmpty()) {
                    hashSet.add(Long.valueOf(j10));
                    n10 n10Var = e1Var.w2;
                    if (n10Var != null) {
                        wo woVar = e1Var.V1;
                        n10Var.a(Boolean.valueOf(woVar != null && woVar.a.q), hashSet);
                        e1Var.w2 = null;
                    }
                    e1Var.dismiss();
                    return;
                }
                i14 = 4;
            }
            boolean z11 = (i11 == i14 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                e1Var.g2.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == e1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j10));
                e1Var.m1();
                return;
            }
            boolean z12 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z11 != z12) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z12 ? 1.0f : 0.0f).translationY(z12 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(xq.h).setDuration(320L).withEndAction(!z12 ? new xg.x0(e1Var, true ? 1 : 0) : null).start();
                yg.h hVar = e1Var.i2;
                boolean z13 = !z12;
                if (hVar.E != z13) {
                    hVar.E = z13;
                    org.telegram.messenger.g0.d0(hVar.f, new yg.f(z13));
                }
            }
            e1Var.e1();
            hg0Var.b(true, hashSet, new xg.x0(e1Var, i10), null);
            e1Var.p1(true, true);
            e1Var.f1();
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    public /* synthetic */ r0(xs xsVar, int i3, int i10, Runnable runnable) {
        this.c = xsVar;
        this.a = i3;
        this.b = i10;
        this.d = runnable;
    }

    public /* synthetic */ r0(xg.e1 e1Var, int i3, e6 e6Var, int i10) {
        this.c = e1Var;
        this.a = i3;
        this.d = e6Var;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
