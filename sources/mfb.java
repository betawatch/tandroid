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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mfb extends TableLayout implements tjb {
    public final wjb a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;
    public ArrayList n;
    public ArrayList r;

    public mfb(Context context, wjb wjbVar) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, gl.L(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = wjbVar;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final kfb a(CharSequence charSequence) {
        wla wlaVar = new wla(getContext());
        int i = bkb.F6;
        wjb wjbVar = this.a;
        zkb.X(wlaVar, i, wjbVar);
        zkb.G(wlaVar, bkb.Wc, wjbVar);
        wlaVar.setTextSize(1, 14.0f);
        wlaVar.setText(vu3.m(charSequence, wlaVar.getPaint().getFontMetricsInt(), false, null, 0));
        kk7.i(wlaVar);
        wlaVar.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        kfb kfbVar = new kfb(this, wlaVar, true);
        tableRow.addView(kfbVar, layoutParams);
        addView(tableRow);
        return kfbVar;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        fm fmVar = new fm(getContext());
        zkb.X(fmVar, bkb.F6, this.a);
        fmVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        k27.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        fmVar.setText(k27.A5(vu3.m(spannableStringBuilder, fmVar.getPaint().getFontMetricsInt(), false, null, 0), arrayList, fmVar.getPaint().getFontMetricsInt(), false));
        kk7.i(fmVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new kfb(this, fmVar, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lfb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jfb(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return f(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        q41 q41Var = new q41(getContext());
        int i = bkb.F6;
        wjb wjbVar = this.a;
        zkb.X(q41Var, i, wjbVar);
        q41Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vu3.m(charSequence, q41Var.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) r41.b(str2, runnable, wjbVar, num));
        }
        q41Var.setText(spannableStringBuilder);
        kk7.i(q41Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lfb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jfb(this, q41Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow f(String str, CharSequence charSequence, lfb[] lfbVarArr, q41[] q41VarArr) {
        q41 q41Var = new q41(getContext());
        zkb.X(q41Var, bkb.F6, this.a);
        q41Var.setTextSize(1, 14.0f);
        q41Var.setText(vu3.m(charSequence, q41Var.getPaint().getFontMetricsInt(), false, null, 0));
        kk7.i(q41Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        lfb lfbVar = new lfb(this, str);
        if (lfbVarArr != null) {
            lfbVarArr[0] = lfbVar;
        }
        tableRow.addView(lfbVar, layoutParams);
        tableRow.addView(new jfb(this, q41Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (q41VarArr != null) {
            q41VarArr[0] = q41Var;
        }
        return tableRow;
    }

    public final void g(int i, String str) {
        long j = i * 1000;
        f(str, k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(j)), k96.D0().o0().format(new Date(j))), null, null);
    }

    public final TableRow h(String str, CharSequence charSequence, Runnable runnable, String str2, alc alcVar) {
        Context context = getContext();
        wjb wjbVar = this.a;
        q41 q41Var = new q41(context, wjbVar);
        q41Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        q41Var.setEllipsize(TextUtils.TruncateAt.END);
        int i = bkb.Wc;
        zkb.X(q41Var, i, wjbVar);
        zkb.G(q41Var, i, wjbVar);
        q41Var.setTextSize(1, 14.0f);
        q41Var.setSingleLine(true);
        q41Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new vk(runnable, (byte) 5), 0, spannableStringBuilder.length(), 33);
        q41Var.setText(spannableStringBuilder);
        if (str2 != null) {
            q41Var.P = new r41(str2, alcVar, wjbVar);
        }
        return l(q41Var, str);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(String str, CharSequence charSequence, int i, t7a t7aVar, String str2, zkc zkcVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final l46 l46Var = new l46(getContext(), null);
        l46Var.setTypeface(gl.n1("fonts/rmono.ttf"));
        float f = i;
        l46Var.setTextSize(1, f);
        int i2 = bkb.i5;
        wjb wjbVar = this.a;
        zkb.X(l46Var, i2, wjbVar);
        l46Var.setMaxLines(4);
        l46Var.setSingleLine(false);
        l46Var.setText(charSequence);
        l46Var.setDisablePaddingsOffsetY(true);
        l46Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(10.66f), gl.L(9.33f));
        frameLayout.addView(l46Var, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str2 != null) {
            r41 r41Var = new r41(str2, zkcVar, wjbVar);
            final q41 q41Var = new q41(getContext(), wjbVar);
            q41Var.setTextSize(1, f);
            q41Var.setPadding(0, gl.L(9.33f), 0, gl.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(r41Var, 0, spannableString.length(), 33);
            q41Var.setText(spannableString);
            float f2 = (t7aVar != null ? 34 : 0) + 12.66f;
            ((FrameLayout.LayoutParams) l46Var.getLayoutParams()).rightMargin = gl.L(f2) + r41Var.a();
            frameLayout.addView(q41Var, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, f2, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hfb
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    l46 l46Var2 = l46.this;
                    if (l46Var2.getLayout() == null || l46Var2.getLayout().getLineCount() <= 0) {
                        return;
                    }
                    float lineRight = l46Var2.getLayout().getLineRight(0) + l46Var2.getPaddingLeft() + l46Var2.getLeft() + gl.L(6.0f);
                    q41Var.setTranslationX(Math.min(0.0f, lineRight - r0.getLeft()));
                }
            });
        }
        if (t7aVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = bkb.u6;
            zkb.s(imageView, i3, wjbVar, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new b99(charSequence, t7aVar, (byte) 26));
            ote.a(imageView);
            ff0 f0 = bkb.f0(bkb.p1(0.1f, bkb.v0(i3, wjbVar)), 7, -1);
            vkb K = zkb.K(0.1f, i3);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, K, wjbVar);
            frameLayout.addView(imageView, nme.e(30, 30, 21));
        }
        return l(frameLayout, str);
    }

    public final void k(String str, CharSequence charSequence, int i, t7a t7aVar) {
        j(str, charSequence, i, t7aVar, null, null);
    }

    public final TableRow l(View view, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new lfb(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new jfb(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
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
        wjb wjbVar = this.a;
        q41 q41Var = new q41(context, wjbVar);
        q41Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        q41Var.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = bkb.Ei;
        zkb.X(q41Var, i2, wjbVar);
        zkb.G(q41Var, i2, wjbVar);
        q41Var.setTextSize(1, 14.0f);
        q41Var.setSingleLine(true);
        q41Var.setDisablePaddingsOffsetY(true);
        ec0 ec0Var = new ec0(24.0f, i, q41Var);
        ImageReceiver imageReceiver = ec0Var.b;
        if (j == 2666000) {
            str4 = k96.M0(2131744712, null);
            fm2 a = eva.a(44, "anonymous");
            int L = gl.L(16.0f);
            int L2 = gl.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z2 = false;
            z3 = false;
        } else if (l7c.C(j)) {
            str4 = k96.M0(2131744688, null);
            fm2 a2 = eva.a(44, "fragment");
            int L3 = gl.L(16.0f);
            int L4 = gl.L(16.0f);
            a2.e = L3;
            a2.f = L4;
            imageReceiver.g0(a2);
            z3 = true;
            z2 = false;
        } else {
            if (j >= 0) {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
                z2 = V1 == null;
                String r = l7c.r(V1);
                ec0Var.e(V1);
                str4 = r;
            } else {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                if (K0 == null) {
                    str3 = "";
                    z = true;
                } else {
                    str3 = K0.title;
                    z = false;
                }
                ec0Var.b(K0);
                str4 = str3;
                z2 = z;
            }
            z3 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str4));
        spannableStringBuilder.setSpan(ec0Var, 0, 1, 33);
        if (z3) {
            spannableStringBuilder.setSpan(new vk(runnable, (byte) 4), 3, spannableStringBuilder.length(), 33);
        }
        if (str2 != null) {
            q41Var.P = new r41(str2, runnable2, wjbVar);
        }
        q41Var.setText(spannableStringBuilder);
        if (z2) {
            return null;
        }
        return l(q41Var, str);
    }

    public final void n(String str, int i, long j, Runnable runnable) {
        m(str, i, j, runnable, null, null);
    }

    public final TableRow o(String str, final int i, final long j, Runnable runnable) {
        String str2;
        boolean z;
        Context context = getContext();
        wjb wjbVar = this.a;
        final j46 j46Var = new j46(context, wjbVar);
        j46Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
        int i2 = bkb.Ei;
        zkb.W(j46Var, i2, wjbVar);
        j46Var.setLinkTextColor(bkb.v0(i2, wjbVar));
        j46Var.setTextSize(14);
        ec0 ec0Var = new ec0(24.0f, i, j46Var);
        ImageReceiver imageReceiver = ec0Var.b;
        if (j == 2666000) {
            str2 = k96.M0(2131744712, null);
            fm2 a = eva.a(44, "anonymous");
            int L = gl.L(16.0f);
            int L2 = gl.L(16.0f);
            a.e = L;
            a.f = L2;
            imageReceiver.g0(a);
            z = false;
        } else {
            if (l7c.C(j)) {
                str2 = k96.M0(2131744688, null);
                fm2 a2 = eva.a(44, "fragment");
                int L3 = gl.L(16.0f);
                int L4 = gl.L(16.0f);
                a2.e = L3;
                a2.f = L4;
                imageReceiver.g0(a2);
            } else if (j >= 0) {
                TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
                String r = l7c.r(V1);
                ec0Var.e(V1);
                str2 = r;
            } else {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
                String str3 = K0 == null ? "" : K0.title;
                ec0Var.b(K0);
                str2 = str3;
            }
            z = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(ec0Var, 0, 1, 33);
        if (z) {
            j46Var.setClickable(true);
            spannableStringBuilder.setSpan(new vk(runnable, (byte) 3), 3, spannableStringBuilder.length(), 33);
        }
        final int v0 = bkb.v0(i2, wjbVar);
        final tl tlVar = new tl(gl.L(20.0f), j46Var);
        tlVar.k(Integer.valueOf(v0));
        tlVar.J = gl.L(12.0f);
        tlVar.K = 0;
        if (this.n == null) {
            this.n = new ArrayList();
            this.r = new ArrayList();
        }
        this.n.add(j46Var);
        this.r.add(tlVar);
        j46Var.addOnAttachStateChangeListener(new ro1(tlVar, (byte) 2));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        zkb.x(this, mutate, i2, wjbVar, PorterDuff.Mode.SRC_IN);
        p8c p8cVar = new p8c() { // from class: ifb
            /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
            @Override // p8c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z2;
                long f;
                long j2 = j;
                if (j2 == 2666000 || l7c.C(j2)) {
                    return;
                }
                int i3 = i;
                if (j2 > 0) {
                    TLRPC.User V12 = na7.q1(i3).V1(Long.valueOf(j2));
                    emojiStatus = V12 != null ? V12.emoji_status : null;
                    if (V12 != null && V12.premium) {
                        z2 = true;
                        f = cf3.f(emojiStatus);
                        tl tlVar2 = tlVar;
                        j46 j46Var2 = j46Var;
                        if (f == 0) {
                            tlVar2.j(f, true);
                            tlVar2.m(cf3.A(emojiStatus), true);
                            j46Var2.i(tlVar2);
                        } else if (z2) {
                            tlVar2.g(mutate, true);
                            tlVar2.m(false, true);
                            j46Var2.i(tlVar2);
                        } else {
                            j46Var2.i(null);
                        }
                        tlVar2.k(Integer.valueOf(v0));
                    }
                } else {
                    TLRPC.Chat K02 = na7.q1(i3).K0(Long.valueOf(-j2));
                    emojiStatus = K02 != null ? K02.emoji_status : null;
                }
                z2 = false;
                f = cf3.f(emojiStatus);
                tl tlVar22 = tlVar;
                j46 j46Var22 = j46Var;
                if (f == 0) {
                }
                tlVar22.k(Integer.valueOf(v0));
            }
        };
        p8cVar.a(null);
        j46Var.i(tlVar);
        kk7.f(i).h(j46Var, 2, p8cVar);
        kk7.f(i).h(j46Var, kk7.o5, p8cVar);
        j46Var.l(spannableStringBuilder, false);
        return l(j46Var, str);
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
        int i5 = bkb.gi;
        wjb wjbVar = this.a;
        paint.setColor(bkb.v0(i5, wjbVar));
        paint2.setColor(bkb.v0(bkb.fi, wjbVar));
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            if (getChildAt(i6) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i6);
                int childCount2 = tableRow.getChildCount();
                int i7 = 0;
                while (i7 < childCount2) {
                    View childAt = tableRow.getChildAt(i7);
                    if (childAt instanceof lfb) {
                        lfb lfbVar = (lfb) childAt;
                        boolean z3 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (lfbVar.b != z3 || lfbVar.c != z2) {
                            lfbVar.b = z3;
                            lfbVar.c = z2;
                            lfbVar.invalidate();
                        }
                    } else if (childAt instanceof jfb) {
                        jfb jfbVar = (jfb) childAt;
                        boolean z4 = i6 == 0;
                        boolean z5 = i6 == childCount + (-1);
                        if (jfbVar.b != z4 || jfbVar.c != z5) {
                            jfbVar.b = z4;
                            jfbVar.c = z5;
                            jfbVar.invalidate();
                        }
                        boolean z6 = i7 == 0;
                        z2 = i7 == childCount2 + (-1);
                        if (jfbVar.d != z6 || jfbVar.e != z2) {
                            jfbVar.d = z6;
                            jfbVar.e = z2;
                            jfbVar.invalidate();
                        }
                    } else if (childAt instanceof kfb) {
                        kfb kfbVar = (kfb) childAt;
                        boolean z7 = i6 == 0;
                        z2 = i6 == childCount + (-1);
                        if (kfbVar.c != z7 || kfbVar.d != z2) {
                            kfbVar.c = z7;
                            kfbVar.d = z2;
                            kfbVar.invalidate();
                        }
                    }
                    i7++;
                }
            }
            i6++;
        }
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.gi;
        wjb wjbVar = this.a;
        this.e.setColor(bkb.v0(i, wjbVar));
        this.d.setColor(bkb.v0(bkb.fi, wjbVar));
        try {
            if (this.n != null && this.r != null) {
                int v0 = bkb.v0(bkb.Ei, wjbVar);
                for (int i2 = 0; i2 < this.n.size(); i2++) {
                    j46 j46Var = (j46) this.n.get(i2);
                    if (j46Var != null) {
                        j46Var.setLinkTextColor(v0);
                        j46Var.invalidate();
                    }
                }
                for (int i3 = 0; i3 < this.r.size(); i3++) {
                    tl tlVar = (tl) this.r.get(i3);
                    if (tlVar != null) {
                        tlVar.k(Integer.valueOf(v0));
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
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

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
