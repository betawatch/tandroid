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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c3  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        int i10;
        TLRPC.ChatFull N0;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.fw fwVar;
        int i11 = this.a;
        UndoView undoView = null;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                i0 i0Var = (i0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.Q1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    i0Var.Q1 = null;
                }
                a0.h hVar = i0Var.S1;
                if (hVar != null && i0Var.R1 != null && hVar.m() >= i0Var.R1.size()) {
                    i0Var.S1 = null;
                }
                org.telegram.ui.ra raVar = i0Var.Y1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.Q1;
                a0.h hVar2 = i0Var.S1;
                org.telegram.ui.mb mbVar = raVar.a;
                mbVar.u0 = tL_channelAdminLogEventsFilter2;
                mbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    mbVar.I.setSubtitle(org.telegram.messenger.id.M0(2131751075, null));
                } else {
                    mbVar.I.setSubtitle(org.telegram.messenger.id.M0(2131750913, null));
                }
                mbVar.Z0(true);
                i0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.c2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((t8) obj).k0();
                break;
            case 3:
                ((nb) ((lb) obj).n1).f();
                cc.e();
                break;
            case 4:
                ((ac) obj).f();
                break;
            case 5:
                uc ucVar = (uc) obj;
                org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                g0 g0Var = new g0(ucVar.getContext(), new di.b());
                g0Var.r1(ucVar.f.getText());
                g0Var.b2 = new s2(ucVar, 1);
                wg wgVar = new wg(ucVar, i13);
                g0Var.d2 = 0L;
                g0Var.e2 = true;
                g0Var.f2 = wgVar;
                g0Var.show();
                break;
            case 6:
                ((wk) obj).r.U(null, null);
                break;
            case 7:
                pn pnVar = (pn) obj;
                pnVar.w.setProgress(0.0f);
                pnVar.w.d();
                break;
            case 8:
                lp lpVar = (lp) obj;
                if (!lpVar.r1) {
                    int i14 = lpVar.q1;
                    if (i14 != lpVar.p1) {
                        lpVar.r1 = true;
                        if (i14 == 3) {
                            i10 = 2678400;
                        } else if (i14 == 2) {
                            i10 = 604800;
                        } else if (i14 == 1) {
                            i10 = 86400;
                        } else {
                            i7 = 71;
                            i10 = 0;
                            org.telegram.ui.mb mbVar2 = lpVar.s1.a;
                            org.telegram.messenger.qp messagesController = mbVar2.getMessagesController();
                            TLRPC.Chat chat = mbVar2.f;
                            messagesController.I4(i10, -chat.id);
                            N0 = mbVar2.getMessagesController().N0(chat.id);
                            if (N0 != null) {
                                mbVar2.x.k(-chat.id, i7, null, Integer.valueOf(N0.ttl_period), null, null);
                            }
                        }
                        i7 = 70;
                        org.telegram.ui.mb mbVar22 = lpVar.s1.a;
                        org.telegram.messenger.qp messagesController2 = mbVar22.getMessagesController();
                        TLRPC.Chat chat2 = mbVar22.f;
                        messagesController2.I4(i10, -chat2.id);
                        N0 = mbVar22.getMessagesController().N0(chat2.id);
                        if (N0 != null) {
                        }
                    }
                    if (lpVar.r1) {
                        org.telegram.messenger.g0.i3(new gp(lpVar, 0), 200L);
                        break;
                    } else {
                        lpVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                ((iq) obj).run();
                break;
            case 10:
                ((lr) obj).i1(true);
                break;
            case 11:
                ((ru) obj).M0();
                break;
            case 12:
                Runnable runnable = ((bv) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                qw qwVar = (qw) obj;
                hy hyVar = qwVar.F;
                ArrayList arrayList = hyVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.qp.s1(hyVar.c1).f7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    qw qwVar2 = hyVar.R;
                    if (qwVar2 != null) {
                        qwVar2.p(1, 3);
                    }
                    lw lwVar = hyVar.I;
                    if (lwVar != null) {
                        lwVar.p(hyVar.getEmojipacks());
                    }
                    qwVar.H();
                    break;
                }
                break;
            case 14:
                cy cyVar = (cy) obj;
                cyVar.getClass();
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                hy hyVar2 = cyVar.Q;
                LongSparseArray longSparseArray = hyVar2.y1;
                LongSparseArray longSparseArray2 = hyVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (u3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        hyVar2.t1.h(u3Var.getStickerSet());
                        break;
                    } else {
                        u3Var.b(true, true);
                        hyVar2.y1.put(stickerSet.set.id, stickerSet);
                        hyVar2.t1.r(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                wz wzVar = (wz) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = wzVar.S1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = wzVar.R1;
                ArrayList arrayList2 = wzVar.a2;
                boolean z9 = wzVar.T1;
                ArrayList arrayList3 = wzVar.Y1;
                int i15 = wzVar.Q1;
                org.telegram.ui.ActionBar.f2 f2Var = wzVar.o1;
                sz szVar = wzVar.d2;
                if (szVar == null || !szVar.r) {
                    if (arrayList3 == null) {
                        wzVar.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z9) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                long o4 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList3.get(i16));
                                if (arrayList2.contains(Long.valueOf(o4))) {
                                    arrayList4.add(f2Var.getMessagesController().j1(o4));
                                }
                            }
                            if (z9) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i15;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    wzVar.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = wzVar.P1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i15;
                                f2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                f2Var.getMessagesController().l2(i15);
                                wzVar.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i15;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.q4 parentLayout = f2Var.getParentLayout();
                            int i17 = 15;
                            if (z9) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.f2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.an) {
                                        org.telegram.ui.an anVar = (org.telegram.ui.an) lastFragment;
                                        anVar.f8();
                                        undoView = anVar.M3;
                                    } else if (lastFragment instanceof org.telegram.ui.ww) {
                                        undoView = ((org.telegram.ui.ww) lastFragment).k4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).e0();
                                    } else if (lastFragment instanceof org.telegram.ui.gz) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (rf.b.g(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) rf.b.g(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.e0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        wzVar.d2.a(true);
                                        wzVar.r2 = f2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.f2(wzVar, lastFragment, arrayList4, i17));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        org.telegram.messenger.qp messagesController3 = f2Var.getMessagesController();
                                        ArrayList arrayList6 = messagesController3.R0;
                                        messagesController3.Q0 = new ArrayList(messagesController3.P0);
                                        int i19 = 0;
                                        while (i19 < messagesController3.Q0.size()) {
                                            if (((org.telegram.messenger.vo) messagesController3.Q0.get(i19)).a == i15) {
                                                messagesController3.Q0.remove(i19);
                                                i19--;
                                            }
                                            i19++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z10 = !isEmpty;
                                        messagesController3.getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController3.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new bi.c9(messagesController3, i15, z10, i13), new org.telegram.messenger.o10(4, messagesController3, z10));
                                        undoView2.k(0L, 88, wzVar.U1, Integer.valueOf(arrayList4.size()), new ng(wzVar, tL_chatlists_joinChatlistInvite, pair, 7), (Runnable) pair.second);
                                        wzVar.s2 = true;
                                        wzVar.dismiss();
                                        f2Var.getMessagesController().l2(i15);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                fx fxVar = new fx(i13, wzVar, arrayList4);
                                oz ozVar = tL_chatlists_chatlistUpdates != null ? new oz(fxVar, parentLayout) : new oz(parentLayout, fxVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (wzVar.Z1.contains(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            f2Var.getMessagesController().r0(1, zArr);
                                            if (zArr[0]) {
                                                f2Var.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                wzVar.d2.a(true);
                                wzVar.r2 = f2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.ld(i17, wzVar, ozVar));
                                break;
                            }
                        } else {
                            sz szVar2 = wzVar.d2;
                            int i21 = -wzVar.u2;
                            wzVar.u2 = i21;
                            org.telegram.messenger.g0.G3(i21, szVar2, null);
                            org.telegram.messenger.p2.D.a();
                            break;
                        }
                    } else {
                        wzVar.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                s00 s00Var = (s00) obj;
                ArrayList arrayList7 = s00Var.F;
                if (s00Var.d()) {
                    r00 r00Var = s00Var.H;
                    if (r00Var != null && (fwVar = ((org.telegram.ui.dv) r00Var).a.C0) != null) {
                        fwVar.R(false);
                    }
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        if (s00Var.H != null && ((jg.o0) arrayList7.get(i22)).h) {
                            ((org.telegram.ui.dv) s00Var.H).h((jg.o0) arrayList7.get(i22));
                        }
                    }
                    s00Var.c();
                    break;
                } else {
                    Runnable runnable2 = s00Var.D;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        s00Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((cl) obj).run();
                break;
            case 18:
                ((cl) obj).run();
                break;
            case 19:
                e10 e10Var = (e10) obj;
                e10Var.I0();
                e10Var.dismiss();
                break;
            case 20:
                ((p10) obj).f(false);
                break;
            case 21:
                t10 t10Var = (t10) obj;
                t10Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(t10Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    t10Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.c30 c30Var = (org.telegram.ui.c30) obj;
                c30Var.J0(c30Var.n1);
                c30Var.dismiss();
                break;
            case 23:
                ((m20) obj).dismiss();
                break;
            case 24:
                r20 r20Var = (r20) obj;
                r20Var.a0(!r20Var.D, true);
                jg.l1 l1Var = r20Var.r;
                boolean z11 = r20Var.D;
                ValueAnimator valueAnimator = l1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(l1Var.e, z11 ? 1.0f : 0.0f);
                l1Var.f = ofFloat;
                ofFloat.addUpdateListener(new di.m4(l1Var, i12));
                l1Var.f.addListener(new ch.y(16, l1Var, z11));
                l1Var.f.setDuration(320L);
                l1Var.f.setInterpolator(xq.h);
                l1Var.f.start();
                break;
            case 25:
                ((l30) obj).dismiss();
                break;
            case 26:
                k60 k60Var = (k60) obj;
                HashSet hashSet = hi.a3.a1;
                if (k60Var.J) {
                    k60Var.u();
                    break;
                }
                break;
            case 27:
                t60 t60Var = (t60) obj;
                t60Var.v1 = org.telegram.messenger.qp.s1(t60Var.a).j1(org.telegram.messenger.ij.C1(t60Var.t1));
                t60Var.w1 = true;
                t60Var.dismiss();
                break;
            case 28:
                v60 v60Var = (v60) obj;
                v60Var.i1 = true;
                v60Var.dismiss();
                break;
            default:
                ((b70) obj).dismiss();
                break;
        }
    }

    public /* synthetic */ h0(k60 k60Var, ai.m0 m0Var) {
        this.a = 26;
        this.b = k60Var;
    }
}
