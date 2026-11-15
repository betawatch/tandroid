package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.hd;
import org.telegram.messenger.k20;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.p50;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gb extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new gb());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0797  */
    @Override // org.telegram.ui.Components.a41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        SpannableString spannableString;
        int L;
        boolean z11;
        boolean z12;
        String str;
        Object obj;
        int i7;
        boolean z13;
        org.telegram.messenger.gc gcVar;
        int i10;
        String str2;
        long j3;
        boolean z14;
        hb hbVar = (hb) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) b41Var.G;
        boolean z15 = b41Var.q;
        org.telegram.ui.Components.i9 i9Var = hbVar.d;
        SpannableString spannableString2 = hbVar.w;
        SpannableString spannableString3 = hbVar.x;
        org.telegram.ui.Components.t8 t8Var = hbVar.b;
        int i11 = hbVar.a;
        TextView textView = hbVar.r;
        TextView textView2 = hbVar.s;
        org.telegram.ui.Components.i9 i9Var2 = hbVar.c;
        TextView textView3 = hbVar.f;
        Integer num = 0;
        z70 z70Var = hbVar.n;
        long o4 = org.telegram.messenger.m5.o(starsTransaction.peer.peer);
        boolean z16 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i12 = starsTransaction.flags;
        boolean z17 = (i12 & 131072) == 0 && (i12 & 65536) != 0;
        boolean z18 = !(o4 == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        hbVar.y = z18;
        boolean z19 = z18;
        LinearLayout.LayoutParams layoutParams = hbVar.h;
        if (z19) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = org.telegram.messenger.g0.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        z70Var.setVisibility(hbVar.y ? 0 : 8);
        textView.setTextSize(1, hbVar.y ? 13.0f : 14.0f);
        textView.setText(hd.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", hd.M0(2131745030, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", hd.M0(2131745110, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", hd.M0(2131745053, null)));
        }
        i9Var2.setTranslationX(0.0f);
        i9Var2.setTranslationY(0.0f);
        i9Var.setVisibility(8);
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            i9Var2.setImageDrawable(new n5(i9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(hd.M0(2131749923, null));
            z70Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            i9Var2.setImageDrawable(new n5(i9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(hd.M0(2131749925, null));
            z70Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (o4 != 0) {
                    if (q10.A(o4)) {
                        str = hd.M0(2131744925, null);
                        i9Var2.setImageDrawable(hb.a(44, "fragment"));
                        z12 = false;
                    } else if (o4 >= 0) {
                        TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(o4));
                        z12 = a22 == null;
                        t8Var.r(a22);
                        i9Var2.f(a22, t8Var);
                        str = q10.p(a22);
                    } else {
                        TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(-o4));
                        z12 = M0 == null;
                        t8Var.q(M0);
                        i9Var2.f(M0, t8Var);
                        str = M0 == null ? "" : M0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        p50 p50Var = new p50(16.0f, i11, z70Var);
                        p50Var.a(4.0f);
                        p50Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(p50Var, 0, 1, 33);
                        mb.d1(p50Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(starsTransaction.stargift.getDocument(), z70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) hd.M0(starsTransaction.refund ? 2131745213 : 2131745218, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) hd.M0(starsTransaction.refund ? 2131745217 : 2131745214, null));
                            }
                            z70Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(starsTransaction.stargift.getDocument(), z70Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) hd.M0(starsTransaction.refund ? 2131745213 : 2131745216, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) hd.M0(starsTransaction.refund ? 2131745215 : 2131745214, null));
                            }
                            z70Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            z70Var.setText(TextUtils.concat(spannableString4, " ", hd.M0(2131749930, null)));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            z70Var.setText(hd.M0(starsTransaction.refund ? 2131745211 : 2131745212, null));
                        } else if (starsTransaction.refund) {
                            z70Var.setText(TextUtils.concat(spannableString4, " ", hd.M0(starsTransaction.stargift_auction_bid ? 2131749929 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749926 : 2131749927 : 2131749928, null)));
                        } else {
                            if (starsTransaction.stargift_auction_bid) {
                                i10 = 2131749932;
                            } else if (starsTransaction.amount.amount > 0) {
                                i10 = 2131749931;
                            } else if (starsTransaction.stargift_upgrade) {
                                str2 = null;
                                i10 = 2131749923;
                                z70Var.setText(TextUtils.concat(spannableString4, " ", hd.M0(i10, str2)));
                            } else {
                                i10 = 2131749924;
                            }
                            str2 = null;
                            z70Var.setText(TextUtils.concat(spannableString4, " ", hd.M0(i10, str2)));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i13 = starsTransaction.subscription_period;
                        if (i13 == 2592000) {
                            z70Var.setVisibility(0);
                            z70Var.setText(hd.M0(2131744930, null));
                        } else {
                            String str3 = i13 == 300 ? "5 minutes" : "Minute";
                            z70Var.setVisibility(0);
                            Locale locale = Locale.US;
                            z70Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        z70Var.setVisibility(z12 ? 8 : 0);
                        z70Var.setText(hd.M0(starsTransaction.reaction ? 2131744944 : 2131744945, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        z70Var.setVisibility(z12 ? 8 : 0);
                        z70Var.setText(hd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        z70Var.setVisibility(z12 ? 8 : 0);
                        z70Var.setText(hd.M0(2131744935, null));
                    } else if (z17) {
                        textView3.setText(str);
                        z70Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        z70Var.setText(hd.a0(null, null, 2131745161, ki.k.J0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        z70Var.setVisibility(z12 ? 8 : 0);
                        z70Var.setText(hd.M0(2131745102, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        z70Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        z70Var.setText(hd.M0(2131745093, null));
                    } else {
                        obj = null;
                        if (starsTransaction.reaction) {
                            textView3.setText(str);
                            z70Var.setVisibility(z12 ? 8 : 0);
                            z70Var.setText(hd.M0(2131745031, null));
                        } else if (starsTransaction.extended_media.isEmpty()) {
                            z11 = z16;
                            if (starsTransaction.photo != null) {
                                p50 p50Var2 = new p50(14.0f, i11, z70Var);
                                p50Var2.a(4.0f);
                                p50Var2.f = false;
                                SpannableString spannableString5 = new SpannableString("x");
                                spannableString5.setSpan(p50Var2, 0, 1, 33);
                                p50Var2.b.q0(org.telegram.messenger.gc.p(k20.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                                textView3.setText(str);
                                z70Var.setVisibility(z12 ? 8 : 0);
                                String str4 = starsTransaction.title;
                                z70Var.setText(org.telegram.messenger.j6.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), z70Var.getPaint().getFontMetricsInt(), false, null, 0));
                            } else {
                                textView3.setText(str);
                                z70Var.setVisibility(z12 ? 8 : 0);
                                String str5 = starsTransaction.title;
                                z70Var.setText(org.telegram.messenger.j6.m(str5 != null ? str5 : "", z70Var.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            if (z15) {
                                textView3.setText(str);
                                z70Var.setVisibility(0);
                                z70Var.setText(hd.M0(2131745204, null));
                            } else {
                                textView3.setText(hd.M0(2131745204, null));
                                z70Var.setVisibility(z12 ? 8 : 0);
                                z70Var.setText(str);
                            }
                            hbVar.e = 0;
                            int i14 = 0;
                            for (int i15 = 2; i14 < Math.min(i15, starsTransaction.extended_media.size()); i15 = 2) {
                                TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i14);
                                org.telegram.ui.Components.i9 i9Var3 = i14 == 0 ? i9Var2 : i9Var;
                                i9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                    i7 = 0;
                                    org.telegram.messenger.gc i16 = org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.photo);
                                    z13 = z16;
                                    gcVar = i16;
                                } else {
                                    i7 = 0;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                        boolean z20 = z16;
                                        gcVar = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.document);
                                        z13 = z20;
                                    } else {
                                        z13 = z16;
                                        gcVar = null;
                                    }
                                }
                                i9Var3.setVisibility(i7);
                                Integer num2 = num;
                                i9Var3.m(gcVar, "46_46", null, null, null, num2);
                                hbVar.e++;
                                i14++;
                                z16 = z13;
                                num = num2;
                            }
                            z11 = z16;
                            int i17 = 0;
                            while (i17 < hbVar.e) {
                                org.telegram.ui.Components.i9 i9Var4 = i17 == 0 ? i9Var2 : i9Var;
                                float f10 = i17;
                                i9Var4.setTranslationX(((f10 - (hbVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f)) + org.telegram.messenger.g0.L(2.0f));
                                i9Var4.setTranslationY((f10 - (hbVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f));
                                i17++;
                            }
                        }
                    }
                    z11 = z16;
                } else {
                    z11 = z16;
                    if (starsTransaction.floodskip) {
                        textView3.setText(hd.M0(2131744959, null));
                        z70Var.setText(hd.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        i9Var2.setImageDrawable(hb.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(hd.M0(2131744946, null));
                            i9Var2.setImageDrawable(hb.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(hd.M0(2131744946, null));
                            i9Var2.setImageDrawable(hb.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(hd.M0(2131745102, null));
                                z70Var.setText(hd.M0(z11 ? 2131744928 : 2131744925, null));
                                z70Var.setVisibility(0);
                            } else {
                                textView3.setText(hd.M0((z15 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? 2131744921 : 2131744951, null));
                            }
                            i9Var2.setImageDrawable(hb.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(hd.M0(2131744961, null));
                            i9Var2.setImageDrawable(hb.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(hd.M0(2131744923, null));
                            i9Var2.setImageDrawable(hb.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(hd.M0(2131744962, null));
                            i9Var2.setImageDrawable(hb.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            i9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j3 = starsAmount.amount;
                if (j3 <= 0 || (j3 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.lk, null);
                    textView2.setText(TextUtils.concat("+", mb.L0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z14 = z10;
                } else {
                    if (j3 < 0 || (j3 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.nk, null);
                        textView2.setText(TextUtils.concat(mb.L0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z14 = z10;
                }
                hbVar.E = z14;
                hbVar.setWillNotDraw(!z14);
            }
            i9Var2.setImageDrawable(hb.a(44, "search"));
            textView3.setText(hd.M0(2131744936, null));
            z70Var.setVisibility(8);
        }
        z11 = z16;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j3 = starsAmount2.amount;
        if (j3 <= 0) {
        }
        textView2.setVisibility(0);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.lk, null);
        textView2.setText(TextUtils.concat("+", mb.L0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z14 = z10;
        hbVar.E = z14;
        hbVar.setWillNotDraw(!z14);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new hb(i7, context, e6Var);
    }
}
