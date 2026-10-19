package ci;

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
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l3(m3 m3Var, boolean z10, ah.i1 i1Var, View view) {
        this.c = m3Var;
        this.b = z10;
        this.d = i1Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ah.d1 d1Var;
        TLRPC.Document f7;
        xc xcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                m3 m3Var = (m3) obj4;
                ah.i1 i1Var = (ah.i1) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                q4 q4Var = m3Var.a;
                if (!z10 || i1Var.f == null) {
                    d1Var = new ah.d1(view.getContext(), null, q4Var.f2, null, view, q4Var.getMeasuredWidth() / 2.0f, q4Var.getMeasuredHeight() / 2.0f, i1Var, q4Var.C2, 2, true);
                } else {
                    try {
                        q4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    d1Var = new ah.d1(view.getContext(), null, q4Var.f2, null, view, q4Var.getMeasuredWidth() / 2.0f, q4Var.getMeasuredHeight() / 2.0f, i1Var, q4Var.C2, 0, true);
                }
                ah.d1.B = d1Var;
                int i13 = R.id.parent_tag;
                ah.a1 a1Var = d1Var.i;
                a1Var.setTag(i13, 1);
                q4Var.addView(a1Var);
                o4 o4Var = q4Var.O1;
                d1Var.s = true;
                d1Var.y = System.currentTimeMillis();
                if (i1Var.f != null) {
                    f7 = MediaDataController.getInstance(q4Var.C2).getEmojiAnimatedSticker(i1Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(i1Var.f, q4Var.B1);
                    of2.replyToStoryItem = o4Var.a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(q4Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.r5.f(q4Var.C2, i1Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (q4Var.f2.getReactionsWindow() != null) {
                            q4Var.f2.getReactionsWindow().e();
                        }
                        q4Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, q4Var.B1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = i1Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = o4Var.a;
                        of3.payStars = l4.longValue();
                        SendMessagesHelper.getInstance(q4Var.C2).sendMessage(of3);
                    }
                }
                if (l4.longValue() <= 0) {
                    qc r10 = new xc(q4Var.c1, q4Var.B0).r(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new androidx.fragment.app.d(m3Var, 10));
                    r10.j = 5000;
                    r10.j();
                }
                if (q4Var.f2.getReactionsWindow() != null) {
                    q4Var.f2.getReactionsWindow().e();
                }
                q4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                q4 q4Var2 = ((h4) obj4).l;
                r3 r3Var = q4Var2.c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (q4Var2.C1) {
                        new xc(r3Var, d6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new xc(r3Var, d6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        xcVar = new xc(r3Var, d6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    xcVar = new xc(r3Var, d6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.g0.q(i11, xcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.n5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                yh.o1 o1Var = new yh.o1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, ug.r.c(ug.r.b(1, (List) obj)), null);
                o1Var.W(z10);
                o1Var.show();
                break;
        }
    }

    public /* synthetic */ l3(h4 h4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.c = h4Var;
        this.d = storyItem;
        this.b = z10;
        this.e = d6Var;
    }

    public /* synthetic */ l3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = b2Var;
        this.e = user;
        this.b = z10;
    }
}
