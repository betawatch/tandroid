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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vx0 extends TableLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public vx0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = e6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final tx0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.q6.U(lVar, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(lVar, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.j6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ns.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tx0 tx0Var = new tx0(this, lVar, true);
        tableRow.addView(tx0Var, layoutParams);
        addView(tableRow);
        return tx0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        o5 o5Var = new o5(getContext());
        org.telegram.ui.ActionBar.q6.U(o5Var, org.telegram.ui.ActionBar.j6.G6, this.a);
        o5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.gj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        o5Var.setText(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, o5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.ns.i(o5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new tx0(this, o5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, ux0[] ux0VarArr, ec[] ecVarArr) {
        ec ecVar = new ec(getContext());
        org.telegram.ui.ActionBar.q6.U(ecVar, org.telegram.ui.ActionBar.j6.G6, this.a);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setText(org.telegram.messenger.j6.m(charSequence2, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ns.i(ecVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        ux0 ux0Var = new ux0(this, charSequence);
        if (ux0VarArr != null) {
            ux0VarArr[0] = ux0Var;
        }
        tableRow.addView(ux0Var, layoutParams);
        tableRow.addView(new sx0(this, ecVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ecVarArr != null) {
            ecVarArr[0] = ecVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        ec ecVar = new ec(getContext());
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.q6.U(ecVar, i7, e6Var);
        ecVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(charSequence, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b(str2, runnable, e6Var, num));
        }
        ecVar.setText(spannableStringBuilder);
        org.telegram.messenger.ns.i(ecVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new ux0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new sx0(this, ecVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new ux0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new sx0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        c(str, org.telegram.messenger.hd.a0(null, null, 2131742783, org.telegram.messenger.hd.E0().s0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.s4 s4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        ec ecVar = new ec(context, e6Var);
        ecVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.U(ecVar, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(ecVar, i7, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setSingleLine(true);
        ecVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        ecVar.setText(spannableStringBuilder);
        if (str != null) {
            ecVar.P = new fc(str, s4Var, e6Var);
        }
        return l(ecVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, di.s2 s2Var, String str, org.telegram.ui.Wallet.r4 r4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final z70 z70Var = new z70(getContext(), null);
        z70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        int i10 = 1;
        z70Var.setTextSize(1, f10);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.q6.U(z70Var, i11, e6Var);
        z70Var.setMaxLines(4);
        z70Var.setSingleLine(false);
        z70Var.setText(charSequence2);
        z70Var.setDisablePaddingsOffsetY(true);
        z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(z70Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            fc fcVar = new fc(str, r4Var, e6Var);
            final ec ecVar = new ec(getContext(), e6Var);
            ecVar.setTextSize(1, f10);
            ecVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(fcVar, 0, spannableString.length(), 33);
            ecVar.setText(spannableString);
            float f11 = (s2Var != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) z70Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + fcVar.a();
            frameLayout.addView(ecVar, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.qx0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    z70 z70Var2 = z70.this;
                    if (z70Var2.getLayout() == null || z70Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = z70Var2.getLayout().getLineRight(0) + z70Var2.getPaddingLeft() + z70Var2.getLeft() + org.telegram.messenger.g0.L(6.0f);
                    ecVar.setTranslationX(Math.min(0.0f, lineRight - r2.getLeft()));
                }
            });
        }
        if (s2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.j6.v6;
            org.telegram.ui.ActionBar.q6.s(imageView, i12, e6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new vv0(i10, charSequence2, s2Var));
            c8.na.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i12, e6Var)), 7, -1);
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var);
            frameLayout.addView(imageView, c8.ja.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, di.s2 s2Var) {
        j(str, charSequence, i7, s2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new ux0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new sx0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        ec ecVar = new ec(context, e6Var);
        ecVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(ecVar, i10, e6Var);
        org.telegram.ui.ActionBar.q6.G(ecVar, i10, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setSingleLine(true);
        ecVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, ecVar);
        ImageReceiver imageReceiver = f5Var.b;
        if (j3 == 2666000) {
            str3 = org.telegram.messenger.hd.M0(2131744949, null);
            fq a10 = di.gb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.q10.A(j3)) {
            str3 = org.telegram.messenger.hd.M0(2131744925, null);
            fq a11 = di.gb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.e = L3;
            a11.f = L4;
            imageReceiver.w0(a11);
            z11 = true;
            z10 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
                z10 = a22 == null;
                str2 = org.telegram.messenger.q10.p(a22);
                f5Var.e(a22);
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
                z10 = M0 == null;
                str2 = M0 == null ? "" : M0.title;
                f5Var.b(M0);
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
            ecVar.P = new fc(str, runnable2, e6Var);
        }
        ecVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(ecVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        final x70 x70Var = new x70(context, e6Var);
        x70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.X(x70Var, i10, e6Var);
        x70Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        x70Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, x70Var);
        ImageReceiver imageReceiver = f5Var.b;
        if (j3 == 2666000) {
            str2 = org.telegram.messenger.hd.M0(2131744949, null);
            fq a10 = di.gb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.q10.A(j3)) {
                str2 = org.telegram.messenger.hd.M0(2131744925, null);
                fq a11 = di.gb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.e = L3;
                a11.f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
                String p10 = org.telegram.messenger.q10.p(a22);
                f5Var.e(a22);
                str2 = p10;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
                String str3 = M0 == null ? "" : M0.title;
                f5Var.b(M0);
                str2 = str3;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            x70Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        final e5 e5Var = new e5(org.telegram.messenger.g0.L(20.0f), x70Var);
        e5Var.k(Integer.valueOf(w02));
        e5Var.J = org.telegram.messenger.g0.L(12.0f);
        e5Var.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(x70Var);
        this.r.add(e5Var);
        x70Var.addOnAttachStateChangeListener(new bi.u1(e5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.rx0
            /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
            @Override // org.telegram.messenger.z10
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z11;
                long f10;
                long j10 = j3;
                if (j10 == 2666000 || org.telegram.messenger.q10.A(j10)) {
                    return;
                }
                int i11 = i7;
                if (j10 > 0) {
                    TLRPC.User a23 = org.telegram.messenger.np.s1(i11).a2(Long.valueOf(j10));
                    emojiStatus = a23 != null ? a23.emoji_status : null;
                    if (a23 != null && a23.premium) {
                        z11 = true;
                        f10 = org.telegram.messenger.m5.f(emojiStatus);
                        e5 e5Var2 = e5Var;
                        x70 x70Var2 = x70Var;
                        if (f10 == 0) {
                            e5Var2.j(f10, true);
                            e5Var2.m(org.telegram.messenger.m5.B(emojiStatus), true);
                            x70Var2.i(e5Var2);
                        } else if (z11) {
                            e5Var2.g(mutate, true);
                            e5Var2.m(false, true);
                            x70Var2.i(e5Var2);
                        } else {
                            x70Var2.i(null);
                        }
                        e5Var2.k(Integer.valueOf(w02));
                    }
                } else {
                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(-j10));
                    emojiStatus = M02 != null ? M02.emoji_status : null;
                }
                z11 = false;
                f10 = org.telegram.messenger.m5.f(emojiStatus);
                e5 e5Var22 = e5Var;
                x70 x70Var22 = x70Var;
                if (f10 == 0) {
                }
                e5Var22.k(Integer.valueOf(w02));
            }
        };
        z10Var.a(null);
        x70Var.i(e5Var);
        org.telegram.messenger.ns.f(i7).h(x70Var, org.telegram.messenger.ns.r, z10Var);
        org.telegram.messenger.ns.f(i7).h(x70Var, org.telegram.messenger.ns.m5, z10Var);
        x70Var.l(spannableStringBuilder, false);
        return l(x70Var, str);
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
        int i13 = org.telegram.ui.ActionBar.j6.hi;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gi, e6Var));
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt = tableRow.getChildAt(i15);
                    if (childAt instanceof ux0) {
                        ux0 ux0Var = (ux0) childAt;
                        boolean z12 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (ux0Var.b != z12 || ux0Var.c != z11) {
                            ux0Var.b = z12;
                            ux0Var.c = z11;
                            ux0Var.invalidate();
                        }
                    } else if (childAt instanceof sx0) {
                        sx0 sx0Var = (sx0) childAt;
                        boolean z13 = i14 == 0;
                        boolean z14 = i14 == childCount + (-1);
                        if (sx0Var.b != z13 || sx0Var.c != z14) {
                            sx0Var.b = z13;
                            sx0Var.c = z14;
                            sx0Var.invalidate();
                        }
                        boolean z15 = i15 == 0;
                        z11 = i15 == childCount2 + (-1);
                        if (sx0Var.d != z15 || sx0Var.e != z11) {
                            sx0Var.d = z15;
                            sx0Var.e = z11;
                            sx0Var.invalidate();
                        }
                    } else if (childAt instanceof tx0) {
                        tx0 tx0Var = (tx0) childAt;
                        boolean z16 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (tx0Var.c != z16 || tx0Var.d != z11) {
                            tx0Var.c = z16;
                            tx0Var.d = z11;
                            tx0Var.invalidate();
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
        z70 z70Var = new z70(getContext(), null);
        z70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        z70Var.setTextSize(1, 13.0f);
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setMaxLines(1);
        z70Var.setSingleLine();
        z70Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        z70Var.setText(spannableStringBuilder);
        z70Var.setDisablePaddingsOffsetY(true);
        z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(z70Var, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.hi;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.e.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.gi, e6Var));
        try {
            if (this.n != null && this.r != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
                for (int i10 = 0; i10 < this.n.size(); i10++) {
                    x70 x70Var = (x70) this.n.get(i10);
                    if (x70Var != null) {
                        x70Var.setLinkTextColor(w02);
                        x70Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.r.size(); i11++) {
                    e5 e5Var = (e5) this.r.get(i11);
                    if (e5Var != null) {
                        e5Var.k(Integer.valueOf(w02));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
