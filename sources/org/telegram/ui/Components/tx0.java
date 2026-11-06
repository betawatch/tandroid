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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class tx0 extends TableLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public tx0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = f6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final rx0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(lVar, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(lVar, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.i6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.qs.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        rx0 rx0Var = new rx0(this, lVar, true);
        tableRow.addView(rx0Var, layoutParams);
        addView(tableRow);
        return rx0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        q5 q5Var = new q5(getContext());
        org.telegram.ui.ActionBar.r6.V(q5Var, org.telegram.ui.ActionBar.k6.G6, this.a);
        q5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.ij.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        q5Var.setText(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, q5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, q5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.qs.i(q5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new rx0(this, q5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, sx0[] sx0VarArr, jc[] jcVarArr) {
        jc jcVar = new jc(getContext());
        org.telegram.ui.ActionBar.r6.V(jcVar, org.telegram.ui.ActionBar.k6.G6, this.a);
        jcVar.setTextSize(1, 14.0f);
        jcVar.setText(org.telegram.messenger.i6.m(charSequence2, jcVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.qs.i(jcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        sx0 sx0Var = new sx0(this, charSequence);
        if (sx0VarArr != null) {
            sx0VarArr[0] = sx0Var;
        }
        tableRow.addView(sx0Var, layoutParams);
        tableRow.addView(new qx0(this, jcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (jcVarArr != null) {
            jcVarArr[0] = jcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        jc jcVar = new jc(getContext());
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(jcVar, i7, f6Var);
        jcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(charSequence, jcVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) kc.b(str2, runnable, f6Var, num));
        }
        jcVar.setText(spannableStringBuilder);
        org.telegram.messenger.qs.i(jcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new sx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new qx0(this, jcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new sx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new qx0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        c(str, org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().s0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.s4 s4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        jc jcVar = new jc(context, f6Var);
        jcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        jcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.V(jcVar, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(jcVar, i7, f6Var);
        jcVar.setTextSize(1, 14.0f);
        jcVar.setSingleLine(true);
        jcVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        jcVar.setText(spannableStringBuilder);
        if (str != null) {
            jcVar.O = new kc(str, s4Var, f6Var);
        }
        return l(jcVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, bi.a4 a4Var, String str, org.telegram.ui.Wallet.r4 r4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final w70 w70Var = new w70(getContext(), null);
        w70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        w70Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        w70Var.setMaxLines(4);
        w70Var.setSingleLine(false);
        w70Var.setText(charSequence2);
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(w70Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            kc kcVar = new kc(str, r4Var, f6Var);
            final jc jcVar = new jc(getContext(), f6Var);
            jcVar.setTextSize(1, f10);
            jcVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(kcVar, 0, spannableString.length(), 33);
            jcVar.setText(spannableString);
            float f11 = (a4Var != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) w70Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + kcVar.a();
            frameLayout.addView(jcVar, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.nx0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    w70 w70Var2 = w70.this;
                    if (w70Var2.getLayout() == null || w70Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = w70Var2.getLayout().getLineRight(0) + w70Var2.getPaddingLeft() + w70Var2.getLeft() + org.telegram.messenger.g0.L(6.0f);
                    jcVar.setTranslationX(Math.min(0.0f, lineRight - r2.getLeft()));
                }
            });
        }
        if (a4Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = org.telegram.ui.ActionBar.k6.v6;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, f6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new lk(23, charSequence2, a4Var));
            c8.ka.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)), 7, -1);
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i11);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, f6Var);
            frameLayout.addView(imageView, c8.ha.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, bi.a4 a4Var) {
        j(str, charSequence, i7, a4Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new sx0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new qx0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z9;
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        jc jcVar = new jc(context, f6Var);
        jcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        jcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(jcVar, i10, f6Var);
        org.telegram.ui.ActionBar.r6.H(jcVar, i10, f6Var);
        jcVar.setTextSize(1, 14.0f);
        jcVar.setSingleLine(true);
        jcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, jcVar);
        ImageReceiver imageReceiver = f5Var.b;
        if (j3 == 2666000) {
            str3 = org.telegram.messenger.hd.M0(2131744950, null);
            xp a10 = bi.yc.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z9 = false;
            z10 = false;
        } else if (org.telegram.messenger.t10.A(j3)) {
            str3 = org.telegram.messenger.hd.M0(2131744926, null);
            xp a11 = bi.yc.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.e = L3;
            a11.f = L4;
            imageReceiver.w0(a11);
            z10 = true;
            z9 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                z9 = a22 == null;
                str2 = org.telegram.messenger.t10.p(a22);
                f5Var.e(a22);
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                z9 = M0 == null;
                str2 = M0 == null ? "" : M0.title;
                f5Var.b(M0);
            }
            str3 = str2;
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            jcVar.O = new kc(str, runnable2, f6Var);
        }
        jcVar.setText(spannableStringBuilder);
        if (z9) {
            return null;
        }
        return l(jcVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        boolean z9;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        final u70 u70Var = new u70(context, f6Var);
        u70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.Y(u70Var, i10, f6Var);
        u70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        u70Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, u70Var);
        ImageReceiver imageReceiver = f5Var.b;
        if (j3 == 2666000) {
            str2 = org.telegram.messenger.hd.M0(2131744950, null);
            xp a10 = bi.yc.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z9 = false;
        } else {
            if (org.telegram.messenger.t10.A(j3)) {
                str2 = org.telegram.messenger.hd.M0(2131744926, null);
                xp a11 = bi.yc.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.e = L3;
                a11.f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                String p10 = org.telegram.messenger.t10.p(a22);
                f5Var.e(a22);
                str2 = p10;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                String str3 = M0 == null ? "" : M0.title;
                f5Var.b(M0);
                str2 = str3;
            }
            z9 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z9) {
            u70Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        final g5 g5Var = new g5(org.telegram.messenger.g0.L(20.0f), u70Var);
        g5Var.k(Integer.valueOf(w02));
        g5Var.I = org.telegram.messenger.g0.L(12.0f);
        g5Var.J = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(u70Var);
        this.r.add(g5Var);
        u70Var.addOnAttachStateChangeListener(new px0(g5Var, 0));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.ox0
            /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
            @Override // org.telegram.messenger.c20
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z10;
                long f10;
                long j10 = j3;
                if (j10 == 2666000 || org.telegram.messenger.t10.A(j10)) {
                    return;
                }
                int i11 = i7;
                if (j10 > 0) {
                    TLRPC.User a23 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(j10));
                    emojiStatus = a23 != null ? a23.emoji_status : null;
                    if (a23 != null && a23.premium) {
                        z10 = true;
                        f10 = org.telegram.messenger.m5.f(emojiStatus);
                        g5 g5Var2 = g5Var;
                        u70 u70Var2 = u70Var;
                        if (f10 == 0) {
                            g5Var2.j(f10, true);
                            g5Var2.m(org.telegram.messenger.m5.B(emojiStatus), true);
                            u70Var2.i(g5Var2);
                        } else if (z10) {
                            g5Var2.g(mutate, true);
                            g5Var2.m(false, true);
                            u70Var2.i(g5Var2);
                        } else {
                            u70Var2.i(null);
                        }
                        g5Var2.k(Integer.valueOf(w02));
                    }
                } else {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-j10));
                    emojiStatus = M02 != null ? M02.emoji_status : null;
                }
                z10 = false;
                f10 = org.telegram.messenger.m5.f(emojiStatus);
                g5 g5Var22 = g5Var;
                u70 u70Var22 = u70Var;
                if (f10 == 0) {
                }
                g5Var22.k(Integer.valueOf(w02));
            }
        };
        c20Var.a(null);
        u70Var.i(g5Var);
        org.telegram.messenger.qs.f(i7).h(u70Var, org.telegram.messenger.qs.r, c20Var);
        org.telegram.messenger.qs.f(i7).h(u70Var, org.telegram.messenger.qs.m5, c20Var);
        u70Var.l(spannableStringBuilder, false);
        return l(u70Var, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        super.onLayout(z9, i7, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.k6.ei;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.di, f6Var));
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt = tableRow.getChildAt(i15);
                    if (childAt instanceof sx0) {
                        sx0 sx0Var = (sx0) childAt;
                        boolean z11 = i14 == 0;
                        z10 = i14 == childCount + (-1);
                        if (sx0Var.b != z11 || sx0Var.c != z10) {
                            sx0Var.b = z11;
                            sx0Var.c = z10;
                            sx0Var.invalidate();
                        }
                    } else if (childAt instanceof qx0) {
                        qx0 qx0Var = (qx0) childAt;
                        boolean z12 = i14 == 0;
                        boolean z13 = i14 == childCount + (-1);
                        if (qx0Var.b != z12 || qx0Var.c != z13) {
                            qx0Var.b = z12;
                            qx0Var.c = z13;
                            qx0Var.invalidate();
                        }
                        boolean z14 = i15 == 0;
                        z10 = i15 == childCount2 + (-1);
                        if (qx0Var.d != z14 || qx0Var.e != z10) {
                            qx0Var.d = z14;
                            qx0Var.e = z10;
                            qx0Var.invalidate();
                        }
                    } else if (childAt instanceof rx0) {
                        rx0 rx0Var = (rx0) childAt;
                        boolean z15 = i14 == 0;
                        z10 = i14 == childCount + (-1);
                        if (rx0Var.c != z15 || rx0Var.d != z10) {
                            rx0Var.c = z15;
                            rx0Var.d = z10;
                            rx0Var.invalidate();
                        }
                    }
                    i15++;
                }
            }
            i14++;
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        w70 w70Var = new w70(getContext(), null);
        w70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        w70Var.setTextSize(1, 13.0f);
        int i7 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(w70Var, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setMaxLines(1);
        w70Var.setSingleLine();
        w70Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        w70Var.setText(spannableStringBuilder);
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(w70Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.ei;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.e.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.di, f6Var));
        try {
            if (this.n != null && this.r != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
                for (int i10 = 0; i10 < this.n.size(); i10++) {
                    u70 u70Var = (u70) this.n.get(i10);
                    if (u70Var != null) {
                        u70Var.setLinkTextColor(w02);
                        u70Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.r.size(); i11++) {
                    g5 g5Var = (g5) this.r.get(i11);
                    if (g5Var != null) {
                        g5Var.k(Integer.valueOf(w02));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
