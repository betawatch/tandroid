package di;

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
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k3(l3 l3Var, boolean z10, bh.x0 x0Var, View view) {
        this.c = l3Var;
        this.b = z10;
        this.d = x0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        bh.s0 s0Var;
        TLRPC.Document f7;
        wc wcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                l3 l3Var = (l3) obj4;
                bh.x0 x0Var = (bh.x0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                q4 q4Var = l3Var.a;
                if (!z10 || x0Var.f == null) {
                    s0Var = new bh.s0(view.getContext(), null, q4Var.U1, null, view, q4Var.getMeasuredWidth() / 2.0f, q4Var.getMeasuredHeight() / 2.0f, x0Var, q4Var.r2, 2, true);
                } else {
                    try {
                        q4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    s0Var = new bh.s0(view.getContext(), null, q4Var.U1, null, view, q4Var.getMeasuredWidth() / 2.0f, q4Var.getMeasuredHeight() / 2.0f, x0Var, q4Var.r2, 0, true);
                }
                bh.s0.B = s0Var;
                int i13 = R.id.parent_tag;
                bh.p0 p0Var = s0Var.i;
                p0Var.setTag(i13, 1);
                q4Var.addView(p0Var);
                o4 o4Var = q4Var.D1;
                s0Var.s = true;
                s0Var.y = System.currentTimeMillis();
                if (x0Var.f != null) {
                    f7 = MediaDataController.getInstance(q4Var.r2).getEmojiAnimatedSticker(x0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(x0Var.f, q4Var.q1);
                    of2.replyToStoryItem = o4Var.a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(q4Var.r2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.t5.f(q4Var.r2, x0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (q4Var.U1.getReactionsWindow() != null) {
                            q4Var.U1.getReactionsWindow().e();
                        }
                        q4Var.q0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, q4Var.q1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = x0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = o4Var.a;
                        of3.payStars = l4.longValue();
                        SendMessagesHelper.getInstance(q4Var.r2).sendMessage(of3);
                    }
                }
                if (l4.longValue() <= 0) {
                    qc r6 = new wc(q4Var.R0, q4Var.q0).r(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new bi.u6(l3Var, 17));
                    r6.j = 5000;
                    r6.j();
                }
                if (q4Var.U1.getReactionsWindow() != null) {
                    q4Var.U1.getReactionsWindow().e();
                }
                q4Var.q0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                q4 q4Var2 = ((h4) obj4).l;
                q3 q3Var = q4Var2.R0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (q4Var2.r1) {
                        new wc(q3Var, u6Var).R(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new wc(q3Var, u6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        wcVar = new wc(q3Var, u6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    wcVar = new wc(q3Var, u6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.t.q(i11, wcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.r5;
                ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                zh.p1 p1Var = new zh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, vg.s.c(vg.s.b(1, (List) obj)), null);
                p1Var.V(z10);
                p1Var.show();
                break;
        }
    }

    public /* synthetic */ k3(h4 h4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.c = h4Var;
        this.d = storyItem;
        this.b = z10;
        this.e = u6Var;
    }

    public /* synthetic */ k3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = e2Var;
        this.e = user;
        this.b = z10;
    }
}
