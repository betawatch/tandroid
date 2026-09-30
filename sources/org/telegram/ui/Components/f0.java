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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        org.telegram.ui.zx zxVar;
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
                org.telegram.ui.ya yaVar = g0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                a0.i iVar2 = g0Var.a0;
                org.telegram.ui.ub ubVar = yaVar.a;
                ubVar.u0 = tL_channelAdminLogEventsFilter2;
                ubVar.w0 = iVar2;
                if (tL_channelAdminLogEventsFilter2 == null && iVar2 == null) {
                    ubVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    ubVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                ubVar.U0(true);
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
                da daVar = (da) obj;
                int i15 = daVar.v + 1;
                daVar.v = i15;
                if (i15 >= 10) {
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
                md mdVar = (md) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(mdVar.getContext(), new ai.d());
                e0Var.m0(mdVar.f.getText());
                e0Var.j0 = new y2(mdVar, i14);
                nh nhVar = new nh(mdVar, 2);
                e0Var.l0 = 0L;
                e0Var.m0 = true;
                e0Var.n0 = nhVar;
                e0Var.show();
                break;
            case 8:
                lo loVar = (lo) obj;
                loVar.v.setProgress(0.0f);
                loVar.v.d();
                break;
            case 9:
                eq eqVar = (eq) obj;
                if (!eqVar.s) {
                    int i16 = eqVar.r;
                    if (i16 != eqVar.n) {
                        eqVar.s = true;
                        if (i16 == 3) {
                            i10 = 2678400;
                        } else if (i16 == 2) {
                            i10 = 604800;
                        } else if (i16 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.ub ubVar2 = eqVar.v.a;
                            MessagesController messagesController = ubVar2.getMessagesController();
                            TLRPC.Chat chat = ubVar2.f;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = ubVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                ubVar2.w.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.ub ubVar22 = eqVar.v.a;
                        MessagesController messagesController2 = ubVar22.getMessagesController();
                        TLRPC.Chat chat2 = ubVar22.f;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = ubVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (eqVar.s) {
                        AndroidUtilities.runOnUIThread(new zp(eqVar, 0), 200L);
                        break;
                    } else {
                        eqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((zq) obj).run();
                break;
            case 11:
                ((hs) obj).W(true);
                break;
            case 12:
                ((vv) obj).Z();
                break;
            case 13:
                Runnable runnable = ((fw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                vx vxVar = (vx) obj;
                mz mzVar = vxVar.F;
                ArrayList arrayList = mzVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(mzVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    vx vxVar2 = mzVar.R;
                    if (vxVar2 != null) {
                        vxVar2.t(1, 3);
                    }
                    qx qxVar = mzVar.I;
                    if (qxVar != null) {
                        qxVar.p(mzVar.getEmojipacks());
                    }
                    vxVar.H();
                    break;
                }
                break;
            case 15:
                hz hzVar = (hz) obj;
                hzVar.getClass();
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                mz mzVar2 = hzVar.Q;
                LongSparseArray longSparseArray = mzVar2.y1;
                LongSparseArray longSparseArray2 = mzVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (s3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        mzVar2.t1.h(s3Var.getStickerSet());
                        break;
                    } else {
                        s3Var.b(true, true);
                        mzVar2.y1.put(stickerSet.set.id, stickerSet);
                        mzVar2.t1.r(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                e10 e10Var = (e10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = e10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = e10Var.Z;
                ArrayList arrayList2 = e10Var.i0;
                boolean z10 = e10Var.b0;
                ArrayList arrayList3 = e10Var.g0;
                int i17 = e10Var.Y;
                org.telegram.ui.ActionBar.m2 m2Var = e10Var.n;
                a10 a10Var = e10Var.l0;
                if (a10Var == null || !a10Var.n) {
                    if (arrayList3 == null) {
                        e10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            char c10 = 0;
                            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i18));
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
                                    e10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = e10Var.X;
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
                                e10Var.dismiss();
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
                                    if (lastFragment instanceof org.telegram.ui.wn) {
                                        org.telegram.ui.wn wnVar = (org.telegram.ui.wn) lastFragment;
                                        wnVar.Q7();
                                        undoView = wnVar.y3;
                                    } else if (lastFragment instanceof org.telegram.ui.qy) {
                                        undoView = ((org.telegram.ui.qy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.b10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (org.telegram.ui.Cells.c1.i(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) org.telegram.ui.Cells.c1.i(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        e10Var.l0.a(true);
                                        e10Var.z0 = m2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ai.s5(e10Var, lastFragment, arrayList4, 10));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i19))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = m2Var.getMessagesController().removeFolderTemporarily(i17, arrayList5);
                                        undoView2.k(0L, 88, e10Var.c0, Integer.valueOf(arrayList4.size()), new org.telegram.messenger.video.o(e10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 20), (Runnable) removeFolderTemporarily.second);
                                        e10Var.A0 = true;
                                        e10Var.dismiss();
                                        m2Var.getMessagesController().invalidateChatlistFolderUpdate(i17);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(26, e10Var, arrayList4);
                                x00 x00Var = tL_chatlists_chatlistUpdates != null ? new x00(ocVar, parentLayout) : new x00(parentLayout, ocVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (e10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
                                            c10 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            m2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c10]) {
                                                m2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                e10Var.l0.a(true);
                                e10Var.z0 = m2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.lo(9, e10Var, x00Var));
                                break;
                            }
                        } else {
                            a10 a10Var2 = e10Var.l0;
                            int i21 = -e10Var.C0;
                            e10Var.C0 = i21;
                            AndroidUtilities.shakeViewSpring(a10Var2, i21);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        e10Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                e20 e20Var = (e20) obj;
                ArrayList arrayList6 = e20Var.F;
                if (e20Var.d()) {
                    d20 d20Var = e20Var.H;
                    if (d20Var != null && (zxVar = ((org.telegram.ui.vx) d20Var).b.C0) != null) {
                        zxVar.Q(false);
                    }
                    for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                        if (e20Var.H != null && ((gg.q0) arrayList6.get(i22)).h) {
                            ((org.telegram.ui.vx) e20Var.H).h((gg.q0) arrayList6.get(i22));
                        }
                    }
                    e20Var.c();
                    break;
                } else {
                    Runnable runnable2 = e20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        e20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((nl) obj).run();
                break;
            case 19:
                ((nl) obj).run();
                break;
            case 20:
                q20 q20Var = (q20) obj;
                q20Var.m();
                q20Var.dismiss();
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
                ((z30) obj).dismiss();
                break;
            case 25:
                e40 e40Var = (e40) obj;
                e40Var.U(!e40Var.y, true);
                gg.n1 n1Var = e40Var.r;
                boolean z11 = e40Var.y;
                ValueAnimator valueAnimator = n1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.e, z11 ? 1.0f : 0.0f);
                n1Var.f = ofFloat;
                ofFloat.addUpdateListener(new ai.k6(n1Var, i13));
                n1Var.f.addListener(new ai.n(16, n1Var, z11));
                n1Var.f.setDuration(320L);
                n1Var.f.setInterpolator(sr.h);
                n1Var.f.start();
                break;
            case 26:
                ((l40) obj).b(true);
                break;
            case 27:
                ((z40) obj).dismiss();
                break;
            case 28:
                a80 a80Var = (a80) obj;
                HashSet hashSet = ei.k3.W0;
                if (a80Var.J) {
                    a80Var.u();
                    break;
                }
                break;
            default:
                j80.n((j80) obj);
                break;
        }
    }

    public /* synthetic */ f0(a80 a80Var, ai.f fVar) {
        this.a = 28;
        this.b = a80Var;
    }
}
