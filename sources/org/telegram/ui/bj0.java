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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bj0 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ dj0 d;

    public bj0(dj0 dj0Var, Context context) {
        this.d = dj0Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f == 0) {
            return ((org.telegram.ui.Cells.b5) c1Var.a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Q;
    }

    @Override // s4.h0
    public final int j(int i10) {
        dj0 dj0Var = this.d;
        if (dj0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 == dj0Var.H || i10 == dj0Var.O) {
            return 2;
        }
        if (i10 == dj0Var.K) {
            return 3;
        }
        if (i10 == dj0Var.L) {
            return 4;
        }
        if (i10 == dj0Var.N) {
            return 5;
        }
        if (i10 == dj0Var.P) {
            return 6;
        }
        return i10 == dj0Var.M ? 7 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String format;
        TLRPC.User user;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = c1Var.f;
        View view = c1Var.a;
        dj0 dj0Var = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            int i16 = dj0Var.I;
            MessageObject messageObject = (i10 < i16 || i10 >= dj0Var.J) ? null : (MessageObject) dj0Var.x.get(i10 - i16);
            long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            if (messageObject.isStory()) {
                TLObject user2 = DialogObject.isUserDialog(dialogId) ? dj0Var.getMessagesController().getUser(Long.valueOf(dialogId)) : dj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                TL_stories.StoryViews storyViews = messageObject.storyItem.views;
                b5Var.b(user2, null, (storyViews == null || (i11 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i11, new Object[0]), i10 != dj0Var.J - 1);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                ov ovVar = new ov(22, this, messageObject);
                b5Var.r = storyItem;
                b5Var.a.setOnClickListener(ovVar);
                return;
            }
            b5Var.r = null;
            b5Var.a.setOnClickListener(null);
            if (DialogObject.isUserDialog(dialogId)) {
                user = dj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
                str = null;
            } else {
                TLRPC.Chat chat = dj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    int i17 = chat.participants_count;
                    if (i17 != 0) {
                        format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i17, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                    } else {
                        str = null;
                        user = chat;
                    }
                } else {
                    format = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
                }
                str = format;
                user = chat;
            }
            if (user != null) {
                b5Var.b(user, null, str, i10 != dj0Var.J - 1);
                return;
            }
            return;
        }
        if (i15 == 1) {
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(this.c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            return;
        }
        if (i15 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == dj0Var.O) {
                m4Var.setTopMargin(9);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                m4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                return;
            } else {
                m4Var.setTopMargin(11);
                m4Var.setPadding(0, 0, 0, 0);
                m4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
        }
        if (i15 == 4) {
            ca1 ca1Var = (ca1) view;
            ca1Var.e(dj0Var.r, false);
            ca1Var.setLayoutParams(new s4.p0(-1, -2));
            return;
        }
        if (i15 != 5) {
            if (i15 != 7) {
                return;
            }
            ca1 ca1Var2 = (ca1) view;
            ca1Var2.e(dj0Var.s, false);
            ca1Var2.setLayoutParams(new s4.p0(-1, -2));
            return;
        }
        cj0 cj0Var = (cj0) view;
        TextView[] textViewArr = cj0Var.a;
        TextView[] textViewArr2 = cj0Var.b;
        dj0 dj0Var2 = cj0Var.c;
        pa1 pa1Var = dj0Var2.e0;
        MessageObject messageObject2 = dj0Var2.n;
        if (pa1Var != null) {
            i13 = pa1Var.d();
            i12 = pa1Var.a();
            i14 = pa1Var.c();
        } else {
            int i18 = messageObject2.isStory() ? messageObject2.storyItem.views.views_count : messageObject2.messageOwner.views;
            i12 = messageObject2.isStory() ? messageObject2.storyItem.views.forwards_count : messageObject2.messageOwner.forwards;
            if (messageObject2.isStory()) {
                int i19 = messageObject2.storyItem.views.reactions_count;
                i13 = i18;
                i14 = i19;
            } else if (messageObject2.messageOwner.reactions != null) {
                int i20 = 0;
                for (int i21 = 0; i21 < messageObject2.messageOwner.reactions.results.size(); i21++) {
                    i20 += messageObject2.messageOwner.reactions.results.get(i21).count;
                }
                i13 = i18;
                i14 = i20;
            } else {
                i13 = i18;
                i14 = 0;
            }
        }
        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i13, 0));
        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(dj0Var2.U, 0));
        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i14, 0));
        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
        TLRPC.ChatFull chatFull = dj0Var2.a;
        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i14 == 0) {
            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
        }
        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i12 - dj0Var2.U), 0));
        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
        cj0Var.a();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // s4.h0
    public final s4.c1 x(
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
