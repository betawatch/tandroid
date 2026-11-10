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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class rj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ rj(qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                ConcurrentHashMap concurrentHashMap = qpVar.P;
                ConcurrentHashMap concurrentHashMap2 = qpVar.O;
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
                        qpVar.N3(arrayList, null, null, false, 0);
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
                qp qpVar2 = this.b;
                qpVar2.getClass();
                if (tLObject != null) {
                    qpVar2.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 3:
                qp qpVar3 = this.b;
                qpVar3.E2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    qpVar3.F2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    qpVar3.F2 = tL_help_termsOfServiceUpdate.expires;
                    g0.h3(new hi(14, qpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    qpVar3.F2 = qpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                qpVar3.d7.edit().putInt("nextTosCheckTime", qpVar3.F2).commit();
                break;
            case 4:
                if (tL_error == null) {
                    final int i10 = 3;
                    final qp qpVar4 = this.b;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set;
                            int i11 = i10;
                            qp qpVar5 = qpVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i11) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = qpVar5.d7.edit();
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
                                        qpVar5.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        qpVar5.getNotificationCenter().k(42, new Object[0]);
                                        break;
                                    }
                                    break;
                                case 1:
                                    qpVar5.T0 = false;
                                    ArrayList arrayList2 = qpVar5.V0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    qpVar5.getNotificationCenter().k(qs.Q2, new Object[0]);
                                    break;
                                case 2:
                                    qpVar5.s2 = false;
                                    SharedPreferences.Editor edit2 = qpVar5.d7.edit();
                                    edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit2.commit();
                                    qpVar5.getUserConfig().T = true;
                                    qpVar5.getUserConfig().v(false);
                                    break;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    qpVar5.Y3(tL_help_recentMeUrls.users, false);
                                    qpVar5.S3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = qpVar5.s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    qpVar5.getNotificationCenter().k(3, new Object[0]);
                                    break;
                                case 4:
                                    qpVar5.r2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit3 = qpVar5.d7.edit();
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
                                        qpVar5.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                        edit3.apply();
                                    }
                                    if (qpVar5.r2 == 0) {
                                        qpVar5.getUserConfig().S = true;
                                        qpVar5.getUserConfig().v(false);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        qpVar5.m8 = (TL_account.contentSettings) tLObject2;
                                        qpVar5.l8 = System.currentTimeMillis();
                                    }
                                    qpVar5.j8 = false;
                                    TL_account.contentSettings contentsettings = qpVar5.m8;
                                    if (contentsettings != null && (set = qpVar5.C4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = qpVar5.e7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar5.C4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = qpVar5.k8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayList4.get(i12);
                                            i12++;
                                            ((c20) obj).a(qpVar5.m8);
                                        }
                                        qpVar5.k8.clear();
                                        qpVar5.k8 = null;
                                    }
                                    qpVar5.getNotificationCenter().k(qs.S3, new Object[0]);
                                    break;
                                default:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i13 = 0;
                                        while (true) {
                                            qp qpVar6 = qpVar4;
                                            if (i13 >= size2) {
                                                qpVar6.getUserConfig().x = true;
                                                qpVar6.getUserConfig().v(false);
                                                qpVar6.getNotificationCenter().k(2, 256);
                                                qpVar6.d2 = false;
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
                                                    qpVar6.getMessagesStorage().F1(j11, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar6.Q.f(j11);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            qpVar6.r2(j11, 0L, null);
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
                final qp qpVar5 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i11;
                        qp qpVar52 = qpVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList2 = qpVar52.V0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(qs.Q2, new Object[0]);
                                break;
                            case 2:
                                qpVar52.s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = qpVar52.s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                qpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.l8 = System.currentTimeMillis();
                                }
                                qpVar52.j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList4.get(i12);
                                        i12++;
                                        ((c20) obj).a(qpVar52.m8);
                                    }
                                    qpVar52.k8.clear();
                                    qpVar52.k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(qs.S3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i13 = 0;
                                    while (true) {
                                        qp qpVar6 = qpVar5;
                                        if (i13 >= size2) {
                                            qpVar6.getUserConfig().x = true;
                                            qpVar6.getUserConfig().v(false);
                                            qpVar6.getNotificationCenter().k(2, 256);
                                            qpVar6.d2 = false;
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
                                                qpVar6.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar6.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar6.r2(j11, 0L, null);
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
                qp qpVar6 = this.b;
                qpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (arrayList2.get(i12) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i12));
                        }
                    }
                    qpVar6.getMessagesController().Y3(arrayList3, false);
                    break;
                }
                break;
            case 8:
                qp qpVar7 = this.b;
                qpVar7.getClass();
                if (tLObject != null) {
                    qpVar7.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 9:
                qp qpVar8 = this.b;
                if (tL_error == null) {
                    qpVar8.getClass();
                    qpVar8.J2 = System.currentTimeMillis();
                    qpVar8.M2 = false;
                    qpVar8.L2 = 0;
                } else {
                    long j3 = qpVar8.J2;
                    if (j3 != 0) {
                        qpVar8.J2 = j3 + 5000;
                    }
                }
                qpVar8.K2 = 0;
                break;
            case 10:
                qp qpVar9 = this.b;
                if (tL_error == null) {
                    qpVar9.M2 = true;
                } else {
                    long j10 = qpVar9.J2;
                    if (j10 != 0) {
                        qpVar9.J2 = j10 + 5000;
                    }
                }
                qpVar9.K2 = 0;
                break;
            case 11:
                final int i13 = 2;
                final qp qpVar10 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i13;
                        qp qpVar52 = qpVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(qs.Q2, new Object[0]);
                                break;
                            case 2:
                                qpVar52.s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                qpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.l8 = System.currentTimeMillis();
                                }
                                qpVar52.j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList4.get(i122);
                                        i122++;
                                        ((c20) obj).a(qpVar52.m8);
                                    }
                                    qpVar52.k8.clear();
                                    qpVar52.k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(qs.S3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar10;
                                        if (i132 >= size2) {
                                            qpVar62.getUserConfig().x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
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
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
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
                qp qpVar11 = this.b;
                qpVar11.getClass();
                if (tLObject != null) {
                    qpVar11.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vj(qpVar11, 25));
                    break;
                }
                break;
            case 13:
                if (tLObject != null) {
                    qp qpVar12 = this.b;
                    qpVar12.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vj(qpVar12, 29));
                    break;
                }
                break;
            case 14:
                qp qpVar13 = this.b;
                qpVar13.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar13.M3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    break;
                }
                break;
            case 15:
                final int i14 = 6;
                final qp qpVar14 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i14;
                        qp qpVar52 = qpVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(qs.Q2, new Object[0]);
                                break;
                            case 2:
                                qpVar52.s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                qpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.l8 = System.currentTimeMillis();
                                }
                                qpVar52.j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList4.get(i122);
                                        i122++;
                                        ((c20) obj).a(qpVar52.m8);
                                    }
                                    qpVar52.k8.clear();
                                    qpVar52.k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(qs.S3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar14;
                                        if (i132 >= size2) {
                                            qpVar62.getUserConfig().x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
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
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
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
                qp qpVar15 = this.b;
                qpVar15.getClass();
                if (tLObject != null) {
                    qpVar15.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vj(qpVar15, 28));
                    break;
                }
                break;
            case 17:
                final int i15 = 0;
                final qp qpVar16 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i15;
                        qp qpVar52 = qpVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(qs.Q2, new Object[0]);
                                break;
                            case 2:
                                qpVar52.s2 = false;
                                SharedPreferences.Editor edit2 = qpVar52.d7.edit();
                                edit2.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit2.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                qpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.l8 = System.currentTimeMillis();
                                }
                                qpVar52.j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList4 = qpVar52.k8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList4.get(i122);
                                        i122++;
                                        ((c20) obj).a(qpVar52.m8);
                                    }
                                    qpVar52.k8.clear();
                                    qpVar52.k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(qs.S3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar16;
                                        if (i132 >= size2) {
                                            qpVar62.getUserConfig().x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
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
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
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
                boolean z9 = tLObject instanceof Vector;
                qp qpVar17 = this.b;
                if (z9) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i16 = 0; i16 < vector.objects.size(); i16++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i16));
                    }
                    yr messagesStorage = qpVar17.getMessagesStorage();
                    messagesStorage.a.c(new lg(messagesStorage, arrayList4, new sn(qpVar17, 10), 22));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z10 = qpVar17.A7;
                    boolean z11 = tL_messages_dialogFilters.tags_enabled;
                    if (z10 != z11) {
                        SharedPreferences.Editor edit = qpVar17.e7.edit();
                        qpVar17.A7 = z11;
                        edit.putBoolean("folderTags", z11).apply();
                        g0.h3(new sn(qpVar17, 11));
                    }
                    yr messagesStorage2 = qpVar17.getMessagesStorage();
                    messagesStorage2.a.c(new lg(messagesStorage2, tL_messages_dialogFilters.filters, new sn(qpVar17, 12), 22));
                    break;
                } else {
                    g0.h3(new sn(qpVar17, 13));
                    break;
                }
            case 19:
                if (tL_error == null) {
                    qp qpVar18 = this.b;
                    TLRPC.User a22 = qpVar18.a2(Long.valueOf(qpVar18.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = qpVar18.getUserConfig().f();
                        qpVar18.X3(a22, true, false);
                    } else {
                        qpVar18.getUserConfig().w(a22);
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
                        qpVar18.U0(a22.id).f();
                        qpVar18.U0(a22.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(a22);
                        qpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        g0.h3(new vj(qpVar18, 0));
                        break;
                    }
                }
                break;
            case 20:
                this.b.getConnectionsManager().cleanup(false);
                g0.h3(new a(tLObject, 23));
                break;
            case 21:
                qp qpVar19 = this.b;
                qpVar19.getClass();
                if (tL_error == null) {
                    qpVar19.O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final int i17 = 1;
                    final qp qpVar20 = this.b;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.nl
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i17) {
                                case 0:
                                    qp qpVar21 = qpVar20;
                                    qpVar21.c8 = false;
                                    qpVar21.r4 = gp.c(1, tL_help_peerColors);
                                    qpVar21.e7.edit().putString("profilePeerColors", qpVar21.r4.toString()).apply();
                                    break;
                                default:
                                    qp qpVar22 = qpVar20;
                                    qpVar22.b8 = false;
                                    qpVar22.q4 = gp.c(0, tL_help_peerColors);
                                    qpVar22.e7.edit().putString("peerColors", qpVar22.q4.toString()).apply();
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
                    final qp qpVar21 = this.b;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.nl
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    qp qpVar212 = qpVar21;
                                    qpVar212.c8 = false;
                                    qpVar212.r4 = gp.c(1, tL_help_peerColors2);
                                    qpVar212.e7.edit().putString("profilePeerColors", qpVar212.r4.toString()).apply();
                                    break;
                                default:
                                    qp qpVar22 = qpVar21;
                                    qpVar22.b8 = false;
                                    qpVar22.q4 = gp.c(0, tL_help_peerColors2);
                                    qpVar22.e7.edit().putString("peerColors", qpVar22.q4.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 24:
                qp qpVar22 = this.b;
                qpVar22.h2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    qpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    qpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    qpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    qpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i19 = 0; i19 < 3; i19++) {
                        qpVar22.P3(i19, 2);
                    }
                    yr messagesStorage3 = qpVar22.getMessagesStorage();
                    yr messagesStorage4 = qpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i20 = messagesStorage4.w;
                    yr messagesStorage5 = qpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i21 = messagesStorage5.r;
                    yr messagesStorage6 = qpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i22 = messagesStorage6.n;
                    yr messagesStorage7 = qpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i20, i21, i22, messagesStorage7.s);
                    break;
                } else if (tL_error.code != 401) {
                    qpVar22.h2 = true;
                    qpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new rj(qpVar22, 24));
                    break;
                }
                break;
            case 25:
                final int i23 = 5;
                final qp qpVar23 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i23;
                        qp qpVar52 = qpVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(qs.Q2, new Object[0]);
                                break;
                            case 2:
                                qpVar52.s2 = false;
                                SharedPreferences.Editor edit22 = qpVar52.d7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                qpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.l8 = System.currentTimeMillis();
                                }
                                qpVar52.j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList42 = qpVar52.k8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((c20) obj).a(qpVar52.m8);
                                    }
                                    qpVar52.k8.clear();
                                    qpVar52.k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(qs.S3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar23;
                                        if (i132 >= size2) {
                                            qpVar62.getUserConfig().x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
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
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
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
                final qp qpVar24 = this.b;
                qpVar24.getClass();
                final int i24 = 1;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i112 = i24;
                        qp qpVar52 = qpVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    qpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                qpVar52.T0 = false;
                                ArrayList arrayList22 = qpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                qpVar52.getNotificationCenter().k(qs.Q2, new Object[0]);
                                break;
                            case 2:
                                qpVar52.s2 = false;
                                SharedPreferences.Editor edit22 = qpVar52.d7.edit();
                                edit22.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit22.commit();
                                qpVar52.getUserConfig().T = true;
                                qpVar52.getUserConfig().v(false);
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                qpVar52.Y3(tL_help_recentMeUrls.users, false);
                                qpVar52.S3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = qpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                qpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                qpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit3 = qpVar52.d7.edit();
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
                                    qpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                                    edit3.apply();
                                }
                                if (qpVar52.r2 == 0) {
                                    qpVar52.getUserConfig().S = true;
                                    qpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 5:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    qpVar52.m8 = (TL_account.contentSettings) tLObject2;
                                    qpVar52.l8 = System.currentTimeMillis();
                                }
                                qpVar52.j8 = false;
                                TL_account.contentSettings contentsettings = qpVar52.m8;
                                if (contentsettings != null && (set = qpVar52.C4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = qpVar52.e7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", qpVar52.C4).apply();
                                    }
                                }
                                ArrayList arrayList42 = qpVar52.k8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i122 = 0;
                                    while (i122 < size) {
                                        Object obj = arrayList42.get(i122);
                                        i122++;
                                        ((c20) obj).a(qpVar52.m8);
                                    }
                                    qpVar52.k8.clear();
                                    qpVar52.k8 = null;
                                }
                                qpVar52.getNotificationCenter().k(qs.S3, new Object[0]);
                                break;
                            default:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i132 = 0;
                                    while (true) {
                                        qp qpVar62 = qpVar24;
                                        if (i132 >= size2) {
                                            qpVar62.getUserConfig().x = true;
                                            qpVar62.getUserConfig().v(false);
                                            qpVar62.getNotificationCenter().k(2, 256);
                                            qpVar62.d2 = false;
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
                                                qpVar62.getMessagesStorage().F1(j11, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar62.Q.f(j11);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        qpVar62.r2(j11, 0L, null);
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
