package gh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x0 extends org.telegram.ui.ActionBar.f3 {
    public gf.a A;
    public int B;
    public final fc0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.j6 e;
    public final kh.d f;
    public final org.telegram.ui.Components.j6 h;
    public final org.telegram.ui.Cells.u8 n;
    public final ImageView r;
    public final ImageView s;
    public final gf.a v;
    public final gf.a w;
    public final gf.a x;
    public final gf.a y;

    public x0(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, gf.a aVar, fh.f1 f1Var) {
        super(context, b6Var, true, false);
        this.currentAccount = i9;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i9).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        gf.b bVar = gf.b.b;
        this.x = gf.a.i(max, bVar);
        this.y = gf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        gf.b bVar2 = gf.b.a;
        this.v = gf.a.g(j10, bVar2);
        this.w = gf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = ll.f(context, 0);
        linearLayout.addView(f10, g7.e6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.e = j6Var;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setGravity(8388627);
        j6Var.setTypeface(AndroidUtilities.bold());
        f10.addView(j6Var, g7.e6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, g7.e6.l(1.0f, -1, -2));
        fc0 fc0Var = new fc0(context, null);
        this.b = fc0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        editTextBoldCursor.requestFocus();
        fc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        fc0Var.e(editTextBoldCursor);
        fc0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        fc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new j(this, 3));
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        linearLayout2.addView(fc0Var, g7.e6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        fc0Var.addView(imageView, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        fc0Var.addView(imageView2, g7.e6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.h = j6Var2;
        int i11 = org.telegram.ui.ActionBar.f6.y6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(5);
        fc0Var.addView(j6Var2, g7.e6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, g7.e6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.u8 u8Var = new org.telegram.ui.Cells.u8(context);
        this.n = u8Var;
        u8Var.c.setLayoutParams(g7.e6.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        u8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        u8Var.setOnClickListener(new androidx.mediarouter.app.c(this, 10));
        linearLayout2.addView(u8Var, g7.e6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, g7.e6.q(-1, -2, 80));
        kh.d i12 = ll.i(24, context, b6Var, true);
        this.f = i12;
        i12.setOnClickListener(new bg.u1(14, this, f1Var));
        i12.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(i12, g7.e6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(gf.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(gf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new w0(this));
    }

    public final gf.a m() {
        return this.A.a == gf.b.b ? this.y : this.w;
    }

    public final void n(gf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        gf.a aVar2;
        char c10;
        gf.a aVar3 = this.A;
        int i9 = this.B;
        this.B = 0;
        if (aVar != null) {
            this.A = aVar;
        } else {
            this.A = gf.a.i(0L, aVar3.a);
            this.B |= 1;
        }
        long j11 = m().b;
        gf.a aVar4 = this.A;
        if (j11 < aVar4.b) {
            this.B |= 4;
        }
        boolean k10 = aVar4.k();
        gf.a aVar5 = this.v;
        gf.a aVar6 = this.x;
        gf.b bVar = gf.b.b;
        if (k10) {
            j10 = 0;
        } else {
            gf.a aVar7 = this.A;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.B |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.A.a;
        boolean z14 = z11 || aVar3.b != this.A.b;
        boolean z15 = z11 || i9 != this.B;
        fc0 fc0Var = this.b;
        if (z15) {
            fc0Var.a((this.B & (-9)) == 0 ? 0.0f : 1.0f);
        }
        gf.b bVar2 = gf.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            c10 = 0;
            gf.b bVar3 = this.A.a;
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
            int i10 = this.B;
            if ((i10 & 4) != 0) {
                int i11 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = m().f();
                fc0Var.setText(LocaleController.formatString(i11, objArr));
            } else if ((i10 & 2) != 0) {
                int i12 = R.string.ResellGiftPriceTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.A.a == bVar ? aVar6 : aVar2).f();
                fc0Var.setText(LocaleController.formatString(i12, objArr2));
            } else {
                fc0Var.setText(LocaleController.getString(this.A.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.B == 0 && this.A.b > j12;
            kh.d dVar = this.f;
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
            gf.a aVar8 = this.A;
            gf.b bVar4 = aVar8.a;
            gf.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) gf.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                ll.q(R.string.ResellGiftInfoTON, new Object[]{gf.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
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
        AndroidUtilities.runOnUIThread(new fh.o1(this, 9), 50L);
    }
}
