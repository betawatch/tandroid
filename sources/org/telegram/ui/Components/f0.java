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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0463  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.jx jxVar;
        int i13 = this.a;
        UndoView undoView = null;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        Object obj = this.b;
        switch (i13) {
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
                org.telegram.ui.ab abVar = g0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.Y;
                a0.h hVar2 = g0Var.a0;
                org.telegram.ui.wb wbVar = abVar.a;
                wbVar.u0 = tL_channelAdminLogEventsFilter2;
                wbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    wbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    wbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                wbVar.V0(true);
                g0Var.dismiss();
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.y1) view).c(atomicBoolean.get(), true);
                break;
            case 2:
                ((g9) obj).g0();
                break;
            case 3:
                ha haVar = (ha) obj;
                int i17 = haVar.v + 1;
                haVar.v = i17;
                if (i17 >= 10) {
                    haVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 4:
                ((bc) ((zb) obj).n1).f();
                qc.e();
                break;
            case 5:
                ((oc) obj).f();
                break;
            case 6:
                jd jdVar = (jd) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(jdVar.getContext(), new di.b());
                e0Var.m0(jdVar.f.getText());
                e0Var.j0 = new b3(jdVar, 1);
                mh mhVar = new mh(jdVar, i15);
                e0Var.l0 = 0L;
                e0Var.m0 = true;
                e0Var.n0 = mhVar;
                e0Var.show();
                break;
            case 7:
                vo voVar = (vo) obj;
                voVar.v.setProgress(0.0f);
                voVar.v.d();
                break;
            case 8:
                oq oqVar = (oq) obj;
                if (!oqVar.v) {
                    int i18 = oqVar.s;
                    if (i18 != oqVar.r) {
                        oqVar.v = true;
                        if (i18 == 3) {
                            i12 = 2678400;
                        } else if (i18 == 2) {
                            i12 = 604800;
                        } else if (i18 == 1) {
                            i12 = 86400;
                        } else {
                            i10 = 71;
                            i11 = 0;
                            org.telegram.ui.wb wbVar2 = oqVar.w.a;
                            MessagesController messagesController = wbVar2.getMessagesController();
                            TLRPC.Chat chat = wbVar2.f;
                            messagesController.setDialogHistoryTTL(-chat.id, i11);
                            chatFull = wbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                wbVar2.w.k(-chat.id, i10, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i10 = 70;
                        i11 = i12;
                        org.telegram.ui.wb wbVar22 = oqVar.w.a;
                        MessagesController messagesController2 = wbVar22.getMessagesController();
                        TLRPC.Chat chat2 = wbVar22.f;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i11);
                        chatFull = wbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (oqVar.v) {
                        AndroidUtilities.runOnUIThread(new bq(oqVar, 1), 200L);
                        break;
                    } else {
                        oqVar.dismiss();
                        break;
                    }
                }
                break;
            case 9:
                ((mr) obj).run();
                break;
            case 10:
                ((rs) obj).W(true);
                break;
            case 11:
                ((aw) obj).j0();
                break;
            case 12:
                Runnable runnable = ((kw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                zx zxVar = (zx) obj;
                sz szVar = zxVar.F;
                ArrayList arrayList = szVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(szVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    zx zxVar2 = szVar.R;
                    if (zxVar2 != null) {
                        zxVar2.t(1, 3);
                    }
                    ux uxVar = szVar.I;
                    if (uxVar != null) {
                        uxVar.p(szVar.getEmojipacks());
                    }
                    zxVar.H();
                    break;
                }
                break;
            case 14:
                nz nzVar = (nz) obj;
                nzVar.getClass();
                org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                sz szVar2 = nzVar.Q;
                LongSparseArray longSparseArray = szVar2.y1;
                LongSparseArray longSparseArray2 = szVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (q3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        szVar2.t1.h(q3Var.getStickerSet());
                        break;
                    } else {
                        q3Var.b(true, true);
                        szVar2.y1.put(stickerSet.set.id, stickerSet);
                        szVar2.t1.r(q3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 15:
                n10 n10Var = (n10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = n10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = n10Var.Z;
                ArrayList arrayList2 = n10Var.i0;
                boolean z10 = n10Var.b0;
                ArrayList arrayList3 = n10Var.g0;
                int i19 = n10Var.Y;
                org.telegram.ui.ActionBar.r2 r2Var = n10Var.n;
                j10 j10Var = n10Var.l0;
                if (j10Var == null || !j10Var.r) {
                    if (arrayList3 == null) {
                        n10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            int i20 = 0;
                            while (i20 < arrayList3.size()) {
                                int i21 = i16;
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i20));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(r2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                                i20++;
                                i16 = i21;
                            }
                            int i22 = i16;
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i19;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    n10Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = n10Var.X;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i19;
                                r2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                r2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                n10Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i19;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.j5 parentLayout = r2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.r2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.un) {
                                        org.telegram.ui.un unVar = (org.telegram.ui.un) lastFragment;
                                        unVar.X7();
                                        undoView = unVar.K3;
                                    } else if (lastFragment instanceof org.telegram.ui.cy) {
                                        undoView = ((org.telegram.ui.cy) lastFragment).g4();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).a0();
                                    } else if (lastFragment instanceof org.telegram.ui.o00) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (b10.h(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) b10.h(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.a0();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        n10Var.l0.a(true);
                                        n10Var.z0 = r2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.h2(n10Var, lastFragment, arrayList4, 15));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i23 = i22; i23 < arrayList4.size(); i23++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i23))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = r2Var.getMessagesController().removeFolderTemporarily(i19, arrayList5);
                                        undoView2.k(0L, 88, n10Var.c0, Integer.valueOf(arrayList4.size()), new kg(n10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 9), (Runnable) removeFolderTemporarily.second);
                                        n10Var.A0 = true;
                                        n10Var.dismiss();
                                        r2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                oy oyVar = new oy(4, n10Var, arrayList4);
                                f10 f10Var = tL_chatlists_chatlistUpdates != null ? new f10(oyVar, parentLayout) : new f10(parentLayout, oyVar);
                                int i24 = i22;
                                while (true) {
                                    if (i24 < arrayList4.size()) {
                                        if (n10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i24))))) {
                                            i24++;
                                            i22 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            r2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[i22]) {
                                                r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[i22]);
                                            }
                                        }
                                    }
                                }
                                n10Var.l0.a(true);
                                n10Var.z0 = r2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.z7(17, n10Var, f10Var));
                                break;
                            }
                        } else {
                            j10 j10Var2 = n10Var.l0;
                            int i25 = -n10Var.C0;
                            n10Var.C0 = i25;
                            AndroidUtilities.shakeViewSpring(j10Var2, i25);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        n10Var.dismiss();
                        break;
                    }
                }
                break;
            case 16:
                m20 m20Var = (m20) obj;
                ArrayList arrayList6 = m20Var.F;
                if (m20Var.d()) {
                    l20 l20Var = m20Var.H;
                    if (l20Var != null && (jxVar = ((org.telegram.ui.ix) l20Var).a.C0) != null) {
                        jxVar.R(false);
                    }
                    while (i16 < arrayList6.size()) {
                        if (m20Var.H != null && ((ig.p0) arrayList6.get(i16)).h) {
                            ((org.telegram.ui.ix) m20Var.H).f((ig.p0) arrayList6.get(i16));
                        }
                        i16++;
                    }
                    m20Var.c();
                    break;
                } else {
                    Runnable runnable2 = m20Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        m20Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 17:
                ((xl) obj).run();
                break;
            case 18:
                ((xl) obj).run();
                break;
            case 19:
                y20 y20Var = (y20) obj;
                y20Var.m();
                y20Var.dismiss();
                break;
            case 20:
                ((k30) obj).e(false);
                break;
            case 21:
                o30 o30Var = (o30) obj;
                o30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(o30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    o30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.u40 u40Var = (org.telegram.ui.u40) obj;
                u40Var.n(u40Var.h);
                u40Var.dismiss();
                break;
            case 23:
                ((h40) obj).dismiss();
                break;
            case 24:
                m40 m40Var = (m40) obj;
                m40Var.W(!m40Var.y, true);
                ig.m1 m1Var = m40Var.r;
                boolean z11 = m40Var.y;
                ValueAnimator valueAnimator = m1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(m1Var.e, z11 ? 1.0f : 0.0f);
                m1Var.f = ofFloat;
                ofFloat.addUpdateListener(new di.u4(m1Var, i14));
                m1Var.f.addListener(new bh.f0(16, m1Var, z11));
                m1Var.f.setDuration(320L);
                m1Var.f.setInterpolator(ds.h);
                m1Var.f.start();
                break;
            case 25:
                ((t40) obj).b(true);
                break;
            case 26:
                ((i50) obj).dismiss();
                break;
            case 27:
                k80 k80Var = (k80) obj;
                HashSet hashSet = hi.m3.a1;
                if (k80Var.J) {
                    k80Var.u();
                    break;
                }
                break;
            case 28:
                t80.n((t80) obj);
                break;
            default:
                v80 v80Var = (v80) obj;
                v80Var.b = true;
                v80Var.dismiss();
                break;
        }
    }

    public /* synthetic */ f0(k80 k80Var, ag.c cVar) {
        this.a = 27;
        this.b = k80Var;
    }
}
