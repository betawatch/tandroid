package ah;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bg.m0;
import bi.a1;
import bi.h8;
import bi.k9;
import bi.n9;
import bi.t0;
import bi.uc;
import bi.v;
import bi.w4;
import di.a4;
import di.c1;
import di.j4;
import di.l5;
import di.q9;
import di.v4;
import di.z1;
import fi.b3;
import fi.f3;
import fi.la;
import fi.q1;
import fi.q8;
import fi.x9;
import fi.z2;
import h9.f1;
import java.util.ArrayList;
import java.util.HashSet;
import kg.i0;
import li.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.mj;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.q2;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.z7;
import org.telegram.ui.cn;
import org.telegram.ui.z40;
import sg.l0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean u12;
        ha0 ha0Var;
        m2 m2Var;
        int i7 = 3;
        int i10 = 2;
        int i11 = 4;
        CharSequence charSequence = null;
        boolean z9 = false;
        z9 = false;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        switch (this.a) {
            case 0:
                ((o) this.b).a(view, (HashSet) this.c, (Runnable) this.d);
                break;
            case 1:
                a1 a1Var = (a1) this.b;
                Context context = (Context) this.c;
                h6 h6Var = (h6) this.d;
                if (a1Var.i2.a == cg.b.a) {
                    new uc(context, h6Var).show();
                    break;
                }
                break;
            case 2:
                n9 n9Var = (n9) this.b;
                final w2 w2Var = (w2) this.c;
                final fi.d dVar = (fi.d) this.d;
                w2Var.b0 = false;
                dVar.setLoading(true);
                final char c15 = c10 == true ? 1 : 0;
                n9Var.a(new c20() { // from class: bi.fa
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (c15) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                if (!booleanValue) {
                                    final int i12 = 0;
                                    final fi.d dVar2 = dVar;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i12) {
                                                case 0:
                                                    w2Var2.b0 = false;
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var2.b0 = false;
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    w2Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
                                if (!booleanValue2) {
                                    final int i13 = 1;
                                    final fi.d dVar3 = dVar;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    w2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    w2Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                k9 k9Var = (k9) this.b;
                final w2 w2Var2 = (w2) this.c;
                final fi.d dVar2 = (fi.d) this.d;
                w2Var2.b0 = false;
                dVar2.setLoading(true);
                final int i12 = z9 ? 1 : 0;
                k9Var.a(new c20() { // from class: bi.fa
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i12) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var22 = w2Var2;
                                if (!booleanValue) {
                                    final int i122 = 0;
                                    final fi.d dVar22 = dVar2;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i122) {
                                                case 0:
                                                    w2Var22.b0 = false;
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var22.b0 = false;
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    w2Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (!booleanValue2) {
                                    final int i13 = 1;
                                    final fi.d dVar3 = dVar2;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: bi.ha
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    w2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var3.b0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    w2Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 4:
                z1 z1Var = (z1) this.b;
                long[] jArr = (long[]) this.c;
                w2 w2Var3 = (w2) this.d;
                z1Var.a(Long.valueOf(jArr[0]));
                w2Var3.dismiss();
                break;
            case 5:
                a4 a4Var = (a4) this.b;
                q8 q8Var = (q8) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                j4 j4Var = a4Var.x;
                j4Var.D0(q8Var, storyItem);
                a4 a4Var2 = j4Var.c1;
                if (a4Var2 != null) {
                    a4Var2.a();
                    break;
                }
                break;
            case 6:
                a4 a4Var3 = (a4) this.b;
                z0 z0Var = (z0) this.c;
                q9 q9Var = (q9) this.d;
                z0Var.performHapticFeedback(3);
                gc X = gc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, g0.U2(id.M0(2131745933, null), new di.z0(i11, a4Var3, q9Var))).j();
                    break;
                }
                break;
            case 7:
                v4 v4Var = (v4) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                k60 k60Var = (k60) this.d;
                w4 w4Var = new w4(v4Var, i10);
                l5 l5Var = v4Var.b;
                new qu(w4Var, l5Var.getContext(), l5Var.s, arrayList).show();
                k60Var.u();
                break;
            case 8:
                la laVar = (la) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                di.b bVar = (di.b) this.d;
                k60 k60Var2 = laVar.U0;
                if (k60Var2 == null || !k60Var2.D()) {
                    fi.o oVar = new fi.o(laVar, z9 ? 1 : 0);
                    boolean q10 = p10.i(laVar.U).q();
                    fi.o oVar2 = q10 ? null : new fi.o(laVar, c11 == true ? 1 : 0);
                    k60 F = k60.F(frameLayout, bVar, laVar.S0);
                    laVar.U0 = F;
                    F.p(13, g0.L(200.0f), id.N0("StoryPeriodHint"));
                    laVar.U0.k();
                    int i13 = 0;
                    while (true) {
                        int[] iArr = fi.r.P1;
                        if (i13 >= 4) {
                            k60 k60Var3 = laVar.U0;
                            k60Var3.s = 0;
                            k60Var3.Z();
                            break;
                        } else {
                            int i14 = iArr[i13];
                            k60 k60Var4 = laVar.U0;
                            String N0 = i14 == Integer.MAX_VALUE ? id.N0("StoryPeriodKeep") : id.G(i14 / 3600, "Hours", new Object[0]);
                            int i15 = m6.E8;
                            k60Var4.b(0, null, N0, i15, i15, new m0(oVar, i14, 5));
                            k60Var4.M((q10 || i14 == 86400 || i14 == Integer.MAX_VALUE) ? null : new m0(oVar2, i14, 6));
                            if (laVar.W0 == i13) {
                                laVar.U0.L();
                            }
                            i13++;
                        }
                    }
                }
                break;
            case 9:
                z2 z2Var = (z2) this.b;
                gf gfVar = (gf) this.c;
                b3 b3Var = (b3) this.d;
                f3 f3Var = z2Var.c;
                ArrayList arrayList2 = f3Var.h0;
                if (arrayList2.contains(gfVar)) {
                    arrayList2.remove(gfVar);
                } else if (arrayList2.size() + 1 > f3Var.R) {
                    int i16 = -f3Var.N;
                    f3Var.N = i16;
                    g0.G3(i16, b3Var, null);
                    p2.D.a();
                    break;
                } else {
                    arrayList2.add(gfVar);
                }
                g0.b4(f3Var.d);
                f3Var.j();
                break;
            case 10:
                x9 x9Var = (x9) this.b;
                Context context2 = (Context) this.c;
                l0 l0Var = (l0) this.d;
                if (!x9Var.k1) {
                    Runnable runnable = x9Var.t1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    sg.q qVar = new sg.q(context2, x9Var.p1);
                    x9Var.C1 = qVar;
                    qVar.I0(x9Var.j1.a, 2);
                    qVar.r1 = new androidx.activity.n(x9Var, l0Var, c12 == true ? 1 : 0);
                    qVar.q1 = new h8(i10, x9Var, l0Var);
                    qVar.show();
                    break;
                }
                break;
            case 11:
                kg.e eVar = (kg.e) this.b;
                k60 F2 = k60.F(((cn) this.c).getLayoutContainer(), (h6) this.d, eVar.n);
                F2.c(R.drawable.msg_cancel, id.M0(2131753702, null), new kg.d(eVar, c13 == true ? 1 : 0), true);
                F2.E();
                if (eVar.y != null) {
                    F2.c(R.drawable.msg_settings, id.M0(2131753703, null), new kg.d(eVar, i10), false);
                }
                F2.a0(g0.L(10.0f), g0.L(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 12:
                i0 i0Var = (i0) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                q2 q2Var = (q2) this.d;
                fi.d dVar3 = i0Var.X1;
                if (!dVar3.Q) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = qp.s1(i0Var.a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(i0Var.a).sendRequest(updateconnectedbot, new bi.j(20, i0Var, q2Var));
                    break;
                }
                break;
            case 13:
                ki.a aVar = (ki.a) this.b;
                c20 c20Var = (c20) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z10 = aVar.T1;
                if (chat != null && !t3.w(27, chat)) {
                    z9 = true;
                }
                aVar.d1(c20Var, z10, z9);
                break;
            case 14:
                ga.d dVar4 = (ga.d) this.b;
                a6 a6Var = (a6) this.c;
                li.l0 l0Var2 = (li.l0) this.d;
                dVar4.c();
                a6Var.D(l0Var2);
                break;
            case 15:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.b;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.c;
                h6 h6Var2 = (h6) this.d;
                fi.d dVar5 = rVar.a2;
                if (dVar5.c0 && !dVar5.Q) {
                    if (!rVar.d1()) {
                        dVar5.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(rVar.a).sendRequestTyped(savetone, new d3.b(c14 == true ? 1 : 0), new t0(rVar, h6Var2, aiComposeTone, i11));
                        break;
                    } else {
                        rVar.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                boolean[] zArr = (boolean[]) this.b;
                s4 s4Var = (s4) this.c;
                f1 f1Var = (f1) this.d;
                zArr[0] = false;
                s4Var.L(-1, 0, true);
                ((w2) f1Var.b).x0.run();
                break;
            case 17:
                u1[] u1VarArr = (u1[]) this.b;
                Runnable runnable2 = (Runnable) this.d;
                q4 q4Var = (q4) this.c;
                u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    u1Var.setOnDismissListener(null);
                }
                runnable2.run();
                q4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 18:
                ArrayList arrayList3 = (ArrayList) this.b;
                Runnable runnable3 = (Runnable) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.c;
                iz.o0 = ((Integer) arrayList3.get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putInt("mapPreviewType", iz.o0);
                edit.apply();
                runnable3.run();
                alertDialog$Builder.a.L0.run();
                break;
            case 19:
                ((z7) this.b).n.X0((w) this.c, (ij) this.d);
                break;
            case 20:
                ci ciVar = (ci) this.b;
                f2 f2Var = (f2) this.c;
                h6 h6Var3 = (h6) this.d;
                f2 f2Var2 = ciVar.Z1;
                int i17 = ciVar.G3;
                kh khVar = ciVar.F2;
                te teVar = ciVar.b2;
                long j3 = teVar != null ? teVar.j() : 0L;
                ciVar.K2 = j3;
                khVar.setEffect(j3);
                ciVar.f1 = true;
                if (ciVar.E1 - ciVar.F1 < 0) {
                    g0.F3(ciVar.t1);
                    g0.F3(ciVar.u1);
                    try {
                        khVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!qp.s1(i17).D3() && qp.s1(i17).U4 > ciVar.F1) {
                        ciVar.D1(f2Var);
                    }
                    te teVar2 = ciVar.b2;
                    if (teVar2 != null) {
                        teVar2.g(false);
                        ciVar.b2 = null;
                        break;
                    }
                } else {
                    if (ciVar.E3 == null && (f2Var2 instanceof cn)) {
                        cn cnVar = (cn) f2Var2;
                        if (cnVar.c()) {
                            u4.J(ciVar.getContext(), cnVar.a(), new c1(ciVar, j3, i7), h6Var3);
                            ciVar.v1(false, false);
                            break;
                        }
                    }
                    uh uhVar = ciVar.v2;
                    if (uhVar == ciVar.d2 || uhVar == ciVar.k2) {
                        u12 = ciVar.u1(true, 0, 0, j3, ciVar.f1());
                    } else {
                        if (!uhVar.L(true, 0, 0, j3, ciVar.f1())) {
                            ciVar.A4 = true;
                            ciVar.dismiss();
                        }
                        u12 = false;
                    }
                    te teVar3 = ciVar.b2;
                    if (teVar3 != null) {
                        teVar3.g(!u12);
                        ciVar.b2 = null;
                    }
                    ciVar.v1(false, false);
                }
                break;
            case 21:
                ci ciVar2 = (ci) this.b;
                ij ijVar = (ij) this.c;
                ha0 ha0Var2 = (ha0) this.d;
                ciVar2.v1(!ciVar2.W1, true);
                TLRPC.Message message = ijVar.k;
                boolean z11 = ciVar2.W1;
                message.invert_media = z11;
                ha0Var2.a(!z11, true);
                ciVar2.b2.e(ijVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar2.d2;
                if (chatAttachAlertPhotoLayout != null && (ha0Var = chatAttachAlertPhotoLayout.d1) != null) {
                    ha0Var.a(!ciVar2.W1, true);
                }
                ciVar2.b2.m(!ciVar2.W1);
                break;
            case 22:
                sq sqVar = (sq) this.b;
                c20 c20Var2 = (c20) this.c;
                fi.d dVar6 = (fi.d) this.d;
                c20Var2.a(new vf.b(new gp(dVar6, i11), new ro(i7, sqVar, dVar6)));
                break;
            case 23:
                rq rqVar = (rq) this.b;
                Context context3 = (Context) this.c;
                x8 x8Var = (x8) this.d;
                rqVar.getClass();
                g0.g(x8Var.a.getText().toString());
                if (g0.I3()) {
                    Toast.makeText(context3, id.M0(2131744194, null), 0).show();
                    break;
                }
                break;
            case 24:
                ys ysVar = (ys) this.b;
                v vVar = (v) this.c;
                q1 q1Var = (q1) this.d;
                try {
                    charSequence = ((ClipboardManager) ysVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ysVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    vVar.setText(charSequence);
                    vVar.setSelection(0, vVar.getText().length());
                }
                q1Var.run();
                break;
            case 25:
                kt ktVar = (kt) this.b;
                st0 st0Var = (st0) this.c;
                h6 h6Var4 = (h6) this.d;
                et etVar = ktVar.a;
                kg.k kVar = ktVar.b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    i1 i1Var = ktVar.K;
                    if (i1Var == null || !i1Var.f) {
                        if (!ktVar.n) {
                            if (!ktVar.e) {
                                ktVar.x(1);
                                boolean isFocused = etVar.isFocused();
                                ktVar.d.C(etVar.length() > 0, false);
                                etVar.requestFocus();
                                if (!isFocused) {
                                    etVar.setSelection(etVar.length());
                                    break;
                                }
                            } else {
                                if (ktVar.y) {
                                    ktVar.k(true);
                                    ktVar.y = false;
                                    ktVar.p();
                                }
                                ktVar.v();
                                break;
                            }
                        } else {
                            etVar.m();
                            k60 k60Var5 = new k60(st0Var, h6Var4, kVar, false, false, true);
                            k60Var5.X = g0.L(280.0f);
                            etVar.o(null, new h90(k60Var5, etVar));
                            k60Var5.U = true;
                            k60Var5.Z();
                            break;
                        }
                    }
                }
                break;
            case 26:
                d10 d10Var = (d10) this.b;
                Context context4 = (Context) this.c;
                f2 f2Var3 = (f2) this.d;
                d10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context4);
                alertDialog$Builder2.a.R = id.M0(2131749561, null);
                alertDialog$Builder2.a.T = g0.X2(id.M0(2131749562, null));
                alertDialog$Builder2.k(id.M0(2131749563, null), new ax(d10Var, i11));
                alertDialog$Builder2.h(id.M0(2131752589, null), null);
                f2Var3.showDialog(alertDialog$Builder2.a);
                break;
            case 27:
                q70 q70Var = (q70) this.b;
                w2 w2Var4 = (w2) this.c;
                f2 f2Var4 = (f2) this.d;
                try {
                    if (q70Var.b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", q70Var.b));
                        if (w2Var4 == null || (m2Var = w2Var4.c) == null) {
                            gc.j(f2Var4).j();
                        } else {
                            new gc(m2Var, null).k(false).j();
                        }
                    }
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
                break;
            case 28:
                ca0 ca0Var = (ca0) this.b;
                ha0 ha0Var3 = (ha0) this.c;
                ha0 ha0Var4 = (ha0) this.d;
                ia0 ia0Var = ca0Var.c0;
                mj mjVar = ia0Var.d;
                boolean z12 = mjVar.l;
                boolean z13 = !z12;
                mjVar.l = z13;
                if (z12) {
                    if (ia0Var.y) {
                        mjVar.k = false;
                    }
                    ia0Var.y = false;
                } else if (!mjVar.k) {
                    mjVar.k = true;
                    ia0Var.y = true;
                }
                ha0Var3.a(z13, true);
                ha0Var4.a(mjVar.k, true);
                ca0Var.i();
                ca0Var.l(true);
                break;
            default:
                mc0.J0((mc0) this.b, (TLRPC.ChatFull) this.c, (z40) this.d);
                break;
        }
    }

    public /* synthetic */ g(Object obj, Runnable runnable, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = runnable;
        this.c = obj2;
    }
}
