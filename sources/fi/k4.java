package fi;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class k4 implements sj0 {
    public final /* synthetic */ f9 a;
    public final /* synthetic */ b5 b;

    public k4(b5 b5Var, f9 f9Var) {
        this.b = b5Var;
        this.a = f9Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean c(int i7, View view) {
        final TL_stories.StoryView storyView;
        final mp u12;
        final TLRPC.User c22;
        boolean z10;
        TLRPC.InputStickerSet c10;
        b5 b5Var = this.b;
        b bVar = b5Var.s;
        int i10 = b5Var.w;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            f9 f9Var = this.a;
            if (f9Var.w != null && (storyView = ((s4) b5Var.x.c.get(i7)).b) != null && (c22 = (u12 = mp.u1(i10)).c2(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = u12.H0.indexOfKey(c22.id) >= 0;
                boolean z12 = c22.contact || org.telegram.messenger.i5.r(i10).g0.get(Long.valueOf(c22.id)) != null;
                boolean d = b5Var.d(storyView);
                boolean N = u12.R1().N(storyView);
                boolean C = o10.C(c22);
                String str = TextUtils.isEmpty(c22.first_name) ? TextUtils.isEmpty(c22.last_name) ? "" : c22.last_name : c22.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (C) {
                    return false;
                }
                a70 G = a70.G(f9Var.w, bVar, view);
                G.i = 3;
                G.j = true;
                G.X(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, bVar)));
                G.s = 133;
                boolean z13 = (!d || N || z11 || C) ? false : true;
                final int i11 = 0;
                final String str2 = str;
                G.l(R.drawable.msg_stories_myhide, gd.a0(null, null, 2131744421, str), new Runnable(this) { // from class: fi.i4
                    public final /* synthetic */ k4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user = c22;
                        mp mpVar = u12;
                        k4 k4Var = this.b;
                        switch (i12) {
                            case 0:
                                mpVar.R1().m0(user.id, true, true);
                                b5 b5Var2 = k4Var.b;
                                new lc(b5Var2, b5Var2.s).Q(R.raw.ic_ban, 36, gd.a0(null, null, 2131744422, str3)).j();
                                n6Var2.a(true, b5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                mpVar.R1().m0(user.id, false, true);
                                b5 b5Var3 = k4Var.b;
                                new lc(b5Var3, b5Var3.s).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131744220, str3)).j();
                                n6Var2.a(true, b5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, z13);
                G.F();
                G.u();
                final int i12 = 1;
                G.l(R.drawable.msg_menu_stories, gd.a0(null, null, 2131744221, str2), new Runnable(this) { // from class: fi.i4
                    public final /* synthetic */ k4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user = c22;
                        mp mpVar = u12;
                        k4 k4Var = this.b;
                        switch (i122) {
                            case 0:
                                mpVar.R1().m0(user.id, true, true);
                                b5 b5Var2 = k4Var.b;
                                new lc(b5Var2, b5Var2.s).Q(R.raw.ic_ban, 36, gd.a0(null, null, 2131744422, str3)).j();
                                n6Var2.a(true, b5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                mpVar.R1().m0(user.id, false, true);
                                b5 b5Var3 = k4Var.b;
                                new lc(b5Var3, b5Var3.s).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131744220, str3)).j();
                                n6Var2.a(true, b5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (!N || z11 || C) ? false : true);
                G.F();
                G.u();
                final int i13 = 0;
                G.m(R.drawable.msg_user_remove, new Runnable(this) { // from class: fi.j4
                    public final /* synthetic */ k4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                u12.w(c22.id);
                                b5 b5Var2 = this.b.b;
                                new lc(b5Var2, b5Var2.s).e(true).j();
                                n6Var.a(true, b5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                mp mpVar = u12;
                                p6 R1 = mpVar.R1();
                                TLRPC.User user = c22;
                                R1.m0(user.id, false, true);
                                mpVar.r5(null, user.id);
                                b5 b5Var3 = this.b.b;
                                new lc(b5Var3, b5Var3.s).e(false).j();
                                n6Var.a(true, b5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, gd.N0(2131753689, null), (z12 || z11 || C) ? false : true, true);
                final int i14 = 1;
                G.l(R.drawable.msg_block, gd.N0(2131743668, null), new Runnable(this) { // from class: fi.j4
                    public final /* synthetic */ k4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                u12.w(c22.id);
                                b5 b5Var2 = this.b.b;
                                new lc(b5Var2, b5Var2.s).e(true).j();
                                n6Var.a(true, b5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                mp mpVar = u12;
                                p6 R1 = mpVar.R1();
                                TLRPC.User user = c22;
                                R1.m0(user.id, false, true);
                                mpVar.r5(null, user.id);
                                b5 b5Var3 = this.b.b;
                                new lc(b5Var3, b5Var3.s).e(false).j();
                                n6Var.a(true, b5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (z12 || !z11 || C) ? false : true);
                G.m(R.drawable.msg_user_remove, new ai.b(this, c22, str2, n6Var, storyView, 14), gd.N0(2131744446, null), z12 && !C, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.p5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    G.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    aa0 aa0Var = new aa0(b5Var.w, 3, b5Var.getContext(), arrayList, bVar);
                    aa0Var.setOnClickListener(new ah.h(this, arrayList, G, 12));
                    G.q(aa0Var);
                    z10 = true;
                }
                if (G.y() <= 0 && !z10) {
                    return false;
                }
                G.a0();
                try {
                    b5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
