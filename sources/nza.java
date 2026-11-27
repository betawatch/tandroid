// default package

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nza extends m15 implements fn7 {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public it4 T;
    public mza U;
    public wka V;
    public nf9 W;
    public View X;
    public fm0 Y;
    public fm0 Z;
    public fm0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public nf9 h0;
    public tj4 i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public in l0;
    public TextView m0;
    public c51 n0;
    public d26 o0;
    public c51 p0;
    public oob q0;
    public c51 r0;
    public c51 s0;
    public boolean t0;
    public boolean u0;
    public wb v0;
    public int b0 = -1;
    public final uoa g0 = new uoa((Object) this, (byte) 10);

    public nza() {
        this.N = true;
    }

    public static void C0(hjb hjbVar, int i, TL_stars.StarGift starGift, vnb vnbVar) {
        TextView textView = (TextView) ((ejb) hjbVar.f(ob6.M0(2131750261, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ya6 ya6Var = new ya6(textView, hl.L(90.0f), 0, vnbVar);
        ya6Var.a(aob.p1(0.21f, textView.getPaint().getColor()), aob.p1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ya6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
            int i2 = starGift.availability_remains;
            if (z) {
                textView.setText(i2 <= 0 ? ob6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total) : ob6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(ob6.H(',', "Gift2QuantityIssued2", starGift.availability_total)));
                return;
            } else {
                int i3 = starGift.availability_total;
                textView.setText(i2 <= 0 ? ob6.H(',', "Gift2Availability2ValueNone", i3) : ob6.K("Gift2Availability4Value", i2, ',', ob6.E(i3, ',')));
                return;
            }
        }
        final jxa v = jxa.v(i, false);
        final long j = starGift.id;
        final sh9 sh9Var = new sh9(textView, (byte) 12);
        final boolean[] zArr = {false};
        final fn7[] fn7VarArr = new fn7[1];
        fn7VarArr[0] = new fn7() { // from class: vwa
            @Override // fn7
            public final void didReceivedNotification(int i4, int i5, Object[] objArr) {
                int i6;
                jxa jxaVar;
                TL_stars.StarGift G;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i4 != (i6 = jn7.H3) || (G = (jxaVar = jxa.this).G(j)) == null) {
                    return;
                }
                zArr2[0] = true;
                jn7.f(jxaVar.a).n(fn7VarArr[0], i6);
                sh9Var.a(G);
            }
        };
        int i4 = v.a;
        jn7 f = jn7.f(i4);
        fn7 fn7Var = fn7VarArr[0];
        int i5 = jn7.H3;
        f.a(fn7Var, i5);
        TL_stars.StarGift G = v.G(j);
        if (G != null) {
            zArr[0] = true;
            jn7.f(i4).n(fn7VarArr[0], i5);
            sh9Var.a(G);
        }
    }

    public static void D0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new sya(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder G0(TL_stars.StarsAmount starsAmount) {
        return H0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        if (x0 == null) {
            x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j = starsAmount.amount;
            if (j % 1000000000 == 0) {
                spannableStringBuilder.append((CharSequence) (starsAmount.negative() ? "-" : "").concat(ob6.E(Math.abs(starsAmount.amount / 1000000000), c)));
                return spannableStringBuilder;
            }
            String format = x0.format(j / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j2 = starsAmount.amount;
            int i2 = starsAmount.nanos;
            boolean z = false;
            if (i2 < 0 && j2 > 0) {
                i = -1;
                d = 1.0E9d;
            } else if (i2 <= 0 || j2 >= 0) {
                d = 1.0E9d;
                i = 0;
            } else {
                d = 1.0E9d;
                i = 1;
            }
            long j3 = i + j2;
            if (j2 != 0 ? j2 < 0 : i2 < 0) {
                z = true;
            }
            if (i2 == 0) {
                spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(ob6.E(Math.abs(j3), c)));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(ob6.E(Math.abs(j3), c)));
            DecimalFormat decimalFormat = x0;
            int i3 = starsAmount.nanos;
            double d2 = i3;
            if (i3 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        if (x0 == null) {
            x0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = x0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j = starsAmount.amount;
            int i2 = starsAmount.nanos;
            if (i2 < 0 && j > 0) {
                i = -1;
                d = 1.0E9d;
            } else if (i2 <= 0 || j >= 0) {
                d = 1.0E9d;
                i = 0;
            } else {
                d = 1.0E9d;
                i = 1;
            }
            long j2 = i + j;
            boolean z = j != 0 ? j < 0 : i2 < 0;
            if (Math.abs(j2) > 1000 || starsAmount.nanos == 0) {
                if (starsAmount.amount <= 1000) {
                    spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(ob6.E(Math.abs(j2), c)));
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append((CharSequence) ((z ? "-" : "") + hl.o0((int) Math.abs(j2), 0)));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(ob6.E(Math.abs(j2), c)));
            DecimalFormat decimalFormat = x0;
            int i3 = starsAmount.nanos;
            double d2 = i3;
            if (i3 < 0) {
                d2 += d;
            }
            String format2 = decimalFormat.format(d2 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                String substring = format2.substring(indexOf2);
                if (substring.length() > 1) {
                    spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f), length + 1, spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            DecimalFormat decimalFormat = x0;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
                x0 = decimalFormat;
            }
            String format = decimalFormat.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = starsAmount.amount;
        int i2 = starsAmount.nanos;
        boolean z = false;
        if (i2 < 0 && j > 0) {
            i = -1;
            d = 1.0E9d;
        } else if (i2 <= 0 || j >= 0) {
            d = 1.0E9d;
            i = 0;
        } else {
            d = 1.0E9d;
            i = 1;
        }
        long j2 = i + j;
        if (j != 0 ? j < 0 : i2 < 0) {
            z = true;
        }
        if (i2 == 0) {
            spannableStringBuilder.append((CharSequence) ob6.H(',', "Stars", (int) j));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(ob6.E(Math.abs(j2), ',')));
        DecimalFormat decimalFormat2 = x0;
        if (decimalFormat2 == null) {
            decimalFormat2 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            x0 = decimalFormat2;
        }
        int i3 = starsAmount.nanos;
        double d2 = i3;
        if (i3 < 0) {
            d2 += d;
        }
        String format2 = decimalFormat2.format(d2 / d);
        int indexOf2 = format2.indexOf(".");
        if (indexOf2 >= 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131744741, null));
        return spannableStringBuilder;
    }

    public static String K0(long j) {
        DecimalFormat decimalFormat = w0;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
            w0 = decimalFormat;
        }
        if (j % 1000000000 != 0) {
            return decimalFormat.format(j / 1.0E9d);
        }
        return (j < 0 ? "-" : "").concat(ob6.E(Math.abs(j / 1000000000), ','));
    }

    public static String L0(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        int i2;
        if (starsTransaction.stargift_drop_original_details) {
            return ob6.M0(2131744589, null);
        }
        if (starsTransaction.posts_search) {
            return ob6.M0(2131744593, null);
        }
        if (starsTransaction.premium_gift) {
            return ob6.M0(2131744592, null);
        }
        if (starsTransaction.phonegroup_message) {
            return ob6.M0(starsTransaction.reaction ? 2131744601 : 2131744602, null);
        }
        if (starsTransaction.paid_message) {
            return ob6.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return ob6.M0(2131744616, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return ob6.M0(2131744861, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i3 = starsTransaction.flags;
        if ((131072 & i3) == 0 && (65536 & i3) != 0) {
            return ob6.a0(null, null, 2131744818, cc.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return ob6.M0(2131749876, null);
            }
            boolean z2 = starsTransaction.refund;
            boolean z3 = starsTransaction.stargift_auction_bid;
            if (z2) {
                return ob6.M0(z3 ? 2131749875 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749872 : 2131749873 : 2131749874, null);
            }
            return ob6.M0(z3 ? 2131749878 : starsAmount.amount > 0 ? 2131749877 : starsTransaction.stargift_upgrade ? 2131749869 : 2131749870, null);
        }
        if (starsTransaction.subscription) {
            int i4 = starsTransaction.subscription_period;
            if (i4 == 2592000) {
                return ob6.M0(2131744820, null);
            }
            if (i4 == 300) {
                return "5-minute subscription fee";
            }
            if (i4 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i3 & TLObject.FLAG_13) != 0) {
            return ob6.M0(2131744750, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return ob6.M0(lbc.D(uc7.s1(i).X1(Long.valueOf(wf3.n(starsTransaction.sent_by)))) ? 2131744758 : 2131744759, null);
            }
            return ob6.M0(2131744759, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long n = wf3.n(starsTransaction.peer.peer);
        if (n != 0) {
            int i5 = yac.t0;
            if (n >= 0) {
                return lbc.r(uc7.s1(i5).X1(Long.valueOf(n)));
            }
            TLRPC.Chat M0 = uc7.s1(i5).M0(Long.valueOf(-n));
            return M0 == null ? "" : M0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? ob6.M0(2131744618, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? ob6.M0(2131744619, null) : ob6.M0(2131744580, null);
        }
        if (!z) {
            boolean z4 = starsTransaction.refund;
            TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
            if (!z4 ? !starsAmount2.negative() : !starsAmount2.positive()) {
                i2 = 2131744608;
                return ob6.M0(i2, null);
            }
        }
        i2 = 2131744578;
        return ob6.M0(i2, null);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f) {
        return S0(charSequence, f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f, float f2, float f3) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        wm2 wm2Var = new wm2(R.drawable.diamond, 0);
        wm2Var.d = false;
        wm2Var.r = 0.0f;
        wm2Var.s = f2;
        wm2Var.H = f3;
        wm2Var.I = f;
        wm2Var.J = f;
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "💎", "💎️");
        hl.I2(spannableStringBuilder, "💎", "💎 ");
        hl.I2(spannableStringBuilder, spannableString, "💎");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f, wm2[] wm2VarArr) {
        return Y0(false, charSequence, f, wm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z) {
        return X0(z, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z, CharSequence charSequence, float f, wm2[] wm2VarArr) {
        return Y0(z, charSequence, f, wm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z, CharSequence charSequence, float f, wm2[] wm2VarArr, float f2, float f3) {
        wm2 wm2Var;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z ? "TON" : "⭐").concat(" "));
        if (wm2VarArr == null || (wm2Var = wm2VarArr[0]) == null) {
            wm2Var = new wm2(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (wm2VarArr != null) {
                wm2VarArr[0] = wm2Var;
            }
        }
        wm2Var.r = 0.0f;
        wm2Var.s = f2;
        wm2Var.H = f3;
        if (z) {
            wm2Var.d = false;
            float f4 = f * 0.2f;
            wm2Var.I = f4;
            wm2Var.J = f4;
        } else {
            wm2Var.I = f;
            wm2Var.J = f;
        }
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "⭐", "⭐️");
        hl.I2(spannableStringBuilder, "⭐", "⭐ ");
        hl.I2(spannableStringBuilder, spannableString, "⭐");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z, String str, wm2[] wm2VarArr) {
        wm2 wm2Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (wm2VarArr == null || (wm2Var = wm2VarArr[0]) == null) {
            wm2Var = new wm2(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f = z ? 0.222f : 1.13f;
            wm2Var.I = f;
            wm2Var.J = f;
        }
        if (z) {
            wm2Var.d = false;
        }
        if (wm2VarArr != null) {
            wm2VarArr[0] = wm2Var;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "⭐", "⭐️");
        hl.I2(spannableStringBuilder, "⭐", "⭐ ");
        hl.I2(spannableStringBuilder, spannableString, "⭐");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, wm2[] wm2VarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, wm2VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannableStringBuilder b1(boolean z, CharSequence charSequence, float f, wm2[] wm2VarArr) {
        int i;
        String str;
        wm2 wm2Var;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        if (z) {
            str = "TON";
            i = R.drawable.mini_gram_72;
        } else {
            i = R.drawable.star_small_inner;
            str = "⭐";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (wm2VarArr != null) {
            wm2Var = wm2VarArr[0];
            if (wm2Var == null) {
                if (wm2VarArr.length > 0) {
                    wm2Var = new wm2(i, 0);
                    wm2VarArr[0] = wm2Var;
                }
            }
            wm2Var.d = false;
            if (z) {
                f *= 0.33f;
            }
            wm2Var.I = f;
            wm2Var.J = f;
            spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
            hl.I2(spannableStringBuilder, "⭐", "⭐️");
            hl.I2(spannableStringBuilder, "⭐", "⭐ ");
            hl.I2(spannableStringBuilder, spannableString, "⭐");
            hl.I2(spannableStringBuilder, "XTR", "XTR ");
            hl.I2(spannableStringBuilder, spannableString, "XTR");
            return spannableStringBuilder;
        }
        wm2Var = new wm2(i, 0);
        wm2Var.d = false;
        if (z) {
        }
        wm2Var.I = f;
        wm2Var.J = f;
        spannableString.setSpan(wm2Var, 0, spannableString.length() - 1, 33);
        hl.I2(spannableStringBuilder, "⭐", "⭐️");
        hl.I2(spannableStringBuilder, "⭐", "⭐ ");
        hl.I2(spannableStringBuilder, spannableString, "⭐");
        hl.I2(spannableStringBuilder, "XTR", "XTR ");
        hl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static gya c1(de0 de0Var, ImageReceiver imageReceiver, String str, boolean z) {
        final byte b = 1;
        int i = imageReceiver.d;
        final hk3 hk3Var = new hk3(z, i, str, imageReceiver, new boolean[1]);
        hk3Var.run();
        final byte b2 = 0;
        return new gya(jn7.f(i).h(de0Var, z ? jn7.Z2 : jn7.Y2, new pcc() { // from class: fya
            @Override // pcc
            public final void a(Object obj) {
                byte b3 = b2;
                hk3 hk3Var2 = hk3Var;
                switch (b3) {
                    case 0:
                        hk3Var2.run();
                        break;
                    default:
                        hk3Var2.run();
                        break;
                }
            }
        }), jn7.f(i).h(de0Var, jn7.y0, new pcc() { // from class: fya
            @Override // pcc
            public final void a(Object obj) {
                byte b3 = b;
                hk3 hk3Var2 = hk3Var;
                switch (b3) {
                    case 0:
                        hk3Var2.run();
                        break;
                    default:
                        hk3Var2.run();
                        break;
                }
            }
        }), b2);
    }

    public static void d1(de0 de0Var, ImageReceiver imageReceiver, long j) {
        c1(de0Var, imageReceiver, j <= 1000 ? "2⃣" : j < 2500 ? "3⃣" : "4⃣", false);
    }

    public static void e1(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = xb4.w(document.thumbs, i, false, null, false);
        imageReceiver.Z(jn5.b(document), qd4.m(i, i, "_"), jn5.c(w, document), qd4.m(i, i, "_"), lp3.d(document.thumbs, aob.a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void f1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i) {
        e1(imageReceiver, starGift == null ? null : starGift.getDocument(), i);
    }

    public static gya g1(de0 de0Var, ImageReceiver imageReceiver, int i) {
        return c1(de0Var, imageReceiver, i != 3 ? i != 6 ? i != 12 ? i != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void h1(de0 de0Var, ImageReceiver imageReceiver, long j) {
        c1(de0Var, imageReceiver, j <= 10000000000L ? "2⃣" : j <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void i1(Context context, int i, long j, TL_stories.Boost boost, vnb vnbVar) {
        int i2;
        if (context == null) {
            return;
        }
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(0, hl.L(20.0f), 0, hl.L(4.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j2.addView(frameLayout, tre.t(-1, jn7.f2, 7, 0, 0, 0, 10));
        uya uyaVar = new uya(context, 70, 0);
        frameLayout.addView(uyaVar, tre.c(-1.0f, -1));
        it4 it4Var = new it4(context, 1, 2);
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        it4Var.setStarParticlesView(uyaVar);
        frameLayout.addView(it4Var, tre.d(jn7.z2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        it4Var.setPaused(false);
        TextView textView = new TextView(context);
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        byte b = 17;
        textView.setGravity(17);
        nx0[] nx0VarArr = new nx0[1];
        textView.setText(ob6.H(' ', "BoostStars", (int) boost.stars));
        TextView m = ik8.m(j2, textView, tre.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setBackground(aob.b0(hl.L(20.0f), -6915073));
        m.setTextColor(-1);
        m.setTextSize(1, 11.33f);
        m.setPadding(hl.L(4.0f), 0, hl.L(8.33f), 0);
        m.setGravity(17);
        m.setTypeface(hl.o());
        int i3 = boost.multiplier;
        if (i3 == 0) {
            i3 = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x".concat(ob6.H(' ', "BoostingBoostsCount", i3)));
        wm2 wm2Var = new wm2(R.drawable.mini_boost_badge, 2);
        float L = hl.L(0.66f);
        wm2Var.r = 0.0f;
        wm2Var.s = L;
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
        m.setText(spannableStringBuilder);
        j2.addView(m, tre.t(-2, 20, 17, 20, 4, 20, 4));
        hjb hjbVar = new hjb(context, vnbVar);
        hjbVar.n(ob6.M0(2131753620, null), i, j, new rxa(nx0VarArr, j, (byte) 6));
        hjbVar.f(ob6.M0(2131753619, null), ob6.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = ob6.M0(2131753608, null);
            String M02 = ob6.M0(2131753607, null);
            i2 = 1;
            cq6 cq6Var = new cq6((Object) nx0VarArr, j, (Object) boost, (byte) 28);
            nx0VarArr = nx0VarArr;
            hjbVar.i(M0, M02, cq6Var);
        } else {
            i2 = 1;
        }
        String M03 = ob6.M0(2131753655, null);
        String format = ob6.D0().r0().format(new Date(boost.date * 1000));
        String format2 = ob6.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[0] = format;
        objArr[i2] = format2;
        hjbVar.f(M03, ob6.a0(null, null, 2131742414, objArr), null, null);
        String M04 = ob6.M0(2131753600, null);
        String format3 = ob6.D0().r0().format(new Date(boost.expires * 1000));
        String format4 = ob6.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[0] = format3;
        objArr2[i2] = format4;
        hjbVar.f(M04, ob6.a0(null, null, 2131742414, objArr2), null, null);
        j2.addView(hjbVar, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        p66 p66Var = new p66(context, vnbVar);
        yob.X(p66Var, aob.z6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setTextSize(i2, 14.0f);
        p66Var.setText(hl.N2(ob6.M0(2131744583, null), -1, 0, new xf1(context, b), null));
        p66Var.setGravity(17);
        j2.addView(p66Var, tre.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.i(ob6.M0(2131747558, null), false, true);
        c51Var.setOnClickListener(new g5(nx0VarArr, (byte) 5));
        j2.addView(c51Var, tre.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        h.O = j2;
        nx0VarArr[0] = h;
        h.T0 = false;
        h.J();
        e S = LaunchActivity.S();
        if (!hl.O1() && !hl.s1(S)) {
            nx0VarArr[0].X(S);
        }
        it4Var.setPaused(false);
        nx0VarArr[0].show();
        nx0VarArr[0].n(new uoa((Object) it4Var, (byte) 11));
    }

    public static h4a j1(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, icc iccVar, vnb vnbVar) {
        pj pjVar = pj.a;
        h4a h4aVar = new h4a(context, vnbVar, i, tL_starGiftUnique == null ? oj.h(uc7.s1(i).l4.o.f(), pjVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(pj.b) : tL_starGiftUnique.getResellAmount(pjVar), new ku9(iccVar, r8, (byte) 12));
        h4a[] h4aVarArr = {h4aVar};
        h4aVar.show();
        return h4aVarArr[0];
    }

    public static void k1(Context context, long j, boolean z, final icc iccVar, vnb vnbVar) {
        nx0[] nx0VarArr;
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        c51 c51Var = null;
        textView.setText(ob6.M0(2131747459, null));
        textView.setTextSize(1, 20.0f);
        int i = aob.G6;
        yob.X(textView, i, vnbVar);
        linearLayout.addView(textView, tre.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        lu7 lu7Var = new lu7(context, vnbVar);
        lu7Var.setForceForceUseCenter(true);
        lu7Var.setText(ob6.M0(2131747460, null));
        lu7Var.setLeftPadding(hl.L(36.0f));
        yob.X(editTextBoldCursor, i, vnbVar);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = hl.L(16.0f);
        editTextBoldCursor.setPadding(hl.L(6.0f), L, L, L);
        byte b = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        yob.C(editTextBoldCursor, aob.lg, vnbVar);
        yob.l(editTextBoldCursor, 36, aob.mg, vnbVar);
        editTextBoldCursor.setGravity(ob6.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new rt0(lu7Var, editTextBoldCursor, b));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, tre.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, tre.p(-1, -2, 1.0f, jn7.D1));
        lu7Var.e(editTextBoldCursor);
        lu7Var.addView(linearLayout2, tre.e(-1, -2, 48));
        linearLayout.addView(lu7Var, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        yob.X(textView2, aob.A6, null);
        lu7Var.addView(textView2, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        p66 p66Var = new p66(context, null);
        p66Var.setText(hl.D2(hl.N2(ob6.M0(2131747462, null), -1, 0, new xf1(context, (byte) 18), null), true));
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.z6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        linearLayout.addView(p66Var, tre.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final c51 i2 = xnb.i(24, vnbVar, context, true);
        i2.i(ob6.M0(j > 0 ? 2131747458 : 2131747464, null), false, true);
        linearLayout.addView(i2, tre.o(-1, 48));
        if (j > 0 && z) {
            c51 i3 = xnb.i(24, vnbVar, context, false);
            i3.i(ob6.M0(2131747463, null), false, false);
            linearLayout.addView(i3, tre.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            c51Var = i3;
        }
        h.O = linearLayout;
        final nx0[] nx0VarArr2 = {h};
        editTextBoldCursor.setText(j <= 0 ? "" : Long.toString(j));
        editTextBoldCursor.addTextChangedListener(new tya(editTextBoldCursor, lu7Var, j, z, i2, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xxa
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                if (i4 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                i2.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                iccVar.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new aya(editTextBoldCursor2, nx0VarArr2, (byte) 1));
                return true;
            }
        });
        yxa yxaVar = new yxa(zArr, iccVar, editTextBoldCursor, i2, nx0VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i2.setOnClickListener(yxaVar);
        if (c51Var != null) {
            c51 c51Var2 = c51Var;
            yxa yxaVar2 = new yxa(zArr, iccVar, c51Var2, editTextBoldCursor2, nx0VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            nx0VarArr = nx0VarArr2;
            c51Var2.setOnClickListener(yxaVar2);
        } else {
            nx0VarArr = nx0VarArr2;
        }
        nx0VarArr[0].J();
        nx0VarArr[0].setOnDismissListener(new fe4(editTextBoldCursor2, (byte) 3));
        nx0VarArr[0].show();
        e Q = LaunchActivity.Q();
        hl.d3(new aya(nx0VarArr, editTextBoldCursor2), Q instanceof zu1 ? ((zu1) Q).fa() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0fac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x1027  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10d8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x106a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0dd1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0f24 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f37  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0f3a  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nx0 l1(final Context context, final boolean z, final long j, final int i, final TL_stars.StarsTransaction starsTransaction, final vnb vnbVar) {
        nx0 nx0Var;
        nx0[] nx0VarArr;
        boolean z2;
        Context context2;
        int i2;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        vnb vnbVar2;
        TLRPC.Peer peer;
        boolean z6;
        long j3;
        jn5 jn5Var;
        jn5 c;
        int i3;
        nx0[] nx0VarArr2;
        int i4;
        String L0;
        TL_stars.StarGift starGift;
        vnb vnbVar3;
        ViewGroup viewGroup;
        CharSequence charSequence;
        nx0[] nx0VarArr3;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        int i5;
        boolean z7;
        hjb hjbVar;
        hjb hjbVar2;
        hjb hjbVar3;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z8;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r3;
        e S;
        TLRPC.Chat M0;
        int i6;
        jn5 c2;
        hjb hjbVar4;
        nx0[] nx0VarArr4;
        final int i7;
        final nx0[] nx0VarArr5;
        int i8;
        long j4;
        hjb hjbVar5;
        final nx0[] nx0VarArr6;
        int i9;
        long j5;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsTransaction starsTransaction4;
        ViewGroup viewGroup2;
        if (starsTransaction == null || context == null) {
            return null;
        }
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        boolean z9 = starsAmount2 instanceof TL_stars.TL_starsTonAmount;
        int i10 = starsTransaction.flags;
        boolean z10 = (i10 & TLObject.FLAG_13) != 0;
        boolean z11 = ((131072 & i10) == 0 || starsTransaction.paid_message) ? false : true;
        boolean z12 = (z11 || (i10 & 65536) == 0 || starsTransaction.paid_message) ? false : true;
        boolean positive = starsAmount2.positive();
        boolean negative = starsTransaction.amount.negative();
        nx0 nx0Var2 = new nx0(vnbVar, context, false, false);
        nx0Var2.J();
        nx0[] nx0VarArr7 = new nx0[1];
        final LinearLayout j6 = uh9.j(context, 1);
        j6.setPadding(0, hl.L((z10 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, hl.L(8.0f));
        j6.setClipChildren(false);
        j6.setClipToPadding(false);
        boolean z13 = z11;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                ul ulVar = new ul(hl.L(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, hl.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z2 = z10;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                nx0VarArr = nx0VarArr7;
                nx0Var = nx0Var2;
                lya lyaVar = new lya(context, matrix, radialGradient, paint, ulVar);
                ulVar.l(lyaVar);
                ulVar.i(stargiftattributepattern.document, false);
                lyaVar.setOrientation(1);
                de0 de0Var = new de0(context);
                f1(de0Var.getImageReceiver(), starsTransaction.stargift, jn7.p2);
                lyaVar.addView(de0Var, tre.t(jn7.p2, jn7.p2, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    iye.a(de0Var);
                    de0Var.setOnClickListener(new ae((Object) context, i, (Object) tL_starGiftUnique, (byte) 17));
                }
                TextView b = zze.b(context, 20.0f, 0, true, null);
                b.setTextColor(-1);
                b.setText(tL_starGiftUnique.title);
                lyaVar.addView(b, tre.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b2 = zze.b(context, 13.0f, 0, false, null);
                b2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b2.setText(ob6.I(tL_starGiftUnique.num, "Gift2CollectionNumber"));
                lyaVar.addView(b2, tre.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b3 = zze.b(context, 18.0f, 0, true, null);
                b3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b3.setText(W0(starsAmount3, TextUtils.concat(positive ? "+" : "", G0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b3.getText());
                if (starsTransaction.refund) {
                    D0(spannableStringBuilder, b3, ob6.L0(2131744687));
                } else if (starsTransaction.failed) {
                    D0(spannableStringBuilder, b3, ob6.L0(2131744767));
                } else if (starsTransaction.pending) {
                    D0(spannableStringBuilder, b3, ob6.L0(2131744710));
                }
                b3.setText(spannableStringBuilder);
                lyaVar.addView(b3, tre.t(-2, -2, 17, 0, 11, 0, 17));
                j6.addView(lyaVar, tre.o(-1, -2));
                vnbVar2 = vnbVar;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = j6;
                z3 = z9;
                z4 = z12;
                nx0VarArr2 = nx0VarArr;
                hjb hjbVar6 = new hjb(context2, vnbVar2);
                starGift = starsTransaction2.stargift;
                if (starGift != null) {
                    TL_stars.StarsTransaction starsTransaction5 = starsTransaction2;
                    vnbVar3 = vnbVar2;
                    viewGroup = linearLayout;
                    final nx0[] nx0VarArr8 = nx0VarArr2;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction5.peer;
                    if (!(starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer)) {
                        charSequence = " ";
                        nx0VarArr3 = nx0VarArr8;
                        hjb hjbVar7 = hjbVar6;
                        starsTransaction3 = starsTransaction5;
                        context3 = context;
                        i5 = i;
                        if (!(starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment)) {
                            z7 = z3;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                hjbVar7.d(ob6.L0(2131754224), ob6.L0(2131744588));
                                hjbVar3 = hjbVar7;
                            } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                hjbVar7.d(ob6.L0(2131746946), ob6.L0(2131744588));
                                hjbVar3 = hjbVar7;
                            } else {
                                hjbVar3 = hjbVar7;
                                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                    hjbVar7.d(ob6.L0(2131744618), ob6.L0(2131744588));
                                    hjbVar3 = hjbVar7;
                                }
                            }
                        } else if (starsTransaction3.gift) {
                            p66 p66Var = new p66(context3, vnbVar3);
                            p66Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
                            p66Var.setEllipsize(TextUtils.TruncateAt.END);
                            int i11 = aob.Xc;
                            yob.X(p66Var, i11, vnbVar3);
                            yob.G(p66Var, i11, vnbVar3);
                            p66Var.setTextSize(1, 14.0f);
                            p66Var.setSingleLine(true);
                            p66Var.setDisablePaddingsOffsetY(true);
                            gc0 gc0Var = new gc0(24.0f, i5, p66Var);
                            String L02 = ob6.L0(z3 ? 2131744585 : 2131744582);
                            zm2 a = iza.a(24, "fragment");
                            int L = hl.L(16.0f);
                            int L2 = hl.L(16.0f);
                            a.e = L;
                            a.f = L2;
                            gc0Var.b.g0(a);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) L02));
                            spannableStringBuilder2.setSpan(gc0Var, 0, 1, 33);
                            z7 = z3;
                            spannableStringBuilder2.setSpan(new nya(nx0VarArr3, context3, z7), 3, spannableStringBuilder2.length(), 33);
                            p66Var.setText(spannableStringBuilder2);
                            hjbVar7.l(p66Var, ob6.L0(2131744590));
                            hjbVar3 = hjbVar7;
                        } else {
                            z7 = z3;
                            hjbVar7.d(ob6.L0(2131750481), ob6.L0(2131744588));
                            hjbVar3 = hjbVar7;
                        }
                        starsTransactionPeer = starsTransaction3.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                        }
                        z8 = z7;
                        if (!TextUtils.isEmpty(starsTransaction3.id)) {
                        }
                        if (starsTransaction3.floodskip) {
                        }
                        hjbVar3.d(ob6.Z(2131742414, ob6.D0().r0().format(new Date(starsTransaction3.date * 1000)), ob6.D0().o0().format(new Date(starsTransaction3.date * 1000))), ob6.L0(2131744617));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                        }
                        ViewGroup viewGroup3 = viewGroup;
                        viewGroup3.addView(hjbVar3, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                        }
                        if (z8) {
                        }
                        c51 c51Var = new c51(context4, vnbVar3);
                        c51Var.f();
                        if ((starsTransaction3.flags & 32) != 0) {
                        }
                        viewGroup3.addView(c51Var, tre.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        nx0 nx0Var3 = nx0Var;
                        nx0Var3.O = viewGroup3;
                        nx0VarArr3[r3] = nx0Var3;
                        nx0Var3.T0 = r3;
                        if ((starsTransaction3.flags & 32) != 0) {
                        }
                        nx0VarArr3[0].J();
                        S = LaunchActivity.S();
                        if (!hl.O1()) {
                        }
                        nx0VarArr3[0].show();
                        return nx0VarArr3[0];
                    }
                    final long n = wf3.n(starsTransactionPeer2.peer);
                    if (starsTransaction5.paid_message) {
                        hjbVar6.n(ob6.L0(positive ? 2131750152 : 2131749882), i, n, new rxa(nx0VarArr8, n, (byte) 0));
                        if (starsTransaction5.starref_amount != null && starsTransaction5.starref_commission_permille > 0) {
                            hjbVar6.d(b1(starsTransaction5.amount instanceof TL_stars.TL_starsTonAmount, "⭐️ ".concat(ob6.E(Math.abs(Math.round(starsTransaction5.starref_amount.toDouble() + starsTransaction5.amount.toDouble())), ',')), 0.8f, null), ob6.L0(2131744607));
                        }
                        charSequence = " ";
                        nx0VarArr3 = nx0VarArr8;
                    } else {
                        if (!z13) {
                            final byte b4 = 2;
                            if (z4) {
                                vnbVar3 = vnbVar;
                                hjb hjbVar8 = hjbVar6;
                                charSequence = " ";
                                hjbVar8.i(ob6.L0(2131744887), ob6.L0(2131744886), new ic2(i, context, j, n, nx0VarArr8, vnbVar3, (byte) 7));
                                hjbVar8.n(ob6.L0(2131744888), i, n, new rxa(nx0VarArr8, n, (byte) 4));
                                context3 = context;
                                nx0VarArr3 = nx0VarArr8;
                                i5 = i;
                                starsTransaction3 = starsTransaction;
                                hjbVar2 = hjbVar8;
                            } else {
                                vnbVar3 = vnbVar;
                                charSequence = " ";
                                if (z2) {
                                    hjbVar6.n(ob6.L0(2131744865), i, n, new qxa(nx0VarArr8, starsTransaction, n, (byte) 1));
                                    hjbVar6.n(ob6.L0(2131744864), i, yac.h(i).e(), new Runnable() { // from class: pxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b4;
                                            int i12 = i;
                                            nx0[] nx0VarArr9 = nx0VarArr8;
                                            switch (b5) {
                                                case 0:
                                                    nx0VarArr9[0].dismiss();
                                                    e S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", yac.h(i12).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        S2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    nx0VarArr9[0].dismiss();
                                                    e S3 = LaunchActivity.S();
                                                    if (S3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", yac.h(i12).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        S3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    nx0VarArr9[0].dismiss();
                                                    e S4 = LaunchActivity.S();
                                                    if (S4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", yac.h(i12).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        S4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    starsTransaction3 = starsTransaction;
                                    hjbVar6.i(ob6.L0(2131744863), ob6.L0(2131744862), new qxa(nx0VarArr8, starsTransaction, n, (byte) 2));
                                    hjbVar6.d(J0(starsTransaction3.amount), ob6.L0(2131744866));
                                    i5 = i;
                                    nx0VarArr3 = nx0VarArr8;
                                    hjbVar2 = hjbVar6;
                                    context3 = context;
                                } else {
                                    starsTransaction3 = starsTransaction;
                                    if (!starsTransaction3.subscription || z) {
                                        hjb hjbVar9 = hjbVar6;
                                        if (starsTransaction3.premium_gift) {
                                            final byte b5 = 1;
                                            hjbVar9.n(ob6.L0(2131749882), i, n, new Runnable() { // from class: txa
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b6 = b5;
                                                    Context context5 = context;
                                                    long j7 = n;
                                                    nx0[] nx0VarArr9 = nx0VarArr8;
                                                    switch (b6) {
                                                        case 0:
                                                            nx0VarArr9[0].dismiss();
                                                            if (!lbc.C(j7)) {
                                                                e S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(zu1.ha(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                m01.u(context5, ob6.M0(2131744581, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            nx0VarArr9[0].dismiss();
                                                            if (!lbc.C(j7)) {
                                                                e S3 = LaunchActivity.S();
                                                                if (S3 != null) {
                                                                    S3.presentFragment(zu1.ha(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                m01.u(context5, ob6.M0(2131744581, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            nx0VarArr9[0].dismiss();
                                                            if (!lbc.C(j7)) {
                                                                e S4 = LaunchActivity.S();
                                                                if (S4 != null) {
                                                                    S4.presentFragment(zu1.ha(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                m01.u(context5, ob6.M0(2131744581, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            hjbVar9.d(ob6.I(starsTransaction3.premium_gift_months, "Months"), ob6.L0(2131744591));
                                        } else if (!starsTransaction3.posts_search) {
                                            final byte b6 = 2;
                                            nx0VarArr3 = nx0VarArr8;
                                            context3 = context;
                                            hjbVar9.n(ob6.L0(2131744590), i, n, new Runnable() { // from class: txa
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b62 = b6;
                                                    Context context5 = context;
                                                    long j7 = n;
                                                    nx0[] nx0VarArr9 = nx0VarArr8;
                                                    switch (b62) {
                                                        case 0:
                                                            nx0VarArr9[0].dismiss();
                                                            if (!lbc.C(j7)) {
                                                                e S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(zu1.ha(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                m01.u(context5, ob6.M0(2131744581, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            nx0VarArr9[0].dismiss();
                                                            if (!lbc.C(j7)) {
                                                                e S3 = LaunchActivity.S();
                                                                if (S3 != null) {
                                                                    S3.presentFragment(zu1.ha(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                m01.u(context5, ob6.M0(2131744581, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            nx0VarArr9[0].dismiss();
                                                            if (!lbc.C(j7)) {
                                                                e S4 = LaunchActivity.S();
                                                                if (S4 != null) {
                                                                    S4.presentFragment(zu1.ha(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                m01.u(context5, ob6.M0(2131744581, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            i5 = i;
                                            hjbVar2 = hjbVar9;
                                        }
                                        context3 = context;
                                        i5 = i;
                                        nx0VarArr3 = nx0VarArr8;
                                        hjbVar2 = hjbVar9;
                                    } else {
                                        final byte b7 = 0;
                                        hjbVar6.n(ob6.L0(2131744819), i, n, new Runnable() { // from class: txa
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b62 = b7;
                                                Context context5 = context;
                                                long j7 = n;
                                                nx0[] nx0VarArr9 = nx0VarArr8;
                                                switch (b62) {
                                                    case 0:
                                                        nx0VarArr9[0].dismiss();
                                                        if (!lbc.C(j7)) {
                                                            e S2 = LaunchActivity.S();
                                                            if (S2 != null) {
                                                                S2.presentFragment(zu1.ha(j7));
                                                                break;
                                                            }
                                                        } else {
                                                            m01.u(context5, ob6.M0(2131744581, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        nx0VarArr9[0].dismiss();
                                                        if (!lbc.C(j7)) {
                                                            e S3 = LaunchActivity.S();
                                                            if (S3 != null) {
                                                                S3.presentFragment(zu1.ha(j7));
                                                                break;
                                                            }
                                                        } else {
                                                            m01.u(context5, ob6.M0(2131744581, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        nx0VarArr9[0].dismiss();
                                                        if (!lbc.C(j7)) {
                                                            e S4 = LaunchActivity.S();
                                                            if (S4 != null) {
                                                                S4.presentFragment(zu1.ha(j7));
                                                                break;
                                                            }
                                                        } else {
                                                            m01.u(context5, ob6.M0(2131744581, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        context3 = context;
                                        hjbVar = hjbVar6;
                                        nx0VarArr3 = nx0VarArr8;
                                        i5 = i;
                                        hjbVar2 = hjbVar;
                                    }
                                }
                            }
                            z7 = z3;
                            hjbVar3 = hjbVar2;
                            starsTransactionPeer = starsTransaction3.peer;
                            if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                                long n2 = wf3.n(starsTransactionPeer.peer);
                                if (z) {
                                }
                                M0 = uc7.s1(i5).M0(Long.valueOf(-n2));
                                if (M0 != null) {
                                }
                            }
                            z8 = z7;
                            if (!TextUtils.isEmpty(starsTransaction3.id)) {
                            }
                            if (starsTransaction3.floodskip) {
                            }
                            hjbVar3.d(ob6.Z(2131742414, ob6.D0().r0().format(new Date(starsTransaction3.date * 1000)), ob6.D0().o0().format(new Date(starsTransaction3.date * 1000))), ob6.L0(2131744617));
                            starGift2 = starsTransaction3.stargift;
                            if (starGift2 != null) {
                            }
                            ViewGroup viewGroup32 = viewGroup;
                            viewGroup32.addView(hjbVar3, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                            if ((starsTransaction3.flags & 32) != 0) {
                            }
                            if (z8) {
                            }
                            c51 c51Var2 = new c51(context4, vnbVar3);
                            c51Var2.f();
                            if ((starsTransaction3.flags & 32) != 0) {
                            }
                            viewGroup32.addView(c51Var2, tre.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                            nx0 nx0Var32 = nx0Var;
                            nx0Var32.O = viewGroup32;
                            nx0VarArr3[r3] = nx0Var32;
                            nx0Var32.T0 = r3;
                            if ((starsTransaction3.flags & 32) != 0) {
                            }
                            nx0VarArr3[0].J();
                            S = LaunchActivity.S();
                            if (!hl.O1()) {
                            }
                            nx0VarArr3[0].show();
                            return nx0VarArr3[0];
                        }
                        long n3 = wf3.n(starsTransaction5.starref_peer);
                        hjbVar6.i(ob6.L0(2131744887), ob6.L0(2131744886), new rxa(nx0VarArr8, j, (byte) 1));
                        hjbVar6.n(ob6.L0(2131744890), i, n3, new rxa(nx0VarArr8, n3, (byte) 2));
                        hjbVar6.n(ob6.L0(2131744885), i, n, new rxa(nx0VarArr8, n, (byte) 3));
                        hjbVar6.d(cc.J0(starsTransaction5.starref_commission_permille), ob6.L0(2131744889));
                        charSequence = " ";
                        nx0VarArr3 = nx0VarArr8;
                        vnbVar3 = vnbVar;
                    }
                    hjbVar = hjbVar6;
                    starsTransaction3 = starsTransaction5;
                    context3 = context;
                    i5 = i;
                    hjbVar2 = hjbVar;
                    z7 = z3;
                    hjbVar3 = hjbVar2;
                    starsTransactionPeer = starsTransaction3.peer;
                    if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    }
                    z8 = z7;
                    if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    }
                    if (starsTransaction3.floodskip) {
                    }
                    hjbVar3.d(ob6.Z(2131742414, ob6.D0().r0().format(new Date(starsTransaction3.date * 1000)), ob6.D0().o0().format(new Date(starsTransaction3.date * 1000))), ob6.L0(2131744617));
                    starGift2 = starsTransaction3.stargift;
                    if (starGift2 != null) {
                    }
                    ViewGroup viewGroup322 = viewGroup;
                    viewGroup322.addView(hjbVar3, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    if (z8) {
                    }
                    c51 c51Var22 = new c51(context4, vnbVar3);
                    c51Var22.f();
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    viewGroup322.addView(c51Var22, tre.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                    nx0 nx0Var322 = nx0Var;
                    nx0Var322.O = viewGroup322;
                    nx0VarArr3[r3] = nx0Var322;
                    nx0Var322.T0 = r3;
                    if ((starsTransaction3.flags & 32) != 0) {
                    }
                    nx0VarArr3[0].J();
                    S = LaunchActivity.S();
                    if (!hl.O1()) {
                    }
                    nx0VarArr3[0].show();
                    return nx0VarArr3[0];
                }
                if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction4 = starsTransaction2;
                        viewGroup2 = linearLayout;
                    } else {
                        y41 y41Var = (y41) ((ejb) hjbVar6.d(ob6.L0(2131744877), ob6.L0(2131744884)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup2 = linearLayout;
                        Context context5 = context2;
                        starsTransaction4 = starsTransaction;
                        jxa.t(i).J(tL_inputSavedStarGiftUser, new zo2((Object) y41Var, i, (Object) context5, (Object) vnbVar2, (byte) 7));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction4.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long n4 = wf3.n(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        hjbVar6.n(ob6.L0(2131744867), i, n4, new rxa(nx0VarArr2, n4, (byte) 5));
                        nx0VarArr3 = nx0VarArr2;
                        starsTransaction3 = starsTransaction4;
                        charSequence = " ";
                        vnbVar3 = vnbVar;
                        hjbVar2 = hjbVar6;
                        i5 = i;
                        context3 = context;
                        viewGroup = viewGroup2;
                        z7 = z3;
                        hjbVar3 = hjbVar2;
                    } else {
                        nx0VarArr3 = nx0VarArr2;
                        starsTransaction3 = starsTransaction4;
                        charSequence = " ";
                        i5 = i;
                        vnbVar3 = vnbVar;
                        hjbVar3 = hjbVar6;
                        viewGroup = viewGroup2;
                        z7 = z3;
                        context3 = context;
                    }
                } else {
                    final Context context6 = context2;
                    TL_stars.StarsTransaction starsTransaction6 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str = starGift.slug;
                        if (TextUtils.isEmpty(str)) {
                            i8 = 2131750152;
                        } else {
                            String L03 = ob6.L0(2131750151);
                            StringBuilder sb = new StringBuilder();
                            i8 = 2131750152;
                            sb.append(starsTransaction6.stargift.title);
                            sb.append(" #");
                            sb.append(starsTransaction6.stargift.num);
                            hjbVar6.i(L03, sb.toString(), new a39((Object) context6, i, (Object) str, (byte) 15));
                        }
                        final long e = yac.h(i).e();
                        long n5 = wf3.n(((TL_stars.TL_starsTransactionPeer) starsTransaction6.peer).peer);
                        if (!starsTransaction6.offer) {
                            if (starsTransaction6.stargift_resale) {
                                if (negative) {
                                    hjbVar6.d(ob6.L0(starsTransaction6.refund ? 2131744879 : 2131744881), ob6.L0(2131744884));
                                } else {
                                    hjbVar6.d(ob6.L0(starsTransaction6.refund ? 2131744881 : 2131744879), ob6.L0(2131744884));
                                    j4 = e;
                                }
                            } else if (starsTransaction6.stargift_drop_original_details) {
                                hjbVar6.d(ob6.L0(2131744880), ob6.L0(2131744884));
                                j4 = e;
                                n5 = j4;
                            } else {
                                hjbVar6.d(ob6.L0(2131744878), ob6.L0(2131744884));
                            }
                            j4 = n5;
                            n5 = e;
                        } else if (negative) {
                            hjbVar6.d(ob6.L0(starsTransaction6.refund ? 2131744879 : 2131744883), ob6.L0(2131744884));
                            j4 = n5;
                            n5 = e;
                        } else {
                            hjbVar6.d(ob6.L0(starsTransaction6.refund ? 2131744882 : 2131744879), ob6.L0(2131744884));
                            j4 = e;
                        }
                        int i12 = (n5 > e ? 1 : (n5 == e ? 0 : -1));
                        if (i12 != 0) {
                            nx0VarArr6 = nx0VarArr2;
                            final byte b8 = 0;
                            vnbVar3 = vnbVar;
                            hjbVar5 = hjbVar6;
                            viewGroup = linearLayout;
                            i9 = i12;
                            final long j7 = n5;
                            j5 = e;
                            hjbVar5.n(ob6.L0(i8), i, j7, new Runnable() { // from class: wxa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b9 = b8;
                                    long j8 = e;
                                    long j9 = j7;
                                    nx0[] nx0VarArr9 = nx0VarArr6;
                                    switch (b9) {
                                        case 0:
                                            nx0VarArr9[0].dismiss();
                                            e S2 = LaunchActivity.S();
                                            if (S2 != null) {
                                                Bundle k = qu6.k(j9, "user_id");
                                                if (j9 == j8) {
                                                    k.putBoolean("my_profile", true);
                                                }
                                                k.putBoolean("open_gifts", true);
                                                S2.presentFragment(new ProfileActivity(k, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            nx0VarArr9[0].dismiss();
                                            e S3 = LaunchActivity.S();
                                            if (S3 != null) {
                                                Bundle k2 = qu6.k(j9, "user_id");
                                                if (j9 == j8) {
                                                    k2.putBoolean("my_profile", true);
                                                }
                                                k2.putBoolean("open_gifts", true);
                                                S3.presentFragment(new ProfileActivity(k2, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            vnbVar3 = vnbVar;
                            hjbVar5 = hjbVar6;
                            viewGroup = linearLayout;
                            nx0VarArr6 = nx0VarArr2;
                            i9 = i12;
                            j5 = e;
                        }
                        if (j4 != j5) {
                            final long j8 = j5;
                            final byte b9 = 1;
                            final long j9 = j4;
                            final nx0[] nx0VarArr9 = nx0VarArr6;
                            hjbVar5.n(ob6.L0(2131749882), i, j9, new Runnable() { // from class: wxa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b92 = b9;
                                    long j82 = j8;
                                    long j92 = j9;
                                    nx0[] nx0VarArr92 = nx0VarArr9;
                                    switch (b92) {
                                        case 0:
                                            nx0VarArr92[0].dismiss();
                                            e S2 = LaunchActivity.S();
                                            if (S2 != null) {
                                                Bundle k = qu6.k(j92, "user_id");
                                                if (j92 == j82) {
                                                    k.putBoolean("my_profile", true);
                                                }
                                                k.putBoolean("open_gifts", true);
                                                S2.presentFragment(new ProfileActivity(k, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            nx0VarArr92[0].dismiss();
                                            e S3 = LaunchActivity.S();
                                            if (S3 != null) {
                                                Bundle k2 = qu6.k(j92, "user_id");
                                                if (j92 == j82) {
                                                    k2.putBoolean("my_profile", true);
                                                }
                                                k2.putBoolean("open_gifts", true);
                                                S3.presentFragment(new ProfileActivity(k2, null));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        hjb hjbVar10 = hjbVar5;
                        if ((i9 == 0 || starsTransaction6.stargift_resale) && (starsAmount = starsTransaction6.starref_amount) != null && starsTransaction6.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction6.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction6.amount.amount + starsTransaction6.starref_amount.amount;
                                wm2[] wm2VarArr = new wm2[1];
                                hjbVar10.d(a1(starsTransaction6.amount, "⭐️ " + ((Object) G0(tL_starsTonAmount)), wm2VarArr), ob6.L0(2131744607));
                                wm2 wm2Var = wm2VarArr[0];
                                if (wm2Var != null) {
                                    wm2Var.y = aob.v0(aob.Fi, vnbVar3);
                                }
                            } else {
                                hjbVar10.d(b1(starsTransaction6.amount instanceof TL_stars.TL_starsTonAmount, "⭐️ ".concat(ob6.E(Math.abs(Math.round(starsTransaction6.starref_amount.toDouble() + starsAmount4.toDouble())), ',')), 0.8f, null), ob6.L0(2131744607));
                            }
                        }
                        i5 = i;
                        hjbVar3 = hjbVar10;
                        context3 = context6;
                        starsTransaction3 = starsTransaction6;
                        z7 = z3;
                        charSequence = " ";
                        nx0VarArr3 = nx0VarArr6;
                    } else {
                        vnbVar3 = vnbVar;
                        viewGroup = linearLayout;
                        final nx0[] nx0VarArr10 = nx0VarArr2;
                        if (starsTransaction6.refund) {
                            context3 = context;
                            i5 = i;
                            hjbVar3 = hjbVar6;
                            charSequence = " ";
                            z7 = z3;
                            nx0VarArr3 = nx0VarArr10;
                            starsTransaction3 = starsTransaction;
                        } else {
                            long e2 = j == 0 ? yac.h(i).e() : j;
                            final long n6 = wf3.n(starsTransaction6.peer.peer);
                            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(n6));
                            if (positive) {
                                if (n6 != e2) {
                                    String L04 = ob6.L0(2131744865);
                                    Runnable qxaVar = new qxa(nx0VarArr10, starsTransaction6, n6, (byte) 4);
                                    String L05 = (X1 == null || lbc.z(X1) || lbc.b(n6)) ? null : ob6.L0(2131750243);
                                    final byte b10 = 0;
                                    i7 = i;
                                    Runnable runnable = new Runnable() { // from class: oxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b11 = b10;
                                            nx0[] nx0VarArr11 = nx0VarArr10;
                                            switch (b11) {
                                                case 0:
                                                    nx0 nx0Var4 = nx0VarArr11[0];
                                                    Objects.requireNonNull(nx0Var4);
                                                    new yx4(context6, i7, n6, null, new sh9(nx0Var4, (byte) 11)).show();
                                                    break;
                                                default:
                                                    nx0 nx0Var5 = nx0VarArr11[0];
                                                    Objects.requireNonNull(nx0Var5);
                                                    new yx4(context6, i7, n6, null, new sh9(nx0Var5, (byte) 11)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    hjbVar4 = hjbVar6;
                                    nx0VarArr5 = nx0VarArr10;
                                    hjbVar4.m(L04, i7, n6, qxaVar, L05, runnable);
                                } else {
                                    i7 = i;
                                    hjbVar4 = hjbVar6;
                                    nx0VarArr5 = nx0VarArr10;
                                }
                                final byte b11 = 0;
                                hjbVar4.n(ob6.L0(2131744864), i7, e2, new Runnable() { // from class: pxa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b11;
                                        int i122 = i7;
                                        nx0[] nx0VarArr92 = nx0VarArr5;
                                        switch (b52) {
                                            case 0:
                                                nx0VarArr92[0].dismiss();
                                                e S2 = LaunchActivity.S();
                                                if (S2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", yac.h(i122).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    S2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                nx0VarArr92[0].dismiss();
                                                e S3 = LaunchActivity.S();
                                                if (S3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", yac.h(i122).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    S3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                nx0VarArr92[0].dismiss();
                                                e S4 = LaunchActivity.S();
                                                if (S4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", yac.h(i122).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    S4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                nx0VarArr4 = nx0VarArr5;
                            } else {
                                long j10 = e2;
                                if (n6 != j10) {
                                    final byte b12 = 1;
                                    hjbVar6.n(ob6.L0(2131744865), i, j10, new Runnable() { // from class: pxa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b52 = b12;
                                            int i122 = i;
                                            nx0[] nx0VarArr92 = nx0VarArr10;
                                            switch (b52) {
                                                case 0:
                                                    nx0VarArr92[0].dismiss();
                                                    e S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", yac.h(i122).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        S2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    nx0VarArr92[0].dismiss();
                                                    e S3 = LaunchActivity.S();
                                                    if (S3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", yac.h(i122).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        S3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    nx0VarArr92[0].dismiss();
                                                    e S4 = LaunchActivity.S();
                                                    if (S4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", yac.h(i122).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        S4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                String L06 = ob6.L0(2131744864);
                                Runnable qxaVar2 = new qxa(nx0VarArr10, starsTransaction, n6, (byte) 0);
                                String L07 = (X1 == null || lbc.z(X1) || lbc.b(n6)) ? null : ob6.L0(2131750243);
                                final byte b13 = 1;
                                Runnable runnable2 = new Runnable() { // from class: oxa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b112 = b13;
                                        nx0[] nx0VarArr11 = nx0VarArr10;
                                        switch (b112) {
                                            case 0:
                                                nx0 nx0Var4 = nx0VarArr11[0];
                                                Objects.requireNonNull(nx0Var4);
                                                new yx4(context, i, n6, null, new sh9(nx0Var4, (byte) 11)).show();
                                                break;
                                            default:
                                                nx0 nx0Var5 = nx0VarArr11[0];
                                                Objects.requireNonNull(nx0Var5);
                                                new yx4(context, i, n6, null, new sh9(nx0Var5, (byte) 11)).show();
                                                break;
                                        }
                                    }
                                };
                                hjbVar4 = hjbVar6;
                                nx0VarArr4 = nx0VarArr10;
                                hjbVar4.m(L06, i, n6, qxaVar2, L07, runnable2);
                            }
                            nx0[] nx0VarArr11 = nx0VarArr4;
                            charSequence = " ";
                            nx0VarArr3 = nx0VarArr11;
                            context3 = context;
                            starsTransaction3 = starsTransaction;
                            hjbVar3 = hjbVar4;
                            z7 = z3;
                            i5 = i;
                        }
                    }
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long n22 = wf3.n(starsTransactionPeer.peer);
                    if (z) {
                        n22 = j;
                    }
                    M0 = uc7.s1(i5).M0(Long.valueOf(-n22));
                    if (M0 != null) {
                        p66 p66Var2 = new p66(context3, vnbVar3);
                        z8 = z7;
                        p66Var2.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
                        p66Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i13 = aob.Xc;
                        yob.X(p66Var2, i13, vnbVar3);
                        yob.G(p66Var2, i13, vnbVar3);
                        p66Var2.setTextSize(1, 14.0f);
                        p66Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("");
                        if (!starsTransaction3.extended_media.isEmpty()) {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            int i14 = 0;
                            int i15 = 0;
                            while (i15 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i15);
                                int i16 = i15 + 1;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                int i17 = size;
                                int i18 = i14;
                                rn5 rn5Var = new rn5(24.0f, i5, p66Var2);
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                                    i6 = i16;
                                    c2 = jn5.i(xb4.v(hl.L(24.0f), messageMedia2.photo.sizes, true), messageMedia2.photo);
                                } else {
                                    i6 = i16;
                                    c2 = messageMedia2 instanceof TLRPC.TL_messageMediaDocument ? jn5.c(xb4.v(hl.L(24.0f), messageMedia2.document.thumbs, true), messageMedia2.document) : null;
                                }
                                if (c2 != null) {
                                    rn5Var.a(6.0f);
                                    rn5Var.b.d0(c2, "24_24", null, null, null, 0);
                                    SpannableString spannableString = new SpannableString("x");
                                    spannableString.setSpan(rn5Var, 0, spannableString.length(), 33);
                                    spannableStringBuilder3.append((CharSequence) spannableString);
                                    spannableStringBuilder3.append(charSequence);
                                    i14 = i18 + 1;
                                } else {
                                    i14 = i18;
                                }
                                if (i14 >= 3) {
                                    break;
                                }
                                size = i17;
                                i15 = i6;
                                arrayList = arrayList2;
                            }
                        }
                        spannableStringBuilder3.append(charSequence);
                        int length = spannableStringBuilder3.length();
                        String K = xc2.K(M0, false);
                        if (TextUtils.isEmpty(K)) {
                            spannableStringBuilder3.append((CharSequence) M0.title);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            qu6.u(sb2, uc7.s1(i5).N2, "/", K, "/");
                            sb2.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        qxa qxaVar3 = new qxa(nx0VarArr3, n22, starsTransaction3);
                        spannableStringBuilder3.setSpan(new oya(qxaVar3), length, spannableStringBuilder3.length(), 33);
                        p66Var2.setSingleLine(true);
                        p66Var2.setEllipsize(TextUtils.TruncateAt.END);
                        p66Var2.setText(spannableStringBuilder3);
                        p66Var2.setOnClickListener(new kla(qxaVar3, (byte) 6));
                        hjbVar3.l(p66Var2, ob6.L0(starsTransaction3.reaction ? 2131744599 : 2131744600));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z2) {
                            String L08 = ob6.L0(2131744605);
                            String str2 = starsTransaction3.id;
                            hjbVar3.k(L08, str2, str2.length() <= 25 ? 9 : 10, new kba((Object) nx0VarArr3, (Object) vnbVar3, (byte) 26));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            hjbVar3.d(ob6.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), ob6.L0(2131744611));
                        }
                        hjbVar3.d(ob6.Z(2131742414, ob6.D0().r0().format(new Date(starsTransaction3.date * 1000)), ob6.D0().o0().format(new Date(starsTransaction3.date * 1000))), ob6.L0(2131744617));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                C0(hjbVar3, i5, starGift2, vnbVar3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                hjbVar3.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup3222 = viewGroup;
                        viewGroup3222.addView(hjbVar3, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            hjbVar3.d(ob6.Z(2131742414, ob6.D0().r0().format(new Date(starsTransaction3.transaction_date * 1000)), ob6.D0().o0().format(new Date(starsTransaction3.transaction_date * 1000))), ob6.L0(2131744586));
                        }
                        if (z8) {
                            context4 = context;
                        } else {
                            context4 = context;
                            p66 p66Var3 = new p66(context4, vnbVar3);
                            yob.X(p66Var3, aob.z6, vnbVar3);
                            yob.G(p66Var3, aob.Xc, vnbVar3);
                            p66Var3.setTextSize(1, 14.0f);
                            p66Var3.setText(hl.P2(ob6.L0(2131744583), new xf1(context4, (byte) 16)));
                            p66Var3.setGravity(17);
                            viewGroup3222.addView(p66Var3, tre.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        }
                        c51 c51Var222 = new c51(context4, vnbVar3);
                        c51Var222.f();
                        if ((starsTransaction3.flags & 32) != 0) {
                            r3 = 0;
                            c51Var222.h(ob6.L0(2131744579), false);
                        } else {
                            r3 = 0;
                            c51Var222.h(ob6.L0(2131747558), false);
                        }
                        viewGroup3222.addView(c51Var222, tre.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        nx0 nx0Var3222 = nx0Var;
                        nx0Var3222.O = viewGroup3222;
                        nx0VarArr3[r3] = nx0Var3222;
                        nx0Var3222.T0 = r3;
                        if ((starsTransaction3.flags & 32) != 0) {
                            c51Var222.setOnClickListener(new jy8(context4, starsTransaction3));
                        } else {
                            c51Var222.setOnClickListener(new g5(nx0VarArr3, (byte) 4));
                        }
                        nx0VarArr3[0].J();
                        S = LaunchActivity.S();
                        if (!hl.O1() && !hl.s1(S)) {
                            nx0VarArr3[0].X(S);
                        }
                        nx0VarArr3[0].show();
                        return nx0VarArr3[0];
                    }
                }
                z8 = z7;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String L082 = ob6.L0(2131744605);
                    String str22 = starsTransaction3.id;
                    hjbVar3.k(L082, str22, str22.length() <= 25 ? 9 : 10, new kba((Object) nx0VarArr3, (Object) vnbVar3, (byte) 26));
                }
                if (starsTransaction3.floodskip) {
                    hjbVar3.d(ob6.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), ob6.L0(2131744611));
                }
                hjbVar3.d(ob6.Z(2131742414, ob6.D0().r0().format(new Date(starsTransaction3.date * 1000)), ob6.D0().o0().format(new Date(starsTransaction3.date * 1000))), ob6.L0(2131744617));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup32222 = viewGroup;
                viewGroup32222.addView(hjbVar3, tre.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z8) {
                }
                c51 c51Var2222 = new c51(context4, vnbVar3);
                c51Var2222.f();
                if ((starsTransaction3.flags & 32) != 0) {
                }
                viewGroup32222.addView(c51Var2222, tre.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                nx0 nx0Var32222 = nx0Var;
                nx0Var32222.O = viewGroup32222;
                nx0VarArr3[r3] = nx0Var32222;
                nx0Var32222.T0 = r3;
                if ((starsTransaction3.flags & 32) != 0) {
                }
                nx0VarArr3[0].J();
                S = LaunchActivity.S();
                if (!hl.O1()) {
                    nx0VarArr3[0].X(S);
                }
                nx0VarArr3[0].show();
                return nx0VarArr3[0];
            }
        }
        nx0Var = nx0Var2;
        nx0VarArr = nx0VarArr7;
        z2 = z10;
        final de0 de0Var2 = new de0(context);
        if (starsTransaction.premium_gift) {
            g1(de0Var2, de0Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            j6.addView(de0Var2, tre.t(jn7.p2, jn7.p2, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            zm2 a2 = g9a.a(100, "search");
            int L3 = hl.L(40.0f);
            int L4 = hl.L(40.0f);
            a2.e = L3;
            a2.f = L4;
            de0Var2.setImageDrawable(a2);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z2 || starsTransaction.gift) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    linearLayout = j6;
                    z3 = z9;
                    z4 = z12;
                    z5 = z;
                    j2 = j;
                    vnbVar2 = vnbVar;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        h1(de0Var2, de0Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        d1(de0Var2, de0Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(de0Var2, tre.t(jn7.p2, jn7.p2, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    linearLayout = j6;
                    z5 = z;
                    j2 = j;
                    vnbVar2 = vnbVar;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            de0Var2.setRoundRadius(hl.L(50.0f));
                            z4 = z12;
                            de0Var2.p(jn5.p(jxc.c(starsTransaction2.photo)), "100_100", null, null);
                            z3 = z9;
                        } else {
                            z4 = z12;
                            de0Var2.setRoundRadius(hl.L(50.0f));
                            if (z4) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z5) {
                                z6 = z9;
                                j3 = j2;
                                rb0 rb0Var = new rb0();
                                z3 = z6;
                                if (j3 < 0) {
                                    TLRPC.User X12 = uc7.s1(i2).X1(Long.valueOf(j3));
                                    rb0Var.n(X12);
                                    de0Var2.f(X12, rb0Var);
                                } else {
                                    TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(-j3));
                                    rb0Var.l(M02);
                                    de0Var2.f(M02, rb0Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            z6 = z9;
                            j3 = wf3.n(peer);
                            rb0 rb0Var2 = new rb0();
                            z3 = z6;
                            if (j3 < 0) {
                            }
                        }
                        linearLayout.addView(de0Var2, tre.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        z3 = z9;
                        z4 = z12;
                        zm2 a3 = g9a.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int L5 = hl.L(40.0f);
                        int L6 = hl.L(40.0f);
                        a3.e = L5;
                        a3.f = L6;
                        de0Var2.setImageDrawable(a3);
                    }
                } else {
                    de0Var2.setRoundRadius(hl.L(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        c = jn5.i(xb4.v(hl.L(100.0f), messageMedia3.photo.sizes, true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        c = jn5.c(xb4.v(hl.L(100.0f), messageMedia3.document.thumbs, true), messageMedia3.document);
                    } else {
                        jn5Var = null;
                        de0Var2.j(jn5Var, "100_100", null, null, null, 0);
                        j6.addView(de0Var2, tre.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sxa
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z14 = z;
                                TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                                long n7 = z14 ? j : wf3.n(starsTransaction7.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i19 = 0; i19 < starsTransaction7.extended_media.size(); i19++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i19);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction7.msg_id;
                                    tL_message.dialog_id = n7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j11 = -n7;
                                    tL_peerChannel.channel_id = j11;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j11;
                                    tL_message.date = starsTransaction7.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new r47(i, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.q0().T1(null, LaunchActivity.Q(), vnbVar);
                                PhotoViewer.q0().n1(arrayList3, 0, n7, 0L, 0L, new mya(de0Var2, j6, n7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z5 = z;
                        vnbVar2 = vnbVar;
                        i2 = i;
                        linearLayout = j6;
                        j2 = j;
                        de0Var2.setOnClickListener(onClickListener);
                        z3 = z9;
                        z4 = z12;
                    }
                    jn5Var = c;
                    de0Var2.j(jn5Var, "100_100", null, null, null, 0);
                    j6.addView(de0Var2, tre.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: sxa
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z14 = z;
                            TL_stars.StarsTransaction starsTransaction7 = starsTransaction;
                            long n7 = z14 ? j : wf3.n(starsTransaction7.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i19 = 0; i19 < starsTransaction7.extended_media.size(); i19++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction7.extended_media.get(i19);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction7.msg_id;
                                tL_message.dialog_id = n7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j11 = -n7;
                                tL_peerChannel.channel_id = j11;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j11;
                                tL_message.date = starsTransaction7.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new r47(i, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.q0().T1(null, LaunchActivity.Q(), vnbVar);
                            PhotoViewer.q0().n1(arrayList3, 0, n7, 0L, 0L, new mya(de0Var2, j6, n7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z5 = z;
                    vnbVar2 = vnbVar;
                    i2 = i;
                    linearLayout = j6;
                    j2 = j;
                    de0Var2.setOnClickListener(onClickListener2);
                    z3 = z9;
                    z4 = z12;
                }
                TextView textView = new TextView(context2);
                i3 = aob.j5;
                qd4.w(textView, i3, vnbVar2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(L0(i2, z5, starsTransaction2));
                TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 17, 36, 0, 36, 4), context2);
                m.setTextSize(1, 18.0f);
                m.setTypeface(hl.o());
                m.setGravity(17);
                yob.X(m, !positive ? aob.lk : aob.nk, vnbVar2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                m.setText(b1(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : "", G0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m.getText());
                if (!starsTransaction2.refund) {
                    D0(spannableStringBuilder4, m, ob6.L0(2131744687));
                } else if (starsTransaction2.failed) {
                    yob.X(m, aob.nk, vnbVar2);
                    D0(spannableStringBuilder4, m, ob6.L0(2131744767));
                } else if (starsTransaction2.pending) {
                    yob.X(m, aob.pk, vnbVar2);
                    D0(spannableStringBuilder4, m, ob6.L0(2131744710));
                }
                m.setText(spannableStringBuilder4);
                linearLayout.addView(m, tre.t(-1, -2, 17, 36, 0, 36, 4));
                if (starsTransaction2.paid_message || starsTransaction2.starref_commission_permille <= 0 || !positive) {
                    if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z2 || starsTransaction2.gift)) {
                        TLRPC.User X13 = starsTransaction2.sent_by == null ? null : uc7.s1(i2).X1(Long.valueOf(wf3.n(starsTransaction2.sent_by)));
                        TLRPC.User X14 = starsTransaction2.sent_by == null ? null : uc7.s1(i2).X1(Long.valueOf(wf3.n(starsTransaction2.received_by)));
                        boolean D = lbc.D(X13);
                        if (D) {
                            yob.X(m, aob.G6, vnbVar2);
                            TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                            i4 = 1;
                            m.setText(b1(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(G0(starsAmount6), " ⭐️"), 0.8f, null));
                        } else {
                            i4 = 1;
                        }
                        p66 p66Var4 = new p66(context2);
                        yob.X(p66Var4, i3, vnbVar2);
                        p66Var4.setTextSize(i4, 16.0f);
                        p66Var4.setGravity(17);
                        yob.G(p66Var4, aob.Xc, vnbVar2);
                        p66Var4.setDisablePaddingsOffsetY(i4);
                        if (D) {
                            Object[] objArr = new Object[i4];
                            objArr[0] = lbc.l(X14);
                            L0 = ob6.Z(2131754624, objArr);
                        } else {
                            L0 = ob6.L0(2131754623);
                        }
                        nx0VarArr2 = nx0VarArr;
                        p66Var4.setText(TextUtils.concat(hl.S2(L0), " ", hl.D2(hl.P2(ob6.L0(2131749379).replace(' ', (char) 160), new vxa(context2, nx0VarArr2)), true)));
                        linearLayout.addView(p66Var4, tre.t(-1, -2, 17, 36, 0, 36, 4));
                    } else {
                        nx0VarArr2 = nx0VarArr;
                        if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                            TextView textView2 = new TextView(context2);
                            yob.X(textView2, i3, vnbVar2);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity(17);
                            textView2.setText(starsTransaction2.description);
                            linearLayout.addView(textView2, tre.t(-1, -2, 17, 36, 0, 36, 4));
                        }
                    }
                    hjb hjbVar62 = new hjb(context2, vnbVar2);
                    starGift = starsTransaction2.stargift;
                    if (starGift != null) {
                    }
                } else {
                    p66 p66Var5 = new p66(context2);
                    yob.X(p66Var5, i3, vnbVar2);
                    p66Var5.setTextSize(1, 14.0f);
                    p66Var5.setGravity(17);
                    yob.G(p66Var5, aob.Xc, vnbVar2);
                    p66Var5.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) hl.S2(ob6.Z(2131744597, cc.J0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j2 == yac.h(i2).e() || xc2.w(2, uc7.s1(i2).M0(Long.valueOf(-j2)))) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append((CharSequence) hl.D2(hl.P2(ob6.L0(2131744596).replace(' ', (char) 160), new am0(j2, i2, (byte) 3)), true));
                    }
                    p66Var5.setText(spannableStringBuilder5);
                    linearLayout.addView(p66Var5, tre.t(-1, -2, 17, 36, 0, 36, 4));
                    nx0VarArr2 = nx0VarArr;
                    hjb hjbVar622 = new hjb(context2, vnbVar2);
                    starGift = starsTransaction2.stargift;
                    if (starGift != null) {
                    }
                }
            } else if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                de0Var2.setImageDrawable(new kua(de0Var2, starsTransaction.stargift, 94, 0.44f));
                j6.addView(de0Var2, tre.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                f1(de0Var2.getImageReceiver(), starsTransaction.stargift, jn7.p2);
                j6.addView(de0Var2, tre.t(jn7.p2, jn7.p2, 17, 0, -8, 0, 10));
            }
        }
        vnbVar2 = vnbVar;
        context2 = context;
        i2 = i;
        starsTransaction2 = starsTransaction;
        linearLayout = j6;
        z3 = z9;
        z4 = z12;
        z5 = z;
        j2 = j;
        TextView textView3 = new TextView(context2);
        i3 = aob.j5;
        qd4.w(textView3, i3, vnbVar2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(L0(i2, z5, starsTransaction2));
        TextView m2 = ik8.m(linearLayout, textView3, tre.t(-1, -2, 17, 36, 0, 36, 4), context2);
        m2.setTextSize(1, 18.0f);
        m2.setTypeface(hl.o());
        m2.setGravity(17);
        yob.X(m2, !positive ? aob.lk : aob.nk, vnbVar2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        m2.setText(b1(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : "", G0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(m2.getText());
        if (!starsTransaction2.refund) {
        }
        m2.setText(spannableStringBuilder42);
        linearLayout.addView(m2, tre.t(-1, -2, 17, 36, 0, 36, 4));
        if (starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        nx0VarArr2 = nx0VarArr;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            yob.X(textView22, i3, vnbVar2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, tre.t(-1, -2, 17, 36, 0, 36, 4));
        }
        hjb hjbVar6222 = new hjb(context2, vnbVar2);
        starGift = starsTransaction2.stargift;
        if (starGift != null) {
        }
    }

    public static void m1(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, vnb vnbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i2;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.id = tL_messageActionPaymentRefunded.charge.id;
        starsTransaction.refund = true;
        l1(activity, false, 0L, i, starsTransaction, vnbVar);
    }

    public static void n1(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, vnb vnbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = uc7.s1(i).y1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        l1(context, false, 0L, i, starsTransaction, vnbVar);
    }

    public static CharSequence t1(CharSequence charSequence, boolean z) {
        rdc c;
        if (z && (charSequence instanceof Spanned)) {
            for (wm2 wm2Var : (wm2[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), wm2.class)) {
                Drawable drawable = wm2Var.c;
                if (drawable != null && !(drawable instanceof rdc) && (c = rdc.c(a.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c.setBounds(wm2Var.c.getBounds());
                    wm2Var.c = c;
                    wm2Var.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void E0() {
        r1();
        d79 d79Var = this.c;
        if (d79Var == null || this.V == null || d79Var.getLayoutParams() == null) {
            return;
        }
        int y = c00.y(48.0f, this.c0, -hl.L(8.0f));
        int y2 = c00.y(48.0f, this.d0, -hl.L(8.0f));
        hl.v3(this.c, 0, y, 0, y2);
        d79 d79Var2 = this.c;
        int i = -y;
        d79Var2.setPadding(d79Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - y2);
        this.V.A(i, -y2);
    }

    public final void F0(ArrayList arrayList, l9c l9cVar) {
        d79 d79Var;
        o1("FILL_BEFORE");
        wka wkaVar = this.V;
        boolean z = wkaVar != null && wkaVar.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        jxa v = jxa.v(this.currentAccount, false);
        tb tbVar = (tb) super.n0(getParentActivity());
        b8c b8cVar = new b8c(-2);
        b8cVar.c = tbVar;
        arrayList.add(b8cVar);
        arrayList.add(b8c.k(this.j0));
        c51 c51Var = this.s0;
        if (c51Var != null) {
            c51Var.setVisibility(getMessagesController().l4.E2.f ? 0 : 8);
        }
        arrayList.add(b8c.C(null));
        if (getMessagesController().l4.K2.f) {
            arrayList.add(yb.i(-4, getThemedColor(aob.lk), g92.a0(ob6.M0(2131743421, null)), ob6.M0(2131743422, null)));
            arrayList.add(b8c.C(null));
        }
        if (v.e && !v.v.isEmpty()) {
            bp1.o(2131744860, null, arrayList);
            for (int i = 0; i < v.v.size(); i++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) v.v.get(i);
                int i2 = fza.b;
                b8c K = b8c.K(fza.class);
                K.H = starsSubscription;
                arrayList.add(K);
            }
            if (v.x) {
                arrayList.add(b8c.q(arrayList.size(), 33));
            } else if (!v.y) {
                b8c c = b8c.c(-3, R.drawable.arrow_more, ob6.M0(2131744859, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(b8c.C(null));
        }
        boolean K2 = v.K(0);
        this.t0 = K2;
        if (K2) {
            this.b0 = arrayList.size();
            arrayList.add(b8c.n(this.W, -2));
            if (z && (d79Var = this.c) != null) {
                d79Var.removeCallbacks(this.g0);
                this.c.post(this.g0);
            }
        } else {
            arrayList.add(b8c.m(this.h0));
        }
        o1("FILL_AFTER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04f9  */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i) {
        b8c G;
        int i2;
        boolean[] zArr;
        String str;
        final boolean z;
        final boolean z2;
        TLRPC.Chat chat;
        boolean[] zArr2;
        TLRPC.Chat chat2;
        String str2;
        int i3;
        Activity activity;
        boolean z3;
        String str3;
        long currentTime;
        long j;
        int i4;
        final pya pyaVar;
        final nx0[] nx0VarArr;
        final int i5;
        ?? r5;
        e S;
        wb wbVar = this.v0;
        if (wbVar == null || (G = wbVar.G(i)) == null) {
            return;
        }
        int i6 = G.d;
        if (i6 == -1) {
            this.v0.O(true);
            return;
        }
        if (i6 == -2) {
            jxa.v(this.currentAccount, false).r();
            bx4.g1(true, pj0.a(this.currentAccount).b());
            return;
        }
        if (i6 == -3) {
            jxa.v(this.currentAccount, false).V();
            this.v0.O(true);
            return;
        }
        if (i6 == -4) {
            if (uc7.s1(this.currentAccount).x2()) {
                i5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new ng1(getUserConfig().e()));
                return;
            }
        }
        if (G.H(aza.class)) {
            if (G.H instanceof TL_stars.TL_starsTopupOption) {
                jxa.v(this.currentAccount, false).d(getParentActivity(), (TL_stars.TL_starsTopupOption) G.H, new ia7(this, G, (byte) 12), null);
                return;
            }
            return;
        }
        if (G.H(fza.class) && (G.H instanceof TL_stars.StarsSubscription)) {
            Activity parentActivity = getParentActivity();
            int i7 = this.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.H;
            vnb resourceProvider = getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            nx0 i8 = ik8.i(parentActivity, false, 1, resourceProvider);
            nx0[] nx0VarArr2 = new nx0[1];
            LinearLayout m = bs2.m(parentActivity, 1);
            m.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(4.0f));
            m.setClipChildren(false);
            m.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            m.addView(frameLayout, tre.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            pya pyaVar2 = new pya(zArr3, nx0VarArr2);
            jn7.f(i7).a(pyaVar2, jn7.C3);
            long n = wf3.n(starsSubscription.peer);
            de0 de0Var = new de0(parentActivity);
            int i9 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            String str4 = "";
            if (i9 >= 0) {
                TLRPC.User X1 = uc7.s1(i7).X1(Long.valueOf(n));
                String r = lbc.r(X1);
                boolean v = lbc.v(X1);
                z = !v;
                str = r;
                zArr = zArr3;
                z2 = v;
                i2 = i9;
                chat = X1;
            } else {
                i2 = i9;
                zArr = zArr3;
                TLRPC.Chat M0 = uc7.s1(i7).M0(Long.valueOf(-n));
                str = M0 == null ? "" : M0.title;
                z = false;
                z2 = false;
                chat = M0;
            }
            TLRPC.Chat chat3 = chat;
            if (starsSubscription.photo != null) {
                de0Var.setRoundRadius(hl.L(21.0f));
                zArr2 = zArr;
                de0Var.p(jn5.p(jxc.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                de0Var.setRoundRadius(hl.L(50.0f));
                rb0 rb0Var = new rb0((vnb) null);
                if (i2 < 0) {
                    chat2 = chat3;
                    str2 = str;
                    TLRPC.Chat M02 = uc7.s1(i7).M0(Long.valueOf(-n));
                    rb0Var.p(M02);
                    de0Var.f(M02, rb0Var);
                    frameLayout.addView(de0Var, tre.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    yob.x(frameLayout, drawable, aob.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, tre.e(28, 28, 17));
                        imageView.setTranslationX(hl.L(34.0f));
                        imageView.setTranslationY(hl.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, tre.e(28, 28, 17));
                        imageView2.setTranslationX(hl.L(34.0f));
                        imageView2.setTranslationY(hl.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    qd4.w(textView, aob.j5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(ob6.M0(2131744628, null));
                    }
                    m.addView(textView, tre.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    yob.X(textView2, aob.B6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i3 = tL_starsSubscriptionPricing.period;
                    if (i3 != 2592000) {
                        textView2.setText(b1(false, ob6.a0(null, null, 2131744640, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        textView2.setText(b1(false, ob6.a0(null, null, 2131744640, Long.valueOf(tL_starsSubscriptionPricing.amount), i3 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    m.addView(textView2, tre.t(-1, -2, 17, 20, 0, 20, 4));
                    hjb hjbVar = new hjb(parentActivity, resourceProvider);
                    p66 p66Var = new p66(parentActivity, resourceProvider);
                    p66Var.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
                    p66Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i10 = aob.Xc;
                    yob.X(p66Var, i10, resourceProvider);
                    yob.G(p66Var, i10, resourceProvider);
                    p66Var.setTextSize(1, 14.0f);
                    p66Var.setSingleLine(true);
                    p66Var.setDisablePaddingsOffsetY(true);
                    gc0 gc0Var = new gc0(24.0f, i7, p66Var);
                    if (i2 < 0) {
                        TLRPC.User X12 = uc7.s1(i7).X1(Long.valueOf(n));
                        z3 = X12 == null || lbc.z(X12);
                        str4 = lbc.r(X12);
                        gc0Var.e(X12);
                        activity = parentActivity;
                    } else {
                        activity = parentActivity;
                        TLRPC.Chat M03 = uc7.s1(i7).M0(Long.valueOf(-n));
                        if (M03 == null) {
                            z3 = true;
                        } else {
                            str4 = M03.title;
                            z3 = false;
                        }
                        gc0Var.b(M03);
                    }
                    String str5 = str4;
                    final TLRPC.Chat chat4 = chat2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(gc0Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new qya(nx0VarArr2, n), 3, spannableStringBuilder.length(), 33);
                    p66Var.setText(spannableStringBuilder);
                    if (!z3) {
                        hjbVar.l(p66Var, ob6.M0(i2 < 0 ? 2131744652 : z ? 2131744662 : 2131744667, null));
                    }
                    if (i2 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        hjbVar.f(ob6.M0(z ? 2131744660 : 2131744665, null), starsSubscription.title, null, null);
                    }
                    hjbVar.f(ob6.M0(2131744633, str3), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), ob6.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                        j = n;
                        i4 = 2131744626;
                    } else {
                        j = n;
                        i4 = currentTime > ((long) starsSubscription.until_date) ? 2131744627 : 2131744625;
                    }
                    hjbVar.f(ob6.M0(i4, null), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(starsSubscription.until_date * 1000)), ob6.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    m.addView(hjbVar, tre.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    Activity activity2 = activity;
                    p66 p66Var2 = new p66(activity2, resourceProvider);
                    int i11 = aob.z6;
                    yob.X(p66Var2, i11, resourceProvider);
                    yob.G(p66Var2, i10, resourceProvider);
                    p66Var2.setTextSize(1, 14.0f);
                    p66Var2.setText(hl.N2(ob6.M0(2131744583, null), -1, 0, new n9(activity2, (byte) 5), null));
                    p66Var2.setGravity(17);
                    m.addView(p66Var2, tre.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        pyaVar = pyaVar2;
                        nx0VarArr = nx0VarArr2;
                        i5 = i7;
                        p66 p66Var3 = new p66(activity2, resourceProvider);
                        yob.X(p66Var3, i11, resourceProvider);
                        yob.G(p66Var3, i10, resourceProvider);
                        p66Var3.setTextSize(1, 14.0f);
                        p66Var3.setText(ob6.a0(null, null, 2131744642, ob6.u(starsSubscription.until_date, false)));
                        p66Var3.setSingleLine(false);
                        p66Var3.setMaxLines(4);
                        p66Var3.setGravity(17);
                        m.addView(p66Var3, tre.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            c51 c51Var = new c51(resourceProvider, activity2, true);
                            c51Var.setRoundRadius(24);
                            r5 = 0;
                            c51Var.i(ob6.M0(2131744668, null), false, true);
                            m.addView(c51Var, tre.o(-1, 48));
                            c51Var.setOnClickListener(new l63(c51Var, starsSubscription, i5, nx0VarArr, resourceProvider, zArr2, activity2));
                            i8.O = m;
                            nx0VarArr[r5] = i8;
                            i8.T0 = r5;
                            i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eya
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    jn7.f(i5).n(pyaVar, jn7.C3);
                                }
                            });
                            nx0VarArr[r5].J();
                            S = LaunchActivity.S();
                            if (!hl.O1() && !hl.s1(S)) {
                                nx0VarArr[r5].X(S);
                            }
                            nx0VarArr[r5].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        p66 p66Var4 = new p66(activity2, resourceProvider);
                        yob.X(p66Var4, i11, resourceProvider);
                        yob.G(p66Var4, i10, resourceProvider);
                        p66Var4.setTextSize(1, 14.0f);
                        p66Var4.setText(ob6.a0(null, null, z2 ? 2131744663 : 2131744638, ob6.u(starsSubscription.until_date, false)));
                        p66Var4.setSingleLine(false);
                        p66Var4.setMaxLines(4);
                        p66Var4.setGravity(17);
                        m.addView(p66Var4, tre.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        c51 c51Var2 = new c51(resourceProvider, activity2, true);
                        c51Var2.i(ob6.M0(z2 ? 2131744664 : 2131744639, null), false, true);
                        m.addView(c51Var2, tre.o(-1, 48));
                        pyaVar = pyaVar2;
                        nx0VarArr = nx0VarArr2;
                        cya cyaVar = new cya(c51Var2, i7, starsSubscription, nx0VarArr, j, activity2, resourceProvider, z, str2);
                        i5 = i7;
                        c51Var2.setOnClickListener(cyaVar);
                    } else {
                        pyaVar = pyaVar2;
                        nx0VarArr = nx0VarArr2;
                        i5 = i7;
                        if (starsSubscription.bot_canceled) {
                            p66 p66Var5 = new p66(activity2, resourceProvider);
                            yob.X(p66Var5, aob.nk, resourceProvider);
                            yob.G(p66Var5, i10, resourceProvider);
                            p66Var5.setTextSize(1, 14.0f);
                            p66Var5.setText(ob6.M0(z ? 2131744661 : 2131744666, null));
                            p66Var5.setSingleLine(false);
                            p66Var5.setMaxLines(4);
                            p66Var5.setGravity(17);
                            m.addView(p66Var5, tre.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            p66 p66Var6 = new p66(activity2, resourceProvider);
                            yob.X(p66Var6, aob.nk, resourceProvider);
                            yob.G(p66Var6, i10, resourceProvider);
                            p66Var6.setTextSize(1, 14.0f);
                            p66Var6.setText(ob6.M0(2131744655, null));
                            p66Var6.setSingleLine(false);
                            p66Var6.setMaxLines(4);
                            p66Var6.setGravity(17);
                            m.addView(p66Var6, tre.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                c51 c51Var3 = new c51(resourceProvider, activity2, true);
                                c51Var3.i(ob6.M0(2131744637, null), false, true);
                                m.addView(c51Var3, tre.o(-1, 48));
                                c51Var3.setOnClickListener(new be(c51Var3, starsSubscription, i5, nx0VarArr, chat4, str2));
                            }
                        } else {
                            p66 p66Var7 = new p66(activity2, resourceProvider);
                            yob.X(p66Var7, i11, resourceProvider);
                            yob.G(p66Var7, i10, resourceProvider);
                            p66Var7.setTextSize(1, 14.0f);
                            p66Var7.setText(ob6.a0(null, null, 2131744658, ob6.u(starsSubscription.until_date, false)));
                            p66Var7.setSingleLine(false);
                            p66Var7.setMaxLines(4);
                            p66Var7.setGravity(17);
                            m.addView(p66Var7, tre.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final c51 c51Var4 = new c51(resourceProvider, activity2, false);
                            c51Var4.i(ob6.M0(2131744659, null), false, true);
                            c51Var4.setTextColorKey(aob.nk);
                            m.addView(c51Var4, tre.o(-1, 48));
                            c51Var4.setOnClickListener(new View.OnClickListener() { // from class: dya
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final c51 c51Var5 = c51Var4;
                                    if (c51Var5.R) {
                                        return;
                                    }
                                    c51Var5.setLoading(true);
                                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                                    tL_changeStarsSubscription.canceled = Boolean.TRUE;
                                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                                    final TL_stars.StarsSubscription starsSubscription2 = starsSubscription;
                                    tL_changeStarsSubscription.subscription_id = starsSubscription2.id;
                                    final int i12 = i5;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                                    final TLObject tLObject = chat4;
                                    final boolean z4 = z;
                                    final boolean z5 = z2;
                                    final nx0[] nx0VarArr3 = nx0VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: iya
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            hl.c3(new vo9(i12, c51Var5, tLObject, starsSubscription2, z4, z5, nx0VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r5 = 0;
                    i8.O = m;
                    nx0VarArr[r5] = i8;
                    i8.T0 = r5;
                    i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eya
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            jn7.f(i5).n(pyaVar, jn7.C3);
                        }
                    });
                    nx0VarArr[r5].J();
                    S = LaunchActivity.S();
                    if (!hl.O1()) {
                        nx0VarArr[r5].X(S);
                    }
                    nx0VarArr[r5].show();
                }
                TLRPC.User X13 = uc7.s1(i7).X1(Long.valueOf(n));
                rb0Var.q(X13);
                de0Var.f(X13, rb0Var);
            }
            chat2 = chat3;
            str2 = str;
            frameLayout.addView(de0Var, tre.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            yob.x(frameLayout, drawable3, aob.h5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            qd4.w(textView3, aob.j5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            m.addView(textView3, tre.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            yob.X(textView22, aob.B6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i3 = tL_starsSubscriptionPricing2.period;
            if (i3 != 2592000) {
            }
            m.addView(textView22, tre.t(-1, -2, 17, 20, 0, 20, 4));
            hjb hjbVar2 = new hjb(parentActivity, resourceProvider);
            p66 p66Var8 = new p66(parentActivity, resourceProvider);
            p66Var8.setPadding(hl.L(12.66f), hl.L(9.33f), hl.L(12.66f), hl.L(9.33f));
            p66Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i102 = aob.Xc;
            yob.X(p66Var8, i102, resourceProvider);
            yob.G(p66Var8, i102, resourceProvider);
            p66Var8.setTextSize(1, 14.0f);
            p66Var8.setSingleLine(true);
            p66Var8.setDisablePaddingsOffsetY(true);
            gc0 gc0Var2 = new gc0(24.0f, i7, p66Var8);
            if (i2 < 0) {
            }
            String str52 = str4;
            final TLObject chat42 = chat2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(gc0Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new qya(nx0VarArr2, n), 3, spannableStringBuilder2.length(), 33);
            p66Var8.setText(spannableStringBuilder2);
            if (!z3) {
            }
            if (i2 >= 0) {
            }
            str3 = null;
            hjbVar2.f(ob6.M0(2131744633, str3), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), ob6.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (starsSubscription.canceled) {
            }
            j = n;
            i4 = 2131744626;
            hjbVar2.f(ob6.M0(i4, null), ob6.a0(null, null, 2131742414, ob6.D0().r0().format(new Date(starsSubscription.until_date * 1000)), ob6.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            m.addView(hjbVar2, tre.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            Activity activity22 = activity;
            p66 p66Var22 = new p66(activity22, resourceProvider);
            int i112 = aob.z6;
            yob.X(p66Var22, i112, resourceProvider);
            yob.G(p66Var22, i102, resourceProvider);
            p66Var22.setTextSize(1, 14.0f);
            p66Var22.setText(hl.N2(ob6.M0(2131744583, null), -1, 0, new n9(activity22, (byte) 5), null));
            p66Var22.setGravity(17);
            m.addView(p66Var22, tre.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r5 = 0;
            i8.O = m;
            nx0VarArr[r5] = i8;
            i8.T0 = r5;
            i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eya
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    jn7.f(i5).n(pyaVar, jn7.C3);
                }
            });
            nx0VarArr[r5].J();
            S = LaunchActivity.S();
            if (!hl.O1()) {
            }
            nx0VarArr[r5].show();
        }
    }

    public final /* synthetic */ void N0(Context context) {
        if (uc7.s1(this.currentAccount).x2()) {
            i5.b(this.currentAccount);
        } else {
            new eza(context, this.resourceProvider).show();
        }
    }

    public final /* synthetic */ void O0(Context context) {
        new eza(context, this.resourceProvider).show();
    }

    public final void P0() {
        jxa.v(this.currentAccount, false).r();
        bx4.g1(true, pj0.a(this.currentAccount).b());
    }

    public final void Q0(b8c b8cVar, Boolean bool, String str) {
        if (getParentActivity() != null) {
            if (bool.booleanValue()) {
                d31.b0(this).I(R.raw.stars_topup, ob6.M0(2131744816, null), hl.S2(ob6.G((int) b8cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                this.i0.c(true);
                jxa.v(this.currentAccount, false).Q(true);
            } else if (str != null) {
                d31.b0(this).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
            }
        }
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final byte b = 0;
        this.H = false;
        this.F = hl.L(238.0f);
        wka wkaVar = new wka(context);
        this.V = wkaVar;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        wkaVar.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            wk5 wk5Var = this.parentLayout;
            this.c0 = (wk5Var == null || !((ActionBarLayout) wk5Var).T0) ? hl.m : 0;
            this.d0 = hl.n;
        }
        this.V.setGeometry(new ve9((Object) this, (byte) 12));
        this.V.A(-c00.y(48.0f, this.c0, -hl.L(8.0f)), -c00.y(48.0f, this.d0, -hl.L(8.0f)));
        wka wkaVar2 = this.V;
        wkaVar2.getClass();
        this.W = new nf9((byte) 7, context, wkaVar2);
        this.U = new mza(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        byte b2 = 9;
        this.h0 = new nf9(b2, context, this);
        super.createView(context);
        l15 l15Var = this.s;
        getBaseSimpleGlass().h(l15Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new dg0(this, new kya(l15Var, b), b2);
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        wka wkaVar3 = this.V;
        wkaVar3.addView(this.X, wkaVar3.indexOfChild(view), tre.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        nxa nxaVar = new nxa(this, b);
        k43 k43Var = k43.h;
        fm0 fm0Var = new fm0(0, nxaVar, k43Var, 380L, false);
        this.Y = fm0Var;
        this.Z = new fm0(1, new nxa(this, c3 == true ? 1 : 0), k43Var, 380L, false);
        this.a0 = new fm0(2, new nxa(this, (byte) 2), k43Var, 380L, false);
        fm0Var.a(this.c.canScrollVertically(-1) || this.simpleActionBar.z(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new e98(this, (byte) 26));
        r1();
        jl0 c4 = getBaseSimpleGlass().c.c(view, null, false);
        c4.p(dtd.l(this.resourceProvider));
        c4.q(hl.L(9.66f));
        c4.r(hl.L(18.0f));
        view.setBackground(c4);
        wk5 wk5Var2 = this.parentLayout;
        if (wk5Var2 != null && ((ActionBarLayout) wk5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        it4 it4Var = new it4(context, 1, 2);
        this.T = it4Var;
        ys4 ys4Var = it4Var.b;
        ys4Var.z = aob.Wk;
        ys4Var.A = aob.Xk;
        ys4Var.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, tre.d(jn7.T2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        i0(ob6.M0(2131743868, null), hl.D2(hl.N2(ob6.M0(2131743865, null), -1, 0, new xf1(context, (byte) 15), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43Var);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        this.c.setOnItemClickListener(new t39(this, (byte) 11));
        tj4 tj4Var = new tj4(getParentActivity());
        this.i0 = tj4Var;
        this.s.addView(tj4Var, tre.c(-1.0f, -1));
        jxa v = jxa.v(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, hl.L(24.0f), 0, hl.L(10.0f));
        in inVar = new in(getParentActivity(), false, true, false);
        this.l0 = inVar;
        inVar.setTypeface(hl.o());
        this.l0.setTextSize(hl.L(32.0f));
        this.l0.setGravity(17);
        yob.U(this.l0, aob.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        rn5 rn5Var = new rn5(42.0f, this.currentAccount, this.l0);
        b29 b29Var = new b29(R.raw.star_reaction, hl.L(42.0f), hl.L(42.0f));
        ImageReceiver imageReceiver = rn5Var.b;
        imageReceiver.g0(b29Var);
        imageReceiver.M(2);
        rn5Var.f = false;
        rn5Var.h = -hl.L(3.0f);
        this.k0.setSpan(rn5Var, 0, 1, 33);
        this.j0.addView(this.l0, tre.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(ob6.M0(2131742421, null));
        yob.X(this.m0, aob.z6, this.resourceProvider);
        this.j0.addView(this.m0, tre.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        d26 d26Var = new d26((byte) 27, getParentActivity(), this);
        this.o0 = d26Var;
        frameLayout2.addView(d26Var);
        c51 c51Var = new c51(this.resourceProvider, getParentActivity(), true);
        this.p0 = c51Var;
        c51Var.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: uxa
            public final /* synthetic */ nza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                Context context2 = context;
                nza nzaVar = this.b;
                switch (b3) {
                    case 0:
                        nzaVar.N0(context2);
                        break;
                    default:
                        nzaVar.O0(context2);
                        break;
                }
            }
        });
        this.o0.addView(this.p0, tre.e(-1, 48, jn7.D1));
        oob oobVar = new oob((byte) 19, getParentActivity(), this);
        this.q0 = oobVar;
        frameLayout2.addView(oobVar);
        c51 c51Var2 = new c51(this.resourceProvider, getParentActivity(), true);
        this.r0 = c51Var2;
        c51Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wm2(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131744622, null));
        this.r0.i(spannableStringBuilder, false, true);
        c51 c51Var3 = this.r0;
        final char c5 = c2 == true ? 1 : 0;
        c51Var3.setOnClickListener(new View.OnClickListener(this) { // from class: uxa
            public final /* synthetic */ nza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = c5;
                Context context2 = context;
                nza nzaVar = this.b;
                switch (b3) {
                    case 0:
                        nzaVar.N0(context2);
                        break;
                    default:
                        nzaVar.O0(context2);
                        break;
                }
            }
        });
        this.q0.addView(this.r0, tre.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        c51 c51Var4 = new c51(this.resourceProvider, getParentActivity(), true);
        this.n0 = c51Var4;
        c51Var4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wm2(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131744679, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: zxa
            public final /* synthetic */ nza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                nza nzaVar = this.b;
                switch (b3) {
                    case 0:
                        nzaVar.presentFragment(new at0(0, nzaVar.getUserConfig().e()));
                        break;
                    default:
                        nzaVar.P0();
                        break;
                }
            }
        });
        this.q0.addView(this.n0, tre.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, tre.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        c51 c51Var5 = new c51(this.resourceProvider, getParentActivity(), false);
        this.s0 = c51Var5;
        c51Var5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new wm2(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) ob6.M0(2131743866, null));
        this.s0.i(spannableStringBuilder3, false, true);
        c51 c51Var6 = this.s0;
        final char c6 = c == true ? 1 : 0;
        c51Var6.setOnClickListener(new View.OnClickListener(this) { // from class: zxa
            public final /* synthetic */ nza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = c6;
                nza nzaVar = this.b;
                switch (b3) {
                    case 0:
                        nzaVar.presentFragment(new at0(0, nzaVar.getUserConfig().e()));
                        break;
                    default:
                        nzaVar.P0();
                        break;
                }
            }
        });
        this.j0.addView(this.s0, tre.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        wb wbVar = this.v0;
        if (wbVar != null) {
            wbVar.O(false);
        }
        kt0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = kt0.g(this.currentAccount).h(getUserConfig().e(), false);
        q1(v.m().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.x3;
        int i4 = jn7.C3;
        int i5 = jn7.B3;
        if (i == i5 || i == i4 || i == i3) {
            o1("NOTIFICATION_" + i);
        }
        if (i == i3) {
            t0();
            wb wbVar = this.v0;
            if (wbVar != null) {
                wbVar.O(true);
            }
            g0();
            return;
        }
        if (i == i5) {
            jxa v = jxa.v(this.currentAccount, false);
            if (this.t0 != v.K(0)) {
                this.t0 = v.K(0);
                t0();
                wb wbVar2 = this.v0;
                if (wbVar2 != null) {
                    wbVar2.O(false);
                }
                g0();
                return;
            }
            return;
        }
        if (i == i4) {
            wb wbVar3 = this.v0;
            if (wbVar3 != null) {
                wbVar3.O(true);
                return;
            }
            return;
        }
        if (i == jn7.A3) {
            p1();
        } else if (i == jn7.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            p1();
        }
    }

    @Override // m15
    public final void g0() {
        wka wkaVar;
        o1("RESTORE_BEFORE");
        super.g0();
        if (this.f0 && (wkaVar = this.V) != null && this.b0 != -1) {
            wkaVar.a();
        }
        this.f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override // m15
    public final void h0() {
        this.s.addView(this.V, tre.c(-1.0f, -1));
        this.V.v(this.c, new nxa(this, (byte) 3));
        wka wkaVar = this.V;
        mza mzaVar = this.U;
        wkaVar.y(mzaVar, mzaVar.b, new bya((byte) 0));
        this.V.z(this.U.d);
        this.U.d.setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        E0();
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wka wkaVar = this.V;
        return wkaVar == null || motionEvent == null || wkaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // m15
    public final j79 j0() {
        wb wbVar = new wb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new hj8(this, (byte) 24), getResourceProvider(), (byte) 4);
        this.v0 = wbVar;
        wbVar.r = false;
        return wbVar;
    }

    @Override // m15
    public final x46 k0(Context context) {
        wka wkaVar = this.V;
        wkaVar.getClass();
        return new of2((Object) wkaVar, (byte) 5);
    }

    @Override // m15
    public final eva l0() {
        return new uya(getParentActivity(), 75, 1);
    }

    @Override // m15
    public final View n0(Context context) {
        throw null;
    }

    public final void o1(String str) {
        if (this.V != null) {
            StringBuilder p = ik8.p("Stars event=", str, " row=");
            p.append(this.b0);
            p.append(" hasTransactions=");
            p.append(this.t0);
            p.append(" savedPosition=");
            p.append(this.Q);
            p.append(" savedOffset=");
            p.append(this.R);
            p.append(" savedPinned=");
            p.append(this.f0);
            p.append(" boundaryAttached=");
            nf9 nf9Var = this.W;
            p.append((nf9Var == null || nf9Var.getParent() == null) ? false : true);
            p.append(" boundaryTop=");
            nf9 nf9Var2 = this.W;
            p.append(nf9Var2 == null ? 0 : nf9Var2.getTop());
            p.append(" boundaryHeight=");
            nf9 nf9Var3 = this.W;
            p.append(nf9Var3 != null ? nf9Var3.getHeight() : 0);
            Log.d("SiblingScroll", p.toString());
            wka wkaVar = this.V;
            if (wkaVar.a) {
                wkaVar.b = Math.max(wkaVar.b, 30);
                wkaVar.f(str, null, 0, 0, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.x3);
        jn7.f(this.currentAccount).b(this, jn7.A3);
        jn7.f(this.currentAccount).b(this, jn7.B3);
        jn7.f(this.currentAccount).b(this, jn7.C3);
        jn7.f(this.currentAccount).b(this, jn7.E3);
        jxa.v(this.currentAccount, false).Q(true);
        jxa.v(this.currentAccount, false).P();
        jxa.v(this.currentAccount, false).w();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        d79 d79Var = this.c;
        if (d79Var != null) {
            d79Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.x3);
        jn7.f(this.currentAccount).n(this, jn7.A3);
        jn7.f(this.currentAccount).n(this, jn7.B3);
        jn7.f(this.currentAccount).n(this, jn7.C3);
        jn7.f(this.currentAccount).n(this, jn7.E3);
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        E0();
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        it4 it4Var = this.T;
        if (it4Var != null) {
            it4Var.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // m15, org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        it4 it4Var = this.T;
        if (it4Var != null) {
            it4Var.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override // m15
    public final float p0() {
        d79 d79Var = this.c;
        if (d79Var == null) {
            return 0.0f;
        }
        return d79Var.getY();
    }

    public final void p1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        jxa v = jxa.v(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) H0(v.m(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(ob6.M0(v.m().amount > 0 ? 2131744807 : 2131744808, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = kt0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        q1(z, true);
    }

    @Override // m15
    public final View q0() {
        return this.V;
    }

    public final void q1(final boolean z, boolean z2) {
        this.u0 = z;
        d26 d26Var = this.o0;
        if (z2) {
            d26Var.setVisibility(0);
            this.q0.setVisibility(0);
            final byte b = 0;
            this.o0.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: hya
                public final /* synthetic */ nza b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z3 = z;
                    nza nzaVar = this.b;
                    switch (b2) {
                        case 0:
                            if (z3) {
                                nzaVar.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                nzaVar.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final byte b2 = 1;
            this.q0.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: hya
                public final /* synthetic */ nza b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    boolean z3 = z;
                    nza nzaVar = this.b;
                    switch (b22) {
                        case 0:
                            if (z3) {
                                nzaVar.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                nzaVar.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        d26Var.animate().cancel();
        this.q0.animate().cancel();
        this.q0.setAlpha(z ? 1.0f : 0.0f);
        this.o0.setAlpha(z ? 0.0f : 1.0f);
        this.q0.setVisibility(z ? 0 : 8);
        this.o0.setVisibility(z ? 8 : 0);
    }

    @Override // m15
    public final void r0(boolean z) {
        fm0 fm0Var = this.a0;
        if (fm0Var == null || fm0Var.f == z) {
            return;
        }
        fm0Var.a(z, true);
    }

    public final void r1() {
        if (this.X == null) {
            return;
        }
        int L = hl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        s1();
    }

    public final void s1() {
        View view = this.X;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.Y;
        float f = fm0Var == null ? 0.0f : fm0Var.e;
        fm0 fm0Var2 = this.Z;
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - (fm0Var2 != null ? fm0Var2.e : 0.0f)) * hl.L(44.0f)));
    }

    @Override // m15
    public final void t0() {
        o1("SAVE_BEFORE");
        super.t0();
        wka wkaVar = this.V;
        this.f0 = wkaVar != null && wkaVar.f0;
        d79 d79Var = this.c;
        if (d79Var != null && this.Q >= 0) {
            this.R -= d79Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
