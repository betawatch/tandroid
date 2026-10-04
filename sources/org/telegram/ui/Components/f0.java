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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x044c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.dy dyVar;
        int i12 = this.a;
        UndoView undoView = null;
        int i13 = 3;
        int i14 = 1;
        Object obj = this.b;
        switch (i12) {
            case 0:
                g0 g0Var = (g0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.Y;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    g0Var.Y = null;
                }
                a0.i iVar = g0Var.a0;
                if (iVar != null && g0Var.Z != null && iVar.m() >= g0Var.Z.size()) {
                    g0Var.a0 = null;
                }
                org.telegram.ui.ab abVar = g0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                a0.i iVar2 = g0Var.a0;
                org.telegram.ui.wb wbVar = abVar.a;
                wbVar.u0 = tL_channelAdminLogEventsFilter2;
                wbVar.w0 = iVar2;
                if (tL_channelAdminLogEventsFilter2 == null && iVar2 == null) {
                    wbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    wbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                wbVar.U0(true);
                g0Var.dismiss();
                break;
            case 1:
                ((org.telegram.ui.Cells.a2) obj).c(!r9.b(), true);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.a2) view).c(atomicBoolean.get(), true);
                break;
            case 3:
                ((e9) obj).f0();
                break;
            case 4:
                ea eaVar = (ea) obj;
                int i15 = eaVar.v + 1;
                eaVar.v = i15;
                if (i15 >= 10) {
                    eaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((cc) ((ac) obj).m1).f();
                rc.e();
                break;
            case 6:
                ((pc) obj).f();
                break;
            case 7:
                md mdVar = (md) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(mdVar.getContext(), new ai.d());
                e0Var.m0(mdVar.f.getText());
                e0Var.j0 = new y2(mdVar, i14);
                oh ohVar = new oh(mdVar, 2);
                e0Var.l0 = 0L;
                e0Var.m0 = true;
                e0Var.n0 = ohVar;
                e0Var.show();
                break;
            case 8:
                mo moVar = (mo) obj;
                moVar.v.setProgress(0.0f);
                moVar.v.d();
                break;
            case 9:
                fq fqVar = (fq) obj;
                if (!fqVar.s) {
                    int i16 = fqVar.r;
                    if (i16 != fqVar.n) {
                        fqVar.s = true;
                        if (i16 == 3) {
                            i10 = 2678400;
                        } else if (i16 == 2) {
                            i10 = 604800;
                        } else if (i16 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.wb wbVar2 = fqVar.v.a;
                            MessagesController messagesController = wbVar2.getMessagesController();
                            TLRPC.Chat chat = wbVar2.f;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = wbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                wbVar2.w.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.wb wbVar22 = fqVar.v.a;
                        MessagesController messagesController2 = wbVar22.getMessagesController();
                        TLRPC.Chat chat2 = wbVar22.f;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = wbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (fqVar.s) {
                        AndroidUtilities.runOnUIThread(new aq(fqVar, 0), 200L);
                        break;
                    } else {
                        fqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((ar) obj).run();
                break;
            case 11:
                ((is) obj).U(true);
                break;
            case 12:
                ((wv) obj).Y();
                break;
            case 13:
                Runnable runnable = ((gw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                wx wxVar = (wx) obj;
                nz nzVar = wxVar.F;
                ArrayList arrayList = nzVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(nzVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    wx wxVar2 = nzVar.R;
                    if (wxVar2 != null) {
                        wxVar2.t(1, 3);
                    }
                    rx rxVar = nzVar.I;
                    if (rxVar != null) {
                        rxVar.p(nzVar.getEmojipacks());
                    }
                    wxVar.H();
                    break;
                }
                break;
            case 15:
                iz izVar = (iz) obj;
                izVar.getClass();
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                nz nzVar2 = izVar.Q;
                LongSparseArray longSparseArray = nzVar2.y1;
                LongSparseArray longSparseArray2 = nzVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (s3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        nzVar2.t1.h(s3Var.getStickerSet());
                        break;
                    } else {
                        s3Var.b(true, true);
                        nzVar2.y1.put(stickerSet.set.id, stickerSet);
                        nzVar2.t1.r(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                f10 f10Var = (f10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = f10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = f10Var.Z;
                ArrayList arrayList2 = f10Var.i0;
                boolean z10 = f10Var.b0;
                ArrayList arrayList3 = f10Var.g0;
                int i17 = f10Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var = f10Var.n;
                b10 b10Var = f10Var.l0;
                if (b10Var == null || !b10Var.n) {
                    if (arrayList3 == null) {
                        f10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            char c10 = 0;
                            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i18));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(n2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                            }
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i17;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    f10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = f10Var.X;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i17;
                                n2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                n2Var.getMessagesController().invalidateChatlistFolderUpdate(i17);
                                f10Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i17;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.c5 parentLayout = n2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.n2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.yn) {
                                        org.telegram.ui.yn ynVar = (org.telegram.ui.yn) lastFragment;
                                        ynVar.Q7();
                                        undoView = ynVar.w3;
                                    } else if (lastFragment instanceof org.telegram.ui.uy) {
                                        undoView = ((org.telegram.ui.uy) lastFragment).h4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).X();
                                    } else if (lastFragment instanceof org.telegram.ui.f10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (t8.b.h(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) t8.b.h(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.X();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        f10Var.l0.a(true);
                                        f10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ai.s5(f10Var, lastFragment, arrayList4, 10));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i19))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = n2Var.getMessagesController().removeFolderTemporarily(i17, arrayList5);
                                        undoView2.k(0L, 88, f10Var.c0, Integer.valueOf(arrayList4.size()), new org.telegram.messenger.video.o(f10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 20), (Runnable) removeFolderTemporarily.second);
                                        f10Var.A0 = true;
                                        f10Var.dismiss();
                                        n2Var.getMessagesController().invalidateChatlistFolderUpdate(i17);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.qc qcVar = new org.telegram.ui.qc(26, f10Var, arrayList4);
                                y00 y00Var = tL_chatlists_chatlistUpdates != null ? new y00(qcVar, parentLayout) : new y00(parentLayout, qcVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (f10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
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
                                f10Var.l0.a(true);
                                f10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.no(9, f10Var, y00Var));
                                break;
                            }
                        } else {
                            b10 b10Var2 = f10Var.l0;
                            int i21 = -f10Var.C0;
                            f10Var.C0 = i21;
                            AndroidUtilities.shakeViewSpring(b10Var2, i21);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        f10Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                f20 f20Var = (f20) obj;
                ArrayList arrayList6 = f20Var.F;
                if (f20Var.d()) {
                    e20 e20Var = f20Var.H;
                    if (e20Var != null && (dyVar = ((org.telegram.ui.cy) e20Var).a.C0) != null) {
                        dyVar.S(false);
                    }
                    for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                        if (f20Var.H != null && ((gg.q0) arrayList6.get(i22)).h) {
                            ((org.telegram.ui.cy) f20Var.H).d((gg.q0) arrayList6.get(i22));
                        }
                    }
                    f20Var.c();
                    break;
                } else {
                    Runnable runnable2 = f20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        f20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((ol) obj).run();
                break;
            case 19:
                ((ol) obj).run();
                break;
            case 20:
                r20 r20Var = (r20) obj;
                r20Var.m();
                r20Var.dismiss();
                break;
            case 21:
                ((d30) obj).e(false);
                break;
            case 22:
                h30 h30Var = (h30) obj;
                h30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(h30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    h30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                p30 p30Var = (p30) obj;
                p30Var.n(p30Var.h);
                p30Var.dismiss();
                break;
            case 24:
                ((a40) obj).dismiss();
                break;
            case 25:
                f40 f40Var = (f40) obj;
                f40Var.S(!f40Var.y, true);
                gg.n1 n1Var = f40Var.r;
                boolean z11 = f40Var.y;
                ValueAnimator valueAnimator = n1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.e, z11 ? 1.0f : 0.0f);
                n1Var.f = ofFloat;
                ofFloat.addUpdateListener(new ai.k6(n1Var, i13));
                n1Var.f.addListener(new ai.n(16, n1Var, z11));
                n1Var.f.setDuration(320L);
                n1Var.f.setInterpolator(tr.h);
                n1Var.f.start();
                break;
            case 26:
                ((m40) obj).b(true);
                break;
            case 27:
                ((a50) obj).dismiss();
                break;
            case 28:
                b80 b80Var = (b80) obj;
                HashSet hashSet = ei.l3.W0;
                if (b80Var.J) {
                    b80Var.u();
                    break;
                }
                break;
            default:
                k80.n((k80) obj);
                break;
        }
    }

    public /* synthetic */ f0(b80 b80Var, ai.f fVar) {
        this.a = 28;
        this.b = b80Var;
    }
}
