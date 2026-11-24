// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class m26 extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public fg0 J;
    public final ylb K;
    public final o04 L;
    public DecimalFormat M;
    public boolean a;
    public final LinearLayout b;
    public e7a[] c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final RadialProgressView h;
    public final SimpleDateFormat n;
    public final SimpleDateFormat r;
    public final SimpleDateFormat s;
    public final SimpleDateFormat w;
    public final SimpleDateFormat x;
    public boolean y;

    public m26(Context context, ylb ylbVar) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.w = new SimpleDateFormat("d MMM");
        this.x = new SimpleDateFormat(" HH:mm");
        this.H = true;
        this.L = new o04(this, (byte) 20);
        this.K = ylbVar;
        setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(gm.L(12.0f));
        radialProgressView.setStrokeWidth(gm.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, qoe.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, qoe.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, qoe.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, qoe.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, qoe.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i = cmb.i5;
        TextView textView = this.d;
        ylb ylbVar = this.K;
        anb.X(textView, i, ylbVar);
        anb.X(this.e, i, ylbVar);
        int i2 = cmb.Wj;
        anb.s(this.f, i2, ylbVar, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(cmb.v0(i2, ylbVar));
        this.I = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int L = gm.L(4.0f);
        this.J = cmb.i0(L, L, L, L, cmb.v0(cmb.g5, ylbVar), cmb.v0(cmb.h6, ylbVar), -16777216);
        sn2 sn2Var = new sn2(this.I, this.J, gm.L(3.0f), gm.L(3.0f));
        sn2Var.x = true;
        setBackground(sn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, long j, ArrayList arrayList, boolean z, int i2, float f) {
        CharSequence charSequence;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = this.c.length;
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z2 = this.a;
        TextView textView = this.d;
        if (z2) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j)));
        } else {
            if (this.y) {
                textView.setText(this.w.format(new Date(j)) + " — " + this.s.format(new Date(604800000 + j)));
            } else {
                Date date = new Date(j);
                boolean z3 = this.E;
                SimpleDateFormat simpleDateFormat = this.r;
                textView.setText(z3 ? a(simpleDateFormat.format(date)) : a(this.n.format(date)).concat(a(simpleDateFormat.format(date))));
            }
            if (this.E) {
                this.e.setText(this.x.format(Long.valueOf(j)));
            }
        }
        long j2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((l46) arrayList.get(i10)).n) {
                j2 += ((l46) arrayList.get(i10)).a.a[i];
            }
        }
        int i11 = 0;
        while (i11 < length) {
            e7a e7aVar = this.c[i11];
            int i12 = i11 % 2;
            l46 l46Var = (l46) arrayList.get((i2 == i8 || i2 == i7) ? i11 / 2 : i11);
            boolean z4 = l46Var.n;
            ml1 ml1Var = l46Var.a;
            if (z4) {
                LinearLayout linearLayout = (LinearLayout) e7aVar.d;
                TextView textView2 = (TextView) e7aVar.b;
                TextView textView3 = (TextView) e7aVar.c;
                fn fnVar = (fn) e7aVar.a;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i9);
                int i13 = i11;
                long j3 = ml1Var.a[i];
                if (i2 == i8) {
                    if (i12 == 0) {
                        if (this.M == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.M = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i6 = 6;
                            this.M.setMaximumFractionDigits(6);
                            this.M.setGroupingUsed(false);
                        } else {
                            i6 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.M;
                        if (j3 > 1000000000) {
                            i6 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i6);
                        charSequence = ik1.L("TON " + this.M.format(j3 / 1.0E9d), fnVar.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + cj0.h().e((long) (j3 / f), "USD");
                    }
                } else if (i2 != 2) {
                    float f2 = j3;
                    if (j3 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j3));
                    } else {
                        int i14 = 0;
                        while (f2 >= 1000.0f && i14 < gm.g0.length - 1) {
                            f2 /= 1000.0f;
                            i14++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f2)) + gm.g0[i14];
                    }
                } else if (i12 == 0) {
                    charSequence = nxa.b1(false, "XTR ".concat(jb6.E(j3, ' ')), 0.7f, null);
                } else {
                    charSequence = "≈" + cj0.h().e((long) (j3 / f), "USD");
                }
                fnVar.setText(charSequence);
                if (i2 == 1) {
                    textView2.setText(jb6.a0(null, null, i12 == 0 ? 2131752188 : 2131752187, ml1Var.d));
                } else if (i2 == 2) {
                    textView2.setText(nxa.b1(false, jb6.a0(null, null, i12 == 0 ? 2131752186 : 2131752187, ml1Var.d), 0.7f, null));
                } else {
                    textView2.setText(ml1Var.d);
                }
                int i15 = ml1Var.g;
                ylb ylbVar = this.K;
                if (i15 < 0 || !cmb.d1(i15)) {
                    zmb zmbVar = anb.a;
                    fnVar.setTag(R.id.theme_bind, null);
                    fnVar.setTextColor(cmb.B0().o() ? ml1Var.i : ml1Var.h);
                } else {
                    anb.X(fnVar, ml1Var.g, ylbVar);
                }
                int i16 = cmb.i5;
                anb.X(textView2, i16, ylbVar);
                if (!this.F || textView3 == null) {
                    i3 = i13;
                    i4 = 2;
                    i5 = 1;
                } else {
                    textView3.setVisibility(0);
                    anb.X(textView3, i16, ylbVar);
                    i3 = i13;
                    float f3 = ((l46) arrayList.get(i3)).a.a[i] / j2;
                    if (f3 >= 0.1f || f3 == 0.0f) {
                        i4 = 2;
                        i5 = 1;
                        Locale locale = Locale.ENGLISH;
                        textView3.setText(Math.round(f3 * 100.0f) + "%");
                    } else {
                        i4 = 2;
                        i5 = 1;
                        textView3.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f3 * 100.0f), "%"));
                    }
                }
            } else {
                ((LinearLayout) e7aVar.d).setVisibility(8);
                i5 = i8;
                i3 = i11;
                i4 = i7;
            }
            int i17 = i3 + 1;
            i7 = i4;
            i8 = i5;
            i9 = 0;
            i11 = i17;
        }
        int i18 = i8;
        boolean z5 = this.G;
        ImageView imageView = this.f;
        if (z5) {
            this.H = j2 > 0 ? i18 : 0;
            imageView.setVisibility(j2 > 0 ? 0 : 8);
        } else {
            this.H = false;
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z, boolean z2) {
        o04 o04Var = this.L;
        if (z) {
            gm.d3(o04Var, 300L);
            return;
        }
        gm.r(o04Var);
        RadialProgressView radialProgressView = this.h;
        if (z2) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new v85(this, (byte) 12)).start();
        }
    }

    public void setSize(int i) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new e7a[i];
        for (int i2 = 0; i2 < i; i2++) {
            e7a[] e7aVarArr = this.c;
            e7a e7aVar = new e7a();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            e7aVar.d = linearLayout2;
            linearLayout2.setPadding(gm.L(4.0f), gm.L(2.0f), gm.L(4.0f), gm.L(2.0f));
            if (this.F) {
                TextView textView = new TextView(getContext());
                e7aVar.c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = gm.L(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(gm.o());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            e7aVar.b = textView2;
            linearLayout2.addView(textView2, qoe.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            fn fnVar = new fn(getContext());
            e7aVar.a = fnVar;
            linearLayout2.addView(fnVar, qoe.o(-1, -2));
            textView2.setGravity(8388611);
            fnVar.setGravity(8388613);
            fnVar.setTypeface(gm.o());
            fnVar.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            e7aVarArr[i2] = e7aVar;
            linearLayout.addView((LinearLayout) this.c[i2].d);
        }
    }

    public void setUseWeek(boolean z) {
        this.y = z;
    }
}
