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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                org.telegram.ui.za zaVar = g0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                a0.i iVar2 = g0Var.a0;
                org.telegram.ui.vb vbVar = zaVar.a;
                vbVar.u0 = tL_channelAdminLogEventsFilter2;
                vbVar.w0 = iVar2;
                if (tL_channelAdminLogEventsFilter2 == null && iVar2 == null) {
                    vbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    vbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                vbVar.U0(true);
                g0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.a2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((g9) obj).f0();
                break;
            case 3:
                ga gaVar = (ga) obj;
                int i15 = gaVar.v + 1;
                gaVar.v = i15;
                if (i15 >= 10) {
                    gaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 4:
                ((ec) ((cc) obj).m1).f();
                tc.e();
                break;
            case 5:
                ((rc) obj).f();
                break;
            case 6:
                od odVar = (od) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(odVar.getContext(), new ai.d());
                e0Var.n0(odVar.f.getText());
                e0Var.j0 = new a3(odVar, i14);
                ph phVar = new ph(odVar, 2);
                e0Var.l0 = 0L;
                e0Var.m0 = true;
                e0Var.n0 = phVar;
                e0Var.show();
                break;
            case 7:
                zo zoVar = (zo) obj;
                zoVar.v.setProgress(0.0f);
                zoVar.v.d();
                break;
            case 8:
                sq sqVar = (sq) obj;
                if (!sqVar.s) {
                    int i16 = sqVar.r;
                    if (i16 != sqVar.n) {
                        sqVar.s = true;
                        if (i16 == 3) {
                            i11 = 2678400;
                        } else if (i16 == 2) {
                            i11 = 604800;
                        } else if (i16 == 1) {
                            i11 = 86400;
                        } else {
                            i10 = 71;
                            i11 = 0;
                            org.telegram.ui.vb vbVar2 = sqVar.v.a;
                            MessagesController messagesController = vbVar2.getMessagesController();
                            TLRPC.Chat chat = vbVar2.f;
                            messagesController.setDialogHistoryTTL(-chat.id, i11);
                            chatFull = vbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                vbVar2.w.k(-chat.id, i10, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i10 = 70;
                        org.telegram.ui.vb vbVar22 = sqVar.v.a;
                        MessagesController messagesController2 = vbVar22.getMessagesController();
                        TLRPC.Chat chat2 = vbVar22.f;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i11);
                        chatFull = vbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (sqVar.s) {
                        AndroidUtilities.runOnUIThread(new nq(sqVar, 0), 200L);
                        break;
                    } else {
                        sqVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                ((nr) obj).run();
                break;
            case 10:
                ((vs) obj).X(true);
                break;
            case 11:
                ((iw) obj).a0();
                break;
            case 12:
                Runnable runnable = ((sw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                jy jyVar = (jy) obj;
                a00 a00Var = jyVar.F;
                ArrayList arrayList = a00Var.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(a00Var.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    jy jyVar2 = a00Var.R;
                    if (jyVar2 != null) {
                        jyVar2.t(1, 3);
                    }
                    ey eyVar = a00Var.I;
                    if (eyVar != null) {
                        eyVar.p(a00Var.getEmojipacks());
                    }
                    jyVar.H();
                    break;
                }
                break;
            case 14:
                vz vzVar = (vz) obj;
                vzVar.getClass();
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                a00 a00Var2 = vzVar.Q;
                LongSparseArray longSparseArray = a00Var2.y1;
                LongSparseArray longSparseArray2 = a00Var2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (s3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        a00Var2.t1.h(s3Var.getStickerSet());
                        break;
                    } else {
                        s3Var.b(true, true);
                        a00Var2.y1.put(stickerSet.set.id, stickerSet);
                        a00Var2.t1.r(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                s10 s10Var = (s10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = s10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = s10Var.Z;
                ArrayList arrayList2 = s10Var.i0;
                boolean z10 = s10Var.b0;
                ArrayList arrayList3 = s10Var.g0;
                int i17 = s10Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var = s10Var.n;
                o10 o10Var = s10Var.l0;
                if (o10Var == null || !o10Var.n) {
                    if (arrayList3 == null) {
                        s10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            int i18 = 0;
                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i19));
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
                                    s10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = s10Var.X;
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
                                s10Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i17;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.d5 parentLayout = n2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.n2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.zn) {
                                        org.telegram.ui.zn znVar = (org.telegram.ui.zn) lastFragment;
                                        znVar.T7();
                                        undoView = znVar.y3;
                                    } else if (lastFragment instanceof org.telegram.ui.ty) {
                                        undoView = ((org.telegram.ui.ty) lastFragment).V3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.f10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (sc.v.h(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) sc.v.h(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        s10Var.l0.a(true);
                                        s10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ai.t5(s10Var, lastFragment, arrayList4, 10));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = n2Var.getMessagesController().removeFolderTemporarily(i17, arrayList5);
                                        undoView2.k(0L, 88, s10Var.c0, Integer.valueOf(arrayList4.size()), new org.telegram.messenger.video.f(s10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 22), (Runnable) removeFolderTemporarily.second);
                                        s10Var.A0 = true;
                                        s10Var.dismiss();
                                        n2Var.getMessagesController().invalidateChatlistFolderUpdate(i17);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.pc pcVar = new org.telegram.ui.pc(26, s10Var, arrayList4);
                                l10 l10Var = tL_chatlists_chatlistUpdates != null ? new l10(pcVar, parentLayout) : new l10(parentLayout, pcVar);
                                int i21 = 0;
                                while (true) {
                                    if (i21 < arrayList4.size()) {
                                        if (s10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i21))))) {
                                            i21++;
                                            i18 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            n2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[i18]) {
                                                n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[i18]);
                                            }
                                        }
                                    }
                                }
                                s10Var.l0.a(true);
                                s10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.oo(9, s10Var, l10Var));
                                break;
                            }
                        } else {
                            o10 o10Var2 = s10Var.l0;
                            int i22 = -s10Var.C0;
                            s10Var.C0 = i22;
                            AndroidUtilities.shakeViewSpring(o10Var2, i22);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        s10Var.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                s20 s20Var = (s20) obj;
                ArrayList arrayList6 = s20Var.F;
                if (s20Var.d()) {
                    r20 r20Var = s20Var.H;
                    if (r20Var != null && (dyVar = ((org.telegram.ui.yx) r20Var).b.C0) != null) {
                        dyVar.Q(false);
                    }
                    for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                        if (s20Var.H != null && ((gg.p0) arrayList6.get(i23)).h) {
                            ((org.telegram.ui.yx) s20Var.H).d((gg.p0) arrayList6.get(i23));
                        }
                    }
                    s20Var.c();
                    break;
                } else {
                    Runnable runnable2 = s20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        s20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((cm) obj).run();
                break;
            case 18:
                ((cm) obj).run();
                break;
            case 19:
                e30 e30Var = (e30) obj;
                e30Var.o();
                e30Var.dismiss();
                break;
            case 20:
                ((q30) obj).e(false);
                break;
            case 21:
                u30 u30Var = (u30) obj;
                u30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(u30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    u30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.f50 f50Var = (org.telegram.ui.f50) obj;
                f50Var.p(f50Var.h);
                f50Var.dismiss();
                break;
            case 23:
                ((n40) obj).dismiss();
                break;
            case 24:
                s40 s40Var = (s40) obj;
                s40Var.U(!s40Var.y, true);
                gg.m1 m1Var = s40Var.r;
                boolean z11 = s40Var.y;
                ValueAnimator valueAnimator = m1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.e, z11 ? 1.0f : 0.0f);
                m1Var.f = ofFloat;
                ofFloat.addUpdateListener(new ai.l6(m1Var, i13));
                m1Var.f.addListener(new ai.n(16, m1Var, z11));
                m1Var.f.setDuration(320L);
                m1Var.f.setInterpolator(hs.h);
                m1Var.f.start();
                break;
            case 25:
                ((z40) obj).b(true);
                break;
            case 26:
                ((o50) obj).dismiss();
                break;
            case 27:
                p80 p80Var = (p80) obj;
                HashSet hashSet = ei.k3.W0;
                if (p80Var.J) {
                    p80Var.u();
                    break;
                }
                break;
            case 28:
                y80.p((y80) obj);
                break;
            default:
                a90 a90Var = (a90) obj;
                a90Var.b = true;
                a90Var.dismiss();
                break;
        }
    }

    public /* synthetic */ f0(p80 p80Var, ai.f fVar) {
        this.a = 27;
        this.b = p80Var;
    }
}
