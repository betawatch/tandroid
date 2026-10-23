package ai;

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
import org.telegram.messenger.sl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vd0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class l1 extends org.telegram.ui.ActionBar.h3 {
    public ag.a E;
    public int F;
    public final vd0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.q6 e;
    public final ei.d f;
    public final org.telegram.ui.Components.q6 h;
    public final org.telegram.ui.Cells.x8 n;
    public final ImageView r;
    public final ImageView s;
    public final ag.a v;
    public final ag.a w;
    public final ag.a x;
    public final ag.a y;

    public l1(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, ag.a aVar, o2 o2Var) {
        super(1, context, g6Var, true);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        ag.b bVar = ag.b.b;
        this.x = ag.a.i(max, bVar);
        this.y = ag.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        ag.b bVar2 = ag.b.a;
        this.v = ag.a.g(j10, bVar2);
        this.w = ag.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = sl.e(context, 0);
        linearLayout.addView(e, w7.z5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.e = q6Var;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.a0(q6Var, i11, null);
        q6Var.setTextSize(AndroidUtilities.dp(20.0f));
        q6Var.setGravity(8388627);
        q6Var.setTypeface(AndroidUtilities.bold());
        e.addView(q6Var, w7.z5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.z5.l(1.0f, -1, -2));
        vd0 vd0Var = new vd0(context, null);
        this.b = vd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i11, null);
        editTextBoldCursor.requestFocus();
        vd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        vd0Var.e(editTextBoldCursor);
        vd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        vd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 4));
        vd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        linearLayout2.addView(vd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        vd0Var.addView(imageView, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        vd0Var.addView(imageView2, w7.z5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
        this.h = q6Var2;
        int i12 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i12, null);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setGravity(5);
        vd0Var.addView(q6Var2, w7.z5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.n = x8Var;
        x8Var.c.setLayoutParams(w7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        x8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        x8Var.setOnClickListener(new ah.g0(this, 3));
        linearLayout2.addView(x8Var, w7.z5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.z5.q(-1, -2, 80));
        ei.d g10 = sl.g(24, context, g6Var, true);
        this.f = g10;
        g10.setOnClickListener(new p(2, this, o2Var));
        g10.i(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(g10, w7.z5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(ag.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(ag.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new k1(this));
    }

    public final ag.a m() {
        return this.E.a == ag.b.b ? this.y : this.w;
    }

    public final void n(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        ag.a aVar2;
        ag.a aVar3 = this.E;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = ag.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j11 = m().b;
        ag.a aVar4 = this.E;
        if (j11 < aVar4.b) {
            this.F |= 4;
        }
        boolean k10 = aVar4.k();
        ag.a aVar5 = this.v;
        ag.a aVar6 = this.x;
        ag.b bVar = ag.b.b;
        if (k10) {
            j10 = 0;
        } else {
            ag.a aVar7 = this.E;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.E.a;
        boolean z14 = z11 || aVar3.b != this.E.b;
        boolean z15 = z11 || i10 != this.F;
        vd0 vd0Var = this.b;
        if (z15) {
            vd0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        ag.b bVar2 = ag.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            ag.b bVar3 = this.E.a;
            org.telegram.ui.Components.q6 q6Var = this.e;
            if (bVar3 == bVar2) {
                q6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                q6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
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
                vd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, m().f()));
            } else if ((i11 & 2) != 0) {
                vd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooSmall, (this.E.a == bVar ? aVar6 : aVar2).f()));
            } else {
                vd0Var.setText(LocaleController.getString(this.E.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.F == 0 && this.E.b > j12;
            ei.d dVar = this.f;
            if (dVar.c0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    sl.s(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            ag.a aVar8 = this.E;
            ag.b bVar4 = aVar8.a;
            ag.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) ag.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                sl.r(R.string.ResellGiftInfoTON, new Object[]{ag.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
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

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new a3.d(this, 11), 50L);
    }
}
