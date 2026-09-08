package og;

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
import ig.t0;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.z5;
import org.telegram.ui.co;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(co coVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = coVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(coVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(coVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                coVar.pb(arrayList, null, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                coVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = coVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(coVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
            coVar.pb(arrayList2, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i10 = findTopic.read_inbox_max_id;
            int i11 = findTopic.read_outbox_max_id;
            coVar.k4 = i10;
            coVar.l4 = i11;
            coVar.m4 = Math.max(1, i10);
            coVar.d4 = DialogObject.getPeerDialogId(findTopic.from_id);
            coVar.zc();
            coVar.Qc(false);
            coVar.hc(false);
        }
        coVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
    }

    public static void b(MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        if (messageObject.getDialogId() <= 0 && (findTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof a) {
                ((a) drawable).b(findTopic.icon_color);
            }
        }
    }

    public static c c(Context context, float f7, int i10, boolean z10) {
        if (context == null) {
            return null;
        }
        c cVar = new c();
        cVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        cVar.b = f7;
        cVar.a(i10);
        return cVar;
    }

    public static oq d(int i10, String str) {
        a aVar = new a(i10);
        l80 l80Var = new l80(1, null);
        String trim = str.trim();
        l80Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        oq oqVar = new oq(aVar, l80Var, 0, 0);
        oqVar.w = true;
        return oqVar;
    }

    public static oq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(long j3, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (j3 != MessageObject.getTopicId(((MessageObject) arrayList.get(i10)).currentAccount, ((MessageObject) arrayList.get(i10)).messageOwner, true)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public static co g(n2 n2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (n2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = n2Var.getMessagesController().getChat(Long.valueOf(j3));
        bundle.putLong("chat_id", j3);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        co coVar = new co(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (findTopic = n2Var.getMessagesController().getTopicsController().findTopic(j3, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = findTopic.topicStartMessage;
            tL_forumTopic2 = findTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(n2Var.getCurrentAccount(), message, false, false));
        coVar.pb(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i10 != 0) {
            coVar.L7 = i10;
        }
        return coVar;
    }

    public static String h(int i10, long j3) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), i10, true);
    }

    public static String i(TLRPC.Chat chat, int i10, boolean z10) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                return z10 ? chat2.title : LocaleController.formatString(R.string.MonoforumTitle, chat2.title);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            return z10 ? chat.title : LocaleController.formatString(R.string.MonoforumTitle, chat.title);
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
                c c10 = c(ApplicationLoader.applicationContext, 1.0f, paint == null ? j6.w0(null, j6.Ac, false) : paint.getColor(), false);
                c10.setBounds(0, 0, paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize(), paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = c10;
                }
                spannableStringBuilder.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            z5 z5Var = new z5(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(z5Var, 0, 1, 33);
            z5Var.top = true;
            z5Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            oq e7 = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e7.a;
            }
            e7.setBounds(0, 0, (int) (e7.getIntrinsicWidth() * 0.65f), (int) (e7.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e7.b;
            if (drawable instanceof l80) {
                ((l80) drawable).i = 0.7f;
            }
            if (paint != null) {
                nq nqVar = new nq(0, e7);
                nqVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e7), 0, 1, 33);
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

    public static void m(n2 n2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        co g10 = g(n2Var, j3, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            n2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, i9 i9Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        i9Var.k(i10, chat);
        imageReceiver.setForUserOrChat(chat2, i9Var);
    }

    public static void o(int i10, TLRPC.Chat chat, i9 i9Var, x9 x9Var) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        i9Var.k(i10, chat);
        x9Var.e(chat2, i9Var);
    }

    public static void p(x9 x9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, f6 f6Var) {
        if (tL_forumTopic == null || x9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            x9Var.setAnimatedEmojiDrawable(null);
            x9Var.setImageDrawable(c(x9Var.getContext(), 0.75f, j6.v0(j6.v8, f6Var), z11));
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            x9Var.setAnimatedEmojiDrawable(null);
            x9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        x9Var.setImageDrawable(null);
        q5 q5Var = x9Var.e;
        if (q5Var == null || tL_forumTopic.icon_emoji_id != q5Var.i()) {
            q5 q5Var2 = new q5(z11 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            q5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(j6.w0(null, j6.A8, false), PorterDuff.Mode.SRC_IN) : j6.n0(f6Var));
            x9Var.setAnimatedEmojiDrawable(q5Var2);
        }
    }

    public static void q(long j3, ActionBarLayout actionBarLayout) {
        n2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof co) {
            co coVar = (co) lastFragment;
            if ((-coVar.a()) == j3 && coVar.getMessagesController().getChat(Long.valueOf(j3)).forum && coVar.getParentLayout() != null) {
                if (((ActionBarLayout) coVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new b(coVar, 0), 500L);
                } else {
                    eg1.I0(coVar);
                }
            }
        }
        if (lastFragment instanceof eg1) {
            eg1 eg1Var = (eg1) lastFragment;
            long j10 = eg1Var.a;
            if ((-(-j10)) != j3 || eg1Var.getMessagesController().getChat(Long.valueOf(j3)).forum) {
                return;
            }
            if (eg1Var.getParentLayout() != null && ((ActionBarLayout) eg1Var.getParentLayout()).j()) {
                AndroidUtilities.runOnUIThread(new t0(eg1Var, 19), 500L);
                return;
            }
            eg1Var.H = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j10);
            co coVar2 = new co(bundle);
            coVar2.ja = true;
            eg1Var.presentFragment(coVar2);
        }
    }
}
