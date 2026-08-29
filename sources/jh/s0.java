package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class s0 extends org.telegram.ui.ActionBar.f3 {
    public final kf.a A;
    public final kf.a B;
    public final kf.a C;
    public kf.a D;
    public long E;
    public int F;
    public boolean G;
    public final iq[] H;
    public final iq[] I;
    public boolean J;
    public final b b;
    public final boolean c;
    public final int d;
    public final j40 e;
    public final uc0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final q0 r;
    public final nh.d s;
    public final org.telegram.ui.Components.o6 v;
    public final ImageView w;
    public final ImageView x;
    public final kf.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, tn tnVar, final org.telegram.ui.ActionBar.c6 c6Var, int i11, Utilities.Callback callback) {
        super(context, c6Var, true, false);
        boolean z10;
        final int i12 = 0;
        this.E = -1L;
        this.H = new iq[1];
        this.I = new iq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.c = canManageMonoForum;
        boolean z11 = canManageMonoForum || s7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        kf.b bVar = kf.b.b;
        this.B = kf.a.i(j11, bVar);
        this.C = kf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        kf.b bVar2 = kf.b.a;
        this.y = kf.a.g(j12, bVar2);
        this.A = kf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (canManageMonoForum) {
            this.b = null;
        } else {
            b bVar3 = new b(context, i10, c6Var);
            this.b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            i7.h6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) { // from class: jh.o0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.D.a == kf.b.a) {
                                new z9(context, c6Var).show();
                                break;
                            }
                            break;
                        default:
                            s0 s0Var = this.b;
                            org.telegram.ui.Components.c5.T(context, s0Var.E, new eg.n(s0Var, 18), c6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        linearLayout.addView(g10, i7.f6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g10.addView(textView, i7.f6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.g6.W5;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        i7.h6.a(imageView);
        imageView.setOnClickListener(new ag.o(this, 15));
        g10.addView(imageView, i7.f6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            j40 j40Var = new j40(context, c6Var);
            this.e = j40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            j40Var.b(arrayList, new j0(this, 1));
            linearLayout.addView(j40Var, i7.f6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout g11 = org.telegram.messenger.x3.g(context, 1);
        linearLayout.addView(g11, i7.f6.l(1.0f, -1, -2));
        uc0 uc0Var = new uc0(context, null);
        this.f = uc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        uc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        uc0Var.e(editTextBoldCursor);
        kf.a aVar = messageSuggestionParams.amount;
        uc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        uc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ag.a0(this, 4));
        uc0Var.addView(editTextBoldCursor, i7.f6.e(-1, -2, 48));
        g11.addView(uc0Var, i7.f6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        uc0Var.addView(imageView2, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        uc0Var.addView(imageView3, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.v = o6Var;
        int i15 = org.telegram.ui.ActionBar.g6.y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        uc0Var.addView(o6Var, i7.f6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        g11.addView(textView2, i7.f6.t(-1, -2, 55, 33, 4, 33, 0));
        q0 q0Var = new q0(context);
        this.r = q0Var;
        q0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        q0Var.setCursorWidth(1.5f);
        q0Var.setTextSize(1, 17.0f);
        q0Var.setMaxLines(1);
        q0Var.setBackground(null);
        q0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        q0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        q0Var.setFocusable(false);
        q0Var.setClickable(false);
        q0Var.setEnabled(false);
        uc0 uc0Var2 = new uc0(context, null);
        uc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        uc0Var2.e(q0Var);
        uc0Var2.addView(q0Var, i7.f6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        i7.h6.b(uc0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        uc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: jh.o0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.D.a == kf.b.a) {
                            new z9(context, c6Var).show();
                            break;
                        }
                        break;
                    default:
                        s0 s0Var = this.b;
                        org.telegram.ui.Components.c5.T(context, s0Var.E, new eg.n(s0Var, 18), c6Var, 0).a.show();
                        break;
                }
            }
        });
        g11.addView(uc0Var2, i7.f6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        uc0Var2.addView(imageView4, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        g11.addView(textView3, i7.f6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, i7.f6.q(-1, -2, 80));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new p0(this, tnVar, i10, context, c6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, i7.f6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        kf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            q(kf.a.i(aVar2.b, aVar2.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            q(kf.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.E != j13) {
            this.E = j13;
            q0Var.setText(o(j13));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new r0(this));
    }

    public static String o(long j10) {
        if (j10 <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String formatDateTime = LocaleController.formatDateTime(j10, true);
        if (formatDateTime.isEmpty()) {
            return formatDateTime;
        }
        return Character.toUpperCase(formatDateTime.charAt(0)) + formatDateTime.substring(1);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f9, float f10) {
        b bVar;
        if (!this.G || (bVar = this.b) == null || f9 < bVar.getX() || f9 > bVar.getX() + bVar.getWidth() || f10 < bVar.getY() || f10 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f9, f10);
        }
        return false;
    }

    public final void m() {
        boolean z10 = this.J;
        b bVar = this.b;
        boolean z11 = (z10 && !isDismissed() && bVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.e == null;
        if (this.G != z11) {
            this.G = z11;
            if (bVar != null) {
                bVar.setEnabled(z11);
                bVar.setClickable(z11);
                bVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11 = this.F == 0 && (this.D.b >= 0 || this.E > 0);
        nh.d dVar = this.s;
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f9) {
        super.onContainerTranslationYChanged(f9);
        m();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.J = true;
        m();
    }

    public final kf.a p() {
        return this.D.a == kf.b.b ? this.C : this.A;
    }

    public final void q(kf.a aVar, boolean z10, boolean z11, boolean z12) {
        kf.a aVar2;
        char c3;
        kf.b bVar;
        kf.a aVar3 = this.D;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.D = aVar;
        } else {
            this.D = kf.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j10 = p().b;
        kf.a aVar4 = this.D;
        if (j10 < aVar4.b) {
            this.F |= 4;
        }
        boolean k9 = aVar4.k();
        kf.a aVar5 = this.y;
        kf.a aVar6 = this.B;
        kf.b bVar2 = kf.b.b;
        if (!k9) {
            kf.a aVar7 = this.D;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.D.a;
        boolean z14 = z11 || aVar3.b != this.D.b;
        boolean z15 = z11 || i10 != this.F;
        uc0 uc0Var = this.f;
        if (z15) {
            uc0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        kf.b bVar3 = kf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c3 = 0;
            j40 j40Var = this.e;
            if (j40Var != null) {
                j40Var.a(this.D.a == bVar3 ? 0 : 1, z12);
            }
            kf.b bVar4 = this.D.a;
            TextView textView = this.n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.x;
            ImageView imageView2 = this.w;
            if (z12) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.D.a == bVar3 ? 1.0f : 0.0f).scaleX(this.D.a == bVar3 ? 1.0f : 0.0f).scaleY(this.D.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.D.a == bVar2 ? 1.0f : 0.0f).scaleX(this.D.a == bVar2 ? 1.0f : 0.0f).scaleY(this.D.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.D.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.D.a == bVar2 ? 1.0f : 0.0f);
            }
            b bVar5 = this.b;
            if (bVar5 != null && bVar5.e != (bVar = this.D.a)) {
                bVar5.e = bVar;
                bVar5.a();
            }
        } else {
            aVar2 = aVar5;
            c3 = 0;
        }
        if (z13 || z15) {
            int i11 = this.F;
            if ((i11 & 4) != 0) {
                int i12 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = p().f();
                uc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c3] = (this.D.a == bVar2 ? aVar6 : aVar2).f();
                uc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                uc0Var.setText(LocaleController.getString(this.D.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.d;
            nh.d dVar = this.s;
            if (i14 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.D.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                kf.a aVar8 = this.D;
                boolean z16 = aVar8.a == bVar2;
                int i15 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c3] = z16 ? aVar8.b() : LocaleController.formatNumber(aVar8.a(), ',');
                dVar.g(ia.V0(z16, LocaleController.formatString(i15, objArr3), z16 ? this.I : this.H), z12, true);
            }
            n(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.D.c() * (this.D.a == bVar2 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.D.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new o(this, 3), 50L);
    }
}
