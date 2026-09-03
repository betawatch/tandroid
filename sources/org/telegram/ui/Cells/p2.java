package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p2 {
    public final q2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public p2(q2 q2Var) {
        this.a = q2Var;
    }

    public static void a(p2 p2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        long j10;
        boolean z4;
        int i11;
        p2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (p2Var.b != id2 || p2Var.e) {
            p2Var.f = null;
            p2Var.c = 0;
            p2Var.d = false;
            p2Var.e = false;
            p2Var.b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.id);
                boolean z10 = true;
                if (topics == null || topics.isEmpty()) {
                    if (MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.id)) {
                        p2Var.g = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.id);
                    p2Var.g = LocaleController.getString(R.string.Loading);
                    p2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(topics);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new kf.d(11)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    j10 = 0;
                    z4 = false;
                    i11 = 0;
                } else {
                    j10 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.id, j10);
                    if (findTopic != null) {
                        CharSequence j11 = ag.f.j(findTopic, textPaint, null);
                        spannableStringBuilder.append(j11);
                        i11 = findTopic.unread_count > 0 ? j11.length() : 0;
                        p2Var.c = j11.length();
                        if (messageObject.isOutOwner()) {
                            p2Var.d = false;
                        } else {
                            p2Var.d = findTopic.unread_count > 0;
                        }
                    } else {
                        p2Var.d = false;
                        i11 = 0;
                    }
                    if (p2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new o2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    p2Var.f = new HashMap();
                    for (int i12 = 0; i12 < Math.min(4, arrayList.size()); i12++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i12)).from_id);
                        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(i10, p2Var.a);
                        k5Var.h = false;
                        k5Var.c(peerDialogId);
                        p2Var.f.put(Long.valueOf(peerDialogId), k5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(k5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i13 = 0;
                    for (int i14 = 4; i13 < Math.min(i14, arrayList.size()); i14 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i13)).id != j10) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z10 && z4) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(ag.f.j((TLRPC.ForumTopic) arrayList.get(i13), textPaint, null));
                            z10 = false;
                        }
                        i13++;
                    }
                }
                if (i11 > 0) {
                    Typeface bold = AndroidUtilities.bold();
                    int i15 = org.telegram.ui.ActionBar.j6.X8;
                    f51 f51Var = new f51();
                    f51Var.a = bold;
                    f51Var.c = i15;
                    f51Var.b = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                    spannableStringBuilder.setSpan(f51Var, 0, Math.min(spannableStringBuilder.length(), i11 + 2), 0);
                }
                p2Var.g = spannableStringBuilder;
            }
        }
    }
}
