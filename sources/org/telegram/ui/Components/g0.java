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
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.yx yxVar;
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
                org.telegram.ui.wa waVar = h0Var.d0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = h0Var.V;
                a0.h hVar2 = h0Var.X;
                org.telegram.ui.sb sbVar = waVar.a;
                sbVar.v0 = tL_channelAdminLogEventsFilter2;
                sbVar.x0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    sbVar.J.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    sbVar.J.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                sbVar.V0(true);
                h0Var.dismiss();
                break;
            case 1:
                ((org.telegram.ui.Cells.z1) obj).c(!r8.b(), true);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.z1) view).c(atomicBoolean.get(), true);
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
                f0 f0Var = new f0(bdVar.getContext(), new oh.b());
                f0Var.m0(bdVar.f.getText());
                f0Var.g0 = new v2(bdVar, 1);
                ch chVar = new ch(bdVar, i13);
                f0Var.i0 = 0L;
                f0Var.j0 = true;
                f0Var.k0 = chVar;
                f0Var.show();
                break;
            case 8:
                ho hoVar = (ho) obj;
                hoVar.v.setProgress(0.0f);
                hoVar.v.d();
                break;
            case 9:
                cq cqVar = (cq) obj;
                if (!cqVar.s) {
                    int i15 = cqVar.r;
                    if (i15 != cqVar.n) {
                        cqVar.s = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.sb sbVar2 = cqVar.v.a;
                            MessagesController messagesController = sbVar2.getMessagesController();
                            TLRPC.Chat chat = sbVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = sbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                sbVar2.C.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.sb sbVar22 = cqVar.v.a;
                        MessagesController messagesController2 = sbVar22.getMessagesController();
                        TLRPC.Chat chat2 = sbVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = sbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (cqVar.s) {
                        AndroidUtilities.runOnUIThread(new xp(cqVar, 0), 200L);
                        break;
                    } else {
                        cqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((xq) obj).run();
                break;
            case 11:
                ((gs) obj).W(true);
                break;
            case 12:
                ((ov) obj).Z();
                break;
            case 13:
                Runnable runnable = ((zv) obj).O;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                tx txVar = (tx) obj;
                mz mzVar = txVar.C;
                ArrayList arrayList = mzVar.k1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(mzVar.Z0).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    tx txVar2 = mzVar.O;
                    if (txVar2 != null) {
                        txVar2.t(1, 3);
                    }
                    hw hwVar = mzVar.F;
                    if (hwVar != null) {
                        hwVar.p(mzVar.getEmojipacks());
                    }
                    txVar.H();
                    break;
                }
                break;
            case 15:
                hz hzVar = (hz) obj;
                hzVar.getClass();
                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                mz mzVar2 = hzVar.N;
                LongSparseArray longSparseArray = mzVar2.v1;
                LongSparseArray longSparseArray2 = mzVar2.w1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (r3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        mzVar2.q1.h(r3Var.getStickerSet());
                        break;
                    } else {
                        r3Var.b(true, true);
                        mzVar2.v1.put(stickerSet.set.id, stickerSet);
                        mzVar2.q1.r(r3Var.getStickerSet());
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
                            org.telegram.ui.ActionBar.f5 parentLayout = p2Var.getParentLayout();
                            if (z4) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.p2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.xn) {
                                        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) lastFragment;
                                        xnVar.Q7();
                                        undoView = xnVar.v3;
                                    } else if (lastFragment instanceof org.telegram.ui.py) {
                                        undoView = ((org.telegram.ui.py) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.b10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (org.telegram.ui.yh.j(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) org.telegram.ui.yh.j(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        d10Var.i0.a(true);
                                        d10Var.w0 = p2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new hg.y(d10Var, lastFragment, arrayList4, 15));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = p2Var.getMessagesController().removeFolderTemporarily(i16, arrayList5);
                                        undoView2.k(0L, 88, d10Var.Z, Integer.valueOf(arrayList4.size()), new jp(d10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 4), (Runnable) removeFolderTemporarily.second);
                                        d10Var.x0 = true;
                                        d10Var.dismiss();
                                        p2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                xk xkVar = new xk(6, d10Var, arrayList4);
                                w00 w00Var = tL_chatlists_chatlistUpdates != null ? new w00(xkVar, parentLayout) : new w00(parentLayout, xkVar);
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
                                d10Var.w0 = p2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.lo(9, d10Var, w00Var));
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
                    if (c20Var != null && (yxVar = ((org.telegram.ui.ux) c20Var).b.z0) != null) {
                        yxVar.Q(false);
                    }
                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                        if (d20Var.E != null && ((uf.e0) arrayList6.get(i21)).h) {
                            ((org.telegram.ui.ux) d20Var.E).d((uf.e0) arrayList6.get(i21));
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
                ((hl) obj).run();
                break;
            case 19:
                ((hl) obj).run();
                break;
            case 20:
                p20 p20Var = (p20) obj;
                p20Var.m();
                p20Var.dismiss();
                break;
            case 21:
                ((c30) obj).e(false);
                break;
            case 22:
                g30 g30Var = (g30) obj;
                g30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(g30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    g30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                o30 o30Var = (o30) obj;
                o30Var.n(o30Var.h);
                o30Var.dismiss();
                break;
            case 24:
                ((a40) obj).dismiss();
                break;
            case 25:
                f40 f40Var = (f40) obj;
                f40Var.U(!f40Var.y, true);
                uf.x0 x0Var = f40Var.r;
                boolean z10 = f40Var.y;
                ValueAnimator valueAnimator = x0Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.e, z10 ? 1.0f : 0.0f);
                x0Var.f = ofFloat;
                ofFloat.addUpdateListener(new f2.d0(x0Var, 11));
                x0Var.f.addListener(new vd1(16, x0Var, z10));
                x0Var.f.setDuration(320L);
                x0Var.f.setInterpolator(pr.h);
                x0Var.f.start();
                break;
            case 26:
                ((m40) obj).b(true);
                break;
            case 27:
                ((a50) obj).dismiss();
                break;
            case 28:
                q70 q70Var = (q70) obj;
                HashSet hashSet = sh.p2.T0;
                if (q70Var.J) {
                    q70Var.u();
                    break;
                }
                break;
            default:
                a80.n((a80) obj);
                break;
        }
    }

    public /* synthetic */ g0(q70 q70Var, org.telegram.ui.sj0 sj0Var) {
        this.a = 28;
        this.b = q70Var;
    }
}
