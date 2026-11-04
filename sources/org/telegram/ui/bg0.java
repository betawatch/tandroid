package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bg0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ dg0 d;

    public bg0(dg0 dg0Var, Context context) {
        this.d = dg0Var;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f == 0) {
            return ((org.telegram.ui.Cells.a5) d1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.R;
    }

    @Override // u4.h0
    public final int d(int i3) {
        dg0 dg0Var = this.d;
        if (dg0Var.S.contains(Integer.valueOf(i3))) {
            return 1;
        }
        if (i3 == dg0Var.I || i3 == dg0Var.P) {
            return 2;
        }
        if (i3 == dg0Var.L) {
            return 3;
        }
        if (i3 == dg0Var.M) {
            return 4;
        }
        if (i3 == dg0Var.O) {
            return 5;
        }
        if (i3 == dg0Var.Q) {
            return 6;
        }
        return i3 == dg0Var.N ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.User user;
        String format;
        String str;
        int i10;
        char c2;
        int i11;
        int i12;
        int i13;
        int i14 = d1Var.f;
        View view = d1Var.a;
        int i15 = 4;
        dg0 dg0Var = this.d;
        if (i14 != 0) {
            if (i14 == 1) {
                org.telegram.ui.ActionBar.r6.a0(view, this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                return;
            }
            if (i14 == 2) {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 == dg0Var.P) {
                    n4Var.setTopMargin(9);
                    n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    n4Var.setText(org.telegram.messenger.bd.a0("StatisticOverview", null, 2131744905, new Object[0]));
                    return;
                } else {
                    n4Var.setTopMargin(11);
                    n4Var.setPadding(0, 0, 0, 0);
                    n4Var.setText(org.telegram.messenger.bd.a0("PublicShares", null, 2131746591, new Object[0]));
                    return;
                }
            }
            if (i14 == 4) {
                b41 b41Var = (b41) view;
                b41Var.e(dg0Var.r, false);
                b41Var.setLayoutParams(new u4.p0(-1, -2));
                return;
            }
            if (i14 != 5) {
                if (i14 != 7) {
                    return;
                }
                b41 b41Var2 = (b41) view;
                b41Var2.e(dg0Var.s, false);
                b41Var2.setLayoutParams(new u4.p0(-1, -2));
                return;
            }
            cg0 cg0Var = (cg0) view;
            TextView[] textViewArr = cg0Var.a;
            TextView[] textViewArr2 = cg0Var.b;
            dg0 dg0Var2 = cg0Var.c;
            o41 o41Var = dg0Var2.f0;
            org.telegram.messenger.zi ziVar = dg0Var2.n;
            if (o41Var != null) {
                i11 = o41Var.d();
                i13 = o41Var.a();
                i12 = o41Var.c();
                c2 = 1;
            } else {
                boolean y42 = ziVar.y4();
                TL_stories.StoryItem storyItem = ziVar.l;
                int i16 = y42 ? storyItem.views.views_count : ziVar.k.views;
                int i17 = ziVar.y4() ? storyItem.views.forwards_count : ziVar.k.forwards;
                if (ziVar.y4()) {
                    i11 = i16;
                    i12 = storyItem.views.reactions_count;
                    c2 = 1;
                } else {
                    c2 = 1;
                    if (ziVar.k.reactions != null) {
                        int i18 = 0;
                        for (int i19 = 0; i19 < ziVar.k.reactions.results.size(); i19++) {
                            i18 += ziVar.k.reactions.results.get(i19).count;
                        }
                        i11 = i16;
                        i12 = i18;
                    } else {
                        i11 = i16;
                        i12 = 0;
                    }
                }
                i13 = i17;
            }
            textViewArr[0].setText(org.telegram.messenger.g0.o0(i11, 0));
            textViewArr2[0].setText(org.telegram.messenger.bd.M0(2131744903, null));
            textViewArr[c2].setText(org.telegram.messenger.g0.o0(dg0Var2.V, 0));
            textViewArr2[c2].setText(org.telegram.messenger.bd.a0("PublicShares", null, 2131746591, new Object[0]));
            textViewArr[2].setText(org.telegram.messenger.g0.o0(i12, 0));
            textViewArr2[2].setText(org.telegram.messenger.bd.a0("Reactions", null, 2131746395, new Object[0]));
            TLRPC.ChatFull chatFull = dg0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i12 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(org.telegram.messenger.g0.o0(Math.max(0, i13 - dg0Var2.V), 0));
            textViewArr2[3].setText(org.telegram.messenger.bd.a0("PrivateShares", null, 2131746752, new Object[0]));
            cg0Var.a();
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i20 = dg0Var.J;
        org.telegram.messenger.zi ziVar2 = (i3 < i20 || i3 >= dg0Var.K) ? null : (org.telegram.messenger.zi) dg0Var.y.get(i3 - i20);
        TLRPC.Message message = ziVar2.k;
        TL_stories.StoryItem storyItem2 = ziVar2.l;
        long B0 = org.telegram.messenger.zi.B0(message);
        if (ziVar2.y4()) {
            TLObject a22 = org.telegram.messenger.m5.E(B0) ? dg0Var.getMessagesController().a2(Long.valueOf(B0)) : dg0Var.getMessagesController().M0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            a5Var.c(a22, null, (storyViews == null || (i10 = storyViews.views_count) == 0) ? org.telegram.messenger.bd.M0(2131748140, null) : org.telegram.messenger.bd.G(i10, "Views", new Object[0]), i3 != dg0Var.K + (-1));
            hb0 hb0Var = new hb0(i15, this, ziVar2);
            a5Var.r = storyItem2;
            a5Var.a.setOnClickListener(hb0Var);
            return;
        }
        a5Var.r = null;
        a5Var.a.setOnClickListener(null);
        if (!org.telegram.messenger.m5.E(B0)) {
            TLRPC.Chat M0 = dg0Var.getMessagesController().M0(Long.valueOf(-B0));
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                int i21 = M0.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", org.telegram.messenger.bd.G(i21, "Members", new Object[0]), org.telegram.messenger.bd.G(ziVar2.k.views, "Views", new Object[0]));
                } else {
                    user = M0;
                }
            } else {
                format = org.telegram.messenger.bd.G(ziVar2.k.views, "Views", new Object[0]);
            }
            str = format;
            user = M0;
            if (user == null) {
                a5Var.c(user, null, str, i3 != dg0Var.K + (-1));
                return;
            }
            return;
        }
        user = dg0Var.getMessagesController().a2(Long.valueOf(B0));
        str = null;
        if (user == null) {
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // u4.h0
    public final u4.d1 x(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
