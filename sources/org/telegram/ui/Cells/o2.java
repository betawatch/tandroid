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
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o2 {
    public final p2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public o2(p2 p2Var) {
        this.a = p2Var;
    }

    public static void a(o2 o2Var, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        long j10;
        boolean z10;
        int i11;
        o2Var.getClass();
        int id2 = (messageObject == null || chat == null) ? 0 : messageObject.getId();
        if (o2Var.b != id2 || o2Var.e) {
            o2Var.f = null;
            o2Var.c = 0;
            o2Var.d = false;
            o2Var.e = false;
            o2Var.b = id2;
            TextPaint textPaint = org.telegram.ui.ActionBar.y6.F0[0];
            if (chat != null) {
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(chat.id);
                boolean z11 = true;
                if (topics == null || topics.isEmpty()) {
                    if (MessagesController.getInstance(i10).getTopicsController().endIsReached(chat.id)) {
                        o2Var.g = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i10).getTopicsController().preloadTopics(chat.id);
                    o2Var.g = LocaleController.getString(R.string.Loading);
                    o2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(topics);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new ag.e(12)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (messageObject == null || ChatObject.isMonoForum(chat)) {
                    j10 = 0;
                    z10 = false;
                    i11 = 0;
                } else {
                    j10 = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.id, j10);
                    if (findTopic != null) {
                        CharSequence j11 = pg.d.j(findTopic, textPaint, null);
                        spannableStringBuilder.append(j11);
                        i11 = findTopic.unread_count > 0 ? j11.length() : 0;
                        o2Var.c = j11.length();
                        if (messageObject.isOutOwner()) {
                            o2Var.d = false;
                        } else {
                            o2Var.d = findTopic.unread_count > 0;
                        }
                    } else {
                        o2Var.d = false;
                        i11 = 0;
                    }
                    if (o2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new n2(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (ChatObject.isMonoForum(chat)) {
                    o2Var.f = new HashMap();
                    for (int i12 = 0; i12 < Math.min(4, arrayList.size()); i12++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i12)).from_id);
                        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(i10, o2Var.a);
                        j5Var.h = false;
                        j5Var.c(peerDialogId);
                        o2Var.f.put(Long.valueOf(peerDialogId), j5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(j5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i13 = 0;
                    for (int i14 = 4; i13 < Math.min(i14, arrayList.size()); i14 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i13)).id != j10) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(pg.d.j((TLRPC.ForumTopic) arrayList.get(i13), textPaint, null));
                            z11 = false;
                        }
                        i13++;
                    }
                }
                if (i11 > 0) {
                    Typeface bold = AndroidUtilities.bold();
                    int i15 = org.telegram.ui.ActionBar.y6.X8;
                    r61 r61Var = new r61();
                    r61Var.a = bold;
                    r61Var.c = i15;
                    r61Var.b = org.telegram.ui.ActionBar.y6.x0(null, i15, false);
                    spannableStringBuilder.setSpan(r61Var, 0, Math.min(spannableStringBuilder.length(), i11 + 2), 0);
                }
                o2Var.g = spannableStringBuilder;
            }
        }
    }
}
