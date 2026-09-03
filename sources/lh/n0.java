package lh;

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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n0 extends org.telegram.ui.Components.sa {
    public static final int[] t0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final c U;
    public final TL_stars.TL_starGiftUnique V;
    public final String W;
    public final long X;
    public final o40 Y;
    public final bd0 Z;
    public final EditTextBoldCursor a0;
    public final TextView b0;
    public final l0 c0;
    public final TextView d0;
    public final ph.d e0;
    public final org.telegram.ui.Components.k6 f0;
    public final ImageView g0;
    public final ImageView h0;
    public final o5.i i0;
    public lf.a j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final t1 n0;
    public final lq[] o0;
    public final lq[] p0;
    public boolean q0;
    public w51 r0;
    public final i51 s0;

    public n0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.f6 f6Var, t1 t1Var) {
        super(context, null, true, false, false, false, false, 2, f6Var);
        TLRPC.User user;
        o5.i iVar = new o5.i(25);
        f7.b[] bVarArr = (f7.b[]) iVar.b;
        this.i0 = iVar;
        this.o0 = new lq[1];
        this.p0 = new lq[1];
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.X = j10;
        this.V = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.W = kf.k0.l(tL_starGiftUnique.num, ',', sb);
        this.n0 = t1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = t7.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        lf.b bVar = lf.b.a;
        lf.a g10 = lf.a.g(j12, bVar);
        lf.a g11 = lf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        lf.b bVar2 = lf.b.b;
        lf.a i11 = lf.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        lf.a i12 = lf.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        lf.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            bVarArr[bVar3.ordinal()] = new f7.b(27, g10, g11);
        }
        lf.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            bVarArr[bVar4.ordinal()] = new f7.b(27, i11, i12);
        }
        c cVar = new c(context, i10, f6Var);
        this.U = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.d6.a(cVar);
        cVar.setOnClickListener(new dg.p(this, context, f6Var, 7));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.a0 = editTextBoldCursor;
        if (j11) {
            o40 o40Var = new o40(context, f6Var);
            this.Y = o40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            o40Var.b(arrayList, new j0(this, 0));
            linearLayout.addView(o40Var, k7.b6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.Y = null;
        }
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f10, k7.b6.l(1.0f, -1, -2));
        bd0 bd0Var = new bd0(context, null);
        this.Z = bd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        bd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        bd0Var.e(editTextBoldCursor);
        bd0Var.b(1.0f, 0.0f, false);
        bd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 3));
        bd0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        f10.addView(bd0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.g0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        bd0Var.addView(imageView, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.h0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        bd0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f0 = k6Var;
        int i14 = org.telegram.ui.ActionBar.j6.y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        bd0Var.addView(k6Var, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b0 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        l0 l0Var = new l0(context);
        this.c0 = l0Var;
        l0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        l0Var.setCursorWidth(1.5f);
        l0Var.setTextSize(1, 17.0f);
        l0Var.setMaxLines(1);
        l0Var.setBackground(null);
        l0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        l0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        l0Var.setFocusable(false);
        l0Var.setClickable(false);
        l0Var.setEnabled(false);
        bd0 bd0Var2 = new bd0(context, null);
        bd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        bd0Var2.e(l0Var);
        bd0Var2.addView(l0Var, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.d6.b(bd0Var2, 0.02f, 1.2f);
        bd0Var2.setOnClickListener(new cg.n(17, this, context));
        f10.addView(bd0Var2, k7.b6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), PorterDuff.Mode.SRC_IN));
        bd0Var2.addView(imageView3, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.e0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: lh.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.Q(n0.this, i10, context, f6Var, j10);
            }
        });
        U(lf.a.i(0L, bVar), false, true, false);
        if (this.k0 != 86400) {
            this.k0 = 86400;
            l0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new m0(this));
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        rl0 rl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.s0 = i51.k(linearLayout);
        this.r0.N(false);
    }

    public static void P(n0 n0Var, long j10, boolean z4, lf.a aVar, long j11, org.telegram.ui.ActionBar.d2 d2Var) {
        if (j10 > 0) {
            int i10 = n0Var.currentAccount;
            lf.b bVar = lf.b.a;
            t7 x10 = t7.x(i10, bVar);
            lf.a l10 = x10.e ? lf.a.l(x10.p()) : null;
            lf.a g10 = z4 ? lf.a.g(j10, bVar) : lf.a.i(n0Var.j0.b + aVar.b, bVar);
            if (l10 == null || l10.b < g10.b) {
                new z9(n0Var.getContext(), n0Var.resourcesProvider, g10.a(), 14, null, null, n0Var.X).show();
                return;
            }
        }
        ze.c g11 = d2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = n0Var.j0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(n0Var.currentAccount).getInputPeer(n0Var.X);
        tL_sendStarGiftOffer.duration = n0Var.k0;
        tL_sendStarGiftOffer.slug = n0Var.V.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(n0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new kh.a0(n0Var, g11, d2Var, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.rz0[], org.telegram.ui.Components.sc[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void Q(final n0 n0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10) {
        String str;
        boolean z4;
        ?? r14;
        boolean z10;
        if (n0Var.e0.T) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.c.b(i10);
                return;
            }
            t7 x10 = t7.x(i10, n0Var.j0.a);
            lf.a l10 = x10.e ? lf.a.l(x10.p()) : null;
            lf.b bVar = lf.b.a;
            lf.b bVar2 = lf.b.b;
            if (l10 != null) {
                long j11 = l10.b;
                lf.a aVar = n0Var.j0;
                if (j11 >= aVar.b) {
                    String str2 = n0Var.W;
                    long j12 = n0Var.X;
                    String d = aVar.d();
                    if (n0Var.j0.a == bVar2) {
                        str = str2;
                        z4 = true;
                    } else {
                        str = str2;
                        z4 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(n0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(n0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.j6.j5;
                    org.telegram.ui.b.w(i11, n0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, k7.b6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(n0Var.getContext());
                    org.telegram.ui.b.l(i11, n0Var.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(n0Var.j0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                    sz0 sz0Var = new sz0(n0Var.getContext(), n0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(n0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final lf.a g10 = lf.a.g(sendPaidMessagesStars, bVar);
                    sz0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), ja.X0(z4, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        sz0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), ja.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    sz0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", n0Var.k0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(sz0Var, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(n0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) ja.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z4));
                    } else {
                        if (!z4) {
                            z10 = z4;
                            spannableStringBuilder.append((CharSequence) ja.Q0(LocaleController.formatString(R.string.GiftOfferPay, lf.a.i(n0Var.j0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n0Var.getContext(), 0, n0Var.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z11 = z10;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() { // from class: lh.h0
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                                    n0.P(n0.this, sendPaidMessagesStars, z11, g10, nextRandomId, d2Var);
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
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n0Var.getContext(), 0, n0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z112 = z10;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() { // from class: lh.h0
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i12) {
                            n0.P(n0.this, sendPaidMessagesStars, z112, g10, nextRandomId, d2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                    d2Var2.U0 = true;
                    d2Var2.show();
                    return;
                }
            }
            lf.a aVar2 = n0Var.j0;
            lf.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new z9(context, f6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new qh.f(context, f6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void R(n0 n0Var, ze.c cVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(n0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new gg.j0(5, n0Var, cVar, d2Var, updates, tL_error));
    }

    public final void S() {
        boolean z4 = this.q0;
        c cVar = this.U;
        boolean z10 = (z4 && !isDismissed() && cVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.Y == null;
        if (this.m0 != z10) {
            this.m0 = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void T(boolean z4) {
        boolean z10 = this.l0 == 0 && this.j0.b > 0;
        ph.d dVar = this.e0;
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

    public final void U(lf.a aVar, boolean z4, boolean z10, boolean z11) {
        char c3;
        lf.b bVar;
        lf.a aVar2 = this.j0;
        int i10 = this.l0;
        this.l0 = 0;
        if (aVar != null) {
            this.j0 = aVar;
        } else {
            this.j0 = lf.a.i(0L, aVar2.a);
            this.l0 |= 1;
        }
        lf.b bVar2 = this.j0.a;
        o5.i iVar = this.i0;
        f7.b[] bVarArr = (f7.b[]) iVar.b;
        f7.b[] bVarArr2 = (f7.b[]) iVar.b;
        long j10 = ((lf.a) bVarArr[bVar2.ordinal()].c).b;
        lf.a aVar3 = this.j0;
        if (j10 < aVar3.b) {
            this.l0 |= 4;
        }
        if (!aVar3.k() && ((lf.a) bVarArr2[this.j0.a.ordinal()].b).b > this.j0.b) {
            this.l0 |= 2;
        }
        boolean z12 = z10 || aVar2.a != this.j0.a;
        boolean z13 = z10 || aVar2.b != this.j0.b;
        boolean z14 = z10 || i10 != this.l0;
        lf.b bVar3 = lf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.a0;
        lf.b bVar4 = lf.b.b;
        if (z12) {
            o40 o40Var = this.Y;
            if (o40Var != null) {
                o40Var.a(this.j0.a == bVar3 ? 0 : 1, z11);
            }
            String shortName = DialogObject.getShortName(this.X);
            lf.b bVar5 = this.j0.a;
            TextView textView = this.d0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((lf.a) bVarArr2[this.j0.a.ordinal()].c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((lf.a) bVarArr2[this.j0.a.ordinal()].c).a()).length() + 3)});
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
            c cVar = this.U;
            if (cVar != null && cVar.e != (bVar = this.j0.a)) {
                cVar.e = bVar;
                cVar.a();
            }
        } else {
            c3 = 0;
        }
        if (z12 || z14) {
            this.Z.setText(LocaleController.getString(this.j0.a == bVar3 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            lf.b bVar6 = this.j0.a;
            int i11 = this.l0;
            int i12 = i11 & 4;
            String str = this.W;
            TextView textView2 = this.b0;
            if (i12 != 0) {
                int i13 = bVar6 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((lf.a) bVarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[c3] = d;
                objArr[1] = str;
                org.telegram.ui.b.o(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((lf.a) bVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[c3] = d10;
                objArr2[1] = str;
                org.telegram.ui.b.o(i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar3 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[c3] = str;
                org.telegram.ui.b.o(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.l0 & (-9)) == 0 ? org.telegram.ui.ActionBar.j6.y6 : org.telegram.ui.ActionBar.j6.q7));
        }
        if (z12 || z13 || z14) {
            lf.a aVar4 = this.j0;
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

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean isTouchOutside(float f10, float f11) {
        c cVar;
        if (!this.m0 || (cVar = this.U) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        S();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.q0 = true;
        S();
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new b(this, 3), 50L);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 16), this.resourcesProvider);
        this.r0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
