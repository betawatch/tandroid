package ah;

import ai.a1;
import ai.c0;
import ai.v0;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bi.c4;
import bi.h0;
import bi.i4;
import bi.m0;
import bi.r3;
import bi.t6;
import bi.v2;
import bi.y;
import di.a7;
import di.c8;
import di.db;
import di.f8;
import di.i1;
import di.p0;
import di.s2;
import fi.b4;
import fi.c5;
import fi.i9;
import fi.m4;
import fi.t3;
import fi.w1;
import hi.d3;
import hi.ia;
import hi.o8;
import hi.u9;
import hi.x2;
import hi.z2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kg.i0;
import oi.j0;
import oi.y5;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ff;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.messenger.p2;
import org.telegram.messenger.r9;
import org.telegram.messenger.v9;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.p4;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.zq;
import org.telegram.ui.an;
import sg.k0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        ki kiVar;
        boolean u12;
        ia0 ia0Var;
        int i7 = this.a;
        int i10 = 4;
        int i11 = 3;
        int i12 = 6;
        int i13 = 2;
        CharSequence charSequence = null;
        boolean z10 = false;
        z10 = false;
        final int i14 = 1;
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
                e6 e6Var = (e6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    v9.c(yVar.a).e(yVar.T1, new bi.j(yVar, zArr, e6Var, z10 ? 1 : 0));
                    break;
                }
                break;
            case 3:
                m0 m0Var = (m0) obj3;
                int i15 = m0Var.a;
                r9 r9Var = m0Var.i2;
                new i1((Context) obj2, (e6) obj, i15, r9Var.d.title, r9Var.h, false).show();
                m0Var.dismiss();
                break;
            case 4:
                m0 m0Var2 = (m0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                e6 e6Var2 = (e6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    v9.c(m0Var2.a).e(m0Var2.U1, new bi.j(m0Var2, zArr2, e6Var2, 1));
                    break;
                }
                break;
            case 5:
                c4 c4Var = (c4) obj3;
                ((m60) obj2).u();
                wp0 wp0Var = c4Var.a;
                r3 r3Var = new r3(c4Var, (TL_stars.SavedStarGift) obj, z10 ? 1 : 0);
                HashMap hashMap = i4.V;
                wp0Var.h(null, r3Var);
                break;
            case 6:
                Context context = (Context) obj2;
                e6 e6Var3 = (e6) obj;
                if (((p0) obj3).j2.a == cg.b.a) {
                    new db(context, e6Var3).show();
                    break;
                }
                break;
            case 7:
                final u2 u2Var = (u2) obj2;
                final hi.d dVar = (hi.d) obj;
                u2Var.c0 = false;
                dVar.setLoading(true);
                ((f8) obj3).a(new z10() { // from class: di.w8
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i14) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                                if (!booleanValue) {
                                    final int i16 = 0;
                                    final hi.d dVar2 = dVar;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: di.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    u2Var2.c0 = false;
                                                    dVar2.setLoading(false);
                                                    break;
                                                default:
                                                    u2Var2.c0 = false;
                                                    dVar2.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    u2Var2.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.u2 u2Var3 = u2Var;
                                if (!booleanValue2) {
                                    final int i17 = 1;
                                    final hi.d dVar3 = dVar;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: di.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i17) {
                                                case 0:
                                                    u2Var3.c0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    u2Var3.c0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    u2Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 8:
                final u2 u2Var2 = (u2) obj2;
                final hi.d dVar2 = (hi.d) obj;
                u2Var2.c0 = false;
                dVar2.setLoading(true);
                final int i16 = z10 ? 1 : 0;
                ((c8) obj3).a(new z10() { // from class: di.w8
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (i16) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.u2 u2Var22 = u2Var2;
                                if (!booleanValue) {
                                    final int i162 = 0;
                                    final hi.d dVar22 = dVar2;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: di.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i162) {
                                                case 0:
                                                    u2Var22.c0 = false;
                                                    dVar22.setLoading(false);
                                                    break;
                                                default:
                                                    u2Var22.c0 = false;
                                                    dVar22.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    u2Var22.dismiss();
                                    break;
                                }
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.u2 u2Var3 = u2Var2;
                                if (!booleanValue2) {
                                    final int i17 = 1;
                                    final hi.d dVar3 = dVar2;
                                    org.telegram.messenger.g0.i3(new Runnable() { // from class: di.y8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i17) {
                                                case 0:
                                                    u2Var3.c0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                                default:
                                                    u2Var3.c0 = false;
                                                    dVar3.setLoading(false);
                                                    break;
                                            }
                                        }
                                    }, 400L);
                                    break;
                                } else {
                                    u2Var3.dismiss();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 9:
                ((w1) obj3).a(Long.valueOf(((long[]) obj2)[0]));
                ((u2) obj).dismiss();
                break;
            case 10:
                b4 b4Var = ((t3) obj3).x;
                b4Var.D0((o8) obj2, (TL_stories.StoryItem) obj);
                t3 t3Var = b4Var.d1;
                if (t3Var != null) {
                    t3Var.a();
                    break;
                }
                break;
            case 11:
                t3 t3Var2 = (t3) obj3;
                i9 i9Var = (i9) obj;
                ((z0) obj2).performHapticFeedback(3);
                cc X = cc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, g0.U2(hd.M0(2131745933, null), new s2(25, t3Var2, i9Var))).j();
                    break;
                }
                break;
            case 12:
                m4 m4Var = (m4) obj3;
                t6 t6Var = new t6(m4Var, i11);
                c5 c5Var = m4Var.b;
                new wu(t6Var, c5Var.getContext(), c5Var.s, (ArrayList) obj2).show();
                ((m60) obj).u();
                break;
            case 13:
                ia iaVar = (ia) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                fi.b bVar = (fi.b) obj;
                m60 m60Var = iaVar.V0;
                if (m60Var == null || !m60Var.D()) {
                    hi.o oVar = new hi.o(iaVar, z10 ? 1 : 0);
                    boolean q10 = m10.i(iaVar.V).q();
                    hi.o oVar2 = q10 ? null : new hi.o(iaVar, 1);
                    m60 F = m60.F(frameLayout, bVar, iaVar.T0);
                    iaVar.V0 = F;
                    F.p(13, g0.L(200.0f), hd.N0("StoryPeriodHint"));
                    iaVar.V0.k();
                    int i17 = 0;
                    while (true) {
                        int[] iArr = hi.r.Q1;
                        if (i17 >= 4) {
                            m60 m60Var2 = iaVar.V0;
                            m60Var2.s = 0;
                            m60Var2.Z();
                            break;
                        } else {
                            int i18 = iArr[i17];
                            m60 m60Var3 = iaVar.V0;
                            String N0 = i18 == Integer.MAX_VALUE ? hd.N0("StoryPeriodKeep") : hd.G(i18 / 3600, "Hours", new Object[0]);
                            int i19 = j6.E8;
                            m60Var3.b(0, null, N0, i19, i19, new v0(oVar, i18, i12));
                            m60Var3.M((q10 || i18 == 86400 || i18 == Integer.MAX_VALUE) ? null : new a1(oVar2, i18, 1));
                            if (iaVar.X0 == i17) {
                                iaVar.V0.L();
                            }
                            i17++;
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
                    int i20 = -d3Var.O;
                    d3Var.O = i20;
                    g0.F3(i20, z2Var, null);
                    p2.E.a();
                    break;
                } else {
                    arrayList.add(ffVar);
                }
                g0.a4(d3Var.d);
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
                    sg.q qVar = new sg.q(context2, u9Var.q1);
                    u9Var.D1 = qVar;
                    qVar.I0(u9Var.k1.a, 2);
                    qVar.s1 = new androidx.activity.n(u9Var, k0Var, 1);
                    qVar.r1 = new a7(i13, u9Var, k0Var);
                    qVar.show();
                    break;
                }
                break;
            case 16:
                kg.e eVar = (kg.e) obj3;
                m60 F2 = m60.F(((an) obj2).getLayoutContainer(), (e6) obj, eVar.n);
                F2.c(R.drawable.msg_cancel, hd.M0(2131753702, null), new kg.d(eVar, 1), true);
                F2.E();
                if (eVar.y != null) {
                    F2.c(R.drawable.msg_settings, hd.M0(2131753703, null), new kg.d(eVar, i13), false);
                }
                F2.a0(g0.L(10.0f), g0.L(7.0f));
                F2.s = 0;
                F2.Z();
                break;
            case 17:
                i0 i0Var = (i0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                a2 a2Var = (a2) obj;
                hi.d dVar3 = i0Var.Y1;
                if (!dVar3.R) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = np.s1(i0Var.a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(i0Var.a).sendRequest(updateconnectedbot, new v2(20, i0Var, a2Var));
                    break;
                }
                break;
            case 18:
                ni.a aVar = (ni.a) obj3;
                z10 z10Var = (z10) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                boolean z11 = aVar.U1;
                if (chat != null && !org.telegram.messenger.t3.w(27, chat)) {
                    z10 = true;
                }
                aVar.d1(z10Var, z11, z10);
                break;
            case 19:
                ((ga.d) obj3).c();
                ((y5) obj2).D((j0) obj);
                break;
            case 20:
                org.telegram.ui.Components.q qVar2 = (org.telegram.ui.Components.q) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                e6 e6Var4 = (e6) obj;
                hi.d dVar4 = qVar2.b2;
                if (dVar4.d0 && !dVar4.R) {
                    if (!qVar2.d1()) {
                        dVar4.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(qVar2.a).sendRequestTyped(savetone, new d3.b(1), new h0(qVar2, e6Var4, aiComposeTone, i12));
                        break;
                    } else {
                        qVar2.dismiss();
                        break;
                    }
                }
                break;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((r4) obj2).L(-1, 0, true);
                ((u2) ((ou) obj).b).y0.run();
                break;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                p4 p4Var = (p4) obj2;
                t1 t1Var = ((t1[]) obj3)[0];
                if (t1Var != null) {
                    t1Var.setOnDismissListener(null);
                }
                runnable2.run();
                p4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                break;
            case 23:
                gz.o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = np.e1().edit();
                edit.putInt("mapPreviewType", gz.o0);
                edit.apply();
                ((Runnable) obj).run();
                ((AlertDialog$Builder) obj2).a.M0.run();
                break;
            case 24:
                ((x7) obj3).n.X0((w) obj2, (gj) obj);
                break;
            case 25:
                ki kiVar2 = (ki) obj3;
                e2 e2Var = (e2) obj2;
                e6 e6Var5 = (e6) obj;
                e2 e2Var2 = kiVar2.a2;
                int i21 = kiVar2.H3;
                sh shVar = kiVar2.G2;
                ue ueVar = kiVar2.c2;
                long k10 = ueVar != null ? ueVar.k() : 0L;
                kiVar2.L2 = k10;
                shVar.setEffect(k10);
                kiVar2.g1 = true;
                if (kiVar2.F1 - kiVar2.G1 < 0) {
                    g0.E3(kiVar2.u1);
                    g0.E3(kiVar2.v1);
                    try {
                        shVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!np.s1(i21).D3() && np.s1(i21).V4 > kiVar2.G1) {
                        kiVar2.D1(e2Var);
                    }
                    ue ueVar2 = kiVar2.c2;
                    if (ueVar2 != null) {
                        ueVar2.h(false);
                        kiVar2.c2 = null;
                        break;
                    }
                } else {
                    if (kiVar2.F3 == null && (e2Var2 instanceof an)) {
                        an anVar = (an) e2Var2;
                        if (anVar.c()) {
                            t4.J(kiVar2.getContext(), anVar.a(), new c0(kiVar2, k10, i10), e6Var5);
                            kiVar = kiVar2;
                            kiVar.v1(false, false);
                            break;
                        }
                    }
                    ci ciVar = kiVar2.w2;
                    if (ciVar == kiVar2.e2 || ciVar == kiVar2.l2) {
                        kiVar = kiVar2;
                        u12 = kiVar.u1(true, 0, 0, k10, kiVar2.f1());
                    } else {
                        if (!ciVar.M(true, 0, 0, k10, kiVar2.f1())) {
                            kiVar2.B4 = true;
                            kiVar2.dismiss();
                        }
                        u12 = false;
                        kiVar = kiVar2;
                    }
                    ue ueVar3 = kiVar.c2;
                    if (ueVar3 != null) {
                        ueVar3.h(!u12);
                        kiVar.c2 = null;
                    }
                    kiVar.v1(false, false);
                }
                break;
            case 26:
                ki kiVar3 = (ki) obj3;
                gj gjVar = (gj) obj2;
                kiVar3.v1(!kiVar3.X1, true);
                TLRPC.Message message = gjVar.k;
                boolean z12 = kiVar3.X1;
                message.invert_media = z12;
                ((ia0) obj).a(!z12, true);
                kiVar3.c2.f(gjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar3.e2;
                if (chatAttachAlertPhotoLayout != null && (ia0Var = chatAttachAlertPhotoLayout.e1) != null) {
                    ia0Var.a(!kiVar3.X1, true);
                }
                kiVar3.c2.n(!kiVar3.X1);
                break;
            case 27:
                hi.d dVar5 = (hi.d) obj;
                ((z10) obj2).a(new vf.b(new fo(dVar5, i12), new od(26, (ar) obj3, dVar5)));
                break;
            case 28:
                Context context3 = (Context) obj2;
                ((zq) obj3).getClass();
                g0.g(((w8) obj).a.getText().toString());
                if (g0.H3()) {
                    Toast.makeText(context3, hd.M0(2131744194, null), 0).show();
                    break;
                }
                break;
            default:
                ft ftVar = (ft) obj3;
                di.q qVar3 = (di.q) obj2;
                ai.j jVar = (ai.j) obj;
                try {
                    charSequence = ((ClipboardManager) ftVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ftVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    qVar3.setText(charSequence);
                    qVar3.setSelection(0, qVar3.getText().length());
                }
                jVar.run();
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
