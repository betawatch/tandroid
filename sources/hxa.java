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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hxa extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new hxa());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x078d  */
    @Override // b6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        SpannableString spannableString;
        int L;
        boolean z2;
        int i;
        boolean z3;
        String str;
        int i2;
        boolean z4;
        gn5 gn5Var;
        int i3;
        String str2;
        long j;
        boolean z5;
        ixa ixaVar = (ixa) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) c6cVar.H;
        boolean z6 = c6cVar.r;
        int i4 = ixaVar.a;
        SpannableString spannableString2 = ixaVar.w;
        SpannableString spannableString3 = ixaVar.x;
        bf0 bf0Var = ixaVar.d;
        pc0 pc0Var = ixaVar.b;
        TextView textView = ixaVar.r;
        TextView textView2 = ixaVar.s;
        bf0 bf0Var2 = ixaVar.c;
        TextView textView3 = ixaVar.f;
        Integer num = 0;
        l66 l66Var = ixaVar.n;
        long n = pg3.n(starsTransaction.peer.peer);
        boolean z7 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i5 = starsTransaction.flags;
        boolean z8 = (i5 & 131072) == 0 && (i5 & 65536) != 0;
        boolean z9 = !(n == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        ixaVar.y = z9;
        boolean z10 = z9;
        LinearLayout.LayoutParams layoutParams = ixaVar.h;
        if (z10) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = gm.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        l66Var.setVisibility(ixaVar.y ? 0 : 8);
        textView.setTextSize(1, ixaVar.y ? 13.0f : 14.0f);
        textView.setText(jb6.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", jb6.M0(2131744719, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", jb6.M0(2131744799, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", jb6.M0(2131744742, null)));
        }
        bf0Var2.setTranslationX(0.0f);
        bf0Var2.setTranslationY(0.0f);
        bf0Var.setVisibility(8);
        bf0Var2.setRoundRadius(gm.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            bf0Var2.setImageDrawable(new jsa(bf0Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(jb6.M0(2131749856, null));
            l66Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            bf0Var2.setImageDrawable(new jsa(bf0Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(jb6.M0(2131749858, null));
            l66Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (n != 0) {
                    if (m9c.C(n)) {
                        str = jb6.M0(2131744614, null);
                        bf0Var2.setImageDrawable(ixa.a(44, "fragment"));
                        z3 = false;
                    } else if (n >= 0) {
                        TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(n));
                        z3 = W1 == null;
                        pc0Var.q(W1);
                        bf0Var2.f(W1, pc0Var);
                        str = m9c.r(W1);
                    } else {
                        TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(-n));
                        z3 = L0 == null;
                        pc0Var.p(L0);
                        bf0Var2.f(L0, pc0Var);
                        str = L0 == null ? "" : L0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        on5 on5Var = new on5(16.0f, i4, l66Var);
                        on5Var.a(4.0f);
                        on5Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(on5Var, 0, 1, 33);
                        nxa.f1(on5Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new gn(starsTransaction.stargift.getDocument(), l66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            boolean negative = starsTransaction.amount.negative();
                            boolean z11 = starsTransaction.refund;
                            if (negative) {
                                spannableStringBuilder.append((CharSequence) jb6.M0(z11 ? 2131744902 : 2131744907, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) jb6.M0(z11 ? 2131744906 : 2131744903, null));
                            }
                            l66Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new gn(starsTransaction.stargift.getDocument(), l66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            boolean negative2 = starsTransaction.amount.negative();
                            boolean z12 = starsTransaction.refund;
                            if (negative2) {
                                spannableStringBuilder2.append((CharSequence) jb6.M0(z12 ? 2131744902 : 2131744905, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) jb6.M0(z12 ? 2131744904 : 2131744903, null));
                            }
                            l66Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            l66Var.setText(TextUtils.concat(spannableString4, " ", jb6.M0(2131749863, null)));
                        } else {
                            boolean z13 = starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique;
                            boolean z14 = starsTransaction.refund;
                            if (z13) {
                                l66Var.setText(jb6.M0(z14 ? 2131744900 : 2131744901, null));
                            } else {
                                boolean z15 = starsTransaction.stargift_auction_bid;
                                if (z14) {
                                    l66Var.setText(TextUtils.concat(spannableString4, " ", jb6.M0(z15 ? 2131749862 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749859 : 2131749860 : 2131749861, null)));
                                } else {
                                    if (z15) {
                                        i3 = 2131749865;
                                    } else if (starsTransaction.amount.amount > 0) {
                                        i3 = 2131749864;
                                    } else if (starsTransaction.stargift_upgrade) {
                                        str2 = null;
                                        i3 = 2131749856;
                                        l66Var.setText(TextUtils.concat(spannableString4, " ", jb6.M0(i3, str2)));
                                    } else {
                                        i3 = 2131749857;
                                    }
                                    str2 = null;
                                    l66Var.setText(TextUtils.concat(spannableString4, " ", jb6.M0(i3, str2)));
                                }
                            }
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i6 = starsTransaction.subscription_period;
                        if (i6 == 2592000) {
                            l66Var.setVisibility(0);
                            l66Var.setText(jb6.M0(2131744619, null));
                        } else {
                            String str3 = i6 == 300 ? "5 minutes" : "Minute";
                            l66Var.setVisibility(0);
                            Locale locale = Locale.US;
                            l66Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.M0(starsTransaction.reaction ? 2131744633 : 2131744634, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.M0(2131744624, null));
                    } else if (z8) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.a0(null, null, 2131744850, bc.J0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.M0(2131744791, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.M0(2131744782, null));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(str);
                        l66Var.setVisibility(z3 ? 8 : 0);
                        l66Var.setText(jb6.M0(2131744720, null));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z2 = z7;
                        if (starsTransaction.photo != null) {
                            on5 on5Var2 = new on5(14.0f, i4, l66Var);
                            on5Var2.a(4.0f);
                            on5Var2.f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(on5Var2, 0, 1, 33);
                            on5Var2.b.d0(gn5.p(vuc.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(str);
                            l66Var.setVisibility(z3 ? 8 : 0);
                            String str4 = starsTransaction.title;
                            l66Var.setText(gw3.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), l66Var.getPaint().getFontMetricsInt(), false, null, 0));
                        } else {
                            textView3.setText(str);
                            l66Var.setVisibility(z3 ? 8 : 0);
                            String str5 = starsTransaction.title;
                            l66Var.setText(gw3.m(str5 != null ? str5 : "", l66Var.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        if (z6) {
                            textView3.setText(str);
                            l66Var.setVisibility(0);
                            l66Var.setText(jb6.M0(2131744893, null));
                        } else {
                            textView3.setText(jb6.M0(2131744893, null));
                            l66Var.setVisibility(z3 ? 8 : 0);
                            l66Var.setText(str);
                        }
                        ixaVar.e = 0;
                        int i7 = 0;
                        for (int i8 = 2; i7 < Math.min(i8, starsTransaction.extended_media.size()); i8 = 2) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i7);
                            bf0 bf0Var3 = i7 == 0 ? bf0Var2 : bf0Var;
                            bf0Var3.setRoundRadius(gm.L(12.0f));
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                i2 = 0;
                                gn5 i9 = gn5.i(bc4.w(messageMedia.photo.sizes, gm.L(46.0f), true, null, false), messageMedia.photo);
                                z4 = z7;
                                gn5Var = i9;
                            } else {
                                i2 = 0;
                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                    boolean z16 = z7;
                                    gn5Var = gn5.c(bc4.w(messageMedia.document.thumbs, gm.L(46.0f), true, null, false), messageMedia.document);
                                    z4 = z16;
                                } else {
                                    z4 = z7;
                                    gn5Var = null;
                                }
                            }
                            bf0Var3.setVisibility(i2);
                            Integer num2 = num;
                            bf0Var3.j(gn5Var, "46_46", null, null, null, num2);
                            ixaVar.e++;
                            i7++;
                            z7 = z4;
                            num = num2;
                        }
                        z2 = z7;
                        int i10 = 0;
                        while (i10 < ixaVar.e) {
                            bf0 bf0Var4 = i10 == 0 ? bf0Var2 : bf0Var;
                            float f = i10;
                            bf0Var4.setTranslationX(((f - (ixaVar.e / 2.0f)) * gm.L(4.33f)) + gm.L(2.0f));
                            bf0Var4.setTranslationY((f - (ixaVar.e / 2.0f)) * gm.L(4.33f));
                            i10++;
                        }
                    }
                } else {
                    z2 = z7;
                    if (starsTransaction.floodskip) {
                        textView3.setText(jb6.M0(2131744648, null));
                        l66Var.setText(jb6.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        bf0Var2.setImageDrawable(ixa.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(jb6.M0(2131744635, null));
                            bf0Var2.setImageDrawable(ixa.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(jb6.M0(2131744635, null));
                            bf0Var2.setImageDrawable(ixa.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(jb6.M0(2131744791, null));
                                l66Var.setText(jb6.M0(z2 ? 2131744617 : 2131744614, null));
                                l66Var.setVisibility(0);
                            } else {
                                if (!z6) {
                                    boolean z17 = starsTransaction.refund;
                                    TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                                    if (!z17 ? !starsAmount.negative() : !starsAmount.positive()) {
                                        i = 2131744640;
                                        textView3.setText(jb6.M0(i, null));
                                    }
                                }
                                i = 2131744610;
                                textView3.setText(jb6.M0(i, null));
                            }
                            bf0Var2.setImageDrawable(ixa.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(jb6.M0(2131744650, null));
                            bf0Var2.setImageDrawable(ixa.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(jb6.M0(2131744612, null));
                            bf0Var2.setImageDrawable(ixa.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(jb6.M0(2131744651, null));
                            bf0Var2.setImageDrawable(ixa.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            bf0Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
                j = starsAmount2.amount;
                if (j <= 0 || (j == 0 && starsAmount2.nanos > 0)) {
                    textView2.setVisibility(0);
                    anb.X(textView2, cmb.kk, null);
                    textView2.setText(TextUtils.concat("+", nxa.G0(starsTransaction.amount), " ", !z2 ? spannableString3 : spannableString));
                    z5 = z;
                } else {
                    if (j < 0 || (j == 0 && starsAmount2.nanos < 0)) {
                        textView2.setVisibility(0);
                        anb.X(textView2, cmb.mk, null);
                        textView2.setText(TextUtils.concat(nxa.G0(starsTransaction.amount), " ", z2 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z5 = z;
                }
                ixaVar.E = z5;
                ixaVar.setWillNotDraw(!z5);
            }
            bf0Var2.setImageDrawable(ixa.a(44, "search"));
            textView3.setText(jb6.M0(2131744625, null));
            l66Var.setVisibility(8);
        }
        z2 = z7;
        TL_stars.StarsAmount starsAmount22 = starsTransaction.amount;
        j = starsAmount22.amount;
        if (j <= 0) {
        }
        textView2.setVisibility(0);
        anb.X(textView2, cmb.kk, null);
        textView2.setText(TextUtils.concat("+", nxa.G0(starsTransaction.amount), " ", !z2 ? spannableString3 : spannableString));
        z5 = z;
        ixaVar.E = z5;
        ixaVar.setWillNotDraw(!z5);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ixa(i, ylbVar, context);
    }
}
