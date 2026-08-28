package gh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t0 extends org.telegram.ui.ActionBar.f3 {
    public final gf.a A;
    public final gf.a B;
    public final gf.a C;
    public gf.a D;
    public long E;
    public int F;
    public boolean G;
    public final eq[] H;
    public final eq[] I;
    public boolean J;
    public final b b;
    public final boolean c;
    public final int d;
    public final v30 e;
    public final fc0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final r0 r;
    public final kh.d s;
    public final org.telegram.ui.Components.j6 v;
    public final ImageView w;
    public final ImageView x;
    public final gf.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(final Context context, int i9, long j10, MessageSuggestionParams messageSuggestionParams, qn qnVar, final org.telegram.ui.ActionBar.b6 b6Var, int i10, Utilities.Callback callback) {
        super(context, b6Var, true, false);
        boolean z10;
        final int i11 = 0;
        this.E = -1L;
        this.H = new eq[1];
        this.I = new eq[1];
        this.d = i10;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i9, j10);
        this.c = canManageMonoForum;
        boolean z11 = canManageMonoForum || v7.y(i9, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i9).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        gf.b bVar = gf.b.b;
        this.B = gf.a.i(j11, bVar);
        this.C = gf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        gf.b bVar2 = gf.b.a;
        this.y = gf.a.g(j12, bVar2);
        this.A = gf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (canManageMonoForum) {
            this.b = null;
        } else {
            b bVar3 = new b(context, i9, b6Var);
            this.b = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.container.addView(bVar3, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            g7.g6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) { // from class: gh.p0
                public final /* synthetic */ t0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            if (this.b.D.a == gf.b.a) {
                                new fa(context, b6Var).show();
                                break;
                            }
                            break;
                        default:
                            t0 t0Var = this.b;
                            org.telegram.ui.Components.y4.T(context, t0Var.E, new a1.c(t0Var, 29), b6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = ll.f(context, 0);
        linearLayout.addView(f10, g7.e6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i10 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, g7.e6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i13 = org.telegram.ui.ActionBar.f6.W5;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        g7.g6.a(imageView);
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 9));
        f10.addView(imageView, g7.e6.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            v30 v30Var = new v30(context, b6Var);
            this.e = v30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            v30Var.b(arrayList, new k0(this, 1));
            linearLayout.addView(v30Var, g7.e6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f11 = ll.f(context, 1);
        linearLayout.addView(f11, g7.e6.l(1.0f, -1, -2));
        fc0 fc0Var = new fc0(context, null);
        this.f = fc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        editTextBoldCursor.requestFocus();
        fc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        fc0Var.e(editTextBoldCursor);
        gf.a aVar = messageSuggestionParams.amount;
        fc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        fc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 2));
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        f11.addView(fc0Var, g7.e6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        fc0Var.addView(imageView2, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        fc0Var.addView(imageView3, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.v = j6Var;
        int i14 = org.telegram.ui.ActionBar.f6.y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        fc0Var.addView(j6Var, g7.e6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        r0 r0Var = new r0(context);
        this.r = r0Var;
        r0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        r0Var.setCursorWidth(1.5f);
        r0Var.setTextSize(1, 17.0f);
        r0Var.setMaxLines(1);
        r0Var.setBackground(null);
        r0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        r0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        r0Var.setFocusable(false);
        r0Var.setClickable(false);
        r0Var.setEnabled(false);
        fc0 fc0Var2 = new fc0(context, null);
        fc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        fc0Var2.e(r0Var);
        fc0Var2.addView(r0Var, g7.e6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        g7.g6.b(fc0Var2, 0.02f, 1.2f);
        final int i15 = 1;
        fc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: gh.p0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        if (this.b.D.a == gf.b.a) {
                            new fa(context, b6Var).show();
                            break;
                        }
                        break;
                    default:
                        t0 t0Var = this.b;
                        org.telegram.ui.Components.y4.T(context, t0Var.E, new a1.c(t0Var, 29), b6Var, 0).a.show();
                        break;
                }
            }
        });
        f11.addView(fc0Var2, g7.e6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), mode));
        fc0Var2.addView(imageView4, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i9).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f11.addView(textView3, g7.e6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, g7.e6.q(-1, -2, 80));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new q0(this, qnVar, i9, context, b6Var, j10, callback));
        if (i10 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, g7.e6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        gf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            q(gf.a.i(aVar2.b, aVar2.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            q(gf.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.E != j13) {
            this.E = j13;
            r0Var.setText(o(j13));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new s0(this));
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
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar;
        if (!this.G || (bVar = this.b) == null || f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
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
        kh.d dVar = this.s;
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
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        m();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.J = true;
        m();
    }

    public final gf.a p() {
        return this.D.a == gf.b.b ? this.C : this.A;
    }

    public final void q(gf.a aVar, boolean z10, boolean z11, boolean z12) {
        gf.a aVar2;
        char c10;
        gf.b bVar;
        gf.a aVar3 = this.D;
        int i9 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.D = aVar;
        } else {
            this.D = gf.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j10 = p().b;
        gf.a aVar4 = this.D;
        if (j10 < aVar4.b) {
            this.F |= 4;
        }
        boolean k10 = aVar4.k();
        gf.a aVar5 = this.y;
        gf.a aVar6 = this.B;
        gf.b bVar2 = gf.b.b;
        if (!k10) {
            gf.a aVar7 = this.D;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.D.a;
        boolean z14 = z11 || aVar3.b != this.D.b;
        boolean z15 = z11 || i9 != this.F;
        fc0 fc0Var = this.f;
        if (z15) {
            fc0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        gf.b bVar3 = gf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            v30 v30Var = this.e;
            if (v30Var != null) {
                v30Var.a(this.D.a == bVar3 ? 0 : 1, z12);
            }
            gf.b bVar4 = this.D.a;
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
            c10 = 0;
        }
        if (z13 || z15) {
            int i10 = this.F;
            if ((i10 & 4) != 0) {
                int i11 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = p().f();
                fc0Var.setText(LocaleController.formatString(i11, objArr));
            } else if ((i10 & 2) != 0) {
                int i12 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.D.a == bVar2 ? aVar6 : aVar2).f();
                fc0Var.setText(LocaleController.formatString(i12, objArr2));
            } else {
                fc0Var.setText(LocaleController.getString(this.D.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i13 = this.d;
            kh.d dVar = this.s;
            if (i13 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.D.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                gf.a aVar8 = this.D;
                boolean z16 = aVar8.a == bVar2;
                int i14 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = z16 ? aVar8.b() : LocaleController.formatNumber(aVar8.a(), ',');
                dVar.g(oa.V0(z16, LocaleController.formatString(i14, objArr3), z16 ? this.I : this.H), z12, true);
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
        AndroidUtilities.runOnUIThread(new fh.o1(this, 8), 50L);
    }
}
