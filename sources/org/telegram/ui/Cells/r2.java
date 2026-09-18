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
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class r2 {
    public final s2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public r2(s2 s2Var) {
        this.a = s2Var;
    }

    public static void a(r2 r2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        long j3;
        boolean z10;
        int i11;
        r2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (r2Var.b != id2 || r2Var.e) {
            r2Var.f = null;
            r2Var.c = 0;
            r2Var.d = false;
            r2Var.e = false;
            r2Var.b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.id);
                boolean z11 = true;
                if (topics == null || topics.isEmpty()) {
                    if (MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.id)) {
                        r2Var.g = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.id);
                    r2Var.g = LocaleController.getString(R.string.Loading);
                    r2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(topics);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new ai.f7(5)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    j3 = 0;
                    z10 = false;
                    i11 = 0;
                } else {
                    j3 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.id, j3);
                    if (findTopic != null) {
                        CharSequence j10 = ng.d.j(findTopic, textPaint, null);
                        spannableStringBuilder.append(j10);
                        i11 = findTopic.unread_count > 0 ? j10.length() : 0;
                        r2Var.c = j10.length();
                        if (messageObject.isOutOwner()) {
                            r2Var.d = false;
                        } else {
                            r2Var.d = findTopic.unread_count > 0;
                        }
                    } else {
                        r2Var.d = false;
                        i11 = 0;
                    }
                    if (r2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new q2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    r2Var.f = new HashMap();
                    for (int i12 = 0; i12 < Math.min(4, arrayList.size()); i12++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i12)).from_id);
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(i10, r2Var.a);
                        g5Var.h = false;
                        g5Var.c(peerDialogId);
                        r2Var.f.put(Long.valueOf(peerDialogId), g5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(g5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i13 = 0;
                    for (int i14 = 4; i13 < Math.min(i14, arrayList.size()); i14 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i13)).id != j3) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(ng.d.j((TLRPC.ForumTopic) arrayList.get(i13), textPaint, null));
                            z11 = false;
                        }
                        i13++;
                    }
                }
                if (i11 > 0) {
                    Typeface bold = AndroidUtilities.bold();
                    int i15 = org.telegram.ui.ActionBar.j6.X8;
                    u51 u51Var = new u51();
                    u51Var.a = bold;
                    u51Var.c = i15;
                    u51Var.b = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                    spannableStringBuilder.setSpan(u51Var, 0, Math.min(spannableStringBuilder.length(), i11 + 2), 0);
                }
                r2Var.g = spannableStringBuilder;
            }
        }
    }
}
