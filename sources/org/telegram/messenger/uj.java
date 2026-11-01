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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ uj(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                ConcurrentHashMap concurrentHashMap = wpVar.P;
                ConcurrentHashMap concurrentHashMap2 = wpVar.O;
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
                        wpVar.K3(arrayList, null, null, false, 0);
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
                wp wpVar2 = this.b;
                wpVar2.getClass();
                if (tLObject != null) {
                    wpVar2.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 3:
                wp wpVar3 = this.b;
                wpVar3.E2 = false;
                if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
                    wpVar3.F2 = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
                } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
                    TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
                    wpVar3.F2 = tL_help_termsOfServiceUpdate.expires;
                    i0.g3(new pi(14, wpVar3, tL_help_termsOfServiceUpdate));
                } else {
                    wpVar3.F2 = wpVar3.getConnectionsManager().getCurrentTime() + 3600;
                }
                wpVar3.e7.edit().putInt("nextTosCheckTime", wpVar3.F2).commit();
                break;
            case 4:
                if (tL_error == null) {
                    final int i11 = 3;
                    final wp wpVar4 = this.b;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set;
                            int i12 = i11;
                            wp wpVar5 = wpVar4;
                            TLObject tLObject2 = tLObject;
                            switch (i12) {
                                case 0:
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit = wpVar5.e7.edit();
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
                                        wpVar5.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                        edit.apply();
                                        wpVar5.getNotificationCenter().k(42, new Object[0]);
                                        break;
                                    }
                                    break;
                                case 1:
                                    wpVar5.T0 = false;
                                    ArrayList arrayList2 = wpVar5.V0;
                                    arrayList2.clear();
                                    if (tLObject2 instanceof Vector) {
                                        arrayList2.addAll(((Vector) tLObject2).objects);
                                    }
                                    wpVar5.getNotificationCenter().k(at.Q2, new Object[0]);
                                    break;
                                case 2:
                                    wpVar5.r2--;
                                    if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                        TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                        SharedPreferences.Editor edit2 = wpVar5.e7.edit();
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
                                        wpVar5.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                        edit2.apply();
                                    }
                                    if (wpVar5.r2 == 0) {
                                        wpVar5.getUserConfig().S = true;
                                        wpVar5.getUserConfig().v(false);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                    wpVar5.V3(tL_help_recentMeUrls.users, false);
                                    wpVar5.P3(tL_help_recentMeUrls.chats, false);
                                    ArrayList arrayList3 = wpVar5.s;
                                    arrayList3.clear();
                                    arrayList3.addAll(tL_help_recentMeUrls.urls);
                                    wpVar5.getNotificationCenter().k(3, new Object[0]);
                                    break;
                                case 4:
                                    if (tLObject2 instanceof TL_account.contentSettings) {
                                        wpVar5.n8 = (TL_account.contentSettings) tLObject2;
                                        wpVar5.m8 = System.currentTimeMillis();
                                    }
                                    wpVar5.k8 = false;
                                    TL_account.contentSettings contentsettings = wpVar5.n8;
                                    if (contentsettings != null && (set = wpVar5.D4) != null) {
                                        if (contentsettings.sensitive_enabled) {
                                            set.add("sensitive");
                                        } else {
                                            set.remove("sensitive");
                                        }
                                        SharedPreferences sharedPreferences = wpVar5.f7;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar5.D4).apply();
                                        }
                                    }
                                    ArrayList arrayList4 = wpVar5.l8;
                                    if (arrayList4 != null) {
                                        int size = arrayList4.size();
                                        int i13 = 0;
                                        while (i13 < size) {
                                            Object obj = arrayList4.get(i13);
                                            i13++;
                                            ((r20) obj).a(wpVar5.n8);
                                        }
                                        wpVar5.l8.clear();
                                        wpVar5.l8 = null;
                                    }
                                    wpVar5.getNotificationCenter().k(at.S3, new Object[0]);
                                    break;
                                case 5:
                                    if (tLObject2 instanceof Vector) {
                                        Vector vector = (Vector) tLObject2;
                                        int size2 = vector.objects.size();
                                        int i14 = 0;
                                        while (true) {
                                            wp wpVar6 = wpVar4;
                                            if (i14 >= size2) {
                                                wpVar6.getUserConfig().x = true;
                                                wpVar6.getUserConfig().v(false);
                                                wpVar6.getNotificationCenter().k(2, 256);
                                                wpVar6.d2 = false;
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
                                                    wpVar6.getMessagesStorage().F1(j12, true);
                                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar6.Q.f(j12);
                                                    if (dialog2 != null && !dialog2.unread_mark) {
                                                        dialog2.unread_mark = true;
                                                        if (dialog2.unread_count == 0) {
                                                            wpVar6.q2(j12, 0L, null);
                                                        }
                                                    }
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    wpVar5.s2 = false;
                                    SharedPreferences.Editor edit3 = wpVar5.e7.edit();
                                    edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                    edit3.commit();
                                    wpVar5.getUserConfig().T = true;
                                    wpVar5.getUserConfig().v(false);
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
                final wp wpVar5 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i12;
                        wp wpVar52 = wpVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList2 = wpVar52.V0;
                                arrayList2.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList2.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(at.Q2, new Object[0]);
                                break;
                            case 2:
                                wpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList3 = wpVar52.s;
                                arrayList3.clear();
                                arrayList3.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.m8 = System.currentTimeMillis();
                                }
                                wpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList4.get(i13);
                                        i13++;
                                        ((r20) obj).a(wpVar52.n8);
                                    }
                                    wpVar52.l8.clear();
                                    wpVar52.l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(at.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i14 = 0;
                                    while (true) {
                                        wp wpVar6 = wpVar5;
                                        if (i14 >= size2) {
                                            wpVar6.getUserConfig().x = true;
                                            wpVar6.getUserConfig().v(false);
                                            wpVar6.getNotificationCenter().k(2, 256);
                                            wpVar6.d2 = false;
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
                                                wpVar6.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar6.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar6.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i14++;
                                        }
                                    }
                                }
                                break;
                            default:
                                wpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 7:
                wp wpVar6 = this.b;
                wpVar6.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        if (arrayList2.get(i13) instanceof TLRPC.User) {
                            arrayList3.add((TLRPC.User) arrayList2.get(i13));
                        }
                    }
                    wpVar6.getMessagesController().V3(arrayList3, false);
                    break;
                }
                break;
            case 8:
                wp wpVar7 = this.b;
                wpVar7.getClass();
                if (tLObject != null) {
                    wpVar7.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 9:
                wp wpVar8 = this.b;
                if (tL_error == null) {
                    wpVar8.getClass();
                    wpVar8.J2 = System.currentTimeMillis();
                    wpVar8.M2 = false;
                    wpVar8.L2 = 0;
                } else {
                    long j10 = wpVar8.J2;
                    if (j10 != 0) {
                        wpVar8.J2 = j10 + 5000;
                    }
                }
                wpVar8.K2 = 0;
                break;
            case 10:
                wp wpVar9 = this.b;
                if (tL_error == null) {
                    wpVar9.M2 = true;
                } else {
                    long j11 = wpVar9.J2;
                    if (j11 != 0) {
                        wpVar9.J2 = j11 + 5000;
                    }
                }
                wpVar9.K2 = 0;
                break;
            case 11:
                final int i14 = 6;
                final wp wpVar10 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i14;
                        wp wpVar52 = wpVar10;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(at.Q2, new Object[0]);
                                break;
                            case 2:
                                wpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.m8 = System.currentTimeMillis();
                                }
                                wpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList4.get(i132);
                                        i132++;
                                        ((r20) obj).a(wpVar52.n8);
                                    }
                                    wpVar52.l8.clear();
                                    wpVar52.l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(at.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar10;
                                        if (i142 >= size2) {
                                            wpVar62.getUserConfig().x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.d2 = false;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                wpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 12:
                wp wpVar11 = this.b;
                wpVar11.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages3 = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar11.J3(tL_messages_affectedMessages3.pts, -1, tL_messages_affectedMessages3.pts_count);
                    break;
                }
                break;
            case 13:
                wp wpVar12 = this.b;
                wpVar12.getClass();
                if (tLObject != null) {
                    wpVar12.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ak(wpVar12, 23));
                    break;
                }
                break;
            case 14:
                if (tLObject != null) {
                    wp wpVar13 = this.b;
                    wpVar13.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ak(wpVar13, 28));
                    break;
                }
                break;
            case 15:
                final int i15 = 5;
                final wp wpVar14 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i15;
                        wp wpVar52 = wpVar14;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(at.Q2, new Object[0]);
                                break;
                            case 2:
                                wpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.m8 = System.currentTimeMillis();
                                }
                                wpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList4.get(i132);
                                        i132++;
                                        ((r20) obj).a(wpVar52.n8);
                                    }
                                    wpVar52.l8.clear();
                                    wpVar52.l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(at.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar14;
                                        if (i142 >= size2) {
                                            wpVar62.getUserConfig().x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.d2 = false;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                wpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 16:
                wp wpVar15 = this.b;
                wpVar15.getClass();
                if (tLObject != null) {
                    wpVar15.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ak(wpVar15, 27));
                    break;
                }
                break;
            case 17:
                final int i16 = 0;
                final wp wpVar16 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i16;
                        wp wpVar52 = wpVar16;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                                    edit.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(at.Q2, new Object[0]);
                                break;
                            case 2:
                                wpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                }
                                if (wpVar52.r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.m8 = System.currentTimeMillis();
                                }
                                wpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList4 = wpVar52.l8;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList4.get(i132);
                                        i132++;
                                        ((r20) obj).a(wpVar52.n8);
                                    }
                                    wpVar52.l8.clear();
                                    wpVar52.l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(at.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    int size2 = vector.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar16;
                                        if (i142 >= size2) {
                                            wpVar62.getUserConfig().x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.d2 = false;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                wpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            case 18:
                boolean z10 = tLObject instanceof Vector;
                wp wpVar17 = this.b;
                if (z10) {
                    ArrayList arrayList4 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i17 = 0; i17 < vector.objects.size(); i17++) {
                        arrayList4.add((TLRPC.DialogFilter) vector.objects.get(i17));
                    }
                    is messagesStorage = wpVar17.getMessagesStorage();
                    messagesStorage.a.c(new lg(messagesStorage, arrayList4, new fo(wpVar17, 10), 22));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
                    TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
                    boolean z11 = wpVar17.B7;
                    boolean z12 = tL_messages_dialogFilters.tags_enabled;
                    if (z11 != z12) {
                        SharedPreferences.Editor edit = wpVar17.f7.edit();
                        wpVar17.B7 = z12;
                        edit.putBoolean("folderTags", z12).apply();
                        i0.g3(new fo(wpVar17, 11));
                    }
                    is messagesStorage2 = wpVar17.getMessagesStorage();
                    messagesStorage2.a.c(new lg(messagesStorage2, tL_messages_dialogFilters.filters, new fo(wpVar17, 12), 22));
                    break;
                } else {
                    i0.g3(new fo(wpVar17, 13));
                    break;
                }
            case 19:
                if (tL_error == null) {
                    wp wpVar18 = this.b;
                    TLRPC.User Z1 = wpVar18.Z1(Long.valueOf(wpVar18.getUserConfig().e()));
                    if (Z1 == null) {
                        Z1 = wpVar18.getUserConfig().f();
                        wpVar18.U3(Z1, true, false);
                    } else {
                        wpVar18.getUserConfig().w(Z1);
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
                        wpVar18.T0(Z1.id).e();
                        wpVar18.T0(Z1.id).a(0, 80);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(Z1);
                        wpVar18.getMessagesStorage().m1(arrayList6, null, false, true);
                        i0.g3(new ak(wpVar18, 1));
                        break;
                    }
                }
                break;
            case 20:
                this.b.getConnectionsManager().cleanup(false);
                i0.g3(new a(tLObject, 22));
                break;
            case 21:
                wp wpVar19 = this.b;
                wpVar19.getClass();
                if (tL_error == null) {
                    wpVar19.L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 22:
                if (tLObject instanceof TLRPC.TL_help_peerColors) {
                    final TLRPC.TL_help_peerColors tL_help_peerColors = (TLRPC.TL_help_peerColors) tLObject;
                    final int i18 = 0;
                    final wp wpVar20 = this.b;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.gm
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    wp wpVar21 = wpVar20;
                                    wpVar21.c8 = false;
                                    wpVar21.r4 = mp.c(0, tL_help_peerColors);
                                    wpVar21.f7.edit().putString("peerColors", wpVar21.r4.toString()).apply();
                                    break;
                                default:
                                    wp wpVar22 = wpVar20;
                                    wpVar22.d8 = false;
                                    wpVar22.s4 = mp.c(1, tL_help_peerColors);
                                    wpVar22.f7.edit().putString("profilePeerColors", wpVar22.s4.toString()).apply();
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
                    final wp wpVar21 = this.b;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.gm
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    wp wpVar212 = wpVar21;
                                    wpVar212.c8 = false;
                                    wpVar212.r4 = mp.c(0, tL_help_peerColors2);
                                    wpVar212.f7.edit().putString("peerColors", wpVar212.r4.toString()).apply();
                                    break;
                                default:
                                    wp wpVar22 = wpVar21;
                                    wpVar22.d8 = false;
                                    wpVar22.s4 = mp.c(1, tL_help_peerColors2);
                                    wpVar22.f7.edit().putString("profilePeerColors", wpVar22.s4.toString()).apply();
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 24:
                wp wpVar22 = this.b;
                wpVar22.h2 = false;
                if (tL_error == null) {
                    TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
                    wpVar22.getMessagesStorage().H1(tL_updates_state.date);
                    wpVar22.getMessagesStorage().I1(tL_updates_state.pts);
                    wpVar22.getMessagesStorage().K1(tL_updates_state.seq);
                    wpVar22.getMessagesStorage().J1(tL_updates_state.qts);
                    for (int i20 = 0; i20 < 3; i20++) {
                        wpVar22.M3(i20, 2);
                    }
                    is messagesStorage3 = wpVar22.getMessagesStorage();
                    is messagesStorage4 = wpVar22.getMessagesStorage();
                    messagesStorage4.H();
                    int i21 = messagesStorage4.w;
                    is messagesStorage5 = wpVar22.getMessagesStorage();
                    messagesStorage5.H();
                    int i22 = messagesStorage5.r;
                    is messagesStorage6 = wpVar22.getMessagesStorage();
                    messagesStorage6.H();
                    int i23 = messagesStorage6.n;
                    is messagesStorage7 = wpVar22.getMessagesStorage();
                    messagesStorage7.H();
                    messagesStorage3.A1(i21, i22, i23, messagesStorage7.s);
                    break;
                } else if (tL_error.code != 401) {
                    wpVar22.h2 = true;
                    wpVar22.getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new uj(wpVar22, 24));
                    break;
                }
                break;
            case 25:
                final wp wpVar23 = this.b;
                wpVar23.getClass();
                final int i24 = 1;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i24;
                        wp wpVar52 = wpVar23;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(at.Q2, new Object[0]);
                                break;
                            case 2:
                                wpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (wpVar52.r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.m8 = System.currentTimeMillis();
                                }
                                wpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = wpVar52.l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList42.get(i132);
                                        i132++;
                                        ((r20) obj).a(wpVar52.n8);
                                    }
                                    wpVar52.l8.clear();
                                    wpVar52.l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(at.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar23;
                                        if (i142 >= size2) {
                                            wpVar62.getUserConfig().x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.d2 = false;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                wpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i25 = 4;
                final wp wpVar24 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set set;
                        int i122 = i25;
                        wp wpVar52 = wpVar24;
                        TLObject tLObject2 = tLObject;
                        switch (i122) {
                            case 0:
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit2 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                                    edit2.apply();
                                    wpVar52.getNotificationCenter().k(42, new Object[0]);
                                    break;
                                }
                                break;
                            case 1:
                                wpVar52.T0 = false;
                                ArrayList arrayList22 = wpVar52.V0;
                                arrayList22.clear();
                                if (tLObject2 instanceof Vector) {
                                    arrayList22.addAll(((Vector) tLObject2).objects);
                                }
                                wpVar52.getNotificationCenter().k(at.Q2, new Object[0]);
                                break;
                            case 2:
                                wpVar52.r2--;
                                if (tLObject2 instanceof TL_account.TL_reactionsNotifySettings) {
                                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject2;
                                    SharedPreferences.Editor edit22 = wpVar52.e7.edit();
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
                                    wpVar52.getNotificationsController().g0.a(tL_reactionsNotifySettings2.sound, edit22, 0L, 0L, 4);
                                    edit22.apply();
                                }
                                if (wpVar52.r2 == 0) {
                                    wpVar52.getUserConfig().S = true;
                                    wpVar52.getUserConfig().v(false);
                                    break;
                                }
                                break;
                            case 3:
                                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject2;
                                wpVar52.V3(tL_help_recentMeUrls.users, false);
                                wpVar52.P3(tL_help_recentMeUrls.chats, false);
                                ArrayList arrayList32 = wpVar52.s;
                                arrayList32.clear();
                                arrayList32.addAll(tL_help_recentMeUrls.urls);
                                wpVar52.getNotificationCenter().k(3, new Object[0]);
                                break;
                            case 4:
                                if (tLObject2 instanceof TL_account.contentSettings) {
                                    wpVar52.n8 = (TL_account.contentSettings) tLObject2;
                                    wpVar52.m8 = System.currentTimeMillis();
                                }
                                wpVar52.k8 = false;
                                TL_account.contentSettings contentsettings = wpVar52.n8;
                                if (contentsettings != null && (set = wpVar52.D4) != null) {
                                    if (contentsettings.sensitive_enabled) {
                                        set.add("sensitive");
                                    } else {
                                        set.remove("sensitive");
                                    }
                                    SharedPreferences sharedPreferences = wpVar52.f7;
                                    if (sharedPreferences != null) {
                                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", wpVar52.D4).apply();
                                    }
                                }
                                ArrayList arrayList42 = wpVar52.l8;
                                if (arrayList42 != null) {
                                    int size = arrayList42.size();
                                    int i132 = 0;
                                    while (i132 < size) {
                                        Object obj = arrayList42.get(i132);
                                        i132++;
                                        ((r20) obj).a(wpVar52.n8);
                                    }
                                    wpVar52.l8.clear();
                                    wpVar52.l8 = null;
                                }
                                wpVar52.getNotificationCenter().k(at.S3, new Object[0]);
                                break;
                            case 5:
                                if (tLObject2 instanceof Vector) {
                                    Vector vector2 = (Vector) tLObject2;
                                    int size2 = vector2.objects.size();
                                    int i142 = 0;
                                    while (true) {
                                        wp wpVar62 = wpVar24;
                                        if (i142 >= size2) {
                                            wpVar62.getUserConfig().x = true;
                                            wpVar62.getUserConfig().v(false);
                                            wpVar62.getNotificationCenter().k(2, 256);
                                            wpVar62.d2 = false;
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
                                                wpVar62.getMessagesStorage().F1(j12, true);
                                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar62.Q.f(j12);
                                                if (dialog2 != null && !dialog2.unread_mark) {
                                                    dialog2.unread_mark = true;
                                                    if (dialog2.unread_count == 0) {
                                                        wpVar62.q2(j12, 0L, null);
                                                    }
                                                }
                                            }
                                            i142++;
                                        }
                                    }
                                }
                                break;
                            default:
                                wpVar52.s2 = false;
                                SharedPreferences.Editor edit3 = wpVar52.e7.edit();
                                edit3.putBoolean("EnableContactJoined", tLObject2 instanceof TLRPC.TL_boolFalse);
                                edit3.commit();
                                wpVar52.getUserConfig().T = true;
                                wpVar52.getUserConfig().v(false);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
