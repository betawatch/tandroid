package bi;

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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f4(g4 g4Var, boolean z10, ah.j1 j1Var, View view) {
        this.c = g4Var;
        this.b = z10;
        this.d = j1Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ah.e1 e1Var;
        TLRPC.Document f7;
        yc ycVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                g4 g4Var = (g4) obj4;
                ah.j1 j1Var = (ah.j1) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                o5 o5Var = g4Var.a;
                if (!z10 || j1Var.f == null) {
                    e1Var = new ah.e1(view.getContext(), null, o5Var.f2, null, view, o5Var.getMeasuredWidth() / 2.0f, o5Var.getMeasuredHeight() / 2.0f, j1Var, o5Var.C2, 2, true);
                } else {
                    try {
                        o5Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    e1Var = new ah.e1(view.getContext(), null, o5Var.f2, null, view, o5Var.getMeasuredWidth() / 2.0f, o5Var.getMeasuredHeight() / 2.0f, j1Var, o5Var.C2, 0, true);
                }
                ah.e1.B = e1Var;
                int i13 = R.id.parent_tag;
                ah.b1 b1Var = e1Var.i;
                b1Var.setTag(i13, 1);
                o5Var.addView(b1Var);
                m5 m5Var = o5Var.O1;
                e1Var.s = true;
                e1Var.y = System.currentTimeMillis();
                if (j1Var.f != null) {
                    f7 = MediaDataController.getInstance(o5Var.C2).getEmojiAnimatedSticker(j1Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(j1Var.f, o5Var.B1);
                    of2.replyToStoryItem = m5Var.a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(o5Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.q5.f(o5Var.C2, j1Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (o5Var.f2.getReactionsWindow() != null) {
                            o5Var.f2.getReactionsWindow().e();
                        }
                        o5Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, o5Var.B1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = j1Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = m5Var.a;
                        of3.payStars = l4.longValue();
                        SendMessagesHelper.getInstance(o5Var.C2).sendMessage(of3);
                    }
                }
                if (l4.longValue() <= 0) {
                    qc q6 = new yc(o5Var.c1, o5Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(g4Var, 16));
                    q6.j = 5000;
                    q6.j();
                }
                if (o5Var.f2.getReactionsWindow() != null) {
                    o5Var.f2.getReactionsWindow().e();
                }
                o5Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                o5 o5Var2 = ((f5) obj4).l;
                l4 l4Var = o5Var2.c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (o5Var2.C1) {
                        new yc(l4Var, f6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new yc(l4Var, f6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        ycVar = new yc(l4Var, f6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    ycVar = new yc(l4Var, f6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.w1.o(i11, ycVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.m5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                yh.p1 p1Var = new yh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, ug.t.c(ug.t.b(1, (List) obj)), null);
                p1Var.V(z10);
                p1Var.show();
                break;
        }
    }

    public /* synthetic */ f4(f5 f5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = f5Var;
        this.d = storyItem;
        this.b = z10;
        this.e = f6Var;
    }

    public /* synthetic */ f4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = b2Var;
        this.e = user;
        this.b = z10;
    }
}
