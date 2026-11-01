package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class oh0 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final /* synthetic */ qh0 d;

    public oh0(qh0 qh0Var, Context context) {
        this.d = qh0Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f == 0) {
            return ((org.telegram.ui.Cells.e5) c1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.Q;
    }

    @Override // s4.g0
    public final int d(int i10) {
        qh0 qh0Var = this.d;
        if (qh0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == qh0Var.H || i10 == qh0Var.O) {
            return 2;
        }
        if (i10 == qh0Var.K) {
            return 3;
        }
        if (i10 == qh0Var.L) {
            return 4;
        }
        if (i10 == qh0Var.N) {
            return 5;
        }
        if (i10 == qh0Var.P) {
            return 6;
        }
        return i10 == qh0Var.M ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        String format;
        String str;
        int i11;
        char c10;
        int i12;
        int i13;
        int i14;
        int i15 = c1Var.f;
        View view = c1Var.a;
        qh0 qh0Var = this.d;
        if (i15 != 0) {
            if (i15 == 1) {
                org.telegram.ui.ActionBar.a7.a0(view, this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
                return;
            }
            if (i15 == 2) {
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == qh0Var.O) {
                    p4Var.setTopMargin(9);
                    p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
                    p4Var.setText(org.telegram.messenger.dd.a0("StatisticOverview", null, 2131744913, new Object[0]));
                    return;
                } else {
                    p4Var.setTopMargin(11);
                    p4Var.setPadding(0, 0, 0, 0);
                    p4Var.setText(org.telegram.messenger.dd.a0("PublicShares", null, 2131746598, new Object[0]));
                    return;
                }
            }
            if (i15 == 4) {
                c61 c61Var = (c61) view;
                c61Var.e(qh0Var.r, false);
                c61Var.setLayoutParams(new s4.o0(-1, -2));
                return;
            }
            if (i15 != 5) {
                if (i15 != 7) {
                    return;
                }
                c61 c61Var2 = (c61) view;
                c61Var2.e(qh0Var.s, false);
                c61Var2.setLayoutParams(new s4.o0(-1, -2));
                return;
            }
            ph0 ph0Var = (ph0) view;
            TextView[] textViewArr = ph0Var.a;
            TextView[] textViewArr2 = ph0Var.b;
            qh0 qh0Var2 = ph0Var.c;
            p61 p61Var = qh0Var2.e0;
            org.telegram.messenger.kj kjVar = qh0Var2.n;
            if (p61Var != null) {
                i12 = p61Var.d();
                i13 = p61Var.a();
                i14 = p61Var.c();
                c10 = 1;
            } else {
                boolean x42 = kjVar.x4();
                TL_stories.StoryItem storyItem = kjVar.l;
                int i16 = x42 ? storyItem.views.views_count : kjVar.k.views;
                int i17 = kjVar.x4() ? storyItem.views.forwards_count : kjVar.k.forwards;
                if (kjVar.x4()) {
                    i12 = i16;
                    i14 = storyItem.views.reactions_count;
                    c10 = 1;
                } else {
                    c10 = 1;
                    if (kjVar.k.reactions != null) {
                        int i18 = 0;
                        for (int i19 = 0; i19 < kjVar.k.reactions.results.size(); i19++) {
                            i18 += kjVar.k.reactions.results.get(i19).count;
                        }
                        i12 = i16;
                        i14 = i18;
                    } else {
                        i12 = i16;
                        i13 = i17;
                        i14 = 0;
                    }
                }
                i13 = i17;
            }
            textViewArr[0].setText(org.telegram.messenger.i0.o0(i12, 0));
            textViewArr2[0].setText(org.telegram.messenger.dd.L0(2131744911, null));
            textViewArr[c10].setText(org.telegram.messenger.i0.o0(qh0Var2.U, 0));
            textViewArr2[c10].setText(org.telegram.messenger.dd.a0("PublicShares", null, 2131746598, new Object[0]));
            textViewArr[2].setText(org.telegram.messenger.i0.o0(i14, 0));
            textViewArr2[2].setText(org.telegram.messenger.dd.a0("Reactions", null, 2131746402, new Object[0]));
            TLRPC.ChatFull chatFull = qh0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(org.telegram.messenger.i0.o0(Math.max(0, i13 - qh0Var2.U), 0));
            textViewArr2[3].setText(org.telegram.messenger.dd.a0("PrivateShares", null, 2131746759, new Object[0]));
            ph0Var.a();
            return;
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
        int i20 = qh0Var.I;
        org.telegram.messenger.kj kjVar2 = (i10 < i20 || i10 >= qh0Var.J) ? null : (org.telegram.messenger.kj) qh0Var.y.get(i10 - i20);
        TLRPC.Message message = kjVar2.k;
        TL_stories.StoryItem storyItem2 = kjVar2.l;
        long B0 = org.telegram.messenger.kj.B0(message);
        if (kjVar2.x4()) {
            TLObject Z1 = org.telegram.messenger.o5.E(B0) ? qh0Var.getMessagesController().Z1(Long.valueOf(B0)) : qh0Var.getMessagesController().L0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            e5Var.c(Z1, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? org.telegram.messenger.dd.L0(2131748148, null) : org.telegram.messenger.dd.G(i11, "Views", new Object[0]), i10 != qh0Var.J + (-1));
            vu vuVar = new vu(22, this, kjVar2);
            e5Var.r = storyItem2;
            e5Var.a.setOnClickListener(vuVar);
            return;
        }
        e5Var.r = null;
        e5Var.a.setOnClickListener(null);
        if (!org.telegram.messenger.o5.E(B0)) {
            TLRPC.Chat L0 = qh0Var.getMessagesController().L0(Long.valueOf(-B0));
            if (!org.telegram.messenger.w3.T(L0) || L0.megagroup) {
                int i21 = L0.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", org.telegram.messenger.dd.G(i21, "Members", new Object[0]), org.telegram.messenger.dd.G(kjVar2.k.views, "Views", new Object[0]));
                } else {
                    user = L0;
                }
            } else {
                format = org.telegram.messenger.dd.G(kjVar2.k.views, "Views", new Object[0]);
            }
            str = format;
            user = L0;
            if (user == null) {
                e5Var.c(user, null, str, i10 != qh0Var.J + (-1));
                return;
            }
            return;
        }
        user = qh0Var.getMessagesController().Z1(Long.valueOf(B0));
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
    @Override // s4.g0
    public final s4.c1 w(
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
