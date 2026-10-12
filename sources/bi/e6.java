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
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e6 implements cm0 {
    public final /* synthetic */ sb a;
    public final /* synthetic */ w6 b;

    public e6(w6 w6Var, sb sbVar) {
        this.b = w6Var;
        this.a = sbVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public final boolean a(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c10;
        w6 w6Var = this.b;
        b bVar = w6Var.s;
        int i11 = w6Var.v;
        if (view instanceof org.telegram.ui.Cells.o6) {
            final org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) view;
            sb sbVar = this.a;
            if (sbVar.v != null && (storyView = ((l6) w6Var.w.c.get(i10)).b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = w6Var.d(storyView);
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
                m80 F = m80.F(sbVar.v, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || L || z11 || isUserSelf) ? false : true;
                final int i12 = 0;
                boolean z14 = z11;
                int i13 = 3;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: bi.c6
                    public final /* synthetic */ e6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.o6 o6Var2 = o6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        e6 e6Var = this.b;
                        switch (i14) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                w6 w6Var2 = e6Var.b;
                                i2.d.q(R.string.StoryHidFromToast, new Object[]{str3}, new zc(w6Var2, w6Var2.s), R.raw.ic_ban, 36);
                                o6Var2.a(w6Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                w6 w6Var3 = e6Var.b;
                                i2.d.q(R.string.StoryShownBackToToast, new Object[]{str3}, new zc(w6Var3, w6Var3.s), R.raw.contact_check, 36);
                                o6Var2.a(w6Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i14 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: bi.c6
                    public final /* synthetic */ e6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i142 = i14;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.o6 o6Var2 = o6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        e6 e6Var = this.b;
                        switch (i142) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                w6 w6Var2 = e6Var.b;
                                i2.d.q(R.string.StoryHidFromToast, new Object[]{str3}, new zc(w6Var2, w6Var2.s), R.raw.ic_ban, 36);
                                o6Var2.a(w6Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                w6 w6Var3 = e6Var.b;
                                i2.d.q(R.string.StoryShownBackToToast, new Object[]{str3}, new zc(w6Var3, w6Var3.s), R.raw.contact_check, 36);
                                o6Var2.a(w6Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!L || z14 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i15 = 0;
                F.m((z12 || z14 || isUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) { // from class: bi.d6
                    public final /* synthetic */ e6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                w6 w6Var2 = this.b.b;
                                new zc(w6Var2, w6Var2.s).e(true).j();
                                o6Var.a(w6Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                x8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                w6 w6Var3 = this.b.b;
                                new zc(w6Var3, w6Var3.s).e(false).j();
                                o6Var.a(w6Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i16 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: bi.d6
                    public final /* synthetic */ e6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                w6 w6Var2 = this.b.b;
                                new zc(w6Var2, w6Var2.s).e(true).j();
                                o6Var.a(w6Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                x8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                w6 w6Var3 = this.b.b;
                                new zc(w6Var3, w6Var3.s).e(false).j();
                                o6Var.a(w6Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z14 || isUserSelf) ? false : true);
                F.m(z12 && !isUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new c3(this, user, str2, o6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.s5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ub0 ub0Var = new ub0(w6Var.v, 3, w6Var.getContext(), arrayList, bVar);
                    ub0Var.setOnClickListener(new x(this, arrayList, F, i13));
                    F.q(ub0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    w6Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
