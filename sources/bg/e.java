package bg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z8;
import org.telegram.ui.mf1;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(xn xnVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = xnVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(xnVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(xnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                xnVar.pb(arrayList, null, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                xnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = xnVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(xnVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
            xnVar.pb(arrayList2, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i10 = findTopic.read_inbox_max_id;
            int i11 = findTopic.read_outbox_max_id;
            xnVar.h4 = i10;
            xnVar.i4 = i11;
            xnVar.j4 = Math.max(1, i10);
            xnVar.a4 = DialogObject.getPeerDialogId(findTopic.from_id);
            xnVar.zc();
            xnVar.Qc(false);
            xnVar.hc(false);
        }
        xnVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
    }

    public static void b(MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        if (messageObject.getDialogId() <= 0 && (findTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof b) {
                ((b) drawable).b(findTopic.icon_color);
            }
        }
    }

    public static d c(Context context, float f10, int i10, boolean z4) {
        if (context == null) {
            return null;
        }
        d dVar = new d();
        dVar.a = context.getResources().getDrawable(z4 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        dVar.b = f10;
        dVar.a(i10);
        return dVar;
    }

    public static pq d(int i10, String str) {
        b bVar = new b(i10);
        o80 o80Var = new o80(1, null);
        String trim = str.trim();
        o80Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        pq pqVar = new pq(bVar, o80Var, 0, 0);
        pqVar.w = true;
        return pqVar;
    }

    public static pq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(long j10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (j10 != MessageObject.getTopicId(((MessageObject) arrayList.get(i10)).currentAccount, ((MessageObject) arrayList.get(i10)).messageOwner, true)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public static xn g(p2 p2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (p2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = p2Var.getMessagesController().getChat(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        xn xnVar = new xn(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (findTopic = p2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = findTopic.topicStartMessage;
            tL_forumTopic2 = findTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(p2Var.getCurrentAccount(), message, false, false));
        xnVar.pb(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i10 != 0) {
            xnVar.I7 = i10;
        }
        return xnVar;
    }

    public static String h(int i10, long j10) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), i10, true);
    }

    public static String i(TLRPC.Chat chat, int i10, boolean z4) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                return z4 ? chat2.title : LocaleController.formatString(R.string.MonoforumTitle, chat2.title);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            return z4 ? chat.title : LocaleController.formatString(R.string.MonoforumTitle, chat.title);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence j(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                d c3 = c(ApplicationLoader.applicationContext, 1.0f, paint == null ? k6.w0(null, k6.Ac, false) : paint.getColor(), false);
                c3.setBounds(0, 0, paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize(), paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = c3;
                }
                spannableStringBuilder.setSpan(new ImageSpan(c3, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            u5 u5Var = new u5(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(u5Var, 0, 1, 33);
            u5Var.top = true;
            u5Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            pq e6 = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e6.a;
            }
            e6.setBounds(0, 0, (int) (e6.getIntrinsicWidth() * 0.65f), (int) (e6.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e6.b;
            if (drawable instanceof o80) {
                ((o80) drawable).i = 0.7f;
            }
            if (paint != null) {
                oq oqVar = new oq(0, e6);
                oqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e6), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean k(MessageObject messageObject) {
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long peerDialogId = DialogObject.getPeerDialogId(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
                tL_forumTopic.title = Long.toString(peerDialogId);
                tL_forumTopic.top_message = tL_monoForumDialog.top_message;
                tL_forumTopic.read_inbox_max_id = tL_monoForumDialog.read_inbox_max_id;
                tL_forumTopic.read_outbox_max_id = tL_monoForumDialog.read_outbox_max_id;
                tL_forumTopic.unread_reactions_count = tL_monoForumDialog.unread_reactions_count;
                tL_forumTopic.unread_count = tL_monoForumDialog.unread_count;
                tL_forumTopic.draft = tL_monoForumDialog.draft;
                tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                tL_forumTopic.from_id = tL_monoForumDialog.peer;
                tL_forumTopic.nopaid_messages_exception = tL_monoForumDialog.nopaid_messages_exception;
                arrayList2.add(tL_forumTopic);
            }
        }
        return arrayList2;
    }

    public static void m(p2 p2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        xn g10 = g(p2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            p2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, z8 z8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        z8Var.k(i10, chat);
        imageReceiver.setForUserOrChat(chat2, z8Var);
    }

    public static void o(int i10, TLRPC.Chat chat, z8 z8Var, p9 p9Var) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        z8Var.k(i10, chat);
        p9Var.e(chat2, z8Var);
    }

    public static void p(p9 p9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z4, boolean z10, g6 g6Var) {
        if (tL_forumTopic == null || p9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageDrawable(c(p9Var.getContext(), 0.75f, k6.v0(k6.v8, g6Var), z10));
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            p9Var.setAnimatedEmojiDrawable(null);
            p9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        p9Var.setImageDrawable(null);
        l5 l5Var = p9Var.e;
        if (l5Var == null || tL_forumTopic.icon_emoji_id != l5Var.i()) {
            l5 l5Var2 = new l5(z10 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            l5Var2.setColorFilter(z4 ? new PorterDuffColorFilter(k6.w0(null, k6.A8, false), PorterDuff.Mode.SRC_IN) : k6.n0(g6Var));
            p9Var.setAnimatedEmojiDrawable(l5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof xn) {
            xn xnVar = (xn) lastFragment;
            if ((-xnVar.a()) == j10 && xnVar.getMessagesController().getChat(Long.valueOf(j10)).forum && xnVar.getParentLayout() != null) {
                if (((ActionBarLayout) xnVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new c(xnVar, 0), 500L);
                } else {
                    mf1.I0(xnVar);
                }
            }
        }
        if (lastFragment instanceof mf1) {
            mf1 mf1Var = (mf1) lastFragment;
            long j11 = mf1Var.a;
            if ((-(-j11)) != j10 || mf1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                return;
            }
            if (mf1Var.getParentLayout() != null && ((ActionBarLayout) mf1Var.getParentLayout()).j()) {
                AndroidUtilities.runOnUIThread(new ag.e(mf1Var, 8), 500L);
                return;
            }
            mf1Var.E = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            xn xnVar2 = new xn(bundle);
            xnVar2.ga = true;
            mf1Var.presentFragment(xnVar2);
        }
    }
}
