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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rx0 extends TableLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public rx0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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

    public final px0 a(CharSequence charSequence) {
        yh.l lVar = new yh.l(getContext());
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(lVar, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(lVar, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.i6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.hs.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        px0 px0Var = new px0(this, lVar, true);
        tableRow.addView(px0Var, layoutParams);
        addView(tableRow);
        return px0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        o5 o5Var = new o5(getContext());
        org.telegram.ui.ActionBar.r6.V(o5Var, org.telegram.ui.ActionBar.k6.G6, this.a);
        o5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.zi.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        o5Var.setText(org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, o5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.hs.i(o5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new px0(this, o5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, qx0[] qx0VarArr, hc[] hcVarArr) {
        hc hcVar = new hc(getContext());
        org.telegram.ui.ActionBar.r6.V(hcVar, org.telegram.ui.ActionBar.k6.G6, this.a);
        hcVar.setTextSize(1, 14.0f);
        hcVar.setText(org.telegram.messenger.i6.m(charSequence2, hcVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.hs.i(hcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        qx0 qx0Var = new qx0(this, charSequence);
        if (qx0VarArr != null) {
            qx0VarArr[0] = qx0Var;
        }
        tableRow.addView(qx0Var, layoutParams);
        tableRow.addView(new ox0(this, hcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (hcVarArr != null) {
            hcVarArr[0] = hcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        hc hcVar = new hc(getContext());
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(hcVar, i3, e6Var);
        hcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(charSequence, hcVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ic.b(str2, runnable, e6Var, num));
        }
        hcVar.setText(spannableStringBuilder);
        org.telegram.messenger.hs.i(hcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new qx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ox0(this, hcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new qx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ox0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i3, String str) {
        long j10 = i3 * 1000;
        c(str, org.telegram.messenger.bd.a0(null, null, 2131742793, org.telegram.messenger.bd.E0().s0().format(new Date(j10)), org.telegram.messenger.bd.E0().p0().format(new Date(j10))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.q4 q4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        hc hcVar = new hc(context, e6Var);
        hcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        hcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.V(hcVar, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(hcVar, i3, e6Var);
        hcVar.setTextSize(1, 14.0f);
        hcVar.setSingleLine(true);
        hcVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        hcVar.setText(spannableStringBuilder);
        if (str != null) {
            hcVar.P = new ic(str, q4Var, e6Var);
        }
        return l(hcVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i3, ci.e0 e0Var, String str, org.telegram.ui.Wallet.p4 p4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final s70 s70Var = new s70(getContext(), null);
        s70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i3;
        s70Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
        s70Var.setMaxLines(4);
        s70Var.setSingleLine(false);
        s70Var.setText(charSequence2);
        s70Var.setDisablePaddingsOffsetY(true);
        s70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(s70Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            ic icVar = new ic(str, p4Var, e6Var);
            final hc hcVar = new hc(getContext(), e6Var);
            hcVar.setTextSize(1, f10);
            hcVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(icVar, 0, spannableString.length(), 33);
            hcVar.setText(spannableString);
            float f11 = (e0Var != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) s70Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + icVar.a();
            frameLayout.addView(hcVar, b8.mf.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.mx0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    s70 s70Var2 = s70.this;
                    if (s70Var2.getLayout() == null || s70Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = s70Var2.getLayout().getLineRight(0) + s70Var2.getPaddingLeft() + s70Var2.getLeft() + org.telegram.messenger.g0.L(6.0f);
                    hcVar.setTranslationX(Math.min(0.0f, lineRight - r2.getLeft()));
                }
            });
        }
        if (e0Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i11 = org.telegram.ui.ActionBar.k6.v6;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, e6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new q2(29, charSequence2, e0Var));
            b8.pf.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)), 7, -1);
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i11);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
            frameLayout.addView(imageView, b8.mf.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i3, ci.e0 e0Var) {
        j(str, charSequence, i3, e0Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new qx0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ox0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i3, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        hc hcVar = new hc(context, e6Var);
        hcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        hcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(hcVar, i10, e6Var);
        org.telegram.ui.ActionBar.r6.H(hcVar, i10, e6Var);
        hcVar.setTextSize(1, 14.0f);
        hcVar.setSingleLine(true);
        hcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(24.0f, i3, hcVar);
        ImageReceiver imageReceiver = h5Var.b;
        if (j10 == 2666000) {
            str3 = org.telegram.messenger.bd.M0(2131744959, null);
            xp a10 = ci.rb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.l10.A(j10)) {
            str3 = org.telegram.messenger.bd.M0(2131744935, null);
            xp a11 = ci.rb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.e = L3;
            a11.f = L4;
            imageReceiver.w0(a11);
            z11 = true;
            z10 = false;
        } else {
            if (j10 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10));
                z10 = a22 == null;
                str2 = org.telegram.messenger.l10.p(a22);
                h5Var.e(a22);
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
                z10 = M0 == null;
                str2 = M0 == null ? "" : M0.title;
                h5Var.b(M0);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            hcVar.P = new ic(str, runnable2, e6Var);
        }
        hcVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(hcVar, charSequence);
    }

    public final void n(String str, int i3, long j10, Runnable runnable) {
        m(str, i3, j10, runnable, null, null);
    }

    public final TableRow o(String str, final int i3, final long j10, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        final q70 q70Var = new q70(context, e6Var);
        q70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.Y(q70Var, i10, e6Var);
        q70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        q70Var.setTextSize(14);
        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(24.0f, i3, q70Var);
        ImageReceiver imageReceiver = h5Var.b;
        if (j10 == 2666000) {
            str2 = org.telegram.messenger.bd.M0(2131744959, null);
            xp a10 = ci.rb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.e = L;
            a10.f = L2;
            imageReceiver.w0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.l10.A(j10)) {
                str2 = org.telegram.messenger.bd.M0(2131744935, null);
                xp a11 = ci.rb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.e = L3;
                a11.f = L4;
                imageReceiver.w0(a11);
            } else if (j10 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10));
                String p10 = org.telegram.messenger.l10.p(a22);
                h5Var.e(a22);
                str2 = p10;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
                String str3 = M0 == null ? "" : M0.title;
                h5Var.b(M0);
                str2 = str3;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
        if (z10) {
            q70Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        final e5 e5Var = new e5(org.telegram.messenger.g0.L(20.0f), q70Var);
        e5Var.k(Integer.valueOf(w02));
        e5Var.J = org.telegram.messenger.g0.L(12.0f);
        e5Var.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(q70Var);
        this.r.add(e5Var);
        q70Var.addOnAttachStateChangeListener(new ai.c2(e5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, e6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.u10 u10Var = new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.nx0
            /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
            @Override // org.telegram.messenger.u10
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z11;
                long f10;
                long j11 = j10;
                if (j11 == 2666000 || org.telegram.messenger.l10.A(j11)) {
                    return;
                }
                int i11 = i3;
                if (j11 > 0) {
                    TLRPC.User a23 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(j11));
                    emojiStatus = a23 != null ? a23.emoji_status : null;
                    if (a23 != null && a23.premium) {
                        z11 = true;
                        f10 = org.telegram.messenger.m5.f(emojiStatus);
                        e5 e5Var2 = e5Var;
                        q70 q70Var2 = q70Var;
                        if (f10 == 0) {
                            e5Var2.j(f10, true);
                            e5Var2.m(org.telegram.messenger.m5.B(emojiStatus), true);
                            q70Var2.i(e5Var2);
                        } else if (z11) {
                            e5Var2.g(mutate, true);
                            e5Var2.m(false, true);
                            q70Var2.i(e5Var2);
                        } else {
                            q70Var2.i(null);
                        }
                        e5Var2.k(Integer.valueOf(w02));
                    }
                } else {
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(-j11));
                    emojiStatus = M02 != null ? M02.emoji_status : null;
                }
                z11 = false;
                f10 = org.telegram.messenger.m5.f(emojiStatus);
                e5 e5Var22 = e5Var;
                q70 q70Var22 = q70Var;
                if (f10 == 0) {
                }
                e5Var22.k(Integer.valueOf(w02));
            }
        };
        u10Var.a(null);
        q70Var.i(e5Var);
        org.telegram.messenger.hs.f(i3).h(q70Var, org.telegram.messenger.hs.r, u10Var);
        org.telegram.messenger.hs.f(i3).h(q70Var, org.telegram.messenger.hs.m5, u10Var);
        q70Var.l(spannableStringBuilder, false);
        return l(q70Var, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11;
        super.onLayout(z10, i3, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.k6.ei;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.di, e6Var));
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt = tableRow.getChildAt(i15);
                    if (childAt instanceof qx0) {
                        qx0 qx0Var = (qx0) childAt;
                        boolean z12 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (qx0Var.b != z12 || qx0Var.c != z11) {
                            qx0Var.b = z12;
                            qx0Var.c = z11;
                            qx0Var.invalidate();
                        }
                    } else if (childAt instanceof ox0) {
                        ox0 ox0Var = (ox0) childAt;
                        boolean z13 = i14 == 0;
                        boolean z14 = i14 == childCount + (-1);
                        if (ox0Var.b != z13 || ox0Var.c != z14) {
                            ox0Var.b = z13;
                            ox0Var.c = z14;
                            ox0Var.invalidate();
                        }
                        boolean z15 = i15 == 0;
                        z11 = i15 == childCount2 + (-1);
                        if (ox0Var.d != z15 || ox0Var.e != z11) {
                            ox0Var.d = z15;
                            ox0Var.e = z11;
                            ox0Var.invalidate();
                        }
                    } else if (childAt instanceof px0) {
                        px0 px0Var = (px0) childAt;
                        boolean z16 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (px0Var.c != z16 || px0Var.d != z11) {
                            px0Var.c = z16;
                            px0Var.d = z11;
                            px0Var.invalidate();
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
        s70 s70Var = new s70(getContext(), null);
        s70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        s70Var.setTextSize(1, 13.0f);
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setMaxLines(1);
        s70Var.setSingleLine();
        s70Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        s70Var.setText(spannableStringBuilder);
        s70Var.setDisablePaddingsOffsetY(true);
        s70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(s70Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.ei;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.e.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.di, e6Var));
        try {
            if (this.n != null && this.r != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
                for (int i10 = 0; i10 < this.n.size(); i10++) {
                    q70 q70Var = (q70) this.n.get(i10);
                    if (q70Var != null) {
                        q70Var.setLinkTextColor(w02);
                        q70Var.invalidate();
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
