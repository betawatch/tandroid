package ai;

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
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class s6 implements ll0 {
    public final /* synthetic */ jc a;
    public final /* synthetic */ j7 b;

    public s6(j7 j7Var, jc jcVar) {
        this.b = j7Var;
        this.a = jcVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean d(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        TLRPC.InputStickerSet c10;
        j7 j7Var = this.b;
        d dVar = j7Var.s;
        int i11 = j7Var.v;
        if (view instanceof org.telegram.ui.Cells.p6) {
            final org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) view;
            jc jcVar = this.a;
            if (jcVar.v != null && (storyView = ((z6) j7Var.w.c.get(i10)).b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.id)) != null;
                boolean d = j7Var.d(storyView);
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
                v70 F = v70.F(jcVar.v, dVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, dVar)));
                F.s = 133;
                boolean z13 = (!d || L || z11 || isUserSelf) ? false : true;
                final int i12 = 0;
                boolean z14 = z11;
                int i13 = 3;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) { // from class: ai.q6
                    public final /* synthetic */ s6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.p6 p6Var2 = p6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        s6 s6Var = this.b;
                        switch (i14) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                j7 j7Var2 = s6Var.b;
                                hg.k0.q(R.string.StoryHidFromToast, new Object[]{str3}, new xc(j7Var2, j7Var2.s), R.raw.ic_ban, 36);
                                p6Var2.a(j7Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                j7 j7Var3 = s6Var.b;
                                hg.k0.q(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(j7Var3, j7Var3.s), R.raw.contact_check, 36);
                                p6Var2.a(j7Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i14 = 1;
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) { // from class: ai.q6
                    public final /* synthetic */ s6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i142 = i14;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.p6 p6Var2 = p6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        s6 s6Var = this.b;
                        switch (i142) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.id, true, true);
                                j7 j7Var2 = s6Var.b;
                                hg.k0.q(R.string.StoryHidFromToast, new Object[]{str3}, new xc(j7Var2, j7Var2.s), R.raw.ic_ban, 36);
                                p6Var2.a(j7Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.id, false, true);
                                j7 j7Var3 = s6Var.b;
                                hg.k0.q(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(j7Var3, j7Var3.s), R.raw.contact_check, 36);
                                p6Var2.a(j7Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!L || z14 || isUserSelf) ? false : true);
                F.E();
                F.t();
                final int i15 = 0;
                F.m((z12 || z14 || isUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) { // from class: ai.r6
                    public final /* synthetic */ s6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                j7 j7Var2 = this.b.b;
                                new xc(j7Var2, j7Var2.s).e(true).j();
                                p6Var.a(j7Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                l9 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                j7 j7Var3 = this.b.b;
                                new xc(j7Var3, j7Var3.s).e(false).j();
                                p6Var.a(j7Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i16 = 1;
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) { // from class: ai.r6
                    public final /* synthetic */ s6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i16) {
                            case 0:
                                messagesController.blockPeer(user.id);
                                j7 j7Var2 = this.b.b;
                                new xc(j7Var2, j7Var2.s).e(true).j();
                                p6Var.a(j7Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                l9 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.id, false, true);
                                messagesController2.unblockPeer(user2.id);
                                j7 j7Var3 = this.b.b;
                                new xc(j7Var3, j7Var3.s).e(false).j();
                                p6Var.a(j7Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z14 || isUserSelf) ? false : true);
                F.m(z12 && !isUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new m3(this, user, str2, p6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.p5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    bb0 bb0Var = new bb0(j7Var.v, j7Var.getContext(), dVar, arrayList, 3);
                    bb0Var.setOnClickListener(new d0(this, arrayList, F, i13));
                    F.q(bb0Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    j7Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
