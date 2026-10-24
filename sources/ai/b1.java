package ai;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b1 extends org.telegram.ui.Components.bb {
    public static final int[] x0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int X;
    public final c Y;
    public final TL_stars.TL_starGiftUnique Z;
    public final String a0;
    public final long b0;
    public final u40 c0;
    public final vd0 d0;
    public final EditTextBoldCursor e0;
    public final TextView f0;
    public final z0 g0;
    public final TextView h0;
    public final ei.d i0;
    public final org.telegram.ui.Components.q6 j0;
    public final ImageView k0;
    public final ImageView l0;
    public final a4.l m0;
    public ag.a n0;
    public int o0;
    public int p0;
    public boolean q0;
    public final d2 r0;
    public final xq[] s0;
    public final xq[] t0;
    public boolean u0;
    public b71 v0;
    public final m61 w0;

    public b1(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.g6 g6Var, d2 d2Var) {
        super(context, null, true, false, 2, g6Var);
        TLRPC.User user;
        a4.l lVar = new a4.l(1);
        n4.s[] sVarArr = (n4.s[]) lVar.b;
        this.m0 = lVar;
        this.s0 = new xq[1];
        this.t0 = new xq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.b0 = j10;
        this.Z = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.a0 = i2.o1.m(tL_starGiftUnique.num, ',', sb2);
        this.r0 = d2Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = ha.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        ag.b bVar = ag.b.a;
        ag.a g10 = ag.a.g(j12, bVar);
        ag.a g11 = ag.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        ag.b bVar2 = ag.b.b;
        ag.a i11 = ag.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        ag.a i12 = ag.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        ag.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            sVarArr[bVar3.ordinal()] = new n4.s(4, g10, g11);
        }
        ag.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            sVarArr[bVar4.ordinal()] = new n4.s(4, i11, i12);
        }
        c cVar = new c(context, i10, g6Var);
        this.Y = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.b6.a(cVar);
        cVar.setOnClickListener(new v0(this, context, g6Var, 0));
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.h5);
        this.X = this.navBarColor;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e0 = editTextBoldCursor;
        if (j11) {
            u40 u40Var = new u40(context, g6Var);
            this.c0 = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            u40Var.b(arrayList, new w0(this, 0));
            linearLayout.addView(u40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.c0 = null;
        }
        LinearLayout e = sl.e(context, 1);
        linearLayout.addView(e, w7.z5.l(1.0f, -1, -2));
        vd0 vd0Var = new vd0(context, null);
        this.d0 = vd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        vd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        vd0Var.e(editTextBoldCursor);
        vd0Var.b(1.0f, 0.0f, false);
        vd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 2));
        vd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e.addView(vd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.k0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        vd0Var.addView(imageView, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.l0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        vd0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.j0 = q6Var;
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.a0(q6Var, i14, null);
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setGravity(5);
        vd0Var.addView(q6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f0 = textView;
        textView.setTextSize(1, 13.0f);
        e.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        z0 z0Var = new z0(context);
        this.g0 = z0Var;
        z0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        z0Var.setCursorWidth(1.5f);
        z0Var.setTextSize(1, 17.0f);
        z0Var.setMaxLines(1);
        z0Var.setBackground(null);
        z0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.r6.W(z0Var, i13, null);
        z0Var.setFocusable(false);
        z0Var.setClickable(false);
        z0Var.setEnabled(false);
        vd0 vd0Var2 = new vd0(context, null);
        vd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        vd0Var2.e(z0Var);
        vd0Var2.addView(z0Var, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(vd0Var2, 0.02f, 1.2f);
        vd0Var2.setOnClickListener(new p(1, this, context));
        e.addView(vd0Var2, w7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.W5, g6Var, PorterDuff.Mode.SRC_IN);
        vd0Var2.addView(imageView3, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        ei.d dVar = new ei.d(context, g6Var, true);
        this.i0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: ai.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.Q(b1.this, i10, context, g6Var, j10);
            }
        });
        U(ag.a.i(0L, bVar), false, true, false);
        if (this.o0 != 86400) {
            this.o0 = 86400;
            z0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new a1(this));
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        mm0 mm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.w0 = m61.k(linearLayout);
        this.v0.N(false);
    }

    public static void P(b1 b1Var, long j10, boolean z10, ag.a aVar, long j11, org.telegram.ui.ActionBar.c2 c2Var) {
        if (j10 > 0) {
            int i10 = b1Var.currentAccount;
            ag.b bVar = ag.b.a;
            ha x10 = ha.x(i10, bVar);
            ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
            ag.a g10 = z10 ? ag.a.g(j10, bVar) : ag.a.i(b1Var.n0.b + aVar.b, bVar);
            if (l4 == null || l4.b < g10.b) {
                new dd(b1Var.getContext(), b1Var.resourcesProvider, g10.a(), 14, null, null, b1Var.b0).show();
                return;
            }
        }
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = b1Var.n0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(b1Var.currentAccount).getInputPeer(b1Var.b0);
        tL_sendStarGiftOffer.duration = b1Var.o0;
        tL_sendStarGiftOffer.slug = b1Var.Z.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(b1Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new s0(b1Var, h, c2Var, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [org.telegram.ui.Components.n01[], org.telegram.ui.Components.zc[]] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static void Q(final b1 b1Var, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (b1Var.i0.c0) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            ha x10 = ha.x(i10, b1Var.n0.a);
            ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
            ag.b bVar = ag.b.a;
            ag.b bVar2 = ag.b.b;
            if (l4 != null) {
                long j11 = l4.b;
                ag.a aVar = b1Var.n0;
                if (j11 >= aVar.b) {
                    String str2 = b1Var.a0;
                    long j12 = b1Var.b0;
                    String d = aVar.d();
                    if (b1Var.n0.a == bVar2) {
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
                    int i11 = org.telegram.ui.ActionBar.k6.j5;
                    org.telegram.messenger.v0.q(textView, i11, b1Var.resourcesProvider, 1, 20.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b1Var.getContext());
                    org.telegram.ui.ActionBar.r6.W(textView2, i11, b1Var.resourcesProvider);
                    textView2.setTextSize(1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(b1Var.n0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    o01 o01Var = new o01(b1Var.getContext(), b1Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b1Var.currentAccount).getSendPaidMessagesStars(j12);
                    final ag.a g10 = ag.a.g(sendPaidMessagesStars, bVar);
                    o01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), nd.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        o01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), nd.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    o01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b1Var.o0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(o01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b1Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) nd.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) nd.R0(LocaleController.formatString(R.string.GiftOfferPay, ag.a.i(b1Var.n0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                            alertDialog$Builder.o(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() { // from class: ai.q0
                                @Override // org.telegram.ui.ActionBar.z1
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                                    b1.P(b1.this, sendPaidMessagesStars, z12, g10, nextRandomId, c2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.Z0 = true;
                            c2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, nd.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), nd.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                    alertDialog$Builder2.o(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() { // from class: ai.q0
                        @Override // org.telegram.ui.ActionBar.z1
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                            b1.P(b1.this, sendPaidMessagesStars, z122, g10, nextRandomId, c2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                    c2Var2.Z0 = true;
                    c2Var2.show();
                    return;
                }
            }
            ag.a aVar2 = b1Var.n0;
            ag.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new dd(context, g6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new fi.f(context, g6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void R(b1 b1Var, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b1Var.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new t0(b1Var, cVar, c2Var, updates, tL_error, 0));
    }

    public final void S() {
        boolean z10 = this.u0;
        c cVar = this.Y;
        boolean z11 = (z10 && !isDismissed() && cVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.c0 == null;
        if (this.q0 != z11) {
            this.q0 = z11;
            if (cVar != null) {
                cVar.setEnabled(z11);
                cVar.setClickable(z11);
                sl.s(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11 = this.p0 == 0 && this.n0.b > 0;
        ei.d dVar = this.i0;
        if (dVar.c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                sl.s(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
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
    public final void U(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        ?? r16;
        boolean z13;
        ag.a aVar2 = this.n0;
        int i10 = this.p0;
        this.p0 = 0;
        if (aVar != null) {
            this.n0 = aVar;
        } else {
            this.n0 = ag.a.i(0L, aVar2.a);
            this.p0 |= 1;
        }
        ag.b bVar = this.n0.a;
        a4.l lVar = this.m0;
        n4.s[] sVarArr = (n4.s[]) lVar.b;
        n4.s[] sVarArr2 = (n4.s[]) lVar.b;
        long j10 = ((ag.a) sVarArr[bVar.ordinal()].c).b;
        ag.a aVar3 = this.n0;
        if (j10 < aVar3.b) {
            this.p0 |= 4;
        }
        if (!aVar3.k() && ((ag.a) sVarArr2[this.n0.a.ordinal()].b).b > this.n0.b) {
            this.p0 |= 2;
        }
        boolean z14 = z11 || aVar2.a != this.n0.a;
        boolean z15 = z11 || aVar2.b != this.n0.b;
        boolean z16 = z11 || i10 != this.p0;
        ag.b bVar2 = ag.b.a;
        EditTextBoldCursor editTextBoldCursor = this.e0;
        ag.b bVar3 = ag.b.b;
        if (z14) {
            u40 u40Var = this.c0;
            if (u40Var != null) {
                u40Var.a(this.n0.a == bVar2 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.b0);
            ag.b bVar4 = this.n0.a;
            TextView textView = this.h0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr2[this.n0.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr2[this.n0.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.l0;
            ImageView imageView2 = this.k0;
            if (z12) {
                z13 = false;
                imageView2.animate().alpha(this.n0.a == bVar2 ? 1.0f : 0.0f).scaleX(this.n0.a == bVar2 ? 1.0f : 0.0f).scaleY(this.n0.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.n0.a == bVar3 ? 1.0f : 0.0f).scaleX(this.n0.a == bVar3 ? 1.0f : 0.0f).scaleY(this.n0.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z13 = false;
                imageView2.setAlpha(this.n0.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.n0.a == bVar3 ? 1.0f : 0.0f);
            }
            c cVar = this.Y;
            r16 = z13;
            if (cVar != null) {
                ag.b bVar5 = this.n0.a;
                r16 = z13;
                if (cVar.e != bVar5) {
                    cVar.e = bVar5;
                    cVar.a();
                    r16 = z13;
                }
            }
        } else {
            r16 = 0;
        }
        if (z14 || z16) {
            this.d0.setText(LocaleController.getString(this.n0.a == bVar2 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            ag.b bVar6 = this.n0.a;
            int i11 = this.p0;
            int i12 = i11 & 4;
            String str = this.a0;
            TextView textView2 = this.f0;
            if (i12 != 0) {
                int i13 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((ag.a) sVarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[r16] = d;
                objArr[1] = str;
                sl.r(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((ag.a) sVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[r16] = d10;
                objArr2[1] = str;
                sl.r(i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                sl.r(i15, objArr3, textView2);
            }
            org.telegram.ui.ActionBar.r6.W(textView2, (this.p0 & (-9)) == 0 ? org.telegram.ui.ActionBar.k6.y6 : org.telegram.ui.ActionBar.k6.q7, this.resourcesProvider);
        }
        if (z14 || z15 || z16) {
            ag.a aVar4 = this.n0;
            boolean z17 = aVar4.a == bVar3 ? true : r16;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[r16] = z17 ? aVar4.b() : LocaleController.formatNumber(aVar4.a(), ',');
            this.i0.i(nd.n1(nd.W0(z17, LocaleController.formatString(i16, objArr4), z17 ? this.t0 : this.s0), z17), z12, true);
            T(z12);
        }
        if (z14 || z15) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.n0.c() * (this.n0.a == bVar3 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.j0.c(sb2, z12, true);
        }
        if (z10 && z15) {
            String b10 = this.n0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (!this.q0 || (cVar = this.Y) == null || f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        S();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.u0 = true;
        S();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor != this.X || (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5)) == this.navBarColor) {
                return;
            }
            fixNavigationBar(themedColor);
            this.X = this.navBarColor;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 9), 50L);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 2), this.resourcesProvider);
        this.v0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
