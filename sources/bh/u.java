package bh;

import a8.ee;
import android.content.Context;
import android.graphics.Paint;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public s71 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public final int M;
    public boolean N;
    public boolean O;
    public oe.b P;
    public final TLRPC.ChatFull Q;
    public final long R;
    public int S;
    public int T;
    public TLRPC.Chat U;
    public TL_stories.TL_premium_boostsStatus V;
    public int W;
    public int X;
    public boolean Y;
    public final j Z;
    public boolean a;
    public s b;
    public r c;
    public h d;
    public a9 e;
    public i9 f;
    public q h;
    public c8 n;
    public a9 r;
    public b1 s;
    public FrameLayout v;
    public ImageView w;
    public int x;
    public final Paint y;

    public u(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.y = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.M = getMessagesController().boostsChannelLevelMax;
        this.N = false;
        this.X = -1;
        this.Z = new j(this, 6);
        this.R = j10;
        this.Q = chatFull;
    }

    public final void X(View view, boolean z10) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z10));
    }

    public final void Y(c6 c6Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(c6Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            c6[] c6VarArr = (c6[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), c6.class);
            for (c6 c6Var2 : c6VarArr) {
                c6Var2.setAnimateChanges();
            }
        }
    }

    public final boolean Z(boolean z10) {
        boolean z11 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.W) {
            z11 = false;
        }
        boolean z12 = this.L == this.a ? z11 : true;
        if (z10 && z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) { // from class: bh.i
                public final /* synthetic */ u b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(e2 e2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.s.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) { // from class: bh.i
                public final /* synthetic */ u b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(e2 e2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.s.performClick();
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

    public final void a0(boolean z10) {
        if (this.V == null) {
            return;
        }
        if (this.X == 0) {
            this.X = 1;
        }
        int size = d0(true).size();
        this.W = size;
        if (this.V.level >= size) {
            this.s.g(null, true);
            return;
        }
        if (z10) {
            wc.b0(this).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.W);
    }

    public final void b0() {
        if (this.N) {
            this.N = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.c.setLayerType(2, null);
            this.P.a(false, true);
        }
    }

    public final boolean c0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        c6[] c6VarArr = (c6[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, c6.class);
        for (c6 c6Var : c6VarArr) {
            this.H.remove(Long.valueOf(c6Var.documentId));
            this.I.remove(Long.valueOf(c6Var.documentId));
            this.b.A(Long.valueOf(c6Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        a0(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        if (Z(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03b5 A[EDGE_INSN: B:53:0x03b5->B:54:0x03b5 BREAK  A[LOOP:1: B:41:0x031e->B:52:0x031e], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        boolean z10;
        int i11;
        ArrayList<TLRPC.Reaction> arrayList;
        char c10;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new m(this, 0));
        TLRPC.Document document = null;
        s71 s71Var = new s71(this, new ai.e(this, 1), null, null);
        this.E = s71Var;
        s71Var.setSections(true);
        this.E.setSectionsDrawBackground(true);
        p pVar = new p(this, context);
        pVar.setFocusableInTouchMode(true);
        pVar.requestFocus();
        a9 a9Var = new a9(context);
        this.e = a9Var;
        a9Var.setHeight(56);
        a9 a9Var2 = this.e;
        f7.i(a9Var2.e.h ? y6.f6 : y6.e6, a9Var2, null);
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(y6.g6, y6.O6, y6.P6, y6.Q6, y6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: bh.l
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a9 a9Var3;
                switch (i12) {
                    case 0:
                        u uVar = this.b;
                        if (uVar.e.e.h && (a9Var3 = uVar.r) != null && a9Var3.e.h) {
                            uVar.g0();
                        }
                        boolean z11 = uVar.e.e.h;
                        uVar.e0(z11 ? 2 : 1, z11 ? false : uVar.a, true);
                        break;
                    case 1:
                        this.b.g0();
                        break;
                    default:
                        u uVar2 = this.b;
                        if (!uVar2.s.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = uVar2.V;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = uVar2.W;
                                if (i13 < i14) {
                                    a1.f(-uVar2.R, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            a9 a9Var4 = uVar2.r;
                            Boolean valueOf = (a9Var4 == null || !uVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(a9Var4.e.h);
                            uVar2.s.setLoading(true);
                            MessagesController messagesController = uVar2.getMessagesController();
                            long j10 = uVar2.R;
                            int i15 = uVar2.X;
                            ArrayList d02 = uVar2.d0(false);
                            int i16 = uVar2.T;
                            uVar2.S = i16;
                            messagesController.setCustomChatReactions(j10, i15, d02, i16, valueOf, new k(uVar2, 2), new j(uVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        i9 i9Var = new i9(context, 12, this.resourceProvider);
        this.f = i9Var;
        aa0 textView = i9Var.getTextView();
        int i13 = y6.B6;
        f7.V(textView, i13, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        q4 q4Var = new q4(context);
        q4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        f7.i(y6.d6, q4Var, null);
        q4Var.setTextSize(15.0f);
        q4Var.setTopMargin(14);
        X(q4Var, false);
        u6 resourceProvider = getResourceProvider();
        int i14 = this.M;
        q qVar = new q(this, context, resourceProvider, i14);
        this.h = qVar;
        qVar.setOnFocused(new j(this, 3));
        X(this.h, false);
        i9 i9Var2 = new i9(context, 12, this.resourceProvider);
        f7.V(i9Var2.getTextView(), i13, null);
        i9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), y6.gc, 0, new j(this, 4), getResourceProvider()));
        X(i9Var2, true);
        q4 q4Var2 = new q4(context, this.resourceProvider);
        q4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        X(q4Var2, false);
        this.n = new c8(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.Q;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i15 = getMessagesController().reactionsUniqMax;
            this.T = i15;
            this.S = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.T = i16;
            this.S = i16;
        }
        c8 c8Var = this.n;
        int i17 = this.T;
        int i18 = getMessagesController().reactionsUniqMax;
        b8 b8Var = new b8();
        b8Var.a = 1;
        b8Var.b = i18;
        b8Var.e = new m4.x0(26);
        c8Var.d(i17, b8Var, new k(this, 3));
        X(this.n, false);
        i9 i9Var3 = new i9(context, 12, this.resourceProvider);
        i9Var3.setTopPadding(12);
        i9Var3.setBottomPadding(16);
        i9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        X(i9Var3, true);
        if (chatFull.paid_media_allowed) {
            a9 a9Var3 = new a9(context);
            this.r = a9Var3;
            a9Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            X(this.r, false);
            final int i19 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: bh.l
                public final /* synthetic */ u b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a9 a9Var32;
                    switch (i19) {
                        case 0:
                            u uVar = this.b;
                            if (uVar.e.e.h && (a9Var32 = uVar.r) != null && a9Var32.e.h) {
                                uVar.g0();
                            }
                            boolean z11 = uVar.e.e.h;
                            uVar.e0(z11 ? 2 : 1, z11 ? false : uVar.a, true);
                            break;
                        case 1:
                            this.b.g0();
                            break;
                        default:
                            u uVar2 = this.b;
                            if (!uVar2.s.Q) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = uVar2.V;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = uVar2.W;
                                    if (i132 < i142) {
                                        a1.f(-uVar2.R, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                a9 a9Var4 = uVar2.r;
                                Boolean valueOf = (a9Var4 == null || !uVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(a9Var4.e.h);
                                uVar2.s.setLoading(true);
                                MessagesController messagesController = uVar2.getMessagesController();
                                long j10 = uVar2.R;
                                int i152 = uVar2.X;
                                ArrayList d02 = uVar2.d0(false);
                                int i162 = uVar2.T;
                                uVar2.S = i162;
                                messagesController.setCustomChatReactions(j10, i152, d02, i162, valueOf, new k(uVar2, 2), new j(uVar2, 2));
                                break;
                            }
                            break;
                    }
                }
            });
            i9 i9Var4 = new i9(context, 12, this.resourceProvider);
            f7.V(i9Var4.getTextView(), i13, null);
            i9Var4.setTopPadding(12);
            i9Var4.setBottomPadding(70);
            i9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new j(this, 5)));
            X(i9Var4, true);
        } else {
            i9Var3.setBottomPadding(70);
        }
        this.v = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.w.setScaleType(ImageView.ScaleType.FIT_XY);
        f7.t(this.w, y6.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.v.addView(this.w, kb1.i(-1, -1, 119));
        b1 b1Var = new b1(context, getResourceProvider(), true);
        this.s = b1Var;
        b1Var.f();
        b1 b1Var2 = this.s;
        b1Var2.getClass();
        b1Var2.i(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        b1Var2.k0 = new SpannableStringBuilder("l");
        zq zqVar = new zq(R.drawable.mini_switch_lock, 0);
        zqVar.setTopOffset(1);
        b1Var2.k0.setSpan(zqVar, 0, 1, 33);
        final int i20 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: bh.l
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a9 a9Var32;
                switch (i20) {
                    case 0:
                        u uVar = this.b;
                        if (uVar.e.e.h && (a9Var32 = uVar.r) != null && a9Var32.e.h) {
                            uVar.g0();
                        }
                        boolean z11 = uVar.e.e.h;
                        uVar.e0(z11 ? 2 : 1, z11 ? false : uVar.a, true);
                        break;
                    case 1:
                        this.b.g0();
                        break;
                    default:
                        u uVar2 = this.b;
                        if (!uVar2.s.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = uVar2.V;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = uVar2.W;
                                if (i132 < i142) {
                                    a1.f(-uVar2.R, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            a9 a9Var4 = uVar2.r;
                            Boolean valueOf = (a9Var4 == null || !uVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(a9Var4.e.h);
                            uVar2.s.setLoading(true);
                            MessagesController messagesController = uVar2.getMessagesController();
                            long j10 = uVar2.R;
                            int i152 = uVar2.X;
                            ArrayList d02 = uVar2.d0(false);
                            int i162 = uVar2.T;
                            uVar2.S = i162;
                            messagesController.setCustomChatReactions(j10, i152, d02, i162, valueOf, new k(uVar2, 2), new j(uVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        pVar.addView(this.E);
        pVar.addView(this.v, kb1.h(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.v.addView(this.s, kb1.h(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        h0();
        r rVar = new r(this, context);
        this.c = rVar;
        rVar.setVisibility(4);
        pVar.addView(this.c, kb1.i(-1, -2, 80));
        this.P = new oe.b(0, new a4.l(this, 6), ds.f, 350L, false);
        i0();
        j0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.I;
        LinkedHashMap linkedHashMap = this.H;
        if (z11) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int size = arrayList2.size();
            int i21 = 0;
            int i22 = 0;
            while (i22 < size) {
                Object obj = arrayList2.get(i22);
                i22++;
                a1.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList3, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                i21++;
                if (i21 >= i14) {
                    break;
                }
            }
            this.h.append(spannableStringBuilder);
            e0(0, this.a, false);
            z10 = true;
        } else {
            if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
                boolean z12 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z12 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    e0(2, this.a, false);
                } else {
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int size2 = arrayList2.size();
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            if (i24 >= size2) {
                                z10 = true;
                                break;
                            }
                            Object obj2 = arrayList2.get(i24);
                            i24++;
                            a1.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList3, spannableStringBuilder2, this.b, this.h.getFontMetricsInt());
                            z10 = true;
                            i23++;
                            if (i23 >= i14) {
                                break;
                            }
                        }
                        this.h.append(spannableStringBuilder2);
                        i10 = 2;
                        e0(2, this.a, false);
                        this.e.f(LocaleController.getString(R.string.EnableReactions), (this.X == i10 || this.a) ? z10 : false, false);
                        this.h.m();
                        if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                            g0();
                        }
                        this.J.putAll(linkedHashMap);
                        this.L = this.a;
                        this.fragmentView = pVar;
                        return pVar;
                    }
                    i10 = 2;
                }
                z10 = true;
                this.e.f(LocaleController.getString(R.string.EnableReactions), (this.X == i10 || this.a) ? z10 : false, false);
                this.h.m();
                if (chatFull.paid_media_allowed) {
                    g0();
                }
                this.J.putAll(linkedHashMap);
                this.L = this.a;
                this.fragmentView = pVar;
                return pVar;
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size3 = arrayList4.size();
            int i25 = 0;
            int i26 = 0;
            while (i26 < size3) {
                TLRPC.Reaction reaction = arrayList4.get(i26);
                i26++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction != null) {
                        a1.a(tL_availableReaction, linkedHashMap, arrayList3, spannableStringBuilder3, this.b, this.h.getFontMetricsInt());
                        i25++;
                    }
                } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                    s sVar = this.b;
                    i11 = i26;
                    c6 e = a1.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                    linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                    arrayList3.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                    SpannableString spannableString = new SpannableString("e");
                    arrayList = arrayList4;
                    c10 = '!';
                    spannableString.setSpan(e, 0, spannableString.length(), 33);
                    spannableStringBuilder3.append((CharSequence) spannableString);
                    if (sVar != null) {
                        sVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                    }
                    i25++;
                    if (i25 < i14) {
                        break;
                    }
                    i26 = i11;
                    arrayList4 = arrayList;
                    document = null;
                }
                arrayList = arrayList4;
                i11 = i26;
                c10 = '!';
                if (i25 < i14) {
                }
            }
            this.h.append(spannableStringBuilder3);
            e0(1, this.a, false);
            z10 = true;
        }
        i10 = 2;
        this.e.f(LocaleController.getString(R.string.EnableReactions), (this.X == i10 || this.a) ? z10 : false, false);
        this.h.m();
        if (chatFull.paid_media_allowed) {
        }
        this.J.putAll(linkedHashMap);
        this.L = this.a;
        this.fragmentView = pVar;
        return pVar;
    }

    public final ArrayList d0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.K;
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.R)) {
            j5 j5Var = this.parentLayout;
            if (j5Var == null || j5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(int i10, boolean z10, boolean z11) {
        if (this.X == i10 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i10 == 1 || i10 == 0 || z10;
        this.e.setChecked(z12);
        int x02 = y6.x0(null, z12 ? y6.f6 : y6.e6, false);
        if (!z11) {
            f7.i(z12 ? y6.f6 : y6.e6, this.e, null);
        } else if (z12) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.X = i10;
        if (i10 != 1 && i10 != 0 && !z10) {
            if (!z11) {
                this.v.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.g3.O(false);
                return;
            } else {
                b0();
                this.v.animate().setListener(null).cancel();
                this.v.animate().alpha(0.0f).setDuration(350L).setInterpolator(ds.f).setListener(new b(this, 1)).start();
                this.h.setFocusableInTouchMode(false);
                this.E.g3.O(true);
                return;
            }
        }
        this.v.setVisibility(0);
        this.E.g3.O(z11);
        if (z11) {
            this.v.animate().setListener(null).cancel();
            this.v.animate().alpha(1.0f).setDuration(350L).setInterpolator(ds.f).start();
            this.E.post(new j(this, 1));
            LinkedHashMap linkedHashMap = this.H;
            if (linkedHashMap.isEmpty()) {
                this.b.K.clear();
                this.h.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.K;
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    a1.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.I, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.M) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.m();
                e51 e51Var = this.b.p0;
                if (e51Var != null) {
                    e51Var.l();
                }
                a0(false);
            }
        }
    }

    public final void f0(float f7) {
        float a2 = ee.a(f7, 0.0f, 1.0f);
        r rVar = this.c;
        if (rVar != null && this.v != null) {
            rVar.setTranslationY((1.0f - a2) * rVar.getMeasuredHeight());
            this.v.setTranslationY((-a2) * this.c.getMeasuredHeight());
        }
        h0();
        j0();
    }

    public final void g0() {
        a9 a9Var = this.r;
        boolean z10 = a9Var.e.h;
        int i10 = this.M;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z10) {
            a9Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            c6 c6Var = (c6) linkedHashMap.remove(-1L);
            if (c6Var != null) {
                c6Var.setRemoved(new a1.f(21, this, c6Var));
            }
            Y(c6Var);
            this.b.x(-1L, true);
            a0(false);
            this.h.setMaxLength(i10);
            e0(this.X, this.a, true);
        } else {
            a9Var.setChecked(true);
            try {
                this.h.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                t tVar = new t(this);
                tVar.cacheType = t5.g();
                tVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, tVar);
                spannableString.setSpan(tVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                a0(true);
                Y(tVar);
            } catch (Exception e) {
                FileLog.e(e);
            }
            e0(this.X, true, true);
        }
        this.h.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final nm0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final void h0() {
        if (this.v == null || this.s == null) {
            return;
        }
        oe.b bVar = this.P;
        int round = Math.round((1.0f - (bVar != null ? bVar.e : 0.0f)) * this.x);
        ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(74.0f) + round;
        this.v.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = AndroidUtilities.dp(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    public final void i0() {
        if (this.c != null) {
            this.y.setColor(y6.w0(y6.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.x);
            this.c.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.E == null) {
            return;
        }
        oe.b bVar = this.P;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d), bVar != null ? bVar.e : 0.0f);
        s71 s71Var = this.E;
        i0.b bVar2 = this.mSystemInsets;
        oi.a.d(s71Var, bVar2.b, bVar2.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), lerp);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (this.N) {
            if (z10) {
                b0();
                return false;
            }
        } else if (!Z(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.U = chat;
        int i10 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.U = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.U, true);
            }
            return false;
        }
        if (this.Q != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new k(this, i10));
            getNotificationCenter().addWeakObserver(this, NotificationCenter.reactionsDidLoad);
            this.K.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Z);
        if (this.X == 2 && this.T != this.S) {
            getMessagesController().setCustomChatReactions(this.R, this.X, d0(false), this.T, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.x = i13;
        h0();
        i0();
        j0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        this.Y = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        if (this.Y) {
            this.Y = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.N) {
                this.h.n(false);
                AndroidUtilities.runOnUIThread(new j(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            a9 a9Var = this.e;
            if (a9Var == null || !(a9Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            a9 a9Var2 = this.e;
            a9Var2.setBackgroundColor(y6.x0(null, a9Var2.e.h ? y6.f6 : y6.e6, false));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.X != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.O = true;
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            s sVar = new s(this, this, getParentActivity(), getResourceProvider(), y6.w0(y6.G6, getResourceProvider()));
            this.b = sVar;
            sVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            f7.i(y6.d6, this.b, null);
            this.c.addView(this.b, kb1.i(-1, -2, 80));
            h hVar = new h(getParentActivity(), getResourceProvider());
            this.d = hVar;
            hVar.setOnBackspace(new k(this, 1));
            this.c.addView(this.d, kb1.h(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.I;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new ag.c(2), 200L);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
