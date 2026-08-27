package hh;

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
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 extends org.telegram.ui.ActionBar.e3 {
    public final hf.a A;
    public final hf.a B;
    public final hf.a C;
    public hf.a D;
    public long E;
    public int F;
    public boolean G;
    public final cq[] H;
    public final cq[] I;
    public boolean J;
    public final b b;
    public final boolean c;
    public final int d;
    public final a40 e;
    public final jc0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final r0 r;
    public final lh.d s;
    public final org.telegram.ui.Components.j6 v;
    public final ImageView w;
    public final ImageView x;
    public final hf.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, rn rnVar, final org.telegram.ui.ActionBar.c6 c6Var, int i11, Utilities.Callback callback) {
        super(context, c6Var, true, false);
        boolean z10;
        final int i12 = 0;
        this.E = -1L;
        this.H = new cq[1];
        this.I = new cq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.c = canManageMonoForum;
        boolean z11 = canManageMonoForum || u7.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        hf.b bVar = hf.b.b;
        this.B = hf.a.i(j11, bVar);
        this.C = hf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        hf.b bVar2 = hf.b.a;
        this.y = hf.a.g(j12, bVar2);
        this.A = hf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
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
            this.container.addView(bVar3, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            h7.b6.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) { // from class: hh.p0
                public final /* synthetic */ t0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.D.a == hf.b.a) {
                                new fa(context, c6Var).show();
                                break;
                            }
                            break;
                        default:
                            t0 t0Var = this.b;
                            org.telegram.ui.Components.y4.T(context, t0Var.E, new h3.x(t0Var, 5), c6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
        linearLayout.addView(g10, h7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g10.addView(textView, h7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.g6.W5;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        h7.b6.a(imageView);
        imageView.setOnClickListener(new ag.w0(this, 11));
        g10.addView(imageView, h7.z5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            a40 a40Var = new a40(context, c6Var);
            this.e = a40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            a40Var.b(arrayList, new k0(this, 1));
            linearLayout.addView(a40Var, h7.z5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout g11 = org.telegram.messenger.y1.g(context, 1);
        linearLayout.addView(g11, h7.z5.l(1.0f, -1, -2));
        jc0 jc0Var = new jc0(context, null);
        this.f = jc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        jc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        jc0Var.e(editTextBoldCursor);
        hf.a aVar = messageSuggestionParams.amount;
        jc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        jc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 2));
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        g11.addView(jc0Var, h7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        jc0Var.addView(imageView2, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        jc0Var.addView(imageView3, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.v = j6Var;
        int i15 = org.telegram.ui.ActionBar.g6.y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setGravity(5);
        jc0Var.addView(j6Var, h7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        g11.addView(textView2, h7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        r0 r0Var = new r0(context);
        this.r = r0Var;
        r0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        r0Var.setCursorWidth(1.5f);
        r0Var.setTextSize(1, 17.0f);
        r0Var.setMaxLines(1);
        r0Var.setBackground(null);
        r0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        r0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        r0Var.setFocusable(false);
        r0Var.setClickable(false);
        r0Var.setEnabled(false);
        jc0 jc0Var2 = new jc0(context, null);
        jc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        jc0Var2.e(r0Var);
        jc0Var2.addView(r0Var, h7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        h7.b6.b(jc0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        jc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: hh.p0
            public final /* synthetic */ t0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.D.a == hf.b.a) {
                            new fa(context, c6Var).show();
                            break;
                        }
                        break;
                    default:
                        t0 t0Var = this.b;
                        org.telegram.ui.Components.y4.T(context, t0Var.E, new h3.x(t0Var, 5), c6Var, 0).a.show();
                        break;
                }
            }
        });
        g11.addView(jc0Var2, h7.z5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        jc0Var2.addView(imageView4, h7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        g11.addView(textView3, h7.z5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, h7.z5.q(-1, -2, 80));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new q0(this, rnVar, i10, context, c6Var, j10, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, h7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        hf.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            r(hf.a.i(aVar2.b, aVar2.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            r(hf.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.E != j13) {
            this.E = j13;
            r0Var.setText(p(j13));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new s0(this));
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

    @Override // org.telegram.ui.ActionBar.e3
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
        lh.d dVar = this.s;
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

    @Override // org.telegram.ui.ActionBar.e3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        m();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.J = true;
        m();
    }

    public final hf.a q() {
        return this.D.a == hf.b.b ? this.C : this.A;
    }

    public final void r(hf.a aVar, boolean z10, boolean z11, boolean z12) {
        hf.a aVar2;
        char c10;
        hf.b bVar;
        hf.a aVar3 = this.D;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.D = aVar;
        } else {
            this.D = hf.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j10 = q().b;
        hf.a aVar4 = this.D;
        if (j10 < aVar4.b) {
            this.F |= 4;
        }
        boolean k10 = aVar4.k();
        hf.a aVar5 = this.y;
        hf.a aVar6 = this.B;
        hf.b bVar2 = hf.b.b;
        if (!k10) {
            hf.a aVar7 = this.D;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.D.a;
        boolean z14 = z11 || aVar3.b != this.D.b;
        boolean z15 = z11 || i10 != this.F;
        jc0 jc0Var = this.f;
        if (z15) {
            jc0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        hf.b bVar3 = hf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            a40 a40Var = this.e;
            if (a40Var != null) {
                a40Var.a(this.D.a == bVar3 ? 0 : 1, z12);
            }
            hf.b bVar4 = this.D.a;
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
            int i11 = this.F;
            if ((i11 & 4) != 0) {
                int i12 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = q().f();
                jc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.D.a == bVar2 ? aVar6 : aVar2).f();
                jc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                jc0Var.setText(LocaleController.getString(this.D.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.d;
            lh.d dVar = this.s;
            if (i14 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.D.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                hf.a aVar8 = this.D;
                boolean z16 = aVar8.a == bVar2;
                int i15 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = z16 ? aVar8.b() : LocaleController.formatNumber(aVar8.a(), ',');
                dVar.g(oa.V0(z16, LocaleController.formatString(i15, objArr3), z16 ? this.I : this.H), z12, true);
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f2.r(this, 19), 50L);
    }
}
