package ah;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.w41;
import w7.z5;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class a0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public v8 e;
    public LinearLayout f;
    public ai.r h;
    public w n;
    public y7 r;
    public v8 s;
    public m1 v;
    public FrameLayout w;
    public ImageView x;
    public xo0 y;

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
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) { // from class: ah.k
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(b2 b2Var, int i11) {
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) { // from class: ah.k
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(b2 b2Var, int i112) {
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
            alertDialog$Builder.o();
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
            this.v.f(null, true);
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
        int x02 = h6.x0(null, z12 ? h6.f6 : h6.e6, false);
        if (!z11) {
            this.e.setBackgroundColor(x02);
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
                w41 w41Var = this.b.p0;
                if (w41Var != null) {
                    w41Var.l();
                }
                Y(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x045f A[EDGE_INSN: B:55:0x045f->B:56:0x045f BREAK  A[LOOP:1: B:43:0x03b0->B:54:0x03b0], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.n2
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
        int i11;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c10;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s(this, 0));
        this.h = new ai.r(context);
        xo0 xo0Var = new xo0(context, this.h, this.resourceProvider, true);
        this.y = xo0Var;
        xo0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        v vVar = new v(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        v8 v8Var = new v8(context);
        this.e = v8Var;
        v8Var.setHeight(56);
        v8 v8Var2 = this.e;
        v8Var2.setBackgroundColor(h6.x0(null, v8Var2.e.h ? h6.f6 : h6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(h6.g6, h6.O6, h6.P6, h6.Q6, h6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ah.p
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v8 v8Var3;
                switch (i12) {
                    case 0:
                        a0 a0Var = this.b;
                        if (a0Var.e.e.h && (v8Var3 = a0Var.s) != null && v8Var3.e.h) {
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
                        if (!a0Var2.v.N) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a0Var2.Q;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = a0Var2.R;
                                if (i13 < i14) {
                                    l1.f(-a0Var2.M, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            v8 v8Var4 = a0Var2.s;
                            Boolean valueOf = (v8Var4 == null || !a0Var2.L.paid_media_allowed) ? null : Boolean.valueOf(v8Var4.e.h);
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
        d9 d9Var = new d9(context, 12, this.resourceProvider);
        int i13 = h6.B6;
        d9Var.setTextColor(h6.x0(null, i13, false));
        d9Var.setTopPadding(12);
        d9Var.setBottomPadding(16);
        d9Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(d9Var, z5.n(-1, -2));
        l4 l4Var = new l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        l4Var.setBackgroundColor(h6.x0(null, h6.d6, false));
        l4Var.setTextSize(15.0f);
        l4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, z5.c(-2.0f, -1));
        this.f.addView(l4Var, z5.n(-1, -2));
        d6 resourceProvider = getResourceProvider();
        int i14 = this.J;
        w wVar = new w(this, context, resourceProvider, i14);
        this.n = wVar;
        wVar.setOnFocused(new l(this, 2));
        this.f.addView(this.n, z5.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        d9 d9Var2 = new d9(context, 12, this.resourceProvider);
        d9Var2.setTextColor(h6.x0(null, i13, false));
        d9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), h6.gc, 0, new l(this, 3), getResourceProvider()));
        this.f.addView(d9Var2, z5.n(-1, -2));
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
        x7Var.e = new m4.v0(20);
        y7Var.d(i17, x7Var, new m(this, 3));
        this.f.addView(this.r, z5.n(-1, -2));
        d9 d9Var3 = new d9(context, 12, this.resourceProvider);
        d9Var3.setTopPadding(12);
        d9Var3.setBottomPadding(16);
        d9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(d9Var3, z5.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            v8 v8Var3 = new v8(context);
            this.s = v8Var3;
            v8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, z5.n(-1, -2));
            final int i19 = 1;
            this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ah.p
                public final /* synthetic */ a0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v8 v8Var32;
                    switch (i19) {
                        case 0:
                            a0 a0Var = this.b;
                            if (a0Var.e.e.h && (v8Var32 = a0Var.s) != null && v8Var32.e.h) {
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
                            if (!a0Var2.v.N) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a0Var2.Q;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = a0Var2.R;
                                    if (i132 < i142) {
                                        l1.f(-a0Var2.M, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                v8 v8Var4 = a0Var2.s;
                                Boolean valueOf = (v8Var4 == null || !a0Var2.L.paid_media_allowed) ? null : Boolean.valueOf(v8Var4.e.h);
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
            d9 d9Var4 = new d9(context, 12, this.resourceProvider);
            d9Var4.setTextColor(h6.x0(null, i13, false));
            d9Var4.setTopPadding(12);
            d9Var4.setBottomPadding(70);
            d9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new l(this, 4)));
            this.f.addView(d9Var4, z5.n(-1, -2));
        } else {
            d9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i20 = h6.a7;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(i20, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.w.addView(this.x, z5.e(-1, -1, 119));
        m1 m1Var = new m1(context, getResourceProvider(), true);
        this.v = m1Var;
        m1Var.e();
        m1 m1Var2 = this.v;
        m1Var2.getClass();
        m1Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        m1Var2.h0 = new SpannableStringBuilder("l");
        yq yqVar = new yq(R.drawable.mini_switch_lock, 0);
        yqVar.setTopOffset(1);
        char c11 = '!';
        m1Var2.h0.setSpan(yqVar, 0, 1, 33);
        final int i21 = 2;
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: ah.p
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v8 v8Var32;
                switch (i21) {
                    case 0:
                        a0 a0Var = this.b;
                        if (a0Var.e.e.h && (v8Var32 = a0Var.s) != null && v8Var32.e.h) {
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
                        if (!a0Var2.v.N) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = a0Var2.Q;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = a0Var2.R;
                                if (i132 < i142) {
                                    l1.f(-a0Var2.M, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            v8 v8Var4 = a0Var2.s;
                            Boolean valueOf = (v8Var4 == null || !a0Var2.L.paid_media_allowed) ? null : Boolean.valueOf(v8Var4.e.h);
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
        vVar.setBackgroundColor(h6.x0(null, i20, false));
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
                            i11 = i23;
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
                            if (i22 < i14) {
                                break;
                            }
                            c11 = c10;
                            spannableStringBuilder4 = spannableStringBuilder2;
                            arrayList5 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList6 = arrayList2;
                            i23 = i11;
                        }
                    }
                    arrayList2 = arrayList6;
                    i11 = i23;
                    c10 = c11;
                    if (i22 < i14) {
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
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            break;
                        }
                        Object obj = arrayList3.get(i25);
                        i25++;
                        ArrayList arrayList8 = arrayList7;
                        l1.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.n.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z10 = true;
                        i24++;
                        if (i24 >= i14) {
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
        int i26 = 0;
        int i27 = 0;
        while (true) {
            if (i27 >= size3) {
                linkedHashMap2 = linkedHashMap3;
                spannableStringBuilder3 = spannableStringBuilder6;
                break;
            }
            Object obj2 = arrayList3.get(i27);
            i27++;
            ArrayList arrayList9 = arrayList4;
            linkedHashMap2 = linkedHashMap3;
            l1.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.n.getFontMetricsInt());
            spannableStringBuilder3 = spannableStringBuilder6;
            i26++;
            if (i26 >= i14) {
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
        v8 v8Var = this.s;
        boolean z10 = v8Var.e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            v8Var.setChecked(false);
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
            v8Var.setChecked(true);
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
            d5 d5Var = this.parentLayout;
            if (d5Var == null || d5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        this.T = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            y yVar = new y(this, this, getParentActivity(), getResourceProvider(), h6.w0(h6.G6, getResourceProvider()));
            this.b = yVar;
            yVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(h6.x0(null, h6.d6, false));
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
