package jg;

import android.content.Context;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.x5;
import org.telegram.ui.le;
import w7.a6;
import xh.z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final f6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean a;
    public final LinearLayout b;
    public ki.f[] c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final RadialProgressView h;
    public final SimpleDateFormat n;
    public final SimpleDateFormat r;
    public final SimpleDateFormat s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat w;
    public boolean x;
    public boolean y;

    public e(Context context, f6 f6Var) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 20);
        this.J = f6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, a6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, a6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, a6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, a6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, a6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i10 = j6.j5;
        f6 f6Var = this.J;
        this.d.setTextColor(j6.v0(i10, f6Var));
        this.e.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.gj;
        this.f.setColorFilter(j6.v0(i11, f6Var));
        this.h.setProgressColor(j6.v0(i11, f6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = j6.i0(dp, dp, dp, dp, j6.v0(j6.h5, f6Var), j6.v0(j6.i6, f6Var), -16777216);
        vq vqVar = new vq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        vqVar.w = true;
        setBackground(vqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, long j3, ArrayList arrayList, boolean z10, int i11, float f7) {
        int i12;
        CharSequence charSequence;
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
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j3)));
        } else {
            if (this.x) {
                textView.setText(this.v.format(new Date(j3)) + " — " + this.s.format(new Date(604800000 + j3)));
            } else {
                Date date = new Date(j3);
                boolean z12 = this.y;
                SimpleDateFormat simpleDateFormat = this.r;
                textView.setText(z12 ? a(simpleDateFormat.format(date)) : a(this.n.format(date)) + a(simpleDateFormat.format(date)));
            }
            if (this.y) {
                this.e.setText(this.w.format(Long.valueOf(j3)));
            }
        }
        long j10 = 0;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            if (((f) arrayList.get(i19)).n) {
                j10 += ((f) arrayList.get(i19)).a.a[i10];
            }
        }
        int i20 = 0;
        while (i20 < length) {
            ki.f fVar = this.c[i20];
            int i21 = i20 % 2;
            f fVar2 = (f) arrayList.get((i11 == i17 || i11 == i16) ? i20 / 2 : i20);
            boolean z13 = fVar2.n;
            ig.a aVar = fVar2.a;
            if (z13) {
                LinearLayout linearLayout = (LinearLayout) fVar.d;
                x5 x5Var = (x5) fVar.a;
                TextView textView2 = (TextView) fVar.c;
                TextView textView3 = (TextView) fVar.b;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i18);
                int i22 = i20;
                long j11 = aVar.a[i10];
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
                        if (j11 > 1000000000) {
                            i15 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i15);
                        charSequence = le.f0("TON " + this.L.format(j11 / 1.0E9d), x5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j11 / f7), "USD");
                    }
                } else if (i11 != 2) {
                    float f10 = j11;
                    if (j11 < 10000) {
                        i12 = 1;
                        charSequence = String.format("%d", Long.valueOf(j11));
                    } else {
                        i12 = 1;
                        int i23 = 0;
                        while (f10 >= 1000.0f && i23 < AndroidUtilities.numbersSignatureArray.length - 1) {
                            f10 /= 1000.0f;
                            i23++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f10)) + AndroidUtilities.numbersSignatureArray[i23];
                    }
                    x5Var.setText(charSequence);
                    if (i11 != i12) {
                        int i24 = i21 == 0 ? R.string.ChartInTON : R.string.ChartInUSD;
                        Object[] objArr = new Object[i12];
                        objArr[0] = aVar.d;
                        textView3.setText(LocaleController.formatString(i24, objArr));
                    } else if (i11 == 2) {
                        textView3.setText(z7.X0(false, LocaleController.formatString(i21 == 0 ? R.string.ChartInXTR : R.string.ChartInUSD, aVar.d), 0.7f, null));
                    } else {
                        textView3.setText(aVar.d);
                    }
                    i13 = aVar.g;
                    f6 f6Var = this.J;
                    if (i13 >= 0 || !j6.c1(i13)) {
                        x5Var.setTextColor(!j6.A0().q() ? aVar.i : aVar.h);
                    } else {
                        x5Var.setTextColor(j6.v0(aVar.g, f6Var));
                    }
                    int i25 = j6.j5;
                    textView3.setTextColor(j6.v0(i25, f6Var));
                    if (this.E || textView2 == null) {
                        i14 = i22;
                    } else {
                        textView2.setVisibility(0);
                        textView2.setTextColor(j6.v0(i25, f6Var));
                        i14 = i22;
                        float f11 = ((f) arrayList.get(i14)).a.a[i10] / j10;
                        if (f11 >= 0.1f || f11 == 0.0f) {
                            Locale locale = Locale.ENGLISH;
                            textView2.setText(Math.round(f11 * 100.0f) + "%");
                        } else {
                            textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 * 100.0f), "%"));
                        }
                        i20 = i14 + 1;
                        i16 = 2;
                        i17 = 1;
                        i18 = 0;
                    }
                } else if (i21 == 0) {
                    charSequence = z7.X0(false, hc.b.l(j11, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j11 / f7), "USD");
                }
                i12 = 1;
                x5Var.setText(charSequence);
                if (i11 != i12) {
                }
                i13 = aVar.g;
                f6 f6Var2 = this.J;
                if (i13 >= 0) {
                }
                x5Var.setTextColor(!j6.A0().q() ? aVar.i : aVar.h);
                int i252 = j6.j5;
                textView3.setTextColor(j6.v0(i252, f6Var2));
                if (this.E) {
                }
                i14 = i22;
            } else {
                ((LinearLayout) fVar.d).setVisibility(8);
                i14 = i20;
            }
            i20 = i14 + 1;
            i16 = 2;
            i17 = 1;
            i18 = 0;
        }
        boolean z14 = this.F;
        ImageView imageView = this.f;
        if (z14) {
            this.G = j10 > 0;
            imageView.setVisibility(j10 > 0 ? 0 : 8);
        } else {
            this.G = false;
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z10, boolean z11) {
        androidx.activity.i iVar = this.K;
        if (z10) {
            AndroidUtilities.runOnUIThread(iVar, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(iVar);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new bi.h(this, 13)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new ki.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            ki.f[] fVarArr = this.c;
            ki.f fVar = new ki.f();
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            fVar.d = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            if (this.E) {
                TextView textView = new TextView(getContext());
                fVar.c = textView;
                linearLayout2.addView(textView);
                textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
                textView.setVisibility(8);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(getContext());
            fVar.b = textView2;
            linearLayout2.addView(textView2, a6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
            x5 x5Var = new x5(getContext());
            fVar.a = x5Var;
            linearLayout2.addView(x5Var, a6.n(-1, -2));
            textView2.setGravity(8388611);
            x5Var.setGravity(8388613);
            x5Var.setTypeface(AndroidUtilities.bold());
            x5Var.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
            fVarArr[i11] = fVar;
            linearLayout.addView((LinearLayout) this.c[i11].d);
        }
    }

    public void setUseWeek(boolean z10) {
        this.x = z10;
    }
}
