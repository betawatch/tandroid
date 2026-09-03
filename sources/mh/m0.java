package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class m0 extends org.telegram.ui.Components.sa {
    public static final int[] t0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final b U;
    public final TL_stars.TL_starGiftUnique V;
    public final String W;
    public final long X;
    public final p40 Y;
    public final cd0 Z;
    public final EditTextBoldCursor a0;
    public final TextView b0;
    public final k0 c0;
    public final TextView d0;
    public final qh.d e0;
    public final org.telegram.ui.Components.k6 f0;
    public final ImageView g0;
    public final ImageView h0;
    public final ja.c i0;
    public mf.a j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final s1 n0;
    public final oq[] o0;
    public final oq[] p0;
    public boolean q0;
    public w51 r0;
    public final h51 s0;

    public m0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.g6 g6Var, s1 s1Var) {
        super(context, null, true, false, false, false, false, 2, g6Var);
        TLRPC.User user;
        ja.c cVar = new ja.c(24);
        f7.b[] bVarArr = (f7.b[]) cVar.a;
        this.i0 = cVar;
        this.o0 = new oq[1];
        this.p0 = new oq[1];
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.X = j10;
        this.V = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.W = l.d.l(tL_starGiftUnique.num, ',', sb);
        this.n0 = s1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = t7.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        mf.b bVar = mf.b.a;
        mf.a g10 = mf.a.g(j12, bVar);
        mf.a g11 = mf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        mf.b bVar2 = mf.b.b;
        mf.a i11 = mf.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        mf.a i12 = mf.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        mf.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            bVarArr[bVar3.ordinal()] = new f7.b(28, g10, g11);
        }
        mf.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            bVarArr[bVar4.ordinal()] = new f7.b(28, i11, i12);
        }
        b bVar5 = new b(context, i10, g6Var);
        this.U = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(false);
        bVar5.setClickable(false);
        this.container.addView(bVar5, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.e6.a(bVar5);
        bVar5.setOnClickListener(new eg.o(this, context, g6Var, 7));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a0 = editTextBoldCursor;
        if (j11) {
            p40 p40Var = new p40(context, g6Var);
            this.Y = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            p40Var.b(arrayList, new i0(this, 0));
            linearLayout.addView(p40Var, k7.c6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.Y = null;
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f10, k7.c6.l(1.0f, -1, -2));
        cd0 cd0Var = new cd0(context, null);
        this.Z = cd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        cd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        cd0Var.e(editTextBoldCursor);
        cd0Var.b(1.0f, 0.0f, false);
        cd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new dg.z(this, 3));
        cd0Var.addView(editTextBoldCursor, k7.c6.e(-1, -2, 48));
        f10.addView(cd0Var, k7.c6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.g0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        cd0Var.addView(imageView, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.h0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        cd0Var.addView(imageView2, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f0 = k6Var;
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        cd0Var.addView(k6Var, k7.c6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b0 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        k0 k0Var = new k0(context);
        this.c0 = k0Var;
        k0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        k0Var.setCursorWidth(1.5f);
        k0Var.setTextSize(1, 17.0f);
        k0Var.setMaxLines(1);
        k0Var.setBackground(null);
        k0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        k0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        k0Var.setFocusable(false);
        k0Var.setClickable(false);
        k0Var.setEnabled(false);
        cd0 cd0Var2 = new cd0(context, null);
        cd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        cd0Var2.e(k0Var);
        cd0Var2.addView(k0Var, k7.c6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.e6.b(cd0Var2, 0.02f, 1.2f);
        cd0Var2.setOnClickListener(new dg.n(17, this, context));
        f10.addView(cd0Var2, k7.c6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W5, g6Var), PorterDuff.Mode.SRC_IN));
        cd0Var2.addView(imageView3, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.e0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: mh.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0.Q(m0.this, i10, context, g6Var, j10);
            }
        });
        U(mf.a.i(0L, bVar), false, true, false);
        if (this.k0 != 86400) {
            this.k0 = 86400;
            k0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new l0(this));
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        sl0 sl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.s0 = h51.k(linearLayout);
        this.r0.N(false);
    }

    public static void P(m0 m0Var, long j10, boolean z4, mf.a aVar, long j11, org.telegram.ui.ActionBar.d2 d2Var) {
        if (j10 > 0) {
            int i10 = m0Var.currentAccount;
            mf.b bVar = mf.b.a;
            t7 x10 = t7.x(i10, bVar);
            mf.a l10 = x10.e ? mf.a.l(x10.p()) : null;
            mf.a g10 = z4 ? mf.a.g(j10, bVar) : mf.a.i(m0Var.j0.b + aVar.b, bVar);
            if (l10 == null || l10.b < g10.b) {
                new z9(m0Var.getContext(), m0Var.resourcesProvider, g10.a(), 14, null, null, m0Var.X).show();
                return;
            }
        }
        af.f g11 = d2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = m0Var.j0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(m0Var.currentAccount).getInputPeer(m0Var.X);
        tL_sendStarGiftOffer.duration = m0Var.k0;
        tL_sendStarGiftOffer.slug = m0Var.V.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(m0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new lh.a0(m0Var, g11, d2Var, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.rz0[], org.telegram.ui.Components.sc[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void Q(final m0 m0Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10) {
        String str;
        boolean z4;
        ?? r14;
        boolean z10;
        if (m0Var.e0.T) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.c.b(i10);
                return;
            }
            t7 x10 = t7.x(i10, m0Var.j0.a);
            mf.a l10 = x10.e ? mf.a.l(x10.p()) : null;
            mf.b bVar = mf.b.a;
            mf.b bVar2 = mf.b.b;
            if (l10 != null) {
                long j11 = l10.b;
                mf.a aVar = m0Var.j0;
                if (j11 >= aVar.b) {
                    String str2 = m0Var.W;
                    long j12 = m0Var.X;
                    String d = aVar.d();
                    if (m0Var.j0.a == bVar2) {
                        str = str2;
                        z4 = true;
                    } else {
                        str = str2;
                        z4 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(m0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(m0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.k6.j5;
                    org.telegram.ui.b.w(i11, m0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, k7.c6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(m0Var.getContext());
                    org.telegram.ui.b.l(i11, m0Var.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(m0Var.j0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, k7.c6.t(-1, -2, 48, 24, 4, 24, 4));
                    sz0 sz0Var = new sz0(m0Var.getContext(), m0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(m0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final mf.a g10 = mf.a.g(sendPaidMessagesStars, bVar);
                    sz0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), ja.X0(z4, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        sz0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), ja.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    sz0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", m0Var.k0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(sz0Var, k7.c6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(m0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) ja.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z4));
                    } else {
                        if (!z4) {
                            z10 = z4;
                            spannableStringBuilder.append((CharSequence) ja.Q0(LocaleController.formatString(R.string.GiftOfferPay, mf.a.i(m0Var.j0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m0Var.getContext(), 0, m0Var.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z11 = z10;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() { // from class: mh.g0
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                                    m0.P(m0.this, sendPaidMessagesStars, z11, g10, nextRandomId, d2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.U0 = true;
                            d2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, ja.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), ja.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z10 = z4;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m0Var.getContext(), 0, m0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z112 = z10;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() { // from class: mh.g0
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i12) {
                            m0.P(m0.this, sendPaidMessagesStars, z112, g10, nextRandomId, d2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                    d2Var2.U0 = true;
                    d2Var2.show();
                    return;
                }
            }
            mf.a aVar2 = m0Var.j0;
            mf.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new z9(context, g6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new rh.f(context, g6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void R(m0 m0Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(m0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new hg.j0(5, m0Var, fVar, d2Var, updates, tL_error));
    }

    public final void S() {
        boolean z4 = this.q0;
        b bVar = this.U;
        boolean z10 = (z4 && !isDismissed() && bVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.Y == null;
        if (this.m0 != z10) {
            this.m0 = z10;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void T(boolean z4) {
        boolean z10 = this.l0 == 0 && this.j0.b > 0;
        qh.d dVar = this.e0;
        if (dVar.T != z10) {
            dVar.setEnabled(z10);
            dVar.setClickable(z10);
            if (z4) {
                dVar.animate().alpha(z10 ? 1.0f : 0.6f).setDuration(180L).start();
            } else {
                dVar.setAlpha(z10 ? 1.0f : 0.6f);
            }
        }
    }

    public final void U(mf.a aVar, boolean z4, boolean z10, boolean z11) {
        char c3;
        mf.b bVar;
        mf.a aVar2 = this.j0;
        int i10 = this.l0;
        this.l0 = 0;
        if (aVar != null) {
            this.j0 = aVar;
        } else {
            this.j0 = mf.a.i(0L, aVar2.a);
            this.l0 |= 1;
        }
        mf.b bVar2 = this.j0.a;
        ja.c cVar = this.i0;
        f7.b[] bVarArr = (f7.b[]) cVar.a;
        f7.b[] bVarArr2 = (f7.b[]) cVar.a;
        long j10 = ((mf.a) bVarArr[bVar2.ordinal()].c).b;
        mf.a aVar3 = this.j0;
        if (j10 < aVar3.b) {
            this.l0 |= 4;
        }
        if (!aVar3.k() && ((mf.a) bVarArr2[this.j0.a.ordinal()].b).b > this.j0.b) {
            this.l0 |= 2;
        }
        boolean z12 = z10 || aVar2.a != this.j0.a;
        boolean z13 = z10 || aVar2.b != this.j0.b;
        boolean z14 = z10 || i10 != this.l0;
        mf.b bVar3 = mf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.a0;
        mf.b bVar4 = mf.b.b;
        if (z12) {
            p40 p40Var = this.Y;
            if (p40Var != null) {
                p40Var.a(this.j0.a == bVar3 ? 0 : 1, z11);
            }
            String shortName = DialogObject.getShortName(this.X);
            mf.b bVar5 = this.j0.a;
            TextView textView = this.d0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((mf.a) bVarArr2[this.j0.a.ordinal()].c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((mf.a) bVarArr2[this.j0.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.h0;
            ImageView imageView2 = this.g0;
            if (z11) {
                c3 = 0;
                imageView2.animate().alpha(this.j0.a == bVar3 ? 1.0f : 0.0f).scaleX(this.j0.a == bVar3 ? 1.0f : 0.0f).scaleY(this.j0.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.j0.a == bVar4 ? 1.0f : 0.0f).scaleX(this.j0.a == bVar4 ? 1.0f : 0.0f).scaleY(this.j0.a == bVar4 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                c3 = 0;
                imageView2.setAlpha(this.j0.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.j0.a == bVar4 ? 1.0f : 0.0f);
            }
            b bVar6 = this.U;
            if (bVar6 != null && bVar6.e != (bVar = this.j0.a)) {
                bVar6.e = bVar;
                bVar6.a();
            }
        } else {
            c3 = 0;
        }
        if (z12 || z14) {
            this.Z.setText(LocaleController.getString(this.j0.a == bVar3 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            mf.b bVar7 = this.j0.a;
            int i11 = this.l0;
            int i12 = i11 & 4;
            String str = this.W;
            TextView textView2 = this.b0;
            if (i12 != 0) {
                int i13 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((mf.a) bVarArr2[bVar7.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[c3] = d;
                objArr[1] = str;
                org.telegram.ui.b.o(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((mf.a) bVarArr2[bVar7.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[c3] = d10;
                objArr2[1] = str;
                org.telegram.ui.b.o(i14, objArr2, textView2);
            } else {
                int i15 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[c3] = str;
                org.telegram.ui.b.o(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.l0 & (-9)) == 0 ? org.telegram.ui.ActionBar.k6.y6 : org.telegram.ui.ActionBar.k6.q7));
        }
        if (z12 || z13 || z14) {
            mf.a aVar4 = this.j0;
            boolean z15 = aVar4.a == bVar4;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[c3] = z15 ? aVar4.b() : LocaleController.formatNumber(aVar4.a(), ',');
            this.e0.g(ja.V0(z15, LocaleController.formatString(i16, objArr4), z15 ? this.p0 : this.o0), z11, true);
            T(z11);
        }
        if (z12 || z13) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (this.j0.c() * (this.j0.a == bVar4 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.f0.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.j0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (!this.m0 || (bVar = this.U) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        S();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.q0 = true;
        S();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new lh.c3(this, 4), 50L);
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 16), this.resourcesProvider);
        this.r0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
