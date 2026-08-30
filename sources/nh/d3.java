package nh;

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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d3(e3 e3Var, boolean z4, mg.q0 q0Var, View view) {
        this.c = e3Var;
        this.b = z4;
        this.d = q0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        mg.m0 m0Var;
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
                e3 e3Var = (e3) obj4;
                mg.q0 q0Var = (mg.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                d4 d4Var = e3Var.a;
                if (!z4 || q0Var.f == null) {
                    m0Var = new mg.m0(view.getContext(), null, d4Var.c2, null, view, d4Var.getMeasuredWidth() / 2.0f, d4Var.getMeasuredHeight() / 2.0f, q0Var, d4Var.z2, 2, true);
                } else {
                    try {
                        d4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m0Var = new mg.m0(view.getContext(), null, d4Var.c2, null, view, d4Var.getMeasuredWidth() / 2.0f, d4Var.getMeasuredHeight() / 2.0f, q0Var, d4Var.z2, 0, true);
                }
                mg.m0.B = m0Var;
                int i13 = R.id.parent_tag;
                mg.j0 j0Var = m0Var.i;
                j0Var.setTag(i13, 1);
                d4Var.addView(j0Var);
                b4 b4Var = d4Var.L1;
                m0Var.s = true;
                m0Var.y = System.currentTimeMillis();
                if (q0Var.f != null) {
                    f10 = MediaDataController.getInstance(d4Var.z2).getEmojiAnimatedSticker(q0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(q0Var.f, d4Var.y1);
                    of2.replyToStoryItem = b4Var.a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(d4Var.z2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.l5.f(d4Var.z2, q0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (d4Var.c2.getReactionsWindow() != null) {
                            d4Var.c2.getReactionsWindow().e();
                        }
                        d4Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, d4Var.y1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = q0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = b4Var.a;
                        of3.payStars = l10.longValue();
                        SendMessagesHelper.getInstance(d4Var.z2).sendMessage(of3);
                    }
                }
                if (l10.longValue() <= 0) {
                    ic q10 = new qc(d4Var.Z0, d4Var.y0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new lh.b(e3Var, 25));
                    q10.j = 5000;
                    q10.j();
                }
                if (d4Var.c2.getReactionsWindow() != null) {
                    d4Var.c2.getReactionsWindow().e();
                }
                d4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                d4 d4Var2 = ((w3) obj4).l;
                i3 i3Var = d4Var2.Z0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z4;
                    if (d4Var2.z1) {
                        new qc(i3Var, f6Var).Q(z4 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z4 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z4) {
                        new qc(i3Var, f6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        qcVar = new qc(i3Var, f6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    qcVar = new qc(i3Var, f6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                kh.a2.v(i11, qcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.j5;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                kh.h2 h2Var = new kh.h2(chatActivityEnterView.getContext(), chatActivityEnterView.N, ((TLRPC.User) obj2).id, gg.p0.c(gg.p0.b(1, (List) obj)), null);
                h2Var.V(z4);
                h2Var.show();
                break;
        }
    }

    public /* synthetic */ d3(w3 w3Var, TL_stories.StoryItem storyItem, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = w3Var;
        this.d = storyItem;
        this.b = z4;
        this.e = f6Var;
    }

    public /* synthetic */ d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z4) {
        this.c = chatActivityEnterView;
        this.d = d2Var;
        this.e = user;
        this.b = z4;
    }
}
