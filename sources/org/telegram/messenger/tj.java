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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ tj(vp vpVar, int i10) {
        this.a = i10;
        this.b = vpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                ConcurrentHashMap concurrentHashMap = vpVar.P;
                ConcurrentHashMap concurrentHashMap2 = vpVar.O;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_messages_peerDialogs.dialogs.size(); i10++) {
                        TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i10);
                        o5.x(dialog);
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
                        vpVar.K3(arrayList, null, null, false, 0);
                        break;
                    }
                }
                break;
            case 1:
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    this.b.J3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    break;
                }
                break;
            case 2:
                vp vpVar2 = this.b;
                vpVar2.getClass();
                if (tLObject != null) {
                    vpVar2.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 3:
                vp vpVar3 = this.b;
                vpVar3.E2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    vpVar3.F2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    vpVar3.F2 = tL_help_termsOfServiceUpdate.expires;
                    i0.g3(new oi(14, vpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    vpVar3.F2 = vpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                vpVar3.e7.edit().putInt("nextTosCheckTime", vpVar3.F2).commit();
                break;
            case 4:
                if (tL_error == null) {
                    final int i11 = 3;
                    final vp vpVar4 = this.b;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set;
                            int i12 = i11;
                            vp vpVar5 = vpVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i12) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = vpVar5.e7.edit();
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
                                        vpVar5.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        vpVar5.getNotificationCenter().k(42, new Object[0]);
                                        break;
                                    }
                                    break;
                                case 1:
                                    vpVar5.T0 = false;
                                    ArrayList arrayList2 = vpVar5.V0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    vpVar5.getNotificationCenter().k(zs.Q2, new Object[0]);
                                    break;
                                case 2:
                                    vpVar5.r2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit2 = vpVar5.e7.edit();
                                        edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                        if (reactionNotificationsFrom3 != null) {
                                            edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                        TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                        if (reactionNotificationsFrom4 != null) {
                                            edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                        }
                                        edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                        vpVar5.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                        edit2.apply();
                                    }
                                    if (vpVar5.r2 == 0) {
                                        vpVar5.getUserConfig().S = true;
                                        vpVar5.getUserConfig().v(false);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    vpVar5.V3(tL_help_recentMeUrls.users, false);
                                    vpVar5.P3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = vpVar5.s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    vpVar5.getNotificationCenter().k(3, new Object[0]);
                                    break;
                                case 4:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        vpVar5.n8 = (TL_account.contentSettings) tLObject2;
                                        vpVar5.m8 = System.currentTimeMillis();
                                    }
                                    vpVar5.k8 = false;
                                    TL_account.contentSettings contentsettings = vpVar5.n8;
                                    if (contentsettings != null && (set = vpVar5.D4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = vpVar5.f7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar5.D4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = vpVar5.l8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i13 = 0;
                                        while (i13 < size) {
                                            Object obj = arrayList4.get(i13);
                                            i13++;
                                            ((q20) obj).a(vpVar5.n8);
                                        }
                                        vpVar5.l8.clear();
                                        vpVar5.l8 = null;
                                    }
                                    vpVar5.getNotificationCenter().k(zs.S3, new Object[0]);
                                    break;
                                case 5:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i14 = 0;
                                        while (true) {
                                            vp vpVar6 = vpVar4;
                                            if (i14 >= size2) {
                                                vpVar6.getUserConfig().x = true;
                                                vpVar6.getUserConfig().v(false);
                                                vpVar6.getNotificationCenter().k(2, 256);
                                                vpVar6.d2 = false;
                                                break;
                                            } else {
                                                TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i14);
                                                if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                    TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                    long j10 = peer.user_id;
                                                    if (j10 == 0) {
                                                        long j11 = peer.chat_id;
                                                        j10 = j11 != 0 ? -j11 : -peer.channel_id;
                                                    }
                                                    long j12 = j10;
                                                    vpVar6.getMessagesStorage().F1(j12, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar6.Q.f(j12);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            vpVar6.q2(j12, 0L, null);
                                                        }
                                                    }
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    vpVar5.s2 = false;
                                    SharedPreferences.Editor edit3 = vpVar5.e7.edit();
                                    edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit3.commit();
                                    vpVar5.getUserConfig().T = true;
                                    vpVar5.getUserConfig().v(false);
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
                    this.b.J3(tL_messages_affectedMessages2.pts, -1, tL_messages_affectedMessages2.pts_count);
                    break;
                }
                break;
            case 6:
                final int i12 = 2;
                final vp vpVar5 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i12;
                        vp vpVar52 = vpVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList2 = vpVar52.V0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(zs.Q2, new Object[0]);
                                break;
                            case 2:
                                vpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = vpVar52.s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.m8 = System.currentTimeMillis();
                                }
                                vpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList4.get(i13);
                                        i13++;
                                        ((q20) obj).a(vpVar52.n8);
                                    }
                                    vpVar52.l8.clear();
                                    vpVar52.l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(zs.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i14 = 0;
                                    while (true) {
                                        vp vpVar6 = vpVar5;
                                        if (i14 >= size2) {
                                            vpVar6.getUserConfig().x = true;
                                            vpVar6.getUserConfig().v(false);
                                            vpVar6.getNotificationCenter().k(2, 256);
                                            vpVar6.d2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i14);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j10 = peer.user_id;
                                                if (j10 == 0) {
                                                    long j11 = peer.chat_id;
                                                    j10 = j11 != 0 ? -j11 : -peer.channel_id;
                                                }
                                                long j12 = j10;
                                                vpVar6.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar6.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar6.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i14++;
                                        }
                                    }
                                }
                                break;
                            default:
                                vpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 7:
                vp vpVar6 = this.b;
                vpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (arrayList2.get(i13) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i13));
                        }
                    }
                    vpVar6.getMessagesController().V3(arrayList3, false);
                    break;
                }
                break;
            case 8:
                vp vpVar7 = this.b;
                vpVar7.getClass();
                if (tLObject != null) {
                    vpVar7.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 9:
                vp vpVar8 = this.b;
                if (tL_error == null) {
                    vpVar8.getClass();
                    vpVar8.J2 = System.currentTimeMillis();
                    vpVar8.M2 = false;
                    vpVar8.L2 = 0;
                } else {
                    long j10 = vpVar8.J2;
                    if (j10 != 0) {
                        vpVar8.J2 = j10 + 5000;
                    }
                }
                vpVar8.K2 = 0;
                break;
            case 10:
                vp vpVar9 = this.b;
                if (tL_error == null) {
                    vpVar9.M2 = true;
                } else {
                    long j11 = vpVar9.J2;
                    if (j11 != 0) {
                        vpVar9.J2 = j11 + 5000;
                    }
                }
                vpVar9.K2 = 0;
                break;
            case 11:
                final int i14 = 6;
                final vp vpVar10 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i14;
                        vp vpVar52 = vpVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(zs.Q2, new Object[0]);
                                break;
                            case 2:
                                vpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.m8 = System.currentTimeMillis();
                                }
                                vpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList4.get(i132);
                                        i132++;
                                        ((q20) obj).a(vpVar52.n8);
                                    }
                                    vpVar52.l8.clear();
                                    vpVar52.l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(zs.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar10;
                                        if (i142 >= size2) {
                                            vpVar62.getUserConfig().x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.d2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i142);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    j102 = j112 != 0 ? -j112 : -peer.channel_id;
                                                }
                                                long j12 = j102;
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                vpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 12:
                vp vpVar11 = this.b;
                vpVar11.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar11.J3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    break;
                }
                break;
            case 13:
                vp vpVar12 = this.b;
                vpVar12.getClass();
                if (tLObject != null) {
                    vpVar12.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new zj(vpVar12, 23));
                    break;
                }
                break;
            case 14:
                if (tLObject != null) {
                    vp vpVar13 = this.b;
                    vpVar13.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new zj(vpVar13, 28));
                    break;
                }
                break;
            case 15:
                final int i15 = 5;
                final vp vpVar14 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i15;
                        vp vpVar52 = vpVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(zs.Q2, new Object[0]);
                                break;
                            case 2:
                                vpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.m8 = System.currentTimeMillis();
                                }
                                vpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList4.get(i132);
                                        i132++;
                                        ((q20) obj).a(vpVar52.n8);
                                    }
                                    vpVar52.l8.clear();
                                    vpVar52.l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(zs.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar14;
                                        if (i142 >= size2) {
                                            vpVar62.getUserConfig().x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.d2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i142);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    j102 = j112 != 0 ? -j112 : -peer.channel_id;
                                                }
                                                long j12 = j102;
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                vpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 16:
                vp vpVar15 = this.b;
                vpVar15.getClass();
                if (tLObject != null) {
                    vpVar15.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new zj(vpVar15, 27));
                    break;
                }
                break;
            case 17:
                final int i16 = 0;
                final vp vpVar16 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i16;
                        vp vpVar52 = vpVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(zs.Q2, new Object[0]);
                                break;
                            case 2:
                                vpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
                                    edit2.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit2.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit2.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit2.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (vpVar52.r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.m8 = System.currentTimeMillis();
                                }
                                vpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = vpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList4.get(i132);
                                        i132++;
                                        ((q20) obj).a(vpVar52.n8);
                                    }
                                    vpVar52.l8.clear();
                                    vpVar52.l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(zs.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar16;
                                        if (i142 >= size2) {
                                            vpVar62.getUserConfig().x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.d2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i142);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    j102 = j112 != 0 ? -j112 : -peer.channel_id;
                                                }
                                                long j12 = j102;
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                vpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 18:
                boolean z10 = tLObject instanceof Vector;
                vp vpVar17 = this.b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i17 = 0; i17 < vector.objects.size(); i17++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i17));
                    }
                    hs messagesStorage = vpVar17.getMessagesStorage();
                    messagesStorage.a.c(new kg(messagesStorage, arrayList4, new eo(vpVar17, 10), 22));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = vpVar17.B7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = vpVar17.f7.edit();
                        vpVar17.B7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        i0.g3(new eo(vpVar17, 11));
                    }
                    hs messagesStorage2 = vpVar17.getMessagesStorage();
                    messagesStorage2.a.c(new kg(messagesStorage2, tL_messages_dialogFilters.filters, new eo(vpVar17, 12), 22));
                    break;
                } else {
                    i0.g3(new eo(vpVar17, 13));
                    break;
                }
            case 19:
                if (tL_error == null) {
                    vp vpVar18 = this.b;
                    TLRPC.User Z1 = vpVar18.Z1(Long.valueOf(vpVar18.getUserConfig().e()));
                    if (Z1 == null) {
                        Z1 = vpVar18.getUserConfig().f();
                        vpVar18.U3(Z1, true, false);
                    } else {
                        vpVar18.getUserConfig().w(Z1);
                    }
                    if (Z1 != null) {
                        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                        ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                        TLRPC.PhotoSize w9 = b8.w(arrayList5, 100, false, null, false);
                        TLRPC.PhotoSize w10 = b8.w(arrayList5, 1000, false, null, false);
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        Z1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                        if (w9 != null) {
                            tL_userProfilePhoto.photo_small = w9.location;
                        }
                        if (w10 != null) {
                            tL_userProfilePhoto.photo_big = w10.location;
                        }
                        vpVar18.T0(Z1.id).e();
                        vpVar18.T0(Z1.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(Z1);
                        vpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        i0.g3(new zj(vpVar18, 1));
                        break;
                    }
                }
                break;
            case 20:
                this.b.getConnectionsManager().cleanup(false);
                i0.g3(new a(tLObject, 22));
                break;
            case 21:
                vp vpVar19 = this.b;
                vpVar19.getClass();
                if (tL_error == null) {
                    vpVar19.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final int i18 = 0;
                    final vp vpVar20 = this.b;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.fm
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    vp vpVar21 = vpVar20;
                                    vpVar21.c8 = false;
                                    vpVar21.r4 = lp.c(0, tL_help_peerColors);
                                    vpVar21.f7.edit().putString("peerColors", vpVar21.r4.toString()).apply();
                                    break;
                                default:
                                    vp vpVar22 = vpVar20;
                                    vpVar22.d8 = false;
                                    vpVar22.s4 = lp.c(1, tL_help_peerColors);
                                    vpVar22.f7.edit().putString("profilePeerColors", vpVar22.s4.toString()).apply();
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
                    final int i19 = 1;
                    final vp vpVar21 = this.b;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.fm
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    vp vpVar212 = vpVar21;
                                    vpVar212.c8 = false;
                                    vpVar212.r4 = lp.c(0, tL_help_peerColors2);
                                    vpVar212.f7.edit().putString("peerColors", vpVar212.r4.toString()).apply();
                                    break;
                                default:
                                    vp vpVar22 = vpVar21;
                                    vpVar22.d8 = false;
                                    vpVar22.s4 = lp.c(1, tL_help_peerColors2);
                                    vpVar22.f7.edit().putString("profilePeerColors", vpVar22.s4.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 24:
                vp vpVar22 = this.b;
                vpVar22.h2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    vpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    vpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    vpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    vpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i20 = 0; i20 < 3; i20++) {
                        vpVar22.M3(i20, 2);
                    }
                    hs messagesStorage3 = vpVar22.getMessagesStorage();
                    hs messagesStorage4 = vpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i21 = messagesStorage4.w;
                    hs messagesStorage5 = vpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i22 = messagesStorage5.r;
                    hs messagesStorage6 = vpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i23 = messagesStorage6.n;
                    hs messagesStorage7 = vpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i21, i22, i23, messagesStorage7.s);
                    break;
                } else if (tL_error.code != 401) {
                    vpVar22.h2 = true;
                    vpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new tj(vpVar22, 24));
                    break;
                }
                break;
            case 25:
                final vp vpVar23 = this.b;
                vpVar23.getClass();
                final int i24 = 1;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i24;
                        vp vpVar52 = vpVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(zs.Q2, new Object[0]);
                                break;
                            case 2:
                                vpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = vpVar52.e7.edit();
                                    edit22.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (vpVar52.r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.m8 = System.currentTimeMillis();
                                }
                                vpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = vpVar52.l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList42.get(i132);
                                        i132++;
                                        ((q20) obj).a(vpVar52.n8);
                                    }
                                    vpVar52.l8.clear();
                                    vpVar52.l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(zs.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar23;
                                        if (i142 >= size2) {
                                            vpVar62.getUserConfig().x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.d2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i142);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    j102 = j112 != 0 ? -j112 : -peer.channel_id;
                                                }
                                                long j12 = j102;
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                vpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i25 = 4;
                final vp vpVar24 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ck
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i25;
                        vp vpVar52 = vpVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = vpVar52.e7.edit();
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
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    vpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                vpVar52.T0 = false;
                                ArrayList arrayList22 = vpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                vpVar52.getNotificationCenter().k(zs.Q2, new Object[0]);
                                break;
                            case 2:
                                vpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = vpVar52.e7.edit();
                                    edit22.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings2.messages_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom3 = tL_reactionsNotifySettings2.messages_notify_from;
                                    if (reactionNotificationsFrom3 != null) {
                                        edit22.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom3 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings2.stories_notify_from != null);
                                    TL_account.ReactionNotificationsFrom reactionNotificationsFrom4 = tL_reactionsNotifySettings2.stories_notify_from;
                                    if (reactionNotificationsFrom4 != null) {
                                        edit22.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom4 instanceof TL_account.TL_reactionNotificationsFromContacts);
                                    }
                                    edit22.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings2.show_previews);
                                    vpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (vpVar52.r2 == 0) {
                                    vpVar52.getUserConfig().S = true;
                                    vpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                vpVar52.V3(tL_help_recentMeUrls.users, false);
                                vpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = vpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                vpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    vpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    vpVar52.m8 = System.currentTimeMillis();
                                }
                                vpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = vpVar52.n8;
                                if (contentsettings != null && (set = vpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = vpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", vpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = vpVar52.l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList42.get(i132);
                                        i132++;
                                        ((q20) obj).a(vpVar52.n8);
                                    }
                                    vpVar52.l8.clear();
                                    vpVar52.l8 = null;
                                }
                                vpVar52.getNotificationCenter().k(zs.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        vp vpVar62 = vpVar24;
                                        if (i142 >= size2) {
                                            vpVar62.getUserConfig().x = true;
                                            vpVar62.getUserConfig().v(false);
                                            vpVar62.getNotificationCenter().k(2, 256);
                                            vpVar62.d2 = false;
                                            break;
                                        } else {
                                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector2.objects.get(i142);
                                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                                long j102 = peer.user_id;
                                                if (j102 == 0) {
                                                    long j112 = peer.chat_id;
                                                    j102 = j112 != 0 ? -j112 : -peer.channel_id;
                                                }
                                                long j12 = j102;
                                                vpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        vpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                vpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = vpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                vpVar52.getUserConfig().T = true;
                                vpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
