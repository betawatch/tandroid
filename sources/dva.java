// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dva extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new dva());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x078d  */
    @Override // b4c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        SpannableString spannableString;
        int L;
        boolean z2;
        int i;
        boolean z3;
        String str;
        int i2;
        boolean z4;
        gl5 gl5Var;
        int i3;
        String str2;
        long j;
        boolean z5;
        eva evaVar = (eva) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) c4cVar.H;
        boolean z6 = c4cVar.r;
        int i4 = evaVar.a;
        SpannableString spannableString2 = evaVar.w;
        SpannableString spannableString3 = evaVar.x;
        be0 be0Var = evaVar.d;
        pb0 pb0Var = evaVar.b;
        TextView textView = evaVar.r;
        TextView textView2 = evaVar.s;
        be0 be0Var2 = evaVar.c;
        TextView textView3 = evaVar.f;
        Integer num = 0;
        l46 l46Var = evaVar.n;
        long n = cf3.n(starsTransaction.peer.peer);
        boolean z7 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i5 = starsTransaction.flags;
        boolean z8 = (i5 & 131072) == 0 && (i5 & 65536) != 0;
        boolean z9 = !(n == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        evaVar.y = z9;
        boolean z10 = z9;
        LinearLayout.LayoutParams layoutParams = evaVar.h;
        if (z10) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = gl.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        l46Var.setVisibility(evaVar.y ? 0 : 8);
        textView.setTextSize(1, evaVar.y ? 13.0f : 14.0f);
        textView.setText(k96.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", k96.M0(2131744793, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", k96.M0(2131744873, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", k96.M0(2131744816, null)));
        }
        be0Var2.setTranslationX(0.0f);
        be0Var2.setTranslationY(0.0f);
        be0Var.setVisibility(8);
        be0Var2.setRoundRadius(gl.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            be0Var2.setImageDrawable(new jqa(be0Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(k96.M0(2131749907, null));
            l46Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            be0Var2.setImageDrawable(new jqa(be0Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(k96.M0(2131749909, null));
            l46Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (n != 0) {
                    if (l7c.C(n)) {
                        str = k96.M0(2131744688, null);
                        be0Var2.setImageDrawable(eva.a(44, "fragment"));
                        z3 = false;
                    } else if (n >= 0) {
                        TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(n));
                        z3 = V1 == null;
                        pb0Var.q(V1);
                        be0Var2.f(V1, pb0Var);
                        str = l7c.r(V1);
                    } else {
                        TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(-n));
                        z3 = K0 == null;
                        pb0Var.p(K0);
                        be0Var2.f(K0, pb0Var);
                        str = K0 == null ? "" : K0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        ol5 ol5Var = new ol5(16.0f, i4, l46Var);
                        ol5Var.a(4.0f);
                        ol5Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(ol5Var, 0, 1, 33);
                        jva.e1(ol5Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new gm(starsTransaction.stargift.getDocument(), l46Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            boolean negative = starsTransaction.amount.negative();
                            boolean z11 = starsTransaction.refund;
                            if (negative) {
                                spannableStringBuilder.append((CharSequence) k96.M0(z11 ? 2131744976 : 2131744981, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) k96.M0(z11 ? 2131744980 : 2131744977, null));
                            }
                            l46Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new gm(starsTransaction.stargift.getDocument(), l46Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            boolean negative2 = starsTransaction.amount.negative();
                            boolean z12 = starsTransaction.refund;
                            if (negative2) {
                                spannableStringBuilder2.append((CharSequence) k96.M0(z12 ? 2131744976 : 2131744979, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) k96.M0(z12 ? 2131744978 : 2131744977, null));
                            }
                            l46Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            l46Var.setText(TextUtils.concat(spannableString4, " ", k96.M0(2131749914, null)));
                        } else {
                            boolean z13 = starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique;
                            boolean z14 = starsTransaction.refund;
                            if (z13) {
                                l46Var.setText(k96.M0(z14 ? 2131744974 : 2131744975, null));
                            } else {
                                boolean z15 = starsTransaction.stargift_auction_bid;
                                if (z14) {
                                    l46Var.setText(TextUtils.concat(spannableString4, " ", k96.M0(z15 ? 2131749913 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749910 : 2131749911 : 2131749912, null)));
                                } else {
                                    if (z15) {
                                        i3 = 2131749916;
                                    } else if (starsTransaction.amount.amount > 0) {
                                        i3 = 2131749915;
                                    } else if (starsTransaction.stargift_upgrade) {
                                        str2 = null;
                                        i3 = 2131749907;
                                        l46Var.setText(TextUtils.concat(spannableString4, " ", k96.M0(i3, str2)));
                                    } else {
                                        i3 = 2131749908;
                                    }
                                    str2 = null;
                                    l46Var.setText(TextUtils.concat(spannableString4, " ", k96.M0(i3, str2)));
                                }
                            }
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i6 = starsTransaction.subscription_period;
                        if (i6 == 2592000) {
                            l46Var.setVisibility(0);
                            l46Var.setText(k96.M0(2131744693, null));
                        } else {
                            String str3 = i6 == 300 ? "5 minutes" : "Minute";
                            l46Var.setVisibility(0);
                            Locale locale = Locale.US;
                            l46Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.M0(starsTransaction.reaction ? 2131744707 : 2131744708, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.M0(2131744698, null));
                    } else if (z8) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.a0(null, null, 2131744924, bc.I0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.M0(2131744865, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.M0(2131744856, null));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        l46Var.setVisibility(z3 ? 8 : 0);
                        l46Var.setText(k96.M0(2131744794, null));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z2 = z7;
                        if (starsTransaction.photo != null) {
                            ol5 ol5Var2 = new ol5(14.0f, i4, l46Var);
                            ol5Var2.a(4.0f);
                            ol5Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(ol5Var2, 0, 1, 33);
                            ol5Var2.b.d0(gl5.p(usc.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            l46Var.setVisibility(z3 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            l46Var.setText(vu3.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), l46Var.getPaint().getFontMetricsInt(), false, null, 0));
                        } else {
                            textView3.setText(str);
                            l46Var.setVisibility(z3 ? 8 : 0);
                            String str5 = starsTransaction.title;
                            l46Var.setText(vu3.m(str5 != null ? str5 : "", l46Var.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        if (z6) {
                            textView3.setText(str);
                            l46Var.setVisibility(0);
                            l46Var.setText(k96.M0(2131744967, null));
                        } else {
                            textView3.setText(k96.M0(2131744967, null));
                            l46Var.setVisibility(z3 ? 8 : 0);
                            l46Var.setText(str);
                        }
                        evaVar.e = 0;
                        int i7 = 0;
                        for (int i8 = 2; i7 < Math.min(i8, starsTransaction.extended_media.size()); i8 = 2) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i7);
                            be0 be0Var3 = i7 == 0 ? be0Var2 : be0Var;
                            be0Var3.setRoundRadius(gl.L(12.0f));
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                i2 = 0;
                                gl5 i9 = gl5.i(ba4.w(messageMedia.photo.sizes, gl.L(46.0f), true, null, false), messageMedia.photo);
                                z4 = z7;
                                gl5Var = i9;
                            } else {
                                i2 = 0;
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    boolean z16 = z7;
                                    gl5Var = gl5.c(ba4.w(messageMedia.document.thumbs, gl.L(46.0f), true, null, false), messageMedia.document);
                                    z4 = z16;
                                } else {
                                    z4 = z7;
                                    gl5Var = null;
                                }
                            }
                            be0Var3.setVisibility(i2);
                            Integer num2 = num;
                            be0Var3.j(gl5Var, "46_46", null, null, null, num2);
                            evaVar.e++;
                            i7++;
                            z7 = z4;
                            num = num2;
                        }
                        z2 = z7;
                        int i10 = 0;
                        while (i10 < evaVar.e) {
                            be0 be0Var4 = i10 == 0 ? be0Var2 : be0Var;
                            float f = i10;
                            be0Var4.setTranslationX(((f - (evaVar.e / 2.0f)) * gl.L(4.33f)) + gl.L(2.0f));
                            be0Var4.setTranslationY((f - (evaVar.e / 2.0f)) * gl.L(4.33f));
                            i10++;
                        }
                    }
                } else {
                    z2 = z7;
                    if (starsTransaction.floodskip) {
                        textView3.setText(k96.M0(2131744722, null));
                        l46Var.setText(k96.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        be0Var2.setImageDrawable(eva.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(k96.M0(2131744709, null));
                            be0Var2.setImageDrawable(eva.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(k96.M0(2131744709, null));
                            be0Var2.setImageDrawable(eva.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(k96.M0(2131744865, null));
                                l46Var.setText(k96.M0(z2 ? 2131744691 : 2131744688, null));
                                l46Var.setVisibility(0);
                            } else {
                                if (!z6) {
                                    boolean z17 = starsTransaction.refund;
                                    TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                                    if (!z17 ? !starsAmount.negative() : !starsAmount.positive()) {
                                        i = 2131744714;
                                        textView3.setText(k96.M0(i, null));
                                    }
                                }
                                i = 2131744684;
                                textView3.setText(k96.M0(i, null));
                            }
                            be0Var2.setImageDrawable(eva.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(k96.M0(2131744724, null));
                            be0Var2.setImageDrawable(eva.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(k96.M0(2131744686, null));
                            be0Var2.setImageDrawable(eva.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(k96.M0(2131744725, null));
                            be0Var2.setImageDrawable(eva.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            be0Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
                j = starsAmount2.amount;
                if (j <= 0 || (j == 0 && starsAmount2.nanos > 0)) {
                    textView2.setVisibility(0);
                    zkb.X(textView2, bkb.kk, null);
                    textView2.setText(TextUtils.concat("+", jva.F0(starsTransaction.amount), " ", !z2 ? spannableString3 : spannableString));
                    z5 = z;
                } else {
                    if (j < 0 || (j == 0 && starsAmount2.nanos < 0)) {
                        textView2.setVisibility(0);
                        zkb.X(textView2, bkb.mk, null);
                        textView2.setText(TextUtils.concat(jva.F0(starsTransaction.amount), " ", z2 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z5 = z;
                }
                evaVar.E = z5;
                evaVar.setWillNotDraw(!z5);
            }
            be0Var2.setImageDrawable(eva.a(44, "search"));
            textView3.setText(k96.M0(2131744699, null));
            l46Var.setVisibility(8);
        }
        z2 = z7;
        TL_stars.StarsAmount starsAmount22 = starsTransaction.amount;
        j = starsAmount22.amount;
        if (j <= 0) {
        }
        textView2.setVisibility(0);
        zkb.X(textView2, bkb.kk, null);
        textView2.setText(TextUtils.concat("+", jva.F0(starsTransaction.amount), " ", !z2 ? spannableString3 : spannableString));
        z5 = z;
        evaVar.E = z5;
        evaVar.setWillNotDraw(!z5);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new eva(i, wjbVar, context);
    }
}
