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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0456  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i9;
        int i10;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.mx mxVar;
        int i11 = this.a;
        UndoView undoView = null;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                g0 g0Var = (g0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.U;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    g0Var.U = null;
                }
                a0.h hVar = g0Var.W;
                if (hVar != null && g0Var.V != null && hVar.m() >= g0Var.V.size()) {
                    g0Var.W = null;
                }
                org.telegram.ui.ta taVar = g0Var.c0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.U;
                a0.h hVar2 = g0Var.W;
                org.telegram.ui.pb pbVar = taVar.a;
                pbVar.u0 = tL_channelAdminLogEventsFilter2;
                pbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    pbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    pbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                pbVar.V0(true);
                g0Var.dismiss();
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
                ((w8) obj).e0();
                break;
            case 4:
                v9 v9Var = (v9) obj;
                int i13 = v9Var.v + 1;
                v9Var.v = i13;
                if (i13 >= 10) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((rb) ((pb) obj).i1).f();
                gc.e();
                break;
            case 6:
                ((ec) obj).f();
                break;
            case 7:
                ad adVar = (ad) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(adVar.getContext(), new ih.b());
                e0Var.l0(adVar.f.getText());
                e0Var.f0 = new v2(adVar, 1);
                ch chVar = new ch(adVar, i12);
                e0Var.h0 = 0L;
                e0Var.i0 = true;
                e0Var.j0 = chVar;
                e0Var.show();
                break;
            case 8:
                yn ynVar = (yn) obj;
                ynVar.v.setProgress(0.0f);
                ynVar.v.d();
                break;
            case 9:
                sp spVar = (sp) obj;
                if (!spVar.s) {
                    int i14 = spVar.r;
                    if (i14 != spVar.n) {
                        spVar.s = true;
                        if (i14 == 3) {
                            i9 = 2678400;
                        } else if (i14 == 2) {
                            i9 = 604800;
                        } else if (i14 == 1) {
                            i9 = 86400;
                        } else {
                            i9 = 0;
                            i10 = 71;
                            org.telegram.ui.pb pbVar2 = spVar.v.a;
                            MessagesController messagesController = pbVar2.getMessagesController();
                            TLRPC.Chat chat = pbVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i9);
                            chatFull = pbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                pbVar2.B.k(-chat.id, i10, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i10 = 70;
                        org.telegram.ui.pb pbVar22 = spVar.v.a;
                        MessagesController messagesController2 = pbVar22.getMessagesController();
                        TLRPC.Chat chat2 = pbVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i9);
                        chatFull = pbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (spVar.s) {
                        AndroidUtilities.runOnUIThread(new np(spVar, 0), 200L);
                        break;
                    } else {
                        spVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((nq) obj).run();
                break;
            case 11:
                ((wr) obj).V(true);
                break;
            case 12:
                ((dv) obj).Y();
                break;
            case 13:
                Runnable runnable = ((nv) obj).N;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                fx fxVar = (fx) obj;
                wy wyVar = fxVar.B;
                ArrayList arrayList = wyVar.j1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(wyVar.Y0).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    fx fxVar2 = wyVar.N;
                    if (fxVar2 != null) {
                        fxVar2.t(1, 3);
                    }
                    vv vvVar = wyVar.E;
                    if (vvVar != null) {
                        vvVar.p(wyVar.getEmojipacks());
                    }
                    fxVar.H();
                    break;
                }
                break;
            case 15:
                ry ryVar = (ry) obj;
                ryVar.getClass();
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                wy wyVar2 = ryVar.M;
                LongSparseArray longSparseArray = wyVar2.u1;
                LongSparseArray longSparseArray2 = wyVar2.v1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (s3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        wyVar2.p1.h(s3Var.getStickerSet());
                        break;
                    } else {
                        s3Var.b(true, true);
                        wyVar2.u1.put(stickerSet.set.id, stickerSet);
                        wyVar2.p1.r(s3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                n00 n00Var = (n00) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = n00Var.W;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = n00Var.V;
                ArrayList arrayList2 = n00Var.e0;
                boolean z10 = n00Var.X;
                ArrayList arrayList3 = n00Var.c0;
                int i15 = n00Var.U;
                org.telegram.ui.ActionBar.o2 o2Var = n00Var.n;
                j00 j00Var = n00Var.h0;
                if (j00Var == null || !j00Var.n) {
                    if (arrayList3 == null) {
                        n00Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i16));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(o2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                            }
                            char c10 = 0;
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i15;
                                tL_chatlists_leaveChatlist.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_leaveChatlist;
                            } else if (tL_chatlists_chatlistUpdates == null) {
                                if ((chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && arrayList4.isEmpty()) {
                                    n00Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = n00Var.T;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i15;
                                o2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                o2Var.getMessagesController().invalidateChatlistFolderUpdate(i15);
                                n00Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i15;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.b5 parentLayout = o2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.o2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.qn) {
                                        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) lastFragment;
                                        qnVar.Q7();
                                        undoView = qnVar.u3;
                                    } else if (lastFragment instanceof org.telegram.ui.dy) {
                                        undoView = ((org.telegram.ui.dy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).X();
                                    } else if (lastFragment instanceof org.telegram.ui.n00) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (j3.r0.k(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) j3.r0.k(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.X();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        n00Var.h0.a(true);
                                        n00Var.v0 = o2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bg.b0(n00Var, lastFragment, arrayList4, 18));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i17))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = o2Var.getMessagesController().removeFolderTemporarily(i15, arrayList5);
                                        undoView2.k(0L, 88, n00Var.Y, Integer.valueOf(arrayList4.size()), new org.telegram.messenger.video.e(n00Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 22), (Runnable) removeFolderTemporarily.second);
                                        n00Var.w0 = true;
                                        n00Var.dismiss();
                                        o2Var.getMessagesController().invalidateChatlistFolderUpdate(i15);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.df dfVar = new org.telegram.ui.df(21, n00Var, arrayList4);
                                g00 g00Var = tL_chatlists_chatlistUpdates != null ? new g00(dfVar, parentLayout) : new g00(parentLayout, dfVar);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList4.size()) {
                                        if (n00Var.d0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i18))))) {
                                            i18++;
                                            c10 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            o2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c10]) {
                                                o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                n00Var.h0.a(true);
                                n00Var.v0 = o2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.rc(16, n00Var, g00Var));
                                break;
                            }
                        } else {
                            j00 j00Var2 = n00Var.h0;
                            int i19 = -n00Var.y0;
                            n00Var.y0 = i19;
                            AndroidUtilities.shakeViewSpring(j00Var2, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        n00Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                m10 m10Var = (m10) obj;
                ArrayList arrayList6 = m10Var.B;
                if (m10Var.e()) {
                    l10 l10Var = m10Var.D;
                    if (l10Var != null && (mxVar = ((org.telegram.ui.ix) l10Var).b.y0) != null) {
                        mxVar.Q(false);
                    }
                    for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                        if (m10Var.D != null && ((of.m0) arrayList6.get(i20)).h) {
                            ((org.telegram.ui.ix) m10Var.D).e((of.m0) arrayList6.get(i20));
                        }
                    }
                    m10Var.c();
                    break;
                } else {
                    Runnable runnable2 = m10Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        m10Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((cl) obj).run();
                break;
            case 19:
                ((cl) obj).run();
                break;
            case 20:
                y10 y10Var = (y10) obj;
                y10Var.m();
                y10Var.dismiss();
                break;
            case 21:
                ((j20) obj).e(false);
                break;
            case 22:
                n20 n20Var = (n20) obj;
                n20Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(n20Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    n20Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                v20 v20Var = (v20) obj;
                v20Var.n(v20Var.h);
                v20Var.dismiss();
                break;
            case 24:
                ((g30) obj).dismiss();
                break;
            case 25:
                l30 l30Var = (l30) obj;
                l30Var.T(!l30Var.y, true);
                of.i1 i1Var = l30Var.r;
                boolean z11 = l30Var.y;
                ValueAnimator valueAnimator = i1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i1Var.e, z11 ? 1.0f : 0.0f);
                i1Var.f = ofFloat;
                ofFloat.addUpdateListener(new f2.f0(i1Var, 4));
                i1Var.f.addListener(new hg.b0(17, i1Var, z11));
                i1Var.f.setDuration(320L);
                i1Var.f.setInterpolator(gr.h);
                i1Var.f.start();
                break;
            case 26:
                ((s30) obj).b(true);
                break;
            case 27:
                ((g40) obj).dismiss();
                break;
            case 28:
                x60 x60Var = (x60) obj;
                HashSet hashSet = mh.c3.S0;
                if (x60Var.J) {
                    x60Var.u();
                    break;
                }
                break;
            default:
                g70.n((g70) obj);
                break;
        }
    }

    public /* synthetic */ f0(x60 x60Var, bg.d2 d2Var) {
        this.a = 28;
        this.b = x60Var;
    }
}
