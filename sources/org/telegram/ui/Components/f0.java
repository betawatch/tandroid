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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c7  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i3;
        int i10;
        TLRPC.ChatFull N0;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.cw cwVar;
        int i11 = this.a;
        UndoView undoView = null;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                g0 g0Var = (g0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.R1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    g0Var.R1 = null;
                }
                a0.h hVar = g0Var.T1;
                if (hVar != null && g0Var.S1 != null && hVar.m() >= g0Var.S1.size()) {
                    g0Var.T1 = null;
                }
                org.telegram.ui.qa qaVar = g0Var.Z1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.R1;
                a0.h hVar2 = g0Var.T1;
                org.telegram.ui.kb kbVar = qaVar.a;
                kbVar.v0 = tL_channelAdminLogEventsFilter2;
                kbVar.x0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    kbVar.J.setSubtitle(org.telegram.messenger.bd.M0(2131751075, null));
                } else {
                    kbVar.J.setSubtitle(org.telegram.messenger.bd.M0(2131750913, null));
                }
                kbVar.Z0(true);
                g0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.c2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((r8) obj).k0();
                break;
            case 3:
                ((lb) ((jb) obj).o1).f();
                ac.e();
                break;
            case 4:
                ((yb) obj).f();
                break;
            case 5:
                sc scVar = (sc) obj;
                org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(scVar.getContext(), new ei.b());
                e0Var.r1(scVar.f.getText());
                e0Var.c2 = new p2(scVar, 1);
                tg tgVar = new tg(scVar, i13);
                e0Var.e2 = 0L;
                e0Var.f2 = true;
                e0Var.g2 = tgVar;
                e0Var.show();
                break;
            case 6:
                ((uk) obj).r.U(null, null);
                break;
            case 7:
                on onVar = (on) obj;
                onVar.w.setProgress(0.0f);
                onVar.w.d();
                break;
            case 8:
                lp lpVar = (lp) obj;
                if (!lpVar.s1) {
                    int i14 = lpVar.r1;
                    if (i14 != lpVar.q1) {
                        lpVar.s1 = true;
                        if (i14 == 3) {
                            i10 = 2678400;
                        } else if (i14 == 2) {
                            i10 = 604800;
                        } else if (i14 == 1) {
                            i10 = 86400;
                        } else {
                            i3 = 71;
                            i10 = 0;
                            org.telegram.ui.kb kbVar2 = lpVar.t1.a;
                            org.telegram.messenger.hp messagesController = kbVar2.getMessagesController();
                            TLRPC.Chat chat = kbVar2.f;
                            messagesController.I4(i10, -chat.id);
                            N0 = kbVar2.getMessagesController().N0(chat.id);
                            if (N0 != null) {
                                kbVar2.x.k(-chat.id, i3, null, Integer.valueOf(N0.ttl_period), null, null);
                            }
                        }
                        i3 = 70;
                        org.telegram.ui.kb kbVar22 = lpVar.t1.a;
                        org.telegram.messenger.hp messagesController2 = kbVar22.getMessagesController();
                        TLRPC.Chat chat2 = kbVar22.f;
                        messagesController2.I4(i10, -chat2.id);
                        N0 = kbVar22.getMessagesController().N0(chat2.id);
                        if (N0 != null) {
                        }
                    }
                    if (lpVar.s1) {
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
                ((pu) obj).M0();
                break;
            case 12:
                Runnable runnable = ((zu) obj).S;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                ow owVar = (ow) obj;
                ey eyVar = owVar.G;
                ArrayList arrayList = eyVar.o1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.hp.s1(eyVar.d1).f7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    ow owVar2 = eyVar.S;
                    if (owVar2 != null) {
                        owVar2.p(1, 3);
                    }
                    jw jwVar = eyVar.J;
                    if (jwVar != null) {
                        jwVar.p(eyVar.getEmojipacks());
                    }
                    owVar.H();
                    break;
                }
                break;
            case 14:
                yx yxVar = (yx) obj;
                yxVar.getClass();
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                ey eyVar2 = yxVar.R;
                LongSparseArray longSparseArray = eyVar2.z1;
                LongSparseArray longSparseArray2 = eyVar2.A1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (u3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        eyVar2.u1.h(u3Var.getStickerSet());
                        break;
                    } else {
                        u3Var.b(true, true);
                        eyVar2.z1.put(stickerSet.set.id, stickerSet);
                        eyVar2.u1.r(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                rz rzVar = (rz) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = rzVar.T1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = rzVar.S1;
                ArrayList arrayList2 = rzVar.b2;
                boolean z10 = rzVar.U1;
                ArrayList arrayList3 = rzVar.Z1;
                int i15 = rzVar.R1;
                org.telegram.ui.ActionBar.d2 d2Var = rzVar.p1;
                nz nzVar = rzVar.e2;
                if (nzVar == null || !nzVar.r) {
                    if (arrayList3 == null) {
                        rzVar.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                long o10 = org.telegram.messenger.m5.o((TLRPC.Peer) arrayList3.get(i16));
                                if (arrayList2.contains(Long.valueOf(o10))) {
                                    arrayList4.add(d2Var.getMessagesController().j1(o10));
                                }
                            }
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i15;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    rzVar.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = rzVar.Q1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i15;
                                d2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                d2Var.getMessagesController().l2(i15);
                                rzVar.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i15;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.q4 parentLayout = d2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.d2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.wm) {
                                        org.telegram.ui.wm wmVar = (org.telegram.ui.wm) lastFragment;
                                        wmVar.f8();
                                        undoView = wmVar.N3;
                                    } else if (lastFragment instanceof org.telegram.ui.uw) {
                                        undoView = ((org.telegram.ui.uw) lastFragment).k4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).e0();
                                    } else if (lastFragment instanceof org.telegram.ui.ez) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (t4.c.d(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) t4.c.d(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.e0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        rzVar.e2.a(true);
                                        rzVar.s2 = d2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ai.r6(rzVar, lastFragment, arrayList4, 16));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                                            arrayList5.add(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i17))));
                                        }
                                        org.telegram.messenger.hp messagesController3 = d2Var.getMessagesController();
                                        ArrayList arrayList6 = messagesController3.S0;
                                        messagesController3.R0 = new ArrayList(messagesController3.Q0);
                                        int i18 = 0;
                                        while (i18 < messagesController3.R0.size()) {
                                            if (((org.telegram.messenger.mo) messagesController3.R0.get(i18)).a == i15) {
                                                messagesController3.R0.remove(i18);
                                                i18--;
                                            }
                                            i18++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z11 = !isEmpty;
                                        messagesController3.getNotificationCenter().k(org.telegram.messenger.hs.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController3.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new ci.c8(messagesController3, i15, z11, i13), new org.telegram.messenger.g10(4, messagesController3, z11));
                                        undoView2.k(0L, 88, rzVar.V1, Integer.valueOf(arrayList4.size()), new e7((Object) rzVar, (TLObject) tL_chatlists_joinChatlistInvite, (Object) pair, 11), (Runnable) pair.second);
                                        rzVar.t2 = true;
                                        rzVar.dismiss();
                                        d2Var.getMessagesController().l2(i15);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                ei eiVar = new ei(6, rzVar, arrayList4);
                                kz kzVar = tL_chatlists_chatlistUpdates != null ? new kz(eiVar, parentLayout) : new kz(parentLayout, eiVar);
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList4.size()) {
                                        if (rzVar.a2.contains(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i19))))) {
                                            i19++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            d2Var.getMessagesController().r0(1, zArr);
                                            if (zArr[0]) {
                                                d2Var.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                rzVar.e2.a(true);
                                rzVar.s2 = d2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.ActionBar.h6(18, rzVar, kzVar));
                                break;
                            }
                        } else {
                            nz nzVar2 = rzVar.e2;
                            int i20 = -rzVar.v2;
                            rzVar.v2 = i20;
                            org.telegram.messenger.g0.G3(i20, nzVar2, null);
                            org.telegram.messenger.p2.E.a();
                            break;
                        }
                    } else {
                        rzVar.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                n00 n00Var = (n00) obj;
                ArrayList arrayList7 = n00Var.G;
                if (n00Var.d()) {
                    m00 m00Var = n00Var.I;
                    if (m00Var != null && (cwVar = ((org.telegram.ui.av) m00Var).a.D0) != null) {
                        cwVar.R(false);
                    }
                    for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                        if (n00Var.I != null && ((kg.l0) arrayList7.get(i21)).h) {
                            ((org.telegram.ui.av) n00Var.I).g((kg.l0) arrayList7.get(i21));
                        }
                    }
                    n00Var.c();
                    break;
                } else {
                    Runnable runnable2 = n00Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        n00Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((al) obj).run();
                break;
            case 18:
                ((al) obj).run();
                break;
            case 19:
                a10 a10Var = (a10) obj;
                a10Var.I0();
                a10Var.dismiss();
                break;
            case 20:
                ((l10) obj).e(false);
                break;
            case 21:
                p10 p10Var = (p10) obj;
                p10Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(p10Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    p10Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.x20 x20Var = (org.telegram.ui.x20) obj;
                x20Var.J0(x20Var.o1);
                x20Var.dismiss();
                break;
            case 23:
                ((i20) obj).dismiss();
                break;
            case 24:
                n20 n20Var = (n20) obj;
                n20Var.a0(!n20Var.E, true);
                kg.h1 h1Var = n20Var.r;
                boolean z12 = n20Var.E;
                ValueAnimator valueAnimator = h1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(h1Var.e, z12 ? 1.0f : 0.0f);
                h1Var.f = ofFloat;
                ofFloat.addUpdateListener(new ei.n4(h1Var, i12));
                h1Var.f.addListener(new dh.x(17, h1Var, z12));
                h1Var.f.setDuration(320L);
                h1Var.f.setInterpolator(xq.h);
                h1Var.f.start();
                break;
            case 25:
                ((h30) obj).dismiss();
                break;
            case 26:
                f60 f60Var = (f60) obj;
                HashSet hashSet = ii.a3.b1;
                if (f60Var.J) {
                    f60Var.u();
                    break;
                }
                break;
            case 27:
                o60 o60Var = (o60) obj;
                o60Var.w1 = org.telegram.messenger.hp.s1(o60Var.a).j1(org.telegram.messenger.zi.C1(o60Var.u1));
                o60Var.x1 = true;
                o60Var.dismiss();
                break;
            case 28:
                q60 q60Var = (q60) obj;
                q60Var.j1 = true;
                q60Var.dismiss();
                break;
            default:
                ((x60) obj).dismiss();
                break;
        }
    }

    public /* synthetic */ f0(f60 f60Var, ai.y1 y1Var) {
        this.a = 26;
        this.b = f60Var;
    }
}
