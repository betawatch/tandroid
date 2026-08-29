package lh;

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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m4 implements bl0 {
    public final /* synthetic */ i9 a;
    public final /* synthetic */ c5 b;

    public m4(c5 c5Var, i9 i9Var) {
        this.b = c5Var;
        this.a = i9Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean c(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c3;
        c5 c5Var = this.b;
        b bVar = c5Var.s;
        int i11 = c5Var.v;
        if (view instanceof org.telegram.ui.Cells.l6) {
            final org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            i9 i9Var = this.a;
            if (i9Var.v != null && (storyView = ((t4) c5Var.w.c.get(i10)).b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = c5Var.d(storyView);
                boolean L = messagesController.getStoriesController().L(storyView);
                boolean isUserSelf = UserObject.isUserSelf(user);
                String str = TextUtils.isEmpty(user.first_name) ? TextUtils.isEmpty(user.last_name) ? "" : user.last_name : user.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (isUserSelf) {
                    return false;
                }
                j70 F = j70.F(i9Var.v, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || L || z11 || isUserSelf) ? false : true;
                final int i12 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: lh.k4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.b;
                        switch (i13) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                c5 c5Var2 = m4Var.b;
                                th.r(R.string.StoryHidFromToast, new Object[]{str3}, new tc(c5Var2, c5Var2.s), R.raw.ic_ban, 36);
                                l6Var2.a(c5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                c5 c5Var3 = m4Var.b;
                                th.r(R.string.StoryShownBackToToast, new Object[]{str3}, new tc(c5Var3, c5Var3.s), R.raw.contact_check, 36);
                                l6Var2.a(c5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i13 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: lh.k4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i13;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.b;
                        switch (i132) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                c5 c5Var2 = m4Var.b;
                                th.r(R.string.StoryHidFromToast, new Object[]{str3}, new tc(c5Var2, c5Var2.s), R.raw.ic_ban, 36);
                                l6Var2.a(c5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                c5 c5Var3 = m4Var.b;
                                th.r(R.string.StoryShownBackToToast, new Object[]{str3}, new tc(c5Var3, c5Var3.s), R.raw.contact_check, 36);
                                l6Var2.a(c5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!L || z11 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i14 = 0;
                F.m((z12 || z11 || isUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) { // from class: lh.l4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                c5 c5Var2 = this.b.b;
                                new tc(c5Var2, c5Var2.s).e(true).j();
                                l6Var.a(c5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                s6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                c5 c5Var3 = this.b.b;
                                new tc(c5Var3, c5Var3.s).e(false).j();
                                l6Var.a(c5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i15 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: lh.l4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                c5 c5Var2 = this.b.b;
                                new tc(c5Var2, c5Var2.s).e(true).j();
                                l6Var.a(c5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                s6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                c5 c5Var3 = this.b.b;
                                new tc(c5Var3, c5Var3.s).e(false).j();
                                l6Var.a(c5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z11 || isUserSelf) ? false : true);
                F.m(z12 && !isUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new eg.k0(this, user, str2, l6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c3 = org.telegram.ui.Components.p5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3);
                    qa0 qa0Var = new qa0(c5Var.v, c5Var.getContext(), bVar, arrayList, 3);
                    qa0Var.setOnClickListener(new bg.q(this, arrayList, F, 13));
                    F.q(qa0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    c5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
