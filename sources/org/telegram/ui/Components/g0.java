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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0455  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.zx zxVar;
        int i12 = this.a;
        UndoView undoView = null;
        int i13 = 2;
        Object obj = this.b;
        switch (i12) {
            case 0:
                h0 h0Var = (h0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = h0Var.V;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    h0Var.V = null;
                }
                a0.h hVar = h0Var.X;
                if (hVar != null && h0Var.W != null && hVar.m() >= h0Var.W.size()) {
                    h0Var.X = null;
                }
                org.telegram.ui.ya yaVar = h0Var.d0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.V;
                a0.h hVar2 = h0Var.X;
                org.telegram.ui.ub ubVar = yaVar.a;
                ubVar.v0 = tL_channelAdminLogEventsFilter2;
                ubVar.x0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    ubVar.J.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    ubVar.J.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                ubVar.V0(true);
                h0Var.dismiss();
                break;
            case 1:
                ((org.telegram.ui.Cells.y1) obj).c(!r8.b(), true);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.y1) view).c(atomicBoolean.get(), true);
                break;
            case 3:
                ((w8) obj).f0();
                break;
            case 4:
                v9 v9Var = (v9) obj;
                int i14 = v9Var.v + 1;
                v9Var.v = i14;
                if (i14 >= 10) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((tb) ((rb) obj).j1).f();
                ic.e();
                break;
            case 6:
                ((gc) obj).f();
                break;
            case 7:
                bd bdVar = (bd) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                f0 f0Var = new f0(bdVar.getContext(), new nh.b());
                f0Var.m0(bdVar.f.getText());
                f0Var.g0 = new v2(bdVar, 1);
                ch chVar = new ch(bdVar, i13);
                f0Var.i0 = 0L;
                f0Var.j0 = true;
                f0Var.k0 = chVar;
                f0Var.show();
                break;
            case 8:
                eo eoVar = (eo) obj;
                eoVar.v.setProgress(0.0f);
                eoVar.v.d();
                break;
            case 9:
                zp zpVar = (zp) obj;
                if (!zpVar.s) {
                    int i15 = zpVar.r;
                    if (i15 != zpVar.n) {
                        zpVar.s = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.ub ubVar2 = zpVar.v.a;
                            MessagesController messagesController = ubVar2.getMessagesController();
                            TLRPC.Chat chat = ubVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = ubVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                ubVar2.C.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.ub ubVar22 = zpVar.v.a;
                        MessagesController messagesController2 = ubVar22.getMessagesController();
                        TLRPC.Chat chat2 = ubVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = ubVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (zpVar.s) {
                        AndroidUtilities.runOnUIThread(new up(zpVar, 0), 200L);
                        break;
                    } else {
                        zpVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((uq) obj).run();
                break;
            case 11:
                ((ds) obj).W(true);
                break;
            case 12:
                ((lv) obj).Z();
                break;
            case 13:
                Runnable runnable = ((wv) obj).O;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                rx rxVar = (rx) obj;
                kz kzVar = rxVar.C;
                ArrayList arrayList = kzVar.k1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(kzVar.Z0).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    rx rxVar2 = kzVar.O;
                    if (rxVar2 != null) {
                        rxVar2.t(1, 3);
                    }
                    fw fwVar = kzVar.F;
                    if (fwVar != null) {
                        fwVar.p(kzVar.getEmojipacks());
                    }
                    rxVar.H();
                    break;
                }
                break;
            case 15:
                fz fzVar = (fz) obj;
                fzVar.getClass();
                org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                kz kzVar2 = fzVar.N;
                LongSparseArray longSparseArray = kzVar2.v1;
                LongSparseArray longSparseArray2 = kzVar2.w1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (q3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        kzVar2.q1.h(q3Var.getStickerSet());
                        break;
                    } else {
                        q3Var.b(true, true);
                        kzVar2.v1.put(stickerSet.set.id, stickerSet);
                        kzVar2.q1.r(q3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                d10 d10Var = (d10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = d10Var.X;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = d10Var.W;
                ArrayList arrayList2 = d10Var.f0;
                boolean z4 = d10Var.Y;
                ArrayList arrayList3 = d10Var.d0;
                int i16 = d10Var.V;
                org.telegram.ui.ActionBar.p2 p2Var = d10Var.n;
                z00 z00Var = d10Var.i0;
                if (z00Var == null || !z00Var.n) {
                    if (arrayList3 == null) {
                        d10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z4) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i17));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(p2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                            }
                            char c3 = 0;
                            if (z4) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i16;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    d10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = d10Var.U;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i16;
                                p2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                p2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                d10Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i16;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.e5 parentLayout = p2Var.getParentLayout();
                            if (z4) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.p2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.zn) {
                                        org.telegram.ui.zn znVar = (org.telegram.ui.zn) lastFragment;
                                        znVar.Q7();
                                        undoView = znVar.v3;
                                    } else if (lastFragment instanceof org.telegram.ui.qy) {
                                        undoView = ((org.telegram.ui.qy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.c10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (org.telegram.ui.ai.j(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) org.telegram.ui.ai.j(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        d10Var.i0.a(true);
                                        d10Var.w0 = p2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new gg.y(d10Var, lastFragment, arrayList4, 15));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = p2Var.getMessagesController().removeFolderTemporarily(i16, arrayList5);
                                        undoView2.k(0L, 88, d10Var.Z, Integer.valueOf(arrayList4.size()), new gp(d10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 4), (Runnable) removeFolderTemporarily.second);
                                        d10Var.x0 = true;
                                        d10Var.dismiss();
                                        p2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                vk vkVar = new vk(6, d10Var, arrayList4);
                                w00 w00Var = tL_chatlists_chatlistUpdates != null ? new w00(vkVar, parentLayout) : new w00(parentLayout, vkVar);
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList4.size()) {
                                        if (d10Var.e0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i19))))) {
                                            i19++;
                                            c3 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            p2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c3]) {
                                                p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                d10Var.i0.a(true);
                                d10Var.w0 = p2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.no(9, d10Var, w00Var));
                                break;
                            }
                        } else {
                            z00 z00Var2 = d10Var.i0;
                            int i20 = -d10Var.z0;
                            d10Var.z0 = i20;
                            AndroidUtilities.shakeViewSpring(z00Var2, i20);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        d10Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                d20 d20Var = (d20) obj;
                ArrayList arrayList6 = d20Var.C;
                if (d20Var.d()) {
                    c20 c20Var = d20Var.E;
                    if (c20Var != null && (zxVar = ((org.telegram.ui.vx) c20Var).b.z0) != null) {
                        zxVar.Q(false);
                    }
                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                        if (d20Var.E != null && ((tf.e0) arrayList6.get(i21)).h) {
                            ((org.telegram.ui.vx) d20Var.E).d((tf.e0) arrayList6.get(i21));
                        }
                    }
                    d20Var.c();
                    break;
                } else {
                    Runnable runnable2 = d20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        d20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((fl) obj).run();
                break;
            case 19:
                ((fl) obj).run();
                break;
            case 20:
                p20 p20Var = (p20) obj;
                p20Var.m();
                p20Var.dismiss();
                break;
            case 21:
                ((b30) obj).e(false);
                break;
            case 22:
                f30 f30Var = (f30) obj;
                f30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(f30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    f30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                n30 n30Var = (n30) obj;
                n30Var.n(n30Var.h);
                n30Var.dismiss();
                break;
            case 24:
                ((z30) obj).dismiss();
                break;
            case 25:
                e40 e40Var = (e40) obj;
                e40Var.U(!e40Var.y, true);
                tf.x0 x0Var = e40Var.r;
                boolean z10 = e40Var.y;
                ValueAnimator valueAnimator = x0Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.e, z10 ? 1.0f : 0.0f);
                x0Var.f = ofFloat;
                ofFloat.addUpdateListener(new eg.b1(x0Var, 11));
                x0Var.f.addListener(new org.telegram.ui.s61(16, x0Var, z10));
                x0Var.f.setDuration(320L);
                x0Var.f.setInterpolator(mr.h);
                x0Var.f.start();
                break;
            case 26:
                ((l40) obj).b(true);
                break;
            case 27:
                ((z40) obj).dismiss();
                break;
            case 28:
                p70 p70Var = (p70) obj;
                HashSet hashSet = rh.p2.T0;
                if (p70Var.J) {
                    p70Var.u();
                    break;
                }
                break;
            default:
                z70.n((z70) obj);
                break;
        }
    }

    public /* synthetic */ g0(p70 p70Var, org.telegram.ui.j21 j21Var) {
        this.a = 28;
        this.b = p70Var;
    }
}
