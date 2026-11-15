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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        int i10;
        TLRPC.ChatFull N0;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.hw hwVar;
        int i11 = this.a;
        UndoView undoView = null;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                f0 f0Var = (f0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = f0Var.U1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    f0Var.U1 = null;
                }
                a0.h hVar = f0Var.W1;
                if (hVar != null && f0Var.V1 != null && hVar.m() >= f0Var.V1.size()) {
                    f0Var.W1 = null;
                }
                org.telegram.ui.ra raVar = f0Var.c2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = f0Var.U1;
                a0.h hVar2 = f0Var.W1;
                org.telegram.ui.lb lbVar = raVar.a;
                lbVar.v0 = tL_channelAdminLogEventsFilter2;
                lbVar.x0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    lbVar.J.setSubtitle(org.telegram.messenger.hd.M0(2131751074, null));
                } else {
                    lbVar.J.setSubtitle(org.telegram.messenger.hd.M0(2131750912, null));
                }
                lbVar.Z0(true);
                f0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.c2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((q8) obj).k0();
                break;
            case 3:
                ((ib) ((gb) obj).o1).f();
                xb.e();
                break;
            case 4:
                ((vb) obj).f();
                break;
            case 5:
                pc pcVar = (pc) obj;
                org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                d0 d0Var = new d0(pcVar.getContext(), new fi.b());
                d0Var.s1(pcVar.f.getText());
                d0Var.f2 = new q2(pcVar, 1);
                bh bhVar = new bh(pcVar, i13);
                d0Var.h2 = 0L;
                d0Var.i2 = true;
                d0Var.j2 = bhVar;
                d0Var.show();
                break;
            case 6:
                int i14 = ChatActivityEnterView.N6;
                ((yc) obj).a(Boolean.TRUE, 0, 0);
                break;
            case 7:
                ((dl) obj).r.V(null, null);
                break;
            case 8:
                xn xnVar = (xn) obj;
                xnVar.w.setProgress(0.0f);
                xnVar.w.d();
                break;
            case 9:
                tp tpVar = (tp) obj;
                if (!tpVar.v1) {
                    int i15 = tpVar.u1;
                    if (i15 != tpVar.t1) {
                        tpVar.v1 = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i7 = 71;
                            i10 = 0;
                            org.telegram.ui.lb lbVar2 = tpVar.w1.a;
                            org.telegram.messenger.np messagesController = lbVar2.getMessagesController();
                            TLRPC.Chat chat = lbVar2.f;
                            messagesController.J4(i10, -chat.id);
                            N0 = lbVar2.getMessagesController().N0(chat.id);
                            if (N0 != null) {
                                lbVar2.x.k(-chat.id, i7, null, Integer.valueOf(N0.ttl_period), null, null);
                            }
                        }
                        i7 = 70;
                        org.telegram.ui.lb lbVar22 = tpVar.w1.a;
                        org.telegram.messenger.np messagesController2 = lbVar22.getMessagesController();
                        TLRPC.Chat chat2 = lbVar22.f;
                        messagesController2.J4(i10, -chat2.id);
                        N0 = lbVar22.getMessagesController().N0(chat2.id);
                        if (N0 != null) {
                        }
                    }
                    if (tpVar.v1) {
                        org.telegram.messenger.g0.i3(new fo(tpVar, i13), 200L);
                        break;
                    } else {
                        tpVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((pq) obj).run();
                break;
            case 11:
                ((rr) obj).i1(true);
                break;
            case 12:
                ((wu) obj).M0();
                break;
            case 13:
                Runnable runnable = ((gv) obj).S;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                vw vwVar = (vw) obj;
                ly lyVar = vwVar.G;
                ArrayList arrayList = lyVar.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.np.s1(lyVar.d1).g7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    vw vwVar2 = lyVar.S;
                    if (vwVar2 != null) {
                        vwVar2.p(1, 3);
                    }
                    qw qwVar = lyVar.J;
                    if (qwVar != null) {
                        qwVar.p(lyVar.getEmojipacks());
                    }
                    vwVar.H();
                    break;
                }
                break;
            case 15:
                gy gyVar = (gy) obj;
                gyVar.getClass();
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                ly lyVar2 = gyVar.R;
                LongSparseArray longSparseArray = lyVar2.z1;
                LongSparseArray longSparseArray2 = lyVar2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (u3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        lyVar2.u1.h(u3Var.getStickerSet());
                        break;
                    } else {
                        u3Var.b(true, true);
                        lyVar2.z1.put(stickerSet.set.id, stickerSet);
                        lyVar2.u1.r(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                zz zzVar = (zz) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = zzVar.W1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = zzVar.V1;
                ArrayList arrayList2 = zzVar.e2;
                boolean z10 = zzVar.X1;
                ArrayList arrayList3 = zzVar.c2;
                int i16 = zzVar.U1;
                org.telegram.ui.ActionBar.e2 e2Var = zzVar.s1;
                vz vzVar = zzVar.h2;
                if (vzVar == null || !vzVar.r) {
                    if (arrayList3 == null) {
                        zzVar.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList3.get(i17));
                                if (arrayList2.contains(Long.valueOf(o4))) {
                                    arrayList4.add(e2Var.getMessagesController().j1(o4));
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
                                    zzVar.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = zzVar.T1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i16;
                                e2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                e2Var.getMessagesController().l2(i16);
                                zzVar.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i16;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.o4 parentLayout = e2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.e2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.an) {
                                        org.telegram.ui.an anVar = (org.telegram.ui.an) lastFragment;
                                        anVar.h8();
                                        undoView = anVar.N3;
                                    } else if (lastFragment instanceof org.telegram.ui.yw) {
                                        undoView = ((org.telegram.ui.yw) lastFragment).k4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).e0();
                                    } else if (lastFragment instanceof org.telegram.ui.hz) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (r.b.h(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) r.b.h(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.e0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        zzVar.h2.a(true);
                                        zzVar.v2 = e2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.j6(zzVar, lastFragment, arrayList4, 16));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        org.telegram.messenger.np messagesController3 = e2Var.getMessagesController();
                                        ArrayList arrayList6 = messagesController3.S0;
                                        messagesController3.R0 = new ArrayList(messagesController3.Q0);
                                        int i19 = 0;
                                        while (i19 < messagesController3.R0.size()) {
                                            if (((org.telegram.messenger.so) messagesController3.R0.get(i19)).a == i16) {
                                                messagesController3.R0.remove(i19);
                                                i19--;
                                            }
                                            i19++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z11 = !isEmpty;
                                        messagesController3.getNotificationCenter().k(org.telegram.messenger.ns.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController3.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new di.t7(messagesController3, i16, z11, i13), new org.telegram.messenger.l10(4, messagesController3, z11));
                                        undoView2.k(0L, 88, zzVar.Y1, Integer.valueOf(arrayList4.size()), new yf(zzVar, tL_chatlists_joinChatlistInvite, pair, 9), (Runnable) pair.second);
                                        zzVar.w2 = true;
                                        zzVar.dismiss();
                                        e2Var.getMessagesController().l2(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                gh ghVar = new gh(7, zzVar, arrayList4);
                                rz rzVar = tL_chatlists_chatlistUpdates != null ? new rz(ghVar, parentLayout) : new rz(parentLayout, ghVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (zzVar.d2.contains(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            e2Var.getMessagesController().r0(1, zArr);
                                            if (zArr[0]) {
                                                e2Var.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                zzVar.h2.a(true);
                                zzVar.v2 = e2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.v7(17, zzVar, rzVar));
                                break;
                            }
                        } else {
                            vz vzVar2 = zzVar.h2;
                            int i21 = -zzVar.y2;
                            zzVar.y2 = i21;
                            org.telegram.messenger.g0.F3(i21, vzVar2, null);
                            org.telegram.messenger.p2.E.a();
                            break;
                        }
                    } else {
                        zzVar.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                v00 v00Var = (v00) obj;
                ArrayList arrayList7 = v00Var.G;
                if (v00Var.d()) {
                    u00 u00Var = v00Var.I;
                    if (u00Var != null && (hwVar = ((org.telegram.ui.ev) u00Var).a.D0) != null) {
                        hwVar.Q(false);
                    }
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        if (v00Var.I != null && ((jg.o0) arrayList7.get(i22)).h) {
                            ((org.telegram.ui.ev) v00Var.I).g((jg.o0) arrayList7.get(i22));
                        }
                    }
                    v00Var.c();
                    break;
                } else {
                    Runnable runnable2 = v00Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        v00Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((jl) obj).run();
                break;
            case 19:
                ((jl) obj).run();
                break;
            case 20:
                h10 h10Var = (h10) obj;
                h10Var.I0();
                h10Var.dismiss();
                break;
            case 21:
                ((s10) obj).f(false);
                break;
            case 22:
                w10 w10Var = (w10) obj;
                w10Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(w10Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    w10Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.d30 d30Var = (org.telegram.ui.d30) obj;
                d30Var.J0(d30Var.r1);
                d30Var.dismiss();
                break;
            case 24:
                ((p20) obj).dismiss();
                break;
            case 25:
                u20 u20Var = (u20) obj;
                u20Var.a0(!u20Var.E, true);
                jg.k1 k1Var = u20Var.r;
                boolean z12 = u20Var.E;
                ValueAnimator valueAnimator = k1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(k1Var.e, z12 ? 1.0f : 0.0f);
                k1Var.f = ofFloat;
                ofFloat.addUpdateListener(new fi.f4(k1Var, i12));
                k1Var.f.addListener(new bi.v4(15, k1Var, z12));
                k1Var.f.setDuration(320L);
                k1Var.f.setInterpolator(er.h);
                k1Var.f.start();
                break;
            case 26:
                ((o30) obj).dismiss();
                break;
            case 27:
                m60 m60Var = (m60) obj;
                HashSet hashSet = ki.x2.b1;
                if (m60Var.J) {
                    m60Var.u();
                    break;
                }
                break;
            case 28:
                v60 v60Var = (v60) obj;
                v60Var.z1 = org.telegram.messenger.np.s1(v60Var.a).j1(org.telegram.messenger.gj.B1(v60Var.x1));
                v60Var.A1 = true;
                v60Var.dismiss();
                break;
            default:
                x60 x60Var = (x60) obj;
                x60Var.m1 = true;
                x60Var.dismiss();
                break;
        }
    }

    public /* synthetic */ e0(m60 m60Var, ai.o oVar) {
        this.a = 27;
        this.b = m60Var;
    }
}
