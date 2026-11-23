package ah;

import ai.c1;
import ai.d0;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bi.b6;
import bi.b9;
import bi.h0;
import bi.m0;
import bi.m6;
import bi.o1;
import bi.s6;
import bi.y;
import di.d7;
import di.f2;
import di.f8;
import di.gb;
import di.h1;
import di.i8;
import di.o0;
import fi.b5;
import fi.f9;
import fi.k4;
import fi.r3;
import fi.u1;
import fi.z3;
import hi.d3;
import hi.ia;
import hi.n8;
import hi.t;
import hi.u9;
import hi.w4;
import hi.x2;
import hi.z2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import oi.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.ff;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.q2;
import org.telegram.messenger.r9;
import org.telegram.messenger.v3;
import org.telegram.messenger.v9;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.w;
import org.telegram.ui.Components.y4;
import org.telegram.ui.bn;
import org.telegram.ui.jw0;
import sg.k0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ui uiVar;
        boolean v12;
        va0 va0Var;
        int i7 = this.a;
        int i10 = 4;
        int i11 = 3;
        int i12 = 2;
        CharSequence charSequence = null;
        boolean z10 = false;
        z10 = false;
        final int i13 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                ((o) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                break;
            case 1:
                new y((Context) obj2, null, null, (r9) obj).show();
                ((bi.g) obj3).dismiss();
                break;
            case 2:
                y yVar = (y) obj3;
                boolean[] zArr = (boolean[]) obj2;
                h6 h6Var = (h6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    v9.c(yVar.a).e(yVar.T1, new bi.j(yVar, zArr, h6Var, z10 ? 1 : 0));
                    break;
                }
                break;
            case 3:
                m0 m0Var = (m0) obj3;
                int i14 = m0Var.a;
                r9 r9Var = m0Var.i2;
                new h1((Context) obj2, (h6) obj, i14, r9Var.d.title, r9Var.h, false).show();
                m0Var.dismiss();
                break;
            case 4:
                m0 m0Var2 = (m0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                h6 h6Var2 = (h6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    v9.c(m0Var2.a).e(m0Var2.U1, new bi.j(m0Var2, zArr2, h6Var2, 1));
                    break;
                }
                break;
            case 5:
                m6 m6Var = (m6) obj3;
                ((a70) obj2).v();
                gq0 gq0Var = m6Var.a;
                b6 b6Var = new b6(m6Var, (TL_stars.SavedStarGift) obj, z10 ? 1 : 0);
                HashMap hashMap = s6.V;
                gq0Var.h(null, b6Var);
                break;
            case 6:
                Context context = (Context) obj2;
                h6 h6Var3 = (h6) obj;
                if (((o0) obj3).B1.a == cg.b.a) {
                    new gb(context, h6Var3).show();
                    break;
                }
                break;
            case 7:
                final w2 w2Var = (w2) obj2;
                final hi.e eVar = (hi.e) obj;
                w2Var.c0 = false;
                eVar.setLoading(true);
                ((i8) obj3).a(new y10() { // from class: di.z8
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i13) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                if (!booleanValue) {
                                    final int i15 = 0;
                                    final hi.e eVar2 = eVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.b9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    w2Var2.c0 = false;
                                                    eVar2.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var2.c0 = false;
                                                    eVar2.setLoading(false);
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
                                    final int i16 = 1;
                                    final hi.e eVar3 = eVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.b9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    w2Var3.c0 = false;
                                                    eVar3.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var3.c0 = false;
                                                    eVar3.setLoading(false);
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
            case 8:
                final w2 w2Var2 = (w2) obj2;
                final hi.e eVar2 = (hi.e) obj;
                w2Var2.c0 = false;
                eVar2.setLoading(true);
                final int i15 = z10 ? 1 : 0;
                ((f8) obj3).a(new y10() { // from class: di.z8
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i15) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var22 = w2Var2;
                                if (!booleanValue) {
                                    final int i152 = 0;
                                    final hi.e eVar22 = eVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.b9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i152) {
                                                case 0:
                                                    w2Var22.c0 = false;
                                                    eVar22.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var22.c0 = false;
                                                    eVar22.setLoading(false);
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
                                    final int i16 = 1;
                                    final hi.e eVar3 = eVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.b9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    w2Var3.c0 = false;
                                                    eVar3.setLoading(false);
                                                    break;
                                                default:
                                                    w2Var3.c0 = false;
                                                    eVar3.setLoading(false);
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
            case 9:
                ((u1) obj3).a(Long.valueOf(((long[]) obj2)[0]));
                ((w2) obj).dismiss();
                break;
            case 10:
                z3 z3Var = ((r3) obj3).x;
                z3Var.D0((n8) obj2, (TL_stories.StoryItem) obj);
                r3 r3Var = z3Var.d1;
                if (r3Var != null) {
                    r3Var.a();
                    break;
                }
                break;
            case 11:
                r3 r3Var2 = (r3) obj3;
                f9 f9Var = (f9) obj;
                ((y0) obj2).performHapticFeedback(3);
                lc Y = lc.Y();
                if (Y != null) {
                    Y.Q(R.raw.ic_save_to_gallery, 36, g0.T2(hd.N0(2131745737, null), new f2(29, r3Var2, f9Var))).j();
                    break;
                }
                break;
            case 12:
                k4 k4Var = (k4) obj3;
                b9 b9Var = new b9(k4Var, i11);
                b5 b5Var = k4Var.b;
                new ev(b9Var, b5Var.getContext(), b5Var.s, (ArrayList) obj2).show();
                ((a70) obj).v();
                break;
            case 13:
                ia iaVar = (ia) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                fi.b bVar = (fi.b) obj;
                a70 a70Var = iaVar.V0;
                if (a70Var == null || !a70Var.E()) {
                    hi.q qVar = new hi.q(iaVar, z10 ? 1 : 0);
                    boolean q10 = k10.i(iaVar.V).q();
                    hi.q qVar2 = q10 ? null : new hi.q(iaVar, 1);
                    a70 G = a70.G(frameLayout, bVar, iaVar.T0);
                    iaVar.V0 = G;
                    G.p(13, g0.L(200.0f), hd.O0("StoryPeriodHint"));
                    iaVar.V0.k();
                    int i16 = 0;
                    while (true) {
                        int[] iArr = t.Q1;
                        if (i16 >= 4) {
                            a70 a70Var2 = iaVar.V0;
                            a70Var2.s = 0;
                            a70Var2.a0();
                            break;
                        } else {
                            int i17 = iArr[i16];
                            a70 a70Var3 = iaVar.V0;
                            String O0 = i17 == Integer.MAX_VALUE ? hd.O0("StoryPeriodKeep") : hd.G(i17 / 3600, "Hours", new Object[0]);
                            int i18 = org.telegram.ui.ActionBar.m6.E8;
                            a70Var3.b(0, null, O0, i18, i18, new c1(qVar, i17, 9));
                            a70Var3.N((q10 || i17 == 86400 || i17 == Integer.MAX_VALUE) ? null : new ai.y0(qVar2, i17, 1));
                            if (iaVar.X0 == i16) {
                                iaVar.V0.M();
                            }
                            i16++;
                        }
                    }
                }
                break;
            case 14:
                ff ffVar = (ff) obj2;
                z2 z2Var = (z2) obj;
                d3 d3Var = ((x2) obj3).c;
                ArrayList arrayList = d3Var.i0;
                if (arrayList.contains(ffVar)) {
                    arrayList.remove(ffVar);
                } else if (arrayList.size() + 1 > d3Var.S) {
                    int i19 = -d3Var.O;
                    d3Var.O = i19;
                    g0.E3(i19, z2Var, null);
                    q2.E.a();
                    break;
                } else {
                    arrayList.add(ffVar);
                }
                g0.Z3(d3Var.d);
                d3Var.j();
                break;
            case 15:
                u9 u9Var = (u9) obj3;
                Context context2 = (Context) obj2;
                k0 k0Var = (k0) obj;
                if (!u9Var.l1) {
                    Runnable runnable = u9Var.u1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    sg.q qVar3 = new sg.q(context2, u9Var.q1);
                    u9Var.D1 = qVar3;
                    qVar3.J0(u9Var.k1.a, 2);
                    qVar3.s1 = new androidx.activity.n(u9Var, k0Var, 1);
                    qVar3.r1 = new d7(i12, u9Var, k0Var);
                    qVar3.show();
                    break;
                }
                break;
            case 16:
                kg.e eVar3 = (kg.e) obj3;
                a70 G2 = a70.G(((bn) obj2).getLayoutContainer(), (h6) obj, eVar3.n);
                G2.c(R.drawable.msg_cancel, hd.N0(2131753699, null), new kg.d(eVar3, 1), true);
                G2.F();
                if (eVar3.y != null) {
                    G2.c(R.drawable.msg_settings, hd.N0(2131753700, null), new kg.d(eVar3, i12), false);
                }
                G2.b0(g0.L(10.0f), g0.L(7.0f));
                G2.s = 0;
                G2.a0();
                break;
            case 17:
                kg.k0 k0Var2 = (kg.k0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                jw0 jw0Var = (jw0) obj;
                hi.e eVar4 = k0Var2.Y1;
                if (!eVar4.R) {
                    eVar4.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = np.u1(k0Var2.a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(k0Var2.a).sendRequest(updateconnectedbot, new o1(21, k0Var2, jw0Var));
                    break;
                }
                break;
            case 18:
                ni.a aVar = (ni.a) obj3;
                y10 y10Var = (y10) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                boolean z11 = aVar.U1;
                if (chat != null && !v3.w(27, chat)) {
                    z10 = true;
                }
                aVar.e1(y10Var, z11, z10);
                break;
            case 19:
                ((ga.d) obj3).c();
                ((a6) obj2).D((oi.k0) obj);
                break;
            case 20:
                w wVar = (w) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                h6 h6Var4 = (h6) obj;
                hi.e eVar5 = wVar.b2;
                if (eVar5.e0 && !eVar5.R) {
                    if (!wVar.e1()) {
                        eVar5.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(wVar.a).sendRequestTyped(savetone, new d3.b(1), new h0(wVar, h6Var4, aiComposeTone, 7));
                        break;
                    } else {
                        wVar.dismiss();
                        break;
                    }
                }
                break;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((a5) obj2).O(-1, 0, true);
                ((w2) ((w4) obj).b).y0.run();
                break;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                y4 y4Var = (y4) obj2;
                t1 t1Var = ((t1[]) obj3)[0];
                if (t1Var != null) {
                    t1Var.setOnDismissListener(null);
                }
                runnable2.run();
                y4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 23:
                cz.o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = np.g1().edit();
                edit.putInt("mapPreviewType", cz.o0);
                edit.apply();
                ((Runnable) obj).run();
                ((AlertDialog$Builder) obj2).a.M0.run();
                break;
            case 24:
                ((e8) obj3).n.Y0((org.telegram.ui.Cells.w) obj2, (gj) obj);
                break;
            case 25:
                ui uiVar2 = (ui) obj3;
                g2 g2Var = (g2) obj2;
                h6 h6Var5 = (h6) obj;
                g2 g2Var2 = uiVar2.a2;
                int i20 = uiVar2.H3;
                ci ciVar = uiVar2.G2;
                df dfVar = uiVar2.c2;
                long k10 = dfVar != null ? dfVar.k() : 0L;
                uiVar2.L2 = k10;
                ciVar.setEffect(k10);
                uiVar2.g1 = true;
                if (uiVar2.F1 - uiVar2.G1 < 0) {
                    g0.D3(uiVar2.u1);
                    g0.D3(uiVar2.v1);
                    try {
                        ciVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!np.u1(i20).K3() && np.u1(i20).X4 > uiVar2.G1) {
                        uiVar2.E1(g2Var);
                    }
                    df dfVar2 = uiVar2.c2;
                    if (dfVar2 != null) {
                        dfVar2.h(false);
                        uiVar2.c2 = null;
                        break;
                    }
                } else {
                    if (uiVar2.F3 == null && (g2Var2 instanceof bn)) {
                        bn bnVar = (bn) g2Var2;
                        if (bnVar.c()) {
                            c5.J(uiVar2.getContext(), bnVar.a(), new d0(uiVar2, k10, i10), h6Var5);
                            uiVar = uiVar2;
                            uiVar.w1(false, false);
                            break;
                        }
                    }
                    mi miVar = uiVar2.w2;
                    if (miVar == uiVar2.e2 || miVar == uiVar2.l2) {
                        uiVar = uiVar2;
                        v12 = uiVar.v1(true, 0, 0, k10, uiVar2.g1());
                    } else {
                        if (!miVar.M(true, 0, 0, k10, uiVar2.g1())) {
                            uiVar2.B4 = true;
                            uiVar2.dismiss();
                        }
                        v12 = false;
                        uiVar = uiVar2;
                    }
                    df dfVar3 = uiVar.c2;
                    if (dfVar3 != null) {
                        dfVar3.h(!v12);
                        uiVar.c2 = null;
                    }
                    uiVar.w1(false, false);
                }
                break;
            case 26:
                ui uiVar3 = (ui) obj3;
                gj gjVar = (gj) obj2;
                uiVar3.w1(!uiVar3.X1, true);
                TLRPC.Message message = gjVar.k;
                boolean z12 = uiVar3.X1;
                message.invert_media = z12;
                ((va0) obj).a(!z12, true);
                uiVar3.c2.f(gjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar3.e2;
                if (chatAttachAlertPhotoLayout != null && (va0Var = chatAttachAlertPhotoLayout.e1) != null) {
                    va0Var.a(!uiVar3.X1, true);
                }
                uiVar3.c2.n(!uiVar3.X1);
                break;
            case 27:
                hi.e eVar6 = (hi.e) obj;
                ((y10) obj2).a(new vf.b(new oo(eVar6, 6), new mf(24, (jr) obj3, eVar6)));
                break;
            case 28:
                Context context3 = (Context) obj2;
                ((ir) obj3).getClass();
                g0.g(((y8) obj).a.getText().toString());
                if (g0.G3()) {
                    Toast.makeText(context3, hd.N0(2131743951, null), 0).show();
                    break;
                }
                break;
            default:
                ot otVar = (ot) obj3;
                di.q qVar4 = (di.q) obj2;
                ai.i iVar = (ai.i) obj;
                try {
                    charSequence = ((ClipboardManager) otVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(otVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    qVar4.setText(charSequence);
                    qVar4.setSelection(0, qVar4.getText().length());
                }
                iVar.run();
                break;
        }
    }

    public /* synthetic */ h(Object obj, Runnable runnable, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = runnable;
        this.c = obj2;
    }
}
