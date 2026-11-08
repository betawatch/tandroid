package di;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l90;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u4 implements dj0 {
    public final /* synthetic */ p9 a;
    public final /* synthetic */ k5 b;

    public u4(k5 k5Var, p9 p9Var) {
        this.b = k5Var;
        this.a = p9Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public final boolean c(int i7, View view) {
        final TL_stories.StoryView storyView;
        final qp s12;
        final TLRPC.User a22;
        boolean z9;
        TLRPC.InputStickerSet c10;
        k5 k5Var = this.b;
        b bVar = k5Var.s;
        int i10 = k5Var.w;
        if (view instanceof org.telegram.ui.Cells.m6) {
            final org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            p9 p9Var = this.a;
            if (p9Var.w != null && (storyView = ((b5) k5Var.x.c.get(i7)).b) != null && (a22 = (s12 = qp.s1(i10)).a2(Long.valueOf(storyView.user_id))) != null) {
                boolean z10 = s12.G0.indexOfKey(a22.id) >= 0;
                boolean z11 = a22.contact || org.telegram.messenger.g5.r(i10).f0.get(Long.valueOf(a22.id)) != null;
                boolean d = k5Var.d(storyView);
                boolean N = s12.P1().N(storyView);
                boolean B = t10.B(a22);
                String str = TextUtils.isEmpty(a22.first_name) ? TextUtils.isEmpty(a22.last_name) ? "" : a22.last_name : a22.first_name;
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (B) {
                    return false;
                }
                k60 F = k60.F(p9Var.w, bVar, view);
                F.i = 3;
                F.j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, bVar)));
                F.s = 133;
                boolean z12 = (!d || N || z10 || B) ? false : true;
                final int i11 = 0;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, id.a0(null, null, 2131744665, str), new Runnable(this) { // from class: di.s4
                    public final /* synthetic */ u4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        qp qpVar = s12;
                        u4 u4Var = this.b;
                        switch (i12) {
                            case 0:
                                qpVar.P1().m0(user.id, true, true);
                                k5 k5Var2 = u4Var.b;
                                new hc(k5Var2, k5Var2.s).Q(R.raw.ic_ban, 36, id.a0(null, null, 2131744666, str3)).j();
                                m6Var2.a(true, k5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                qpVar.P1().m0(user.id, false, true);
                                k5 k5Var3 = u4Var.b;
                                new hc(k5Var3, k5Var3.s).Q(R.raw.contact_check, 36, id.a0(null, null, 2131744464, str3)).j();
                                m6Var2.a(true, k5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                final int i12 = 1;
                F.l(R.drawable.msg_menu_stories, id.a0(null, null, 2131744465, str2), new Runnable(this) { // from class: di.s4
                    public final /* synthetic */ u4 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user = a22;
                        qp qpVar = s12;
                        u4 u4Var = this.b;
                        switch (i122) {
                            case 0:
                                qpVar.P1().m0(user.id, true, true);
                                k5 k5Var2 = u4Var.b;
                                new hc(k5Var2, k5Var2.s).Q(R.raw.ic_ban, 36, id.a0(null, null, 2131744666, str3)).j();
                                m6Var2.a(true, k5Var2.d(storyView2) ? 1.0f : 0.5f);
                                break;
                            default:
                                qpVar.P1().m0(user.id, false, true);
                                k5 k5Var3 = u4Var.b;
                                new hc(k5Var3, k5Var3.s).Q(R.raw.contact_check, 36, id.a0(null, null, 2131744464, str3)).j();
                                m6Var2.a(true, k5Var3.d(storyView2) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (!N || z10 || B) ? false : true);
                F.E();
                F.t();
                final int i13 = 0;
                F.m(R.drawable.msg_user_remove, new Runnable(this) { // from class: di.t4
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
                                new hc(k5Var2, k5Var2.s).e(true).j();
                                m6Var.a(true, k5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                qp qpVar = s12;
                                y6 P1 = qpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.id, false, true);
                                qpVar.f5(null, user.id);
                                k5 k5Var3 = this.b.b;
                                new hc(k5Var3, k5Var3.s).e(false).j();
                                m6Var.a(true, k5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, id.M0(2131753692, null), (z11 || z10 || B) ? false : true, true);
                final int i14 = 1;
                F.l(R.drawable.msg_block, id.M0(2131743914, null), new Runnable(this) { // from class: di.t4
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
                                new hc(k5Var2, k5Var2.s).e(true).j();
                                m6Var.a(true, k5Var2.d(storyView) ? 1.0f : 0.5f);
                                break;
                            default:
                                qp qpVar = s12;
                                y6 P1 = qpVar.P1();
                                TLRPC.User user = a22;
                                P1.m0(user.id, false, true);
                                qpVar.f5(null, user.id);
                                k5 k5Var3 = this.b.b;
                                new hc(k5Var3, k5Var3.s).e(false).j();
                                m6Var.a(true, k5Var3.d(storyView) ? 1.0f : 0.5f);
                                break;
                        }
                    }
                }, (z11 || !z10 || B) ? false : true);
                F.m(R.drawable.msg_user_remove, new bi.u0(this, a22, str2, m6Var, storyView, 11), id.M0(2131744690, null), z11 && !B, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c10 = org.telegram.ui.Components.i5.g(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z9 = false;
                } else {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    l90 l90Var = new l90(k5Var.w, 3, k5Var.getContext(), arrayList, bVar);
                    l90Var.setOnClickListener(new ah.g(this, arrayList, F, 7));
                    F.q(l90Var);
                    z9 = true;
                }
                if (F.x() <= 0 && !z9) {
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
