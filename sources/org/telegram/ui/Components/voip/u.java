package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.bp;
import org.telegram.messenger.d4;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.pi;
import org.telegram.messenger.r20;
import org.telegram.messenger.r5;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wl;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a50;
import org.telegram.ui.aa;
import org.telegram.ui.bx;
import org.telegram.ui.e10;
import org.telegram.ui.ev;
import org.telegram.ui.f60;
import org.telegram.ui.fz;
import org.telegram.ui.g60;
import org.telegram.ui.gz;
import org.telegram.ui.h00;
import org.telegram.ui.hw;
import org.telegram.ui.hz;
import org.telegram.ui.i60;
import org.telegram.ui.j60;
import org.telegram.ui.ky;
import org.telegram.ui.kz;
import org.telegram.ui.m4;
import org.telegram.ui.mt;
import org.telegram.ui.qt;
import org.telegram.ui.qu;
import org.telegram.ui.qx;
import org.telegram.ui.ru;
import org.telegram.ui.tt;
import org.telegram.ui.un;
import org.telegram.ui.z00;
import org.telegram.ui.zx;
import org.telegram.ui.zz;
import w7.l8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        uk0 uk0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 14;
        int i12 = 3;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                ((x) obj2).getClass();
                rVar.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new p(rVar, 4)).setDuration(150L).start();
                break;
            case 1:
                uk0 uk0Var2 = (uk0) obj2;
                if (uk0Var2 != null) {
                    uk0Var2.setOnItemClickListener((hk0) obj);
                    break;
                }
                break;
            case 2:
                pj pjVar = (pj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new u(i12, pjVar, new ArrayList()));
                    break;
                } else {
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = pjVar.f;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        mt mtVar = (mt) obj3;
                        String str = mtVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.i0.N3(mtVar.a).toLowerCase();
                        String str2 = mtVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.i0.N3(mtVar.b).toLowerCase();
                        String str3 = mtVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(N3) || lowerCase5.contains(" ".concat(N3)) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(mtVar);
                        }
                    }
                    org.telegram.messenger.i0.g3(new u(3, pjVar, arrayList));
                    break;
                }
            case 3:
                pj pjVar2 = (pj) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                qt qtVar = (qt) pjVar2.n;
                if (qtVar.f) {
                    pjVar2.e = arrayList3;
                    if (qtVar.e && (uk0Var = qtVar.a) != null) {
                        s4.g0 adapter = uk0Var.getAdapter();
                        pj pjVar3 = qtVar.d;
                        if (adapter != pjVar3) {
                            qtVar.a.setAdapter(pjVar3);
                            qtVar.a.setFastScrollVisible(false);
                        }
                    }
                    pjVar2.f();
                    break;
                }
                break;
            case 4:
                wp.r1(((tt) obj2).a).L3((TLRPC.Updates) obj, false);
                break;
            case 5:
                qu quVar = (qu) obj2;
                a0.h hVar = (a0.h) obj;
                ru ruVar = quVar.R2;
                cc.x(ruVar.getParentActivity(), ruVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, t6.w0(t6.tj, quVar.I0), t6.w0(t6.vj, quVar.I0)).j();
                break;
            case 6:
                zx zxVar = (zx) obj2;
                z2[] z2VarArr = (z2[]) obj;
                z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                }
                org.telegram.messenger.i0.h3(new ev(zxVar, 10), 300L);
                break;
            case 7:
                zx zxVar2 = (zx) obj2;
                zxVar2.getMessagesController().e((ArrayList) obj, (zxVar2.W2 == 0 && zxVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 8:
                xh.m2.n(((zx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                zx zxVar3 = ((hw) obj2).a;
                zxVar3.H2 = null;
                tp0 tp0Var = zxVar3.G2;
                if (tp0Var != null && tp0Var.h) {
                    tp0Var.e(charSequence, false);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.k2[] k2VarArr = (org.telegram.ui.ActionBar.k2[]) obj;
                ((bx) obj2).b.removeSelfFromStack();
                if (k2VarArr[1] != null) {
                    k2VarArr[0].removeSelfFromStack();
                    k2VarArr[1].finishFragment();
                    break;
                } else {
                    k2VarArr[0].finishFragment();
                    break;
                }
            case 11:
                ArrayList arrayList4 = (ArrayList) obj;
                zx zxVar4 = ((qx) obj2).b;
                zxVar4.M4(true, true);
                zxVar4.z3();
                while (i13 < arrayList4.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList4.get(i13)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                    if (zxVar4.getMessagesController().s2(j10) || zxVar4.getMessagesController().y2(j10)) {
                        wp messagesController = zxVar4.getMessagesController();
                        is messagesStorage = messagesController.getMessagesStorage();
                        wl wlVar = new wl(messagesController, j10);
                        r5 r5Var = messagesStorage.a;
                        d4 d4Var = new d4(messagesStorage, j10, wlVar, 5);
                        j10 = j10;
                        r5Var.c(d4Var);
                    }
                    zxVar4.getMessagesController().l3(j10, 0L);
                    wp messagesController2 = zxVar4.getMessagesController();
                    int i14 = dialog.top_message;
                    messagesController2.h3(j10, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                break;
            case 12:
                ((qx) obj2).d((bp) obj);
                break;
            case 13:
                ky kyVar = (ky) obj2;
                un unVar = kyVar.a;
                dx0 dx0Var = new dx0(unVar.getParentActivity(), kyVar.a, kj.k1(((kj) obj).k), null, unVar.Z, unVar.getResourceProvider());
                boolean O9 = unVar.O9();
                dx0Var.h0 = O9;
                dx0Var.n = O9;
                unVar.showDialog(dx0Var);
                break;
            case 14:
                fz fzVar = (fz) obj2;
                fzVar.getClass();
                ((org.telegram.ui.ActionBar.x1) obj).dismiss();
                gz gzVar = fzVar.E;
                hz hzVar = gzVar.c;
                r20 r20Var = hzVar.x;
                if (r20Var != null) {
                    r20Var.a(hzVar.d);
                }
                gzVar.c.finishFragment();
                break;
            case 15:
                h00 h00Var = (h00) obj2;
                hz hzVar2 = new hz(h00Var.r, ((zz) obj).m);
                hzVar2.y = new kz(h00Var, 1);
                hzVar2.x = new kz(h00Var, 2);
                h00Var.presentFragment(hzVar2);
                break;
            case 16:
                h00 h00Var2 = (h00) obj2;
                h00Var2.h = false;
                h00Var2.s = false;
                h00Var2.r.g = h00Var2.D;
                h00Var2.o0(true);
                h00Var2.getNotificationCenter().k(at.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 17:
                h00 h00Var3 = (h00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = h00Var3.L;
                h00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h00Var3.getMessagesController().P3(tL_chatlists_exportedInvites.chats, false);
                    h00Var3.getMessagesController().V3(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    h00Var3.C0();
                }
                h00Var3.M = 0;
                break;
            case 18:
                h00 h00Var4 = (h00) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                bp bpVar = h00Var4.r;
                if (x1Var != null) {
                    try {
                        x1Var.dismiss();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                h00Var4.getMessagesController().e4(bpVar);
                is messagesStorage2 = h00Var4.getMessagesStorage();
                messagesStorage2.a.c(new pi(29, messagesStorage2, bpVar));
                h00Var4.finishFragment();
                break;
            case 19:
                h00 h00Var5 = (h00) obj2;
                h00Var5.getClass();
                h00Var5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 20:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new z00(filtersSetupActivity, i12));
                    break;
                }
                break;
            case 21:
                FiltersSetupActivity filtersSetupActivity2 = ((e10) obj2).e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(at.O2, new Object[0]);
                break;
            case 22:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((a50) obj2).P3;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    if (((r) arrayList7.get(i15)).x != null) {
                        arrayList6.remove(((r) arrayList7.get(i15)).x);
                    }
                }
                while (i13 < arrayList6.size()) {
                    v3 v3Var = (v3) arrayList6.get(i13);
                    if (v3Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, v3Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(v3Var.a, v3Var.b);
                    }
                    i13++;
                }
                break;
            case 23:
                a50 a50Var = (a50) obj2;
                at.f(a50Var.k1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                a50Var.dismiss();
                break;
            case 24:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((z1) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(new u(25, m4Var, l8.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 25:
                ((a50) ((m4) obj2).b).L2.setNewColors((int[]) obj);
                break;
            case 26:
                j60.a0((j60) obj2, (TLRPC.TL_error) obj);
                break;
            case 27:
                f60 f60Var = (f60) obj2;
                String str4 = (String) obj;
                g60 g60Var = f60Var.a;
                g60Var.e = str4;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str4;
                g60Var.c = g60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new t20(i11, f60Var, str4), 66);
                break;
            case 28:
                TLObject tLObject2 = (TLObject) obj;
                g60 g60Var2 = ((f60) obj2).a;
                if (tLObject2 != null) {
                    j60.f0(g60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    j60.f0(g60Var2.h, null);
                    break;
                }
            default:
                i60 i60Var = (i60) obj2;
                String str5 = (String) obj;
                i60Var.h = str5;
                j60 j60Var = i60Var.r;
                if (j60Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                i60Var.n = j60Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(i60Var, str5, str5, i11), 66);
                break;
        }
    }

    public /* synthetic */ u(qu quVar, a0.h hVar, int i10) {
        this.a = 5;
        this.b = quVar;
        this.c = hVar;
    }
}
