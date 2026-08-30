package org.telegram.messenger;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ct;
import org.telegram.ui.jq;
import org.telegram.ui.oa0;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class p8 implements Runnable {
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

    public /* synthetic */ p8(MediaDataController mediaDataController, Timer.Task task, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, Timer timer, a0.h hVar2, a0.h hVar3, boolean z4, long j10) {
        this.e = mediaDataController;
        this.f = task;
        this.h = hVar;
        this.s = atomicInteger;
        this.v = runnable;
        this.c = i10;
        this.w = timer;
        this.n = hVar2;
        this.r = hVar3;
        this.b = z4;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.a;
        Object obj = this.w;
        Object obj2 = this.v;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.n;
        Object obj6 = this.h;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i10) {
            case 0:
                ((MediaDataController) obj8).lambda$loadReplyMessagesForMessages$177((Timer.Task) obj7, (a0.h) obj6, (AtomicInteger) obj3, (Runnable) obj2, this.c, (Timer) obj, (a0.h) obj5, (a0.h) obj4, this.b, this.d);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                String str = (String) obj7;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = (TLRPC.TL_chatAdminRights) obj6;
                String str2 = (String) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                oy oyVar = (oy) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj;
                Pattern pattern = LaunchActivity.y1;
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
                boolean z4 = this.b;
                int i11 = this.c;
                if (!z4 || tL_chatAdminRights != null || TextUtils.isEmpty(str2)) {
                    jq jqVar = new jq(user.id, -this.d, tL_chatAdminRights2, null, null, str3, 2, true, !z4, str2);
                    jqVar.U0 = new oa0(oyVar, i11);
                    ((ActionBarLayout) launchActivity.O()).Q(jqVar, false);
                    break;
                } else {
                    MessagesController.getInstance(launchActivity.L).addUserToChat(chat.id, user, 0, str2, oyVar, true, new ct(launchActivity, i11, chat, oyVar, 2), null);
                    break;
                }
        }
    }

    public /* synthetic */ p8(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z4, String str2, int i10, TLRPC.Chat chat, oy oyVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.h = tL_chatAdminRights;
        this.b = z4;
        this.n = str2;
        this.c = i10;
        this.r = chat;
        this.s = oyVar;
        this.v = user;
        this.d = j10;
        this.w = str3;
    }
}
