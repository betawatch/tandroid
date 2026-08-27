package jh;

import android.view.View;
import hh.y9;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d3(e3 e3Var, boolean z10, ig.q0 q0Var, View view) {
        this.c = e3Var;
        this.b = z10;
        this.d = q0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ig.m0 m0Var;
        TLRPC.Document f10;
        mc mcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                e3 e3Var = (e3) obj4;
                ig.q0 q0Var = (ig.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                e4 e4Var = e3Var.a;
                if (!z10 || q0Var.f == null) {
                    m0Var = new ig.m0(view.getContext(), null, e4Var.b2, null, view, e4Var.getMeasuredWidth() / 2.0f, e4Var.getMeasuredHeight() / 2.0f, q0Var, e4Var.y2, 2, true);
                } else {
                    try {
                        e4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m0Var = new ig.m0(view.getContext(), null, e4Var.b2, null, view, e4Var.getMeasuredWidth() / 2.0f, e4Var.getMeasuredHeight() / 2.0f, q0Var, e4Var.y2, 0, true);
                }
                ig.m0.B = m0Var;
                int i13 = R.id.parent_tag;
                ig.j0 j0Var = m0Var.i;
                j0Var.setTag(i13, 1);
                e4Var.addView(j0Var);
                c4 c4Var = e4Var.K1;
                m0Var.s = true;
                m0Var.y = System.currentTimeMillis();
                if (q0Var.f != null) {
                    f10 = MediaDataController.getInstance(e4Var.y2).getEmojiAnimatedSticker(q0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(q0Var.f, e4Var.x1);
                    of2.replyToStoryItem = c4Var.a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(e4Var.y2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.k5.f(e4Var.y2, q0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (e4Var.b2.getReactionsWindow() != null) {
                            e4Var.b2.getReactionsWindow().e();
                        }
                        e4Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, e4Var.x1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = q0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = c4Var.a;
                        of3.payStars = l10.longValue();
                        SendMessagesHelper.getInstance(e4Var.y2).sendMessage(of3);
                    }
                }
                if (l10.longValue() <= 0) {
                    ec q6 = new mc(e4Var.Y0, e4Var.x0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new y9(e3Var, 11));
                    q6.j = 5000;
                    q6.j();
                }
                if (e4Var.b2.getReactionsWindow() != null) {
                    e4Var.b2.getReactionsWindow().e();
                }
                e4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                e4 e4Var2 = ((x3) obj4).l;
                j3 j3Var = e4Var2.Y0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (e4Var2.y1) {
                        new mc(j3Var, c6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new mc(j3Var, c6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        mcVar = new mc(j3Var, c6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    mcVar = new mc(j3Var, c6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.y1.q(i11, mcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.i5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                gh.k2 k2Var = new gh.k2(chatActivityEnterView.getContext(), chatActivityEnterView.M, ((TLRPC.User) obj2).id, cg.q0.c(cg.q0.b(1, (List) obj)), null);
                k2Var.V(z10);
                k2Var.show();
                break;
        }
    }

    public /* synthetic */ d3(x3 x3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = x3Var;
        this.d = storyItem;
        this.b = z10;
        this.e = c6Var;
    }

    public /* synthetic */ d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = b2Var;
        this.e = user;
        this.b = z10;
    }
}
