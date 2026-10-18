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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0454  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.nx nxVar;
        int i12 = this.a;
        int i13 = 16;
        UndoView undoView = null;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
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
                org.telegram.ui.bb bbVar = g0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                a0.h hVar2 = g0Var.a0;
                org.telegram.ui.xb xbVar = bbVar.a;
                xbVar.u0 = tL_channelAdminLogEventsFilter2;
                xbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    xbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    xbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                xbVar.U0(true);
                g0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.a2) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((e9) obj).f0();
                break;
            case 3:
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
            case 4:
                ((bc) ((zb) obj).m1).f();
                qc.e();
                break;
            case 5:
                ((oc) obj).f();
                break;
            case 6:
                kd kdVar = (kd) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(kdVar.getContext(), new ci.b());
                e0Var.n0(kdVar.f.getText());
                e0Var.j0 = new z2(kdVar, i16);
                mh mhVar = new mh(kdVar, i15);
                e0Var.l0 = 0L;
                e0Var.m0 = true;
                e0Var.n0 = mhVar;
                e0Var.show();
                break;
            case 7:
                to toVar = (to) obj;
                toVar.v.setProgress(0.0f);
                toVar.v.d();
                break;
            case 8:
                mq mqVar = (mq) obj;
                if (!mqVar.s) {
                    int i18 = mqVar.r;
                    if (i18 != mqVar.n) {
                        mqVar.s = true;
                        if (i18 == 3) {
                            i11 = 2678400;
                        } else if (i18 == 2) {
                            i11 = 604800;
                        } else if (i18 == 1) {
                            i11 = 86400;
                        } else {
                            i10 = 71;
                            i11 = 0;
                            org.telegram.ui.xb xbVar2 = mqVar.v.a;
                            MessagesController messagesController = xbVar2.getMessagesController();
                            TLRPC.Chat chat = xbVar2.f;
                            messagesController.setDialogHistoryTTL(-chat.id, i11);
                            chatFull = xbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                xbVar2.w.k(-chat.id, i10, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i10 = 70;
                        org.telegram.ui.xb xbVar22 = mqVar.v.a;
                        MessagesController messagesController2 = xbVar22.getMessagesController();
                        TLRPC.Chat chat2 = xbVar22.f;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i11);
                        chatFull = xbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (mqVar.s) {
                        AndroidUtilities.runOnUIThread(new hq(mqVar, 0), 200L);
                        break;
                    } else {
                        mqVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                ((lr) obj).run();
                break;
            case 10:
                ((ps) obj).X(true);
                break;
            case 11:
                ((aw) obj).a0();
                break;
            case 12:
                Runnable runnable = ((kw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                ay ayVar = (ay) obj;
                tz tzVar = ayVar.F;
                ArrayList arrayList = tzVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(tzVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    ay ayVar2 = tzVar.R;
                    if (ayVar2 != null) {
                        ayVar2.t(1, 3);
                    }
                    vx vxVar = tzVar.I;
                    if (vxVar != null) {
                        vxVar.p(tzVar.getEmojipacks());
                    }
                    ayVar.H();
                    break;
                }
                break;
            case 14:
                oz ozVar = (oz) obj;
                ozVar.getClass();
                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                tz tzVar2 = ozVar.Q;
                LongSparseArray longSparseArray = tzVar2.y1;
                LongSparseArray longSparseArray2 = tzVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (r3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        tzVar2.t1.h(r3Var.getStickerSet());
                        break;
                    } else {
                        r3Var.b(true, true);
                        tzVar2.y1.put(stickerSet.set.id, stickerSet);
                        tzVar2.t1.r(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                k10 k10Var = (k10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = k10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = k10Var.Z;
                ArrayList arrayList2 = k10Var.i0;
                boolean z10 = k10Var.b0;
                ArrayList arrayList3 = k10Var.g0;
                int i19 = k10Var.Y;
                org.telegram.ui.ActionBar.n2 n2Var = k10Var.n;
                g10 g10Var = k10Var.l0;
                if (g10Var == null || !g10Var.n) {
                    if (arrayList3 == null) {
                        k10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < arrayList3.size()) {
                                int i22 = i20;
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i20));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(n2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                                i20 = i22 + 1;
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
                                    k10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = k10Var.X;
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
                                k10Var.dismiss();
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
                                    if (lastFragment instanceof org.telegram.ui.sn) {
                                        org.telegram.ui.sn snVar = (org.telegram.ui.sn) lastFragment;
                                        snVar.T7();
                                        undoView = snVar.y3;
                                    } else if (lastFragment instanceof org.telegram.ui.ey) {
                                        undoView = ((org.telegram.ui.ey) lastFragment).W3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.p00) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (r4.c.f(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) r4.c.f(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        k10Var.l0.a(true);
                                        k10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new ai.k2(k10Var, lastFragment, arrayList4, 15));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i23))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = n2Var.getMessagesController().removeFolderTemporarily(i19, arrayList5);
                                        undoView2.k(0L, 88, k10Var.c0, Integer.valueOf(arrayList4.size()), new lg(k10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 8), (Runnable) removeFolderTemporarily.second);
                                        k10Var.A0 = true;
                                        k10Var.dismiss();
                                        n2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                qy qyVar = new qy(i15, k10Var, arrayList4);
                                d10 d10Var = tL_chatlists_chatlistUpdates != null ? new d10(qyVar, parentLayout) : new d10(parentLayout, qyVar);
                                int i24 = 0;
                                while (true) {
                                    if (i24 < arrayList4.size()) {
                                        if (k10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i24))))) {
                                            i24++;
                                            i21 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            n2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[i21]) {
                                                n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[i21]);
                                            }
                                        }
                                    }
                                }
                                k10Var.l0.a(true);
                                k10Var.z0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.xc(16, k10Var, d10Var));
                                break;
                            }
                        } else {
                            g10 g10Var2 = k10Var.l0;
                            int i25 = -k10Var.C0;
                            k10Var.C0 = i25;
                            AndroidUtilities.shakeViewSpring(g10Var2, i25);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        k10Var.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                k20 k20Var = (k20) obj;
                ArrayList arrayList6 = k20Var.F;
                if (k20Var.e()) {
                    j20 j20Var = k20Var.H;
                    if (j20Var != null && (nxVar = ((org.telegram.ui.jx) j20Var).b.C0) != null) {
                        nxVar.Q(false);
                    }
                    for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                        if (k20Var.H != null && ((hg.o0) arrayList6.get(i26)).h) {
                            ((org.telegram.ui.jx) k20Var.H).c((hg.o0) arrayList6.get(i26));
                        }
                    }
                    k20Var.c();
                    break;
                } else {
                    Runnable runnable2 = k20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        k20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((wl) obj).run();
                break;
            case 18:
                ((wl) obj).run();
                break;
            case 19:
                w20 w20Var = (w20) obj;
                w20Var.n();
                w20Var.dismiss();
                break;
            case 20:
                ((i30) obj).e(false);
                break;
            case 21:
                m30 m30Var = (m30) obj;
                m30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(m30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    m30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.r40 r40Var = (org.telegram.ui.r40) obj;
                r40Var.o(r40Var.h);
                r40Var.dismiss();
                break;
            case 23:
                ((f40) obj).dismiss();
                break;
            case 24:
                k40 k40Var = (k40) obj;
                k40Var.U(!k40Var.y, true);
                hg.m1 m1Var = k40Var.r;
                boolean z11 = k40Var.y;
                ValueAnimator valueAnimator = m1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.e, z11 ? 1.0f : 0.0f);
                m1Var.f = ofFloat;
                ofFloat.addUpdateListener(new ci.u4(m1Var, i14));
                m1Var.f.addListener(new ah.p0(i13, m1Var, z11));
                m1Var.f.setDuration(320L);
                m1Var.f.setInterpolator(bs.h);
                m1Var.f.start();
                break;
            case 25:
                ((r40) obj).b(true);
                break;
            case 26:
                ((g50) obj).dismiss();
                break;
            case 27:
                i80 i80Var = (i80) obj;
                HashSet hashSet = gi.d3.W0;
                if (i80Var.J) {
                    i80Var.u();
                    break;
                }
                break;
            case 28:
                r80.o((r80) obj);
                break;
            default:
                t80 t80Var = (t80) obj;
                t80Var.b = true;
                t80Var.dismiss();
                break;
        }
    }

    public /* synthetic */ f0(i80 i80Var, ah.j jVar) {
        this.a = 27;
        this.b = i80Var;
    }
}
