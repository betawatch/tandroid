package lh;

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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.n40;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class s0 extends org.telegram.ui.ActionBar.g3 {
    public final mf.a B;
    public final mf.a C;
    public final mf.a D;
    public mf.a E;
    public long F;
    public int G;
    public boolean H;
    public final mq[] I;
    public final mq[] J;
    public boolean K;
    public final c b;
    public final boolean c;
    public final int d;
    public final n40 e;
    public final ad0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final q0 r;
    public final ph.d s;
    public final org.telegram.ui.Components.k6 v;
    public final ImageView w;
    public final ImageView x;
    public final mf.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, xn xnVar, final org.telegram.ui.ActionBar.f6 f6Var, int i11, Utilities.Callback callback) {
        super(context, f6Var, true, false);
        boolean z4;
        final int i12 = 0;
        this.F = -1L;
        this.I = new mq[1];
        this.J = new mq[1];
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
            c cVar = new c(context, i10, f6Var);
            this.b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            k7.d6.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) { // from class: lh.o0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.E.a == mf.b.a) {
                                new aa(context, f6Var).show();
                                break;
                            }
                            break;
                        default:
                            s0 s0Var = this.b;
                            org.telegram.ui.Components.z4.T(context, s0Var.F, new gg.f(s0Var, 26), f6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f10, k7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, k7.b6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.j6.W5;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        k7.d6.a(imageView);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 15));
        f10.addView(imageView, k7.b6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z10) {
            n40 n40Var = new n40(context, f6Var);
            this.e = n40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            n40Var.b(arrayList, new j0(this, 1));
            linearLayout.addView(n40Var, k7.b6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
        linearLayout.addView(f11, k7.b6.l(1.0f, -1, -2));
        ad0 ad0Var = new ad0(context, null);
        this.f = ad0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        ad0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        ad0Var.e(editTextBoldCursor);
        mf.a aVar = messageSuggestionParams.amount;
        ad0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        ad0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 4));
        ad0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        f11.addView(ad0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        ad0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        ad0Var.addView(imageView3, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.v = k6Var;
        int i15 = org.telegram.ui.ActionBar.j6.y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var.setGravity(5);
        ad0Var.addView(k6Var, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        q0 q0Var = new q0(context);
        this.r = q0Var;
        q0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        q0Var.setCursorWidth(1.5f);
        q0Var.setTextSize(1, 17.0f);
        q0Var.setMaxLines(1);
        q0Var.setBackground(null);
        q0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        q0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        q0Var.setFocusable(false);
        q0Var.setClickable(false);
        q0Var.setEnabled(false);
        ad0 ad0Var2 = new ad0(context, null);
        ad0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        ad0Var2.e(q0Var);
        ad0Var2.addView(q0Var, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        k7.d6.b(ad0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        ad0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: lh.o0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.E.a == mf.b.a) {
                            new aa(context, f6Var).show();
                            break;
                        }
                        break;
                    default:
                        s0 s0Var = this.b;
                        org.telegram.ui.Components.z4.T(context, s0Var.F, new gg.f(s0Var, 26), f6Var, 0).a.show();
                        break;
                }
            }
        });
        f11.addView(ad0Var2, k7.b6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
        ad0Var2.addView(imageView4, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, k7.b6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.b6.q(-1, -2, 80));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new p0(this, xnVar, i10, context, f6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, k7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
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
            q0Var.setText(o(j13));
        }
        n(z4);
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

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean isTouchOutside(float f10, float f11) {
        c cVar;
        if (!this.H || (cVar = this.b) == null || f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    public final void m() {
        boolean z4 = this.K;
        c cVar = this.b;
        boolean z10 = (z4 && !isDismissed() && cVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.e == null;
        if (this.H != z10) {
            this.H = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void n(boolean z4) {
        boolean z10 = this.G == 0 && (this.E.b >= 0 || this.F > 0);
        ph.d dVar = this.s;
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

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        m();
    }

    @Override // org.telegram.ui.ActionBar.g3
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
        ad0 ad0Var = this.f;
        if (z14) {
            ad0Var.a((this.G & (-9)) == 0 ? 0.0f : 1.0f);
        }
        mf.b bVar3 = mf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z12) {
            c3 = 0;
            n40 n40Var = this.e;
            if (n40Var != null) {
                n40Var.a(this.E.a == bVar3 ? 0 : 1, z11);
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
            c cVar = this.b;
            if (cVar != null && cVar.e != (bVar = this.E.a)) {
                cVar.e = bVar;
                cVar.a();
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
                ad0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c3] = (this.E.a == bVar2 ? aVar6 : aVar2).f();
                ad0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                ad0Var.setText(LocaleController.getString(this.E.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z12 || z13 || z14) {
            int i14 = this.d;
            ph.d dVar = this.s;
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new b(this, 4), 50L);
    }
}
