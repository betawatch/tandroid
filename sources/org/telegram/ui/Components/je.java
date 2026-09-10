package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ je(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = d2Var;
        this.e = user;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        yg.l0 l0Var;
        TLRPC.Document f7;
        wc wcVar;
        int i10;
        int i11;
        int i12 = this.a;
        Object obj2 = this.e;
        boolean z10 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i13 = ChatActivityEnterView.m5;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                wh.p1 p1Var = new wh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, sg.s.c(sg.s.b(1, (List) obj)), null);
                p1Var.V(z10);
                p1Var.show();
                break;
            case 1:
                zh.e2 e2Var = (zh.e2) obj4;
                yg.p0 p0Var = (yg.p0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                zh.a3 a3Var = e2Var.a;
                if (!z10 || p0Var.f == null) {
                    l0Var = new yg.l0(view.getContext(), null, a3Var.f2, null, view, a3Var.getMeasuredWidth() / 2.0f, a3Var.getMeasuredHeight() / 2.0f, p0Var, a3Var.C2, 2, true);
                } else {
                    try {
                        a3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l0Var = new yg.l0(view.getContext(), null, a3Var.f2, null, view, a3Var.getMeasuredWidth() / 2.0f, a3Var.getMeasuredHeight() / 2.0f, p0Var, a3Var.C2, 0, true);
                }
                yg.l0.B = l0Var;
                int i14 = R.id.parent_tag;
                yg.i0 i0Var = l0Var.i;
                i0Var.setTag(i14, 1);
                a3Var.addView(i0Var);
                zh.z2 z2Var = a3Var.O1;
                l0Var.s = true;
                l0Var.y = System.currentTimeMillis();
                if (p0Var.f != null) {
                    f7 = MediaDataController.getInstance(a3Var.C2).getEmojiAnimatedSticker(p0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(p0Var.f, a3Var.B1);
                    of2.replyToStoryItem = z2Var.a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(a3Var.C2).sendMessage(of2);
                } else {
                    f7 = p5.f(a3Var.C2, p0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (a3Var.f2.getReactionsWindow() != null) {
                            a3Var.f2.getReactionsWindow().e();
                        }
                        a3Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, a3Var.B1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = p0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = z2Var.a;
                        of3.payStars = l4.longValue();
                        SendMessagesHelper.getInstance(a3Var.C2).sendMessage(of3);
                    }
                }
                if (l4.longValue() <= 0) {
                    pc q6 = new wc(a3Var.c1, a3Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new xh.x(e2Var, 22));
                    q6.j = 5000;
                    q6.j();
                }
                if (a3Var.f2.getReactionsWindow() != null) {
                    a3Var.f2.getReactionsWindow().e();
                }
                a3Var.s0();
                break;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                zh.a3 a3Var2 = ((zh.v2) obj4).l;
                zh.h2 h2Var = a3Var2.c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (a3Var2.C1) {
                        new wc(h2Var, f6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new wc(h2Var, f6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        wcVar = new wc(h2Var, f6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    wcVar = new wc(h2Var, f6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.a2.o(i11, wcVar, i10, 36);
                break;
        }
    }

    public /* synthetic */ je(zh.e2 e2Var, boolean z10, yg.p0 p0Var, View view) {
        this.c = e2Var;
        this.b = z10;
        this.d = p0Var;
        this.e = view;
    }

    public /* synthetic */ je(zh.v2 v2Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = v2Var;
        this.d = storyItem;
        this.b = z10;
        this.e = f6Var;
    }
}
