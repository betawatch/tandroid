// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class c87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ c87(uc7 uc7Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        byte b = this.a;
        uc7 uc7Var = this.b;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                uc7Var.l2 = false;
                SharedPreferences.Editor edit = uc7Var.W3.edit();
                edit.putBoolean("EnableContactJoined", tLObject instanceof TLRPC.TL_boolFalse);
                edit.commit();
                uc7Var.getUserConfig().U = true;
                uc7Var.getUserConfig().u(false);
                break;
            case 1:
                if (tLObject instanceof TL_account.contentSettings) {
                    uc7Var.b5 = (TL_account.contentSettings) tLObject;
                    uc7Var.a5 = System.currentTimeMillis();
                }
                uc7Var.Y4 = false;
                TL_account.contentSettings contentsettings = uc7Var.b5;
                if (contentsettings != null && (set = uc7Var.K3) != null) {
                    if (contentsettings.sensitive_enabled) {
                        set.add("sensitive");
                    } else {
                        set.remove("sensitive");
                    }
                    SharedPreferences sharedPreferences = uc7Var.X3;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", uc7Var.K3).apply();
                    }
                }
                ArrayList arrayList = uc7Var.Z4;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((pcc) obj).a(uc7Var.b5);
                    }
                    uc7Var.Z4.clear();
                    uc7Var.Z4 = null;
                }
                uc7Var.getNotificationCenter().k(jn7.V3, new Object[0]);
                break;
            case 2:
                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject;
                uc7Var.j4(tL_help_recentMeUrls.users, false);
                uc7Var.c4(tL_help_recentMeUrls.chats, false);
                ArrayList arrayList2 = uc7Var.s;
                arrayList2.clear();
                arrayList2.addAll(tL_help_recentMeUrls.urls);
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            case 3:
                uc7Var.k2--;
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit2 = uc7Var.W3.edit();
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
                    uc7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit2, 0L, 0L, 4);
                    edit2.apply();
                }
                if (uc7Var.k2 == 0) {
                    uc7Var.getUserConfig().T = true;
                    uc7Var.getUserConfig().u(false);
                    break;
                }
                break;
            case 4:
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size2 = vector.objects.size();
                    int i2 = 0;
                    while (true) {
                        uc7 uc7Var2 = this.b;
                        if (i2 >= size2) {
                            uc7Var2.getUserConfig().x = true;
                            uc7Var2.getUserConfig().u(false);
                            uc7Var2.getNotificationCenter().k(2, 256);
                            uc7Var2.W1 = false;
                            break;
                        } else {
                            TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i2);
                            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                                TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                                long j = peer.user_id;
                                if (j == 0) {
                                    long j2 = peer.chat_id;
                                    j = j2 != 0 ? -j2 : -peer.channel_id;
                                }
                                long j3 = j;
                                uc7Var2.getMessagesStorage().C1(j3, true);
                                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7Var2.R.f(j3);
                                if (dialog != null && !dialog.unread_mark) {
                                    dialog.unread_mark = true;
                                    if (dialog.unread_count == 0) {
                                        uc7Var2.p2(j3, 0L, null);
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                break;
            case 5:
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit3 = uc7Var.W3.edit();
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
                    uc7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                    edit3.apply();
                    uc7Var.getNotificationCenter().k(43, new Object[0]);
                    break;
                }
                break;
            case 6:
                uc7Var.K0 = false;
                ArrayList arrayList3 = uc7Var.M0;
                arrayList3.clear();
                if (tLObject instanceof Vector) {
                    arrayList3.addAll(((Vector) tLObject).objects);
                }
                uc7Var.getNotificationCenter().k(jn7.S2, new Object[0]);
                break;
            default:
                uc7Var.Y3((TLRPC.Updates) tLObject, false);
                break;
        }
    }
}
