package dg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.u1;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.n5;
import org.telegram.ui.le;
import rh.h8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class f extends FrameLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public y I;
    public final p6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean a;
    public final LinearLayout b;
    public ji.f[] c;
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

    public f(Context context, p6 p6Var) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.w = new SimpleDateFormat("d MMM");
        this.x = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 17);
        this.J = p6Var;
        setPadding(i0.L(8.0f), i0.L(8.0f), i0.L(8.0f), i0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(i0.o());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(i0.o());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(i0.L(12.0f));
        radialProgressView.setStrokeWidth(i0.L(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, b6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, b6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, b6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, b6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, b6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i10 = t6.j5;
        TextView textView = this.d;
        p6 p6Var = this.J;
        a7.V(textView, i10, p6Var);
        a7.V(this.e, i10, p6Var);
        int i11 = t6.Uj;
        a7.t(this.f, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        this.h.setProgressColor(t6.w0(i11, p6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int L = i0.L(4.0f);
        this.I = t6.k0(L, L, L, L, t6.w0(t6.h5, p6Var), t6.w0(t6.i6, p6Var), -16777216);
        eq eqVar = new eq(this.H, this.I, i0.L(3.0f), i0.L(3.0f));
        eqVar.x = true;
        setBackground(eqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i10, long j10, ArrayList arrayList, boolean z10, int i11, float f7) {
        CharSequence charSequence;
        int i12;
        int i13;
        int i14;
        int i15;
        int length = this.c.length;
        int i16 = 2;
        int i17 = 1;
        int i18 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z11 = this.a;
        TextView textView = this.d;
        if (z11) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j10)));
        } else {
            if (this.y) {
                textView.setText(this.w.format(new Date(j10)) + " — " + this.s.format(new Date(604800000 + j10)));
            } else {
                Date date = new Date(j10);
                boolean z12 = this.D;
                SimpleDateFormat simpleDateFormat = this.r;
                textView.setText(z12 ? a(simpleDateFormat.format(date)) : a(this.n.format(date)) + a(simpleDateFormat.format(date)));
            }
            if (this.D) {
                this.e.setText(this.x.format(Long.valueOf(j10)));
            }
        }
        long j11 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((g) arrayList.get(i19)).n) {
                j11 += ((g) arrayList.get(i19)).a.a[i10];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            ji.f fVar = this.c[i20];
            int i21 = i20 % 2;
            g gVar = (g) arrayList.get((i11 == i17 || i11 == i16) ? i20 / 2 : i20);
            boolean z13 = gVar.n;
            cg.a aVar = gVar.a;
            if (z13) {
                LinearLayout linearLayout = (LinearLayout) fVar.e;
                TextView textView2 = (TextView) fVar.d;
                TextView textView3 = (TextView) fVar.c;
                n5 n5Var = (n5) fVar.b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j12 = aVar.a[i10];
                if (i11 == i17) {
                    if (i21 == 0) {
                        if (this.L == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.L = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i15 = 6;
                            this.L.setMaximumFractionDigits(6);
                            this.L.setGroupingUsed(false);
                        } else {
                            i15 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.L;
                        if (j12 > 1000000000) {
                            i15 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i15);
                        charSequence = le.K("TON " + this.L.format(j12 / 1.0E9d), n5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + u1.i().f((long) (j12 / f7), "USD");
                    }
                } else if (i11 != 2) {
                    float f10 = j12;
                    if (j12 < 10000) {
                        charSequence = String.format("%d", Long.valueOf(j12));
                    } else {
                        int i23 = 0;
                        while (f10 >= 1000.0f && i23 < i0.g0.length - 1) {
                            f10 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f10)) + i0.g0[i23];
                    }
                } else if (i21 == 0) {
                    charSequence = h8.Z0(false, i0.a.k(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequence = "≈" + u1.i().f((long) (j12 / f7), "USD");
                }
                n5Var.setText(charSequence);
                if (i11 == 1) {
                    textView3.setText(cd.a0(null, null, i21 == 0 ? 2131752251 : 2131752250, aVar.d));
                } else if (i11 == 2) {
                    textView3.setText(h8.Z0(false, cd.a0(null, null, i21 == 0 ? 2131752249 : 2131752250, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                int i24 = aVar.g;
                p6 p6Var = this.J;
                if (i24 < 0 || !t6.f1(i24)) {
                    z6 z6Var = a7.a;
                    n5Var.setTag(R.id.theme_bind, null);
                    n5Var.setTextColor(t6.D0().q() ? aVar.i : aVar.h);
                } else {
                    a7.V(n5Var, aVar.g, p6Var);
                }
                int i25 = t6.j5;
                a7.V(textView3, i25, p6Var);
                if (!this.E || textView2 == null) {
                    i12 = i22;
                    i13 = 2;
                    i14 = 1;
                } else {
                    textView2.setVisibility(0);
                    a7.V(textView2, i25, p6Var);
                    i12 = i22;
                    float f11 = ((g) arrayList.get(i12)).a.a[i10] / j11;
                    if (f11 >= 0.1f || f11 == 0.0f) {
                        i13 = 2;
                        i14 = 1;
                        Locale locale = Locale.ENGLISH;
                        textView2.setText(Math.round(f11 * 100.0f) + "%");
                    } else {
                        i13 = 2;
                        i14 = 1;
                        textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 * 100.0f), "%"));
                    }
                }
            } else {
                ((LinearLayout) fVar.e).setVisibility(8);
                i14 = i17;
                i12 = i20;
                i13 = i16;
            }
            int i26 = i12 + 1;
            i16 = i13;
            i17 = i14;
            i18 = 0;
            i20 = i26;
        }
        int i27 = i17;
        boolean z14 = this.F;
        ImageView imageView = this.f;
        if (z14) {
            this.G = j11 > 0 ? i27 : 0;
            imageView.setVisibility(j11 > 0 ? 0 : 8);
        } else {
            this.G = false;
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z10, boolean z11) {
        androidx.activity.i iVar = this.K;
        if (z10) {
            i0.h3(iVar, 300L);
            return;
        }
        i0.r(iVar);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new bg.e(this, 2)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new ji.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.c[i11] = new ji.f(this);
            linearLayout.addView((LinearLayout) this.c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.y = z10;
    }
}
