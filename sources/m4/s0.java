package m4;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import mg.f2;
import mg.i2;
import mg.w1;
import mg.x1;
import org.telegram.messenger.a30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;
import rh.t7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements e2.j, ik0, lt {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s0(j1 j1Var, Surface surface, int i10, int i11) {
        this.c = j1Var;
        this.d = surface;
        this.a = i10;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.lt
    public void a(String str) {
        mt mtVar = (mt) this.c;
        Runnable runnable = (Runnable) this.d;
        Editable text = mtVar.getText();
        int i10 = this.a;
        int i11 = this.b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof o5) && !(characterStyle instanceof wh0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i10) {
                        text.setSpan(characterStyle, spanStart, i10, 33);
                    }
                    if (spanEnd > i11) {
                        text.setSpan(characterStyle, i11, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(mtVar.A(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        kt ktVar = mtVar.N1;
        if (ktVar != null) {
            ktVar.m();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        j1 j1Var = (j1) this.c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.a.get()).getClass();
        if (surface == null) {
            n1Var.R(null);
            j1Var.i = null;
        } else {
            i1 i1Var = new i1(surface, this.a, this.b);
            j1Var.i = i1Var;
            n1Var.R(i1Var);
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        i2 i2Var = (i2) this.c;
        p6 p6Var = (p6) this.d;
        l10 l10Var = i2Var.V1;
        f2 f2Var = i2Var.R1;
        ArrayList arrayList = i2Var.Y1;
        HashSet hashSet = i2Var.Z1;
        boolean z10 = view instanceof p8;
        int i11 = 2;
        int i12 = this.a;
        ng.h hVar = null;
        if (z10) {
            if (i12 != 4) {
                ((z2) s4.l(i2Var.getContext(), dd.L0(2131751239, null), dd.L0(2131751244, null), null, new x1(i2Var, i11), new w1(i2Var, 9), false, false, i2Var.I0).b).show();
                return;
            }
            s10 s10Var = i2Var.s2;
            if (s10Var != null) {
                s10Var.run();
                i2Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof qg.k) {
            qg.k kVar = (qg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            if (user == null && chat == null && i12 == 3) {
                int i13 = i10 - 1;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    hVar = (ng.h) arrayList.get(i13);
                }
                r20 r20Var = i2Var.t2;
                if (r20Var == null || hVar == null) {
                    return;
                }
                int i14 = hVar.i;
                if (i14 == 4) {
                    r20Var.a(-98L);
                    return;
                } else if (i14 == 5) {
                    r20Var.a(-97L);
                    return;
                } else {
                    r20Var.a(-99L);
                    return;
                }
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            if (i12 == 3) {
                r20 r20Var2 = i2Var.t2;
                if (r20Var2 != null) {
                    r20Var2.a(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i12 == 1) {
                if (f2Var != null) {
                    org.telegram.messenger.i0.v1(f2Var.getEditText());
                }
                t7 t7Var = new t7(i2Var.getContext(), p6Var, user, new w1(i2Var, 11));
                if (!org.telegram.messenger.i0.Q1()) {
                    t7Var.a0(i2Var.f1);
                }
                t7Var.show();
                return;
            }
            if (i12 == 0 || i12 == 2) {
                if (i20.b(wp.r1(e20.s0).a2(j10))) {
                    a30.s(dd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(j10)), new cc(i2Var.c, p6Var), R.raw.error, 36);
                    return;
                }
                ph.l1 l1Var = new ph.l1(i2Var.getContext(), this.b, j10, mg.k0.c(mg.k0.b(1, i2Var.j2)), new x1(i2Var, true ? 1 : 0));
                org.telegram.messenger.w1 w1Var = i2Var.n2;
                l1Var.e1(w1Var != null && w1Var.a(j10));
                l1Var.show();
                return;
            }
            int i15 = 4;
            if (i12 == 4) {
                if (hashSet.isEmpty()) {
                    hashSet.add(Long.valueOf(j10));
                    k20 k20Var = i2Var.v2;
                    if (k20Var != null) {
                        ep epVar = i2Var.U1;
                        k20Var.a(Boolean.valueOf(epVar != null && epVar.a.q), hashSet);
                        i2Var.v2 = null;
                    }
                    i2Var.dismiss();
                    return;
                }
                i15 = 4;
            }
            boolean z11 = (i12 == i15 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                i2Var.f2.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i2Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j10));
                i2Var.m1();
                return;
            }
            boolean z12 = (i12 == 4 && hashSet.isEmpty()) ? false : true;
            if (z11 != z12) {
                l10Var.setVisibility(0);
                l10Var.animate().alpha(z12 ? 1.0f : 0.0f).translationY(z12 ? 0.0f : org.telegram.messenger.i0.L(12.0f)).setInterpolator(gr.h).setDuration(320L).withEndAction(!z12 ? new w1(i2Var, true ? 1 : 0) : null).start();
                ng.i iVar = i2Var.h2;
                boolean z13 = !z12;
                if (iVar.D != z13) {
                    iVar.D = z13;
                    org.telegram.messenger.i0.d0(iVar.f, new ng.g(z13));
                }
            }
            i2Var.e1();
            f2Var.b(true, hashSet, new w1(i2Var, i11), null);
            i2Var.p1(true, true);
            i2Var.f1();
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    public /* synthetic */ s0(i2 i2Var, int i10, p6 p6Var, int i11) {
        this.c = i2Var;
        this.a = i10;
        this.d = p6Var;
        this.b = i11;
    }

    public /* synthetic */ s0(mt mtVar, int i10, int i11, Runnable runnable) {
        this.c = mtVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
