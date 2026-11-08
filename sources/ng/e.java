package ng;

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
import bi.dd;
import c8.ha;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m.f3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.r1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.xp;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class e extends FrameLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public y I;
    public final f6 J;
    public final f3 K;
    public DecimalFormat L;
    public boolean a;
    public final LinearLayout b;
    public ui.e[] c;
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

    public e(Context context, f6 f6Var) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.w = new SimpleDateFormat("d MMM");
        this.x = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new f3(this, 2);
        this.J = f6Var;
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(g0.o());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(g0.L(12.0f));
        radialProgressView.setStrokeWidth(g0.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, ha.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, ha.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, ha.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, ha.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, ha.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i7 = k6.j5;
        TextView textView = this.d;
        f6 f6Var = this.J;
        r6.V(textView, i7, f6Var);
        r6.V(this.e, i7, f6Var);
        int i10 = k6.Uj;
        r6.t(this.f, i10, f6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(k6.w0(i10, f6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int L = g0.L(4.0f);
        this.I = k6.k0(L, L, L, L, k6.w0(k6.h5, f6Var), k6.w0(k6.i6, f6Var), -16777216);
        xp xpVar = new xp(this.H, this.I, g0.L(3.0f), g0.L(3.0f));
        xpVar.x = true;
        setBackground(xpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i7, long j3, ArrayList arrayList, boolean z9, int i10, float f10) {
        CharSequence charSequence;
        int i11;
        int i12;
        int i13;
        int i14;
        int length = this.c.length;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        if (z9) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z10 = this.a;
        TextView textView = this.d;
        if (z10) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j3)));
        } else {
            if (this.y) {
                textView.setText(this.w.format(new Date(j3)) + " — " + this.s.format(new Date(604800000 + j3)));
            } else {
                Date date = new Date(j3);
                boolean z11 = this.D;
                SimpleDateFormat simpleDateFormat = this.r;
                textView.setText(z11 ? a(simpleDateFormat.format(date)) : a(this.n.format(date)) + a(simpleDateFormat.format(date)));
            }
            if (this.D) {
                this.e.setText(this.x.format(Long.valueOf(j3)));
            }
        }
        long j10 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((f) arrayList.get(i18)).n) {
                j10 += ((f) arrayList.get(i18)).a.a[i7];
            }
        }
        int i19 = 0;
        while (i19 < length) {
            ui.e eVar = this.c[i19];
            int i20 = i19 % 2;
            f fVar = (f) arrayList.get((i10 == i16 || i10 == i15) ? i19 / 2 : i19);
            boolean z12 = fVar.n;
            mg.a aVar = fVar.a;
            if (z12) {
                LinearLayout linearLayout = (LinearLayout) eVar.e;
                TextView textView2 = (TextView) eVar.d;
                TextView textView3 = (TextView) eVar.c;
                q5 q5Var = (q5) eVar.b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i17);
                int i21 = i19;
                long j11 = aVar.a[i7];
                if (i10 == i16) {
                    if (i20 == 0) {
                        if (this.L == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.L = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i14 = 6;
                            this.L.setMaximumFractionDigits(6);
                            this.L.setGroupingUsed(false);
                        } else {
                            i14 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.L;
                        if (j11 > 1000000000) {
                            i14 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i14);
                        charSequence = zd.K("TON " + this.L.format(j11 / 1.0E9d), q5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + r1.i().f((long) (j11 / f10), "USD");
                    }
                } else if (i10 != 2) {
                    float f11 = j11;
                    if (j11 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j11));
                    } else {
                        int i22 = 0;
                        while (f11 >= 1000.0f && i22 < g0.g0.length - 1) {
                            f11 /= 1000.0f;
                            i22++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f11)) + g0.g0[i22];
                    }
                } else if (i20 == 0) {
                    charSequence = dd.a1(false, jg.g.m(j11, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequence = "≈" + r1.i().f((long) (j11 / f10), "USD");
                }
                q5Var.setText(charSequence);
                if (i10 == 1) {
                    textView3.setText(id.a0(null, null, i20 == 0 ? 2131752251 : 2131752250, aVar.d));
                } else if (i10 == 2) {
                    textView3.setText(dd.a1(false, id.a0(null, null, i20 == 0 ? 2131752249 : 2131752250, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i23 = aVar.g;
                f6 f6Var = this.J;
                if (i23 < 0 || !k6.f1(i23)) {
                    q6 q6Var = r6.a;
                    q5Var.setTag(R.id.theme_bind, null);
                    q5Var.setTextColor(k6.D0().q() ? aVar.i : aVar.h);
                } else {
                    r6.V(q5Var, aVar.g, f6Var);
                }
                int i24 = k6.j5;
                r6.V(textView3, i24, f6Var);
                if (!this.E || textView2 == null) {
                    i11 = i21;
                    i12 = 2;
                    i13 = 1;
                } else {
                    textView2.setVisibility(0);
                    r6.V(textView2, i24, f6Var);
                    i11 = i21;
                    float f12 = ((f) arrayList.get(i11)).a.a[i7] / j10;
                    if (f12 >= 0.1f || f12 == 0.0f) {
                        i12 = 2;
                        i13 = 1;
                        Locale locale = Locale.ENGLISH;
                        textView2.setText(Math.round(f12 * 100.0f) + "%");
                    } else {
                        i12 = 2;
                        i13 = 1;
                        textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 * 100.0f), "%"));
                    }
                }
            } else {
                ((LinearLayout) eVar.e).setVisibility(8);
                i13 = i16;
                i11 = i19;
                i12 = i15;
            }
            int i25 = i11 + 1;
            i15 = i12;
            i16 = i13;
            i17 = 0;
            i19 = i25;
        }
        int i26 = i16;
        boolean z13 = this.F;
        ImageView imageView = this.f;
        if (z13) {
            this.G = j10 > 0 ? i26 : 0;
            imageView.setVisibility(j10 > 0 ? 0 : 8);
        } else {
            this.G = false;
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z9, boolean z10) {
        f3 f3Var = this.K;
        if (z9) {
            g0.i3(f3Var, 300L);
            return;
        }
        g0.r(f3Var);
        RadialProgressView radialProgressView = this.h;
        if (z10) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new m.a(this, 2)).start();
        }
    }

    public void setSize(int i7) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new ui.e[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.c[i10] = new ui.e(this);
            linearLayout.addView((LinearLayout) this.c[i10].e);
        }
    }

    public void setUseWeek(boolean z9) {
        this.y = z9;
    }
}
