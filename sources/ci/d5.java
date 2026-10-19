package ci;

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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class d5 implements yl0 {
    public final /* synthetic */ aa a;
    public final /* synthetic */ u5 b;

    public d5(u5 u5Var, aa aaVar) {
        this.b = u5Var;
        this.a = aaVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean a(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c10;
        u5 u5Var = this.b;
        b bVar = u5Var.s;
        int i11 = u5Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            aa aaVar = this.a;
            if (aaVar.v != null && (storyView = ((k5) u5Var.w.c.get(i10)).b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = u5Var.d(storyView);
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
                i80 F = i80.F(aaVar.v, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || L || z11 || isUserSelf) ? false : true;
                final int i12 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: ci.b5
                    public final /* synthetic */ d5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        d5 d5Var = this.b;
                        switch (i13) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                u5 u5Var2 = d5Var.b;
                                i2.e.s(R.string.StoryHidFromToast, new Object[]{str3}, new xc(u5Var2, u5Var2.s), R.raw.ic_ban, 36);
                                n6Var2.a(u5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                u5 u5Var3 = d5Var.b;
                                i2.e.s(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(u5Var3, u5Var3.s), R.raw.contact_check, 36);
                                n6Var2.a(u5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i13 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: ci.b5
                    public final /* synthetic */ d5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i13;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        d5 d5Var = this.b;
                        switch (i132) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                u5 u5Var2 = d5Var.b;
                                i2.e.s(R.string.StoryHidFromToast, new Object[]{str3}, new xc(u5Var2, u5Var2.s), R.raw.ic_ban, 36);
                                n6Var2.a(u5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                u5 u5Var3 = d5Var.b;
                                i2.e.s(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(u5Var3, u5Var3.s), R.raw.contact_check, 36);
                                n6Var2.a(u5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!L || z11 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i14 = 0;
                F.m((z12 || z11 || isUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) { // from class: ci.c5
                    public final /* synthetic */ d5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                u5 u5Var2 = this.b.b;
                                new xc(u5Var2, u5Var2.s).e(true).j();
                                n6Var.a(u5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                i7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                u5 u5Var3 = this.b.b;
                                new xc(u5Var3, u5Var3.s).e(false).j();
                                n6Var.a(u5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i15 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: ci.c5
                    public final /* synthetic */ d5 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                u5 u5Var2 = this.b.b;
                                new xc(u5Var2, u5Var2.s).e(true).j();
                                n6Var.a(u5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                i7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                u5 u5Var3 = this.b.b;
                                new xc(u5Var3, u5Var3.s).e(false).j();
                                n6Var.a(u5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z11 || isUserSelf) ? false : true);
                F.m(z12 && !isUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new ai.t0(this, user, str2, n6Var, storyView, 11));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.r5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ob0 ob0Var = new ob0(u5Var.v, 3, u5Var.getContext(), arrayList, bVar);
                    ob0Var.setOnClickListener(new ai.v0(this, arrayList, F, 6));
                    F.q(ob0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    u5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
