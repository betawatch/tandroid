package ih;

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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q4 implements ok0 {
    public final /* synthetic */ m9 a;
    public final /* synthetic */ g5 b;

    public q4(g5 g5Var, m9 m9Var) {
        this.b = g5Var;
        this.a = m9Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean a(int i9, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c10;
        g5 g5Var = this.b;
        b bVar = g5Var.s;
        int i10 = g5Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            m9 m9Var = this.a;
            if (m9Var.v != null && (storyView = ((x4) g5Var.w.c.get(i9)).b) != null && (user = (messagesController = MessagesController.getInstance(i10)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i10).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = g5Var.d(storyView);
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
                x60 F = x60.F(m9Var.v, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || L || z11 || isUserSelf) ? false : true;
                final int i11 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: ih.o4
                    public final /* synthetic */ q4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        q4 q4Var = this.b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                g5 g5Var2 = q4Var.b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryHidFromToast, new Object[]{str3}, new oc(g5Var2, g5Var2.s), R.raw.ic_ban, 36);
                                n6Var2.a(g5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                g5 g5Var3 = q4Var.b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryShownBackToToast, new Object[]{str3}, new oc(g5Var3, g5Var3.s), R.raw.contact_check, 36);
                                n6Var2.a(g5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i12 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: ih.o4
                    public final /* synthetic */ q4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        q4 q4Var = this.b;
                        switch (i122) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                g5 g5Var2 = q4Var.b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryHidFromToast, new Object[]{str3}, new oc(g5Var2, g5Var2.s), R.raw.ic_ban, 36);
                                n6Var2.a(g5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                g5 g5Var3 = q4Var.b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryShownBackToToast, new Object[]{str3}, new oc(g5Var3, g5Var3.s), R.raw.contact_check, 36);
                                n6Var2.a(g5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!L || z11 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i13 = 0;
                F.m((z12 || z11 || isUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) { // from class: ih.p4
                    public final /* synthetic */ q4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                g5 g5Var2 = this.b.b;
                                new oc(g5Var2, g5Var2.s).e(true).j();
                                n6Var.a(g5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                v6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                g5 g5Var3 = this.b.b;
                                new oc(g5Var3, g5Var3.s).e(false).j();
                                n6Var.a(g5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i14 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: ih.p4
                    public final /* synthetic */ q4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                g5 g5Var2 = this.b.b;
                                new oc(g5Var2, g5Var2.s).e(true).j();
                                n6Var.a(g5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                v6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                g5 g5Var3 = this.b.b;
                                new oc(g5Var3, g5Var3.s).e(false).j();
                                n6Var.a(g5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z11 || isUserSelf) ? false : true);
                F.m(z12 && !isUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new bg.o0(this, user, str2, n6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.k5.h(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ca0 ca0Var = new ca0(g5Var.v, g5Var.getContext(), bVar, arrayList, 3);
                    ca0Var.setOnClickListener(new fg.f(this, arrayList, F, 12));
                    F.q(ca0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    g5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
