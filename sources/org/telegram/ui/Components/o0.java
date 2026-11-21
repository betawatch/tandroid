package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cb  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        int i10;
        TLRPC.ChatFull P0;
        org.telegram.ui.gu guVar;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.kw kwVar;
        int i11 = this.a;
        UndoView undoView = null;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                p0 p0Var = (p0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = p0Var.U1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    p0Var.U1 = null;
                }
                a0.h hVar = p0Var.W1;
                if (hVar != null && p0Var.V1 != null && hVar.m() >= p0Var.V1.size()) {
                    p0Var.W1 = null;
                }
                org.telegram.ui.ra raVar = p0Var.c2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = p0Var.U1;
                a0.h hVar2 = p0Var.W1;
                org.telegram.ui.lb lbVar = raVar.a;
                lbVar.v0 = tL_channelAdminLogEventsFilter2;
                lbVar.x0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    lbVar.J.setSubtitle(org.telegram.messenger.gd.N0(2131751062, null));
                } else {
                    lbVar.J.setSubtitle(org.telegram.messenger.gd.N0(2131750900, null));
                }
                lbVar.Z0(true);
                p0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.d2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((y8) obj).k0();
                break;
            case 3:
                ((rb) ((pb) obj).o1).f();
                gc.e();
                break;
            case 4:
                ((ec) obj).f();
                break;
            case 5:
                yc ycVar = (yc) obj;
                org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                n0 n0Var = new n0(ycVar.getContext(), new fi.b());
                n0Var.x1(ycVar.f.getText());
                n0Var.f2 = new z2(ycVar, 1);
                n0Var.v1(0L, true, new mh(ycVar, i13));
                n0Var.show();
                break;
            case 6:
                int i14 = ChatActivityEnterView.s7;
                ((hd) obj).a(Boolean.TRUE, 0, 0);
                break;
            case 7:
                ((ml) obj).r.V(null, null);
                break;
            case 8:
                io ioVar = (io) obj;
                ioVar.w.setProgress(0.0f);
                ioVar.w.d();
                break;
            case 9:
                cq cqVar = (cq) obj;
                if (!cqVar.v1) {
                    int i15 = cqVar.u1;
                    if (i15 != cqVar.t1) {
                        cqVar.v1 = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i7 = 71;
                            i10 = 0;
                            org.telegram.ui.lb lbVar2 = cqVar.w1.a;
                            org.telegram.messenger.mp messagesController = lbVar2.getMessagesController();
                            TLRPC.Chat chat = lbVar2.f;
                            messagesController.T4(i10, -chat.id);
                            P0 = lbVar2.getMessagesController().P0(chat.id);
                            if (P0 != null) {
                                lbVar2.x.k(-chat.id, i7, null, Integer.valueOf(P0.ttl_period), null, null);
                            }
                        }
                        i7 = 70;
                        org.telegram.ui.lb lbVar22 = cqVar.w1.a;
                        org.telegram.messenger.mp messagesController2 = lbVar22.getMessagesController();
                        TLRPC.Chat chat2 = lbVar22.f;
                        messagesController2.T4(i10, -chat2.id);
                        P0 = lbVar22.getMessagesController().P0(chat2.id);
                        if (P0 != null) {
                        }
                    }
                    if (cqVar.v1) {
                        org.telegram.messenger.g0.h3(new oo(cqVar, i13), 200L);
                        break;
                    } else {
                        cqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((yq) obj).run();
                break;
            case 11:
                ((as) obj).j1(true);
                break;
            case 12:
                ((ev) obj).N0();
                break;
            case 13:
                Runnable runnable = ((ov) obj).S;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                dx dxVar = (dx) obj;
                ty tyVar = dxVar.G;
                ArrayList arrayList = tyVar.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.mp.u1(tyVar.d1).i7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    dx dxVar2 = tyVar.S;
                    if (dxVar2 != null) {
                        dxVar2.p(1, 3);
                    }
                    yw ywVar = tyVar.J;
                    if (ywVar != null) {
                        ywVar.p(tyVar.getEmojipacks());
                    }
                    dxVar.H();
                    break;
                }
                break;
            case 15:
                oy oyVar = (oy) obj;
                oyVar.getClass();
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                ty tyVar2 = oyVar.R;
                LongSparseArray longSparseArray = tyVar2.z1;
                LongSparseArray longSparseArray2 = tyVar2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (v3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        tyVar2.u1.h(v3Var.getStickerSet());
                        break;
                    } else {
                        v3Var.b(true, true);
                        tyVar2.z1.put(stickerSet.set.id, stickerSet);
                        tyVar2.u1.r(v3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                rz rzVar = (rz) ((di.n4) obj).e;
                if (rzVar.A0 && (guVar = rzVar.D0) != null) {
                    guVar.run();
                    break;
                }
                break;
            case 17:
                i00 i00Var = (i00) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = i00Var.W1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = i00Var.V1;
                ArrayList arrayList2 = i00Var.e2;
                boolean z10 = i00Var.X1;
                ArrayList arrayList3 = i00Var.c2;
                int i16 = i00Var.U1;
                org.telegram.ui.ActionBar.g2 g2Var = i00Var.s1;
                e00 e00Var = i00Var.h2;
                if (e00Var == null || !e00Var.r) {
                    if (arrayList3 == null) {
                        i00Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList3.get(i17));
                                if (arrayList2.contains(Long.valueOf(o4))) {
                                    arrayList4.add(g2Var.getMessagesController().l1(o4));
                                }
                            }
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i16;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    i00Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = i00Var.T1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i16;
                                g2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                g2Var.getMessagesController().n2(i16);
                                i00Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i16;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.r4 parentLayout = g2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.g2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.bn) {
                                        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) lastFragment;
                                        bnVar.h8();
                                        undoView = bnVar.N3;
                                    } else if (lastFragment instanceof org.telegram.ui.cx) {
                                        undoView = ((org.telegram.ui.cx) lastFragment).l4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).e0();
                                    } else if (lastFragment instanceof org.telegram.ui.kz) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (p5.c.h(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) p5.c.h(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.e0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        i00Var.h2.a(true);
                                        i00Var.v2 = g2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.q1(i00Var, lastFragment, arrayList4, 18));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(org.telegram.messenger.n5.n((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        org.telegram.messenger.mp messagesController3 = g2Var.getMessagesController();
                                        ArrayList arrayList6 = messagesController3.S0;
                                        messagesController3.R0 = new ArrayList(messagesController3.Q0);
                                        int i19 = 0;
                                        while (i19 < messagesController3.R0.size()) {
                                            if (((org.telegram.messenger.ro) messagesController3.R0.get(i19)).a == i16) {
                                                messagesController3.R0.remove(i19);
                                                i19--;
                                            }
                                            i19++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z11 = !isEmpty;
                                        messagesController3.getNotificationCenter().k(org.telegram.messenger.ks.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController3.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new di.x7(messagesController3, i16, z11, i13), new org.telegram.messenger.i10(4, messagesController3, z11));
                                        undoView2.k(0L, 88, i00Var.Y1, Integer.valueOf(arrayList4.size()), new g(i00Var, tL_chatlists_joinChatlistInvite, pair, 13), (Runnable) pair.second);
                                        i00Var.w2 = true;
                                        i00Var.dismiss();
                                        g2Var.getMessagesController().n2(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                rh rhVar = new rh(7, i00Var, arrayList4);
                                a00 a00Var = tL_chatlists_chatlistUpdates != null ? new a00(rhVar, parentLayout) : new a00(parentLayout, rhVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (i00Var.d2.contains(Long.valueOf(org.telegram.messenger.n5.n((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            g2Var.getMessagesController().s0(1, zArr);
                                            if (zArr[0]) {
                                                g2Var.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                i00Var.h2.a(true);
                                i00Var.v2 = g2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.u7(17, i00Var, a00Var));
                                break;
                            }
                        } else {
                            e00 e00Var2 = i00Var.h2;
                            int i21 = -i00Var.y2;
                            i00Var.y2 = i21;
                            org.telegram.messenger.g0.E3(i21, e00Var2, null);
                            org.telegram.messenger.q2.E.a();
                            break;
                        }
                    } else {
                        i00Var.dismiss();
                        break;
                    }
                }
                break;
            case 18:
                e10 e10Var = (e10) obj;
                ArrayList arrayList7 = e10Var.G;
                if (e10Var.d()) {
                    d10 d10Var = e10Var.I;
                    if (d10Var != null && (kwVar = ((org.telegram.ui.hv) d10Var).a.D0) != null) {
                        kwVar.N(false);
                    }
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        if (e10Var.I != null && ((jg.o0) arrayList7.get(i22)).h) {
                            ((org.telegram.ui.hv) e10Var.I).e((jg.o0) arrayList7.get(i22));
                        }
                    }
                    e10Var.c();
                    break;
                } else {
                    Runnable runnable2 = e10Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        e10Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 19:
                ((sl) obj).run();
                break;
            case 20:
                ((sl) obj).run();
                break;
            case 21:
                r10 r10Var = (r10) obj;
                r10Var.J0();
                r10Var.dismiss();
                break;
            case 22:
                ((c20) obj).f(false);
                break;
            case 23:
                g20 g20Var = (g20) obj;
                g20Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(g20Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    g20Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) obj;
                g30Var.K0(g30Var.r1);
                g30Var.dismiss();
                break;
            case 25:
                ((a30) obj).dismiss();
                break;
            case 26:
                f30 f30Var = (f30) obj;
                f30Var.a0(!f30Var.E, true);
                jg.k1 k1Var = f30Var.r;
                boolean z12 = f30Var.E;
                ValueAnimator valueAnimator = k1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(k1Var.e, z12 ? 1.0f : 0.0f);
                k1Var.f = ofFloat;
                ofFloat.addUpdateListener(new fi.d4(k1Var, i12));
                k1Var.f.addListener(new bi.h7(15, k1Var, z12));
                k1Var.f.setDuration(320L);
                k1Var.f.setInterpolator(nr.h);
                k1Var.f.start();
                break;
            case 27:
                ((z30) obj).dismiss();
                break;
            case 28:
                a70 a70Var = (a70) obj;
                HashSet hashSet = ki.s2.b1;
                if (a70Var.J) {
                    a70Var.v();
                    break;
                }
                break;
            default:
                i70 i70Var = (i70) obj;
                i70Var.z1 = org.telegram.messenger.mp.u1(i70Var.a).l1(org.telegram.messenger.fj.B1(i70Var.x1));
                i70Var.A1 = true;
                i70Var.dismiss();
                break;
        }
    }

    public /* synthetic */ o0(a70 a70Var, ai.n nVar) {
        this.a = 28;
        this.b = a70Var;
    }
}
