package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.q50;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class xc extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new xc());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0797  */
    @Override // org.telegram.ui.Components.w31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        SpannableString spannableString;
        int L;
        boolean z10;
        boolean z11;
        String str;
        Object obj;
        int i7;
        boolean z12;
        org.telegram.messenger.hc hcVar;
        int i10;
        String str2;
        long j3;
        boolean z13;
        yc ycVar = (yc) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) x31Var.G;
        boolean z14 = x31Var.q;
        org.telegram.ui.Components.l9 l9Var = ycVar.d;
        SpannableString spannableString2 = ycVar.w;
        SpannableString spannableString3 = ycVar.x;
        org.telegram.ui.Components.w8 w8Var = ycVar.b;
        int i11 = ycVar.a;
        TextView textView = ycVar.r;
        TextView textView2 = ycVar.s;
        org.telegram.ui.Components.l9 l9Var2 = ycVar.c;
        TextView textView3 = ycVar.f;
        Integer num = 0;
        w70 w70Var = ycVar.n;
        long o4 = org.telegram.messenger.m5.o(starsTransaction.peer.peer);
        boolean z15 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i12 = starsTransaction.flags;
        boolean z16 = (i12 & 131072) == 0 && (i12 & 65536) != 0;
        boolean z17 = !(o4 == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        ycVar.y = z17;
        boolean z18 = z17;
        LinearLayout.LayoutParams layoutParams = ycVar.h;
        if (z18) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = org.telegram.messenger.g0.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        w70Var.setVisibility(ycVar.y ? 0 : 8);
        textView.setTextSize(1, ycVar.y ? 13.0f : 14.0f);
        textView.setText(org.telegram.messenger.id.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", org.telegram.messenger.id.M0(2131745033, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", org.telegram.messenger.id.M0(2131745113, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", org.telegram.messenger.id.M0(2131745056, null)));
        }
        l9Var2.setTranslationX(0.0f);
        l9Var2.setTranslationY(0.0f);
        l9Var.setVisibility(8);
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            l9Var2.setImageDrawable(new u6(l9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(org.telegram.messenger.id.M0(2131749924, null));
            w70Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            l9Var2.setImageDrawable(new u6(l9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(org.telegram.messenger.id.M0(2131749926, null));
            w70Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (o4 != 0) {
                    if (t10.A(o4)) {
                        str = org.telegram.messenger.id.M0(2131744928, null);
                        l9Var2.setImageDrawable(yc.a(44, "fragment"));
                        z11 = false;
                    } else if (o4 >= 0) {
                        TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(o4));
                        z11 = a22 == null;
                        w8Var.r(a22);
                        l9Var2.e(a22, w8Var);
                        str = t10.p(a22);
                    } else {
                        TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-o4));
                        z11 = M0 == null;
                        w8Var.q(M0);
                        l9Var2.e(M0, w8Var);
                        str = M0 == null ? "" : M0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        q50 q50Var = new q50(16.0f, i11, w70Var);
                        q50Var.a(4.0f);
                        q50Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(q50Var, 0, 1, 33);
                        dd.d1(q50Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(starsTransaction.stargift.getDocument(), w70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(starsTransaction.refund ? 2131745216 : 2131745221, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(starsTransaction.refund ? 2131745220 : 2131745217, null));
                            }
                            w70Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r5(starsTransaction.stargift.getDocument(), w70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(starsTransaction.refund ? 2131745216 : 2131745219, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(starsTransaction.refund ? 2131745218 : 2131745217, null));
                            }
                            w70Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            w70Var.setText(TextUtils.concat(spannableString4, " ", org.telegram.messenger.id.M0(2131749931, null)));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            w70Var.setText(org.telegram.messenger.id.M0(starsTransaction.refund ? 2131745214 : 2131745215, null));
                        } else if (starsTransaction.refund) {
                            w70Var.setText(TextUtils.concat(spannableString4, " ", org.telegram.messenger.id.M0(starsTransaction.stargift_auction_bid ? 2131749930 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749927 : 2131749928 : 2131749929, null)));
                        } else {
                            if (starsTransaction.stargift_auction_bid) {
                                i10 = 2131749933;
                            } else if (starsTransaction.amount.amount > 0) {
                                i10 = 2131749932;
                            } else if (starsTransaction.stargift_upgrade) {
                                str2 = null;
                                i10 = 2131749924;
                                w70Var.setText(TextUtils.concat(spannableString4, " ", org.telegram.messenger.id.M0(i10, str2)));
                            } else {
                                i10 = 2131749925;
                            }
                            str2 = null;
                            w70Var.setText(TextUtils.concat(spannableString4, " ", org.telegram.messenger.id.M0(i10, str2)));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i13 = starsTransaction.subscription_period;
                        if (i13 == 2592000) {
                            w70Var.setVisibility(0);
                            w70Var.setText(org.telegram.messenger.id.M0(2131744933, null));
                        } else {
                            String str3 = i13 == 300 ? "5 minutes" : "Minute";
                            w70Var.setVisibility(0);
                            Locale locale = Locale.US;
                            w70Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        w70Var.setVisibility(z11 ? 8 : 0);
                        w70Var.setText(org.telegram.messenger.id.M0(starsTransaction.reaction ? 2131744947 : 2131744948, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        w70Var.setVisibility(z11 ? 8 : 0);
                        w70Var.setText(org.telegram.messenger.id.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        w70Var.setVisibility(z11 ? 8 : 0);
                        w70Var.setText(org.telegram.messenger.id.M0(2131744938, null));
                    } else if (z16) {
                        textView3.setText(str);
                        w70Var.setVisibility(z11 ? 8 : 0);
                        obj = null;
                        w70Var.setText(org.telegram.messenger.id.a0(null, null, 2131745164, hi.j.J0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        w70Var.setVisibility(z11 ? 8 : 0);
                        w70Var.setText(org.telegram.messenger.id.M0(2131745105, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        w70Var.setVisibility(z11 ? 8 : 0);
                        obj = null;
                        w70Var.setText(org.telegram.messenger.id.M0(2131745096, null));
                    } else {
                        obj = null;
                        if (starsTransaction.reaction) {
                            textView3.setText(str);
                            w70Var.setVisibility(z11 ? 8 : 0);
                            w70Var.setText(org.telegram.messenger.id.M0(2131745034, null));
                        } else if (starsTransaction.extended_media.isEmpty()) {
                            z10 = z15;
                            if (starsTransaction.photo != null) {
                                q50 q50Var2 = new q50(14.0f, i11, w70Var);
                                q50Var2.a(4.0f);
                                q50Var2.f = false;
                                SpannableString spannableString5 = new SpannableString("x");
                                spannableString5.setSpan(q50Var2, 0, 1, 33);
                                q50Var2.b.q0(org.telegram.messenger.hc.p(m20.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                                textView3.setText(str);
                                w70Var.setVisibility(z11 ? 8 : 0);
                                String str4 = starsTransaction.title;
                                w70Var.setText(org.telegram.messenger.i6.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), w70Var.getPaint().getFontMetricsInt(), false, null, 0));
                            } else {
                                textView3.setText(str);
                                w70Var.setVisibility(z11 ? 8 : 0);
                                String str5 = starsTransaction.title;
                                w70Var.setText(org.telegram.messenger.i6.m(str5 != null ? str5 : "", w70Var.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            if (z14) {
                                textView3.setText(str);
                                w70Var.setVisibility(0);
                                w70Var.setText(org.telegram.messenger.id.M0(2131745207, null));
                            } else {
                                textView3.setText(org.telegram.messenger.id.M0(2131745207, null));
                                w70Var.setVisibility(z11 ? 8 : 0);
                                w70Var.setText(str);
                            }
                            ycVar.e = 0;
                            int i14 = 0;
                            for (int i15 = 2; i14 < Math.min(i15, starsTransaction.extended_media.size()); i15 = 2) {
                                TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i14);
                                org.telegram.ui.Components.l9 l9Var3 = i14 == 0 ? l9Var2 : l9Var;
                                l9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                    i7 = 0;
                                    org.telegram.messenger.hc i16 = org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.photo);
                                    z12 = z15;
                                    hcVar = i16;
                                } else {
                                    i7 = 0;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                        boolean z19 = z15;
                                        hcVar = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.document);
                                        z12 = z19;
                                    } else {
                                        z12 = z15;
                                        hcVar = null;
                                    }
                                }
                                l9Var3.setVisibility(i7);
                                Integer num2 = num;
                                l9Var3.m(hcVar, "46_46", null, null, null, num2);
                                ycVar.e++;
                                i14++;
                                z15 = z12;
                                num = num2;
                            }
                            z10 = z15;
                            int i17 = 0;
                            while (i17 < ycVar.e) {
                                org.telegram.ui.Components.l9 l9Var4 = i17 == 0 ? l9Var2 : l9Var;
                                float f10 = i17;
                                l9Var4.setTranslationX(((f10 - (ycVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f)) + org.telegram.messenger.g0.L(2.0f));
                                l9Var4.setTranslationY((f10 - (ycVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f));
                                i17++;
                            }
                        }
                    }
                    z10 = z15;
                } else {
                    z10 = z15;
                    if (starsTransaction.floodskip) {
                        textView3.setText(org.telegram.messenger.id.M0(2131744962, null));
                        w70Var.setText(org.telegram.messenger.id.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        l9Var2.setImageDrawable(yc.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(org.telegram.messenger.id.M0(2131744949, null));
                            l9Var2.setImageDrawable(yc.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(org.telegram.messenger.id.M0(2131744949, null));
                            l9Var2.setImageDrawable(yc.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(org.telegram.messenger.id.M0(2131745105, null));
                                w70Var.setText(org.telegram.messenger.id.M0(z10 ? 2131744931 : 2131744928, null));
                                w70Var.setVisibility(0);
                            } else {
                                textView3.setText(org.telegram.messenger.id.M0((z14 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? 2131744924 : 2131744954, null));
                            }
                            l9Var2.setImageDrawable(yc.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(org.telegram.messenger.id.M0(2131744964, null));
                            l9Var2.setImageDrawable(yc.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(org.telegram.messenger.id.M0(2131744926, null));
                            l9Var2.setImageDrawable(yc.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(org.telegram.messenger.id.M0(2131744965, null));
                            l9Var2.setImageDrawable(yc.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            l9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j3 = starsAmount.amount;
                if (j3 <= 0 || (j3 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ik, null);
                    textView2.setText(TextUtils.concat("+", dd.L0(starsTransaction.amount), " ", !z10 ? spannableString3 : spannableString));
                    z13 = z9;
                } else {
                    if (j3 < 0 || (j3 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.kk, null);
                        textView2.setText(TextUtils.concat(dd.L0(starsTransaction.amount), " ", z10 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z13 = z9;
                }
                ycVar.D = z13;
                ycVar.setWillNotDraw(!z13);
            }
            l9Var2.setImageDrawable(yc.a(44, "search"));
            textView3.setText(org.telegram.messenger.id.M0(2131744939, null));
            w70Var.setVisibility(8);
        }
        z10 = z15;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j3 = starsAmount2.amount;
        if (j3 <= 0) {
        }
        textView2.setVisibility(0);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ik, null);
        textView2.setText(TextUtils.concat("+", dd.L0(starsTransaction.amount), " ", !z10 ? spannableString3 : spannableString));
        z13 = z9;
        ycVar.D = z13;
        ycVar.setWillNotDraw(!z13);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new yc(i7, context, f6Var);
    }
}
