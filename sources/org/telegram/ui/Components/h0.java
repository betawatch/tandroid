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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0455  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.ox oxVar;
        int i12 = this.a;
        int i13 = 16;
        int i14 = 11;
        UndoView undoView = null;
        int i15 = 2;
        int i16 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                i0 i0Var = (i0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.U;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    i0Var.U = null;
                }
                a0.h hVar = i0Var.W;
                if (hVar != null && i0Var.V != null && hVar.m() >= i0Var.V.size()) {
                    i0Var.W = null;
                }
                org.telegram.ui.sa saVar = i0Var.c0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.U;
                a0.h hVar2 = i0Var.W;
                org.telegram.ui.ob obVar = saVar.a;
                obVar.u0 = tL_channelAdminLogEventsFilter2;
                obVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    obVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    obVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                obVar.V0(true);
                i0Var.dismiss();
                break;
            case 1:
                ((org.telegram.ui.Cells.y1) obj).c(!r10.b(), true);
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((org.telegram.ui.Cells.y1) view).c(atomicBoolean.get(), true);
                break;
            case 3:
                ((b9) obj).f0();
                break;
            case 4:
                aa aaVar = (aa) obj;
                int i17 = aaVar.v + 1;
                aaVar.v = i17;
                if (i17 >= 10) {
                    aaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((xb) ((vb) obj).i1).f();
                mc.e();
                break;
            case 6:
                ((kc) obj).f();
                break;
            case 7:
                ed edVar = (ed) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                g0 g0Var = new g0(edVar.getContext(), new lh.b());
                g0Var.m0(edVar.f.getText());
                g0Var.f0 = new y2(edVar, 1);
                fh fhVar = new fh(edVar, i15);
                g0Var.h0 = 0L;
                g0Var.i0 = true;
                g0Var.j0 = fhVar;
                g0Var.show();
                break;
            case 8:
                co coVar = (co) obj;
                coVar.v.setProgress(0.0f);
                coVar.v.d();
                break;
            case 9:
                wp wpVar = (wp) obj;
                if (!wpVar.s) {
                    int i18 = wpVar.r;
                    if (i18 != wpVar.n) {
                        wpVar.s = true;
                        if (i18 == 3) {
                            i10 = 2678400;
                        } else if (i18 == 2) {
                            i10 = 604800;
                        } else if (i18 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.ob obVar2 = wpVar.v.a;
                            MessagesController messagesController = obVar2.getMessagesController();
                            TLRPC.Chat chat = obVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = obVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                obVar2.B.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.ob obVar22 = wpVar.v.a;
                        MessagesController messagesController2 = obVar22.getMessagesController();
                        TLRPC.Chat chat2 = obVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = obVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (wpVar.s) {
                        AndroidUtilities.runOnUIThread(new rp(wpVar, 0), 200L);
                        break;
                    } else {
                        wpVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((rq) obj).run();
                break;
            case 11:
                ((as) obj).W(true);
                break;
            case 12:
                ((jv) obj).Z();
                break;
            case 13:
                Runnable runnable = ((tv) obj).N;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                nx nxVar = (nx) obj;
                fz fzVar = nxVar.B;
                ArrayList arrayList = fzVar.j1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(fzVar.Y0).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    nx nxVar2 = fzVar.N;
                    if (nxVar2 != null) {
                        nxVar2.t(1, 3);
                    }
                    bw bwVar = fzVar.E;
                    if (bwVar != null) {
                        bwVar.p(fzVar.getEmojipacks());
                    }
                    nxVar.H();
                    break;
                }
                break;
            case 15:
                az azVar = (az) obj;
                azVar.getClass();
                org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                fz fzVar2 = azVar.M;
                LongSparseArray longSparseArray = fzVar2.u1;
                LongSparseArray longSparseArray2 = fzVar2.v1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (p3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        fzVar2.p1.h(p3Var.getStickerSet());
                        break;
                    } else {
                        p3Var.b(true, true);
                        fzVar2.u1.put(stickerSet.set.id, stickerSet);
                        fzVar2.p1.r(p3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                y00 y00Var = (y00) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = y00Var.W;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = y00Var.V;
                ArrayList arrayList2 = y00Var.e0;
                boolean z10 = y00Var.X;
                ArrayList arrayList3 = y00Var.c0;
                int i19 = y00Var.U;
                org.telegram.ui.ActionBar.o2 o2Var = y00Var.n;
                u00 u00Var = y00Var.h0;
                if (u00Var == null || !u00Var.n) {
                    if (arrayList3 == null) {
                        y00Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            char c3 = 0;
                            while (i16 < arrayList3.size()) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i16));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(o2Var.getMessagesController().getInputPeer(peerDialogId));
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
                                    y00Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = y00Var.T;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i19;
                                o2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                o2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                y00Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i19;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.b5 parentLayout = o2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.o2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.tn) {
                                        org.telegram.ui.tn tnVar = (org.telegram.ui.tn) lastFragment;
                                        tnVar.Q7();
                                        undoView = tnVar.u3;
                                    } else if (lastFragment instanceof org.telegram.ui.fy) {
                                        undoView = ((org.telegram.ui.fy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.p00) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (j7.l1.j(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) j7.l1.j(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        y00Var.h0.a(true);
                                        y00Var.v0 = o2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new eg.z(y00Var, lastFragment, arrayList4, 16));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = o2Var.getMessagesController().removeFolderTemporarily(i19, arrayList5);
                                        undoView2.k(0L, 88, y00Var.Y, Integer.valueOf(arrayList4.size()), new g(y00Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 11), (Runnable) removeFolderTemporarily.second);
                                        y00Var.w0 = true;
                                        y00Var.dismiss();
                                        o2Var.getMessagesController().invalidateChatlistFolderUpdate(i19);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.tm tmVar = new org.telegram.ui.tm(14, y00Var, arrayList4);
                                r00 r00Var = tL_chatlists_chatlistUpdates != null ? new r00(tmVar, parentLayout) : new r00(parentLayout, tmVar);
                                int i21 = 0;
                                while (true) {
                                    if (i21 < arrayList4.size()) {
                                        if (y00Var.d0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i21))))) {
                                            i21++;
                                            c3 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            o2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c3]) {
                                                o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                y00Var.h0.a(true);
                                y00Var.v0 = o2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.zg(12, y00Var, r00Var));
                                break;
                            }
                        } else {
                            u00 u00Var2 = y00Var.h0;
                            int i22 = -y00Var.y0;
                            y00Var.y0 = i22;
                            AndroidUtilities.shakeViewSpring(u00Var2, i22);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        y00Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                x10 x10Var = (x10) obj;
                ArrayList arrayList6 = x10Var.B;
                if (x10Var.d()) {
                    w10 w10Var = x10Var.D;
                    if (w10Var != null && (oxVar = ((org.telegram.ui.kx) w10Var).b.y0) != null) {
                        oxVar.Q(false);
                    }
                    while (i16 < arrayList6.size()) {
                        if (x10Var.D != null && ((rf.f0) arrayList6.get(i16)).h) {
                            ((org.telegram.ui.kx) x10Var.D).g((rf.f0) arrayList6.get(i16));
                        }
                        i16++;
                    }
                    x10Var.c();
                    break;
                } else {
                    Runnable runnable2 = x10Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        x10Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((gl) obj).run();
                break;
            case 19:
                ((gl) obj).run();
                break;
            case 20:
                j20 j20Var = (j20) obj;
                j20Var.m();
                j20Var.dismiss();
                break;
            case 21:
                ((w20) obj).e(false);
                break;
            case 22:
                a30 a30Var = (a30) obj;
                a30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(a30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    a30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                i30 i30Var = (i30) obj;
                i30Var.n(i30Var.h);
                i30Var.dismiss();
                break;
            case 24:
                ((u30) obj).dismiss();
                break;
            case 25:
                z30 z30Var = (z30) obj;
                z30Var.U(!z30Var.y, true);
                rf.y0 y0Var = z30Var.r;
                boolean z11 = z30Var.y;
                ValueAnimator valueAnimator = y0Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(y0Var.e, z11 ? 1.0f : 0.0f);
                y0Var.f = ofFloat;
                ofFloat.addUpdateListener(new cg.c1(y0Var, i14));
                y0Var.f.addListener(new org.telegram.ui.p60(i13, y0Var, z11));
                y0Var.f.setDuration(320L);
                y0Var.f.setInterpolator(jr.h);
                y0Var.f.start();
                break;
            case 26:
                ((g40) obj).b(true);
                break;
            case 27:
                ((u40) obj).dismiss();
                break;
            case 28:
                j70 j70Var = (j70) obj;
                HashSet hashSet = ph.p2.S0;
                if (j70Var.J) {
                    j70Var.u();
                    break;
                }
                break;
            default:
                t70.n((t70) obj);
                break;
        }
    }

    public /* synthetic */ h0(j70 j70Var, org.telegram.ui.ef0 ef0Var) {
        this.a = 28;
        this.b = j70Var;
    }
}
