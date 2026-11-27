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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hjb extends TableLayout implements snb {
    public final vnb a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public hjb(Context context, vnb vnbVar) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, hl.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = vnbVar;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final fjb a(CharSequence charSequence) {
        tpa tpaVar = new tpa(getContext());
        int i = aob.G6;
        vnb vnbVar = this.a;
        yob.X(tpaVar, i, vnbVar);
        yob.G(tpaVar, aob.Xc, vnbVar);
        tpaVar.setTextSize(1, 14.0f);
        tpaVar.setText(pv3.m(charSequence, tpaVar.getPaint().getFontMetricsInt(), false, null, 0));
        jn7.i(tpaVar);
        tpaVar.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        fjb fjbVar = new fjb(this, tpaVar, true);
        tableRow.addView(fjbVar, layoutParams);
        addView(tableRow);
        return fjbVar;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        gm gmVar = new gm(getContext());
        yob.X(gmVar, aob.G6, this.a);
        gmVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        r47.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        gmVar.setText(r47.A5(pv3.m(spannableStringBuilder, gmVar.getPaint().getFontMetricsInt(), false, null, 0), arrayList, gmVar.getPaint().getFontMetricsInt(), false));
        jn7.i(gmVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new fjb(this, gmVar, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new gjb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ejb(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return f(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        y41 y41Var = new y41(getContext());
        int i = aob.G6;
        vnb vnbVar = this.a;
        yob.X(y41Var, i, vnbVar);
        y41Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pv3.m(charSequence, y41Var.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) z41.b(str2, runnable, vnbVar, num));
        }
        y41Var.setText(spannableStringBuilder);
        jn7.i(y41Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new gjb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ejb(this, y41Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow f(String str, CharSequence charSequence, gjb[] gjbVarArr, y41[] y41VarArr) {
        y41 y41Var = new y41(getContext());
        yob.X(y41Var, aob.G6, this.a);
        y41Var.setTextSize(1, 14.0f);
        y41Var.setText(pv3.m(charSequence, y41Var.getPaint().getFontMetricsInt(), false, null, 0));
        jn7.i(y41Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        gjb gjbVar = new gjb(this, str);
        if (gjbVarArr != null) {
            gjbVarArr[0] = gjbVar;
        }
        tableRow.addView(gjbVar, layoutParams);
        tableRow.addView(new ejb(this, y41Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (y41VarArr != null) {
            y41VarArr[0] = y41Var;
        }
        return tableRow;
    }

    public final void g(int i, String str) {
        long j = i * 1000;
        f(str, ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(j)), ob6.D0().o0().format(new Date(j))), null, null);
    }

    public final TableRow h(String str, CharSequence charSequence, Runnable runnable, String str2, opc opcVar) {
        Context context = getContext();
        vnb vnbVar = this.a;
        y41 y41Var = new y41(context, vnbVar);
        y41Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        y41Var.setEllipsize(TextUtils.TruncateAt.END);
        int i = aob.Xc;
        yob.X(y41Var, i, vnbVar);
        yob.G(y41Var, i, vnbVar);
        y41Var.setTextSize(1, 14.0f);
        y41Var.setSingleLine(true);
        y41Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new wk(runnable, (byte) 5), 0, spannableStringBuilder.length(), 33);
        y41Var.setText(spannableStringBuilder);
        if (str2 != null) {
            y41Var.P = new z41(str2, opcVar, vnbVar);
        }
        return l(y41Var, str);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(String str, CharSequence charSequence, int i, ida idaVar, String str2, npc npcVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final p66 p66Var = new p66(getContext(), null);
        p66Var.setTypeface(hl.n1("fonts/rmono.ttf"));
        float f = i;
        p66Var.setTextSize(1, f);
        int i2 = aob.j5;
        vnb vnbVar = this.a;
        yob.X(p66Var, i2, vnbVar);
        p66Var.setMaxLines(4);
        p66Var.setSingleLine(false);
        p66Var.setText(charSequence);
        p66Var.setDisablePaddingsOffsetY(true);
        p66Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(10.66f), hl.L(9.33f));
        frameLayout.addView(p66Var, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str2 != null) {
            z41 z41Var = new z41(str2, npcVar, vnbVar);
            final y41 y41Var = new y41(getContext(), vnbVar);
            y41Var.setTextSize(1, f);
            y41Var.setPadding(0, hl.L(9.33f), 0, hl.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(z41Var, 0, spannableString.length(), 33);
            y41Var.setText(spannableString);
            float f2 = (idaVar != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) p66Var.getLayoutParams()).rightMargin = hl.L(f2) + z41Var.a();
            frameLayout.addView(y41Var, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, f2, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cjb
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    p66 p66Var2 = p66.this;
                    if (p66Var2.getLayout() == null || p66Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = p66Var2.getLayout().getLineRight(0) + p66Var2.getPaddingLeft() + p66Var2.getLeft() + hl.L(6.0f);
                    y41Var.setTranslationX(Math.min(0.0f, lineRight - r0.getLeft()));
                }
            });
        }
        if (idaVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = aob.v6;
            yob.s(imageView, i3, vnbVar, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new jy8(charSequence, idaVar, (byte) 29));
            iye.a(imageView);
            hf0 f0 = aob.f0(aob.p1(0.1f, aob.v0(i3, vnbVar)), 7, -1);
            uob K = yob.K(0.1f, i3);
            imageView.setBackground(f0);
            yob.j(imageView, f0, null, K, vnbVar);
            frameLayout.addView(imageView, tre.e(30, 30, 21));
        }
        return l(frameLayout, str);
    }

    public final void k(String str, CharSequence charSequence, int i, ida idaVar) {
        j(str, charSequence, i, idaVar, null, null);
    }

    public final TableRow l(View view, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new gjb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ejb(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
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
        vnb vnbVar = this.a;
        y41 y41Var = new y41(context, vnbVar);
        y41Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        y41Var.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = aob.Fi;
        yob.X(y41Var, i2, vnbVar);
        yob.G(y41Var, i2, vnbVar);
        y41Var.setTextSize(1, 14.0f);
        y41Var.setSingleLine(true);
        y41Var.setDisablePaddingsOffsetY(true);
        gc0 gc0Var = new gc0(24.0f, i, y41Var);
        ImageReceiver imageReceiver = gc0Var.b;
        if (j == 2666000) {
            str4 = ob6.M0(2131744606, null);
            zm2 a = iza.a(44, "anonymous");
            int L = hl.L(16.0f);
            int L2 = hl.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z2 = false;
            z3 = false;
        } else if (lbc.C(j)) {
            str4 = ob6.M0(2131744582, null);
            zm2 a2 = iza.a(44, "fragment");
            int L3 = hl.L(16.0f);
            int L4 = hl.L(16.0f);
            a2.e = L3;
            a2.f = L4;
            imageReceiver.g0(a2);
            z3 = true;
            z2 = false;
        } else {
            if (j >= 0) {
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
                z2 = X1 == null;
                String r = lbc.r(X1);
                gc0Var.e(X1);
                str4 = r;
            } else {
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                if (M0 == null) {
                    str3 = "";
                    z = true;
                } else {
                    str3 = M0.title;
                    z = false;
                }
                gc0Var.b(M0);
                str4 = str3;
                z2 = z;
            }
            z3 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str4));
        spannableStringBuilder.setSpan(gc0Var, 0, 1, 33);
        if (z3) {
            spannableStringBuilder.setSpan(new wk(runnable, (byte) 4), 3, spannableStringBuilder.length(), 33);
        }
        if (str2 != null) {
            y41Var.P = new z41(str2, runnable2, vnbVar);
        }
        y41Var.setText(spannableStringBuilder);
        if (z2) {
            return null;
        }
        return l(y41Var, str);
    }

    public final void n(String str, int i, long j, Runnable runnable) {
        m(str, i, j, runnable, null, null);
    }

    public final TableRow o(String str, final int i, final long j, Runnable runnable) {
        String str2;
        boolean z;
        Context context = getContext();
        vnb vnbVar = this.a;
        final n66 n66Var = new n66(context, vnbVar);
        n66Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
        int i2 = aob.Fi;
        yob.W(n66Var, i2, vnbVar);
        n66Var.setLinkTextColor(aob.v0(i2, vnbVar));
        n66Var.setTextSize(14);
        gc0 gc0Var = new gc0(24.0f, i, n66Var);
        ImageReceiver imageReceiver = gc0Var.b;
        if (j == 2666000) {
            str2 = ob6.M0(2131744606, null);
            zm2 a = iza.a(44, "anonymous");
            int L = hl.L(16.0f);
            int L2 = hl.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z = false;
        } else {
            if (lbc.C(j)) {
                str2 = ob6.M0(2131744582, null);
                zm2 a2 = iza.a(44, "fragment");
                int L3 = hl.L(16.0f);
                int L4 = hl.L(16.0f);
                a2.e = L3;
                a2.f = L4;
                imageReceiver.g0(a2);
            } else if (j >= 0) {
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
                String r = lbc.r(X1);
                gc0Var.e(X1);
                str2 = r;
            } else {
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                String str3 = M0 == null ? "" : M0.title;
                gc0Var.b(M0);
                str2 = str3;
            }
            z = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(gc0Var, 0, 1, 33);
        if (z) {
            n66Var.setClickable(true);
            spannableStringBuilder.setSpan(new wk(runnable, (byte) 3), 3, spannableStringBuilder.length(), 33);
        }
        final int v0 = aob.v0(i2, vnbVar);
        final ul ulVar = new ul(hl.L(20.0f), n66Var);
        ulVar.k(Integer.valueOf(v0));
        ulVar.J = hl.L(12.0f);
        ulVar.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(n66Var);
        this.r.add(ulVar);
        n66Var.addOnAttachStateChangeListener(new fp1(ulVar, (byte) 2));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        pcc pccVar = new pcc() { // from class: djb
            /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
            @Override // pcc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z2;
                long f;
                long j2 = j;
                if (j2 == 2666000 || lbc.C(j2)) {
                    return;
                }
                int i3 = i;
                if (j2 > 0) {
                    TLRPC.User X12 = uc7.s1(i3).X1(Long.valueOf(j2));
                    emojiStatus = X12 != null ? X12.emoji_status : null;
                    if (X12 != null && X12.premium) {
                        z2 = true;
                        f = wf3.f(emojiStatus);
                        ul ulVar2 = ulVar;
                        n66 n66Var2 = n66Var;
                        if (f == 0) {
                            ulVar2.j(f, true);
                            ulVar2.m(wf3.A(emojiStatus), true);
                            n66Var2.i(ulVar2);
                        } else if (z2) {
                            ulVar2.g(mutate, true);
                            ulVar2.m(false, true);
                            n66Var2.i(ulVar2);
                        } else {
                            n66Var2.i(null);
                        }
                        ulVar2.k(Integer.valueOf(v0));
                    }
                } else {
                    TLRPC.Chat M02 = uc7.s1(i3).M0(Long.valueOf(-j2));
                    emojiStatus = M02 != null ? M02.emoji_status : null;
                }
                z2 = false;
                f = wf3.f(emojiStatus);
                ul ulVar22 = ulVar;
                n66 n66Var22 = n66Var;
                if (f == 0) {
                }
                ulVar22.k(Integer.valueOf(v0));
            }
        };
        pccVar.a(null);
        n66Var.i(ulVar);
        jn7.f(i).h(n66Var, 2, pccVar);
        jn7.f(i).h(n66Var, jn7.p5, pccVar);
        n66Var.l(spannableStringBuilder, false);
        return l(n66Var, str);
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
        int i5 = aob.hi;
        vnb vnbVar = this.a;
        paint.setColor(aob.v0(i5, vnbVar));
        paint2.setColor(aob.v0(aob.gi, vnbVar));
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            if (getChildAt(i6) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i6);
                int childCount2 = tableRow.getChildCount();
                int i7 = 0;
                while (i7 < childCount2) {
                    View childAt = tableRow.getChildAt(i7);
                    if (childAt instanceof gjb) {
                        gjb gjbVar = (gjb) childAt;
                        boolean z3 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (gjbVar.b != z3 || gjbVar.c != z2) {
                            gjbVar.b = z3;
                            gjbVar.c = z2;
                            gjbVar.invalidate();
                        }
                    } else if (childAt instanceof ejb) {
                        ejb ejbVar = (ejb) childAt;
                        boolean z4 = i6 == 0;
                        boolean z5 = i6 == childCount + (-1);
                        if (ejbVar.b != z4 || ejbVar.c != z5) {
                            ejbVar.b = z4;
                            ejbVar.c = z5;
                            ejbVar.invalidate();
                        }
                        boolean z6 = i7 == 0;
                        z2 = i7 == childCount2 + (-1);
                        if (ejbVar.d != z6 || ejbVar.e != z2) {
                            ejbVar.d = z6;
                            ejbVar.e = z2;
                            ejbVar.invalidate();
                        }
                    } else if (childAt instanceof fjb) {
                        fjb fjbVar = (fjb) childAt;
                        boolean z7 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (fjbVar.c != z7 || fjbVar.d != z2) {
                            fjbVar.c = z7;
                            fjbVar.d = z2;
                            fjbVar.invalidate();
                        }
                    }
                    i7++;
                }
            }
            i6++;
        }
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.hi;
        vnb vnbVar = this.a;
        this.e.setColor(aob.v0(i, vnbVar));
        this.d.setColor(aob.v0(aob.gi, vnbVar));
        try {
            if (this.n != null && this.r != null) {
                int v0 = aob.v0(aob.Fi, vnbVar);
                for (int i2 = 0; i2 < this.n.size(); i2++) {
                    n66 n66Var = (n66) this.n.get(i2);
                    if (n66Var != null) {
                        n66Var.setLinkTextColor(v0);
                        n66Var.invalidate();
                    }
                }
                for (int i3 = 0; i3 < this.r.size(); i3++) {
                    ul ulVar = (ul) this.r.get(i3);
                    if (ulVar != null) {
                        ulVar.k(Integer.valueOf(v0));
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
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

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
