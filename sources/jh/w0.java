package jh;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.uc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w0 extends org.telegram.ui.ActionBar.f3 {
    public kf.a A;
    public int B;
    public final uc0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.o6 e;
    public final nh.d f;
    public final org.telegram.ui.Components.o6 h;
    public final org.telegram.ui.Cells.r8 n;
    public final ImageView r;
    public final ImageView s;
    public final kf.a v;
    public final kf.a w;
    public final kf.a x;
    public final kf.a y;

    public w0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, kf.a aVar, ih.b1 b1Var) {
        super(context, c6Var, true, false);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        kf.b bVar = kf.b.b;
        this.x = kf.a.i(max, bVar);
        this.y = kf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        kf.b bVar2 = kf.b.a;
        this.v = kf.a.g(j10, bVar2);
        this.w = kf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        linearLayout.addView(g10, i7.f6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.e = o6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        o6Var.setTextSize(AndroidUtilities.dp(20.0f));
        o6Var.setGravity(8388627);
        o6Var.setTypeface(AndroidUtilities.bold());
        g10.addView(o6Var, i7.f6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, i7.f6.l(1.0f, -1, -2));
        uc0 uc0Var = new uc0(context, null);
        this.b = uc0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        uc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        uc0Var.e(editTextBoldCursor);
        uc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        uc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ag.a0(this, 5));
        uc0Var.addView(editTextBoldCursor, i7.f6.e(-1, -2, 48));
        linearLayout2.addView(uc0Var, i7.f6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        uc0Var.addView(imageView, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        uc0Var.addView(imageView2, i7.f6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.h = o6Var2;
        int i12 = org.telegram.ui.ActionBar.g6.y6;
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setGravity(5);
        uc0Var.addView(o6Var2, i7.f6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, i7.f6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.n = r8Var;
        r8Var.c.setLayoutParams(i7.f6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        r8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        r8Var.setOnClickListener(new ag.o(this, 16));
        linearLayout2.addView(r8Var, i7.f6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, i7.f6.q(-1, -2, 80));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f = o10;
        o10.setOnClickListener(new ag.n(18, this, b1Var));
        o10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(o10, i7.f6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(kf.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(kf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new v0(this));
    }

    public final kf.a m() {
        return this.A.a == kf.b.b ? this.y : this.w;
    }

    public final void n(kf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        kf.a aVar2;
        char c3;
        kf.a aVar3 = this.A;
        int i10 = this.B;
        this.B = 0;
        if (aVar != null) {
            this.A = aVar;
        } else {
            this.A = kf.a.i(0L, aVar3.a);
            this.B |= 1;
        }
        long j11 = m().b;
        kf.a aVar4 = this.A;
        if (j11 < aVar4.b) {
            this.B |= 4;
        }
        boolean k9 = aVar4.k();
        kf.a aVar5 = this.v;
        kf.a aVar6 = this.x;
        kf.b bVar = kf.b.b;
        if (k9) {
            j10 = 0;
        } else {
            kf.a aVar7 = this.A;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.B |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.A.a;
        boolean z14 = z11 || aVar3.b != this.A.b;
        boolean z15 = z11 || i10 != this.B;
        uc0 uc0Var = this.b;
        if (z15) {
            uc0Var.a((this.B & (-9)) == 0 ? 0.0f : 1.0f);
        }
        kf.b bVar2 = kf.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            c3 = 0;
            kf.b bVar3 = this.A.a;
            org.telegram.ui.Components.o6 o6Var = this.e;
            if (bVar3 == bVar2) {
                o6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                o6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            this.n.c.a(this.A.a == bVar, z12);
            ImageView imageView = this.s;
            ImageView imageView2 = this.r;
            if (z12) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.A.a == bVar2 ? 1.0f : 0.0f).scaleX(this.A.a == bVar2 ? 1.0f : 0.0f).scaleY(this.A.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.A.a == bVar ? 1.0f : 0.0f).scaleX(this.A.a == bVar ? 1.0f : 0.0f).scaleY(this.A.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.A.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.A.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
            c3 = 0;
        }
        if (z13 || z15) {
            int i11 = this.B;
            if ((i11 & 4) != 0) {
                int i12 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = m().f();
                uc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c3] = (this.A.a == bVar ? aVar6 : aVar2).f();
                uc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                uc0Var.setText(LocaleController.getString(this.A.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.B == 0 && this.A.b > j12;
            nh.d dVar = this.f;
            if (dVar.S != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    dVar.animate().alpha(z16 ? 1.0f : 0.6f).setDuration(180L).start();
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            kf.a aVar8 = this.A;
            kf.b bVar4 = aVar8.a;
            kf.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) kf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.ui.b.p(R.string.ResellGiftInfoTON, new Object[]{kf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.A.c() * (this.A.a == bVar ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.A.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new o(this, 4), 50L);
    }
}
