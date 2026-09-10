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
import org.telegram.ui.Components.s51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        long j3;
        boolean z10;
        int i11;
        q2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (q2Var.b != id2 || q2Var.e) {
            q2Var.f = null;
            q2Var.c = 0;
            q2Var.d = false;
            q2Var.e = false;
            q2Var.b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.j6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.id);
                boolean z11 = true;
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
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new hi.j6(2)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    j3 = 0;
                    z10 = false;
                    i11 = 0;
                } else {
                    j3 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.id, j3);
                    if (findTopic != null) {
                        CharSequence j10 = mg.d.j(findTopic, textPaint, null);
                        spannableStringBuilder.append(j10);
                        i11 = findTopic.unread_count > 0 ? j10.length() : 0;
                        q2Var.c = j10.length();
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    q2Var.f = new HashMap();
                    for (int i12 = 0; i12 < Math.min(4, arrayList.size()); i12++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i12)).from_id);
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(i10, q2Var.a);
                        g5Var.h = false;
                        g5Var.c(peerDialogId);
                        q2Var.f.put(Long.valueOf(peerDialogId), g5Var);
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
                            spannableStringBuilder.append(mg.d.j((TLRPC.ForumTopic) arrayList.get(i13), textPaint, null));
                            z11 = false;
                        }
                        i13++;
                    }
                }
                if (i11 > 0) {
                    Typeface bold = AndroidUtilities.bold();
                    int i15 = org.telegram.ui.ActionBar.j6.X8;
                    s51 s51Var = new s51();
                    s51Var.a = bold;
                    s51Var.c = i15;
                    s51Var.b = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                    spannableStringBuilder.setSpan(s51Var, 0, Math.min(spannableStringBuilder.length(), i11 + 2), 0);
                }
                q2Var.g = spannableStringBuilder;
            }
        }
    }
}
