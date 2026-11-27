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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hza extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new hza());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x078d  */
    @Override // a8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        SpannableString spannableString;
        int L;
        boolean z2;
        int i;
        boolean z3;
        String str;
        int i2;
        boolean z4;
        jn5 jn5Var;
        int i3;
        String str2;
        long j;
        boolean z5;
        iza izaVar = (iza) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) b8cVar.H;
        boolean z6 = b8cVar.r;
        int i4 = izaVar.a;
        SpannableString spannableString2 = izaVar.w;
        SpannableString spannableString3 = izaVar.x;
        de0 de0Var = izaVar.d;
        rb0 rb0Var = izaVar.b;
        TextView textView = izaVar.r;
        TextView textView2 = izaVar.s;
        de0 de0Var2 = izaVar.c;
        TextView textView3 = izaVar.f;
        Integer num = 0;
        p66 p66Var = izaVar.n;
        long n = wf3.n(starsTransaction.peer.peer);
        boolean z7 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i5 = starsTransaction.flags;
        boolean z8 = (i5 & 131072) == 0 && (i5 & 65536) != 0;
        boolean z9 = !(n == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        izaVar.y = z9;
        boolean z10 = z9;
        LinearLayout.LayoutParams layoutParams = izaVar.h;
        if (z10) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = hl.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        p66Var.setVisibility(izaVar.y ? 0 : 8);
        textView.setTextSize(1, izaVar.y ? 13.0f : 14.0f);
        textView.setText(ob6.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", ob6.M0(2131744687, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", ob6.M0(2131744767, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", ob6.M0(2131744710, null)));
        }
        de0Var2.setTranslationX(0.0f);
        de0Var2.setTranslationY(0.0f);
        de0Var.setVisibility(8);
        de0Var2.setRoundRadius(hl.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            de0Var2.setImageDrawable(new kua(de0Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(ob6.M0(2131749869, null));
            p66Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            de0Var2.setImageDrawable(new kua(de0Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(ob6.M0(2131749871, null));
            p66Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (n != 0) {
                    if (lbc.C(n)) {
                        str = ob6.M0(2131744582, null);
                        de0Var2.setImageDrawable(iza.a(44, "fragment"));
                        z3 = false;
                    } else if (n >= 0) {
                        TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(n));
                        z3 = X1 == null;
                        rb0Var.q(X1);
                        de0Var2.f(X1, rb0Var);
                        str = lbc.r(X1);
                    } else {
                        TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-n));
                        z3 = M0 == null;
                        rb0Var.p(M0);
                        de0Var2.f(M0, rb0Var);
                        str = M0 == null ? "" : M0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        rn5 rn5Var = new rn5(16.0f, i4, p66Var);
                        rn5Var.a(4.0f);
                        rn5Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(rn5Var, 0, 1, 33);
                        nza.f1(rn5Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new hm(starsTransaction.stargift.getDocument(), p66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            boolean negative = starsTransaction.amount.negative();
                            boolean z11 = starsTransaction.refund;
                            if (negative) {
                                spannableStringBuilder.append((CharSequence) ob6.M0(z11 ? 2131744870 : 2131744875, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) ob6.M0(z11 ? 2131744874 : 2131744871, null));
                            }
                            p66Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new hm(starsTransaction.stargift.getDocument(), p66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            boolean negative2 = starsTransaction.amount.negative();
                            boolean z12 = starsTransaction.refund;
                            if (negative2) {
                                spannableStringBuilder2.append((CharSequence) ob6.M0(z12 ? 2131744870 : 2131744873, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) ob6.M0(z12 ? 2131744872 : 2131744871, null));
                            }
                            p66Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            p66Var.setText(TextUtils.concat(spannableString4, " ", ob6.M0(2131749876, null)));
                        } else {
                            boolean z13 = starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique;
                            boolean z14 = starsTransaction.refund;
                            if (z13) {
                                p66Var.setText(ob6.M0(z14 ? 2131744868 : 2131744869, null));
                            } else {
                                boolean z15 = starsTransaction.stargift_auction_bid;
                                if (z14) {
                                    p66Var.setText(TextUtils.concat(spannableString4, " ", ob6.M0(z15 ? 2131749875 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749872 : 2131749873 : 2131749874, null)));
                                } else {
                                    if (z15) {
                                        i3 = 2131749878;
                                    } else if (starsTransaction.amount.amount > 0) {
                                        i3 = 2131749877;
                                    } else if (starsTransaction.stargift_upgrade) {
                                        str2 = null;
                                        i3 = 2131749869;
                                        p66Var.setText(TextUtils.concat(spannableString4, " ", ob6.M0(i3, str2)));
                                    } else {
                                        i3 = 2131749870;
                                    }
                                    str2 = null;
                                    p66Var.setText(TextUtils.concat(spannableString4, " ", ob6.M0(i3, str2)));
                                }
                            }
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i6 = starsTransaction.subscription_period;
                        if (i6 == 2592000) {
                            p66Var.setVisibility(0);
                            p66Var.setText(ob6.M0(2131744587, null));
                        } else {
                            String str3 = i6 == 300 ? "5 minutes" : "Minute";
                            p66Var.setVisibility(0);
                            Locale locale = Locale.US;
                            p66Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.M0(starsTransaction.reaction ? 2131744601 : 2131744602, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.M0(2131744592, null));
                    } else if (z8) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.a0(null, null, 2131744818, cc.J0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.M0(2131744759, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.M0(2131744750, null));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        p66Var.setVisibility(z3 ? 8 : 0);
                        p66Var.setText(ob6.M0(2131744688, null));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z2 = z7;
                        if (starsTransaction.photo != null) {
                            rn5 rn5Var2 = new rn5(14.0f, i4, p66Var);
                            rn5Var2.a(4.0f);
                            rn5Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(rn5Var2, 0, 1, 33);
                            rn5Var2.b.d0(jn5.p(jxc.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            p66Var.setVisibility(z3 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            p66Var.setText(pv3.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), p66Var.getPaint().getFontMetricsInt(), false, null, 0));
                        } else {
                            textView3.setText(str);
                            p66Var.setVisibility(z3 ? 8 : 0);
                            String str5 = starsTransaction.title;
                            p66Var.setText(pv3.m(str5 != null ? str5 : "", p66Var.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        if (z6) {
                            textView3.setText(str);
                            p66Var.setVisibility(0);
                            p66Var.setText(ob6.M0(2131744861, null));
                        } else {
                            textView3.setText(ob6.M0(2131744861, null));
                            p66Var.setVisibility(z3 ? 8 : 0);
                            p66Var.setText(str);
                        }
                        izaVar.e = 0;
                        int i7 = 0;
                        for (int i8 = 2; i7 < Math.min(i8, starsTransaction.extended_media.size()); i8 = 2) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i7);
                            de0 de0Var3 = i7 == 0 ? de0Var2 : de0Var;
                            de0Var3.setRoundRadius(hl.L(12.0f));
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                i2 = 0;
                                jn5 i9 = jn5.i(xb4.w(messageMedia.photo.sizes, hl.L(46.0f), true, null, false), messageMedia.photo);
                                z4 = z7;
                                jn5Var = i9;
                            } else {
                                i2 = 0;
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    boolean z16 = z7;
                                    jn5Var = jn5.c(xb4.w(messageMedia.document.thumbs, hl.L(46.0f), true, null, false), messageMedia.document);
                                    z4 = z16;
                                } else {
                                    z4 = z7;
                                    jn5Var = null;
                                }
                            }
                            de0Var3.setVisibility(i2);
                            Integer num2 = num;
                            de0Var3.j(jn5Var, "46_46", null, null, null, num2);
                            izaVar.e++;
                            i7++;
                            z7 = z4;
                            num = num2;
                        }
                        z2 = z7;
                        int i10 = 0;
                        while (i10 < izaVar.e) {
                            de0 de0Var4 = i10 == 0 ? de0Var2 : de0Var;
                            float f = i10;
                            de0Var4.setTranslationX(((f - (izaVar.e / 2.0f)) * hl.L(4.33f)) + hl.L(2.0f));
                            de0Var4.setTranslationY((f - (izaVar.e / 2.0f)) * hl.L(4.33f));
                            i10++;
                        }
                    }
                } else {
                    z2 = z7;
                    if (starsTransaction.floodskip) {
                        textView3.setText(ob6.M0(2131744616, null));
                        p66Var.setText(ob6.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        de0Var2.setImageDrawable(iza.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(ob6.M0(2131744603, null));
                            de0Var2.setImageDrawable(iza.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(ob6.M0(2131744603, null));
                            de0Var2.setImageDrawable(iza.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(ob6.M0(2131744759, null));
                                p66Var.setText(ob6.M0(z2 ? 2131744585 : 2131744582, null));
                                p66Var.setVisibility(0);
                            } else {
                                if (!z6) {
                                    boolean z17 = starsTransaction.refund;
                                    TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                                    if (!z17 ? !starsAmount.negative() : !starsAmount.positive()) {
                                        i = 2131744608;
                                        textView3.setText(ob6.M0(i, null));
                                    }
                                }
                                i = 2131744578;
                                textView3.setText(ob6.M0(i, null));
                            }
                            de0Var2.setImageDrawable(iza.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(ob6.M0(2131744618, null));
                            de0Var2.setImageDrawable(iza.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(ob6.M0(2131744580, null));
                            de0Var2.setImageDrawable(iza.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(ob6.M0(2131744619, null));
                            de0Var2.setImageDrawable(iza.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            de0Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
                j = starsAmount2.amount;
                if (j <= 0 || (j == 0 && starsAmount2.nanos > 0)) {
                    textView2.setVisibility(0);
                    yob.X(textView2, aob.lk, null);
                    textView2.setText(TextUtils.concat("+", nza.G0(starsTransaction.amount), " ", !z2 ? spannableString3 : spannableString));
                    z5 = z;
                } else {
                    if (j < 0 || (j == 0 && starsAmount2.nanos < 0)) {
                        textView2.setVisibility(0);
                        yob.X(textView2, aob.nk, null);
                        textView2.setText(TextUtils.concat(nza.G0(starsTransaction.amount), " ", z2 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z5 = z;
                }
                izaVar.E = z5;
                izaVar.setWillNotDraw(!z5);
            }
            de0Var2.setImageDrawable(iza.a(44, "search"));
            textView3.setText(ob6.M0(2131744593, null));
            p66Var.setVisibility(8);
        }
        z2 = z7;
        TL_stars.StarsAmount starsAmount22 = starsTransaction.amount;
        j = starsAmount22.amount;
        if (j <= 0) {
        }
        textView2.setVisibility(0);
        yob.X(textView2, aob.lk, null);
        textView2.setText(TextUtils.concat("+", nza.G0(starsTransaction.amount), " ", !z2 ? spannableString3 : spannableString));
        z5 = z;
        izaVar.E = z5;
        izaVar.setWillNotDraw(!z5);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new iza(i, vnbVar, context);
    }
}
