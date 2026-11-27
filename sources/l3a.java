// default package

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class l3a implements t69 {
    public final /* synthetic */ lcb a;
    public final /* synthetic */ z3a b;

    public l3a(z3a z3aVar, lcb lcbVar) {
        this.b = z3aVar;
        this.a = lcbVar;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        final TL_stories.StoryView storyView;
        final uc7 s1;
        final TLRPC.User X1;
        boolean z;
        TLRPC.InputStickerSet c;
        z3a z3aVar = this.b;
        x53 x53Var = z3aVar.s;
        int i2 = z3aVar.w;
        if (!(view instanceof e39)) {
            return false;
        }
        final e39 e39Var = (e39) view;
        lcb lcbVar = this.a;
        if (lcbVar.w == null || (storyView = ((s3a) z3aVar.x.c.get(i)).b) == null || (X1 = (s1 = uc7.s1(i2)).X1(Long.valueOf(storyView.user_id))) == null) {
            return false;
        }
        boolean z2 = s1.x0.indexOfKey(X1.id) >= 0;
        boolean z3 = X1.contact || lv2.r(i2).g0.get(Long.valueOf(X1.id)) != null;
        boolean b = z3aVar.b(storyView);
        boolean M = s1.O1().M(storyView);
        boolean D = lbc.D(X1);
        String str = TextUtils.isEmpty(X1.first_name) ? TextUtils.isEmpty(X1.last_name) ? "" : X1.last_name : X1.first_name;
        int indexOf = str.indexOf(" ");
        if (indexOf > 2) {
            str = str.substring(0, indexOf);
        }
        if (D) {
            return false;
        }
        fu5 G = fu5.G(lcbVar.w, x53Var, view);
        G.i = (byte) 3;
        G.j = true;
        G.X(new ColorDrawable(aob.v0(aob.h5, x53Var)));
        G.s = (short) 133;
        boolean z4 = (!b || M || z2 || D) ? false : true;
        final byte b2 = 0;
        final String str2 = str;
        G.k(R.drawable.msg_stories_myhide, ob6.a0(null, null, 2131744316, str), new Runnable(this) { // from class: j3a
            public final /* synthetic */ l3a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                TL_stories.StoryView storyView2 = storyView;
                e39 e39Var2 = e39Var;
                String str3 = str2;
                TLRPC.User user = X1;
                uc7 uc7Var = s1;
                l3a l3aVar = this.b;
                switch (b3) {
                    case 0:
                        uc7Var.O1().m0(user.id, true, true);
                        z3a z3aVar2 = l3aVar.b;
                        new d31(z3aVar2, z3aVar2.s).Q(R.raw.ic_ban, 36, ob6.a0(null, null, 2131744317, str3)).j();
                        e39Var2.a(true, z3aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        uc7Var.O1().m0(user.id, false, true);
                        z3a z3aVar3 = l3aVar.b;
                        new d31(z3aVar3, z3aVar3.s).Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131744115, str3)).j();
                        e39Var2.a(true, z3aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, z4);
        G.F();
        G.t();
        final byte b3 = 1;
        G.k(R.drawable.msg_menu_stories, ob6.a0(null, null, 2131744116, str2), new Runnable(this) { // from class: j3a
            public final /* synthetic */ l3a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                TL_stories.StoryView storyView2 = storyView;
                e39 e39Var2 = e39Var;
                String str3 = str2;
                TLRPC.User user = X1;
                uc7 uc7Var = s1;
                l3a l3aVar = this.b;
                switch (b32) {
                    case 0:
                        uc7Var.O1().m0(user.id, true, true);
                        z3a z3aVar2 = l3aVar.b;
                        new d31(z3aVar2, z3aVar2.s).Q(R.raw.ic_ban, 36, ob6.a0(null, null, 2131744317, str3)).j();
                        e39Var2.a(true, z3aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        uc7Var.O1().m0(user.id, false, true);
                        z3a z3aVar3 = l3aVar.b;
                        new d31(z3aVar3, z3aVar3.s).Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131744115, str3)).j();
                        e39Var2.a(true, z3aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, (!M || z2 || D) ? false : true);
        G.F();
        G.t();
        final byte b4 = 0;
        G.l(R.drawable.msg_user_remove, new Runnable(this) { // from class: k3a
            public final /* synthetic */ l3a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                TL_stories.StoryView storyView2 = storyView;
                e39 e39Var2 = e39Var;
                TLRPC.User user = X1;
                uc7 uc7Var = s1;
                l3a l3aVar = this.b;
                switch (b5) {
                    case 0:
                        uc7Var.u(user.id);
                        z3a z3aVar2 = l3aVar.b;
                        new d31(z3aVar2, z3aVar2.s).e(true).j();
                        e39Var2.a(true, z3aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        uc7Var.O1().m0(user.id, false, true);
                        uc7Var.t5(null, user.id);
                        z3a z3aVar3 = l3aVar.b;
                        new d31(z3aVar3, z3aVar3.s).e(false).j();
                        e39Var2.a(true, z3aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, ob6.M0(2131753685, null), (z3 || z2 || D) ? false : true, true);
        final byte b5 = 1;
        G.k(R.drawable.msg_block, ob6.M0(2131743566, null), new Runnable(this) { // from class: k3a
            public final /* synthetic */ l3a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b5;
                TL_stories.StoryView storyView2 = storyView;
                e39 e39Var2 = e39Var;
                TLRPC.User user = X1;
                uc7 uc7Var = s1;
                l3a l3aVar = this.b;
                switch (b52) {
                    case 0:
                        uc7Var.u(user.id);
                        z3a z3aVar2 = l3aVar.b;
                        new d31(z3aVar2, z3aVar2.s).e(true).j();
                        e39Var2.a(true, z3aVar2.b(storyView2) ? 1.0f : 0.5f);
                        break;
                    default:
                        uc7Var.O1().m0(user.id, false, true);
                        uc7Var.t5(null, user.id);
                        z3a z3aVar3 = l3aVar.b;
                        new d31(z3aVar3, z3aVar3.s).e(false).j();
                        e39Var2.a(true, z3aVar3.b(storyView2) ? 1.0f : 0.5f);
                        break;
                }
            }
        }, (z3 || !z2 || D) ? false : true);
        G.l(R.drawable.msg_user_remove, new cp7((Object) this, (Object) X1, (Object) str2, (Object) e39Var, (Object) storyView, (byte) 20), ob6.M0(2131744341, null), z3 && !D, true);
        TLRPC.Reaction reaction = storyView.reaction;
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (c = wl.g(i2).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
            z = false;
        } else {
            G.j();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c);
            q37 q37Var = new q37(z3aVar.w, 3, x53Var, z3aVar.getContext(), arrayList);
            q37Var.setOnClickListener(new lw4(this, arrayList, G, (byte) 21));
            G.p(q37Var);
            z = true;
        }
        if (G.y() <= 0 && !z) {
            return false;
        }
        G.a0();
        try {
            z3aVar.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }
}
