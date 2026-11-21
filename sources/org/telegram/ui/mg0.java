package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class mg0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ og0 d;

    public mg0(og0 og0Var, Context context) {
        this.d = og0Var;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f == 0) {
            return ((org.telegram.ui.Cells.b5) f1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.R;
    }

    @Override // v4.i0
    public final int d(int i7) {
        og0 og0Var = this.d;
        if (og0Var.S.contains(Integer.valueOf(i7))) {
            return 1;
        }
        if (i7 == og0Var.I || i7 == og0Var.P) {
            return 2;
        }
        if (i7 == og0Var.L) {
            return 3;
        }
        if (i7 == og0Var.M) {
            return 4;
        }
        if (i7 == og0Var.O) {
            return 5;
        }
        if (i7 == og0Var.Q) {
            return 6;
        }
        return i7 == og0Var.N ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.User user;
        String format;
        String str;
        int i10;
        char c10;
        int i11;
        int i12;
        int i13;
        int i14 = f1Var.f;
        View view = f1Var.a;
        og0 og0Var = this.d;
        int i15 = 0;
        if (i14 != 0) {
            if (i14 == 1) {
                org.telegram.ui.ActionBar.t6.Z(view, this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
                return;
            }
            if (i14 == 2) {
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == og0Var.P) {
                    o4Var.setTopMargin(9);
                    o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                    o4Var.setText(org.telegram.messenger.gd.a0("StatisticOverview", null, 2131744654, new Object[0]));
                    return;
                } else {
                    o4Var.setTopMargin(11);
                    o4Var.setPadding(0, 0, 0, 0);
                    o4Var.setText(org.telegram.messenger.gd.a0("PublicShares", null, 2131746387, new Object[0]));
                    return;
                }
            }
            if (i14 == 4) {
                m41 m41Var = (m41) view;
                m41Var.e(og0Var.r, false);
                m41Var.setLayoutParams(new v4.q0(-1, -2));
                return;
            }
            if (i14 != 5) {
                if (i14 != 7) {
                    return;
                }
                m41 m41Var2 = (m41) view;
                m41Var2.e(og0Var.s, false);
                m41Var2.setLayoutParams(new v4.q0(-1, -2));
                return;
            }
            ng0 ng0Var = (ng0) view;
            TextView[] textViewArr = ng0Var.a;
            TextView[] textViewArr2 = ng0Var.b;
            og0 og0Var2 = ng0Var.c;
            z41 z41Var = og0Var2.f0;
            org.telegram.messenger.fj fjVar = og0Var2.n;
            if (z41Var != null) {
                i11 = z41Var.d();
                i12 = z41Var.a();
                i13 = z41Var.c();
                c10 = 1;
            } else {
                boolean x42 = fjVar.x4();
                TL_stories.StoryItem storyItem = fjVar.l;
                int i16 = x42 ? storyItem.views.views_count : fjVar.k.views;
                int i17 = fjVar.x4() ? storyItem.views.forwards_count : fjVar.k.forwards;
                if (fjVar.x4()) {
                    i11 = i16;
                    i13 = storyItem.views.reactions_count;
                    c10 = 1;
                } else {
                    c10 = 1;
                    if (fjVar.k.reactions != null) {
                        int i18 = 0;
                        for (int i19 = 0; i19 < fjVar.k.reactions.results.size(); i19++) {
                            i18 += fjVar.k.reactions.results.get(i19).count;
                        }
                        i11 = i16;
                        i13 = i18;
                    } else {
                        i11 = i16;
                        i12 = i17;
                        i13 = 0;
                    }
                }
                i12 = i17;
            }
            textViewArr[0].setText(org.telegram.messenger.g0.o0(i11, 0));
            textViewArr2[0].setText(org.telegram.messenger.gd.N0(2131744652, null));
            textViewArr[c10].setText(org.telegram.messenger.g0.o0(og0Var2.V, 0));
            textViewArr2[c10].setText(org.telegram.messenger.gd.a0("PublicShares", null, 2131746387, new Object[0]));
            textViewArr[2].setText(org.telegram.messenger.g0.o0(i13, 0));
            textViewArr2[2].setText(org.telegram.messenger.gd.a0("Reactions", null, 2131746191, new Object[0]));
            TLRPC.ChatFull chatFull = og0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i13 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(org.telegram.messenger.g0.o0(Math.max(0, i12 - og0Var2.V), 0));
            textViewArr2[3].setText(org.telegram.messenger.gd.a0("PrivateShares", null, 2131746550, new Object[0]));
            ng0Var.a();
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        int i20 = og0Var.J;
        org.telegram.messenger.fj fjVar2 = (i7 < i20 || i7 >= og0Var.K) ? null : (org.telegram.messenger.fj) og0Var.y.get(i7 - i20);
        TLRPC.Message message = fjVar2.k;
        TL_stories.StoryItem storyItem2 = fjVar2.l;
        long B0 = org.telegram.messenger.fj.B0(message);
        if (fjVar2.x4()) {
            TLObject c22 = org.telegram.messenger.n5.E(B0) ? og0Var.getMessagesController().c2(Long.valueOf(B0)) : og0Var.getMessagesController().O0(Long.valueOf(-B0));
            TL_stories.StoryViews storyViews = storyItem2.views;
            b5Var.c(c22, null, (storyViews == null || (i10 = storyViews.views_count) == 0) ? org.telegram.messenger.gd.N0(2131747939, null) : org.telegram.messenger.gd.G(i10, "Views", new Object[0]), i7 != og0Var.K + (-1));
            jg0 jg0Var = new jg0(i15, this, fjVar2);
            b5Var.r = storyItem2;
            b5Var.a.setOnClickListener(jg0Var);
            return;
        }
        b5Var.r = null;
        b5Var.a.setOnClickListener(null);
        if (!org.telegram.messenger.n5.E(B0)) {
            TLRPC.Chat O0 = og0Var.getMessagesController().O0(Long.valueOf(-B0));
            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                int i21 = O0.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", org.telegram.messenger.gd.G(i21, "Members", new Object[0]), org.telegram.messenger.gd.G(fjVar2.k.views, "Views", new Object[0]));
                } else {
                    user = O0;
                }
            } else {
                format = org.telegram.messenger.gd.G(fjVar2.k.views, "Views", new Object[0]);
            }
            str = format;
            user = O0;
            if (user == null) {
                b5Var.c(user, null, str, i7 != og0Var.K + (-1));
                return;
            }
            return;
        }
        user = og0Var.getMessagesController().c2(Long.valueOf(B0));
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
    @Override // v4.i0
    public final v4.f1 x(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
