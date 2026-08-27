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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0457  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10;
        int i11;
        TLRPC.ChatFull chatFull;
        TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite;
        org.telegram.ui.px pxVar;
        int i12 = this.a;
        UndoView undoView = null;
        int i13 = 2;
        Object obj = this.b;
        switch (i12) {
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
                org.telegram.ui.ua uaVar = g0Var.c0;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.U;
                a0.h hVar2 = g0Var.W;
                org.telegram.ui.qb qbVar = uaVar.a;
                qbVar.u0 = tL_channelAdminLogEventsFilter2;
                qbVar.w0 = hVar2;
                if (tL_channelAdminLogEventsFilter2 == null && hVar2 == null) {
                    qbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
                } else {
                    qbVar.I.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
                }
                qbVar.V0(true);
                g0Var.dismiss();
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
                ((v8) obj).f0();
                break;
            case 4:
                t9 t9Var = (t9) obj;
                int i14 = t9Var.v + 1;
                t9Var.v = i14;
                if (i14 >= 10) {
                    t9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                ((pb) ((nb) obj).i1).f();
                ec.e();
                break;
            case 6:
                ((cc) obj).f();
                break;
            case 7:
                xc xcVar = (xc) obj;
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                e0 e0Var = new e0(xcVar.getContext(), new jh.b());
                e0Var.m0(xcVar.f.getText());
                e0Var.f0 = new v2(xcVar, 1);
                yg ygVar = new yg(xcVar, i13);
                e0Var.h0 = 0L;
                e0Var.i0 = true;
                e0Var.j0 = ygVar;
                e0Var.show();
                break;
            case 8:
                wn wnVar = (wn) obj;
                wnVar.v.setProgress(0.0f);
                wnVar.v.d();
                break;
            case 9:
                qp qpVar = (qp) obj;
                if (!qpVar.s) {
                    int i15 = qpVar.r;
                    if (i15 != qpVar.n) {
                        qpVar.s = true;
                        if (i15 == 3) {
                            i10 = 2678400;
                        } else if (i15 == 2) {
                            i10 = 604800;
                        } else if (i15 == 1) {
                            i10 = 86400;
                        } else {
                            i10 = 0;
                            i11 = 71;
                            org.telegram.ui.qb qbVar2 = qpVar.v.a;
                            MessagesController messagesController = qbVar2.getMessagesController();
                            TLRPC.Chat chat = qbVar2.s;
                            messagesController.setDialogHistoryTTL(-chat.id, i10);
                            chatFull = qbVar2.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null) {
                                qbVar2.B.k(-chat.id, i11, null, Integer.valueOf(chatFull.ttl_period), null, null);
                            }
                        }
                        i11 = 70;
                        org.telegram.ui.qb qbVar22 = qpVar.v.a;
                        MessagesController messagesController2 = qbVar22.getMessagesController();
                        TLRPC.Chat chat2 = qbVar22.s;
                        messagesController2.setDialogHistoryTTL(-chat2.id, i10);
                        chatFull = qbVar22.getMessagesController().getChatFull(chat2.id);
                        if (chatFull != null) {
                        }
                    }
                    if (qpVar.s) {
                        AndroidUtilities.runOnUIThread(new lp(qpVar, 0), 200L);
                        break;
                    } else {
                        qpVar.dismiss();
                        break;
                    }
                }
                break;
            case 10:
                ((lq) obj).run();
                break;
            case 11:
                ((ur) obj).W(true);
                break;
            case 12:
                ((cv) obj).Z();
                break;
            case 13:
                Runnable runnable = ((mv) obj).N;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                gx gxVar = (gx) obj;
                yy yyVar = gxVar.B;
                ArrayList arrayList = yyVar.j1;
                if (arrayList != null && !arrayList.isEmpty() && ((TLRPC.StickerSetCovered) arrayList.get(0)).set != null) {
                    MessagesController.getEmojiSettings(yyVar.Y0).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id).commit();
                    gx gxVar2 = yyVar.N;
                    if (gxVar2 != null) {
                        gxVar2.t(1, 3);
                    }
                    uv uvVar = yyVar.E;
                    if (uvVar != null) {
                        uvVar.p(yyVar.getEmojipacks());
                    }
                    gxVar.H();
                    break;
                }
                break;
            case 15:
                ty tyVar = (ty) obj;
                tyVar.getClass();
                org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                yy yyVar2 = tyVar.M;
                LongSparseArray longSparseArray = yyVar2.u1;
                LongSparseArray longSparseArray2 = yyVar2.v1;
                if (longSparseArray.indexOfKey(stickerSet.set.id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.id) < 0) {
                    if (p3Var.r) {
                        longSparseArray2.put(stickerSet.set.id, stickerSet);
                        yyVar2.p1.h(p3Var.getStickerSet());
                        break;
                    } else {
                        p3Var.b(true, true);
                        yyVar2.u1.put(stickerSet.set.id, stickerSet);
                        yyVar2.p1.r(p3Var.getStickerSet());
                        break;
                    }
                }
                break;
            case 16:
                q00 q00Var = (q00) obj;
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = q00Var.W;
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = q00Var.V;
                ArrayList arrayList2 = q00Var.e0;
                boolean z10 = q00Var.X;
                ArrayList arrayList3 = q00Var.c0;
                int i16 = q00Var.U;
                org.telegram.ui.ActionBar.n2 n2Var = q00Var.n;
                m00 m00Var = q00Var.h0;
                if (m00Var == null || !m00Var.n) {
                    if (arrayList3 == null) {
                        q00Var.dismiss();
                        break;
                    } else if (!arrayList3.isEmpty() || z10) {
                        if (!arrayList2.isEmpty() || !(chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite)) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList3.get(i17));
                                if (arrayList2.contains(Long.valueOf(peerDialogId))) {
                                    arrayList4.add(n2Var.getMessagesController().getInputPeer(peerDialogId));
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
                                    q00Var.dismiss();
                                    break;
                                } else {
                                    TL_chatlists.TL_chatlists_joinChatlistInvite tL_chatlists_joinChatlistInvite2 = new TL_chatlists.TL_chatlists_joinChatlistInvite();
                                    tL_chatlists_joinChatlistInvite2.slug = q00Var.T;
                                    tL_chatlists_joinChatlistInvite2.peers.addAll(arrayList4);
                                    tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistInvite2;
                                }
                            } else if (arrayList4.isEmpty()) {
                                TL_chatlists.TL_chatlists_hideChatlistUpdates tL_chatlists_hideChatlistUpdates = new TL_chatlists.TL_chatlists_hideChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter2 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_hideChatlistUpdates.chatlist = tL_inputChatlistDialogFilter2;
                                tL_inputChatlistDialogFilter2.filter_id = i16;
                                n2Var.getConnectionsManager().sendRequest(tL_chatlists_hideChatlistUpdates, null);
                                n2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                q00Var.dismiss();
                                break;
                            } else {
                                TL_chatlists.TL_chatlists_joinChatlistUpdates tL_chatlists_joinChatlistUpdates = new TL_chatlists.TL_chatlists_joinChatlistUpdates();
                                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter3 = new TL_chatlists.TL_inputChatlistDialogFilter();
                                tL_chatlists_joinChatlistUpdates.chatlist = tL_inputChatlistDialogFilter3;
                                tL_inputChatlistDialogFilter3.filter_id = i16;
                                tL_chatlists_joinChatlistUpdates.peers.addAll(arrayList4);
                                tL_chatlists_joinChatlistInvite = tL_chatlists_joinChatlistUpdates;
                            }
                            org.telegram.ui.ActionBar.b5 parentLayout = n2Var.getParentLayout();
                            if (z10) {
                                if (parentLayout != null) {
                                    org.telegram.ui.ActionBar.n2 lastFragment = parentLayout.getLastFragment();
                                    if (lastFragment instanceof org.telegram.ui.rn) {
                                        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) lastFragment;
                                        rnVar.Q7();
                                        undoView = rnVar.u3;
                                    } else if (lastFragment instanceof org.telegram.ui.gy) {
                                        undoView = ((org.telegram.ui.gy) lastFragment).Y3();
                                    } else if (lastFragment instanceof FiltersSetupActivity) {
                                        undoView = ((FiltersSetupActivity) lastFragment).Y();
                                    } else if (lastFragment instanceof org.telegram.ui.q00) {
                                        List fragmentStack = parentLayout.getFragmentStack();
                                        if (fragmentStack.size() >= 2 && (i0.a.j(2, fragmentStack) instanceof FiltersSetupActivity)) {
                                            FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) i0.a.j(2, fragmentStack);
                                            lastFragment.finishFragment();
                                            undoView = filtersSetupActivity.Y();
                                        }
                                    }
                                    UndoView undoView2 = undoView;
                                    if (undoView2 == null) {
                                        q00Var.h0.a(true);
                                        q00Var.v0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new cg.y(q00Var, lastFragment, arrayList4, 18));
                                        break;
                                    } else {
                                        ArrayList<Long> arrayList5 = new ArrayList<>();
                                        for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                                            arrayList5.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i18))));
                                        }
                                        Pair<Runnable, Runnable> removeFolderTemporarily = n2Var.getMessagesController().removeFolderTemporarily(i16, arrayList5);
                                        undoView2.k(0L, 88, q00Var.Y, Integer.valueOf(arrayList4.size()), new org.telegram.ui.ActionBar.i3(q00Var, tL_chatlists_joinChatlistInvite, removeFolderTemporarily, 16), (Runnable) removeFolderTemporarily.second);
                                        q00Var.w0 = true;
                                        q00Var.dismiss();
                                        n2Var.getMessagesController().invalidateChatlistFolderUpdate(i16);
                                        break;
                                    }
                                }
                            } else if (parentLayout != null) {
                                org.telegram.ui.df dfVar = new org.telegram.ui.df(21, q00Var, arrayList4);
                                j00 j00Var = tL_chatlists_chatlistUpdates != null ? new j00(dfVar, parentLayout) : new j00(parentLayout, dfVar);
                                int i19 = 0;
                                while (true) {
                                    if (i19 < arrayList4.size()) {
                                        if (q00Var.d0.contains(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.InputPeer) arrayList4.get(i19))))) {
                                            i19++;
                                            c10 = 0;
                                        } else {
                                            boolean[] zArr = new boolean[1];
                                            n2Var.getMessagesController().ensureFolderDialogExists(1, zArr);
                                            if (zArr[c10]) {
                                                n2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                                            }
                                        }
                                    }
                                }
                                q00Var.h0.a(true);
                                q00Var.v0 = n2Var.getConnectionsManager().sendRequest(tL_chatlists_joinChatlistInvite, new org.telegram.ui.gg(13, q00Var, j00Var));
                                break;
                            }
                        } else {
                            m00 m00Var2 = q00Var.h0;
                            int i20 = -q00Var.y0;
                            q00Var.y0 = i20;
                            AndroidUtilities.shakeViewSpring(m00Var2, i20);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        }
                    } else {
                        q00Var.dismiss();
                        break;
                    }
                }
                break;
            case 17:
                p10 p10Var = (p10) obj;
                ArrayList arrayList6 = p10Var.B;
                if (p10Var.e()) {
                    o10 o10Var = p10Var.D;
                    if (o10Var != null && (pxVar = ((org.telegram.ui.lx) o10Var).b.y0) != null) {
                        pxVar.Q(false);
                    }
                    for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                        if (p10Var.D != null && ((pf.e0) arrayList6.get(i21)).h) {
                            ((org.telegram.ui.lx) p10Var.D).e((pf.e0) arrayList6.get(i21));
                        }
                    }
                    p10Var.c();
                    break;
                } else {
                    Runnable runnable2 = p10Var.y;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    } else {
                        p10Var.r.getText().clear();
                        break;
                    }
                }
                break;
            case 18:
                ((yk) obj).run();
                break;
            case 19:
                ((yk) obj).run();
                break;
            case 20:
                b20 b20Var = (b20) obj;
                b20Var.m();
                b20Var.dismiss();
                break;
            case 21:
                ((n20) obj).e(false);
                break;
            case 22:
                r20 r20Var = (r20) obj;
                r20Var.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(r20Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    r20Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 23:
                z20 z20Var = (z20) obj;
                z20Var.n(z20Var.h);
                z20Var.dismiss();
                break;
            case 24:
                ((l30) obj).dismiss();
                break;
            case 25:
                q30 q30Var = (q30) obj;
                q30Var.U(!q30Var.y, true);
                pf.x0 x0Var = q30Var.r;
                boolean z11 = q30Var.y;
                ValueAnimator valueAnimator = x0Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.e, z11 ? 1.0f : 0.0f);
                x0Var.f = ofFloat;
                ofFloat.addUpdateListener(new ag.q1(x0Var, 11));
                x0Var.f.addListener(new org.telegram.ui.n40(15, x0Var, z11));
                x0Var.f.setDuration(320L);
                x0Var.f.setInterpolator(er.h);
                x0Var.f.start();
                break;
            case 26:
                ((x30) obj).b(true);
                break;
            case 27:
                ((l40) obj).dismiss();
                break;
            case 28:
                b70 b70Var = (b70) obj;
                HashSet hashSet = nh.b3.S0;
                if (b70Var.J) {
                    b70Var.u();
                    break;
                }
                break;
            default:
                k70.n((k70) obj);
                break;
        }
    }

    public /* synthetic */ f0(b70 b70Var, ag.l3 l3Var) {
        this.a = 28;
        this.b = b70Var;
    }
}
