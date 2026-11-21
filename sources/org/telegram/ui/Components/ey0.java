package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ey0 extends TableLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public ey0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = h6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final cy0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        org.telegram.ui.ActionBar.t6.U(lVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(lVar, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.j6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        cy0 cy0Var = new cy0(this, lVar, true);
        tableRow.addView(cy0Var, layoutParams);
        addView(tableRow);
        return cy0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        x5 x5Var = new x5(getContext());
        org.telegram.ui.ActionBar.t6.U(x5Var, org.telegram.ui.ActionBar.m6.G6, this.a);
        x5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.fj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        x5Var.setText(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, x5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.ks.i(x5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new cy0(this, x5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new dy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new by0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable, Integer num) {
        nc ncVar = new nc(getContext());
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        org.telegram.ui.ActionBar.t6.U(ncVar, i7, h6Var);
        ncVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(charSequence2, ncVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) oc.b(str, runnable, h6Var, num));
        }
        ncVar.setText(spannableStringBuilder);
        org.telegram.messenger.ks.i(ncVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new dy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new by0(this, ncVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow e(CharSequence charSequence, CharSequence charSequence2, dy0[] dy0VarArr, nc[] ncVarArr) {
        nc ncVar = new nc(getContext());
        org.telegram.ui.ActionBar.t6.U(ncVar, org.telegram.ui.ActionBar.m6.G6, this.a);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setText(org.telegram.messenger.j6.m(charSequence2, ncVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(ncVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        dy0 dy0Var = new dy0(this, charSequence);
        if (dy0VarArr != null) {
            dy0VarArr[0] = dy0Var;
        }
        tableRow.addView(dy0Var, layoutParams);
        tableRow.addView(new by0(this, ncVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ncVarArr != null) {
            ncVarArr[0] = ncVar;
        }
        return tableRow;
    }

    public final TableRow f(CharSequence charSequence, String str) {
        return e(str, charSequence, null, null);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        e(str, org.telegram.messenger.gd.a0(null, null, 2131742519, org.telegram.messenger.gd.E0().s0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.g5 g5Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        nc ncVar = new nc(context, h6Var);
        ncVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ncVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.t6.U(ncVar, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(ncVar, i7, h6Var);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setSingleLine(true);
        ncVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        ncVar.setText(spannableStringBuilder);
        if (str != null) {
            ncVar.P = new oc(str, g5Var, h6Var);
        }
        return l(ncVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, di.f2 f2Var, String str, org.telegram.ui.Wallet.f5 f5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final m80 m80Var = new m80(getContext(), null);
        m80Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        m80Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        m80Var.setMaxLines(4);
        m80Var.setSingleLine(false);
        m80Var.setText(charSequence2);
        m80Var.setDisablePaddingsOffsetY(true);
        m80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(m80Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            oc ocVar = new oc(str, f5Var, h6Var);
            final nc ncVar = new nc(getContext(), h6Var);
            ncVar.setTextSize(1, f10);
            ncVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(ocVar, 0, spannableString.length(), 33);
            ncVar.setText(spannableString);
            float f11 = (f2Var != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) m80Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + ocVar.a();
            frameLayout.addView(ncVar, c8.ma.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.zx0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    m80 m80Var2 = m80.this;
                    if (m80Var2.getLayout() == null || m80Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = m80Var2.getLayout().getLineRight(0) + m80Var2.getPaddingLeft() + m80Var2.getLeft() + org.telegram.messenger.g0.L(6.0f);
                    ncVar.setTranslationX(Math.min(0.0f, lineRight - r2.getLeft()));
                }
            });
        }
        if (f2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = org.telegram.ui.ActionBar.m6.v6;
            org.telegram.ui.ActionBar.t6.s(imageView, i11, h6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new m8(25, charSequence2, f2Var));
            c8.ra.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)), 7, -1);
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i11);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var);
            frameLayout.addView(imageView, c8.ma.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, di.f2 f2Var) {
        j(str, charSequence, i7, f2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new dy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new by0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        nc ncVar = new nc(context, h6Var);
        ncVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ncVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(ncVar, i10, h6Var);
        org.telegram.ui.ActionBar.t6.G(ncVar, i10, h6Var);
        ncVar.setTextSize(1, 14.0f);
        ncVar.setSingleLine(true);
        ncVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, ncVar);
        ImageReceiver imageReceiver = f5Var.b;
        if (j3 == 2666000) {
            str3 = org.telegram.messenger.gd.N0(2131744708, null);
            oq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.o10.B(j3)) {
            str3 = org.telegram.messenger.gd.N0(2131744684, null);
            oq a11 = di.kb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.e = L3;
            a11.f = L4;
            imageReceiver.w0(a11);
            z11 = true;
            z10 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                z10 = c22 == null;
                str2 = org.telegram.messenger.o10.q(c22);
                f5Var.e(c22);
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                z10 = O0 == null;
                str2 = O0 == null ? "" : O0.title;
                f5Var.b(O0);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ncVar.P = new oc(str, runnable2, h6Var);
        }
        ncVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(ncVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        final k80 k80Var = new k80(context, h6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.X(k80Var, i10, h6Var);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        k80Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, k80Var);
        ImageReceiver imageReceiver = f5Var.b;
        if (j3 == 2666000) {
            str2 = org.telegram.messenger.gd.N0(2131744708, null);
            oq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.o10.B(j3)) {
                str2 = org.telegram.messenger.gd.N0(2131744684, null);
                oq a11 = di.kb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.e = L3;
                a11.f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                String q10 = org.telegram.messenger.o10.q(c22);
                f5Var.e(c22);
                str2 = q10;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                String str3 = O0 == null ? "" : O0.title;
                f5Var.b(O0);
                str2 = str3;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            k80Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        final n5 n5Var = new n5(org.telegram.messenger.g0.L(20.0f), k80Var);
        n5Var.k(Integer.valueOf(w02));
        n5Var.J = org.telegram.messenger.g0.L(12.0f);
        n5Var.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(k80Var);
        this.r.add(n5Var);
        k80Var.addOnAttachStateChangeListener(new bi.s2(n5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.ay0
            /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
            @Override // org.telegram.messenger.x10
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z11;
                long f10;
                long j10 = j3;
                if (j10 == 2666000 || org.telegram.messenger.o10.B(j10)) {
                    return;
                }
                int i11 = i7;
                if (j10 > 0) {
                    TLRPC.User c23 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(j10));
                    emojiStatus = c23 != null ? c23.emoji_status : null;
                    if (c23 != null && c23.premium) {
                        z11 = true;
                        f10 = org.telegram.messenger.n5.f(emojiStatus);
                        n5 n5Var2 = n5Var;
                        k80 k80Var2 = k80Var;
                        if (f10 == 0) {
                            n5Var2.j(f10, true);
                            n5Var2.m(org.telegram.messenger.n5.B(emojiStatus), true);
                            k80Var2.i(n5Var2);
                        } else if (z11) {
                            n5Var2.g(mutate, true);
                            n5Var2.m(false, true);
                            k80Var2.i(n5Var2);
                        } else {
                            k80Var2.i(null);
                        }
                        n5Var2.k(Integer.valueOf(w02));
                    }
                } else {
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-j10));
                    emojiStatus = O02 != null ? O02.emoji_status : null;
                }
                z11 = false;
                f10 = org.telegram.messenger.n5.f(emojiStatus);
                n5 n5Var22 = n5Var;
                k80 k80Var22 = k80Var;
                if (f10 == 0) {
                }
                n5Var22.k(Integer.valueOf(w02));
            }
        };
        x10Var.a(null);
        k80Var.i(n5Var);
        org.telegram.messenger.ks.f(i7).h(k80Var, org.telegram.messenger.ks.r, x10Var);
        org.telegram.messenger.ks.f(i7).h(k80Var, org.telegram.messenger.ks.p5, x10Var);
        k80Var.l(spannableStringBuilder, false);
        return l(k80Var, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        super.onLayout(z10, i7, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.m6.hi;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gi, h6Var));
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt = tableRow.getChildAt(i15);
                    if (childAt instanceof dy0) {
                        dy0 dy0Var = (dy0) childAt;
                        boolean z12 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (dy0Var.b != z12 || dy0Var.c != z11) {
                            dy0Var.b = z12;
                            dy0Var.c = z11;
                            dy0Var.invalidate();
                        }
                    } else if (childAt instanceof by0) {
                        by0 by0Var = (by0) childAt;
                        boolean z13 = i14 == 0;
                        boolean z14 = i14 == childCount + (-1);
                        if (by0Var.b != z13 || by0Var.c != z14) {
                            by0Var.b = z13;
                            by0Var.c = z14;
                            by0Var.invalidate();
                        }
                        boolean z15 = i15 == 0;
                        z11 = i15 == childCount2 + (-1);
                        if (by0Var.d != z15 || by0Var.e != z11) {
                            by0Var.d = z15;
                            by0Var.e = z11;
                            by0Var.invalidate();
                        }
                    } else if (childAt instanceof cy0) {
                        cy0 cy0Var = (cy0) childAt;
                        boolean z16 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (cy0Var.c != z16 || cy0Var.d != z11) {
                            cy0Var.c = z16;
                            cy0Var.d = z11;
                            cy0Var.invalidate();
                        }
                    }
                    i15++;
                }
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.hi;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        this.e.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.gi, h6Var));
        try {
            if (this.n != null && this.r != null) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
                for (int i10 = 0; i10 < this.n.size(); i10++) {
                    k80 k80Var = (k80) this.n.get(i10);
                    if (k80Var != null) {
                        k80Var.setLinkTextColor(w02);
                        k80Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.r.size(); i11++) {
                    n5 n5Var = (n5) this.r.get(i11);
                    if (n5Var != null) {
                        n5Var.k(Integer.valueOf(w02));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i13 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i13 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i13).invalidate();
                        i13++;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
