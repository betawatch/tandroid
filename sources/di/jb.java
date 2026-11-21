package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jb extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new jb());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0797  */
    @Override // org.telegram.ui.Components.n41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        SpannableString spannableString;
        int L;
        boolean z11;
        boolean z12;
        String str;
        Object obj;
        int i7;
        boolean z13;
        org.telegram.messenger.fc fcVar;
        int i10;
        String str2;
        long j3;
        boolean z14;
        kb kbVar = (kb) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) o41Var.H;
        boolean z15 = o41Var.r;
        org.telegram.ui.Components.q9 q9Var = kbVar.d;
        SpannableString spannableString2 = kbVar.w;
        SpannableString spannableString3 = kbVar.x;
        org.telegram.ui.Components.b9 b9Var = kbVar.b;
        int i11 = kbVar.a;
        TextView textView = kbVar.r;
        TextView textView2 = kbVar.s;
        org.telegram.ui.Components.q9 q9Var2 = kbVar.c;
        TextView textView3 = kbVar.f;
        Integer num = 0;
        m80 m80Var = kbVar.n;
        long o4 = org.telegram.messenger.n5.o(starsTransaction.peer.peer);
        boolean z16 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i12 = starsTransaction.flags;
        boolean z17 = (i12 & 131072) == 0 && (i12 & 65536) != 0;
        boolean z18 = !(o4 == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        kbVar.y = z18;
        boolean z19 = z18;
        LinearLayout.LayoutParams layoutParams = kbVar.h;
        if (z19) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = org.telegram.messenger.g0.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        m80Var.setVisibility(kbVar.y ? 0 : 8);
        textView.setTextSize(1, kbVar.y ? 13.0f : 14.0f);
        textView.setText(gd.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", gd.N0(2131744789, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", gd.N0(2131744869, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", gd.N0(2131744812, null)));
        }
        q9Var2.setTranslationX(0.0f);
        q9Var2.setTranslationY(0.0f);
        q9Var.setVisibility(8);
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            q9Var2.setImageDrawable(new q5(q9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(gd.N0(2131749906, null));
            m80Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            q9Var2.setImageDrawable(new q5(q9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(gd.N0(2131749908, null));
            m80Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (o4 != 0) {
                    if (o10.B(o4)) {
                        str = gd.N0(2131744684, null);
                        q9Var2.setImageDrawable(kb.a(44, "fragment"));
                        z12 = false;
                    } else if (o4 >= 0) {
                        TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(o4));
                        z12 = c22 == null;
                        b9Var.r(c22);
                        q9Var2.f(c22, b9Var);
                        str = o10.q(c22);
                    } else {
                        TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(-o4));
                        z12 = O0 == null;
                        b9Var.q(O0);
                        q9Var2.f(O0, b9Var);
                        str = O0 == null ? "" : O0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        r50 r50Var = new r50(16.0f, i11, m80Var);
                        r50Var.a(4.0f);
                        r50Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(r50Var, 0, 1, 33);
                        pb.e1(r50Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(starsTransaction.stargift.getDocument(), m80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) gd.N0(starsTransaction.refund ? 2131744972 : 2131744977, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) gd.N0(starsTransaction.refund ? 2131744976 : 2131744973, null));
                            }
                            m80Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(starsTransaction.stargift.getDocument(), m80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) gd.N0(starsTransaction.refund ? 2131744972 : 2131744975, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) gd.N0(starsTransaction.refund ? 2131744974 : 2131744973, null));
                            }
                            m80Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            m80Var.setText(TextUtils.concat(spannableString4, " ", gd.N0(2131749913, null)));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            m80Var.setText(gd.N0(starsTransaction.refund ? 2131744970 : 2131744971, null));
                        } else if (starsTransaction.refund) {
                            m80Var.setText(TextUtils.concat(spannableString4, " ", gd.N0(starsTransaction.stargift_auction_bid ? 2131749912 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749909 : 2131749910 : 2131749911, null)));
                        } else {
                            if (starsTransaction.stargift_auction_bid) {
                                i10 = 2131749915;
                            } else if (starsTransaction.amount.amount > 0) {
                                i10 = 2131749914;
                            } else if (starsTransaction.stargift_upgrade) {
                                str2 = null;
                                i10 = 2131749906;
                                m80Var.setText(TextUtils.concat(spannableString4, " ", gd.N0(i10, str2)));
                            } else {
                                i10 = 2131749907;
                            }
                            str2 = null;
                            m80Var.setText(TextUtils.concat(spannableString4, " ", gd.N0(i10, str2)));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i13 = starsTransaction.subscription_period;
                        if (i13 == 2592000) {
                            m80Var.setVisibility(0);
                            m80Var.setText(gd.N0(2131744689, null));
                        } else {
                            String str3 = i13 == 300 ? "5 minutes" : "Minute";
                            m80Var.setVisibility(0);
                            Locale locale = Locale.US;
                            m80Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        m80Var.setVisibility(z12 ? 8 : 0);
                        m80Var.setText(gd.N0(starsTransaction.reaction ? 2131744703 : 2131744704, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        m80Var.setVisibility(z12 ? 8 : 0);
                        m80Var.setText(gd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        m80Var.setVisibility(z12 ? 8 : 0);
                        m80Var.setText(gd.N0(2131744694, null));
                    } else if (z17) {
                        textView3.setText(str);
                        m80Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        m80Var.setText(gd.a0(null, null, 2131744920, ki.j.J0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        m80Var.setVisibility(z12 ? 8 : 0);
                        m80Var.setText(gd.N0(2131744861, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        m80Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        m80Var.setText(gd.N0(2131744852, null));
                    } else {
                        obj = null;
                        if (starsTransaction.reaction) {
                            textView3.setText(str);
                            m80Var.setVisibility(z12 ? 8 : 0);
                            m80Var.setText(gd.N0(2131744790, null));
                        } else if (starsTransaction.extended_media.isEmpty()) {
                            z11 = z16;
                            if (starsTransaction.photo != null) {
                                r50 r50Var2 = new r50(14.0f, i11, m80Var);
                                r50Var2.a(4.0f);
                                r50Var2.f = false;
                                SpannableString spannableString5 = new SpannableString("x");
                                spannableString5.setSpan(r50Var2, 0, 1, 33);
                                r50Var2.b.q0(org.telegram.messenger.fc.p(h20.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                                textView3.setText(str);
                                m80Var.setVisibility(z12 ? 8 : 0);
                                String str4 = starsTransaction.title;
                                m80Var.setText(org.telegram.messenger.j6.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), m80Var.getPaint().getFontMetricsInt(), false, null, 0));
                            } else {
                                textView3.setText(str);
                                m80Var.setVisibility(z12 ? 8 : 0);
                                String str5 = starsTransaction.title;
                                m80Var.setText(org.telegram.messenger.j6.m(str5 != null ? str5 : "", m80Var.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            if (z15) {
                                textView3.setText(str);
                                m80Var.setVisibility(0);
                                m80Var.setText(gd.N0(2131744963, null));
                            } else {
                                textView3.setText(gd.N0(2131744963, null));
                                m80Var.setVisibility(z12 ? 8 : 0);
                                m80Var.setText(str);
                            }
                            kbVar.e = 0;
                            int i14 = 0;
                            for (int i15 = 2; i14 < Math.min(i15, starsTransaction.extended_media.size()); i15 = 2) {
                                TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i14);
                                org.telegram.ui.Components.q9 q9Var3 = i14 == 0 ? q9Var2 : q9Var;
                                q9Var3.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
                                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                    i7 = 0;
                                    org.telegram.messenger.fc i16 = org.telegram.messenger.fc.i(org.telegram.messenger.w7.w(messageMedia.photo.sizes, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.photo);
                                    z13 = z16;
                                    fcVar = i16;
                                } else {
                                    i7 = 0;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                        boolean z20 = z16;
                                        fcVar = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(messageMedia.document.thumbs, org.telegram.messenger.g0.L(46.0f), true, null, false), messageMedia.document);
                                        z13 = z20;
                                    } else {
                                        z13 = z16;
                                        fcVar = null;
                                    }
                                }
                                q9Var3.setVisibility(i7);
                                Integer num2 = num;
                                q9Var3.m(fcVar, "46_46", null, null, null, num2);
                                kbVar.e++;
                                i14++;
                                z16 = z13;
                                num = num2;
                            }
                            z11 = z16;
                            int i17 = 0;
                            while (i17 < kbVar.e) {
                                org.telegram.ui.Components.q9 q9Var4 = i17 == 0 ? q9Var2 : q9Var;
                                float f10 = i17;
                                q9Var4.setTranslationX(((f10 - (kbVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f)) + org.telegram.messenger.g0.L(2.0f));
                                q9Var4.setTranslationY((f10 - (kbVar.e / 2.0f)) * org.telegram.messenger.g0.L(4.33f));
                                i17++;
                            }
                        }
                    }
                    z11 = z16;
                } else {
                    z11 = z16;
                    if (starsTransaction.floodskip) {
                        textView3.setText(gd.N0(2131744718, null));
                        m80Var.setText(gd.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        q9Var2.setImageDrawable(kb.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(gd.N0(2131744705, null));
                            q9Var2.setImageDrawable(kb.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(gd.N0(2131744705, null));
                            q9Var2.setImageDrawable(kb.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(gd.N0(2131744861, null));
                                m80Var.setText(gd.N0(z11 ? 2131744687 : 2131744684, null));
                                m80Var.setVisibility(0);
                            } else {
                                textView3.setText(gd.N0((z15 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? 2131744680 : 2131744710, null));
                            }
                            q9Var2.setImageDrawable(kb.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(gd.N0(2131744720, null));
                            q9Var2.setImageDrawable(kb.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(gd.N0(2131744682, null));
                            q9Var2.setImageDrawable(kb.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(gd.N0(2131744721, null));
                            q9Var2.setImageDrawable(kb.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            q9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j3 = starsAmount.amount;
                if (j3 <= 0 || (j3 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.lk, null);
                    textView2.setText(TextUtils.concat("+", pb.L0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z14 = z10;
                } else {
                    if (j3 < 0 || (j3 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.nk, null);
                        textView2.setText(TextUtils.concat(pb.L0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z14 = z10;
                }
                kbVar.E = z14;
                kbVar.setWillNotDraw(!z14);
            }
            q9Var2.setImageDrawable(kb.a(44, "search"));
            textView3.setText(gd.N0(2131744695, null));
            m80Var.setVisibility(8);
        }
        z11 = z16;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j3 = starsAmount2.amount;
        if (j3 <= 0) {
        }
        textView2.setVisibility(0);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.lk, null);
        textView2.setText(TextUtils.concat("+", pb.L0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z14 = z10;
        kbVar.E = z14;
        kbVar.setWillNotDraw(!z14);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new kb(i7, context, h6Var);
    }
}
