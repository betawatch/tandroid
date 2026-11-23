package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.d4;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.kl;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q5;
import org.telegram.messenger.ro;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bw;
import org.telegram.ui.bx;
import org.telegram.ui.bz;
import org.telegram.ui.c00;
import org.telegram.ui.e40;
import org.telegram.ui.fu;
import org.telegram.ui.gv;
import org.telegram.ui.hy;
import org.telegram.ui.i00;
import org.telegram.ui.iy;
import org.telegram.ui.jy;
import org.telegram.ui.jz;
import org.telegram.ui.m4;
import org.telegram.ui.mx;
import org.telegram.ui.n50;
import org.telegram.ui.ny;
import org.telegram.ui.ps;
import org.telegram.ui.sw;
import org.telegram.ui.ts;
import org.telegram.ui.tt;
import org.telegram.ui.ut;
import org.telegram.ui.vs;
import org.telegram.ui.wt;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ek0 ek0Var;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((r) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 1:
                z zVar = (z) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = zVar.G.h;
                u3 u3Var = zVar.x;
                boolean z10 = u3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.a;
                hashMap.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap);
                break;
            case 2:
                z zVar2 = (z) obj;
                ((l0) obj2).getClass();
                zVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new x(zVar2, 4)).setDuration(150L).start();
                break;
            case 3:
                ek0 ek0Var2 = (ek0) obj2;
                if (ek0Var2 != null) {
                    ek0Var2.setOnItemClickListener((qj0) obj);
                    break;
                }
                break;
            case 4:
                dk dkVar = (dk) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i14 = 5;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new o(i14, dkVar, new ArrayList()));
                    break;
                } else {
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = dkVar.f;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        ps psVar = (ps) obj3;
                        String str = psVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.g0.M3(psVar.a).toLowerCase();
                        String str2 = psVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.g0.M3(psVar.b).toLowerCase();
                        String str3 = psVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(M3) || lowerCase3.contains(" ".concat(M3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(M3) || lowerCase5.contains(" ".concat(M3)) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(psVar);
                        }
                    }
                    org.telegram.messenger.g0.g3(new o(5, dkVar, arrayList));
                    break;
                }
            case 5:
                dk dkVar2 = (dk) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ts tsVar = (ts) dkVar2.n;
                if (tsVar.f) {
                    dkVar2.e = arrayList3;
                    if (tsVar.e && (ek0Var = tsVar.a) != null) {
                        v4.i0 adapter = ek0Var.getAdapter();
                        dk dkVar3 = tsVar.d;
                        if (adapter != dkVar3) {
                            tsVar.a.setAdapter(dkVar3);
                            tsVar.a.setFastScrollVisible(false);
                        }
                    }
                    dkVar2.f();
                    break;
                }
                break;
            case 6:
                mp.u1(((vs) obj2).a).V3((TLRPC.Updates) obj, false);
                break;
            case 7:
                tt ttVar = (tt) obj2;
                a0.h hVar = (a0.h) obj;
                ut utVar = ttVar.V2;
                kc.x(utVar.getParentActivity(), utVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, n6.w0(n6.wj, ttVar.J0), n6.w0(n6.yj, ttVar.J0)).j();
                break;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                wt wtVar = (wt) ((a7.d) obj2).c;
                wtVar.a();
                m8 m8Var = wtVar.e;
                wtVar.c();
                int x02 = n6.x0(null, n6.q6, false);
                nh0 nh0Var = wtVar.d;
                nh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (n6.k1()) {
                    m8Var.p(gd.N0(2131745270, null), nh0Var, true);
                    m8Var.x += 2;
                } else {
                    m8Var.p(gd.N0(2131745271, null), nh0Var, true);
                    m8Var.x += 2;
                }
                n6.M1(g2Var);
                break;
            case 9:
                ki.t2.n(((bx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 10:
                bx bxVar = (bx) obj2;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                org.telegram.messenger.g0.h3(new fu(bxVar, 18), 300L);
                break;
            case 11:
                bx bxVar2 = (bx) obj2;
                bxVar2.getMessagesController().e((ArrayList) obj, (bxVar2.Y2 == 0 && bxVar2.a3 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                bx bxVar3 = ((gv) obj2).a;
                bxVar3.J2 = null;
                dp0 dp0Var = bxVar3.I2;
                if (dp0Var != null && dp0Var.h) {
                    dp0Var.e(charSequence, false);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.g2[] g2VarArr = (org.telegram.ui.ActionBar.g2[]) obj;
                ((bw) obj2).b.removeSelfFromStack();
                if (g2VarArr[1] != null) {
                    g2VarArr[0].removeSelfFromStack();
                    g2VarArr[1].finishFragment();
                    break;
                } else {
                    g2VarArr[0].finishFragment();
                    break;
                }
            case 14:
                ArrayList arrayList4 = (ArrayList) obj;
                bx bxVar4 = ((sw) obj2).b;
                boolean z11 = bxVar4.I4(bxVar4.f0[0]) && !bxVar4.U1;
                bxVar4.U4(true, true);
                bxVar4.z3();
                if (z11 && bxVar4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList4.get(i15)).id));
                    }
                    boolean z12 = false;
                    for (int size2 = bxVar4.T1.size() - 1; size2 >= 0; size2--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar4.T1.get(size2);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && bxVar4.H4(bxVar4.f0[0], dialog)) {
                            bxVar4.T1.remove(size2);
                            z12 = true;
                        }
                    }
                    if (z12) {
                        bxVar4.f0[0].q(false);
                    }
                }
                while (i13 < arrayList4.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList4.get(i13)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                    if (bxVar4.getMessagesController().y2(j3) || bxVar4.getMessagesController().F2(j3)) {
                        mp messagesController = bxVar4.getMessagesController();
                        tr messagesStorage = messagesController.getMessagesStorage();
                        kl klVar = new kl(messagesController, j3);
                        q5 q5Var = messagesStorage.a;
                        d4 d4Var = new d4(messagesStorage, j3, klVar, 5);
                        j3 = j3;
                        q5Var.c(d4Var);
                    }
                    bxVar4.getMessagesController().v3(j3, 0L);
                    mp messagesController2 = bxVar4.getMessagesController();
                    int i16 = dialog2.top_message;
                    messagesController2.q3(j3, i16, i16, dialog2.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                break;
            case 15:
                ((sw) obj2).d((ro) obj);
                break;
            case 16:
                mx mxVar = (mx) obj2;
                bn bnVar = mxVar.a;
                jw0 jw0Var = new jw0(bnVar.getParentActivity(), mxVar.a, fj.j1(((fj) obj).k), null, bnVar.a0, bnVar.getResourceProvider());
                boolean V9 = bnVar.V9();
                jw0Var.i0 = V9;
                jw0Var.n = V9;
                bnVar.showDialog(jw0Var);
                break;
            case 17:
                hy hyVar = (hy) obj2;
                hyVar.getClass();
                ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                iy iyVar = hyVar.F;
                jy jyVar = iyVar.c;
                w10 w10Var = jyVar.x;
                if (w10Var != null) {
                    w10Var.a(jyVar.d);
                }
                iyVar.c.finishFragment();
                break;
            case 18:
                jz jzVar = (jz) obj2;
                jy jyVar2 = new jy(jzVar.r, ((bz) obj).m);
                jyVar2.y = new ny(jzVar, i12);
                jyVar2.x = new ny(jzVar, i11);
                jzVar.presentFragment(jyVar2);
                break;
            case 19:
                jz jzVar2 = (jz) obj2;
                jzVar2.h = false;
                jzVar2.s = false;
                jzVar2.r.g = jzVar2.E;
                jzVar2.o0(true);
                jzVar2.getNotificationCenter().k(ks.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 20:
                jz jzVar3 = (jz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = jzVar3.M;
                jzVar3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    jzVar3.getMessagesController().Z3(tL_chatlists_exportedInvites.chats, false);
                    jzVar3.getMessagesController().f4(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    jzVar3.C0();
                }
                jzVar3.N = 0;
                break;
            case 21:
                jz jzVar4 = (jz) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                ro roVar = jzVar4.r;
                if (t1Var != null) {
                    try {
                        t1Var.dismiss();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                jzVar4.getMessagesController().p4(roVar);
                tr messagesStorage2 = jzVar4.getMessagesStorage();
                messagesStorage2.a.c(new rq(i10, messagesStorage2, roVar));
                jzVar4.finishFragment();
                break;
            case 22:
                jz jzVar5 = (jz) obj2;
                jzVar5.getClass();
                jzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 23:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new c00(filtersSetupActivity, i10));
                    break;
                }
                break;
            case 24:
                FiltersSetupActivity filtersSetupActivity2 = ((i00) obj2).e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(ks.O2, new Object[0]);
                break;
            case 25:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((e40) obj2).X3;
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    if (((z) arrayList7.get(i17)).x != null) {
                        arrayList6.remove(((z) arrayList7.get(i17)).x);
                    }
                }
                while (i13 < arrayList6.size()) {
                    u3 u3Var2 = (u3) arrayList6.get(i13);
                    if (u3Var2.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, u3Var2.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(u3Var2.a, u3Var2.b);
                    }
                    i13++;
                }
                break;
            case 26:
                e40 e40Var = (e40) obj2;
                ks.f(e40Var.o1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                e40Var.dismiss();
                break;
            case 27:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap2 = ((o2) obj).e.getBitmap(100, 100);
                    if (bitmap2 == null) {
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new o(28, m4Var, c8.k0.b(bitmap2, true)));
                        break;
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 28:
                ((e40) ((m4) obj2).b).P2.setNewColors((int[]) obj);
                break;
            default:
                n50.a0((n50) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ o(tt ttVar, a0.h hVar, int i7) {
        this.a = 7;
        this.b = ttVar;
        this.c = hVar;
    }
}
