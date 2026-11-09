package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jg0 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public final /* synthetic */ lg0 d;

    public jg0(lg0 lg0Var, Context context) {
        this.d = lg0Var;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f == 0) {
            return ((org.telegram.ui.Cells.a5) d1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.Q;
    }

    @Override // v4.g0
    public final int d(int i7) {
        lg0 lg0Var = this.d;
        if (lg0Var.R.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 == lg0Var.H || i7 == lg0Var.O) {
            return 2;
        }
        if (i7 == lg0Var.K) {
            return 3;
        }
        if (i7 == lg0Var.L) {
            return 4;
        }
        if (i7 == lg0Var.N) {
            return 5;
        }
        if (i7 == lg0Var.P) {
            return 6;
        }
        return i7 == lg0Var.M ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User user;
        String format;
        String str;
        int i10;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14 = d1Var.f;
        View view = d1Var.a;
        lg0 lg0Var = this.d;
        if (i14 != 0) {
            if (i14 == 1) {
                org.telegram.ui.ActionBar.s6.Z(view, this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.l6.b7);
                return;
            }
            if (i14 == 2) {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == lg0Var.O) {
                    n4Var.setTopMargin(9);
                    n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    n4Var.setText(org.telegram.messenger.id.a0("StatisticOverview", null, 2131744895, new Object[0]));
                    return;
                } else {
                    n4Var.setTopMargin(11);
                    n4Var.setPadding(0, 0, 0, 0);
                    n4Var.setText(org.telegram.messenger.id.a0("PublicShares", null, 2131746583, new Object[0]));
                    return;
                }
            }
            if (i14 == 4) {
                m41 m41Var = (m41) view;
                m41Var.e(lg0Var.r, false);
                m41Var.setLayoutParams(new v4.o0(-1, -2));
                return;
            }
            if (i14 != 5) {
                if (i14 != 7) {
                    return;
                }
                m41 m41Var2 = (m41) view;
                m41Var2.e(lg0Var.s, false);
                m41Var2.setLayoutParams(new v4.o0(-1, -2));
                return;
            }
            kg0 kg0Var = (kg0) view;
            TextView[] textViewArr = kg0Var.a;
            TextView[] textViewArr2 = kg0Var.b;
            lg0 lg0Var2 = kg0Var.c;
            a51 a51Var = lg0Var2.e0;
            org.telegram.messenger.ij ijVar = lg0Var2.n;
            if (a51Var != null) {
                i11 = a51Var.d();
                i12 = a51Var.a();
                i13 = a51Var.c();
                c10 = 1;
            } else {
                boolean x42 = ijVar.x4();
                TL_stories.StoryItem storyItem = ijVar.l;
                int i15 = x42 ? storyItem.views.views_count : ijVar.k.views;
                int i16 = ijVar.x4() ? storyItem.views.forwards_count : ijVar.k.forwards;
                if (ijVar.x4()) {
                    i11 = i15;
                    i13 = storyItem.views.reactions_count;
                    c10 = 1;
                } else {
                    c10 = 1;
                    if (ijVar.k.reactions != null) {
                        int i17 = 0;
                        for (int i18 = 0; i18 < ijVar.k.reactions.results.size(); i18++) {
                            i17 += ijVar.k.reactions.results.get(i18).count;
                        }
                        i11 = i15;
                        i13 = i17;
                    } else {
                        i11 = i15;
                        i12 = i16;
                        i13 = 0;
                    }
                }
                i12 = i16;
            }
            textViewArr[0].setText(org.telegram.messenger.g0.o0(i11, 0));
            textViewArr2[0].setText(org.telegram.messenger.id.M0(2131744893, null));
            textViewArr[c10].setText(org.telegram.messenger.g0.o0(lg0Var2.U, 0));
            textViewArr2[c10].setText(org.telegram.messenger.id.a0("PublicShares", null, 2131746583, new Object[0]));
            textViewArr[2].setText(org.telegram.messenger.g0.o0(i13, 0));
            textViewArr2[2].setText(org.telegram.messenger.id.a0("Reactions", null, 2131746387, new Object[0]));
            TLRPC.ChatFull chatFull = lg0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i13 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(org.telegram.messenger.g0.o0(Math.max(0, i12 - lg0Var2.U), 0));
            textViewArr2[3].setText(org.telegram.messenger.id.a0("PrivateShares", null, 2131746744, new Object[0]));
            kg0Var.a();
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i19 = lg0Var.I;
        org.telegram.messenger.ij ijVar2 = (i7 < i19 || i7 >= lg0Var.J) ? null : (org.telegram.messenger.ij) lg0Var.y.get(i7 - i19);
        TLRPC.Message message = ijVar2.k;
        TL_stories.StoryItem storyItem2 = ijVar2.l;
        long B0 = org.telegram.messenger.ij.B0(message);
        if (ijVar2.x4()) {
            TLObject a22 = org.telegram.messenger.m5.E(B0) ? lg0Var.getMessagesController().a2(Long.valueOf(B0)) : lg0Var.getMessagesController().M0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            a5Var.c(a22, null, (storyViews == null || (i10 = storyViews.views_count) == 0) ? org.telegram.messenger.id.M0(2131748132, null) : org.telegram.messenger.id.G(i10, "Views", new Object[0]), i7 != lg0Var.J + (-1));
            org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(28, this, ijVar2);
            a5Var.r = storyItem2;
            a5Var.a.setOnClickListener(u41Var);
            return;
        }
        a5Var.r = null;
        a5Var.a.setOnClickListener(null);
        if (!org.telegram.messenger.m5.E(B0)) {
            TLRPC.Chat M0 = lg0Var.getMessagesController().M0(Long.valueOf(-B0));
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                int i20 = M0.participants_count;
                if (i20 != 0) {
                    format = String.format("%1$s, %2$s", org.telegram.messenger.id.G(i20, "Members", new Object[0]), org.telegram.messenger.id.G(ijVar2.k.views, "Views", new Object[0]));
                } else {
                    user = M0;
                }
            } else {
                format = org.telegram.messenger.id.G(ijVar2.k.views, "Views", new Object[0]);
            }
            str = format;
            user = M0;
            if (user == null) {
                a5Var.c(user, null, str, i7 != lg0Var.J + (-1));
                return;
            }
            return;
        }
        user = lg0Var.getMessagesController().a2(Long.valueOf(B0));
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
    @Override // v4.g0
    public final v4.d1 x(
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
