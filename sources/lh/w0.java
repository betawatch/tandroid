package lh;

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
import org.telegram.ui.Components.bd0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class w0 extends org.telegram.ui.ActionBar.g3 {
    public lf.a B;
    public int C;
    public final bd0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.k6 e;
    public final ph.d f;
    public final org.telegram.ui.Components.k6 h;
    public final org.telegram.ui.Cells.s8 n;
    public final ImageView r;
    public final ImageView s;
    public final lf.a v;
    public final lf.a w;
    public final lf.a x;
    public final lf.a y;

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, lf.a aVar, kh.a1 a1Var) {
        super(context, f6Var, true, false);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        lf.b bVar = lf.b.b;
        this.x = lf.a.i(max, bVar);
        this.y = lf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        lf.b bVar2 = lf.b.a;
        this.v = lf.a.g(j10, bVar2);
        this.w = lf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        linearLayout.addView(f10, k7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.e = k6Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        k6Var.setTextSize(AndroidUtilities.dp(20.0f));
        k6Var.setGravity(8388627);
        k6Var.setTypeface(AndroidUtilities.bold());
        f10.addView(k6Var, k7.b6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, k7.b6.l(1.0f, -1, -2));
        bd0 bd0Var = new bd0(context, null);
        this.b = bd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        bd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        bd0Var.e(editTextBoldCursor);
        bd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        bd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new cg.z(this, 5));
        bd0Var.addView(editTextBoldCursor, k7.b6.e(-1, -2, 48));
        linearLayout2.addView(bd0Var, k7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        bd0Var.addView(imageView, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        bd0Var.addView(imageView2, k7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.h = k6Var2;
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setGravity(5);
        bd0Var.addView(k6Var2, k7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, k7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.n = s8Var;
        s8Var.c.setLayoutParams(k7.b6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        s8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        s8Var.setOnClickListener(new androidx.mediarouter.app.c(this, 16));
        linearLayout2.addView(s8Var, k7.b6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, k7.b6.q(-1, -2, 80));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.f = p10;
        p10.setOnClickListener(new cg.n(18, this, a1Var));
        p10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(p10, k7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(lf.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(lf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new v0(this));
    }

    public final lf.a m() {
        return this.B.a == lf.b.b ? this.y : this.w;
    }

    public final void n(lf.a aVar, boolean z4, boolean z10, boolean z11) {
        long j10;
        lf.a aVar2;
        char c3;
        lf.a aVar3 = this.B;
        int i10 = this.C;
        this.C = 0;
        if (aVar != null) {
            this.B = aVar;
        } else {
            this.B = lf.a.i(0L, aVar3.a);
            this.C |= 1;
        }
        long j11 = m().b;
        lf.a aVar4 = this.B;
        if (j11 < aVar4.b) {
            this.C |= 4;
        }
        boolean k10 = aVar4.k();
        lf.a aVar5 = this.v;
        lf.a aVar6 = this.x;
        lf.b bVar = lf.b.b;
        if (k10) {
            j10 = 0;
        } else {
            lf.a aVar7 = this.B;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.C |= 2;
            }
        }
        boolean z12 = z10 || aVar3.a != this.B.a;
        boolean z13 = z10 || aVar3.b != this.B.b;
        boolean z14 = z10 || i10 != this.C;
        bd0 bd0Var = this.b;
        if (z14) {
            bd0Var.a((this.C & (-9)) == 0 ? 0.0f : 1.0f);
        }
        lf.b bVar2 = lf.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z12) {
            c3 = 0;
            lf.b bVar3 = this.B.a;
            org.telegram.ui.Components.k6 k6Var = this.e;
            if (bVar3 == bVar2) {
                k6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z11, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                k6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z11, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            this.n.c.a(this.B.a == bVar, z11);
            ImageView imageView = this.s;
            ImageView imageView2 = this.r;
            if (z11) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.B.a == bVar2 ? 1.0f : 0.0f).scaleX(this.B.a == bVar2 ? 1.0f : 0.0f).scaleY(this.B.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.B.a == bVar ? 1.0f : 0.0f).scaleX(this.B.a == bVar ? 1.0f : 0.0f).scaleY(this.B.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.B.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.B.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
            c3 = 0;
        }
        if (z12 || z14) {
            int i11 = this.C;
            if ((i11 & 4) != 0) {
                int i12 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c3] = m().f();
                bd0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c3] = (this.B.a == bVar ? aVar6 : aVar2).f();
                bd0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                bd0Var.setText(LocaleController.getString(this.B.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z12 || z13 || z14) {
            boolean z15 = this.C == 0 && this.B.b > j12;
            ph.d dVar = this.f;
            if (dVar.T != z15) {
                dVar.setEnabled(z15);
                dVar.setClickable(z15);
                if (z11) {
                    dVar.animate().alpha(z15 ? 1.0f : 0.6f).setDuration(180L).start();
                } else {
                    dVar.setAlpha(z15 ? 1.0f : 0.6f);
                }
            }
        }
        if (z12 || z13) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            lf.a aVar8 = this.B;
            lf.b bVar4 = aVar8.a;
            lf.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) lf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.ui.b.o(R.string.ResellGiftInfoTON, new Object[]{lf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (this.B.c() * (this.B.a == bVar ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.h.c(sb, z11, true);
        }
        if (z4 && z13) {
            String b10 = this.B.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new b(this, 5), 50L);
    }
}
