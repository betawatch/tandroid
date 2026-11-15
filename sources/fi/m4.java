package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m4 implements ij0 {
    public final /* synthetic */ i9 a;
    public final /* synthetic */ c5 b;

    public m4(c5 c5Var, i9 i9Var) {
        this.b = c5Var;
        this.a = i9Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public final boolean b(int i7, View view) {
        final TL_stories.StoryView storyView;
        final np s12;
        final TLRPC.User a22;
        boolean z10;
        TLRPC.InputStickerSet c10;
        c5 c5Var = this.b;
        b bVar = c5Var.s;
        int i10 = c5Var.w;
        if (view instanceof org.telegram.ui.Cells.l6) {
            final org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            i9 i9Var = this.a;
            if (i9Var.w != null && (storyView = ((t4) c5Var.x.c.get(i7)).b) != null && (a22 = (s12 = np.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = s12.H0.indexOfKey(a22.id) >= 0;
                boolean z12 = a22.contact || org.telegram.messenger.g5.r(i10).g0.get(Long.valueOf(a22.id)) != null;
                boolean d = c5Var.d(storyView);
                boolean N = s12.P1().N(storyView);
                boolean B = q10.B(a22);
                String str = TextUtils.isEmpty(a22.first_name) ? TextUtils.isEmpty(a22.last_name) ? "" : a22.last_name : a22.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (B) {
                    return false;
                }
                m60 F = m60.F(i9Var.w, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || N || z11 || B) ? false : true;
                final int i11 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, hd.a0(null, null, 2131744662, str), new Runnable(this) { // from class: fi.k4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        np npVar = s12;
                        m4 m4Var = this.b;
                        switch (i12) {
                            case 0:
                                npVar.P1().m0(user.id, true, true);
                                c5 c5Var2 = m4Var.b;
                                new cc(c5Var2, c5Var2.s).Q(R.raw.ic_ban, 36, hd.a0(null, null, 2131744663, str3)).j();
                                l6Var2.a(true, c5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                npVar.P1().m0(user.id, false, true);
                                c5 c5Var3 = m4Var.b;
                                new cc(c5Var3, c5Var3.s).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131744461, str3)).j();
                                l6Var2.a(true, c5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i12 = 1;
                F.l(R.drawable.msg_menu_stories, hd.a0(null, null, 2131744462, str2), new Runnable(this) { // from class: fi.k4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        np npVar = s12;
                        m4 m4Var = this.b;
                        switch (i122) {
                            case 0:
                                npVar.P1().m0(user.id, true, true);
                                c5 c5Var2 = m4Var.b;
                                new cc(c5Var2, c5Var2.s).Q(R.raw.ic_ban, 36, hd.a0(null, null, 2131744663, str3)).j();
                                l6Var2.a(true, c5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                npVar.P1().m0(user.id, false, true);
                                c5 c5Var3 = m4Var.b;
                                new cc(c5Var3, c5Var3.s).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131744461, str3)).j();
                                l6Var2.a(true, c5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (!N || z11 || B) ? false : true);
                F.E();
                F.t();
                final int i13 = 0;
                F.m(R.drawable.msg_user_remove, new Runnable(this) { // from class: fi.l4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                s12.w(a22.id);
                                c5 c5Var2 = this.b.b;
                                new cc(c5Var2, c5Var2.s).e(true).j();
                                l6Var.a(true, c5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                np npVar = s12;
                                s6 P1 = npVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.id, false, true);
                                npVar.g5(null, user.id);
                                c5 c5Var3 = this.b.b;
                                new cc(c5Var3, c5Var3.s).e(false).j();
                                l6Var.a(true, c5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, hd.M0(2131753692, null), (z12 || z11 || B) ? false : true, true);
                final int i14 = 1;
                F.l(R.drawable.msg_block, hd.M0(2131743911, null), new Runnable(this) { // from class: fi.l4
                    public final /* synthetic */ m4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                s12.w(a22.id);
                                c5 c5Var2 = this.b.b;
                                new cc(c5Var2, c5Var2.s).e(true).j();
                                l6Var.a(true, c5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                np npVar = s12;
                                s6 P1 = npVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.id, false, true);
                                npVar.g5(null, user.id);
                                c5 c5Var3 = this.b.b;
                                new cc(c5Var3, c5Var3.s).e(false).j();
                                l6Var.a(true, c5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (z12 || !z11 || B) ? false : true);
                F.m(R.drawable.msg_user_remove, new ai.b(this, a22, str2, l6Var, storyView, 13), hd.M0(2131744687, null), z12 && !B, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.g5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    n90 n90Var = new n90(c5Var.w, 3, c5Var.getContext(), arrayList, bVar);
                    n90Var.setOnClickListener(new ah.g(this, arrayList, F, 12));
                    F.q(n90Var);
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
