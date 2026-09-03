package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class aj0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ cj0 d;

    public aj0(cj0 cj0Var, Context context) {
        this.d = cj0Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f == 0) {
            return ((org.telegram.ui.Cells.a5) l1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.N;
    }

    @Override // f2.o0
    public final int j(int i10) {
        cj0 cj0Var = this.d;
        if (cj0Var.O.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == cj0Var.E || i10 == cj0Var.L) {
            return 2;
        }
        if (i10 == cj0Var.H) {
            return 3;
        }
        if (i10 == cj0Var.I) {
            return 4;
        }
        if (i10 == cj0Var.K) {
            return 5;
        }
        if (i10 == cj0Var.M) {
            return 6;
        }
        return i10 == cj0Var.J ? 7 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.User user;
        String format;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = l1Var.f;
        View view = l1Var.a;
        int i16 = 7;
        cj0 cj0Var = this.d;
        if (i15 != 0) {
            if (i15 == 1) {
                view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                return;
            }
            if (i15 == 2) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == cj0Var.L) {
                    l4Var.setTopMargin(9);
                    l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    l4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                } else {
                    l4Var.setTopMargin(11);
                    l4Var.setPadding(0, 0, 0, 0);
                    l4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                    return;
                }
            }
            if (i15 == 4) {
                y91 y91Var = (y91) view;
                y91Var.e(cj0Var.r, false);
                y91Var.setLayoutParams(new f2.w0(-1, -2));
                return;
            }
            if (i15 != 5) {
                if (i15 != 7) {
                    return;
                }
                y91 y91Var2 = (y91) view;
                y91Var2.e(cj0Var.s, false);
                y91Var2.setLayoutParams(new f2.w0(-1, -2));
                return;
            }
            bj0 bj0Var = (bj0) view;
            TextView[] textViewArr = bj0Var.a;
            TextView[] textViewArr2 = bj0Var.b;
            cj0 cj0Var2 = bj0Var.c;
            la1 la1Var = cj0Var2.b0;
            MessageObject messageObject = cj0Var2.n;
            if (la1Var != null) {
                i13 = la1Var.d();
                i12 = la1Var.a();
                i14 = la1Var.c();
            } else {
                int i17 = messageObject.isStory() ? messageObject.storyItem.views.views_count : messageObject.messageOwner.views;
                i12 = messageObject.isStory() ? messageObject.storyItem.views.forwards_count : messageObject.messageOwner.forwards;
                if (messageObject.isStory()) {
                    int i18 = messageObject.storyItem.views.reactions_count;
                    i13 = i17;
                    i14 = i18;
                } else if (messageObject.messageOwner.reactions != null) {
                    int i19 = 0;
                    for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                        i19 += messageObject.messageOwner.reactions.results.get(i20).count;
                    }
                    i13 = i17;
                    i14 = i19;
                } else {
                    i13 = i17;
                    i14 = 0;
                }
            }
            textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
            textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
            textViewArr[1].setText(AndroidUtilities.formatWholeNumber(cj0Var2.R, 0));
            textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
            textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            TLRPC.ChatFull chatFull = cj0Var2.a;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - cj0Var2.R), 0));
            textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            bj0Var.a();
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i21 = cj0Var.F;
        MessageObject messageObject2 = (i10 < i21 || i10 >= cj0Var.G) ? null : (MessageObject) cj0Var.x.get(i10 - i21);
        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
        if (messageObject2.isStory()) {
            TLObject user2 = DialogObject.isUserDialog(dialogId) ? cj0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : cj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            TL_stories.StoryViews storyViews = messageObject2.storyItem.views;
            a5Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != cj0Var.G - 1);
            TL_stories.StoryItem storyItem = messageObject2.storyItem;
            ib0 ib0Var = new ib0(i16, this, messageObject2);
            a5Var.r = storyItem;
            a5Var.a.setOnClickListener(ib0Var);
            return;
        }
        a5Var.r = null;
        a5Var.a.setOnClickListener(null);
        if (!DialogObject.isUserDialog(dialogId)) {
            TLRPC.Chat chat = cj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i22 = chat.participants_count;
                if (i22 != 0) {
                    format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i22, new Object[0]), LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]));
                } else {
                    user = chat;
                }
            } else {
                format = LocaleController.formatPluralString("Views", messageObject2.messageOwner.views, new Object[0]);
            }
            str = format;
            user = chat;
            if (user == null) {
                a5Var.b(user, null, str, i10 != cj0Var.G - 1);
                return;
            }
            return;
        }
        user = cj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
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
    @Override // f2.o0
    public final f2.l1 x(
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
