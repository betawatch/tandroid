package ai;

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
import org.telegram.messenger.lk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class b1 extends org.telegram.ui.Components.bb {
    public static final int[] w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final c X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long a0;
    public final u40 b0;
    public final sd0 c0;
    public final EditTextBoldCursor d0;
    public final TextView e0;
    public final z0 f0;
    public final TextView g0;
    public final ei.d h0;
    public final org.telegram.ui.Components.q6 i0;
    public final ImageView j0;
    public final ImageView k0;
    public final ag.b l0;
    public ag.a m0;
    public int n0;
    public int o0;
    public boolean p0;
    public final b2 q0;
    public final yq[] r0;
    public final yq[] s0;
    public boolean t0;
    public s61 u0;
    public final f61 v0;

    public b1(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.d6 d6Var, b2 b2Var) {
        super(context, null, true, false, 2, d6Var);
        TLRPC.User user;
        ag.b bVar = new ag.b(0);
        n4.s[] sVarArr = (n4.s[]) bVar.b;
        this.l0 = bVar;
        this.r0 = new yq[1];
        this.s0 = new yq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.a0 = j10;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        this.q0 = b2Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = ga.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        ag.c cVar = ag.c.a;
        ag.a g10 = ag.a.g(j12, cVar);
        ag.a g11 = ag.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), cVar);
        ag.c cVar2 = ag.c.b;
        ag.a i11 = ag.a.i(Math.max(g10.e(cVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), cVar2);
        ag.a i12 = ag.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), cVar2);
        ag.c cVar3 = g10.a;
        if (cVar3 == g11.a) {
            sVarArr[cVar3.ordinal()] = new n4.s(4, g10, g11);
        }
        ag.c cVar4 = i11.a;
        if (cVar4 == i12.a) {
            sVarArr[cVar4.ordinal()] = new n4.s(4, i11, i12);
        }
        c cVar5 = new c(context, i10, d6Var);
        this.X = cVar5;
        cVar5.setScaleX(0.6f);
        cVar5.setScaleY(0.6f);
        cVar5.setAlpha(0.0f);
        cVar5.setEnabled(false);
        cVar5.setClickable(false);
        this.container.addView(cVar5, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(cVar5);
        cVar5.setOnClickListener(new v0(this, context, d6Var, 0));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d0 = editTextBoldCursor;
        if (j11) {
            u40 u40Var = new u40(context, d6Var);
            this.b0 = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            u40Var.b(arrayList, new w0(this, 0));
            linearLayout.addView(u40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.b0 = null;
        }
        LinearLayout e = lk.e(context, 1);
        linearLayout.addView(e, w7.z5.l(1.0f, -1, -2));
        sd0 sd0Var = new sd0(context, null);
        this.c0 = sd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        sd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        sd0Var.e(editTextBoldCursor);
        sd0Var.b(1.0f, 0.0f, false);
        sd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 2));
        sd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e.addView(sd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        sd0Var.addView(imageView, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        sd0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.i0 = q6Var;
        int i14 = org.telegram.ui.ActionBar.h6.y6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setGravity(5);
        sd0Var.addView(q6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextSize(1, 13.0f);
        e.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        z0 z0Var = new z0(context);
        this.f0 = z0Var;
        z0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        z0Var.setCursorWidth(1.5f);
        z0Var.setTextSize(1, 17.0f);
        z0Var.setMaxLines(1);
        z0Var.setBackground(null);
        z0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        z0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        z0Var.setFocusable(false);
        z0Var.setClickable(false);
        z0Var.setEnabled(false);
        sd0 sd0Var2 = new sd0(context, null);
        sd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        sd0Var2.e(z0Var);
        sd0Var2.addView(z0Var, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(sd0Var2, 0.02f, 1.2f);
        sd0Var2.setOnClickListener(new p(1, this, context));
        e.addView(sd0Var2, w7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, d6Var), PorterDuff.Mode.SRC_IN));
        sd0Var2.addView(imageView3, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ei.d dVar = new ei.d(context, d6Var, true);
        this.h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ai.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.R(b1.this, i10, context, d6Var, j10);
            }
        });
        V(ag.a.i(0L, cVar), false, true, false);
        if (this.n0 != 86400) {
            this.n0 = 86400;
            z0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        U(false);
        editTextBoldCursor.addTextChangedListener(new a1(this));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        im0 im0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        im0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.v0 = f61.k(linearLayout);
        this.u0.N(false);
    }

    public static void Q(b1 b1Var, long j10, boolean z10, ag.a aVar, long j11, org.telegram.ui.ActionBar.b2 b2Var) {
        if (j10 > 0) {
            int i10 = b1Var.currentAccount;
            ag.c cVar = ag.c.a;
            ga x10 = ga.x(i10, cVar);
            ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
            ag.a g10 = z10 ? ag.a.g(j10, cVar) : ag.a.i(b1Var.m0.b + aVar.b, cVar);
            if (l4 == null || l4.b < g10.b) {
                new cd(b1Var.getContext(), b1Var.resourcesProvider, g10.a(), 14, null, null, b1Var.a0).show();
                return;
            }
        }
        pf.c g11 = b2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = b1Var.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(b1Var.currentAccount).getInputPeer(b1Var.a0);
        tL_sendStarGiftOffer.duration = b1Var.n0;
        tL_sendStarGiftOffer.slug = b1Var.Y.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(b1Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new s0(b1Var, g11, b2Var, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.i01[], org.telegram.ui.Components.zc[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void R(final b1 b1Var, int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (b1Var.h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            ga x10 = ga.x(i10, b1Var.m0.a);
            ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
            ag.c cVar = ag.c.a;
            ag.c cVar2 = ag.c.b;
            if (l4 != null) {
                long j11 = l4.b;
                ag.a aVar = b1Var.m0;
                if (j11 >= aVar.b) {
                    String str2 = b1Var.Z;
                    long j12 = b1Var.a0;
                    String d = aVar.d();
                    if (b1Var.m0.a == cVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(b1Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(b1Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.h6.j5;
                    org.telegram.ui.Cells.c1.r(i11, b1Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b1Var.getContext());
                    lk.o(i11, b1Var.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(b1Var.m0.a == cVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    j01 j01Var = new j01(b1Var.getContext(), b1Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b1Var.currentAccount).getSendPaidMessagesStars(j12);
                    final ag.a g10 = ag.a.g(sendPaidMessagesStars, cVar);
                    j01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), md.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        j01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), md.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    j01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b1Var.n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(j01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b1Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) md.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) md.R0(LocaleController.formatString(R.string.GiftOfferPay, ag.a.i(b1Var.m0.b + g10.b, cVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() { // from class: ai.q0
                                @Override // org.telegram.ui.ActionBar.a2
                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                                    b1.Q(b1.this, sendPaidMessagesStars, z12, g10, nextRandomId, b2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.X0 = true;
                            b2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, md.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), md.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() { // from class: ai.q0
                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i12) {
                            b1.Q(b1.this, sendPaidMessagesStars, z122, g10, nextRandomId, b2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                    b2Var2.X0 = true;
                    b2Var2.show();
                    return;
                }
            }
            ag.a aVar2 = b1Var.m0;
            ag.c cVar3 = aVar2.a;
            if (cVar3 == cVar) {
                new cd(context, d6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (cVar3 == cVar2) {
                new fi.f(context, d6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void S(b1 b1Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b1Var.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new t0(b1Var, cVar, b2Var, updates, tL_error, 0));
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    public final void T() {
        boolean z10 = this.t0;
        c cVar = this.X;
        boolean z11 = (z10 && !isDismissed() && cVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.b0 == null;
        if (this.p0 != z11) {
            this.p0 = z11;
            if (cVar != null) {
                cVar.setEnabled(z11);
                cVar.setClickable(z11);
                lk.s(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void U(boolean z10) {
        boolean z11 = this.o0 == 0 && this.m0.b > 0;
        ei.d dVar = this.h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                lk.s(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    public final void V(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        ?? r16;
        boolean z13;
        ag.a aVar2 = this.m0;
        int i10 = this.o0;
        this.o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = ag.a.i(0L, aVar2.a);
            this.o0 |= 1;
        }
        ag.c cVar = this.m0.a;
        ag.b bVar = this.l0;
        n4.s[] sVarArr = (n4.s[]) bVar.b;
        n4.s[] sVarArr2 = (n4.s[]) bVar.b;
        long j10 = ((ag.a) sVarArr[cVar.ordinal()].c).b;
        ag.a aVar3 = this.m0;
        if (j10 < aVar3.b) {
            this.o0 |= 4;
        }
        if (!aVar3.k() && ((ag.a) sVarArr2[this.m0.a.ordinal()].b).b > this.m0.b) {
            this.o0 |= 2;
        }
        boolean z14 = z11 || aVar2.a != this.m0.a;
        boolean z15 = z11 || aVar2.b != this.m0.b;
        boolean z16 = z11 || i10 != this.o0;
        ag.c cVar2 = ag.c.a;
        EditTextBoldCursor editTextBoldCursor = this.d0;
        ag.c cVar3 = ag.c.b;
        if (z14) {
            u40 u40Var = this.b0;
            if (u40Var != null) {
                u40Var.a(this.m0.a == cVar2 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.a0);
            ag.c cVar4 = this.m0.a;
            TextView textView = this.g0;
            if (cVar4 == cVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr2[this.m0.a.ordinal()].c).a()).length())});
            } else if (cVar4 == cVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr2[this.m0.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.k0;
            ImageView imageView2 = this.j0;
            if (z12) {
                z13 = false;
                imageView2.animate().alpha(this.m0.a == cVar2 ? 1.0f : 0.0f).scaleX(this.m0.a == cVar2 ? 1.0f : 0.0f).scaleY(this.m0.a == cVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.m0.a == cVar3 ? 1.0f : 0.0f).scaleX(this.m0.a == cVar3 ? 1.0f : 0.0f).scaleY(this.m0.a == cVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z13 = false;
                imageView2.setAlpha(this.m0.a == cVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.m0.a == cVar3 ? 1.0f : 0.0f);
            }
            c cVar5 = this.X;
            r16 = z13;
            if (cVar5 != null) {
                ag.c cVar6 = this.m0.a;
                r16 = z13;
                if (cVar5.e != cVar6) {
                    cVar5.e = cVar6;
                    cVar5.a();
                    r16 = z13;
                }
            }
        } else {
            r16 = 0;
        }
        if (z14 || z16) {
            this.c0.setText(LocaleController.getString(this.m0.a == cVar2 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            ag.c cVar7 = this.m0.a;
            int i11 = this.o0;
            int i12 = i11 & 4;
            String str = this.Z;
            TextView textView2 = this.e0;
            if (i12 != 0) {
                int i13 = cVar7 == cVar2 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((ag.a) sVarArr2[cVar7.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[r16] = d;
                objArr[1] = str;
                lk.r(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = cVar7 == cVar2 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((ag.a) sVarArr2[cVar7.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[r16] = d10;
                objArr2[1] = str;
                lk.r(i14, objArr2, textView2);
            } else {
                int i15 = cVar7 == cVar2 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                lk.r(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.o0 & (-9)) == 0 ? org.telegram.ui.ActionBar.h6.y6 : org.telegram.ui.ActionBar.h6.q7));
        }
        if (z14 || z15 || z16) {
            ag.a aVar4 = this.m0;
            boolean z17 = aVar4.a == cVar3 ? true : r16;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[r16] = z17 ? aVar4.b() : LocaleController.formatNumber(aVar4.a(), ',');
            this.h0.g(md.n1(md.W0(z17, LocaleController.formatString(i16, objArr4), z17 ? this.s0 : this.r0), z17), z12, true);
            U(z12);
        }
        if (z14 || z15) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * (this.m0.a == cVar3 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.i0.c(sb2, z12, true);
        }
        if (z10 && z15) {
            String b10 = this.m0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (!this.p0 || (cVar = this.X) == null || f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        T();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.t0 = true;
        T();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 9), 50L);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 2), this.resourcesProvider);
        this.u0 = s61Var;
        s61Var.r = false;
        return s61Var;
    }
}
