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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0452  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.gy gyVar;
        int i12 = this.a;
        UndoView undoView = null;
        int i13 = 2;
        Object obj = this.b;
        switch (i12) {
            case 0:
                i0 i0Var = (i0) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.Y;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    i0Var.Y = null;
                }
                a0.i iVar = i0Var.a0;
                if (iVar != null && i0Var.Z != null && iVar.m() >= i0Var.Z.size()) {
                    i0Var.a0 = null;
                }
                org.telegram.ui.za zaVar = i0Var.g0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.Y;
                a0.i iVar2 = i0Var.a0;
                org.telegram.ui.wb wbVar = zaVar.a;
                wbVar.y0 = tL_channelAdminLogEventsFilter2;
                wbVar.A0 = iVar2;
                if (tL_channelAdminLogEventsFilter2 == null && iVar2 == null) {
                    wbVar.M.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    wbVar.M.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                wbVar.V0(true);
                i0Var.dismiss();
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
                ((d9) obj).f0();
                break;
            case 4:
                ca caVar = (ca) obj;
                int i14 = caVar.v + 1;
                caVar.v = i14;
                if (i14 >= 10) {
                    caVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((ac) ((yb) obj).m1).f();
                pc.e();
                break;
            case 6:
                ((nc) obj).f();
                break;
            case 7:
                jd jdVar = (jd) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                g0 g0Var = new g0(jdVar.getContext(), new zh.b());
                g0Var.m0(jdVar.f.getText());
                g0Var.j0 = new y2(jdVar, 1);
                ph phVar = new ph(jdVar, i13);
                g0Var.l0 = 0L;
                g0Var.m0 = true;
                g0Var.n0 = phVar;
                g0Var.show();
                break;
            case 8:
                oo ooVar = (oo) obj;
                ooVar.v.setProgress(0.0f);
                ooVar.v.d();
                break;
            case 9:
                iq iqVar = (iq) obj;
                if (!iqVar.s) {
                    int i15 = iqVar.r;
                    if (i15 != iqVar.n) {
                        iqVar.s = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.wb wbVar2 = iqVar.v.a;
                            MessagesController messagesController = wbVar2.getMessagesController();
                            TLRPC.Chat chat = wbVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = wbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                wbVar2.F.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.wb wbVar22 = iqVar.v.a;
                        MessagesController messagesController2 = wbVar22.getMessagesController();
                        TLRPC.Chat chat2 = wbVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = wbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (iqVar.s) {
                        AndroidUtilities.runOnUIThread(new dq(iqVar, 0), 200L);
                        break;
                    } else {
                        iqVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((dr) obj).run();
                break;
            case 11:
                ((ls) obj).W(true);
                break;
            case 12:
                ((wv) obj).Z();
                break;
            case 13:
                Runnable runnable = ((gw) obj).R;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                yx yxVar = (yx) obj;
                rz rzVar = yxVar.F;
                ArrayList arrayList = rzVar.n1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(rzVar.c1).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    yx yxVar2 = rzVar.R;
                    if (yxVar2 != null) {
                        yxVar2.t(1, 3);
                    }
                    ow owVar = rzVar.I;
                    if (owVar != null) {
                        owVar.p(rzVar.getEmojipacks());
                    }
                    yxVar.H();
                    break;
                }
                break;
            case 15:
                mz mzVar = (mz) obj;
                mzVar.getClass();
                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                rz rzVar2 = mzVar.Q;
                LongSparseArray longSparseArray = rzVar2.y1;
                LongSparseArray longSparseArray2 = rzVar2.z1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (r3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        rzVar2.t1.h(r3Var.getStickerSet());
                        break;
                    } else {
                        r3Var.b(true, true);
                        rzVar2.y1.put(stickerSet.set.id, stickerSet);
                        rzVar2.t1.r(r3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                k10 k10Var = (k10) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = k10Var.a0;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = k10Var.Z;
                ArrayList arrayList2 = k10Var.i0;
                boolean z10 = k10Var.b0;
                ArrayList arrayList3 = k10Var.g0;
                int i16 = k10Var.Y;
                org.telegram.ui.ActionBar.p2 p2Var = k10Var.n;
                g10 g10Var = k10Var.l0;
                if (g10Var == null || !g10Var.n) {
                    if (arrayList3 == null) {
                        k10Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i17));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(p2Var.getMessagesController().getInputPeer(peerDialogId));
                                }
                            }
                            char c10 = 0;
                            if (z10) {
                                TL_chatlists.TL_chatlists_leaveChatlist tL_chatlists_leaveChatlist = new TL_chatlists.TL_chatlists_leaveChatlist();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_leaveChatlist.chatlist = tL_inputChatlistDialogFilter;
                                tL_inputChatlistDialogFilter.filter_id = i16;
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
                                tL_inputChatlistDialogFilter2.filter_id = i16;
                                p2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                p2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                k10Var.dismiss();
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
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.p2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.eo) {
                                        org.telegram.ui.eo eoVar = (org.telegram.ui.eo) lastFragment;
                                        eoVar.Q7();
                                        undoView = eoVar.y3;
                                    } else if (lastFragment instanceof org.telegram.ui.wy) {
                                        undoView = ((org.telegram.ui.wy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.h10) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (org.telegram.ui.Cells.r6.g(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) org.telegram.ui.Cells.r6.g(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    int i18 = 9;
                                    if (undoView2 == null) {
                                        k10Var.l0.a(true);
                                        k10Var.z0 = p2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new bi.wa(k10Var, lastFragment, arrayList4, i18));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i19))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = p2Var.getMessagesController().removeFolderTemporarily(i16, arrayList5);
                                        undoView2.k(0L, 88, k10Var.c0, Integer.valueOf(arrayList4.size()), new gf(k10Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, i18), (Runnable) removeFolderTemporarily.second);
                                        k10Var.A0 = true;
                                        k10Var.dismiss();
                                        p2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(19, k10Var, arrayList4);
                                c10 c10Var = tL_chatlists_chatlistUpdates != null ? new c10(pfVar, parentLayout) : new c10(parentLayout, pfVar);
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList4.size()) {
                                        if (k10Var.h0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i20))))) {
                                            i20++;
                                            c10 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            p2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c10]) {
                                                p2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                k10Var.l0.a(true);
                                k10Var.z0 = p2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new th(4, k10Var, c10Var));
                                break;
                            }
                        } else {
                            g10 g10Var2 = k10Var.l0;
                            int i21 = -k10Var.C0;
                            k10Var.C0 = i21;
                            AndroidUtilities.shakeViewSpring(g10Var2, i21);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        k10Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                k20 k20Var = (k20) obj;
                ArrayList arrayList6 = k20Var.F;
                if (k20Var.d()) {
                    j20 j20Var = k20Var.H;
                    if (j20Var != null && (gyVar = ((org.telegram.ui.cy) j20Var).b.C0) != null) {
                        gyVar.Q(false);
                    }
                    for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                        if (k20Var.H != null && ((fg.q0) arrayList6.get(i22)).h) {
                            ((org.telegram.ui.cy) k20Var.H).g((fg.q0) arrayList6.get(i22));
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
            case 18:
                ((ql) obj).run();
                break;
            case 19:
                ((ql) obj).run();
                break;
            case 20:
                w20 w20Var = (w20) obj;
                w20Var.m();
                w20Var.dismiss();
                break;
            case 21:
                ((j30) obj).e(false);
                break;
            case 22:
                n30 n30Var = (n30) obj;
                n30Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(n30Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    n30Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                v30 v30Var = (v30) obj;
                v30Var.n(v30Var.h);
                v30Var.dismiss();
                break;
            case 24:
                ((g40) obj).dismiss();
                break;
            case 25:
                l40 l40Var = (l40) obj;
                l40Var.U(!l40Var.y, true);
                fg.o1 o1Var = l40Var.r;
                boolean z11 = l40Var.y;
                ValueAnimator valueAnimator = o1Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(o1Var.e, z11 ? 1.0f : 0.0f);
                o1Var.f = ofFloat;
                ofFloat.addUpdateListener(new ai.m(o1Var, i13));
                o1Var.f.addListener(new ai.e(12, o1Var, z11));
                o1Var.f.setDuration(320L);
                o1Var.f.setInterpolator(wr.h);
                o1Var.f.start();
                break;
            case 26:
                ((s40) obj).b(true);
                break;
            case 27:
                ((g50) obj).dismiss();
                break;
            case 28:
                w70 w70Var = (w70) obj;
                HashSet hashSet = di.n3.W0;
                if (w70Var.J) {
                    w70Var.u();
                    break;
                }
                break;
            default:
                f80.n((f80) obj);
                break;
        }
    }

    public /* synthetic */ h0(w70 w70Var, bi.f0 f0Var) {
        this.a = 28;
        this.b = w70Var;
    }
}
