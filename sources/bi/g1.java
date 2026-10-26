package bi;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.zq;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g1 extends org.telegram.ui.ActionBar.k3 {
    public final bg.a E;
    public final bg.a F;
    public final bg.a G;
    public bg.a H;
    public long I;
    public int J;
    public boolean K;
    public final zq[] L;
    public final zq[] M;
    public boolean N;
    public final c b;
    public final boolean c;
    public final int d;
    public final w40 e;
    public final rd0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final e1 r;
    public final fi.d s;
    public final org.telegram.ui.Components.s6 v;
    public final ImageView w;
    public final ImageView x;
    public final bg.a y;

    public g1(final Context context, int i10, long j10, MessageSuggestionParams messageSuggestionParams, un unVar, final org.telegram.ui.ActionBar.u6 u6Var, int i11, Utilities.Callback callback) {
        super(1, context, u6Var, true);
        boolean z10;
        this.I = -1L;
        this.L = new zq[1];
        this.M = new zq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j10);
        this.c = canManageMonoForum;
        final int i12 = 0;
        boolean z11 = canManageMonoForum || ca.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        bg.b bVar = bg.b.b;
        this.F = bg.a.i(j11, bVar);
        this.G = bg.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j12 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        bg.b bVar2 = bg.b.a;
        this.y = bg.a.g(j12, bVar2);
        this.E = bg.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (canManageMonoForum) {
            this.b = null;
        } else {
            c cVar = new c(context, i10, u6Var);
            this.b = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.container.addView(cVar, gb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            gb1.b(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.c1
                public final /* synthetic */ g1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.H.a == bg.b.a) {
                                new uc(context, u6Var).show();
                                break;
                            }
                            break;
                        default:
                            g1 g1Var = this.b;
                            org.telegram.ui.Components.g5.S(context, g1Var.I, new a1.c(g1Var, 5), u6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout d = vh.d(context, 0);
        linearLayout.addView(d, gb1.x(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i13, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        d.addView(textView, gb1.t(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.y6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView, i14, u6Var, mode);
        gb1.b(imageView);
        imageView.setOnClickListener(new ai.s(this, 4));
        d.addView(imageView, gb1.t(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            w40 w40Var = new w40(context, u6Var);
            this.e = w40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            w40Var.b(arrayList, new x0(this, 1));
            linearLayout.addView(w40Var, gb1.o(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout d10 = vh.d(context, 1);
        linearLayout.addView(d10, gb1.p(1.0f, -1, -2));
        rd0 rd0Var = new rd0(context, null);
        this.f = rd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        rd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        rd0Var.e(editTextBoldCursor);
        bg.a aVar = messageSuggestionParams.amount;
        rd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        rd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 3));
        rd0Var.addView(editTextBoldCursor, gb1.i(-1, -2, 48));
        d10.addView(rd0Var, gb1.o(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        rd0Var.addView(imageView2, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        rd0Var.addView(imageView3, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.v = s6Var;
        int i15 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i15, null);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        rd0Var.addView(s6Var, gb1.h(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i15, null);
        textView2.setTextSize(1, 13.0f);
        d10.addView(textView2, gb1.x(-1, -2, 55, 33, 4, 33, 0));
        e1 e1Var = new e1(context);
        this.r = e1Var;
        e1Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e1Var.setCursorWidth(1.5f);
        e1Var.setTextSize(1, 17.0f);
        e1Var.setMaxLines(1);
        e1Var.setBackground(null);
        e1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(e1Var, i13, null);
        e1Var.setFocusable(false);
        e1Var.setClickable(false);
        e1Var.setEnabled(false);
        rd0 rd0Var2 = new rd0(context, null);
        rd0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        rd0Var2.e(e1Var);
        rd0Var2.addView(e1Var, gb1.h(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        gb1.c(rd0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        rd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.c1
            public final /* synthetic */ g1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.H.a == bg.b.a) {
                            new uc(context, u6Var).show();
                            break;
                        }
                        break;
                    default:
                        g1 g1Var = this.b;
                        org.telegram.ui.Components.g5.S(context, g1Var.I, new a1.c(g1Var, 5), u6Var, 0).a.show();
                        break;
                }
            }
        });
        d10.addView(rd0Var2, gb1.o(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.f7.t(imageView4, i14, u6Var, mode);
        rd0Var2.addView(imageView4, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView3, i15, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        d10.addView(textView3, gb1.x(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, gb1.u(-1, -2, 80));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new d1(this, unVar, i10, context, u6Var, j10, callback));
        if (i11 == 1) {
            dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, gb1.o(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        bg.a aVar2 = messageSuggestionParams.amount;
        if (aVar2 != null) {
            z10 = false;
            q(bg.a.i(aVar2.b, aVar2.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            q(bg.a.i(0L, bVar2), false, true, false);
        }
        long j13 = messageSuggestionParams.time;
        if (this.I != j13) {
            this.I = j13;
            e1Var.setText(o(j13));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new f1(this));
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

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar;
        if (!this.K || (cVar = this.b) == null || f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    public final void m() {
        boolean z10 = this.N;
        c cVar = this.b;
        boolean z11 = (z10 && !isDismissed() && cVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.e == null;
        if (this.K != z11) {
            this.K = z11;
            if (cVar != null) {
                cVar.setEnabled(z11);
                cVar.setClickable(z11);
                vh.p(cVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11 = this.J == 0 && (this.H.b >= 0 || this.I > 0);
        fi.d dVar = this.s;
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        m();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.N = true;
        m();
    }

    public final bg.a p() {
        return this.H.a == bg.b.b ? this.G : this.E;
    }

    public final void q(bg.a aVar, boolean z10, boolean z11, boolean z12) {
        bg.a aVar2;
        bg.b bVar;
        bg.a aVar3 = this.H;
        int i10 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = bg.a.i(0L, aVar3.a);
            this.J |= 1;
        }
        long j10 = p().b;
        bg.a aVar4 = this.H;
        if (j10 < aVar4.b) {
            this.J |= 4;
        }
        boolean k10 = aVar4.k();
        bg.a aVar5 = this.y;
        bg.a aVar6 = this.F;
        bg.b bVar2 = bg.b.b;
        if (!k10) {
            bg.a aVar7 = this.H;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.J |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.H.a;
        boolean z14 = z11 || aVar3.b != this.H.b;
        boolean z15 = z11 || i10 != this.J;
        rd0 rd0Var = this.f;
        if (z15) {
            rd0Var.a((this.J & (-9)) == 0 ? 0.0f : 1.0f);
        }
        bg.b bVar3 = bg.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            w40 w40Var = this.e;
            if (w40Var != null) {
                w40Var.a(this.H.a == bVar3 ? 0 : 1, z12);
            }
            bg.b bVar4 = this.H.a;
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
                rd0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooMuch, p().f()));
            } else if ((i11 & 2) != 0) {
                rd0Var.setText(LocaleController.formatString(R.string.SuggestAPostTooSmall, (this.H.a == bVar2 ? aVar6 : aVar2).f()));
            } else {
                rd0Var.setText(LocaleController.getString(this.H.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i12 = this.d;
            fi.d dVar = this.s;
            if (i12 != 0) {
                dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.H.k()) {
                dVar.i(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                bg.a aVar8 = this.H;
                boolean z16 = aVar8.a == bVar2;
                dVar.i(dd.o1(dd.U0(z16, LocaleController.formatString(R.string.PostSuggestionsOfferStars, z16 ? aVar8.b() : LocaleController.formatNumber(aVar8.a(), ',')), z16 ? this.M : this.L), z16), z12, true);
            }
            n(z12);
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

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 20), 50L);
    }
}
