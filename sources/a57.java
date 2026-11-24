// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ a57(na7 na7Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        byte b = this.a;
        na7 na7Var = this.b;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                na7Var.K0 = false;
                ArrayList arrayList = na7Var.M0;
                arrayList.clear();
                if (tLObject instanceof Vector) {
                    arrayList.addAll(((Vector) tLObject).objects);
                }
                na7Var.getNotificationCenter().k(kk7.R2, new Object[0]);
                break;
            case 1:
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit = na7Var.W3.edit();
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
                    na7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings.sound, edit, 0L, 0L, 4);
                    edit.apply();
                    na7Var.getNotificationCenter().k(42, new Object[0]);
                    break;
                }
                break;
            case 2:
                na7Var.l2 = false;
                SharedPreferences.Editor edit2 = na7Var.W3.edit();
                edit2.putBoolean("EnableContactJoined", tLObject instanceof TLRPC.TL_boolFalse);
                edit2.commit();
                na7Var.getUserConfig().U = true;
                na7Var.getUserConfig().u(false);
                break;
            case 3:
                na7Var.k2--;
                if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
                    TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = (TL_account.TL_reactionsNotifySettings) tLObject;
                    SharedPreferences.Editor edit3 = na7Var.W3.edit();
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
                    na7Var.getNotificationsController().h0.a(tL_reactionsNotifySettings2.sound, edit3, 0L, 0L, 4);
                    edit3.apply();
                }
                if (na7Var.k2 == 0) {
                    na7Var.getUserConfig().T = true;
                    na7Var.getUserConfig().u(false);
                    break;
                }
                break;
            case 4:
                if (tLObject instanceof TL_account.contentSettings) {
                    na7Var.a5 = (TL_account.contentSettings) tLObject;
                    na7Var.Z4 = System.currentTimeMillis();
                }
                na7Var.X4 = false;
                TL_account.contentSettings contentsettings = na7Var.a5;
                if (contentsettings != null && (set = na7Var.K3) != null) {
                    if (contentsettings.sensitive_enabled) {
                        set.add("sensitive");
                    } else {
                        set.remove("sensitive");
                    }
                    SharedPreferences sharedPreferences = na7Var.X3;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", na7Var.K3).apply();
                    }
                }
                ArrayList arrayList2 = na7Var.Y4;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        ((p8c) obj).a(na7Var.a5);
                    }
                    na7Var.Y4.clear();
                    na7Var.Y4 = null;
                }
                na7Var.getNotificationCenter().k(kk7.U3, new Object[0]);
                break;
            case 5:
                TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject;
                na7Var.b4(tL_help_recentMeUrls.users, false);
                na7Var.V3(tL_help_recentMeUrls.chats, false);
                ArrayList arrayList3 = na7Var.s;
                arrayList3.clear();
                arrayList3.addAll(tL_help_recentMeUrls.urls);
                na7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            case 6:
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size2 = vector.objects.size();
                    int i2 = 0;
                    while (true) {
                        na7 na7Var2 = this.b;
                        if (i2 >= size2) {
                            na7Var2.getUserConfig().x = true;
                            na7Var2.getUserConfig().u(false);
                            na7Var2.getNotificationCenter().k(2, 256);
                            na7Var2.W1 = false;
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
                                na7Var2.getMessagesStorage().C1(j3, true);
                                TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var2.R.f(j3);
                                if (dialog != null && !dialog.unread_mark) {
                                    dialog.unread_mark = true;
                                    if (dialog.unread_count == 0) {
                                        na7Var2.n2(j3, 0L, null);
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                break;
            default:
                na7Var.R3((TLRPC.Updates) tLObject, false);
                break;
        }
    }
}
