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
import org.telegram.ui.Components.i41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static void a(q2 q2Var, int i9, MessageObject messageObject, TLRPC.Chat chat) {
        long j10;
        boolean z10;
        int i10;
        q2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (q2Var.b != id2 || q2Var.e) {
            q2Var.f = null;
            q2Var.c = 0;
            q2Var.d = false;
            q2Var.e = false;
            q2Var.b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.f6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i9).getTopicsController().getTopics(chat.id);
                boolean z11 = true;
                if (topics == null || topics.isEmpty()) {
                    if (MessagesController.getInstance(i9).getTopicsController().endIsReached(chat.id)) {
                        q2Var.g = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i9).getTopicsController().preloadTopics(chat.id);
                    q2Var.g = LocaleController.getString(R.string.Loading);
                    q2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(topics);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new ff.d(11)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    j10 = 0;
                    z10 = false;
                    i10 = 0;
                } else {
                    j10 = MessageObject.getTopicId(i9, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i9).getTopicsController().findTopic(chat.id, j10);
                    if (findTopic != null) {
                        CharSequence j11 = vf.c.j(findTopic, textPaint, null);
                        spannableStringBuilder.append(j11);
                        i10 = findTopic.unread_count > 0 ? j11.length() : 0;
                        q2Var.c = j11.length();
                        if (messageObject.isOutOwner()) {
                            q2Var.d = false;
                        } else {
                            q2Var.d = findTopic.unread_count > 0;
                        }
                    } else {
                        q2Var.d = false;
                        i10 = 0;
                    }
                    if (q2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    q2Var.f = new HashMap();
                    for (int i11 = 0; i11 < Math.min(4, arrayList.size()); i11++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i11)).from_id);
                        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i9, q2Var.a);
                        f5Var.h = false;
                        f5Var.c(peerDialogId);
                        q2Var.f.put(Long.valueOf(peerDialogId), f5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(f5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = 4; i12 < Math.min(i13, arrayList.size()); i13 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i12)).id != j10) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(vf.c.j((TLRPC.ForumTopic) arrayList.get(i12), textPaint, null));
                            z11 = false;
                        }
                        i12++;
                    }
                }
                if (i10 > 0) {
                    Typeface bold = AndroidUtilities.bold();
                    int i14 = org.telegram.ui.ActionBar.f6.X8;
                    i41 i41Var = new i41();
                    i41Var.a = bold;
                    i41Var.c = i14;
                    i41Var.b = org.telegram.ui.ActionBar.f6.w0(null, i14, false);
                    spannableStringBuilder.setSpan(i41Var, 0, Math.min(spannableStringBuilder.length(), i10 + 2), 0);
                }
                q2Var.g = spannableStringBuilder;
            }
        }
    }
}
