package bi;

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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.rd0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k1 extends org.telegram.ui.ActionBar.k3 {
    public bg.a E;
    public int F;
    public final rd0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.s6 e;
    public final fi.d f;
    public final org.telegram.ui.Components.s6 h;
    public final org.telegram.ui.Cells.b9 n;
    public final ImageView r;
    public final ImageView s;
    public final bg.a v;
    public final bg.a w;
    public final bg.a x;
    public final bg.a y;

    public k1(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, bg.a aVar, ai.n1 n1Var) {
        super(1, context, u6Var, true);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        bg.b bVar = bg.b.b;
        this.x = bg.a.i(max, bVar);
        this.y = bg.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        bg.b bVar2 = bg.b.a;
        this.v = bg.a.g(j10, bVar2);
        this.w = bg.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout d = vh.d(context, 0);
        linearLayout.addView(d, gb1.x(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.e = s6Var;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, null);
        s6Var.setTextSize(AndroidUtilities.dp(20.0f));
        s6Var.setGravity(8388627);
        s6Var.setTypeface(AndroidUtilities.bold());
        d.addView(s6Var, gb1.t(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, gb1.p(1.0f, -1, -2));
        rd0 rd0Var = new rd0(context, null);
        this.b = rd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.requestFocus();
        rd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        rd0Var.e(editTextBoldCursor);
        rd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        rd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 4));
        rd0Var.addView(editTextBoldCursor, gb1.i(-1, -2, 48));
        linearLayout2.addView(rd0Var, gb1.o(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        rd0Var.addView(imageView, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        rd0Var.addView(imageView2, gb1.h(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.h = s6Var2;
        int i12 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, null);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(5);
        rd0Var.addView(s6Var2, gb1.h(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, gb1.x(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.n = b9Var;
        b9Var.c.setLayoutParams(gb1.h(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        b9Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        b9Var.setOnClickListener(new ai.s(this, 5));
        linearLayout2.addView(b9Var, gb1.x(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, gb1.u(-1, -2, 80));
        fi.d f7 = vh.f(24, context, u6Var, true);
        this.f = f7;
        f7.setOnClickListener(new q(2, this, n1Var));
        f7.i(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f7, gb1.o(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(bg.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(bg.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new j1(this));
    }

    public final bg.a m() {
        return this.E.a == bg.b.b ? this.y : this.w;
    }

    public final void n(bg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        bg.a aVar2;
        bg.a aVar3 = this.E;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = bg.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j11 = m().b;
        bg.a aVar4 = this.E;
        if (j11 < aVar4.b) {
            this.F |= 4;
        }
        boolean k10 = aVar4.k();
        bg.a aVar5 = this.v;
        bg.a aVar6 = this.x;
        bg.b bVar = bg.b.b;
        if (k10) {
            j10 = 0;
        } else {
            bg.a aVar7 = this.E;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.E.a;
        boolean z14 = z11 || aVar3.b != this.E.b;
        boolean z15 = z11 || i10 != this.F;
        rd0 rd0Var = this.b;
        if (z15) {
            rd0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        bg.b bVar2 = bg.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            bg.b bVar3 = this.E.a;
            org.telegram.ui.Components.s6 s6Var = this.e;
            if (bVar3 == bVar2) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
            }
            this.n.c.a(this.E.a == bVar, z12);
            ImageView imageView = this.s;
            ImageView imageView2 = this.r;
            if (z12) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.E.a == bVar2 ? 1.0f : 0.0f).scaleX(this.E.a == bVar2 ? 1.0f : 0.0f).scaleY(this.E.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.E.a == bVar ? 1.0f : 0.0f).scaleX(this.E.a == bVar ? 1.0f : 0.0f).scaleY(this.E.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.E.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.E.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
        }
        if (z13 || z15) {
            int i11 = this.F;
            if ((i11 & 4) != 0) {
                rd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, m().f()));
            } else if ((i11 & 2) != 0) {
                rd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooSmall, (this.E.a == bVar ? aVar6 : aVar2).f()));
            } else {
                rd0Var.setText(LocaleController.getString(this.E.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.F == 0 && this.E.b > j12;
            fi.d dVar = this.f;
            if (dVar.c0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    vh.p(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            bg.a aVar8 = this.E;
            bg.b bVar4 = aVar8.a;
            bg.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) bg.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                vh.o(R.string.ResellGiftInfoTON, new Object[]{bg.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * (this.E.a == bVar ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 21), 50L);
    }
}
