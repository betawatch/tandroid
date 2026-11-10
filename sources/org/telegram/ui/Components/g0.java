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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i7) {
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
        org.telegram.ui.iw iwVar;
        int i11 = this.a;
        UndoView undoView = null;
        int i12 = 3;
        int i13 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = h0Var.T1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    h0Var.T1 = null;
                }
                a0.h hVar = h0Var.V1;
                if (hVar != null && h0Var.U1 != null && hVar.m() >= h0Var.U1.size()) {
                    h0Var.V1 = null;
                }
                org.telegram.ui.ra raVar = h0Var.b2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.T1;
                a0.h hVar2 = h0Var.V1;
                org.telegram.ui.mb mbVar = raVar.a;
                mbVar.u0 = tL_channelAdminLogEventsFilter2;
                mbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    mbVar.I.setSubtitle(org.telegram.messenger.id.M0(2131751074, null));
                } else {
                    mbVar.I.setSubtitle(org.telegram.messenger.id.M0(2131750912, null));
                }
                mbVar.Z0(true);
                h0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.c2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((s8) obj).k0();
                break;
            case 3:
                ((mb) ((kb) obj).n1).f();
                bc.e();
                break;
            case 4:
                ((zb) obj).f();
                break;
            case 5:
                tc tcVar = (tc) obj;
                org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                f0 f0Var = new f0(tcVar.getContext(), new di.b());
                f0Var.r1(tcVar.f.getText());
                f0Var.e2 = new r2(tcVar, 1);
                vg vgVar = new vg(tcVar, i13);
                f0Var.g2 = 0L;
                f0Var.h2 = true;
                f0Var.i2 = vgVar;
                f0Var.show();
                break;
            case 6:
                ((vk) obj).r.U(null, null);
                break;
            case 7:
                on onVar = (on) obj;
                onVar.w.setProgress(0.0f);
                onVar.w.d();
                break;
            case 8:
                lp lpVar = (lp) obj;
                if (!lpVar.u1) {
                    int i14 = lpVar.t1;
                    if (i14 != lpVar.s1) {
                        lpVar.u1 = true;
                        if (i14 == 3) {
                            i10 = 2678400;
                        } else if (i14 == 2) {
                            i10 = 604800;
                        } else if (i14 == 1) {
                            i10 = 86400;
                        } else {
                            i7 = 71;
                            i10 = 0;
                            org.telegram.ui.mb mbVar2 = lpVar.v1.a;
                            org.telegram.messenger.qp messagesController = mbVar2.getMessagesController();
                            TLRPC.Chat chat = mbVar2.f;
                            messagesController.I4(i10, -chat.id);
                            N0 = mbVar2.getMessagesController().N0(chat.id);
                            if (N0 != null) {
                                mbVar2.x.k(-chat.id, i7, null, Integer.valueOf(N0.ttl_period), null, null);
                            }
                        }
                        i7 = 70;
                        org.telegram.ui.mb mbVar22 = lpVar.v1.a;
                        org.telegram.messenger.qp messagesController2 = mbVar22.getMessagesController();
                        TLRPC.Chat chat2 = mbVar22.f;
                        messagesController2.I4(i10, -chat2.id);
                        N0 = mbVar22.getMessagesController().N0(chat2.id);
                        if (N0 != null) {
                        }
                    }
                    if (lpVar.u1) {
                        org.telegram.messenger.g0.i3(new gp(lpVar, 0), 200L);
                        break;
                    } else {
                        lpVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                ((hq) obj).run();
                break;
            case 10:
                ((kr) obj).i1(true);
                break;
            case 11:
                ((qu) obj).M0();
                break;
            case 12:
                Runnable runnable = ((av) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                pw pwVar = (pw) obj;
                gy gyVar = pwVar.F;
                ArrayList arrayList = gyVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.qp.s1(gyVar.c1).f7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    pw pwVar2 = gyVar.R;
                    if (pwVar2 != null) {
                        pwVar2.p(1, 3);
                    }
                    kw kwVar = gyVar.I;
                    if (kwVar != null) {
                        kwVar.p(gyVar.getEmojipacks());
                    }
                    pwVar.H();
                    break;
                }
                break;
            case 14:
                ay ayVar = (ay) obj;
                ayVar.getClass();
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                gy gyVar2 = ayVar.Q;
                LongSparseArray longSparseArray = gyVar2.y1;
                LongSparseArray longSparseArray2 = gyVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (u3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        gyVar2.t1.h(u3Var.getStickerSet());
                        break;
                    } else {
                        u3Var.b(true, true);
                        gyVar2.y1.put(stickerSet.set.id, stickerSet);
                        gyVar2.t1.r(u3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                vz vzVar = (vz) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = vzVar.V1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = vzVar.U1;
                ArrayList arrayList2 = vzVar.d2;
                boolean z9 = vzVar.W1;
                ArrayList arrayList3 = vzVar.b2;
                int i15 = vzVar.T1;
                org.telegram.ui.ActionBar.f2 f2Var = vzVar.r1;
                rz rzVar = vzVar.g2;
                if (rzVar == null || !rzVar.r) {
                    if (arrayList3 == null) {
                        vzVar.dismiss();
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
                                    vzVar.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = vzVar.S1;
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
                                vzVar.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i15;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.r4 parentLayout = f2Var.getParentLayout();
                            int i17 = 15;
                            if (z9) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.f2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.cn) {
                                        org.telegram.ui.cn cnVar = (org.telegram.ui.cn) lastFragment;
                                        cnVar.g8();
                                        undoView = cnVar.M3;
                                    } else if (lastFragment instanceof org.telegram.ui.zw) {
                                        undoView = ((org.telegram.ui.zw) lastFragment).k4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).e0();
                                    } else if (lastFragment instanceof org.telegram.ui.jz) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (rf.b.g(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) rf.b.g(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.e0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        vzVar.g2.a(true);
                                        vzVar.u2 = f2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.f2(vzVar, lastFragment, arrayList4, i17));
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
                                        undoView2.k(0L, 88, vzVar.X1, Integer.valueOf(arrayList4.size()), new mg(vzVar, tL_chatlists_joinChatlistInvite, pair, 7), (Runnable) pair.second);
                                        vzVar.v2 = true;
                                        vzVar.dismiss();
                                        f2Var.getMessagesController().l2(i15);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                ex exVar = new ex(i13, vzVar, arrayList4);
                                nz nzVar = tL_chatlists_chatlistUpdates != null ? new nz(exVar, parentLayout) : new nz(parentLayout, exVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (vzVar.c2.contains(Long.valueOf(org.telegram.messenger.m5.n((TLRPC.InputPeer) arrayList4.get(i20))))) {
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
                                vzVar.g2.a(true);
                                vzVar.u2 = f2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.ld(i17, vzVar, nzVar));
                                break;
                            }
                        } else {
                            rz rzVar2 = vzVar.g2;
                            int i21 = -vzVar.x2;
                            vzVar.x2 = i21;
                            org.telegram.messenger.g0.G3(i21, rzVar2, null);
                            org.telegram.messenger.p2.D.a();
                            break;
                        }
                    } else {
                        vzVar.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                r00 r00Var = (r00) obj;
                ArrayList arrayList7 = r00Var.F;
                if (r00Var.d()) {
                    q00 q00Var = r00Var.H;
                    if (q00Var != null && (iwVar = ((org.telegram.ui.gv) q00Var).a.C0) != null) {
                        iwVar.R(false);
                    }
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        if (r00Var.H != null && ((jg.o0) arrayList7.get(i22)).h) {
                            ((org.telegram.ui.gv) r00Var.H).h((jg.o0) arrayList7.get(i22));
                        }
                    }
                    r00Var.c();
                    break;
                } else {
                    Runnable runnable2 = r00Var.D;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        r00Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((bl) obj).run();
                break;
            case 18:
                ((bl) obj).run();
                break;
            case 19:
                d10 d10Var = (d10) obj;
                d10Var.I0();
                d10Var.dismiss();
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
                org.telegram.ui.f30 f30Var = (org.telegram.ui.f30) obj;
                f30Var.J0(f30Var.q1);
                f30Var.dismiss();
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
                ofFloat.addUpdateListener(new di.n4(l1Var, i12));
                l1Var.f.addListener(new ch.y(16, l1Var, z11));
                l1Var.f.setDuration(320L);
                l1Var.f.setInterpolator(wq.h);
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
                t60Var.y1 = org.telegram.messenger.qp.s1(t60Var.a).j1(org.telegram.messenger.ij.B1(t60Var.w1));
                t60Var.z1 = true;
                t60Var.dismiss();
                break;
            case 28:
                v60 v60Var = (v60) obj;
                v60Var.l1 = true;
                v60Var.dismiss();
                break;
            default:
                ((b70) obj).dismiss();
                break;
        }
    }

    public /* synthetic */ g0(k60 k60Var, ai.m0 m0Var) {
        this.a = 26;
        this.b = k60Var;
    }
}
