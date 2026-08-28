package org.telegram.messenger;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.y01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bq;
import org.telegram.ui.da0;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ j8(MediaDataController mediaDataController, Timer.Task task, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i9, Timer timer, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.e = mediaDataController;
        this.f = task;
        this.h = hVar;
        this.s = atomicInteger;
        this.v = runnable;
        this.c = i9;
        this.w = timer;
        this.n = hVar2;
        this.r = hVar3;
        this.b = z10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i9 = this.a;
        Object obj = this.w;
        Object obj2 = this.v;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.n;
        Object obj6 = this.h;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i9) {
            case 0:
                ((MediaDataController) obj8).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj7, (a0.h) obj6, (AtomicInteger) obj3, (Runnable) obj2, this.c, (Timer) obj, (a0.h) obj5, (a0.h) obj4, this.b, this.d);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                dy dyVar = (dy) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.x1;
                if (str != null) {
                    String[] split = str.split("\\+| ");
                    tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                    for (String str4 : split) {
                        str4.getClass();
                        switch (str4) {
                            case "ban_users":
                            case "restrict_members":
                                tL_chatAdminRights.ban_users = true;
                                break;
                            case "anonymous":
                                tL_chatAdminRights.anonymous = true;
                                break;
                            case "change_info":
                                tL_chatAdminRights.change_info = true;
                                break;
                            case "delete_messages":
                                tL_chatAdminRights.delete_messages = true;
                                break;
                            case "edit_messages":
                                tL_chatAdminRights.edit_messages = true;
                                break;
                            case "manage_call":
                            case "manage_video_chats":
                                tL_chatAdminRights.manage_call = true;
                                break;
                            case "manage_chat":
                            case "other":
                                tL_chatAdminRights.other = true;
                                break;
                            case "manage_topics":
                            case "manage_topic":
                                tL_chatAdminRights.manage_topics = true;
                                break;
                            case "promote_members":
                            case "add_admins":
                                tL_chatAdminRights.add_admins = true;
                                break;
                            case "invite_users":
                                tL_chatAdminRights.invite_users = true;
                                break;
                            case "post_messages":
                                tL_chatAdminRights.post_messages = true;
                                break;
                            case "pin_messages":
                                tL_chatAdminRights.pin_messages = true;
                                break;
                        }
                    }
                } else {
                    tL_chatAdminRights = null;
                }
                if (tL_chatAdminRights == null && tL_chatAdminRights2 == null) {
                    tL_chatAdminRights2 = null;
                } else if (tL_chatAdminRights != null) {
                    if (tL_chatAdminRights2 == null) {
                        tL_chatAdminRights2 = tL_chatAdminRights;
                    } else {
                        tL_chatAdminRights2.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights2.change_info;
                        tL_chatAdminRights2.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights2.post_messages;
                        tL_chatAdminRights2.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights2.edit_messages;
                        tL_chatAdminRights2.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights2.add_admins;
                        tL_chatAdminRights2.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights2.delete_messages;
                        tL_chatAdminRights2.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights2.ban_users;
                        tL_chatAdminRights2.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights2.invite_users;
                        tL_chatAdminRights2.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights2.pin_messages;
                        tL_chatAdminRights2.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights2.manage_call;
                        tL_chatAdminRights2.anonymous = tL_chatAdminRights.anonymous || tL_chatAdminRights2.anonymous;
                        tL_chatAdminRights2.other = tL_chatAdminRights.other || tL_chatAdminRights2.other;
                    }
                }
                boolean z10 = this.b;
                int i10 = this.c;
                if (!z10 || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    bq bqVar = new bq(user.id, -this.d, tL_chatAdminRights2, null, null, str3, 2, true, !z10, str2);
                    bqVar.T0 = new da0(dyVar, i10);
                    ((ActionBarLayout) launchActivity.O()).Q(bqVar, false);
                    break;
                } else {
                    MessagesController.getInstance(launchActivity.K).addUserToChat(chat.id, user, 0, str2, dyVar, true, new y01(launchActivity, i10, chat, dyVar, 3), null);
                    break;
                }
        }
    }

    public /* synthetic */ j8(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i9, TLRPC.Chat chat, dy dyVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.h = tL_chatAdminRights;
        this.b = z10;
        this.n = str2;
        this.c = i9;
        this.r = chat;
        this.s = dyVar;
        this.v = user;
        this.d = j10;
        this.w = str3;
    }
}
