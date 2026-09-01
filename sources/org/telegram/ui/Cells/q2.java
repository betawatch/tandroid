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
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q2 {
    public final r2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public q2(r2 r2Var) {
        this.a = r2Var;
    }

    public static void a(q2 q2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        long j10;
        boolean z4;
        int i11;
        q2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (q2Var.b != id2 || q2Var.e) {
            q2Var.f = null;
            q2Var.c = 0;
            q2Var.d = false;
            q2Var.e = false;
            q2Var.b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.id);
                boolean z10 = true;
                if (topics == null || topics.isEmpty()) {
                    if (MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.id)) {
                        q2Var.g = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.id);
                    q2Var.g = LocaleController.getString(R.string.Loading);
                    q2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(topics);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new lf.d(11)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    j10 = 0;
                    z4 = false;
                    i11 = 0;
                } else {
                    j10 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.id, j10);
                    if (findTopic != null) {
                        CharSequence j11 = bg.e.j(findTopic, textPaint, null);
                        spannableStringBuilder.append(j11);
                        i11 = findTopic.unread_count > 0 ? j11.length() : 0;
                        q2Var.c = j11.length();
                        if (messageObject.isOutOwner()) {
                            q2Var.d = false;
                        } else {
                            q2Var.d = findTopic.unread_count > 0;
                        }
                    } else {
                        q2Var.d = false;
                        i11 = 0;
                    }
                    if (q2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    q2Var.f = new HashMap();
                    for (int i12 = 0; i12 < Math.min(4, arrayList.size()); i12++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i12)).from_id);
                        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(i10, q2Var.a);
                        i5Var.h = false;
                        i5Var.c(peerDialogId);
                        q2Var.f.put(Long.valueOf(peerDialogId), i5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(i5Var, 0, 1, 33);
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
                            spannableStringBuilder.append(bg.e.j((TLRPC.ForumTopic) arrayList.get(i13), textPaint, null));
                            z10 = false;
                        }
                        i13++;
                    }
                }
                if (i11 > 0) {
                    Typeface bold = AndroidUtilities.bold();
                    int i15 = org.telegram.ui.ActionBar.k6.X8;
                    g51 g51Var = new g51();
                    g51Var.a = bold;
                    g51Var.c = i15;
                    g51Var.b = org.telegram.ui.ActionBar.k6.w0(null, i15, false);
                    spannableStringBuilder.setSpan(g51Var, 0, Math.min(spannableStringBuilder.length(), i11 + 2), 0);
                }
                q2Var.g = spannableStringBuilder;
            }
        }
    }
}
