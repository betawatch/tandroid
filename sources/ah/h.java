package ah;

import ai.u0;
import ai.z;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bi.e6;
import bi.e9;
import bi.h0;
import bi.m0;
import bi.o1;
import bi.p6;
import bi.v6;
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
import hi.db;
import hi.g3;
import hi.i3;
import hi.i9;
import hi.m3;
import hi.pa;
import hi.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kg.k0;
import m.o3;
import oi.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q2;
import org.telegram.messenger.q9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xd;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ao0;
import org.telegram.ui.bn;
import sg.j0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        ti tiVar;
        boolean v12;
        sa0 sa0Var;
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
                new y((Context) obj2, null, null, (q9) obj).show();
                ((bi.g) obj3).dismiss();
                break;
            case 2:
                y yVar = (y) obj3;
                boolean[] zArr = (boolean[]) obj2;
                i6 i6Var = (i6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    u9.c(yVar.a).e(yVar.T1, new bi.j(yVar, zArr, i6Var, z10 ? 1 : 0));
                    break;
                }
                break;
            case 3:
                m0 m0Var = (m0) obj3;
                int i14 = m0Var.a;
                q9 q9Var = m0Var.i2;
                new h1((Context) obj2, (i6) obj, i14, q9Var.d.title, q9Var.h, false).show();
                m0Var.dismiss();
                break;
            case 4:
                m0 m0Var2 = (m0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                i6 i6Var2 = (i6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    u9.c(m0Var2.a).e(m0Var2.U1, new bi.j(m0Var2, zArr2, i6Var2, 1));
                    break;
                }
                break;
            case 5:
                p6 p6Var = (p6) obj3;
                ((x60) obj2).v();
                fq0 fq0Var = p6Var.a;
                e6 e6Var = new e6(p6Var, (TL_stars.SavedStarGift) obj, z10 ? 1 : 0);
                HashMap hashMap = v6.V;
                fq0Var.h(null, e6Var);
                break;
            case 6:
                Context context = (Context) obj2;
                i6 i6Var3 = (i6) obj;
                if (((o0) obj3).B1.a == cg.b.a) {
                    new gb(context, i6Var3).show();
                    break;
                }
                break;
            case 7:
                final w2 w2Var = (w2) obj2;
                final hi.e eVar = (hi.e) obj;
                w2Var.c0 = false;
                eVar.setLoading(true);
                ((i8) obj3).a(new w10() { // from class: di.z8
                    @Override // org.telegram.messenger.w10
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
                ((f8) obj3).a(new w10() { // from class: di.z8
                    @Override // org.telegram.messenger.w10
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
                z3Var.D0((i9) obj2, (TL_stories.StoryItem) obj);
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
                kc Y = kc.Y();
                if (Y != null) {
                    Y.Q(R.raw.ic_save_to_gallery, 36, g0.T2(gd.N0(2131745737, null), new f2(29, r3Var2, f9Var))).j();
                    break;
                }
                break;
            case 12:
                k4 k4Var = (k4) obj3;
                e9 e9Var = new e9(k4Var, i11);
                b5 b5Var = k4Var.b;
                new bv(e9Var, b5Var.getContext(), b5Var.s, (ArrayList) obj2).show();
                ((x60) obj).v();
                break;
            case 13:
                db dbVar = (db) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                fi.b bVar = (fi.b) obj;
                x60 x60Var = dbVar.V0;
                if (x60Var == null || !x60Var.E()) {
                    hi.p pVar = new hi.p(dbVar, z10 ? 1 : 0);
                    boolean q10 = i10.i(dbVar.V).q();
                    hi.p pVar2 = q10 ? null : new hi.p(dbVar, 1);
                    x60 G = x60.G(frameLayout, bVar, dbVar.T0);
                    dbVar.V0 = G;
                    G.p(13, g0.L(200.0f), gd.O0("StoryPeriodHint"));
                    dbVar.V0.k();
                    int i16 = 0;
                    while (true) {
                        int[] iArr = s.Q1;
                        if (i16 >= 4) {
                            x60 x60Var2 = dbVar.V0;
                            x60Var2.s = 0;
                            x60Var2.a0();
                            break;
                        } else {
                            int i17 = iArr[i16];
                            x60 x60Var3 = dbVar.V0;
                            String O0 = i17 == Integer.MAX_VALUE ? gd.O0("StoryPeriodKeep") : gd.G(i17 / 3600, "Hours", new Object[0]);
                            int i18 = n6.E8;
                            x60Var3.b(0, null, O0, i18, i18, new u0(pVar, i17, 10));
                            x60Var3.N((q10 || i17 == 86400 || i17 == Integer.MAX_VALUE) ? null : new u0(pVar2, i17, 11));
                            if (dbVar.X0 == i16) {
                                dbVar.V0.M();
                            }
                            i16++;
                        }
                    }
                }
                break;
            case 14:
                ef efVar = (ef) obj2;
                i3 i3Var = (i3) obj;
                m3 m3Var = ((g3) obj3).c;
                ArrayList arrayList = m3Var.i0;
                if (arrayList.contains(efVar)) {
                    arrayList.remove(efVar);
                } else if (arrayList.size() + 1 > m3Var.S) {
                    int i19 = -m3Var.O;
                    m3Var.O = i19;
                    g0.E3(i19, i3Var, null);
                    q2.E.a();
                    break;
                } else {
                    arrayList.add(efVar);
                }
                g0.Z3(m3Var.d);
                m3Var.j();
                break;
            case 15:
                pa paVar = (pa) obj3;
                Context context2 = (Context) obj2;
                j0 j0Var = (j0) obj;
                if (!paVar.l1) {
                    Runnable runnable = paVar.u1;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                } else {
                    sg.q qVar = new sg.q(context2, paVar.q1);
                    paVar.D1 = qVar;
                    qVar.J0(paVar.k1.a, 2);
                    qVar.s1 = new androidx.activity.n(paVar, j0Var, 1);
                    qVar.r1 = new d7(i12, paVar, j0Var);
                    qVar.show();
                    break;
                }
                break;
            case 16:
                kg.e eVar3 = (kg.e) obj3;
                x60 G2 = x60.G(((bn) obj2).getLayoutContainer(), (i6) obj, eVar3.n);
                G2.c(R.drawable.msg_cancel, gd.N0(2131753699, null), new kg.d(eVar3, 1), true);
                G2.F();
                if (eVar3.y != null) {
                    G2.c(R.drawable.msg_settings, gd.N0(2131753700, null), new kg.d(eVar3, i12), false);
                }
                G2.b0(g0.L(10.0f), g0.L(7.0f));
                G2.s = 0;
                G2.a0();
                break;
            case 17:
                k0 k0Var = (k0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                ao0 ao0Var = (ao0) obj;
                hi.e eVar4 = k0Var.Y1;
                if (!eVar4.R) {
                    eVar4.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = mp.u1(k0Var.a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(k0Var.a).sendRequest(updateconnectedbot, new o1(21, k0Var, ao0Var));
                    break;
                }
                break;
            case 18:
                ni.a aVar = (ni.a) obj3;
                w10 w10Var = (w10) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                boolean z11 = aVar.U1;
                if (chat != null && !v3.w(27, chat)) {
                    z10 = true;
                }
                aVar.e1(w10Var, z11, z10);
                break;
            case 19:
                ((o3) obj3).a();
                ((a6) obj2).D((oi.k0) obj);
                break;
            case 20:
                v vVar = (v) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                i6 i6Var4 = (i6) obj;
                hi.e eVar5 = vVar.b2;
                if (eVar5.e0 && !eVar5.R) {
                    if (!vVar.e1()) {
                        eVar5.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(vVar.a).sendRequestTyped(savetone, new d3.b(1), new h0(vVar, i6Var4, aiComposeTone, 7));
                        break;
                    } else {
                        vVar.dismiss();
                        break;
                    }
                }
                break;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((z4) obj2).I(-1, 0, true);
                ((w2) ((h6.o) obj).b).y0.run();
                break;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                x4 x4Var = (x4) obj2;
                t1 t1Var = ((t1[]) obj3)[0];
                if (t1Var != null) {
                    t1Var.setOnDismissListener(null);
                }
                runnable2.run();
                x4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 23:
                bz.o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putInt("mapPreviewType", bz.o0);
                edit.apply();
                ((Runnable) obj).run();
                ((AlertDialog$Builder) obj2).a.M0.run();
                break;
            case 24:
                ((d8) obj3).n.Y0((w) obj2, (fj) obj);
                break;
            case 25:
                ti tiVar2 = (ti) obj3;
                g2 g2Var = (g2) obj2;
                i6 i6Var5 = (i6) obj;
                g2 g2Var2 = tiVar2.a2;
                int i20 = tiVar2.H3;
                bi biVar = tiVar2.G2;
                org.telegram.ui.Components.ef efVar2 = tiVar2.c2;
                long k10 = efVar2 != null ? efVar2.k() : 0L;
                tiVar2.L2 = k10;
                biVar.setEffect(k10);
                tiVar2.g1 = true;
                if (tiVar2.F1 - tiVar2.G1 < 0) {
                    g0.D3(tiVar2.u1);
                    g0.D3(tiVar2.v1);
                    try {
                        biVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!mp.u1(i20).K3() && mp.u1(i20).X4 > tiVar2.G1) {
                        tiVar2.E1(g2Var);
                    }
                    org.telegram.ui.Components.ef efVar3 = tiVar2.c2;
                    if (efVar3 != null) {
                        efVar3.h(false);
                        tiVar2.c2 = null;
                        break;
                    }
                } else {
                    if (tiVar2.F3 == null && (g2Var2 instanceof bn)) {
                        bn bnVar = (bn) g2Var2;
                        if (bnVar.c()) {
                            org.telegram.ui.Components.b5.J(tiVar2.getContext(), bnVar.a(), new z(tiVar2, k10, i10), i6Var5);
                            tiVar = tiVar2;
                            tiVar.w1(false, false);
                            break;
                        }
                    }
                    li liVar = tiVar2.w2;
                    if (liVar == tiVar2.e2 || liVar == tiVar2.l2) {
                        tiVar = tiVar2;
                        v12 = tiVar.v1(true, 0, 0, k10, tiVar2.g1());
                    } else {
                        if (!liVar.M(true, 0, 0, k10, tiVar2.g1())) {
                            tiVar2.B4 = true;
                            tiVar2.dismiss();
                        }
                        v12 = false;
                        tiVar = tiVar2;
                    }
                    org.telegram.ui.Components.ef efVar4 = tiVar.c2;
                    if (efVar4 != null) {
                        efVar4.h(!v12);
                        tiVar.c2 = null;
                    }
                    tiVar.w1(false, false);
                }
                break;
            case 26:
                ti tiVar3 = (ti) obj3;
                fj fjVar = (fj) obj2;
                tiVar3.w1(!tiVar3.X1, true);
                TLRPC.Message message = fjVar.k;
                boolean z12 = tiVar3.X1;
                message.invert_media = z12;
                ((sa0) obj).a(!z12, true);
                tiVar3.c2.f(fjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar3.e2;
                if (chatAttachAlertPhotoLayout != null && (sa0Var = chatAttachAlertPhotoLayout.e1) != null) {
                    sa0Var.a(!tiVar3.X1, true);
                }
                tiVar3.c2.n(!tiVar3.X1);
                break;
            case 27:
                hi.e eVar6 = (hi.e) obj;
                ((w10) obj2).a(new vf.b(new lo(eVar6, 6), new xd(26, (gr) obj3, eVar6)));
                break;
            case 28:
                Context context3 = (Context) obj2;
                ((fr) obj3).getClass();
                g0.g(((x8) obj).a.getText().toString());
                if (g0.G3()) {
                    Toast.makeText(context3, gd.N0(2131743949, null), 0).show();
                    break;
                }
                break;
            default:
                mt mtVar = (mt) obj3;
                di.q qVar2 = (di.q) obj2;
                ai.e eVar7 = (ai.e) obj;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    qVar2.setText(charSequence);
                    qVar2.setSelection(0, qVar2.getText().length());
                }
                eVar7.run();
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
