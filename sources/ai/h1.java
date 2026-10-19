package ai;

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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.yq;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h1 extends org.telegram.ui.ActionBar.f3 {
    public final ag.a E;
    public final ag.a F;
    public final ag.a G;
    public ag.a H;
    public long I;
    public int J;
    public boolean K;
    public final yq[] L;
    public final yq[] M;
    public boolean N;
    public final c b;
    public final boolean c;
    public final int d;
    public final u40 e;
    public final sd0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final f1 r;
    public final ei.d s;
    public final org.telegram.ui.Components.q6 v;
    public final ImageView w;
    public final ImageView x;
    public final ag.a y;

    public h1(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, qn qnVar, final org.telegram.ui.ActionBar.d6 d6Var, int i11, Utilities.Callback callback) {
        super(1, context, d6Var, true);
        boolean z10;
        this.I = -1L;
        this.L = new yq[1];
        this.M = new yq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.c = canManageMonoForum;
        final int i12 = 0;
        boolean z11 = canManageMonoForum || ga.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        ag.b bVar = ag.b.b;
        this.F = ag.a.i(j11, bVar);
        this.G = ag.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        ag.b bVar2 = ag.b.a;
        this.y = ag.a.g(j12, bVar2);
        this.E = ag.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (canManageMonoForum) {
            this.b = null;
        } else {
            c cVar = new c(context, i10, d6Var);
            this.b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, w7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.b6.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) { // from class: ai.d1
                public final /* synthetic */ h1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.H.a == ag.b.a) {
                                new dd(context, d6Var).show();
                                break;
                            }
                            break;
                        default:
                            h1 h1Var = this.b;
                            org.telegram.ui.Components.f5.S(context, h1Var.I, new a1.c(h1Var, 3), d6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = kk.e(context, 0);
        linearLayout.addView(e, w7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e.addView(textView, w7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.h6.W5;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new ah.g0(this, 2));
        e.addView(imageView, w7.z5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            u40 u40Var = new u40(context, d6Var);
            this.e = u40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            u40Var.b(arrayList, new w0(this, 1));
            linearLayout.addView(u40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout e7 = kk.e(context, 1);
        linearLayout.addView(e7, w7.z5.l(1.0f, -1, -2));
        sd0 sd0Var = new sd0(context, null);
        this.f = sd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        sd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        sd0Var.e(editTextBoldCursor);
        ag.a aVar = messageSuggestionParams.amount;
        sd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        sd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 3));
        sd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e7.addView(sd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        sd0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        sd0Var.addView(imageView3, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.v = q6Var;
        int i15 = org.telegram.ui.ActionBar.h6.y6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setGravity(5);
        sd0Var.addView(q6Var, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        f1 f1Var = new f1(context);
        this.r = f1Var;
        f1Var.setCursorSize(AndroidUtilities.dp(20.0f));
        f1Var.setCursorWidth(1.5f);
        f1Var.setTextSize(1, 17.0f);
        f1Var.setMaxLines(1);
        f1Var.setBackground(null);
        f1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        f1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        f1Var.setFocusable(false);
        f1Var.setClickable(false);
        f1Var.setEnabled(false);
        sd0 sd0Var2 = new sd0(context, null);
        sd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        sd0Var2.e(f1Var);
        sd0Var2.addView(f1Var, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.b6.b(sd0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        sd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.d1
            public final /* synthetic */ h1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.H.a == ag.b.a) {
                            new dd(context, d6Var).show();
                            break;
                        }
                        break;
                    default:
                        h1 h1Var = this.b;
                        org.telegram.ui.Components.f5.S(context, h1Var.I, new a1.c(h1Var, 3), d6Var, 0).a.show();
                        break;
                }
            }
        });
        e7.addView(sd0Var2, w7.z5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), mode));
        sd0Var2.addView(imageView4, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        e7.addView(textView3, w7.z5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.z5.q(-1, -2, 80));
        ei.d dVar = new ei.d(context, d6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new e1(this, qnVar, i10, context, d6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        ag.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            s(ag.a.i(aVar2.b, aVar2.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            s(ag.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.I != j13) {
            this.I = j13;
            f1Var.setText(p(j13));
        }
        o(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new g1(this));
    }

    public static String p(long j10) {
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
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (!this.K || (cVar = this.b) == null || f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    public final void n() {
        boolean z10 = this.N;
        c cVar = this.b;
        boolean z11 = (z10 && !isDismissed() && cVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.e == null;
        if (this.K != z11) {
            this.K = z11;
            if (cVar != null) {
                cVar.setEnabled(z11);
                cVar.setClickable(z11);
                kk.s(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void o(boolean z10) {
        boolean z11 = this.J == 0 && (this.H.b >= 0 || this.I > 0);
        ei.d dVar = this.s;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                kk.s(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        n();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.N = true;
        n();
    }

    public final ag.a q() {
        return this.H.a == ag.b.b ? this.G : this.E;
    }

    public final void s(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        ag.a aVar2;
        ag.b bVar;
        ag.a aVar3 = this.H;
        int i10 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = ag.a.i(0L, aVar3.a);
            this.J |= 1;
        }
        long j10 = q().b;
        ag.a aVar4 = this.H;
        if (j10 < aVar4.b) {
            this.J |= 4;
        }
        boolean k10 = aVar4.k();
        ag.a aVar5 = this.y;
        ag.a aVar6 = this.F;
        ag.b bVar2 = ag.b.b;
        if (!k10) {
            ag.a aVar7 = this.H;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.J |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.H.a;
        boolean z14 = z11 || aVar3.b != this.H.b;
        boolean z15 = z11 || i10 != this.J;
        sd0 sd0Var = this.f;
        if (z15) {
            sd0Var.a((this.J & (-9)) == 0 ? 0.0f : 1.0f);
        }
        ag.b bVar3 = ag.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            u40 u40Var = this.e;
            if (u40Var != null) {
                u40Var.a(this.H.a == bVar3 ? 0 : 1, z12);
            }
            ag.b bVar4 = this.H.a;
            TextView textView = this.n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(q().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(q().a()).length() + 3)});
            }
            ImageView imageView = this.x;
            ImageView imageView2 = this.w;
            if (z12) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.H.a == bVar3 ? 1.0f : 0.0f).scaleX(this.H.a == bVar3 ? 1.0f : 0.0f).scaleY(this.H.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.H.a == bVar2 ? 1.0f : 0.0f).scaleX(this.H.a == bVar2 ? 1.0f : 0.0f).scaleY(this.H.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.H.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.H.a == bVar2 ? 1.0f : 0.0f);
            }
            c cVar = this.b;
            if (cVar != null && cVar.e != (bVar = this.H.a)) {
                cVar.e = bVar;
                cVar.a();
            }
        } else {
            aVar2 = aVar5;
        }
        if (z13 || z15) {
            int i11 = this.J;
            if ((i11 & 4) != 0) {
                sd0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooMuch, q().f()));
            } else if ((i11 & 2) != 0) {
                sd0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooSmall, (this.H.a == bVar2 ? aVar6 : aVar2).f()));
            } else {
                sd0Var.setText(LocaleController.getString(this.H.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i12 = this.d;
            ei.d dVar = this.s;
            if (i12 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.H.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                ag.a aVar8 = this.H;
                boolean z16 = aVar8.a == bVar2;
                dVar.g(md.n1(md.W0(z16, LocaleController.formatString(R.string.PostSuggestionsOfferStars, z16 ? aVar8.b() : LocaleController.formatNumber(aVar8.a(), ',')), z16 ? this.M : this.L), z16), z12, true);
            }
            o(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.H.c() * (this.H.a == bVar2 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.H.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 10), 50L);
    }
}
