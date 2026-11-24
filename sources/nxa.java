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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nxa extends h15 implements jm7 {
    public static DecimalFormat w0;
    public static DecimalFormat x0;
    public FrameLayout S;
    public ft4 T;
    public mxa U;
    public fja V;
    public xd9 W;
    public View X;
    public fn0 Y;
    public fn0 Z;
    public fn0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public xd9 h0;
    public uj4 i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public io l0;
    public TextView m0;
    public b61 n0;
    public ne6 o0;
    public b61 p0;
    public qmb q0;
    public b61 r0;
    public b61 s0;
    public boolean t0;
    public boolean u0;
    public vb v0;
    public int b0 = -1;
    public final nsa g0 = new nsa((Object) this, (byte) 1);

    public nxa() {
        this.N = true;
    }

    public static void C0(mhb mhbVar, int i, TL_stars.StarGift starGift, ylb ylbVar) {
        TextView textView = (TextView) ((jhb) mhbVar.f(jb6.M0(2131750233, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ta6 ta6Var = new ta6(textView, gm.L(90.0f), 0, ylbVar);
        ta6Var.a(cmb.p1(0.21f, textView.getPaint().getColor()), cmb.p1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ta6Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (starGift.sold_out) {
            boolean z = starGift instanceof TL_stars.TL_starGiftUnique;
            int i2 = starGift.availability_remains;
            if (z) {
                textView.setText(i2 <= 0 ? jb6.H(',', "Gift2QuantityIssuedNone", starGift.availability_total) : jb6.H(',', "Gift2QuantityIssued1", starGift.availability_issued).concat(jb6.H(',', "Gift2QuantityIssued2", starGift.availability_total)));
                return;
            } else {
                int i3 = starGift.availability_total;
                textView.setText(i2 <= 0 ? jb6.H(',', "Gift2Availability2ValueNone", i3) : jb6.K("Gift2Availability4Value", i2, ',', jb6.E(i3, ',')));
                return;
            }
        }
        final jva v = jva.v(i, false);
        final long j = starGift.id;
        final eg9 eg9Var = new eg9(textView, (byte) 12);
        final boolean[] zArr = {false};
        final jm7[] jm7VarArr = new jm7[1];
        jm7VarArr[0] = new jm7() { // from class: tua
            @Override // jm7
            public final void didReceivedNotification(int i4, int i5, Object[] objArr) {
                int i6;
                jva jvaVar;
                TL_stars.StarGift G;
                boolean[] zArr2 = zArr;
                if (zArr2[0] || i4 != (i6 = nm7.H3) || (G = (jvaVar = jva.this).G(j)) == null) {
                    return;
                }
                zArr2[0] = true;
                nm7.f(jvaVar.a).n(jm7VarArr[0], i6);
                eg9Var.a(G);
            }
        };
        int i4 = v.a;
        nm7 f = nm7.f(i4);
        jm7 jm7Var = jm7VarArr[0];
        int i5 = nm7.H3;
        f.a(jm7Var, i5);
        TL_stars.StarGift G = v.G(j);
        if (G != null) {
            zArr[0] = true;
            nm7.f(i4).n(jm7VarArr[0], i5);
            eg9Var.a(G);
        }
    }

    public static void D0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new swa(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
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
                spannableStringBuilder.append((CharSequence) (starsAmount.negative() ? "-" : "").concat(jb6.E(Math.abs(starsAmount.amount / 1000000000), c)));
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
                spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(jb6.E(Math.abs(j3), c)));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(jb6.E(Math.abs(j3), c)));
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
                    spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(jb6.E(Math.abs(j2), c)));
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append((CharSequence) ((z ? "-" : "") + gm.o0((int) Math.abs(j2), 0)));
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(jb6.E(Math.abs(j2), c)));
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
            spannableStringBuilder.append((CharSequence) jb6.H(',', "Stars", (int) j));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) (z ? "-" : "").concat(jb6.E(Math.abs(j2), ',')));
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
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131744773, null));
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
        return (j < 0 ? "-" : "").concat(jb6.E(Math.abs(j / 1000000000), ','));
    }

    public static String L0(int i, boolean z, TL_stars.StarsTransaction starsTransaction) {
        int i2;
        if (starsTransaction.stargift_drop_original_details) {
            return jb6.M0(2131744621, null);
        }
        if (starsTransaction.posts_search) {
            return jb6.M0(2131744625, null);
        }
        if (starsTransaction.premium_gift) {
            return jb6.M0(2131744624, null);
        }
        if (starsTransaction.phonegroup_message) {
            return jb6.M0(starsTransaction.reaction ? 2131744633 : 2131744634, null);
        }
        if (starsTransaction.paid_message) {
            return jb6.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages);
        }
        if (starsTransaction.floodskip) {
            return jb6.M0(2131744648, null);
        }
        if (!starsTransaction.extended_media.isEmpty()) {
            return jb6.M0(2131744893, null);
        }
        TL_stars.StarsAmount starsAmount = starsTransaction.amount;
        int i3 = starsTransaction.flags;
        if ((131072 & i3) == 0 && (65536 & i3) != 0) {
            return jb6.a0(null, null, 2131744850, bc.J0(starsTransaction.starref_commission_permille));
        }
        if (starsTransaction.stargift != null) {
            if (starsTransaction.stargift_prepaid_upgrade) {
                return jb6.M0(2131749863, null);
            }
            boolean z2 = starsTransaction.refund;
            boolean z3 = starsTransaction.stargift_auction_bid;
            if (z2) {
                return jb6.M0(z3 ? 2131749862 : starsAmount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749859 : 2131749860 : 2131749861, null);
            }
            return jb6.M0(z3 ? 2131749865 : starsAmount.amount > 0 ? 2131749864 : starsTransaction.stargift_upgrade ? 2131749856 : 2131749857, null);
        }
        if (starsTransaction.subscription) {
            int i4 = starsTransaction.subscription_period;
            if (i4 == 2592000) {
                return jb6.M0(2131744852, null);
            }
            if (i4 == 300) {
                return "5-minute subscription fee";
            }
            if (i4 == 60) {
                return "Minute subscription fee";
            }
        }
        if ((i3 & TLObject.FLAG_13) != 0) {
            return jb6.M0(2131744782, null);
        }
        if (starsTransaction.gift) {
            if (starsTransaction.sent_by != null) {
                return jb6.M0(m9c.D(oc7.r1(i).W1(Long.valueOf(pg3.n(starsTransaction.sent_by)))) ? 2131744790 : 2131744791, null);
            }
            return jb6.M0(2131744791, null);
        }
        String str = starsTransaction.title;
        if (str != null) {
            return str;
        }
        long n = pg3.n(starsTransaction.peer.peer);
        if (n != 0) {
            int i5 = z8c.t0;
            if (n >= 0) {
                return m9c.r(oc7.r1(i5).W1(Long.valueOf(n)));
            }
            TLRPC.Chat L0 = oc7.r1(i5).L0(Long.valueOf(-n));
            return L0 == null ? "" : L0.title;
        }
        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
        if (!(starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment)) {
            return starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? jb6.M0(2131744650, null) : starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds ? jb6.M0(2131744651, null) : jb6.M0(2131744612, null);
        }
        if (!z) {
            boolean z4 = starsTransaction.refund;
            TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
            if (!z4 ? !starsAmount2.negative() : !starsAmount2.positive()) {
                i2 = 2131744640;
                return jb6.M0(i2, null);
            }
        }
        i2 = 2131744610;
        return jb6.M0(i2, null);
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
        pn2 pn2Var = new pn2(R.drawable.diamond, 0);
        pn2Var.d = false;
        pn2Var.r = 0.0f;
        pn2Var.s = f2;
        pn2Var.H = f3;
        pn2Var.I = f;
        pn2Var.J = f;
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "💎", "💎️");
        gm.I2(spannableStringBuilder, "💎", "💎 ");
        gm.I2(spannableStringBuilder, spannableString, "💎");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f, pn2[] pn2VarArr) {
        return Y0(false, charSequence, f, pn2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z) {
        return X0(z, charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null);
    }

    public static SpannableStringBuilder X0(boolean z, CharSequence charSequence, float f, pn2[] pn2VarArr) {
        return Y0(z, charSequence, f, pn2VarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(boolean z, CharSequence charSequence, float f, pn2[] pn2VarArr, float f2, float f3) {
        pn2 pn2Var;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = !(charSequence instanceof SpannableStringBuilder) ? new SpannableStringBuilder(charSequence) : (SpannableStringBuilder) charSequence;
        SpannableString spannableString = new SpannableString((z ? "TON" : "⭐").concat(" "));
        if (pn2VarArr == null || (pn2Var = pn2VarArr[0]) == null) {
            pn2Var = new pn2(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            if (pn2VarArr != null) {
                pn2VarArr[0] = pn2Var;
            }
        }
        pn2Var.r = 0.0f;
        pn2Var.s = f2;
        pn2Var.H = f3;
        if (z) {
            pn2Var.d = false;
            float f4 = f * 0.2f;
            pn2Var.I = f4;
            pn2Var.J = f4;
        } else {
            pn2Var.I = f;
            pn2Var.J = f;
        }
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "⭐", "⭐️");
        gm.I2(spannableStringBuilder, "⭐", "⭐ ");
        gm.I2(spannableStringBuilder, spannableString, "⭐");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(boolean z, String str, pn2[] pn2VarArr) {
        pn2 pn2Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (pn2VarArr == null || (pn2Var = pn2VarArr[0]) == null) {
            pn2Var = new pn2(z ? R.drawable.mini_gram_72 : R.drawable.msg_premium_liststar, 0);
            float f = z ? 0.222f : 1.13f;
            pn2Var.I = f;
            pn2Var.J = f;
        }
        if (z) {
            pn2Var.d = false;
        }
        if (pn2VarArr != null) {
            pn2VarArr[0] = pn2Var;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "⭐", "⭐️");
        gm.I2(spannableStringBuilder, "⭐", "⭐ ");
        gm.I2(spannableStringBuilder, spannableString, "⭐");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a1(TL_stars.StarsAmount starsAmount, String str, pn2[] pn2VarArr) {
        return b1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, pn2VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannableStringBuilder b1(boolean z, CharSequence charSequence, float f, pn2[] pn2VarArr) {
        int i;
        String str;
        pn2 pn2Var;
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
        if (pn2VarArr != null) {
            pn2Var = pn2VarArr[0];
            if (pn2Var == null) {
                if (pn2VarArr.length > 0) {
                    pn2Var = new pn2(i, 0);
                    pn2VarArr[0] = pn2Var;
                }
            }
            pn2Var.d = false;
            if (z) {
                f *= 0.33f;
            }
            pn2Var.I = f;
            pn2Var.J = f;
            spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
            gm.I2(spannableStringBuilder, "⭐", "⭐️");
            gm.I2(spannableStringBuilder, "⭐", "⭐ ");
            gm.I2(spannableStringBuilder, spannableString, "⭐");
            gm.I2(spannableStringBuilder, "XTR", "XTR ");
            gm.I2(spannableStringBuilder, spannableString, "XTR");
            return spannableStringBuilder;
        }
        pn2Var = new pn2(i, 0);
        pn2Var.d = false;
        if (z) {
        }
        pn2Var.I = f;
        pn2Var.J = f;
        spannableString.setSpan(pn2Var, 0, spannableString.length() - 1, 33);
        gm.I2(spannableStringBuilder, "⭐", "⭐️");
        gm.I2(spannableStringBuilder, "⭐", "⭐ ");
        gm.I2(spannableStringBuilder, spannableString, "⭐");
        gm.I2(spannableStringBuilder, "XTR", "XTR ");
        gm.I2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static gwa c1(bf0 bf0Var, ImageReceiver imageReceiver, String str, boolean z) {
        final byte b = 1;
        int i = imageReceiver.d;
        final al3 al3Var = new al3(z, i, str, imageReceiver, new boolean[1]);
        al3Var.run();
        final byte b2 = 0;
        return new gwa(nm7.f(i).h(bf0Var, z ? nm7.Z2 : nm7.Y2, new qac() { // from class: fwa
            @Override // qac
            public final void a(Object obj) {
                byte b3 = b2;
                al3 al3Var2 = al3Var;
                switch (b3) {
                    case 0:
                        al3Var2.run();
                        break;
                    default:
                        al3Var2.run();
                        break;
                }
            }
        }), nm7.f(i).h(bf0Var, nm7.y0, new qac() { // from class: fwa
            @Override // qac
            public final void a(Object obj) {
                byte b3 = b;
                al3 al3Var2 = al3Var;
                switch (b3) {
                    case 0:
                        al3Var2.run();
                        break;
                    default:
                        al3Var2.run();
                        break;
                }
            }
        }), b2);
    }

    public static void d1(bf0 bf0Var, ImageReceiver imageReceiver, long j) {
        c1(bf0Var, imageReceiver, j <= 1000 ? "2⃣" : j < 2500 ? "3⃣" : "4⃣", false);
    }

    public static void e1(ImageReceiver imageReceiver, TLRPC.Document document, int i) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = bc4.w(document.thumbs, i, false, null, false);
        imageReceiver.Z(gn5.b(document), td4.n(i, i, "_"), gn5.c(w, document), td4.n(i, i, "_"), eq3.d(document.thumbs, cmb.Z6, 0.35f, false), 0L, null, null, 0);
    }

    public static void f1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i) {
        e1(imageReceiver, starGift == null ? null : starGift.getDocument(), i);
    }

    public static gwa g1(bf0 bf0Var, ImageReceiver imageReceiver, int i) {
        return c1(bf0Var, imageReceiver, i != 3 ? i != 6 ? i != 12 ? i != 24 ? "1⃣" : "5⃣" : "4⃣" : "3⃣" : "2⃣", false);
    }

    public static void h1(bf0 bf0Var, ImageReceiver imageReceiver, long j) {
        c1(bf0Var, imageReceiver, j <= 10000000000L ? "2⃣" : j <= 50000000000L ? "1⃣" : "3⃣", true);
    }

    public static void i1(Context context, int i, long j, TL_stories.Boost boost, ylb ylbVar) {
        int i2;
        if (context == null) {
            return;
        }
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i3 = hg9.i(context, 1);
        i3.setPadding(0, gm.L(20.0f), 0, gm.L(4.0f));
        i3.setClipChildren(false);
        i3.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i3.addView(frameLayout, qoe.t(-1, nm7.f2, 7, 0, 0, 0, 10));
        uwa uwaVar = new uwa(context, 70, 0);
        frameLayout.addView(uwaVar, qoe.c(-1.0f, -1));
        ft4 ft4Var = new ft4(context, 1, 2);
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        ft4Var.setStarParticlesView(uwaVar);
        frameLayout.addView(ft4Var, qoe.d(nm7.z2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        ft4Var.setPaused(false);
        TextView textView = new TextView(context);
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        byte b = 17;
        textView.setGravity(17);
        my0[] my0VarArr = new my0[1];
        textView.setText(jb6.H(' ', "BoostStars", (int) boost.stars));
        TextView m = wi8.m(i3, textView, qoe.t(-1, -2, 17, 20, 0, 20, 4), context);
        m.setBackground(cmb.b0(gm.L(20.0f), -6915073));
        m.setTextColor(-1);
        m.setTextSize(1, 11.33f);
        m.setPadding(gm.L(4.0f), 0, gm.L(8.33f), 0);
        m.setGravity(17);
        m.setTypeface(gm.o());
        int i4 = boost.multiplier;
        if (i4 == 0) {
            i4 = 1;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x".concat(jb6.H(' ', "BoostingBoostsCount", i4)));
        pn2 pn2Var = new pn2(R.drawable.mini_boost_badge, 2);
        float L = gm.L(0.66f);
        pn2Var.r = 0.0f;
        pn2Var.s = L;
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
        m.setText(spannableStringBuilder);
        i3.addView(m, qoe.t(-2, 20, 17, 20, 4, 20, 4));
        mhb mhbVar = new mhb(context, ylbVar);
        mhbVar.n(jb6.M0(2131753592, null), i, j, new rva(my0VarArr, j, (byte) 6));
        mhbVar.f(jb6.M0(2131753591, null), jb6.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String M0 = jb6.M0(2131753580, null);
            String M02 = jb6.M0(2131753579, null);
            i2 = 1;
            hq6 hq6Var = new hq6((Object) my0VarArr, j, (Object) boost, (byte) 27);
            my0VarArr = my0VarArr;
            mhbVar.i(M0, M02, hq6Var);
        } else {
            i2 = 1;
        }
        String M03 = jb6.M0(2131753627, null);
        String format = jb6.D0().r0().format(new Date(boost.date * 1000));
        String format2 = jb6.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[0] = format;
        objArr[i2] = format2;
        mhbVar.f(M03, jb6.a0(null, null, 2131742446, objArr), null, null);
        String M04 = jb6.M0(2131753572, null);
        String format3 = jb6.D0().r0().format(new Date(boost.expires * 1000));
        String format4 = jb6.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[0] = format3;
        objArr2[i2] = format4;
        mhbVar.f(M04, jb6.a0(null, null, 2131742446, objArr2), null, null);
        i3.addView(mhbVar, qoe.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        l66 l66Var = new l66(context, ylbVar);
        anb.X(l66Var, cmb.y6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setTextSize(i2, 14.0f);
        l66Var.setText(gm.N2(jb6.M0(2131744615, null), -1, 0, new dh1(context, b), null));
        l66Var.setGravity(17);
        i3.addView(l66Var, qoe.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.i(jb6.M0(2131747564, null), false, true);
        b61Var.setOnClickListener(new f5(my0VarArr, (byte) 5));
        i3.addView(b61Var, qoe.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        h.O = i3;
        my0VarArr[0] = h;
        h.T0 = false;
        h.J();
        d S = LaunchActivity.S();
        if (!gm.O1() && !gm.s1(S)) {
            my0VarArr[0].X(S);
        }
        ft4Var.setPaused(false);
        my0VarArr[0].show();
        my0VarArr[0].n(new nsa((Object) ft4Var, (byte) 2));
    }

    public static q2a j1(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, jac jacVar, ylb ylbVar) {
        ok okVar = ok.a;
        q2a q2aVar = new q2a(context, ylbVar, i, tL_starGiftUnique == null ? nk.h(oc7.r1(i).l4.o.f(), okVar) : tL_starGiftUnique.resale_ton_only ? tL_starGiftUnique.getResellAmount(ok.b) : tL_starGiftUnique.getResellAmount(okVar), new ts9(jacVar, r8, (byte) 13));
        q2a[] q2aVarArr = {q2aVar};
        q2aVar.show();
        return q2aVarArr[0];
    }

    public static void k1(Context context, long j, boolean z, final jac jacVar, ylb ylbVar) {
        my0[] my0VarArr;
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        b61 b61Var = null;
        textView.setText(jb6.M0(2131747465, null));
        textView.setTextSize(1, 20.0f);
        int i = cmb.F6;
        anb.X(textView, i, ylbVar);
        linearLayout.addView(textView, qoe.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        gt7 gt7Var = new gt7(context, ylbVar);
        gt7Var.setForceForceUseCenter(true);
        gt7Var.setText(jb6.M0(2131747466, null));
        gt7Var.setLeftPadding(gm.L(36.0f));
        anb.X(editTextBoldCursor, i, ylbVar);
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = gm.L(16.0f);
        editTextBoldCursor.setPadding(gm.L(6.0f), L, L, L);
        byte b = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        anb.C(editTextBoldCursor, cmb.kg, ylbVar);
        anb.l(editTextBoldCursor, 36, cmb.lg, ylbVar);
        editTextBoldCursor.setGravity(jb6.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new ru0(gt7Var, editTextBoldCursor, b));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, qoe.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, qoe.p(-1, -2, 1.0f, nm7.D1));
        gt7Var.e(editTextBoldCursor);
        gt7Var.addView(linearLayout2, qoe.e(-1, -2, 48));
        linearLayout.addView(gt7Var, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        anb.X(textView2, cmb.z6, null);
        gt7Var.addView(textView2, qoe.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        l66 l66Var = new l66(context, null);
        l66Var.setText(gm.D2(gm.N2(jb6.M0(2131747468, null), -1, 0, new dh1(context, (byte) 18), null), true));
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.y6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        linearLayout.addView(l66Var, qoe.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final b61 i2 = mlb.i(24, ylbVar, context, true);
        i2.i(jb6.M0(j > 0 ? 2131747464 : 2131747470, null), false, true);
        linearLayout.addView(i2, qoe.o(-1, 48));
        if (j > 0 && z) {
            b61 i3 = mlb.i(24, ylbVar, context, false);
            i3.i(jb6.M0(2131747469, null), false, false);
            linearLayout.addView(i3, qoe.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            b61Var = i3;
        }
        h.O = linearLayout;
        final my0[] my0VarArr2 = {h};
        editTextBoldCursor.setText(j <= 0 ? "" : Long.toString(j));
        editTextBoldCursor.addTextChangedListener(new twa(editTextBoldCursor, gt7Var, j, z, i2, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yva
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
                jacVar.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new bwa(editTextBoldCursor2, my0VarArr2, (byte) 1));
                return true;
            }
        });
        zva zvaVar = new zva(zArr, jacVar, editTextBoldCursor, i2, my0VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i2.setOnClickListener(zvaVar);
        if (b61Var != null) {
            b61 b61Var2 = b61Var;
            zva zvaVar2 = new zva(zArr, jacVar, b61Var2, editTextBoldCursor2, my0VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            my0VarArr = my0VarArr2;
            b61Var2.setOnClickListener(zvaVar2);
        } else {
            my0VarArr = my0VarArr2;
        }
        my0VarArr[0].J();
        my0VarArr[0].setOnDismissListener(new ie4(editTextBoldCursor2, (byte) 3));
        my0VarArr[0].show();
        d Q = LaunchActivity.Q();
        gm.d3(new bwa(my0VarArr, editTextBoldCursor2), Q instanceof yv1 ? ((yv1) Q).ea() : false ? 200L : 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x100b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x1062  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x109c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x10c2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x10a9  */
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
    /* JADX WARN: Removed duplicated region for block: B:43:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0e7f A[LOOP:0: B:66:0x0df4->B:75:0x0e7f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0e8d A[EDGE_INSN: B:76:0x0e8d->B:77:0x0e8d BREAK  A[LOOP:0: B:66:0x0df4->B:75:0x0e7f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f09 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f1c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f1f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f2e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0f90  */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static my0 l1(final Context context, final boolean z, final long j, final int i, final TL_stars.StarsTransaction starsTransaction, final ylb ylbVar) {
        my0 my0Var;
        boolean z2;
        Context context2;
        int i2;
        TL_stars.StarsTransaction starsTransaction2;
        LinearLayout linearLayout;
        String str;
        boolean z3;
        boolean z4;
        long j2;
        ylb ylbVar2;
        boolean z5;
        TLRPC.Peer peer;
        long j3;
        gn5 gn5Var;
        gn5 c;
        int i3;
        final my0[] my0VarArr;
        int i4;
        String L0;
        TL_stars.StarGift starGift;
        ylb ylbVar3;
        ViewGroup viewGroup;
        int i5;
        TL_stars.StarsTransaction starsTransaction3;
        Context context3;
        boolean z6;
        mhb mhbVar;
        mhb mhbVar2;
        mhb mhbVar3;
        mhb mhbVar4;
        mhb mhbVar5;
        TL_stars.StarsTransactionPeer starsTransactionPeer;
        boolean z7;
        ViewGroup viewGroup2;
        TL_stars.StarGift starGift2;
        Context context4;
        ?? r13;
        d S;
        TLRPC.Chat L02;
        gn5 gn5Var2;
        gn5 c2;
        int i6;
        final my0[] my0VarArr2;
        boolean z8;
        mhb mhbVar6;
        mhb mhbVar7;
        my0[] my0VarArr3;
        final int i7;
        final my0[] my0VarArr4;
        int i8;
        long j4;
        mhb mhbVar8;
        int i9;
        long j5;
        TL_stars.StarsAmount starsAmount;
        ViewGroup viewGroup3;
        mhb mhbVar9;
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
        my0 my0Var2 = new my0(ylbVar, context, false, false);
        my0Var2.J();
        my0[] my0VarArr5 = new my0[1];
        final LinearLayout i11 = hg9.i(context, 1);
        i11.setPadding(0, gm.L((z10 || starsTransaction.gift || (starsTransaction.stargift_resale && (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique))) ? 0.0f : 20.0f), 0, gm.L(8.0f));
        i11.setClipChildren(false);
        i11.setClipToPadding(false);
        boolean z13 = z10;
        if (starsTransaction.stargift_resale) {
            TL_stars.StarGift starGift3 = starsTransaction.stargift;
            if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift3;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                tm tmVar = new tm(gm.L(20.0f), null);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                z2 = z11;
                Paint paint = new Paint(1);
                Matrix matrix = new Matrix();
                paint.setShader(radialGradient);
                my0Var = my0Var2;
                lwa lwaVar = new lwa(context, matrix, radialGradient, paint, tmVar);
                tmVar.l(lwaVar);
                tmVar.i(stargiftattributepattern.document, false);
                lwaVar.setOrientation(1);
                bf0 bf0Var = new bf0(context);
                f1(bf0Var.getImageReceiver(), starsTransaction.stargift, nm7.p2);
                lwaVar.addView(bf0Var, qoe.t(nm7.p2, nm7.p2, 17, 0, 20, 0, 0));
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    rve.a(bf0Var);
                    bf0Var.setOnClickListener(new wh((Object) context, i, (Object) tL_starGiftUnique, (byte) 17));
                }
                TextView b = jxe.b(context, 20.0f, 0, true, null);
                b.setTextColor(-1);
                b.setText(tL_starGiftUnique.title);
                lwaVar.addView(b, qoe.t(-2, -2, 17, 0, 1, 0, 0));
                TextView b2 = jxe.b(context, 13.0f, 0, false, null);
                b2.setTextColor(stargiftattributebackdrop.text_color | (-16777216));
                b2.setText(jb6.I(tL_starGiftUnique.num, "Gift2CollectionNumber"));
                lwaVar.addView(b2, qoe.t(-2, -2, 17, 0, 5, 0, 0));
                TextView b3 = jxe.b(context, 18.0f, 0, true, null);
                b3.setTextColor(-1);
                TL_stars.StarsAmount starsAmount3 = starsTransaction.amount;
                b3.setText(W0(starsAmount3, TextUtils.concat(positive ? "+" : "", G0(starsAmount3), " ⭐️")));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b3.getText());
                if (starsTransaction.refund) {
                    D0(spannableStringBuilder, b3, jb6.L0(2131744719));
                } else if (starsTransaction.failed) {
                    D0(spannableStringBuilder, b3, jb6.L0(2131744799));
                } else if (starsTransaction.pending) {
                    D0(spannableStringBuilder, b3, jb6.L0(2131744742));
                }
                b3.setText(spannableStringBuilder);
                lwaVar.addView(b3, qoe.t(-2, -2, 17, 0, 11, 0, 17));
                i11.addView(lwaVar, qoe.o(-1, -2));
                ylbVar2 = ylbVar;
                context2 = context;
                starsTransaction2 = starsTransaction;
                linearLayout = i11;
                str = "";
                z3 = z12;
                my0VarArr = my0VarArr5;
                z5 = z9;
                mhb mhbVar10 = new mhb(context2, ylbVar2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                    TL_stars.StarsTransaction starsTransaction4 = starsTransaction2;
                    ylbVar3 = ylbVar2;
                    my0[] my0VarArr6 = my0VarArr;
                    boolean z14 = z5;
                    viewGroup = linearLayout;
                    TL_stars.StarsTransactionPeer starsTransactionPeer2 = starsTransaction4.peer;
                    if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeer) {
                        final long n = pg3.n(starsTransactionPeer2.peer);
                        if (starsTransaction4.paid_message) {
                            mhbVar10.n(jb6.L0(positive ? 2131750126 : 2131749869), i, n, new rva(my0VarArr6, n, (byte) 0));
                            if (starsTransaction4.starref_amount != null && starsTransaction4.starref_commission_permille > 0) {
                                mhbVar10.d(b1(starsTransaction4.amount instanceof TL_stars.TL_starsTonAmount, "⭐️ ".concat(jb6.E(Math.abs(Math.round(starsTransaction4.starref_amount.toDouble() + starsTransaction4.amount.toDouble())), ',')), 0.8f, null), jb6.L0(2131744639));
                            }
                            mhbVar4 = mhbVar10;
                            my0VarArr = my0VarArr6;
                            i5 = i;
                        } else if (z2) {
                            long n2 = pg3.n(starsTransaction4.starref_peer);
                            mhbVar10.i(jb6.L0(2131744919), jb6.L0(2131744918), new rva(my0VarArr6, j, (byte) 1));
                            mhbVar10.n(jb6.L0(2131744922), i, n2, new rva(my0VarArr6, n2, (byte) 2));
                            mhbVar10.n(jb6.L0(2131744917), i, n, new rva(my0VarArr6, n, (byte) 3));
                            mhbVar10.d(bc.J0(starsTransaction4.starref_commission_permille), jb6.L0(2131744921));
                            i5 = i;
                            mhbVar4 = mhbVar10;
                            my0VarArr = my0VarArr6;
                        } else {
                            if (z3) {
                                my0VarArr = my0VarArr6;
                                mhbVar10.i(jb6.L0(2131744919), jb6.L0(2131744918), new dd2(i, context, j, n, my0VarArr, ylbVar3));
                                mhbVar10.n(jb6.L0(2131744920), i, n, new rva(my0VarArr, n, (byte) 4));
                                context3 = context;
                                starsTransaction3 = starsTransaction;
                                mhbVar2 = mhbVar10;
                            } else {
                                my0VarArr = my0VarArr6;
                                if (z13) {
                                    mhbVar10.n(jb6.L0(2131744897), i, n, new qva(my0VarArr, starsTransaction, n, (byte) 1));
                                    final byte b4 = 2;
                                    mhbVar10.n(jb6.L0(2131744896), i, z8c.h(i).e(), new Runnable() { // from class: pva
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b5 = b4;
                                            int i12 = i;
                                            my0[] my0VarArr7 = my0VarArr;
                                            switch (b5) {
                                                case 0:
                                                    my0VarArr7[0].dismiss();
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", z8c.h(i12).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        S2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    my0VarArr7[0].dismiss();
                                                    d S3 = LaunchActivity.S();
                                                    if (S3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", z8c.h(i12).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        S3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    my0VarArr7[0].dismiss();
                                                    d S4 = LaunchActivity.S();
                                                    if (S4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", z8c.h(i12).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        S4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    starsTransaction3 = starsTransaction;
                                    mhbVar10.i(jb6.L0(2131744895), jb6.L0(2131744894), new qva(my0VarArr, starsTransaction, n, (byte) 2));
                                    mhbVar10.d(J0(starsTransaction3.amount), jb6.L0(2131744898));
                                    i5 = i;
                                    mhbVar3 = mhbVar10;
                                    context3 = context;
                                    mhbVar = mhbVar3;
                                    z6 = z14;
                                    mhbVar5 = mhbVar;
                                } else {
                                    starsTransaction3 = starsTransaction;
                                    if (!starsTransaction3.subscription || z) {
                                        if (starsTransaction3.premium_gift) {
                                            final byte b5 = 1;
                                            mhbVar10.n(jb6.L0(2131749869), i, n, new Runnable() { // from class: tva
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b6 = b5;
                                                    Context context5 = context;
                                                    long j6 = n;
                                                    my0[] my0VarArr7 = my0VarArr;
                                                    switch (b6) {
                                                        case 0:
                                                            my0VarArr7[0].dismiss();
                                                            if (!m9c.C(j6)) {
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(yv1.ga(j6));
                                                                    break;
                                                                }
                                                            } else {
                                                                l11.u(context5, jb6.M0(2131744613, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            my0VarArr7[0].dismiss();
                                                            if (!m9c.C(j6)) {
                                                                d S3 = LaunchActivity.S();
                                                                if (S3 != null) {
                                                                    S3.presentFragment(yv1.ga(j6));
                                                                    break;
                                                                }
                                                            } else {
                                                                l11.u(context5, jb6.M0(2131744613, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            my0VarArr7[0].dismiss();
                                                            if (!m9c.C(j6)) {
                                                                d S4 = LaunchActivity.S();
                                                                if (S4 != null) {
                                                                    S4.presentFragment(yv1.ga(j6));
                                                                    break;
                                                                }
                                                            } else {
                                                                l11.u(context5, jb6.M0(2131744613, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            mhbVar10.d(jb6.I(starsTransaction3.premium_gift_months, "Months"), jb6.L0(2131744623));
                                        } else if (!starsTransaction3.posts_search) {
                                            String L03 = jb6.L0(2131744622);
                                            final byte b6 = 2;
                                            Runnable runnable = new Runnable() { // from class: tva
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b62 = b6;
                                                    Context context5 = context;
                                                    long j6 = n;
                                                    my0[] my0VarArr7 = my0VarArr;
                                                    switch (b62) {
                                                        case 0:
                                                            my0VarArr7[0].dismiss();
                                                            if (!m9c.C(j6)) {
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(yv1.ga(j6));
                                                                    break;
                                                                }
                                                            } else {
                                                                l11.u(context5, jb6.M0(2131744613, null));
                                                                break;
                                                            }
                                                            break;
                                                        case 1:
                                                            my0VarArr7[0].dismiss();
                                                            if (!m9c.C(j6)) {
                                                                d S3 = LaunchActivity.S();
                                                                if (S3 != null) {
                                                                    S3.presentFragment(yv1.ga(j6));
                                                                    break;
                                                                }
                                                            } else {
                                                                l11.u(context5, jb6.M0(2131744613, null));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            my0VarArr7[0].dismiss();
                                                            if (!m9c.C(j6)) {
                                                                d S4 = LaunchActivity.S();
                                                                if (S4 != null) {
                                                                    S4.presentFragment(yv1.ga(j6));
                                                                    break;
                                                                }
                                                            } else {
                                                                l11.u(context5, jb6.M0(2131744613, null));
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            my0VarArr = my0VarArr;
                                            context3 = context;
                                            mhbVar10.n(L03, i, n, runnable);
                                            mhbVar = mhbVar10;
                                            i5 = i;
                                            z6 = z14;
                                            mhbVar5 = mhbVar;
                                        }
                                        context3 = context;
                                        i5 = i;
                                        mhbVar = mhbVar10;
                                        my0VarArr = my0VarArr;
                                        z6 = z14;
                                        mhbVar5 = mhbVar;
                                    } else {
                                        final byte b7 = 0;
                                        mhbVar10.n(jb6.L0(2131744851), i, n, new Runnable() { // from class: tva
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b62 = b7;
                                                Context context5 = context;
                                                long j6 = n;
                                                my0[] my0VarArr7 = my0VarArr;
                                                switch (b62) {
                                                    case 0:
                                                        my0VarArr7[0].dismiss();
                                                        if (!m9c.C(j6)) {
                                                            d S2 = LaunchActivity.S();
                                                            if (S2 != null) {
                                                                S2.presentFragment(yv1.ga(j6));
                                                                break;
                                                            }
                                                        } else {
                                                            l11.u(context5, jb6.M0(2131744613, null));
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        my0VarArr7[0].dismiss();
                                                        if (!m9c.C(j6)) {
                                                            d S3 = LaunchActivity.S();
                                                            if (S3 != null) {
                                                                S3.presentFragment(yv1.ga(j6));
                                                                break;
                                                            }
                                                        } else {
                                                            l11.u(context5, jb6.M0(2131744613, null));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        my0VarArr7[0].dismiss();
                                                        if (!m9c.C(j6)) {
                                                            d S4 = LaunchActivity.S();
                                                            if (S4 != null) {
                                                                S4.presentFragment(yv1.ga(j6));
                                                                break;
                                                            }
                                                        } else {
                                                            l11.u(context5, jb6.M0(2131744613, null));
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        context3 = context;
                                        mhbVar2 = mhbVar10;
                                        my0VarArr = my0VarArr;
                                    }
                                }
                            }
                            i5 = i;
                            mhbVar = mhbVar2;
                            z6 = z14;
                            mhbVar5 = mhbVar;
                        }
                        starsTransaction3 = starsTransaction4;
                        mhbVar3 = mhbVar4;
                        context3 = context;
                        mhbVar = mhbVar3;
                        z6 = z14;
                        mhbVar5 = mhbVar;
                    } else {
                        mhb mhbVar11 = mhbVar10;
                        my0VarArr = my0VarArr6;
                        i5 = i;
                        starsTransaction3 = starsTransaction4;
                        context3 = context;
                        if (!(starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerFragment)) {
                            z6 = z14;
                            if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                                mhbVar11.d(jb6.L0(2131754196), jb6.L0(2131744620));
                                mhbVar5 = mhbVar11;
                            } else if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                                mhbVar11.d(jb6.L0(2131746952), jb6.L0(2131744620));
                                mhbVar5 = mhbVar11;
                            } else {
                                mhbVar5 = mhbVar11;
                                if (starsTransactionPeer2 instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                                    mhbVar11.d(jb6.L0(2131744650), jb6.L0(2131744620));
                                    mhbVar5 = mhbVar11;
                                }
                            }
                        } else if (starsTransaction3.gift) {
                            l66 l66Var = new l66(context3, ylbVar3);
                            l66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
                            l66Var.setEllipsize(TextUtils.TruncateAt.END);
                            int i12 = cmb.Wc;
                            anb.X(l66Var, i12, ylbVar3);
                            anb.G(l66Var, i12, ylbVar3);
                            l66Var.setTextSize(1, 14.0f);
                            l66Var.setSingleLine(true);
                            l66Var.setDisablePaddingsOffsetY(true);
                            ed0 ed0Var = new ed0(24.0f, i5, l66Var);
                            String L04 = jb6.L0(z14 ? 2131744617 : 2131744614);
                            sn2 a = ixa.a(24, "fragment");
                            int L = gm.L(16.0f);
                            int L2 = gm.L(16.0f);
                            a.e = L;
                            a.f = L2;
                            ed0Var.b.g0(a);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) L04));
                            spannableStringBuilder2.setSpan(ed0Var, 0, 1, 33);
                            z6 = z14;
                            spannableStringBuilder2.setSpan(new nwa(my0VarArr, context3, z6), 3, spannableStringBuilder2.length(), 33);
                            l66Var.setText(spannableStringBuilder2);
                            mhbVar11.l(l66Var, jb6.L0(2131744622));
                            mhbVar5 = mhbVar11;
                        } else {
                            z6 = z14;
                            mhbVar11.d(jb6.L0(2131750453), jb6.L0(2131744620));
                            mhbVar5 = mhbVar11;
                        }
                    }
                } else if (starsTransaction2.stargift_upgrade) {
                    if ((starsTransaction2.flags & 256) == 0 || starsTransaction2.msg_id <= 0) {
                        starsTransaction3 = starsTransaction2;
                        viewGroup3 = linearLayout;
                    } else {
                        x51 x51Var = (x51) ((jhb) mhbVar10.d(jb6.L0(2131744909), jb6.L0(2131744916)).getChildAt(1)).getChildAt(0);
                        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                        tL_inputSavedStarGiftUser.msg_id = starsTransaction2.msg_id;
                        viewGroup3 = linearLayout;
                        Context context5 = context2;
                        starsTransaction3 = starsTransaction;
                        jva.t(i).J(tL_inputSavedStarGiftUser, new rp2((Object) x51Var, i, (Object) context5, (Object) ylbVar2, (byte) 6));
                    }
                    TL_stars.StarsTransactionPeer starsTransactionPeer3 = starsTransaction3.peer;
                    if (starsTransactionPeer3 instanceof TL_stars.TL_starsTransactionPeer) {
                        long n3 = pg3.n(((TL_stars.TL_starsTransactionPeer) starsTransactionPeer3).peer);
                        mhbVar10.n(jb6.L0(2131744899), i, n3, new rva(my0VarArr, n3, (byte) 5));
                        ylbVar3 = ylbVar;
                        mhbVar9 = mhbVar10;
                        i5 = i;
                        context3 = context;
                        z6 = z5;
                    } else {
                        i5 = i;
                        ylbVar3 = ylbVar;
                        mhbVar9 = mhbVar10;
                        z6 = z5;
                        context3 = context;
                    }
                    viewGroup = viewGroup3;
                    mhbVar5 = mhbVar9;
                } else {
                    final Context context6 = context2;
                    starsTransaction3 = starsTransaction2;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        String str2 = starGift.slug;
                        if (TextUtils.isEmpty(str2)) {
                            i8 = 2131750126;
                        } else {
                            String L05 = jb6.L0(2131750125);
                            StringBuilder sb = new StringBuilder();
                            i8 = 2131750126;
                            sb.append(starsTransaction3.stargift.title);
                            sb.append(" #");
                            sb.append(starsTransaction3.stargift.num);
                            mhbVar10.i(L05, sb.toString(), new v99((Object) context6, i, (Object) str2, (byte) 14));
                        }
                        final long e = z8c.h(i).e();
                        long n4 = pg3.n(((TL_stars.TL_starsTransactionPeer) starsTransaction3.peer).peer);
                        if (!starsTransaction3.offer) {
                            if (starsTransaction3.stargift_resale) {
                                if (negative) {
                                    mhbVar10.d(jb6.L0(starsTransaction3.refund ? 2131744911 : 2131744913), jb6.L0(2131744916));
                                } else {
                                    mhbVar10.d(jb6.L0(starsTransaction3.refund ? 2131744913 : 2131744911), jb6.L0(2131744916));
                                    j4 = e;
                                }
                            } else if (starsTransaction3.stargift_drop_original_details) {
                                mhbVar10.d(jb6.L0(2131744912), jb6.L0(2131744916));
                                j4 = e;
                                n4 = j4;
                            } else {
                                mhbVar10.d(jb6.L0(2131744910), jb6.L0(2131744916));
                            }
                            j4 = n4;
                            n4 = e;
                        } else if (negative) {
                            mhbVar10.d(jb6.L0(starsTransaction3.refund ? 2131744911 : 2131744915), jb6.L0(2131744916));
                            j4 = n4;
                            n4 = e;
                        } else {
                            mhbVar10.d(jb6.L0(starsTransaction3.refund ? 2131744914 : 2131744911), jb6.L0(2131744916));
                            j4 = e;
                        }
                        int i13 = (n4 > e ? 1 : (n4 == e ? 0 : -1));
                        if (i13 != 0) {
                            my0VarArr2 = my0VarArr;
                            final byte b8 = 0;
                            ylbVar3 = ylbVar;
                            mhbVar8 = mhbVar10;
                            i9 = i13;
                            z8 = z5;
                            viewGroup = linearLayout;
                            final long j6 = n4;
                            j5 = e;
                            mhbVar8.n(jb6.L0(i8), i, j6, new Runnable() { // from class: xva
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b9 = b8;
                                    long j7 = e;
                                    long j8 = j6;
                                    my0[] my0VarArr7 = my0VarArr2;
                                    switch (b9) {
                                        case 0:
                                            my0VarArr7[0].dismiss();
                                            d S2 = LaunchActivity.S();
                                            if (S2 != null) {
                                                Bundle k = kt6.k(j8, "user_id");
                                                if (j8 == j7) {
                                                    k.putBoolean("my_profile", true);
                                                }
                                                k.putBoolean("open_gifts", true);
                                                S2.presentFragment(new ProfileActivity(k, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            my0VarArr7[0].dismiss();
                                            d S3 = LaunchActivity.S();
                                            if (S3 != null) {
                                                Bundle k2 = kt6.k(j8, "user_id");
                                                if (j8 == j7) {
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
                            ylbVar3 = ylbVar;
                            mhbVar8 = mhbVar10;
                            my0VarArr2 = my0VarArr;
                            i9 = i13;
                            z8 = z5;
                            j5 = e;
                            viewGroup = linearLayout;
                        }
                        if (j4 != j5) {
                            final long j7 = j5;
                            final byte b9 = 1;
                            final long j8 = j4;
                            final my0[] my0VarArr7 = my0VarArr2;
                            mhbVar8.n(jb6.L0(2131749869), i, j8, new Runnable() { // from class: xva
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b92 = b9;
                                    long j72 = j7;
                                    long j82 = j8;
                                    my0[] my0VarArr72 = my0VarArr7;
                                    switch (b92) {
                                        case 0:
                                            my0VarArr72[0].dismiss();
                                            d S2 = LaunchActivity.S();
                                            if (S2 != null) {
                                                Bundle k = kt6.k(j82, "user_id");
                                                if (j82 == j72) {
                                                    k.putBoolean("my_profile", true);
                                                }
                                                k.putBoolean("open_gifts", true);
                                                S2.presentFragment(new ProfileActivity(k, null));
                                                break;
                                            }
                                            break;
                                        default:
                                            my0VarArr72[0].dismiss();
                                            d S3 = LaunchActivity.S();
                                            if (S3 != null) {
                                                Bundle k2 = kt6.k(j82, "user_id");
                                                if (j82 == j72) {
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
                        mhb mhbVar12 = mhbVar8;
                        if ((i9 == 0 || starsTransaction3.stargift_resale) && (starsAmount = starsTransaction3.starref_amount) != null && starsTransaction3.starref_commission_permille > 0) {
                            TL_stars.StarsAmount starsAmount4 = starsTransaction3.amount;
                            if ((starsAmount4 instanceof TL_stars.TL_starsTonAmount) && (starsAmount instanceof TL_stars.TL_starsTonAmount)) {
                                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                                tL_starsTonAmount.amount = starsTransaction3.amount.amount + starsTransaction3.starref_amount.amount;
                                pn2[] pn2VarArr = new pn2[1];
                                mhbVar12.d(a1(starsTransaction3.amount, "⭐️ " + ((Object) G0(tL_starsTonAmount)), pn2VarArr), jb6.L0(2131744639));
                                pn2 pn2Var = pn2VarArr[0];
                                if (pn2Var != null) {
                                    pn2Var.y = cmb.v0(cmb.Ei, ylbVar3);
                                }
                            } else {
                                mhbVar12.d(b1(starsTransaction3.amount instanceof TL_stars.TL_starsTonAmount, "⭐️ ".concat(jb6.E(Math.abs(Math.round(starsTransaction3.starref_amount.toDouble() + starsAmount4.toDouble())), ',')), 0.8f, null), jb6.L0(2131744639));
                            }
                        }
                        i5 = i;
                        mhbVar6 = mhbVar12;
                        context3 = context6;
                    } else {
                        ylbVar3 = ylbVar;
                        my0VarArr2 = my0VarArr;
                        z8 = z5;
                        viewGroup = linearLayout;
                        if (starsTransaction3.refund) {
                            context3 = context;
                            i5 = i;
                            starsTransaction3 = starsTransaction;
                            mhbVar6 = mhbVar10;
                        } else {
                            long e2 = j == 0 ? z8c.h(i).e() : j;
                            final long n5 = pg3.n(starsTransaction3.peer.peer);
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(n5));
                            if (positive) {
                                if (n5 != e2) {
                                    String L06 = jb6.L0(2131744897);
                                    Runnable qvaVar = new qva(my0VarArr2, starsTransaction3, n5, (byte) 4);
                                    String L07 = (W1 == null || m9c.z(W1) || m9c.b(n5)) ? null : jb6.L0(2131750217);
                                    final byte b10 = 0;
                                    i7 = i;
                                    Runnable runnable2 = new Runnable() { // from class: ova
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b11 = b10;
                                            my0[] my0VarArr8 = my0VarArr2;
                                            switch (b11) {
                                                case 0:
                                                    my0 my0Var3 = my0VarArr8[0];
                                                    Objects.requireNonNull(my0Var3);
                                                    new ux4(context6, i7, n5, null, new eg9(my0Var3, (byte) 11)).show();
                                                    break;
                                                default:
                                                    my0 my0Var4 = my0VarArr8[0];
                                                    Objects.requireNonNull(my0Var4);
                                                    new ux4(context6, i7, n5, null, new eg9(my0Var4, (byte) 11)).show();
                                                    break;
                                            }
                                        }
                                    };
                                    mhbVar7 = mhbVar10;
                                    my0VarArr4 = my0VarArr2;
                                    mhbVar7.m(L06, i7, n5, qvaVar, L07, runnable2);
                                } else {
                                    i7 = i;
                                    mhbVar7 = mhbVar10;
                                    my0VarArr4 = my0VarArr2;
                                }
                                final byte b11 = 0;
                                mhbVar7.n(jb6.L0(2131744896), i7, e2, new Runnable() { // from class: pva
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b11;
                                        int i122 = i7;
                                        my0[] my0VarArr72 = my0VarArr4;
                                        switch (b52) {
                                            case 0:
                                                my0VarArr72[0].dismiss();
                                                d S2 = LaunchActivity.S();
                                                if (S2 != null) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putLong("user_id", z8c.h(i122).e());
                                                    bundle.putBoolean("my_profile", true);
                                                    bundle.putBoolean("open_gifts", true);
                                                    S2.presentFragment(new ProfileActivity(bundle, null));
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                my0VarArr72[0].dismiss();
                                                d S3 = LaunchActivity.S();
                                                if (S3 != null) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putLong("user_id", z8c.h(i122).e());
                                                    bundle2.putBoolean("my_profile", true);
                                                    bundle2.putBoolean("open_gifts", true);
                                                    S3.presentFragment(new ProfileActivity(bundle2, null));
                                                    break;
                                                }
                                                break;
                                            default:
                                                my0VarArr72[0].dismiss();
                                                d S4 = LaunchActivity.S();
                                                if (S4 != null) {
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putLong("user_id", z8c.h(i122).e());
                                                    bundle3.putBoolean("my_profile", true);
                                                    S4.presentFragment(new ProfileActivity(bundle3, null));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                my0VarArr3 = my0VarArr4;
                            } else {
                                long j9 = e2;
                                if (n5 != j9) {
                                    final byte b12 = 1;
                                    mhbVar10.n(jb6.L0(2131744897), i, j9, new Runnable() { // from class: pva
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b52 = b12;
                                            int i122 = i;
                                            my0[] my0VarArr72 = my0VarArr2;
                                            switch (b52) {
                                                case 0:
                                                    my0VarArr72[0].dismiss();
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        Bundle bundle = new Bundle();
                                                        bundle.putLong("user_id", z8c.h(i122).e());
                                                        bundle.putBoolean("my_profile", true);
                                                        bundle.putBoolean("open_gifts", true);
                                                        S2.presentFragment(new ProfileActivity(bundle, null));
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    my0VarArr72[0].dismiss();
                                                    d S3 = LaunchActivity.S();
                                                    if (S3 != null) {
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putLong("user_id", z8c.h(i122).e());
                                                        bundle2.putBoolean("my_profile", true);
                                                        bundle2.putBoolean("open_gifts", true);
                                                        S3.presentFragment(new ProfileActivity(bundle2, null));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    my0VarArr72[0].dismiss();
                                                    d S4 = LaunchActivity.S();
                                                    if (S4 != null) {
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putLong("user_id", z8c.h(i122).e());
                                                        bundle3.putBoolean("my_profile", true);
                                                        S4.presentFragment(new ProfileActivity(bundle3, null));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                String L08 = jb6.L0(2131744896);
                                Runnable qvaVar2 = new qva(my0VarArr2, starsTransaction, n5, (byte) 0);
                                String L09 = (W1 == null || m9c.z(W1) || m9c.b(n5)) ? null : jb6.L0(2131750217);
                                final byte b13 = 1;
                                Runnable runnable3 = new Runnable() { // from class: ova
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b112 = b13;
                                        my0[] my0VarArr8 = my0VarArr2;
                                        switch (b112) {
                                            case 0:
                                                my0 my0Var3 = my0VarArr8[0];
                                                Objects.requireNonNull(my0Var3);
                                                new ux4(context, i, n5, null, new eg9(my0Var3, (byte) 11)).show();
                                                break;
                                            default:
                                                my0 my0Var4 = my0VarArr8[0];
                                                Objects.requireNonNull(my0Var4);
                                                new ux4(context, i, n5, null, new eg9(my0Var4, (byte) 11)).show();
                                                break;
                                        }
                                    }
                                };
                                mhbVar7 = mhbVar10;
                                my0VarArr3 = my0VarArr2;
                                mhbVar7.m(L08, i, n5, qvaVar2, L09, runnable3);
                            }
                            context3 = context;
                            mhbVar5 = mhbVar7;
                            my0VarArr = my0VarArr3;
                            z6 = z8;
                            i5 = i;
                            starsTransaction3 = starsTransaction;
                        }
                    }
                    z6 = z8;
                    my0VarArr = my0VarArr2;
                    mhbVar5 = mhbVar6;
                }
                starsTransactionPeer = starsTransaction3.peer;
                if ((starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) && (starsTransaction3.flags & 256) != 0) {
                    long n6 = pg3.n(starsTransactionPeer.peer);
                    if (z) {
                        n6 = j;
                    }
                    L02 = oc7.r1(i5).L0(Long.valueOf(-n6));
                    if (L02 != null) {
                        l66 l66Var2 = new l66(context3, ylbVar3);
                        z7 = z6;
                        l66Var2.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
                        l66Var2.setEllipsize(TextUtils.TruncateAt.END);
                        int i14 = cmb.Wc;
                        anb.X(l66Var2, i14, ylbVar3);
                        anb.G(l66Var2, i14, ylbVar3);
                        l66Var2.setTextSize(1, 14.0f);
                        l66Var2.setDisablePaddingsOffsetY(true);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        if (!starsTransaction3.extended_media.isEmpty()) {
                            ArrayList<TLRPC.MessageMedia> arrayList = starsTransaction3.extended_media;
                            int size = arrayList.size();
                            int i15 = 0;
                            int i16 = 0;
                            while (i16 < size) {
                                TLRPC.MessageMedia messageMedia = arrayList.get(i16);
                                int i17 = i16 + 1;
                                ArrayList<TLRPC.MessageMedia> arrayList2 = arrayList;
                                TLRPC.MessageMedia messageMedia2 = messageMedia;
                                int i18 = size;
                                on5 on5Var = new on5(24.0f, i5, l66Var2);
                                if (!(messageMedia2 instanceof TLRPC.TL_messageMediaPhoto)) {
                                    viewGroup2 = viewGroup;
                                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                                        gn5Var2 = null;
                                        if (gn5Var2 == null) {
                                            on5Var.a(6.0f);
                                            on5Var.b.d0(gn5Var2, "24_24", null, null, null, 0);
                                            SpannableString spannableString = new SpannableString("x");
                                            spannableString.setSpan(on5Var, 0, spannableString.length(), 33);
                                            spannableStringBuilder3.append((CharSequence) spannableString);
                                            spannableStringBuilder3.append((CharSequence) " ");
                                            i6 = i15 + 1;
                                        } else {
                                            i6 = i15;
                                        }
                                        if (i6 < 3) {
                                            break;
                                        }
                                        size = i18;
                                        i16 = i17;
                                        i15 = i6;
                                        viewGroup = viewGroup2;
                                        arrayList = arrayList2;
                                    } else {
                                        c2 = gn5.c(bc4.v(gm.L(24.0f), messageMedia2.document.thumbs, true), messageMedia2.document);
                                    }
                                } else {
                                    viewGroup2 = viewGroup;
                                    c2 = gn5.i(bc4.v(gm.L(24.0f), messageMedia2.photo.sizes, true), messageMedia2.photo);
                                }
                                gn5Var2 = c2;
                                if (gn5Var2 == null) {
                                }
                                if (i6 < 3) {
                                }
                            }
                        }
                        viewGroup2 = viewGroup;
                        spannableStringBuilder3.append((CharSequence) " ");
                        int length = spannableStringBuilder3.length();
                        String K = sd2.K(L02, false);
                        if (TextUtils.isEmpty(K)) {
                            spannableStringBuilder3.append((CharSequence) L02.title);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            kt6.v(sb2, oc7.r1(i5).N2, "/", K, "/");
                            sb2.append(starsTransaction3.msg_id);
                            spannableStringBuilder3.append((CharSequence) sb2.toString());
                        }
                        qva qvaVar3 = new qva(my0VarArr, n6, starsTransaction3);
                        spannableStringBuilder3.setSpan(new owa(qvaVar3), length, spannableStringBuilder3.length(), 33);
                        l66Var2.setSingleLine(true);
                        l66Var2.setEllipsize(TextUtils.TruncateAt.END);
                        l66Var2.setText(spannableStringBuilder3);
                        l66Var2.setOnClickListener(new oha(qvaVar3, (byte) 8));
                        mhbVar5.l(l66Var2, jb6.L0(starsTransaction3.reaction ? 2131744631 : 2131744632));
                        if (!TextUtils.isEmpty(starsTransaction3.id) && !z13) {
                            String L010 = jb6.L0(2131744637);
                            String str3 = starsTransaction3.id;
                            mhbVar5.k(L010, str3, str3.length() <= 25 ? 9 : 10, new uva(my0VarArr, ylbVar3, (byte) 0));
                        }
                        if (starsTransaction3.floodskip && starsTransaction3.floodskip_number > 0) {
                            mhbVar5.d(jb6.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), jb6.L0(2131744643));
                        }
                        mhbVar5.d(jb6.Z(2131742446, jb6.D0().r0().format(new Date(starsTransaction3.date * 1000)), jb6.D0().o0().format(new Date(starsTransaction3.date * 1000))), jb6.L0(2131744649));
                        starGift2 = starsTransaction3.stargift;
                        if (starGift2 != null) {
                            if (starGift2.limited) {
                                C0(mhbVar5, i5, starGift2, ylbVar3);
                            }
                            if (!TextUtils.isEmpty(starsTransaction3.description)) {
                                mhbVar5.a(new SpannableStringBuilder(starsTransaction3.description));
                            }
                        }
                        ViewGroup viewGroup4 = viewGroup2;
                        viewGroup4.addView(mhbVar5, qoe.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                        if ((starsTransaction3.flags & 32) != 0) {
                            mhbVar5.d(jb6.Z(2131742446, jb6.D0().r0().format(new Date(starsTransaction3.transaction_date * 1000)), jb6.D0().o0().format(new Date(starsTransaction3.transaction_date * 1000))), jb6.L0(2131744618));
                        }
                        if (z7) {
                            context4 = context;
                            l66 l66Var3 = new l66(context4, ylbVar3);
                            anb.X(l66Var3, cmb.y6, ylbVar3);
                            anb.G(l66Var3, cmb.Wc, ylbVar3);
                            l66Var3.setTextSize(1, 14.0f);
                            l66Var3.setText(gm.P2(jb6.L0(2131744615), new dh1(context4, (byte) 16)));
                            l66Var3.setGravity(17);
                            viewGroup4.addView(l66Var3, qoe.k(16.0f, 15.0f, 16.0f, 0.0f, -1, -2));
                        } else {
                            context4 = context;
                        }
                        b61 b61Var = new b61(context4, ylbVar3);
                        b61Var.f();
                        if ((starsTransaction3.flags & 32) == 0) {
                            r13 = 0;
                            b61Var.h(jb6.L0(2131744611), false);
                        } else {
                            r13 = 0;
                            b61Var.h(jb6.L0(2131747564), false);
                        }
                        viewGroup4.addView(b61Var, qoe.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                        my0 my0Var3 = my0Var;
                        my0Var3.O = viewGroup4;
                        my0VarArr[r13] = my0Var3;
                        my0Var3.T0 = r13;
                        if ((starsTransaction3.flags & 32) == 0) {
                            b61Var.setOnClickListener(new r39(context4, starsTransaction3, (byte) 18));
                        } else {
                            b61Var.setOnClickListener(new f5(my0VarArr, (byte) 4));
                        }
                        my0VarArr[0].J();
                        S = LaunchActivity.S();
                        if (!gm.O1() && !gm.s1(S)) {
                            my0VarArr[0].X(S);
                        }
                        my0VarArr[0].show();
                        return my0VarArr[0];
                    }
                }
                z7 = z6;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                    String L0102 = jb6.L0(2131744637);
                    String str32 = starsTransaction3.id;
                    mhbVar5.k(L0102, str32, str32.length() <= 25 ? 9 : 10, new uva(my0VarArr, ylbVar3, (byte) 0));
                }
                if (starsTransaction3.floodskip) {
                    mhbVar5.d(jb6.I(starsTransaction3.floodskip_number, "StarsTransactionFloodskipNumber"), jb6.L0(2131744643));
                }
                mhbVar5.d(jb6.Z(2131742446, jb6.D0().r0().format(new Date(starsTransaction3.date * 1000)), jb6.D0().o0().format(new Date(starsTransaction3.date * 1000))), jb6.L0(2131744649));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup42 = viewGroup2;
                viewGroup42.addView(mhbVar5, qoe.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z7) {
                }
                b61 b61Var2 = new b61(context4, ylbVar3);
                b61Var2.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup42.addView(b61Var2, qoe.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                my0 my0Var32 = my0Var;
                my0Var32.O = viewGroup42;
                my0VarArr[r13] = my0Var32;
                my0Var32.T0 = r13;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                my0VarArr[0].J();
                S = LaunchActivity.S();
                if (!gm.O1()) {
                    my0VarArr[0].X(S);
                }
                my0VarArr[0].show();
                return my0VarArr[0];
            }
        }
        my0Var = my0Var2;
        z2 = z11;
        final bf0 bf0Var2 = new bf0(context);
        if (starsTransaction.premium_gift) {
            g1(bf0Var2, bf0Var2.getImageReceiver(), starsTransaction.premium_gift_months);
            i11.addView(bf0Var2, qoe.t(nm7.p2, nm7.p2, 17, 0, -8, 0, 10));
        } else if (starsTransaction.posts_search) {
            sn2 a2 = q7a.a(100, "search");
            int L3 = gm.L(40.0f);
            int L4 = gm.L(40.0f);
            a2.e = L3;
            a2.f = L4;
            bf0Var2.setImageDrawable(a2);
        } else {
            TL_stars.StarGift starGift4 = starsTransaction.stargift;
            if (starGift4 == null) {
                if (z13 || starsTransaction.gift) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    linearLayout = i11;
                    str = "";
                    z3 = z12;
                    z4 = z;
                    j2 = j;
                    ylbVar2 = ylbVar;
                    z5 = z9;
                    if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
                        h1(bf0Var2, bf0Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    } else {
                        d1(bf0Var2, bf0Var2.getImageReceiver(), starsTransaction2.amount.amount);
                    }
                    linearLayout.addView(bf0Var2, qoe.t(nm7.p2, nm7.p2, 17, 0, -8, 0, 10));
                } else if (starsTransaction.extended_media.isEmpty()) {
                    context2 = context;
                    i2 = i;
                    starsTransaction2 = starsTransaction;
                    linearLayout = i11;
                    z4 = z;
                    j2 = j;
                    ylbVar2 = ylbVar;
                    TL_stars.StarsTransactionPeer starsTransactionPeer4 = starsTransaction2.peer;
                    if (starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeer) {
                        if (starsTransaction2.photo != null) {
                            bf0Var2.setRoundRadius(gm.L(50.0f));
                            z3 = z12;
                            bf0Var2.p(gn5.p(vuc.c(starsTransaction2.photo)), "100_100", null, null);
                            z5 = z9;
                            str = "";
                        } else {
                            z3 = z12;
                            bf0Var2.setRoundRadius(gm.L(50.0f));
                            if (z3) {
                                peer = starsTransaction2.starref_peer;
                            } else if (starsTransaction2.subscription && z4) {
                                z5 = z9;
                                str = "";
                                j3 = j2;
                                pc0 pc0Var = new pc0();
                                if (j3 < 0) {
                                    TLRPC.User W12 = oc7.r1(i2).W1(Long.valueOf(j3));
                                    pc0Var.n(W12);
                                    bf0Var2.f(W12, pc0Var);
                                } else {
                                    TLRPC.Chat L011 = oc7.r1(i2).L0(Long.valueOf(-j3));
                                    pc0Var.l(L011);
                                    bf0Var2.f(L011, pc0Var);
                                }
                            } else {
                                peer = starsTransaction2.peer.peer;
                            }
                            z5 = z9;
                            str = "";
                            j3 = pg3.n(peer);
                            pc0 pc0Var2 = new pc0();
                            if (j3 < 0) {
                            }
                        }
                        linearLayout.addView(bf0Var2, qoe.t(100, 100, 17, 0, 0, 0, 10));
                    } else {
                        str = "";
                        z3 = z12;
                        z5 = z9;
                        sn2 a3 = q7a.a(100, starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAppStore ? "ios" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPlayMarket ? "android" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerPremiumBot ? "premiumbot" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerFragment ? "fragment" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAds ? "ads" : starsTransactionPeer4 instanceof TL_stars.TL_starsTransactionPeerAPI ? "api" : "?");
                        int L5 = gm.L(40.0f);
                        int L6 = gm.L(40.0f);
                        a3.e = L5;
                        a3.f = L6;
                        bf0Var2.setImageDrawable(a3);
                    }
                } else {
                    bf0Var2.setRoundRadius(gm.L(30.0f));
                    TLRPC.MessageMedia messageMedia3 = starsTransaction.extended_media.get(0);
                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                        c = gn5.i(bc4.v(gm.L(100.0f), messageMedia3.photo.sizes, true), messageMedia3.photo);
                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                        c = gn5.c(bc4.v(gm.L(100.0f), messageMedia3.document.thumbs, true), messageMedia3.document);
                    } else {
                        gn5Var = null;
                        bf0Var2.j(gn5Var, "100_100", null, null, null, 0);
                        i11.addView(bf0Var2, qoe.t(100, 100, 17, 0, 0, 0, 10));
                        context2 = context;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sva
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                boolean z15 = z;
                                TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                                long n7 = z15 ? j : pg3.n(starsTransaction5.peer.peer);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i19 = 0; i19 < starsTransaction5.extended_media.size(); i19++) {
                                    TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i19);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = starsTransaction5.msg_id;
                                    tL_message.dialog_id = n7;
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_message.from_id = tL_peerChannel;
                                    long j10 = -n7;
                                    tL_peerChannel.channel_id = j10;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_message.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = j10;
                                    tL_message.date = starsTransaction5.date;
                                    tL_message.flags |= 512;
                                    tL_message.media = messageMedia4;
                                    tL_message.noforwards = true;
                                    arrayList3.add(new k47(i, tL_message, false, false));
                                }
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                PhotoViewer.r0().T1(null, LaunchActivity.Q(), ylbVar);
                                PhotoViewer.r0().n1(arrayList3, 0, n7, 0L, 0L, new mwa(bf0Var2, i11, n7));
                            }
                        };
                        starsTransaction2 = starsTransaction;
                        z4 = z;
                        ylbVar2 = ylbVar;
                        i2 = i;
                        linearLayout = i11;
                        j2 = j;
                        bf0Var2.setOnClickListener(onClickListener);
                        str = "";
                        z3 = z12;
                        z5 = z9;
                    }
                    gn5Var = c;
                    bf0Var2.j(gn5Var, "100_100", null, null, null, 0);
                    i11.addView(bf0Var2, qoe.t(100, 100, 17, 0, 0, 0, 10));
                    context2 = context;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: sva
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean z15 = z;
                            TL_stars.StarsTransaction starsTransaction5 = starsTransaction;
                            long n7 = z15 ? j : pg3.n(starsTransaction5.peer.peer);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i19 = 0; i19 < starsTransaction5.extended_media.size(); i19++) {
                                TLRPC.MessageMedia messageMedia4 = starsTransaction5.extended_media.get(i19);
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.id = starsTransaction5.msg_id;
                                tL_message.dialog_id = n7;
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_message.from_id = tL_peerChannel;
                                long j10 = -n7;
                                tL_peerChannel.channel_id = j10;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_message.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = j10;
                                tL_message.date = starsTransaction5.date;
                                tL_message.flags |= 512;
                                tL_message.media = messageMedia4;
                                tL_message.noforwards = true;
                                arrayList3.add(new k47(i, tL_message, false, false));
                            }
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            PhotoViewer.r0().T1(null, LaunchActivity.Q(), ylbVar);
                            PhotoViewer.r0().n1(arrayList3, 0, n7, 0L, 0L, new mwa(bf0Var2, i11, n7));
                        }
                    };
                    starsTransaction2 = starsTransaction;
                    z4 = z;
                    ylbVar2 = ylbVar;
                    i2 = i;
                    linearLayout = i11;
                    j2 = j;
                    bf0Var2.setOnClickListener(onClickListener2);
                    str = "";
                    z3 = z12;
                    z5 = z9;
                }
                TextView textView = new TextView(context2);
                i3 = cmb.i5;
                td4.x(textView, i3, ylbVar2, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(L0(i2, z4, starsTransaction2));
                TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 17, 36, 0, 36, 4), context2);
                m.setTextSize(1, 18.0f);
                m.setTypeface(gm.o());
                m.setGravity(17);
                anb.X(m, !positive ? cmb.kk : cmb.mk, ylbVar2);
                TL_stars.StarsAmount starsAmount5 = starsTransaction2.amount;
                m.setText(b1(starsAmount5 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, G0(starsAmount5), " ⭐️"), 0.8f, null));
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m.getText());
                if (!starsTransaction2.refund) {
                    D0(spannableStringBuilder4, m, jb6.L0(2131744719));
                } else if (starsTransaction2.failed) {
                    anb.X(m, cmb.mk, ylbVar2);
                    D0(spannableStringBuilder4, m, jb6.L0(2131744799));
                } else if (starsTransaction2.pending) {
                    anb.X(m, cmb.ok, ylbVar2);
                    D0(spannableStringBuilder4, m, jb6.L0(2131744742));
                }
                m.setText(spannableStringBuilder4);
                linearLayout.addView(m, qoe.t(-1, -2, 17, 36, 0, 36, 4));
                if (!starsTransaction2.paid_message && starsTransaction2.starref_commission_permille > 0 && positive) {
                    l66 l66Var4 = new l66(context2);
                    anb.X(l66Var4, i3, ylbVar2);
                    l66Var4.setTextSize(1, 14.0f);
                    l66Var4.setGravity(17);
                    anb.G(l66Var4, cmb.Wc, ylbVar2);
                    l66Var4.setDisablePaddingsOffsetY(true);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    spannableStringBuilder5.append((CharSequence) gm.S2(jb6.Z(2131744629, bc.J0(1000 - starsTransaction2.starref_commission_permille))));
                    if (j2 == z8c.h(i2).e() || sd2.w(2, oc7.r1(i2).L0(Long.valueOf(-j2)))) {
                        spannableStringBuilder5.append((CharSequence) " ");
                        spannableStringBuilder5.append((CharSequence) gm.D2(gm.P2(jb6.L0(2131744628).replace(' ', (char) 160), new an0(j2, i2, (byte) 3)), true));
                    }
                    l66Var4.setText(spannableStringBuilder5);
                    linearLayout.addView(l66Var4, qoe.t(-1, -2, 17, 36, 0, 36, 4));
                    my0VarArr = my0VarArr5;
                } else if ((starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) && (z13 || starsTransaction2.gift)) {
                    TLRPC.User W13 = starsTransaction2.sent_by == null ? null : oc7.r1(i2).W1(Long.valueOf(pg3.n(starsTransaction2.sent_by)));
                    TLRPC.User W14 = starsTransaction2.sent_by == null ? null : oc7.r1(i2).W1(Long.valueOf(pg3.n(starsTransaction2.received_by)));
                    boolean D = m9c.D(W13);
                    if (D) {
                        anb.X(m, cmb.F6, ylbVar2);
                        TL_stars.StarsAmount starsAmount6 = starsTransaction2.amount;
                        i4 = 1;
                        m.setText(b1(starsAmount6 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(G0(starsAmount6), " ⭐️"), 0.8f, null));
                    } else {
                        i4 = 1;
                    }
                    l66 l66Var5 = new l66(context2);
                    anb.X(l66Var5, i3, ylbVar2);
                    l66Var5.setTextSize(i4, 16.0f);
                    l66Var5.setGravity(17);
                    anb.G(l66Var5, cmb.Wc, ylbVar2);
                    l66Var5.setDisablePaddingsOffsetY(i4);
                    if (D) {
                        Object[] objArr = new Object[i4];
                        objArr[0] = m9c.l(W14);
                        L0 = jb6.Z(2131754628, objArr);
                    } else {
                        L0 = jb6.L0(2131754627);
                    }
                    my0VarArr = my0VarArr5;
                    l66Var5.setText(TextUtils.concat(gm.S2(L0), " ", gm.D2(gm.P2(jb6.L0(2131749382).replace(' ', (char) 160), new wva(context2, my0VarArr)), true)));
                    linearLayout.addView(l66Var5, qoe.t(-1, -2, 17, 36, 0, 36, 4));
                } else {
                    my0VarArr = my0VarArr5;
                    if (starsTransaction2.description != null && starsTransaction2.extended_media.isEmpty()) {
                        TextView textView2 = new TextView(context2);
                        anb.X(textView2, i3, ylbVar2);
                        textView2.setTextSize(1, 16.0f);
                        textView2.setGravity(17);
                        textView2.setText(starsTransaction2.description);
                        linearLayout.addView(textView2, qoe.t(-1, -2, 17, 36, 0, 36, 4));
                    }
                }
                mhb mhbVar102 = new mhb(context2, ylbVar2);
                starGift = starsTransaction2.stargift;
                if (starGift == null) {
                }
                starsTransactionPeer = starsTransaction3.peer;
                if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeer) {
                    long n62 = pg3.n(starsTransactionPeer.peer);
                    if (z) {
                    }
                    L02 = oc7.r1(i5).L0(Long.valueOf(-n62));
                    if (L02 != null) {
                    }
                }
                z7 = z6;
                viewGroup2 = viewGroup;
                if (!TextUtils.isEmpty(starsTransaction3.id)) {
                }
                if (starsTransaction3.floodskip) {
                }
                mhbVar5.d(jb6.Z(2131742446, jb6.D0().r0().format(new Date(starsTransaction3.date * 1000)), jb6.D0().o0().format(new Date(starsTransaction3.date * 1000))), jb6.L0(2131744649));
                starGift2 = starsTransaction3.stargift;
                if (starGift2 != null) {
                }
                ViewGroup viewGroup422 = viewGroup2;
                viewGroup422.addView(mhbVar5, qoe.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
                if ((starsTransaction3.flags & 32) != 0) {
                }
                if (z7) {
                }
                b61 b61Var22 = new b61(context4, ylbVar3);
                b61Var22.f();
                if ((starsTransaction3.flags & 32) == 0) {
                }
                viewGroup422.addView(b61Var22, qoe.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
                my0 my0Var322 = my0Var;
                my0Var322.O = viewGroup422;
                my0VarArr[r13] = my0Var322;
                my0Var322.T0 = r13;
                if ((starsTransaction3.flags & 32) == 0) {
                }
                my0VarArr[0].J();
                S = LaunchActivity.S();
                if (!gm.O1()) {
                }
                my0VarArr[0].show();
                return my0VarArr[0];
            }
            if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
                bf0Var2.setImageDrawable(new jsa(bf0Var2, starsTransaction.stargift, 94, 0.44f));
                i11.addView(bf0Var2, qoe.t(94, 94, 17, 0, 2, 0, 10));
            } else {
                f1(bf0Var2.getImageReceiver(), starsTransaction.stargift, nm7.p2);
                i11.addView(bf0Var2, qoe.t(nm7.p2, nm7.p2, 17, 0, -8, 0, 10));
            }
        }
        ylbVar2 = ylbVar;
        context2 = context;
        i2 = i;
        starsTransaction2 = starsTransaction;
        linearLayout = i11;
        str = "";
        z3 = z12;
        z4 = z;
        j2 = j;
        z5 = z9;
        TextView textView3 = new TextView(context2);
        i3 = cmb.i5;
        td4.x(textView3, i3, ylbVar2, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setText(L0(i2, z4, starsTransaction2));
        TextView m2 = wi8.m(linearLayout, textView3, qoe.t(-1, -2, 17, 36, 0, 36, 4), context2);
        m2.setTextSize(1, 18.0f);
        m2.setTypeface(gm.o());
        m2.setGravity(17);
        anb.X(m2, !positive ? cmb.kk : cmb.mk, ylbVar2);
        TL_stars.StarsAmount starsAmount52 = starsTransaction2.amount;
        m2.setText(b1(starsAmount52 instanceof TL_stars.TL_starsTonAmount, TextUtils.concat(positive ? "+" : str, G0(starsAmount52), " ⭐️"), 0.8f, null));
        SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder(m2.getText());
        if (!starsTransaction2.refund) {
        }
        m2.setText(spannableStringBuilder42);
        linearLayout.addView(m2, qoe.t(-1, -2, 17, 36, 0, 36, 4));
        if (!starsTransaction2.paid_message) {
        }
        if (starsTransaction2.amount instanceof TL_stars.TL_starsTonAmount) {
        }
        my0VarArr = my0VarArr5;
        if (starsTransaction2.description != null) {
            TextView textView22 = new TextView(context2);
            anb.X(textView22, i3, ylbVar2);
            textView22.setTextSize(1, 16.0f);
            textView22.setGravity(17);
            textView22.setText(starsTransaction2.description);
            linearLayout.addView(textView22, qoe.t(-1, -2, 17, 36, 0, 36, 4));
        }
        mhb mhbVar1022 = new mhb(context2, ylbVar2);
        starGift = starsTransaction2.stargift;
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
        mhbVar5.d(jb6.Z(2131742446, jb6.D0().r0().format(new Date(starsTransaction3.date * 1000)), jb6.D0().o0().format(new Date(starsTransaction3.date * 1000))), jb6.L0(2131744649));
        starGift2 = starsTransaction3.stargift;
        if (starGift2 != null) {
        }
        ViewGroup viewGroup4222 = viewGroup2;
        viewGroup4222.addView(mhbVar5, qoe.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        if ((starsTransaction3.flags & 32) != 0) {
        }
        if (z7) {
        }
        b61 b61Var222 = new b61(context4, ylbVar3);
        b61Var222.f();
        if ((starsTransaction3.flags & 32) == 0) {
        }
        viewGroup4222.addView(b61Var222, qoe.k(16.0f, 15.0f, 16.0f, 0.0f, -1, 48));
        my0 my0Var3222 = my0Var;
        my0Var3222.O = viewGroup4222;
        my0VarArr[r13] = my0Var3222;
        my0Var3222.T0 = r13;
        if ((starsTransaction3.flags & 32) == 0) {
        }
        my0VarArr[0].J();
        S = LaunchActivity.S();
        if (!gm.O1()) {
        }
        my0VarArr[0].show();
        return my0VarArr[0];
    }

    public static void m1(Activity activity, int i, int i2, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, ylb ylbVar) {
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
        l1(activity, false, 0L, i, starsTransaction, ylbVar);
    }

    public static void n1(Context context, int i, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, ylb ylbVar) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = oc7.r1(i).x1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.id = tL_payments_paymentReceiptStars.transaction_id;
        l1(context, false, 0L, i, starsTransaction, ylbVar);
    }

    public static CharSequence t1(CharSequence charSequence, boolean z) {
        sbc c;
        if (z && (charSequence instanceof Spanned)) {
            for (pn2 pn2Var : (pn2[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), pn2.class)) {
                Drawable drawable = pn2Var.c;
                if (drawable != null && !(drawable instanceof sbc) && (c = sbc.c(a.b.getResources(), R.drawable.mini_gram_72_white, null)) != null) {
                    c.setBounds(pn2Var.c.getBounds());
                    pn2Var.c = c;
                    pn2Var.d = false;
                }
            }
        }
        return charSequence;
    }

    public final void E0() {
        r1();
        r59 r59Var = this.c;
        if (r59Var == null || this.V == null || r59Var.getLayoutParams() == null) {
            return;
        }
        int x = b10.x(48.0f, this.c0, -gm.L(8.0f));
        int x2 = b10.x(48.0f, this.d0, -gm.L(8.0f));
        gm.v3(this.c, 0, x, 0, x2);
        r59 r59Var2 = this.c;
        int i = -x;
        r59Var2.setPadding(r59Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - x2);
        this.V.A(i, -x2);
    }

    public final void F0(ArrayList arrayList, l7c l7cVar) {
        r59 r59Var;
        o1("FILL_BEFORE");
        fja fjaVar = this.V;
        boolean z = fjaVar != null && fjaVar.f0;
        this.b0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        jva v = jva.v(this.currentAccount, false);
        sb sbVar = (sb) super.o0(getParentActivity());
        c6c c6cVar = new c6c(-2);
        c6cVar.c = sbVar;
        arrayList.add(c6cVar);
        arrayList.add(c6c.k(this.j0));
        b61 b61Var = this.s0;
        if (b61Var != null) {
            b61Var.setVisibility(getMessagesController().l4.w2.f ? 0 : 8);
        }
        arrayList.add(c6c.C(null));
        if (getMessagesController().l4.C2.f) {
            arrayList.add(xb.i(-4, getThemedColor(cmb.kk), ba2.b0(jb6.M0(2131743453, null)), jb6.M0(2131743454, null)));
            arrayList.add(c6c.C(null));
        }
        if (v.e && !v.v.isEmpty()) {
            aq1.o(2131744892, null, arrayList);
            for (int i = 0; i < v.v.size(); i++) {
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) v.v.get(i);
                int i2 = fxa.b;
                c6c K = c6c.K(fxa.class);
                K.H = starsSubscription;
                arrayList.add(K);
            }
            if (v.x) {
                arrayList.add(c6c.q(arrayList.size(), 33));
            } else if (!v.y) {
                c6c c = c6c.c(-3, R.drawable.arrow_more, jb6.M0(2131744891, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c6c.C(null));
        }
        boolean K2 = v.K(0);
        this.t0 = K2;
        if (K2) {
            this.b0 = arrayList.size();
            arrayList.add(c6c.n(this.W, -2));
            if (z && (r59Var = this.c) != null) {
                r59Var.removeCallbacks(this.g0);
                this.c.post(this.g0);
            }
        } else {
            arrayList.add(c6c.m(this.h0));
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
        c6c G;
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
        final pwa pwaVar;
        final my0[] my0VarArr;
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
            jva.v(this.currentAccount, false).r();
            yw4.f1(true, ok0.a(this.currentAccount).b());
            return;
        }
        if (i6 == -3) {
            jva.v(this.currentAccount, false).U();
            this.v0.O(true);
            return;
        }
        if (i6 == -4) {
            if (oc7.r1(this.currentAccount).u2()) {
                h5.b(this.currentAccount);
                return;
            } else {
                presentFragment(new mh1(getUserConfig().e()));
                return;
            }
        }
        if (G.H(axa.class)) {
            if (G.H instanceof TL_stars.TL_starsTopupOption) {
                jva.v(this.currentAccount, false).d(getParentActivity(), (TL_stars.TL_starsTopupOption) G.H, new s87(this, G, (byte) 14), null);
                return;
            }
            return;
        }
        if (G.H(fxa.class) && (G.H instanceof TL_stars.StarsSubscription)) {
            Activity parentActivity = getParentActivity();
            int i7 = this.currentAccount;
            final TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) G.H;
            ylb resourceProvider = getResourceProvider();
            if (starsSubscription == null || parentActivity == null) {
                return;
            }
            my0 i8 = wi8.i(parentActivity, false, 1, resourceProvider);
            my0[] my0VarArr2 = new my0[1];
            LinearLayout l = td4.l(parentActivity, 1);
            l.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(4.0f));
            l.setClipChildren(false);
            l.setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            l.addView(frameLayout, qoe.t(-1, -2, 7, 0, 0, 0, 10));
            boolean[] zArr3 = new boolean[1];
            pwa pwaVar2 = new pwa(zArr3, my0VarArr2);
            nm7.f(i7).a(pwaVar2, nm7.C3);
            long n = pg3.n(starsSubscription.peer);
            bf0 bf0Var = new bf0(parentActivity);
            int i9 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
            String str4 = "";
            if (i9 >= 0) {
                TLRPC.User W1 = oc7.r1(i7).W1(Long.valueOf(n));
                String r = m9c.r(W1);
                boolean v = m9c.v(W1);
                z = !v;
                str = r;
                zArr = zArr3;
                z2 = v;
                i2 = i9;
                chat = W1;
            } else {
                i2 = i9;
                zArr = zArr3;
                TLRPC.Chat L0 = oc7.r1(i7).L0(Long.valueOf(-n));
                str = L0 == null ? "" : L0.title;
                z = false;
                z2 = false;
                chat = L0;
            }
            TLRPC.Chat chat3 = chat;
            if (starsSubscription.photo != null) {
                bf0Var.setRoundRadius(gm.L(21.0f));
                zArr2 = zArr;
                bf0Var.p(gn5.p(vuc.c(starsSubscription.photo)), "100_100", null, null);
            } else {
                zArr2 = zArr;
                bf0Var.setRoundRadius(gm.L(50.0f));
                pc0 pc0Var = new pc0((ylb) null);
                if (i2 < 0) {
                    chat2 = chat3;
                    str2 = str;
                    TLRPC.Chat L02 = oc7.r1(i7).L0(Long.valueOf(-n));
                    pc0Var.p(L02);
                    bf0Var.f(L02, pc0Var);
                    frameLayout.addView(bf0Var, qoe.e(100, 100, 17));
                    Drawable drawable = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
                    anb.x(frameLayout, drawable, cmb.g5, resourceProvider, PorterDuff.Mode.SRC_IN);
                    Drawable drawable2 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
                    if (starsSubscription.photo == null) {
                        ImageView imageView = new ImageView(parentActivity);
                        imageView.setImageDrawable(drawable);
                        frameLayout.addView(imageView, qoe.e(28, 28, 17));
                        imageView.setTranslationX(gm.L(34.0f));
                        imageView.setTranslationY(gm.L(35.0f));
                        imageView.setScaleX(1.1f);
                        imageView.setScaleY(1.1f);
                        ImageView imageView2 = new ImageView(parentActivity);
                        imageView2.setImageDrawable(drawable2);
                        frameLayout.addView(imageView2, qoe.e(28, 28, 17));
                        imageView2.setTranslationX(gm.L(34.0f));
                        imageView2.setTranslationY(gm.L(35.0f));
                    }
                    TextView textView = new TextView(parentActivity);
                    td4.x(textView, cmb.i5, resourceProvider, 1, 20.0f);
                    textView.setGravity(17);
                    if (TextUtils.isEmpty(starsSubscription.title)) {
                        textView.setText(starsSubscription.title);
                    } else {
                        textView.setText(jb6.M0(2131744660, null));
                    }
                    l.addView(textView, qoe.t(-1, -2, 17, 20, 0, 20, 4));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(17);
                    anb.X(textView2, cmb.A6, resourceProvider);
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = starsSubscription.pricing;
                    i3 = tL_starsSubscriptionPricing.period;
                    if (i3 != 2592000) {
                        textView2.setText(b1(false, jb6.a0(null, null, 2131744672, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f, null));
                    } else {
                        textView2.setText(b1(false, jb6.a0(null, null, 2131744672, Long.valueOf(tL_starsSubscriptionPricing.amount), i3 == 300 ? "5min" : "min"), 0.8f, null));
                    }
                    l.addView(textView2, qoe.t(-1, -2, 17, 20, 0, 20, 4));
                    mhb mhbVar = new mhb(parentActivity, resourceProvider);
                    l66 l66Var = new l66(parentActivity, resourceProvider);
                    l66Var.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
                    l66Var.setEllipsize(TextUtils.TruncateAt.END);
                    int i10 = cmb.Wc;
                    anb.X(l66Var, i10, resourceProvider);
                    anb.G(l66Var, i10, resourceProvider);
                    l66Var.setTextSize(1, 14.0f);
                    l66Var.setSingleLine(true);
                    l66Var.setDisablePaddingsOffsetY(true);
                    ed0 ed0Var = new ed0(24.0f, i7, l66Var);
                    if (i2 < 0) {
                        TLRPC.User W12 = oc7.r1(i7).W1(Long.valueOf(n));
                        z3 = W12 == null || m9c.z(W12);
                        str4 = m9c.r(W12);
                        ed0Var.e(W12);
                        activity = parentActivity;
                    } else {
                        activity = parentActivity;
                        TLRPC.Chat L03 = oc7.r1(i7).L0(Long.valueOf(-n));
                        if (L03 == null) {
                            z3 = true;
                        } else {
                            str4 = L03.title;
                            z3 = false;
                        }
                        ed0Var.b(L03);
                    }
                    String str5 = str4;
                    final TLRPC.Chat chat4 = chat2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str5));
                    spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
                    spannableStringBuilder.setSpan(new qwa(my0VarArr2, n), 3, spannableStringBuilder.length(), 33);
                    l66Var.setText(spannableStringBuilder);
                    if (!z3) {
                        mhbVar.l(l66Var, jb6.M0(i2 < 0 ? 2131744684 : z ? 2131744694 : 2131744699, null));
                    }
                    if (i2 >= 0 || TextUtils.isEmpty(starsSubscription.title)) {
                        str3 = null;
                    } else {
                        str3 = null;
                        mhbVar.f(jb6.M0(z ? 2131744692 : 2131744697, null), starsSubscription.title, null, null);
                    }
                    mhbVar.f(jb6.M0(2131744665, str3), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), jb6.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
                    currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    if (!starsSubscription.canceled || starsSubscription.bot_canceled) {
                        j = n;
                        i4 = 2131744658;
                    } else {
                        j = n;
                        i4 = currentTime > ((long) starsSubscription.until_date) ? 2131744659 : 2131744657;
                    }
                    mhbVar.f(jb6.M0(i4, null), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(starsSubscription.until_date * 1000)), jb6.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
                    l.addView(mhbVar, qoe.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
                    Activity activity2 = activity;
                    l66 l66Var2 = new l66(activity2, resourceProvider);
                    int i11 = cmb.y6;
                    anb.X(l66Var2, i11, resourceProvider);
                    anb.G(l66Var2, i10, resourceProvider);
                    l66Var2.setTextSize(1, 14.0f);
                    l66Var2.setText(gm.N2(jb6.M0(2131744615, null), -1, 0, new m9(activity2, (byte) 5), null));
                    l66Var2.setGravity(17);
                    l.addView(l66Var2, qoe.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
                    if (currentTime < starsSubscription.until_date) {
                        pwaVar = pwaVar2;
                        my0VarArr = my0VarArr2;
                        i5 = i7;
                        l66 l66Var3 = new l66(activity2, resourceProvider);
                        anb.X(l66Var3, i11, resourceProvider);
                        anb.G(l66Var3, i10, resourceProvider);
                        l66Var3.setTextSize(1, 14.0f);
                        l66Var3.setText(jb6.a0(null, null, 2131744674, jb6.u(starsSubscription.until_date, false)));
                        l66Var3.setSingleLine(false);
                        l66Var3.setMaxLines(4);
                        l66Var3.setGravity(17);
                        l.addView(l66Var3, qoe.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                            b61 b61Var = new b61(resourceProvider, activity2, true);
                            b61Var.setRoundRadius(24);
                            r5 = 0;
                            b61Var.i(jb6.M0(2131744700, null), false, true);
                            l.addView(b61Var, qoe.o(-1, 48));
                            b61Var.setOnClickListener(new f73(b61Var, starsSubscription, i5, my0VarArr, resourceProvider, zArr2, activity2));
                            i8.O = l;
                            my0VarArr[r5] = i8;
                            i8.T0 = r5;
                            i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ewa
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    nm7.f(i5).n(pwaVar, nm7.C3);
                                }
                            });
                            my0VarArr[r5].J();
                            S = LaunchActivity.S();
                            if (!gm.O1() && !gm.s1(S)) {
                                my0VarArr[r5].X(S);
                            }
                            my0VarArr[r5].show();
                        }
                    } else if (starsSubscription.can_refulfill) {
                        l66 l66Var4 = new l66(activity2, resourceProvider);
                        anb.X(l66Var4, i11, resourceProvider);
                        anb.G(l66Var4, i10, resourceProvider);
                        l66Var4.setTextSize(1, 14.0f);
                        l66Var4.setText(jb6.a0(null, null, z2 ? 2131744695 : 2131744670, jb6.u(starsSubscription.until_date, false)));
                        l66Var4.setSingleLine(false);
                        l66Var4.setMaxLines(4);
                        l66Var4.setGravity(17);
                        l.addView(l66Var4, qoe.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        b61 b61Var2 = new b61(resourceProvider, activity2, true);
                        b61Var2.i(jb6.M0(z2 ? 2131744696 : 2131744671, null), false, true);
                        l.addView(b61Var2, qoe.o(-1, 48));
                        pwaVar = pwaVar2;
                        my0VarArr = my0VarArr2;
                        cwa cwaVar = new cwa(b61Var2, i7, starsSubscription, my0VarArr, j, activity2, resourceProvider, z, str2);
                        i5 = i7;
                        b61Var2.setOnClickListener(cwaVar);
                    } else {
                        pwaVar = pwaVar2;
                        my0VarArr = my0VarArr2;
                        i5 = i7;
                        if (starsSubscription.bot_canceled) {
                            l66 l66Var5 = new l66(activity2, resourceProvider);
                            anb.X(l66Var5, cmb.mk, resourceProvider);
                            anb.G(l66Var5, i10, resourceProvider);
                            l66Var5.setTextSize(1, 14.0f);
                            l66Var5.setText(jb6.M0(z ? 2131744693 : 2131744698, null));
                            l66Var5.setSingleLine(false);
                            l66Var5.setMaxLines(4);
                            l66Var5.setGravity(17);
                            l.addView(l66Var5, qoe.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                        } else if (starsSubscription.canceled) {
                            l66 l66Var6 = new l66(activity2, resourceProvider);
                            anb.X(l66Var6, cmb.mk, resourceProvider);
                            anb.G(l66Var6, i10, resourceProvider);
                            l66Var6.setTextSize(1, 14.0f);
                            l66Var6.setText(jb6.M0(2131744687, null));
                            l66Var6.setSingleLine(false);
                            l66Var6.setMaxLines(4);
                            l66Var6.setGravity(17);
                            l.addView(l66Var6, qoe.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            if (starsSubscription.chat_invite_hash != null || starsSubscription.invoice_slug != null) {
                                b61 b61Var3 = new b61(resourceProvider, activity2, true);
                                b61Var3.i(jb6.M0(2131744669, null), false, true);
                                l.addView(b61Var3, qoe.o(-1, 48));
                                b61Var3.setOnClickListener(new xh(b61Var3, starsSubscription, i5, my0VarArr, chat4, str2));
                            }
                        } else {
                            l66 l66Var7 = new l66(activity2, resourceProvider);
                            anb.X(l66Var7, i11, resourceProvider);
                            anb.G(l66Var7, i10, resourceProvider);
                            l66Var7.setTextSize(1, 14.0f);
                            l66Var7.setText(jb6.a0(null, null, 2131744690, jb6.u(starsSubscription.until_date, false)));
                            l66Var7.setSingleLine(false);
                            l66Var7.setMaxLines(4);
                            l66Var7.setGravity(17);
                            l.addView(l66Var7, qoe.k(26.0f, 7.0f, 26.0f, 15.0f, -1, -2));
                            final b61 b61Var4 = new b61(resourceProvider, activity2, false);
                            b61Var4.i(jb6.M0(2131744691, null), false, true);
                            b61Var4.setTextColorKey(cmb.mk);
                            l.addView(b61Var4, qoe.o(-1, 48));
                            b61Var4.setOnClickListener(new View.OnClickListener() { // from class: dwa
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    final b61 b61Var5 = b61Var4;
                                    if (b61Var5.R) {
                                        return;
                                    }
                                    b61Var5.setLoading(true);
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
                                    final my0[] my0VarArr3 = my0VarArr;
                                    connectionsManager.sendRequest(tL_changeStarsSubscription, new RequestDelegate() { // from class: iwa
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            gm.c3(new jn9(i12, b61Var5, tLObject, starsSubscription2, z4, z5, my0VarArr3));
                                        }
                                    });
                                }
                            });
                        }
                    }
                    r5 = 0;
                    i8.O = l;
                    my0VarArr[r5] = i8;
                    i8.T0 = r5;
                    i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ewa
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            nm7.f(i5).n(pwaVar, nm7.C3);
                        }
                    });
                    my0VarArr[r5].J();
                    S = LaunchActivity.S();
                    if (!gm.O1()) {
                        my0VarArr[r5].X(S);
                    }
                    my0VarArr[r5].show();
                }
                TLRPC.User W13 = oc7.r1(i7).W1(Long.valueOf(n));
                pc0Var.q(W13);
                bf0Var.f(W13, pc0Var);
            }
            chat2 = chat3;
            str2 = str;
            frameLayout.addView(bf0Var, qoe.e(100, 100, 17));
            Drawable drawable3 = parentActivity.getResources().getDrawable(R.drawable.star_small_outline);
            anb.x(frameLayout, drawable3, cmb.g5, resourceProvider, PorterDuff.Mode.SRC_IN);
            Drawable drawable22 = parentActivity.getResources().getDrawable(R.drawable.star_small_inner);
            if (starsSubscription.photo == null) {
            }
            TextView textView3 = new TextView(parentActivity);
            td4.x(textView3, cmb.i5, resourceProvider, 1, 20.0f);
            textView3.setGravity(17);
            if (TextUtils.isEmpty(starsSubscription.title)) {
            }
            l.addView(textView3, qoe.t(-1, -2, 17, 20, 0, 20, 4));
            TextView textView22 = new TextView(parentActivity);
            textView22.setTextSize(1, 14.0f);
            textView22.setGravity(17);
            anb.X(textView22, cmb.A6, resourceProvider);
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = starsSubscription.pricing;
            i3 = tL_starsSubscriptionPricing2.period;
            if (i3 != 2592000) {
            }
            l.addView(textView22, qoe.t(-1, -2, 17, 20, 0, 20, 4));
            mhb mhbVar2 = new mhb(parentActivity, resourceProvider);
            l66 l66Var8 = new l66(parentActivity, resourceProvider);
            l66Var8.setPadding(gm.L(12.66f), gm.L(9.33f), gm.L(12.66f), gm.L(9.33f));
            l66Var8.setEllipsize(TextUtils.TruncateAt.END);
            int i102 = cmb.Wc;
            anb.X(l66Var8, i102, resourceProvider);
            anb.G(l66Var8, i102, resourceProvider);
            l66Var8.setTextSize(1, 14.0f);
            l66Var8.setSingleLine(true);
            l66Var8.setDisablePaddingsOffsetY(true);
            ed0 ed0Var2 = new ed0(24.0f, i7, l66Var8);
            if (i2 < 0) {
            }
            String str52 = str4;
            final TLObject chat42 = chat2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  " + ((Object) str52));
            spannableStringBuilder2.setSpan(ed0Var2, 0, 1, 33);
            spannableStringBuilder2.setSpan(new qwa(my0VarArr2, n), 3, spannableStringBuilder2.length(), 33);
            l66Var8.setText(spannableStringBuilder2);
            if (!z3) {
            }
            if (i2 >= 0) {
            }
            str3 = null;
            mhbVar2.f(jb6.M0(2131744665, str3), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000)), jb6.D0().o0().format(new Date((starsSubscription.until_date - starsSubscription.pricing.period) * 1000))), null, null);
            currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (starsSubscription.canceled) {
            }
            j = n;
            i4 = 2131744658;
            mhbVar2.f(jb6.M0(i4, null), jb6.a0(null, null, 2131742446, jb6.D0().r0().format(new Date(starsSubscription.until_date * 1000)), jb6.D0().o0().format(new Date(starsSubscription.until_date * 1000))), null, null);
            l.addView(mhbVar2, qoe.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
            Activity activity22 = activity;
            l66 l66Var22 = new l66(activity22, resourceProvider);
            int i112 = cmb.y6;
            anb.X(l66Var22, i112, resourceProvider);
            anb.G(l66Var22, i102, resourceProvider);
            l66Var22.setTextSize(1, 14.0f);
            l66Var22.setText(gm.N2(jb6.M0(2131744615, null), -1, 0, new m9(activity22, (byte) 5), null));
            l66Var22.setGravity(17);
            l.addView(l66Var22, qoe.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
            if (currentTime < starsSubscription.until_date) {
            }
            r5 = 0;
            i8.O = l;
            my0VarArr[r5] = i8;
            i8.T0 = r5;
            i8.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ewa
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    nm7.f(i5).n(pwaVar, nm7.C3);
                }
            });
            my0VarArr[r5].J();
            S = LaunchActivity.S();
            if (!gm.O1()) {
            }
            my0VarArr[r5].show();
        }
    }

    public final /* synthetic */ void N0(Context context) {
        if (oc7.r1(this.currentAccount).u2()) {
            h5.b(this.currentAccount);
        } else {
            new exa(context, this.resourceProvider).show();
        }
    }

    public final /* synthetic */ void O0(Context context) {
        new exa(context, this.resourceProvider).show();
    }

    public final void P0() {
        jva.v(this.currentAccount, false).r();
        yw4.f1(true, ok0.a(this.currentAccount).b());
    }

    public final void Q0(c6c c6cVar, Boolean bool, String str) {
        if (getParentActivity() != null) {
            if (bool.booleanValue()) {
                c41.b0(this).I(R.raw.stars_topup, jb6.M0(2131744848, null), gm.S2(jb6.G((int) c6cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                this.i0.c(true);
                jva.v(this.currentAccount, false).P(true);
            } else if (str != null) {
                c41.b0(this).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
            }
        }
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final byte b = 0;
        this.H = false;
        this.F = gm.L(238.0f);
        fja fjaVar = new fja(context);
        this.V = fjaVar;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        fjaVar.setDebugLoggingEnabled(true);
        this.V.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            tk5 tk5Var = this.parentLayout;
            this.c0 = (tk5Var == null || !((ActionBarLayout) tk5Var).T0) ? gm.m : 0;
            this.d0 = gm.n;
        }
        byte b2 = 15;
        this.V.setGeometry(new x59(this, b2));
        this.V.A(-b10.x(48.0f, this.c0, -gm.L(8.0f)), -b10.x(48.0f, this.d0, -gm.L(8.0f)));
        fja fjaVar2 = this.V;
        fjaVar2.getClass();
        this.W = new xd9((byte) 7, context, fjaVar2);
        this.U = new mxa(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new xd9((byte) 9, context, this);
        super.createView(context);
        g15 g15Var = this.s;
        getBaseSimpleGlass().f(g15Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new dh0(this, new kwa(g15Var, b), (byte) 8);
        View view = this.U.d;
        View view2 = new View(getParentActivity());
        this.X = view2;
        view2.setAlpha(0.0f);
        fja fjaVar3 = this.V;
        fjaVar3.addView(this.X, fjaVar3.indexOfChild(view), qoe.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        nva nvaVar = new nva(this, b);
        d53 d53Var = d53.h;
        fn0 fn0Var = new fn0(0, nvaVar, d53Var, 380L, false);
        this.Y = fn0Var;
        this.Z = new fn0(1, new nva(this, c3 == true ? 1 : 0), d53Var, 380L, false);
        this.a0 = new fn0(2, new nva(this, (byte) 2), d53Var, 380L, false);
        fn0Var.a(this.c.canScrollVertically(-1) || this.simpleActionBar.x(), false);
        this.Z.a(this.V.f0, false);
        this.c.j(new so7(this, (byte) 27));
        r1();
        im0 c4 = getBaseSimpleGlass().c.c(view, null, false);
        c4.p(qqd.l(this.resourceProvider));
        c4.q(gm.L(9.66f));
        c4.r(gm.L(18.0f));
        view.setBackground(c4);
        tk5 tk5Var2 = this.parentLayout;
        if (tk5Var2 != null && ((ActionBarLayout) tk5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        ft4 ft4Var = new ft4(context, 1, 2);
        this.T = ft4Var;
        vs4 vs4Var = ft4Var.b;
        vs4Var.z = cmb.Vk;
        vs4Var.A = cmb.Wk;
        vs4Var.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, qoe.d(nm7.T2, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(jb6.M0(2131743900, null), gm.D2(gm.N2(jb6.M0(2131743897, null), -1, 0, new dh1(context, b2), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53Var);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        this.c.setOnItemClickListener(new s19(this, (byte) 12));
        uj4 uj4Var = new uj4(getParentActivity());
        this.i0 = uj4Var;
        this.s.addView(uj4Var, qoe.c(-1.0f, -1));
        jva v = jva.v(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, gm.L(24.0f), 0, gm.L(10.0f));
        io ioVar = new io(getParentActivity(), false, true, false);
        this.l0 = ioVar;
        ioVar.setTypeface(gm.o());
        this.l0.setTextSize(gm.L(32.0f));
        this.l0.setGravity(17);
        anb.U(this.l0, cmb.F6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        on5 on5Var = new on5(42.0f, this.currentAccount, this.l0);
        p09 p09Var = new p09(R.raw.star_reaction, gm.L(42.0f), gm.L(42.0f));
        ImageReceiver imageReceiver = on5Var.b;
        imageReceiver.g0(p09Var);
        imageReceiver.M(2);
        on5Var.f = false;
        on5Var.h = -gm.L(3.0f);
        this.k0.setSpan(on5Var, 0, 1, 33);
        this.j0.addView(this.l0, qoe.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.m0 = textView;
        textView.setTextSize(1, 14.0f);
        this.m0.setGravity(17);
        this.m0.setText(jb6.M0(2131742453, null));
        anb.X(this.m0, cmb.y6, this.resourceProvider);
        this.j0.addView(this.m0, qoe.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ne6 ne6Var = new ne6((byte) 25, getParentActivity(), this);
        this.o0 = ne6Var;
        frameLayout2.addView(ne6Var);
        b61 b61Var = new b61(this.resourceProvider, getParentActivity(), true);
        this.p0 = b61Var;
        b61Var.f();
        this.p0.i("", false, true);
        this.p0.setOnClickListener(new View.OnClickListener(this) { // from class: vva
            public final /* synthetic */ nxa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                Context context2 = context;
                nxa nxaVar = this.b;
                switch (b3) {
                    case 0:
                        nxaVar.N0(context2);
                        break;
                    default:
                        nxaVar.O0(context2);
                        break;
                }
            }
        });
        this.o0.addView(this.p0, qoe.e(-1, 48, nm7.D1));
        qmb qmbVar = new qmb((byte) 19, getParentActivity(), this);
        this.q0 = qmbVar;
        frameLayout2.addView(qmbVar);
        b61 b61Var2 = new b61(this.resourceProvider, getParentActivity(), true);
        this.r0 = b61Var2;
        b61Var2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new pn2(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131744654, null));
        this.r0.i(spannableStringBuilder, false, true);
        b61 b61Var3 = this.r0;
        final char c5 = c2 == true ? 1 : 0;
        b61Var3.setOnClickListener(new View.OnClickListener(this) { // from class: vva
            public final /* synthetic */ nxa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = c5;
                Context context2 = context;
                nxa nxaVar = this.b;
                switch (b3) {
                    case 0:
                        nxaVar.N0(context2);
                        break;
                    default:
                        nxaVar.O0(context2);
                        break;
                }
            }
        });
        this.q0.addView(this.r0, qoe.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        b61 b61Var4 = new b61(this.resourceProvider, getParentActivity(), true);
        this.n0 = b61Var4;
        b61Var4.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new pn2(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131744711, null));
        this.n0.i(spannableStringBuilder2, false, true);
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: awa
            public final /* synthetic */ nxa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = b;
                nxa nxaVar = this.b;
                switch (b3) {
                    case 0:
                        nxaVar.presentFragment(new au0(0, nxaVar.getUserConfig().e()));
                        break;
                    default:
                        nxaVar.P0();
                        break;
                }
            }
        });
        this.q0.addView(this.n0, qoe.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.j0.addView(frameLayout2, qoe.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        b61 b61Var5 = new b61(this.resourceProvider, getParentActivity(), false);
        this.s0 = b61Var5;
        b61Var5.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new pn2(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) jb6.M0(2131743898, null));
        this.s0.i(spannableStringBuilder3, false, true);
        b61 b61Var6 = this.s0;
        final char c6 = c == true ? 1 : 0;
        b61Var6.setOnClickListener(new View.OnClickListener(this) { // from class: awa
            public final /* synthetic */ nxa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b3 = c6;
                nxa nxaVar = this.b;
                switch (b3) {
                    case 0:
                        nxaVar.presentFragment(new au0(0, nxaVar.getUserConfig().e()));
                        break;
                    default:
                        nxaVar.P0();
                        break;
                }
            }
        });
        this.j0.addView(this.s0, qoe.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        p1();
        vb vbVar = this.v0;
        if (vbVar != null) {
            vbVar.O(false);
        }
        ku0.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = ku0.g(this.currentAccount).h(getUserConfig().e(), false);
        q1(v.m().amount > 0 && h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive(), false);
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x3;
        int i4 = nm7.C3;
        int i5 = nm7.B3;
        if (i == i5 || i == i4 || i == i3) {
            o1("NOTIFICATION_" + i);
        }
        if (i == i3) {
            u0();
            vb vbVar = this.v0;
            if (vbVar != null) {
                vbVar.O(true);
            }
            h0();
            return;
        }
        if (i == i5) {
            jva v = jva.v(this.currentAccount, false);
            if (this.t0 != v.K(0)) {
                this.t0 = v.K(0);
                u0();
                vb vbVar2 = this.v0;
                if (vbVar2 != null) {
                    vbVar2.O(false);
                }
                h0();
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
        if (i == nm7.A3) {
            p1();
        } else if (i == nm7.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            p1();
        }
    }

    @Override // h15
    public final void h0() {
        fja fjaVar;
        o1("RESTORE_BEFORE");
        super.h0();
        if (this.f0 && (fjaVar = this.V) != null && this.b0 != -1) {
            fjaVar.a();
        }
        this.f0 = false;
        o1("RESTORE_AFTER");
    }

    @Override // h15
    public final void i0() {
        this.s.addView(this.V, qoe.c(-1.0f, -1));
        this.V.v(this.c, new nva(this, (byte) 3));
        fja fjaVar = this.V;
        mxa mxaVar = this.U;
        fjaVar.y(mxaVar, mxaVar.b, new dq9((byte) 29));
        this.V.z(this.U.d);
        this.U.d.setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        E0();
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        fja fjaVar = this.V;
        return fjaVar == null || motionEvent == null || fjaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.b.b == 0;
    }

    @Override // h15
    public final y59 k0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new vh8(this, (byte) 24), getResourceProvider(), (byte) 4);
        this.v0 = vbVar;
        vbVar.r = false;
        return vbVar;
    }

    @Override // h15
    public final u46 l0(Context context) {
        fja fjaVar = this.V;
        fjaVar.getClass();
        return new jg2((Object) fjaVar, (byte) 5);
    }

    @Override // h15
    public final dta m0() {
        return new uwa(getParentActivity(), 75, 1);
    }

    @Override // h15
    public final View o0(Context context) {
        throw null;
    }

    public final void o1(String str) {
        if (this.V != null) {
            StringBuilder p = wi8.p("Stars event=", str, " row=");
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
            xd9 xd9Var = this.W;
            p.append((xd9Var == null || xd9Var.getParent() == null) ? false : true);
            p.append(" boundaryTop=");
            xd9 xd9Var2 = this.W;
            p.append(xd9Var2 == null ? 0 : xd9Var2.getTop());
            p.append(" boundaryHeight=");
            xd9 xd9Var3 = this.W;
            p.append(xd9Var3 != null ? xd9Var3.getHeight() : 0);
            Log.d("SiblingScroll", p.toString());
            fja fjaVar = this.V;
            if (fjaVar.a) {
                fjaVar.b = Math.max(fjaVar.b, 30);
                fjaVar.f(str, null, 0, 0, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.x3);
        nm7.f(this.currentAccount).b(this, nm7.A3);
        nm7.f(this.currentAccount).b(this, nm7.B3);
        nm7.f(this.currentAccount).b(this, nm7.C3);
        nm7.f(this.currentAccount).b(this, nm7.E3);
        jva.v(this.currentAccount, false).P(true);
        jva.v(this.currentAccount, false).O();
        jva.v(this.currentAccount, false).w();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        r59 r59Var = this.c;
        if (r59Var != null) {
            r59Var.removeCallbacks(this.g0);
        }
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.x3);
        nm7.f(this.currentAccount).n(this, nm7.A3);
        nm7.f(this.currentAccount).n(this, nm7.B3);
        nm7.f(this.currentAccount).n(this, nm7.C3);
        nm7.f(this.currentAccount).n(this, nm7.E3);
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        E0();
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        ft4 ft4Var = this.T;
        if (ft4Var != null) {
            ft4Var.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override // h15, org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ft4 ft4Var = this.T;
        if (ft4Var != null) {
            ft4Var.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    public final void p1() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = false;
        jva v = jva.v(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) H0(v.m(), 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        this.p0.i(jb6.M0(v.m().amount > 0 ? 2131744839 : 2131744840, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = ku0.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z = true;
        }
        q1(z, true);
    }

    @Override // h15
    public final float q0() {
        r59 r59Var = this.c;
        if (r59Var == null) {
            return 0.0f;
        }
        return r59Var.getY();
    }

    public final void q1(final boolean z, boolean z2) {
        this.u0 = z;
        ne6 ne6Var = this.o0;
        if (z2) {
            ne6Var.setVisibility(0);
            this.q0.setVisibility(0);
            final byte b = 0;
            this.o0.animate().alpha(z ? 0.0f : 1.0f).withEndAction(new Runnable(this) { // from class: hwa
                public final /* synthetic */ nxa b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    boolean z3 = z;
                    nxa nxaVar = this.b;
                    switch (b2) {
                        case 0:
                            if (z3) {
                                nxaVar.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                nxaVar.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            final byte b2 = 1;
            this.q0.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable(this) { // from class: hwa
                public final /* synthetic */ nxa b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    boolean z3 = z;
                    nxa nxaVar = this.b;
                    switch (b22) {
                        case 0:
                            if (z3) {
                                nxaVar.o0.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (!z3) {
                                nxaVar.q0.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            return;
        }
        ne6Var.animate().cancel();
        this.q0.animate().cancel();
        this.q0.setAlpha(z ? 1.0f : 0.0f);
        this.o0.setAlpha(z ? 0.0f : 1.0f);
        this.q0.setVisibility(z ? 0 : 8);
        this.o0.setVisibility(z ? 8 : 0);
    }

    @Override // h15
    public final View r0() {
        return this.V;
    }

    public final void r1() {
        if (this.X == null) {
            return;
        }
        int L = gm.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        s1();
    }

    @Override // h15
    public final void s0(boolean z) {
        fn0 fn0Var = this.a0;
        if (fn0Var == null || fn0Var.f == z) {
            return;
        }
        fn0Var.a(z, true);
    }

    public final void s1() {
        View view = this.X;
        if (view == null) {
            return;
        }
        fn0 fn0Var = this.Y;
        float f = fn0Var == null ? 0.0f : fn0Var.e;
        fn0 fn0Var2 = this.Z;
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - (fn0Var2 != null ? fn0Var2.e : 0.0f)) * gm.L(44.0f)));
    }

    @Override // h15
    public final void u0() {
        o1("SAVE_BEFORE");
        super.u0();
        fja fjaVar = this.V;
        this.f0 = fjaVar != null && fjaVar.f0;
        r59 r59Var = this.c;
        if (r59Var != null && this.Q >= 0) {
            this.R -= r59Var.getPaddingTop();
        }
        o1("SAVE_AFTER");
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
