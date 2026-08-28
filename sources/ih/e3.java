package ih;

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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e3(f3 f3Var, boolean z10, hg.r0 r0Var, View view) {
        this.c = f3Var;
        this.b = z10;
        this.d = r0Var;
        this.e = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        hg.n0 n0Var;
        TLRPC.Document f10;
        oc ocVar;
        int i9;
        int i10;
        int i11 = this.a;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i11) {
            case 0:
                f3 f3Var = (f3) obj4;
                hg.r0 r0Var = (hg.r0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                i4 i4Var = f3Var.a;
                if (!z10 || r0Var.f == null) {
                    n0Var = new hg.n0(view.getContext(), null, i4Var.b2, null, view, i4Var.getMeasuredWidth() / 2.0f, i4Var.getMeasuredHeight() / 2.0f, r0Var, i4Var.y2, 2, true);
                } else {
                    try {
                        i4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    n0Var = new hg.n0(view.getContext(), null, i4Var.b2, null, view, i4Var.getMeasuredWidth() / 2.0f, i4Var.getMeasuredHeight() / 2.0f, r0Var, i4Var.y2, 0, true);
                }
                hg.n0.B = n0Var;
                int i12 = R.id.parent_tag;
                hg.k0 k0Var = n0Var.i;
                k0Var.setTag(i12, 1);
                i4Var.addView(k0Var);
                g4 g4Var = i4Var.K1;
                n0Var.s = true;
                n0Var.y = System.currentTimeMillis();
                if (r0Var.f != null) {
                    f10 = MediaDataController.getInstance(i4Var.y2).getEmojiAnimatedSticker(r0Var.f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(r0Var.f, i4Var.x1);
                    of2.replyToStoryItem = g4Var.a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(i4Var.y2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.k5.f(i4Var.y2, r0Var.g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (i4Var.b2.getReactionsWindow() != null) {
                            i4Var.b2.getReactionsWindow().e();
                        }
                        i4Var.s0();
                        break;
                    } else {
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, i4Var.x1);
                        of3.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = r0Var.g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                        of3.entities.add(tL_messageEntityCustomEmoji);
                        of3.replyToStoryItem = g4Var.a;
                        of3.payStars = l10.longValue();
                        SendMessagesHelper.getInstance(i4Var.y2).sendMessage(of3);
                    }
                }
                if (l10.longValue() <= 0) {
                    gc q10 = new oc(i4Var.Y0, i4Var.x0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new g(f3Var, 4));
                    q10.j = 5000;
                    q10.j();
                }
                if (i4Var.b2.getReactionsWindow() != null) {
                    i4Var.b2.getReactionsWindow().e();
                }
                i4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                i4 i4Var2 = ((b4) obj4).l;
                l3 l3Var = i4Var2.Y0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (i4Var2.y1) {
                        new oc(l3Var, b6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                        break;
                    } else if (z10) {
                        new oc(l3Var, b6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        break;
                    } else {
                        ocVar = new oc(l3Var, b6Var);
                        i9 = R.raw.chats_archived;
                        i10 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    ocVar = new oc(l3Var, b6Var);
                    i9 = R.raw.error;
                    i10 = R.string.UnknownError;
                }
                org.telegram.messenger.l0.p(i10, ocVar, i9, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i13 = ChatActivityEnterView.i5;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                fh.p2 p2Var = new fh.p2(chatActivityEnterView.getContext(), chatActivityEnterView.M, ((TLRPC.User) obj2).id, bg.u0.c(bg.u0.b(1, (List) obj)), null);
                p2Var.U(z10);
                p2Var.show();
                break;
        }
    }

    public /* synthetic */ e3(b4 b4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.c = b4Var;
        this.d = storyItem;
        this.b = z10;
        this.e = b6Var;
    }

    public /* synthetic */ e3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, boolean z10) {
        this.c = chatActivityEnterView;
        this.d = c2Var;
        this.e = user;
        this.b = z10;
    }
}
