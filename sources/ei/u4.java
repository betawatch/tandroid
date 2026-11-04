package ei;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u4 implements hj0 {
    public final /* synthetic */ r9 a;
    public final /* synthetic */ k5 b;

    public u4(k5 k5Var, r9 r9Var) {
        this.b = k5Var;
        this.a = r9Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public final boolean f(int i3, View view) {
        final TL_stories.StoryView storyView;
        final hp s12;
        final TLRPC.User a22;
        boolean z10;
        TLRPC.InputStickerSet c2;
        k5 k5Var = this.b;
        b bVar = k5Var.s;
        int i10 = k5Var.w;
        if (view instanceof org.telegram.ui.Cells.l6) {
            final org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            r9 r9Var = this.a;
            if (r9Var.w != null && (storyView = ((b5) k5Var.x.c.get(i3)).b) != null && (a22 = (s12 = hp.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = s12.H0.indexOfKey(a22.id) >= 0;
                boolean z12 = a22.contact || org.telegram.messenger.g5.r(i10).g0.get(Long.valueOf(a22.id)) != null;
                boolean d = k5Var.d(storyView);
                boolean N = s12.P1().N(storyView);
                boolean B = l10.B(a22);
                String str = TextUtils.isEmpty(a22.first_name) ? TextUtils.isEmpty(a22.last_name) ? "" : a22.last_name : a22.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (B) {
                    return false;
                }
                f60 F = f60.F(r9Var.w, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, bVar)));
                F.s = 133;
                boolean z13 = (!d || N || z11 || B) ? false : true;
                final int i11 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, bd.a0(null, null, 2131744672, str), new Runnable(this) { // from class: ei.s4
                    public final /* synthetic */ u4 b;

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
                        hp hpVar = s12;
                        u4 u4Var = this.b;
                        switch (i12) {
                            case 0:
                                hpVar.P1().m0(user.id, true, true);
                                k5 k5Var2 = u4Var.b;
                                new fc(k5Var2, k5Var2.s).Q(R.raw.ic_ban, 36, bd.a0(null, null, 2131744673, str3)).j();
                                l6Var2.a(true, k5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                hpVar.P1().m0(user.id, false, true);
                                k5 k5Var3 = u4Var.b;
                                new fc(k5Var3, k5Var3.s).Q(R.raw.contact_check, 36, bd.a0(null, null, 2131744471, str3)).j();
                                l6Var2.a(true, k5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                final int i12 = 1;
                F.l(R.drawable.msg_menu_stories, bd.a0(null, null, 2131744472, str2), new Runnable(this) { // from class: ei.s4
                    public final /* synthetic */ u4 b;

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
                        hp hpVar = s12;
                        u4 u4Var = this.b;
                        switch (i122) {
                            case 0:
                                hpVar.P1().m0(user.id, true, true);
                                k5 k5Var2 = u4Var.b;
                                new fc(k5Var2, k5Var2.s).Q(R.raw.ic_ban, 36, bd.a0(null, null, 2131744673, str3)).j();
                                l6Var2.a(true, k5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                hpVar.P1().m0(user.id, false, true);
                                k5 k5Var3 = u4Var.b;
                                new fc(k5Var3, k5Var3.s).Q(R.raw.contact_check, 36, bd.a0(null, null, 2131744471, str3)).j();
                                l6Var2.a(true, k5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (!N || z11 || B) ? false : true);
                F.E();
                F.t();
                final int i13 = 0;
                F.m(R.drawable.msg_user_remove, new Runnable(this) { // from class: ei.t4
                    public final /* synthetic */ u4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                s12.w(a22.id);
                                k5 k5Var2 = this.b.b;
                                new fc(k5Var2, k5Var2.s).e(true).j();
                                l6Var.a(true, k5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                hp hpVar = s12;
                                z6 P1 = hpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.id, false, true);
                                hpVar.f5(null, user.id);
                                k5 k5Var3 = this.b.b;
                                new fc(k5Var3, k5Var3.s).e(false).j();
                                l6Var.a(true, k5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, bd.M0(2131753692, null), (z12 || z11 || B) ? false : true, true);
                final int i14 = 1;
                F.l(R.drawable.msg_block, bd.M0(2131743921, null), new Runnable(this) { // from class: ei.t4
                    public final /* synthetic */ u4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                s12.w(a22.id);
                                k5 k5Var2 = this.b.b;
                                new fc(k5Var2, k5Var2.s).e(true).j();
                                l6Var.a(true, k5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                hp hpVar = s12;
                                z6 P1 = hpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.id, false, true);
                                hpVar.f5(null, user.id);
                                k5 k5Var3 = this.b.b;
                                new fc(k5Var3, k5Var3.s).e(false).j();
                                l6Var.a(true, k5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (z12 || !z11 || B) ? false : true);
                F.m(R.drawable.msg_user_remove, new ai.t6(this, a22, str2, l6Var, storyView, 12), bd.M0(2131744697, null), z12 && !B, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c2 = org.telegram.ui.Components.g5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c2);
                    h90 h90Var = new h90(k5Var.w, 3, k5Var.getContext(), arrayList, bVar);
                    h90Var.setOnClickListener(new ai.h(this, arrayList, F, 12));
                    F.q(h90Var);
                    z10 = true;
                }
                if (F.x() <= 0 && !z10) {
                    return false;
                }
                F.Z();
                try {
                    k5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
