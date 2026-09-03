package oh;

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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e3(f3 f3Var, boolean z4, ng.q0 q0Var, View view) {
        this.c = f3Var;
        this.b = z4;
        this.d = q0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ng.m0 m0Var;
        TLRPC.Document f10;
        qc qcVar;
        int i10;
        int i11;
        int i12 = this.a;
        boolean z4 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                f3 f3Var = (f3) obj4;
                ng.q0 q0Var = (ng.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                f4 f4Var = f3Var.a;
                if (!z4 || q0Var.f == null) {
                    m0Var = new ng.m0(view.getContext(), null, f4Var.c2, null, view, f4Var.getMeasuredWidth() / 2.0f, f4Var.getMeasuredHeight() / 2.0f, q0Var, f4Var.z2, 2, true);
                } else {
                    try {
                        f4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m0Var = new ng.m0(view.getContext(), null, f4Var.c2, null, view, f4Var.getMeasuredWidth() / 2.0f, f4Var.getMeasuredHeight() / 2.0f, q0Var, f4Var.z2, 0, true);
                }
                ng.m0.B = m0Var;
                int i13 = R.id.parent_tag;
                ng.j0 j0Var = m0Var.i;
                j0Var.setTag(i13, 1);
                f4Var.addView(j0Var);
                d4 d4Var = f4Var.L1;
                m0Var.s = true;
                m0Var.y = System.currentTimeMillis();
                if (q0Var.f != null) {
                    f10 = MediaDataController.getInstance(f4Var.z2).getEmojiAnimatedSticker(q0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(q0Var.f, f4Var.y1);
                    of2.replyToStoryItem = d4Var.a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(f4Var.z2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.l5.f(f4Var.z2, q0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (f4Var.c2.getReactionsWindow() != null) {
                            f4Var.c2.getReactionsWindow().e();
                        }
                        f4Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, f4Var.y1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = q0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = d4Var.a;
                        of3.payStars = l10.longValue();
                        SendMessagesHelper.getInstance(f4Var.z2).sendMessage(of3);
                    }
                }
                if (l10.longValue() <= 0) {
                    ic q10 = new qc(f4Var.Z0, f4Var.y0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new lh.c3(f3Var, 28));
                    q10.j = 5000;
                    q10.j();
                }
                if (f4Var.c2.getReactionsWindow() != null) {
                    f4Var.c2.getReactionsWindow().e();
                }
                f4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                f4 f4Var2 = ((y3) obj4).l;
                j3 j3Var = f4Var2.Z0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z4;
                    if (f4Var2.z1) {
                        new qc(j3Var, g6Var).Q(z4 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z4 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z4) {
                        new qc(j3Var, g6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        qcVar = new qc(j3Var, g6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    qcVar = new qc(j3Var, g6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                l.d.v(i11, qcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.j5;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                lh.g2 g2Var = new lh.g2(chatActivityEnterView.getContext(), chatActivityEnterView.N, ((TLRPC.User) obj2).id, hg.p0.c(hg.p0.b(1, (List) obj)), null);
                g2Var.V(z4);
                g2Var.show();
                break;
        }
    }

    public /* synthetic */ e3(y3 y3Var, TL_stories.StoryItem storyItem, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this.c = y3Var;
        this.d = storyItem;
        this.b = z4;
        this.e = g6Var;
    }

    public /* synthetic */ e3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z4) {
        this.c = chatActivityEnterView;
        this.d = d2Var;
        this.e = user;
        this.b = z4;
    }
}
