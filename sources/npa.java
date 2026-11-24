// default package

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class npa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ npa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01cc, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b9, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ce, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r5;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        csa csaVar;
        String str;
        int i;
        boolean z;
        TLRPC.Document document2;
        boolean z2;
        yua C;
        TLRPC.Message message;
        long j;
        int i2;
        long j2;
        final long j3;
        long j4;
        String str2;
        boolean z3;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        int i3;
        usa usaVar;
        JSONObject u;
        TLRPC.Message message2;
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 1;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                ssa ssaVar = wsaVar.a2;
                b61 b61Var = wsaVar.f2;
                dsa dsaVar = wsaVar.K2.h;
                ImageReceiver imageReceiver = (dsaVar == null || (csaVar = dsaVar.c) == null) ? null : ((fsa) csaVar).d;
                bf0 bf0Var = ssaVar.d[0];
                if (imageReceiver != null && bf0Var != null && bf0Var.getImageReceiver() != null) {
                    p09 y = imageReceiver.y();
                    p09 y2 = bf0Var.getImageReceiver().y();
                    if (y2 != null) {
                        if (y != null) {
                            y2.O(false, y.o());
                        }
                    } else if (y != null) {
                        imageReceiver.f();
                        bf0Var.setImageDrawable(y);
                    }
                }
                ssaVar.b.setAlpha(1.0f);
                ssaVar.c.setAlpha(0.0f);
                if (!wsaVar.m2 || wsaVar.U1 == null || wsaVar.B2 == null || wsaVar.w1() < 0 || wsaVar.B2.b(wsaVar.w1()) < 0) {
                    b61Var.setFilled(true);
                    b61Var.i(jb6.M0(2131747564, null), true, true);
                    b61Var.g(null, true);
                    b61Var.setOnClickListener(new lpa(wsaVar, (byte) 11));
                    break;
                } else {
                    b61Var.setFilled(false);
                    int b4 = wsaVar.B2.b(wsaVar.w1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131749788, null));
                    Object obj = wsaVar.B2.get(b4);
                    if (!(obj instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift.getDocument()) == null) {
                        r5 = 1;
                    } else {
                        spannableStringBuilder.append((CharSequence) " e");
                        r5 = 1;
                        spannableStringBuilder.setSpan(new gn(document, b61Var.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    b61Var.i(spannableStringBuilder, r5, r5);
                    b61Var.g(null, r5);
                    b61Var.setOnClickListener(new mpa(wsaVar, b4, r5));
                    break;
                }
                break;
            case 1:
                if (wsaVar.r1() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wsaVar.r1().title);
                    sb.append(" #");
                    str = kt6.m(wsaVar.r1().num, ',', sb);
                } else {
                    str = "";
                }
                u31 I = wsaVar.j().I(R.raw.gift_upgrade, jb6.M0(2131749782, null), gm.S2(jb6.a0(null, null, 2131749783, str)));
                I.j = 5000;
                I.u = true;
                I.j();
                uj4 uj4Var = wsaVar.V1;
                if (uj4Var != null) {
                    uj4Var.c(true);
                    break;
                }
                break;
            case 2:
                wsaVar.n1.w0(((wsa) wsaVar.O2.d).N2.length - 1);
                break;
            case 3:
                new kj8((d) new qv0(wsaVar, (byte) 13), 12, false).show();
                break;
            case 4:
                wsaVar.dismiss();
                break;
            case 5:
                if (wsaVar.q3 != null) {
                    long j5 = 0;
                    for (int i4 = 0; i4 < wsaVar.q3.invoice.prices.size(); i4++) {
                        j5 += wsaVar.q3.invoice.prices.get(i4).amount;
                    }
                    Context context = wsaVar.getContext();
                    ArrayList arrayList = wsaVar.n3;
                    ylb ylbVar = wsaVar.J0;
                    usa usaVar2 = new usa(context, ylbVar);
                    usaVar2.V1 = arrayList;
                    float f = usaVar2.u0 / gm.p;
                    LimitPreviewView limitPreviewView = new LimitPreviewView(usaVar2.getContext(), R.drawable.star, 0, 0, ylbVar);
                    usaVar2.W1 = limitPreviewView;
                    limitPreviewView.setTranslationY(-gm.L(14.0f));
                    limitPreviewView.setIconScale(1.8f);
                    LinearLayout.LayoutParams s = qoe.s(-1, -2, 17, f, 20.0f, f, 10.0f);
                    LinearLayout linearLayout = usaVar2.S1;
                    linearLayout.addView(limitPreviewView, s);
                    usaVar2.Y0(j5);
                    int i5 = cmb.F6;
                    TextView b5 = jxe.b(context, 20.0f, i5, true, null);
                    hg9.p(b5, 17, null, 2131749801);
                    usaVar2.setTitle(jb6.M0(2131749801, null));
                    linearLayout.addView(b5, qoe.t(-1, -2, 17, 32, 0, 32, 0));
                    TextView b6 = jxe.b(context, 14.0f, i5, false, null);
                    hg9.p(b6, 17, null, 2131749802);
                    linearLayout.addView(b6, qoe.t(-1, -2, 17, 32, 10, 32, 10));
                    int currentTime = ConnectionsManager.getInstance(usaVar2.a).getCurrentTime();
                    mhb mhbVar = new mhb(context, ylbVar);
                    boolean z4 = false;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i6)).date || ((i = i6 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i)).date)) {
                            Date date = new Date(r9.date * 1000);
                            mhbVar.f(jb6.D0().o0().format(date) + ", " + jb6.D0().p0().format(date), nxa.b1(false, "⭐️ ".concat(jb6.E((int) r9.upgrade_stars, ',')), 0.8f, null), null, null);
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) obj2;
                            Date date2 = new Date(starGiftUpgradePrice2.date * 1000);
                            mhbVar.f(jb6.D0().o0().format(date2) + ", " + jb6.D0().p0().format(date2), nxa.b1(false, "⭐️ ".concat(jb6.E((int) starGiftUpgradePrice2.upgrade_stars, ',')), 0.8f, null), null, null);
                        }
                    }
                    float f2 = f + 14.0f;
                    linearLayout.addView(mhbVar, qoe.s(-1, -2, 7, f2, 16.0f, f2, 15.0f));
                    TextView b7 = jxe.b(context, 12.0f, cmb.x6, false, null);
                    hg9.p(b7, 17, null, 2131749804);
                    linearLayout.addView(b7, qoe.t(-1, -2, 17, 32, 0, 32, 15));
                    float f3 = usaVar2.u0 / gm.p;
                    FrameLayout frameLayout = new FrameLayout(usaVar2.getContext());
                    usaVar2.T1 = frameLayout;
                    anb.h(cmb.g5, usaVar2.J0, frameLayout);
                    View view = new View(usaVar2.getContext());
                    anb.h(cmb.c7, usaVar2.J0, view);
                    usaVar2.T1.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 55));
                    b61 b61Var2 = new b61(usaVar2.J0, usaVar2.getContext(), true);
                    usaVar2.U1 = b61Var2;
                    float f4 = f3 + 16.0f;
                    usaVar2.T1.addView(b61Var2, qoe.d(-1, 48.0f, nm7.D1, f4, 16.0f, f4, 16.0f));
                    usaVar2.b.addView(usaVar2.T1, qoe.e(-1, -2, 87));
                    r59 r59Var = usaVar2.n1;
                    r59Var.setPadding(r59Var.getPaddingLeft(), r59Var.getPaddingTop(), r59Var.getPaddingRight(), gm.L(80.0f) + r59Var.getPaddingBottom());
                    usaVar2.U1.i(wsa.k2(jb6.M0(2131743575, null)), false, true);
                    usaVar2.U1.setOnClickListener(new oha(usaVar2, (byte) 7));
                    wsaVar.l2 = usaVar2;
                    usaVar2.show();
                    break;
                }
                break;
            case 6:
                new ud5(wsaVar.getContext()).show();
                break;
            case 7:
                wsaVar.dismiss();
                break;
            case 8:
                wsa wsaVar2 = this.b;
                b61 b61Var3 = wsaVar2.f2;
                if (!b61Var3.R) {
                    TL_stars.InputSavedStarGift u1 = wsaVar2.u1();
                    k47 k47Var = wsaVar2.C2;
                    if (k47Var == null || (message = k47Var.k) == null) {
                        TL_stars.SavedStarGift savedStarGift = wsaVar2.A2;
                        if (savedStarGift != null) {
                            z = !savedStarGift.unsaved;
                            document2 = savedStarGift.gift.getDocument();
                        }
                    } else {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            z = tL_messageActionStarGift.saved;
                            document2 = tL_messageActionStarGift.gift.getDocument();
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            z = tL_messageActionStarGiftUnique.saved;
                            document2 = tL_messageActionStarGiftUnique.gift.getDocument();
                        }
                    }
                    boolean z5 = z;
                    TLRPC.Document document3 = document2;
                    b61Var3.setLoading(true);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.unsave = z5;
                    savestargift.stargift = u1;
                    if (wsaVar2.A2 == null || (C = jva.v(wsaVar2.a, false).C(wsaVar2.S1, false)) == null) {
                        z2 = false;
                    } else {
                        C.m(wsaVar2.A2, savestargift.unsave);
                        z2 = true;
                    }
                    ConnectionsManager.getInstance(wsaVar2.a).sendRequest(savestargift, new p07(wsaVar2, z2, document3, z5, savestargift));
                    break;
                }
                break;
            case 9:
                hs8 hs8Var = wsaVar.i3;
                if (hs8Var != null) {
                    hs8Var.run();
                }
                wsaVar.dismiss();
                break;
            case 10:
                final wsa wsaVar3 = this.b;
                final long e = z8c.h(wsaVar3.a).e();
                final TL_stars.InputSavedStarGift u12 = wsaVar3.u1();
                if (u12 != null) {
                    k47 k47Var2 = wsaVar3.C2;
                    if (k47Var2 != null) {
                        i2 = k47Var2.k.date;
                        boolean O3 = k47Var2.O3();
                        TLRPC.Message message3 = wsaVar3.C2.k;
                        if (message3 != null) {
                            TLRPC.MessageAction messageAction2 = message3.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                                long n = peer != null ? pg3.n(peer) : O3 ? k47.B0(message3) : e;
                                TLRPC.Peer peer2 = tL_messageActionStarGift2.from_id;
                                long n2 = peer2 != null ? pg3.n(peer2) : O3 ? e : k47.B0(wsaVar3.C2.k);
                                j = 2666000;
                                j2 = tL_messageActionStarGift2.convert_stars;
                                j4 = n2;
                                j3 = n;
                            }
                        }
                    } else {
                        j = 2666000;
                        TL_stars.SavedStarGift savedStarGift2 = wsaVar3.A2;
                        if (savedStarGift2 != null) {
                            i2 = savedStarGift2.date;
                            long n3 = ((savedStarGift2.flags & 2) == 0 || savedStarGift2.name_hidden) ? 2666000L : pg3.n(savedStarGift2.from_id);
                            j2 = wsaVar3.A2.convert_stars;
                            long j6 = n3;
                            j3 = wsaVar3.S1;
                            j4 = j6;
                        }
                    }
                    int max = Math.max(1, (((int) oc7.r1(wsaVar3.a).l4.v3.g(TimeUnit.SECONDS)) - (ConnectionsManager.getInstance(wsaVar3.a).getCurrentTime() - i2)) / 86400);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar3.J0, wsaVar3.getContext());
                    String M0 = jb6.M0(2131750159, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = gm.S2(jb6.G(max, "Gift2ConvertText2", (m9c.C(j4) || j4 == j) ? jb6.M0(2131744638, null) : pg3.s(j4), jb6.H(',', "Gift2ConvertStars", (int) j2)));
                    final long j7 = j2;
                    alertDialog$Builder.j(jb6.M0(2131750166, null), new ee() { // from class: wqa
                        @Override // ee
                        public final void r(he heVar2, int i8) {
                            wsa wsaVar4 = wsa.this;
                            TL_stars.InputSavedStarGift inputSavedStarGift = u12;
                            long j8 = j3;
                            long j9 = e;
                            long j10 = j7;
                            wsaVar4.getClass();
                            he heVar3 = new he(3, null, a.b);
                            heVar3.q(500L);
                            TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                            convertstargift.stargift = inputSavedStarGift;
                            ConnectionsManager.getInstance(wsaVar4.a).sendRequest(convertstargift, new zpa(wsaVar4, heVar3, j8, j9, j10));
                        }
                    });
                    wi8.y(null, 2131752542, alertDialog$Builder, null);
                    break;
                }
                break;
            case 11:
                hs8 hs8Var2 = wsaVar.i3;
                if (hs8Var2 != null) {
                    hs8Var2.run();
                }
                wsaVar.dismiss();
                break;
            case 12:
                Bundle bundle = new Bundle();
                long j8 = wsaVar.S1;
                if (j8 >= 0) {
                    bundle.putLong("user_id", j8);
                } else {
                    bundle.putLong("chat_id", -j8);
                }
                if (j8 == z8c.h(wsaVar.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
                bundle.putBoolean("open_gifts", true);
                bundle.putBoolean("open_gifts_upgradable", true);
                wsa.g2(new ProfileActivity(bundle, null));
                break;
            case 13:
                hs8 hs8Var3 = wsaVar.i3;
                if (hs8Var3 != null) {
                    hs8Var3.run();
                }
                wsaVar.dismiss();
                break;
            case 14:
                wsaVar.f2.setLoading(false);
                wsaVar.z2(0, true, null);
                break;
            case 15:
                new ud5(wsaVar.getContext()).show();
                break;
            case 16:
                pn2[] pn2VarArr = wsaVar.r3;
                b61 b61Var4 = wsaVar.f2;
                if (wsaVar.W2.b == 1 && !wsaVar.J) {
                    TL_stars.InputSavedStarGift u13 = wsaVar.u1();
                    k47 k47Var3 = wsaVar.C2;
                    if (k47Var3 != null) {
                        TLRPC.MessageAction messageAction3 = k47Var3.k.action;
                        if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction3;
                            long j9 = tL_messageActionStarGift3.upgrade_stars;
                            str2 = tL_messageActionStarGift3.prepaid_upgrade_hash;
                            if (j9 <= 0) {
                                break;
                            }
                            z3 = false;
                        }
                    } else {
                        TL_stars.SavedStarGift savedStarGift3 = wsaVar.A2;
                        if (savedStarGift3 != null) {
                            long j10 = savedStarGift3.upgrade_stars;
                            str2 = savedStarGift3.prepaid_upgrade_hash;
                            if (j10 <= 0) {
                                break;
                            }
                            z3 = false;
                        }
                    }
                    int currentTime2 = ConnectionsManager.getInstance(wsaVar.a).getCurrentTime();
                    long j11 = 0;
                    if (wsaVar.o3 != null) {
                        for (int i8 = 0; i8 < wsaVar.o3.size(); i8++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) wsaVar.o3.get(i8);
                            if (starGiftUpgradePrice.date >= currentTime2) {
                                i3 = i8;
                                if (wsaVar.q3 != null) {
                                    for (int i9 = 0; i9 < wsaVar.q3.invoice.prices.size(); i9++) {
                                        j11 += wsaVar.q3.invoice.prices.get(i9).amount;
                                    }
                                }
                                long j12 = j11;
                                if (i3 > 0 && !wsaVar.p3) {
                                    wsaVar.p3 = true;
                                    if (wsaVar.o3 != null) {
                                        for (int i10 = 0; i10 < i3; i10++) {
                                            wsaVar.o3.remove(0);
                                        }
                                    }
                                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                    if (TextUtils.isEmpty(str2)) {
                                        TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str2;
                                        tL_inputInvoiceStarGiftPrepaidUpgrade.peer = oc7.r1(wsaVar.a).i1(wsaVar.S1);
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                                    } else {
                                        TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                                        tL_inputInvoiceStarGiftUpgrade.keep_original_details = wsaVar.r2.a.q;
                                        tL_inputInvoiceStarGiftUpgrade.stargift = u13;
                                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                                    }
                                    u = wx0.u(wsaVar.J0, false);
                                    if (u != null) {
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                        tL_dataJSON.data = u.toString();
                                        tL_payments_getPaymentForm.flags |= 1;
                                    }
                                    ConnectionsManager.getInstance(wsaVar.a).sendRequest(tL_payments_getPaymentForm, new xqa(wsaVar, b3));
                                }
                                if (z3) {
                                    b61Var4.i(nxa.U0(jb6.a0(null, null, 2131749810, Long.valueOf(j12)), 1.13f, pn2VarArr), true, true);
                                } else {
                                    b61Var4.i(nxa.U0(jb6.a0(null, null, 2131750000, Long.valueOf(j12)), 1.13f, pn2VarArr), true, true);
                                }
                                usaVar = wsaVar.l2;
                                if (usaVar != null) {
                                    usaVar.Y0(j12);
                                }
                                if (starGiftUpgradePrice == null) {
                                    int i11 = starGiftUpgradePrice.date - currentTime2;
                                    String g0 = i11 < 86400 ? gm.g0(i11, false, true) : jb6.G(Math.round(i11 / 86400.0f), "Days", new Object[0]);
                                    ho hoVar = b61Var4.e;
                                    hoVar.E = false;
                                    hoVar.F = true;
                                    hoVar.G = true;
                                    hoVar.H = false;
                                    hoVar.I = false;
                                    b61Var4.g(jb6.a0(null, null, 2131749809, g0), true);
                                    gm.d3(wsaVar.s3, 1000L);
                                    break;
                                } else {
                                    b61Var4.g(null, true);
                                    break;
                                }
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    i3 = -1;
                    if (wsaVar.q3 != null) {
                    }
                    long j122 = j11;
                    if (i3 > 0) {
                        wsaVar.p3 = true;
                        if (wsaVar.o3 != null) {
                        }
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                        if (TextUtils.isEmpty(str2)) {
                        }
                        u = wx0.u(wsaVar.J0, false);
                        if (u != null) {
                        }
                        ConnectionsManager.getInstance(wsaVar.a).sendRequest(tL_payments_getPaymentForm2, new xqa(wsaVar, b3));
                    }
                    if (z3) {
                    }
                    usaVar = wsaVar.l2;
                    if (usaVar != null) {
                    }
                    if (starGiftUpgradePrice == null) {
                    }
                }
                break;
            case 17:
                wsaVar.onBackPressed();
                break;
            case 18:
                TL_stars.SavedStarGift savedStarGift4 = wsaVar.A2;
                if (savedStarGift4.unsaved) {
                    savedStarGift4.unsaved = false;
                    yua C2 = jva.v(wsaVar.a, false).C(wsaVar.S1, false);
                    if (C2 != null) {
                        TL_stars.SavedStarGift savedStarGift5 = wsaVar.A2;
                        C2.m(savedStarGift5, savedStarGift5.unsaved);
                    }
                    TL_stars.saveStarGift savestargift2 = new TL_stars.saveStarGift();
                    savestargift2.stargift = wsaVar.u1();
                    savestargift2.unsave = wsaVar.A2.unsaved;
                    ConnectionsManager.getInstance(wsaVar.a).sendRequest(savestargift2, null, 64);
                }
                TL_stars.SavedStarGift savedStarGift6 = wsaVar.A2;
                boolean z6 = savedStarGift6.pinned_to_top;
                if (((ava) wsaVar.B2).q(savedStarGift6, !z6, false)) {
                    new us8(wsaVar.getContext(), wsaVar.S1, wsaVar.A2, wsaVar.J0, new wg0(wsaVar, (byte) 6)).show();
                    break;
                } else if (z6) {
                    ts2.u(null, 2131749813, wsaVar.j(), R.raw.ic_unpin, 36);
                    break;
                } else {
                    wsaVar.j().I(R.raw.ic_pin, jb6.M0(2131750009, null), jb6.M0(2131750010, null)).j();
                    break;
                }
            case 19:
                wsaVar.f2();
                break;
            case 20:
                wsaVar.W1();
                break;
            case 21:
                wsaVar.V1();
                break;
            case 22:
                wsaVar.X1();
                break;
            case 23:
                long q1 = wsaVar.q1();
                if (q1 != 0) {
                    wsaVar.Y1(q1);
                    break;
                }
                break;
            case 24:
                wsa wsaVar4 = this.b;
                TL_stars.InputSavedStarGift u14 = wsaVar4.u1();
                if (u14 != null) {
                    long e2 = z8c.h(wsaVar4.a).e();
                    k47 k47Var4 = wsaVar4.C2;
                    if (k47Var4 != null && (message2 = k47Var4.k) != null) {
                        TLRPC.MessageAction messageAction4 = message2.action;
                        if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.Peer peer3 = ((TLRPC.TL_messageActionStarGift) messageAction4).peer;
                            if (peer3 != null) {
                                e2 = pg3.n(peer3);
                            }
                            long j13 = e2;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wsaVar4.J0, wsaVar4.getContext());
                            String M02 = jb6.M0(2131750151, null);
                            he heVar2 = alertDialog$Builder2.a;
                            heVar2.S = M02;
                            heVar2.U = jb6.M0(2131750150, null);
                            alertDialog$Builder2.j(jb6.M0(2131751535, null), new pt0((Object) wsaVar4, (Object) u14, j13, (byte) 8));
                            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder2.c(-1);
                            alertDialog$Builder2.o();
                            break;
                        }
                    }
                    if (wsaVar4.A2 != null) {
                        e2 = wsaVar4.S1;
                        long j132 = e2;
                        AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(0, wsaVar4.J0, wsaVar4.getContext());
                        String M022 = jb6.M0(2131750151, null);
                        he heVar22 = alertDialog$Builder22.a;
                        heVar22.S = M022;
                        heVar22.U = jb6.M0(2131750150, null);
                        alertDialog$Builder22.j(jb6.M0(2131751535, null), new pt0((Object) wsaVar4, (Object) u14, j132, (byte) 8));
                        alertDialog$Builder22.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder22.c(-1);
                        alertDialog$Builder22.o();
                    }
                }
                break;
            case 25:
                wsaVar.T1(true);
                break;
            case 26:
                wsaVar.Q1();
                break;
            case 27:
                wsaVar.N1();
                break;
            case 28:
                TL_stars.TL_starGiftUnique A1 = wsaVar.A1();
                new ls7(wsaVar.a, pg3.n(A1.owner_id), new npa(wsaVar, (byte) 4), wsaVar.J0, wsaVar.getContext(), A1).show();
                break;
            default:
                TL_stars.TL_starGiftUnique A12 = wsaVar.A1();
                new mw4(wsaVar.a, pg3.n(A12.owner_id), new npa(wsaVar, b2), wsaVar.J0, wsaVar.getContext(), A12).show();
                break;
        }
    }
}
