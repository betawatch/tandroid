package hg;

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
import fh.d2;
import fh.w4;
import g7.e6;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.a51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s extends o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public d2 c;
    public f d;
    public t8 e;
    public LinearLayout f;
    public gh.m h;
    public p n;
    public x7 r;
    public t8 s;
    public u0 v;
    public FrameLayout w;
    public ImageView x;
    public in0 y;

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

    public final void V(t5 t5Var) {
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

    public final boolean W(boolean z10) {
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
            final int i9 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) { // from class: hg.g
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(c2 c2Var, int i10) {
                    switch (i9) {
                        case 0:
                            this.b.v.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i10 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) { // from class: hg.g
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(c2 c2Var, int i102) {
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
            alertDialog$Builder.o();
        }
        return z12;
    }

    public final void X(boolean z10) {
        if (this.M == null) {
            return;
        }
        if (this.O == 0) {
            this.O = 1;
        }
        int size = a0(true).size();
        this.N = size;
        if (this.M.level >= size) {
            this.v.f(null, true);
            return;
        }
        if (z10) {
            oc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.v.setLvlRequiredState(this.N);
    }

    public final void Y() {
        if (this.G) {
            int i9 = 0;
            this.G = false;
            int i10 = 1;
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
            this.c.animate().translationY(this.c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(gr.f).setUpdateListener(new j(this, i10)).setListener(new m(this, i9)).start();
        }
    }

    public final boolean Z() {
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
        X(false);
        return true;
    }

    public final ArrayList a0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.B;
        int size = arrayList3.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList3.get(i9);
            i9++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.D;
                int size2 = arrayList4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l10.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i10);
                    i10++;
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

    public final void b0(int i9, boolean z10, boolean z11) {
        if (this.O == i9 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i9 == 1 || i9 == 0 || z10;
        this.e.setChecked(z12);
        int w02 = f6.w0(null, z12 ? f6.f6 : f6.e6, false);
        if (!z11) {
            this.e.setBackgroundColor(w02);
        } else if (z12) {
            this.e.b(w02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(w02);
        }
        this.O = i9;
        if (i9 != 1 && i9 != 0 && !z10) {
            if (!z11) {
                this.f.setVisibility(4);
                this.w.setVisibility(4);
                return;
            }
            Y();
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration = this.w.animate().alpha(0.0f).setDuration(350L);
            gr grVar = gr.f;
            duration.setInterpolator(grVar).setListener(new m(this, 2)).start();
            this.f.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).setListener(new m(this, 3)).start();
            return;
        }
        this.f.setVisibility(0);
        this.w.setVisibility(0);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.f.animate().alpha(1.0f).setDuration(350L);
            gr grVar2 = gr.f;
            duration2.setInterpolator(grVar2).setListener(new m(this, 1)).start();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar2).start();
            LinkedHashMap linkedHashMap = this.A;
            if (linkedHashMap.isEmpty()) {
                this.b.G.clear();
                this.n.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    t0.a((TLRPC.TL_availableReaction) arrayList.get(i11), linkedHashMap, this.B, spannableStringBuilder, this.b, this.n.getFontMetricsInt());
                    i10++;
                    if (i10 >= this.F) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
                this.n.append(spannableStringBuilder);
                this.n.m();
                a51 a51Var = this.b.l0;
                if (a51Var != null) {
                    a51Var.l();
                }
                X(false);
            }
        }
    }

    public final void c0() {
        t8 t8Var = this.s;
        boolean z10 = t8Var.e.h;
        int i9 = this.F;
        LinkedHashMap linkedHashMap = this.A;
        ArrayList arrayList = this.B;
        if (z10) {
            t8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            t5 t5Var = (t5) linkedHashMap.remove(-1L);
            if (t5Var != null) {
                t5Var.setRemoved(new h3.g0(1, this, t5Var));
            }
            V(t5Var);
            this.b.x(-1L, true);
            X(false);
            this.n.setMaxLength(i9);
            b0(this.O, this.a, true);
        } else {
            t8Var.setChecked(true);
            try {
                this.n.setMaxLength(i9 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = k5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.n.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                X(true);
                V(nVar);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            b0(this.O, true, true);
        }
        this.n.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        if (W(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0461 A[EDGE_INSN: B:55:0x0461->B:56:0x0461 BREAK  A[LOOP:1: B:43:0x03b0->B:54:0x03b0], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        SpannableStringBuilder spannableStringBuilder;
        int i9;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i10;
        ArrayList<TLRPC.Reaction> arrayList2;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 2));
        this.h = new gh.m(context);
        in0 in0Var = new in0(context, this.h, this.resourceProvider, true);
        this.y = in0Var;
        in0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        fh.v vVar = new fh.v(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        t8 t8Var = new t8(context);
        this.e = t8Var;
        t8Var.setHeight(56);
        t8 t8Var2 = this.e;
        t8Var2.setBackgroundColor(f6.w0(null, t8Var2.e.h ? f6.f6 : f6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(f6.g6, f6.O6, f6.P6, f6.Q6, f6.R6);
        final int i11 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: hg.l
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t8 t8Var3;
                switch (i11) {
                    case 0:
                        s sVar = this.b;
                        if (sVar.e.e.h && (t8Var3 = sVar.s) != null && t8Var3.e.h) {
                            sVar.c0();
                        }
                        boolean z10 = sVar.e.e.h;
                        sVar.b0(z10 ? 2 : 1, z10 ? false : sVar.a, true);
                        break;
                    case 1:
                        this.b.c0();
                        break;
                    default:
                        s sVar2 = this.b;
                        if (!sVar2.v.J) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.M;
                            if (tL_premium_boostsStatus != null) {
                                int i12 = tL_premium_boostsStatus.level;
                                int i13 = sVar2.N;
                                if (i12 < i13) {
                                    t0.f(-sVar2.I, i13, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            t8 t8Var4 = sVar2.s;
                            Boolean valueOf = (t8Var4 == null || !sVar2.H.paid_media_allowed) ? null : Boolean.valueOf(t8Var4.e.h);
                            sVar2.v.setLoading(true);
                            MessagesController messagesController = sVar2.getMessagesController();
                            long j10 = sVar2.I;
                            int i14 = sVar2.O;
                            ArrayList a02 = sVar2.a0(false);
                            int i15 = sVar2.K;
                            sVar2.J = i15;
                            messagesController.setCustomChatReactions(j10, i14, a02, i15, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        this.h.addView(this.e, e6.n(-1, -2));
        b9 b9Var = new b9(context, 12, this.resourceProvider);
        int i12 = f6.B6;
        b9Var.setTextColor(f6.w0(null, i12, false));
        b9Var.setTopPadding(12);
        b9Var.setBottomPadding(16);
        b9Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(b9Var, e6.n(-1, -2));
        m4 m4Var = new m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        m4Var.setBackgroundColor(f6.w0(null, f6.d6, false));
        m4Var.setTextSize(15.0f);
        m4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, e6.c(-2.0f, -1));
        this.f.addView(m4Var, e6.n(-1, -2));
        b6 resourceProvider = getResourceProvider();
        int i13 = this.F;
        p pVar = new p(this, context, resourceProvider, i13);
        this.n = pVar;
        pVar.setOnFocused(new h(this, 2));
        this.f.addView(this.n, e6.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        b9 b9Var2 = new b9(context, 12, this.resourceProvider);
        b9Var2.setTextColor(f6.w0(null, i12, false));
        b9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), f6.gc, 0, new h(this, 3), getResourceProvider()));
        this.f.addView(b9Var2, e6.n(-1, -2));
        m4 m4Var2 = new m4(context, this.resourceProvider);
        m4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.f.addView(m4Var2, e6.n(-1, -2));
        this.r = new x7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.H;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i14 = getMessagesController().reactionsUniqMax;
            this.K = i14;
            this.J = i14;
        } else {
            int i15 = chatFull.reactions_limit;
            this.K = i15;
            this.J = i15;
        }
        x7 x7Var = this.r;
        int i16 = this.K;
        int i17 = getMessagesController().reactionsUniqMax;
        w7 w7Var = new w7();
        w7Var.a = 1;
        w7Var.b = i17;
        w7Var.e = new mg.b(19);
        x7Var.d(i16, w7Var, new k(this, 2));
        this.f.addView(this.r, e6.n(-1, -2));
        b9 b9Var3 = new b9(context, 12, this.resourceProvider);
        b9Var3.setTopPadding(12);
        b9Var3.setBottomPadding(16);
        b9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(b9Var3, e6.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            t8 t8Var3 = new t8(context);
            this.s = t8Var3;
            t8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, e6.n(-1, -2));
            final int i18 = 1;
            this.s.setOnClickListener(new View.OnClickListener(this) { // from class: hg.l
                public final /* synthetic */ s b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t8 t8Var32;
                    switch (i18) {
                        case 0:
                            s sVar = this.b;
                            if (sVar.e.e.h && (t8Var32 = sVar.s) != null && t8Var32.e.h) {
                                sVar.c0();
                            }
                            boolean z10 = sVar.e.e.h;
                            sVar.b0(z10 ? 2 : 1, z10 ? false : sVar.a, true);
                            break;
                        case 1:
                            this.b.c0();
                            break;
                        default:
                            s sVar2 = this.b;
                            if (!sVar2.v.J) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.M;
                                if (tL_premium_boostsStatus != null) {
                                    int i122 = tL_premium_boostsStatus.level;
                                    int i132 = sVar2.N;
                                    if (i122 < i132) {
                                        t0.f(-sVar2.I, i132, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                t8 t8Var4 = sVar2.s;
                                Boolean valueOf = (t8Var4 == null || !sVar2.H.paid_media_allowed) ? null : Boolean.valueOf(t8Var4.e.h);
                                sVar2.v.setLoading(true);
                                MessagesController messagesController = sVar2.getMessagesController();
                                long j10 = sVar2.I;
                                int i142 = sVar2.O;
                                ArrayList a02 = sVar2.a0(false);
                                int i152 = sVar2.K;
                                sVar2.J = i152;
                                messagesController.setCustomChatReactions(j10, i142, a02, i152, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
            b9 b9Var4 = new b9(context, 12, this.resourceProvider);
            b9Var4.setTextColor(f6.w0(null, i12, false));
            b9Var4.setTopPadding(12);
            b9Var4.setBottomPadding(70);
            b9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new h(this, 4)));
            this.f.addView(b9Var4, e6.n(-1, -2));
        } else {
            b9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i19 = f6.a7;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i19, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.w.addView(this.x, e6.e(-1, -1, 119));
        u0 u0Var = new u0(context, getResourceProvider(), true);
        this.v = u0Var;
        u0Var.e();
        u0 u0Var2 = this.v;
        u0Var2.getClass();
        u0Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        u0Var2.d0 = new SpannableStringBuilder("l");
        eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
        eqVar.setTopOffset(1);
        u0Var2.d0.setSpan(eqVar, 0, 1, 33);
        final int i20 = 2;
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: hg.l
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t8 t8Var32;
                switch (i20) {
                    case 0:
                        s sVar = this.b;
                        if (sVar.e.e.h && (t8Var32 = sVar.s) != null && t8Var32.e.h) {
                            sVar.c0();
                        }
                        boolean z10 = sVar.e.e.h;
                        sVar.b0(z10 ? 2 : 1, z10 ? false : sVar.a, true);
                        break;
                    case 1:
                        this.b.c0();
                        break;
                    default:
                        s sVar2 = this.b;
                        if (!sVar2.v.J) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sVar2.M;
                            if (tL_premium_boostsStatus != null) {
                                int i122 = tL_premium_boostsStatus.level;
                                int i132 = sVar2.N;
                                if (i122 < i132) {
                                    t0.f(-sVar2.I, i132, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            t8 t8Var4 = sVar2.s;
                            Boolean valueOf = (t8Var4 == null || !sVar2.H.paid_media_allowed) ? null : Boolean.valueOf(t8Var4.e.h);
                            sVar2.v.setLoading(true);
                            MessagesController messagesController = sVar2.getMessagesController();
                            long j10 = sVar2.I;
                            int i142 = sVar2.O;
                            ArrayList a02 = sVar2.a0(false);
                            int i152 = sVar2.K;
                            sVar2.J = i152;
                            messagesController.setCustomChatReactions(j10, i142, a02, i152, valueOf, new k(sVar2, 1), new h(sVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        vVar.addView(this.y);
        vVar.addView(this.w, e6.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.v, e6.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        vVar.setBackgroundColor(f6.w0(null, i19, false));
        d2 d2Var = new d2(this, context, 3);
        this.c = d2Var;
        d2Var.setVisibility(4);
        vVar.addView(this.c, e6.e(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z10 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.D;
        ArrayList arrayList4 = this.B;
        LinkedHashMap linkedHashMap3 = this.A;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList3.size();
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i22 >= size) {
                    linkedHashMap2 = linkedHashMap3;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList3.get(i22);
                i22++;
                ArrayList arrayList5 = arrayList4;
                linkedHashMap2 = linkedHashMap3;
                t0.a((TLRPC.TL_availableReaction) obj, linkedHashMap2, arrayList5, spannableStringBuilder4, this.b, this.n.getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i21++;
                if (i21 >= i13) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
                linkedHashMap3 = linkedHashMap2;
                arrayList4 = arrayList5;
            }
            this.n.append(spannableStringBuilder3);
            b0(0, this.a, false);
            linkedHashMap = linkedHashMap2;
        } else {
            ArrayList arrayList6 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList7 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size2 = arrayList7.size();
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    if (i24 >= size2) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList7.get(i24);
                    i24++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction == null) {
                            continue;
                        } else {
                            t0.a(tL_availableReaction, linkedHashMap4, arrayList6, spannableStringBuilder5, this.b, this.n.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList6;
                            spannableStringBuilder2 = spannableStringBuilder5;
                            i23++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList6;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            q qVar = this.b;
                            i10 = i24;
                            t5 e10 = t0.e(null, Long.valueOf(tL_reactionCustomEmoji.document_id), this.n.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e10);
                            arrayList = arrayList;
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList7;
                            spannableString.setSpan(e10, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (qVar != null) {
                                qVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i23++;
                            if (i23 < i13) {
                                break;
                            }
                            spannableStringBuilder5 = spannableStringBuilder2;
                            arrayList6 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList7 = arrayList2;
                            i24 = i10;
                        }
                    }
                    arrayList2 = arrayList7;
                    i10 = i24;
                    if (i23 < i13) {
                    }
                }
                this.n.append(spannableStringBuilder2);
                b0(1, this.a, false);
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList8 = arrayList6;
                boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z11 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i9 = 2;
                    b0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.O == i9 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed) {
                        c0();
                    }
                    this.C.putAll(linkedHashMap);
                    this.E = this.a;
                    this.fragmentView = vVar;
                    return vVar;
                }
                if (z11) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                    int size3 = arrayList3.size();
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= size3) {
                            spannableStringBuilder = spannableStringBuilder6;
                            break;
                        }
                        Object obj2 = arrayList3.get(i26);
                        i26++;
                        ArrayList arrayList9 = arrayList8;
                        t0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList9, spannableStringBuilder6, this.b, this.n.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder6;
                        i25++;
                        if (i25 >= i13) {
                            break;
                        }
                        spannableStringBuilder6 = spannableStringBuilder;
                        arrayList8 = arrayList9;
                    }
                    this.n.append(spannableStringBuilder);
                    i9 = 2;
                    b0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.O == i9 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                        c0();
                    }
                    this.C.putAll(linkedHashMap);
                    this.E = this.a;
                    this.fragmentView = vVar;
                    return vVar;
                }
            }
        }
        i9 = 2;
        this.e.f(LocaleController.getString(R.string.EnableReactions), this.O == i9 || this.a, false);
        this.n.m();
        if (chatFull.paid_media_allowed) {
        }
        this.C.putAll(linkedHashMap);
        this.E = this.a;
        this.fragmentView = vVar;
        return vVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.I)) {
            b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.G) {
            if (z10) {
                Y();
                return false;
            }
        } else if (!W(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.I;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.L = chat;
        int i9 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.L = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.L, true);
            }
            return false;
        }
        if (this.H != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new i(this, i9));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.D.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        if (this.O == 2 && this.K != this.J) {
            getMessagesController().setCustomChatReactions(this.I, this.O, a0(false), this.K, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        this.P = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.O != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            q qVar = new q(this, this, getParentActivity(), getResourceProvider(), f6.v0(f6.G6, getResourceProvider()));
            this.b = qVar;
            qVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(f6.w0(null, f6.d6, false));
            this.c.addView(this.b, e6.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new k(this, 0));
            this.c.addView(this.d, e6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.B;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new bg.d2(7), 200L);
    }
}
