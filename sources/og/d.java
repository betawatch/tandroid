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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z9;
import org.telegram.ui.fo;
import org.telegram.ui.lg1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(fo foVar, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = foVar.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(foVar.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(foVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
                foVar.tb(arrayList, null, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
                foVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = foVar.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(foVar.getCurrentAccount(), findTopic.topicStartMessage, false, false));
            foVar.tb(arrayList2, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i10 = findTopic.read_inbox_max_id;
            int i11 = findTopic.read_outbox_max_id;
            foVar.k4 = i10;
            foVar.l4 = i11;
            foVar.m4 = Math.max(1, i10);
            foVar.d4 = DialogObject.getPeerDialogId(findTopic.from_id);
            foVar.Dc();
            foVar.Uc(false);
            foVar.lc(false);
        }
        foVar.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
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

    public static cr d(int i10, String str) {
        a aVar = new a(i10);
        m90 m90Var = new m90(1, null);
        String trim = str.trim();
        m90Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        cr crVar = new cr(aVar, m90Var, 0, 0);
        crVar.w = true;
        return crVar;
    }

    public static cr e(TLRPC.TL_forumTopic tL_forumTopic) {
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

    public static fo g(m2 m2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic findTopic;
        if (m2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = m2Var.getMessagesController().getChat(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        fo foVar = new fo(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (findTopic = m2Var.getMessagesController().getTopicsController().findTopic(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = findTopic.topicStartMessage;
            tL_forumTopic2 = findTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(m2Var.getCurrentAccount(), message, false, false));
        foVar.tb(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i10 != 0) {
            foVar.L7 = i10;
        }
        return foVar;
    }

    public static String h(int i10, long j10) {
        return i(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), i10, true);
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
                c c10 = c(ApplicationLoader.applicationContext, 1.0f, paint == null ? g6.x0(null, g6.Ac, false) : paint.getColor(), false);
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
            b6 b6Var = new b6(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(b6Var, 0, 1, 33);
            b6Var.top = true;
            b6Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            cr e = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e.a;
            }
            e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e.b;
            if (drawable instanceof m90) {
                ((m90) drawable).i = 0.7f;
            }
            if (paint != null) {
                br brVar = new br(0, e);
                brVar.setSize((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e), 0, 1, 33);
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

    public static void m(m2 m2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        fo g10 = g(m2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            m2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, k9 k9Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        k9Var.k(i10, chat);
        imageReceiver.setForUserOrChat(chat2, k9Var);
    }

    public static void o(int i10, TLRPC.Chat chat, k9 k9Var, z9 z9Var) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i10).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        k9Var.k(i10, chat);
        z9Var.e(chat2, k9Var);
    }

    public static void p(z9 z9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, c6 c6Var) {
        if (tL_forumTopic == null || z9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            z9Var.setAnimatedEmojiDrawable(null);
            z9Var.setImageDrawable(c(z9Var.getContext(), 0.75f, g6.w0(g6.v8, c6Var), z11));
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            z9Var.setAnimatedEmojiDrawable(null);
            z9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        z9Var.setImageDrawable(null);
        s5 s5Var = z9Var.e;
        if (s5Var == null || tL_forumTopic.icon_emoji_id != s5Var.i()) {
            s5 s5Var2 = new s5(z11 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            s5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(g6.x0(null, g6.A8, false), PorterDuff.Mode.SRC_IN) : g6.o0(c6Var));
            z9Var.setAnimatedEmojiDrawable(s5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        m2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof fo) {
            fo foVar = (fo) lastFragment;
            if ((-foVar.a()) == j10 && foVar.getMessagesController().getChat(Long.valueOf(j10)).forum && foVar.getParentLayout() != null) {
                if (((ActionBarLayout) foVar.getParentLayout()).j()) {
                    AndroidUtilities.runOnUIThread(new b(foVar, 0), 500L);
                } else {
                    lg1.I0(foVar);
                }
            }
        }
        if (lastFragment instanceof lg1) {
            lg1 lg1Var = (lg1) lastFragment;
            long j11 = lg1Var.a;
            if ((-(-j11)) != j10 || lg1Var.getMessagesController().getChat(Long.valueOf(j10)).forum) {
                return;
            }
            if (lg1Var.getParentLayout() != null && ((ActionBarLayout) lg1Var.getParentLayout()).j()) {
                AndroidUtilities.runOnUIThread(new t0(lg1Var, 22), 500L);
                return;
            }
            lg1Var.H = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            fo foVar2 = new fo(bundle);
            foVar2.ja = true;
            lg1Var.presentFragment(foVar2);
        }
    }
}
