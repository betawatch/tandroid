// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mhb extends TableLayout implements vlb {
    public final ylb a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public mhb(Context context, ylb ylbVar) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, gm.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = ylbVar;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final khb a(CharSequence charSequence) {
        xna xnaVar = new xna(getContext());
        int i = cmb.F6;
        ylb ylbVar = this.a;
        anb.X(xnaVar, i, ylbVar);
        anb.G(xnaVar, cmb.Wc, ylbVar);
        xnaVar.setTextSize(1, 14.0f);
        xnaVar.setText(gw3.m(charSequence, xnaVar.getPaint().getFontMetricsInt(), false, null, 0));
        nm7.i(xnaVar);
        xnaVar.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        khb khbVar = new khb(this, xnaVar, true);
        tableRow.addView(khbVar, layoutParams);
        addView(tableRow);
        return khbVar;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        fn fnVar = new fn(getContext());
        anb.X(fnVar, cmb.F6, this.a);
        fnVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        k47.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        fnVar.setText(k47.A5(gw3.m(spannableStringBuilder, fnVar.getPaint().getFontMetricsInt(), false, null, 0), arrayList, fnVar.getPaint().getFontMetricsInt(), false));
        nm7.i(fnVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new khb(this, fnVar, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lhb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jhb(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return f(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        x51 x51Var = new x51(getContext());
        int i = cmb.F6;
        ylb ylbVar = this.a;
        anb.X(x51Var, i, ylbVar);
        x51Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gw3.m(charSequence, x51Var.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) y51.b(str2, runnable, ylbVar, num));
        }
        x51Var.setText(spannableStringBuilder);
        nm7.i(x51Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lhb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jhb(this, x51Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow f(String str, CharSequence charSequence, lhb[] lhbVarArr, x51[] x51VarArr) {
        x51 x51Var = new x51(getContext());
        anb.X(x51Var, cmb.F6, this.a);
        x51Var.setTextSize(1, 14.0f);
        x51Var.setText(gw3.m(charSequence, x51Var.getPaint().getFontMetricsInt(), false, null, 0));
        nm7.i(x51Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        lhb lhbVar = new lhb(this, str);
        if (lhbVarArr != null) {
            lhbVarArr[0] = lhbVar;
        }
        tableRow.addView(lhbVar, layoutParams);
        tableRow.addView(new jhb(this, x51Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (x51VarArr != null) {
            x51VarArr[0] = x51Var;
        }
        return tableRow;
    }

    public final void g(int i, String str) {
        long j = i * 1000;
        f(str, jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(j)), jb6.D0().o0().format(new Date(j))), null, null);
    }

    public final TableRow h(String str, CharSequence charSequence, Runnable runnable, String str2, zmc zmcVar) {
        Context context = getContext();
        ylb ylbVar = this.a;
        x51 x51Var = new x51(context, ylbVar);
        x51Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        x51Var.setEllipsize(TextUtils.TruncateAt.END);
        int i = cmb.Wc;
        anb.X(x51Var, i, ylbVar);
        anb.G(x51Var, i, ylbVar);
        x51Var.setTextSize(1, 14.0f);
        x51Var.setSingleLine(true);
        x51Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new vl(runnable, (byte) 5), 0, spannableStringBuilder.length(), 33);
        x51Var.setText(spannableStringBuilder);
        if (str2 != null) {
            x51Var.P = new y51(str2, zmcVar, ylbVar);
        }
        return l(x51Var, str);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(String str, CharSequence charSequence, int i, uva uvaVar, String str2, ymc ymcVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final l66 l66Var = new l66(getContext(), null);
        l66Var.setTypeface(gm.n1("fonts/rmono.ttf"));
        float f = i;
        l66Var.setTextSize(1, f);
        int i2 = cmb.i5;
        ylb ylbVar = this.a;
        anb.X(l66Var, i2, ylbVar);
        l66Var.setMaxLines(4);
        l66Var.setSingleLine(false);
        l66Var.setText(charSequence);
        l66Var.setDisablePaddingsOffsetY(true);
        l66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(10.66f), gm.L(9.33f));
        frameLayout.addView(l66Var, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str2 != null) {
            y51 y51Var = new y51(str2, ymcVar, ylbVar);
            final x51 x51Var = new x51(getContext(), ylbVar);
            x51Var.setTextSize(1, f);
            x51Var.setPadding(0, gm.L(9.33f), 0, gm.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(y51Var, 0, spannableString.length(), 33);
            x51Var.setText(spannableString);
            float f2 = (uvaVar != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) l66Var.getLayoutParams()).rightMargin = gm.L(f2) + y51Var.a();
            frameLayout.addView(x51Var, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, f2, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hhb
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    l66 l66Var2 = l66.this;
                    if (l66Var2.getLayout() == null || l66Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = l66Var2.getLayout().getLineRight(0) + l66Var2.getPaddingLeft() + l66Var2.getLeft() + gm.L(6.0f);
                    x51Var.setTranslationX(Math.min(0.0f, lineRight - r0.getLeft()));
                }
            });
        }
        if (uvaVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = cmb.u6;
            anb.s(imageView, i3, ylbVar, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new r39(charSequence, uvaVar, (byte) 27));
            rve.a(imageView);
            fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i3, ylbVar)), 7, -1);
            wmb K = anb.K(0.1f, i3);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, K, ylbVar);
            frameLayout.addView(imageView, qoe.e(30, 30, 21));
        }
        return l(frameLayout, str);
    }

    public final void k(String str, CharSequence charSequence, int i, uva uvaVar) {
        j(str, charSequence, i, uvaVar, null, null);
    }

    public final TableRow l(View view, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lhb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jhb(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(String str, int i, long j, Runnable runnable, String str2, Runnable runnable2) {
        String str3;
        boolean z;
        String str4;
        boolean z2;
        boolean z3;
        Context context = getContext();
        ylb ylbVar = this.a;
        x51 x51Var = new x51(context, ylbVar);
        x51Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        x51Var.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = cmb.Ei;
        anb.X(x51Var, i2, ylbVar);
        anb.G(x51Var, i2, ylbVar);
        x51Var.setTextSize(1, 14.0f);
        x51Var.setSingleLine(true);
        x51Var.setDisablePaddingsOffsetY(true);
        ed0 ed0Var = new ed0(24.0f, i, x51Var);
        ImageReceiver imageReceiver = ed0Var.b;
        if (j == 2666000) {
            str4 = jb6.M0(2131744638, null);
            sn2 a = ixa.a(44, "anonymous");
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z2 = false;
            z3 = false;
        } else if (m9c.C(j)) {
            str4 = jb6.M0(2131744614, null);
            sn2 a2 = ixa.a(44, "fragment");
            int L3 = gm.L(16.0f);
            int L4 = gm.L(16.0f);
            a2.e = L3;
            a2.f = L4;
            imageReceiver.g0(a2);
            z3 = true;
            z2 = false;
        } else {
            if (j >= 0) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                z2 = W1 == null;
                String r = m9c.r(W1);
                ed0Var.e(W1);
                str4 = r;
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                if (L0 == null) {
                    str3 = "";
                    z = true;
                } else {
                    str3 = L0.title;
                    z = false;
                }
                ed0Var.b(L0);
                str4 = str3;
                z2 = z;
            }
            z3 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str4));
        spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
        if (z3) {
            spannableStringBuilder.setSpan(new vl(runnable, (byte) 4), 3, spannableStringBuilder.length(), 33);
        }
        if (str2 != null) {
            x51Var.P = new y51(str2, runnable2, ylbVar);
        }
        x51Var.setText(spannableStringBuilder);
        if (z2) {
            return null;
        }
        return l(x51Var, str);
    }

    public final void n(String str, int i, long j, Runnable runnable) {
        m(str, i, j, runnable, null, null);
    }

    public final TableRow o(String str, final int i, final long j, Runnable runnable) {
        String str2;
        boolean z;
        Context context = getContext();
        ylb ylbVar = this.a;
        final j66 j66Var = new j66(context, ylbVar);
        j66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
        int i2 = cmb.Ei;
        anb.W(j66Var, i2, ylbVar);
        j66Var.setLinkTextColor(cmb.v0(i2, ylbVar));
        j66Var.setTextSize(14);
        ed0 ed0Var = new ed0(24.0f, i, j66Var);
        ImageReceiver imageReceiver = ed0Var.b;
        if (j == 2666000) {
            str2 = jb6.M0(2131744638, null);
            sn2 a = ixa.a(44, "anonymous");
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z = false;
        } else {
            if (m9c.C(j)) {
                str2 = jb6.M0(2131744614, null);
                sn2 a2 = ixa.a(44, "fragment");
                int L3 = gm.L(16.0f);
                int L4 = gm.L(16.0f);
                a2.e = L3;
                a2.f = L4;
                imageReceiver.g0(a2);
            } else if (j >= 0) {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                String r = m9c.r(W1);
                ed0Var.e(W1);
                str2 = r;
            } else {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                String str3 = L0 == null ? "" : L0.title;
                ed0Var.b(L0);
                str2 = str3;
            }
            z = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
        if (z) {
            j66Var.setClickable(true);
            spannableStringBuilder.setSpan(new vl(runnable, (byte) 3), 3, spannableStringBuilder.length(), 33);
        }
        final int v0 = cmb.v0(i2, ylbVar);
        final tm tmVar = new tm(gm.L(20.0f), j66Var);
        tmVar.k(Integer.valueOf(v0));
        tmVar.J = gm.L(12.0f);
        tmVar.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(j66Var);
        this.r.add(tmVar);
        j66Var.addOnAttachStateChangeListener(new eq1(tmVar, (byte) 2));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        anb.x(this, mutate, i2, ylbVar, PorterDuff.Mode.SRC_IN);
        qac qacVar = new qac() { // from class: ihb
            /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
            @Override // qac
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z2;
                long f;
                long j2 = j;
                if (j2 == 2666000 || m9c.C(j2)) {
                    return;
                }
                int i3 = i;
                if (j2 > 0) {
                    TLRPC.User W12 = oc7.r1(i3).W1(Long.valueOf(j2));
                    emojiStatus = W12 != null ? W12.emoji_status : null;
                    if (W12 != null && W12.premium) {
                        z2 = true;
                        f = pg3.f(emojiStatus);
                        tm tmVar2 = tmVar;
                        j66 j66Var2 = j66Var;
                        if (f == 0) {
                            tmVar2.j(f, true);
                            tmVar2.m(pg3.A(emojiStatus), true);
                            j66Var2.i(tmVar2);
                        } else if (z2) {
                            tmVar2.g(mutate, true);
                            tmVar2.m(false, true);
                            j66Var2.i(tmVar2);
                        } else {
                            j66Var2.i(null);
                        }
                        tmVar2.k(Integer.valueOf(v0));
                    }
                } else {
                    TLRPC.Chat L02 = oc7.r1(i3).L0(Long.valueOf(-j2));
                    emojiStatus = L02 != null ? L02.emoji_status : null;
                }
                z2 = false;
                f = pg3.f(emojiStatus);
                tm tmVar22 = tmVar;
                j66 j66Var22 = j66Var;
                if (f == 0) {
                }
                tmVar22.k(Integer.valueOf(v0));
            }
        };
        qacVar.a(null);
        j66Var.i(tmVar);
        nm7.f(i).h(j66Var, 2, qacVar);
        nm7.f(i).h(j66Var, nm7.q5, qacVar);
        j66Var.l(spannableStringBuilder, false);
        return l(j66Var, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i5 = cmb.gi;
        ylb ylbVar = this.a;
        paint.setColor(cmb.v0(i5, ylbVar));
        paint2.setColor(cmb.v0(cmb.fi, ylbVar));
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            if (getChildAt(i6) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i6);
                int childCount2 = tableRow.getChildCount();
                int i7 = 0;
                while (i7 < childCount2) {
                    View childAt = tableRow.getChildAt(i7);
                    if (childAt instanceof lhb) {
                        lhb lhbVar = (lhb) childAt;
                        boolean z3 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (lhbVar.b != z3 || lhbVar.c != z2) {
                            lhbVar.b = z3;
                            lhbVar.c = z2;
                            lhbVar.invalidate();
                        }
                    } else if (childAt instanceof jhb) {
                        jhb jhbVar = (jhb) childAt;
                        boolean z4 = i6 == 0;
                        boolean z5 = i6 == childCount + (-1);
                        if (jhbVar.b != z4 || jhbVar.c != z5) {
                            jhbVar.b = z4;
                            jhbVar.c = z5;
                            jhbVar.invalidate();
                        }
                        boolean z6 = i7 == 0;
                        z2 = i7 == childCount2 + (-1);
                        if (jhbVar.d != z6 || jhbVar.e != z2) {
                            jhbVar.d = z6;
                            jhbVar.e = z2;
                            jhbVar.invalidate();
                        }
                    } else if (childAt instanceof khb) {
                        khb khbVar = (khb) childAt;
                        boolean z7 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (khbVar.c != z7 || khbVar.d != z2) {
                            khbVar.c = z7;
                            khbVar.d = z2;
                            khbVar.invalidate();
                        }
                    }
                    i7++;
                }
            }
            i6++;
        }
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.gi;
        ylb ylbVar = this.a;
        this.e.setColor(cmb.v0(i, ylbVar));
        this.d.setColor(cmb.v0(cmb.fi, ylbVar));
        try {
            if (this.n != null && this.r != null) {
                int v0 = cmb.v0(cmb.Ei, ylbVar);
                for (int i2 = 0; i2 < this.n.size(); i2++) {
                    j66 j66Var = (j66) this.n.get(i2);
                    if (j66Var != null) {
                        j66Var.setLinkTextColor(v0);
                        j66Var.invalidate();
                    }
                }
                for (int i3 = 0; i3 < this.r.size(); i3++) {
                    tm tmVar = (tm) this.r.get(i3);
                    if (tmVar != null) {
                        tmVar.k(Integer.valueOf(v0));
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i5 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i5 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i5).invalidate();
                        i5++;
                    }
                }
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
