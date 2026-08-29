package lh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c3(d3 d3Var, boolean z10, kg.q0 q0Var, View view) {
        this.c = d3Var;
        this.b = z10;
        this.d = q0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        kg.m0 m0Var;
        TLRPC.Document f9;
        tc tcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                d3 d3Var = (d3) obj4;
                kg.q0 q0Var = (kg.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                d4 d4Var = d3Var.a;
                if (!z10 || q0Var.f == null) {
                    m0Var = new kg.m0(view.getContext(), null, d4Var.b2, null, view, d4Var.getMeasuredWidth() / 2.0f, d4Var.getMeasuredHeight() / 2.0f, q0Var, d4Var.y2, 2, true);
                } else {
                    try {
                        d4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m0Var = new kg.m0(view.getContext(), null, d4Var.b2, null, view, d4Var.getMeasuredWidth() / 2.0f, d4Var.getMeasuredHeight() / 2.0f, q0Var, d4Var.y2, 0, true);
                }
                kg.m0.B = m0Var;
                int i13 = R.id.parent_tag;
                kg.j0 j0Var = m0Var.i;
                j0Var.setTag(i13, 1);
                d4Var.addView(j0Var);
                b4 b4Var = d4Var.K1;
                m0Var.s = true;
                m0Var.y = System.currentTimeMillis();
                if (q0Var.f != null) {
                    f9 = MediaDataController.getInstance(d4Var.y2).getEmojiAnimatedSticker(q0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(q0Var.f, d4Var.x1);
                    of2.replyToStoryItem = b4Var.a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(d4Var.y2).sendMessage(of2);
                } else {
                    f9 = org.telegram.ui.Components.p5.f(d4Var.y2, q0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f9, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (d4Var.b2.getReactionsWindow() != null) {
                            d4Var.b2.getReactionsWindow().e();
                        }
                        d4Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, d4Var.x1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = q0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = b4Var.a;
                        of3.payStars = l10.longValue();
                        SendMessagesHelper.getInstance(d4Var.y2).sendMessage(of3);
                    }
                }
                if (l10.longValue() <= 0) {
                    mc q6 = new tc(d4Var.Y0, d4Var.x0).q(f9, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new jh.o(d3Var, 25));
                    q6.j = 5000;
                    q6.j();
                }
                if (d4Var.b2.getReactionsWindow() != null) {
                    d4Var.b2.getReactionsWindow().e();
                }
                d4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                d4 d4Var2 = ((w3) obj4).l;
                h3 h3Var = d4Var2.Y0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (d4Var2.y1) {
                        new tc(h3Var, c6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new tc(h3Var, c6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        tcVar = new tc(h3Var, c6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    tcVar = new tc(h3Var, c6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                j7.l1.v(i11, tcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.i5;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                ih.h2 h2Var = new ih.h2(chatActivityEnterView.getContext(), chatActivityEnterView.M, ((TLRPC.User) obj2).id, eg.q0.c(eg.q0.b(1, (List) obj)), null);
                h2Var.V(z10);
                h2Var.show();
                break;
        }
    }

    public /* synthetic */ c3(w3 w3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = w3Var;
        this.d = storyItem;
        this.b = z10;
        this.e = c6Var;
    }

    public /* synthetic */ c3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = c2Var;
        this.e = user;
        this.b = z10;
    }
}
