package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ nj(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                ConcurrentHashMap concurrentHashMap = npVar.Q;
                ConcurrentHashMap concurrentHashMap2 = npVar.P;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i7 = 0; i7 < tL_messages_peerDialogs.dialogs.size(); i7++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i7);
                        n5.x(dialog);
                        Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                        if (num == null) {
                            num = 0;
                        }
                        concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
                        if (num.intValue() == 0) {
                            if (dialog.peer.channel_id != 0) {
                                TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                                tL_updateReadChannelInbox.channel_id = dialog.peer.channel_id;
                                tL_updateReadChannelInbox.max_id = dialog.read_inbox_max_id;
                                tL_updateReadChannelInbox.still_unread_count = dialog.unread_count;
                                arrayList.add(tL_updateReadChannelInbox);
                            } else {
                                TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                                tL_updateReadHistoryInbox.peer = dialog.peer;
                                tL_updateReadHistoryInbox.max_id = dialog.read_inbox_max_id;
                                arrayList.add(tL_updateReadHistoryInbox);
                            }
                        }
                        Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                        if (num2 == null) {
                            num2 = 0;
                        }
                        concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
                        if (dialog.read_outbox_max_id > num2.intValue()) {
                            if (dialog.peer.channel_id != 0) {
                                TL_update.TL_updateReadChannelOutbox tL_updateReadChannelOutbox = new TL_update.TL_updateReadChannelOutbox();
                                tL_updateReadChannelOutbox.channel_id = dialog.peer.channel_id;
                                tL_updateReadChannelOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList.add(tL_updateReadChannelOutbox);
                            } else {
                                TL_update.TL_updateReadHistoryOutbox tL_updateReadHistoryOutbox = new TL_update.TL_updateReadHistoryOutbox();
                                tL_updateReadHistoryOutbox.peer = dialog.peer;
                                tL_updateReadHistoryOutbox.max_id = dialog.read_outbox_max_id;
                                arrayList.add(tL_updateReadHistoryOutbox);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        npVar.U3(arrayList, null, null, false, 0);
                        break;
                    }
                }
                break;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.b.T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
                break;
            case 2:
                np npVar2 = this.b;
                npVar2.getClass();
                if (tLObject != null) {
                    npVar2.V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 3:
                np npVar3 = this.b;
                npVar3.H2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    npVar3.I2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    npVar3.I2 = tL_help_termsOfServiceUpdate.expires;
                    g0.g3(new gi(19, npVar3, tL_help_termsOfServiceUpdate));
                } else {
                    npVar3.I2 = npVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                npVar3.g7.edit().putInt("nextTosCheckTime", npVar3.I2).commit();
                break;
            case 4:
                if (tL_error == null) {
                    final int i10 = 5;
                    final np npVar4 = this.b;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set;
                            int i11 = i10;
                            np npVar5 = npVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i11) {
                                case 0:
                                    npVar5.U0 = false;
                                    ArrayList arrayList2 = npVar5.W0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    npVar5.getNotificationCenter().k(ls.S2, new Object[0]);
                                    break;
                                case 1:
                                    npVar5.v2 = false;
                                    SharedPreferences.Editor edit = npVar5.g7.edit();
                                    edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit.commit();
                                    npVar5.getUserConfig().U = true;
                                    npVar5.getUserConfig().v(false);
                                    break;
                                case 2:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit2 = npVar5.g7.edit();
                                        edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                        if (reactionNotificationsFrom != null) {
                                            edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                        if (reactionNotificationsFrom2 != null) {
                                            edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                        npVar5.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                        edit2.apply();
                                        npVar5.getNotificationCenter().k(42, new Object[0]);
                                        break;
                                    }
                                    break;
                                case 3:
                                    npVar5.u2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit3 = npVar5.g7.edit();
                                        edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                        if (reactionNotificationsFrom3 != null) {
                                            edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                        if (reactionNotificationsFrom4 != null) {
                                            edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                        npVar5.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                        edit3.apply();
                                    }
                                    if (npVar5.u2 == 0) {
                                        npVar5.getUserConfig().T = true;
                                        npVar5.getUserConfig().v(false);
                                        break;
                                    }
                                    break;
                                case 4:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        npVar5.s8 = (TL_account.contentSettings) tLObject2;
                                        npVar5.r8 = System.currentTimeMillis();
                                    }
                                    npVar5.p8 = false;
                                    TL_account.contentSettings contentsettings = npVar5.s8;
                                    if (contentsettings != null && (set = npVar5.F4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = npVar5.h7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar5.F4).apply();
                                        }
                                    }
                                    ArrayList arrayList3 = npVar5.q8;
                                    if (arrayList3 != null) {
                                        int size = arrayList3.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayList3.get(i12);
                                            i12++;
                                            ((y10) obj).a(npVar5.s8);
                                        }
                                        npVar5.q8.clear();
                                        npVar5.q8 = null;
                                    }
                                    npVar5.getNotificationCenter().k(ls.V3, new Object[0]);
                                    break;
                                case 5:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    npVar5.f4(tL_help_recentMeUrls.users, false);
                                    npVar5.Z3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList4 = npVar5.s;
                                    arrayList4.clear();
                                    arrayList4.addAll(tL_help_recentMeUrls.urls);
                                    npVar5.getNotificationCenter().k(3, new Object[0]);
                                    break;
                                default:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i13 = 0;
                                        while (true) {
                                            np npVar6 = npVar4;
                                            if (i13 >= size2) {
                                                npVar6.getUserConfig().x = true;
                                                npVar6.getUserConfig().v(false);
                                                npVar6.getNotificationCenter().k(2, 256);
                                                npVar6.g2 = false;
                                                break;
                                            } else {
                                                TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
                                                if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                    TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                    long j3 = peer.user_id;
                                                    if (j3 == 0) {
                                                        long j10 = peer.chat_id;
                                                        j3 = j10 != 0 ? -j10 : -peer.channel_id;
                                                    }
                                                    long j11 = j3;
                                                    npVar6.getMessagesStorage().F1(j11, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar6.R.f(j11);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            npVar6.u2(j11, 0L, null);
                                                        }
                                                    }
                                                }
                                                i13++;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 5:
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages2 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.b.T3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    break;
                }
                break;
            case 6:
                final int i11 = 3;
                final np npVar5 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i11;
                        np npVar52 = npVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                npVar52.U0 = false;
                                ArrayList arrayList2 = npVar52.W0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ls.S2, new Object[0]);
                                break;
                            case 1:
                                npVar52.v2 = false;
                                SharedPreferences.Editor edit = npVar52.g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = npVar52.g7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                npVar52.u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.g7.edit();
                                    edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (npVar52.u2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.s8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.r8 = System.currentTimeMillis();
                                }
                                npVar52.p8 = false;
                                TL_account.contentSettings contentsettings = npVar52.s8;
                                if (contentsettings != null && (set = npVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList3 = npVar52.q8;
                                if (arrayList3 != null) {
                                    int size = arrayList3.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList3.get(i12);
                                        i12++;
                                        ((y10) obj).a(npVar52.s8);
                                    }
                                    npVar52.q8.clear();
                                    npVar52.q8 = null;
                                }
                                npVar52.getNotificationCenter().k(ls.V3, new Object[0]);
                                break;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.f4(tL_help_recentMeUrls.users, false);
                                npVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = npVar52.s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        np npVar6 = npVar5;
                                        if (i13 >= size2) {
                                            npVar6.getUserConfig().x = true;
                                            npVar6.getUserConfig().v(false);
                                            npVar6.getNotificationCenter().k(2, 256);
                                            npVar6.g2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i13);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j3 = peer.user_id;
                                                if (j3 == 0) {
                                                    long j10 = peer.chat_id;
                                                    j3 = j10 != 0 ? -j10 : -peer.channel_id;
                                                }
                                                long j11 = j3;
                                                npVar6.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar6.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        npVar6.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i13++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 7:
                np npVar6 = this.b;
                npVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (arrayList2.get(i12) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i12));
                        }
                    }
                    npVar6.getMessagesController().f4(arrayList3, false);
                    break;
                }
                break;
            case 8:
                np npVar7 = this.b;
                npVar7.getClass();
                if (tLObject != null) {
                    npVar7.V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 9:
                np npVar8 = this.b;
                if (tL_error == null) {
                    npVar8.getClass();
                    npVar8.M2 = System.currentTimeMillis();
                    npVar8.P2 = false;
                    npVar8.O2 = 0;
                } else {
                    long j3 = npVar8.M2;
                    if (j3 != 0) {
                        npVar8.M2 = j3 + 5000;
                    }
                }
                npVar8.N2 = 0;
                break;
            case 10:
                np npVar9 = this.b;
                if (tL_error == null) {
                    npVar9.P2 = true;
                } else {
                    long j10 = npVar9.M2;
                    if (j10 != 0) {
                        npVar9.M2 = j10 + 5000;
                    }
                }
                npVar9.N2 = 0;
                break;
            case 11:
                final int i13 = 1;
                final np npVar10 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i13;
                        np npVar52 = npVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ls.S2, new Object[0]);
                                break;
                            case 1:
                                npVar52.v2 = false;
                                SharedPreferences.Editor edit = npVar52.g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = npVar52.g7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                npVar52.u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.g7.edit();
                                    edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (npVar52.u2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.s8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.r8 = System.currentTimeMillis();
                                }
                                npVar52.p8 = false;
                                TL_account.contentSettings contentsettings = npVar52.s8;
                                if (contentsettings != null && (set = npVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = npVar52.q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList32.get(i122);
                                        i122++;
                                        ((y10) obj).a(npVar52.s8);
                                    }
                                    npVar52.q8.clear();
                                    npVar52.q8 = null;
                                }
                                npVar52.getNotificationCenter().k(ls.V3, new Object[0]);
                                break;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.f4(tL_help_recentMeUrls.users, false);
                                npVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = npVar52.s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        np npVar62 = npVar10;
                                        if (i132 >= size2) {
                                            npVar62.getUserConfig().x = true;
                                            npVar62.getUserConfig().v(false);
                                            npVar62.getNotificationCenter().k(2, 256);
                                            npVar62.g2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i132);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    j32 = j102 != 0 ? -j102 : -peer.channel_id;
                                                }
                                                long j11 = j32;
                                                npVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        npVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 12:
                np npVar11 = this.b;
                npVar11.getClass();
                if (tLObject != null) {
                    npVar11.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new sj(npVar11, 27));
                    break;
                }
                break;
            case 13:
                if (tLObject != null) {
                    np npVar12 = this.b;
                    npVar12.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new sj(npVar12, 24));
                    break;
                }
                break;
            case 14:
                np npVar13 = this.b;
                npVar13.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar13.T3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    break;
                }
                break;
            case 15:
                final int i14 = 6;
                final np npVar14 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i14;
                        np npVar52 = npVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ls.S2, new Object[0]);
                                break;
                            case 1:
                                npVar52.v2 = false;
                                SharedPreferences.Editor edit = npVar52.g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = npVar52.g7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                npVar52.u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.g7.edit();
                                    edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (npVar52.u2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.s8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.r8 = System.currentTimeMillis();
                                }
                                npVar52.p8 = false;
                                TL_account.contentSettings contentsettings = npVar52.s8;
                                if (contentsettings != null && (set = npVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = npVar52.q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList32.get(i122);
                                        i122++;
                                        ((y10) obj).a(npVar52.s8);
                                    }
                                    npVar52.q8.clear();
                                    npVar52.q8 = null;
                                }
                                npVar52.getNotificationCenter().k(ls.V3, new Object[0]);
                                break;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.f4(tL_help_recentMeUrls.users, false);
                                npVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = npVar52.s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        np npVar62 = npVar14;
                                        if (i132 >= size2) {
                                            npVar62.getUserConfig().x = true;
                                            npVar62.getUserConfig().v(false);
                                            npVar62.getNotificationCenter().k(2, 256);
                                            npVar62.g2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i132);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    j32 = j102 != 0 ? -j102 : -peer.channel_id;
                                                }
                                                long j11 = j32;
                                                npVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        npVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 16:
                np npVar15 = this.b;
                npVar15.getClass();
                if (tLObject != null) {
                    npVar15.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new rn(npVar15, 0));
                    break;
                }
                break;
            case 17:
                final int i15 = 2;
                final np npVar16 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i15;
                        np npVar52 = npVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ls.S2, new Object[0]);
                                break;
                            case 1:
                                npVar52.v2 = false;
                                SharedPreferences.Editor edit = npVar52.g7.edit();
                                edit.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = npVar52.g7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                npVar52.u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.g7.edit();
                                    edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (npVar52.u2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.s8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.r8 = System.currentTimeMillis();
                                }
                                npVar52.p8 = false;
                                TL_account.contentSettings contentsettings = npVar52.s8;
                                if (contentsettings != null && (set = npVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = npVar52.q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList32.get(i122);
                                        i122++;
                                        ((y10) obj).a(npVar52.s8);
                                    }
                                    npVar52.q8.clear();
                                    npVar52.q8 = null;
                                }
                                npVar52.getNotificationCenter().k(ls.V3, new Object[0]);
                                break;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.f4(tL_help_recentMeUrls.users, false);
                                npVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList4 = npVar52.s;
                                arrayList4.clear();
                                arrayList4.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        np npVar62 = npVar16;
                                        if (i132 >= size2) {
                                            npVar62.getUserConfig().x = true;
                                            npVar62.getUserConfig().v(false);
                                            npVar62.getNotificationCenter().k(2, 256);
                                            npVar62.g2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i132);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    j32 = j102 != 0 ? -j102 : -peer.channel_id;
                                                }
                                                long j11 = j32;
                                                npVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        npVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 18:
                boolean z10 = tLObject instanceof Vector;
                np npVar17 = this.b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i16 = 0; i16 < vector.objects.size(); i16++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i16));
                    }
                    ur messagesStorage = npVar17.getMessagesStorage();
                    messagesStorage.a.c(new lg(messagesStorage, arrayList4, new rn(npVar17, 10), 22));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = npVar17.D7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = npVar17.h7.edit();
                        npVar17.D7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        g0.g3(new rn(npVar17, 11));
                    }
                    ur messagesStorage2 = npVar17.getMessagesStorage();
                    messagesStorage2.a.c(new lg(messagesStorage2, tL_messages_dialogFilters.filters, new rn(npVar17, 12), 22));
                    break;
                } else {
                    g0.g3(new rn(npVar17, 13));
                    break;
                }
            case 19:
                if (tL_error == null) {
                    np npVar18 = this.b;
                    TLRPC.User c22 = npVar18.c2(Long.valueOf(npVar18.getUserConfig().e()));
                    if (c22 == null) {
                        c22 = npVar18.getUserConfig().f();
                        npVar18.e4(c22, true, false);
                    } else {
                        npVar18.getUserConfig().w(c22);
                    }
                    if (c22 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w10 = w7.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        c22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_small = w10.location;
                        }
                        if (w11 != null) {
                            tL_userProfilePhoto.photo_big = w11.location;
                        }
                        npVar18.W0(c22.id).f();
                        npVar18.W0(c22.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(c22);
                        npVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        g0.g3(new sj(npVar18, 0));
                        break;
                    }
                }
                break;
            case 20:
                this.b.getConnectionsManager().cleanup(false);
                g0.g3(new a(tLObject, 23));
                break;
            case 21:
                np npVar19 = this.b;
                npVar19.getClass();
                if (tL_error == null) {
                    npVar19.V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final int i17 = 0;
                    final np npVar20 = this.b;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.nl
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    np npVar21 = npVar20;
                                    npVar21.h8 = false;
                                    npVar21.t4 = dp.c(0, tL_help_peerColors);
                                    npVar21.h7.edit().putString("peerColors", npVar21.t4.toString()).apply();
                                    break;
                                default:
                                    np npVar22 = npVar20;
                                    npVar22.i8 = false;
                                    npVar22.u4 = dp.c(1, tL_help_peerColors);
                                    npVar22.h7.edit().putString("profilePeerColors", npVar22.u4.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 23:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors2 = (TLRPC.TL_help_peerColors) tLObject;
                    final int i18 = 1;
                    final np npVar21 = this.b;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.nl
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    np npVar212 = npVar21;
                                    npVar212.h8 = false;
                                    npVar212.t4 = dp.c(0, tL_help_peerColors2);
                                    npVar212.h7.edit().putString("peerColors", npVar212.t4.toString()).apply();
                                    break;
                                default:
                                    np npVar22 = npVar21;
                                    npVar22.i8 = false;
                                    npVar22.u4 = dp.c(1, tL_help_peerColors2);
                                    npVar22.h7.edit().putString("profilePeerColors", npVar22.u4.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 24:
                np npVar22 = this.b;
                npVar22.k2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    npVar22.getMessagesStorage().H1(tL_updates_state.date);
                    npVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    npVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    npVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i19 = 0; i19 < 3; i19++) {
                        npVar22.W3(i19, 2);
                    }
                    ur messagesStorage3 = npVar22.getMessagesStorage();
                    ur messagesStorage4 = npVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i20 = messagesStorage4.w;
                    ur messagesStorage5 = npVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i21 = messagesStorage5.r;
                    ur messagesStorage6 = npVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i22 = messagesStorage6.n;
                    ur messagesStorage7 = npVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i20, i21, i22, messagesStorage7.s);
                    break;
                } else if (tL_error.code != 401) {
                    npVar22.k2 = true;
                    npVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new nj(npVar22, 24));
                    break;
                }
                break;
            case 25:
                final int i23 = 4;
                final np npVar23 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i23;
                        np npVar52 = npVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ls.S2, new Object[0]);
                                break;
                            case 1:
                                npVar52.v2 = false;
                                SharedPreferences.Editor edit2 = npVar52.g7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = npVar52.g7.edit();
                                    edit22.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                npVar52.u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.g7.edit();
                                    edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (npVar52.u2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.s8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.r8 = System.currentTimeMillis();
                                }
                                npVar52.p8 = false;
                                TL_account.contentSettings contentsettings = npVar52.s8;
                                if (contentsettings != null && (set = npVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = npVar52.q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList32.get(i122);
                                        i122++;
                                        ((y10) obj).a(npVar52.s8);
                                    }
                                    npVar52.q8.clear();
                                    npVar52.q8 = null;
                                }
                                npVar52.getNotificationCenter().k(ls.V3, new Object[0]);
                                break;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.f4(tL_help_recentMeUrls.users, false);
                                npVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList42 = npVar52.s;
                                arrayList42.clear();
                                arrayList42.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        np npVar62 = npVar23;
                                        if (i132 >= size2) {
                                            npVar62.getUserConfig().x = true;
                                            npVar62.getUserConfig().v(false);
                                            npVar62.getNotificationCenter().k(2, 256);
                                            npVar62.g2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i132);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    j32 = j102 != 0 ? -j102 : -peer.channel_id;
                                                }
                                                long j11 = j32;
                                                npVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        npVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final np npVar24 = this.b;
                npVar24.getClass();
                final int i24 = 0;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.rk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i24;
                        np npVar52 = npVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ls.S2, new Object[0]);
                                break;
                            case 1:
                                npVar52.v2 = false;
                                SharedPreferences.Editor edit2 = npVar52.g7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 2:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = npVar52.g7.edit();
                                    edit22.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                npVar52.u2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.g7.edit();
                                    edit3.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit3.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit3.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit3.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (npVar52.u2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.s8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.r8 = System.currentTimeMillis();
                                }
                                npVar52.p8 = false;
                                TL_account.contentSettings contentsettings = npVar52.s8;
                                if (contentsettings != null && (set = npVar52.F4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.h7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.F4).apply();
                                    }
                                }
                                ArrayList arrayList32 = npVar52.q8;
                                if (arrayList32 != null) {
                                    int size = arrayList32.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList32.get(i122);
                                        i122++;
                                        ((y10) obj).a(npVar52.s8);
                                    }
                                    npVar52.q8.clear();
                                    npVar52.q8 = null;
                                }
                                npVar52.getNotificationCenter().k(ls.V3, new Object[0]);
                                break;
                            case 5:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.f4(tL_help_recentMeUrls.users, false);
                                npVar52.Z3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList42 = npVar52.s;
                                arrayList42.clear();
                                arrayList42.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        np npVar62 = npVar24;
                                        if (i132 >= size2) {
                                            npVar62.getUserConfig().x = true;
                                            npVar62.getUserConfig().v(false);
                                            npVar62.getNotificationCenter().k(2, 256);
                                            npVar62.g2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i132);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j32 = peer.user_id;
                                                if (j32 == 0) {
                                                    long j102 = peer.chat_id;
                                                    j32 = j102 != 0 ? -j102 : -peer.channel_id;
                                                }
                                                long j11 = j32;
                                                npVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) npVar62.R.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        npVar62.u2(j11, 0L, null);
                                                    }
                                                }
                                            }
                                            i132++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
