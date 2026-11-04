package ci;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.e20;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.k50;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qb extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new qb());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0797  */
    @Override // org.telegram.ui.Components.q31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        SpannableString spannableString;
        int L;
        boolean z11;
        boolean z12;
        String str;
        Object obj;
        int i3;
        boolean z13;
        org.telegram.messenger.ac acVar;
        int i10;
        String str2;
        long j10;
        boolean z14;
        rb rbVar = (rb) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) r31Var.G;
        boolean z15 = r31Var.q;
        org.telegram.ui.Components.k9 k9Var = rbVar.d;
        SpannableString spannableString2 = rbVar.w;
        SpannableString spannableString3 = rbVar.x;
        org.telegram.ui.Components.u8 u8Var = rbVar.b;
        int i11 = rbVar.a;
        TextView textView = rbVar.r;
        TextView textView2 = rbVar.s;
        org.telegram.ui.Components.k9 k9Var2 = rbVar.c;
        TextView textView3 = rbVar.f;
        Integer num = 0;
        s70 s70Var = rbVar.n;
        long o10 = org.telegram.messenger.m5.o(starsTransaction.peer.peer);
        boolean z16 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i12 = starsTransaction.flags;
        boolean z17 = (i12 & 131072) == 0 && (i12 & 65536) != 0;
        boolean z18 = !(o10 == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        rbVar.y = z18;
        boolean z19 = z18;
        LinearLayout.LayoutParams layoutParams = rbVar.h;
        if (z19) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = org.telegram.messenger.g0.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        s70Var.setVisibility(rbVar.y ? 0 : 8);
        textView.setTextSize(1, rbVar.y ? 13.0f : 14.0f);
        textView.setText(bd.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", bd.M0(2131745040, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", bd.M0(2131745120, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", bd.M0(2131745063, null)));
        }
        k9Var2.setTranslationX(0.0f);
        k9Var2.setTranslationY(0.0f);
        k9Var.setVisibility(8);
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            k9Var2.setImageDrawable(new w5(k9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(bd.M0(2131749931, null));
            s70Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            k9Var2.setImageDrawable(new w5(k9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(bd.M0(2131749933, null));
            s70Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (o10 != 0) {
                    if (l10.A(o10)) {
                        str = bd.M0(2131744935, null);
                        k9Var2.setImageDrawable(rb.a(44, "fragment"));
                        z12 = false;
                    } else if (o10 >= 0) {
                        TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(o10));
                        z12 = a22 == null;
                        u8Var.r(a22);
                        k9Var2.e(a22, u8Var);
                        str = l10.p(a22);
                    } else {
                        TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-o10));
                        z12 = M0 == null;
                        u8Var.q(M0);
                        k9Var2.e(M0, u8Var);
                        str = M0 == null ? "" : M0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        k50 k50Var = new k50(16.0f, i11, s70Var);
                        k50Var.a(4.0f);
                        k50Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(k50Var, 0, 1, 33);
                        wb.d1(k50Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(starsTransaction.stargift.getDocument(), s70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) bd.M0(starsTransaction.refund ? 2131745223 : 2131745228, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) bd.M0(starsTransaction.refund ? 2131745227 : 2131745224, null));
                            }
                            s70Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(starsTransaction.stargift.getDocument(), s70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) bd.M0(starsTransaction.refund ? 2131745223 : 2131745226, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) bd.M0(starsTransaction.refund ? 2131745225 : 2131745224, null));
                            }
                            s70Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            s70Var.setText(TextUtils.concat(spannableString4, " ", bd.M0(2131749938, null)));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            s70Var.setText(bd.M0(starsTransaction.refund ? 2131745221 : 2131745222, null));
                        } else if (starsTransaction.refund) {
                            s70Var.setText(TextUtils.concat(spannableString4, " ", bd.M0(starsTransaction.stargift_auction_bid ? 2131749937 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749934 : 2131749935 : 2131749936, null)));
                        } else {
                            if (starsTransaction.stargift_auction_bid) {
                                i10 = 2131749940;
                            } else if (starsTransaction.amount.amount > 0) {
                                i10 = 2131749939;
                            } else if (starsTransaction.stargift_upgrade) {
                                str2 = null;
                                i10 = 2131749931;
                                s70Var.setText(TextUtils.concat(spannableString4, " ", bd.M0(i10, str2)));
                            } else {
                                i10 = 2131749932;
                            }
                            str2 = null;
                            s70Var.setText(TextUtils.concat(spannableString4, " ", bd.M0(i10, str2)));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i13 = starsTransaction.subscription_period;
                        if (i13 == 2592000) {
                            s70Var.setVisibility(0);
                            s70Var.setText(bd.M0(2131744940, null));
                        } else {
                            String str3 = i13 == 300 ? "5 minutes" : "Minute";
                            s70Var.setVisibility(0);
                            Locale locale = Locale.US;
                            s70Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        s70Var.setVisibility(z12 ? 8 : 0);
                        s70Var.setText(bd.M0(starsTransaction.reaction ? 2131744954 : 2131744955, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        s70Var.setVisibility(z12 ? 8 : 0);
                        s70Var.setText(bd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        s70Var.setVisibility(z12 ? 8 : 0);
                        s70Var.setText(bd.M0(2131744945, null));
                    } else if (z17) {
                        textView3.setText(str);
                        s70Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        s70Var.setText(bd.a0(null, null, 2131745171, ii.k.J0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        s70Var.setVisibility(z12 ? 8 : 0);
                        s70Var.setText(bd.M0(2131745112, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        s70Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        s70Var.setText(bd.M0(2131745103, null));
                    } else {
                        obj = null;
                        if (starsTransaction.reaction) {
                            textView3.setText(str);
                            s70Var.setVisibility(z12 ? 8 : 0);
                            s70Var.setText(bd.M0(2131745041, null));
                        } else if (starsTransaction.extended_media.isEmpty()) {
                            z11 = z16;
                            if (starsTransaction.photo != null) {
                                k50 k50Var2 = new k50(14.0f, i11, s70Var);
                                k50Var2.a(4.0f);
                                k50Var2.f = false;
                                SpannableString spannableString5 = new SpannableString("x");
                                spannableString5.setSpan(k50Var2, 0, 1, 33);
                                k50Var2.b.q0(org.telegram.messenger.ac.p(e20.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                                textView3.setText(str);
                                s70Var.setVisibility(z12 ? 8 : 0);
                                String str4 = starsTransaction.title;
                                s70Var.setText(org.telegram.messenger.i6.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), s70Var.getPaint().getFontMetricsInt(), false, null, 0));
                            } else {
                                textView3.setText(str);
                                s70Var.setVisibility(z12 ? 8 : 0);
                                String str5 = starsTransaction.title;
                                s70Var.setText(org.telegram.messenger.i6.m(str5 != null ? str5 : "", s70Var.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            if (z15) {
                                textView3.setText(str);
                                s70Var.setVisibility(0);
                                s70Var.setText(bd.M0(2131745214, null));
                            } else {
                                textView3.setText(bd.M0(2131745214, null));
                                s70Var.setVisibility(z12 ? 8 : 0);
                                s70Var.setText(str);
                            }
                            rbVar.e = 0;
                            int i14 = 0;
                            for (int i15 = 2; i14 < Math.min(i15, starsTransaction.extended_media.size()); i15 = 2) {
                                TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i14);
                                org.telegram.ui.Components.k9 k9Var3 = i14 == 0 ? k9Var2 : k9Var;
                                k9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                    i3 = 0;
                                    org.telegram.messenger.ac i16 = org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.photo);
                                    z13 = z16;
                                    acVar = i16;
                                } else {
                                    i3 = 0;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                        boolean z20 = z16;
                                        acVar = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.document);
                                        z13 = z20;
                                    } else {
                                        z13 = z16;
                                        acVar = null;
                                    }
                                }
                                k9Var3.setVisibility(i3);
                                Integer num2 = num;
                                k9Var3.m(acVar, "46_46", null, null, null, num2);
                                rbVar.e++;
                                i14++;
                                z16 = z13;
                                num = num2;
                            }
                            z11 = z16;
                            int i17 = 0;
                            while (i17 < rbVar.e) {
                                org.telegram.ui.Components.k9 k9Var4 = i17 == 0 ? k9Var2 : k9Var;
                                float f10 = i17;
                                k9Var4.setTranslationX(((f10 - (rbVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f)) + org.telegram.messenger.g0.L(2.0f));
                                k9Var4.setTranslationY((f10 - (rbVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f));
                                i17++;
                            }
                        }
                    }
                    z11 = z16;
                } else {
                    z11 = z16;
                    if (starsTransaction.floodskip) {
                        textView3.setText(bd.M0(2131744969, null));
                        s70Var.setText(bd.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        k9Var2.setImageDrawable(rb.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(bd.M0(2131744956, null));
                            k9Var2.setImageDrawable(rb.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(bd.M0(2131744956, null));
                            k9Var2.setImageDrawable(rb.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(bd.M0(2131745112, null));
                                s70Var.setText(bd.M0(z11 ? 2131744938 : 2131744935, null));
                                s70Var.setVisibility(0);
                            } else {
                                textView3.setText(bd.M0((z15 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? 2131744931 : 2131744961, null));
                            }
                            k9Var2.setImageDrawable(rb.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(bd.M0(2131744971, null));
                            k9Var2.setImageDrawable(rb.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(bd.M0(2131744933, null));
                            k9Var2.setImageDrawable(rb.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(bd.M0(2131744972, null));
                            k9Var2.setImageDrawable(rb.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            k9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ik, null);
                    textView2.setText(TextUtils.concat("+", wb.L0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z14 = z10;
                } else {
                    if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.kk, null);
                        textView2.setText(TextUtils.concat(wb.L0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z14 = z10;
                }
                rbVar.E = z14;
                rbVar.setWillNotDraw(!z14);
            }
            k9Var2.setImageDrawable(rb.a(44, "search"));
            textView3.setText(bd.M0(2131744946, null));
            s70Var.setVisibility(8);
        }
        z11 = z16;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
        }
        textView2.setVisibility(0);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.ik, null);
        textView2.setText(TextUtils.concat("+", wb.L0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z14 = z10;
        rbVar.E = z14;
        rbVar.setWillNotDraw(!z14);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new rb(i3, context, e6Var);
    }
}
