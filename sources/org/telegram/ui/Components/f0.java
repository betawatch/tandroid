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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0458  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.iy iyVar;
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
                a0.h hVar = g0Var.a0;
                if (hVar != null && g0Var.Z != null && hVar.m() >= g0Var.Z.size()) {
                    g0Var.a0 = null;
                }
                org.telegram.ui.db dbVar = g0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                a0.h hVar2 = g0Var.a0;
                org.telegram.ui.ac acVar = dbVar.a;
                acVar.u0 = tL_channelAdminLogEventsFilter2;
                acVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    acVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    acVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                acVar.U0(true);
                g0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.a2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((h9) obj).f0();
                break;
            case 3:
                fa faVar = (fa) obj;
                int i15 = faVar.v + 1;
                faVar.v = i15;
                if (i15 >= 10) {
                    faVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 4:
                ((dc) ((bc) obj).m1).f();
                sc.e();
                break;
            case 5:
                ((qc) obj).f();
                break;
            case 6:
                md mdVar = (md) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(mdVar.getContext(), new bi.b());
                e0Var.n0(mdVar.f.getText());
                e0Var.j0 = new a3(mdVar, i14);
                nh nhVar = new nh(mdVar, 2);
                e0Var.l0 = 0L;
                e0Var.m0 = true;
                e0Var.n0 = nhVar;
                e0Var.show();
                break;
            case 7:
                wo woVar = (wo) obj;
                woVar.v.setProgress(0.0f);
                woVar.v.d();
                break;
            case 8:
                pq pqVar = (pq) obj;
                if (!pqVar.s) {
                    int i16 = pqVar.r;
                    if (i16 != pqVar.n) {
                        pqVar.s = true;
                        if (i16 == 3) {
                            i11 = 2678400;
                        } else if (i16 == 2) {
                            i11 = 604800;
                        } else if (i16 == 1) {
                            i11 = 86400;
                        } else {
                            i10 = 71;
                            i11 = 0;
                            org.telegram.ui.ac acVar2 = pqVar.v.a;
                            MessagesController messagesController = acVar2.getMessagesController();
                            TLRPC.Chat chat = acVar2.f;
                            messagesController.setDialogHistoryTTL(-chat.id, i11);
                            chatFull = acVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                acVar2.w.k(-chat.id, i10, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i10 = 70;
                        org.telegram.ui.ac acVar22 = pqVar.v.a;
                        MessagesController messagesController2 = acVar22.getMessagesController();
                        TLRPC.Chat chat2 = acVar22.f;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i11);
                        chatFull = acVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (pqVar.s) {
                        AndroidUtilities.runOnUIThread(new kq(pqVar, 0), 200L);
                        break;
                    } else {
                        pqVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                ((or) obj).run();
                break;
            case 10:
                ((ss) obj).X(true);
                break;
            case 11:
                ((ew) obj).a0();
                break;
            case 12:
                Runnable runnable = ((ow) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                fy fyVar = (fy) obj;
                wz wzVar = fyVar.F;
                ArrayList arrayList = wzVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(wzVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    fy fyVar2 = wzVar.R;
                    if (fyVar2 != null) {
                        fyVar2.t(1, 3);
                    }
                    zx zxVar = wzVar.I;
                    if (zxVar != null) {
                        zxVar.p(wzVar.getEmojipacks());
                    }
                    fyVar.H();
                    break;
                }
                break;
            case 14:
                rz rzVar = (rz) obj;
                rzVar.getClass();
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                wz wzVar2 = rzVar.Q;
                LongSparseArray longSparseArray = wzVar2.y1;
                LongSparseArray longSparseArray2 = wzVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (s3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        wzVar2.t1.h(s3Var.getStickerSet());
                        break;
                    } else {
                        s3Var.b(true, true);
                        wzVar2.y1.put(stickerSet.set.id, stickerSet);
                        wzVar2.t1.r(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                o10 o10Var = (o10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = o10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = o10Var.Z;
                ArrayList arrayList2 = o10Var.i0;
                boolean z10 = o10Var.b0;
                ArrayList arrayList3 = o10Var.g0;
                int i17 = o10Var.Y;
                org.telegram.ui.ActionBar.m2 m2Var = o10Var.n;
                k10 k10Var = o10Var.l0;
                if (k10Var == null || !k10Var.n) {
                    if (arrayList3 == null) {
                        o10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            int i18 = 0;
                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i19));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(m2Var.getMessagesController().getInputPeer(peerDialogId));
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
                                    o10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = o10Var.X;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i17;
                                m2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                m2Var.getMessagesController().invalidateChatlistFolderUpdate(i17);
                                o10Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i17;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.b5 parentLayout = m2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.m2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.fo) {
                                        org.telegram.ui.fo foVar = (org.telegram.ui.fo) lastFragment;
                                        foVar.T7();
                                        undoView = foVar.y3;
                                    } else if (lastFragment instanceof org.telegram.ui.yy) {
                                        undoView = ((org.telegram.ui.yy) lastFragment).W3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.k10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (t8.b.g(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) t8.b.g(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        o10Var.l0.a(true);
                                        o10Var.z0 = m2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.e5(o10Var, lastFragment, arrayList4, 10));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = m2Var.getMessagesController().removeFolderTemporarily(i17, arrayList5);
                                        undoView2.k(0L, 88, o10Var.c0, Integer.valueOf(arrayList4.size()), new org.telegram.messenger.video.f(o10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 23), (Runnable) removeFolderTemporarily.second);
                                        o10Var.A0 = true;
                                        o10Var.dismiss();
                                        m2Var.getMessagesController().invalidateChatlistFolderUpdate(i17);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.uc ucVar = new org.telegram.ui.uc(26, o10Var, arrayList4);
                                h10 h10Var = tL_chatlists_chatlistUpdates != null ? new h10(ucVar, parentLayout) : new h10(parentLayout, ucVar);
                                int i21 = 0;
                                while (true) {
                                    if (i21 < arrayList4.size()) {
                                        if (o10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i21))))) {
                                            i21++;
                                            i18 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            m2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[i18]) {
                                                m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[i18]);
                                            }
                                        }
                                    }
                                }
                                o10Var.l0.a(true);
                                o10Var.z0 = m2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.to(9, o10Var, h10Var));
                                break;
                            }
                        } else {
                            k10 k10Var2 = o10Var.l0;
                            int i22 = -o10Var.C0;
                            o10Var.C0 = i22;
                            AndroidUtilities.shakeViewSpring(k10Var2, i22);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        o10Var.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                o20 o20Var = (o20) obj;
                ArrayList arrayList6 = o20Var.F;
                if (o20Var.e()) {
                    n20 n20Var = o20Var.H;
                    if (n20Var != null && (iyVar = ((org.telegram.ui.ey) n20Var).b.C0) != null) {
                        iyVar.Q(false);
                    }
                    for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                        if (o20Var.H != null && ((hg.p0) arrayList6.get(i23)).h) {
                            ((org.telegram.ui.ey) o20Var.H).c((hg.p0) arrayList6.get(i23));
                        }
                    }
                    o20Var.c();
                    break;
                } else {
                    Runnable runnable2 = o20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        o20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((yl) obj).run();
                break;
            case 18:
                ((yl) obj).run();
                break;
            case 19:
                a30 a30Var = (a30) obj;
                a30Var.n();
                a30Var.dismiss();
                break;
            case 20:
                ((m30) obj).e(false);
                break;
            case 21:
                q30 q30Var = (q30) obj;
                q30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(q30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    q30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.m50 m50Var = (org.telegram.ui.m50) obj;
                m50Var.o(m50Var.h);
                m50Var.dismiss();
                break;
            case 23:
                ((j40) obj).dismiss();
                break;
            case 24:
                o40 o40Var = (o40) obj;
                o40Var.U(!o40Var.y, true);
                hg.m1 m1Var = o40Var.r;
                boolean z11 = o40Var.y;
                ValueAnimator valueAnimator = m1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.e, z11 ? 1.0f : 0.0f);
                m1Var.f = ofFloat;
                ofFloat.addUpdateListener(new bi.w5(m1Var, i13));
                m1Var.f.addListener(new ah.p0(17, m1Var, z11));
                m1Var.f.setDuration(320L);
                m1Var.f.setInterpolator(es.h);
                m1Var.f.start();
                break;
            case 25:
                ((v40) obj).b(true);
                break;
            case 26:
                ((k50) obj).dismiss();
                break;
            case 27:
                l80 l80Var = (l80) obj;
                HashSet hashSet = fi.k3.W0;
                if (l80Var.J) {
                    l80Var.u();
                    break;
                }
                break;
            case 28:
                v80.o((v80) obj);
                break;
            default:
                x80 x80Var = (x80) obj;
                x80Var.b = true;
                x80Var.dismiss();
                break;
        }
    }

    public /* synthetic */ f0(l80 l80Var, ah.j jVar) {
        this.a = 27;
        this.b = l80Var;
    }
}
