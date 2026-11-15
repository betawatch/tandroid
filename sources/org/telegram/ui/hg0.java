package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hg0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ jg0 d;

    public hg0(jg0 jg0Var, Context context) {
        this.d = jg0Var;
        this.c = context;
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f == 0) {
            return ((org.telegram.ui.Cells.a5) e1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.R;
    }

    @Override // v4.h0
    public final int d(int i7) {
        jg0 jg0Var = this.d;
        if (jg0Var.S.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 == jg0Var.I || i7 == jg0Var.P) {
            return 2;
        }
        if (i7 == jg0Var.L) {
            return 3;
        }
        if (i7 == jg0Var.M) {
            return 4;
        }
        if (i7 == jg0Var.O) {
            return 5;
        }
        if (i7 == jg0Var.Q) {
            return 6;
        }
        return i7 == jg0Var.N ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.User user;
        String format;
        String str;
        int i10;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14 = e1Var.f;
        View view = e1Var.a;
        jg0 jg0Var = this.d;
        if (i14 != 0) {
            if (i14 == 1) {
                org.telegram.ui.ActionBar.q6.Z(view, this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
                return;
            }
            if (i14 == 2) {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == jg0Var.P) {
                    n4Var.setTopMargin(9);
                    n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    n4Var.setText(org.telegram.messenger.hd.a0("StatisticOverview", null, 2131744895, new Object[0]));
                    return;
                } else {
                    n4Var.setTopMargin(11);
                    n4Var.setPadding(0, 0, 0, 0);
                    n4Var.setText(org.telegram.messenger.hd.a0("PublicShares", null, 2131746583, new Object[0]));
                    return;
                }
            }
            if (i14 == 4) {
                j41 j41Var = (j41) view;
                j41Var.e(jg0Var.r, false);
                j41Var.setLayoutParams(new v4.p0(-1, -2));
                return;
            }
            if (i14 != 5) {
                if (i14 != 7) {
                    return;
                }
                j41 j41Var2 = (j41) view;
                j41Var2.e(jg0Var.s, false);
                j41Var2.setLayoutParams(new v4.p0(-1, -2));
                return;
            }
            ig0 ig0Var = (ig0) view;
            TextView[] textViewArr = ig0Var.a;
            TextView[] textViewArr2 = ig0Var.b;
            jg0 jg0Var2 = ig0Var.c;
            w41 w41Var = jg0Var2.f0;
            org.telegram.messenger.gj gjVar = jg0Var2.n;
            if (w41Var != null) {
                i11 = w41Var.d();
                i12 = w41Var.a();
                i13 = w41Var.c();
                c10 = 1;
            } else {
                boolean x42 = gjVar.x4();
                TL_stories.StoryItem storyItem = gjVar.l;
                int i15 = x42 ? storyItem.views.views_count : gjVar.k.views;
                int i16 = gjVar.x4() ? storyItem.views.forwards_count : gjVar.k.forwards;
                if (gjVar.x4()) {
                    i11 = i15;
                    i13 = storyItem.views.reactions_count;
                    c10 = 1;
                } else {
                    c10 = 1;
                    if (gjVar.k.reactions != null) {
                        int i17 = 0;
                        for (int i18 = 0; i18 < gjVar.k.reactions.results.size(); i18++) {
                            i17 += gjVar.k.reactions.results.get(i18).count;
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
            textViewArr2[0].setText(org.telegram.messenger.hd.M0(2131744893, null));
            textViewArr[c10].setText(org.telegram.messenger.g0.o0(jg0Var2.V, 0));
            textViewArr2[c10].setText(org.telegram.messenger.hd.a0("PublicShares", null, 2131746583, new Object[0]));
            textViewArr[2].setText(org.telegram.messenger.g0.o0(i13, 0));
            textViewArr2[2].setText(org.telegram.messenger.hd.a0("Reactions", null, 2131746387, new Object[0]));
            TLRPC.ChatFull chatFull = jg0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i13 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(org.telegram.messenger.g0.o0(Math.max(0, i12 - jg0Var2.V), 0));
            textViewArr2[3].setText(org.telegram.messenger.hd.a0("PrivateShares", null, 2131746744, new Object[0]));
            ig0Var.a();
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i19 = jg0Var.J;
        org.telegram.messenger.gj gjVar2 = (i7 < i19 || i7 >= jg0Var.K) ? null : (org.telegram.messenger.gj) jg0Var.y.get(i7 - i19);
        TLRPC.Message message = gjVar2.k;
        TL_stories.StoryItem storyItem2 = gjVar2.l;
        long B0 = org.telegram.messenger.gj.B0(message);
        if (gjVar2.x4()) {
            TLObject a22 = org.telegram.messenger.m5.E(B0) ? jg0Var.getMessagesController().a2(Long.valueOf(B0)) : jg0Var.getMessagesController().M0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            a5Var.c(a22, null, (storyViews == null || (i10 = storyViews.views_count) == 0) ? org.telegram.messenger.hd.M0(2131748132, null) : org.telegram.messenger.hd.G(i10, "Views", new Object[0]), i7 != jg0Var.K + (-1));
            a90 a90Var = new a90(6, this, gjVar2);
            a5Var.r = storyItem2;
            a5Var.a.setOnClickListener(a90Var);
            return;
        }
        a5Var.r = null;
        a5Var.a.setOnClickListener(null);
        if (!org.telegram.messenger.m5.E(B0)) {
            TLRPC.Chat M0 = jg0Var.getMessagesController().M0(Long.valueOf(-B0));
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                int i20 = M0.participants_count;
                if (i20 != 0) {
                    format = String.format("%1$s, %2$s", org.telegram.messenger.hd.G(i20, "Members", new Object[0]), org.telegram.messenger.hd.G(gjVar2.k.views, "Views", new Object[0]));
                } else {
                    user = M0;
                }
            } else {
                format = org.telegram.messenger.hd.G(gjVar2.k.views, "Views", new Object[0]);
            }
            str = format;
            user = M0;
            if (user == null) {
                a5Var.c(user, null, str, i7 != jg0Var.K + (-1));
                return;
            }
            return;
        }
        user = jg0Var.getMessagesController().a2(Long.valueOf(B0));
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
    @Override // v4.h0
    public final v4.e1 x(
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
