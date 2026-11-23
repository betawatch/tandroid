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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cc  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        int i10;
        TLRPC.ChatFull P0;
        org.telegram.ui.fu fuVar;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.jw jwVar;
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
                    lbVar.J.setSubtitle(org.telegram.messenger.gd.N0(2131751062, null));
                } else {
                    lbVar.J.setSubtitle(org.telegram.messenger.gd.N0(2131750900, null));
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
                ((x8) obj).k0();
                break;
            case 3:
                ((qb) ((ob) obj).o1).f();
                fc.e();
                break;
            case 4:
                ((dc) obj).f();
                break;
            case 5:
                yc ycVar = (yc) obj;
                org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                m0 m0Var = new m0(ycVar.getContext(), new fi.b());
                m0Var.x1(ycVar.f.getText());
                m0Var.f2 = new y2(ycVar, 1);
                m0Var.v1(0L, true, new lh(ycVar, i13));
                m0Var.show();
                break;
            case 6:
                int i14 = ChatActivityEnterView.s7;
                ((hd) obj).a(Boolean.TRUE, 0, 0);
                break;
            case 7:
                ((kl) obj).r.V(null, null);
                break;
            case 8:
                fo foVar = (fo) obj;
                foVar.w.setProgress(0.0f);
                foVar.w.d();
                break;
            case 9:
                zp zpVar = (zp) obj;
                if (!zpVar.v1) {
                    int i15 = zpVar.u1;
                    if (i15 != zpVar.t1) {
                        zpVar.v1 = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i7 = 71;
                            i10 = 0;
                            org.telegram.ui.lb lbVar2 = zpVar.w1.a;
                            org.telegram.messenger.mp messagesController = lbVar2.getMessagesController();
                            TLRPC.Chat chat = lbVar2.f;
                            messagesController.T4(i10, -chat.id);
                            P0 = lbVar2.getMessagesController().P0(chat.id);
                            if (P0 != null) {
                                lbVar2.x.k(-chat.id, i7, null, Integer.valueOf(P0.ttl_period), null, null);
                            }
                        }
                        i7 = 70;
                        org.telegram.ui.lb lbVar22 = zpVar.w1.a;
                        org.telegram.messenger.mp messagesController2 = lbVar22.getMessagesController();
                        TLRPC.Chat chat2 = lbVar22.f;
                        messagesController2.T4(i10, -chat2.id);
                        P0 = lbVar22.getMessagesController().P0(chat2.id);
                        if (P0 != null) {
                        }
                    }
                    if (zpVar.v1) {
                        org.telegram.messenger.g0.h3(new lo(zpVar, i13), 200L);
                        break;
                    } else {
                        zpVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((vq) obj).run();
                break;
            case 11:
                ((xr) obj).j1(true);
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
                ax axVar = (ax) obj;
                qy qyVar = axVar.G;
                ArrayList arrayList = qyVar.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.mp.u1(qyVar.d1).i7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    ax axVar2 = qyVar.S;
                    if (axVar2 != null) {
                        axVar2.p(1, 3);
                    }
                    vw vwVar = qyVar.J;
                    if (vwVar != null) {
                        vwVar.p(qyVar.getEmojipacks());
                    }
                    axVar.H();
                    break;
                }
                break;
            case 15:
                ly lyVar = (ly) obj;
                lyVar.getClass();
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                qy qyVar2 = lyVar.R;
                LongSparseArray longSparseArray = qyVar2.z1;
                LongSparseArray longSparseArray2 = qyVar2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (v3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        qyVar2.u1.h(v3Var.getStickerSet());
                        break;
                    } else {
                        v3Var.b(true, true);
                        qyVar2.z1.put(stickerSet.set.id, stickerSet);
                        qyVar2.u1.r(v3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                oz ozVar = (oz) ((di.n4) obj).e;
                if (ozVar.A0 && (fuVar = ozVar.D0) != null) {
                    fuVar.run();
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
                org.telegram.ui.ActionBar.g2 g2Var = g00Var.s1;
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
                                g2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                g2Var.getMessagesController().n2(i16);
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
                            org.telegram.ui.ActionBar.r4 parentLayout = g2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.g2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.bn) {
                                        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) lastFragment;
                                        bnVar.h8();
                                        undoView = bnVar.N3;
                                    } else if (lastFragment instanceof org.telegram.ui.bx) {
                                        undoView = ((org.telegram.ui.bx) lastFragment).l4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).e0();
                                    } else if (lastFragment instanceof org.telegram.ui.jz) {
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
                                        g00Var.v2 = g2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.q1(g00Var, lastFragment, arrayList4, 18));
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
                                        Pair pair = new Pair(new di.x7(messagesController3, i16, z11, i13), new org.telegram.messenger.h10(4, messagesController3, z11));
                                        undoView2.k(0L, 88, g00Var.Y1, Integer.valueOf(arrayList4.size()), new org.telegram.ui.Cells.fa(g00Var, tL_chatlists_joinChatlistInvite, pair, 14), (Runnable) pair.second);
                                        g00Var.w2 = true;
                                        g00Var.dismiss();
                                        g2Var.getMessagesController().n2(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                ph phVar = new ph(8, g00Var, arrayList4);
                                yz yzVar = tL_chatlists_chatlistUpdates != null ? new yz(phVar, parentLayout) : new yz(parentLayout, phVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (g00Var.d2.contains(Long.valueOf(org.telegram.messenger.n5.n((TLRPC.InputPeer) arrayList4.get(i20))))) {
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
                                g00Var.h2.a(true);
                                g00Var.v2 = g2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.v7(17, g00Var, yzVar));
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
                    if (b10Var != null && (jwVar = ((org.telegram.ui.gv) b10Var).a.D0) != null) {
                        jwVar.P(false);
                    }
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        if (c10Var.I != null && ((jg.o0) arrayList7.get(i22)).h) {
                            ((org.telegram.ui.gv) c10Var.I).e((jg.o0) arrayList7.get(i22));
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
                p10 p10Var = (p10) obj;
                p10Var.J0();
                p10Var.dismiss();
                break;
            case 22:
                ((a20) obj).f(false);
                break;
            case 23:
                e20 e20Var = (e20) obj;
                e20Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(e20Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    e20Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.f30 f30Var = (org.telegram.ui.f30) obj;
                f30Var.K0(f30Var.r1);
                f30Var.dismiss();
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
                k1Var.f.addListener(new bi.j7(15, k1Var, z12));
                k1Var.f.setDuration(320L);
                k1Var.f.setInterpolator(kr.h);
                k1Var.f.start();
                break;
            case 27:
                ((w30) obj).dismiss();
                break;
            case 28:
                x60 x60Var = (x60) obj;
                HashSet hashSet = ki.t2.b1;
                if (x60Var.J) {
                    x60Var.v();
                    break;
                }
                break;
            default:
                f70 f70Var = (f70) obj;
                f70Var.z1 = org.telegram.messenger.mp.u1(f70Var.a).l1(org.telegram.messenger.fj.B1(f70Var.x1));
                f70Var.A1 = true;
                f70Var.dismiss();
                break;
        }
    }

    public /* synthetic */ n0(x60 x60Var, ai.k kVar) {
        this.a = 28;
        this.b = x60Var;
    }
}
