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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0451  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.ey eyVar;
        int i12 = this.a;
        int i13 = 17;
        UndoView undoView = null;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                h0 h0Var = (h0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = h0Var.Y;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    h0Var.Y = null;
                }
                a0.i iVar = h0Var.a0;
                if (iVar != null && h0Var.Z != null && iVar.m() >= h0Var.Z.size()) {
                    h0Var.a0 = null;
                }
                org.telegram.ui.ya yaVar = h0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.Y;
                a0.i iVar2 = h0Var.a0;
                org.telegram.ui.ub ubVar = yaVar.a;
                ubVar.y0 = tL_channelAdminLogEventsFilter2;
                ubVar.A0 = iVar2;
                if (tL_channelAdminLogEventsFilter2 == null && iVar2 == null) {
                    ubVar.M.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    ubVar.M.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                ubVar.V0(true);
                h0Var.dismiss();
                break;
            case 1:
                ((org.telegram.ui.Cells.z1) obj).c(!r10.b(), true);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.z1) view).c(atomicBoolean.get(), true);
                break;
            case 3:
                ((f9) obj).f0();
                break;
            case 4:
                da daVar = (da) obj;
                int i17 = daVar.v + 1;
                daVar.v = i17;
                if (i17 >= 10) {
                    daVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((bc) ((zb) obj).m1).f();
                qc.e();
                break;
            case 6:
                ((oc) obj).f();
                break;
            case 7:
                ld ldVar = (ld) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                f0 f0Var = new f0(ldVar.getContext(), new bi.b());
                f0Var.m0(ldVar.f.getText());
                f0Var.j0 = new y2(ldVar, 1);
                nh nhVar = new nh(ldVar, i15);
                f0Var.l0 = 0L;
                f0Var.m0 = true;
                f0Var.n0 = nhVar;
                f0Var.show();
                break;
            case 8:
                io ioVar = (io) obj;
                ioVar.v.setProgress(0.0f);
                ioVar.v.d();
                break;
            case 9:
                bq bqVar = (bq) obj;
                if (!bqVar.s) {
                    int i18 = bqVar.r;
                    if (i18 != bqVar.n) {
                        bqVar.s = true;
                        if (i18 == 3) {
                            i10 = 2678400;
                        } else if (i18 == 2) {
                            i10 = 604800;
                        } else if (i18 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.ub ubVar2 = bqVar.v.a;
                            MessagesController messagesController = ubVar2.getMessagesController();
                            TLRPC.Chat chat = ubVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = ubVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                ubVar2.F.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.ub ubVar22 = bqVar.v.a;
                        MessagesController messagesController2 = ubVar22.getMessagesController();
                        TLRPC.Chat chat2 = ubVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = ubVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (bqVar.s) {
                        AndroidUtilities.runOnUIThread(new wp(bqVar, 0), 200L);
                        break;
                    } else {
                        bqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((wq) obj).run();
                break;
            case 11:
                ((es) obj).W(true);
                break;
            case 12:
                ((rv) obj).Z();
                break;
            case 13:
                Runnable runnable = ((bw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                tx txVar = (tx) obj;
                kz kzVar = txVar.F;
                ArrayList arrayList = kzVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(kzVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    tx txVar2 = kzVar.R;
                    if (txVar2 != null) {
                        txVar2.t(1, 3);
                    }
                    jw jwVar = kzVar.I;
                    if (jwVar != null) {
                        jwVar.p(kzVar.getEmojipacks());
                    }
                    txVar.H();
                    break;
                }
                break;
            case 15:
                fz fzVar = (fz) obj;
                fzVar.getClass();
                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                kz kzVar2 = fzVar.Q;
                LongSparseArray longSparseArray = kzVar2.y1;
                LongSparseArray longSparseArray2 = kzVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (r3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        kzVar2.t1.h(r3Var.getStickerSet());
                        break;
                    } else {
                        r3Var.b(true, true);
                        kzVar2.y1.put(stickerSet.set.id, stickerSet);
                        kzVar2.t1.r(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                c10 c10Var = (c10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = c10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = c10Var.Z;
                ArrayList arrayList2 = c10Var.i0;
                boolean z10 = c10Var.b0;
                ArrayList arrayList3 = c10Var.g0;
                int i19 = c10Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var = c10Var.n;
                y00 y00Var = c10Var.l0;
                if (y00Var == null || !y00Var.n) {
                    if (arrayList3 == null) {
                        c10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            char c10 = 0;
                            while (i16 < arrayList3.size()) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i16));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(n2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                                i16++;
                            }
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i19;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    c10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = c10Var.X;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i19;
                                n2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                n2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                c10Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i19;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.d5 parentLayout = n2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.n2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.co) {
                                        org.telegram.ui.co coVar = (org.telegram.ui.co) lastFragment;
                                        coVar.Q7();
                                        undoView = coVar.y3;
                                    } else if (lastFragment instanceof org.telegram.ui.uy) {
                                        undoView = ((org.telegram.ui.uy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.f10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (org.telegram.ui.Cells.p6.g(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) org.telegram.ui.Cells.p6.g(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        c10Var.l0.a(true);
                                        c10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.c5(c10Var, lastFragment, arrayList4, 10));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = n2Var.getMessagesController().removeFolderTemporarily(i19, arrayList5);
                                        undoView2.k(0L, 88, c10Var.c0, Integer.valueOf(arrayList4.size()), new org.telegram.ui.ActionBar.p(c10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 17), (Runnable) removeFolderTemporarily.second);
                                        c10Var.A0 = true;
                                        c10Var.dismiss();
                                        n2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.nf nfVar = new org.telegram.ui.nf(19, c10Var, arrayList4);
                                v00 v00Var = tL_chatlists_chatlistUpdates != null ? new v00(nfVar, parentLayout) : new v00(parentLayout, nfVar);
                                int i21 = 0;
                                while (true) {
                                    if (i21 < arrayList4.size()) {
                                        if (c10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i21))))) {
                                            i21++;
                                            c10 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            n2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c10]) {
                                                n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                c10Var.l0.a(true);
                                c10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.ro(9, c10Var, v00Var));
                                break;
                            }
                        } else {
                            y00 y00Var2 = c10Var.l0;
                            int i22 = -c10Var.C0;
                            c10Var.C0 = i22;
                            AndroidUtilities.shakeViewSpring(y00Var2, i22);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        c10Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                b20 b20Var = (b20) obj;
                ArrayList arrayList6 = b20Var.F;
                if (b20Var.e()) {
                    a20 a20Var = b20Var.H;
                    if (a20Var != null && (eyVar = ((org.telegram.ui.zx) a20Var).b.C0) != null) {
                        eyVar.Q(false);
                    }
                    while (i16 < arrayList6.size()) {
                        if (b20Var.H != null && ((hg.q0) arrayList6.get(i16)).h) {
                            ((org.telegram.ui.zx) b20Var.H).c((hg.q0) arrayList6.get(i16));
                        }
                        i16++;
                    }
                    b20Var.c();
                    break;
                } else {
                    Runnable runnable2 = b20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        b20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((ll) obj).run();
                break;
            case 19:
                ((ll) obj).run();
                break;
            case 20:
                n20 n20Var = (n20) obj;
                n20Var.m();
                n20Var.dismiss();
                break;
            case 21:
                ((z20) obj).e(false);
                break;
            case 22:
                d30 d30Var = (d30) obj;
                d30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(d30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    d30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                l30 l30Var = (l30) obj;
                l30Var.n(l30Var.h);
                l30Var.dismiss();
                break;
            case 24:
                ((w30) obj).dismiss();
                break;
            case 25:
                b40 b40Var = (b40) obj;
                b40Var.U(!b40Var.y, true);
                hg.n1 n1Var = b40Var.r;
                boolean z11 = b40Var.y;
                ValueAnimator valueAnimator = n1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.e, z11 ? 1.0f : 0.0f);
                n1Var.f = ofFloat;
                ofFloat.addUpdateListener(new bi.u5(n1Var, i14));
                n1Var.f.addListener(new ah.q0(i13, n1Var, z11));
                n1Var.f.setDuration(320L);
                n1Var.f.setInterpolator(pr.h);
                n1Var.f.start();
                break;
            case 26:
                ((i40) obj).b(true);
                break;
            case 27:
                ((w40) obj).dismiss();
                break;
            case 28:
                n70 n70Var = (n70) obj;
                HashSet hashSet = fi.k3.W0;
                if (n70Var.J) {
                    n70Var.u();
                    break;
                }
                break;
            default:
                w70.n((w70) obj);
                break;
        }
    }

    public /* synthetic */ g0(n70 n70Var, ah.j jVar) {
        this.a = 28;
        this.b = n70Var;
    }
}
