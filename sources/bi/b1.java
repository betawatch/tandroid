package bi;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b1 extends org.telegram.ui.Components.bb {
    public static final int[] x0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int X;
    public final c Y;
    public final TL_stars.TL_starGiftUnique Z;
    public final String a0;
    public final long b0;
    public final w40 c0;
    public final rd0 d0;
    public final EditTextBoldCursor e0;
    public final TextView f0;
    public final z0 g0;
    public final TextView h0;
    public final fi.d i0;
    public final org.telegram.ui.Components.s6 j0;
    public final ImageView k0;
    public final ImageView l0;
    public final b6.i m0;
    public bg.a n0;
    public int o0;
    public int p0;
    public boolean q0;
    public final a2 r0;
    public final zq[] s0;
    public final zq[] t0;
    public boolean u0;
    public j71 v0;
    public final t61 w0;

    public b1(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.u6 u6Var, a2 a2Var) {
        super(context, null, true, false, 2, u6Var);
        TLRPC.User user;
        b6.i iVar = new b6.i(6);
        rf.b[] bVarArr = (rf.b[]) iVar.b;
        this.m0 = iVar;
        this.s0 = new zq[1];
        this.t0 = new zq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.b0 = j10;
        this.Z = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.a0 = org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2);
        this.r0 = a2Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = ca.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        bg.b bVar = bg.b.a;
        bg.a g7 = bg.a.g(j12, bVar);
        bg.a g10 = bg.a.g(Math.max(g7.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        bg.b bVar2 = bg.b.b;
        bg.a i11 = bg.a.i(Math.max(g7.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        bg.a i12 = bg.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        bg.b bVar3 = g7.a;
        if (bVar3 == g10.a) {
            bVarArr[bVar3.ordinal()] = new rf.b(9, g7, g10);
        }
        bg.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            bVarArr[bVar4.ordinal()] = new rf.b(9, i11, i12);
        }
        c cVar = new c(context, i10, u6Var);
        this.Y = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, gb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        gb1.b(cVar);
        cVar.setOnClickListener(new w0(this, context, u6Var, 0));
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
        this.X = this.navBarColor;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e0 = editTextBoldCursor;
        if (j11) {
            w40 w40Var = new w40(context, u6Var);
            this.c0 = w40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            w40Var.b(arrayList, new x0(this, 0));
            linearLayout.addView(w40Var, gb1.o(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.c0 = null;
        }
        LinearLayout d = vh.d(context, 1);
        linearLayout.addView(d, gb1.p(1.0f, -1, -2));
        rd0 rd0Var = new rd0(context, null);
        this.d0 = rd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        rd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        rd0Var.e(editTextBoldCursor);
        rd0Var.b(1.0f, 0.0f, false);
        rd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 2));
        rd0Var.addView(editTextBoldCursor, gb1.i(-1, -2, 48));
        d.addView(rd0Var, gb1.o(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.k0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        rd0Var.addView(imageView, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.l0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        rd0Var.addView(imageView2, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.j0 = s6Var;
        int i14 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i14, null);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        rd0Var.addView(s6Var, gb1.h(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f0 = textView;
        textView.setTextSize(1, 13.0f);
        d.addView(textView, gb1.x(-1, -2, 55, 33, 4, 33, 0));
        z0 z0Var = new z0(context);
        this.g0 = z0Var;
        z0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        z0Var.setCursorWidth(1.5f);
        z0Var.setTextSize(1, 17.0f);
        z0Var.setMaxLines(1);
        z0Var.setBackground(null);
        z0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(z0Var, i13, null);
        z0Var.setFocusable(false);
        z0Var.setClickable(false);
        z0Var.setEnabled(false);
        rd0 rd0Var2 = new rd0(context, null);
        rd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        rd0Var2.e(z0Var);
        rd0Var2.addView(z0Var, gb1.h(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        gb1.c(rd0Var2, 0.02f, 1.2f);
        rd0Var2.setOnClickListener(new q(1, this, context));
        d.addView(rd0Var2, gb1.o(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.W5, u6Var, PorterDuff.Mode.SRC_IN);
        rd0Var2.addView(imageView3, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        d.addView(textView2, gb1.x(-1, -2, 55, 33, 4, 33, 0));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.i0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: bi.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.Q(b1.this, i10, context, u6Var, j10);
            }
        });
        U(bg.a.i(0L, bVar), false, true, false);
        if (this.o0 != 86400) {
            this.o0 = 86400;
            z0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new a1(this));
        FrameLayout.LayoutParams h = gb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = h.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        h.leftMargin = i15 + i16;
        h.rightMargin += i16;
        this.containerView.addView(dVar, h);
        mm0 mm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.w0 = t61.k(linearLayout);
        this.v0.O(false);
    }

    public static void P(b1 b1Var, long j10, boolean z10, bg.a aVar, long j11, org.telegram.ui.ActionBar.e2 e2Var) {
        if (j10 > 0) {
            int i10 = b1Var.currentAccount;
            bg.b bVar = bg.b.a;
            ca x9 = ca.x(i10, bVar);
            bg.a l4 = x9.e ? bg.a.l(x9.p()) : null;
            bg.a g7 = z10 ? bg.a.g(j10, bVar) : bg.a.i(b1Var.n0.b + aVar.b, bVar);
            if (l4 == null || l4.b < g7.b) {
                new tc(b1Var.getContext(), b1Var.resourcesProvider, g7.a(), 14, null, null, b1Var.b0).show();
                return;
            }
        }
        qf.c h = e2Var.h(-1, true, true);
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
        ConnectionsManager.getInstance(b1Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new t0(b1Var, h, e2Var, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [org.telegram.ui.Components.v01[], org.telegram.ui.Components.yc[]] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static void Q(final b1 b1Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (b1Var.i0.c0) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            ca x9 = ca.x(i10, b1Var.n0.a);
            bg.a l4 = x9.e ? bg.a.l(x9.p()) : null;
            bg.b bVar = bg.b.a;
            bg.b bVar2 = bg.b.b;
            if (l4 != null) {
                long j11 = l4.b;
                bg.a aVar = b1Var.n0;
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
                    int i11 = org.telegram.ui.ActionBar.y6.j5;
                    org.telegram.messenger.t.r(textView, i11, b1Var.resourcesProvider, 1, 20.0f);
                    linearLayout.addView(textView, gb1.x(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(b1Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView2, i11, b1Var.resourcesProvider);
                    textView2.setTextSize(1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(b1Var.n0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, gb1.x(-1, -2, 48, 24, 4, 24, 4));
                    w01 w01Var = new w01(b1Var.getContext(), b1Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(b1Var.currentAccount).getSendPaidMessagesStars(j12);
                    final bg.a g7 = bg.a.g(sendPaidMessagesStars, bVar);
                    w01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), dd.W0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        w01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), dd.W0(false, LocaleController.formatString(R.string.GiftOfferAmount, g7.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    w01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", b1Var.o0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(w01Var, gb1.x(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(b1Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) dd.R0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) dd.P0(LocaleController.formatString(R.string.GiftOfferPay, bg.a.i(b1Var.n0.b + g7.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                            alertDialog$Builder.o(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() { // from class: bi.s0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
                                    b1.P(b1.this, sendPaidMessagesStars, z12, g7, nextRandomId, e2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            e2Var.Z0 = true;
                            e2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, dd.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), dd.P0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g7.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b1Var.getContext(), 0, b1Var.resourcesProvider);
                    alertDialog$Builder2.o(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() { // from class: bi.s0
                        @Override // org.telegram.ui.ActionBar.b2
                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i12) {
                            b1.P(b1.this, sendPaidMessagesStars, z122, g7, nextRandomId, e2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                    e2Var2.Z0 = true;
                    e2Var2.show();
                    return;
                }
            }
            bg.a aVar2 = b1Var.n0;
            bg.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new tc(context, u6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new gi.g(context, u6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void R(b1 b1Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(b1Var.currentAccount).lambda$processUpdates$379(updates, false);
        }
        AndroidUtilities.runOnUIThread(new u0(b1Var, cVar, e2Var, updates, tL_error, 0));
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
                vh.p(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11 = this.p0 == 0 && this.n0.b > 0;
        fi.d dVar = this.i0;
        if (dVar.c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                vh.p(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
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
    public final void U(bg.a aVar, boolean z10, boolean z11, boolean z12) {
        ?? r16;
        boolean z13;
        bg.a aVar2 = this.n0;
        int i10 = this.p0;
        this.p0 = 0;
        if (aVar != null) {
            this.n0 = aVar;
        } else {
            this.n0 = bg.a.i(0L, aVar2.a);
            this.p0 |= 1;
        }
        bg.b bVar = this.n0.a;
        b6.i iVar = this.m0;
        rf.b[] bVarArr = (rf.b[]) iVar.b;
        rf.b[] bVarArr2 = (rf.b[]) iVar.b;
        long j10 = ((bg.a) bVarArr[bVar.ordinal()].c).b;
        bg.a aVar3 = this.n0;
        if (j10 < aVar3.b) {
            this.p0 |= 4;
        }
        if (!aVar3.k() && ((bg.a) bVarArr2[this.n0.a.ordinal()].b).b > this.n0.b) {
            this.p0 |= 2;
        }
        boolean z14 = z11 || aVar2.a != this.n0.a;
        boolean z15 = z11 || aVar2.b != this.n0.b;
        boolean z16 = z11 || i10 != this.p0;
        bg.b bVar2 = bg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.e0;
        bg.b bVar3 = bg.b.b;
        if (z14) {
            w40 w40Var = this.c0;
            if (w40Var != null) {
                w40Var.a(this.n0.a == bVar2 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.b0);
            bg.b bVar4 = this.n0.a;
            TextView textView = this.h0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((bg.a) bVarArr2[this.n0.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((bg.a) bVarArr2[this.n0.a.ordinal()].c).a()).length() + 3)});
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
                bg.b bVar5 = this.n0.a;
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
            bg.b bVar6 = this.n0.a;
            int i11 = this.p0;
            int i12 = i11 & 4;
            String str = this.a0;
            TextView textView2 = this.f0;
            if (i12 != 0) {
                int i13 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((bg.a) bVarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[r16] = d;
                objArr[1] = str;
                vh.o(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((bg.a) bVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[r16] = d10;
                objArr2[1] = str;
                vh.o(i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                vh.o(i15, objArr3, textView2);
            }
            org.telegram.ui.ActionBar.f7.V(textView2, (this.p0 & (-9)) == 0 ? org.telegram.ui.ActionBar.y6.y6 : org.telegram.ui.ActionBar.y6.q7, this.resourcesProvider);
        }
        if (z14 || z15 || z16) {
            bg.a aVar4 = this.n0;
            boolean z17 = aVar4.a == bVar3 ? true : r16;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[r16] = z17 ? aVar4.b() : LocaleController.formatNumber(aVar4.a(), ',');
            this.i0.i(dd.o1(dd.U0(z17, LocaleController.formatString(i16, objArr4), z17 ? this.t0 : this.s0), z17), z12, true);
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

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (!this.q0 || (cVar = this.Y) == null || f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        S();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.u0 = true;
        S();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColor != this.X || (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.h5)) == this.navBarColor) {
                return;
            }
            fixNavigationBar(themedColor);
            this.X = this.navBarColor;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 19), 50L);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 5), this.resourcesProvider);
        this.v0 = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
