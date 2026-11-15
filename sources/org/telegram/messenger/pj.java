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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ pj(np npVar, int i7) {
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
                        m5.x(dialog);
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
                        npVar.N3(arrayList, null, null, false, 0);
                        break;
                    }
                }
                break;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.b.M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
                break;
            case 2:
                np npVar2 = this.b;
                npVar2.getClass();
                if (tLObject != null) {
                    npVar2.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 3:
                np npVar3 = this.b;
                npVar3.F2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    npVar3.G2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    npVar3.G2 = tL_help_termsOfServiceUpdate.expires;
                    g0.h3(new fi(14, npVar3, tL_help_termsOfServiceUpdate));
                } else {
                    npVar3.G2 = npVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                npVar3.e7.edit().putInt("nextTosCheckTime", npVar3.G2).commit();
                break;
            case 4:
                if (tL_error == null) {
                    final int i10 = 3;
                    final np npVar4 = this.b;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set;
                            int i11 = i10;
                            np npVar5 = npVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i11) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = npVar5.e7.edit();
                                        edit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                        if (reactionNotificationsFrom != null) {
                                            edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                        if (reactionNotificationsFrom2 != null) {
                                            edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                        npVar5.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        npVar5.getNotificationCenter().k(42, new Object[0]);
                                        break;
                                    }
                                    break;
                                case 1:
                                    npVar5.U0 = false;
                                    ArrayList arrayList2 = npVar5.W0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    npVar5.getNotificationCenter().k(ns.Q2, new Object[0]);
                                    break;
                                case 2:
                                    npVar5.t2 = false;
                                    SharedPreferences.Editor edit2 = npVar5.e7.edit();
                                    edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit2.commit();
                                    npVar5.getUserConfig().U = true;
                                    npVar5.getUserConfig().v(false);
                                    break;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    npVar5.Y3(tL_help_recentMeUrls.users, false);
                                    npVar5.S3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = npVar5.s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    npVar5.getNotificationCenter().k(3, new Object[0]);
                                    break;
                                case 4:
                                    npVar5.s2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit3 = npVar5.e7.edit();
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
                                    if (npVar5.s2 == 0) {
                                        npVar5.getUserConfig().T = true;
                                        npVar5.getUserConfig().v(false);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        npVar5.n8 = (TL_account.contentSettings) tLObject2;
                                        npVar5.m8 = System.currentTimeMillis();
                                    }
                                    npVar5.k8 = false;
                                    TL_account.contentSettings contentsettings = npVar5.n8;
                                    if (contentsettings != null && (set = npVar5.D4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = npVar5.f7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar5.D4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = npVar5.l8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayList4.get(i12);
                                            i12++;
                                            ((z10) obj).a(npVar5.n8);
                                        }
                                        npVar5.l8.clear();
                                        npVar5.l8 = null;
                                    }
                                    npVar5.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                                npVar6.e2 = false;
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
                                                            npVar6.r2(j11, 0L, null);
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
                    this.b.M3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    break;
                }
                break;
            case 6:
                final int i11 = 4;
                final np npVar5 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i11;
                        np npVar52 = npVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = npVar52.e7.edit();
                                    edit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                npVar52.U0 = false;
                                ArrayList arrayList2 = npVar52.W0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ns.Q2, new Object[0]);
                                break;
                            case 2:
                                npVar52.t2 = false;
                                SharedPreferences.Editor edit2 = npVar52.e7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.Y3(tL_help_recentMeUrls.users, false);
                                npVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = npVar52.s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                npVar52.s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.e7.edit();
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
                                if (npVar52.s2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.m8 = System.currentTimeMillis();
                                }
                                npVar52.k8 = false;
                                TL_account.contentSettings contentsettings = npVar52.n8;
                                if (contentsettings != null && (set = npVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = npVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((z10) obj).a(npVar52.n8);
                                    }
                                    npVar52.l8.clear();
                                    npVar52.l8 = null;
                                }
                                npVar52.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                            npVar6.e2 = false;
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
                                                        npVar6.r2(j11, 0L, null);
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
                    npVar6.getMessagesController().Y3(arrayList3, false);
                    break;
                }
                break;
            case 8:
                np npVar7 = this.b;
                npVar7.getClass();
                if (tLObject != null) {
                    npVar7.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 9:
                np npVar8 = this.b;
                if (tL_error == null) {
                    npVar8.getClass();
                    npVar8.K2 = System.currentTimeMillis();
                    npVar8.N2 = false;
                    npVar8.M2 = 0;
                } else {
                    long j3 = npVar8.K2;
                    if (j3 != 0) {
                        npVar8.K2 = j3 + 5000;
                    }
                }
                npVar8.L2 = 0;
                break;
            case 10:
                np npVar9 = this.b;
                if (tL_error == null) {
                    npVar9.N2 = true;
                } else {
                    long j10 = npVar9.K2;
                    if (j10 != 0) {
                        npVar9.K2 = j10 + 5000;
                    }
                }
                npVar9.L2 = 0;
                break;
            case 11:
                final int i13 = 2;
                final np npVar10 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i13;
                        np npVar52 = npVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = npVar52.e7.edit();
                                    edit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ns.Q2, new Object[0]);
                                break;
                            case 2:
                                npVar52.t2 = false;
                                SharedPreferences.Editor edit2 = npVar52.e7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.Y3(tL_help_recentMeUrls.users, false);
                                npVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = npVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                npVar52.s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.e7.edit();
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
                                if (npVar52.s2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.m8 = System.currentTimeMillis();
                                }
                                npVar52.k8 = false;
                                TL_account.contentSettings contentsettings = npVar52.n8;
                                if (contentsettings != null && (set = npVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = npVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList4.get(i122);
                                        i122++;
                                        ((z10) obj).a(npVar52.n8);
                                    }
                                    npVar52.l8.clear();
                                    npVar52.l8 = null;
                                }
                                npVar52.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                            npVar62.e2 = false;
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
                                                        npVar62.r2(j11, 0L, null);
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
                    npVar11.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new tj(npVar11, 25));
                    break;
                }
                break;
            case 13:
                if (tLObject != null) {
                    np npVar12 = this.b;
                    npVar12.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new tj(npVar12, 29));
                    break;
                }
                break;
            case 14:
                np npVar13 = this.b;
                npVar13.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    npVar13.M3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    break;
                }
                break;
            case 15:
                final int i14 = 6;
                final np npVar14 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i14;
                        np npVar52 = npVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = npVar52.e7.edit();
                                    edit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ns.Q2, new Object[0]);
                                break;
                            case 2:
                                npVar52.t2 = false;
                                SharedPreferences.Editor edit2 = npVar52.e7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.Y3(tL_help_recentMeUrls.users, false);
                                npVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = npVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                npVar52.s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.e7.edit();
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
                                if (npVar52.s2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.m8 = System.currentTimeMillis();
                                }
                                npVar52.k8 = false;
                                TL_account.contentSettings contentsettings = npVar52.n8;
                                if (contentsettings != null && (set = npVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = npVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList4.get(i122);
                                        i122++;
                                        ((z10) obj).a(npVar52.n8);
                                    }
                                    npVar52.l8.clear();
                                    npVar52.l8 = null;
                                }
                                npVar52.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                            npVar62.e2 = false;
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
                                                        npVar62.r2(j11, 0L, null);
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
                    npVar15.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new tj(npVar15, 28));
                    break;
                }
                break;
            case 17:
                final int i15 = 0;
                final np npVar16 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i15;
                        np npVar52 = npVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = npVar52.e7.edit();
                                    edit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
                                    if (reactionNotificationsFrom != null) {
                                        edit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
                                    if (reactionNotificationsFrom2 != null) {
                                        edit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
                                    npVar52.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    npVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ns.Q2, new Object[0]);
                                break;
                            case 2:
                                npVar52.t2 = false;
                                SharedPreferences.Editor edit2 = npVar52.e7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.Y3(tL_help_recentMeUrls.users, false);
                                npVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = npVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                npVar52.s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.e7.edit();
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
                                if (npVar52.s2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.m8 = System.currentTimeMillis();
                                }
                                npVar52.k8 = false;
                                TL_account.contentSettings contentsettings = npVar52.n8;
                                if (contentsettings != null && (set = npVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = npVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList4.get(i122);
                                        i122++;
                                        ((z10) obj).a(npVar52.n8);
                                    }
                                    npVar52.l8.clear();
                                    npVar52.l8 = null;
                                }
                                npVar52.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                            npVar62.e2 = false;
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
                                                        npVar62.r2(j11, 0L, null);
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
                    vr messagesStorage = npVar17.getMessagesStorage();
                    messagesStorage.a.c(new kg(messagesStorage, arrayList4, new pn(npVar17, 10), 22));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = npVar17.B7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = npVar17.f7.edit();
                        npVar17.B7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        g0.h3(new pn(npVar17, 11));
                    }
                    vr messagesStorage2 = npVar17.getMessagesStorage();
                    messagesStorage2.a.c(new kg(messagesStorage2, tL_messages_dialogFilters.filters, new pn(npVar17, 12), 22));
                    break;
                } else {
                    g0.h3(new pn(npVar17, 13));
                    break;
                }
            case 19:
                if (tL_error == null) {
                    np npVar18 = this.b;
                    TLRPC.User a22 = npVar18.a2(Long.valueOf(npVar18.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = npVar18.getUserConfig().f();
                        npVar18.X3(a22, true, false);
                    } else {
                        npVar18.getUserConfig().w(a22);
                    }
                    if (a22 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w10 = w7.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_small = w10.location;
                        }
                        if (w11 != null) {
                            tL_userProfilePhoto.photo_big = w11.location;
                        }
                        npVar18.U0(a22.id).f();
                        npVar18.U0(a22.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(a22);
                        npVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        g0.h3(new tj(npVar18, 0));
                        break;
                    }
                }
                break;
            case 20:
                this.b.getConnectionsManager().cleanup(false);
                g0.h3(new a(tLObject, 23));
                break;
            case 21:
                np npVar19 = this.b;
                npVar19.getClass();
                if (tL_error == null) {
                    npVar19.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final int i17 = 1;
                    final np npVar20 = this.b;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.kl
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    np npVar21 = npVar20;
                                    npVar21.d8 = false;
                                    npVar21.s4 = dp.c(1, tL_help_peerColors);
                                    npVar21.f7.edit().putString("profilePeerColors", npVar21.s4.toString()).apply();
                                    break;
                                default:
                                    np npVar22 = npVar20;
                                    npVar22.c8 = false;
                                    npVar22.r4 = dp.c(0, tL_help_peerColors);
                                    npVar22.f7.edit().putString("peerColors", npVar22.r4.toString()).apply();
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
                    final int i18 = 0;
                    final np npVar21 = this.b;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.kl
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    np npVar212 = npVar21;
                                    npVar212.d8 = false;
                                    npVar212.s4 = dp.c(1, tL_help_peerColors2);
                                    npVar212.f7.edit().putString("profilePeerColors", npVar212.s4.toString()).apply();
                                    break;
                                default:
                                    np npVar22 = npVar21;
                                    npVar22.c8 = false;
                                    npVar22.r4 = dp.c(0, tL_help_peerColors2);
                                    npVar22.f7.edit().putString("peerColors", npVar22.r4.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 24:
                np npVar22 = this.b;
                npVar22.i2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    npVar22.getMessagesStorage().H1(tL_updates_state.date);
                    npVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    npVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    npVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i19 = 0; i19 < 3; i19++) {
                        npVar22.P3(i19, 2);
                    }
                    vr messagesStorage3 = npVar22.getMessagesStorage();
                    vr messagesStorage4 = npVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i20 = messagesStorage4.w;
                    vr messagesStorage5 = npVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i21 = messagesStorage5.r;
                    vr messagesStorage6 = npVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i22 = messagesStorage6.n;
                    vr messagesStorage7 = npVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i20, i21, i22, messagesStorage7.s);
                    break;
                } else if (tL_error.code != 401) {
                    npVar22.i2 = true;
                    npVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new pj(npVar22, 24));
                    break;
                }
                break;
            case 25:
                final int i23 = 5;
                final np npVar23 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i23;
                        np npVar52 = npVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = npVar52.e7.edit();
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
                            case 1:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ns.Q2, new Object[0]);
                                break;
                            case 2:
                                npVar52.t2 = false;
                                SharedPreferences.Editor edit22 = npVar52.e7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.Y3(tL_help_recentMeUrls.users, false);
                                npVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = npVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                npVar52.s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.e7.edit();
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
                                if (npVar52.s2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.m8 = System.currentTimeMillis();
                                }
                                npVar52.k8 = false;
                                TL_account.contentSettings contentsettings = npVar52.n8;
                                if (contentsettings != null && (set = npVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = npVar52.l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((z10) obj).a(npVar52.n8);
                                    }
                                    npVar52.l8.clear();
                                    npVar52.l8 = null;
                                }
                                npVar52.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                            npVar62.e2 = false;
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
                                                        npVar62.r2(j11, 0L, null);
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
                final int i24 = 1;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i24;
                        np npVar52 = npVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = npVar52.e7.edit();
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
                            case 1:
                                npVar52.U0 = false;
                                ArrayList arrayList22 = npVar52.W0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                npVar52.getNotificationCenter().k(ns.Q2, new Object[0]);
                                break;
                            case 2:
                                npVar52.t2 = false;
                                SharedPreferences.Editor edit22 = npVar52.e7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                npVar52.getUserConfig().U = true;
                                npVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                npVar52.Y3(tL_help_recentMeUrls.users, false);
                                npVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = npVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                npVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                npVar52.s2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = npVar52.e7.edit();
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
                                if (npVar52.s2 == 0) {
                                    npVar52.getUserConfig().T = true;
                                    npVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    npVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    npVar52.m8 = System.currentTimeMillis();
                                }
                                npVar52.k8 = false;
                                TL_account.contentSettings contentsettings = npVar52.n8;
                                if (contentsettings != null && (set = npVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = npVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", npVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = npVar52.l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((z10) obj).a(npVar52.n8);
                                    }
                                    npVar52.l8.clear();
                                    npVar52.l8 = null;
                                }
                                npVar52.getNotificationCenter().k(ns.S3, new Object[0]);
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
                                            npVar62.e2 = false;
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
                                                        npVar62.r2(j11, 0L, null);
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
