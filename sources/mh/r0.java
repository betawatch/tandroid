package mh;

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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p40;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r0 extends org.telegram.ui.ActionBar.h3 {
    public final mf.a B;
    public final mf.a C;
    public final mf.a D;
    public mf.a E;
    public long F;
    public int G;
    public boolean H;
    public final oq[] I;
    public final oq[] J;
    public boolean K;
    public final b b;
    public final boolean c;
    public final int d;
    public final p40 e;
    public final cd0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final p0 r;
    public final qh.d s;
    public final org.telegram.ui.Components.k6 v;
    public final ImageView w;
    public final ImageView x;
    public final mf.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, xn xnVar, final org.telegram.ui.ActionBar.g6 g6Var, int i11, Utilities.Callback callback) {
        super(context, g6Var, true, false);
        boolean z4;
        final int i12 = 0;
        this.F = -1L;
        this.I = new oq[1];
        this.J = new oq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.c = canManageMonoForum;
        boolean z10 = canManageMonoForum || t7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        mf.b bVar = mf.b.b;
        this.C = mf.a.i(j11, bVar);
        this.D = mf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        mf.b bVar2 = mf.b.a;
        this.y = mf.a.g(j12, bVar2);
        this.B = mf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (canManageMonoForum) {
            this.b = null;
        } else {
            b bVar3 = new b(context, i10, g6Var);
            this.b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            k7.e6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) { // from class: mh.n0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.E.a == mf.b.a) {
                                new aa(context, g6Var).show();
                                break;
                            }
                            break;
                        default:
                            r0 r0Var = this.b;
                            org.telegram.ui.Components.z4.T(context, r0Var.F, new hg.f(r0Var, 26), g6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f10, k7.c6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, k7.c6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.k6.W5;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        k7.e6.a(imageView);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 15));
        f10.addView(imageView, k7.c6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            p40 p40Var = new p40(context, g6Var);
            this.e = p40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            p40Var.b(arrayList, new i0(this, 1));
            linearLayout.addView(p40Var, k7.c6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f11, k7.c6.l(1.0f, -1, -2));
        cd0 cd0Var = new cd0(context, null);
        this.f = cd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        cd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        cd0Var.e(editTextBoldCursor);
        mf.a aVar = messageSuggestionParams.amount;
        cd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        cd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new dg.z(this, 4));
        cd0Var.addView(editTextBoldCursor, k7.c6.e(-1, -2, 48));
        f11.addView(cd0Var, k7.c6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        cd0Var.addView(imageView2, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        cd0Var.addView(imageView3, k7.c6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.v = k6Var;
        int i15 = org.telegram.ui.ActionBar.k6.y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        cd0Var.addView(k6Var, k7.c6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, k7.c6.t(-1, -2, 55, 33, 4, 33, 0));
        p0 p0Var = new p0(context);
        this.r = p0Var;
        p0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        p0Var.setCursorWidth(1.5f);
        p0Var.setTextSize(1, 17.0f);
        p0Var.setMaxLines(1);
        p0Var.setBackground(null);
        p0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        p0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        p0Var.setFocusable(false);
        p0Var.setClickable(false);
        p0Var.setEnabled(false);
        cd0 cd0Var2 = new cd0(context, null);
        cd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        cd0Var2.e(p0Var);
        cd0Var2.addView(p0Var, k7.c6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.e6.b(cd0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        cd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: mh.n0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.E.a == mf.b.a) {
                            new aa(context, g6Var).show();
                            break;
                        }
                        break;
                    default:
                        r0 r0Var = this.b;
                        org.telegram.ui.Components.z4.T(context, r0Var.F, new hg.f(r0Var, 26), g6Var, 0).a.show();
                        break;
                }
            }
        });
        f11.addView(cd0Var2, k7.c6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), mode));
        cd0Var2.addView(imageView4, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, k7.c6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.c6.q(-1, -2, 80));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new o0(this, xnVar, i10, context, g6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, k7.c6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        mf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z4 = false;
            q(mf.a.i(aVar2.b, aVar2.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z4 = false;
            q(mf.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.F != j13) {
            this.F = j13;
            p0Var.setText(o(j13));
        }
        n(z4);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new q0(this));
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

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (!this.H || (bVar = this.b) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    public final void m() {
        boolean z4 = this.K;
        b bVar = this.b;
        boolean z10 = (z4 && !isDismissed() && bVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.e == null;
        if (this.H != z10) {
            this.H = z10;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                bVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void n(boolean z4) {
        boolean z10 = this.G == 0 && (this.E.b >= 0 || this.F > 0);
        qh.d dVar = this.s;
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

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        m();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.K = true;
        m();
    }

    public final mf.a p() {
        return this.E.a == mf.b.b ? this.D : this.B;
    }

    public final void q(mf.a aVar, boolean z4, boolean z10, boolean z11) {
        mf.a aVar2;
        char c3;
        mf.b bVar;
        mf.a aVar3 = this.E;
        int i10 = this.G;
        this.G = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = mf.a.i(0L, aVar3.a);
            this.G |= 1;
        }
        long j10 = p().b;
        mf.a aVar4 = this.E;
        if (j10 < aVar4.b) {
            this.G |= 4;
        }
        boolean k10 = aVar4.k();
        mf.a aVar5 = this.y;
        mf.a aVar6 = this.C;
        mf.b bVar2 = mf.b.b;
        if (!k10) {
            mf.a aVar7 = this.E;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.G |= 2;
            }
        }
        boolean z12 = z10 || aVar3.a != this.E.a;
        boolean z13 = z10 || aVar3.b != this.E.b;
        boolean z14 = z10 || i10 != this.G;
        cd0 cd0Var = this.f;
        if (z14) {
            cd0Var.a((this.G & (-9)) == 0 ? 0.0f : 1.0f);
        }
        mf.b bVar3 = mf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z12) {
            c3 = 0;
            p40 p40Var = this.e;
            if (p40Var != null) {
                p40Var.a(this.E.a == bVar3 ? 0 : 1, z11);
            }
            mf.b bVar4 = this.E.a;
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
            if (z11) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.E.a == bVar3 ? 1.0f : 0.0f).scaleX(this.E.a == bVar3 ? 1.0f : 0.0f).scaleY(this.E.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.E.a == bVar2 ? 1.0f : 0.0f).scaleX(this.E.a == bVar2 ? 1.0f : 0.0f).scaleY(this.E.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.E.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.E.a == bVar2 ? 1.0f : 0.0f);
            }
            b bVar5 = this.b;
            if (bVar5 != null && bVar5.e != (bVar = this.E.a)) {
                bVar5.e = bVar;
                bVar5.a();
            }
        } else {
            aVar2 = aVar5;
            c3 = 0;
        }
        if (z12 || z14) {
            int i11 = this.G;
            if ((i11 & 4) != 0) {
                int i12 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = p().f();
                cd0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c3] = (this.E.a == bVar2 ? aVar6 : aVar2).f();
                cd0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                cd0Var.setText(LocaleController.getString(this.E.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z12 || z13 || z14) {
            int i14 = this.d;
            qh.d dVar = this.s;
            if (i14 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z11, true);
            } else if (this.E.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z11, true);
            } else {
                mf.a aVar8 = this.E;
                boolean z15 = aVar8.a == bVar2;
                int i15 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c3] = z15 ? aVar8.b() : LocaleController.formatNumber(aVar8.a(), ',');
                dVar.g(ja.V0(z15, LocaleController.formatString(i15, objArr3), z15 ? this.J : this.I), z11, true);
            }
            n(z11);
        }
        if (z12 || z13) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * (this.E.a == bVar2 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.v.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new lh.c3(this, 5), 50L);
    }
}
