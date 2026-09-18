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
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t4(u4 u4Var, boolean z10, zg.o0 o0Var, View view) {
        this.c = u4Var;
        this.b = z10;
        this.d = o0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        zg.k0 k0Var;
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
                u4 u4Var = (u4) obj4;
                zg.o0 o0Var = (zg.o0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                f6 f6Var = u4Var.a;
                if (!z10 || o0Var.f == null) {
                    k0Var = new zg.k0(view.getContext(), null, f6Var.f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, o0Var, f6Var.C2, 2, true);
                } else {
                    try {
                        f6Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    k0Var = new zg.k0(view.getContext(), null, f6Var.f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, o0Var, f6Var.C2, 0, true);
                }
                zg.k0.B = k0Var;
                int i13 = R.id.parent_tag;
                zg.h0 h0Var = k0Var.i;
                h0Var.setTag(i13, 1);
                f6Var.addView(h0Var);
                d6 d6Var = f6Var.O1;
                k0Var.s = true;
                k0Var.y = System.currentTimeMillis();
                if (o0Var.f != null) {
                    f7 = MediaDataController.getInstance(f6Var.C2).getEmojiAnimatedSticker(o0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(o0Var.f, f6Var.B1);
                    of2.replyToStoryItem = d6Var.a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.q5.f(f6Var.C2, o0Var.g);
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
                        tL_messageEntityCustomEmoji.document_id = o0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = d6Var.a;
                        of3.payStars = l4.longValue();
                        SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of3);
                    }
                }
                if (l4.longValue() <= 0) {
                    org.telegram.ui.Components.qc q6 = new xc(f6Var.c1, f6Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(u4Var, 6));
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
                        new xc(a5Var, e6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new xc(a5Var, e6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        xcVar = new xc(a5Var, e6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    xcVar = new xc(a5Var, e6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.q.q(i11, xcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.m5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                xh.r1 r1Var = new xh.r1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).id, tg.s.c(tg.s.b(1, (List) obj)), null);
                r1Var.V(z10);
                r1Var.show();
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
