package lg;

import ai.md;
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
import com.google.firebase.messaging.r;
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
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ie;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class e extends FrameLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public Drawable H;
    public z I;
    public final d6 J;
    public final androidx.activity.i K;
    public DecimalFormat L;
    public boolean a;
    public final LinearLayout b;
    public r[] c;
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

    public e(Context context, d6 d6Var) {
        super(context);
        this.n = new SimpleDateFormat("E, ");
        this.r = new SimpleDateFormat("MMM dd");
        this.s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.w = new SimpleDateFormat(" HH:mm");
        this.G = true;
        this.K = new androidx.activity.i(this, 23);
        this.J = d6Var;
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
        addView(linearLayout, z5.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, z5.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, z5.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, z5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, z5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i10 = h6.j5;
        d6 d6Var = this.J;
        this.d.setTextColor(h6.w0(i10, d6Var));
        this.e.setTextColor(h6.w0(i10, d6Var));
        int i11 = h6.gj;
        this.f.setColorFilter(h6.w0(i11, d6Var));
        this.h.setProgressColor(h6.w0(i11, d6Var));
        this.H = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.I = h6.j0(dp, dp, dp, dp, h6.w0(h6.h5, d6Var), h6.w0(h6.i6, d6Var), -16777216);
        zq zqVar = new zq(this.H, this.I, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        zqVar.w = true;
        setBackground(zqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i10, long j10, ArrayList arrayList, boolean z10, int i11, float f7) {
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int length = this.c.length;
        int i18 = 2;
        int i19 = 1;
        int i20 = 0;
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
            if (this.x) {
                textView.setText(this.v.format(new Date(j10)) + " — " + this.s.format(new Date(604800000 + j10)));
            } else {
                Date date = new Date(j10);
                boolean z12 = this.y;
                SimpleDateFormat simpleDateFormat = this.r;
                textView.setText(z12 ? a(simpleDateFormat.format(date)) : a(this.n.format(date)) + a(simpleDateFormat.format(date)));
            }
            if (this.y) {
                this.e.setText(this.w.format(Long.valueOf(j10)));
            }
        }
        long j11 = 0;
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            if (((f) arrayList.get(i21)).n) {
                j11 += ((f) arrayList.get(i21)).a.a[i10];
            }
        }
        int i22 = 0;
        while (i22 < length) {
            r rVar = this.c[i22];
            int i23 = i22 % 2;
            f fVar = (f) arrayList.get((i11 == i19 || i11 == i18) ? i22 / 2 : i22);
            boolean z13 = fVar.n;
            kg.a aVar = fVar.a;
            if (z13) {
                LinearLayout linearLayout = (LinearLayout) rVar.e;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) rVar.b;
                TextView textView2 = (TextView) rVar.d;
                TextView textView3 = (TextView) rVar.c;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i20);
                int i24 = i22;
                long j12 = aVar.a[i10];
                if (i11 == i19) {
                    if (i23 == 0) {
                        if (this.L == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.L = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            i17 = 6;
                            this.L.setMaximumFractionDigits(6);
                            this.L.setGroupingUsed(false);
                        } else {
                            i17 = 6;
                        }
                        DecimalFormat decimalFormat2 = this.L;
                        if (j12 > 1000000000) {
                            i17 = 2;
                        }
                        decimalFormat2.setMaximumFractionDigits(i17);
                        charSequence = ie.f0("TON " + this.L.format(j12 / 1.0E9d), z5Var.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f7), "USD");
                    }
                } else if (i11 != 2) {
                    float f10 = j12;
                    if (j12 < 10000) {
                        i12 = 1;
                        charSequence = String.format("%d", Long.valueOf(j12));
                    } else {
                        i12 = 1;
                        int i25 = 0;
                        while (f10 >= 1000.0f && i25 < AndroidUtilities.numbersSignatureArray.length - 1) {
                            f10 /= 1000.0f;
                            i25++;
                        }
                        charSequence = String.format("%.2f", Float.valueOf(f10)) + AndroidUtilities.numbersSignatureArray[i25];
                    }
                    z5Var.setText(charSequence);
                    if (i11 != i12) {
                        int i26 = i23 == 0 ? R.string.ChartInTON : R.string.ChartInUSD;
                        Object[] objArr = new Object[i12];
                        objArr[0] = aVar.d;
                        textView3.setText(LocaleController.formatString(i26, objArr));
                    } else if (i11 == 2) {
                        textView3.setText(md.Y0(false, LocaleController.formatString(i23 == 0 ? R.string.ChartInXTR : R.string.ChartInUSD, aVar.d), 0.7f, null));
                    } else {
                        textView3.setText(aVar.d);
                    }
                    i13 = aVar.g;
                    d6 d6Var = this.J;
                    if (i13 >= 0 || !h6.d1(i13)) {
                        z5Var.setTextColor(!h6.B0().q() ? aVar.i : aVar.h);
                    } else {
                        z5Var.setTextColor(h6.w0(aVar.g, d6Var));
                    }
                    int i27 = h6.j5;
                    textView3.setTextColor(h6.w0(i27, d6Var));
                    if (this.E || textView2 == null) {
                        i14 = i24;
                        i15 = 2;
                        i16 = 1;
                    } else {
                        textView2.setVisibility(0);
                        textView2.setTextColor(h6.w0(i27, d6Var));
                        i14 = i24;
                        float f11 = ((f) arrayList.get(i14)).a.a[i10] / j11;
                        if (f11 >= 0.1f || f11 == 0.0f) {
                            i15 = 2;
                            i16 = 1;
                            Locale locale = Locale.ENGLISH;
                            textView2.setText(Math.round(f11 * 100.0f) + "%");
                        } else {
                            i15 = 2;
                            i16 = 1;
                            textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 * 100.0f), "%"));
                        }
                    }
                } else if (i23 == 0) {
                    charSequence = md.Y0(false, g0.h(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequence = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f7), "USD");
                }
                i12 = 1;
                z5Var.setText(charSequence);
                if (i11 != i12) {
                }
                i13 = aVar.g;
                d6 d6Var2 = this.J;
                if (i13 >= 0) {
                }
                z5Var.setTextColor(!h6.B0().q() ? aVar.i : aVar.h);
                int i272 = h6.j5;
                textView3.setTextColor(h6.w0(i272, d6Var2));
                if (this.E) {
                }
                i14 = i24;
                i15 = 2;
                i16 = 1;
            } else {
                ((LinearLayout) rVar.e).setVisibility(8);
                i16 = i19;
                i14 = i22;
                i15 = i18;
            }
            int i28 = i14 + 1;
            i18 = i15;
            i19 = i16;
            i20 = 0;
            i22 = i28;
        }
        int i29 = i19;
        boolean z14 = this.F;
        ImageView imageView = this.f;
        if (z14) {
            this.G = j11 > 0 ? i29 : 0;
            imageView.setVisibility(j11 > 0 ? 0 : 8);
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
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ah.b(this, 29)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        this.c = new r[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.c[i11] = new r(this);
            linearLayout.addView((LinearLayout) this.c[i11].e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.x = z10;
    }
}
