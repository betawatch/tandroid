package ng;

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
import eg.s2;
import eg.s3;
import fg.l1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k7.c6;
import mh.c3;
import mh.m2;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.v51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap B;
    public final ArrayList C;
    public final LinkedHashMap D;
    public final ArrayList E;
    public boolean F;
    public final int G;
    public boolean H;
    public final TLRPC.ChatFull I;
    public final long J;
    public int K;
    public int L;
    public TLRPC.Chat M;
    public TL_stories.TL_premium_boostsStatus N;
    public int O;
    public int P;
    public boolean Q;
    public final h R;
    public boolean a;
    public q b;
    public s2 c;
    public f d;
    public s8 e;
    public LinearLayout f;
    public s3 h;
    public p n;
    public x7 r;
    public s8 s;
    public t0 v;
    public FrameLayout w;
    public ImageView x;
    public eo0 y;

    public s(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.B = new LinkedHashMap();
        this.C = new ArrayList();
        this.D = new LinkedHashMap();
        this.E = new ArrayList();
        this.G = getMessagesController().boostsChannelLevelMax;
        this.H = false;
        this.P = -1;
        this.R = new h(this, 5);
        this.J = j10;
        this.I = chatFull;
    }

    public final void W(u5 u5Var) {
        Editable text = this.n.getText();
        Layout layout = this.n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(u5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            u5[] u5VarArr = (u5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), u5.class);
            for (u5 u5Var2 : u5VarArr) {
                u5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z4) {
        boolean z10 = !this.B.keySet().equals(this.D.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.N;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.O) {
            z10 = false;
        }
        boolean z11 = this.F == this.a ? z10 : true;
        if (z4 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.O = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.a.Q = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new c2(this) { // from class: ng.g
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(d2 d2Var, int i11) {
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new c2(this) { // from class: ng.g
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(d2 d2Var, int i112) {
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
        return z11;
    }

    public final void Y(boolean z4) {
        if (this.N == null) {
            return;
        }
        if (this.P == 0) {
            this.P = 1;
        }
        int size = b0(true).size();
        this.O = size;
        if (this.N.level >= size) {
            this.v.f(null, true);
            return;
        }
        if (z4) {
            qc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.v.setLvlRequiredState(this.O);
    }

    public final void Z() {
        if (this.H) {
            int i10 = 0;
            this.H = false;
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
            this.c.animate().translationY(this.c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(pr.f).setUpdateListener(new j(this, i11)).setListener(new m(this, i10)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n.getText());
        if (!this.n.hasSelection()) {
            return false;
        }
        u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, u5.class);
        for (u5 u5Var : u5VarArr) {
            this.B.remove(Long.valueOf(u5Var.documentId));
            this.C.remove(Long.valueOf(u5Var.documentId));
            this.b.A(Long.valueOf(u5Var.documentId));
        }
        this.n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.C;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.E;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l10.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l10.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z4 ? arrayList2 : arrayList;
    }

    public final void c0(int i10, boolean z4, boolean z10) {
        if (this.P == i10 && this.a == z4) {
            return;
        }
        this.a = z4;
        boolean z11 = i10 == 1 || i10 == 0 || z4;
        this.e.setChecked(z11);
        int w02 = k6.w0(null, z11 ? k6.f6 : k6.e6, false);
        if (!z10) {
            this.e.setBackgroundColor(w02);
        } else if (z11) {
            this.e.b(w02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(w02);
        }
        this.P = i10;
        if (i10 != 1 && i10 != 0 && !z4) {
            if (!z10) {
                this.f.setVisibility(4);
                this.w.setVisibility(4);
                return;
            }
            Z();
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration = this.w.animate().alpha(0.0f).setDuration(350L);
            pr prVar = pr.f;
            duration.setInterpolator(prVar).setListener(new m(this, 2)).start();
            this.f.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).setListener(new m(this, 3)).start();
            return;
        }
        this.f.setVisibility(0);
        this.w.setVisibility(0);
        if (z10) {
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.f.animate().alpha(1.0f).setDuration(350L);
            pr prVar2 = pr.f;
            duration2.setInterpolator(prVar2).setListener(new m(this, 1)).start();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar2).start();
            LinkedHashMap linkedHashMap = this.B;
            if (linkedHashMap.isEmpty()) {
                this.b.H.clear();
                this.n.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    s0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.C, spannableStringBuilder, this.b, this.n.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.G) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.n.append(spannableStringBuilder);
                this.n.m();
                v51 v51Var = this.b.m0;
                if (v51Var != null) {
                    v51Var.l();
                }
                Y(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0462 A[EDGE_INSN: B:55:0x0462->B:56:0x0462 BREAK  A[LOOP:1: B:43:0x03b1->B:54:0x03b1], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i11;
        ArrayList<TLRPC.Reaction> arrayList2;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new l1(this, 3));
        this.h = new s3(context);
        eo0 eo0Var = new eo0(context, this.h, this.resourceProvider, true);
        this.y = eo0Var;
        eo0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        ag.l lVar = new ag.l(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        s8 s8Var = new s8(context);
        this.e = s8Var;
        s8Var.setHeight(56);
        s8 s8Var2 = this.e;
        s8Var2.setBackgroundColor(k6.w0(null, s8Var2.e.h ? k6.f6 : k6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(k6.g6, k6.O6, k6.P6, k6.Q6, k6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ng.l
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s8 s8Var3;
                switch (i12) {
                    case 0:
                        s sVar = this.b;
                        if (sVar.e.e.h && (s8Var3 = sVar.s) != null && s8Var3.e.h) {
                            sVar.d0();
                        }
                        boolean z4 = sVar.e.e.h;
                        sVar.c0(z4 ? 2 : 1, z4 ? false : sVar.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        s sVar2 = this.b;
                        if (!sVar2.v.K) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.N;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = sVar2.O;
                                if (i13 < i14) {
                                    s0.f(-sVar2.J, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            s8 s8Var4 = sVar2.s;
                            Boolean valueOf = (s8Var4 == null || !sVar2.I.paid_media_allowed) ? null : Boolean.valueOf(s8Var4.e.h);
                            sVar2.v.setLoading(true);
                            MessagesController messagesController = sVar2.getMessagesController();
                            long j10 = sVar2.J;
                            int i15 = sVar2.P;
                            ArrayList b02 = sVar2.b0(false);
                            int i16 = sVar2.L;
                            sVar2.K = i16;
                            messagesController.setCustomChatReactions(j10, i15, b02, i16, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        this.h.addView(this.e, c6.n(-1, -2));
        a9 a9Var = new a9(context, 12, this.resourceProvider);
        int i13 = k6.B6;
        a9Var.setTextColor(k6.w0(null, i13, false));
        a9Var.setTopPadding(12);
        a9Var.setBottomPadding(16);
        a9Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(a9Var, c6.n(-1, -2));
        m4 m4Var = new m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        m4Var.setBackgroundColor(k6.w0(null, k6.d6, false));
        m4Var.setTextSize(15.0f);
        m4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, c6.c(-2.0f, -1));
        this.f.addView(m4Var, c6.n(-1, -2));
        g6 resourceProvider = getResourceProvider();
        int i14 = this.G;
        p pVar = new p(this, context, resourceProvider, i14);
        this.n = pVar;
        pVar.setOnFocused(new h(this, 2));
        this.f.addView(this.n, c6.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        a9 a9Var2 = new a9(context, 12, this.resourceProvider);
        a9Var2.setTextColor(k6.w0(null, i13, false));
        a9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), k6.gc, 0, new h(this, 3), getResourceProvider()));
        this.f.addView(a9Var2, c6.n(-1, -2));
        m4 m4Var2 = new m4(context, this.resourceProvider);
        m4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.f.addView(m4Var2, c6.n(-1, -2));
        this.r = new x7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.I;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i15 = getMessagesController().reactionsUniqMax;
            this.L = i15;
            this.K = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.L = i16;
            this.K = i16;
        }
        x7 x7Var = this.r;
        int i17 = this.L;
        int i18 = getMessagesController().reactionsUniqMax;
        w7 w7Var = new w7();
        w7Var.a = 1;
        w7Var.b = i18;
        w7Var.e = new c3(18);
        x7Var.d(i17, w7Var, new k(this, 2));
        this.f.addView(this.r, c6.n(-1, -2));
        a9 a9Var3 = new a9(context, 12, this.resourceProvider);
        a9Var3.setTopPadding(12);
        a9Var3.setBottomPadding(16);
        a9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(a9Var3, c6.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            s8 s8Var3 = new s8(context);
            this.s = s8Var3;
            s8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, c6.n(-1, -2));
            final int i19 = 1;
            this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ng.l
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s8 s8Var32;
                    switch (i19) {
                        case 0:
                            s sVar = this.b;
                            if (sVar.e.e.h && (s8Var32 = sVar.s) != null && s8Var32.e.h) {
                                sVar.d0();
                            }
                            boolean z4 = sVar.e.e.h;
                            sVar.c0(z4 ? 2 : 1, z4 ? false : sVar.a, true);
                            break;
                        case 1:
                            this.b.d0();
                            break;
                        default:
                            s sVar2 = this.b;
                            if (!sVar2.v.K) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.N;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = sVar2.O;
                                    if (i132 < i142) {
                                        s0.f(-sVar2.J, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                s8 s8Var4 = sVar2.s;
                                Boolean valueOf = (s8Var4 == null || !sVar2.I.paid_media_allowed) ? null : Boolean.valueOf(s8Var4.e.h);
                                sVar2.v.setLoading(true);
                                MessagesController messagesController = sVar2.getMessagesController();
                                long j10 = sVar2.J;
                                int i152 = sVar2.P;
                                ArrayList b02 = sVar2.b0(false);
                                int i162 = sVar2.L;
                                sVar2.K = i162;
                                messagesController.setCustomChatReactions(j10, i152, b02, i162, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
            a9 a9Var4 = new a9(context, 12, this.resourceProvider);
            a9Var4.setTextColor(k6.w0(null, i13, false));
            a9Var4.setTopPadding(12);
            a9Var4.setBottomPadding(70);
            a9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new h(this, 4)));
            this.f.addView(a9Var4, c6.n(-1, -2));
        } else {
            a9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i20 = k6.a7;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(i20, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.w.addView(this.x, c6.e(-1, -1, 119));
        t0 t0Var = new t0(context, getResourceProvider(), true);
        this.v = t0Var;
        t0Var.e();
        t0 t0Var2 = this.v;
        t0Var2.getClass();
        t0Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        t0Var2.e0 = new SpannableStringBuilder("l");
        oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
        oqVar.setTopOffset(1);
        t0Var2.e0.setSpan(oqVar, 0, 1, 33);
        final int i21 = 2;
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: ng.l
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s8 s8Var32;
                switch (i21) {
                    case 0:
                        s sVar = this.b;
                        if (sVar.e.e.h && (s8Var32 = sVar.s) != null && s8Var32.e.h) {
                            sVar.d0();
                        }
                        boolean z4 = sVar.e.e.h;
                        sVar.c0(z4 ? 2 : 1, z4 ? false : sVar.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        s sVar2 = this.b;
                        if (!sVar2.v.K) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.N;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = sVar2.O;
                                if (i132 < i142) {
                                    s0.f(-sVar2.J, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            s8 s8Var4 = sVar2.s;
                            Boolean valueOf = (s8Var4 == null || !sVar2.I.paid_media_allowed) ? null : Boolean.valueOf(s8Var4.e.h);
                            sVar2.v.setLoading(true);
                            MessagesController messagesController = sVar2.getMessagesController();
                            long j10 = sVar2.J;
                            int i152 = sVar2.P;
                            ArrayList b02 = sVar2.b0(false);
                            int i162 = sVar2.L;
                            sVar2.K = i162;
                            messagesController.setCustomChatReactions(j10, i152, b02, i162, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        lVar.addView(this.y);
        lVar.addView(this.w, c6.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.v, c6.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        lVar.setBackgroundColor(k6.w0(null, i20, false));
        s2 s2Var = new s2(this, context, 9);
        this.c = s2Var;
        s2Var.setVisibility(4);
        lVar.addView(this.c, c6.e(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z4 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.E;
        ArrayList arrayList4 = this.C;
        LinkedHashMap linkedHashMap3 = this.B;
        if (z4) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList3.size();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i23 >= size) {
                    linkedHashMap2 = linkedHashMap3;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList3.get(i23);
                i23++;
                ArrayList arrayList5 = arrayList4;
                linkedHashMap2 = linkedHashMap3;
                s0.a((TLRPC.TL_availableReaction) obj, linkedHashMap2, arrayList5, spannableStringBuilder4, this.b, this.n.getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i22++;
                if (i22 >= i14) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
                linkedHashMap3 = linkedHashMap2;
                arrayList4 = arrayList5;
            }
            this.n.append(spannableStringBuilder3);
            c0(0, this.a, false);
            linkedHashMap = linkedHashMap2;
        } else {
            ArrayList arrayList6 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList7 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size2 = arrayList7.size();
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (i25 >= size2) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList7.get(i25);
                    i25++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction == null) {
                            continue;
                        } else {
                            s0.a(tL_availableReaction, linkedHashMap4, arrayList6, spannableStringBuilder5, this.b, this.n.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList6;
                            spannableStringBuilder2 = spannableStringBuilder5;
                            i24++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList6;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            q qVar = this.b;
                            i11 = i25;
                            u5 e6 = s0.e(null, Long.valueOf(tL_reactionCustomEmoji.document_id), this.n.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e6);
                            arrayList = arrayList;
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList7;
                            spannableString.setSpan(e6, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (qVar != null) {
                                qVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i24++;
                            if (i24 < i14) {
                                break;
                            }
                            spannableStringBuilder5 = spannableStringBuilder2;
                            arrayList6 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList7 = arrayList2;
                            i25 = i11;
                        }
                    }
                    arrayList2 = arrayList7;
                    i11 = i25;
                    if (i24 < i14) {
                    }
                }
                this.n.append(spannableStringBuilder2);
                c0(1, this.a, false);
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList8 = arrayList6;
                boolean z10 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z10 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    c0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.P == i10 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed) {
                        d0();
                    }
                    this.D.putAll(linkedHashMap);
                    this.F = this.a;
                    this.fragmentView = lVar;
                    return lVar;
                }
                if (z10) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                    int size3 = arrayList3.size();
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= size3) {
                            spannableStringBuilder = spannableStringBuilder6;
                            break;
                        }
                        Object obj2 = arrayList3.get(i27);
                        i27++;
                        ArrayList arrayList9 = arrayList8;
                        s0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList9, spannableStringBuilder6, this.b, this.n.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder6;
                        i26++;
                        if (i26 >= i14) {
                            break;
                        }
                        spannableStringBuilder6 = spannableStringBuilder;
                        arrayList8 = arrayList9;
                    }
                    this.n.append(spannableStringBuilder);
                    i10 = 2;
                    c0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.P == i10 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                        d0();
                    }
                    this.D.putAll(linkedHashMap);
                    this.F = this.a;
                    this.fragmentView = lVar;
                    return lVar;
                }
            }
        }
        i10 = 2;
        this.e.f(LocaleController.getString(R.string.EnableReactions), this.P == i10 || this.a, false);
        this.n.m();
        if (chatFull.paid_media_allowed) {
        }
        this.D.putAll(linkedHashMap);
        this.F = this.a;
        this.fragmentView = lVar;
        return lVar;
    }

    public final void d0() {
        s8 s8Var = this.s;
        boolean z4 = s8Var.e.h;
        int i10 = this.G;
        LinkedHashMap linkedHashMap = this.B;
        ArrayList arrayList = this.C;
        if (z4) {
            s8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            u5 u5Var = (u5) linkedHashMap.remove(-1L);
            if (u5Var != null) {
                u5Var.setRemoved(new m2(16, this, u5Var));
            }
            W(u5Var);
            this.b.x(-1L, true);
            Y(false);
            this.n.setMaxLength(i10);
            c0(this.P, this.a, true);
        } else {
            s8Var.setChecked(true);
            try {
                this.n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = l5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.n.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            c0(this.P, true, true);
        }
        this.n.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.J)) {
            f5 f5Var = this.parentLayout;
            if (f5Var == null || f5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.H) {
            if (z4) {
                Z();
                return false;
            }
        } else if (!X(z4)) {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.J;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.M = chat;
        int i10 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.M = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.M, true);
            }
            return false;
        }
        if (this.I != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new i(this, i10));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.E.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.R);
        if (this.P == 2 && this.L != this.K) {
            getMessagesController().setCustomChatReactions(this.J, this.P, b0(false), this.L, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        this.Q = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        if (this.Q) {
            this.Q = false;
            this.n.setFocusable(true);
            this.n.setFocusableInTouchMode(true);
            if (this.H) {
                this.n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && this.P != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z4 || z10) {
            return;
        }
        if (this.b == null) {
            q qVar = new q(this, this, getParentActivity(), getResourceProvider(), k6.v0(k6.G6, getResourceProvider()));
            this.b = qVar;
            qVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(k6.w0(null, k6.d6, false));
            this.c.addView(this.b, c6.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new k(this, 0));
            this.c.addView(this.d, c6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new ag.f(14), 200L);
    }
}
