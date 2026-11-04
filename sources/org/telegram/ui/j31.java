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
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j31 extends org.telegram.ui.Components.ma {
    public static final /* synthetic */ int W1 = 0;
    public final ci.c Q1;
    public final LinearLayout R1;
    public final LinearLayout S1;
    public boolean T1;
    public boolean U1;
    public org.telegram.ui.Components.f41 V1;

    public j31(final Context context, final int i3, final org.telegram.ui.ActionBar.e6 e6Var, final mi.f fVar) {
        super(1, context, e6Var, true);
        this.a = i3;
        this.s1 = 0.2f;
        this.Q0 = true;
        this.R0 = true;
        ci.c cVar = new ci.c(context, i3, dg.b.b, e6Var);
        this.Q1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.c.addView(cVar, 0, b8.mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        b8.pf.a(cVar);
        cVar.setOnClickListener(new ai.u(2, context, e6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.hp.s1(i3).w8;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.dice6);
        linearLayout.addView(imageView, b8.mf.t(80, 80, 1, 0, 0, 0, 8));
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        TextView b10 = b8.rf.b(context, 20.0f, i10, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131745248, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131745247, null));
        spannableStringBuilder.setSpan(new ei.m0(e6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, b8.mf.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = b8.rf.b(context, 14.0f, i10, false, null);
        org.telegram.messenger.k5.m(b11, 17, null, 2131745249);
        linearLayout.addView(b11, b8.mf.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.L6, true, null);
        b12.setText(org.telegram.messenger.bd.M0(2131745251, null));
        linearLayout2.addView(b12, b8.mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(context, e6Var);
        linearLayout2.addView(rx0Var, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        rx0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        rx0Var.addView(tableRow2);
        a1.d dVar = new a1.d(context, new int[]{R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6, R.drawable.dice6}, e6Var, rx0Var, 20);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.d(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.dice6, 0);
        wpVar.d = false;
        wpVar.I = 0.8f;
        wpVar.J = 0.8f;
        spannableStringBuilder2.setSpan(wpVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(org.telegram.messenger.g0.M2(org.telegram.messenger.bd.M0(2131745250, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b13, b8.mf.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, b8.mf.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, e6Var);
        gb0Var.setForceForceUseCenter(true);
        gb0Var.setText(org.telegram.messenger.bd.M0(2131745252, null));
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.G6, e6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.jg, e6Var);
        editTextBoldCursor.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new ci.y9(gb0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, b8.mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, b8.mf.p(-1, -2, 1.0f, org.telegram.messenger.hs.E1));
        gb0Var.e(editTextBoldCursor);
        gb0Var.addView(linearLayout4, b8.mf.e(-1, -2, 48));
        linearLayout3.addView(gb0Var, b8.mf.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, null);
        gb0Var.addView(textView, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j10 = tL_emojiGameDiceInfo.prev_stake;
        j10 = j10 <= 0 ? 1000000000L : j10;
        editTextBoldCursor.setText(ci.wb.P0(j10));
        textView.setAlpha(1.0f);
        StringBuilder sb2 = new StringBuilder("≈");
        org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
        long j11 = (long) ((j10 / 1.0E9d) * ((org.telegram.messenger.i0) org.telegram.messenger.hp.s1(i3).x7.l.b).a * 100.0d);
        i11.getClass();
        sb2.append(org.telegram.messenger.r1.g("USD", 2, j11, false));
        textView.setText(sb2.toString());
        final int[] iArr = {2};
        gb0Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        editTextBoldCursor.addTextChangedListener(new i31(i3, editTextBoldCursor, gb0Var, iArr, textView));
        org.telegram.messenger.v10 v10Var = new org.telegram.messenger.v10() { // from class: org.telegram.ui.g31
            @Override // org.telegram.messenger.v10
            public final Object a(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                int i12 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.r6.V(textView2, i12, e6Var2);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var2)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.15f, i12);
                textView2.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(textView2, d02, L2, null, e6Var2);
                textView2.setText(ci.wb.R0(ci.wb.P0(l10.longValue()) + " 💎", 0.75f));
                b8.pf.a(textView2);
                textView2.setOnClickListener(new hb0(17, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = org.telegram.messenger.hp.s1(i3).b7;
        int i12 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.a;
            int i13 = 3;
            if (i12 >= (length2 + 2) / 3) {
                gi.d dVar2 = new gi.d(context, e6Var, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.mini_roll, 0);
                wpVar2.s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder3.setSpan(wpVar2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131745253, null));
                dVar2.i(spannableStringBuilder3, false, true);
                dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.h31
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        Editable text = editTextBoldCursor2.getText();
                        try {
                            double parseDouble = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
                            int i14 = i3;
                            double d = org.telegram.messenger.hp.s1(i14).a7 / 1.0E9d;
                            org.telegram.ui.Components.gb0 gb0Var2 = gb0Var;
                            int[] iArr2 = iArr;
                            if (parseDouble > d) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.hp.s1(i14).a7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i15 = -iArr2[0];
                                iArr2[0] = i15;
                                org.telegram.messenger.g0.G3(i15, gb0Var2, null);
                                return;
                            }
                            if (TextUtils.isEmpty(text) || parseDouble >= org.telegram.messenger.hp.s1(i14).Z6 / 1.0E9d) {
                                if (ci.e9.y(i14, true).f.toDouble() < parseDouble) {
                                    new hi.f(context, e6Var, dg.a.i((long) (parseDouble * 1.0E9d), dg.b.b), true, new org.telegram.ui.Components.go(28));
                                    return;
                                } else {
                                    fVar.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                    j31.this.dismiss();
                                    return;
                                }
                            }
                            editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.hp.s1(i14).Z6 / 1.0E9d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i16 = -iArr2[0];
                            iArr2[0] = i16;
                            org.telegram.messenger.g0.G3(i16, gb0Var2, null);
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(dVar2, b8.mf.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.b;
                int i14 = this.u0;
                viewGroup.addView(frameLayout, b8.mf.f(-2.0f, -1, 87, i14, 0, i14, 0));
                org.telegram.ui.Components.tj0 tj0Var = this.l1;
                int i15 = this.u0;
                tj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(68.0f));
                this.V1.O(false);
                return;
            }
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            int i16 = 0;
            while (true) {
                int i17 = i12 * 3;
                if (i16 < Math.min(i13, jArr.length - i17)) {
                    f10.addView((View) v10Var.a(Long.valueOf(jArr[i17 + i16])), b8.mf.q(0, 26, 1.0f, org.telegram.messenger.hs.x1, 0, 0, i16 == 2 ? 0 : 6, 0));
                    i16++;
                    i13 = 3;
                }
            }
            this.S1.addView(f10, b8.mf.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
            i12++;
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.a, 0, false, new c5(this, 27), this.J0);
        this.V1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131745248, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean X(float f10, float f11) {
        ci.c cVar = this.Q1;
        if (f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    public final void d1() {
        boolean z10 = (!this.T1 || this.J || this.d) ? false : true;
        if (this.U1 != z10) {
            this.U1 = z10;
            ci.c cVar = this.Q1;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f), z10 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void n0() {
        this.T1 = false;
        d1();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.T1 = true;
        d1();
    }
}
