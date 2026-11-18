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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i7) {
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
                o0 o0Var = (o0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = o0Var.U1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    o0Var.U1 = null;
                }
                a0.h hVar = o0Var.W1;
                if (hVar != null && o0Var.V1 != null && hVar.m() >= o0Var.V1.size()) {
                    o0Var.W1 = null;
                }
                org.telegram.ui.ra raVar = o0Var.c2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = o0Var.U1;
                a0.h hVar2 = o0Var.W1;
                org.telegram.ui.lb lbVar = raVar.a;
                lbVar.v0 = tL_channelAdminLogEventsFilter2;
                lbVar.x0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    lbVar.J.setSubtitle(org.telegram.messenger.gd.M0(2131751063, null));
                } else {
                    lbVar.J.setSubtitle(org.telegram.messenger.gd.M0(2131750901, null));
                }
                lbVar.Z0(true);
                o0Var.dismiss();
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
                m0 m0Var = new m0(ycVar.getContext(), new fi.b());
                m0Var.x1(ycVar.f.getText());
                m0Var.f2 = new y2(ycVar, 1);
                m0Var.v1(0L, true, new kh(ycVar, i13));
                m0Var.show();
                break;
            case 6:
                int i14 = ChatActivityEnterView.n7;
                ((hd) obj).a(Boolean.TRUE, 0, 0);
                break;
            case 7:
                ((kl) obj).r.V(null, null);
                break;
            case 8:
                go goVar = (go) obj;
                goVar.w.setProgress(0.0f);
                goVar.w.d();
                break;
            case 9:
                aq aqVar = (aq) obj;
                if (!aqVar.v1) {
                    int i15 = aqVar.u1;
                    if (i15 != aqVar.t1) {
                        aqVar.v1 = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i7 = 71;
                            i10 = 0;
                            org.telegram.ui.lb lbVar2 = aqVar.w1.a;
                            org.telegram.messenger.mp messagesController = lbVar2.getMessagesController();
                            TLRPC.Chat chat = lbVar2.f;
                            messagesController.T4(i10, -chat.id);
                            P0 = lbVar2.getMessagesController().P0(chat.id);
                            if (P0 != null) {
                                lbVar2.x.k(-chat.id, i7, null, Integer.valueOf(P0.ttl_period), null, null);
                            }
                        }
                        i7 = 70;
                        org.telegram.ui.lb lbVar22 = aqVar.w1.a;
                        org.telegram.messenger.mp messagesController2 = lbVar22.getMessagesController();
                        TLRPC.Chat chat2 = lbVar22.f;
                        messagesController2.T4(i10, -chat2.id);
                        P0 = lbVar22.getMessagesController().P0(chat2.id);
                        if (P0 != null) {
                        }
                    }
                    if (aqVar.v1) {
                        org.telegram.messenger.g0.h3(new mo(aqVar, i13), 200L);
                        break;
                    } else {
                        aqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((wq) obj).run();
                break;
            case 11:
                ((yr) obj).j1(true);
                break;
            case 12:
                ((bv) obj).N0();
                break;
            case 13:
                Runnable runnable = ((lv) obj).S;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                bx bxVar = (bx) obj;
                ry ryVar = bxVar.G;
                ArrayList arrayList = ryVar.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.mp.u1(ryVar.d1).i7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    bx bxVar2 = ryVar.S;
                    if (bxVar2 != null) {
                        bxVar2.p(1, 3);
                    }
                    ww wwVar = ryVar.J;
                    if (wwVar != null) {
                        wwVar.p(ryVar.getEmojipacks());
                    }
                    bxVar.H();
                    break;
                }
                break;
            case 15:
                my myVar = (my) obj;
                myVar.getClass();
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                ry ryVar2 = myVar.R;
                LongSparseArray longSparseArray = ryVar2.z1;
                LongSparseArray longSparseArray2 = ryVar2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (v3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        ryVar2.u1.h(v3Var.getStickerSet());
                        break;
                    } else {
                        v3Var.b(true, true);
                        ryVar2.z1.put(stickerSet.set.id, stickerSet);
                        ryVar2.u1.r(v3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                pz pzVar = (pz) ((di.n4) obj).e;
                if (pzVar.A0 && (guVar = pzVar.D0) != null) {
                    guVar.run();
                    break;
                }
                break;
            case 17:
                g00 g00Var = (g00) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = g00Var.W1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = g00Var.V1;
                ArrayList arrayList2 = g00Var.e2;
                boolean z10 = g00Var.X1;
                ArrayList arrayList3 = g00Var.c2;
                int i16 = g00Var.U1;
                org.telegram.ui.ActionBar.h2 h2Var = g00Var.s1;
                c00 c00Var = g00Var.h2;
                if (c00Var == null || !c00Var.r) {
                    if (arrayList3 == null) {
                        g00Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) arrayList3.get(i17));
                                if (arrayList2.contains(Long.valueOf(o4))) {
                                    arrayList4.add(h2Var.getMessagesController().l1(o4));
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
                                    g00Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = g00Var.T1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i16;
                                h2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                h2Var.getMessagesController().n2(i16);
                                g00Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i16;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.s4 parentLayout = h2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.h2 lastFragment = parentLayout.getLastFragment();
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
                                        g00Var.h2.a(true);
                                        g00Var.v2 = h2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.m1(g00Var, lastFragment, arrayList4, 18));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(org.telegram.messenger.n5.n((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        org.telegram.messenger.mp messagesController3 = h2Var.getMessagesController();
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
                                        undoView2.k(0L, 88, g00Var.Y1, Integer.valueOf(arrayList4.size()), new k7((Object) g00Var, (TLObject) tL_chatlists_joinChatlistInvite, (Object) pair, 12), (Runnable) pair.second);
                                        g00Var.w2 = true;
                                        g00Var.dismiss();
                                        h2Var.getMessagesController().n2(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                ph phVar = new ph(7, g00Var, arrayList4);
                                yz yzVar = tL_chatlists_chatlistUpdates != null ? new yz(phVar, parentLayout) : new yz(parentLayout, phVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (g00Var.d2.contains(Long.valueOf(org.telegram.messenger.n5.n((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            h2Var.getMessagesController().s0(1, zArr);
                                            if (zArr[0]) {
                                                h2Var.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                g00Var.h2.a(true);
                                g00Var.v2 = h2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.u7(17, g00Var, yzVar));
                                break;
                            }
                        } else {
                            c00 c00Var2 = g00Var.h2;
                            int i21 = -g00Var.y2;
                            g00Var.y2 = i21;
                            org.telegram.messenger.g0.E3(i21, c00Var2, null);
                            org.telegram.messenger.q2.E.a();
                            break;
                        }
                    } else {
                        g00Var.dismiss();
                        break;
                    }
                }
                break;
            case 18:
                c10 c10Var = (c10) obj;
                ArrayList arrayList7 = c10Var.G;
                if (c10Var.d()) {
                    b10 b10Var = c10Var.I;
                    if (b10Var != null && (kwVar = ((org.telegram.ui.hv) b10Var).a.D0) != null) {
                        kwVar.N(false);
                    }
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        if (c10Var.I != null && ((jg.o0) arrayList7.get(i22)).h) {
                            ((org.telegram.ui.hv) c10Var.I).e((jg.o0) arrayList7.get(i22));
                        }
                    }
                    c10Var.c();
                    break;
                } else {
                    Runnable runnable2 = c10Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        c10Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 19:
                ((ql) obj).run();
                break;
            case 20:
                ((ql) obj).run();
                break;
            case 21:
                o10 o10Var = (o10) obj;
                o10Var.J0();
                o10Var.dismiss();
                break;
            case 22:
                ((z10) obj).f(false);
                break;
            case 23:
                d20 d20Var = (d20) obj;
                d20Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(d20Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    d20Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) obj;
                g30Var.K0(g30Var.r1);
                g30Var.dismiss();
                break;
            case 25:
                ((x20) obj).dismiss();
                break;
            case 26:
                c30 c30Var = (c30) obj;
                c30Var.a0(!c30Var.E, true);
                jg.k1 k1Var = c30Var.r;
                boolean z12 = c30Var.E;
                ValueAnimator valueAnimator = k1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(k1Var.e, z12 ? 1.0f : 0.0f);
                k1Var.f = ofFloat;
                ofFloat.addUpdateListener(new fi.d4(k1Var, i12));
                k1Var.f.addListener(new bi.d7(15, k1Var, z12));
                k1Var.f.setDuration(320L);
                k1Var.f.setInterpolator(lr.h);
                k1Var.f.start();
                break;
            case 27:
                ((w30) obj).dismiss();
                break;
            case 28:
                y60 y60Var = (y60) obj;
                HashSet hashSet = ki.t2.b1;
                if (y60Var.J) {
                    y60Var.v();
                    break;
                }
                break;
            default:
                g70 g70Var = (g70) obj;
                g70Var.z1 = org.telegram.messenger.mp.u1(g70Var.a).l1(org.telegram.messenger.fj.B1(g70Var.x1));
                g70Var.A1 = true;
                g70Var.dismiss();
                break;
        }
    }

    public /* synthetic */ n0(y60 y60Var, ai.o oVar) {
        this.a = 28;
        this.b = y60Var;
    }
}
