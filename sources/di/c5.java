package di;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c5 implements cm0 {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ t5 b;

    public c5(t5 t5Var, y9 y9Var) {
        this.b = t5Var;
        this.a = y9Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public final boolean c(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c10;
        t5 t5Var = this.b;
        b bVar = t5Var.s;
        int i11 = t5Var.v;
        if (view instanceof org.telegram.ui.Cells.s6) {
            final org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) view;
            y9 y9Var = this.a;
            if (y9Var.v != null && (storyView = ((j5) t5Var.w.c.get(i10)).b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = t5Var.d(storyView);
                boolean N = messagesController.getStoriesController().N(storyView);
                boolean isUserSelf = UserObject.isUserSelf(user);
                String str = TextUtils.isEmpty(user.first_name) ? TextUtils.isEmpty(user.last_name) ? "" : user.last_name : user.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (isUserSelf) {
                    return false;
                }
                l80 F = l80.F(y9Var.v, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || N || z11 || isUserSelf) ? false : true;
                final int i12 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: di.a5
                    public final /* synthetic */ c5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.s6 s6Var2 = s6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        c5 c5Var = this.b;
                        switch (i13) {
                            case 0:
                                messagesController2.getStoriesController().m0(user2.id, true, true);
                                t5 t5Var2 = c5Var.b;
                                ic.a.s(R.string.StoryHidFromToast, new Object[]{str3}, new wc(t5Var2, t5Var2.s), R.raw.ic_ban, 36);
                                s6Var2.a(t5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().m0(user2.id, false, true);
                                t5 t5Var3 = c5Var.b;
                                ic.a.s(R.string.StoryShownBackToToast, new Object[]{str3}, new wc(t5Var3, t5Var3.s), R.raw.contact_check, 36);
                                s6Var2.a(t5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i13 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: di.a5
                    public final /* synthetic */ c5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i13;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.s6 s6Var2 = s6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        c5 c5Var = this.b;
                        switch (i132) {
                            case 0:
                                messagesController2.getStoriesController().m0(user2.id, true, true);
                                t5 t5Var2 = c5Var.b;
                                ic.a.s(R.string.StoryHidFromToast, new Object[]{str3}, new wc(t5Var2, t5Var2.s), R.raw.ic_ban, 36);
                                s6Var2.a(t5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().m0(user2.id, false, true);
                                t5 t5Var3 = c5Var.b;
                                ic.a.s(R.string.StoryShownBackToToast, new Object[]{str3}, new wc(t5Var3, t5Var3.s), R.raw.contact_check, 36);
                                s6Var2.a(t5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!N || z11 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i14 = 0;
                F.m(R.drawable.msg_user_remove, new Runnable(this) { // from class: di.b5
                    public final /* synthetic */ c5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                t5 t5Var2 = this.b.b;
                                new wc(t5Var2, t5Var2.s).e(true).j();
                                s6Var.a(t5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                h7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.m0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                t5 t5Var3 = this.b.b;
                                new wc(t5Var3, t5Var3.s).e(false).j();
                                s6Var.a(t5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, LocaleController.getString(R.string.BlockUser), (z12 || z11 || isUserSelf) ? false : true, true);
                final int i15 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: di.b5
                    public final /* synthetic */ c5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                t5 t5Var2 = this.b.b;
                                new wc(t5Var2, t5Var2.s).e(true).j();
                                s6Var.a(t5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                h7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.m0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                t5 t5Var3 = this.b.b;
                                new wc(t5Var3, t5Var3.s).e(false).j();
                                s6Var.a(t5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z11 || isUserSelf) ? false : true);
                F.m(R.drawable.msg_user_remove, new bi.u0(this, user, str2, s6Var, storyView, 11), LocaleController.getString(R.string.StoryDeleteContact), z12 && !isUserSelf, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.t5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    nb0 nb0Var = new nb0(t5Var.v, 3, t5Var.getContext(), arrayList, bVar);
                    nb0Var.setOnClickListener(new bi.w0(this, arrayList, F, 6));
                    F.q(nb0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    t5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
