package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 extends org.telegram.ui.Components.sa {
    public static final int[] s0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final b T;
    public final TL_stars.TL_starGiftUnique U;
    public final String V;
    public final long W;
    public final v30 X;
    public final fc0 Y;
    public final EditTextBoldCursor Z;
    public final TextView a0;
    public final m0 b0;
    public final TextView c0;
    public final kh.d d0;
    public final org.telegram.ui.Components.j6 e0;
    public final ImageView f0;
    public final ImageView g0;
    public final xa.c h0;
    public gf.a i0;
    public int j0;
    public int k0;
    public boolean l0;
    public final v1 m0;
    public final eq[] n0;
    public final eq[] o0;
    public boolean p0;
    public z41 q0;
    public final l41 r0;

    public o0(final Context context, final int i9, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.b6 b6Var, v1 v1Var) {
        super(context, null, true, false, false, false, false, 2, b6Var);
        TLRPC.User user;
        xa.c cVar = new xa.c(16);
        g5.b[] bVarArr = (g5.b[]) cVar.b;
        this.h0 = cVar;
        this.n0 = new eq[1];
        this.o0 = new eq[1];
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.W = j10;
        this.U = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.V = j3.r0.n(tL_starGiftUnique.num, ',', sb2);
        this.m0 = v1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = v7.y(i9, true).j();
        if (j10 > 0 && MessagesController.getInstance(i9).getUserFull(j10) == null && (user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i9).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i9).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        gf.b bVar = gf.b.a;
        gf.a g10 = gf.a.g(j12, bVar);
        gf.a g11 = gf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        gf.b bVar2 = gf.b.b;
        gf.a i10 = gf.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        gf.a i11 = gf.a.i(Math.max(i10.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        gf.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            bVarArr[bVar3.ordinal()] = new g5.b(2, g10, g11);
        }
        gf.b bVar4 = i10.a;
        if (bVar4 == i11.a) {
            bVarArr[bVar4.ordinal()] = new g5.b(2, i10, i11);
        }
        b bVar5 = new b(context, i9, b6Var);
        this.T = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(false);
        bVar5.setClickable(false);
        this.container.addView(bVar5, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        g7.g6.a(bVar5);
        bVar5.setOnClickListener(new fg.f(this, context, b6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.Z = editTextBoldCursor;
        if (j11) {
            v30 v30Var = new v30(context, b6Var);
            this.X = v30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            v30Var.b(arrayList, new k0(this, 0));
            linearLayout.addView(v30Var, g7.e6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.X = null;
        }
        LinearLayout f10 = ll.f(context, 1);
        linearLayout.addView(f10, g7.e6.l(1.0f, -1, -2));
        fc0 fc0Var = new fc0(context, null);
        this.Y = fc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        editTextBoldCursor.requestFocus();
        fc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        fc0Var.e(editTextBoldCursor);
        fc0Var.b(1.0f, 0.0f, false);
        fc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 1));
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        f10.addView(fc0Var, g7.e6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        fc0Var.addView(imageView, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.g0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        fc0Var.addView(imageView2, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.e0 = j6Var;
        int i13 = org.telegram.ui.ActionBar.f6.y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        fc0Var.addView(j6Var, g7.e6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a0 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        m0 m0Var = new m0(context);
        this.b0 = m0Var;
        m0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        m0Var.setCursorWidth(1.5f);
        m0Var.setTextSize(1, 17.0f);
        m0Var.setMaxLines(1);
        m0Var.setBackground(null);
        m0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        m0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        m0Var.setFocusable(false);
        m0Var.setClickable(false);
        m0Var.setEnabled(false);
        fc0 fc0Var2 = new fc0(context, null);
        fc0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        fc0Var2.e(m0Var);
        fc0Var2.addView(m0Var, g7.e6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        g7.g6.b(fc0Var2, 0.02f, 1.2f);
        fc0Var2.setOnClickListener(new bg.u1(13, this, context));
        f10.addView(fc0Var2, g7.e6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, b6Var), PorterDuff.Mode.SRC_IN));
        fc0Var2.addView(imageView3, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.d0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: gh.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.P(o0.this, i9, context, b6Var, j10);
            }
        });
        T(gf.a.i(0L, bVar), false, true, false);
        if (this.j0 != 86400) {
            this.j0 = 86400;
            m0Var.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        S(false);
        editTextBoldCursor.addTextChangedListener(new n0(this));
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        wk0 wk0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.r0 = l41.k(linearLayout);
        this.q0.N(false);
    }

    public static void O(o0 o0Var, long j10, boolean z10, gf.a aVar, long j11, org.telegram.ui.ActionBar.c2 c2Var) {
        if (j10 > 0) {
            int i9 = o0Var.currentAccount;
            gf.b bVar = gf.b.a;
            v7 x10 = v7.x(i9, bVar);
            gf.a l10 = x10.e ? gf.a.l(x10.p()) : null;
            gf.a g10 = z10 ? gf.a.g(j10, bVar) : gf.a.i(o0Var.i0.b + aVar.b, bVar);
            if (l10 == null || l10.b < g10.b) {
                new ea(o0Var.getContext(), o0Var.resourcesProvider, g10.a(), 14, null, null, o0Var.W).show();
                return;
            }
        }
        ve.d g11 = c2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = o0Var.i0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(o0Var.currentAccount).getInputPeer(o0Var.W);
        tL_sendStarGiftOffer.duration = o0Var.j0;
        tL_sendStarGiftOffer.slug = o0Var.U.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(o0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new fh.f0(o0Var, g11, c2Var, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.qc[], org.telegram.ui.Components.vy0[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void P(final o0 o0Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (o0Var.d0.S) {
            if (MessagesController.getInstance(i9).isFrozen()) {
                org.telegram.ui.b.b(i9);
                return;
            }
            v7 x10 = v7.x(i9, o0Var.i0.a);
            gf.a l10 = x10.e ? gf.a.l(x10.p()) : null;
            gf.b bVar = gf.b.a;
            gf.b bVar2 = gf.b.b;
            if (l10 != null) {
                long j11 = l10.b;
                gf.a aVar = o0Var.i0;
                if (j11 >= aVar.b) {
                    String str2 = o0Var.V;
                    long j12 = o0Var.W;
                    String d = aVar.d();
                    if (o0Var.i0.a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(o0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i10 = org.telegram.ui.ActionBar.f6.j5;
                    org.telegram.ui.Cells.j2.o(i10, o0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, g7.e6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(o0Var.getContext());
                    ll.n(i10, o0Var.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(o0Var.i0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
                    wy0 wy0Var = new wy0(o0Var.getContext(), o0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(o0Var.currentAccount).getSendPaidMessagesStars(j12);
                    final gf.a g10 = gf.a.g(sendPaidMessagesStars, bVar);
                    wy0Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), oa.X0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        wy0Var.c(LocaleController.getString(R.string.GiftOfferRowFee), oa.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    wy0Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", o0Var.j0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(wy0Var, g7.e6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(o0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) oa.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) oa.Q0(LocaleController.formatString(R.string.GiftOfferPay, gf.a.i(o0Var.i0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o0Var.getContext(), 0, o0Var.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() { // from class: gh.i0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                                    o0.O(o0.this, sendPaidMessagesStars, z12, g10, nextRandomId, c2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.T0 = true;
                            c2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, oa.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), oa.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o0Var.getContext(), 0, o0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.b2() { // from class: gh.i0
                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                            o0.O(o0.this, sendPaidMessagesStars, z122, g10, nextRandomId, c2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                    c2Var2.T0 = true;
                    c2Var2.show();
                    return;
                }
            }
            gf.a aVar2 = o0Var.i0;
            gf.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new ea(context, b6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new lh.f(context, b6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void Q(o0 o0Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(o0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new bg.o0((Object) o0Var, (Object) dVar, (Object) c2Var, (Object) updates, tL_error, 5));
    }

    public final void R() {
        boolean z10 = this.p0;
        b bVar = this.T;
        boolean z11 = (z10 && !isDismissed() && bVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.X == null;
        if (this.l0 != z11) {
            this.l0 = z11;
            if (bVar != null) {
                bVar.setEnabled(z11);
                bVar.setClickable(z11);
                bVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void S(boolean z10) {
        boolean z11 = this.k0 == 0 && this.i0.b > 0;
        kh.d dVar = this.d0;
        if (dVar.S != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                dVar.animate().alpha(z11 ? 1.0f : 0.6f).setDuration(180L).start();
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    public final void T(gf.a aVar, boolean z10, boolean z11, boolean z12) {
        char c10;
        gf.b bVar;
        gf.a aVar2 = this.i0;
        int i9 = this.k0;
        this.k0 = 0;
        if (aVar != null) {
            this.i0 = aVar;
        } else {
            this.i0 = gf.a.i(0L, aVar2.a);
            this.k0 |= 1;
        }
        gf.b bVar2 = this.i0.a;
        xa.c cVar = this.h0;
        g5.b[] bVarArr = (g5.b[]) cVar.b;
        g5.b[] bVarArr2 = (g5.b[]) cVar.b;
        long j10 = ((gf.a) bVarArr[bVar2.ordinal()].c).b;
        gf.a aVar3 = this.i0;
        if (j10 < aVar3.b) {
            this.k0 |= 4;
        }
        if (!aVar3.k() && ((gf.a) bVarArr2[this.i0.a.ordinal()].b).b > this.i0.b) {
            this.k0 |= 2;
        }
        boolean z13 = z11 || aVar2.a != this.i0.a;
        boolean z14 = z11 || aVar2.b != this.i0.b;
        boolean z15 = z11 || i9 != this.k0;
        gf.b bVar3 = gf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.Z;
        gf.b bVar4 = gf.b.b;
        if (z13) {
            v30 v30Var = this.X;
            if (v30Var != null) {
                v30Var.a(this.i0.a == bVar3 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.W);
            gf.b bVar5 = this.i0.a;
            TextView textView = this.c0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((gf.a) bVarArr2[this.i0.a.ordinal()].c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((gf.a) bVarArr2[this.i0.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.g0;
            ImageView imageView2 = this.f0;
            if (z12) {
                c10 = 0;
                imageView2.animate().alpha(this.i0.a == bVar3 ? 1.0f : 0.0f).scaleX(this.i0.a == bVar3 ? 1.0f : 0.0f).scaleY(this.i0.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.i0.a == bVar4 ? 1.0f : 0.0f).scaleX(this.i0.a == bVar4 ? 1.0f : 0.0f).scaleY(this.i0.a == bVar4 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                c10 = 0;
                imageView2.setAlpha(this.i0.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.i0.a == bVar4 ? 1.0f : 0.0f);
            }
            b bVar6 = this.T;
            if (bVar6 != null && bVar6.e != (bVar = this.i0.a)) {
                bVar6.e = bVar;
                bVar6.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            this.Y.setText(LocaleController.getString(this.i0.a == bVar3 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            gf.b bVar7 = this.i0.a;
            int i10 = this.k0;
            int i11 = i10 & 4;
            String str = this.V;
            TextView textView2 = this.a0;
            if (i11 != 0) {
                int i12 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((gf.a) bVarArr2[bVar7.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[c10] = d;
                objArr[1] = str;
                ll.q(i12, objArr, textView2);
            } else if ((i10 & 2) != 0) {
                int i13 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d9 = ((gf.a) bVarArr2[bVar7.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = d9;
                objArr2[1] = str;
                ll.q(i13, objArr2, textView2);
            } else {
                int i14 = bVar7 == bVar3 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                ll.q(i14, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.k0 & (-9)) == 0 ? org.telegram.ui.ActionBar.f6.y6 : org.telegram.ui.ActionBar.f6.q7));
        }
        if (z13 || z14 || z15) {
            gf.a aVar4 = this.i0;
            boolean z16 = aVar4.a == bVar4;
            int i15 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[c10] = z16 ? aVar4.b() : LocaleController.formatNumber(aVar4.a(), ',');
            this.d0.g(oa.V0(z16, LocaleController.formatString(i15, objArr4), z16 ? this.o0 : this.n0), z12, true);
            S(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.i0.c() * (this.i0.a == bVar4 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.e0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.i0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (!this.l0 || (bVar = this.T) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        R();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.p0 = true;
        R();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new fh.o1(this, 7), 50L);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 15), this.resourcesProvider);
        this.q0 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
