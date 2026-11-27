// default package

import android.content.Context;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mh3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ch3 ch3Var;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        bj3 bj3Var;
        byte b = this.a;
        UndoView undoView = null;
        boolean z = false;
        final byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 1:
                gk3 gk3Var = (gk3) obj;
                uc7.s1(gk3Var.G).s.clear();
                uc7.e1().edit().remove("installReferer").commit();
                gk3Var.f();
                break;
            case 2:
                e29 e29Var = ((tk3) obj).f;
                if (!e29Var.b()) {
                    e29Var.setProgress(0.0f);
                    e29Var.d();
                    break;
                }
                break;
            case 3:
                ((zg3) obj).run();
                break;
            case 4:
                ((fq3) obj).a();
                break;
            case 5:
                ((ly3) obj).I0();
                break;
            case 6:
                Runnable runnable = ((xy3) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                y04 y04Var = (y04) obj;
                o24 o24Var = y04Var.G;
                ArrayList arrayList = o24Var.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    uc7.s1(o24Var.d1).Y3.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    y04 y04Var2 = o24Var.S;
                    if (y04Var2 != null) {
                        y04Var2.q(1, 3);
                    }
                    t04 t04Var = o24Var.J;
                    if (t04Var != null) {
                        t04Var.p(o24Var.getEmojipacks());
                    }
                    y04Var.H();
                    break;
                }
                break;
            case 8:
                h94 h94Var = (h94) view.getParent();
                TLRPC.StickerSetCovered stickerSet = h94Var.getStickerSet();
                o24 o24Var2 = ((j24) obj).R;
                LongSparseArray longSparseArray = o24Var2.z1;
                LongSparseArray longSparseArray2 = o24Var2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (h94Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        o24Var2.u1.i(h94Var.getStickerSet());
                        break;
                    } else {
                        h94Var.b(true, true);
                        longSparseArray.put(stickerSet.set.id, stickerSet);
                        o24Var2.u1.q(h94Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 9:
                ((xd5) obj).dismiss();
                break;
            case 10:
                ((ab0) obj).E0();
                break;
            case 11:
                ((af4) obj).Z0();
                break;
            case 12:
                ((af4) ((zc) obj).b).dismiss();
                break;
            case 13:
                e29 e29Var2 = (e29) ((zc) obj).b;
                if (!e29Var2.b()) {
                    e29Var2.setProgress(0.0f);
                    e29Var2.d();
                    break;
                }
                break;
            case 14:
                ((hf4) obj).c();
                break;
            case 15:
                fg4 fg4Var = (fg4) ((jo0) obj).e;
                if (fg4Var.B0 && (ch3Var = fg4Var.E0) != null) {
                    ch3Var.run();
                    break;
                }
                break;
            case 16:
                eh4 eh4Var = (eh4) obj;
                va6 va6Var = eh4Var.s;
                if ((!eh4Var.r || va6Var.c()) && eh4Var.y != null) {
                    eh4Var.r = true;
                    va6Var.b = -1L;
                    va6Var.c = -1L;
                    eh4Var.n.invalidate();
                    af4.b1(eh4Var.I, eh4Var.y, new lw3((Object) eh4Var, (byte) 27));
                    break;
                }
                break;
            case 17:
                e29 e29Var3 = ((fh4) obj).a;
                if (!e29Var3.b()) {
                    e29Var3.setProgress(0.0f);
                    e29Var3.d();
                    break;
                }
                break;
            case 18:
                final ih4 ih4Var = (ih4) obj;
                eh4 eh4Var2 = (eh4) view.getParent();
                final ac7 currentFilter = eh4Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = ih4Var.e;
                fu5 I = fu5.I(filtersSetupActivity, eh4Var2);
                String M0 = ob6.M0(2131750744, null);
                final boolean z2 = z ? 1 : 0;
                I.b(R.drawable.msg_edit, M0, new Runnable() { // from class: hh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = z2;
                        ac7 ac7Var = currentFilter;
                        ih4 ih4Var2 = ih4Var;
                        switch (b3) {
                            case 0:
                                boolean z3 = ac7Var.p;
                                FiltersSetupActivity filtersSetupActivity2 = ih4Var2.e;
                                if (!z3) {
                                    filtersSetupActivity2.presentFragment(new nf4(ac7Var, null));
                                    break;
                                } else {
                                    Context context = ih4Var2.d;
                                    i = ((e) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new l46(3, i, null, context, filtersSetupActivity2));
                                    break;
                                }
                            default:
                                boolean c = ac7Var.c();
                                FiltersSetupActivity filtersSetupActivity3 = ih4Var2.e;
                                if (!c) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M02 = ob6.M0(2131750755, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M02;
                                    idVar.U = ob6.M0(2131750754, null);
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new u34(ih4Var2, ac7Var, (byte) 3));
                                    filtersSetupActivity3.showDialog(idVar);
                                    TextView textView = (TextView) idVar.c(-1);
                                    if (textView != null) {
                                        yob.X(textView, aob.q7, null);
                                        break;
                                    }
                                } else {
                                    qn4.c1(filtersSetupActivity3, ac7Var.a, new zj3(ih4Var2, (byte) 8));
                                    break;
                                }
                                break;
                        }
                    }
                }, false);
                I.b(R.drawable.msg_delete, ob6.M0(2131750752, null), new Runnable() { // from class: hh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = b2;
                        ac7 ac7Var = currentFilter;
                        ih4 ih4Var2 = ih4Var;
                        switch (b3) {
                            case 0:
                                boolean z3 = ac7Var.p;
                                FiltersSetupActivity filtersSetupActivity2 = ih4Var2.e;
                                if (!z3) {
                                    filtersSetupActivity2.presentFragment(new nf4(ac7Var, null));
                                    break;
                                } else {
                                    Context context = ih4Var2.d;
                                    i = ((e) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new l46(3, i, null, context, filtersSetupActivity2));
                                    break;
                                }
                            default:
                                boolean c = ac7Var.c();
                                FiltersSetupActivity filtersSetupActivity3 = ih4Var2.e;
                                if (!c) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                    String M02 = ob6.M0(2131750755, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M02;
                                    idVar.U = ob6.M0(2131750754, null);
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new u34(ih4Var2, ac7Var, (byte) 3));
                                    filtersSetupActivity3.showDialog(idVar);
                                    TextView textView = (TextView) idVar.c(-1);
                                    if (textView != null) {
                                        yob.X(textView, aob.q7, null);
                                        break;
                                    }
                                } else {
                                    qn4.c1(filtersSetupActivity3, ac7Var.a, new zj3(ih4Var2, (byte) 8));
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                if (ob6.a0) {
                    I.i = (byte) 3;
                }
                I.X(filtersSetupActivity.a.W0(eh4Var2, false));
                I.a0();
                break;
            case 19:
                qn4 qn4Var = (qn4) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = qn4Var.V1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = qn4Var.U1;
                ArrayList arrayList2 = qn4Var.d2;
                boolean z3 = qn4Var.W1;
                ArrayList arrayList3 = qn4Var.b2;
                int i = qn4Var.T1;
                e eVar = qn4Var.r1;
                mn4 mn4Var = qn4Var.g2;
                if (mn4Var == null || !mn4Var.r) {
                    if (arrayList3 == null) {
                        qn4Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z3) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                long n = wf3.n((TLRPC.Peer) arrayList3.get(i2));
                                if (arrayList2.contains(Long.valueOf(n))) {
                                    arrayList4.add(eVar.getMessagesController().j1(n));
                                }
                            }
                            if (z3) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    qn4Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = qn4Var.S1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i;
                                eVar.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                eVar.getMessagesController().i2(i);
                                qn4Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            wk5 parentLayout = eVar.getParentLayout();
                            if (z3) {
                                if (parentLayout != null) {
                                    e lastFragment = parentLayout.getLastFragment();
                                    byte b3 = 2;
                                    if (lastFragment instanceof zu1) {
                                        zu1 zu1Var = (zu1) lastFragment;
                                        zu1Var.i6();
                                        undoView = zu1Var.N3;
                                    } else if (lastFragment instanceof uj3) {
                                        undoView = ((uj3) lastFragment).w3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).c0();
                                    } else if (lastFragment instanceof nf4) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (bp1.m(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity2 = (FiltersSetupActivity) bp1.m(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity2.c0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        qn4Var.g2.a(true);
                                        qn4Var.u2 = eVar.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new fn0((Object) qn4Var, (Object) lastFragment, (Object) arrayList4, (byte) 26));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                                            arrayList5.add(Long.valueOf(wf3.m((TLRPC.InputPeer) arrayList4.get(i3))));
                                        }
                                        uc7 messagesController = eVar.getMessagesController();
                                        ArrayList arrayList6 = messagesController.I0;
                                        messagesController.H0 = new ArrayList(messagesController.G0);
                                        int i4 = 0;
                                        while (i4 < messagesController.H0.size()) {
                                            if (((ac7) messagesController.H0.get(i4)).a == i) {
                                                messagesController.H0.remove(i4);
                                                i4--;
                                            }
                                            i4++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z4 = !isEmpty;
                                        messagesController.getNotificationCenter().k(jn7.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new t64(messagesController, i, z4, b3), new xac((byte) 28, messagesController, z4));
                                        undoView2.k(0L, 88, qn4Var.X1, Integer.valueOf(arrayList4.size()), new re4((Object) qn4Var, (TLObject) tL_chatlists_joinChatlistInvite, (Object) pair, (byte) 6), (Runnable) pair.second);
                                        qn4Var.v2 = true;
                                        qn4Var.dismiss();
                                        eVar.getMessagesController().i2(i);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                rx1 rx1Var = new rx1((Object) qn4Var, (Object) arrayList4, (byte) 22);
                                in4 in4Var = tL_chatlists_chatlistUpdates != null ? new in4(rx1Var, parentLayout) : new in4(parentLayout, rx1Var);
                                int i5 = 0;
                                while (true) {
                                    if (i5 < arrayList4.size()) {
                                        if (qn4Var.c2.contains(Long.valueOf(wf3.m((TLRPC.InputPeer) arrayList4.get(i5))))) {
                                            i5++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            eVar.getMessagesController().q0(1, zArr);
                                            if (zArr[0]) {
                                                eVar.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                qn4Var.g2.a(true);
                                qn4Var.u2 = eVar.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new mw3(qn4Var, in4Var, (byte) 5));
                                break;
                            }
                        } else {
                            mn4 mn4Var2 = qn4Var.g2;
                            int i6 = -qn4Var.x2;
                            qn4Var.x2 = i6;
                            hl.A3(i6, mn4Var2, null);
                            yw0.E.a();
                            break;
                        }
                    } else {
                        qn4Var.dismiss();
                        break;
                    }
                }
                break;
            case 20:
                rq4 rq4Var = (rq4) obj;
                ArrayList arrayList7 = rq4Var.H;
                if (rq4Var.e()) {
                    qq4 qq4Var = rq4Var.J;
                    if (qq4Var != null && (bj3Var = ((xi3) qq4Var).a.D0) != null) {
                        bj3Var.S(false);
                    }
                    for (int i7 = 0; i7 < arrayList7.size(); i7++) {
                        if (rq4Var.J != null && ((ph4) arrayList7.get(i7)).h) {
                            ((xi3) rq4Var.J).a((ph4) arrayList7.get(i7));
                        }
                    }
                    rq4Var.d();
                    break;
                } else {
                    Runnable runnable2 = rq4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        rq4Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 21:
                ((z42) obj).run();
                break;
            case 22:
                ((z42) obj).run();
                break;
            case 23:
                ((sv4) ((rv4) obj)).r.dismiss();
                break;
            case 24:
                ow4 ow4Var = (ow4) obj;
                TextView textView = ow4Var.t1;
                fu5 G = fu5.G(ow4Var.c, ow4Var.J0, textView);
                int[] iArr = ow4.G1;
                for (int i8 = 0; i8 < 6; i8++) {
                    int i9 = iArr[i8];
                    G.h(new hl3((Object) ow4Var, i9, (byte) 10), ob6.G(i9 / 3600, "GiftOfferHours", new Object[0]), i9 == ow4Var.B1);
                }
                G.W(5);
                ow4Var.C0(textView, G, true);
                break;
            case 25:
                bx4 bx4Var = (bx4) obj;
                LinkedHashMap linkedHashMap = bx4Var.Z1;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList(linkedHashMap.values());
                    bx4Var.dismiss();
                    bx4Var.U1.c.a(arrayList8);
                    break;
                }
                break;
            case 26:
                by4 by4Var = (by4) obj;
                by4Var.E0();
                by4Var.dismiss();
                break;
            case 27:
                ((x85) obj).dismiss();
                break;
            case 28:
                ka5 ka5Var = (ka5) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                ka5Var.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            default:
                ((ra5) obj).f(false);
                break;
        }
    }
}
