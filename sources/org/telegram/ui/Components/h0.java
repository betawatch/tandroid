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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d0  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull M0;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.kx kxVar;
        int i12 = this.a;
        UndoView undoView = null;
        int i13 = 2;
        Object obj = this.b;
        switch (i12) {
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
                org.telegram.ui.va vaVar = i0Var.Y1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.Q1;
                a0.h hVar2 = i0Var.S1;
                org.telegram.ui.sb sbVar = vaVar.a;
                sbVar.u0 = tL_channelAdminLogEventsFilter2;
                sbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    sbVar.I.setSubtitle(org.telegram.messenger.cd.L0(2131751075, null));
                } else {
                    sbVar.I.setSubtitle(org.telegram.messenger.cd.L0(2131750913, null));
                }
                sbVar.Y0(true);
                i0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.c2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((o8) obj).j0();
                break;
            case 3:
                ((hb) ((fb) obj).n1).f();
                wb.e();
                break;
            case 4:
                ((ub) obj).f();
                break;
            case 5:
                nc ncVar = (nc) obj;
                org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                g0 g0Var = new g0(ncVar.getContext(), new th.b());
                g0Var.r1(ncVar.f.getText());
                g0Var.b2 = new r2(ncVar, 1);
                sg sgVar = new sg(ncVar, i13);
                g0Var.d2 = 0L;
                g0Var.e2 = true;
                g0Var.f2 = sgVar;
                g0Var.show();
                break;
            case 6:
                xn xnVar = (xn) obj;
                xnVar.w.setProgress(0.0f);
                xnVar.w.d();
                break;
            case 7:
                sp spVar = (sp) obj;
                if (!spVar.r1) {
                    int i14 = spVar.q1;
                    if (i14 != spVar.p1) {
                        spVar.r1 = true;
                        if (i14 == 3) {
                            i11 = 2678400;
                        } else if (i14 == 2) {
                            i11 = 604800;
                        } else if (i14 == 1) {
                            i11 = 86400;
                        } else {
                            i10 = 71;
                            i11 = 0;
                            org.telegram.ui.sb sbVar2 = spVar.s1.a;
                            org.telegram.messenger.vp messagesController = sbVar2.getMessagesController();
                            TLRPC.Chat chat = sbVar2.f;
                            messagesController.F4(i11, -chat.id);
                            M0 = sbVar2.getMessagesController().M0(chat.id);
                            if (M0 != null) {
                                sbVar2.x.k(-chat.id, i10, null, Integer.valueOf(M0.ttl_period), null, null);
                            }
                        }
                        i10 = 70;
                        org.telegram.ui.sb sbVar22 = spVar.s1.a;
                        org.telegram.messenger.vp messagesController2 = sbVar22.getMessagesController();
                        TLRPC.Chat chat2 = sbVar22.f;
                        messagesController2.F4(i11, -chat2.id);
                        M0 = sbVar22.getMessagesController().M0(chat2.id);
                        if (M0 != null) {
                        }
                    }
                    if (spVar.r1) {
                        org.telegram.messenger.i0.h3(new ho(spVar, i13), 200L);
                        break;
                    } else {
                        spVar.dismiss();
                        break;
                    }
                }
                break;
            case 8:
                ((sq) obj).run();
                break;
            case 9:
                ((vr) obj).i1(true);
                break;
            case 10:
                ((cv) obj).M0();
                break;
            case 11:
                Runnable runnable = ((mv) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 12:
                ex exVar = (ex) obj;
                vy vyVar = exVar.F;
                ArrayList arrayList = vyVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    org.telegram.messenger.vp.r1(vyVar.c1).g7.edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    ex exVar2 = vyVar.R;
                    if (exVar2 != null) {
                        exVar2.p(1, 3);
                    }
                    zw zwVar = vyVar.I;
                    if (zwVar != null) {
                        zwVar.p(vyVar.getEmojipacks());
                    }
                    exVar.H();
                    break;
                }
                break;
            case 13:
                qy qyVar = (qy) obj;
                qyVar.getClass();
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                vy vyVar2 = qyVar.Q;
                LongSparseArray longSparseArray = vyVar2.y1;
                LongSparseArray longSparseArray2 = vyVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (w3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        vyVar2.t1.h(w3Var.getStickerSet());
                        break;
                    } else {
                        w3Var.b(true, true);
                        vyVar2.y1.put(stickerSet.set.id, stickerSet);
                        vyVar2.t1.r(w3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 14:
                j00 j00Var = (j00) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = j00Var.S1;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = j00Var.R1;
                ArrayList arrayList2 = j00Var.a2;
                boolean z10 = j00Var.T1;
                ArrayList arrayList3 = j00Var.Y1;
                int i15 = j00Var.Q1;
                org.telegram.ui.ActionBar.k2 k2Var = j00Var.o1;
                f00 f00Var = j00Var.d2;
                if (f00Var == null || !f00Var.r) {
                    if (arrayList3 == null) {
                        j00Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                long o10 = org.telegram.messenger.o5.o((TLRPC.Peer) arrayList3.get(i16));
                                if (arrayList2.contains(Long.valueOf(o10))) {
                                    arrayList4.add(k2Var.getMessagesController().i1(o10));
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
                                    j00Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = j00Var.P1;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i15;
                                k2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                k2Var.getMessagesController().k2(i15);
                                j00Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i15;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.z4 parentLayout = k2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.k2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.un) {
                                        org.telegram.ui.un unVar = (org.telegram.ui.un) lastFragment;
                                        unVar.Y7();
                                        undoView = unVar.M3;
                                    } else if (lastFragment instanceof org.telegram.ui.ay) {
                                        undoView = ((org.telegram.ui.ay) lastFragment).j4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).d0();
                                    } else if (lastFragment instanceof org.telegram.ui.i00) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (sc.e.g(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) sc.e.g(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.d0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        j00Var.d2.a(true);
                                        j00Var.r2 = k2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ag.p0(j00Var, lastFragment, arrayList4, 11));
                                        break;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                                            arrayList5.add(Long.valueOf(org.telegram.messenger.o5.n((TLRPC.InputPeer) arrayList4.get(i17))));
                                        }
                                        org.telegram.messenger.vp messagesController3 = k2Var.getMessagesController();
                                        ArrayList arrayList6 = messagesController3.R0;
                                        messagesController3.Q0 = new ArrayList(messagesController3.P0);
                                        int i18 = 0;
                                        while (i18 < messagesController3.Q0.size()) {
                                            if (((org.telegram.messenger.ap) messagesController3.Q0.get(i18)).a == i15) {
                                                messagesController3.Q0.remove(i18);
                                                i18--;
                                            }
                                            i18++;
                                        }
                                        arrayList6.clear();
                                        arrayList6.addAll(arrayList5);
                                        boolean isEmpty = arrayList6.isEmpty();
                                        boolean z11 = !isEmpty;
                                        messagesController3.getNotificationCenter().k(org.telegram.messenger.zs.O2, new Object[0]);
                                        if (!isEmpty) {
                                            messagesController3.getNotificationCenter().k(3, new Object[0]);
                                        }
                                        Pair pair = new Pair(new i2.j0(messagesController3, i15, z11, 1), new org.telegram.messenger.c20(4, messagesController3, z11));
                                        undoView2.k(0L, 88, j00Var.U1, Integer.valueOf(arrayList4.size()), new jg(j00Var, tL_chatlists_joinChatlistInvite, pair, 7), (Runnable) pair.second);
                                        j00Var.s2 = true;
                                        j00Var.dismiss();
                                        k2Var.getMessagesController().k2(i15);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                vg vgVar = new vg(10, j00Var, arrayList4);
                                b00 b00Var = tL_chatlists_chatlistUpdates != null ? new b00(vgVar, parentLayout) : new b00(parentLayout, vgVar);
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList4.size()) {
                                        if (j00Var.Z1.contains(Long.valueOf(org.telegram.messenger.o5.n((TLRPC.InputPeer) arrayList4.get(i19))))) {
                                            i19++;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            k2Var.getMessagesController().r0(1, zArr);
                                            if (zArr[0]) {
                                                k2Var.getNotificationCenter().k(3, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                j00Var.d2.a(true);
                                j00Var.r2 = k2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ag.k0(29, j00Var, b00Var));
                                break;
                            }
                        } else {
                            f00 f00Var2 = j00Var.d2;
                            int i20 = -j00Var.u2;
                            j00Var.u2 = i20;
                            org.telegram.messenger.i0.F3(i20, f00Var2, null);
                            org.telegram.messenger.t2.D.a();
                            break;
                        }
                    } else {
                        j00Var.dismiss();
                        break;
                    }
                }
                break;
            case 15:
                h10 h10Var = (h10) obj;
                ArrayList arrayList7 = h10Var.F;
                if (h10Var.d()) {
                    g10 g10Var = h10Var.H;
                    if (g10Var != null && (kxVar = ((org.telegram.ui.iw) g10Var).a.C0) != null) {
                        kxVar.R(false);
                    }
                    for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                        if (h10Var.H != null && ((zf.e0) arrayList7.get(i21)).h) {
                            ((org.telegram.ui.iw) h10Var.H).h((zf.e0) arrayList7.get(i21));
                        }
                    }
                    h10Var.c();
                    break;
                } else {
                    Runnable runnable2 = h10Var.D;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        h10Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 16:
                ((hl) obj).run();
                break;
            case 17:
                ((hl) obj).run();
                break;
            case 18:
                t10 t10Var = (t10) obj;
                t10Var.I0();
                t10Var.dismiss();
                break;
            case 19:
                ((g20) obj).e(false);
                break;
            case 20:
                k20 k20Var = (k20) obj;
                k20Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(k20Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    k20Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.b40 b40Var = (org.telegram.ui.b40) obj;
                b40Var.J0(b40Var.n1);
                b40Var.dismiss();
                break;
            case 22:
                ((e30) obj).dismiss();
                break;
            case 23:
                j30 j30Var = (j30) obj;
                j30Var.Z(!j30Var.D, true);
                zf.a1 a1Var = j30Var.r;
                boolean z12 = j30Var.D;
                ValueAnimator valueAnimator = a1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(a1Var.e, z12 ? 1.0f : 0.0f);
                a1Var.f = ofFloat;
                ofFloat.addUpdateListener(new bg.o(a1Var, 14));
                a1Var.f.addListener(new sg.y(17, a1Var, z12));
                a1Var.f.setDuration(320L);
                a1Var.f.setInterpolator(gr.h);
                a1Var.f.start();
                break;
            case 24:
                ((q30) obj).b(true);
                break;
            case 25:
                ((d40) obj).dismiss();
                break;
            case 26:
                z60 z60Var = (z60) obj;
                HashSet hashSet = xh.m2.a1;
                if (z60Var.J) {
                    z60Var.u();
                    break;
                }
                break;
            case 27:
                k70 k70Var = (k70) obj;
                k70Var.v1 = org.telegram.messenger.vp.r1(k70Var.a).i1(org.telegram.messenger.jj.C1(k70Var.t1));
                k70Var.w1 = true;
                k70Var.dismiss();
                break;
            case 28:
                m70 m70Var = (m70) obj;
                m70Var.i1 = true;
                m70Var.dismiss();
                break;
            default:
                ((u70) obj).dismiss();
                break;
        }
    }

    public /* synthetic */ h0(z60 z60Var, r5.a aVar) {
        this.a = 26;
        this.b = z60Var;
    }
}
