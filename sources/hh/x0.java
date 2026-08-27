package hh;

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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jc0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x0 extends org.telegram.ui.ActionBar.e3 {
    public hf.a A;
    public int B;
    public final jc0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 e;
    public final lh.d f;
    public final org.telegram.ui.Components.j6 h;
    public final org.telegram.ui.Cells.q8 n;
    public final ImageView r;
    public final ImageView s;
    public final hf.a v;
    public final hf.a w;
    public final hf.a x;
    public final hf.a y;

    public x0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, hf.a aVar, gh.d1 d1Var) {
        super(context, c6Var, true, false);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        hf.b bVar = hf.b.b;
        this.x = hf.a.i(max, bVar);
        this.y = hf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        hf.b bVar2 = hf.b.a;
        this.v = hf.a.g(j10, bVar2);
        this.w = hf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
        linearLayout.addView(g10, h7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.e = j6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setGravity(8388627);
        j6Var.setTypeface(AndroidUtilities.bold());
        g10.addView(j6Var, h7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, h7.z5.l(1.0f, -1, -2));
        jc0 jc0Var = new jc0(context, null);
        this.b = jc0Var;
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
        jc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        jc0Var.e(editTextBoldCursor);
        jc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        jc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 3));
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        linearLayout2.addView(jc0Var, h7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        jc0Var.addView(imageView, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        jc0Var.addView(imageView2, h7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.h = j6Var2;
        int i12 = org.telegram.ui.ActionBar.g6.y6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(5);
        jc0Var.addView(j6Var2, h7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, h7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.n = q8Var;
        q8Var.c.setLayoutParams(h7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        q8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        q8Var.setOnClickListener(new ag.w0(this, 12));
        linearLayout2.addView(q8Var, h7.z5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, h7.z5.q(-1, -2, 80));
        lh.d g11 = rl.g(24, context, c6Var, true);
        this.f = g11;
        g11.setOnClickListener(new ag.q0(15, this, d1Var));
        g11.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(g11, h7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(hf.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(hf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new w0(this));
    }

    public final hf.a m() {
        return this.A.a == hf.b.b ? this.y : this.w;
    }

    public final void n(hf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        hf.a aVar2;
        char c10;
        hf.a aVar3 = this.A;
        int i10 = this.B;
        this.B = 0;
        if (aVar != null) {
            this.A = aVar;
        } else {
            this.A = hf.a.i(0L, aVar3.a);
            this.B |= 1;
        }
        long j11 = m().b;
        hf.a aVar4 = this.A;
        if (j11 < aVar4.b) {
            this.B |= 4;
        }
        boolean k10 = aVar4.k();
        hf.a aVar5 = this.v;
        hf.a aVar6 = this.x;
        hf.b bVar = hf.b.b;
        if (k10) {
            j10 = 0;
        } else {
            hf.a aVar7 = this.A;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.B |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.A.a;
        boolean z14 = z11 || aVar3.b != this.A.b;
        boolean z15 = z11 || i10 != this.B;
        jc0 jc0Var = this.b;
        if (z15) {
            jc0Var.a((this.B & (-9)) == 0 ? 0.0f : 1.0f);
        }
        hf.b bVar2 = hf.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            c10 = 0;
            hf.b bVar3 = this.A.a;
            org.telegram.ui.Components.j6 j6Var = this.e;
            if (bVar3 == bVar2) {
                j6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                j6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
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
            c10 = 0;
        }
        if (z13 || z15) {
            int i11 = this.B;
            if ((i11 & 4) != 0) {
                int i12 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = m().f();
                jc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.A.a == bVar ? aVar6 : aVar2).f();
                jc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                jc0Var.setText(LocaleController.getString(this.A.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.B == 0 && this.A.b > j12;
            lh.d dVar = this.f;
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
            hf.a aVar8 = this.A;
            hf.b bVar4 = aVar8.a;
            hf.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) hf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                rl.n(R.string.ResellGiftInfoTON, new Object[]{hf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f2.r(this, 20), 50L);
    }
}
