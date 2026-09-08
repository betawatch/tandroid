package bi;

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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class b6 implements bl0 {
    public final /* synthetic */ pb a;
    public final /* synthetic */ s6 b;

    public b6(s6 s6Var, pb pbVar) {
        this.b = s6Var;
        this.a = pbVar;
    }

    @Override // org.telegram.ui.Components.bl0
    public final boolean a(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c10;
        s6 s6Var = this.b;
        b bVar = s6Var.s;
        int i11 = s6Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            pb pbVar = this.a;
            if (pbVar.v != null && (storyView = ((i6) s6Var.w.c.get(i10)).b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = s6Var.d(storyView);
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
                n70 F = n70.F(pbVar.v, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || L || z11 || isUserSelf) ? false : true;
                final int i12 = 0;
                boolean z14 = z11;
                int i13 = 3;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: bi.z5
                    public final /* synthetic */ b6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        b6 b6Var = this.b;
                        switch (i14) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                s6 s6Var2 = b6Var.b;
                                i2.g.s(R.string.StoryHidFromToast, new Object[]{str3}, new yc(s6Var2, s6Var2.s), R.raw.ic_ban, 36);
                                n6Var2.a(s6Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                s6 s6Var3 = b6Var.b;
                                i2.g.s(R.string.StoryShownBackToToast, new Object[]{str3}, new yc(s6Var3, s6Var3.s), R.raw.contact_check, 36);
                                n6Var2.a(s6Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i14 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: bi.z5
                    public final /* synthetic */ b6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i142 = i14;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        b6 b6Var = this.b;
                        switch (i142) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                s6 s6Var2 = b6Var.b;
                                i2.g.s(R.string.StoryHidFromToast, new Object[]{str3}, new yc(s6Var2, s6Var2.s), R.raw.ic_ban, 36);
                                n6Var2.a(s6Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                s6 s6Var3 = b6Var.b;
                                i2.g.s(R.string.StoryShownBackToToast, new Object[]{str3}, new yc(s6Var3, s6Var3.s), R.raw.contact_check, 36);
                                n6Var2.a(s6Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!L || z14 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i15 = 0;
                F.m((z12 || z14 || isUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) { // from class: bi.a6
                    public final /* synthetic */ b6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                s6 s6Var2 = this.b.b;
                                new yc(s6Var2, s6Var2.s).e(true).j();
                                n6Var.a(s6Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                u8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                s6 s6Var3 = this.b.b;
                                new yc(s6Var3, s6Var3.s).e(false).j();
                                n6Var.a(s6Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i16 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: bi.a6
                    public final /* synthetic */ b6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                s6 s6Var2 = this.b.b;
                                new yc(s6Var2, s6Var2.s).e(true).j();
                                n6Var.a(s6Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                u8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                s6 s6Var3 = this.b.b;
                                new yc(s6Var3, s6Var3.s).e(false).j();
                                n6Var.a(s6Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z14 || isUserSelf) ? false : true);
                F.m(z12 && !isUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new z2(this, user, str2, n6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.q5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ua0 ua0Var = new ua0(s6Var.v, s6Var.getContext(), bVar, arrayList, 3);
                    ua0Var.setOnClickListener(new x(this, arrayList, F, i13));
                    F.q(ua0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    s6Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
