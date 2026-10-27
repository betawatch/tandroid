package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p81 extends org.telegram.ui.Components.bb {
    public static final /* synthetic */ int d0 = 0;
    public final bi.c X;
    public final LinearLayout Y;
    public final LinearLayout Z;
    public boolean a0;
    public boolean b0;
    public org.telegram.ui.Components.k71 c0;

    public p81(final Context context, final int i10, final org.telegram.ui.ActionBar.u6 u6Var, final li.s2 s2Var) {
        super(1, context, u6Var, true);
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        bi.c cVar = new bi.c(context, i10, bg.b.b, u6Var);
        this.X = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.container.addView(cVar, 0, org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.kb1.b(cVar);
        cVar.setOnClickListener(new bi.gd(context, 1, u6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i10).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
            LinearLayout linearLayout = new LinearLayout(context);
            this.Y = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.dice6);
            linearLayout.addView(imageView, org.telegram.ui.Components.kb1.x(80, 80, 1, 0, 0, 0, 8));
            int i11 = org.telegram.ui.ActionBar.y6.j5;
            TextView L = org.telegram.ui.Components.kb1.L(context, 20.0f, i11, true, null);
            L.setGravity(17);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
            spannableStringBuilder.setSpan(new n81(u6Var), length, spannableStringBuilder.length(), 33);
            L.setText(spannableStringBuilder);
            linearLayout.addView(L, org.telegram.ui.Components.kb1.o(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
            TextView L2 = org.telegram.ui.Components.kb1.L(context, 14.0f, i11, false, null);
            L2.setGravity(17);
            L2.setText(LocaleController.getString(R.string.StakeDiceText));
            linearLayout.addView(L2, org.telegram.ui.Components.kb1.o(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView L3 = org.telegram.ui.Components.kb1.L(context, 14.0f, org.telegram.ui.ActionBar.y6.L6, true, null);
            L3.setText(LocaleController.getString(R.string.StakeDiceReturns));
            linearLayout2.addView(L3, org.telegram.ui.Components.kb1.o(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
            org.telegram.ui.Components.x01 x01Var = new org.telegram.ui.Components.x01(context, u6Var);
            linearLayout2.addView(x01Var, org.telegram.ui.Components.kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            TableRow tableRow = new TableRow(context);
            x01Var.addView(tableRow);
            TableRow tableRow2 = new TableRow(context);
            x01Var.addView(tableRow2);
            int i12 = R.drawable.dice1;
            int i13 = R.drawable.dice2;
            int i14 = R.drawable.dice3;
            int i15 = R.drawable.dice4;
            int i16 = R.drawable.dice5;
            int i17 = R.drawable.dice6;
            a1.d dVar = new a1.d(context, new int[]{i12, i13, i14, i15, i16, i17, i17}, u6Var, x01Var, 20);
            float f7 = 1.0f;
            if (tL_emojiGameDiceInfo.params.size() == 7) {
                tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
            }
            TextView L4 = org.telegram.ui.Components.kb1.L(context, 14.0f, org.telegram.ui.ActionBar.y6.y6, false, null);
            L4.setGravity(17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.dice6, 0);
            zqVar.recolorDrawable = false;
            zqVar.setScale(0.8f, 0.8f);
            spannableStringBuilder2.setSpan(zqVar, 0, spannableStringBuilder2.length(), 33);
            L4.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
            linearLayout2.addView(L4, org.telegram.ui.Components.kb1.o(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
            linearLayout.addView(linearLayout2, org.telegram.ui.Components.kb1.o(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.Z = linearLayout3;
            linearLayout3.setOrientation(1);
            linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
            linearLayout3.setClipToPadding(false);
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            final org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, u6Var);
            sd0Var.setForceForceUseCenter(true);
            sd0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
            sd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, org.telegram.ui.ActionBar.y6.G6, u6Var);
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setMaxLines(1);
            int dp = AndroidUtilities.dp(16.0f);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
            editTextBoldCursor.setInputType(8194);
            editTextBoldCursor.setTypeface(Typeface.DEFAULT);
            editTextBoldCursor.setSelectAllOnFocus(true);
            org.telegram.ui.ActionBar.f7.D(editTextBoldCursor, org.telegram.ui.ActionBar.y6.uf, u6Var);
            org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.y6.vf, u6Var);
            editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
            editTextBoldCursor.setOnFocusChangeListener(new bi.gb(sd0Var, editTextBoldCursor, 2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(R.drawable.diamond);
            linearLayout4.addView(imageView2, org.telegram.ui.Components.kb1.t(-2, -2, 0.0f, 19, 14, 0, 0, 0));
            linearLayout4.addView(editTextBoldCursor, org.telegram.ui.Components.kb1.s(-1, -2, 1.0f, 119));
            sd0Var.e(editTextBoldCursor);
            sd0Var.addView(linearLayout4, org.telegram.ui.Components.kb1.i(-1, -2, 48));
            linearLayout3.addView(sd0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, null);
            sd0Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
            long j10 = tL_emojiGameDiceInfo.prev_stake;
            j10 = j10 <= 0 ? 1000000000L : j10;
            editTextBoldCursor.setText(bi.dd.L0(j10));
            textView.setAlpha(1.0f);
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d), "USD", 2));
            final int[] iArr = {2};
            sd0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
            editTextBoldCursor.addTextChangedListener(new o81(i10, editTextBoldCursor, sd0Var, iArr, textView));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: org.telegram.ui.l81
                @Override // org.telegram.messenger.Utilities.CallbackReturn
                public final Object run(Object obj) {
                    Long l4 = (Long) obj;
                    TextView textView2 = new TextView(context);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    int i18 = org.telegram.ui.ActionBar.y6.Oh;
                    org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                    org.telegram.ui.ActionBar.f7.V(textView2, i18, u6Var2);
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.w0(i18, u6Var2)));
                    org.telegram.ui.ActionBar.b7 L5 = org.telegram.ui.ActionBar.f7.L(0.15f, i18);
                    textView2.setBackground(c02);
                    org.telegram.ui.ActionBar.f7.k(textView2, c02, L5, null, u6Var2);
                    textView2.setText(bi.dd.N0(bi.dd.L0(l4.longValue()) + " 💎", 0.75f));
                    org.telegram.ui.Components.kb1.b(textView2);
                    textView2.setOnClickListener(new zd0(16, editTextBoldCursor, l4));
                    return textView2;
                }
            };
            long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
            int i18 = 0;
            while (i18 < Utilities.divCeil(jArr.length, 3)) {
                LinearLayout d = org.telegram.messenger.wh.d(context, 0);
                int i19 = 0;
                while (true) {
                    int i20 = i18 * 3;
                    if (i19 < Math.min(3, jArr.length - i20)) {
                        View view = (View) callbackReturn.run(Long.valueOf(jArr[i20 + i19]));
                        float f10 = f7;
                        d.addView(view, org.telegram.ui.Components.kb1.t(0, 26, 1.0f, 112, 0, 0, i19 == 2 ? 0 : 6, 0));
                        i19++;
                        f7 = f10;
                    }
                }
                this.Z.addView(d, org.telegram.ui.Components.kb1.o(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                i18++;
                f7 = f7;
            }
            float f11 = f7;
            fi.d dVar2 = new fi.d(context, u6Var, true);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
            org.telegram.ui.Components.zq zqVar2 = new org.telegram.ui.Components.zq(R.drawable.mini_roll, 0);
            zqVar2.setTranslateY(AndroidUtilities.dp(f11));
            spannableStringBuilder3.setSpan(zqVar2, 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
            dVar2.i(spannableStringBuilder3, false, true);
            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.m81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                    Editable text = editTextBoldCursor2.getText();
                    try {
                        double parseDouble = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
                        int i21 = i10;
                        double d10 = MessagesController.getInstance(i21).tonStakeddiceStakeAmountMax / 1.0E9d;
                        org.telegram.ui.Components.sd0 sd0Var2 = sd0Var;
                        int[] iArr2 = iArr;
                        if (parseDouble > d10) {
                            editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i21).tonStakeddiceStakeAmountMax / 1.0E9d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i22 = -iArr2[0];
                            iArr2[0] = i22;
                            AndroidUtilities.shakeViewSpring(sd0Var2, i22);
                            return;
                        }
                        if (TextUtils.isEmpty(text) || parseDouble >= MessagesController.getInstance(i21).tonStakeddiceStakeAmountMin / 1.0E9d) {
                            if (bi.ca.y(i21, true).f.toDouble() < parseDouble) {
                                new gi.g(context, u6Var, bg.a.i((long) (parseDouble * 1.0E9d), bg.b.b), true, new w90(8));
                                return;
                            } else {
                                s2Var.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                p81.this.dismiss();
                                return;
                            }
                        }
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i21).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i23 = -iArr2[0];
                        iArr2[0] = i23;
                        AndroidUtilities.shakeViewSpring(sd0Var2, i23);
                    } catch (Exception unused) {
                    }
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(dVar2, org.telegram.ui.Components.kb1.x(-1, 48, 87, 16, 0, 16, 10));
            ViewGroup viewGroup = this.containerView;
            int i21 = this.backgroundPaddingLeft;
            viewGroup.addView(frameLayout, org.telegram.ui.Components.kb1.j(-2.0f, 87, i21, 0, i21, 0));
            org.telegram.ui.Components.nm0 nm0Var = this.d;
            int i22 = this.backgroundPaddingLeft;
            nm0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(68.0f));
            this.c0.O(false);
        }
    }

    public final void P() {
        boolean z10 = (!this.a0 || isDismissed() || isKeyboardVisible()) ? false : true;
        if (this.b0 != z10) {
            this.b0 = z10;
            bi.c cVar = this.X;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                org.telegram.messenger.wh.p(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean isTouchOutside(float f7, float f10) {
        bi.c cVar = this.X;
        if (f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        P();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.a0 = false;
        P();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.a0 = true;
        P();
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(nm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 27), this.resourcesProvider);
        this.c0 = k71Var;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }
}
