package ai;

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
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t4(u4 u4Var, boolean z10, zg.p0 p0Var, View view) {
        this.c = u4Var;
        this.b = z10;
        this.d = p0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        zg.l0 l0Var;
        TLRPC.Document f7;
        vc vcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                u4 u4Var = (u4) obj4;
                zg.p0 p0Var = (zg.p0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                f6 f6Var = u4Var.a;
                if (!z10 || p0Var.f == null) {
                    l0Var = new zg.l0(view.getContext(), null, f6Var.f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, p0Var, f6Var.C2, 2, true);
                } else {
                    try {
                        f6Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l0Var = new zg.l0(view.getContext(), null, f6Var.f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, p0Var, f6Var.C2, 0, true);
                }
                zg.l0.B = l0Var;
                int i13 = R.id.parent_tag;
                zg.i0 i0Var = l0Var.i;
                i0Var.setTag(i13, 1);
                f6Var.addView(i0Var);
                d6 d6Var = f6Var.O1;
                l0Var.s = true;
                l0Var.y = System.currentTimeMillis();
                if (p0Var.f != null) {
                    f7 = MediaDataController.getInstance(f6Var.C2).getEmojiAnimatedSticker(p0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(p0Var.f, f6Var.B1);
                    of2.replyToStoryItem = d6Var.a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.o5.f(f6Var.C2, p0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (f6Var.f2.getReactionsWindow() != null) {
                            f6Var.f2.getReactionsWindow().e();
                        }
                        f6Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, f6Var.B1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = p0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = d6Var.a;
                        of3.payStars = l4.longValue();
                        SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of3);
                    }
                }
                if (l4.longValue() <= 0) {
                    org.telegram.ui.Components.oc q6 = new vc(f6Var.c1, f6Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(u4Var, 6));
                    q6.j = 5000;
                    q6.j();
                }
                if (f6Var.f2.getReactionsWindow() != null) {
                    f6Var.f2.getReactionsWindow().e();
                }
                f6Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                f6 f6Var2 = ((w5) obj4).l;
                a5 a5Var = f6Var2.c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (f6Var2.C1) {
                        new vc(a5Var, e6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new vc(a5Var, e6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        vcVar = new vc(a5Var, e6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    vcVar = new vc(a5Var, e6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.y0.o(i11, vcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.n5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                xh.q1 q1Var = new xh.q1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, tg.t.c(tg.t.b(1, (List) obj)), null);
                q1Var.V(z10);
                q1Var.show();
                break;
        }
    }

    public /* synthetic */ t4(w5 w5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = w5Var;
        this.d = storyItem;
        this.b = z10;
        this.e = e6Var;
    }

    public /* synthetic */ t4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = b2Var;
        this.e = user;
        this.b = z10;
    }
}
