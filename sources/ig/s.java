package ig;

import ag.e2;
import ag.l3;
import ag.p1;
import ag.y1;
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
import h7.z5;
import hh.m5;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap A;
    public final ArrayList B;
    public final LinkedHashMap C;
    public final ArrayList D;
    public boolean E;
    public final int F;
    public boolean G;
    public final TLRPC.ChatFull H;
    public final long I;
    public int J;
    public int K;
    public TLRPC.Chat L;
    public TL_stories.TL_premium_boostsStatus M;
    public int N;
    public int O;
    public boolean P;
    public final h Q;
    public boolean a;
    public q b;
    public p1 c;
    public f d;
    public p8 e;
    public LinearLayout f;
    public hh.m h;
    public p n;
    public u7 r;
    public p8 s;
    public t0 v;
    public FrameLayout w;
    public ImageView x;
    public kn0 y;

    public s(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.A = new LinkedHashMap();
        this.B = new ArrayList();
        this.C = new LinkedHashMap();
        this.D = new ArrayList();
        this.F = getMessagesController().boostsChannelLevelMax;
        this.G = false;
        this.O = -1;
        this.Q = new h(this, 5);
        this.I = j10;
        this.H = chatFull;
    }

    public final void W(t5 t5Var) {
        Editable text = this.n.getText();
        Layout layout = this.n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(t5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            t5[] t5VarArr = (t5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), t5.class);
            for (t5 t5Var2 : t5VarArr) {
                t5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = !this.A.keySet().equals(this.C.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.M;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.N) {
            z11 = false;
        }
        boolean z12 = this.E == this.a ? z11 : true;
        if (z10 && z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.a.P = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) { // from class: ig.g
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(b2 b2Var, int i11) {
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) { // from class: ig.g
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(b2 b2Var, int i112) {
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
        if (this.M == null) {
            return;
        }
        if (this.O == 0) {
            this.O = 1;
        }
        int size = b0(true).size();
        this.N = size;
        if (this.M.level >= size) {
            this.v.f(null, true);
            return;
        }
        if (z10) {
            mc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.v.setLvlRequiredState(this.N);
    }

    public final void Z() {
        if (this.G) {
            int i10 = 0;
            this.G = false;
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
            this.c.animate().translationY(this.c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(er.f).setUpdateListener(new j(this, i11)).setListener(new m(this, i10)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n.getText());
        if (!this.n.hasSelection()) {
            return false;
        }
        t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, t5.class);
        for (t5 t5Var : t5VarArr) {
            this.A.remove(Long.valueOf(t5Var.documentId));
            this.B.remove(Long.valueOf(t5Var.documentId));
            this.b.A(Long.valueOf(t5Var.documentId));
        }
        this.n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.B;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.D;
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
        return z10 ? arrayList2 : arrayList;
    }

    public final void c0(int i10, boolean z10, boolean z11) {
        if (this.O == i10 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i10 == 1 || i10 == 0 || z10;
        this.e.setChecked(z12);
        int w02 = g6.w0(null, z12 ? g6.f6 : g6.e6, false);
        if (!z11) {
            this.e.setBackgroundColor(w02);
        } else if (z12) {
            this.e.b(w02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(w02);
        }
        this.O = i10;
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
            er erVar = er.f;
            duration.setInterpolator(erVar).setListener(new m(this, 2)).start();
            this.f.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).setListener(new m(this, 3)).start();
            return;
        }
        this.f.setVisibility(0);
        this.w.setVisibility(0);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.f.animate().alpha(1.0f).setDuration(350L);
            er erVar2 = er.f;
            duration2.setInterpolator(erVar2).setListener(new m(this, 1)).start();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar2).start();
            LinkedHashMap linkedHashMap = this.A;
            if (linkedHashMap.isEmpty()) {
                this.b.G.clear();
                this.n.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    s0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.B, spannableStringBuilder, this.b, this.n.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.F) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.n.append(spannableStringBuilder);
                this.n.m();
                z41 z41Var = this.b.l0;
                if (z41Var != null) {
                    z41Var.l();
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0461 A[EDGE_INSN: B:55:0x0461->B:56:0x0461 BREAK  A[LOOP:1: B:43:0x03b0->B:54:0x03b0], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.n2
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
        this.actionBar.setActionBarMenuOnItemClick(new e2(this, 3));
        this.h = new hh.m(context);
        kn0 kn0Var = new kn0(context, this.h, this.resourceProvider, true);
        this.y = kn0Var;
        kn0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        y1 y1Var = new y1(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        p8 p8Var = new p8(context);
        this.e = p8Var;
        p8Var.setHeight(56);
        p8 p8Var2 = this.e;
        p8Var2.setBackgroundColor(g6.w0(null, p8Var2.e.h ? g6.f6 : g6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(g6.g6, g6.O6, g6.P6, g6.Q6, g6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ig.l
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p8 p8Var3;
                switch (i12) {
                    case 0:
                        s sVar = this.b;
                        if (sVar.e.e.h && (p8Var3 = sVar.s) != null && p8Var3.e.h) {
                            sVar.d0();
                        }
                        boolean z10 = sVar.e.e.h;
                        sVar.c0(z10 ? 2 : 1, z10 ? false : sVar.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        s sVar2 = this.b;
                        if (!sVar2.v.J) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.M;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = sVar2.N;
                                if (i13 < i14) {
                                    s0.f(-sVar2.I, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            p8 p8Var4 = sVar2.s;
                            Boolean valueOf = (p8Var4 == null || !sVar2.H.paid_media_allowed) ? null : Boolean.valueOf(p8Var4.e.h);
                            sVar2.v.setLoading(true);
                            MessagesController messagesController = sVar2.getMessagesController();
                            long j10 = sVar2.I;
                            int i15 = sVar2.O;
                            ArrayList b02 = sVar2.b0(false);
                            int i16 = sVar2.K;
                            sVar2.J = i16;
                            messagesController.setCustomChatReactions(j10, i15, b02, i16, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        this.h.addView(this.e, z5.n(-1, -2));
        x8 x8Var = new x8(context, 12, this.resourceProvider);
        int i13 = g6.B6;
        x8Var.setTextColor(g6.w0(null, i13, false));
        x8Var.setTopPadding(12);
        x8Var.setBottomPadding(16);
        x8Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(x8Var, z5.n(-1, -2));
        j4 j4Var = new j4(context);
        j4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        j4Var.setBackgroundColor(g6.w0(null, g6.d6, false));
        j4Var.setTextSize(15.0f);
        j4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, z5.c(-2.0f, -1));
        this.f.addView(j4Var, z5.n(-1, -2));
        c6 resourceProvider = getResourceProvider();
        int i14 = this.F;
        p pVar = new p(this, context, resourceProvider, i14);
        this.n = pVar;
        pVar.setOnFocused(new h(this, 2));
        this.f.addView(this.n, z5.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        x8 x8Var2 = new x8(context, 12, this.resourceProvider);
        x8Var2.setTextColor(g6.w0(null, i13, false));
        x8Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), g6.gc, 0, new h(this, 3), getResourceProvider()));
        this.f.addView(x8Var2, z5.n(-1, -2));
        j4 j4Var2 = new j4(context, this.resourceProvider);
        j4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.f.addView(j4Var2, z5.n(-1, -2));
        this.r = new u7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.H;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i15 = getMessagesController().reactionsUniqMax;
            this.K = i15;
            this.J = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.K = i16;
            this.J = i16;
        }
        u7 u7Var = this.r;
        int i17 = this.K;
        int i18 = getMessagesController().reactionsUniqMax;
        t7 t7Var = new t7();
        t7Var.a = 1;
        t7Var.b = i18;
        t7Var.e = new ng.a(24);
        u7Var.d(i17, t7Var, new k(this, 2));
        this.f.addView(this.r, z5.n(-1, -2));
        x8 x8Var3 = new x8(context, 12, this.resourceProvider);
        x8Var3.setTopPadding(12);
        x8Var3.setBottomPadding(16);
        x8Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(x8Var3, z5.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            p8 p8Var3 = new p8(context);
            this.s = p8Var3;
            p8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, z5.n(-1, -2));
            final int i19 = 1;
            this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ig.l
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p8 p8Var32;
                    switch (i19) {
                        case 0:
                            s sVar = this.b;
                            if (sVar.e.e.h && (p8Var32 = sVar.s) != null && p8Var32.e.h) {
                                sVar.d0();
                            }
                            boolean z10 = sVar.e.e.h;
                            sVar.c0(z10 ? 2 : 1, z10 ? false : sVar.a, true);
                            break;
                        case 1:
                            this.b.d0();
                            break;
                        default:
                            s sVar2 = this.b;
                            if (!sVar2.v.J) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.M;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = sVar2.N;
                                    if (i132 < i142) {
                                        s0.f(-sVar2.I, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                p8 p8Var4 = sVar2.s;
                                Boolean valueOf = (p8Var4 == null || !sVar2.H.paid_media_allowed) ? null : Boolean.valueOf(p8Var4.e.h);
                                sVar2.v.setLoading(true);
                                MessagesController messagesController = sVar2.getMessagesController();
                                long j10 = sVar2.I;
                                int i152 = sVar2.O;
                                ArrayList b02 = sVar2.b0(false);
                                int i162 = sVar2.K;
                                sVar2.J = i162;
                                messagesController.setCustomChatReactions(j10, i152, b02, i162, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
            x8 x8Var4 = new x8(context, 12, this.resourceProvider);
            x8Var4.setTextColor(g6.w0(null, i13, false));
            x8Var4.setTopPadding(12);
            x8Var4.setBottomPadding(70);
            x8Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new h(this, 4)));
            this.f.addView(x8Var4, z5.n(-1, -2));
        } else {
            x8Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i20 = g6.a7;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i20, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.w.addView(this.x, z5.e(-1, -1, 119));
        t0 t0Var = new t0(context, getResourceProvider(), true);
        this.v = t0Var;
        t0Var.e();
        t0 t0Var2 = this.v;
        t0Var2.getClass();
        t0Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        t0Var2.d0 = new SpannableStringBuilder("l");
        cq cqVar = new cq(R.drawable.mini_switch_lock, 0);
        cqVar.setTopOffset(1);
        t0Var2.d0.setSpan(cqVar, 0, 1, 33);
        final int i21 = 2;
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: ig.l
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p8 p8Var32;
                switch (i21) {
                    case 0:
                        s sVar = this.b;
                        if (sVar.e.e.h && (p8Var32 = sVar.s) != null && p8Var32.e.h) {
                            sVar.d0();
                        }
                        boolean z10 = sVar.e.e.h;
                        sVar.c0(z10 ? 2 : 1, z10 ? false : sVar.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        s sVar2 = this.b;
                        if (!sVar2.v.J) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.M;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = sVar2.N;
                                if (i132 < i142) {
                                    s0.f(-sVar2.I, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            p8 p8Var4 = sVar2.s;
                            Boolean valueOf = (p8Var4 == null || !sVar2.H.paid_media_allowed) ? null : Boolean.valueOf(p8Var4.e.h);
                            sVar2.v.setLoading(true);
                            MessagesController messagesController = sVar2.getMessagesController();
                            long j10 = sVar2.I;
                            int i152 = sVar2.O;
                            ArrayList b02 = sVar2.b0(false);
                            int i162 = sVar2.K;
                            sVar2.J = i162;
                            messagesController.setCustomChatReactions(j10, i152, b02, i162, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        y1Var.addView(this.y);
        y1Var.addView(this.w, z5.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.v, z5.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        y1Var.setBackgroundColor(g6.w0(null, i20, false));
        p1 p1Var = new p1(this, context, 6);
        this.c = p1Var;
        p1Var.setVisibility(4);
        y1Var.addView(this.c, z5.e(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z10 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.D;
        ArrayList arrayList4 = this.B;
        LinkedHashMap linkedHashMap3 = this.A;
        if (z10) {
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
                            t5 e9 = s0.e(null, Long.valueOf(tL_reactionCustomEmoji.document_id), this.n.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e9);
                            arrayList = arrayList;
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList7;
                            spannableString.setSpan(e9, 0, spannableString.length(), 33);
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
                boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z11 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    c0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.O == i10 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed) {
                        d0();
                    }
                    this.C.putAll(linkedHashMap);
                    this.E = this.a;
                    this.fragmentView = y1Var;
                    return y1Var;
                }
                if (z11) {
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
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.O == i10 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                        d0();
                    }
                    this.C.putAll(linkedHashMap);
                    this.E = this.a;
                    this.fragmentView = y1Var;
                    return y1Var;
                }
            }
        }
        i10 = 2;
        this.e.f(LocaleController.getString(R.string.EnableReactions), this.O == i10 || this.a, false);
        this.n.m();
        if (chatFull.paid_media_allowed) {
        }
        this.C.putAll(linkedHashMap);
        this.E = this.a;
        this.fragmentView = y1Var;
        return y1Var;
    }

    public final void d0() {
        p8 p8Var = this.s;
        boolean z10 = p8Var.e.h;
        int i10 = this.F;
        LinkedHashMap linkedHashMap = this.A;
        ArrayList arrayList = this.B;
        if (z10) {
            p8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            t5 t5Var = (t5) linkedHashMap.remove(-1L);
            if (t5Var != null) {
                t5Var.setRemoved(new m5(7, this, t5Var));
            }
            W(t5Var);
            this.b.x(-1L, true);
            Y(false);
            this.n.setMaxLength(i10);
            c0(this.O, this.a, true);
        } else {
            p8Var.setChecked(true);
            try {
                this.n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = k5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.n.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            c0(this.O, true, true);
        }
        this.n.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.I)) {
            b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.G) {
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
        long j10 = this.I;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.L = chat;
        int i10 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.L = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.L, true);
            }
            return false;
        }
        if (this.H != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new i(this, i10));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.D.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        if (this.O == 2 && this.K != this.J) {
            getMessagesController().setCustomChatReactions(this.I, this.O, b0(false), this.K, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        this.P = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (this.P) {
            this.P = false;
            this.n.setFocusable(true);
            this.n.setFocusableInTouchMode(true);
            if (this.G) {
                this.n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.O != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            q qVar = new q(this, this, getParentActivity(), getResourceProvider(), g6.v0(g6.G6, getResourceProvider()));
            this.b = qVar;
            qVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(g6.w0(null, g6.d6, false));
            this.c.addView(this.b, z5.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new k(this, 0));
            this.c.addView(this.d, z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.B;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new l3(8), 200L);
    }
}
