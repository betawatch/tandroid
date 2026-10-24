package ah;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.a51;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap E;
    public final ArrayList F;
    public final LinkedHashMap G;
    public final ArrayList H;
    public boolean I;
    public final int J;
    public boolean K;
    public final TLRPC.ChatFull L;
    public final long M;
    public int N;
    public int O;
    public TLRPC.Chat P;
    public TL_stories.TL_premium_boostsStatus Q;
    public int R;
    public int S;
    public boolean T;
    public final l U;
    public boolean a;
    public y b;
    public x c;
    public i d;
    public w8 e;
    public LinearLayout f;
    public ai.r h;
    public w n;
    public y7 r;
    public w8 s;
    public m1 v;
    public FrameLayout w;
    public ImageView x;
    public bp0 y;

    public a0(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new LinkedHashMap();
        this.F = new ArrayList();
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.J = getMessagesController().boostsChannelLevelMax;
        this.K = false;
        this.S = -1;
        this.U = new l(this, 5);
        this.M = j10;
        this.L = chatFull;
    }

    public final void W(a6 a6Var) {
        Editable text = this.n.getText();
        Layout layout = this.n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(a6Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            a6[] a6VarArr = (a6[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), a6.class);
            for (a6 a6Var2 : a6VarArr) {
                a6Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = !this.E.keySet().equals(this.G.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Q;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.R) {
            z11 = false;
        }
        boolean z12 = this.I == this.a ? z11 : true;
        if (z10 && z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new z1(this) { // from class: ah.k
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(c2 c2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.v.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new z1(this) { // from class: ah.k
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(c2 c2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.v.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z12;
    }

    public final void Y(boolean z10) {
        if (this.Q == null) {
            return;
        }
        if (this.S == 0) {
            this.S = 1;
        }
        int size = b0(true).size();
        this.R = size;
        if (this.Q.level >= size) {
            this.v.g(null, true);
            return;
        }
        if (z10) {
            xc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.v.setLvlRequiredState(this.R);
    }

    public final void Z() {
        if (this.K) {
            int i10 = 0;
            this.K = false;
            int i11 = 1;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.n.clearFocus();
            } else {
                this.f.setFocusableInTouchMode(true);
                this.f.requestFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.c.animate().setListener(null).cancel();
            this.c.animate().translationY(this.c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(bs.f).setUpdateListener(new n(this, i11)).setListener(new q(this, i10)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n.getText());
        if (!this.n.hasSelection()) {
            return false;
        }
        a6[] a6VarArr = (a6[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, a6.class);
        for (a6 a6Var : a6VarArr) {
            this.E.remove(Long.valueOf(a6Var.documentId));
            this.F.remove(Long.valueOf(a6Var.documentId));
            this.b.A(Long.valueOf(a6Var.documentId));
        }
        this.n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.F;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.H;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l4.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l4.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z10 ? arrayList2 : arrayList;
    }

    public final void c0(int i10, boolean z10, boolean z11) {
        if (this.S == i10 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i10 == 1 || i10 == 0 || z10;
        this.e.setChecked(z12);
        int x02 = k6.x0(null, z12 ? k6.f6 : k6.e6, false);
        if (!z11) {
            r6.i(z12 ? k6.f6 : k6.e6, this.e, null);
        } else if (z12) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.S = i10;
        if (i10 != 1 && i10 != 0 && !z10) {
            if (!z11) {
                this.f.setVisibility(4);
                this.w.setVisibility(4);
                return;
            }
            Z();
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration = this.w.animate().alpha(0.0f).setDuration(350L);
            bs bsVar = bs.f;
            duration.setInterpolator(bsVar).setListener(new q(this, 2)).start();
            this.f.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).setListener(new q(this, 3)).start();
            return;
        }
        this.f.setVisibility(0);
        this.w.setVisibility(0);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.f.animate().alpha(1.0f).setDuration(350L);
            bs bsVar2 = bs.f;
            duration2.setInterpolator(bsVar2).setListener(new q(this, 1)).start();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(bsVar2).start();
            LinkedHashMap linkedHashMap = this.E;
            if (linkedHashMap.isEmpty()) {
                this.b.K.clear();
                this.n.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.H;
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    l1.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.F, spannableStringBuilder, this.b, this.n.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.J) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.n.append(spannableStringBuilder);
                this.n.m();
                a51 a51Var = this.b.p0;
                if (a51Var != null) {
                    a51Var.l();
                }
                Y(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0448 A[EDGE_INSN: B:54:0x0448->B:55:0x0448 BREAK  A[LOOP:1: B:42:0x039b->B:53:0x039b], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c10;
        int i11;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s(this, 0));
        this.h = new ai.r(context);
        bp0 bp0Var = new bp0(context, this.h, this.resourceProvider, true);
        this.y = bp0Var;
        bp0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        v vVar = new v(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        w8 w8Var = new w8(context);
        this.e = w8Var;
        w8Var.setHeight(56);
        w8 w8Var2 = this.e;
        r6.i(w8Var2.e.h ? k6.f6 : k6.e6, w8Var2, null);
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(k6.g6, k6.O6, k6.P6, k6.Q6, k6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ah.p
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8 w8Var3;
                switch (i12) {
                    case 0:
                        a0 a0Var = this.b;
                        if (a0Var.e.e.h && (w8Var3 = a0Var.s) != null && w8Var3.e.h) {
                            a0Var.d0();
                        }
                        boolean z11 = a0Var.e.e.h;
                        a0Var.c0(z11 ? 2 : 1, z11 ? false : a0Var.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        a0 a0Var2 = this.b;
                        if (!a0Var2.v.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a0Var2.Q;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = a0Var2.R;
                                if (i13 < i14) {
                                    l1.f(-a0Var2.M, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            w8 w8Var4 = a0Var2.s;
                            Boolean valueOf = (w8Var4 == null || !a0Var2.L.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                            a0Var2.v.setLoading(true);
                            MessagesController messagesController = a0Var2.getMessagesController();
                            long j10 = a0Var2.M;
                            int i15 = a0Var2.S;
                            ArrayList b02 = a0Var2.b0(false);
                            int i16 = a0Var2.O;
                            a0Var2.N = i16;
                            messagesController.setCustomChatReactions(j10, i15, b02, i16, valueOf, new m(a0Var2, 2), new l(a0Var2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        this.h.addView(this.e, z5.n(-1, -2));
        e9 e9Var = new e9(context, 12, this.resourceProvider);
        y90 textView = e9Var.getTextView();
        int i13 = k6.B6;
        r6.W(textView, i13, null);
        e9Var.setTopPadding(12);
        e9Var.setBottomPadding(16);
        e9Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(e9Var, z5.n(-1, -2));
        l4 l4Var = new l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        r6.i(k6.d6, l4Var, null);
        l4Var.setTextSize(15.0f);
        l4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, z5.c(-2.0f, -1));
        this.f.addView(l4Var, z5.n(-1, -2));
        g6 resourceProvider = getResourceProvider();
        int i14 = this.J;
        w wVar = new w(this, context, resourceProvider, i14);
        this.n = wVar;
        wVar.setOnFocused(new l(this, 2));
        this.f.addView(this.n, z5.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        e9 e9Var2 = new e9(context, 12, this.resourceProvider);
        r6.W(e9Var2.getTextView(), i13, null);
        e9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), k6.gc, 0, new l(this, 3), getResourceProvider()));
        this.f.addView(e9Var2, z5.n(-1, -2));
        l4 l4Var2 = new l4(context, this.resourceProvider);
        l4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.f.addView(l4Var2, z5.n(-1, -2));
        this.r = new y7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.L;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i15 = getMessagesController().reactionsUniqMax;
            this.O = i15;
            this.N = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.O = i16;
            this.N = i16;
        }
        y7 y7Var = this.r;
        int i17 = this.O;
        int i18 = getMessagesController().reactionsUniqMax;
        x7 x7Var = new x7();
        x7Var.a = 1;
        x7Var.b = i18;
        x7Var.e = new m4.v0(24);
        y7Var.d(i17, x7Var, new m(this, 3));
        this.f.addView(this.r, z5.n(-1, -2));
        e9 e9Var3 = new e9(context, 12, this.resourceProvider);
        e9Var3.setTopPadding(12);
        e9Var3.setBottomPadding(16);
        e9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(e9Var3, z5.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            w8 w8Var3 = new w8(context);
            this.s = w8Var3;
            w8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, z5.n(-1, -2));
            final int i19 = 1;
            this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ah.p
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w8 w8Var32;
                    switch (i19) {
                        case 0:
                            a0 a0Var = this.b;
                            if (a0Var.e.e.h && (w8Var32 = a0Var.s) != null && w8Var32.e.h) {
                                a0Var.d0();
                            }
                            boolean z11 = a0Var.e.e.h;
                            a0Var.c0(z11 ? 2 : 1, z11 ? false : a0Var.a, true);
                            break;
                        case 1:
                            this.b.d0();
                            break;
                        default:
                            a0 a0Var2 = this.b;
                            if (!a0Var2.v.Q) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a0Var2.Q;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = a0Var2.R;
                                    if (i132 < i142) {
                                        l1.f(-a0Var2.M, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                w8 w8Var4 = a0Var2.s;
                                Boolean valueOf = (w8Var4 == null || !a0Var2.L.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                                a0Var2.v.setLoading(true);
                                MessagesController messagesController = a0Var2.getMessagesController();
                                long j10 = a0Var2.M;
                                int i152 = a0Var2.S;
                                ArrayList b02 = a0Var2.b0(false);
                                int i162 = a0Var2.O;
                                a0Var2.N = i162;
                                messagesController.setCustomChatReactions(j10, i152, b02, i162, valueOf, new m(a0Var2, 2), new l(a0Var2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
            e9 e9Var4 = new e9(context, 12, this.resourceProvider);
            r6.W(e9Var4.getTextView(), i13, null);
            e9Var4.setTopPadding(12);
            e9Var4.setBottomPadding(70);
            e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new l(this, 4)));
            this.f.addView(e9Var4, z5.n(-1, -2));
        } else {
            e9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i20 = k6.a7;
        r6.t(imageView2, i20, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, z5.e(-1, -1, 119));
        m1 m1Var = new m1(context, getResourceProvider(), true);
        this.v = m1Var;
        m1Var.f();
        m1 m1Var2 = this.v;
        m1Var2.getClass();
        m1Var2.i(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        m1Var2.k0 = new SpannableStringBuilder("l");
        xq xqVar = new xq(R.drawable.mini_switch_lock, 0);
        xqVar.setTopOffset(1);
        char c11 = '!';
        m1Var2.k0.setSpan(xqVar, 0, 1, 33);
        final int i21 = 2;
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: ah.p
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8 w8Var32;
                switch (i21) {
                    case 0:
                        a0 a0Var = this.b;
                        if (a0Var.e.e.h && (w8Var32 = a0Var.s) != null && w8Var32.e.h) {
                            a0Var.d0();
                        }
                        boolean z11 = a0Var.e.e.h;
                        a0Var.c0(z11 ? 2 : 1, z11 ? false : a0Var.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        a0 a0Var2 = this.b;
                        if (!a0Var2.v.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a0Var2.Q;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = a0Var2.R;
                                if (i132 < i142) {
                                    l1.f(-a0Var2.M, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            w8 w8Var4 = a0Var2.s;
                            Boolean valueOf = (w8Var4 == null || !a0Var2.L.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                            a0Var2.v.setLoading(true);
                            MessagesController messagesController = a0Var2.getMessagesController();
                            long j10 = a0Var2.M;
                            int i152 = a0Var2.S;
                            ArrayList b02 = a0Var2.b0(false);
                            int i162 = a0Var2.O;
                            a0Var2.N = i162;
                            messagesController.setCustomChatReactions(j10, i152, b02, i162, valueOf, new m(a0Var2, 2), new l(a0Var2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        vVar.addView(this.y);
        vVar.addView(this.w, z5.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.v, z5.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        r6.i(i20, vVar, null);
        x xVar = new x(this, context, 0);
        this.c = xVar;
        xVar.setVisibility(4);
        vVar.addView(this.c, z5.e(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.F;
        LinkedHashMap linkedHashMap3 = this.E;
        if (!z11) {
            ArrayList arrayList5 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList6 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size = arrayList6.size();
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    if (i23 >= size) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList6.get(i23);
                    i23++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction == null) {
                            continue;
                        } else {
                            l1.a(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder4, this.b, this.n.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList5;
                            spannableStringBuilder2 = spannableStringBuilder4;
                            i22++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList5;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            y yVar = this.b;
                            int i24 = i14;
                            a6 e = l1.e(null, Long.valueOf(tL_reactionCustomEmoji.document_id), this.n.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                            arrayList = arrayList;
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList6;
                            c10 = '!';
                            spannableString.setSpan(e, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (yVar != null) {
                                yVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i22++;
                            i11 = i24;
                            if (i22 < i11) {
                                break;
                            }
                            c11 = c10;
                            i14 = i11;
                            spannableStringBuilder4 = spannableStringBuilder2;
                            arrayList5 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList6 = arrayList2;
                        }
                    }
                    arrayList2 = arrayList6;
                    c10 = c11;
                    i11 = i14;
                    if (i22 < i11) {
                    }
                }
                this.n.append(spannableStringBuilder2);
                c0(1, this.a, false);
                z10 = true;
                i10 = 2;
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList5;
                boolean z12 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z12 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    c0(2, this.a, false);
                    z10 = true;
                } else if (z12) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    int size2 = arrayList3.size();
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            break;
                        }
                        Object obj = arrayList3.get(i26);
                        i26++;
                        ArrayList arrayList8 = arrayList7;
                        l1.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.n.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z10 = true;
                        i25++;
                        if (i25 >= i14) {
                            break;
                        }
                        spannableStringBuilder5 = spannableStringBuilder;
                        arrayList7 = arrayList8;
                    }
                    this.n.append(spannableStringBuilder);
                    i10 = 2;
                    c0(2, this.a, false);
                }
            }
            this.e.f(LocaleController.getString(R.string.EnableReactions), (this.S == i10 || this.a) ? z10 : false, false);
            this.n.m();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                d0();
            }
            this.G.putAll(linkedHashMap);
            this.I = this.a;
            this.fragmentView = vVar;
            return vVar;
        }
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        int size3 = arrayList3.size();
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i28 >= size3) {
                linkedHashMap2 = linkedHashMap3;
                spannableStringBuilder3 = spannableStringBuilder6;
                break;
            }
            Object obj2 = arrayList3.get(i28);
            i28++;
            ArrayList arrayList9 = arrayList4;
            linkedHashMap2 = linkedHashMap3;
            l1.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.n.getFontMetricsInt());
            spannableStringBuilder3 = spannableStringBuilder6;
            i27++;
            if (i27 >= i14) {
                break;
            }
            spannableStringBuilder6 = spannableStringBuilder3;
            linkedHashMap3 = linkedHashMap2;
            arrayList4 = arrayList9;
        }
        this.n.append(spannableStringBuilder3);
        c0(0, this.a, false);
        linkedHashMap = linkedHashMap2;
        i10 = 2;
        z10 = true;
        this.e.f(LocaleController.getString(R.string.EnableReactions), (this.S == i10 || this.a) ? z10 : false, false);
        this.n.m();
        if (chatFull.paid_media_allowed) {
            d0();
        }
        this.G.putAll(linkedHashMap);
        this.I = this.a;
        this.fragmentView = vVar;
        return vVar;
    }

    public final void d0() {
        w8 w8Var = this.s;
        boolean z10 = w8Var.e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            a6 a6Var = (a6) linkedHashMap.remove(-1L);
            if (a6Var != null) {
                a6Var.setRemoved(new a1.f(7, this, a6Var));
            }
            W(a6Var);
            this.b.x(-1L, true);
            Y(false);
            this.n.setMaxLength(i10);
            c0(this.S, this.a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                r rVar = new r(this);
                rVar.cacheType = r5.g();
                rVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, rVar);
                spannableString.setSpan(rVar, 0, spannableString.length(), 33);
                this.n.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                Y(true);
                W(rVar);
            } catch (Exception e) {
                FileLog.e(e);
            }
            c0(this.S, true, true);
        }
        this.n.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            h5 h5Var = this.parentLayout;
            if (h5Var == null || h5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.K) {
            if (z10) {
                Z();
                return false;
            }
        } else if (!X(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.M;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.P = chat;
        int i10 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.P = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.P, true);
            }
            return false;
        }
        if (this.L != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new m(this, i10));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.H.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        this.T = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.n.setFocusable(true);
            this.n.setFocusableInTouchMode(true);
            if (this.K) {
                this.n.n(false);
                AndroidUtilities.runOnUIThread(new l(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            w8 w8Var = this.e;
            if (w8Var == null || !(w8Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            w8 w8Var2 = this.e;
            w8Var2.setBackgroundColor(k6.x0(null, w8Var2.e.h ? k6.f6 : k6.e6, false));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            y yVar = new y(this, this, getParentActivity(), getResourceProvider(), k6.w0(k6.G6, getResourceProvider()));
            this.b = yVar;
            yVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            r6.i(k6.d6, this.b, null);
            this.c.addView(this.b, z5.e(-1, -2, 80));
            i iVar = new i(getParentActivity(), getResourceProvider());
            this.d = iVar;
            iVar.setOnBackspace(new m(this, 1));
            this.c.addView(this.d, z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new j(0), 200L);
    }
}
