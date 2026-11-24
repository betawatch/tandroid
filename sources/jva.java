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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jva extends iz4 implements gk7 {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public er4 T;
    public iva U;
    public dha V;
    public si9 W;
    public View X;
    public fm0 Y;
    public fm0 Z;
    public fm0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public si9 h0;
    public qh4 i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public hn l0;
    public TextView m0;
    public u41 n0;
    public oc6 o0;
    public u41 p0;
    public pkb q0;
    public u41 r0;
    public u41 s0;
    public boolean t0;
    public boolean u0;
    public vb v0;
    public int b0 = -1;
    public final z6a g0 = new z6a(this, 23);

    public jva() {
        this.N = true;
    }

    public static void B0(mfb mfbVar, int i, TL_stars.StarGift starGift, wjb wjbVar) {
        TextView textView = (TextView) ((jfb) mfbVar.f(k96.M0(2131750284, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        u86 u86Var = new u86(textView, gl.L(90.0f), 0, wjbVar);
        u86Var.a(bkb.p1(0.21f, textView.getPaint().getColor()), bkb.p1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(u86Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
            int i2 = starGift.availability_remains;
            if (z) {
                textView.setText(i2 <= 0 ? k96.H(',', "Gift2QuantityIssuedNone", starGift.availability_total) : k96.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(k96.H(',', "Gift2QuantityIssued2", starGift.availability_total)));
                return;
            } else {
                int i3 = starGift.availability_total;
                textView.setText(i2 <= 0 ? k96.H(',', "Gift2Availability2ValueNone", i3) : k96.K("Gift2Availability4Value", i2, ',', k96.E(i3, ',')));
                return;
            }
        }
        final gta v = gta.v(i, false);
        final long j = starGift.id;
        final ae9 ae9Var = new ae9(textView, (byte) 12);
        final boolean[] zArr = {false};
        final gk7[] gk7VarArr = new gk7[1];
        gk7VarArr[0] = new gk7() { // from class: rsa
            @Override // gk7
            public final void didReceivedNotification(int i4, int i5, Object[] objArr) {
                int i6;
                gta gtaVar;
                TL_stars.StarGift G;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i4 != (i6 = kk7.G3) || (G = (gtaVar = gta.this).G(j)) == null) {
                    return;
                }
                zArr2[0] = true;
                kk7.f(gtaVar.a).n(gk7VarArr[0], i6);
                ae9Var.a(G);
            }
        };
        int i4 = v.a;
        kk7 f = kk7.f(i4);
        gk7 gk7Var = gk7VarArr[0];
        int i5 = kk7.G3;
        f.a(gk7Var, i5);
        TL_stars.StarGift G = v.G(j);
        if (G != null) {
            zArr[0] = true;
            kk7.f(i4).n(gk7VarArr[0], i5);
            ae9Var.a(G);
        }
    }

    public static void C0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new oua(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder F0(TL_stars.StarsAmount starsAmount) {
        return G0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder G0(TL_stars.StarsAmount starsAmount, float f, char c) {
        double d;
        int i;
        if (x0 == null) {
            x0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j = starsAmount.amount;
            if (j % 1000000000 == 0) {
                spannableStringBuilder.append((CharSequence) (starsAmount.negative() ? "-" : "").concat(k96.E(Math.abs(starsAmount.amount / 1000000000), c)));
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
                spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(k96.E(Math.abs(j3), c)));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(k96.E(Math.abs(j3), c)));
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

    public static SpannableStringBuilder H0(TL_stars.StarsAmount starsAmount, float f, char c) {
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
                    spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(k96.E(Math.abs(j2), c)));
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append((CharSequence) ((z ? "-" : "") + gl.o0((int) Math.abs(j2), 0)));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(k96.E(Math.abs(j2), c)));
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

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
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
            spannableStringBuilder.append((CharSequence) k96.H(',', "Stars", (int) j));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(k96.E(Math.abs(j2), ',')));
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
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131744847, null));
        return spannableStringBuilder;
    }

    public static String J0(long j) {
        DecimalFormat decimalFormat = w0;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
            w0 = decimalFormat;
        }
        if (j % 1000000000 != 0) {
            return decimalFormat.format(j / 1.0E9d);
        }
        return (j < 0 ? "-" : "").concat(k96.E(Math.abs(j / 1000000000), ','));
    }

    public static String K0(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        int i2;
        if (starsTransaction.stargift_drop_original_details) {
            return k96.M0(2131744695, null);
        }
        if (starsTransaction.posts_search) {
            return k96.M0(2131744699, null);
        }
        if (starsTransaction.premium_gift) {
            return k96.M0(2131744698, null);
        }
        if (starsTransaction.phonegroup_message) {
            return k96.M0(starsTransaction.reaction ? 2131744707 : 2131744708, null);
        }
        if (starsTransaction.paid_message) {
            return k96.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return k96.M0(2131744722, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return k96.M0(2131744967, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i3 = starsTransaction.flags;
        if ((131072 & i3) == 0 && (65536 & i3) != 0) {
            return k96.a0(null, null, 2131744924, bc.I0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return k96.M0(2131749914, null);
            }
            boolean z2 = starsTransaction.refund;
            boolean z3 = starsTransaction.stargift_auction_bid;
            if (z2) {
                return k96.M0(z3 ? 2131749913 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749910 : 2131749911 : 2131749912, null);
            }
            return k96.M0(z3 ? 2131749916 : starsAmount.amount > 0 ? 2131749915 : starsTransaction.stargift_upgrade ? 2131749907 : 2131749908, null);
        }
        if (starsTransaction.subscription) {
            int i4 = starsTransaction.subscription_period;
            if (i4 == 2592000) {
                return k96.M0(2131744926, null);
            }
            if (i4 == 300) {
                return "5-minute subscription fee";
            }
            if (i4 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i3 & TLObject.FLAG_13) != 0) {
            return k96.M0(2131744856, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return k96.M0(l7c.D(na7.q1(i).V1(Long.valueOf(cf3.n(starsTransaction.sent_by)))) ? 2131744864 : 2131744865, null);
            }
            return k96.M0(2131744865, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long n = cf3.n(starsTransaction.peer.peer);
        if (n != 0) {
            int i5 = y6c.t0;
            if (n >= 0) {
                return l7c.r(na7.q1(i5).V1(Long.valueOf(n)));
            }
            TLRPC.Chat K0 = na7.q1(i5).K0(Long.valueOf(-n));
            return K0 == null ? "" : K0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? k96.M0(2131744724, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? k96.M0(2131744725, null) : k96.M0(2131744686, null);
        }
        if (!z) {
            boolean z4 = starsTransaction.refund;
            TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
            if (!z4 ? !starsAmount2.negative() : !starsAmount2.positive()) {
                i2 = 2131744714;
                return k96.M0(i2, null);
            }
        }
        i2 = 2131744684;
        return k96.M0(i2, null);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f) {
        return R0(charSequence, f, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f, float f2, float f3) {
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString("💎 ");
        cm2 cm2Var = new cm2(R.drawable.diamond, 0);
        cm2Var.d = false;
        cm2Var.r = 0.0f;
        cm2Var.s = f2;
        cm2Var.H = f3;
        cm2Var.I = f;
        cm2Var.J = f;
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.I2(spannableStringBuilder, "💎", "💎️");
        gl.I2(spannableStringBuilder, "💎", "💎 ");
        gl.I2(spannableStringBuilder, spannableString, "💎");
        gl.I2(spannableStringBuilder, "XTR", "XTR ");
        gl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder S0(CharSequence charSequence) {
        return T0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, float f, cm2[] cm2VarArr) {
        return X0(false, charSequence, f, cm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, boolean z) {
        return W0(z, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder V0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return W0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder W0(boolean z, CharSequence charSequence, float f, cm2[] cm2VarArr) {
        return X0(z, charSequence, f, cm2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z, CharSequence charSequence, float f, cm2[] cm2VarArr, float f2, float f3) {
        cm2 cm2Var;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z ? "TON" : "⭐").concat(" "));
        if (cm2VarArr == null || (cm2Var = cm2VarArr[0]) == null) {
            cm2Var = new cm2(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (cm2VarArr != null) {
                cm2VarArr[0] = cm2Var;
            }
        }
        cm2Var.r = 0.0f;
        cm2Var.s = f2;
        cm2Var.H = f3;
        if (z) {
            cm2Var.d = false;
            float f4 = f * 0.2f;
            cm2Var.I = f4;
            cm2Var.J = f4;
        } else {
            cm2Var.I = f;
            cm2Var.J = f;
        }
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.I2(spannableStringBuilder, "⭐", "⭐️");
        gl.I2(spannableStringBuilder, "⭐", "⭐ ");
        gl.I2(spannableStringBuilder, spannableString, "⭐");
        gl.I2(spannableStringBuilder, "XTR", "XTR ");
        gl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z, String str, cm2[] cm2VarArr) {
        cm2 cm2Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (cm2VarArr == null || (cm2Var = cm2VarArr[0]) == null) {
            cm2Var = new cm2(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f = z ? 0.222f : 1.13f;
            cm2Var.I = f;
            cm2Var.J = f;
        }
        if (z) {
            cm2Var.d = false;
        }
        if (cm2VarArr != null) {
            cm2VarArr[0] = cm2Var;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.I2(spannableStringBuilder, "⭐", "⭐️");
        gl.I2(spannableStringBuilder, "⭐", "⭐ ");
        gl.I2(spannableStringBuilder, spannableString, "⭐");
        gl.I2(spannableStringBuilder, "XTR", "XTR ");
        gl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, cm2[] cm2VarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, cm2VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannableStringBuilder a1(boolean z, CharSequence charSequence, float f, cm2[] cm2VarArr) {
        int i;
        String str;
        cm2 cm2Var;
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
        if (cm2VarArr != null) {
            cm2Var = cm2VarArr[0];
            if (cm2Var == null) {
                if (cm2VarArr.length > 0) {
                    cm2Var = new cm2(i, 0);
                    cm2VarArr[0] = cm2Var;
                }
            }
            cm2Var.d = false;
            if (z) {
                f *= 0.33f;
            }
            cm2Var.I = f;
            cm2Var.J = f;
            spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
            gl.I2(spannableStringBuilder, "⭐", "⭐️");
            gl.I2(spannableStringBuilder, "⭐", "⭐ ");
            gl.I2(spannableStringBuilder, spannableString, "⭐");
            gl.I2(spannableStringBuilder, "XTR", "XTR ");
            gl.I2(spannableStringBuilder, spannableString, "XTR");
            return spannableStringBuilder;
        }
        cm2Var = new cm2(i, 0);
        cm2Var.d = false;
        if (z) {
        }
        cm2Var.I = f;
        cm2Var.J = f;
        spannableString.setSpan(cm2Var, 0, spannableString.length() - 1, 33);
        gl.I2(spannableStringBuilder, "⭐", "⭐️");
        gl.I2(spannableStringBuilder, "⭐", "⭐ ");
        gl.I2(spannableStringBuilder, spannableString, "⭐");
        gl.I2(spannableStringBuilder, "XTR", "XTR ");
        gl.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static cua b1(be0 be0Var, ImageReceiver imageReceiver, String str, boolean z) {
        final byte b = 1;
        int i = imageReceiver.d;
        final pj3 pj3Var = new pj3(z, i, str, imageReceiver, new boolean[1]);
        pj3Var.run();
        final byte b2 = 0;
        return new cua(kk7.f(i).h(be0Var, z ? kk7.Y2 : kk7.X2, new p8c() { // from class: bua
            @Override // p8c
            public final void a(Object obj) {
                byte b3 = b2;
                pj3 pj3Var2 = pj3Var;
                switch (b3) {
                    case 0:
                        pj3Var2.run();
                        break;
                    default:
                        pj3Var2.run();
                        break;
                }
            }
        }), kk7.f(i).h(be0Var, kk7.x0, new p8c() { // from class: bua
            @Override // p8c
            public final void a(Object obj) {
                byte b3 = b;
                pj3 pj3Var2 = pj3Var;
                switch (b3) {
                    case 0:
                        pj3Var2.run();
                        break;
                    default:
                        pj3Var2.run();
                        break;
                }
            }
        }), b2);
    }

    public static void c1(be0 be0Var, ImageReceiver imageReceiver, long j) {
        b1(be0Var, imageReceiver, j <= 1000 ? "2⃣" : j < 2500 ? "3⃣" : "4⃣", false);
    }

    public static void d1(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = ba4.w(document.thumbs, i, false, null, false);
        imageReceiver.Z(gl5.b(document), tb4.m(i, i, "_"), gl5.c(w, document), tb4.m(i, i, "_"), uo3.d(document.thumbs, bkb.Z6, 0.35f, false), 0L, null, null, 0);
    }

    public static void e1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i) {
        d1(imageReceiver, starGift == null ? null : starGift.getDocument(), i);
    }

    public static cua f1(be0 be0Var, ImageReceiver imageReceiver, int i) {
        return b1(be0Var, imageReceiver, i != 3 ? i != 6 ? i != 12 ? i != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void g1(be0 be0Var, ImageReceiver imageReceiver, long j) {
        b1(be0Var, imageReceiver, j <= 10000000000L ? "2⃣" : j <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void h1(Context context, int i, long j, TL_stories.Boost boost, wjb wjbVar) {
        int i2;
        if (context == null) {
            return;
        }
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout j2 = de9.j(context, 1);
        j2.setPadding(0, gl.L(20.0f), 0, gl.L(4.0f));
        j2.setClipChildren(false);
        j2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        j2.addView(frameLayout, nme.t(-1, kk7.f2, 7, 0, 0, 0, 10));
        qua quaVar = new qua(context, 70, 0);
        frameLayout.addView(quaVar, nme.c(-1.0f, -1));
        er4 er4Var = new er4(context, 1, 2);
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        er4Var.setStarParticlesView(quaVar);
        frameLayout.addView(er4Var, nme.d(kk7.z2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        er4Var.setPaused(false);
        TextView textView = new TextView(context);
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        byte b = 17;
        textView.setGravity(17);
        fx0[] fx0VarArr = new fx0[1];
        textView.setText(k96.H(' ', "BoostStars", (int) boost.stars));
        TextView m = ug8.m(j2, textView, nme.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setBackground(bkb.b0(gl.L(20.0f), -6915073));
        m.setTextColor(-1);
        m.setTextSize(1, 11.33f);
        m.setPadding(gl.L(4.0f), 0, gl.L(8.33f), 0);
        m.setGravity(17);
        m.setTypeface(gl.o());
        int i3 = boost.multiplier;
        if (i3 == 0) {
            i3 = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x".concat(k96.H(' ', "BoostingBoostsCount", i3)));
        cm2 cm2Var = new cm2(R.drawable.mini_boost_badge, 2);
        float L = gl.L(0.66f);
        cm2Var.r = 0.0f;
        cm2Var.s = L;
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
        m.setText(spannableStringBuilder);
        j2.addView(m, nme.t(-2, 20, 17, 20, 4, 20, 4));
        mfb mfbVar = new mfb(context, wjbVar);
        mfbVar.n(k96.M0(2131753624, null), i, j, new ota(fx0VarArr, j, (byte) 6));
        mfbVar.f(k96.M0(2131753623, null), k96.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = k96.M0(2131753612, null);
            String M02 = k96.M0(2131753611, null);
            i2 = 1;
            go6 go6Var = new go6((Object) fx0VarArr, j, (Object) boost, (byte) 27);
            fx0VarArr = fx0VarArr;
            mfbVar.i(M0, M02, go6Var);
        } else {
            i2 = 1;
        }
        String M03 = k96.M0(2131753659, null);
        String format = k96.D0().r0().format(new Date(boost.date * 1000));
        String format2 = k96.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[0] = format;
        objArr[i2] = format2;
        mfbVar.f(M03, k96.a0(null, null, 2131742520, objArr), null, null);
        String M04 = k96.M0(2131753604, null);
        String format3 = k96.D0().r0().format(new Date(boost.expires * 1000));
        String format4 = k96.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[0] = format3;
        objArr2[i2] = format4;
        mfbVar.f(M04, k96.a0(null, null, 2131742520, objArr2), null, null);
        j2.addView(mfbVar, nme.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        l46 l46Var = new l46(context, wjbVar);
        zkb.X(l46Var, bkb.y6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setTextSize(i2, 14.0f);
        l46Var.setText(gl.N2(k96.M0(2131744689, null), -1, 0, new vf1(context, b), null));
        l46Var.setGravity(17);
        j2.addView(l46Var, nme.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.i(k96.M0(2131747638, null), false, true);
        u41Var.setOnClickListener(new f5(fx0VarArr, (byte) 5));
        j2.addView(u41Var, nme.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        h.O = j2;
        fx0VarArr[0] = h;
        h.T0 = false;
        h.K();
        d S = LaunchActivity.S();
        if (!gl.O1() && !gl.s1(S)) {
            fx0VarArr[0].X(S);
        }
        er4Var.setPaused(false);
        fx0VarArr[0].show();
        fx0VarArr[0].n(new z6a(er4Var, (byte) 24));
    }

    public static o0a i1(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, i8c i8cVar, wjb wjbVar) {
        oj ojVar = oj.a;
        o0a o0aVar = new o0a(context, wjbVar, i, tL_starGiftUnique == null ? nj.h(na7.q1(i).k4.o.f(), ojVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(oj.b) : tL_starGiftUnique.getResellAmount(ojVar), new nu9(i8cVar, r8, (byte) 12));
        o0a[] o0aVarArr = {o0aVar};
        o0aVar.show();
        return o0aVarArr[0];
    }

    public static void j1(Context context, long j, boolean z, final i8c i8cVar, wjb wjbVar) {
        fx0[] fx0VarArr;
        fx0 h = de9.h(1, wjbVar, context, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gl.o());
        u41 u41Var = null;
        textView.setText(k96.M0(2131747539, null));
        textView.setTextSize(1, 20.0f);
        int i = bkb.F6;
        zkb.X(textView, i, wjbVar);
        linearLayout.addView(textView, nme.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        er7 er7Var = new er7(context, wjbVar);
        er7Var.setForceForceUseCenter(true);
        er7Var.setText(k96.M0(2131747540, null));
        er7Var.setLeftPadding(gl.L(36.0f));
        zkb.X(editTextBoldCursor, i, wjbVar);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = gl.L(16.0f);
        editTextBoldCursor.setPadding(gl.L(6.0f), L, L, L);
        byte b = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        zkb.C(editTextBoldCursor, bkb.kg, wjbVar);
        zkb.l(editTextBoldCursor, 36, bkb.lg, wjbVar);
        editTextBoldCursor.setGravity(k96.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new jt0(er7Var, editTextBoldCursor, b));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, nme.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, nme.p(-1, -2, 1.0f, kk7.D1));
        er7Var.e(editTextBoldCursor);
        er7Var.addView(linearLayout2, nme.e(-1, -2, 48));
        linearLayout.addView(er7Var, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        zkb.X(textView2, bkb.z6, null);
        er7Var.addView(textView2, nme.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        l46 l46Var = new l46(context, null);
        l46Var.setText(gl.D2(gl.N2(k96.M0(2131747542, null), -1, 0, new vf1(context, (byte) 18), null), true));
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.y6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        linearLayout.addView(l46Var, nme.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final u41 i2 = yjb.i(24, wjbVar, context, true);
        i2.i(k96.M0(j > 0 ? 2131747538 : 2131747544, null), false, true);
        linearLayout.addView(i2, nme.o(-1, 48));
        if (j > 0 && z) {
            u41 i3 = yjb.i(24, wjbVar, context, false);
            i3.i(k96.M0(2131747543, null), false, false);
            linearLayout.addView(i3, nme.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            u41Var = i3;
        }
        h.O = linearLayout;
        final fx0[] fx0VarArr2 = {h};
        editTextBoldCursor.setText(j <= 0 ? "" : Long.toString(j));
        editTextBoldCursor.addTextChangedListener(new pua(editTextBoldCursor, er7Var, j, z, i2, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: uta
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
                i8cVar.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new xta(editTextBoldCursor2, fx0VarArr2, (byte) 1));
                return true;
            }
        });
        vta vtaVar = new vta(zArr, i8cVar, editTextBoldCursor, i2, fx0VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i2.setOnClickListener(vtaVar);
        if (u41Var != null) {
            u41 u41Var2 = u41Var;
            vta vtaVar2 = new vta(zArr, i8cVar, u41Var2, editTextBoldCursor2, fx0VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            fx0VarArr = fx0VarArr2;
            u41Var2.setOnClickListener(vtaVar2);
        } else {
            fx0VarArr = fx0VarArr2;
        }
        fx0VarArr[0].K();
        fx0VarArr[0].setOnDismissListener(new ic4(editTextBoldCursor2, (byte) 3));
        fx0VarArr[0].show();
        d Q = LaunchActivity.Q();
        gl.d3(new xta(fx0VarArr, editTextBoldCursor2), Q instanceof mu1 ? ((mu1) Q).U9() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x100b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x1062  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x109a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10c0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10a7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1050  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0e7a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0e7f A[LOOP:0: B:66:0x0df4->B:75:0x0e7f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0e8d A[EDGE_INSN: B:76:0x0e8d->B:77:0x0e8d BREAK  A[LOOP:0: B:66:0x0df4->B:75:0x0e7f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f08 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f2e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0f90  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v103 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fx0 k1(final Context context, final boolean z, final long j, final int i, final TL_stars.StarsTransaction starsTransaction, final wjb wjbVar) {
        fx0 fx0Var;
        boolean z2;
        Context context2;
        int i2;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z3;
        boolean z4;
        long j2;
        wjb wjbVar2;
        boolean z5;
        TLRPC.Peer peer;
        long j3;
        gl5 gl5Var;
        gl5 c;
        int i3;
        final fx0[] fx0VarArr;
        int i4;
        String L0;
        TL_stars.StarGift starGift;
        wjb wjbVar3;
        ViewGroup viewGroup;
        int i5;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        boolean z6;
        mfb mfbVar;
        mfb mfbVar2;
        mfb mfbVar3;
        mfb mfbVar4;
        mfb mfbVar5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z7;
        ViewGroup viewGroup2;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r3;
        d S;
        TLRPC.Chat K0;
        gl5 gl5Var2;
        gl5 c2;
        int i6;
        final fx0[] fx0VarArr2;
        boolean z8;
        mfb mfbVar6;
        mfb mfbVar7;
        fx0[] fx0VarArr3;
        final int i7;
        final fx0[] fx0VarArr4;
        int i8;
        long j4;
        mfb mfbVar8;
        int i9;
        long j5;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup3;
        mfb mfbVar9;
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
        fx0 fx0Var2 = new fx0(wjbVar, context, false, false);
        fx0Var2.K();
        fx0[] fx0VarArr5 = new fx0[1];
        final LinearLayout j6 = de9.j(context, 1);
        j6.setPadding(0, gl.L((z10 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, gl.L(8.0f));
        j6.setClipChildren(false);
        j6.setClipToPadding(false);
        boolean z13 = z10;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                tl tlVar = new tl(gl.L(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z2 = z11;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                fx0Var = fx0Var2;
                hua huaVar = new hua(context, matrix, radialGradient, paint, tlVar);
                tlVar.l(huaVar);
                tlVar.i(stargiftattributepattern.document, false);
                huaVar.setOrientation(1);
                be0 be0Var = new be0(context);
                e1(be0Var.getImageReceiver(), starsTransaction.stargift, kk7.p2);
                huaVar.addView(be0Var, nme.t(kk7.p2, kk7.p2, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    ote.a(be0Var);
                    be0Var.setOnClickListener(new wg((Object) context, i, (Object) tL_starGiftUnique, (byte) 17));
                }
                TextView b = hve.b(context, 20.0f, 0, true, null);
                b.setTextColor(-1);
                b.setText(tL_starGiftUnique.title);
                huaVar.addView(b, nme.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b2 = hve.b(context, 13.0f, 0, false, null);
                b2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b2.setText(k96.I(tL_starGiftUnique.num, "Gift2CollectionNumber"));
                huaVar.addView(b2, nme.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b3 = hve.b(context, 18.0f, 0, true, null);
                b3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b3.setText(V0(starsAmount3, TextUtils.concat(positive ? "+" : "", F0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b3.getText());
                if (starsTransaction.refund) {
                    C0(spannableStringBuilder, b3, k96.L0(2131744793));
                } else if (starsTransaction.failed) {
                    C0(spannableStringBuilder, b3, k96.L0(2131744873));
                } else if (starsTransaction.pending) {
                    C0(spannableStringBuilder, b3, k96.L0(2131744816));
                }
                b3.setText(spannableStringBuilder);
                huaVar.addView(b3, nme.t(-2, -2, 17, 0, 11, 0, 17));
                j6.addView(huaVar, nme.o(-1, -2));
                wjbVar2 = wjbVar;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = j6;
                str = "";
                z3 = z12;
                fx0VarArr = fx0VarArr5;
                z5 = z9;
                mfb mfbVar10 = new mfb(context2, wjbVar2);
                starGift = starsTransaction2.stargift;
                byte b4 = 5;
                if (starGift == null) {
                    TL_stars.StarsTransaction starsTransaction4 = starsTransaction2;
                    wjbVar3 = wjbVar2;
                    fx0[] fx0VarArr6 = fx0VarArr;
                    boolean z14 = z5;
                    viewGroup = linearLayout;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long n = cf3.n(starsTransactionPeer2.peer);
                        if (starsTransaction4.paid_message) {
                            mfbVar10.n(k96.L0(positive ? 2131750177 : 2131749920), i, n, new ota(fx0VarArr6, n, (byte) 0));
                            if (starsTransaction4.starref_amount != null && starsTransaction4.starref_commission_permille > 0) {
                                mfbVar10.d(a1(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, "⭐️ ".concat(k96.E(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsTransaction4.amount.toDouble())), ',')), 0.8f, null), k96.L0(2131744713));
                            }
                            mfbVar4 = mfbVar10;
                            fx0VarArr = fx0VarArr6;
                            i5 = i;
                        } else if (z2) {
                            long n2 = cf3.n(starsTransaction4.starref_peer);
                            mfbVar10.i(k96.L0(2131744993), k96.L0(2131744992), new ota(fx0VarArr6, j, (byte) 1));
                            mfbVar10.n(k96.L0(2131744996), i, n2, new ota(fx0VarArr6, n2, (byte) 2));
                            mfbVar10.n(k96.L0(2131744991), i, n, new ota(fx0VarArr6, n, (byte) 3));
                            mfbVar10.d(bc.I0(starsTransaction4.starref_commission_permille), k96.L0(2131744995));
                            i5 = i;
                            mfbVar4 = mfbVar10;
                            fx0VarArr = fx0VarArr6;
                        } else {
                            if (z3) {
                                fx0VarArr = fx0VarArr6;
                                mfbVar10.i(k96.L0(2131744993), k96.L0(2131744992), new sb2(i, context, j, n, fx0VarArr, wjbVar3));
                                mfbVar10.n(k96.L0(2131744994), i, n, new ota(fx0VarArr, n, (byte) 4));
                                context3 = context;
                                starsTransaction3 = starsTransaction;
                                mfbVar2 = mfbVar10;
                            } else {
                                fx0VarArr = fx0VarArr6;
                                if (z13) {
                                    mfbVar10.n(k96.L0(2131744971), i, n, new nta(fx0VarArr, starsTransaction, n, (byte) 1));
                                    final byte b5 = 2;
                                    mfbVar10.n(k96.L0(2131744970), i, y6c.h(i).e(), new Runnable() { // from class: mta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b6 = b5;
                                            int i11 = i;
                                            fx0[] fx0VarArr7 = fx0VarArr;
                                            switch (b6) {
                                                case 0:
                                                    fx0VarArr7[0].dismiss();
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", y6c.h(i11).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        S2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    fx0VarArr7[0].dismiss();
                                                    d S3 = LaunchActivity.S();
                                                    if (S3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", y6c.h(i11).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        S3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    fx0VarArr7[0].dismiss();
                                                    d S4 = LaunchActivity.S();
                                                    if (S4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", y6c.h(i11).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        S4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    starsTransaction3 = starsTransaction;
                                    mfbVar10.i(k96.L0(2131744969), k96.L0(2131744968), new nta(fx0VarArr, starsTransaction, n, (byte) 2));
                                    mfbVar10.d(I0(starsTransaction3.amount), k96.L0(2131744972));
                                    i5 = i;
                                    mfbVar3 = mfbVar10;
                                    context3 = context;
                                    mfbVar = mfbVar3;
                                    z6 = z14;
                                    mfbVar5 = mfbVar;
                                } else {
                                    starsTransaction3 = starsTransaction;
                                    if (!starsTransaction3.subscription || z) {
                                        if (starsTransaction3.premium_gift) {
                                            final byte b6 = 1;
                                            mfbVar10.n(k96.L0(2131749920), i, n, new Runnable() { // from class: qta
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b7 = b6;
                                                    Context context5 = context;
                                                    long j7 = n;
                                                    fx0[] fx0VarArr7 = fx0VarArr;
                                                    switch (b7) {
                                                        case 0:
                                                            fx0VarArr7[0].dismiss();
                                                            if (!l7c.C(j7)) {
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(mu1.W9(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                d01.t(context5, k96.M0(2131744687, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            fx0VarArr7[0].dismiss();
                                                            if (!l7c.C(j7)) {
                                                                d S3 = LaunchActivity.S();
                                                                if (S3 != null) {
                                                                    S3.presentFragment(mu1.W9(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                d01.t(context5, k96.M0(2131744687, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            fx0VarArr7[0].dismiss();
                                                            if (!l7c.C(j7)) {
                                                                d S4 = LaunchActivity.S();
                                                                if (S4 != null) {
                                                                    S4.presentFragment(mu1.W9(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                d01.t(context5, k96.M0(2131744687, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            mfbVar10.d(k96.I(starsTransaction3.premium_gift_months, "Months"), k96.L0(2131744697));
                                        } else if (!starsTransaction3.posts_search) {
                                            String L02 = k96.L0(2131744696);
                                            final byte b7 = 2;
                                            Runnable runnable = new Runnable() { // from class: qta
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b72 = b7;
                                                    Context context5 = context;
                                                    long j7 = n;
                                                    fx0[] fx0VarArr7 = fx0VarArr;
                                                    switch (b72) {
                                                        case 0:
                                                            fx0VarArr7[0].dismiss();
                                                            if (!l7c.C(j7)) {
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(mu1.W9(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                d01.t(context5, k96.M0(2131744687, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            fx0VarArr7[0].dismiss();
                                                            if (!l7c.C(j7)) {
                                                                d S3 = LaunchActivity.S();
                                                                if (S3 != null) {
                                                                    S3.presentFragment(mu1.W9(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                d01.t(context5, k96.M0(2131744687, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            fx0VarArr7[0].dismiss();
                                                            if (!l7c.C(j7)) {
                                                                d S4 = LaunchActivity.S();
                                                                if (S4 != null) {
                                                                    S4.presentFragment(mu1.W9(j7));
                                                                    break;
                                                                }
                                                            } else {
                                                                d01.t(context5, k96.M0(2131744687, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            fx0VarArr = fx0VarArr;
                                            context3 = context;
                                            mfbVar10.n(L02, i, n, runnable);
                                            mfbVar = mfbVar10;
                                            i5 = i;
                                            z6 = z14;
                                            mfbVar5 = mfbVar;
                                        }
                                        context3 = context;
                                        i5 = i;
                                        mfbVar = mfbVar10;
                                        fx0VarArr = fx0VarArr;
                                        z6 = z14;
                                        mfbVar5 = mfbVar;
                                    } else {
                                        final byte b8 = 0;
                                        mfbVar10.n(k96.L0(2131744925), i, n, new Runnable() { // from class: qta
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b72 = b8;
                                                Context context5 = context;
                                                long j7 = n;
                                                fx0[] fx0VarArr7 = fx0VarArr;
                                                switch (b72) {
                                                    case 0:
                                                        fx0VarArr7[0].dismiss();
                                                        if (!l7c.C(j7)) {
                                                            d S2 = LaunchActivity.S();
                                                            if (S2 != null) {
                                                                S2.presentFragment(mu1.W9(j7));
                                                                break;
                                                            }
                                                        } else {
                                                            d01.t(context5, k96.M0(2131744687, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        fx0VarArr7[0].dismiss();
                                                        if (!l7c.C(j7)) {
                                                            d S3 = LaunchActivity.S();
                                                            if (S3 != null) {
                                                                S3.presentFragment(mu1.W9(j7));
                                                                break;
                                                            }
                                                        } else {
                                                            d01.t(context5, k96.M0(2131744687, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        fx0VarArr7[0].dismiss();
                                                        if (!l7c.C(j7)) {
                                                            d S4 = LaunchActivity.S();
                                                            if (S4 != null) {
                                                                S4.presentFragment(mu1.W9(j7));
                                                                break;
                                                            }
                                                        } else {
                                                            d01.t(context5, k96.M0(2131744687, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        context3 = context;
                                        mfbVar2 = mfbVar10;
                                        fx0VarArr = fx0VarArr;
                                    }
                                }
                            }
                            i5 = i;
                            mfbVar = mfbVar2;
                            z6 = z14;
                            mfbVar5 = mfbVar;
                        }
                        starsTransaction3 = starsTransaction4;
                        mfbVar3 = mfbVar4;
                        context3 = context;
                        mfbVar = mfbVar3;
                        z6 = z14;
                        mfbVar5 = mfbVar;
                    } else {
                        mfb mfbVar11 = mfbVar10;
                        fx0VarArr = fx0VarArr6;
                        i5 = i;
                        starsTransaction3 = starsTransaction4;
                        context3 = context;
                        if (!(starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment)) {
                            z6 = z14;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                mfbVar11.d(k96.L0(2131754228), k96.L0(2131744694));
                                mfbVar5 = mfbVar11;
                            } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                mfbVar11.d(k96.L0(2131747026), k96.L0(2131744694));
                                mfbVar5 = mfbVar11;
                            } else {
                                mfbVar5 = mfbVar11;
                                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                    mfbVar11.d(k96.L0(2131744724), k96.L0(2131744694));
                                    mfbVar5 = mfbVar11;
                                }
                            }
                        } else if (starsTransaction3.gift) {
                            l46 l46Var = new l46(context3, wjbVar3);
                            l46Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
                            l46Var.setEllipsize(TextUtils.TruncateAt.END);
                            int i11 = bkb.Wc;
                            zkb.X(l46Var, i11, wjbVar3);
                            zkb.G(l46Var, i11, wjbVar3);
                            l46Var.setTextSize(1, 14.0f);
                            l46Var.setSingleLine(true);
                            l46Var.setDisablePaddingsOffsetY(true);
                            ec0 ec0Var = new ec0(24.0f, i5, l46Var);
                            String L03 = k96.L0(z14 ? 2131744691 : 2131744688);
                            fm2 a = eva.a(24, "fragment");
                            int L = gl.L(16.0f);
                            int L2 = gl.L(16.0f);
                            a.e = L;
                            a.f = L2;
                            ec0Var.b.g0(a);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) L03));
                            spannableStringBuilder2.setSpan(ec0Var, 0, 1, 33);
                            z6 = z14;
                            spannableStringBuilder2.setSpan(new jua(fx0VarArr, context3, z6), 3, spannableStringBuilder2.length(), 33);
                            l46Var.setText(spannableStringBuilder2);
                            mfbVar11.l(l46Var, k96.L0(2131744696));
                            mfbVar5 = mfbVar11;
                        } else {
                            z6 = z14;
                            mfbVar11.d(k96.L0(2131750504), k96.L0(2131744694));
                            mfbVar5 = mfbVar11;
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction3 = starsTransaction2;
                        viewGroup3 = linearLayout;
                    } else {
                        q41 q41Var = (q41) ((jfb) mfbVar10.d(k96.L0(2131744983), k96.L0(2131744990)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup3 = linearLayout;
                        Context context5 = context2;
                        starsTransaction3 = starsTransaction;
                        gta.t(i).J(tL_inputSavedStarGiftUser, new go2((Object) q41Var, i, (Object) context5, (Object) wjbVar2, (byte) 6));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long n3 = cf3.n(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        mfbVar10.n(k96.L0(2131744973), i, n3, new ota(fx0VarArr, n3, b4));
                        wjbVar3 = wjbVar;
                        mfbVar9 = mfbVar10;
                        i5 = i;
                        context3 = context;
                        z6 = z5;
                    } else {
                        i5 = i;
                        wjbVar3 = wjbVar;
                        mfbVar9 = mfbVar10;
                        z6 = z5;
                        context3 = context;
                    }
                    viewGroup = viewGroup3;
                    mfbVar5 = mfbVar9;
                } else {
                    final Context context6 = context2;
                    starsTransaction3 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str2 = starGift.slug;
                        if (TextUtils.isEmpty(str2)) {
                            i8 = 2131750177;
                        } else {
                            String L04 = k96.L0(2131750176);
                            StringBuilder sb = new StringBuilder();
                            i8 = 2131750177;
                            sb.append(starsTransaction3.stargift.title);
                            sb.append(" #");
                            sb.append(starsTransaction3.stargift.num);
                            mfbVar10.i(L04, sb.toString(), new t79((Object) context6, i, (Object) str2, (byte) 14));
                        }
                        final long e = y6c.h(i).e();
                        long n4 = cf3.n(((TL_stars.TL_starsTransactionPeer) starsTransaction3.peer).peer);
                        if (!starsTransaction3.offer) {
                            if (starsTransaction3.stargift_resale) {
                                if (negative) {
                                    mfbVar10.d(k96.L0(starsTransaction3.refund ? 2131744985 : 2131744987), k96.L0(2131744990));
                                } else {
                                    mfbVar10.d(k96.L0(starsTransaction3.refund ? 2131744987 : 2131744985), k96.L0(2131744990));
                                    j4 = e;
                                }
                            } else if (starsTransaction3.stargift_drop_original_details) {
                                mfbVar10.d(k96.L0(2131744986), k96.L0(2131744990));
                                j4 = e;
                                n4 = j4;
                            } else {
                                mfbVar10.d(k96.L0(2131744984), k96.L0(2131744990));
                            }
                            j4 = n4;
                            n4 = e;
                        } else if (negative) {
                            mfbVar10.d(k96.L0(starsTransaction3.refund ? 2131744985 : 2131744989), k96.L0(2131744990));
                            j4 = n4;
                            n4 = e;
                        } else {
                            mfbVar10.d(k96.L0(starsTransaction3.refund ? 2131744988 : 2131744985), k96.L0(2131744990));
                            j4 = e;
                        }
                        int i12 = (n4 > e ? 1 : (n4 == e ? 0 : -1));
                        if (i12 != 0) {
                            fx0VarArr2 = fx0VarArr;
                            final byte b9 = 0;
                            wjbVar3 = wjbVar;
                            mfbVar8 = mfbVar10;
                            i9 = i12;
                            z8 = z5;
                            viewGroup = linearLayout;
                            final long j7 = n4;
                            j5 = e;
                            mfbVar8.n(k96.L0(i8), i, j7, new Runnable() { // from class: tta
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b10 = b9;
                                    long j8 = e;
                                    long j9 = j7;
                                    fx0[] fx0VarArr7 = fx0VarArr2;
                                    switch (b10) {
                                        case 0:
                                            fx0VarArr7[0].dismiss();
                                            d S2 = LaunchActivity.S();
                                            if (S2 != null) {
                                                Bundle k = ls6.k(j9, "user_id");
                                                if (j9 == j8) {
                                                    k.putBoolean("my_profile", true);
                                                }
                                                k.putBoolean("open_gifts", true);
                                                S2.presentFragment(new ProfileActivity(k, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            fx0VarArr7[0].dismiss();
                                            d S3 = LaunchActivity.S();
                                            if (S3 != null) {
                                                Bundle k2 = ls6.k(j9, "user_id");
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
                            wjbVar3 = wjbVar;
                            mfbVar8 = mfbVar10;
                            fx0VarArr2 = fx0VarArr;
                            i9 = i12;
                            z8 = z5;
                            j5 = e;
                            viewGroup = linearLayout;
                        }
                        if (j4 != j5) {
                            final long j8 = j5;
                            final byte b10 = 1;
                            final long j9 = j4;
                            final fx0[] fx0VarArr7 = fx0VarArr2;
                            mfbVar8.n(k96.L0(2131749920), i, j9, new Runnable() { // from class: tta
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b102 = b10;
                                    long j82 = j8;
                                    long j92 = j9;
                                    fx0[] fx0VarArr72 = fx0VarArr7;
                                    switch (b102) {
                                        case 0:
                                            fx0VarArr72[0].dismiss();
                                            d S2 = LaunchActivity.S();
                                            if (S2 != null) {
                                                Bundle k = ls6.k(j92, "user_id");
                                                if (j92 == j82) {
                                                    k.putBoolean("my_profile", true);
                                                }
                                                k.putBoolean("open_gifts", true);
                                                S2.presentFragment(new ProfileActivity(k, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            fx0VarArr72[0].dismiss();
                                            d S3 = LaunchActivity.S();
                                            if (S3 != null) {
                                                Bundle k2 = ls6.k(j92, "user_id");
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
                        mfb mfbVar12 = mfbVar8;
                        if ((i9 == 0 || starsTransaction3.stargift_resale) && (starsAmount = starsTransaction3.starref_amount) != null && starsTransaction3.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction3.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction3.amount.amount + starsTransaction3.starref_amount.amount;
                                cm2[] cm2VarArr = new cm2[1];
                                mfbVar12.d(Z0(starsTransaction3.amount, "⭐️ " + ((Object) F0(tL_starsTonAmount)), cm2VarArr), k96.L0(2131744713));
                                cm2 cm2Var = cm2VarArr[0];
                                if (cm2Var != null) {
                                    cm2Var.y = bkb.v0(bkb.Ei, wjbVar3);
                                }
                            } else {
                                mfbVar12.d(a1(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, "⭐️ ".concat(k96.E(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsAmount4.toDouble())), ',')), 0.8f, null), k96.L0(2131744713));
                            }
                        }
                        i5 = i;
                        mfbVar6 = mfbVar12;
                        context3 = context6;
                    } else {
                        wjbVar3 = wjbVar;
                        fx0VarArr2 = fx0VarArr;
                        z8 = z5;
                        viewGroup = linearLayout;
                        if (starsTransaction3.refund) {
                            context3 = context;
                            i5 = i;
                            starsTransaction3 = starsTransaction;
                            mfbVar6 = mfbVar10;
                        } else {
                            long e2 = j == 0 ? y6c.h(i).e() : j;
                            final long n5 = cf3.n(starsTransaction3.peer.peer);
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(n5));
                            if (positive) {
                                if (n5 != e2) {
                                    String L05 = k96.L0(2131744971);
                                    Runnable ntaVar = new nta(fx0VarArr2, starsTransaction3, n5, (byte) 4);
                                    String L06 = (V1 == null || l7c.z(V1) || l7c.b(n5)) ? null : k96.L0(2131750268);
                                    final byte b11 = 0;
                                    i7 = i;
                                    Runnable runnable2 = new Runnable() { // from class: lta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b12 = b11;
                                            fx0[] fx0VarArr8 = fx0VarArr2;
                                            switch (b12) {
                                                case 0:
                                                    fx0 fx0Var3 = fx0VarArr8[0];
                                                    Objects.requireNonNull(fx0Var3);
                                                    new tv4(context6, i7, n5, null, new ae9(fx0Var3, (byte) 11)).show();
                                                    break;
                                                default:
                                                    fx0 fx0Var4 = fx0VarArr8[0];
                                                    Objects.requireNonNull(fx0Var4);
                                                    new tv4(context6, i7, n5, null, new ae9(fx0Var4, (byte) 11)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    mfbVar7 = mfbVar10;
                                    fx0VarArr4 = fx0VarArr2;
                                    mfbVar7.m(L05, i7, n5, ntaVar, L06, runnable2);
                                } else {
                                    i7 = i;
                                    mfbVar7 = mfbVar10;
                                    fx0VarArr4 = fx0VarArr2;
                                }
                                final byte b12 = 0;
                                mfbVar7.n(k96.L0(2131744970), i7, e2, new Runnable() { // from class: mta
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b62 = b12;
                                        int i112 = i7;
                                        fx0[] fx0VarArr72 = fx0VarArr4;
                                        switch (b62) {
                                            case 0:
                                                fx0VarArr72[0].dismiss();
                                                d S2 = LaunchActivity.S();
                                                if (S2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", y6c.h(i112).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    S2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                fx0VarArr72[0].dismiss();
                                                d S3 = LaunchActivity.S();
                                                if (S3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", y6c.h(i112).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    S3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                fx0VarArr72[0].dismiss();
                                                d S4 = LaunchActivity.S();
                                                if (S4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", y6c.h(i112).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    S4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                fx0VarArr3 = fx0VarArr4;
                            } else {
                                long j10 = e2;
                                if (n5 != j10) {
                                    final byte b13 = 1;
                                    mfbVar10.n(k96.L0(2131744971), i, j10, new Runnable() { // from class: mta
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b62 = b13;
                                            int i112 = i;
                                            fx0[] fx0VarArr72 = fx0VarArr2;
                                            switch (b62) {
                                                case 0:
                                                    fx0VarArr72[0].dismiss();
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", y6c.h(i112).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        S2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    fx0VarArr72[0].dismiss();
                                                    d S3 = LaunchActivity.S();
                                                    if (S3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", y6c.h(i112).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        S3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    fx0VarArr72[0].dismiss();
                                                    d S4 = LaunchActivity.S();
                                                    if (S4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", y6c.h(i112).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        S4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                String L07 = k96.L0(2131744970);
                                Runnable ntaVar2 = new nta(fx0VarArr2, starsTransaction, n5, (byte) 0);
                                String L08 = (V1 == null || l7c.z(V1) || l7c.b(n5)) ? null : k96.L0(2131750268);
                                final byte b14 = 1;
                                Runnable runnable3 = new Runnable() { // from class: lta
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b122 = b14;
                                        fx0[] fx0VarArr8 = fx0VarArr2;
                                        switch (b122) {
                                            case 0:
                                                fx0 fx0Var3 = fx0VarArr8[0];
                                                Objects.requireNonNull(fx0Var3);
                                                new tv4(context, i, n5, null, new ae9(fx0Var3, (byte) 11)).show();
                                                break;
                                            default:
                                                fx0 fx0Var4 = fx0VarArr8[0];
                                                Objects.requireNonNull(fx0Var4);
                                                new tv4(context, i, n5, null, new ae9(fx0Var4, (byte) 11)).show();
                                                break;
                                        }
                                    }
                                };
                                mfbVar7 = mfbVar10;
                                fx0VarArr3 = fx0VarArr2;
                                mfbVar7.m(L07, i, n5, ntaVar2, L08, runnable3);
                            }
                            context3 = context;
                            mfbVar5 = mfbVar7;
                            fx0VarArr = fx0VarArr3;
                            z6 = z8;
                            i5 = i;
                            starsTransaction3 = starsTransaction;
                        }
                    }
                    z6 = z8;
                    fx0VarArr = fx0VarArr2;
                    mfbVar5 = mfbVar6;
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long n6 = cf3.n(starsTransactionPeer.peer);
                    if (z) {
                        n6 = j;
                    }
                    K0 = na7.q1(i5).K0(Long.valueOf(-n6));
                    if (K0 != null) {
                        l46 l46Var2 = new l46(context3, wjbVar3);
                        z7 = z6;
                        l46Var2.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
                        l46Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i13 = bkb.Wc;
                        zkb.X(l46Var2, i13, wjbVar3);
                        zkb.G(l46Var2, i13, wjbVar3);
                        l46Var2.setTextSize(1, 14.0f);
                        l46Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
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
                                ol5 ol5Var = new ol5(24.0f, i5, l46Var2);
                                if (!(messageMedia2 instanceof TLRPC.TL_messageMediaPhoto)) {
                                    viewGroup2 = viewGroup;
                                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                                        gl5Var2 = null;
                                        if (gl5Var2 == null) {
                                            ol5Var.a(6.0f);
                                            ol5Var.b.d0(gl5Var2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(ol5Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i6 = i14 + 1;
                                        } else {
                                            i6 = i14;
                                        }
                                        if (i6 < 3) {
                                            break;
                                        }
                                        size = i17;
                                        i15 = i16;
                                        i14 = i6;
                                        viewGroup = viewGroup2;
                                        arrayList = arrayList2;
                                    } else {
                                        c2 = gl5.c(ba4.v(gl.L(24.0f), messageMedia2.document.thumbs, true), messageMedia2.document);
                                    }
                                } else {
                                    viewGroup2 = viewGroup;
                                    c2 = gl5.i(ba4.v(gl.L(24.0f), messageMedia2.photo.sizes, true), messageMedia2.photo);
                                }
                                gl5Var2 = c2;
                                if (gl5Var2 == null) {
                                }
                                if (i6 < 3) {
                                }
                            }
                        }
                        viewGroup2 = viewGroup;
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String K = hc2.K(K0, false);
                        if (TextUtils.isEmpty(K)) {
                            spannableStringBuilder3.append((CharSequence) K0.title);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            ls6.u(sb2, na7.q1(i5).N2, "/", K, "/");
                            sb2.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        nta ntaVar3 = new nta(fx0VarArr, n6, starsTransaction3);
                        spannableStringBuilder3.setSpan(new kua(ntaVar3), length, spannableStringBuilder3.length(), 33);
                        l46Var2.setSingleLine(true);
                        l46Var2.setEllipsize(TextUtils.TruncateAt.END);
                        l46Var2.setText(spannableStringBuilder3);
                        l46Var2.setOnClickListener(new bna(ntaVar3, (byte) 5));
                        mfbVar5.l(l46Var2, k96.L0(starsTransaction3.reaction ? 2131744705 : 2131744706));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z13) {
                            String L09 = k96.L0(2131744711);
                            String str3 = starsTransaction3.id;
                            mfbVar5.k(L09, str3, str3.length() <= 25 ? 9 : 10, new t7a((Object) fx0VarArr, (Object) wjbVar3, (byte) 28));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            mfbVar5.d(k96.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), k96.L0(2131744717));
                        }
                        mfbVar5.d(k96.Z(2131742520, k96.D0().r0().format(new Date(starsTransaction3.date * 1000)), k96.D0().o0().format(new Date(starsTransaction3.date * 1000))), k96.L0(2131744723));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                B0(mfbVar5, i5, starGift2, wjbVar3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                mfbVar5.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup4 = viewGroup2;
                        viewGroup4.addView(mfbVar5, nme.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            mfbVar5.d(k96.Z(2131742520, k96.D0().r0().format(new Date(starsTransaction3.transaction_date * 1000)), k96.D0().o0().format(new Date(starsTransaction3.transaction_date * 1000))), k96.L0(2131744692));
                        }
                        if (z7) {
                            context4 = context;
                            l46 l46Var3 = new l46(context4, wjbVar3);
                            zkb.X(l46Var3, bkb.y6, wjbVar3);
                            zkb.G(l46Var3, bkb.Wc, wjbVar3);
                            l46Var3.setTextSize(1, 14.0f);
                            l46Var3.setText(gl.P2(k96.L0(2131744689), new vf1(context4, (byte) 16)));
                            l46Var3.setGravity(17);
                            viewGroup4.addView(l46Var3, nme.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        } else {
                            context4 = context;
                        }
                        u41 u41Var = new u41(context4, wjbVar3);
                        u41Var.f();
                        if ((starsTransaction3.flags & 32) == 0) {
                            r3 = 0;
                            u41Var.h(k96.L0(2131744685), false);
                        } else {
                            r3 = 0;
                            u41Var.h(k96.L0(2131747638), false);
                        }
                        viewGroup4.addView(u41Var, nme.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        fx0 fx0Var3 = fx0Var;
                        fx0Var3.O = viewGroup4;
                        fx0VarArr[r3] = fx0Var3;
                        fx0Var3.T0 = r3;
                        if ((starsTransaction3.flags & 32) == 0) {
                            u41Var.setOnClickListener(new b99(context4, starsTransaction3, (byte) 17));
                        } else {
                            u41Var.setOnClickListener(new f5(fx0VarArr, (byte) 4));
                        }
                        fx0VarArr[0].K();
                        S = LaunchActivity.S();
                        if (!gl.O1() && !gl.s1(S)) {
                            fx0VarArr[0].X(S);
                        }
                        fx0VarArr[0].show();
                        return fx0VarArr[0];
                    }
                }
                z7 = z6;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String L092 = k96.L0(2131744711);
                    String str32 = starsTransaction3.id;
                    mfbVar5.k(L092, str32, str32.length() <= 25 ? 9 : 10, new t7a((Object) fx0VarArr, (Object) wjbVar3, (byte) 28));
                }
                if (starsTransaction3.floodskip) {
                    mfbVar5.d(k96.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), k96.L0(2131744717));
                }
                mfbVar5.d(k96.Z(2131742520, k96.D0().r0().format(new Date(starsTransaction3.date * 1000)), k96.D0().o0().format(new Date(starsTransaction3.date * 1000))), k96.L0(2131744723));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup42 = viewGroup2;
                viewGroup42.addView(mfbVar5, nme.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z7) {
                }
                u41 u41Var2 = new u41(context4, wjbVar3);
                u41Var2.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup42.addView(u41Var2, nme.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                fx0 fx0Var32 = fx0Var;
                fx0Var32.O = viewGroup42;
                fx0VarArr[r3] = fx0Var32;
                fx0Var32.T0 = r3;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                fx0VarArr[0].K();
                S = LaunchActivity.S();
                if (!gl.O1()) {
                    fx0VarArr[0].X(S);
                }
                fx0VarArr[0].show();
                return fx0VarArr[0];
            }
        }
        fx0Var = fx0Var2;
        z2 = z11;
        final be0 be0Var2 = new be0(context);
        if (starsTransaction.premium_gift) {
            f1(be0Var2, be0Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            j6.addView(be0Var2, nme.t(kk7.p2, kk7.p2, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            fm2 a2 = o5a.a(100, "search");
            int L3 = gl.L(40.0f);
            int L4 = gl.L(40.0f);
            a2.e = L3;
            a2.f = L4;
            be0Var2.setImageDrawable(a2);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z13 || starsTransaction.gift) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    linearLayout = j6;
                    str = "";
                    z3 = z12;
                    z4 = z;
                    j2 = j;
                    wjbVar2 = wjbVar;
                    z5 = z9;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        g1(be0Var2, be0Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        c1(be0Var2, be0Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(be0Var2, nme.t(kk7.p2, kk7.p2, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    linearLayout = j6;
                    z4 = z;
                    j2 = j;
                    wjbVar2 = wjbVar;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            be0Var2.setRoundRadius(gl.L(50.0f));
                            z3 = z12;
                            be0Var2.p(gl5.p(usc.c(starsTransaction2.photo)), "100_100", null, null);
                            z5 = z9;
                            str = "";
                        } else {
                            z3 = z12;
                            be0Var2.setRoundRadius(gl.L(50.0f));
                            if (z3) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z4) {
                                z5 = z9;
                                str = "";
                                j3 = j2;
                                pb0 pb0Var = new pb0();
                                if (j3 < 0) {
                                    TLRPC.User V12 = na7.q1(i2).V1(Long.valueOf(j3));
                                    pb0Var.n(V12);
                                    be0Var2.f(V12, pb0Var);
                                } else {
                                    TLRPC.Chat K02 = na7.q1(i2).K0(Long.valueOf(-j3));
                                    pb0Var.l(K02);
                                    be0Var2.f(K02, pb0Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            z5 = z9;
                            str = "";
                            j3 = cf3.n(peer);
                            pb0 pb0Var2 = new pb0();
                            if (j3 < 0) {
                            }
                        }
                        linearLayout.addView(be0Var2, nme.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z3 = z12;
                        z5 = z9;
                        fm2 a3 = o5a.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int L5 = gl.L(40.0f);
                        int L6 = gl.L(40.0f);
                        a3.e = L5;
                        a3.f = L6;
                        be0Var2.setImageDrawable(a3);
                    }
                } else {
                    be0Var2.setRoundRadius(gl.L(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        c = gl5.i(ba4.v(gl.L(100.0f), messageMedia3.photo.sizes, true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        c = gl5.c(ba4.v(gl.L(100.0f), messageMedia3.document.thumbs, true), messageMedia3.document);
                    } else {
                        gl5Var = null;
                        be0Var2.j(gl5Var, "100_100", null, null, null, 0);
                        j6.addView(be0Var2, nme.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: pta
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z15 = z;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long n7 = z15 ? j : cf3.n(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i18 = 0; i18 < starsTransaction5.extended_media.size(); i18++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i18);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction5.msg_id;
                                    tL_message.dialog_id = n7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j11 = -n7;
                                    tL_peerChannel.channel_id = j11;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j11;
                                    tL_message.date = starsTransaction5.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new k27(i, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.r0().T1(null, LaunchActivity.Q(), wjbVar);
                                PhotoViewer.r0().j1(arrayList3, 0, n7, 0L, 0L, new iua(be0Var2, j6, n7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z4 = z;
                        wjbVar2 = wjbVar;
                        i2 = i;
                        linearLayout = j6;
                        j2 = j;
                        be0Var2.setOnClickListener(onClickListener);
                        str = "";
                        z3 = z12;
                        z5 = z9;
                    }
                    gl5Var = c;
                    be0Var2.j(gl5Var, "100_100", null, null, null, 0);
                    j6.addView(be0Var2, nme.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: pta
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z15 = z;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long n7 = z15 ? j : cf3.n(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < starsTransaction5.extended_media.size(); i18++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i18);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction5.msg_id;
                                tL_message.dialog_id = n7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j11 = -n7;
                                tL_peerChannel.channel_id = j11;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j11;
                                tL_message.date = starsTransaction5.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new k27(i, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.r0().T1(null, LaunchActivity.Q(), wjbVar);
                            PhotoViewer.r0().j1(arrayList3, 0, n7, 0L, 0L, new iua(be0Var2, j6, n7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z4 = z;
                    wjbVar2 = wjbVar;
                    i2 = i;
                    linearLayout = j6;
                    j2 = j;
                    be0Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z3 = z12;
                    z5 = z9;
                }
                TextView textView = new TextView(context2);
                i3 = bkb.i5;
                tb4.w(textView, i3, wjbVar2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(K0(i2, z4, starsTransaction2));
                TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 17, 36, 0, 36, 4), context2);
                m.setTextSize(1, 18.0f);
                m.setTypeface(gl.o());
                m.setGravity(17);
                zkb.X(m, !positive ? bkb.kk : bkb.mk, wjbVar2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                m.setText(a1(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, F0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m.getText());
                if (!starsTransaction2.refund) {
                    C0(spannableStringBuilder4, m, k96.L0(2131744793));
                } else if (starsTransaction2.failed) {
                    zkb.X(m, bkb.mk, wjbVar2);
                    C0(spannableStringBuilder4, m, k96.L0(2131744873));
                } else if (starsTransaction2.pending) {
                    zkb.X(m, bkb.ok, wjbVar2);
                    C0(spannableStringBuilder4, m, k96.L0(2131744816));
                }
                m.setText(spannableStringBuilder4);
                linearLayout.addView(m, nme.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    l46 l46Var4 = new l46(context2);
                    zkb.X(l46Var4, i3, wjbVar2);
                    l46Var4.setTextSize(1, 14.0f);
                    l46Var4.setGravity(17);
                    zkb.G(l46Var4, bkb.Wc, wjbVar2);
                    l46Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) gl.S2(k96.Z(2131744703, bc.I0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j2 == y6c.h(i2).e() || hc2.w(2, na7.q1(i2).K0(Long.valueOf(-j2)))) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append((CharSequence) gl.D2(gl.P2(k96.L0(2131744702).replace(' ', (char) 160), new am0(j2, i2, (byte) 3)), true));
                    }
                    l46Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(l46Var4, nme.t(-1, -2, 17, 36, 0, 36, 4));
                    fx0VarArr = fx0VarArr5;
                } else if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z13 || starsTransaction2.gift)) {
                    TLRPC.User V13 = starsTransaction2.sent_by == null ? null : na7.q1(i2).V1(Long.valueOf(cf3.n(starsTransaction2.sent_by)));
                    TLRPC.User V14 = starsTransaction2.sent_by == null ? null : na7.q1(i2).V1(Long.valueOf(cf3.n(starsTransaction2.received_by)));
                    boolean D = l7c.D(V13);
                    if (D) {
                        zkb.X(m, bkb.F6, wjbVar2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i4 = 1;
                        m.setText(a1(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(F0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i4 = 1;
                    }
                    l46 l46Var5 = new l46(context2);
                    zkb.X(l46Var5, i3, wjbVar2);
                    l46Var5.setTextSize(i4, 16.0f);
                    l46Var5.setGravity(17);
                    zkb.G(l46Var5, bkb.Wc, wjbVar2);
                    l46Var5.setDisablePaddingsOffsetY(i4);
                    if (D) {
                        Object[] objArr = new Object[i4];
                        objArr[0] = l7c.l(V14);
                        L0 = k96.Z(2131754628, objArr);
                    } else {
                        L0 = k96.L0(2131754627);
                    }
                    fx0VarArr = fx0VarArr5;
                    l46Var5.setText(TextUtils.concat(gl.S2(L0), " ", gl.D2(gl.P2(k96.L0(2131749433).replace(' ', (char) 160), new sta(context2, fx0VarArr)), true)));
                    linearLayout.addView(l46Var5, nme.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    fx0VarArr = fx0VarArr5;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        zkb.X(textView2, i3, wjbVar2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, nme.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                mfb mfbVar102 = new mfb(context2, wjbVar2);
                starGift = starsTransaction2.stargift;
                byte b42 = 5;
                if (starGift == null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    long n62 = cf3.n(starsTransactionPeer.peer);
                    if (z) {
                    }
                    K0 = na7.q1(i5).K0(Long.valueOf(-n62));
                    if (K0 != null) {
                    }
                }
                z7 = z6;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                mfbVar5.d(k96.Z(2131742520, k96.D0().r0().format(new Date(starsTransaction3.date * 1000)), k96.D0().o0().format(new Date(starsTransaction3.date * 1000))), k96.L0(2131744723));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup422 = viewGroup2;
                viewGroup422.addView(mfbVar5, nme.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z7) {
                }
                u41 u41Var22 = new u41(context4, wjbVar3);
                u41Var22.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup422.addView(u41Var22, nme.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                fx0 fx0Var322 = fx0Var;
                fx0Var322.O = viewGroup422;
                fx0VarArr[r3] = fx0Var322;
                fx0Var322.T0 = r3;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                fx0VarArr[0].K();
                S = LaunchActivity.S();
                if (!gl.O1()) {
                }
                fx0VarArr[0].show();
                return fx0VarArr[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                be0Var2.setImageDrawable(new jqa(be0Var2, starsTransaction.stargift, 94, 0.44f));
                j6.addView(be0Var2, nme.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                e1(be0Var2.getImageReceiver(), starsTransaction.stargift, kk7.p2);
                j6.addView(be0Var2, nme.t(kk7.p2, kk7.p2, 17, 0, -8, 0, 10));
            }
        }
        wjbVar2 = wjbVar;
        context2 = context;
        i2 = i;
        starsTransaction2 = starsTransaction;
        linearLayout = j6;
        str = "";
        z3 = z12;
        z4 = z;
        j2 = j;
        z5 = z9;
        TextView textView3 = new TextView(context2);
        i3 = bkb.i5;
        tb4.w(textView3, i3, wjbVar2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(K0(i2, z4, starsTransaction2));
        TextView m2 = ug8.m(linearLayout, textView3, nme.t(-1, -2, 17, 36, 0, 36, 4), context2);
        m2.setTextSize(1, 18.0f);
        m2.setTypeface(gl.o());
        m2.setGravity(17);
        zkb.X(m2, !positive ? bkb.kk : bkb.mk, wjbVar2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        m2.setText(a1(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, F0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(m2.getText());
        if (!starsTransaction2.refund) {
        }
        m2.setText(spannableStringBuilder42);
        linearLayout.addView(m2, nme.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        fx0VarArr = fx0VarArr5;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            zkb.X(textView22, i3, wjbVar2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, nme.t(-1, -2, 17, 36, 0, 36, 4));
        }
        mfb mfbVar1022 = new mfb(context2, wjbVar2);
        starGift = starsTransaction2.stargift;
        byte b422 = 5;
        if (starGift == null) {
        }
        starsTransactionPeer = starsTransaction3.peer;
        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
        }
        z7 = z6;
        viewGroup2 = viewGroup;
        if (!TextUtils.isEmpty(starsTransaction3.id)) {
        }
        if (starsTransaction3.floodskip) {
        }
        mfbVar5.d(k96.Z(2131742520, k96.D0().r0().format(new Date(starsTransaction3.date * 1000)), k96.D0().o0().format(new Date(starsTransaction3.date * 1000))), k96.L0(2131744723));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup4222 = viewGroup2;
        viewGroup4222.addView(mfbVar5, nme.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z7) {
        }
        u41 u41Var222 = new u41(context4, wjbVar3);
        u41Var222.f();
        if ((starsTransaction3.flags & 32) == 0) {
        }
        viewGroup4222.addView(u41Var222, nme.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        fx0 fx0Var3222 = fx0Var;
        fx0Var3222.O = viewGroup4222;
        fx0VarArr[r3] = fx0Var3222;
        fx0Var3222.T0 = r3;
        if ((starsTransaction3.flags & 32) == 0) {
        }
        fx0VarArr[0].K();
        S = LaunchActivity.S();
        if (!gl.O1()) {
        }
        fx0VarArr[0].show();
        return fx0VarArr[0];
    }

    public static void l1(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, wjb wjbVar) {
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
        k1(activity, false, 0L, i, starsTransaction, wjbVar);
    }

    public static void m1(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, wjb wjbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = na7.q1(i).w1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i, starsTransaction, wjbVar);
    }

    public static CharSequence s1(CharSequence charSequence, boolean z) {
        r9c c;
        if (z && (charSequence instanceof Spanned)) {
            for (cm2 cm2Var : (cm2[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), cm2.class)) {
                Drawable drawable = cm2Var.c;
                if (drawable != null && !(drawable instanceof r9c) && (c = r9c.c(a.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c.setBounds(cm2Var.c.getBounds());
                    cm2Var.c = c;
                    cm2Var.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void D0() {
        q1();
        o39 o39Var = this.c;
        if (o39Var == null || this.V == null || o39Var.getLayoutParams() == null) {
            return;
        }
        int x = b00.x(48.0f, this.c0, -gl.L(8.0f));
        int x2 = b00.x(48.0f, this.d0, -gl.L(8.0f));
        gl.v3(this.c, 0, x, 0, x2);
        o39 o39Var2 = this.c;
        int i = -x;
        o39Var2.setPadding(o39Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - x2);
        this.V.A(i, -x2);
    }

    public final void E0(ArrayList arrayList, l5c l5cVar) {
        o39 o39Var;
        n1("FILL_BEFORE");
        dha dhaVar = this.V;
        boolean z = dhaVar != null && dhaVar.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        gta v = gta.v(this.currentAccount, false);
        sb sbVar = (sb) super.n0(getParentActivity());
        c4c c4cVar = new c4c(-2);
        c4cVar.c = sbVar;
        arrayList.add(c4cVar);
        arrayList.add(c4c.k(this.j0));
        u41 u41Var = this.s0;
        if (u41Var != null) {
            u41Var.setVisibility(getMessagesController().k4.w2.f ? 0 : 8);
        }
        arrayList.add(c4c.C(null));
        if (getMessagesController().k4.C2.f) {
            arrayList.add(xb.i(-4, getThemedColor(bkb.kk), p82.a0(k96.M0(2131743527, null)), k96.M0(2131743528, null)));
            arrayList.add(c4c.C(null));
        }
        if (v.e && !v.v.isEmpty()) {
            oo1.o(2131744966, null, arrayList);
            for (int i = 0; i < v.v.size(); i++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) v.v.get(i);
                int i2 = bva.b;
                c4c K = c4c.K(bva.class);
                K.H = starsSubscription;
                arrayList.add(K);
            }
            if (v.x) {
                arrayList.add(c4c.q(arrayList.size(), 33));
            } else if (!v.y) {
                c4c c = c4c.c(-3, R.drawable.arrow_more, k96.M0(2131744965, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c4c.C(null));
        }
        boolean K2 = v.K(0);
        this.t0 = K2;
        if (K2) {
            this.b0 = arrayList.size();
            arrayList.add(c4c.n(this.W, -2));
            if (z && (o39Var = this.c) != null) {
                o39Var.removeCallbacks(this.g0);
                this.c.post(this.g0);
            }
        } else {
            arrayList.add(c4c.m(this.h0));
        }
        n1("FILL_AFTER");
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
    public final void L0(int i) {
        c4c G;
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
        final lua luaVar;
        final fx0[] fx0VarArr;
        final int i5;
        ?? r5;
        d S;
        vb vbVar = this.v0;
        if (vbVar == null || (G = vbVar.G(i)) == null) {
            return;
        }
        int i6 = G.d;
        if (i6 == -1) {
            this.v0.O(true);
            return;
        }
        if (i6 == -2) {
            gta.v(this.currentAccount, false).r();
            xu4.f1(true, oj0.a(this.currentAccount).b());
            return;
        }
        if (i6 == -3) {
            gta.v(this.currentAccount, false).U();
            this.v0.O(true);
            return;
        }
        if (i6 == -4) {
            if (na7.q1(this.currentAccount).t2()) {
                h5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new eg1(getUserConfig().e()));
                return;
            }
        }
        if (G.H(wua.class)) {
            if (G.H instanceof TL_stars.TL_starsTopupOption) {
                gta.v(this.currentAccount, false).d(getParentActivity(), (TL_stars.TL_starsTopupOption) G.H, new w77(this, G, (byte) 12), null);
                return;
            }
            return;
        }
        if (G.H(bva.class) && (G.H instanceof TL_stars.StarsSubscription)) {
            Activity parentActivity = getParentActivity();
            int i7 = this.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.H;
            wjb resourceProvider = getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            fx0 i8 = ug8.i(parentActivity, false, 1, resourceProvider);
            fx0[] fx0VarArr2 = new fx0[1];
            LinearLayout m = ir2.m(parentActivity, 1);
            m.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(4.0f));
            m.setClipChildren(false);
            m.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            m.addView(frameLayout, nme.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            lua luaVar2 = new lua(zArr3, fx0VarArr2);
            kk7.f(i7).a(luaVar2, kk7.B3);
            long n = cf3.n(starsSubscription.peer);
            be0 be0Var = new be0(parentActivity);
            int i9 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            String str4 = "";
            if (i9 >= 0) {
                TLRPC.User V1 = na7.q1(i7).V1(Long.valueOf(n));
                String r = l7c.r(V1);
                boolean v = l7c.v(V1);
                z = !v;
                str = r;
                zArr = zArr3;
                z2 = v;
                i2 = i9;
                chat = V1;
            } else {
                i2 = i9;
                zArr = zArr3;
                TLRPC.Chat K0 = na7.q1(i7).K0(Long.valueOf(-n));
                str = K0 == null ? "" : K0.title;
                z = false;
                z2 = false;
                chat = K0;
            }
            TLRPC.Chat chat3 = chat;
            if (starsSubscription.photo != null) {
                be0Var.setRoundRadius(gl.L(21.0f));
                zArr2 = zArr;
                be0Var.p(gl5.p(usc.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                be0Var.setRoundRadius(gl.L(50.0f));
                pb0 pb0Var = new pb0((wjb) null);
                if (i2 < 0) {
                    chat2 = chat3;
                    str2 = str;
                    TLRPC.Chat K02 = na7.q1(i7).K0(Long.valueOf(-n));
                    pb0Var.p(K02);
                    be0Var.f(K02, pb0Var);
                    frameLayout.addView(be0Var, nme.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    zkb.x(frameLayout, drawable, bkb.g5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, nme.e(28, 28, 17));
                        imageView.setTranslationX(gl.L(34.0f));
                        imageView.setTranslationY(gl.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, nme.e(28, 28, 17));
                        imageView2.setTranslationX(gl.L(34.0f));
                        imageView2.setTranslationY(gl.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    tb4.w(textView, bkb.i5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(k96.M0(2131744734, null));
                    }
                    m.addView(textView, nme.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    zkb.X(textView2, bkb.A6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i3 = tL_starsSubscriptionPricing.period;
                    if (i3 != 2592000) {
                        textView2.setText(a1(false, k96.a0(null, null, 2131744746, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        textView2.setText(a1(false, k96.a0(null, null, 2131744746, Long.valueOf(tL_starsSubscriptionPricing.amount), i3 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    m.addView(textView2, nme.t(-1, -2, 17, 20, 0, 20, 4));
                    mfb mfbVar = new mfb(parentActivity, resourceProvider);
                    l46 l46Var = new l46(parentActivity, resourceProvider);
                    l46Var.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
                    l46Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i10 = bkb.Wc;
                    zkb.X(l46Var, i10, resourceProvider);
                    zkb.G(l46Var, i10, resourceProvider);
                    l46Var.setTextSize(1, 14.0f);
                    l46Var.setSingleLine(true);
                    l46Var.setDisablePaddingsOffsetY(true);
                    ec0 ec0Var = new ec0(24.0f, i7, l46Var);
                    if (i2 < 0) {
                        TLRPC.User V12 = na7.q1(i7).V1(Long.valueOf(n));
                        z3 = V12 == null || l7c.z(V12);
                        str4 = l7c.r(V12);
                        ec0Var.e(V12);
                        activity = parentActivity;
                    } else {
                        activity = parentActivity;
                        TLRPC.Chat K03 = na7.q1(i7).K0(Long.valueOf(-n));
                        if (K03 == null) {
                            z3 = true;
                        } else {
                            str4 = K03.title;
                            z3 = false;
                        }
                        ec0Var.b(K03);
                    }
                    String str5 = str4;
                    final TLRPC.Chat chat4 = chat2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(ec0Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new mua(fx0VarArr2, n), 3, spannableStringBuilder.length(), 33);
                    l46Var.setText(spannableStringBuilder);
                    if (!z3) {
                        mfbVar.l(l46Var, k96.M0(i2 < 0 ? 2131744758 : z ? 2131744768 : 2131744773, null));
                    }
                    if (i2 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        mfbVar.f(k96.M0(z ? 2131744766 : 2131744771, null), starsSubscription.title, null, null);
                    }
                    mfbVar.f(k96.M0(2131744739, str3), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), k96.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                        j = n;
                        i4 = 2131744732;
                    } else {
                        j = n;
                        i4 = currentTime > ((long) starsSubscription.until_date) ? 2131744733 : 2131744731;
                    }
                    mfbVar.f(k96.M0(i4, null), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(starsSubscription.until_date * 1000)), k96.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    m.addView(mfbVar, nme.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    Activity activity2 = activity;
                    l46 l46Var2 = new l46(activity2, resourceProvider);
                    int i11 = bkb.y6;
                    zkb.X(l46Var2, i11, resourceProvider);
                    zkb.G(l46Var2, i10, resourceProvider);
                    l46Var2.setTextSize(1, 14.0f);
                    l46Var2.setText(gl.N2(k96.M0(2131744689, null), -1, 0, new m9(activity2, (byte) 5), null));
                    l46Var2.setGravity(17);
                    m.addView(l46Var2, nme.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        luaVar = luaVar2;
                        fx0VarArr = fx0VarArr2;
                        i5 = i7;
                        l46 l46Var3 = new l46(activity2, resourceProvider);
                        zkb.X(l46Var3, i11, resourceProvider);
                        zkb.G(l46Var3, i10, resourceProvider);
                        l46Var3.setTextSize(1, 14.0f);
                        l46Var3.setText(k96.a0(null, null, 2131744748, k96.u(starsSubscription.until_date, false)));
                        l46Var3.setSingleLine(false);
                        l46Var3.setMaxLines(4);
                        l46Var3.setGravity(17);
                        m.addView(l46Var3, nme.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            u41 u41Var = new u41(resourceProvider, activity2, true);
                            u41Var.setRoundRadius(24);
                            r5 = 0;
                            u41Var.i(k96.M0(2131744774, null), false, true);
                            m.addView(u41Var, nme.o(-1, 48));
                            u41Var.setOnClickListener(new t53(u41Var, starsSubscription, i5, fx0VarArr, resourceProvider, zArr2, activity2));
                            i8.O = m;
                            fx0VarArr[r5] = i8;
                            i8.T0 = r5;
                            i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aua
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    kk7.f(i5).n(luaVar, kk7.B3);
                                }
                            });
                            fx0VarArr[r5].K();
                            S = LaunchActivity.S();
                            if (!gl.O1() && !gl.s1(S)) {
                                fx0VarArr[r5].X(S);
                            }
                            fx0VarArr[r5].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        l46 l46Var4 = new l46(activity2, resourceProvider);
                        zkb.X(l46Var4, i11, resourceProvider);
                        zkb.G(l46Var4, i10, resourceProvider);
                        l46Var4.setTextSize(1, 14.0f);
                        l46Var4.setText(k96.a0(null, null, z2 ? 2131744769 : 2131744744, k96.u(starsSubscription.until_date, false)));
                        l46Var4.setSingleLine(false);
                        l46Var4.setMaxLines(4);
                        l46Var4.setGravity(17);
                        m.addView(l46Var4, nme.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        u41 u41Var2 = new u41(resourceProvider, activity2, true);
                        u41Var2.i(k96.M0(z2 ? 2131744770 : 2131744745, null), false, true);
                        m.addView(u41Var2, nme.o(-1, 48));
                        luaVar = luaVar2;
                        fx0VarArr = fx0VarArr2;
                        yta ytaVar = new yta(u41Var2, i7, starsSubscription, fx0VarArr, j, activity2, resourceProvider, z, str2);
                        i5 = i7;
                        u41Var2.setOnClickListener(ytaVar);
                    } else {
                        luaVar = luaVar2;
                        fx0VarArr = fx0VarArr2;
                        i5 = i7;
                        if (starsSubscription.bot_canceled) {
                            l46 l46Var5 = new l46(activity2, resourceProvider);
                            zkb.X(l46Var5, bkb.mk, resourceProvider);
                            zkb.G(l46Var5, i10, resourceProvider);
                            l46Var5.setTextSize(1, 14.0f);
                            l46Var5.setText(k96.M0(z ? 2131744767 : 2131744772, null));
                            l46Var5.setSingleLine(false);
                            l46Var5.setMaxLines(4);
                            l46Var5.setGravity(17);
                            m.addView(l46Var5, nme.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            l46 l46Var6 = new l46(activity2, resourceProvider);
                            zkb.X(l46Var6, bkb.mk, resourceProvider);
                            zkb.G(l46Var6, i10, resourceProvider);
                            l46Var6.setTextSize(1, 14.0f);
                            l46Var6.setText(k96.M0(2131744761, null));
                            l46Var6.setSingleLine(false);
                            l46Var6.setMaxLines(4);
                            l46Var6.setGravity(17);
                            m.addView(l46Var6, nme.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                u41 u41Var3 = new u41(resourceProvider, activity2, true);
                                u41Var3.i(k96.M0(2131744743, null), false, true);
                                m.addView(u41Var3, nme.o(-1, 48));
                                u41Var3.setOnClickListener(new xg(u41Var3, starsSubscription, i5, fx0VarArr, chat4, str2));
                            }
                        } else {
                            l46 l46Var7 = new l46(activity2, resourceProvider);
                            zkb.X(l46Var7, i11, resourceProvider);
                            zkb.G(l46Var7, i10, resourceProvider);
                            l46Var7.setTextSize(1, 14.0f);
                            l46Var7.setText(k96.a0(null, null, 2131744764, k96.u(starsSubscription.until_date, false)));
                            l46Var7.setSingleLine(false);
                            l46Var7.setMaxLines(4);
                            l46Var7.setGravity(17);
                            m.addView(l46Var7, nme.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final u41 u41Var4 = new u41(resourceProvider, activity2, false);
                            u41Var4.i(k96.M0(2131744765, null), false, true);
                            u41Var4.setTextColorKey(bkb.mk);
                            m.addView(u41Var4, nme.o(-1, 48));
                            u41Var4.setOnClickListener(new View.OnClickListener() { // from class: zta
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final u41 u41Var5 = u41Var4;
                                    if (u41Var5.R) {
                                        return;
                                    }
                                    u41Var5.setLoading(true);
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
                                    final fx0[] fx0VarArr3 = fx0VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: eua
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            gl.c3(new jl9(i12, u41Var5, tLObject, starsSubscription2, z4, z5, fx0VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r5 = 0;
                    i8.O = m;
                    fx0VarArr[r5] = i8;
                    i8.T0 = r5;
                    i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aua
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            kk7.f(i5).n(luaVar, kk7.B3);
                        }
                    });
                    fx0VarArr[r5].K();
                    S = LaunchActivity.S();
                    if (!gl.O1()) {
                        fx0VarArr[r5].X(S);
                    }
                    fx0VarArr[r5].show();
                }
                TLRPC.User V13 = na7.q1(i7).V1(Long.valueOf(n));
                pb0Var.q(V13);
                be0Var.f(V13, pb0Var);
            }
            chat2 = chat3;
            str2 = str;
            frameLayout.addView(be0Var, nme.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            zkb.x(frameLayout, drawable3, bkb.g5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            tb4.w(textView3, bkb.i5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            m.addView(textView3, nme.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            zkb.X(textView22, bkb.A6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i3 = tL_starsSubscriptionPricing2.period;
            if (i3 != 2592000) {
            }
            m.addView(textView22, nme.t(-1, -2, 17, 20, 0, 20, 4));
            mfb mfbVar2 = new mfb(parentActivity, resourceProvider);
            l46 l46Var8 = new l46(parentActivity, resourceProvider);
            l46Var8.setPadding(gl.L(12.66f), gl.L(9.33f), gl.L(12.66f), gl.L(9.33f));
            l46Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i102 = bkb.Wc;
            zkb.X(l46Var8, i102, resourceProvider);
            zkb.G(l46Var8, i102, resourceProvider);
            l46Var8.setTextSize(1, 14.0f);
            l46Var8.setSingleLine(true);
            l46Var8.setDisablePaddingsOffsetY(true);
            ec0 ec0Var2 = new ec0(24.0f, i7, l46Var8);
            if (i2 < 0) {
            }
            String str52 = str4;
            final TLObject chat42 = chat2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(ec0Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new mua(fx0VarArr2, n), 3, spannableStringBuilder2.length(), 33);
            l46Var8.setText(spannableStringBuilder2);
            if (!z3) {
            }
            if (i2 >= 0) {
            }
            str3 = null;
            mfbVar2.f(k96.M0(2131744739, str3), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), k96.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (starsSubscription.canceled) {
            }
            j = n;
            i4 = 2131744732;
            mfbVar2.f(k96.M0(i4, null), k96.a0(null, null, 2131742520, k96.D0().r0().format(new Date(starsSubscription.until_date * 1000)), k96.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            m.addView(mfbVar2, nme.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            Activity activity22 = activity;
            l46 l46Var22 = new l46(activity22, resourceProvider);
            int i112 = bkb.y6;
            zkb.X(l46Var22, i112, resourceProvider);
            zkb.G(l46Var22, i102, resourceProvider);
            l46Var22.setTextSize(1, 14.0f);
            l46Var22.setText(gl.N2(k96.M0(2131744689, null), -1, 0, new m9(activity22, (byte) 5), null));
            l46Var22.setGravity(17);
            m.addView(l46Var22, nme.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r5 = 0;
            i8.O = m;
            fx0VarArr[r5] = i8;
            i8.T0 = r5;
            i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aua
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    kk7.f(i5).n(luaVar, kk7.B3);
                }
            });
            fx0VarArr[r5].K();
            S = LaunchActivity.S();
            if (!gl.O1()) {
            }
            fx0VarArr[r5].show();
        }
    }

    public final /* synthetic */ void M0(Context context) {
        if (na7.q1(this.currentAccount).t2()) {
            h5.b(this.currentAccount);
        } else {
            new ava(context, this.resourceProvider).show();
        }
    }

    public final /* synthetic */ void N0(Context context) {
        new ava(context, this.resourceProvider).show();
    }

    public final void O0() {
        gta.v(this.currentAccount, false).r();
        xu4.f1(true, oj0.a(this.currentAccount).b());
    }

    public final void P0(c4c c4cVar, Boolean bool, String str) {
        if (getParentActivity() != null) {
            if (bool.booleanValue()) {
                u21.b0(this).I(R.raw.stars_topup, k96.M0(2131744922, null), gl.S2(k96.G((int) c4cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                this.i0.c(true);
                gta.v(this.currentAccount, false).P(true);
            } else if (str != null) {
                u21.b0(this).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str)).j();
            }
        }
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final byte b = 0;
        this.H = false;
        this.F = gl.L(238.0f);
        dha dhaVar = new dha(context);
        this.V = dhaVar;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        dhaVar.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            ui5 ui5Var = this.parentLayout;
            this.c0 = (ui5Var == null || !((ActionBarLayout) ui5Var).T0) ? gl.m : 0;
            this.d0 = gl.n;
        }
        byte b2 = 15;
        this.V.setGeometry(new u39(this, b2));
        this.V.A(-b00.x(48.0f, this.c0, -gl.L(8.0f)), -b00.x(48.0f, this.d0, -gl.L(8.0f)));
        dha dhaVar2 = this.V;
        dhaVar2.getClass();
        this.W = new si9((byte) 6, context, dhaVar2);
        this.U = new iva(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        byte b3 = 8;
        this.h0 = new si9(b3, context, this);
        super.createView(context);
        hz4 hz4Var = this.s;
        getBaseSimpleGlass().f(hz4Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new cg0(this, new gua(hz4Var, b), b3);
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        dha dhaVar3 = this.V;
        dhaVar3.addView(this.X, dhaVar3.indexOfChild(view), nme.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        kta ktaVar = new kta(this, b);
        s33 s33Var = s33.h;
        fm0 fm0Var = new fm0(0, ktaVar, s33Var, 380L, false);
        this.Y = fm0Var;
        this.Z = new fm0(1, new kta(this, c3 == true ? 1 : 0), s33Var, 380L, false);
        this.a0 = new fm0(2, new kta(this, (byte) 2), s33Var, 380L, false);
        fm0Var.a(this.c.canScrollVertically(-1) || this.simpleActionBar.x(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new n58(this, (byte) 26));
        q1();
        il0 c4 = getBaseSimpleGlass().c.c(view, null, false);
        c4.p(nod.l(this.resourceProvider));
        c4.q(gl.L(9.66f));
        c4.r(gl.L(18.0f));
        view.setBackground(c4);
        ui5 ui5Var2 = this.parentLayout;
        if (ui5Var2 != null && ((ActionBarLayout) ui5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        er4 er4Var = new er4(context, 1, 2);
        this.T = er4Var;
        uq4 uq4Var = er4Var.b;
        uq4Var.z = bkb.Vk;
        uq4Var.A = bkb.Wk;
        uq4Var.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, nme.d(kk7.T2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        i0(k96.M0(2131743974, null), gl.D2(gl.N2(k96.M0(2131743971, null), -1, 0, new vf1(context, b2), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33Var);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        this.c.setOnItemClickListener(new f09(this, (byte) 11));
        qh4 qh4Var = new qh4(getParentActivity());
        this.i0 = qh4Var;
        this.s.addView(qh4Var, nme.c(-1.0f, -1));
        gta v = gta.v(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, gl.L(24.0f), 0, gl.L(10.0f));
        hn hnVar = new hn(getParentActivity(), false, true, false);
        this.l0 = hnVar;
        hnVar.setTypeface(gl.o());
        this.l0.setTextSize(gl.L(32.0f));
        this.l0.setGravity(17);
        zkb.U(this.l0, bkb.F6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        ol5 ol5Var = new ol5(42.0f, this.currentAccount, this.l0);
        oy8 oy8Var = new oy8(R.raw.star_reaction, gl.L(42.0f), gl.L(42.0f));
        ImageReceiver imageReceiver = ol5Var.b;
        imageReceiver.g0(oy8Var);
        imageReceiver.M(2);
        ol5Var.f = false;
        ol5Var.h = -gl.L(3.0f);
        this.k0.setSpan(ol5Var, 0, 1, 33);
        this.j0.addView(this.l0, nme.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(k96.M0(2131742527, null));
        zkb.X(this.m0, bkb.y6, this.resourceProvider);
        this.j0.addView(this.m0, nme.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        oc6 oc6Var = new oc6((byte) 25, getParentActivity(), this);
        this.o0 = oc6Var;
        frameLayout2.addView(oc6Var);
        u41 u41Var = new u41(this.resourceProvider, getParentActivity(), true);
        this.p0 = u41Var;
        u41Var.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: rta
            public final /* synthetic */ jva b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = b;
                Context context2 = context;
                jva jvaVar = this.b;
                switch (b4) {
                    case 0:
                        jvaVar.M0(context2);
                        break;
                    default:
                        jvaVar.N0(context2);
                        break;
                }
            }
        });
        this.o0.addView(this.p0, nme.e(-1, 48, kk7.D1));
        pkb pkbVar = new pkb((byte) 19, getParentActivity(), this);
        this.q0 = pkbVar;
        frameLayout2.addView(pkbVar);
        u41 u41Var2 = new u41(this.resourceProvider, getParentActivity(), true);
        this.r0 = u41Var2;
        u41Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new cm2(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) k96.M0(2131744728, null));
        this.r0.i(spannableStringBuilder, false, true);
        u41 u41Var3 = this.r0;
        final char c5 = c2 == true ? 1 : 0;
        u41Var3.setOnClickListener(new View.OnClickListener(this) { // from class: rta
            public final /* synthetic */ jva b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = c5;
                Context context2 = context;
                jva jvaVar = this.b;
                switch (b4) {
                    case 0:
                        jvaVar.M0(context2);
                        break;
                    default:
                        jvaVar.N0(context2);
                        break;
                }
            }
        });
        this.q0.addView(this.r0, nme.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        u41 u41Var4 = new u41(this.resourceProvider, getParentActivity(), true);
        this.n0 = u41Var4;
        u41Var4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new cm2(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) k96.M0(2131744785, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: wta
            public final /* synthetic */ jva b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = b;
                jva jvaVar = this.b;
                switch (b4) {
                    case 0:
                        jvaVar.presentFragment(new ss0(0, jvaVar.getUserConfig().e()));
                        break;
                    default:
                        jvaVar.O0();
                        break;
                }
            }
        });
        this.q0.addView(this.n0, nme.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, nme.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        u41 u41Var5 = new u41(this.resourceProvider, getParentActivity(), false);
        this.s0 = u41Var5;
        u41Var5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new cm2(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) k96.M0(2131743972, null));
        this.s0.i(spannableStringBuilder3, false, true);
        u41 u41Var6 = this.s0;
        final char c6 = c == true ? 1 : 0;
        u41Var6.setOnClickListener(new View.OnClickListener(this) { // from class: wta
            public final /* synthetic */ jva b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b4 = c6;
                jva jvaVar = this.b;
                switch (b4) {
                    case 0:
                        jvaVar.presentFragment(new ss0(0, jvaVar.getUserConfig().e()));
                        break;
                    default:
                        jvaVar.O0();
                        break;
                }
            }
        });
        this.j0.addView(this.s0, nme.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        vb vbVar = this.v0;
        if (vbVar != null) {
            vbVar.O(false);
        }
        ct0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = ct0.g(this.currentAccount).h(getUserConfig().e(), false);
        p1(v.m().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.w3;
        int i4 = kk7.B3;
        int i5 = kk7.A3;
        if (i == i5 || i == i4 || i == i3) {
            n1("NOTIFICATION_" + i);
        }
        if (i == i3) {
            t0();
            vb vbVar = this.v0;
            if (vbVar != null) {
                vbVar.O(true);
            }
            g0();
            return;
        }
        if (i == i5) {
            gta v = gta.v(this.currentAccount, false);
            if (this.t0 != v.K(0)) {
                this.t0 = v.K(0);
                t0();
                vb vbVar2 = this.v0;
                if (vbVar2 != null) {
                    vbVar2.O(false);
                }
                g0();
                return;
            }
            return;
        }
        if (i == i4) {
            vb vbVar3 = this.v0;
            if (vbVar3 != null) {
                vbVar3.O(true);
                return;
            }
            return;
        }
        if (i == kk7.z3) {
            o1();
        } else if (i == kk7.D3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override // iz4
    public final void g0() {
        dha dhaVar;
        n1("RESTORE_BEFORE");
        super.g0();
        if (this.f0 && (dhaVar = this.V) != null && this.b0 != -1) {
            dhaVar.a();
        }
        this.f0 = false;
        n1("RESTORE_AFTER");
    }

    @Override // iz4
    public final void h0() {
        this.s.addView(this.V, nme.c(-1.0f, -1));
        this.V.v(this.c, new kta(this, (byte) 3));
        dha dhaVar = this.V;
        iva ivaVar = this.U;
        dhaVar.y(ivaVar, ivaVar.b, new ho9((byte) 28));
        this.V.z(this.U.d);
        this.U.d.setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        dha dhaVar = this.V;
        return dhaVar == null || motionEvent == null || dhaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // iz4
    public final w39 j0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new tf8(this, (byte) 24), getResourceProvider(), (byte) 4);
        this.v0 = vbVar;
        vbVar.r = false;
        return vbVar;
    }

    @Override // iz4
    public final t26 k0(Context context) {
        dha dhaVar = this.V;
        dhaVar.getClass();
        return new xe2((Object) dhaVar, (byte) 5);
    }

    @Override // iz4
    public final cra l0() {
        return new qua(getParentActivity(), 75, 1);
    }

    @Override // iz4
    public final View n0(Context context) {
        throw null;
    }

    public final void n1(String str) {
        if (this.V != null) {
            StringBuilder p = ug8.p("Stars event=", str, " row=");
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
            si9 si9Var = this.W;
            p.append((si9Var == null || si9Var.getParent() == null) ? false : true);
            p.append(" boundaryTop=");
            si9 si9Var2 = this.W;
            p.append(si9Var2 == null ? 0 : si9Var2.getTop());
            p.append(" boundaryHeight=");
            si9 si9Var3 = this.W;
            p.append(si9Var3 != null ? si9Var3.getHeight() : 0);
            Log.d("SiblingScroll", p.toString());
            dha dhaVar = this.V;
            if (dhaVar.a) {
                dhaVar.b = Math.max(dhaVar.b, 30);
                dhaVar.f(str, null, 0, 0, true);
            }
        }
    }

    public final void o1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        gta v = gta.v(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) G0(v.m(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(k96.M0(v.m().amount > 0 ? 2131744913 : 2131744914, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = ct0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        p1(z, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.w3);
        kk7.f(this.currentAccount).b(this, kk7.z3);
        kk7.f(this.currentAccount).b(this, kk7.A3);
        kk7.f(this.currentAccount).b(this, kk7.B3);
        kk7.f(this.currentAccount).b(this, kk7.D3);
        gta.v(this.currentAccount, false).P(true);
        gta.v(this.currentAccount, false).O();
        gta.v(this.currentAccount, false).w();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        o39 o39Var = this.c;
        if (o39Var != null) {
            o39Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.w3);
        kk7.f(this.currentAccount).n(this, kk7.z3);
        kk7.f(this.currentAccount).n(this, kk7.A3);
        kk7.f(this.currentAccount).n(this, kk7.B3);
        kk7.f(this.currentAccount).n(this, kk7.D3);
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        D0();
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        er4 er4Var = this.T;
        if (er4Var != null) {
            er4Var.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // iz4, org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        er4 er4Var = this.T;
        if (er4Var != null) {
            er4Var.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override // iz4
    public final float p0() {
        o39 o39Var = this.c;
        if (o39Var == null) {
            return 0.0f;
        }
        return o39Var.getY();
    }

    public final void p1(final boolean z, boolean z2) {
        this.u0 = z;
        oc6 oc6Var = this.o0;
        if (z2) {
            oc6Var.setVisibility(0);
            this.q0.setVisibility(0);
            final byte b = 0;
            this.o0.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: dua
                public final /* synthetic */ jva b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z3 = z;
                    jva jvaVar = this.b;
                    switch (b2) {
                        case 0:
                            if (z3) {
                                jvaVar.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                jvaVar.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final byte b2 = 1;
            this.q0.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: dua
                public final /* synthetic */ jva b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    boolean z3 = z;
                    jva jvaVar = this.b;
                    switch (b22) {
                        case 0:
                            if (z3) {
                                jvaVar.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                jvaVar.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        oc6Var.animate().cancel();
        this.q0.animate().cancel();
        this.q0.setAlpha(z ? 1.0f : 0.0f);
        this.o0.setAlpha(z ? 0.0f : 1.0f);
        this.q0.setVisibility(z ? 0 : 8);
        this.o0.setVisibility(z ? 8 : 0);
    }

    @Override // iz4
    public final View q0() {
        return this.V;
    }

    public final void q1() {
        if (this.X == null) {
            return;
        }
        int L = gl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override // iz4
    public final void r0(boolean z) {
        fm0 fm0Var = this.a0;
        if (fm0Var == null || fm0Var.f == z) {
            return;
        }
        fm0Var.a(z, true);
    }

    public final void r1() {
        View view = this.X;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.Y;
        float f = fm0Var == null ? 0.0f : fm0Var.e;
        fm0 fm0Var2 = this.Z;
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - (fm0Var2 != null ? fm0Var2.e : 0.0f)) * gl.L(44.0f)));
    }

    @Override // iz4
    public final void t0() {
        n1("SAVE_BEFORE");
        super.t0();
        dha dhaVar = this.V;
        this.f0 = dhaVar != null && dhaVar.f0;
        o39 o39Var = this.c;
        if (o39Var != null && this.Q >= 0) {
            this.R -= o39Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
